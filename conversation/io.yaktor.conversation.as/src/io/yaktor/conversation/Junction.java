/**
 */
package io.yaktor.conversation;

import io.yaktor.types.ProjectionField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.Junction#getMessage <em>Message</em>}</li>
 *   <li>{@link io.yaktor.conversation.Junction#getFieldMapping <em>Field Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getJunction()
 * @model
 * @generated
 */
public interface Junction extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(SubscribableByOthers)
	 * @see io.yaktor.conversation.ConversationPackage#getJunction_Message()
	 * @model required="true"
	 * @generated
	 */
	SubscribableByOthers getMessage();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Junction#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(SubscribableByOthers value);

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
	 * @see io.yaktor.conversation.ConversationPackage#getJunction_FieldMapping()
	 * @model
	 * @generated
	 */
	ProjectionField getFieldMapping();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Junction#getFieldMapping <em>Field Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Mapping</em>' reference.
	 * @see #getFieldMapping()
	 * @generated
	 */
	void setFieldMapping(ProjectionField value);

} // Junction
