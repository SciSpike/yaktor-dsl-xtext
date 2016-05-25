/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.AssociationEnd;
import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.AssociationEndImpl#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.AssociationEndImpl#getReferences <em>References</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.AssociationEndImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndImpl extends ConstraintTypeFieldImpl implements AssociationEnd {
	/**
	 * The default value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposition = IS_COMPOSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected Entity references;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ASSOCIATION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposition() {
		return isComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposition(boolean newIsComposition) {
		boolean oldIsComposition = isComposition;
		isComposition = newIsComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION_END__IS_COMPOSITION, oldIsComposition, isComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (Entity)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ASSOCIATION_END__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Entity newReferences) {
		Entity oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION_END__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ASSOCIATION_END__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ASSOCIATION_END__IS_COMPOSITION:
				return isIsComposition();
			case DomainPackage.ASSOCIATION_END__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
			case DomainPackage.ASSOCIATION_END__UNIQUE:
				return isUnique();
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
			case DomainPackage.ASSOCIATION_END__IS_COMPOSITION:
				setIsComposition((Boolean)newValue);
				return;
			case DomainPackage.ASSOCIATION_END__REFERENCES:
				setReferences((Entity)newValue);
				return;
			case DomainPackage.ASSOCIATION_END__UNIQUE:
				setUnique((Boolean)newValue);
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
			case DomainPackage.ASSOCIATION_END__IS_COMPOSITION:
				setIsComposition(IS_COMPOSITION_EDEFAULT);
				return;
			case DomainPackage.ASSOCIATION_END__REFERENCES:
				setReferences((Entity)null);
				return;
			case DomainPackage.ASSOCIATION_END__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case DomainPackage.ASSOCIATION_END__IS_COMPOSITION:
				return isComposition != IS_COMPOSITION_EDEFAULT;
			case DomainPackage.ASSOCIATION_END__REFERENCES:
				return references != null;
			case DomainPackage.ASSOCIATION_END__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
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
		result.append(" (isComposition: ");
		result.append(isComposition);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //AssociationEndImpl
