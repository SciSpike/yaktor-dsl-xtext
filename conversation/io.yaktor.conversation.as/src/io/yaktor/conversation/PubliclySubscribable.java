/**
 */
package io.yaktor.conversation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicly Subscribable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.PubliclySubscribable#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getPubliclySubscribable()
 * @model
 * @generated
 */
public interface PubliclySubscribable extends PublishableByMe, SubscribableByOthers, PublicEvent {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.Agent#getSendables <em>Sendables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Agent)
	 * @see io.yaktor.conversation.ConversationPackage#getPubliclySubscribable_Parent()
	 * @see io.yaktor.conversation.Agent#getSendables
	 * @model opposite="sendables" transient="false"
	 * @generated
	 */
	Agent getParent();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.PubliclySubscribable#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Agent value);
} // PubliclySubscribable
