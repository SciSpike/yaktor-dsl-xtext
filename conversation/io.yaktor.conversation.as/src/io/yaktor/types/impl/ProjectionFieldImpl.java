/**
 */
package io.yaktor.types.impl;

import io.yaktor.domain.Field;
import io.yaktor.types.Projection;
import io.yaktor.types.ProjectionField;
import io.yaktor.types.TypesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projection Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.types.impl.ProjectionFieldImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link io.yaktor.types.impl.ProjectionFieldImpl#getOldField <em>Old Field</em>}</li>
 *   <li>{@link io.yaktor.types.impl.ProjectionFieldImpl#getNewField <em>New Field</em>}</li>
 *   <li>{@link io.yaktor.types.impl.ProjectionFieldImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectionFieldImpl extends MinimalEObjectImpl.Container implements ProjectionField {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOldField() <em>Old Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldField()
	 * @generated
	 * @ordered
	 */
	protected Field oldField;

	/**
	 * The cached value of the '{@link #getNewField() <em>New Field</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewField()
	 * @generated
	 * @ordered
	 */
	protected Field newField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectionFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.PROJECTION_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_FIELD__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getOldField() {
		if (oldField != null && oldField.eIsProxy()) {
			InternalEObject oldOldField = (InternalEObject)oldField;
			oldField = (Field)eResolveProxy(oldOldField);
			if (oldField != oldOldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypesPackage.PROJECTION_FIELD__OLD_FIELD, oldOldField, oldField));
			}
		}
		return oldField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetOldField() {
		return oldField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldField(Field newOldField) {
		Field oldOldField = oldField;
		oldField = newOldField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_FIELD__OLD_FIELD, oldOldField, oldField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getNewField() {
		return newField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewField(Field newNewField, NotificationChain msgs) {
		Field oldNewField = newField;
		newField = newNewField;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_FIELD__NEW_FIELD, oldNewField, newNewField);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewField(Field newNewField) {
		if (newNewField != newField) {
			NotificationChain msgs = null;
			if (newField != null)
				msgs = ((InternalEObject)newField).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROJECTION_FIELD__NEW_FIELD, null, msgs);
			if (newNewField != null)
				msgs = ((InternalEObject)newNewField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROJECTION_FIELD__NEW_FIELD, null, msgs);
			msgs = basicSetNewField(newNewField, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_FIELD__NEW_FIELD, newNewField, newNewField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection getParent() {
		if (eContainerFeatureID() != TypesPackage.PROJECTION_FIELD__PARENT) return null;
		return (Projection)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Projection newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, TypesPackage.PROJECTION_FIELD__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Projection newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != TypesPackage.PROJECTION_FIELD__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, TypesPackage.PROJECTION__FIELDS, Projection.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROJECTION_FIELD__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.PROJECTION_FIELD__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Projection)otherEnd, msgs);
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
			case TypesPackage.PROJECTION_FIELD__NEW_FIELD:
				return basicSetNewField(null, msgs);
			case TypesPackage.PROJECTION_FIELD__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TypesPackage.PROJECTION_FIELD__PARENT:
				return eInternalContainer().eInverseRemove(this, TypesPackage.PROJECTION__FIELDS, Projection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.PROJECTION_FIELD__ALIAS:
				return getAlias();
			case TypesPackage.PROJECTION_FIELD__OLD_FIELD:
				if (resolve) return getOldField();
				return basicGetOldField();
			case TypesPackage.PROJECTION_FIELD__NEW_FIELD:
				return getNewField();
			case TypesPackage.PROJECTION_FIELD__PARENT:
				return getParent();
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
			case TypesPackage.PROJECTION_FIELD__ALIAS:
				setAlias((String)newValue);
				return;
			case TypesPackage.PROJECTION_FIELD__OLD_FIELD:
				setOldField((Field)newValue);
				return;
			case TypesPackage.PROJECTION_FIELD__NEW_FIELD:
				setNewField((Field)newValue);
				return;
			case TypesPackage.PROJECTION_FIELD__PARENT:
				setParent((Projection)newValue);
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
			case TypesPackage.PROJECTION_FIELD__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case TypesPackage.PROJECTION_FIELD__OLD_FIELD:
				setOldField((Field)null);
				return;
			case TypesPackage.PROJECTION_FIELD__NEW_FIELD:
				setNewField((Field)null);
				return;
			case TypesPackage.PROJECTION_FIELD__PARENT:
				setParent((Projection)null);
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
			case TypesPackage.PROJECTION_FIELD__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case TypesPackage.PROJECTION_FIELD__OLD_FIELD:
				return oldField != null;
			case TypesPackage.PROJECTION_FIELD__NEW_FIELD:
				return newField != null;
			case TypesPackage.PROJECTION_FIELD__PARENT:
				return getParent() != null;
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
		result.append(" (alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //ProjectionFieldImpl
