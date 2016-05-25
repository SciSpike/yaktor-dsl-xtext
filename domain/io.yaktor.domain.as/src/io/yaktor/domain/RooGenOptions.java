/**
 */
package io.yaktor.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roo Gen Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.RooGenOptions#getProject <em>Project</em>}</li>
 *   <li>{@link io.yaktor.domain.RooGenOptions#getPersistence <em>Persistence</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getRooGenOptions()
 * @model
 * @generated
 */
public interface RooGenOptions extends GenOptions {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(ProjectOptions)
	 * @see io.yaktor.domain.DomainPackage#getRooGenOptions_Project()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProjectOptions getProject();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.RooGenOptions#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(ProjectOptions value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' containment reference.
	 * @see #setPersistence(PersistenceOptions)
	 * @see io.yaktor.domain.DomainPackage#getRooGenOptions_Persistence()
	 * @model containment="true"
	 * @generated
	 */
	PersistenceOptions getPersistence();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.RooGenOptions#getPersistence <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' containment reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(PersistenceOptions value);

} // RooGenOptions
