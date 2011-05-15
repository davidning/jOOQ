/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.sqlserver.generatedclasses.Dbo;
import org.jooq.util.sqlserver.SQLServerDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PAuthorExists extends StoredProcedureImpl {

	private static final long serialVersionUID = 1195245553;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.SQLSERVER, "author_name", SQLServerDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> RESULT = new ParameterImpl<Integer>(SQLDialect.SQLSERVER, "result", SQLServerDataType.INT);

	/**
	 * No further instances allowed
	 */
	public PAuthorExists() {
		super(SQLDialect.SQLSERVER, "p_author_exists", Dbo.DBO);

		addInParameter(AUTHOR_NAME);
		addInOutParameter(RESULT);
	}

	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	public void setResult(Integer value) {
		setValue(RESULT, value);
	}

	public Integer getResult() {
		return getValue(RESULT);
	}
}
