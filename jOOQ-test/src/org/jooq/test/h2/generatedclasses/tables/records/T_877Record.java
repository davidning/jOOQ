/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "1.6.8"},
                            comments = "This class is generated by jOOQ")
public class T_877Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.T_877Record> {

	private static final long serialVersionUID = -1383072690;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.T_877.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.T_877.ID);
	}

	/**
	 * Create a detached T_877Record
	 */
	public T_877Record() {
		super(org.jooq.test.h2.generatedclasses.tables.T_877.T_877);
	}

	/**
	 * Create an attached T_877Record
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public T_877Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.T_877.T_877, configuration);
	}
}