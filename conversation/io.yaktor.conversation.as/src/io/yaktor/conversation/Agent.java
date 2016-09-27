/**
 */
package io.yaktor.conversation;

import io.yaktor.access.AccessRequirement;
import io.yaktor.types.Projection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.Agent#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getSendables <em>Sendables</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getParent <em>Parent</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getStateMachineType <em>State Machine Type</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getProjection <em>Projection</em>}</li>
 *   <li>{@link io.yaktor.conversation.Agent#getAccessRequirement <em>Access Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Defined Types</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.types.Projection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Types</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_DefinedTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Projection> getDefinedTypes();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.StateMachine#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' containment reference.
	 * @see #setStateMachine(StateMachine)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_StateMachine()
	 * @see io.yaktor.conversation.StateMachine#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getStateMachine <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' containment reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Sendables</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.PubliclySubscribable}.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.PubliclySubscribable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendables</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_Sendables()
	 * @see io.yaktor.conversation.PubliclySubscribable#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PubliclySubscribable> getSendables();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.Conversation#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Conversation)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_Parent()
	 * @see io.yaktor.conversation.Conversation#getAgents
	 * @model opposite="agents" transient="false"
	 * @generated
	 */
	Conversation getParent();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Conversation value);

	/**
	 * Returns the value of the '<em><b>State Machine Type</b></em>' attribute.
	 * The default value is <code>"finite"</code>.
	 * The literals are from the enumeration {@link io.yaktor.conversation.StateMachineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine Type</em>' attribute.
	 * @see io.yaktor.conversation.StateMachineType
	 * @see #setStateMachineType(StateMachineType)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_StateMachineType()
	 * @model default="finite"
	 * @generated
	 */
	StateMachineType getStateMachineType();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getStateMachineType <em>State Machine Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine Type</em>' attribute.
	 * @see io.yaktor.conversation.StateMachineType
	 * @see #getStateMachineType()
	 * @generated
	 */
	void setStateMachineType(StateMachineType value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The default value is <code>"independent"</code>.
	 * The literals are from the enumeration {@link io.yaktor.conversation.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see io.yaktor.conversation.ConnectionType
	 * @see #setConnectionType(ConnectionType)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_ConnectionType()
	 * @model default="independent"
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see io.yaktor.conversation.ConnectionType
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' reference.
	 * @see #setProjection(Projection)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_Projection()
	 * @model
	 * @generated
	 */
	Projection getProjection();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getProjection <em>Projection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Projection value);

	/**
	 * Returns the value of the '<em><b>Access Requirement</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * The literals are from the enumeration {@link io.yaktor.access.AccessRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Requirement</em>' attribute.
	 * @see io.yaktor.access.AccessRequirement
	 * @see #setAccessRequirement(AccessRequirement)
	 * @see io.yaktor.conversation.ConversationPackage#getAgent_AccessRequirement()
	 * @model default="DEFAULT"
	 * @generated
	 */
	AccessRequirement getAccessRequirement();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Agent#getAccessRequirement <em>Access Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Requirement</em>' attribute.
	 * @see io.yaktor.access.AccessRequirement
	 * @see #getAccessRequirement()
	 * @generated
	 */
	void setAccessRequirement(AccessRequirement value);

} // Agent
