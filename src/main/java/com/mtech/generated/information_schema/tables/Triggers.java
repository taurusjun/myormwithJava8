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
public class Triggers extends org.jooq.impl.TableImpl<com.mtech.generated.information_schema.tables.records.TriggersRecord> {

	private static final long serialVersionUID = 1666809079;

	/**
	 * The singleton instance of <code>information_schema.TRIGGERS</code>
	 */
	public static final com.mtech.generated.information_schema.tables.Triggers TRIGGERS = new com.mtech.generated.information_schema.tables.Triggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.information_schema.tables.records.TriggersRecord> getRecordType() {
		return com.mtech.generated.information_schema.tables.records.TriggersRecord.class;
	}

	/**
	 * The column <code>information_schema.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_CATALOG = createField("TRIGGER_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_SCHEMA = createField("TRIGGER_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.TRIGGER_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_NAME = createField("TRIGGER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.EVENT_MANIPULATION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> EVENT_MANIPULATION = createField("EVENT_MANIPULATION", org.jooq.impl.SQLDataType.VARCHAR.length(6).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.EVENT_OBJECT_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> EVENT_OBJECT_CATALOG = createField("EVENT_OBJECT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.EVENT_OBJECT_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> EVENT_OBJECT_SCHEMA = createField("EVENT_OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.EVENT_OBJECT_TABLE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> EVENT_OBJECT_TABLE = createField("EVENT_OBJECT_TABLE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_ORDER</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.Long> ACTION_ORDER = createField("ACTION_ORDER", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_CONDITION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_CONDITION = createField("ACTION_CONDITION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_STATEMENT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_STATEMENT = createField("ACTION_STATEMENT", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_ORIENTATION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_ORIENTATION = createField("ACTION_ORIENTATION", org.jooq.impl.SQLDataType.VARCHAR.length(9).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_TIMING</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_TIMING = createField("ACTION_TIMING", org.jooq.impl.SQLDataType.VARCHAR.length(6).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_TABLE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_REFERENCE_OLD_TABLE = createField("ACTION_REFERENCE_OLD_TABLE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_TABLE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_REFERENCE_NEW_TABLE = createField("ACTION_REFERENCE_NEW_TABLE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_REFERENCE_OLD_ROW</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_REFERENCE_OLD_ROW = createField("ACTION_REFERENCE_OLD_ROW", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.ACTION_REFERENCE_NEW_ROW</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> ACTION_REFERENCE_NEW_ROW = createField("ACTION_REFERENCE_NEW_ROW", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.CREATED</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.SQL_MODE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> SQL_MODE = createField("SQL_MODE", org.jooq.impl.SQLDataType.VARCHAR.length(8192).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.DEFINER</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR.length(77).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.CHARACTER_SET_CLIENT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> CHARACTER_SET_CLIENT = createField("CHARACTER_SET_CLIENT", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.COLLATION_CONNECTION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> COLLATION_CONNECTION = createField("COLLATION_CONNECTION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.TRIGGERS.DATABASE_COLLATION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.TriggersRecord, java.lang.String> DATABASE_COLLATION = createField("DATABASE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.TRIGGERS</code> table reference
	 */
	public Triggers() {
		this("TRIGGERS", null);
	}

	/**
	 * Create an aliased <code>information_schema.TRIGGERS</code> table reference
	 */
	public Triggers(java.lang.String alias) {
		this(alias, com.mtech.generated.information_schema.tables.Triggers.TRIGGERS);
	}

	private Triggers(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.TriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Triggers(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.TriggersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.information_schema.tables.Triggers as(java.lang.String alias) {
		return new com.mtech.generated.information_schema.tables.Triggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.information_schema.tables.Triggers rename(java.lang.String name) {
		return new com.mtech.generated.information_schema.tables.Triggers(name, null);
	}
}
