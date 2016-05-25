/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.DateField#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link io.yaktor.domain.DateField#getBefore <em>Before</em>}</li>
 *   <li>{@link io.yaktor.domain.DateField#getAfter <em>After</em>}</li>
 *   <li>{@link io.yaktor.domain.DateField#isPast <em>Past</em>}</li>
 *   <li>{@link io.yaktor.domain.DateField#isFuture <em>Future</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getDateField()
 * @model
 * @generated
 */
public interface DateField extends SimpleField {
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
	 * @see io.yaktor.domain.DomainPackage#getDateField_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DateField#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' attribute.
	 * @see #setBefore(String)
	 * @see io.yaktor.domain.DomainPackage#getDateField_Before()
	 * @model
	 * @generated
	 */
	String getBefore();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DateField#getBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(String value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' attribute.
	 * @see #setAfter(String)
	 * @see io.yaktor.domain.DomainPackage#getDateField_After()
	 * @model
	 * @generated
	 */
	String getAfter();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DateField#getAfter <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' attribute.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(String value);

	/**
	 * Returns the value of the '<em><b>Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Past</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past</em>' attribute.
	 * @see #setPast(boolean)
	 * @see io.yaktor.domain.DomainPackage#getDateField_Past()
	 * @model
	 * @generated
	 */
	boolean isPast();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DateField#isPast <em>Past</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past</em>' attribute.
	 * @see #isPast()
	 * @generated
	 */
	void setPast(boolean value);

	/**
	 * Returns the value of the '<em><b>Future</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Future</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Future</em>' attribute.
	 * @see #setFuture(boolean)
	 * @see io.yaktor.domain.DomainPackage#getDateField_Future()
	 * @model
	 * @generated
	 */
	boolean isFuture();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DateField#isFuture <em>Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Future</em>' attribute.
	 * @see #isFuture()
	 * @generated
	 */
	void setFuture(boolean value);

} // DateField
