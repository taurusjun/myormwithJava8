/**
 * This class is generated by jOOQ
 */
package com.mtech.generated.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TuserRecord extends org.jooq.impl.UpdatableRecordImpl<com.mtech.generated.test.tables.records.TuserRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> {

	private static final long serialVersionUID = -1204743009;

	/**
	 * Setter for <code>test.tuser.id</code>.
	 */
	public void setId(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.tuser.id</code>.
	 */
	public java.lang.String getId() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>test.tuser.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.tuser.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>test.tuser.regtime</code>.
	 */
	public void setRegtime(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>test.tuser.regtime</code>.
	 */
	public java.sql.Timestamp getRegtime() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>test.tuser.username</code>.
	 */
	public void setUsername(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>test.tuser.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.mtech.generated.test.tables.Tuser.TUSER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.mtech.generated.test.tables.Tuser.TUSER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return com.mtech.generated.test.tables.Tuser.TUSER.REGTIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.mtech.generated.test.tables.Tuser.TUSER.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getRegtime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TuserRecord value1(java.lang.String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TuserRecord value2(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TuserRecord value3(java.sql.Timestamp value) {
		setRegtime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TuserRecord value4(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TuserRecord values(java.lang.String value1, java.lang.String value2, java.sql.Timestamp value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TuserRecord
	 */
	public TuserRecord() {
		super(com.mtech.generated.test.tables.Tuser.TUSER);
	}

	/**
	 * Create a detached, initialised TuserRecord
	 */
	public TuserRecord(java.lang.String id, java.lang.String password, java.sql.Timestamp regtime, java.lang.String username) {
		super(com.mtech.generated.test.tables.Tuser.TUSER);

		setValue(0, id);
		setValue(1, password);
		setValue(2, regtime);
		setValue(3, username);
	}
}
