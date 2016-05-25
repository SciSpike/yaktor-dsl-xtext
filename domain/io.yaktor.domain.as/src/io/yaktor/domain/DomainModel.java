/**
 */
package io.yaktor.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.DomainModel#getTypes <em>Types</em>}</li>
 *   <li>{@link io.yaktor.domain.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.domain.DomainModel#getGenOptions <em>Gen Options</em>}</li>
 *   <li>{@link io.yaktor.domain.DomainModel#getDomainModelImports <em>Domain Model Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getDomainModel()
 * @model
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.NamedType}.
	 * It is bidirectional and its opposite is '{@link io.yaktor.domain.NamedType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getDomainModel_Types()
	 * @see io.yaktor.domain.NamedType#getModel
	 * @model opposite="model" containment="true"
	 * @generated
	 */
	EList<NamedType> getTypes();

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
	 * @see io.yaktor.domain.DomainPackage#getDomainModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DomainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gen Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Options</em>' containment reference.
	 * @see #setGenOptions(GenOptions)
	 * @see io.yaktor.domain.DomainPackage#getDomainModel_GenOptions()
	 * @model containment="true"
	 * @generated
	 */
	GenOptions getGenOptions();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.DomainModel#getGenOptions <em>Gen Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Options</em>' containment reference.
	 * @see #getGenOptions()
	 * @generated
	 */
	void setGenOptions(GenOptions value);

	/**
	 * Returns the value of the '<em><b>Domain Model Imports</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.DomainModelImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model Imports</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getDomainModel_DomainModelImports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainModelImport> getDomainModelImports();

} // DomainModel
