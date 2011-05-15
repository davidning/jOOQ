/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlite.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = 1415947480;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setCoAuthorId(Integer value) {
		setValue(TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getCoAuthorId() {
		return getValue(TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(Integer value) {
		setValue(TBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getDetailsId() {
		return getValue(TBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(Integer value) {
		setValue(TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getPublishedIn() {
		return getValue(TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 */
	public void setLanguageId(Integer value) {
		setValue(TBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getLanguageId() {
		return getValue(TBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(String value) {
		setValue(TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public String getContentText() {
		return getValue(TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(TBook.CONTENT_PDF);
	}
	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(TBook.T_BOOK);
	}

	/**
	 * Create an attached TBookRecord
	 */
	public TBookRecord(Configuration configuration) {
		super(TBook.T_BOOK, configuration);
	}
}
