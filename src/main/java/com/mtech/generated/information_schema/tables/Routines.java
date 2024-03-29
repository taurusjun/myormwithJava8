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
public class Routines extends org.jooq.impl.TableImpl<com.mtech.generated.information_schema.tables.records.RoutinesRecord> {

	private static final long serialVersionUID = -536655431;

	/**
	 * The singleton instance of <code>information_schema.ROUTINES</code>
	 */
	public static final com.mtech.generated.information_schema.tables.Routines ROUTINES = new com.mtech.generated.information_schema.tables.Routines();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.information_schema.tables.records.RoutinesRecord> getRecordType() {
		return com.mtech.generated.information_schema.tables.records.RoutinesRecord.class;
	}

	/**
	 * The column <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_CATALOG = createField("ROUTINE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_SCHEMA = createField("ROUTINE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_NAME = createField("ROUTINE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_TYPE = createField("ROUTINE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(9).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_BODY = createField("ROUTINE_BODY", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_DEFINITION = createField("ROUTINE_DEFINITION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> EXTERNAL_NAME = createField("EXTERNAL_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> EXTERNAL_LANGUAGE = createField("EXTERNAL_LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> PARAMETER_STYLE = createField("PARAMETER_STYLE", org.jooq.impl.SQLDataType.VARCHAR.length(8).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> IS_DETERMINISTIC = createField("IS_DETERMINISTIC", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> SQL_DATA_ACCESS = createField("SQL_DATA_ACCESS", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.SQL_PATH</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> SECURITY_TYPE = createField("SECURITY_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.CREATED</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.sql.Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.LAST_ALTERED</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.sql.Timestamp> LAST_ALTERED = createField("LAST_ALTERED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.SQL_MODE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> SQL_MODE = createField("SQL_MODE", org.jooq.impl.SQLDataType.VARCHAR.length(8192).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> ROUTINE_COMMENT = createField("ROUTINE_COMMENT", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.DEFINER</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR.length(77).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> CHARACTER_SET_CLIENT = createField("CHARACTER_SET_CLIENT", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> COLLATION_CONNECTION = createField("COLLATION_CONNECTION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.RoutinesRecord, java.lang.String> DATABASE_COLLATION = createField("DATABASE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.ROUTINES</code> table reference
	 */
	public Routines() {
		this("ROUTINES", null);
	}

	/**
	 * Create an aliased <code>information_schema.ROUTINES</code> table reference
	 */
	public Routines(java.lang.String alias) {
		this(alias, com.mtech.generated.information_schema.tables.Routines.ROUTINES);
	}

	private Routines(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.RoutinesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Routines(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.RoutinesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.information_schema.tables.Routines as(java.lang.String alias) {
		return new com.mtech.generated.information_schema.tables.Routines(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.information_schema.tables.Routines rename(java.lang.String name) {
		return new com.mtech.generated.information_schema.tables.Routines(name, null);
	}
}
