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
package org.jooq;

import java.util.Collection;

import org.jooq.exception.DataAccessException;
import org.jooq.impl.Factory;

/**
 * An intermediate type for the construction of a <code>JOIN</code> clause,
 * where there must be a join criteria added using an <code>ON</code> clause
 * (with a {@link Condition}), or using a <code>USING</code> clause (with a list
 * of {@link Field})
 *
 * @author Lukas Eder
 */
public interface TableOnStep {

    /**
     * Add an <code>ON</code> clause to the <code>JOIN</code>
     */
    @Support
    TableOnConditionStep on(Condition... conditions);

    /**
     * Add an <code>ON</code> clause to the <code>JOIN</code>
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String)
     */
    @Support
    TableOnConditionStep on(String sql);

    /**
     * Add an <code>ON</code> clause to the <code>JOIN</code>
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, Object...)
     */
    @Support
    TableOnConditionStep on(String sql, Object... bindings);

    /**
     * Add an <code>ON</code> clause to the <code>JOIN</code>
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see Factory#condition(String, QueryPart...)
     */
    @Support
    TableOnConditionStep on(String sql, QueryPart... parts);

    /**
     * Join the table with the <code>USING(column [, column...])</code> syntax
     * <p>
     * If this is not supported by your RDBMS, then jOOQ will try to simulate
     * this behaviour using the information provided in this query.
     */
    @Support
    Table<Record> using(Field<?>... fields);

    /**
     * Join the table with the <code>USING(column [, column...])</code> syntax
     * <p>
     * If this is not supported by your RDBMS, then jOOQ will try to simulate
     * this behaviour using the information provided in this query.
     */
    @Support
    Table<Record> using(Collection<? extends Field<?>> fields);

    /**
     * Join the table on a non-ambiguous foreign key relationship between the
     * two joined tables.
     * <p>
     * See {@link #onKey(ForeignKey)} for examples.
     *
     * @see #onKey(ForeignKey)
     * @throws DataAccessException If there is no non-ambiguous key definition
     *             known to jOOQ
     */
    @Support
    TableOnConditionStep onKey() throws DataAccessException;

    /**
     * Join the table on a non-ambiguous foreign key relationship between the
     * two joined tables.
     * <p>
     * See {@link #onKey(ForeignKey)} for examples.
     *
     * @see #onKey(ForeignKey)
     * @throws DataAccessException If there is no non-ambiguous key definition
     *             known to jOOQ
     */
    @Support
    TableOnConditionStep onKey(TableField<?, ?>... keyFields) throws DataAccessException;

    /**
     * Join the table on a non-ambiguous foreign key relationship between the
     * two joined tables.
     * <p>
     * An example: <code><pre>
     * // There is a single foreign key relationship between A and B and it can
     * // be obtained by A.getReferencesTo(B) or vice versa. The order of A and
     * // B is not important
     * A.join(B).onKey();
     *
     * // There are several foreign key relationships between A and B. In order
     * // to disambiguate, you can provide a formal org.jooq.Key reference from
     * // the generated Keys class
     * A.join(B).onKey(key);
     *
     * // There are several foreign key relationships between A and B. In order
     * // to disambiguate, you can provide any non-ambiguous foreign key column
     * A.join(B).onKey(B.A_ID);
     * </pre></code>
     */
    @Support
    TableOnConditionStep onKey(ForeignKey<?, ?> key);
}
