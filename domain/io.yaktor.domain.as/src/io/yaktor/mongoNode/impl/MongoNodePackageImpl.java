/**
 */
package io.yaktor.mongoNode.impl;

import io.yaktor.domain.DomainPackage;

import io.yaktor.domain.impl.DomainPackageImpl;

import io.yaktor.mongoNode.MongoNodeFactory;
import io.yaktor.mongoNode.MongoNodePackage;
import io.yaktor.mongoNode.Ttl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MongoNodePackageImpl extends EPackageImpl implements MongoNodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttlEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see io.yaktor.mongoNode.MongoNodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MongoNodePackageImpl() {
		super(eNS_URI, MongoNodeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MongoNodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MongoNodePackage init() {
		if (isInited) return (MongoNodePackage)EPackage.Registry.INSTANCE.getEPackage(MongoNodePackage.eNS_URI);

		// Obtain or create and register package
		MongoNodePackageImpl theMongoNodePackage = (MongoNodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MongoNodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MongoNodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theMongoNodePackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theMongoNodePackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMongoNodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MongoNodePackage.eNS_URI, theMongoNodePackage);
		return theMongoNodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTtl() {
		return ttlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTtl_Field() {
		return (EReference)ttlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTtl_ExpireAfterSeconds() {
		return (EAttribute)ttlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongoNodeFactory getMongoNodeFactory() {
		return (MongoNodeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ttlEClass = createEClass(TTL);
		createEReference(ttlEClass, TTL__FIELD);
		createEAttribute(ttlEClass, TTL__EXPIRE_AFTER_SECONDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(ttlEClass, Ttl.class, "Ttl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTtl_Field(), theDomainPackage.getDateField(), null, "field", null, 0, 1, Ttl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtl_ExpireAfterSeconds(), ecorePackage.getEInt(), "expireAfterSeconds", null, 0, 1, Ttl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MongoNodePackageImpl
