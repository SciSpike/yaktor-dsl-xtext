/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.IntegerField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link io.yaktor.domain.IntegerField#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link io.yaktor.domain.IntegerField#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getIntegerField()
 * @model
 * @generated
 */
public interface IntegerField extends SimpleField {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see io.yaktor.domain.DomainPackage#getIntegerField_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.IntegerField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see io.yaktor.domain.DomainPackage#getIntegerField_MinValue()
	 * @model
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.IntegerField#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see io.yaktor.domain.DomainPackage#getIntegerField_MaxValue()
	 * @model
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.IntegerField#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

} // IntegerField
