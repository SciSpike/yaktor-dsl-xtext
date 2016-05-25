/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.PubliclySubscribable;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicly Subscribable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PubliclySubscribableImpl extends PublishableByMeImpl implements PubliclySubscribable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PubliclySubscribableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.PUBLICLY_SUBSCRIBABLE;
	}

} //PubliclySubscribableImpl
