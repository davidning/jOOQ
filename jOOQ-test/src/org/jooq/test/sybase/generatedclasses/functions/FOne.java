/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.sybase.generatedclasses.Dba;
import org.jooq.util.sybase.SybaseDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FOne extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = -1437115552;


	/**
	 * No further instances allowed
	 */
	public FOne() {
		super(SQLDialect.SYBASE, "f_one", Dba.DBA, SybaseDataType.INTEGER);
	}
}
