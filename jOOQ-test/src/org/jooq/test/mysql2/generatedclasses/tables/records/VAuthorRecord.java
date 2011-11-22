/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = 495809770;

	/**
	 * The author ID
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.ID, value);
	}

	/**
	 * The author ID
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.ID);
	}

	/**
	 * The author's first name
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * The author's first name
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.FIRST_NAME);
	}

	/**
	 * The author's last name
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME, value);
	}

	/**
	 * The author's last name
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.LAST_NAME);
	}

	/**
	 * The author's date of birth
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * The author's date of birth
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * The author's year of birth
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * The author's year of birth
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * The author's address
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS, value);
	}

	/**
	 * The author's address
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR);
	}
}