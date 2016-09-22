/**
 */
package io.yaktor.conversation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.yaktor.conversation.ConversationFactory
 * @model kind="package"
 * @generated
 */
public interface ConversationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conversation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Xtext/io.yaktor.conversation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conversation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConversationPackage eINSTANCE = io.yaktor.conversation.impl.ConversationPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.ConversationImpl <em>Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.ConversationImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getConversation()
	 * @generated
	 */
	int CONVERSATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__AGENTS = 1;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__DEFINED_TYPES = 2;

	/**
	 * The feature id for the '<em><b>Rest Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__REST_SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Imported Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__IMPORTED_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Imported Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__IMPORTED_AGENTS = 6;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__VIEWS = 7;

	/**
	 * The number of structural features of the '<em>Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.AgentImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Defined Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DEFINED_TYPES = 1;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__STATE_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PARENT = 4;

	/**
	 * The feature id for the '<em><b>State Machine Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__STATE_MACHINE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONNECTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PROJECTION = 7;

	/**
	 * The feature id for the '<em><b>Access Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACCESS_REQUIREMENT = 8;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.StateMachineImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INITIAL_STATE = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Initial Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INITIAL_TRANSITION = 3;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.EventImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REF_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.StateImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Requires Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REQUIRES_EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__JOIN = 4;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.TransitionImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.SubscribableByOthersImpl <em>Subscribable By Others</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.SubscribableByOthersImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getSubscribableByOthers()
	 * @generated
	 */
	int SUBSCRIBABLE_BY_OTHERS = 7;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PublishableByOthersImpl <em>Publishable By Others</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PublishableByOthersImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublishableByOthers()
	 * @generated
	 */
	int PUBLISHABLE_BY_OTHERS = 8;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.SubscribableByMeImpl <em>Subscribable By Me</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.SubscribableByMeImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getSubscribableByMe()
	 * @generated
	 */
	int SUBSCRIBABLE_BY_ME = 9;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PublishableByMeImpl <em>Publishable By Me</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PublishableByMeImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublishableByMe()
	 * @generated
	 */
	int PUBLISHABLE_BY_ME = 10;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PublicEventImpl <em>Public Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PublicEventImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublicEvent()
	 * @generated
	 */
	int PUBLIC_EVENT = 11;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PubliclyPublishableImpl <em>Publicly Publishable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PubliclyPublishableImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPubliclyPublishable()
	 * @generated
	 */
	int PUBLICLY_PUBLISHABLE = 12;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PubliclySubscribableImpl <em>Publicly Subscribable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PubliclySubscribableImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPubliclySubscribable()
	 * @generated
	 */
	int PUBLICLY_SUBSCRIBABLE = 13;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PrivatePubSubImpl <em>Private Pub Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PrivatePubSubImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPrivatePubSub()
	 * @generated
	 */
	int PRIVATE_PUB_SUB = 14;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.PublicPubSubImpl <em>Public Pub Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.PublicPubSubImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublicPubSub()
	 * @generated
	 */
	int PUBLIC_PUB_SUB = 15;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.ImportImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 18;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.AgentImportImpl <em>Agent Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.AgentImportImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getAgentImport()
	 * @generated
	 */
	int AGENT_IMPORT = 16;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.TypeImportImpl <em>Type Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.TypeImportImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getTypeImport()
	 * @generated
	 */
	int TYPE_IMPORT = 17;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.DecisionImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__TRANSITIONS = STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PARENT = STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Requires Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__REQUIRES_EXECUTION = STATE__REQUIRES_EXECUTION;

	/**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__JOIN = STATE__JOIN;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO_STATE = 0;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Requires Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REQUIRES_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Ex Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EX_CAUSED_BY = 3;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CAUSED_BY = 4;

	/**
	 * The feature id for the '<em><b>Ex Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EX_TRIGGERS = 5;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGERS = 6;

	/**
	 * The feature id for the '<em><b>Field Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FIELD_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__REF_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Caused By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CAUSED_BY_NAME = 9;

	/**
	 * The feature id for the '<em><b>Triggers Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGERS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Ex Caused By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EX_CAUSED_BY_NAME = 11;

	/**
	 * The feature id for the '<em><b>Ex Triggers Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EX_TRIGGERS_NAME = 12;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_OTHERS__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_OTHERS__REF_TYPE = EVENT__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_OTHERS__PARENT = EVENT__PARENT;

	/**
	 * The number of structural features of the '<em>Subscribable By Others</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_OTHERS_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subscribable By Others</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_OTHERS_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_OTHERS__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_OTHERS__REF_TYPE = EVENT__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_OTHERS__PARENT = EVENT__PARENT;

	/**
	 * The number of structural features of the '<em>Publishable By Others</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_OTHERS_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publishable By Others</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_OTHERS_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_ME__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_ME__REF_TYPE = EVENT__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_ME__PARENT = EVENT__PARENT;

	/**
	 * The number of structural features of the '<em>Subscribable By Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_ME_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subscribable By Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIBABLE_BY_ME_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_ME__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_ME__REF_TYPE = EVENT__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_ME__PARENT = EVENT__PARENT;

	/**
	 * The number of structural features of the '<em>Publishable By Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_ME_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publishable By Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHABLE_BY_ME_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_EVENT__REF_TYPE = EVENT__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_EVENT__PARENT = EVENT__PARENT;

	/**
	 * The number of structural features of the '<em>Public Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_PUBLISHABLE__NAME = SUBSCRIBABLE_BY_ME__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_PUBLISHABLE__REF_TYPE = SUBSCRIBABLE_BY_ME__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_PUBLISHABLE__PARENT = SUBSCRIBABLE_BY_ME__PARENT;

	/**
	 * The number of structural features of the '<em>Publicly Publishable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_PUBLISHABLE_FEATURE_COUNT = SUBSCRIBABLE_BY_ME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publicly Publishable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_PUBLISHABLE_OPERATION_COUNT = SUBSCRIBABLE_BY_ME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_SUBSCRIBABLE__NAME = PUBLISHABLE_BY_ME__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_SUBSCRIBABLE__REF_TYPE = PUBLISHABLE_BY_ME__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_SUBSCRIBABLE__PARENT = PUBLISHABLE_BY_ME__PARENT;

	/**
	 * The number of structural features of the '<em>Publicly Subscribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_SUBSCRIBABLE_FEATURE_COUNT = PUBLISHABLE_BY_ME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publicly Subscribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICLY_SUBSCRIBABLE_OPERATION_COUNT = PUBLISHABLE_BY_ME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PUB_SUB__NAME = PUBLISHABLE_BY_ME__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PUB_SUB__REF_TYPE = PUBLISHABLE_BY_ME__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PUB_SUB__PARENT = PUBLISHABLE_BY_ME__PARENT;

	/**
	 * The number of structural features of the '<em>Private Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PUB_SUB_FEATURE_COUNT = PUBLISHABLE_BY_ME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Private Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_PUB_SUB_OPERATION_COUNT = PUBLISHABLE_BY_ME_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PUB_SUB__NAME = PUBLICLY_PUBLISHABLE__NAME;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PUB_SUB__REF_TYPE = PUBLICLY_PUBLISHABLE__REF_TYPE;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PUB_SUB__PARENT = PUBLICLY_PUBLISHABLE__PARENT;

	/**
	 * The number of structural features of the '<em>Public Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PUB_SUB_FEATURE_COUNT = PUBLICLY_PUBLISHABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Public Pub Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_PUB_SUB_OPERATION_COUNT = PUBLICLY_PUBLISHABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_IMPORT__ALIAS = IMPORT__ALIAS;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_IMPORT__AGENT = IMPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agent Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_IMPORT__ALIAS = IMPORT__ALIAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_IMPORT__TYPE = IMPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.JoinImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TRANSITIONS = STATE__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__PARENT = STATE__PARENT;

	/**
	 * The feature id for the '<em><b>Requires Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__REQUIRES_EXECUTION = STATE__REQUIRES_EXECUTION;

	/**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__JOIN = STATE__JOIN;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__JOINS = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.impl.JunctionImpl
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 20;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Field Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__FIELD_MAPPING = 1;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.StateMachineType <em>State Machine Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.StateMachineType
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getStateMachineType()
	 * @generated
	 */
	int STATE_MACHINE_TYPE = 21;

	/**
	 * The meta object id for the '{@link io.yaktor.conversation.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.conversation.ConnectionType
	 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 22;

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation</em>'.
	 * @see io.yaktor.conversation.Conversation
	 * @generated
	 */
	EClass getConversation();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Conversation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.conversation.Conversation#getName()
	 * @see #getConversation()
	 * @generated
	 */
	EAttribute getConversation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see io.yaktor.conversation.Conversation#getAgents()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getDefinedTypes <em>Defined Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Types</em>'.
	 * @see io.yaktor.conversation.Conversation#getDefinedTypes()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_DefinedTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getRestServices <em>Rest Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rest Services</em>'.
	 * @see io.yaktor.conversation.Conversation#getRestServices()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_RestServices();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see io.yaktor.conversation.Conversation#getServices()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getImportedTypes <em>Imported Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Types</em>'.
	 * @see io.yaktor.conversation.Conversation#getImportedTypes()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_ImportedTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getImportedAgents <em>Imported Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Agents</em>'.
	 * @see io.yaktor.conversation.Conversation#getImportedAgents()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_ImportedAgents();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Conversation#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see io.yaktor.conversation.Conversation#getViews()
	 * @see #getConversation()
	 * @generated
	 */
	EReference getConversation_Views();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see io.yaktor.conversation.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.conversation.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Agent#getDefinedTypes <em>Defined Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defined Types</em>'.
	 * @see io.yaktor.conversation.Agent#getDefinedTypes()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_DefinedTypes();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.conversation.Agent#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see io.yaktor.conversation.Agent#getStateMachine()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_StateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Agent#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see io.yaktor.conversation.Agent#getEvents()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Events();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.conversation.Agent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.yaktor.conversation.Agent#getParent()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Parent();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Agent#getStateMachineType <em>State Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Machine Type</em>'.
	 * @see io.yaktor.conversation.Agent#getStateMachineType()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_StateMachineType();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Agent#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see io.yaktor.conversation.Agent#getConnectionType()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_ConnectionType();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Agent#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projection</em>'.
	 * @see io.yaktor.conversation.Agent#getProjection()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Projection();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Agent#getAccessRequirement <em>Access Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Requirement</em>'.
	 * @see io.yaktor.conversation.Agent#getAccessRequirement()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_AccessRequirement();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see io.yaktor.conversation.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.StateMachine#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see io.yaktor.conversation.StateMachine#getInitialState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see io.yaktor.conversation.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.conversation.StateMachine#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.yaktor.conversation.StateMachine#getParent()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.conversation.StateMachine#getInitialTransition <em>Initial Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Transition</em>'.
	 * @see io.yaktor.conversation.StateMachine#getInitialTransition()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_InitialTransition();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see io.yaktor.conversation.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.conversation.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Event#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Type</em>'.
	 * @see io.yaktor.conversation.Event#getRefType()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_RefType();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.conversation.Event#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.yaktor.conversation.Event#getParent()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Parent();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see io.yaktor.conversation.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.conversation.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see io.yaktor.conversation.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.conversation.State#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.yaktor.conversation.State#getParent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Parent();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.State#isRequiresExecution <em>Requires Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Execution</em>'.
	 * @see io.yaktor.conversation.State#isRequiresExecution()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_RequiresExecution();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.State#isJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join</em>'.
	 * @see io.yaktor.conversation.State#isJoin()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Join();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see io.yaktor.conversation.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getToState <em>To State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To State</em>'.
	 * @see io.yaktor.conversation.Transition#getToState()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ToState();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Transition#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping</em>'.
	 * @see io.yaktor.conversation.Transition#getMapping()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Transition#isRequiresExecution <em>Requires Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires Execution</em>'.
	 * @see io.yaktor.conversation.Transition#isRequiresExecution()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_RequiresExecution();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getExCausedBy <em>Ex Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ex Caused By</em>'.
	 * @see io.yaktor.conversation.Transition#getExCausedBy()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ExCausedBy();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caused By</em>'.
	 * @see io.yaktor.conversation.Transition#getCausedBy()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_CausedBy();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getExTriggers <em>Ex Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ex Triggers</em>'.
	 * @see io.yaktor.conversation.Transition#getExTriggers()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ExTriggers();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers</em>'.
	 * @see io.yaktor.conversation.Transition#getTriggers()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Triggers();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getFieldMapping <em>Field Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Mapping</em>'.
	 * @see io.yaktor.conversation.Transition#getFieldMapping()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_FieldMapping();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Transition#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Type</em>'.
	 * @see io.yaktor.conversation.Transition#getRefType()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_RefType();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Transition#getCausedByName <em>Caused By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caused By Name</em>'.
	 * @see io.yaktor.conversation.Transition#getCausedByName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_CausedByName();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Transition#getTriggersName <em>Triggers Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggers Name</em>'.
	 * @see io.yaktor.conversation.Transition#getTriggersName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_TriggersName();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Transition#getExCausedByName <em>Ex Caused By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Caused By Name</em>'.
	 * @see io.yaktor.conversation.Transition#getExCausedByName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ExCausedByName();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Transition#getExTriggersName <em>Ex Triggers Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ex Triggers Name</em>'.
	 * @see io.yaktor.conversation.Transition#getExTriggersName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ExTriggersName();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.SubscribableByOthers <em>Subscribable By Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribable By Others</em>'.
	 * @see io.yaktor.conversation.SubscribableByOthers
	 * @generated
	 */
	EClass getSubscribableByOthers();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PublishableByOthers <em>Publishable By Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publishable By Others</em>'.
	 * @see io.yaktor.conversation.PublishableByOthers
	 * @generated
	 */
	EClass getPublishableByOthers();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.SubscribableByMe <em>Subscribable By Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscribable By Me</em>'.
	 * @see io.yaktor.conversation.SubscribableByMe
	 * @generated
	 */
	EClass getSubscribableByMe();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PublishableByMe <em>Publishable By Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publishable By Me</em>'.
	 * @see io.yaktor.conversation.PublishableByMe
	 * @generated
	 */
	EClass getPublishableByMe();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PublicEvent <em>Public Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Event</em>'.
	 * @see io.yaktor.conversation.PublicEvent
	 * @generated
	 */
	EClass getPublicEvent();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PubliclyPublishable <em>Publicly Publishable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicly Publishable</em>'.
	 * @see io.yaktor.conversation.PubliclyPublishable
	 * @generated
	 */
	EClass getPubliclyPublishable();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PubliclySubscribable <em>Publicly Subscribable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicly Subscribable</em>'.
	 * @see io.yaktor.conversation.PubliclySubscribable
	 * @generated
	 */
	EClass getPubliclySubscribable();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PrivatePubSub <em>Private Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Pub Sub</em>'.
	 * @see io.yaktor.conversation.PrivatePubSub
	 * @generated
	 */
	EClass getPrivatePubSub();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.PublicPubSub <em>Public Pub Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Pub Sub</em>'.
	 * @see io.yaktor.conversation.PublicPubSub
	 * @generated
	 */
	EClass getPublicPubSub();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.AgentImport <em>Agent Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Import</em>'.
	 * @see io.yaktor.conversation.AgentImport
	 * @generated
	 */
	EClass getAgentImport();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.AgentImport#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see io.yaktor.conversation.AgentImport#getAgent()
	 * @see #getAgentImport()
	 * @generated
	 */
	EReference getAgentImport_Agent();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.TypeImport <em>Type Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Import</em>'.
	 * @see io.yaktor.conversation.TypeImport
	 * @generated
	 */
	EClass getTypeImport();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.TypeImport#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see io.yaktor.conversation.TypeImport#getType()
	 * @see #getTypeImport()
	 * @generated
	 */
	EReference getTypeImport_Type();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see io.yaktor.conversation.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.conversation.Import#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see io.yaktor.conversation.Import#getAlias()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Alias();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see io.yaktor.conversation.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.conversation.Join#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joins</em>'.
	 * @see io.yaktor.conversation.Join#getJoins()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Joins();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see io.yaktor.conversation.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Junction#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see io.yaktor.conversation.Junction#getMessage()
	 * @see #getJunction()
	 * @generated
	 */
	EReference getJunction_Message();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.conversation.Junction#getFieldMapping <em>Field Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field Mapping</em>'.
	 * @see io.yaktor.conversation.Junction#getFieldMapping()
	 * @see #getJunction()
	 * @generated
	 */
	EReference getJunction_FieldMapping();

	/**
	 * Returns the meta object for class '{@link io.yaktor.conversation.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see io.yaktor.conversation.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.conversation.StateMachineType <em>State Machine Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Machine Type</em>'.
	 * @see io.yaktor.conversation.StateMachineType
	 * @generated
	 */
	EEnum getStateMachineType();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.conversation.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see io.yaktor.conversation.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConversationFactory getConversationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.ConversationImpl <em>Conversation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.ConversationImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getConversation()
		 * @generated
		 */
		EClass CONVERSATION = eINSTANCE.getConversation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSATION__NAME = eINSTANCE.getConversation_Name();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__AGENTS = eINSTANCE.getConversation_Agents();

		/**
		 * The meta object literal for the '<em><b>Defined Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__DEFINED_TYPES = eINSTANCE.getConversation_DefinedTypes();

		/**
		 * The meta object literal for the '<em><b>Rest Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__REST_SERVICES = eINSTANCE.getConversation_RestServices();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__SERVICES = eINSTANCE.getConversation_Services();

		/**
		 * The meta object literal for the '<em><b>Imported Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__IMPORTED_TYPES = eINSTANCE.getConversation_ImportedTypes();

		/**
		 * The meta object literal for the '<em><b>Imported Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__IMPORTED_AGENTS = eINSTANCE.getConversation_ImportedAgents();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION__VIEWS = eINSTANCE.getConversation_Views();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.AgentImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Defined Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__DEFINED_TYPES = eINSTANCE.getAgent_DefinedTypes();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__STATE_MACHINE = eINSTANCE.getAgent_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__EVENTS = eINSTANCE.getAgent_Events();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PARENT = eINSTANCE.getAgent_Parent();

		/**
		 * The meta object literal for the '<em><b>State Machine Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__STATE_MACHINE_TYPE = eINSTANCE.getAgent_StateMachineType();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__CONNECTION_TYPE = eINSTANCE.getAgent_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__PROJECTION = eINSTANCE.getAgent_Projection();

		/**
		 * The meta object literal for the '<em><b>Access Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__ACCESS_REQUIREMENT = eINSTANCE.getAgent_AccessRequirement();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.StateMachineImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__INITIAL_STATE = eINSTANCE.getStateMachine_InitialState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__PARENT = eINSTANCE.getStateMachine_Parent();

		/**
		 * The meta object literal for the '<em><b>Initial Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__INITIAL_TRANSITION = eINSTANCE.getStateMachine_InitialTransition();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.EventImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__REF_TYPE = eINSTANCE.getEvent_RefType();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PARENT = eINSTANCE.getEvent_Parent();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.StateImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PARENT = eINSTANCE.getState_Parent();

		/**
		 * The meta object literal for the '<em><b>Requires Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__REQUIRES_EXECUTION = eINSTANCE.getState_RequiresExecution();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__JOIN = eINSTANCE.getState_Join();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.TransitionImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>To State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO_STATE = eINSTANCE.getTransition_ToState();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__MAPPING = eINSTANCE.getTransition_Mapping();

		/**
		 * The meta object literal for the '<em><b>Requires Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__REQUIRES_EXECUTION = eINSTANCE.getTransition_RequiresExecution();

		/**
		 * The meta object literal for the '<em><b>Ex Caused By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EX_CAUSED_BY = eINSTANCE.getTransition_ExCausedBy();

		/**
		 * The meta object literal for the '<em><b>Caused By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CAUSED_BY = eINSTANCE.getTransition_CausedBy();

		/**
		 * The meta object literal for the '<em><b>Ex Triggers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EX_TRIGGERS = eINSTANCE.getTransition_ExTriggers();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGERS = eINSTANCE.getTransition_Triggers();

		/**
		 * The meta object literal for the '<em><b>Field Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FIELD_MAPPING = eINSTANCE.getTransition_FieldMapping();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__REF_TYPE = eINSTANCE.getTransition_RefType();

		/**
		 * The meta object literal for the '<em><b>Caused By Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CAUSED_BY_NAME = eINSTANCE.getTransition_CausedByName();

		/**
		 * The meta object literal for the '<em><b>Triggers Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TRIGGERS_NAME = eINSTANCE.getTransition_TriggersName();

		/**
		 * The meta object literal for the '<em><b>Ex Caused By Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EX_CAUSED_BY_NAME = eINSTANCE.getTransition_ExCausedByName();

		/**
		 * The meta object literal for the '<em><b>Ex Triggers Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EX_TRIGGERS_NAME = eINSTANCE.getTransition_ExTriggersName();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.SubscribableByOthersImpl <em>Subscribable By Others</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.SubscribableByOthersImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getSubscribableByOthers()
		 * @generated
		 */
		EClass SUBSCRIBABLE_BY_OTHERS = eINSTANCE.getSubscribableByOthers();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PublishableByOthersImpl <em>Publishable By Others</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PublishableByOthersImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublishableByOthers()
		 * @generated
		 */
		EClass PUBLISHABLE_BY_OTHERS = eINSTANCE.getPublishableByOthers();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.SubscribableByMeImpl <em>Subscribable By Me</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.SubscribableByMeImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getSubscribableByMe()
		 * @generated
		 */
		EClass SUBSCRIBABLE_BY_ME = eINSTANCE.getSubscribableByMe();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PublishableByMeImpl <em>Publishable By Me</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PublishableByMeImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublishableByMe()
		 * @generated
		 */
		EClass PUBLISHABLE_BY_ME = eINSTANCE.getPublishableByMe();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PublicEventImpl <em>Public Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PublicEventImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublicEvent()
		 * @generated
		 */
		EClass PUBLIC_EVENT = eINSTANCE.getPublicEvent();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PubliclyPublishableImpl <em>Publicly Publishable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PubliclyPublishableImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPubliclyPublishable()
		 * @generated
		 */
		EClass PUBLICLY_PUBLISHABLE = eINSTANCE.getPubliclyPublishable();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PubliclySubscribableImpl <em>Publicly Subscribable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PubliclySubscribableImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPubliclySubscribable()
		 * @generated
		 */
		EClass PUBLICLY_SUBSCRIBABLE = eINSTANCE.getPubliclySubscribable();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PrivatePubSubImpl <em>Private Pub Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PrivatePubSubImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPrivatePubSub()
		 * @generated
		 */
		EClass PRIVATE_PUB_SUB = eINSTANCE.getPrivatePubSub();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.PublicPubSubImpl <em>Public Pub Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.PublicPubSubImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getPublicPubSub()
		 * @generated
		 */
		EClass PUBLIC_PUB_SUB = eINSTANCE.getPublicPubSub();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.AgentImportImpl <em>Agent Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.AgentImportImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getAgentImport()
		 * @generated
		 */
		EClass AGENT_IMPORT = eINSTANCE.getAgentImport();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_IMPORT__AGENT = eINSTANCE.getAgentImport_Agent();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.TypeImportImpl <em>Type Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.TypeImportImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getTypeImport()
		 * @generated
		 */
		EClass TYPE_IMPORT = eINSTANCE.getTypeImport();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_IMPORT__TYPE = eINSTANCE.getTypeImport_Type();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.ImportImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ALIAS = eINSTANCE.getImport_Alias();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.JoinImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__JOINS = eINSTANCE.getJoin_Joins();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.JunctionImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTION__MESSAGE = eINSTANCE.getJunction_Message();

		/**
		 * The meta object literal for the '<em><b>Field Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUNCTION__FIELD_MAPPING = eINSTANCE.getJunction_FieldMapping();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.impl.DecisionImpl
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.StateMachineType <em>State Machine Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.StateMachineType
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getStateMachineType()
		 * @generated
		 */
		EEnum STATE_MACHINE_TYPE = eINSTANCE.getStateMachineType();

		/**
		 * The meta object literal for the '{@link io.yaktor.conversation.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.conversation.ConnectionType
		 * @see io.yaktor.conversation.impl.ConversationPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

	}

} //ConversationPackage
