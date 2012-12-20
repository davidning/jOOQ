/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Long extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> {

	private static final long serialVersionUID = -1500524281;

	/**
	 * The singleton instance of <code>PUBLIC.LONG</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Long LONG = new org.jooq.test.hsqldb.generatedclasses.tables.Long();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord.class;
	}

	/**
	 * The column <code>PUBLIC.LONG.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>PUBLIC.LONG.OTHER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord, java.lang.Long> OTHER = createField("OTHER", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>PUBLIC.LONG</code> table reference
	 */
	public Long() {
		super("LONG", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.LONG</code> table reference
	 */
	public Long(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.Long.LONG);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.Long as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.Long(alias);
	}
}
