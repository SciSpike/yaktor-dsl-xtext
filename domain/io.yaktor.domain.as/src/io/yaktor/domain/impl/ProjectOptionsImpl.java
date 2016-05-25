/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.ProjectOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.ProjectOptionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.ProjectOptionsImpl#getRootPackage <em>Root Package</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.ProjectOptionsImpl#getDomainSubpackage <em>Domain Subpackage</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.ProjectOptionsImpl#isJsonSupport <em>Json Support</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.ProjectOptionsImpl#getControllerSubpackage <em>Controller Subpackage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectOptionsImpl extends MinimalEObjectImpl.Container implements ProjectOptions {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRootPackage() <em>Root Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRootPackage() <em>Root Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPackage()
	 * @generated
	 * @ordered
	 */
	protected String rootPackage = ROOT_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainSubpackage() <em>Domain Subpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSubpackage()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_SUBPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainSubpackage() <em>Domain Subpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainSubpackage()
	 * @generated
	 * @ordered
	 */
	protected String domainSubpackage = DOMAIN_SUBPACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isJsonSupport() <em>Json Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJsonSupport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JSON_SUPPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJsonSupport() <em>Json Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJsonSupport()
	 * @generated
	 * @ordered
	 */
	protected boolean jsonSupport = JSON_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getControllerSubpackage() <em>Controller Subpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerSubpackage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_SUBPACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerSubpackage() <em>Controller Subpackage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerSubpackage()
	 * @generated
	 * @ordered
	 */
	protected String controllerSubpackage = CONTROLLER_SUBPACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PROJECT_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROJECT_OPTIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRootPackage() {
		return rootPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootPackage(String newRootPackage) {
		String oldRootPackage = rootPackage;
		rootPackage = newRootPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROJECT_OPTIONS__ROOT_PACKAGE, oldRootPackage, rootPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainSubpackage() {
		return domainSubpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainSubpackage(String newDomainSubpackage) {
		String oldDomainSubpackage = domainSubpackage;
		domainSubpackage = newDomainSubpackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROJECT_OPTIONS__DOMAIN_SUBPACKAGE, oldDomainSubpackage, domainSubpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJsonSupport() {
		return jsonSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsonSupport(boolean newJsonSupport) {
		boolean oldJsonSupport = jsonSupport;
		jsonSupport = newJsonSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROJECT_OPTIONS__JSON_SUPPORT, oldJsonSupport, jsonSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllerSubpackage() {
		return controllerSubpackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerSubpackage(String newControllerSubpackage) {
		String oldControllerSubpackage = controllerSubpackage;
		controllerSubpackage = newControllerSubpackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE, oldControllerSubpackage, controllerSubpackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.PROJECT_OPTIONS__NAME:
				return getName();
			case DomainPackage.PROJECT_OPTIONS__ROOT_PACKAGE:
				return getRootPackage();
			case DomainPackage.PROJECT_OPTIONS__DOMAIN_SUBPACKAGE:
				return getDomainSubpackage();
			case DomainPackage.PROJECT_OPTIONS__JSON_SUPPORT:
				return isJsonSupport();
			case DomainPackage.PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE:
				return getControllerSubpackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.PROJECT_OPTIONS__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.PROJECT_OPTIONS__ROOT_PACKAGE:
				setRootPackage((String)newValue);
				return;
			case DomainPackage.PROJECT_OPTIONS__DOMAIN_SUBPACKAGE:
				setDomainSubpackage((String)newValue);
				return;
			case DomainPackage.PROJECT_OPTIONS__JSON_SUPPORT:
				setJsonSupport((Boolean)newValue);
				return;
			case DomainPackage.PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE:
				setControllerSubpackage((String)newValue);
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
			case DomainPackage.PROJECT_OPTIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.PROJECT_OPTIONS__ROOT_PACKAGE:
				setRootPackage(ROOT_PACKAGE_EDEFAULT);
				return;
			case DomainPackage.PROJECT_OPTIONS__DOMAIN_SUBPACKAGE:
				setDomainSubpackage(DOMAIN_SUBPACKAGE_EDEFAULT);
				return;
			case DomainPackage.PROJECT_OPTIONS__JSON_SUPPORT:
				setJsonSupport(JSON_SUPPORT_EDEFAULT);
				return;
			case DomainPackage.PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE:
				setControllerSubpackage(CONTROLLER_SUBPACKAGE_EDEFAULT);
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
			case DomainPackage.PROJECT_OPTIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.PROJECT_OPTIONS__ROOT_PACKAGE:
				return ROOT_PACKAGE_EDEFAULT == null ? rootPackage != null : !ROOT_PACKAGE_EDEFAULT.equals(rootPackage);
			case DomainPackage.PROJECT_OPTIONS__DOMAIN_SUBPACKAGE:
				return DOMAIN_SUBPACKAGE_EDEFAULT == null ? domainSubpackage != null : !DOMAIN_SUBPACKAGE_EDEFAULT.equals(domainSubpackage);
			case DomainPackage.PROJECT_OPTIONS__JSON_SUPPORT:
				return jsonSupport != JSON_SUPPORT_EDEFAULT;
			case DomainPackage.PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE:
				return CONTROLLER_SUBPACKAGE_EDEFAULT == null ? controllerSubpackage != null : !CONTROLLER_SUBPACKAGE_EDEFAULT.equals(controllerSubpackage);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", rootPackage: ");
		result.append(rootPackage);
		result.append(", domainSubpackage: ");
		result.append(domainSubpackage);
		result.append(", jsonSupport: ");
		result.append(jsonSupport);
		result.append(", controllerSubpackage: ");
		result.append(controllerSubpackage);
		result.append(')');
		return result.toString();
	}

} //ProjectOptionsImpl
