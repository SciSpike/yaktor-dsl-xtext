/**
 */
package io.yaktor.mongoNode.impl;

import io.yaktor.domain.DateField;

import io.yaktor.mongoNode.MongoNodePackage;
import io.yaktor.mongoNode.Ttl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ttl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.mongoNode.impl.TtlImpl#getField <em>Field</em>}</li>
 *   <li>{@link io.yaktor.mongoNode.impl.TtlImpl#getExpireAfterSeconds <em>Expire After Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TtlImpl extends MinimalEObjectImpl.Container implements Ttl {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected DateField field;

	/**
	 * The default value of the '{@link #getExpireAfterSeconds() <em>Expire After Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireAfterSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRE_AFTER_SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpireAfterSeconds() <em>Expire After Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireAfterSeconds()
	 * @generated
	 * @ordered
	 */
	protected int expireAfterSeconds = EXPIRE_AFTER_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TtlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongoNodePackage.Literals.TTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (DateField)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MongoNodePackage.TTL__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(DateField newField) {
		DateField oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MongoNodePackage.TTL__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpireAfterSeconds() {
		return expireAfterSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpireAfterSeconds(int newExpireAfterSeconds) {
		int oldExpireAfterSeconds = expireAfterSeconds;
		expireAfterSeconds = newExpireAfterSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MongoNodePackage.TTL__EXPIRE_AFTER_SECONDS, oldExpireAfterSeconds, expireAfterSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MongoNodePackage.TTL__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case MongoNodePackage.TTL__EXPIRE_AFTER_SECONDS:
				return getExpireAfterSeconds();
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
			case MongoNodePackage.TTL__FIELD:
				setField((DateField)newValue);
				return;
			case MongoNodePackage.TTL__EXPIRE_AFTER_SECONDS:
				setExpireAfterSeconds((Integer)newValue);
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
			case MongoNodePackage.TTL__FIELD:
				setField((DateField)null);
				return;
			case MongoNodePackage.TTL__EXPIRE_AFTER_SECONDS:
				setExpireAfterSeconds(EXPIRE_AFTER_SECONDS_EDEFAULT);
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
			case MongoNodePackage.TTL__FIELD:
				return field != null;
			case MongoNodePackage.TTL__EXPIRE_AFTER_SECONDS:
				return expireAfterSeconds != EXPIRE_AFTER_SECONDS_EDEFAULT;
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
		result.append(" (expireAfterSeconds: ");
		result.append(expireAfterSeconds);
		result.append(')');
		return result.toString();
	}

} //TtlImpl
