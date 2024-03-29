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
public class KeyColumnUsageRecord extends org.jooq.impl.TableRecordImpl<com.mtech.generated.information_schema.tables.records.KeyColumnUsageRecord> implements org.jooq.Record12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1343401607;

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
	 */
	public void setConstraintCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
	 */
	public java.lang.String getConstraintCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
	 */
	public void setConstraintSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
	 */
	public java.lang.String getConstraintSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
	 */
	public java.lang.String getConstraintName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
	 */
	public void setColumnName(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
	 */
	public java.lang.String getColumnName() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
	 */
	public void setOrdinalPosition(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
	 */
	public java.lang.Long getOrdinalPosition() {
		return (java.lang.Long) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
	 */
	public void setPositionInUniqueConstraint(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
	 */
	public java.lang.Long getPositionInUniqueConstraint() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
	 */
	public void setReferencedTableSchema(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
	 */
	public java.lang.String getReferencedTableSchema() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
	 */
	public void setReferencedTableName(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
	 */
	public java.lang.String getReferencedTableName() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
	 */
	public void setReferencedColumnName(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
	 */
	public java.lang.String getReferencedColumnName() {
		return (java.lang.String) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row12<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.ORDINAL_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getConstraintCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getConstraintSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getConstraintName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getOrdinalPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getPositionInUniqueConstraint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getReferencedTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getReferencedTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getReferencedColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value1(java.lang.String value) {
		setConstraintCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value2(java.lang.String value) {
		setConstraintSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value3(java.lang.String value) {
		setConstraintName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value4(java.lang.String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value5(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value6(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value7(java.lang.String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value8(java.lang.Long value) {
		setOrdinalPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value9(java.lang.Long value) {
		setPositionInUniqueConstraint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value10(java.lang.String value) {
		setReferencedTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value11(java.lang.String value) {
		setReferencedTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord value12(java.lang.String value) {
		setReferencedColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public KeyColumnUsageRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.Long value8, java.lang.Long value9, java.lang.String value10, java.lang.String value11, java.lang.String value12) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached KeyColumnUsageRecord
	 */
	public KeyColumnUsageRecord() {
		super(com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);
	}

	/**
	 * Create a detached, initialised KeyColumnUsageRecord
	 */
	public KeyColumnUsageRecord(java.lang.String constraintCatalog, java.lang.String constraintSchema, java.lang.String constraintName, java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.String columnName, java.lang.Long ordinalPosition, java.lang.Long positionInUniqueConstraint, java.lang.String referencedTableSchema, java.lang.String referencedTableName, java.lang.String referencedColumnName) {
		super(com.mtech.generated.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE);

		setValue(0, constraintCatalog);
		setValue(1, constraintSchema);
		setValue(2, constraintName);
		setValue(3, tableCatalog);
		setValue(4, tableSchema);
		setValue(5, tableName);
		setValue(6, columnName);
		setValue(7, ordinalPosition);
		setValue(8, positionInUniqueConstraint);
		setValue(9, referencedTableSchema);
		setValue(10, referencedTableName);
		setValue(11, referencedColumnName);
	}
}
