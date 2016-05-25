/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConversationFactoryImpl extends EFactoryImpl implements ConversationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConversationFactory init() {
		try {
			ConversationFactory theConversationFactory = (ConversationFactory)EPackage.Registry.INSTANCE.getEFactory(ConversationPackage.eNS_URI);
			if (theConversationFactory != null) {
				return theConversationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConversationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConversationPackage.CONVERSATION: return createConversation();
			case ConversationPackage.AGENT: return createAgent();
			case ConversationPackage.STATE_MACHINE: return createStateMachine();
			case ConversationPackage.STATE: return createState();
			case ConversationPackage.DECISION: return createDecision();
			case ConversationPackage.TRANSITION: return createTransition();
			case ConversationPackage.PUBLICLY_PUBLISHABLE: return createPubliclyPublishable();
			case ConversationPackage.PUBLICLY_SUBSCRIBABLE: return createPubliclySubscribable();
			case ConversationPackage.PRIVATE_PUB_SUB: return createPrivatePubSub();
			case ConversationPackage.PUBLIC_PUB_SUB: return createPublicPubSub();
			case ConversationPackage.AGENT_IMPORT: return createAgentImport();
			case ConversationPackage.TYPE_IMPORT: return createTypeImport();
			case ConversationPackage.IMPORT: return createImport();
			case ConversationPackage.JOIN: return createJoin();
			case ConversationPackage.JUNCTION: return createJunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConversationPackage.STATE_MACHINE_TYPE:
				return createStateMachineTypeFromString(eDataType, initialValue);
			case ConversationPackage.CONNECTION_TYPE:
				return createConnectionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConversationPackage.STATE_MACHINE_TYPE:
				return convertStateMachineTypeToString(eDataType, instanceValue);
			case ConversationPackage.CONNECTION_TYPE:
				return convertConnectionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation createConversation() {
		ConversationImpl conversation = new ConversationImpl();
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubliclyPublishable createPubliclyPublishable() {
		PubliclyPublishableImpl publiclyPublishable = new PubliclyPublishableImpl();
		return publiclyPublishable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PubliclySubscribable createPubliclySubscribable() {
		PubliclySubscribableImpl publiclySubscribable = new PubliclySubscribableImpl();
		return publiclySubscribable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePubSub createPrivatePubSub() {
		PrivatePubSubImpl privatePubSub = new PrivatePubSubImpl();
		return privatePubSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicPubSub createPublicPubSub() {
		PublicPubSubImpl publicPubSub = new PublicPubSubImpl();
		return publicPubSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentImport createAgentImport() {
		AgentImportImpl agentImport = new AgentImportImpl();
		return agentImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeImport createTypeImport() {
		TypeImportImpl typeImport = new TypeImportImpl();
		return typeImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineType createStateMachineTypeFromString(EDataType eDataType, String initialValue) {
		StateMachineType result = StateMachineType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateMachineTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionType result = ConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationPackage getConversationPackage() {
		return (ConversationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConversationPackage getPackage() {
		return ConversationPackage.eINSTANCE;
	}

} //ConversationFactoryImpl
