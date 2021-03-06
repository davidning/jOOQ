/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class LanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.LanguageRecord> implements org.jooq.Record3<java.lang.Byte, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -1937264368;

	/**
	 * Setter for <code>sakila.language.language_id</code>. 
	 */
	public void setLanguageId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID, value);
	}

	/**
	 * Getter for <code>sakila.language.language_id</code>. 
	 */
	public java.lang.Byte getLanguageId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>sakila.language.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.NAME, value);
	}

	/**
	 * Getter for <code>sakila.language.name</code>. 
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.NAME);
	}

	/**
	 * Setter for <code>sakila.language.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LAST_UPDATE, value);
	}

	/**
	 * Getter for <code>sakila.language.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LAST_UPDATE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>sakila.film</code> referencing this <code>sakila.language</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fetchFilmListByLanguageId() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.FILM.LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>sakila.film</code> referencing this <code>sakila.language</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.FilmRecord> fetchFilmListByOriginalLanguageId() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Film.FILM)
			.where(org.jooq.examples.mysql.sakila.tables.Film.FILM.ORIGINAL_LANGUAGE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID)))
			.fetch();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Byte> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Byte, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Byte, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field1() {
		return org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value1() {
		return getLanguageId();
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
	public java.sql.Timestamp value3() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LanguageRecord
	 */
	public LanguageRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Language.LANGUAGE);
	}
}
