/**
 */
package io.yaktor.mongoNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.yaktor.mongoNode.MongoNodeFactory
 * @model kind="package"
 * @generated
 */
public interface MongoNodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mongoNode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Xtext/io.yaktor.domain.mongoNode";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mongoNode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MongoNodePackage eINSTANCE = io.yaktor.mongoNode.impl.MongoNodePackageImpl.init();

	/**
	 * The meta object id for the '{@link io.yaktor.mongoNode.impl.TtlImpl <em>Ttl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.mongoNode.impl.TtlImpl
	 * @see io.yaktor.mongoNode.impl.MongoNodePackageImpl#getTtl()
	 * @generated
	 */
	int TTL = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTL__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Expire After Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTL__EXPIRE_AFTER_SECONDS = 1;

	/**
	 * The number of structural features of the '<em>Ttl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ttl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link io.yaktor.mongoNode.Ttl <em>Ttl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ttl</em>'.
	 * @see io.yaktor.mongoNode.Ttl
	 * @generated
	 */
	EClass getTtl();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.mongoNode.Ttl#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see io.yaktor.mongoNode.Ttl#getField()
	 * @see #getTtl()
	 * @generated
	 */
	EReference getTtl_Field();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.mongoNode.Ttl#getExpireAfterSeconds <em>Expire After Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire After Seconds</em>'.
	 * @see io.yaktor.mongoNode.Ttl#getExpireAfterSeconds()
	 * @see #getTtl()
	 * @generated
	 */
	EAttribute getTtl_ExpireAfterSeconds();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MongoNodeFactory getMongoNodeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.yaktor.mongoNode.impl.TtlImpl <em>Ttl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.mongoNode.impl.TtlImpl
		 * @see io.yaktor.mongoNode.impl.MongoNodePackageImpl#getTtl()
		 * @generated
		 */
		EClass TTL = eINSTANCE.getTtl();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTL__FIELD = eINSTANCE.getTtl_Field();

		/**
		 * The meta object literal for the '<em><b>Expire After Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTL__EXPIRE_AFTER_SECONDS = eINSTANCE.getTtl_ExpireAfterSeconds();

	}

} //MongoNodePackage
