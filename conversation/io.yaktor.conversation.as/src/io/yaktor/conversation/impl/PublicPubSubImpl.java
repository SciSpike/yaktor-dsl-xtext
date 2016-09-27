/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.Agent;
import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.PublicPubSub;

import io.yaktor.conversation.PubliclySubscribable;
import io.yaktor.conversation.PublishableByMe;
import io.yaktor.conversation.SubscribableByOthers;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.PublicPubSubImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicPubSubImpl extends PubliclyPublishableImpl implements PublicPubSub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicPubSubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.PUBLIC_PUB_SUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getParent() {
		if (eContainerFeatureID() != ConversationPackage.PUBLIC_PUB_SUB__PARENT) return null;
		return (Agent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Agent newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ConversationPackage.PUBLIC_PUB_SUB__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Agent newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ConversationPackage.PUBLIC_PUB_SUB__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ConversationPackage.AGENT__SENDABLES, Agent.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.PUBLIC_PUB_SUB__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Agent)otherEnd, msgs);
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
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				return eInternalContainer().eInverseRemove(this, ConversationPackage.AGENT__SENDABLES, Agent.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				return getParent();
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
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				setParent((Agent)newValue);
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
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				setParent((Agent)null);
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
			case ConversationPackage.PUBLIC_PUB_SUB__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PublishableByMe.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubscribableByOthers.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PubliclySubscribable.class) {
			switch (derivedFeatureID) {
				case ConversationPackage.PUBLIC_PUB_SUB__PARENT: return ConversationPackage.PUBLICLY_SUBSCRIBABLE__PARENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PublishableByMe.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SubscribableByOthers.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PubliclySubscribable.class) {
			switch (baseFeatureID) {
				case ConversationPackage.PUBLICLY_SUBSCRIBABLE__PARENT: return ConversationPackage.PUBLIC_PUB_SUB__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PublicPubSubImpl
