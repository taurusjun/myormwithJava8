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
public class FilesRecord extends org.jooq.impl.TableRecordImpl<com.mtech.generated.information_schema.tables.records.FilesRecord> {

	private static final long serialVersionUID = -1648112872;

	/**
	 * Setter for <code>information_schema.FILES.FILE_ID</code>.
	 */
	public void setFileId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FILE_ID</code>.
	 */
	public java.lang.Long getFileId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.FILES.FILE_NAME</code>.
	 */
	public void setFileName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FILE_NAME</code>.
	 */
	public java.lang.String getFileName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.FILES.FILE_TYPE</code>.
	 */
	public void setFileType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FILE_TYPE</code>.
	 */
	public java.lang.String getFileType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
	 */
	public void setTablespaceName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLESPACE_NAME</code>.
	 */
	public java.lang.String getTablespaceName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_CATALOG</code>.
	 */
	public void setTableCatalog(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_CATALOG</code>.
	 */
	public java.lang.String getTableCatalog() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
	 */
	public void setTableSchema(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_SCHEMA</code>.
	 */
	public java.lang.String getTableSchema() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_NAME</code>.
	 */
	public void setTableName(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_NAME</code>.
	 */
	public java.lang.String getTableName() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
	 */
	public void setLogfileGroupName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NAME</code>.
	 */
	public java.lang.String getLogfileGroupName() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
	 */
	public void setLogfileGroupNumber(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LOGFILE_GROUP_NUMBER</code>.
	 */
	public java.lang.Long getLogfileGroupNumber() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.FILES.ENGINE</code>.
	 */
	public void setEngine(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.ENGINE</code>.
	 */
	public java.lang.String getEngine() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
	 */
	public void setFulltextKeys(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FULLTEXT_KEYS</code>.
	 */
	public java.lang.String getFulltextKeys() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.FILES.DELETED_ROWS</code>.
	 */
	public void setDeletedRows(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.DELETED_ROWS</code>.
	 */
	public java.lang.Long getDeletedRows() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.FILES.UPDATE_COUNT</code>.
	 */
	public void setUpdateCount(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.UPDATE_COUNT</code>.
	 */
	public java.lang.Long getUpdateCount() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.FILES.FREE_EXTENTS</code>.
	 */
	public void setFreeExtents(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.FREE_EXTENTS</code>.
	 */
	public java.lang.Long getFreeExtents() {
		return (java.lang.Long) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
	 */
	public void setTotalExtents(java.lang.Long value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TOTAL_EXTENTS</code>.
	 */
	public java.lang.Long getTotalExtents() {
		return (java.lang.Long) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.FILES.EXTENT_SIZE</code>.
	 */
	public void setExtentSize(java.lang.Long value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.EXTENT_SIZE</code>.
	 */
	public java.lang.Long getExtentSize() {
		return (java.lang.Long) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.FILES.INITIAL_SIZE</code>.
	 */
	public void setInitialSize(org.jooq.types.ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.INITIAL_SIZE</code>.
	 */
	public org.jooq.types.ULong getInitialSize() {
		return (org.jooq.types.ULong) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
	 */
	public void setMaximumSize(org.jooq.types.ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.MAXIMUM_SIZE</code>.
	 */
	public org.jooq.types.ULong getMaximumSize() {
		return (org.jooq.types.ULong) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
	 */
	public void setAutoextendSize(org.jooq.types.ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.AUTOEXTEND_SIZE</code>.
	 */
	public org.jooq.types.ULong getAutoextendSize() {
		return (org.jooq.types.ULong) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.FILES.CREATION_TIME</code>.
	 */
	public void setCreationTime(java.sql.Timestamp value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CREATION_TIME</code>.
	 */
	public java.sql.Timestamp getCreationTime() {
		return (java.sql.Timestamp) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
	 */
	public void setLastUpdateTime(java.sql.Timestamp value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LAST_UPDATE_TIME</code>.
	 */
	public java.sql.Timestamp getLastUpdateTime() {
		return (java.sql.Timestamp) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
	 */
	public void setLastAccessTime(java.sql.Timestamp value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.LAST_ACCESS_TIME</code>.
	 */
	public java.sql.Timestamp getLastAccessTime() {
		return (java.sql.Timestamp) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.FILES.RECOVER_TIME</code>.
	 */
	public void setRecoverTime(java.lang.Long value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.RECOVER_TIME</code>.
	 */
	public java.lang.Long getRecoverTime() {
		return (java.lang.Long) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
	 */
	public void setTransactionCounter(java.lang.Long value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TRANSACTION_COUNTER</code>.
	 */
	public java.lang.Long getTransactionCounter() {
		return (java.lang.Long) getValue(23);
	}

	/**
	 * Setter for <code>information_schema.FILES.VERSION</code>.
	 */
	public void setVersion(org.jooq.types.ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.VERSION</code>.
	 */
	public org.jooq.types.ULong getVersion() {
		return (org.jooq.types.ULong) getValue(24);
	}

	/**
	 * Setter for <code>information_schema.FILES.ROW_FORMAT</code>.
	 */
	public void setRowFormat(java.lang.String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.ROW_FORMAT</code>.
	 */
	public java.lang.String getRowFormat() {
		return (java.lang.String) getValue(25);
	}

	/**
	 * Setter for <code>information_schema.FILES.TABLE_ROWS</code>.
	 */
	public void setTableRows(org.jooq.types.ULong value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.TABLE_ROWS</code>.
	 */
	public org.jooq.types.ULong getTableRows() {
		return (org.jooq.types.ULong) getValue(26);
	}

	/**
	 * Setter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
	 */
	public void setAvgRowLength(org.jooq.types.ULong value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.AVG_ROW_LENGTH</code>.
	 */
	public org.jooq.types.ULong getAvgRowLength() {
		return (org.jooq.types.ULong) getValue(27);
	}

	/**
	 * Setter for <code>information_schema.FILES.DATA_LENGTH</code>.
	 */
	public void setDataLength(org.jooq.types.ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.DATA_LENGTH</code>.
	 */
	public org.jooq.types.ULong getDataLength() {
		return (org.jooq.types.ULong) getValue(28);
	}

	/**
	 * Setter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
	 */
	public void setMaxDataLength(org.jooq.types.ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.MAX_DATA_LENGTH</code>.
	 */
	public org.jooq.types.ULong getMaxDataLength() {
		return (org.jooq.types.ULong) getValue(29);
	}

	/**
	 * Setter for <code>information_schema.FILES.INDEX_LENGTH</code>.
	 */
	public void setIndexLength(org.jooq.types.ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.INDEX_LENGTH</code>.
	 */
	public org.jooq.types.ULong getIndexLength() {
		return (org.jooq.types.ULong) getValue(30);
	}

	/**
	 * Setter for <code>information_schema.FILES.DATA_FREE</code>.
	 */
	public void setDataFree(org.jooq.types.ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.DATA_FREE</code>.
	 */
	public org.jooq.types.ULong getDataFree() {
		return (org.jooq.types.ULong) getValue(31);
	}

	/**
	 * Setter for <code>information_schema.FILES.CREATE_TIME</code>.
	 */
	public void setCreateTime(java.sql.Timestamp value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CREATE_TIME</code>.
	 */
	public java.sql.Timestamp getCreateTime() {
		return (java.sql.Timestamp) getValue(32);
	}

	/**
	 * Setter for <code>information_schema.FILES.UPDATE_TIME</code>.
	 */
	public void setUpdateTime(java.sql.Timestamp value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.UPDATE_TIME</code>.
	 */
	public java.sql.Timestamp getUpdateTime() {
		return (java.sql.Timestamp) getValue(33);
	}

	/**
	 * Setter for <code>information_schema.FILES.CHECK_TIME</code>.
	 */
	public void setCheckTime(java.sql.Timestamp value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CHECK_TIME</code>.
	 */
	public java.sql.Timestamp getCheckTime() {
		return (java.sql.Timestamp) getValue(34);
	}

	/**
	 * Setter for <code>information_schema.FILES.CHECKSUM</code>.
	 */
	public void setChecksum(org.jooq.types.ULong value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.CHECKSUM</code>.
	 */
	public org.jooq.types.ULong getChecksum() {
		return (org.jooq.types.ULong) getValue(35);
	}

	/**
	 * Setter for <code>information_schema.FILES.STATUS</code>.
	 */
	public void setStatus(java.lang.String value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.STATUS</code>.
	 */
	public java.lang.String getStatus() {
		return (java.lang.String) getValue(36);
	}

	/**
	 * Setter for <code>information_schema.FILES.EXTRA</code>.
	 */
	public void setExtra(java.lang.String value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>information_schema.FILES.EXTRA</code>.
	 */
	public java.lang.String getExtra() {
		return (java.lang.String) getValue(37);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FilesRecord
	 */
	public FilesRecord() {
		super(com.mtech.generated.information_schema.tables.Files.FILES);
	}

	/**
	 * Create a detached, initialised FilesRecord
	 */
	public FilesRecord(java.lang.Long fileId, java.lang.String fileName, java.lang.String fileType, java.lang.String tablespaceName, java.lang.String tableCatalog, java.lang.String tableSchema, java.lang.String tableName, java.lang.String logfileGroupName, java.lang.Long logfileGroupNumber, java.lang.String engine, java.lang.String fulltextKeys, java.lang.Long deletedRows, java.lang.Long updateCount, java.lang.Long freeExtents, java.lang.Long totalExtents, java.lang.Long extentSize, org.jooq.types.ULong initialSize, org.jooq.types.ULong maximumSize, org.jooq.types.ULong autoextendSize, java.sql.Timestamp creationTime, java.sql.Timestamp lastUpdateTime, java.sql.Timestamp lastAccessTime, java.lang.Long recoverTime, java.lang.Long transactionCounter, org.jooq.types.ULong version, java.lang.String rowFormat, org.jooq.types.ULong tableRows, org.jooq.types.ULong avgRowLength, org.jooq.types.ULong dataLength, org.jooq.types.ULong maxDataLength, org.jooq.types.ULong indexLength, org.jooq.types.ULong dataFree, java.sql.Timestamp createTime, java.sql.Timestamp updateTime, java.sql.Timestamp checkTime, org.jooq.types.ULong checksum, java.lang.String status, java.lang.String extra) {
		super(com.mtech.generated.information_schema.tables.Files.FILES);

		setValue(0, fileId);
		setValue(1, fileName);
		setValue(2, fileType);
		setValue(3, tablespaceName);
		setValue(4, tableCatalog);
		setValue(5, tableSchema);
		setValue(6, tableName);
		setValue(7, logfileGroupName);
		setValue(8, logfileGroupNumber);
		setValue(9, engine);
		setValue(10, fulltextKeys);
		setValue(11, deletedRows);
		setValue(12, updateCount);
		setValue(13, freeExtents);
		setValue(14, totalExtents);
		setValue(15, extentSize);
		setValue(16, initialSize);
		setValue(17, maximumSize);
		setValue(18, autoextendSize);
		setValue(19, creationTime);
		setValue(20, lastUpdateTime);
		setValue(21, lastAccessTime);
		setValue(22, recoverTime);
		setValue(23, transactionCounter);
		setValue(24, version);
		setValue(25, rowFormat);
		setValue(26, tableRows);
		setValue(27, avgRowLength);
		setValue(28, dataLength);
		setValue(29, maxDataLength);
		setValue(30, indexLength);
		setValue(31, dataFree);
		setValue(32, createTime);
		setValue(33, updateTime);
		setValue(34, checkTime);
		setValue(35, checksum);
		setValue(36, status);
		setValue(37, extra);
	}
}
