/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class InventoryHeldByCustomer extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -1174927047;

	/**
	 * The parameter <code>sakila.inventory_held_by_customer.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>sakila.inventory_held_by_customer.p_inventory_id</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_INVENTORY_ID = createParameter("p_inventory_id", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public InventoryHeldByCustomer() {
		super("inventory_held_by_customer", org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_INVENTORY_ID);
	}

	/**
	 * Set the <code>p_inventory_id</code> parameter IN value to the routine
	 */
	public void setPInventoryId(java.lang.Integer value) {
		setValue(org.jooq.examples.mysql.sakila.routines.InventoryHeldByCustomer.P_INVENTORY_ID, value);
	}

	/**
	 * Set the <code>p_inventory_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPInventoryId(org.jooq.Field<java.lang.Integer> field) {
		setField(P_INVENTORY_ID, field);
	}
}
