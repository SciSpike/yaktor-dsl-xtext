/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.Agent;
import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.State;
import io.yaktor.conversation.StateMachine;
import io.yaktor.conversation.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.StateMachineImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.StateMachineImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.StateMachineImpl#getInitialTransition <em>Initial Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getInitialTransition() <em>Initial Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition initialTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.STATE_MACHINE__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.STATE_MACHINE__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, ConversationPackage.STATE_MACHINE__STATES, ConversationPackage.STATE__PARENT);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getParent() {
		if (eContainerFeatureID() != ConversationPackage.STATE_MACHINE__PARENT) return null;
		return (Agent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Agent newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ConversationPackage.STATE_MACHINE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Agent newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ConversationPackage.STATE_MACHINE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ConversationPackage.AGENT__STATE_MACHINE, Agent.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.STATE_MACHINE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getInitialTransition() {
		return initialTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialTransition(Transition newInitialTransition, NotificationChain msgs) {
		Transition oldInitialTransition = initialTransition;
		initialTransition = newInitialTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION, oldInitialTransition, newInitialTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialTransition(Transition newInitialTransition) {
		if (newInitialTransition != initialTransition) {
			NotificationChain msgs = null;
			if (initialTransition != null)
				msgs = ((InternalEObject)initialTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION, null, msgs);
			if (newInitialTransition != null)
				msgs = ((InternalEObject)newInitialTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION, null, msgs);
			msgs = basicSetInitialTransition(newInitialTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION, newInitialTransition, newInitialTransition));
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
			case ConversationPackage.STATE_MACHINE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case ConversationPackage.STATE_MACHINE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Agent)otherEnd, msgs);
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
			case ConversationPackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ConversationPackage.STATE_MACHINE__PARENT:
				return basicSetParent(null, msgs);
			case ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION:
				return basicSetInitialTransition(null, msgs);
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
			case ConversationPackage.STATE_MACHINE__PARENT:
				return eInternalContainer().eInverseRemove(this, ConversationPackage.AGENT__STATE_MACHINE, Agent.class, msgs);
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
			case ConversationPackage.STATE_MACHINE__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case ConversationPackage.STATE_MACHINE__STATES:
				return getStates();
			case ConversationPackage.STATE_MACHINE__PARENT:
				return getParent();
			case ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION:
				return getInitialTransition();
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
			case ConversationPackage.STATE_MACHINE__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case ConversationPackage.STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ConversationPackage.STATE_MACHINE__PARENT:
				setParent((Agent)newValue);
				return;
			case ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION:
				setInitialTransition((Transition)newValue);
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
			case ConversationPackage.STATE_MACHINE__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case ConversationPackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case ConversationPackage.STATE_MACHINE__PARENT:
				setParent((Agent)null);
				return;
			case ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION:
				setInitialTransition((Transition)null);
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
			case ConversationPackage.STATE_MACHINE__INITIAL_STATE:
				return initialState != null;
			case ConversationPackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case ConversationPackage.STATE_MACHINE__PARENT:
				return getParent() != null;
			case ConversationPackage.STATE_MACHINE__INITIAL_TRANSITION:
				return initialTransition != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
