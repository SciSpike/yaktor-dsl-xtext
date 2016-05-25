/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.Decision;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DecisionImpl extends StateImpl implements Decision {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated false
	 */
	protected DecisionImpl() {
		super();
		this.requiresExecution = true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.DECISION;
	}

} //DecisionImpl
