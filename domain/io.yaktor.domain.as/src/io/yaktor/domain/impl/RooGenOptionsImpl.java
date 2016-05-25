/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.PersistenceOptions;
import io.yaktor.domain.ProjectOptions;
import io.yaktor.domain.RooGenOptions;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roo Gen Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.RooGenOptionsImpl#getProject <em>Project</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.RooGenOptionsImpl#getPersistence <em>Persistence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RooGenOptionsImpl extends GenOptionsImpl implements RooGenOptions {
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RooGenOptionsImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return DomainPackage.Literals.ROO_GEN_OPTIONS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ROO_GEN_OPTIONS__PROJECT, oldProject, newProject);
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
				msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ROO_GEN_OPTIONS__PROJECT, null, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ROO_GEN_OPTIONS__PROJECT, null, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROO_GEN_OPTIONS__PROJECT, newProject, newProject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE, oldPersistence, newPersistence);
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
				msgs = ((InternalEObject)persistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE, null, msgs);
			if (newPersistence != null)
				msgs = ((InternalEObject)newPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE, null, msgs);
			msgs = basicSetPersistence(newPersistence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE, newPersistence, newPersistence));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.ROO_GEN_OPTIONS__PROJECT:
				return basicSetProject(null, msgs);
			case DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE:
				return basicSetPersistence(null, msgs);
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
			case DomainPackage.ROO_GEN_OPTIONS__PROJECT:
				return getProject();
			case DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE:
				return getPersistence();
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
			case DomainPackage.ROO_GEN_OPTIONS__PROJECT:
				setProject((ProjectOptions)newValue);
				return;
			case DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE:
				setPersistence((PersistenceOptions)newValue);
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
			case DomainPackage.ROO_GEN_OPTIONS__PROJECT:
				setProject((ProjectOptions)null);
				return;
			case DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE:
				setPersistence((PersistenceOptions)null);
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
			case DomainPackage.ROO_GEN_OPTIONS__PROJECT:
				return project != null;
			case DomainPackage.ROO_GEN_OPTIONS__PERSISTENCE:
				return persistence != null;
		}
		return super.eIsSet(featureID);
	}

} //RooGenOptionsImpl
