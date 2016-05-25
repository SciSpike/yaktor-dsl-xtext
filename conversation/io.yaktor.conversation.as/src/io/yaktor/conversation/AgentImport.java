/**
 */
package io.yaktor.conversation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.AgentImport#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getAgentImport()
 * @model
 * @generated
 */
public interface AgentImport extends Import {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see io.yaktor.conversation.ConversationPackage#getAgentImport_Agent()
	 * @model
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.AgentImport#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // AgentImport
