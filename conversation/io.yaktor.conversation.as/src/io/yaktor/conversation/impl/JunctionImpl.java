/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.Junction;
import io.yaktor.conversation.SubscribableByOthers;
import io.yaktor.types.ProjectionField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.JunctionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.JunctionImpl#getFieldMapping <em>Field Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JunctionImpl extends MinimalEObjectImpl.Container implements Junction {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected SubscribableByOthers message;

	/**
	 * The cached value of the '{@link #getFieldMapping() <em>Field Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldMapping()
	 * @generated
	 * @ordered
	 */
	protected ProjectionField fieldMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.JUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribableByOthers getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (SubscribableByOthers)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.JUNCTION__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribableByOthers basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(SubscribableByOthers newMessage) {
		SubscribableByOthers oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.JUNCTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionField getFieldMapping() {
		if (fieldMapping != null && fieldMapping.eIsProxy()) {
			InternalEObject oldFieldMapping = (InternalEObject)fieldMapping;
			fieldMapping = (ProjectionField)eResolveProxy(oldFieldMapping);
			if (fieldMapping != oldFieldMapping) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.JUNCTION__FIELD_MAPPING, oldFieldMapping, fieldMapping));
			}
		}
		return fieldMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectionField basicGetFieldMapping() {
		return fieldMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldMapping(ProjectionField newFieldMapping) {
		ProjectionField oldFieldMapping = fieldMapping;
		fieldMapping = newFieldMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.JUNCTION__FIELD_MAPPING, oldFieldMapping, fieldMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationPackage.JUNCTION__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case ConversationPackage.JUNCTION__FIELD_MAPPING:
				if (resolve) return getFieldMapping();
				return basicGetFieldMapping();
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
			case ConversationPackage.JUNCTION__MESSAGE:
				setMessage((SubscribableByOthers)newValue);
				return;
			case ConversationPackage.JUNCTION__FIELD_MAPPING:
				setFieldMapping((ProjectionField)newValue);
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
			case ConversationPackage.JUNCTION__MESSAGE:
				setMessage((SubscribableByOthers)null);
				return;
			case ConversationPackage.JUNCTION__FIELD_MAPPING:
				setFieldMapping((ProjectionField)null);
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
			case ConversationPackage.JUNCTION__MESSAGE:
				return message != null;
			case ConversationPackage.JUNCTION__FIELD_MAPPING:
				return fieldMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //JunctionImpl
