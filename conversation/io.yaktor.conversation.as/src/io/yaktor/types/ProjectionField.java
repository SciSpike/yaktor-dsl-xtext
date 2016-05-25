/**
 */
package io.yaktor.types;

import io.yaktor.domain.Field;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projection Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.types.ProjectionField#getAlias <em>Alias</em>}</li>
 *   <li>{@link io.yaktor.types.ProjectionField#getOldField <em>Old Field</em>}</li>
 *   <li>{@link io.yaktor.types.ProjectionField#getNewField <em>New Field</em>}</li>
 *   <li>{@link io.yaktor.types.ProjectionField#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.types.TypesPackage#getProjectionField()
 * @model
 * @generated
 */
public interface ProjectionField extends EObject {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see io.yaktor.types.TypesPackage#getProjectionField_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link io.yaktor.types.ProjectionField#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Old Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Field</em>' reference.
	 * @see #setOldField(Field)
	 * @see io.yaktor.types.TypesPackage#getProjectionField_OldField()
	 * @model
	 * @generated
	 */
	Field getOldField();

	/**
	 * Sets the value of the '{@link io.yaktor.types.ProjectionField#getOldField <em>Old Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Field</em>' reference.
	 * @see #getOldField()
	 * @generated
	 */
	void setOldField(Field value);

	/**
	 * Returns the value of the '<em><b>New Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Field</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Field</em>' containment reference.
	 * @see #setNewField(Field)
	 * @see io.yaktor.types.TypesPackage#getProjectionField_NewField()
	 * @model containment="true"
	 * @generated
	 */
	Field getNewField();

	/**
	 * Sets the value of the '{@link io.yaktor.types.ProjectionField#getNewField <em>New Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Field</em>' containment reference.
	 * @see #getNewField()
	 * @generated
	 */
	void setNewField(Field value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.types.Projection#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Projection)
	 * @see io.yaktor.types.TypesPackage#getProjectionField_Parent()
	 * @see io.yaktor.types.Projection#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	Projection getParent();

	/**
	 * Sets the value of the '{@link io.yaktor.types.ProjectionField#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Projection value);

} // ProjectionField
