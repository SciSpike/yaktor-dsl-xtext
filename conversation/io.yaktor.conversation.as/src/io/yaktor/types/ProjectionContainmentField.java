/**
 */
package io.yaktor.types;

import io.yaktor.domain.Cardinality;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection Containment Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.types.ProjectionContainmentField#getProjection <em>Projection</em>}</li>
 *   <li>{@link io.yaktor.types.ProjectionContainmentField#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.types.TypesPackage#getProjectionContainmentField()
 * @model
 * @generated
 */
public interface ProjectionContainmentField extends ProjectionField {

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' reference.
	 * @see #setProjection(Projection)
	 * @see io.yaktor.types.TypesPackage#getProjectionContainmentField_Projection()
	 * @model
	 * @generated
	 */
	Projection getProjection();

	/**
	 * Sets the value of the '{@link io.yaktor.types.ProjectionContainmentField#getProjection <em>Projection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Projection value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"!"</code>.
	 * The literals are from the enumeration {@link io.yaktor.domain.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see io.yaktor.domain.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see io.yaktor.types.TypesPackage#getProjectionContainmentField_Cardinality()
	 * @model default="!"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link io.yaktor.types.ProjectionContainmentField#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see io.yaktor.domain.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);
} // ProjectionContainmentField
