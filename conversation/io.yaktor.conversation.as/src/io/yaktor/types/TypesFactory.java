/**
 */
package io.yaktor.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.yaktor.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = io.yaktor.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Projection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection Field</em>'.
	 * @generated
	 */
	ProjectionField createProjectionField();

	/**
	 * Returns a new object of class '<em>Mapped Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Field</em>'.
	 * @generated
	 */
	MappedField createMappedField();

	/**
	 * Returns a new object of class '<em>New Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Field</em>'.
	 * @generated
	 */
	NewField createNewField();

	/**
	 * Returns a new object of class '<em>Projection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection</em>'.
	 * @generated
	 */
	Projection createProjection();

	/**
	 * Returns a new object of class '<em>Projection Containment Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Projection Containment Field</em>'.
	 * @generated
	 */
	ProjectionContainmentField createProjectionContainmentField();

	/**
	 * Returns a new object of class '<em>Type Containment Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Containment Field</em>'.
	 * @generated
	 */
	TypeContainmentField createTypeContainmentField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
