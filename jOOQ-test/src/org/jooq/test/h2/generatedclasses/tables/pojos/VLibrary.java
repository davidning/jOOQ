/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibrary implements org.jooq.test.h2.generatedclasses.tables.interfaces.IVLibrary {

	private static final long serialVersionUID = -2117494202;

	private java.lang.String author;
	private java.lang.String title;

	@Override
	public java.lang.String getAuthor() {
		return this.author;
	}

	@Override
	public void setAuthor(java.lang.String author) {
		this.author = author;
	}

	@Override
	public java.lang.String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IVLibrary from) {
		setAuthor(from.getAuthor());
		setTitle(from.getTitle());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IVLibrary> E into(E into) {
		into.from(this);
		return into;
	}
}
