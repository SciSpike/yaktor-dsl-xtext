/**
 */
package io.yaktor.access.impl;

import io.yaktor.access.AccessPackage;
import io.yaktor.access.ServiceMethod;

import io.yaktor.types.Projection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.access.impl.ServiceMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.access.impl.ServiceMethodImpl#getInputParams <em>Input Params</em>}</li>
 *   <li>{@link io.yaktor.access.impl.ServiceMethodImpl#getOutputParams <em>Output Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMethodImpl extends MinimalEObjectImpl.Container implements ServiceMethod {
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
	 * The cached value of the '{@link #getInputParams() <em>Input Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Projection> inputParams;

	/**
	 * The cached value of the '{@link #getOutputParams() <em>Output Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Projection> outputParams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessPackage.Literals.SERVICE_METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.SERVICE_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projection> getInputParams() {
		if (inputParams == null) {
			inputParams = new EObjectResolvingEList<Projection>(Projection.class, this, AccessPackage.SERVICE_METHOD__INPUT_PARAMS);
		}
		return inputParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projection> getOutputParams() {
		if (outputParams == null) {
			outputParams = new EObjectResolvingEList<Projection>(Projection.class, this, AccessPackage.SERVICE_METHOD__OUTPUT_PARAMS);
		}
		return outputParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessPackage.SERVICE_METHOD__NAME:
				return getName();
			case AccessPackage.SERVICE_METHOD__INPUT_PARAMS:
				return getInputParams();
			case AccessPackage.SERVICE_METHOD__OUTPUT_PARAMS:
				return getOutputParams();
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
			case AccessPackage.SERVICE_METHOD__NAME:
				setName((String)newValue);
				return;
			case AccessPackage.SERVICE_METHOD__INPUT_PARAMS:
				getInputParams().clear();
				getInputParams().addAll((Collection<? extends Projection>)newValue);
				return;
			case AccessPackage.SERVICE_METHOD__OUTPUT_PARAMS:
				getOutputParams().clear();
				getOutputParams().addAll((Collection<? extends Projection>)newValue);
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
			case AccessPackage.SERVICE_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AccessPackage.SERVICE_METHOD__INPUT_PARAMS:
				getInputParams().clear();
				return;
			case AccessPackage.SERVICE_METHOD__OUTPUT_PARAMS:
				getOutputParams().clear();
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
			case AccessPackage.SERVICE_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AccessPackage.SERVICE_METHOD__INPUT_PARAMS:
				return inputParams != null && !inputParams.isEmpty();
			case AccessPackage.SERVICE_METHOD__OUTPUT_PARAMS:
				return outputParams != null && !outputParams.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ServiceMethodImpl
