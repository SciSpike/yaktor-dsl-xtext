/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.EnumField#getIsType <em>Is Type</em>}</li>
 *   <li>{@link io.yaktor.domain.EnumField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link io.yaktor.domain.EnumField#getIsJpaEnumType <em>Is Jpa Enum Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getEnumField()
 * @model
 * @generated
 */
public interface EnumField extends SimpleField {
	/**
	 * Returns the value of the '<em><b>Is Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Type</em>' reference.
	 * @see #setIsType(EnumType)
	 * @see io.yaktor.domain.DomainPackage#getEnumField_IsType()
	 * @model required="true"
	 * @generated
	 */
	EnumType getIsType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.EnumField#getIsType <em>Is Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Type</em>' reference.
	 * @see #getIsType()
	 * @generated
	 */
	void setIsType(EnumType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(EnumValue)
	 * @see io.yaktor.domain.DomainPackage#getEnumField_DefaultValue()
	 * @model
	 * @generated
	 */
	EnumValue getDefaultValue();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.EnumField#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(EnumValue value);

	/**
	 * Returns the value of the '<em><b>Is Jpa Enum Type</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.JpaEnumType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Jpa Enum Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Jpa Enum Type</em>' attribute.
	 * @see io.yaktor.domain.JpaEnumType
	 * @see #setIsJpaEnumType(JpaEnumType)
	 * @see io.yaktor.domain.DomainPackage#getEnumField_IsJpaEnumType()
	 * @model
	 * @generated
	 */
	JpaEnumType getIsJpaEnumType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.EnumField#getIsJpaEnumType <em>Is Jpa Enum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Jpa Enum Type</em>' attribute.
	 * @see io.yaktor.domain.JpaEnumType
	 * @see #getIsJpaEnumType()
	 * @generated
	 */
	void setIsJpaEnumType(JpaEnumType value);

} // EnumField
