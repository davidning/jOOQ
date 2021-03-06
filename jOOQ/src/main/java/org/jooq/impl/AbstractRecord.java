/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import static java.util.Arrays.asList;
import static org.jooq.impl.Utils.getAnnotatedGetter;
import static org.jooq.impl.Utils.getAnnotatedMembers;
import static org.jooq.impl.Utils.getAnnotatedSetters;
import static org.jooq.impl.Utils.getMatchingGetter;
import static org.jooq.impl.Utils.getMatchingMembers;
import static org.jooq.impl.Utils.getMatchingSetters;
import static org.jooq.impl.Utils.getPropertyName;
import static org.jooq.impl.Utils.hasColumnAnnotations;
import static org.jooq.tools.reflect.Reflect.accessible;

import java.beans.ConstructorProperties;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Attachable;
import org.jooq.Converter;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.UniqueKey;
import org.jooq.exception.InvalidResultException;
import org.jooq.exception.MappingException;
import org.jooq.tools.Convert;
import org.jooq.tools.reflect.Reflect;

/**
 * A general base class for all {@link Record} types
 *
 * @author Lukas Eder
 */
abstract class AbstractRecord extends AbstractStore implements Record {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6052512608911220404L;

    final Field<?>[]          fields;
    Value<?>[]                values;

    AbstractRecord(Collection<? extends Field<?>> fields) {
        this.fields = fields.toArray(new Field[fields.size()]);
    }

    AbstractRecord(Field<?>... fields) {
        this.fields = fields;
    }

    // ------------------------------------------------------------------------
    // XXX: Attachable API
    // ------------------------------------------------------------------------

    @Override
    final List<Attachable> getAttachables() {
        List<Attachable> result = new ArrayList<Attachable>();

        int size = size();
        for (int i = 0; i < size; i++) {
            Object value = getValue0(i).getValue();

            if (value instanceof Attachable) {
                result.add((Attachable) value);
            }
        }

        return result;
    }

    // ------------------------------------------------------------------------
    // XXX: FieldProvider API
    // ------------------------------------------------------------------------

    @Override
    public final <T> Field<T> field(Field<T> field) {
        return fieldsRow().field(field);
    }

    @Override
    public final Field<?> field(String name) {
        return fieldsRow().field(name);
    }

    @Override
    public final Field<?> field(int index) {
        return index >= 0 && index < fields.length ? fields[index] : null;
    }

    @Override
    public final Field<?>[] fields() {
        return fields.clone();
    }

    // ------------------------------------------------------------------------
    // XXX: Record API
    // ------------------------------------------------------------------------

    @Override
    public final int size() {
        return fields.length;
    }

    @Override
    public final <T> T getValue(Field<T> field) {
        return getValue0(field).getValue();
    }

    @Override
    public final <T> T getValue(Field<T> field, T defaultValue) {
        return getValue0(field).getValue(defaultValue);
    }

    @Override
    public final <T> T getValue(Field<?> field, Class<? extends T> type) {
        return Convert.convert(getValue(field), type);
    }

    @Override
    public final <T> T getValue(Field<?> field, Class<? extends T> type, T defaultValue) {
        final T result = getValue(field, type);
        return result == null ? defaultValue : result;
    }

    @Override
    public final <T, U> U getValue(Field<T> field, Converter<? super T, U> converter) {
        return converter.from(getValue(field));
    }

    @Override
    public final <T, U> U getValue(Field<T> field, Converter<? super T, U> converter, U defaultValue) {
        final U result = getValue(field, converter);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Object getValue(int index) {
        return getValue0(index).getValue();
    }

    @Override
    public final Object getValue(int index, Object defaultValue) {
        final Object result = getValue(index);
        return result == null ? defaultValue : result;
    }

    @Override
    public final <T> T getValue(int index, Class<? extends T> type) {
        return Convert.convert(getValue(index), type);
    }

    @Override
    public final <T> T getValue(int index, Class<? extends T> type, T defaultValue) {
        final T result = getValue(index, type);
        return result == null ? defaultValue : result;
    }

    @Override
    public final <U> U getValue(int index, Converter<?, U> converter) {
        return Convert.convert(getValue(index), converter);
    }

    @Override
    public final <U> U getValue(int index, Converter<?, U> converter, U defaultValue) {
        final U result = getValue(index, converter);
        return result == null ? defaultValue : result;
    }

    @Override
    public final Object getValue(String fieldName) {
        return getValue(field(fieldName));
    }

    @SuppressWarnings("unchecked")
    @Override
    public final Object getValue(String fieldName, Object defaultValue) {
        return getValue((Field<Object>) field(fieldName), defaultValue);
    }

    @Override
    public final <T> T getValue(String fieldName, Class<? extends T> type) {
        return Convert.convert(getValue(fieldName), type);
    }

    @Override
    public final <T> T getValue(String fieldName, Class<? extends T> type, T defaultValue) {
        final T result = getValue(fieldName, type);
        return result == null ? defaultValue : result;
    }

    @Override
    public final <U> U getValue(String fieldName, Converter<?, U> converter) {
        return Convert.convert(getValue(fieldName), converter);
    }

    @Override
    public final <U> U getValue(String fieldName, Converter<?, U> converter, U defaultValue) {
        final U result = getValue(fieldName, converter);
        return result == null ? defaultValue : result;
    }

    @SuppressWarnings("unchecked")
    final <T> Value<T> getValue0(int index) {
        Value<?>[] v = getValues();

        if (index >= v.length) {
            throw new IllegalArgumentException("Field " + index + " is not contained in list");
        }

        return (Value<T>) v[index];
    }

    @SuppressWarnings("unchecked")
    final <T> Value<T> getValue0(Field<T> field) {
        return (Value<T>) getValues()[fieldsRow().indexOf(field)];
    }

    final Value<?>[] getValues() {
        if (values == null) {
            values = new Value<?>[fields.length];

            for (int i = 0; i < values.length; i++) {
                values[i] = new Value<Object>(null);
            }
        }

        return values;
    }

    @Override
    public final <T> void setValue(Field<T> field, T value) {
        UniqueKey<?> mainKey = getMainKey();
        Value<T> val = getValue0(field);

        // Normal fields' changed flag is always set to true
        if (mainKey == null || !mainKey.getFields().contains(field)) {
            val.setValue(value);
        }

        // The main key's changed flag might've been set previously
        else if (val.isChanged()) {
            val.setValue(value);
        }

        // [#979] If the main key is being changed, all other fields' flags need
        // to be set to true for in case this record is stored again, an INSERT
        // statement will thus be issued
        else {
            val.setValue(value, true);

            if (val.isChanged()) {
                setAllChanged(true);
            }
        }
    }

    @Override
    public final <T, U> void setValue(Field<T> field, U value, Converter<T, ? super U> converter) {
        setValue(field, converter.to(value));
    }

    final void setValue(Field<?> field, Value<?> value) {
        setValue(fieldsRow().indexOf(field), value);
    }

    final void setValue(int index, Value<?> value) {
        getValues()[index] = value;
    }

    /**
     * Subclasses may override this
     */
    UniqueKey<?> getMainKey() {
        return null;
    }

    /**
     * Reset all value flags' changed status
     */
    final void setAllChanged(boolean changed) {
        for (Value<?> value : getValues()) {
            value.setChanged(changed);
        }
    }

    /*
     * This method is overridden covariantly by TableRecordImpl
     */
    @Override
    public Record original() {
        AbstractRecord result = Utils.newRecord(getClass(), fields, getConfiguration());
        Value<?>[] v = getValues();

        for (int i = 0; i < v.length; i++) {
            result.setValue(i, new Value<Object>(v[i].getOriginal()));
        }

        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <T> T original(Field<T> field) {
        return (T) original(fieldsRow().indexOf(field));
    }

    @Override
    public final Object original(int fieldIndex) {
        return getValues()[fieldIndex].getOriginal();
    }

    @Override
    public final Object original(String fieldName) {
        return original(fieldsRow().indexOf(fieldName));
    }

    @Override
    public final boolean changed() {
        for (Value<?> value : getValues()) {
            if (value.isChanged()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public final boolean changed(Field<?> field) {
        return changed(fieldsRow().indexOf(field));
    }

    @Override
    public final boolean changed(int fieldIndex) {
        return getValue0(fieldIndex).isChanged();
    }

    @Override
    public final boolean changed(String fieldName) {
        return changed(fieldsRow().indexOf(fieldName));
    }

    @Override
    public final void changed(boolean changed) {
        for (Value<?> value : getValues()) {
            value.setChanged(changed);
        }
    }

    @Override
    public final void changed(boolean changed, Field<?> field) {
        changed(changed, fieldsRow().indexOf(field));
    }

    @Override
    public final void changed(boolean changed, int fieldIndex) {
        getValue0(fieldIndex).setChanged(changed);
    }

    @Override
    public final void changed(boolean changed, String fieldName) {
        changed(changed, fieldsRow().indexOf(fieldName));
    }

    @Override
    public final void reset() {
        for (Value<?> value : getValues()) {
            value.reset();
        }
    }

    @Override
    public final void reset(Field<?> field) {
        reset(fieldsRow().indexOf(field));
    }

    @Override
    public final void reset(int fieldIndex) {
        getValue0(fieldIndex).reset();
    }

    @Override
    public final void reset(String fieldName) {
        reset(fieldsRow().indexOf(fieldName));
    }

    @Override
    public final Object[] intoArray() {
        return into(Object[].class);
    }

    @Override
    public final Map<String, Object> intoMap() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();

        for (int i = 0; i < fields.length; i++) {
            Field<?> field = fields[i];

            if (map.put(field.getName(), getValue(i)) != null) {
                throw new InvalidResultException("Field " + field.getName() + " is not unique in Record : " + this);
            }
        }

        return map;
    }

    @Override
    public final <E> E into(Class<? extends E> type) {
        try {
            if (type.isArray()) {
                return intoArray(type);
            }
            else {
                return intoPOJO(type);
            }
        }

        // Pass MappingExceptions on to client code
        catch (MappingException e) {
            throw e;
        }

        // All other reflection exceptions are intercepted
        catch (Exception e) {
            throw new MappingException("An error ocurred when mapping record to " + type, e);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public final <E> E into(E object) {
        if (object == null) {
            throw new NullPointerException("Cannot copy Record into null");
        }

        Class<E> type = (Class<E>) object.getClass();

        try {
            if (type.isArray()) {
                return (E) intoArray((Object[]) object, type.getComponentType());
            }
            else {
                return intoMutablePOJO(type, object);
            }
        }

        // Pass MappingExceptions on to client code
        catch (MappingException e) {
            throw e;
        }

        // All other reflection exceptions are intercepted
        catch (Exception e) {
            throw new MappingException("An error ocurred when mapping record to " + type, e);
        }
    }

    /**
     * Convert this record into an array of a given type.
     * <p>
     * The supplied type is usually <code>Object[]</code>, but in some cases, it
     * may make sense to supply <code>String[]</code>, <code>Integer[]</code>
     * etc.
     */
    @SuppressWarnings("unchecked")
    private final <E> E intoArray(Class<? extends E> type) {
        int size = size();
        Class<?> componentType = type.getComponentType();
        Object[] result = (Object[]) Array.newInstance(componentType, size);

        return (E) intoArray(result, componentType);
    }

    /**
     * Convert this record into an array of a given component type.
     */
    private final Object[] intoArray(Object[] result, Class<?> componentType) {
        int size = size();

        // Just as in Collection.toArray(Object[]), return a new array in case
        // sizes don't match
        if (size > result.length) {
            result = (Object[]) Array.newInstance(componentType, size);
        }

        for (int i = 0; i < size; i++) {
            result[i] = Convert.convert(getValue(i), componentType);
        }

        return result;
    }

    /**
     * Convert this record into a POJO
     */
    private final <E> E intoPOJO(Class<? extends E> type) throws Exception {

        // If a default, no argument constructor is present, use that one.
        try {
            E result;

            // [#1470] Return a proxy if the supplied type is an interface
            if (Modifier.isAbstract(type.getModifiers())) {
                result = Reflect.on(HashMap.class).create().as(type);
            }

            // [#1340] Allow for using non-public default constructors
            else {
                result = accessible(type.getDeclaredConstructor()).newInstance();
            }

            return intoMutablePOJO(type, result);
        }

        // [#1336] If no default constructor is present, check if there is a
        // "matching" constructor with the same number of fields as this record
        catch (NoSuchMethodException e) {
            return intoImmutablePOJO(type);
        }
    }

    /**
     * Convert this record into an "immutable" POJO (final fields, "matching"
     * constructor).
     */
    @SuppressWarnings("unchecked")
    private final <E> E intoImmutablePOJO(Class<? extends E> type) throws Exception {
        Constructor<E>[] constructors = (Constructor<E>[]) type.getDeclaredConstructors();

        // [#1837] If any java.beans.ConstructorProperties annotations are
        // present use those rather than matching constructors by the number of
        // arguments
        for (Constructor<E> constructor : constructors) {
            ConstructorProperties properties = constructor.getAnnotation(ConstructorProperties.class);

            if (properties != null) {
                return intoImmutablePOJO(type, constructor, properties);
            }
        }

        // Without ConstructorProperties, match constructors by matching
        // argument length
        for (Constructor<E> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            // Match the first constructor by parameter length
            if (parameterTypes.length == size()) {
                Object[] converted = Convert.convert(intoArray(), parameterTypes);
                return accessible(constructor).newInstance(converted);
            }
        }

        throw new MappingException("No matching constructor found on type " + type + " for record " + this);
    }

    /**
     * Create an immutable POJO given a constructor and its associated JavaBeans
     * {@link ConstructorProperties}
     */
    private final <E> E intoImmutablePOJO(Class<? extends E> type, Constructor<E> constructor, ConstructorProperties properties) throws Exception {
        boolean useAnnotations = hasColumnAnnotations(type);
        List<String> propertyNames = Arrays.asList(properties.value());

        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] parameterValues = new Object[parameterTypes.length];

        for (Field<?> field : fields) {
            List<java.lang.reflect.Field> members;
            Method method;

            // Annotations are available and present
            if (useAnnotations) {
                members = getAnnotatedMembers(type, field.getName());
                method = getAnnotatedGetter(type, field.getName());
            }

            // No annotations are present
            else {
                members = getMatchingMembers(type, field.getName());
                method = getMatchingGetter(type, field.getName());
            }

            for (java.lang.reflect.Field member : members) {
                int index = propertyNames.indexOf(member.getName());

                if (index >= 0) {
                    parameterValues[index] = getValue(field);
                }
            }

            if (method != null) {
                String name = getPropertyName(method.getName());
                int index = propertyNames.indexOf(name);

                if (index >= 0) {
                    parameterValues[index] = getValue(field);
                }
            }
        }

        Object[] converted = Convert.convert(parameterValues, parameterTypes);
        return accessible(constructor).newInstance(converted);
    }

    /**
     * Convert this record into a "mutable" POJO (non-final fields or setters
     * available)
     */
    private final <E> E intoMutablePOJO(Class<? extends E> type, E result) throws Exception {
        boolean useAnnotations = hasColumnAnnotations(type);

        for (Field<?> field : fields) {
            List<java.lang.reflect.Field> members;
            List<java.lang.reflect.Method> methods;

            // Annotations are available and present
            if (useAnnotations) {
                members = getAnnotatedMembers(type, field.getName());
                methods = getAnnotatedSetters(type, field.getName());
            }

            // No annotations are present
            else {
                members = getMatchingMembers(type, field.getName());
                methods = getMatchingSetters(type, field.getName());
            }

            for (java.lang.reflect.Field member : members) {

                // [#935] Avoid setting final fields
                if ((member.getModifiers() & Modifier.FINAL) == 0) {
                    into(result, member, field);
                }
            }

            for (java.lang.reflect.Method method : methods) {
                method.invoke(result, getValue(field, method.getParameterTypes()[0]));
            }
        }

        return result;
    }

    @Override
    public final <R extends Record> R into(Table<R> table) {
        try {
            R result = Utils.newRecord(table, getConfiguration());

            for (Field<?> targetField : table.fields()) {
                Field<?> sourceField = field(targetField);

                if (sourceField != null) {
                    Utils.setValue(result, targetField, this, sourceField);
                }
            }

            // [#1522] If the primary key has been fully fetched, then changed
            // flags should all be reset in order for the returned record to be
            // updatable using store()
            if (result instanceof AbstractRecord) {
                UniqueKey<?> key = ((AbstractRecord) result).getMainKey();

                if (key != null) {
                    boolean isKeySet = true;

                    for (Field<?> field : key.getFields()) {
                        isKeySet &= (field(field) != null);
                    }

                    if (isKeySet) {
                        ((AbstractRecord) result).setAllChanged(false);
                    }
                }
            }

            return result;
        }

        // All reflection exceptions are intercepted
        catch (Exception e) {
            throw new MappingException("An error ocurred when mapping record to " + table, e);
        }
    }

    @Override
    public final ResultSet intoResultSet() {
        ResultImpl<Record> result = new ResultImpl<Record>(getConfiguration(), fields);
        result.add(this);
        return result.intoResultSet();
    }

    @Override
    public final <E> E map(RecordMapper<Record, E> mapper) {
        return mapper.map(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final void from(Object source) {
        if (source == null) return;

        // [#1987] Distinguish between various types to load data from
        // Maps are loaded using a {field-name -> value} convention
        if (source instanceof Map) {
            fromMap((Map<String, ?>) source);
        }

        // Arrays are loaded through index mapping
        else if (source instanceof Object[]) {
            fromArray((Object[]) source);
        }

        // All other types are expected to be POJOs
        else {
            Class<?> type = source.getClass();

            try {
                boolean useAnnotations = hasColumnAnnotations(type);

                for (Field<?> field : fields) {
                    List<java.lang.reflect.Field> members;
                    Method method;

                    // Annotations are available and present
                    if (useAnnotations) {
                        members = getAnnotatedMembers(type, field.getName());
                        method = getAnnotatedGetter(type, field.getName());
                    }

                    // No annotations are present
                    else {
                        members = getMatchingMembers(type, field.getName());
                        method = getMatchingGetter(type, field.getName());
                    }

                    // Use only the first applicable method or member
                    if (method != null) {
                        Utils.setValue(this, field, method.invoke(source));
                    }
                    else if (members.size() > 0) {
                        from(source, members.get(0), field);
                    }
                }
            }

            // All reflection exceptions are intercepted
            catch (Exception e) {
                throw new MappingException("An error ocurred when mapping record from " + type, e);
            }
        }
    }

    @Override
    public final void fromMap(Map<String, ?> map) {
        for (int i = 0; i < fields.length; i++) {
            Field<?> field = fields[i];
            String name = field.getName();

            // Set only those values contained in the map
            if (map.containsKey(name)) {
                Utils.setValue(this, field, map.get(name));
            }
        }
    }

    @Override
    public final void fromArray(Object... array) {
        for (int i = 0; i < fields.length && i < array.length; i++) {
            Utils.setValue(this, fields[i], array[i]);
        }
    }

    /**
     * This method was implemented with [#799]. It may be useful to make it
     * public for broader use...?
     */
    protected final void from(Record source) {
        for (Field<?> field : fields) {
            Field<?> sourceField = source.field(field);

            if (sourceField != null) {
                Utils.setValue(this, field, source, sourceField);
            }
        }
    }

    private final void into(Object result, java.lang.reflect.Field member, Field<?> field) throws IllegalAccessException {
        Class<?> mType = member.getType();

        if (mType.isPrimitive()) {
            if (mType == byte.class) {
                member.setByte(result, getValue(field, byte.class));
            }
            else if (mType == short.class) {
                member.setShort(result, getValue(field, short.class));
            }
            else if (mType == int.class) {
                member.setInt(result, getValue(field, int.class));
            }
            else if (mType == long.class) {
                member.setLong(result, getValue(field, long.class));
            }
            else if (mType == float.class) {
                member.setFloat(result, getValue(field, float.class));
            }
            else if (mType == double.class) {
                member.setDouble(result, getValue(field, double.class));
            }
            else if (mType == boolean.class) {
                member.setBoolean(result, getValue(field, boolean.class));
            }
            else if (mType == char.class) {
                member.setChar(result, getValue(field, char.class));
            }
        }
        else {
            member.set(result, getValue(field, mType));
        }
    }

    private final void from(Object source, java.lang.reflect.Field member, Field<?> field)
        throws IllegalAccessException {

        Class<?> mType = member.getType();

        if (mType.isPrimitive()) {
            if (mType == byte.class) {
                Utils.setValue(this, field, member.getByte(source));
            }
            else if (mType == short.class) {
                Utils.setValue(this, field, member.getShort(source));
            }
            else if (mType == int.class) {
                Utils.setValue(this, field, member.getInt(source));
            }
            else if (mType == long.class) {
                Utils.setValue(this, field, member.getLong(source));
            }
            else if (mType == float.class) {
                Utils.setValue(this, field, member.getFloat(source));
            }
            else if (mType == double.class) {
                Utils.setValue(this, field, member.getDouble(source));
            }
            else if (mType == boolean.class) {
                Utils.setValue(this, field, member.getBoolean(source));
            }
            else if (mType == char.class) {
                Utils.setValue(this, field, member.getChar(source));
            }
        }
        else {
            Utils.setValue(this, field, member.get(source));
        }
    }

    // ------------------------------------------------------------------------
    // XXX: Object and Comparable API
    // ------------------------------------------------------------------------

    @Override
    public String toString() {
        Result<AbstractRecord> result = new ResultImpl<AbstractRecord>(getConfiguration(), fields);
        result.add(this);
        return result.toString();
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public int compareTo(Record that) {
        // Note: keep this implementation in-sync with AbstractStore.equals()!

        if (that == null) {
            throw new NullPointerException();
        }
        if (size() != that.size()) {
            throw new ClassCastException(String.format("Trying to compare incomparable records (wrong degree):\n%s\n%s", this, that));
        }

        Class<?>[] thisTypes = this.fieldsRow().types();
        Class<?>[] thatTypes = that.fieldsRow().types();

        if (!asList(thisTypes).equals(asList(thatTypes))) {
            throw new ClassCastException(String.format("Trying to compare incomparable records (type mismatch):\n%s\n%s", this, that));
        }

        for (int i = 0; i < size(); i++) {
            final Object thisValue = getValue(i);
            final Object thatValue = that.getValue(i);

            // [#1850] Only return -1/+1 early. In all other cases,
            // continue checking the remaining fields
            if (thisValue == null && thatValue == null) {
                continue;
            }

            // Order column values in a SQL NULLS LAST manner
            else if (thisValue == null) {
                return 1;
            }

            else if (thatValue == null) {
                return -1;
            }

            // [#985] Compare arrays too.
            else if (thisValue.getClass().isArray() && thatValue.getClass().isArray()) {

                // Might be byte[]
                if (thisValue.getClass() == byte[].class) {
                    int compare = compare((byte[]) thisValue, (byte[]) thatValue);

                    if (compare != 0) {
                        return compare;
                    }
                }

                // Other primitive types are not expected
                else if (!thisValue.getClass().getComponentType().isPrimitive()) {
                    int compare = compare((Object[]) thisValue, (Object[]) thatValue);

                    if (compare != 0) {
                        return compare;
                    }
                }

                else {
                    throw new ClassCastException(String.format("Unsupported data type in natural ordering: %s", thisValue.getClass()));
                }
            }
            else {
                int compare = ((Comparable) thisValue).compareTo(thatValue);

                if (compare != 0) {
                    return compare;
                }
            }
        }

        // If we got through the above loop, the two records are equal
        return 0;
    }

    /**
     * Compare two byte arrays
     */
    final int compare(byte[] array1, byte[] array2) {
        int length = Math.min(array1.length, array2.length);

        for (int i = 0; i < length; i++) {
            int v1 = (array1[i] & 0xff);
            int v2 = (array2[i] & 0xff);

            if (v1 != v2) {
                return v1 < v2 ? -1 : 1;
            }
        }

        return array1.length - array2.length;
    }

    /**
     * Compare two arrays
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    final int compare(Object[] array1, Object[] array2) {
        int length = Math.min(array1.length, array2.length);

        for (int i = 0; i < length; i++) {
            int compare = ((Comparable) array1[i]).compareTo(array2[i]);

            if (compare != 0) {
                return compare;
            }
        }

        return array1.length - array2.length;
    }
}
