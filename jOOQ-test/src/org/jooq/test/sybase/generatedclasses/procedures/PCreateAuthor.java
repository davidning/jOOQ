/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.sybase.generatedclasses.Dba;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PCreateAuthor extends StoredProcedureImpl {

	private static final long serialVersionUID = 1683535767;


	/**
	 * No further instances allowed
	 */
	public PCreateAuthor() {
		super(SQLDialect.SYBASE, "p_create_author", Dba.DBA);
	}
}
