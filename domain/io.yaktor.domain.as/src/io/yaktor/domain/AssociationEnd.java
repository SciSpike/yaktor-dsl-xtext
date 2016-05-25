/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.AssociationEnd#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link io.yaktor.domain.AssociationEnd#getReferences <em>References</em>}</li>
 *   <li>{@link io.yaktor.domain.AssociationEnd#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getAssociationEnd()
 * @model
 * @generated
 */
public interface AssociationEnd extends ConstraintTypeField, ComplexTypeField {
	/**
	 * Returns the value of the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composition</em>' attribute.
	 * @see #setIsComposition(boolean)
	 * @see io.yaktor.domain.DomainPackage#getAssociationEnd_IsComposition()
	 * @model
	 * @generated
	 */
	boolean isIsComposition();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.AssociationEnd#isIsComposition <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composition</em>' attribute.
	 * @see #isIsComposition()
	 * @generated
	 */
	void setIsComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Entity)
	 * @see io.yaktor.domain.DomainPackage#getAssociationEnd_References()
	 * @model required="true"
	 * @generated
	 */
	Entity getReferences();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.AssociationEnd#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Entity value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see io.yaktor.domain.DomainPackage#getAssociationEnd_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.AssociationEnd#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // AssociationEnd
