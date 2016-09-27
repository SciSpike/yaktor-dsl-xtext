/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.access.RestService;
import io.yaktor.access.Service;
import io.yaktor.access.View;
import io.yaktor.conversation.Agent;
import io.yaktor.conversation.AgentImport;
import io.yaktor.conversation.Conversation;
import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.TypeImport;
import io.yaktor.types.Projection;

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
 * An implementation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getRestServices <em>Rest Services</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getImportedAgents <em>Imported Agents</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.ConversationImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationImpl extends MinimalEObjectImpl.Container implements Conversation {
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
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<Agent> agents;

	/**
	 * The cached value of the '{@link #getDefinedTypes() <em>Defined Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Projection> definedTypes;

	/**
	 * The cached value of the '{@link #getRestServices() <em>Rest Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestServices()
	 * @generated
	 * @ordered
	 */
	protected EList<RestService> restServices;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getImportedTypes() <em>Imported Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeImport> importedTypes;

	/**
	 * The cached value of the '{@link #getImportedAgents() <em>Imported Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentImport> importedAgents;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.CONVERSATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.CONVERSATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Agent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentWithInverseEList<Agent>(Agent.class, this, ConversationPackage.CONVERSATION__AGENTS, ConversationPackage.AGENT__PARENT);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projection> getDefinedTypes() {
		if (definedTypes == null) {
			definedTypes = new EObjectContainmentEList<Projection>(Projection.class, this, ConversationPackage.CONVERSATION__DEFINED_TYPES);
		}
		return definedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestService> getRestServices() {
		if (restServices == null) {
			restServices = new EObjectContainmentEList<RestService>(RestService.class, this, ConversationPackage.CONVERSATION__REST_SERVICES);
		}
		return restServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, ConversationPackage.CONVERSATION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeImport> getImportedTypes() {
		if (importedTypes == null) {
			importedTypes = new EObjectContainmentEList<TypeImport>(TypeImport.class, this, ConversationPackage.CONVERSATION__IMPORTED_TYPES);
		}
		return importedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentImport> getImportedAgents() {
		if (importedAgents == null) {
			importedAgents = new EObjectContainmentEList<AgentImport>(AgentImport.class, this, ConversationPackage.CONVERSATION__IMPORTED_AGENTS);
		}
		return importedAgents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, ConversationPackage.CONVERSATION__VIEWS);
		}
		return views;
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
			case ConversationPackage.CONVERSATION__AGENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAgents()).basicAdd(otherEnd, msgs);
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
			case ConversationPackage.CONVERSATION__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case ConversationPackage.CONVERSATION__DEFINED_TYPES:
				return ((InternalEList<?>)getDefinedTypes()).basicRemove(otherEnd, msgs);
			case ConversationPackage.CONVERSATION__REST_SERVICES:
				return ((InternalEList<?>)getRestServices()).basicRemove(otherEnd, msgs);
			case ConversationPackage.CONVERSATION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ConversationPackage.CONVERSATION__IMPORTED_TYPES:
				return ((InternalEList<?>)getImportedTypes()).basicRemove(otherEnd, msgs);
			case ConversationPackage.CONVERSATION__IMPORTED_AGENTS:
				return ((InternalEList<?>)getImportedAgents()).basicRemove(otherEnd, msgs);
			case ConversationPackage.CONVERSATION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case ConversationPackage.CONVERSATION__NAME:
				return getName();
			case ConversationPackage.CONVERSATION__AGENTS:
				return getAgents();
			case ConversationPackage.CONVERSATION__DEFINED_TYPES:
				return getDefinedTypes();
			case ConversationPackage.CONVERSATION__REST_SERVICES:
				return getRestServices();
			case ConversationPackage.CONVERSATION__SERVICES:
				return getServices();
			case ConversationPackage.CONVERSATION__IMPORTED_TYPES:
				return getImportedTypes();
			case ConversationPackage.CONVERSATION__IMPORTED_AGENTS:
				return getImportedAgents();
			case ConversationPackage.CONVERSATION__VIEWS:
				return getViews();
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
			case ConversationPackage.CONVERSATION__NAME:
				setName((String)newValue);
				return;
			case ConversationPackage.CONVERSATION__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case ConversationPackage.CONVERSATION__DEFINED_TYPES:
				getDefinedTypes().clear();
				getDefinedTypes().addAll((Collection<? extends Projection>)newValue);
				return;
			case ConversationPackage.CONVERSATION__REST_SERVICES:
				getRestServices().clear();
				getRestServices().addAll((Collection<? extends RestService>)newValue);
				return;
			case ConversationPackage.CONVERSATION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ConversationPackage.CONVERSATION__IMPORTED_TYPES:
				getImportedTypes().clear();
				getImportedTypes().addAll((Collection<? extends TypeImport>)newValue);
				return;
			case ConversationPackage.CONVERSATION__IMPORTED_AGENTS:
				getImportedAgents().clear();
				getImportedAgents().addAll((Collection<? extends AgentImport>)newValue);
				return;
			case ConversationPackage.CONVERSATION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
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
			case ConversationPackage.CONVERSATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConversationPackage.CONVERSATION__AGENTS:
				getAgents().clear();
				return;
			case ConversationPackage.CONVERSATION__DEFINED_TYPES:
				getDefinedTypes().clear();
				return;
			case ConversationPackage.CONVERSATION__REST_SERVICES:
				getRestServices().clear();
				return;
			case ConversationPackage.CONVERSATION__SERVICES:
				getServices().clear();
				return;
			case ConversationPackage.CONVERSATION__IMPORTED_TYPES:
				getImportedTypes().clear();
				return;
			case ConversationPackage.CONVERSATION__IMPORTED_AGENTS:
				getImportedAgents().clear();
				return;
			case ConversationPackage.CONVERSATION__VIEWS:
				getViews().clear();
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
			case ConversationPackage.CONVERSATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConversationPackage.CONVERSATION__AGENTS:
				return agents != null && !agents.isEmpty();
			case ConversationPackage.CONVERSATION__DEFINED_TYPES:
				return definedTypes != null && !definedTypes.isEmpty();
			case ConversationPackage.CONVERSATION__REST_SERVICES:
				return restServices != null && !restServices.isEmpty();
			case ConversationPackage.CONVERSATION__SERVICES:
				return services != null && !services.isEmpty();
			case ConversationPackage.CONVERSATION__IMPORTED_TYPES:
				return importedTypes != null && !importedTypes.isEmpty();
			case ConversationPackage.CONVERSATION__IMPORTED_AGENTS:
				return importedAgents != null && !importedAgents.isEmpty();
			case ConversationPackage.CONVERSATION__VIEWS:
				return views != null && !views.isEmpty();
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

} //ConversationImpl
