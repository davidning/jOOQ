/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = -653408460;

	/**
	 * The singleton instance of <code>PUBLIC.X_TEST_CASE_71</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record.class;
	}

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record, java.lang.Short> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * Create a <code>PUBLIC.X_TEST_CASE_71</code> table reference
	 */
	public XTestCase_71() {
		super("X_TEST_CASE_71", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.X_TEST_CASE_71</code> table reference
	 */
	public XTestCase_71(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record> getMainKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_X_TEST_CASE_71;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71 as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71(alias);
	}
}
