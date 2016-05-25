/**
 */
package io.yaktor.conversation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.StateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link io.yaktor.conversation.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link io.yaktor.conversation.StateMachine#getParent <em>Parent</em>}</li>
 *   <li>{@link io.yaktor.conversation.StateMachine#getInitialTransition <em>Initial Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see io.yaktor.conversation.ConversationPackage#getStateMachine_InitialState()
	 * @model
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.StateMachine#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.State}.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.State#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getStateMachine_States()
	 * @see io.yaktor.conversation.State#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.Agent#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Agent)
	 * @see io.yaktor.conversation.ConversationPackage#getStateMachine_Parent()
	 * @see io.yaktor.conversation.Agent#getStateMachine
	 * @model opposite="stateMachine" transient="false"
	 * @generated
	 */
	Agent getParent();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.StateMachine#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Agent value);

	/**
	 * Returns the value of the '<em><b>Initial Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Transition</em>' containment reference.
	 * @see #setInitialTransition(Transition)
	 * @see io.yaktor.conversation.ConversationPackage#getStateMachine_InitialTransition()
	 * @model containment="true"
	 * @generated
	 */
	Transition getInitialTransition();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.StateMachine#getInitialTransition <em>Initial Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Transition</em>' containment reference.
	 * @see #getInitialTransition()
	 * @generated
	 */
	void setInitialTransition(Transition value);

} // StateMachine
