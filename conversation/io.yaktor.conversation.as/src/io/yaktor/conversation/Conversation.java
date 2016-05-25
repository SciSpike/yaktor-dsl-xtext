/**
 */
package io.yaktor.conversation;

import io.yaktor.access.RestService;
import io.yaktor.access.Service;

import io.yaktor.access.View;
import io.yaktor.types.Projection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.conversation.Conversation#getName <em>Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getAgents <em>Agents</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getDefinedTypes <em>Defined Types</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getRestServices <em>Rest Services</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getServices <em>Services</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getImportedTypes <em>Imported Types</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getImportedAgents <em>Imported Agents</em>}</li>
 *   <li>{@link io.yaktor.conversation.Conversation#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.conversation.ConversationPackage#getConversation()
 * @model
 * @generated
 */
public interface Conversation extends EObject {
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
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link io.yaktor.conversation.Conversation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.Agent}.
	 * It is bidirectional and its opposite is '{@link io.yaktor.conversation.Agent#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_Agents()
	 * @see io.yaktor.conversation.Agent#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Defined Types</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.types.Projection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined Types</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_DefinedTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Projection> getDefinedTypes();

	/**
	 * Returns the value of the '<em><b>Rest Services</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.access.RestService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Services</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_RestServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestService> getRestServices();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.access.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Imported Types</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.TypeImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Types</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_ImportedTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeImport> getImportedTypes();

	/**
	 * Returns the value of the '<em><b>Imported Agents</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.conversation.AgentImport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Agents</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_ImportedAgents()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgentImport> getImportedAgents();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.access.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see io.yaktor.conversation.ConversationPackage#getConversation_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getViews();

} // Conversation
