/**
 */
package io.yaktor.conversation;

import io.yaktor.types.Projection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.TypeImport#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getTypeImport()
 * @model
 * @generated
 */
public interface TypeImport extends Import {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Projection)
	 * @see io.yaktor.conversation.ConversationPackage#getTypeImport_Type()
	 * @model
	 * @generated
	 */
	Projection getType();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.TypeImport#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Projection value);

} // TypeImport
