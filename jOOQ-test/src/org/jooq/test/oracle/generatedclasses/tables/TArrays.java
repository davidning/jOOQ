/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.oracle.generatedclasses.Keys;
import org.jooq.test.oracle.generatedclasses.Test;
import org.jooq.test.oracle.generatedclasses.tables.records.TArraysRecord;
import org.jooq.test.oracle.generatedclasses.udt.records.UDateArrayRecord;
import org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord;
import org.jooq.test.oracle.generatedclasses.udt.records.UNumberLongArrayRecord;
import org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord;
import org.jooq.util.oracle.OracleDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TArrays extends UpdatableTableImpl<TArraysRecord> {

	private static final long serialVersionUID = -1908504254;

	/**
	 * The singleton instance of T_ARRAYS
	 */
	public static final TArrays T_ARRAYS = new TArrays();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TArraysRecord> __RECORD_TYPE = TArraysRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TArraysRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TArraysRecord, Integer> ID = new TableFieldImpl<TArraysRecord, Integer>(SQLDialect.ORACLE, "ID", OracleDataType.NUMBER.asNumberDataType(Integer.class), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TArraysRecord, UStringArrayRecord> STRING_ARRAY = new TableFieldImpl<TArraysRecord, UStringArrayRecord>(SQLDialect.ORACLE, "STRING_ARRAY", OracleDataType.VARCHAR2.asArrayDataType(UStringArrayRecord.class), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TArraysRecord, UNumberArrayRecord> NUMBER_ARRAY = new TableFieldImpl<TArraysRecord, UNumberArrayRecord>(SQLDialect.ORACLE, "NUMBER_ARRAY", OracleDataType.NUMBER.asNumberDataType(Integer.class).asArrayDataType(UNumberArrayRecord.class), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TArraysRecord, UNumberLongArrayRecord> NUMBER_LONG_ARRAY = new TableFieldImpl<TArraysRecord, UNumberLongArrayRecord>(SQLDialect.ORACLE, "NUMBER_LONG_ARRAY", OracleDataType.NUMBER.asNumberDataType(Long.class).asArrayDataType(UNumberLongArrayRecord.class), T_ARRAYS);

	/**
	 * An uncommented item
	 */
	public static final TableField<TArraysRecord, UDateArrayRecord> DATE_ARRAY = new TableFieldImpl<TArraysRecord, UDateArrayRecord>(SQLDialect.ORACLE, "DATE_ARRAY", OracleDataType.DATE.asArrayDataType(UDateArrayRecord.class), T_ARRAYS);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super(SQLDialect.ORACLE, "T_ARRAYS", Test.TEST);
	}

	@Override
	public UniqueKey<TArraysRecord> getMainKey() {
		return Keys.PK_T_ARRAYS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TArraysRecord>> getKeys() {
		return Arrays.<UniqueKey<TArraysRecord>>asList(Keys.PK_T_ARRAYS);
	}
}
