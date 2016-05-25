/**
 */
package io.yaktor.mongoNode;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.yaktor.mongoNode.MongoNodePackage
 * @generated
 */
public interface MongoNodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MongoNodeFactory eINSTANCE = io.yaktor.mongoNode.impl.MongoNodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ttl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ttl</em>'.
	 * @generated
	 */
	Ttl createTtl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MongoNodePackage getMongoNodePackage();

} //MongoNodeFactory
