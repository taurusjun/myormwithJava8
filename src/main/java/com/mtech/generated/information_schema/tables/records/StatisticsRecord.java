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
public class StatisticsRecord extends org.jooq.impl.TableRecordImpl<com.mtech.generated.information_schema.tables.records.StatisticsRecord> implements org.jooq.Record15<java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 471341500;

	/**
	 * Setter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
	 */
	public void setNonUnique(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
	 */
	public java.lang.Long getNonUnique() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
	 */
	public void setIndexSchema(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
	 */
	public java.lang.String getIndexSchema() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
	 */
	public void setIndexName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
	 */
	public java.lang.String getIndexName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
	 */
	public void setSeqInIndex(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
	 */
	public java.lang.Long getSeqInIndex() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
	 */
	public void setColumnName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
	 */
	public java.lang.String getColumnName() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.COLLATION</code>.
	 */
	public void setCollation(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.COLLATION</code>.
	 */
	public java.lang.String getCollation() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.CARDINALITY</code>.
	 */
	public void setCardinality(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.CARDINALITY</code>.
	 */
	public java.lang.Long getCardinality() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.SUB_PART</code>.
	 */
	public void setSubPart(java.lang.Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.SUB_PART</code>.
	 */
	public java.lang.Long getSubPart() {
		return (java.lang.Long) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.PACKED</code>.
	 */
	public void setPacked(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.PACKED</code>.
	 */
	public java.lang.String getPacked() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.NULLABLE</code>.
	 */
	public void setNullable(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.NULLABLE</code>.
	 */
	public java.lang.String getNullable() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
	 */
	public void setIndexType(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
	 */
	public java.lang.String getIndexType() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.STATISTICS.COMMENT</code>.
	 */
	public void setComment(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.STATISTICS.COMMENT</code>.
	 */
	public java.lang.String getComment() {
		return (java.lang.String) getValue(14);
	}

	// -------------------------------------------------------------------------
	// Record15 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row15) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row15<java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row15) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.TABLE_CATALOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.NON_UNIQUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.INDEX_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.SEQ_IN_INDEX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.COLUMN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.COLLATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.CARDINALITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field11() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.SUB_PART;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.PACKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.NULLABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.INDEX_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return com.mtech.generated.information_schema.tables.Statistics.STATISTICS.COMMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getTableCatalog();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getNonUnique();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getIndexSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getSeqInIndex();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getColumnName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getCollation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getCardinality();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value11() {
		return getSubPart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getPacked();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getNullable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getIndexType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getComment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value1(java.lang.String value) {
		setTableCatalog(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value2(java.lang.String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value3(java.lang.String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value4(java.lang.Long value) {
		setNonUnique(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value5(java.lang.String value) {
		setIndexSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value6(java.lang.String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value7(java.lang.Long value) {
		setSeqInIndex(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value8(java.lang.String value) {
		setColumnName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value9(java.lang.String value) {
		setCollation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value10(java.lang.Long value) {
		setCardinality(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value11(java.lang.Long value) {
		setSubPart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value12(java.lang.String value) {
		setPacked(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value13(java.lang.String value) {
		setNullable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value14(java.lang.String value) {
		setIndexType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord value15(java.lang.String value) {
		setComment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatisticsRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Long value4, java.lang.String value5, java.lang.String value6, java.lang.Long value7, java.lang.String value8, java.lang.String value9, java.lang.Long value10, java.lang.Long value11, java.lang.String value12, java.lang.String value13, java.lang.String value14, java.lang.String value15) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StatisticsRecord
	 */
	public StatisticsRecord() {
		super(com.mtech.generated.information_schema.tables.Statistics.STATISTICS);
	}

	/**
	 * Create a detached, initialised StatisticsRecord
	 */
	public StatisticsRecord(java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.Long nonUnique, java.lang.String indexSchema, java.lang.String indexName, java.lang.Long seqInIndex, java.lang.String columnName, java.lang.String collation, java.lang.Long cardinality, java.lang.Long subPart, java.lang.String packed, java.lang.String nullable, java.lang.String indexType, java.lang.String comment) {
		super(com.mtech.generated.information_schema.tables.Statistics.STATISTICS);

		setValue(0, tableCatalog);
		setValue(1, tableSchema);
		setValue(2, tableName);
		setValue(3, nonUnique);
		setValue(4, indexSchema);
		setValue(5, indexName);
		setValue(6, seqInIndex);
		setValue(7, columnName);
		setValue(8, collation);
		setValue(9, cardinality);
		setValue(10, subPart);
		setValue(11, packed);
		setValue(12, nullable);
		setValue(13, indexType);
		setValue(14, comment);
	}
}
