/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.access.AccessRequirement;
import io.yaktor.conversation.Agent;
import io.yaktor.conversation.ConnectionType;
import io.yaktor.conversation.Conversation;
import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.Event;
import io.yaktor.conversation.StateMachine;
import io.yaktor.conversation.StateMachineType;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getStateMachineType <em>State Machine Type</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.AgentImpl#getAccessRequirement <em>Access Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent {
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
	 * The cached value of the '{@link #getDefinedTypes() <em>Defined Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Projection> definedTypes;

	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine stateMachine;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The default value of the '{@link #getStateMachineType() <em>State Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineType()
	 * @generated
	 * @ordered
	 */
	protected static final StateMachineType STATE_MACHINE_TYPE_EDEFAULT = StateMachineType.FINITE;

	/**
	 * The cached value of the '{@link #getStateMachineType() <em>State Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachineType()
	 * @generated
	 * @ordered
	 */
	protected StateMachineType stateMachineType = STATE_MACHINE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionType CONNECTION_TYPE_EDEFAULT = ConnectionType.INDEPENDENT;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectionType = CONNECTION_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getAccessRequirement() <em>Access Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final AccessRequirement ACCESS_REQUIREMENT_EDEFAULT = AccessRequirement.DEFAULT;

	/**
	 * The cached value of the '{@link #getAccessRequirement() <em>Access Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRequirement()
	 * @generated
	 * @ordered
	 */
	protected AccessRequirement accessRequirement = ACCESS_REQUIREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.AGENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Projection> getDefinedTypes() {
		if (definedTypes == null) {
			definedTypes = new EObjectContainmentEList<Projection>(Projection.class, this, ConversationPackage.AGENT__DEFINED_TYPES);
		}
		return definedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		StateMachine oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__STATE_MACHINE, oldStateMachine, newStateMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != stateMachine) {
			NotificationChain msgs = null;
			if (stateMachine != null)
				msgs = ((InternalEObject)stateMachine).eInverseRemove(this, ConversationPackage.STATE_MACHINE__PARENT, StateMachine.class, msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, ConversationPackage.STATE_MACHINE__PARENT, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentWithInverseEList<Event>(Event.class, this, ConversationPackage.AGENT__EVENTS, ConversationPackage.EVENT__PARENT);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation getParent() {
		if (eContainerFeatureID() != ConversationPackage.AGENT__PARENT) return null;
		return (Conversation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Conversation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ConversationPackage.AGENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Conversation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ConversationPackage.AGENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ConversationPackage.CONVERSATION__AGENTS, Conversation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineType getStateMachineType() {
		return stateMachineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachineType(StateMachineType newStateMachineType) {
		StateMachineType oldStateMachineType = stateMachineType;
		stateMachineType = newStateMachineType == null ? STATE_MACHINE_TYPE_EDEFAULT : newStateMachineType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__STATE_MACHINE_TYPE, oldStateMachineType, stateMachineType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionType(ConnectionType newConnectionType) {
		ConnectionType oldConnectionType = connectionType;
		connectionType = newConnectionType == null ? CONNECTION_TYPE_EDEFAULT : newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__CONNECTION_TYPE, oldConnectionType, connectionType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.AGENT__PROJECTION, oldProjection, projection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__PROJECTION, oldProjection, projection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessRequirement getAccessRequirement() {
		return accessRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRequirement(AccessRequirement newAccessRequirement) {
		AccessRequirement oldAccessRequirement = accessRequirement;
		accessRequirement = newAccessRequirement == null ? ACCESS_REQUIREMENT_EDEFAULT : newAccessRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT__ACCESS_REQUIREMENT, oldAccessRequirement, accessRequirement));
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
			case ConversationPackage.AGENT__STATE_MACHINE:
				if (stateMachine != null)
					msgs = ((InternalEObject)stateMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationPackage.AGENT__STATE_MACHINE, null, msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
			case ConversationPackage.AGENT__EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvents()).basicAdd(otherEnd, msgs);
			case ConversationPackage.AGENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Conversation)otherEnd, msgs);
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
			case ConversationPackage.AGENT__DEFINED_TYPES:
				return ((InternalEList<?>)getDefinedTypes()).basicRemove(otherEnd, msgs);
			case ConversationPackage.AGENT__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case ConversationPackage.AGENT__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ConversationPackage.AGENT__PARENT:
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
			case ConversationPackage.AGENT__PARENT:
				return eInternalContainer().eInverseRemove(this, ConversationPackage.CONVERSATION__AGENTS, Conversation.class, msgs);
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
			case ConversationPackage.AGENT__NAME:
				return getName();
			case ConversationPackage.AGENT__DEFINED_TYPES:
				return getDefinedTypes();
			case ConversationPackage.AGENT__STATE_MACHINE:
				return getStateMachine();
			case ConversationPackage.AGENT__EVENTS:
				return getEvents();
			case ConversationPackage.AGENT__PARENT:
				return getParent();
			case ConversationPackage.AGENT__STATE_MACHINE_TYPE:
				return getStateMachineType();
			case ConversationPackage.AGENT__CONNECTION_TYPE:
				return getConnectionType();
			case ConversationPackage.AGENT__PROJECTION:
				if (resolve) return getProjection();
				return basicGetProjection();
			case ConversationPackage.AGENT__ACCESS_REQUIREMENT:
				return getAccessRequirement();
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
			case ConversationPackage.AGENT__NAME:
				setName((String)newValue);
				return;
			case ConversationPackage.AGENT__DEFINED_TYPES:
				getDefinedTypes().clear();
				getDefinedTypes().addAll((Collection<? extends Projection>)newValue);
				return;
			case ConversationPackage.AGENT__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case ConversationPackage.AGENT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ConversationPackage.AGENT__PARENT:
				setParent((Conversation)newValue);
				return;
			case ConversationPackage.AGENT__STATE_MACHINE_TYPE:
				setStateMachineType((StateMachineType)newValue);
				return;
			case ConversationPackage.AGENT__CONNECTION_TYPE:
				setConnectionType((ConnectionType)newValue);
				return;
			case ConversationPackage.AGENT__PROJECTION:
				setProjection((Projection)newValue);
				return;
			case ConversationPackage.AGENT__ACCESS_REQUIREMENT:
				setAccessRequirement((AccessRequirement)newValue);
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
			case ConversationPackage.AGENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConversationPackage.AGENT__DEFINED_TYPES:
				getDefinedTypes().clear();
				return;
			case ConversationPackage.AGENT__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case ConversationPackage.AGENT__EVENTS:
				getEvents().clear();
				return;
			case ConversationPackage.AGENT__PARENT:
				setParent((Conversation)null);
				return;
			case ConversationPackage.AGENT__STATE_MACHINE_TYPE:
				setStateMachineType(STATE_MACHINE_TYPE_EDEFAULT);
				return;
			case ConversationPackage.AGENT__CONNECTION_TYPE:
				setConnectionType(CONNECTION_TYPE_EDEFAULT);
				return;
			case ConversationPackage.AGENT__PROJECTION:
				setProjection((Projection)null);
				return;
			case ConversationPackage.AGENT__ACCESS_REQUIREMENT:
				setAccessRequirement(ACCESS_REQUIREMENT_EDEFAULT);
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
			case ConversationPackage.AGENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConversationPackage.AGENT__DEFINED_TYPES:
				return definedTypes != null && !definedTypes.isEmpty();
			case ConversationPackage.AGENT__STATE_MACHINE:
				return stateMachine != null;
			case ConversationPackage.AGENT__EVENTS:
				return events != null && !events.isEmpty();
			case ConversationPackage.AGENT__PARENT:
				return getParent() != null;
			case ConversationPackage.AGENT__STATE_MACHINE_TYPE:
				return stateMachineType != STATE_MACHINE_TYPE_EDEFAULT;
			case ConversationPackage.AGENT__CONNECTION_TYPE:
				return connectionType != CONNECTION_TYPE_EDEFAULT;
			case ConversationPackage.AGENT__PROJECTION:
				return projection != null;
			case ConversationPackage.AGENT__ACCESS_REQUIREMENT:
				return accessRequirement != ACCESS_REQUIREMENT_EDEFAULT;
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
		result.append(", stateMachineType: ");
		result.append(stateMachineType);
		result.append(", connectionType: ");
		result.append(connectionType);
		result.append(", accessRequirement: ");
		result.append(accessRequirement);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
