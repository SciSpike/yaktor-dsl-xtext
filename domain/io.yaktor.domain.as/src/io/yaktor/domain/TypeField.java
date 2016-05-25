/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.TypeField#getIsType <em>Is Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getTypeField()
 * @model
 * @generated
 */
public interface TypeField extends Field, ComplexTypeField {
	/**
	 * Returns the value of the '<em><b>Is Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Type</em>' reference.
	 * @see #setIsType(Type)
	 * @see io.yaktor.domain.DomainPackage#getTypeField_IsType()
	 * @model required="true"
	 * @generated
	 */
	Type getIsType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.TypeField#getIsType <em>Is Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Type</em>' reference.
	 * @see #getIsType()
	 * @generated
	 */
	void setIsType(Type value);

} // TypeField
