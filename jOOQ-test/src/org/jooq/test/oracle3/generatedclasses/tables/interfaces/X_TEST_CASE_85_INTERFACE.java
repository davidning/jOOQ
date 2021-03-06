/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_85", schema = "TEST")
public interface X_TEST_CASE_85_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>TEST.X_TEST_CASE_85.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_85.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public void setX_UNUSED_ID(java.lang.Integer value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	@javax.persistence.Column(name = "X_UNUSED_ID", precision = 7)
	public java.lang.Integer getX_UNUSED_ID();

	/**
	 * Setter for <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public void setX_UNUSED_NAME(java.lang.String value);

	/**
	 * Getter for <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	@javax.persistence.Column(name = "X_UNUSED_NAME", length = 10)
	public java.lang.String getX_UNUSED_NAME();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface X_TEST_CASE_85_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_85_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface X_TEST_CASE_85_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_85_INTERFACE> E into(E into);
}
