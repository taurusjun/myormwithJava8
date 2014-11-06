/**
 * This class is generated by jOOQ
 */
package com.mtech.generated.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PluginsRecord extends org.jooq.impl.TableRecordImpl<com.mtech.generated.information_schema.tables.records.PluginsRecord> implements org.jooq.Record10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 103632890;

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
	 */
	public void setPluginName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
	 */
	public java.lang.String getPluginName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
	 */
	public void setPluginVersion(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
	 */
	public java.lang.String getPluginVersion() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
	 */
	public void setPluginStatus(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
	 */
	public java.lang.String getPluginStatus() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
	 */
	public void setPluginType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
	 */
	public java.lang.String getPluginType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
	 */
	public void setPluginTypeVersion(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
	 */
	public java.lang.String getPluginTypeVersion() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
	 */
	public void setPluginLibrary(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
	 */
	public java.lang.String getPluginLibrary() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
	 */
	public void setPluginLibraryVersion(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
	 */
	public java.lang.String getPluginLibraryVersion() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
	 */
	public void setPluginAuthor(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
	 */
	public java.lang.String getPluginAuthor() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
	 */
	public void setPluginDescription(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
	 */
	public java.lang.String getPluginDescription() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
	 */
	public void setPluginLicense(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
	 */
	public java.lang.String getPluginLicense() {
		return (java.lang.String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_TYPE_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_LIBRARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_LIBRARY_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.mtech.generated.information_schema.tables.Plugins.PLUGINS.PLUGIN_LICENSE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getPluginName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPluginVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getPluginStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPluginType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getPluginTypeVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getPluginLibrary();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getPluginLibraryVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getPluginAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getPluginDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPluginLicense();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value1(java.lang.String value) {
		setPluginName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value2(java.lang.String value) {
		setPluginVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value3(java.lang.String value) {
		setPluginStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value4(java.lang.String value) {
		setPluginType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value5(java.lang.String value) {
		setPluginTypeVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value6(java.lang.String value) {
		setPluginLibrary(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value7(java.lang.String value) {
		setPluginLibraryVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value8(java.lang.String value) {
		setPluginAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value9(java.lang.String value) {
		setPluginDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord value10(java.lang.String value) {
		setPluginLicense(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PluginsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PluginsRecord
	 */
	public PluginsRecord() {
		super(com.mtech.generated.information_schema.tables.Plugins.PLUGINS);
	}

	/**
	 * Create a detached, initialised PluginsRecord
	 */
	public PluginsRecord(java.lang.String pluginName, java.lang.String pluginVersion, java.lang.String pluginStatus, java.lang.String pluginType, java.lang.String pluginTypeVersion, java.lang.String pluginLibrary, java.lang.String pluginLibraryVersion, java.lang.String pluginAuthor, java.lang.String pluginDescription, java.lang.String pluginLicense) {
		super(com.mtech.generated.information_schema.tables.Plugins.PLUGINS);

		setValue(0, pluginName);
		setValue(1, pluginVersion);
		setValue(2, pluginStatus);
		setValue(3, pluginType);
		setValue(4, pluginTypeVersion);
		setValue(5, pluginLibrary);
		setValue(6, pluginLibraryVersion);
		setValue(7, pluginAuthor);
		setValue(8, pluginDescription);
		setValue(9, pluginLicense);
	}
}
