/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.T_785Record> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 307503221;

	/**
	 * Setter for <code>dbo.t_785.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.ID, value);
	}

	/**
	 * Getter for <code>dbo.t_785.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.ID);
	}

	/**
	 * Setter for <code>dbo.t_785.NAME</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.NAME, value);
	}

	/**
	 * Getter for <code>dbo.t_785.NAME</code>. 
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.NAME);
	}

	/**
	 * Setter for <code>dbo.t_785.VALUE</code>. 
	 */
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.VALUE, value);
	}

	/**
	 * Getter for <code>dbo.t_785.VALUE</code>. 
	 */
	public java.lang.String getValue() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.VALUE);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getValue();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.T_785.T_785);
	}
}
