/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.JpaTableOptions;
import io.yaktor.domain.TableType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jpa Table Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.JpaTableOptionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.JpaTableOptionsImpl#isSingleTableRoot <em>Single Table Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JpaTableOptionsImpl extends MinimalEObjectImpl.Container implements JpaTableOptions {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TableType type;

	/**
	 * The default value of the '{@link #isSingleTableRoot() <em>Single Table Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleTableRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_TABLE_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleTableRoot() <em>Single Table Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleTableRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean singleTableRoot = SINGLE_TABLE_ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JpaTableOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.JPA_TABLE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TableType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.JPA_TABLE_OPTIONS__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TableType newType) {
		TableType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_TABLE_OPTIONS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleTableRoot() {
		return singleTableRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleTableRoot(boolean newSingleTableRoot) {
		boolean oldSingleTableRoot = singleTableRoot;
		singleTableRoot = newSingleTableRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT, oldSingleTableRoot, singleTableRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.JPA_TABLE_OPTIONS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DomainPackage.JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
				return isSingleTableRoot();
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
			case DomainPackage.JPA_TABLE_OPTIONS__TYPE:
				setType((TableType)newValue);
				return;
			case DomainPackage.JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
				setSingleTableRoot((Boolean)newValue);
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
			case DomainPackage.JPA_TABLE_OPTIONS__TYPE:
				setType((TableType)null);
				return;
			case DomainPackage.JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
				setSingleTableRoot(SINGLE_TABLE_ROOT_EDEFAULT);
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
			case DomainPackage.JPA_TABLE_OPTIONS__TYPE:
				return type != null;
			case DomainPackage.JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
				return singleTableRoot != SINGLE_TABLE_ROOT_EDEFAULT;
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
		result.append(" (singleTableRoot: ");
		result.append(singleTableRoot);
		result.append(')');
		return result.toString();
	}

} //JpaTableOptionsImpl
