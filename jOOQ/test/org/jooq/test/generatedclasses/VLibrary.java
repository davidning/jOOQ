/**
 * This class is generated by jOOQ
 */
package org.jooq.test.generatedclasses;

import java.lang.String;
import org.jooq.Field;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VLibrary extends TableImpl {

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final VLibrary V_LIBRARY = new VLibrary();

	/**
	 * An uncommented column
	 */
	public static final Field<String> AUTHOR = new TableFieldImpl<String>("AUTHOR", String.class, V_LIBRARY);

	/**
	 * The book's title
	 */
	public static final Field<String> TITLE = new TableFieldImpl<String>("TITLE", String.class, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("V_LIBRARY", "test");
	}
}
