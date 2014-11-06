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
public class Plugins extends org.jooq.impl.TableImpl<com.mtech.generated.information_schema.tables.records.PluginsRecord> {

	private static final long serialVersionUID = 2116600086;

	/**
	 * The singleton instance of <code>information_schema.PLUGINS</code>
	 */
	public static final com.mtech.generated.information_schema.tables.Plugins PLUGINS = new com.mtech.generated.information_schema.tables.Plugins();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.information_schema.tables.records.PluginsRecord> getRecordType() {
		return com.mtech.generated.information_schema.tables.records.PluginsRecord.class;
	}

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_NAME = createField("PLUGIN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_VERSION = createField("PLUGIN_VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_STATUS = createField("PLUGIN_STATUS", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_TYPE = createField("PLUGIN_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(80).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_TYPE_VERSION = createField("PLUGIN_TYPE_VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_LIBRARY = createField("PLUGIN_LIBRARY", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_LIBRARY_VERSION = createField("PLUGIN_LIBRARY_VERSION", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_AUTHOR = createField("PLUGIN_AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_DESCRIPTION = createField("PLUGIN_DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.PluginsRecord, java.lang.String> PLUGIN_LICENSE = createField("PLUGIN_LICENSE", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

	/**
	 * Create a <code>information_schema.PLUGINS</code> table reference
	 */
	public Plugins() {
		this("PLUGINS", null);
	}

	/**
	 * Create an aliased <code>information_schema.PLUGINS</code> table reference
	 */
	public Plugins(java.lang.String alias) {
		this(alias, com.mtech.generated.information_schema.tables.Plugins.PLUGINS);
	}

	private Plugins(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.PluginsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Plugins(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.PluginsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.information_schema.tables.Plugins as(java.lang.String alias) {
		return new com.mtech.generated.information_schema.tables.Plugins(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.information_schema.tables.Plugins rename(java.lang.String name) {
		return new com.mtech.generated.information_schema.tables.Plugins(name, null);
	}
}