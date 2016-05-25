/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainModel;
import io.yaktor.domain.DomainModelImport;
import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.GenOptions;
import io.yaktor.domain.NamedType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.DomainModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DomainModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DomainModelImpl#getGenOptions <em>Gen Options</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.DomainModelImpl#getDomainModelImports <em>Domain Model Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainModelImpl extends MinimalEObjectImpl.Container implements DomainModel {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedType> types;

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
	 * The cached value of the '{@link #getGenOptions() <em>Gen Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenOptions()
	 * @generated
	 * @ordered
	 */
	protected GenOptions genOptions;

	/**
	 * The cached value of the '{@link #getDomainModelImports() <em>Domain Model Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainModelImports()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainModelImport> domainModelImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<NamedType>(NamedType.class, this, DomainPackage.DOMAIN_MODEL__TYPES, DomainPackage.NAMED_TYPE__MODEL);
		}
		return types;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenOptions getGenOptions() {
		return genOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenOptions(GenOptions newGenOptions, NotificationChain msgs) {
		GenOptions oldGenOptions = genOptions;
		genOptions = newGenOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_MODEL__GEN_OPTIONS, oldGenOptions, newGenOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenOptions(GenOptions newGenOptions) {
		if (newGenOptions != genOptions) {
			NotificationChain msgs = null;
			if (genOptions != null)
				msgs = ((InternalEObject)genOptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_MODEL__GEN_OPTIONS, null, msgs);
			if (newGenOptions != null)
				msgs = ((InternalEObject)newGenOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN_MODEL__GEN_OPTIONS, null, msgs);
			msgs = basicSetGenOptions(newGenOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_MODEL__GEN_OPTIONS, newGenOptions, newGenOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainModelImport> getDomainModelImports() {
		if (domainModelImports == null) {
			domainModelImports = new EObjectContainmentEList<DomainModelImport>(DomainModelImport.class, this, DomainPackage.DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS);
		}
		return domainModelImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_MODEL__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
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
			case DomainPackage.DOMAIN_MODEL__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN_MODEL__GEN_OPTIONS:
				return basicSetGenOptions(null, msgs);
			case DomainPackage.DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS:
				return ((InternalEList<?>)getDomainModelImports()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.DOMAIN_MODEL__TYPES:
				return getTypes();
			case DomainPackage.DOMAIN_MODEL__NAME:
				return getName();
			case DomainPackage.DOMAIN_MODEL__GEN_OPTIONS:
				return getGenOptions();
			case DomainPackage.DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS:
				return getDomainModelImports();
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
			case DomainPackage.DOMAIN_MODEL__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends NamedType>)newValue);
				return;
			case DomainPackage.DOMAIN_MODEL__NAME:
				setName((String)newValue);
				return;
			case DomainPackage.DOMAIN_MODEL__GEN_OPTIONS:
				setGenOptions((GenOptions)newValue);
				return;
			case DomainPackage.DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS:
				getDomainModelImports().clear();
				getDomainModelImports().addAll((Collection<? extends DomainModelImport>)newValue);
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
			case DomainPackage.DOMAIN_MODEL__TYPES:
				getTypes().clear();
				return;
			case DomainPackage.DOMAIN_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomainPackage.DOMAIN_MODEL__GEN_OPTIONS:
				setGenOptions((GenOptions)null);
				return;
			case DomainPackage.DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS:
				getDomainModelImports().clear();
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
			case DomainPackage.DOMAIN_MODEL__TYPES:
				return types != null && !types.isEmpty();
			case DomainPackage.DOMAIN_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomainPackage.DOMAIN_MODEL__GEN_OPTIONS:
				return genOptions != null;
			case DomainPackage.DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS:
				return domainModelImports != null && !domainModelImports.isEmpty();
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

} //DomainModelImpl
