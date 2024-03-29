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
public class KeyColumnUsage extends org.jooq.impl.TableImpl<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord> {

	private static final long serialVersionUID = -524665975;

	/**
	 * The singleton instance of <code>information_schema.KEY_COLUMN_USAGE</code>
	 */
	public static final com.mtech.generated.information_schema.tables.KeyColumnUsage KEY_COLUMN_USAGE = new com.mtech.generated.information_schema.tables.KeyColumnUsage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord> getRecordType() {
		return com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord.class;
	}

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.Long> POSITION_IN_UNIQUE_CONSTRAINT = createField("POSITION_IN_UNIQUE_CONSTRAINT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> REFERENCED_TABLE_SCHEMA = createField("REFERENCED_TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> REFERENCED_TABLE_NAME = createField("REFERENCED_TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord, java.lang.String> REFERENCED_COLUMN_NAME = createField("REFERENCED_COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * Create a <code>information_schema.KEY_COLUMN_USAGE</code> table reference
	 */
	public KeyColumnUsage() {
		this("KEY_COLUMN_USAGE", null);
	}

	/**
	 * Create an aliased <code>information_schema.KEY_COLUMN_USAGE</code> table reference
	 */
	public KeyColumnUsage(java.lang.String alias) {
		this(alias, com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);
	}

	private KeyColumnUsage(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord> aliased) {
		this(alias, aliased, null);
	}

	private KeyColumnUsage(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.information_schema.tables.KeyColumnUsage as(java.lang.String alias) {
		return new com.mtech.generated.information_schema.tables.KeyColumnUsage(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.information_schema.tables.KeyColumnUsage rename(java.lang.String name) {
		return new com.mtech.generated.information_schema.tables.KeyColumnUsage(name, null);
	}
}
