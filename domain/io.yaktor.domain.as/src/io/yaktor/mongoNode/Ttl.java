/**
 */
package io.yaktor.mongoNode;

import io.yaktor.domain.DateField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ttl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.mongoNode.Ttl#getField <em>Field</em>}</li>
 *   <li>{@link io.yaktor.mongoNode.Ttl#getExpireAfterSeconds <em>Expire After Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.mongoNode.MongoNodePackage#getTtl()
 * @model
 * @generated
 */
public interface Ttl extends EObject {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(DateField)
	 * @see io.yaktor.mongoNode.MongoNodePackage#getTtl_Field()
	 * @model
	 * @generated
	 */
	DateField getField();

	/**
	 * Sets the value of the '{@link io.yaktor.mongoNode.Ttl#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(DateField value);

	/**
	 * Returns the value of the '<em><b>Expire After Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire After Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire After Seconds</em>' attribute.
	 * @see #setExpireAfterSeconds(int)
	 * @see io.yaktor.mongoNode.MongoNodePackage#getTtl_ExpireAfterSeconds()
	 * @model
	 * @generated
	 */
	int getExpireAfterSeconds();

	/**
	 * Sets the value of the '{@link io.yaktor.mongoNode.Ttl#getExpireAfterSeconds <em>Expire After Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire After Seconds</em>' attribute.
	 * @see #getExpireAfterSeconds()
	 * @generated
	 */
	void setExpireAfterSeconds(int value);

} // Ttl
