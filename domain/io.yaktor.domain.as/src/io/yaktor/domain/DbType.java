/**
 */
package io.yaktor.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Db Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.yaktor.domain.DomainPackage#getDbType()
 * @model
 * @generated
 */
public enum DbType implements Enumerator {
	/**
	 * The '<em><b>Oracle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(0, "Oracle", "ORACLE"),

	/**
	 * The '<em><b>My Sql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(1, "MySql", "MYSQL"),

	/**
	 * The '<em><b>Database Dot Com</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATABASE_DOT_COM_VALUE
	 * @generated
	 * @ordered
	 */
	DATABASE_DOT_COM(2, "DatabaseDotCom", "DATABASE_DOT_COM"),

	/**
	 * The '<em><b>Db2400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2400_VALUE
	 * @generated
	 * @ordered
	 */
	DB2400(3, "Db2400", "DB2_400"),

	/**
	 * The '<em><b>Db2 Express C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB2_EXPRESS_C_VALUE
	 * @generated
	 * @ordered
	 */
	DB2_EXPRESS_C(4, "Db2ExpressC", "DB2_EXPRESS_C"),

	/**
	 * The '<em><b>Derby Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERBY_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	DERBY_CLIENT(5, "DerbyClient", "DERBY_CLIENT"),

	/**
	 * The '<em><b>Derby Embedded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERBY_EMBEDDED_VALUE
	 * @generated
	 * @ordered
	 */
	DERBY_EMBEDDED(6, "DerbyEmbedded", "DERBY_EMBEDDED"),

	/**
	 * The '<em><b>Firebird</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREBIRD_VALUE
	 * @generated
	 * @ordered
	 */
	FIREBIRD(7, "Firebird", "FIREBIRD"),

	/**
	 * The '<em><b>Google App Engine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_APP_ENGINE_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE_APP_ENGINE(8, "GoogleAppEngine", "GOOGLE_APP_ENGINE"),

	/**
	 * The '<em><b>H2 In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2_IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	H2_IN_MEMORY(9, "H2InMemory", "H2_IN_MEMORY"),

	/**
	 * The '<em><b>Hypersonic In Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_IN_MEMORY_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERSONIC_IN_MEMORY(10, "HypersonicInMemory", "HYPERSONIC_IN_MEMORY"),

	/**
	 * The '<em><b>Hypersonic Persistent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_PERSISTENT_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERSONIC_PERSISTENT(11, "HypersonicPersistent", "HYPERSONIC_PERSISTENT"),

	/**
	 * The '<em><b>Ms Sql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MS_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MS_SQL(12, "MsSql", "MSSQL"),

	/**
	 * The '<em><b>Postgres</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRES_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRES(13, "Postgres", "POSTGRES"),

	/**
	 * The '<em><b>Sybase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYBASE_VALUE
	 * @generated
	 * @ordered
	 */
	SYBASE(14, "Sybase", "SYBASE");

	/**
	 * The '<em><b>Oracle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oracle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model name="Oracle" literal="ORACLE"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 0;

	/**
	 * The '<em><b>My Sql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My Sql</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="MySql" literal="MYSQL"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 1;

	/**
	 * The '<em><b>Database Dot Com</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Database Dot Com</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATABASE_DOT_COM
	 * @model name="DatabaseDotCom" literal="DATABASE_DOT_COM"
	 * @generated
	 * @ordered
	 */
	public static final int DATABASE_DOT_COM_VALUE = 2;

	/**
	 * The '<em><b>Db2400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Db2400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DB2400
	 * @model name="Db2400" literal="DB2_400"
	 * @generated
	 * @ordered
	 */
	public static final int DB2400_VALUE = 3;

	/**
	 * The '<em><b>Db2 Express C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Db2 Express C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DB2_EXPRESS_C
	 * @model name="Db2ExpressC" literal="DB2_EXPRESS_C"
	 * @generated
	 * @ordered
	 */
	public static final int DB2_EXPRESS_C_VALUE = 4;

	/**
	 * The '<em><b>Derby Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derby Client</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERBY_CLIENT
	 * @model name="DerbyClient" literal="DERBY_CLIENT"
	 * @generated
	 * @ordered
	 */
	public static final int DERBY_CLIENT_VALUE = 5;

	/**
	 * The '<em><b>Derby Embedded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derby Embedded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERBY_EMBEDDED
	 * @model name="DerbyEmbedded" literal="DERBY_EMBEDDED"
	 * @generated
	 * @ordered
	 */
	public static final int DERBY_EMBEDDED_VALUE = 6;

	/**
	 * The '<em><b>Firebird</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Firebird</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIREBIRD
	 * @model name="Firebird" literal="FIREBIRD"
	 * @generated
	 * @ordered
	 */
	public static final int FIREBIRD_VALUE = 7;

	/**
	 * The '<em><b>Google App Engine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Google App Engine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_APP_ENGINE
	 * @model name="GoogleAppEngine" literal="GOOGLE_APP_ENGINE"
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_APP_ENGINE_VALUE = 8;

	/**
	 * The '<em><b>H2 In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>H2 In Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #H2_IN_MEMORY
	 * @model name="H2InMemory" literal="H2_IN_MEMORY"
	 * @generated
	 * @ordered
	 */
	public static final int H2_IN_MEMORY_VALUE = 9;

	/**
	 * The '<em><b>Hypersonic In Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hypersonic In Memory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_IN_MEMORY
	 * @model name="HypersonicInMemory" literal="HYPERSONIC_IN_MEMORY"
	 * @generated
	 * @ordered
	 */
	public static final int HYPERSONIC_IN_MEMORY_VALUE = 10;

	/**
	 * The '<em><b>Hypersonic Persistent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hypersonic Persistent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYPERSONIC_PERSISTENT
	 * @model name="HypersonicPersistent" literal="HYPERSONIC_PERSISTENT"
	 * @generated
	 * @ordered
	 */
	public static final int HYPERSONIC_PERSISTENT_VALUE = 11;

	/**
	 * The '<em><b>Ms Sql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ms Sql</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MS_SQL
	 * @model name="MsSql" literal="MSSQL"
	 * @generated
	 * @ordered
	 */
	public static final int MS_SQL_VALUE = 12;

	/**
	 * The '<em><b>Postgres</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Postgres</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTGRES
	 * @model name="Postgres" literal="POSTGRES"
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRES_VALUE = 13;

	/**
	 * The '<em><b>Sybase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sybase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYBASE
	 * @model name="Sybase" literal="SYBASE"
	 * @generated
	 * @ordered
	 */
	public static final int SYBASE_VALUE = 14;

	/**
	 * An array of all the '<em><b>Db Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DbType[] VALUES_ARRAY =
		new DbType[] {
			ORACLE,
			MY_SQL,
			DATABASE_DOT_COM,
			DB2400,
			DB2_EXPRESS_C,
			DERBY_CLIENT,
			DERBY_EMBEDDED,
			FIREBIRD,
			GOOGLE_APP_ENGINE,
			H2_IN_MEMORY,
			HYPERSONIC_IN_MEMORY,
			HYPERSONIC_PERSISTENT,
			MS_SQL,
			POSTGRES,
			SYBASE,
		};

	/**
	 * A public read-only list of all the '<em><b>Db Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DbType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Db Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Db Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Db Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbType get(int value) {
		switch (value) {
			case ORACLE_VALUE: return ORACLE;
			case MY_SQL_VALUE: return MY_SQL;
			case DATABASE_DOT_COM_VALUE: return DATABASE_DOT_COM;
			case DB2400_VALUE: return DB2400;
			case DB2_EXPRESS_C_VALUE: return DB2_EXPRESS_C;
			case DERBY_CLIENT_VALUE: return DERBY_CLIENT;
			case DERBY_EMBEDDED_VALUE: return DERBY_EMBEDDED;
			case FIREBIRD_VALUE: return FIREBIRD;
			case GOOGLE_APP_ENGINE_VALUE: return GOOGLE_APP_ENGINE;
			case H2_IN_MEMORY_VALUE: return H2_IN_MEMORY;
			case HYPERSONIC_IN_MEMORY_VALUE: return HYPERSONIC_IN_MEMORY;
			case HYPERSONIC_PERSISTENT_VALUE: return HYPERSONIC_PERSISTENT;
			case MS_SQL_VALUE: return MS_SQL;
			case POSTGRES_VALUE: return POSTGRES;
			case SYBASE_VALUE: return SYBASE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DbType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DbType
