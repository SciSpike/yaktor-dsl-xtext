/**
 */
package io.yaktor.conversation;

import io.yaktor.types.ProjectionField;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.Transition#getToState <em>To State</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getMapping <em>Mapping</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#isRequiresExecution <em>Requires Execution</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getExCausedBy <em>Ex Caused By</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getCausedBy <em>Caused By</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getExTriggers <em>Ex Triggers</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getFieldMapping <em>Field Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>To State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To State</em>' reference.
	 * @see #setToState(State)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_ToState()
	 * @model required="true"
	 * @generated
	 */
	State getToState();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getToState <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To State</em>' reference.
	 * @see #getToState()
	 * @generated
	 */
	void setToState(State value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see #setMapping(String)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_Mapping()
	 * @model
	 * @generated
	 */
	String getMapping();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(String value);

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
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_RequiresExecution()
	 * @model default="false"
	 * @generated
	 */
	boolean isRequiresExecution();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#isRequiresExecution <em>Requires Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Execution</em>' attribute.
	 * @see #isRequiresExecution()
	 * @generated
	 */
	void setRequiresExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Ex Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Caused By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Caused By</em>' reference.
	 * @see #setExCausedBy(SubscribableByOthers)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_ExCausedBy()
	 * @model
	 * @generated
	 */
	SubscribableByOthers getExCausedBy();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getExCausedBy <em>Ex Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Caused By</em>' reference.
	 * @see #getExCausedBy()
	 * @generated
	 */
	void setExCausedBy(SubscribableByOthers value);

	/**
	 * Returns the value of the '<em><b>Caused By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.PrivatePubSub#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caused By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' containment reference.
	 * @see #setCausedBy(PrivatePubSub)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_CausedBy()
	 * @see io.yaktor.conversation.PrivatePubSub#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	PrivatePubSub getCausedBy();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getCausedBy <em>Caused By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' containment reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(PrivatePubSub value);

	/**
	 * Returns the value of the '<em><b>Ex Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Triggers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Triggers</em>' reference.
	 * @see #setExTriggers(PublishableByOthers)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_ExTriggers()
	 * @model
	 * @generated
	 */
	PublishableByOthers getExTriggers();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getExTriggers <em>Ex Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Triggers</em>' reference.
	 * @see #getExTriggers()
	 * @generated
	 */
	void setExTriggers(PublishableByOthers value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference.
	 * @see #setTriggers(PublishableByMe)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_Triggers()
	 * @model
	 * @generated
	 */
	PublishableByMe getTriggers();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getTriggers <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(PublishableByMe value);

	/**
	 * Returns the value of the '<em><b>Field Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Mapping</em>' reference.
	 * @see #setFieldMapping(ProjectionField)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_FieldMapping()
	 * @model
	 * @generated
	 */
	ProjectionField getFieldMapping();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getFieldMapping <em>Field Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Mapping</em>' reference.
	 * @see #getFieldMapping()
	 * @generated
	 */
	void setFieldMapping(ProjectionField value);

} // Transition
