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
public class ProcesslistRecord extends org.jooq.impl.TableRecordImpl<com.mtech.generated.information_schema.tables.records.ProcesslistRecord> implements org.jooq.Record8<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1500849776;

	/**
	 * Setter for <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.ID</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public void setUser(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.USER</code>.
	 */
	public java.lang.String getUser() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public void setHost(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.HOST</code>.
	 */
	public java.lang.String getHost() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public void setDb(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.DB</code>.
	 */
	public java.lang.String getDb() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public void setCommand(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.COMMAND</code>.
	 */
	public java.lang.String getCommand() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public void setTime(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.TIME</code>.
	 */
	public java.lang.Integer getTime() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.STATE</code>.
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public void setInfo(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.PROCESSLIST.INFO</code>.
	 */
	public java.lang.String getInfo() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.HOST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.DB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.COMMAND;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST.INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getHost();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getCommand();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getInfo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value1(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value2(java.lang.String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value3(java.lang.String value) {
		setHost(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value4(java.lang.String value) {
		setDb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value5(java.lang.String value) {
		setCommand(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value6(java.lang.Integer value) {
		setTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value7(java.lang.String value) {
		setState(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord value8(java.lang.String value) {
		setInfo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProcesslistRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.String value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ProcesslistRecord
	 */
	public ProcesslistRecord() {
		super(com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST);
	}

	/**
	 * Create a detached, initialised ProcesslistRecord
	 */
	public ProcesslistRecord(java.lang.Long id, java.lang.String user, java.lang.String host, java.lang.String db, java.lang.String command, java.lang.Integer time, java.lang.String state, java.lang.String info) {
		super(com.mtech.generated.information_schema.tables.Processlist.PROCESSLIST);

		setValue(0, id);
		setValue(1, user);
		setValue(2, host);
		setValue(3, db);
		setValue(4, command);
		setValue(5, time);
		setValue(6, state);
		setValue(7, info);
	}
}
