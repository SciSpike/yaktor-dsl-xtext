/**
 */
package io.yaktor.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jpa Table Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.JpaTableOptions#getType <em>Type</em>}</li>
 *   <li>{@link io.yaktor.domain.JpaTableOptions#isSingleTableRoot <em>Single Table Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getJpaTableOptions()
 * @model
 * @generated
 */
public interface JpaTableOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TableType)
	 * @see io.yaktor.domain.DomainPackage#getJpaTableOptions_Type()
	 * @model
	 * @generated
	 */
	TableType getType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaTableOptions#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TableType value);

	/**
	 * Returns the value of the '<em><b>Single Table Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Table Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Table Root</em>' attribute.
	 * @see #setSingleTableRoot(boolean)
	 * @see io.yaktor.domain.DomainPackage#getJpaTableOptions_SingleTableRoot()
	 * @model default="false"
	 * @generated
	 */
	boolean isSingleTableRoot();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaTableOptions#isSingleTableRoot <em>Single Table Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Table Root</em>' attribute.
	 * @see #isSingleTableRoot()
	 * @generated
	 */
	void setSingleTableRoot(boolean value);

} // JpaTableOptions
