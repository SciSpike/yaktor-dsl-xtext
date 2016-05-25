/**
 */
package io.yaktor.types.impl;

import io.yaktor.domain.Cardinality;
import io.yaktor.types.Projection;
import io.yaktor.types.ProjectionContainmentField;
import io.yaktor.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection Containment Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.types.impl.ProjectionContainmentFieldImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link io.yaktor.types.impl.ProjectionContainmentFieldImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectionContainmentFieldImpl extends ProjectionFieldImpl implements ProjectionContainmentField {
	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected Projection projection;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.REQUIRED;
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectionContainmentFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.PROJECTION_CONTAINMENT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection getProjection() {
		if (projection != null && projection.eIsProxy()) {
			InternalEObject oldProjection = (InternalEObject)projection;
			projection = (Projection)eResolveProxy(oldProjection);
			if (projection != oldProjection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.PROJECTION_CONTAINMENT_FIELD__PROJECTION, oldProjection, projection));
			}
		}
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection basicGetProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(Projection newProjection) {
		Projection oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_CONTAINMENT_FIELD__PROJECTION, oldProjection, projection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_CONTAINMENT_FIELD__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__PROJECTION:
				if (resolve) return getProjection();
				return basicGetProjection();
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__CARDINALITY:
				return getCardinality();
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
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__PROJECTION:
				setProjection((Projection)newValue);
				return;
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__CARDINALITY:
				setCardinality((Cardinality)newValue);
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
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__PROJECTION:
				setProjection((Projection)null);
				return;
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__PROJECTION:
				return projection != null;
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //ProjectionContainmentFieldImpl
