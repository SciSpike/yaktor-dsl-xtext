/**
 */
package io.yaktor.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.types.MappedField#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.types.TypesPackage#getMappedField()
 * @model
 * @generated
 */
public interface MappedField extends ProjectionField {
	/**
	 * Returns the value of the '<em><b>Projection</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.types.Projection#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' containment reference.
	 * @see #setProjection(Projection)
	 * @see io.yaktor.types.TypesPackage#getMappedField_Projection()
	 * @see io.yaktor.types.Projection#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	Projection getProjection();

	/**
	 * Sets the value of the '{@link io.yaktor.types.MappedField#getProjection <em>Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' containment reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Projection value);

} // MappedField
