/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface IPreparedStatement extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.PREPARED_STATEMENT.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.PREPARED_STATEMENT.ID</code>. 
	 */
	public java.lang.Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IPreparedStatement
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IPreparedStatement from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IPreparedStatement
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IPreparedStatement> E into(E into);
}
