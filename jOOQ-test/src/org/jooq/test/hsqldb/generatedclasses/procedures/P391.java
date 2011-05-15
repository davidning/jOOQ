/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class P391 extends StoredProcedureImpl {

	private static final long serialVersionUID = -315577118;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> I1 = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "I1", HSQLDBDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> IO1 = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "IO1", HSQLDBDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> O1 = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "O1", HSQLDBDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> O2 = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "O2", HSQLDBDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> IO2 = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "IO2", HSQLDBDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final Parameter<Integer> I2 = new ParameterImpl<Integer>(SQLDialect.HSQLDB, "I2", HSQLDBDataType.INTEGER);

	/**
	 * No further instances allowed
	 */
	public P391() {
		super(SQLDialect.HSQLDB, "P391", Public.PUBLIC);

		addInParameter(I1);
		addInOutParameter(IO1);
		addOutParameter(O1);
		addOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	public void setI1(Integer value) {
		setValue(I1, value);
	}

	public void setIo1(Integer value) {
		setValue(IO1, value);
	}

	public void setIo2(Integer value) {
		setValue(IO2, value);
	}

	public void setI2(Integer value) {
		setValue(I2, value);
	}

	public Integer getIo1() {
		return getValue(IO1);
	}

	public Integer getO1() {
		return getValue(O1);
	}

	public Integer getO2() {
		return getValue(O2);
	}

	public Integer getIo2() {
		return getValue(IO2);
	}
}
