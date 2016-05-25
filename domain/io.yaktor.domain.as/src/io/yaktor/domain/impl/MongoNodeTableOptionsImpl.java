/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.MongoNodeTableOptions;
import io.yaktor.domain.TableType;
import io.yaktor.mongoNode.Ttl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mongo Node Table Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeTableOptionsImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeTableOptionsImpl#getTtl <em>Ttl</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeTableOptionsImpl#isSingleTableRoot <em>Single Table Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MongoNodeTableOptionsImpl extends MinimalEObjectImpl.Container implements MongoNodeTableOptions {
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
	 * The cached value of the '{@link #getTtl() <em>Ttl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtl()
	 * @generated
	 * @ordered
	 */
	protected Ttl ttl;

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
	protected MongoNodeTableOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.MONGO_NODE_TABLE_OPTIONS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.MONGO_NODE_TABLE_OPTIONS__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_TABLE_OPTIONS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ttl getTtl() {
		return ttl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTtl(Ttl newTtl, NotificationChain msgs) {
		Ttl oldTtl = ttl;
		ttl = newTtl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL, oldTtl, newTtl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTtl(Ttl newTtl) {
		if (newTtl != ttl) {
			NotificationChain msgs = null;
			if (ttl != null)
				msgs = ((InternalEObject)ttl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL, null, msgs);
			if (newTtl != null)
				msgs = ((InternalEObject)newTtl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL, null, msgs);
			msgs = basicSetTtl(newTtl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL, newTtl, newTtl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT, oldSingleTableRoot, singleTableRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL:
				return basicSetTtl(null, msgs);
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
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL:
				return getTtl();
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
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
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TYPE:
				setType((TableType)newValue);
				return;
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL:
				setTtl((Ttl)newValue);
				return;
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
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
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TYPE:
				setType((TableType)null);
				return;
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL:
				setTtl((Ttl)null);
				return;
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
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
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TYPE:
				return type != null;
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__TTL:
				return ttl != null;
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT:
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

} //MongoNodeTableOptionsImpl
