/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DbProvider;
import io.yaktor.domain.DbType;
import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.PersistenceOptions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.PersistenceOptionsImpl#getDbType <em>Db Type</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.PersistenceOptionsImpl#getDbProvider <em>Db Provider</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.PersistenceOptionsImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.PersistenceOptionsImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.PersistenceOptionsImpl#getDbName <em>Db Name</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.PersistenceOptionsImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceOptionsImpl extends MinimalEObjectImpl.Container implements PersistenceOptions {
	/**
	 * The default value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbType()
	 * @generated
	 * @ordered
	 */
	protected static final DbType DB_TYPE_EDEFAULT = DbType.ORACLE;

	/**
	 * The cached value of the '{@link #getDbType() <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbType()
	 * @generated
	 * @ordered
	 */
	protected DbType dbType = DB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbProvider() <em>Db Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbProvider()
	 * @generated
	 * @ordered
	 */
	protected static final DbProvider DB_PROVIDER_EDEFAULT = DbProvider.HIBERNATE;

	/**
	 * The cached value of the '{@link #getDbProvider() <em>Db Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbProvider()
	 * @generated
	 * @ordered
	 */
	protected DbProvider dbProvider = DB_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbName()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbName() <em>Db Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbName()
	 * @generated
	 * @ordered
	 */
	protected String dbName = DB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.PERSISTENCE_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbType getDbType() {
		return dbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbType(DbType newDbType) {
		DbType oldDbType = dbType;
		dbType = newDbType == null ? DB_TYPE_EDEFAULT : newDbType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSISTENCE_OPTIONS__DB_TYPE, oldDbType, dbType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbProvider getDbProvider() {
		return dbProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbProvider(DbProvider newDbProvider) {
		DbProvider oldDbProvider = dbProvider;
		dbProvider = newDbProvider == null ? DB_PROVIDER_EDEFAULT : newDbProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSISTENCE_OPTIONS__DB_PROVIDER, oldDbProvider, dbProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSISTENCE_OPTIONS__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSISTENCE_OPTIONS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbName() {
		return dbName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbName(String newDbName) {
		String oldDbName = dbName;
		dbName = newDbName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSISTENCE_OPTIONS__DB_NAME, oldDbName, dbName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.PERSISTENCE_OPTIONS__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.PERSISTENCE_OPTIONS__DB_TYPE:
				return getDbType();
			case DomainPackage.PERSISTENCE_OPTIONS__DB_PROVIDER:
				return getDbProvider();
			case DomainPackage.PERSISTENCE_OPTIONS__USER_NAME:
				return getUserName();
			case DomainPackage.PERSISTENCE_OPTIONS__PASSWORD:
				return getPassword();
			case DomainPackage.PERSISTENCE_OPTIONS__DB_NAME:
				return getDbName();
			case DomainPackage.PERSISTENCE_OPTIONS__URL:
				return getUrl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DomainPackage.PERSISTENCE_OPTIONS__DB_TYPE:
				setDbType((DbType)newValue);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__DB_PROVIDER:
				setDbProvider((DbProvider)newValue);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__USER_NAME:
				setUserName((String)newValue);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__PASSWORD:
				setPassword((String)newValue);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__DB_NAME:
				setDbName((String)newValue);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__URL:
				setUrl((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DomainPackage.PERSISTENCE_OPTIONS__DB_TYPE:
				setDbType(DB_TYPE_EDEFAULT);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__DB_PROVIDER:
				setDbProvider(DB_PROVIDER_EDEFAULT);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__DB_NAME:
				setDbName(DB_NAME_EDEFAULT);
				return;
			case DomainPackage.PERSISTENCE_OPTIONS__URL:
				setUrl(URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DomainPackage.PERSISTENCE_OPTIONS__DB_TYPE:
				return dbType != DB_TYPE_EDEFAULT;
			case DomainPackage.PERSISTENCE_OPTIONS__DB_PROVIDER:
				return dbProvider != DB_PROVIDER_EDEFAULT;
			case DomainPackage.PERSISTENCE_OPTIONS__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case DomainPackage.PERSISTENCE_OPTIONS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DomainPackage.PERSISTENCE_OPTIONS__DB_NAME:
				return DB_NAME_EDEFAULT == null ? dbName != null : !DB_NAME_EDEFAULT.equals(dbName);
			case DomainPackage.PERSISTENCE_OPTIONS__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dbType: ");
		result.append(dbType);
		result.append(", dbProvider: ");
		result.append(dbProvider);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", dbName: ");
		result.append(dbName);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //PersistenceOptionsImpl
