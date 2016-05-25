/**
 */
package io.yaktor.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.ProjectOptions#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.domain.ProjectOptions#getRootPackage <em>Root Package</em>}</li>
 *   <li>{@link io.yaktor.domain.ProjectOptions#getDomainSubpackage <em>Domain Subpackage</em>}</li>
 *   <li>{@link io.yaktor.domain.ProjectOptions#isJsonSupport <em>Json Support</em>}</li>
 *   <li>{@link io.yaktor.domain.ProjectOptions#getControllerSubpackage <em>Controller Subpackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getProjectOptions()
 * @model
 * @generated
 */
public interface ProjectOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.yaktor.domain.DomainPackage#getProjectOptions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.ProjectOptions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Root Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Package</em>' attribute.
	 * @see #setRootPackage(String)
	 * @see io.yaktor.domain.DomainPackage#getProjectOptions_RootPackage()
	 * @model
	 * @generated
	 */
	String getRootPackage();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.ProjectOptions#getRootPackage <em>Root Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Package</em>' attribute.
	 * @see #getRootPackage()
	 * @generated
	 */
	void setRootPackage(String value);

	/**
	 * Returns the value of the '<em><b>Domain Subpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Subpackage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Subpackage</em>' attribute.
	 * @see #setDomainSubpackage(String)
	 * @see io.yaktor.domain.DomainPackage#getProjectOptions_DomainSubpackage()
	 * @model
	 * @generated
	 */
	String getDomainSubpackage();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.ProjectOptions#getDomainSubpackage <em>Domain Subpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Subpackage</em>' attribute.
	 * @see #getDomainSubpackage()
	 * @generated
	 */
	void setDomainSubpackage(String value);

	/**
	 * Returns the value of the '<em><b>Json Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Support</em>' attribute.
	 * @see #setJsonSupport(boolean)
	 * @see io.yaktor.domain.DomainPackage#getProjectOptions_JsonSupport()
	 * @model
	 * @generated
	 */
	boolean isJsonSupport();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.ProjectOptions#isJsonSupport <em>Json Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Support</em>' attribute.
	 * @see #isJsonSupport()
	 * @generated
	 */
	void setJsonSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Controller Subpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Subpackage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Subpackage</em>' attribute.
	 * @see #setControllerSubpackage(String)
	 * @see io.yaktor.domain.DomainPackage#getProjectOptions_ControllerSubpackage()
	 * @model
	 * @generated
	 */
	String getControllerSubpackage();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.ProjectOptions#getControllerSubpackage <em>Controller Subpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Subpackage</em>' attribute.
	 * @see #getControllerSubpackage()
	 * @generated
	 */
	void setControllerSubpackage(String value);

} // ProjectOptions
