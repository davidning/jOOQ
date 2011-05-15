/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sybase.generatedclasses.Dba;
import org.jooq.test.sybase.generatedclasses.Keys;
import org.jooq.test.sybase.generatedclasses.enums.TLanguage;
import org.jooq.test.sybase.generatedclasses.tables.records.TBookRecord;
import org.jooq.util.sybase.SybaseDataType;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 1111900346;

	/**
	 * The singleton instance of t_book
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookRecord> __RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.SYBASE, "ID", SybaseDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book.AUTHOR_ID]
	 * REFERENCES t_author [dba.t_author.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.SYBASE, "AUTHOR_ID", SybaseDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book.CO_AUTHOR_ID]
	 * REFERENCES t_author [dba.t_author.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, Integer> CO_AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.SYBASE, "CO_AUTHOR_ID", SybaseDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> DETAILS_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.SYBASE, "DETAILS_ID", SybaseDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>(SQLDialect.SYBASE, "TITLE", SybaseDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.SYBASE, "PUBLISHED_IN", SybaseDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_book.LANGUAGE_ID]
	 * REFERENCES t_language [dba.t_language.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>(SQLDialect.SYBASE, "LANGUAGE_ID", SybaseDataType.INTEGER.asMasterDataType(TLanguage.class), T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>(SQLDialect.SYBASE, "CONTENT_TEXT", SybaseDataType.LONGVARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>(SQLDialect.SYBASE, "CONTENT_PDF", SybaseDataType.LONGBINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super(SQLDialect.SYBASE, "t_book", Dba.DBA);
	}

	@Override
	public UniqueKey<TBookRecord> getMainKey() {
		return Keys.t_book_pk_t_book;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UniqueKey<TBookRecord>> getKeys() {
		return Arrays.<UniqueKey<TBookRecord>>asList(Keys.t_book_pk_t_book);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<ForeignKey<TBookRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<TBookRecord, ?>>asList(Keys.t_book_fk_t_book_author_id, Keys.t_book_fk_t_book_co_author_id);
	}
}
