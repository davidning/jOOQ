/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_2025", schema = "public")
public class XTestCase_2025 implements java.io.Serializable {

	private static final long serialVersionUID = -699078709;

	private final java.lang.Integer refId;
	private final java.lang.String  refName;

	public XTestCase_2025(
		java.lang.Integer refId,
		java.lang.String  refName
	) {
		this.refId = refId;
		this.refName = refName;
	}

	@javax.persistence.Column(name = "ref_id", nullable = false, precision = 32)
	public java.lang.Integer getRefId() {
		return this.refId;
	}

	@javax.persistence.Column(name = "ref_name", nullable = false, length = 10)
	public java.lang.String getRefName() {
		return this.refName;
	}
}
