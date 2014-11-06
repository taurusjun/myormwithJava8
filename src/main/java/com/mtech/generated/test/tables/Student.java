/**
 * This class is generated by jOOQ
 */
package com.mtech.generated.test.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student extends org.jooq.impl.TableImpl<com.mtech.generated.test.tables.records.StudentRecord> {

	private static final long serialVersionUID = 1460486592;

	/**
	 * The singleton instance of <code>test.student</code>
	 */
	public static final com.mtech.generated.test.tables.Student STUDENT = new com.mtech.generated.test.tables.Student();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.test.tables.records.StudentRecord> getRecordType() {
		return com.mtech.generated.test.tables.records.StudentRecord.class;
	}

	/**
	 * The column <code>test.student.id</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.test.tables.records.StudentRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>test.student.name</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.test.tables.records.StudentRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(767), this, "");

	/**
	 * The column <code>test.student.registration_date</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.test.tables.records.StudentRecord, java.sql.Timestamp> REGISTRATION_DATE = createField("registration_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>test.student.gpa</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.test.tables.records.StudentRecord, java.lang.Double> GPA = createField("gpa", org.jooq.impl.SQLDataType.FLOAT, this, "");

	/**
	 * Create a <code>test.student</code> table reference
	 */
	public Student() {
		this("student", null);
	}

	/**
	 * Create an aliased <code>test.student</code> table reference
	 */
	public Student(java.lang.String alias) {
		this(alias, com.mtech.generated.test.tables.Student.STUDENT);
	}

	private Student(java.lang.String alias, org.jooq.Table<com.mtech.generated.test.tables.records.StudentRecord> aliased) {
		this(alias, aliased, null);
	}

	private Student(java.lang.String alias, org.jooq.Table<com.mtech.generated.test.tables.records.StudentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.test.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.mtech.generated.test.tables.records.StudentRecord, java.lang.Integer> getIdentity() {
		return com.mtech.generated.test.Keys.IDENTITY_STUDENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.mtech.generated.test.tables.records.StudentRecord> getPrimaryKey() {
		return com.mtech.generated.test.Keys.KEY_STUDENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.mtech.generated.test.tables.records.StudentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.mtech.generated.test.tables.records.StudentRecord>>asList(com.mtech.generated.test.Keys.KEY_STUDENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.test.tables.Student as(java.lang.String alias) {
		return new com.mtech.generated.test.tables.Student(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.test.tables.Student rename(java.lang.String name) {
		return new com.mtech.generated.test.tables.Student(name, null);
	}
}