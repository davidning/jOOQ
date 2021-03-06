/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class AddressType extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType> {

	private static final long serialVersionUID = 729211030;

	/**
	 * The singleton instance of <code>Person.AddressType</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.AddressType AddressType = new org.jooq.examples.sqlserver.adventureworks.person.tables.AddressType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType.class;
	}

	/**
	 * The column <code>Person.AddressType.AddressTypeID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType, java.lang.Integer> AddressTypeID = createField("AddressTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Person.AddressType.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Person.AddressType.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>Person.AddressType.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Person.AddressType</code> table reference
	 */
	public AddressType() {
		super("AddressType", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	/**
	 * Create an aliased <code>Person.AddressType</code> table reference
	 */
	public AddressType(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.AddressType.AddressType);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_AddressType;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_AddressType_AddressTypeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.AddressType>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_AddressType_AddressTypeID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.AddressType as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.AddressType(alias);
	}
}
