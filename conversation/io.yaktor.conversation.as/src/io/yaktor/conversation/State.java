/**
 */
package io.yaktor.conversation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.State#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link io.yaktor.conversation.State#getParent <em>Parent</em>}</li>
 *   <li>{@link io.yaktor.conversation.State#isRequiresExecution <em>Requires Execution</em>}</li>
 *   <li>{@link io.yaktor.conversation.State#isJoin <em>Join</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see io.yaktor.conversation.ConversationPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(StateMachine)
	 * @see io.yaktor.conversation.ConversationPackage#getState_Parent()
	 * @see io.yaktor.conversation.StateMachine#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	StateMachine getParent();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.State#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Requires Execution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Execution</em>' attribute.
	 * @see #setRequiresExecution(boolean)
	 * @see io.yaktor.conversation.ConversationPackage#getState_RequiresExecution()
	 * @model default="false"
	 * @generated
	 */
	boolean isRequiresExecution();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.State#isRequiresExecution <em>Requires Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Execution</em>' attribute.
	 * @see #isRequiresExecution()
	 * @generated
	 */
	void setRequiresExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' attribute.
	 * @see #setJoin(boolean)
	 * @see io.yaktor.conversation.ConversationPackage#getState_Join()
	 * @model default="false"
	 * @generated
	 */
	boolean isJoin();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.State#isJoin <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' attribute.
	 * @see #isJoin()
	 * @generated
	 */
	void setJoin(boolean value);

} // State
