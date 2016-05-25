/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.GenerationInclusion;
import io.yaktor.domain.JpaGenOptions;
import io.yaktor.domain.JpaTableOptions;
import io.yaktor.domain.PersistenceOptions;
import io.yaktor.domain.ProjectOptions;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jpa Gen Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.JpaGenOptionsImpl#getProject <em>Project</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.JpaGenOptionsImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.JpaGenOptionsImpl#getGenerationInclusion <em>Generation Inclusion</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.JpaGenOptionsImpl#isUseAspects <em>Use Aspects</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.JpaGenOptionsImpl#isMetaData <em>Meta Data</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.JpaGenOptionsImpl#getTableOptions <em>Table Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JpaGenOptionsImpl extends GenOptionsImpl implements JpaGenOptions {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected ProjectOptions project;

	/**
	 * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistence()
	 * @generated
	 * @ordered
	 */
	protected PersistenceOptions persistence;

	/**
	 * The cached value of the '{@link #getGenerationInclusion() <em>Generation Inclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationInclusion()
	 * @generated
	 * @ordered
	 */
	protected GenerationInclusion generationInclusion;

	/**
	 * The default value of the '{@link #isUseAspects() <em>Use Aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAspects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ASPECTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAspects() <em>Use Aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAspects()
	 * @generated
	 * @ordered
	 */
	protected boolean useAspects = USE_ASPECTS_EDEFAULT;

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
	 * The cached value of the '{@link #getTableOptions() <em>Table Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<JpaTableOptions> tableOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JpaGenOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.JPA_GEN_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectOptions getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(ProjectOptions newProject, NotificationChain msgs) {
		ProjectOptions oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(ProjectOptions newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.JPA_GEN_OPTIONS__PROJECT, null, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.JPA_GEN_OPTIONS__PROJECT, null, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceOptions getPersistence() {
		return persistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistence(PersistenceOptions newPersistence, NotificationChain msgs) {
		PersistenceOptions oldPersistence = persistence;
		persistence = newPersistence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE, oldPersistence, newPersistence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistence(PersistenceOptions newPersistence) {
		if (newPersistence != persistence) {
			NotificationChain msgs = null;
			if (persistence != null)
				msgs = ((InternalEObject)persistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE, null, msgs);
			if (newPersistence != null)
				msgs = ((InternalEObject)newPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE, null, msgs);
			msgs = basicSetPersistence(newPersistence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE, newPersistence, newPersistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationInclusion getGenerationInclusion() {
		return generationInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationInclusion(GenerationInclusion newGenerationInclusion, NotificationChain msgs) {
		GenerationInclusion oldGenerationInclusion = generationInclusion;
		generationInclusion = newGenerationInclusion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION, oldGenerationInclusion, newGenerationInclusion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationInclusion(GenerationInclusion newGenerationInclusion) {
		if (newGenerationInclusion != generationInclusion) {
			NotificationChain msgs = null;
			if (generationInclusion != null)
				msgs = ((InternalEObject)generationInclusion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION, null, msgs);
			if (newGenerationInclusion != null)
				msgs = ((InternalEObject)newGenerationInclusion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION, null, msgs);
			msgs = basicSetGenerationInclusion(newGenerationInclusion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION, newGenerationInclusion, newGenerationInclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseAspects() {
		return useAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseAspects(boolean newUseAspects) {
		boolean oldUseAspects = useAspects;
		useAspects = newUseAspects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__USE_ASPECTS, oldUseAspects, useAspects));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.JPA_GEN_OPTIONS__META_DATA, oldMetaData, metaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JpaTableOptions> getTableOptions() {
		if (tableOptions == null) {
			tableOptions = new EObjectContainmentEList<JpaTableOptions>(JpaTableOptions.class, this, DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS);
		}
		return tableOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.JPA_GEN_OPTIONS__PROJECT:
				return basicSetProject(null, msgs);
			case DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE:
				return basicSetPersistence(null, msgs);
			case DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION:
				return basicSetGenerationInclusion(null, msgs);
			case DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS:
				return ((InternalEList<?>)getTableOptions()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.JPA_GEN_OPTIONS__PROJECT:
				return getProject();
			case DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE:
				return getPersistence();
			case DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION:
				return getGenerationInclusion();
			case DomainPackage.JPA_GEN_OPTIONS__USE_ASPECTS:
				return isUseAspects();
			case DomainPackage.JPA_GEN_OPTIONS__META_DATA:
				return isMetaData();
			case DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS:
				return getTableOptions();
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
			case DomainPackage.JPA_GEN_OPTIONS__PROJECT:
				setProject((ProjectOptions)newValue);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE:
				setPersistence((PersistenceOptions)newValue);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION:
				setGenerationInclusion((GenerationInclusion)newValue);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__USE_ASPECTS:
				setUseAspects((Boolean)newValue);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__META_DATA:
				setMetaData((Boolean)newValue);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS:
				getTableOptions().clear();
				getTableOptions().addAll((Collection<? extends JpaTableOptions>)newValue);
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
			case DomainPackage.JPA_GEN_OPTIONS__PROJECT:
				setProject((ProjectOptions)null);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE:
				setPersistence((PersistenceOptions)null);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION:
				setGenerationInclusion((GenerationInclusion)null);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__USE_ASPECTS:
				setUseAspects(USE_ASPECTS_EDEFAULT);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__META_DATA:
				setMetaData(META_DATA_EDEFAULT);
				return;
			case DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS:
				getTableOptions().clear();
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
			case DomainPackage.JPA_GEN_OPTIONS__PROJECT:
				return project != null;
			case DomainPackage.JPA_GEN_OPTIONS__PERSISTENCE:
				return persistence != null;
			case DomainPackage.JPA_GEN_OPTIONS__GENERATION_INCLUSION:
				return generationInclusion != null;
			case DomainPackage.JPA_GEN_OPTIONS__USE_ASPECTS:
				return useAspects != USE_ASPECTS_EDEFAULT;
			case DomainPackage.JPA_GEN_OPTIONS__META_DATA:
				return metaData != META_DATA_EDEFAULT;
			case DomainPackage.JPA_GEN_OPTIONS__TABLE_OPTIONS:
				return tableOptions != null && !tableOptions.isEmpty();
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
		result.append(" (useAspects: ");
		result.append(useAspects);
		result.append(", metaData: ");
		result.append(metaData);
		result.append(')');
		return result.toString();
	}

} //JpaGenOptionsImpl
