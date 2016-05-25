/**
 */
package io.yaktor.access.impl;

import io.yaktor.access.AccessGroup;
import io.yaktor.access.AccessPackage;
import io.yaktor.access.AccessRequirement;
import io.yaktor.access.RestAccess;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.access.impl.AccessGroupImpl#getAccessRequirement <em>Access Requirement</em>}</li>
 *   <li>{@link io.yaktor.access.impl.AccessGroupImpl#getAccessMethods <em>Access Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessGroupImpl extends MinimalEObjectImpl.Container implements AccessGroup {
  /**
	 * The default value of the '{@link #getAccessRequirement() <em>Access Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAccessRequirement()
	 * @generated
	 * @ordered
	 */
  protected static final AccessRequirement ACCESS_REQUIREMENT_EDEFAULT = AccessRequirement.DEFAULT;

  /**
	 * The cached value of the '{@link #getAccessRequirement() <em>Access Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAccessRequirement()
	 * @generated
	 * @ordered
	 */
  protected AccessRequirement accessRequirement = ACCESS_REQUIREMENT_EDEFAULT;

  /**
	 * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAccessMethods()
	 * @generated
	 * @ordered
	 */
  protected EList<RestAccess> accessMethods;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AccessGroupImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return AccessPackage.Literals.ACCESS_GROUP;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AccessRequirement getAccessRequirement() {
		return accessRequirement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAccessRequirement(AccessRequirement newAccessRequirement) {
		AccessRequirement oldAccessRequirement = accessRequirement;
		accessRequirement = newAccessRequirement == null ? ACCESS_REQUIREMENT_EDEFAULT : newAccessRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.ACCESS_GROUP__ACCESS_REQUIREMENT, oldAccessRequirement, accessRequirement));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RestAccess> getAccessMethods() {
		if (accessMethods == null) {
			accessMethods = new EDataTypeUniqueEList<RestAccess>(RestAccess.class, this, AccessPackage.ACCESS_GROUP__ACCESS_METHODS);
		}
		return accessMethods;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessPackage.ACCESS_GROUP__ACCESS_REQUIREMENT:
				return getAccessRequirement();
			case AccessPackage.ACCESS_GROUP__ACCESS_METHODS:
				return getAccessMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccessPackage.ACCESS_GROUP__ACCESS_REQUIREMENT:
				setAccessRequirement((AccessRequirement)newValue);
				return;
			case AccessPackage.ACCESS_GROUP__ACCESS_METHODS:
				getAccessMethods().clear();
				getAccessMethods().addAll((Collection<? extends RestAccess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case AccessPackage.ACCESS_GROUP__ACCESS_REQUIREMENT:
				setAccessRequirement(ACCESS_REQUIREMENT_EDEFAULT);
				return;
			case AccessPackage.ACCESS_GROUP__ACCESS_METHODS:
				getAccessMethods().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccessPackage.ACCESS_GROUP__ACCESS_REQUIREMENT:
				return accessRequirement != ACCESS_REQUIREMENT_EDEFAULT;
			case AccessPackage.ACCESS_GROUP__ACCESS_METHODS:
				return accessMethods != null && !accessMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accessRequirement: ");
		result.append(accessRequirement);
		result.append(", accessMethods: ");
		result.append(accessMethods);
		result.append(')');
		return result.toString();
	}

} //AccessGroupImpl
