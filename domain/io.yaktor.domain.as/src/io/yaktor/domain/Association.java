/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.Association#getStart <em>Start</em>}</li>
 *   <li>{@link io.yaktor.domain.Association#getEnd <em>End</em>}</li>
 *   <li>{@link io.yaktor.domain.Association#isIsUnidirectional <em>Is Unidirectional</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends NamedType {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(AssociationEnd)
	 * @see io.yaktor.domain.DomainPackage#getAssociation_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssociationEnd getStart();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.Association#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(AssociationEnd value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(AssociationEnd)
	 * @see io.yaktor.domain.DomainPackage#getAssociation_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AssociationEnd getEnd();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.Association#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(AssociationEnd value);

	/**
	 * Returns the value of the '<em><b>Is Unidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unidirectional</em>' attribute.
	 * @see #setIsUnidirectional(boolean)
	 * @see io.yaktor.domain.DomainPackage#getAssociation_IsUnidirectional()
	 * @model
	 * @generated
	 */
	boolean isIsUnidirectional();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.Association#isIsUnidirectional <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unidirectional</em>' attribute.
	 * @see #isIsUnidirectional()
	 * @generated
	 */
	void setIsUnidirectional(boolean value);

} // Association
