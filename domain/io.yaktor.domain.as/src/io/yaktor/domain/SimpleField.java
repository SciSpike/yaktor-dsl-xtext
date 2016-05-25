/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.SimpleField#isUnique <em>Unique</em>}</li>
 *   <li>{@link io.yaktor.domain.SimpleField#isIndexed <em>Indexed</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getSimpleField()
 * @model abstract="true"
 * @generated
 */
public interface SimpleField extends ConstraintTypeField {
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
	 * @see io.yaktor.domain.DomainPackage#getSimpleField_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.SimpleField#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed</em>' attribute.
	 * @see #setIndexed(boolean)
	 * @see io.yaktor.domain.DomainPackage#getSimpleField_Indexed()
	 * @model
	 * @generated
	 */
	boolean isIndexed();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.SimpleField#isIndexed <em>Indexed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed</em>' attribute.
	 * @see #isIndexed()
	 * @generated
	 */
	void setIndexed(boolean value);

} // SimpleField
