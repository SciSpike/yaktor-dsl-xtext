/**
 */
package io.yaktor.conversation;

import io.yaktor.types.Projection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.ServiceMethod#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.ServiceMethod#getInputParams <em>Input Params</em>}</li>
 *   <li>{@link io.yaktor.conversation.ServiceMethod#getOutputParams <em>Output Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getServiceMethod()
 * @model
 * @generated
 */
public interface ServiceMethod extends EObject {
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
	 * @see io.yaktor.conversation.ConversationPackage#getServiceMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.ServiceMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Input Params</b></em>' reference list.
	 * The list contents are of type {@link io.yaktor.types.Projection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Params</em>' reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getServiceMethod_InputParams()
	 * @model
	 * @generated
	 */
	EList<Projection> getInputParams();

	/**
	 * Returns the value of the '<em><b>Output Params</b></em>' reference list.
	 * The list contents are of type {@link io.yaktor.types.Projection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Params</em>' reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getServiceMethod_OutputParams()
	 * @model
	 * @generated
	 */
	EList<Projection> getOutputParams();

} // ServiceMethod
