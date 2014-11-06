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
public class GlobalVariables extends org.jooq.impl.TableImpl<com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord> {

	private static final long serialVersionUID = 1249746613;

	/**
	 * The singleton instance of <code>information_schema.GLOBAL_VARIABLES</code>
	 */
	public static final com.mtech.generated.information_schema.tables.GlobalVariables GLOBAL_VARIABLES = new com.mtech.generated.information_schema.tables.GlobalVariables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord> getRecordType() {
		return com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord.class;
	}

	/**
	 * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_NAME</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord, java.lang.String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.GLOBAL_VARIABLES.VARIABLE_VALUE</code>.
	 */
	public final org.jooq.TableField<com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord, java.lang.String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>information_schema.GLOBAL_VARIABLES</code> table reference
	 */
	public GlobalVariables() {
		this("GLOBAL_VARIABLES", null);
	}

	/**
	 * Create an aliased <code>information_schema.GLOBAL_VARIABLES</code> table reference
	 */
	public GlobalVariables(java.lang.String alias) {
		this(alias, com.mtech.generated.information_schema.tables.GlobalVariables.GLOBAL_VARIABLES);
	}

	private GlobalVariables(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord> aliased) {
		this(alias, aliased, null);
	}

	private GlobalVariables(java.lang.String alias, org.jooq.Table<com.mtech.generated.information_schema.tables.records.GlobalVariablesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.mtech.generated.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.mtech.generated.information_schema.tables.GlobalVariables as(java.lang.String alias) {
		return new com.mtech.generated.information_schema.tables.GlobalVariables(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.mtech.generated.information_schema.tables.GlobalVariables rename(java.lang.String name) {
		return new com.mtech.generated.information_schema.tables.GlobalVariables(name, null);
	}
}