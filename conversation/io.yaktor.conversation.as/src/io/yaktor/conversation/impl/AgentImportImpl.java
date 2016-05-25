/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.Agent;
import io.yaktor.conversation.AgentImport;
import io.yaktor.conversation.ConversationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.AgentImportImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImportImpl extends ImportImpl implements AgentImport {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.AGENT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject)agent;
			agent = (Agent)eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.AGENT_IMPORT__AGENT, oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.AGENT_IMPORT__AGENT, oldAgent, agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationPackage.AGENT_IMPORT__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
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
			case ConversationPackage.AGENT_IMPORT__AGENT:
				setAgent((Agent)newValue);
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
			case ConversationPackage.AGENT_IMPORT__AGENT:
				setAgent((Agent)null);
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
			case ConversationPackage.AGENT_IMPORT__AGENT:
				return agent != null;
		}
		return super.eIsSet(featureID);
	}

} //AgentImportImpl
