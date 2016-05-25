/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.EnumField;
import io.yaktor.domain.EnumType;
import io.yaktor.domain.EnumValue;
import io.yaktor.domain.JpaEnumType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.EnumFieldImpl#getIsType <em>Is Type</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.EnumFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.EnumFieldImpl#getIsJpaEnumType <em>Is Jpa Enum Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumFieldImpl extends SimpleFieldImpl implements EnumField {
	/**
	 * The cached value of the '{@link #getIsType() <em>Is Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsType()
	 * @generated
	 * @ordered
	 */
	protected EnumType isType;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected EnumValue defaultValue;

	/**
	 * The default value of the '{@link #getIsJpaEnumType() <em>Is Jpa Enum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJpaEnumType()
	 * @generated
	 * @ordered
	 */
	protected static final JpaEnumType IS_JPA_ENUM_TYPE_EDEFAULT = JpaEnumType.NONE;

	/**
	 * The cached value of the '{@link #getIsJpaEnumType() <em>Is Jpa Enum Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJpaEnumType()
	 * @generated
	 * @ordered
	 */
	protected JpaEnumType isJpaEnumType = IS_JPA_ENUM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ENUM_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType getIsType() {
		if (isType != null && isType.eIsProxy()) {
			InternalEObject oldIsType = (InternalEObject)isType;
			isType = (EnumType)eResolveProxy(oldIsType);
			if (isType != oldIsType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ENUM_FIELD__IS_TYPE, oldIsType, isType));
			}
		}
		return isType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType basicGetIsType() {
		return isType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsType(EnumType newIsType) {
		EnumType oldIsType = isType;
		isType = newIsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENUM_FIELD__IS_TYPE, oldIsType, isType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue getDefaultValue() {
		if (defaultValue != null && defaultValue.eIsProxy()) {
			InternalEObject oldDefaultValue = (InternalEObject)defaultValue;
			defaultValue = (EnumValue)eResolveProxy(oldDefaultValue);
			if (defaultValue != oldDefaultValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ENUM_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
			}
		}
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue basicGetDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(EnumValue newDefaultValue) {
		EnumValue oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENUM_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JpaEnumType getIsJpaEnumType() {
		return isJpaEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJpaEnumType(JpaEnumType newIsJpaEnumType) {
		JpaEnumType oldIsJpaEnumType = isJpaEnumType;
		isJpaEnumType = newIsJpaEnumType == null ? IS_JPA_ENUM_TYPE_EDEFAULT : newIsJpaEnumType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ENUM_FIELD__IS_JPA_ENUM_TYPE, oldIsJpaEnumType, isJpaEnumType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ENUM_FIELD__IS_TYPE:
				if (resolve) return getIsType();
				return basicGetIsType();
			case DomainPackage.ENUM_FIELD__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
			case DomainPackage.ENUM_FIELD__IS_JPA_ENUM_TYPE:
				return getIsJpaEnumType();
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
			case DomainPackage.ENUM_FIELD__IS_TYPE:
				setIsType((EnumType)newValue);
				return;
			case DomainPackage.ENUM_FIELD__DEFAULT_VALUE:
				setDefaultValue((EnumValue)newValue);
				return;
			case DomainPackage.ENUM_FIELD__IS_JPA_ENUM_TYPE:
				setIsJpaEnumType((JpaEnumType)newValue);
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
			case DomainPackage.ENUM_FIELD__IS_TYPE:
				setIsType((EnumType)null);
				return;
			case DomainPackage.ENUM_FIELD__DEFAULT_VALUE:
				setDefaultValue((EnumValue)null);
				return;
			case DomainPackage.ENUM_FIELD__IS_JPA_ENUM_TYPE:
				setIsJpaEnumType(IS_JPA_ENUM_TYPE_EDEFAULT);
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
			case DomainPackage.ENUM_FIELD__IS_TYPE:
				return isType != null;
			case DomainPackage.ENUM_FIELD__DEFAULT_VALUE:
				return defaultValue != null;
			case DomainPackage.ENUM_FIELD__IS_JPA_ENUM_TYPE:
				return isJpaEnumType != IS_JPA_ENUM_TYPE_EDEFAULT;
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
		result.append(" (isJpaEnumType: ");
		result.append(isJpaEnumType);
		result.append(')');
		return result.toString();
	}

} //EnumFieldImpl
