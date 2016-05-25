/**
 */
package io.yaktor.domain;

import io.yaktor.mongoNode.Ttl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo Node Table Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.MongoNodeTableOptions#getType <em>Type</em>}</li>
 *   <li>{@link io.yaktor.domain.MongoNodeTableOptions#getTtl <em>Ttl</em>}</li>
 *   <li>{@link io.yaktor.domain.MongoNodeTableOptions#isSingleTableRoot <em>Single Table Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getMongoNodeTableOptions()
 * @model
 * @generated
 */
public interface MongoNodeTableOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TableType)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeTableOptions_Type()
	 * @model
	 * @generated
	 */
	TableType getType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeTableOptions#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TableType value);

	/**
	 * Returns the value of the '<em><b>Ttl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttl</em>' containment reference.
	 * @see #setTtl(Ttl)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeTableOptions_Ttl()
	 * @model containment="true"
	 * @generated
	 */
	Ttl getTtl();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeTableOptions#getTtl <em>Ttl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttl</em>' containment reference.
	 * @see #getTtl()
	 * @generated
	 */
	void setTtl(Ttl value);

	/**
	 * Returns the value of the '<em><b>Single Table Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Table Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Table Root</em>' attribute.
	 * @see #setSingleTableRoot(boolean)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeTableOptions_SingleTableRoot()
	 * @model default="false"
	 * @generated
	 */
	boolean isSingleTableRoot();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeTableOptions#isSingleTableRoot <em>Single Table Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Table Root</em>' attribute.
	 * @see #isSingleTableRoot()
	 * @generated
	 */
	void setSingleTableRoot(boolean value);

} // MongoNodeTableOptions
