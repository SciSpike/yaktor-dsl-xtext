/**
 */
package io.yaktor.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Db Provider</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.yaktor.domain.DomainPackage#getDbProvider()
 * @model
 * @generated
 */
public enum DbProvider implements Enumerator {
	/**
	 * The '<em><b>Hibernate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIBERNATE_VALUE
	 * @generated
	 * @ordered
	 */
	HIBERNATE(0, "Hibernate", "HIBERNATE"),

	/**
	 * The '<em><b>Data Nucleus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_NUCLEUS_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_NUCLEUS(1, "DataNucleus", "DATANUCLEUS"),

	/**
	 * The '<em><b>Eclipse Link</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECLIPSE_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	ECLIPSE_LINK(2, "EclipseLink", "ECLIPSELINK"),

	/**
	 * The '<em><b>Open JPA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_JPA_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_JPA(3, "OpenJPA", "OPENJPA");

	/**
	 * The '<em><b>Hibernate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hibernate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIBERNATE
	 * @model name="Hibernate" literal="HIBERNATE"
	 * @generated
	 * @ordered
	 */
	public static final int HIBERNATE_VALUE = 0;

	/**
	 * The '<em><b>Data Nucleus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data Nucleus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_NUCLEUS
	 * @model name="DataNucleus" literal="DATANUCLEUS"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_NUCLEUS_VALUE = 1;

	/**
	 * The '<em><b>Eclipse Link</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eclipse Link</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECLIPSE_LINK
	 * @model name="EclipseLink" literal="ECLIPSELINK"
	 * @generated
	 * @ordered
	 */
	public static final int ECLIPSE_LINK_VALUE = 2;

	/**
	 * The '<em><b>Open JPA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open JPA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_JPA
	 * @model name="OpenJPA" literal="OPENJPA"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_JPA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Db Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DbProvider[] VALUES_ARRAY =
		new DbProvider[] {
			HIBERNATE,
			DATA_NUCLEUS,
			ECLIPSE_LINK,
			OPEN_JPA,
		};

	/**
	 * A public read-only list of all the '<em><b>Db Provider</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DbProvider> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Db Provider</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbProvider get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbProvider result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Db Provider</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbProvider getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DbProvider result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Db Provider</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DbProvider get(int value) {
		switch (value) {
			case HIBERNATE_VALUE: return HIBERNATE;
			case DATA_NUCLEUS_VALUE: return DATA_NUCLEUS;
			case ECLIPSE_LINK_VALUE: return ECLIPSE_LINK;
			case OPEN_JPA_VALUE: return OPEN_JPA;
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
	private DbProvider(int value, String name, String literal) {
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
	
} //DbProvider
