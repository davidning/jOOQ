/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sybase.generatedclasses.Dba;
import org.jooq.test.sybase.generatedclasses.Keys;
import org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_85Record;
import org.jooq.util.sybase.SybaseDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_85 extends UpdatableTableImpl<XTestCase_85Record> {

	private static final long serialVersionUID = 419219409;

	/**
	 * The singleton instance of x_test_case_85
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = new XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_85Record> __RECORD_TYPE = XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_85Record, Integer> ID = new TableFieldImpl<XTestCase_85Record, Integer>(SQLDialect.SYBASE, "id", SybaseDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_85.x_unused_id, dba.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_85Record, Integer> X_UNUSED_ID = new TableFieldImpl<XTestCase_85Record, Integer>(SQLDialect.SYBASE, "x_unused_id", SybaseDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_test_case_85.x_unused_id, dba.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_85Record, String> X_UNUSED_NAME = new TableFieldImpl<XTestCase_85Record, String>(SQLDialect.SYBASE, "x_unused_name", SybaseDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super(SQLDialect.SYBASE, "x_test_case_85", Dba.DBA);
	}

	@Override
	public UniqueKey<XTestCase_85Record> getMainKey() {
		return Keys.x_test_case_85_pk_x_test_case_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<XTestCase_85Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_85Record>>asList(Keys.x_test_case_85_pk_x_test_case_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<XTestCase_85Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_85Record, ?>>asList(Keys.x_test_case_85_fk_x_test_case_85);
	}
}
