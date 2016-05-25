/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.Association;
import io.yaktor.domain.AssociationEnd;
import io.yaktor.domain.DomainPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.AssociationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.AssociationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.AssociationImpl#isIsUnidirectional <em>Is Unidirectional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends NamedTypeImpl implements Association {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected AssociationEnd end;

	/**
	 * The default value of the '{@link #isIsUnidirectional() <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnidirectional() <em>Is Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnidirectional = IS_UNIDIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(AssociationEnd newStart, NotificationChain msgs) {
		AssociationEnd oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(AssociationEnd newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ASSOCIATION__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ASSOCIATION__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(AssociationEnd newEnd, NotificationChain msgs) {
		AssociationEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(AssociationEnd newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ASSOCIATION__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ASSOCIATION__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnidirectional() {
		return isUnidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnidirectional(boolean newIsUnidirectional) {
		boolean oldIsUnidirectional = isUnidirectional;
		isUnidirectional = newIsUnidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION__IS_UNIDIRECTIONAL, oldIsUnidirectional, isUnidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.ASSOCIATION__START:
				return basicSetStart(null, msgs);
			case DomainPackage.ASSOCIATION__END:
				return basicSetEnd(null, msgs);
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
			case DomainPackage.ASSOCIATION__START:
				return getStart();
			case DomainPackage.ASSOCIATION__END:
				return getEnd();
			case DomainPackage.ASSOCIATION__IS_UNIDIRECTIONAL:
				return isIsUnidirectional();
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
			case DomainPackage.ASSOCIATION__START:
				setStart((AssociationEnd)newValue);
				return;
			case DomainPackage.ASSOCIATION__END:
				setEnd((AssociationEnd)newValue);
				return;
			case DomainPackage.ASSOCIATION__IS_UNIDIRECTIONAL:
				setIsUnidirectional((Boolean)newValue);
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
			case DomainPackage.ASSOCIATION__START:
				setStart((AssociationEnd)null);
				return;
			case DomainPackage.ASSOCIATION__END:
				setEnd((AssociationEnd)null);
				return;
			case DomainPackage.ASSOCIATION__IS_UNIDIRECTIONAL:
				setIsUnidirectional(IS_UNIDIRECTIONAL_EDEFAULT);
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
			case DomainPackage.ASSOCIATION__START:
				return start != null;
			case DomainPackage.ASSOCIATION__END:
				return end != null;
			case DomainPackage.ASSOCIATION__IS_UNIDIRECTIONAL:
				return isUnidirectional != IS_UNIDIRECTIONAL_EDEFAULT;
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
		result.append(" (isUnidirectional: ");
		result.append(isUnidirectional);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
