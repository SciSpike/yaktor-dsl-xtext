/**
 */
package io.yaktor.conversation;

import io.yaktor.types.Projection;
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
 *   <li>{@link io.yaktor.conversation.Transition#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getCausedByName <em>Caused By Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getTriggersName <em>Triggers Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getExCausedByName <em>Ex Caused By Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.Transition#getExTriggersName <em>Ex Triggers Name</em>}</li>
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
	 * Returns the value of the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caused By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By</em>' reference.
	 * @see #setCausedBy(SubscribableByMe)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_CausedBy()
	 * @model
	 * @generated
	 */
	SubscribableByMe getCausedBy();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getCausedBy <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By</em>' reference.
	 * @see #getCausedBy()
	 * @generated
	 */
	void setCausedBy(SubscribableByMe value);

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

	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' reference.
	 * @see #setRefType(Projection)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_RefType()
	 * @model
	 * @generated
	 */
	Projection getRefType();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getRefType <em>Ref Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(Projection value);

	/**
	 * Returns the value of the '<em><b>Caused By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caused By Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caused By Name</em>' attribute.
	 * @see #setCausedByName(String)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_CausedByName()
	 * @model
	 * @generated
	 */
	String getCausedByName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getCausedByName <em>Caused By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caused By Name</em>' attribute.
	 * @see #getCausedByName()
	 * @generated
	 */
	void setCausedByName(String value);

	/**
	 * Returns the value of the '<em><b>Triggers Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers Name</em>' attribute.
	 * @see #setTriggersName(String)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_TriggersName()
	 * @model
	 * @generated
	 */
	String getTriggersName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getTriggersName <em>Triggers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers Name</em>' attribute.
	 * @see #getTriggersName()
	 * @generated
	 */
	void setTriggersName(String value);

	/**
	 * Returns the value of the '<em><b>Ex Caused By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Caused By Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Caused By Name</em>' attribute.
	 * @see #setExCausedByName(String)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_ExCausedByName()
	 * @model
	 * @generated
	 */
	String getExCausedByName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getExCausedByName <em>Ex Caused By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Caused By Name</em>' attribute.
	 * @see #getExCausedByName()
	 * @generated
	 */
	void setExCausedByName(String value);

	/**
	 * Returns the value of the '<em><b>Ex Triggers Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ex Triggers Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ex Triggers Name</em>' attribute.
	 * @see #setExTriggersName(String)
	 * @see io.yaktor.conversation.ConversationPackage#getTransition_ExTriggersName()
	 * @model
	 * @generated
	 */
	String getExTriggersName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Transition#getExTriggersName <em>Ex Triggers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ex Triggers Name</em>' attribute.
	 * @see #getExTriggersName()
	 * @generated
	 */
	void setExTriggersName(String value);

} // Transition
