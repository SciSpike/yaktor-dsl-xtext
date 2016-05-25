/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Reference Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.EntityReferenceField#getRefType <em>Ref Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getEntityReferenceField()
 * @model
 * @generated
 */
public interface EntityReferenceField extends SimpleField, ComplexTypeField {
	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' reference.
	 * @see #setRefType(Entity)
	 * @see io.yaktor.domain.DomainPackage#getEntityReferenceField_RefType()
	 * @model required="true"
	 * @generated
	 */
	Entity getRefType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.EntityReferenceField#getRefType <em>Ref Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(Entity value);

} // EntityReferenceField
