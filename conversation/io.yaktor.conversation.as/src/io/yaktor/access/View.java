/**
 */
package io.yaktor.access;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.access.View#getUrl <em>Url</em>}</li>
 *   <li>{@link io.yaktor.access.View#getBackedBy <em>Backed By</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.access.AccessPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
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
	 * @see io.yaktor.access.AccessPackage#getView_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link io.yaktor.access.View#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Backed By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.access.RestService#getFrontedBy <em>Fronted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backed By</em>' reference.
	 * @see #setBackedBy(RestService)
	 * @see io.yaktor.access.AccessPackage#getView_BackedBy()
	 * @see io.yaktor.access.RestService#getFrontedBy
	 * @model opposite="frontedBy"
	 * @generated
	 */
	RestService getBackedBy();

	/**
	 * Sets the value of the '{@link io.yaktor.access.View#getBackedBy <em>Backed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backed By</em>' reference.
	 * @see #getBackedBy()
	 * @generated
	 */
	void setBackedBy(RestService value);

} // View
