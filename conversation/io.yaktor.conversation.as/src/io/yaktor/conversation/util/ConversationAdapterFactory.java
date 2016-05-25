/**
 */
package io.yaktor.conversation.util;

import io.yaktor.conversation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.yaktor.conversation.ConversationPackage
 * @generated
 */
public class ConversationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConversationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConversationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConversationSwitch<Adapter> modelSwitch =
		new ConversationSwitch<Adapter>() {
			@Override
			public Adapter caseConversation(Conversation object) {
				return createConversationAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseStateMachine(StateMachine object) {
				return createStateMachineAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseSubscribableByOthers(SubscribableByOthers object) {
				return createSubscribableByOthersAdapter();
			}
			@Override
			public Adapter casePublishableByOthers(PublishableByOthers object) {
				return createPublishableByOthersAdapter();
			}
			@Override
			public Adapter caseSubscribableByMe(SubscribableByMe object) {
				return createSubscribableByMeAdapter();
			}
			@Override
			public Adapter casePublishableByMe(PublishableByMe object) {
				return createPublishableByMeAdapter();
			}
			@Override
			public Adapter casePublicEvent(PublicEvent object) {
				return createPublicEventAdapter();
			}
			@Override
			public Adapter casePubliclyPublishable(PubliclyPublishable object) {
				return createPubliclyPublishableAdapter();
			}
			@Override
			public Adapter casePubliclySubscribable(PubliclySubscribable object) {
				return createPubliclySubscribableAdapter();
			}
			@Override
			public Adapter casePrivatePubSub(PrivatePubSub object) {
				return createPrivatePubSubAdapter();
			}
			@Override
			public Adapter casePublicPubSub(PublicPubSub object) {
				return createPublicPubSubAdapter();
			}
			@Override
			public Adapter caseAgentImport(AgentImport object) {
				return createAgentImportAdapter();
			}
			@Override
			public Adapter caseTypeImport(TypeImport object) {
				return createTypeImportAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseJoin(Join object) {
				return createJoinAdapter();
			}
			@Override
			public Adapter caseJunction(Junction object) {
				return createJunctionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Conversation
	 * @generated
	 */
	public Adapter createConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.StateMachine
	 * @generated
	 */
	public Adapter createStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.SubscribableByOthers <em>Subscribable By Others</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.SubscribableByOthers
	 * @generated
	 */
	public Adapter createSubscribableByOthersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PublishableByOthers <em>Publishable By Others</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PublishableByOthers
	 * @generated
	 */
	public Adapter createPublishableByOthersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.SubscribableByMe <em>Subscribable By Me</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.SubscribableByMe
	 * @generated
	 */
	public Adapter createSubscribableByMeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PublishableByMe <em>Publishable By Me</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PublishableByMe
	 * @generated
	 */
	public Adapter createPublishableByMeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PublicEvent <em>Public Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PublicEvent
	 * @generated
	 */
	public Adapter createPublicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PubliclyPublishable <em>Publicly Publishable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PubliclyPublishable
	 * @generated
	 */
	public Adapter createPubliclyPublishableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PubliclySubscribable <em>Publicly Subscribable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PubliclySubscribable
	 * @generated
	 */
	public Adapter createPubliclySubscribableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PrivatePubSub <em>Private Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PrivatePubSub
	 * @generated
	 */
	public Adapter createPrivatePubSubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.PublicPubSub <em>Public Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.PublicPubSub
	 * @generated
	 */
	public Adapter createPublicPubSubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.AgentImport <em>Agent Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.AgentImport
	 * @generated
	 */
	public Adapter createAgentImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.TypeImport <em>Type Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.TypeImport
	 * @generated
	 */
	public Adapter createTypeImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.conversation.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.conversation.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConversationAdapterFactory
