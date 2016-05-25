/**
 */
package io.yaktor.conversation.util;

import io.yaktor.conversation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see io.yaktor.conversation.ConversationPackage
 * @generated
 */
public class ConversationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConversationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationSwitch() {
		if (modelPackage == null) {
			modelPackage = ConversationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConversationPackage.CONVERSATION: {
				Conversation conversation = (Conversation)theEObject;
				T result = caseConversation(conversation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.STATE_MACHINE: {
				StateMachine stateMachine = (StateMachine)theEObject;
				T result = caseStateMachine(stateMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseState(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.SUBSCRIBABLE_BY_OTHERS: {
				SubscribableByOthers subscribableByOthers = (SubscribableByOthers)theEObject;
				T result = caseSubscribableByOthers(subscribableByOthers);
				if (result == null) result = caseEvent(subscribableByOthers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PUBLISHABLE_BY_OTHERS: {
				PublishableByOthers publishableByOthers = (PublishableByOthers)theEObject;
				T result = casePublishableByOthers(publishableByOthers);
				if (result == null) result = caseEvent(publishableByOthers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.SUBSCRIBABLE_BY_ME: {
				SubscribableByMe subscribableByMe = (SubscribableByMe)theEObject;
				T result = caseSubscribableByMe(subscribableByMe);
				if (result == null) result = caseEvent(subscribableByMe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PUBLISHABLE_BY_ME: {
				PublishableByMe publishableByMe = (PublishableByMe)theEObject;
				T result = casePublishableByMe(publishableByMe);
				if (result == null) result = caseEvent(publishableByMe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PUBLIC_EVENT: {
				PublicEvent publicEvent = (PublicEvent)theEObject;
				T result = casePublicEvent(publicEvent);
				if (result == null) result = caseEvent(publicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PUBLICLY_PUBLISHABLE: {
				PubliclyPublishable publiclyPublishable = (PubliclyPublishable)theEObject;
				T result = casePubliclyPublishable(publiclyPublishable);
				if (result == null) result = caseSubscribableByMe(publiclyPublishable);
				if (result == null) result = casePublishableByOthers(publiclyPublishable);
				if (result == null) result = casePublicEvent(publiclyPublishable);
				if (result == null) result = caseEvent(publiclyPublishable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PUBLICLY_SUBSCRIBABLE: {
				PubliclySubscribable publiclySubscribable = (PubliclySubscribable)theEObject;
				T result = casePubliclySubscribable(publiclySubscribable);
				if (result == null) result = casePublishableByMe(publiclySubscribable);
				if (result == null) result = caseSubscribableByOthers(publiclySubscribable);
				if (result == null) result = casePublicEvent(publiclySubscribable);
				if (result == null) result = caseEvent(publiclySubscribable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PRIVATE_PUB_SUB: {
				PrivatePubSub privatePubSub = (PrivatePubSub)theEObject;
				T result = casePrivatePubSub(privatePubSub);
				if (result == null) result = casePublishableByMe(privatePubSub);
				if (result == null) result = caseSubscribableByMe(privatePubSub);
				if (result == null) result = caseEvent(privatePubSub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.PUBLIC_PUB_SUB: {
				PublicPubSub publicPubSub = (PublicPubSub)theEObject;
				T result = casePublicPubSub(publicPubSub);
				if (result == null) result = casePubliclyPublishable(publicPubSub);
				if (result == null) result = casePubliclySubscribable(publicPubSub);
				if (result == null) result = caseSubscribableByMe(publicPubSub);
				if (result == null) result = casePublishableByOthers(publicPubSub);
				if (result == null) result = casePublicEvent(publicPubSub);
				if (result == null) result = casePublishableByMe(publicPubSub);
				if (result == null) result = caseSubscribableByOthers(publicPubSub);
				if (result == null) result = caseEvent(publicPubSub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.AGENT_IMPORT: {
				AgentImport agentImport = (AgentImport)theEObject;
				T result = caseAgentImport(agentImport);
				if (result == null) result = caseImport(agentImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.TYPE_IMPORT: {
				TypeImport typeImport = (TypeImport)theEObject;
				T result = caseTypeImport(typeImport);
				if (result == null) result = caseImport(typeImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseState(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConversationPackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversation(Conversation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateMachine(StateMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribable By Others</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribable By Others</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribableByOthers(SubscribableByOthers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable By Others</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable By Others</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableByOthers(PublishableByOthers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subscribable By Me</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subscribable By Me</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubscribableByMe(SubscribableByMe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable By Me</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable By Me</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableByMe(PublishableByMe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicEvent(PublicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publicly Publishable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publicly Publishable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubliclyPublishable(PubliclyPublishable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publicly Subscribable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publicly Subscribable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePubliclySubscribable(PubliclySubscribable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Pub Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Pub Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivatePubSub(PrivatePubSub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Pub Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Pub Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicPubSub(PublicPubSub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentImport(AgentImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeImport(TypeImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConversationSwitch
