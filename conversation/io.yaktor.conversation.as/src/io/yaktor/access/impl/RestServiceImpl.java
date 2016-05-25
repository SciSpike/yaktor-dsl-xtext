/**
 */
package io.yaktor.access.impl;

import io.yaktor.access.AccessGroup;
import io.yaktor.access.AccessPackage;
import io.yaktor.access.RestDocumentType;
import io.yaktor.access.RestService;
import io.yaktor.access.View;
import io.yaktor.types.Projection;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rest Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.access.impl.RestServiceImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link io.yaktor.access.impl.RestServiceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link io.yaktor.access.impl.RestServiceImpl#getSupportedDocumentTypes <em>Supported Document Types</em>}</li>
 *   <li>{@link io.yaktor.access.impl.RestServiceImpl#getFrontedBy <em>Fronted By</em>}</li>
 *   <li>{@link io.yaktor.access.impl.RestServiceImpl#getAccessGroups <em>Access Groups</em>}</li>
 *   <li>{@link io.yaktor.access.impl.RestServiceImpl#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestServiceImpl extends MinimalEObjectImpl.Container implements RestService {
	/**
	 * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefType()
	 * @generated
	 * @ordered
	 */
	protected Projection refType;

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
	 * The cached value of the '{@link #getSupportedDocumentTypes() <em>Supported Document Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedDocumentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<RestDocumentType> supportedDocumentTypes;

	/**
	 * The cached value of the '{@link #getFrontedBy() <em>Fronted By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<View> frontedBy;

	/**
	 * The cached value of the '{@link #getAccessGroups() <em>Access Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAccessGroups()
	 * @generated
	 * @ordered
	 */
  protected EList<AccessGroup> accessGroups;

  /**
	 * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
  protected static final String SERVER_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
  protected String server = SERVER_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccessPackage.Literals.REST_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection getRefType() {
		if (refType != null && refType.eIsProxy()) {
			InternalEObject oldRefType = (InternalEObject)refType;
			refType = (Projection)eResolveProxy(oldRefType);
			if (refType != oldRefType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccessPackage.REST_SERVICE__REF_TYPE, oldRefType, refType));
			}
		}
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Projection basicGetRefType() {
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefType(Projection newRefType) {
		Projection oldRefType = refType;
		refType = newRefType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.REST_SERVICE__REF_TYPE, oldRefType, refType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.REST_SERVICE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestDocumentType> getSupportedDocumentTypes() {
		if (supportedDocumentTypes == null) {
			supportedDocumentTypes = new EDataTypeUniqueEList<RestDocumentType>(RestDocumentType.class, this, AccessPackage.REST_SERVICE__SUPPORTED_DOCUMENT_TYPES);
		}
		return supportedDocumentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getFrontedBy() {
		if (frontedBy == null) {
			frontedBy = new EObjectWithInverseResolvingEList<View>(View.class, this, AccessPackage.REST_SERVICE__FRONTED_BY, AccessPackage.VIEW__BACKED_BY);
		}
		return frontedBy;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AccessGroup> getAccessGroups() {
		if (accessGroups == null) {
			accessGroups = new EObjectContainmentEList<AccessGroup>(AccessGroup.class, this, AccessPackage.REST_SERVICE__ACCESS_GROUPS);
		}
		return accessGroups;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getServer() {
		return server;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setServer(String newServer) {
		String oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccessPackage.REST_SERVICE__SERVER, oldServer, server));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccessPackage.REST_SERVICE__FRONTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrontedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccessPackage.REST_SERVICE__FRONTED_BY:
				return ((InternalEList<?>)getFrontedBy()).basicRemove(otherEnd, msgs);
			case AccessPackage.REST_SERVICE__ACCESS_GROUPS:
				return ((InternalEList<?>)getAccessGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccessPackage.REST_SERVICE__REF_TYPE:
				if (resolve) return getRefType();
				return basicGetRefType();
			case AccessPackage.REST_SERVICE__URL:
				return getUrl();
			case AccessPackage.REST_SERVICE__SUPPORTED_DOCUMENT_TYPES:
				return getSupportedDocumentTypes();
			case AccessPackage.REST_SERVICE__FRONTED_BY:
				return getFrontedBy();
			case AccessPackage.REST_SERVICE__ACCESS_GROUPS:
				return getAccessGroups();
			case AccessPackage.REST_SERVICE__SERVER:
				return getServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccessPackage.REST_SERVICE__REF_TYPE:
				setRefType((Projection)newValue);
				return;
			case AccessPackage.REST_SERVICE__URL:
				setUrl((String)newValue);
				return;
			case AccessPackage.REST_SERVICE__SUPPORTED_DOCUMENT_TYPES:
				getSupportedDocumentTypes().clear();
				getSupportedDocumentTypes().addAll((Collection<? extends RestDocumentType>)newValue);
				return;
			case AccessPackage.REST_SERVICE__FRONTED_BY:
				getFrontedBy().clear();
				getFrontedBy().addAll((Collection<? extends View>)newValue);
				return;
			case AccessPackage.REST_SERVICE__ACCESS_GROUPS:
				getAccessGroups().clear();
				getAccessGroups().addAll((Collection<? extends AccessGroup>)newValue);
				return;
			case AccessPackage.REST_SERVICE__SERVER:
				setServer((String)newValue);
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
			case AccessPackage.REST_SERVICE__REF_TYPE:
				setRefType((Projection)null);
				return;
			case AccessPackage.REST_SERVICE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AccessPackage.REST_SERVICE__SUPPORTED_DOCUMENT_TYPES:
				getSupportedDocumentTypes().clear();
				return;
			case AccessPackage.REST_SERVICE__FRONTED_BY:
				getFrontedBy().clear();
				return;
			case AccessPackage.REST_SERVICE__ACCESS_GROUPS:
				getAccessGroups().clear();
				return;
			case AccessPackage.REST_SERVICE__SERVER:
				setServer(SERVER_EDEFAULT);
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
			case AccessPackage.REST_SERVICE__REF_TYPE:
				return refType != null;
			case AccessPackage.REST_SERVICE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case AccessPackage.REST_SERVICE__SUPPORTED_DOCUMENT_TYPES:
				return supportedDocumentTypes != null && !supportedDocumentTypes.isEmpty();
			case AccessPackage.REST_SERVICE__FRONTED_BY:
				return frontedBy != null && !frontedBy.isEmpty();
			case AccessPackage.REST_SERVICE__ACCESS_GROUPS:
				return accessGroups != null && !accessGroups.isEmpty();
			case AccessPackage.REST_SERVICE__SERVER:
				return SERVER_EDEFAULT == null ? server != null : !SERVER_EDEFAULT.equals(server);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", supportedDocumentTypes: ");
		result.append(supportedDocumentTypes);
		result.append(", server: ");
		result.append(server);
		result.append(')');
		return result.toString();
	}

} //RestServiceImpl
