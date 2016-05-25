/**
 */
package io.yaktor.access;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.access.AccessGroup#getAccessRequirement <em>Access Requirement</em>}</li>
 *   <li>{@link io.yaktor.access.AccessGroup#getAccessMethods <em>Access Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.access.AccessPackage#getAccessGroup()
 * @model
 * @generated
 */
public interface AccessGroup extends EObject {
  /**
	 * Returns the value of the '<em><b>Access Requirement</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * The literals are from the enumeration {@link io.yaktor.access.AccessRequirement}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Requirement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Requirement</em>' attribute.
	 * @see io.yaktor.access.AccessRequirement
	 * @see #setAccessRequirement(AccessRequirement)
	 * @see io.yaktor.access.AccessPackage#getAccessGroup_AccessRequirement()
	 * @model default="DEFAULT"
	 * @generated
	 */
  AccessRequirement getAccessRequirement();

  /**
	 * Sets the value of the '{@link io.yaktor.access.AccessGroup#getAccessRequirement <em>Access Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Requirement</em>' attribute.
	 * @see io.yaktor.access.AccessRequirement
	 * @see #getAccessRequirement()
	 * @generated
	 */
  void setAccessRequirement(AccessRequirement value);

  /**
	 * Returns the value of the '<em><b>Access Methods</b></em>' attribute list.
	 * The list contents are of type {@link io.yaktor.access.RestAccess}.
	 * The literals are from the enumeration {@link io.yaktor.access.RestAccess}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Methods</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Methods</em>' attribute list.
	 * @see io.yaktor.access.RestAccess
	 * @see io.yaktor.access.AccessPackage#getAccessGroup_AccessMethods()
	 * @model required="true"
	 * @generated
	 */
  EList<RestAccess> getAccessMethods();

} // AccessGroup
