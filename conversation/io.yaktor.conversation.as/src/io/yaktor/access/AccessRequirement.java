/**
 */
package io.yaktor.access;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Requirement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.yaktor.access.AccessPackage#getAccessRequirement()
 * @model
 * @generated
 */
public enum AccessRequirement implements Enumerator {
  /**
	 * The '<em><b>ANONYMOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ANONYMOUS_VALUE
	 * @generated
	 * @ordered
	 */
  ANONYMOUS(0, "ANONYMOUS", "ANONYMOUS"),

  /**
	 * The '<em><b>AUTHENTICATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #AUTHENTICATED_VALUE
	 * @generated
	 * @ordered
	 */
  AUTHENTICATED(1, "AUTHENTICATED", "AUTHENTICATED"),

  /**
	 * The '<em><b>AUTHORIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #AUTHORIZED_VALUE
	 * @generated
	 * @ordered
	 */
  AUTHORIZED(2, "AUTHORIZED", "AUTHORIZED"), /**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
  DEFAULT(3, "DEFAULT", "DEFAULT");

  /**
	 * The '<em><b>ANONYMOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANONYMOUS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ANONYMOUS
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int ANONYMOUS_VALUE = 0;

  /**
	 * The '<em><b>AUTHENTICATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUTHENTICATED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #AUTHENTICATED
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int AUTHENTICATED_VALUE = 1;

  /**
	 * The '<em><b>AUTHORIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AUTHORIZED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #AUTHORIZED
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int AUTHORIZED_VALUE = 2;

  /**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
  public static final int DEFAULT_VALUE = 3;

  /**
	 * An array of all the '<em><b>Requirement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final AccessRequirement[] VALUES_ARRAY =
    new AccessRequirement[] {
			ANONYMOUS,
			AUTHENTICATED,
			AUTHORIZED,
			DEFAULT,
		};

  /**
	 * A public read-only list of all the '<em><b>Requirement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<AccessRequirement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Requirement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AccessRequirement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessRequirement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Requirement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AccessRequirement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessRequirement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Requirement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AccessRequirement get(int value) {
		switch (value) {
			case ANONYMOUS_VALUE: return ANONYMOUS;
			case AUTHENTICATED_VALUE: return AUTHENTICATED;
			case AUTHORIZED_VALUE: return AUTHORIZED;
			case DEFAULT_VALUE: return DEFAULT;
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
  private AccessRequirement(int value, String name, String literal) {
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
  
} //AccessRequirement
