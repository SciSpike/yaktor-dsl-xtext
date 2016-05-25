/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.Field;
import io.yaktor.domain.IndexConstraint;
import io.yaktor.domain.TableType;
import io.yaktor.domain.UniqueConstraint;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#getUniqueConstraints <em>Unique Constraints</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#isMetaData <em>Meta Data</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#getIndexConstraints <em>Index Constraints</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.TableTypeImpl#getKeys <em>Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableTypeImpl extends NamedTypeImpl implements TableType {
  
  public static Map<String, Set<TableType>> SUBTYPES = new HashMap<String, Set<TableType>>();
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getSupertype() <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertype()
	 * @generated
	 * @ordered
	 */
	protected TableType supertype;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUniqueConstraints() <em>Unique Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<UniqueConstraint> uniqueConstraints;

	/**
	 * The default value of the '{@link #isMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetaData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean META_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMetaData() <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetaData()
	 * @generated
	 * @ordered
	 */
	protected boolean metaData = META_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndexConstraints() <em>Index Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexConstraint> indexConstraints;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> keys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.TABLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, DomainPackage.TABLE_TYPE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType getSupertype() {
		if (supertype != null && supertype.eIsProxy()) {
			InternalEObject oldSupertype = (InternalEObject)supertype;
			supertype = (TableType)eResolveProxy(oldSupertype);
			if (supertype != oldSupertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.TABLE_TYPE__SUPERTYPE, oldSupertype, supertype));
			}
		}
		return supertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType basicGetSupertype() {
		return supertype;
	}

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * 
   */
	public void setSupertype(TableType newSupertype) {
	//UGLY logic for faking subTypes
	if(supertype!=null&&supertype.getModel()!=null&&supertype!=newSupertype){
	  String key = supertype.getModel().getName()+"."+supertype.getName();
	  SUBTYPES.get(key).remove(this);
	}
	if(newSupertype!=null&&newSupertype.getModel()!=null){
	  String key = 
	      newSupertype.getModel().getName()+"."+newSupertype.getName();
	  Set<TableType> tt = SUBTYPES.containsKey(key)?SUBTYPES.get(key):new HashSet<TableType>();
	  tt.add(this);
	  SUBTYPES.put(key, tt);
	}
	//END UGLY
    TableType oldSupertype = supertype;
    supertype = newSupertype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TABLE_TYPE__SUPERTYPE, oldSupertype, supertype));
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TABLE_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniqueConstraint> getUniqueConstraints() {
		if (uniqueConstraints == null) {
			uniqueConstraints = new EObjectContainmentEList<UniqueConstraint>(UniqueConstraint.class, this, DomainPackage.TABLE_TYPE__UNIQUE_CONSTRAINTS);
		}
		return uniqueConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(boolean newMetaData) {
		boolean oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.TABLE_TYPE__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexConstraint> getIndexConstraints() {
		if (indexConstraints == null) {
			indexConstraints = new EObjectContainmentEList<IndexConstraint>(IndexConstraint.class, this, DomainPackage.TABLE_TYPE__INDEX_CONSTRAINTS);
		}
		return indexConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getKeys() {
		if (keys == null) {
			keys = new EObjectResolvingEList<Field>(Field.class, this, DomainPackage.TABLE_TYPE__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.TABLE_TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case DomainPackage.TABLE_TYPE__UNIQUE_CONSTRAINTS:
				return ((InternalEList<?>)getUniqueConstraints()).basicRemove(otherEnd, msgs);
			case DomainPackage.TABLE_TYPE__INDEX_CONSTRAINTS:
				return ((InternalEList<?>)getIndexConstraints()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.TABLE_TYPE__FIELDS:
				return getFields();
			case DomainPackage.TABLE_TYPE__SUPERTYPE:
				if (resolve) return getSupertype();
				return basicGetSupertype();
			case DomainPackage.TABLE_TYPE__IS_ABSTRACT:
				return isIsAbstract();
			case DomainPackage.TABLE_TYPE__UNIQUE_CONSTRAINTS:
				return getUniqueConstraints();
			case DomainPackage.TABLE_TYPE__META_DATA:
				return isMetaData();
			case DomainPackage.TABLE_TYPE__INDEX_CONSTRAINTS:
				return getIndexConstraints();
			case DomainPackage.TABLE_TYPE__KEYS:
				return getKeys();
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
			case DomainPackage.TABLE_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case DomainPackage.TABLE_TYPE__SUPERTYPE:
				setSupertype((TableType)newValue);
				return;
			case DomainPackage.TABLE_TYPE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case DomainPackage.TABLE_TYPE__UNIQUE_CONSTRAINTS:
				getUniqueConstraints().clear();
				getUniqueConstraints().addAll((Collection<? extends UniqueConstraint>)newValue);
				return;
			case DomainPackage.TABLE_TYPE__META_DATA:
				setMetaData((Boolean)newValue);
				return;
			case DomainPackage.TABLE_TYPE__INDEX_CONSTRAINTS:
				getIndexConstraints().clear();
				getIndexConstraints().addAll((Collection<? extends IndexConstraint>)newValue);
				return;
			case DomainPackage.TABLE_TYPE__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Field>)newValue);
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
			case DomainPackage.TABLE_TYPE__FIELDS:
				getFields().clear();
				return;
			case DomainPackage.TABLE_TYPE__SUPERTYPE:
				setSupertype((TableType)null);
				return;
			case DomainPackage.TABLE_TYPE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case DomainPackage.TABLE_TYPE__UNIQUE_CONSTRAINTS:
				getUniqueConstraints().clear();
				return;
			case DomainPackage.TABLE_TYPE__META_DATA:
				setMetaData(META_DATA_EDEFAULT);
				return;
			case DomainPackage.TABLE_TYPE__INDEX_CONSTRAINTS:
				getIndexConstraints().clear();
				return;
			case DomainPackage.TABLE_TYPE__KEYS:
				getKeys().clear();
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
			case DomainPackage.TABLE_TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case DomainPackage.TABLE_TYPE__SUPERTYPE:
				return supertype != null;
			case DomainPackage.TABLE_TYPE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case DomainPackage.TABLE_TYPE__UNIQUE_CONSTRAINTS:
				return uniqueConstraints != null && !uniqueConstraints.isEmpty();
			case DomainPackage.TABLE_TYPE__META_DATA:
				return metaData != META_DATA_EDEFAULT;
			case DomainPackage.TABLE_TYPE__INDEX_CONSTRAINTS:
				return indexConstraints != null && !indexConstraints.isEmpty();
			case DomainPackage.TABLE_TYPE__KEYS:
				return keys != null && !keys.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", metaData: ");
		result.append(metaData);
		result.append(')');
		return result.toString();
	}

} //TableTypeImpl
