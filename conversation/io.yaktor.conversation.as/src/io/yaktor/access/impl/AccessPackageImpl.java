/**
 */
package io.yaktor.access.impl;

import io.yaktor.access.AccessFactory;
import io.yaktor.access.AccessGroup;
import io.yaktor.access.AccessPackage;
import io.yaktor.access.AccessRequirement;
import io.yaktor.access.RestAccess;
import io.yaktor.access.RestDocumentType;
import io.yaktor.access.RestService;
import io.yaktor.access.Service;
import io.yaktor.access.ServiceMethod;

import io.yaktor.access.View;
import io.yaktor.conversation.ConversationPackage;

import io.yaktor.conversation.impl.ConversationPackageImpl;

import io.yaktor.domain.DomainPackage;

import io.yaktor.mongoNode.MongoNodePackage;
import io.yaktor.types.TypesPackage;

import io.yaktor.types.impl.TypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessPackageImpl extends EPackageImpl implements AccessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass accessGroupEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restDocumentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restAccessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum accessRequirementEEnum = null;

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
	 * @see io.yaktor.access.AccessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccessPackageImpl() {
		super(eNS_URI, AccessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccessPackage init() {
		if (isInited) return (AccessPackage)EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI);

		// Obtain or create and register package
		AccessPackageImpl theAccessPackage = (AccessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AccessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AccessPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DomainPackage.eINSTANCE.eClass();
		MongoNodePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ConversationPackageImpl theConversationPackage = (ConversationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConversationPackage.eNS_URI) instanceof ConversationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConversationPackage.eNS_URI) : ConversationPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theAccessPackage.createPackageContents();
		theConversationPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theAccessPackage.initializePackageContents();
		theConversationPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccessPackage.eNS_URI, theAccessPackage);
		return theAccessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Methods() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceMethod() {
		return serviceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceMethod_Name() {
		return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMethod_InputParams() {
		return (EReference)serviceMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceMethod_OutputParams() {
		return (EReference)serviceMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestService() {
		return restServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestService_RefType() {
		return (EReference)restServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestService_Url() {
		return (EAttribute)restServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestService_SupportedDocumentTypes() {
		return (EAttribute)restServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestService_FrontedBy() {
		return (EReference)restServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRestService_AccessGroups() {
		return (EReference)restServiceEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRestService_Server() {
		return (EAttribute)restServiceEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Url() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_BackedBy() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAccessGroup() {
		return accessGroupEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAccessGroup_AccessRequirement() {
		return (EAttribute)accessGroupEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAccessGroup_AccessMethods() {
		return (EAttribute)accessGroupEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestDocumentType() {
		return restDocumentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestAccess() {
		return restAccessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getAccessRequirement() {
		return accessRequirementEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessFactory getAccessFactory() {
		return (AccessFactory)getEFactoryInstance();
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
		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__METHODS);

		serviceMethodEClass = createEClass(SERVICE_METHOD);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__NAME);
		createEReference(serviceMethodEClass, SERVICE_METHOD__INPUT_PARAMS);
		createEReference(serviceMethodEClass, SERVICE_METHOD__OUTPUT_PARAMS);

		restServiceEClass = createEClass(REST_SERVICE);
		createEReference(restServiceEClass, REST_SERVICE__REF_TYPE);
		createEAttribute(restServiceEClass, REST_SERVICE__URL);
		createEAttribute(restServiceEClass, REST_SERVICE__SUPPORTED_DOCUMENT_TYPES);
		createEReference(restServiceEClass, REST_SERVICE__FRONTED_BY);
		createEReference(restServiceEClass, REST_SERVICE__ACCESS_GROUPS);
		createEAttribute(restServiceEClass, REST_SERVICE__SERVER);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__URL);
		createEReference(viewEClass, VIEW__BACKED_BY);

		accessGroupEClass = createEClass(ACCESS_GROUP);
		createEAttribute(accessGroupEClass, ACCESS_GROUP__ACCESS_REQUIREMENT);
		createEAttribute(accessGroupEClass, ACCESS_GROUP__ACCESS_METHODS);

		// Create enums
		restDocumentTypeEEnum = createEEnum(REST_DOCUMENT_TYPE);
		restAccessEEnum = createEEnum(REST_ACCESS);
		accessRequirementEEnum = createEEnum(ACCESS_REQUIREMENT);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Methods(), this.getServiceMethod(), null, "methods", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMethod_InputParams(), theTypesPackage.getProjection(), null, "inputParams", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceMethod_OutputParams(), theTypesPackage.getProjection(), null, "outputParams", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restServiceEClass, RestService.class, "RestService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestService_RefType(), theTypesPackage.getProjection(), null, "refType", null, 1, 1, RestService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestService_Url(), ecorePackage.getEString(), "url", null, 1, 1, RestService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestService_SupportedDocumentTypes(), this.getRestDocumentType(), "supportedDocumentTypes", "application/json", 0, -1, RestService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestService_FrontedBy(), this.getView(), this.getView_BackedBy(), "frontedBy", null, 0, -1, RestService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRestService_AccessGroups(), this.getAccessGroup(), null, "accessGroups", null, 0, -1, RestService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRestService_Server(), ecorePackage.getEString(), "server", null, 0, 1, RestService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_Url(), ecorePackage.getEString(), "url", null, 1, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_BackedBy(), this.getRestService(), this.getRestService_FrontedBy(), "backedBy", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessGroupEClass, AccessGroup.class, "AccessGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessGroup_AccessRequirement(), this.getAccessRequirement(), "accessRequirement", "DEFAULT", 0, 1, AccessGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessGroup_AccessMethods(), this.getRestAccess(), "accessMethods", null, 1, -1, AccessGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(restDocumentTypeEEnum, RestDocumentType.class, "RestDocumentType");
		addEEnumLiteral(restDocumentTypeEEnum, RestDocumentType.XHTML);
		addEEnumLiteral(restDocumentTypeEEnum, RestDocumentType.JSON);
		addEEnumLiteral(restDocumentTypeEEnum, RestDocumentType.XML);
		addEEnumLiteral(restDocumentTypeEEnum, RestDocumentType.YAML);
		addEEnumLiteral(restDocumentTypeEEnum, RestDocumentType.FORM);
		addEEnumLiteral(restDocumentTypeEEnum, RestDocumentType.UPLOAD);

		initEEnum(restAccessEEnum, RestAccess.class, "RestAccess");
		addEEnumLiteral(restAccessEEnum, RestAccess.GET);
		addEEnumLiteral(restAccessEEnum, RestAccess.PUT);
		addEEnumLiteral(restAccessEEnum, RestAccess.DELETE);
		addEEnumLiteral(restAccessEEnum, RestAccess.FIND);
		addEEnumLiteral(restAccessEEnum, RestAccess.POST);

		initEEnum(accessRequirementEEnum, AccessRequirement.class, "AccessRequirement");
		addEEnumLiteral(accessRequirementEEnum, AccessRequirement.ANONYMOUS);
		addEEnumLiteral(accessRequirementEEnum, AccessRequirement.AUTHENTICATED);
		addEEnumLiteral(accessRequirementEEnum, AccessRequirement.AUTHORIZED);
		addEEnumLiteral(accessRequirementEEnum, AccessRequirement.DEFAULT);

		// Create resource
		createResource(eNS_URI);
	}

} //AccessPackageImpl
