/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.PrivatePubSub;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private Pub Sub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrivatePubSubImpl extends PublishableByMeImpl implements PrivatePubSub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivatePubSubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.PRIVATE_PUB_SUB;
	}

} //PrivatePubSubImpl
