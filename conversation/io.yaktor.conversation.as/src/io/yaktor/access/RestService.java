/**
 */
package io.yaktor.access;

import io.yaktor.types.Projection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.access.RestService#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link io.yaktor.access.RestService#getUrl <em>Url</em>}</li>
 *   <li>{@link io.yaktor.access.RestService#getSupportedDocumentTypes <em>Supported Document Types</em>}</li>
 *   <li>{@link io.yaktor.access.RestService#getFrontedBy <em>Fronted By</em>}</li>
 *   <li>{@link io.yaktor.access.RestService#getAccessGroups <em>Access Groups</em>}</li>
 *   <li>{@link io.yaktor.access.RestService#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.access.AccessPackage#getRestService()
 * @model
 * @generated
 */
public interface RestService extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' reference.
	 * @see #setRefType(Projection)
	 * @see io.yaktor.access.AccessPackage#getRestService_RefType()
	 * @model required="true"
	 * @generated
	 */
	Projection getRefType();

	/**
	 * Sets the value of the '{@link io.yaktor.access.RestService#getRefType <em>Ref Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(Projection value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see io.yaktor.access.AccessPackage#getRestService_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link io.yaktor.access.RestService#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Supported Document Types</b></em>' attribute list.
	 * The list contents are of type {@link io.yaktor.access.RestDocumentType}.
	 * The literals are from the enumeration {@link io.yaktor.access.RestDocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Document Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Document Types</em>' attribute list.
	 * @see io.yaktor.access.RestDocumentType
	 * @see io.yaktor.access.AccessPackage#getRestService_SupportedDocumentTypes()
	 * @model
	 * @generated
	 */
	EList<RestDocumentType> getSupportedDocumentTypes();

	/**
	 * Returns the value of the '<em><b>Fronted By</b></em>' reference list.
	 * The list contents are of type {@link io.yaktor.access.View}.
	 * It is bidirectional and its opposite is '{@link io.yaktor.access.View#getBackedBy <em>Backed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fronted By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fronted By</em>' reference list.
	 * @see io.yaktor.access.AccessPackage#getRestService_FrontedBy()
	 * @see io.yaktor.access.View#getBackedBy
	 * @model opposite="backedBy"
	 * @generated
	 */
	EList<View> getFrontedBy();

  /**
	 * Returns the value of the '<em><b>Access Groups</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.access.AccessGroup}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Groups</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Groups</em>' containment reference list.
	 * @see io.yaktor.access.AccessPackage#getRestService_AccessGroups()
	 * @model containment="true"
	 * @generated
	 */
  EList<AccessGroup> getAccessGroups();

  /**
	 * Returns the value of the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' attribute.
	 * @see #setServer(String)
	 * @see io.yaktor.access.AccessPackage#getRestService_Server()
	 * @model
	 * @generated
	 */
  String getServer();

  /**
	 * Sets the value of the '{@link io.yaktor.access.RestService#getServer <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' attribute.
	 * @see #getServer()
	 * @generated
	 */
  void setServer(String value);

} // RestService
