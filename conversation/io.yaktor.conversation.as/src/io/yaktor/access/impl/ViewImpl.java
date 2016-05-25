/**
 */
package io.yaktor.access.impl;

import io.yaktor.access.AccessPackage;
import io.yaktor.access.RestService;
import io.yaktor.access.View;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.access.impl.ViewImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link io.yaktor.access.impl.ViewImpl#getBackedBy <em>Backed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends MinimalEObjectImpl.Container implements View {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBackedBy() <em>Backed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackedBy()
	 * @generated
	 * @ordered
	 */
	protected RestService backedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.VIEW__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestService getBackedBy() {
		if (backedBy != null && backedBy.eIsProxy()) {
			InternalEObject oldBackedBy = (InternalEObject)backedBy;
			backedBy = (RestService)eResolveProxy(oldBackedBy);
			if (backedBy != oldBackedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccessPackage.VIEW__BACKED_BY, oldBackedBy, backedBy));
			}
		}
		return backedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestService basicGetBackedBy() {
		return backedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackedBy(RestService newBackedBy, NotificationChain msgs) {
		RestService oldBackedBy = backedBy;
		backedBy = newBackedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AccessPackage.VIEW__BACKED_BY, oldBackedBy, newBackedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackedBy(RestService newBackedBy) {
		if (newBackedBy != backedBy) {
			NotificationChain msgs = null;
			if (backedBy != null)
				msgs = ((InternalEObject)backedBy).eInverseRemove(this, AccessPackage.REST_SERVICE__FRONTED_BY, RestService.class, msgs);
			if (newBackedBy != null)
				msgs = ((InternalEObject)newBackedBy).eInverseAdd(this, AccessPackage.REST_SERVICE__FRONTED_BY, RestService.class, msgs);
			msgs = basicSetBackedBy(newBackedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.VIEW__BACKED_BY, newBackedBy, newBackedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccessPackage.VIEW__BACKED_BY:
				if (backedBy != null)
					msgs = ((InternalEObject)backedBy).eInverseRemove(this, AccessPackage.REST_SERVICE__FRONTED_BY, RestService.class, msgs);
				return basicSetBackedBy((RestService)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccessPackage.VIEW__BACKED_BY:
				return basicSetBackedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessPackage.VIEW__URL:
				return getUrl();
			case AccessPackage.VIEW__BACKED_BY:
				if (resolve) return getBackedBy();
				return basicGetBackedBy();
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
			case AccessPackage.VIEW__URL:
				setUrl((String)newValue);
				return;
			case AccessPackage.VIEW__BACKED_BY:
				setBackedBy((RestService)newValue);
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
			case AccessPackage.VIEW__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AccessPackage.VIEW__BACKED_BY:
				setBackedBy((RestService)null);
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
			case AccessPackage.VIEW__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case AccessPackage.VIEW__BACKED_BY:
				return backedBy != null;
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
