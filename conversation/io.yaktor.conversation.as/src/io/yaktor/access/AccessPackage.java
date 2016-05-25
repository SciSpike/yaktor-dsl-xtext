/**
 */
package io.yaktor.access;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see io.yaktor.access.AccessFactory
 * @model kind="package"
 * @generated
 */
public interface AccessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "access";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Xtext/io.yaktor.access";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "access";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccessPackage eINSTANCE = io.yaktor.access.impl.AccessPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.yaktor.access.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.access.impl.ServiceImpl
	 * @see io.yaktor.access.impl.AccessPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__METHODS = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.access.impl.ServiceMethodImpl <em>Service Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.access.impl.ServiceMethodImpl
	 * @see io.yaktor.access.impl.AccessPackageImpl#getServiceMethod()
	 * @generated
	 */
	int SERVICE_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__INPUT_PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Output Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD__OUTPUT_PARAMS = 2;

	/**
	 * The number of structural features of the '<em>Service Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Service Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.access.impl.RestServiceImpl <em>Rest Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.access.impl.RestServiceImpl
	 * @see io.yaktor.access.impl.AccessPackageImpl#getRestService()
	 * @generated
	 */
	int REST_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__REF_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__URL = 1;

	/**
	 * The feature id for the '<em><b>Supported Document Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__SUPPORTED_DOCUMENT_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Fronted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE__FRONTED_BY = 3;

	/**
	 * The feature id for the '<em><b>Access Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REST_SERVICE__ACCESS_GROUPS = 4;

  /**
	 * The feature id for the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int REST_SERVICE__SERVER = 5;

  /**
	 * The number of structural features of the '<em>Rest Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rest Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.access.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.access.impl.ViewImpl
	 * @see io.yaktor.access.impl.AccessPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__URL = 0;

	/**
	 * The feature id for the '<em><b>Backed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__BACKED_BY = 1;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.access.impl.AccessGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see io.yaktor.access.impl.AccessGroupImpl
	 * @see io.yaktor.access.impl.AccessPackageImpl#getAccessGroup()
	 * @generated
	 */
  int ACCESS_GROUP = 4;

  /**
	 * The feature id for the '<em><b>Access Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACCESS_GROUP__ACCESS_REQUIREMENT = 0;

  /**
	 * The feature id for the '<em><b>Access Methods</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACCESS_GROUP__ACCESS_METHODS = 1;

  /**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACCESS_GROUP_FEATURE_COUNT = 2;

  /**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ACCESS_GROUP_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link io.yaktor.access.RestDocumentType <em>Rest Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.access.RestDocumentType
	 * @see io.yaktor.access.impl.AccessPackageImpl#getRestDocumentType()
	 * @generated
	 */
	int REST_DOCUMENT_TYPE = 5;

	/**
	 * The meta object id for the '{@link io.yaktor.access.RestAccess <em>Rest Access</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.access.RestAccess
	 * @see io.yaktor.access.impl.AccessPackageImpl#getRestAccess()
	 * @generated
	 */
	int REST_ACCESS = 6;


	/**
	 * The meta object id for the '{@link io.yaktor.access.AccessRequirement <em>Requirement</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see io.yaktor.access.AccessRequirement
	 * @see io.yaktor.access.impl.AccessPackageImpl#getAccessRequirement()
	 * @generated
	 */
  int ACCESS_REQUIREMENT = 7;


  /**
	 * Returns the meta object for class '{@link io.yaktor.access.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see io.yaktor.access.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.access.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.access.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.access.Service#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see io.yaktor.access.Service#getMethods()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Methods();

	/**
	 * Returns the meta object for class '{@link io.yaktor.access.ServiceMethod <em>Service Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Method</em>'.
	 * @see io.yaktor.access.ServiceMethod
	 * @generated
	 */
	EClass getServiceMethod();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.access.ServiceMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.access.ServiceMethod#getName()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EAttribute getServiceMethod_Name();

	/**
	 * Returns the meta object for the reference list '{@link io.yaktor.access.ServiceMethod#getInputParams <em>Input Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Params</em>'.
	 * @see io.yaktor.access.ServiceMethod#getInputParams()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EReference getServiceMethod_InputParams();

	/**
	 * Returns the meta object for the reference list '{@link io.yaktor.access.ServiceMethod#getOutputParams <em>Output Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Params</em>'.
	 * @see io.yaktor.access.ServiceMethod#getOutputParams()
	 * @see #getServiceMethod()
	 * @generated
	 */
	EReference getServiceMethod_OutputParams();

	/**
	 * Returns the meta object for class '{@link io.yaktor.access.RestService <em>Rest Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Service</em>'.
	 * @see io.yaktor.access.RestService
	 * @generated
	 */
	EClass getRestService();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.access.RestService#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Type</em>'.
	 * @see io.yaktor.access.RestService#getRefType()
	 * @see #getRestService()
	 * @generated
	 */
	EReference getRestService_RefType();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.access.RestService#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see io.yaktor.access.RestService#getUrl()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_Url();

	/**
	 * Returns the meta object for the attribute list '{@link io.yaktor.access.RestService#getSupportedDocumentTypes <em>Supported Document Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Document Types</em>'.
	 * @see io.yaktor.access.RestService#getSupportedDocumentTypes()
	 * @see #getRestService()
	 * @generated
	 */
	EAttribute getRestService_SupportedDocumentTypes();

	/**
	 * Returns the meta object for the reference list '{@link io.yaktor.access.RestService#getFrontedBy <em>Fronted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fronted By</em>'.
	 * @see io.yaktor.access.RestService#getFrontedBy()
	 * @see #getRestService()
	 * @generated
	 */
	EReference getRestService_FrontedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.access.RestService#getAccessGroups <em>Access Groups</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Groups</em>'.
	 * @see io.yaktor.access.RestService#getAccessGroups()
	 * @see #getRestService()
	 * @generated
	 */
  EReference getRestService_AccessGroups();

  /**
	 * Returns the meta object for the attribute '{@link io.yaktor.access.RestService#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server</em>'.
	 * @see io.yaktor.access.RestService#getServer()
	 * @see #getRestService()
	 * @generated
	 */
  EAttribute getRestService_Server();

  /**
	 * Returns the meta object for class '{@link io.yaktor.access.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see io.yaktor.access.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.access.View#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see io.yaktor.access.View#getUrl()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Url();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.access.View#getBackedBy <em>Backed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Backed By</em>'.
	 * @see io.yaktor.access.View#getBackedBy()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_BackedBy();

	/**
	 * Returns the meta object for class '{@link io.yaktor.access.AccessGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see io.yaktor.access.AccessGroup
	 * @generated
	 */
  EClass getAccessGroup();

  /**
	 * Returns the meta object for the attribute '{@link io.yaktor.access.AccessGroup#getAccessRequirement <em>Access Requirement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Requirement</em>'.
	 * @see io.yaktor.access.AccessGroup#getAccessRequirement()
	 * @see #getAccessGroup()
	 * @generated
	 */
  EAttribute getAccessGroup_AccessRequirement();

  /**
	 * Returns the meta object for the attribute list '{@link io.yaktor.access.AccessGroup#getAccessMethods <em>Access Methods</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Methods</em>'.
	 * @see io.yaktor.access.AccessGroup#getAccessMethods()
	 * @see #getAccessGroup()
	 * @generated
	 */
  EAttribute getAccessGroup_AccessMethods();

  /**
	 * Returns the meta object for enum '{@link io.yaktor.access.RestDocumentType <em>Rest Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rest Document Type</em>'.
	 * @see io.yaktor.access.RestDocumentType
	 * @generated
	 */
	EEnum getRestDocumentType();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.access.RestAccess <em>Rest Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rest Access</em>'.
	 * @see io.yaktor.access.RestAccess
	 * @generated
	 */
	EEnum getRestAccess();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.access.AccessRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Requirement</em>'.
	 * @see io.yaktor.access.AccessRequirement
	 * @generated
	 */
  EEnum getAccessRequirement();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccessFactory getAccessFactory();

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
		 * The meta object literal for the '{@link io.yaktor.access.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.access.impl.ServiceImpl
		 * @see io.yaktor.access.impl.AccessPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__METHODS = eINSTANCE.getService_Methods();

		/**
		 * The meta object literal for the '{@link io.yaktor.access.impl.ServiceMethodImpl <em>Service Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.access.impl.ServiceMethodImpl
		 * @see io.yaktor.access.impl.AccessPackageImpl#getServiceMethod()
		 * @generated
		 */
		EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_METHOD__NAME = eINSTANCE.getServiceMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Input Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METHOD__INPUT_PARAMS = eINSTANCE.getServiceMethod_InputParams();

		/**
		 * The meta object literal for the '<em><b>Output Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_METHOD__OUTPUT_PARAMS = eINSTANCE.getServiceMethod_OutputParams();

		/**
		 * The meta object literal for the '{@link io.yaktor.access.impl.RestServiceImpl <em>Rest Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.access.impl.RestServiceImpl
		 * @see io.yaktor.access.impl.AccessPackageImpl#getRestService()
		 * @generated
		 */
		EClass REST_SERVICE = eINSTANCE.getRestService();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__REF_TYPE = eINSTANCE.getRestService_RefType();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__URL = eINSTANCE.getRestService_Url();

		/**
		 * The meta object literal for the '<em><b>Supported Document Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_SERVICE__SUPPORTED_DOCUMENT_TYPES = eINSTANCE.getRestService_SupportedDocumentTypes();

		/**
		 * The meta object literal for the '<em><b>Fronted By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_SERVICE__FRONTED_BY = eINSTANCE.getRestService_FrontedBy();

		/**
		 * The meta object literal for the '<em><b>Access Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference REST_SERVICE__ACCESS_GROUPS = eINSTANCE.getRestService_AccessGroups();

    /**
		 * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute REST_SERVICE__SERVER = eINSTANCE.getRestService_Server();

    /**
		 * The meta object literal for the '{@link io.yaktor.access.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.access.impl.ViewImpl
		 * @see io.yaktor.access.impl.AccessPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__URL = eINSTANCE.getView_Url();

		/**
		 * The meta object literal for the '<em><b>Backed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__BACKED_BY = eINSTANCE.getView_BackedBy();

		/**
		 * The meta object literal for the '{@link io.yaktor.access.impl.AccessGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see io.yaktor.access.impl.AccessGroupImpl
		 * @see io.yaktor.access.impl.AccessPackageImpl#getAccessGroup()
		 * @generated
		 */
    EClass ACCESS_GROUP = eINSTANCE.getAccessGroup();

    /**
		 * The meta object literal for the '<em><b>Access Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACCESS_GROUP__ACCESS_REQUIREMENT = eINSTANCE.getAccessGroup_AccessRequirement();

    /**
		 * The meta object literal for the '<em><b>Access Methods</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ACCESS_GROUP__ACCESS_METHODS = eINSTANCE.getAccessGroup_AccessMethods();

    /**
		 * The meta object literal for the '{@link io.yaktor.access.RestDocumentType <em>Rest Document Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.access.RestDocumentType
		 * @see io.yaktor.access.impl.AccessPackageImpl#getRestDocumentType()
		 * @generated
		 */
		EEnum REST_DOCUMENT_TYPE = eINSTANCE.getRestDocumentType();

		/**
		 * The meta object literal for the '{@link io.yaktor.access.RestAccess <em>Rest Access</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.access.RestAccess
		 * @see io.yaktor.access.impl.AccessPackageImpl#getRestAccess()
		 * @generated
		 */
		EEnum REST_ACCESS = eINSTANCE.getRestAccess();

    /**
		 * The meta object literal for the '{@link io.yaktor.access.AccessRequirement <em>Requirement</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see io.yaktor.access.AccessRequirement
		 * @see io.yaktor.access.impl.AccessPackageImpl#getAccessRequirement()
		 * @generated
		 */
    EEnum ACCESS_REQUIREMENT = eINSTANCE.getAccessRequirement();

	}

} //AccessPackage
