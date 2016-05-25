/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DateField;
import io.yaktor.domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.DateFieldImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DateFieldImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DateFieldImpl#getAfter <em>After</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DateFieldImpl#isPast <em>Past</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DateFieldImpl#isFuture <em>Future</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateFieldImpl extends SimpleFieldImpl implements DateField {
	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected String before = BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfter() <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected String after = AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isPast() <em>Past</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPast() <em>Past</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPast()
	 * @generated
	 * @ordered
	 */
	protected boolean past = PAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isFuture() <em>Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFuture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FUTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFuture() <em>Future</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFuture()
	 * @generated
	 * @ordered
	 */
	protected boolean future = FUTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DATE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATE_FIELD__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(String newBefore) {
		String oldBefore = before;
		before = newBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATE_FIELD__BEFORE, oldBefore, before));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(String newAfter) {
		String oldAfter = after;
		after = newAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATE_FIELD__AFTER, oldAfter, after));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPast() {
		return past;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPast(boolean newPast) {
		boolean oldPast = past;
		past = newPast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATE_FIELD__PAST, oldPast, past));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFuture() {
		return future;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuture(boolean newFuture) {
		boolean oldFuture = future;
		future = newFuture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DATE_FIELD__FUTURE, oldFuture, future));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.DATE_FIELD__DEFAULT_VALUE:
				return getDefaultValue();
			case DomainPackage.DATE_FIELD__BEFORE:
				return getBefore();
			case DomainPackage.DATE_FIELD__AFTER:
				return getAfter();
			case DomainPackage.DATE_FIELD__PAST:
				return isPast();
			case DomainPackage.DATE_FIELD__FUTURE:
				return isFuture();
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
			case DomainPackage.DATE_FIELD__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case DomainPackage.DATE_FIELD__BEFORE:
				setBefore((String)newValue);
				return;
			case DomainPackage.DATE_FIELD__AFTER:
				setAfter((String)newValue);
				return;
			case DomainPackage.DATE_FIELD__PAST:
				setPast((Boolean)newValue);
				return;
			case DomainPackage.DATE_FIELD__FUTURE:
				setFuture((Boolean)newValue);
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
			case DomainPackage.DATE_FIELD__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case DomainPackage.DATE_FIELD__BEFORE:
				setBefore(BEFORE_EDEFAULT);
				return;
			case DomainPackage.DATE_FIELD__AFTER:
				setAfter(AFTER_EDEFAULT);
				return;
			case DomainPackage.DATE_FIELD__PAST:
				setPast(PAST_EDEFAULT);
				return;
			case DomainPackage.DATE_FIELD__FUTURE:
				setFuture(FUTURE_EDEFAULT);
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
			case DomainPackage.DATE_FIELD__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case DomainPackage.DATE_FIELD__BEFORE:
				return BEFORE_EDEFAULT == null ? before != null : !BEFORE_EDEFAULT.equals(before);
			case DomainPackage.DATE_FIELD__AFTER:
				return AFTER_EDEFAULT == null ? after != null : !AFTER_EDEFAULT.equals(after);
			case DomainPackage.DATE_FIELD__PAST:
				return past != PAST_EDEFAULT;
			case DomainPackage.DATE_FIELD__FUTURE:
				return future != FUTURE_EDEFAULT;
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", before: ");
		result.append(before);
		result.append(", after: ");
		result.append(after);
		result.append(", past: ");
		result.append(past);
		result.append(", future: ");
		result.append(future);
		result.append(')');
		return result.toString();
	}

} //DateFieldImpl
