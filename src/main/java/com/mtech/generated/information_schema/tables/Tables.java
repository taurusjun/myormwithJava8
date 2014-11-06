/**
 * This class is generated by jOOQ
 */
package com.mtech.generated.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends org.jooq.impl.TableImpl<com.mtech.generated.information_schema.tables.records.TablesRecord> {

	private static final long serialVersionUID = 314777818;

	/**
	 * The singleton instance of <code>information_schema.TABLES</code>
	 */
	public static final com.mtech.generated.information_schema.tables.Tables TABLES = new com.mtech.generated.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.information_schema.tables.records.TablesRecord> getRecordType() {
		return com.mtech.generated.information_schema.tables.records.TablesRecord.class;
	}

	/**
	 * The column <code>information_schema.TABLES.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>information_schema.TABLES.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLES.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLES.TABLE_TYPE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TABLES.ENGINE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> ENGINE = createField("ENGINE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.TABLES.VERSION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.ROW_FORMAT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> ROW_FORMAT = createField("ROW_FORMAT", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>information_schema.TABLES.TABLE_ROWS</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> TABLE_ROWS = createField("TABLE_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.AVG_ROW_LENGTH</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> AVG_ROW_LENGTH = createField("AVG_ROW_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.DATA_LENGTH</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> DATA_LENGTH = createField("DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.MAX_DATA_LENGTH</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> MAX_DATA_LENGTH = createField("MAX_DATA_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.INDEX_LENGTH</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> INDEX_LENGTH = createField("INDEX_LENGTH", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.DATA_FREE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> DATA_FREE = createField("DATA_FREE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.AUTO_INCREMENT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> AUTO_INCREMENT = createField("AUTO_INCREMENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.CREATE_TIME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.sql.Timestamp> CREATE_TIME = createField("CREATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.TABLES.UPDATE_TIME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.sql.Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.TABLES.CHECK_TIME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.sql.Timestamp> CHECK_TIME = createField("CHECK_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.TABLES.TABLE_COLLATION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_COLLATION = createField("TABLE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>information_schema.TABLES.CHECKSUM</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, org.jooq.types.ULong> CHECKSUM = createField("CHECKSUM", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>information_schema.TABLES.CREATE_OPTIONS</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> CREATE_OPTIONS = createField("CREATE_OPTIONS", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>information_schema.TABLES.TABLE_COMMENT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_COMMENT = createField("TABLE_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.TABLES</code> table reference
	 */
	public Tables() {
		this("TABLES", null);
	}

	/**
	 * Create an aliased <code>information_schema.TABLES</code> table reference
	 */
	public Tables(java.lang.String alias) {
		this(alias, com.mtech.generated.information_schema.tables.Tables.TABLES);
	}

	private Tables(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.TablesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tables(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.TablesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.information_schema.tables.Tables as(java.lang.String alias) {
		return new com.mtech.generated.information_schema.tables.Tables(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.information_schema.tables.Tables rename(java.lang.String name) {
		return new com.mtech.generated.information_schema.tables.Tables(name, null);
	}
}
