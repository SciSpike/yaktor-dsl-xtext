/**
 */
package io.yaktor.conversation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Machine Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.yaktor.conversation.ConversationPackage#getStateMachineType()
 * @model
 * @generated
 */
public enum StateMachineType implements Enumerator {
	/**
	 * The '<em><b>Finite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINITE_VALUE
	 * @generated
	 * @ordered
	 */
	FINITE(0, "finite", "finite"),

	/**
	 * The '<em><b>Infinite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE_VALUE
	 * @generated
	 * @ordered
	 */
	INFINITE(1, "infinite", "infinite"),

	/**
	 * The '<em><b>Stateless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATELESS_VALUE
	 * @generated
	 * @ordered
	 */
	STATELESS(2, "stateless", "stateless");

	/**
	 * The '<em><b>Finite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINITE
	 * @model name="finite"
	 * @generated
	 * @ordered
	 */
	public static final int FINITE_VALUE = 0;

	/**
	 * The '<em><b>Infinite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infinite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFINITE
	 * @model name="infinite"
	 * @generated
	 * @ordered
	 */
	public static final int INFINITE_VALUE = 1;

	/**
	 * The '<em><b>Stateless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stateless</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATELESS
	 * @model name="stateless"
	 * @generated
	 * @ordered
	 */
	public static final int STATELESS_VALUE = 2;

	/**
	 * An array of all the '<em><b>State Machine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateMachineType[] VALUES_ARRAY =
		new StateMachineType[] {
			FINITE,
			INFINITE,
			STATELESS,
		};

	/**
	 * A public read-only list of all the '<em><b>State Machine Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateMachineType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Machine Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateMachineType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Machine Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateMachineType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Machine Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineType get(int value) {
		switch (value) {
			case FINITE_VALUE: return FINITE;
			case INFINITE_VALUE: return INFINITE;
			case STATELESS_VALUE: return STATELESS;
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
	private StateMachineType(int value, String name, String literal) {
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
	
} //StateMachineType
