/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -517087480;

	/**
	 * The singleton instance of <code>LUKAS.X_TEST_CASE_64_69</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.db2.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>LUKAS.X_TEST_CASE_64_69.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * The column <code>LUKAS.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super("X_TEST_CASE_64_69", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.db2.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.db2.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A);
	}
}
