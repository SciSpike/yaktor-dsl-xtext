/**
 */
package io.yaktor.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.PersistenceOptions#getDbType <em>Db Type</em>}</li>
 *   <li>{@link io.yaktor.domain.PersistenceOptions#getDbProvider <em>Db Provider</em>}</li>
 *   <li>{@link io.yaktor.domain.PersistenceOptions#getUserName <em>User Name</em>}</li>
 *   <li>{@link io.yaktor.domain.PersistenceOptions#getPassword <em>Password</em>}</li>
 *   <li>{@link io.yaktor.domain.PersistenceOptions#getDbName <em>Db Name</em>}</li>
 *   <li>{@link io.yaktor.domain.PersistenceOptions#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions()
 * @model
 * @generated
 */
public interface PersistenceOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Type</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.DbType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Type</em>' attribute.
	 * @see io.yaktor.domain.DbType
	 * @see #setDbType(DbType)
	 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions_DbType()
	 * @model required="true"
	 * @generated
	 */
	DbType getDbType();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.PersistenceOptions#getDbType <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Type</em>' attribute.
	 * @see io.yaktor.domain.DbType
	 * @see #getDbType()
	 * @generated
	 */
	void setDbType(DbType value);

	/**
	 * Returns the value of the '<em><b>Db Provider</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.DbProvider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Provider</em>' attribute.
	 * @see io.yaktor.domain.DbProvider
	 * @see #setDbProvider(DbProvider)
	 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions_DbProvider()
	 * @model
	 * @generated
	 */
	DbProvider getDbProvider();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.PersistenceOptions#getDbProvider <em>Db Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Provider</em>' attribute.
	 * @see io.yaktor.domain.DbProvider
	 * @see #getDbProvider()
	 * @generated
	 */
	void setDbProvider(DbProvider value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.PersistenceOptions#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.PersistenceOptions#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Db Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Name</em>' attribute.
	 * @see #setDbName(String)
	 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions_DbName()
	 * @model
	 * @generated
	 */
	String getDbName();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.PersistenceOptions#getDbName <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Name</em>' attribute.
	 * @see #getDbName()
	 * @generated
	 */
	void setDbName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see io.yaktor.domain.DomainPackage#getPersistenceOptions_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.PersistenceOptions#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // PersistenceOptions
