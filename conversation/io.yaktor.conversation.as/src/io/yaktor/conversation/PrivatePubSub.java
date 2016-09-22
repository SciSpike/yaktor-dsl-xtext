/**
 */
package io.yaktor.conversation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Private Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.PrivatePubSub#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getPrivatePubSub()
 * @model
 * @generated
 */
public interface PrivatePubSub extends PublishableByMe, SubscribableByMe {

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.Transition#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see io.yaktor.conversation.ConversationPackage#getPrivatePubSub_Transition()
	 * @see io.yaktor.conversation.Transition#getCausedBy
	 * @model opposite="causedBy" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.PrivatePubSub#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);
} // PrivatePubSub
