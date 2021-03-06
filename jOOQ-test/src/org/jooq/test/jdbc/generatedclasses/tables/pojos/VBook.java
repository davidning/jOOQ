/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBook implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.IVBook {

	private static final long serialVersionUID = 1773691587;

	private java.lang.Integer  id;
	private java.lang.Integer  authorId;
	private java.lang.Integer  coAuthorId;
	private java.lang.Integer  detailsId;
	private java.lang.String   title;
	private java.lang.Integer  publishedIn;
	private java.lang.Integer  languageId;
	private java.lang.String   contentText;
	private byte[]             contentPdf;
	private java.lang.Integer  recVersion;
	private java.sql.Timestamp recTimestamp;

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	@Override
	public void setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
	}

	@Override
	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	@Override
	public void setCoAuthorId(java.lang.Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@Override
	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	@Override
	public void setDetailsId(java.lang.Integer detailsId) {
		this.detailsId = detailsId;
	}

	@Override
	public java.lang.String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	@Override
	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	@Override
	public void setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	@Override
	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	@Override
	public void setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
	}

	@Override
	public java.lang.String getContentText() {
		return this.contentText;
	}

	@Override
	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	@Override
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	@Override
	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	@Override
	public java.lang.Integer getRecVersion() {
		return this.recVersion;
	}

	@Override
	public void setRecVersion(java.lang.Integer recVersion) {
		this.recVersion = recVersion;
	}

	@Override
	public java.sql.Timestamp getRecTimestamp() {
		return this.recTimestamp;
	}

	@Override
	public void setRecTimestamp(java.sql.Timestamp recTimestamp) {
		this.recTimestamp = recTimestamp;
	}
}
