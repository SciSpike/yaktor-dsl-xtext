/**
 */
package io.yaktor.conversation.impl;

import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.PublishableByMe;
import io.yaktor.conversation.PublishableByOthers;
import io.yaktor.conversation.State;
import io.yaktor.conversation.SubscribableByMe;
import io.yaktor.conversation.SubscribableByOthers;
import io.yaktor.conversation.Transition;
import io.yaktor.types.ProjectionField;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getToState <em>To State</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#isRequiresExecution <em>Requires Execution</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getExCausedBy <em>Ex Caused By</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getCausedBy <em>Caused By</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getExTriggers <em>Ex Triggers</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getFieldMapping <em>Field Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getToState() <em>To State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToState()
	 * @generated
	 * @ordered
	 */
	protected State toState;

	/**
	 * The default value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapping() <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapping()
	 * @generated
	 * @ordered
	 */
	protected String mapping = MAPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresExecution() <em>Requires Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresExecution() <em>Requires Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresExecution = REQUIRES_EXECUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExCausedBy() <em>Ex Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExCausedBy()
	 * @generated
	 * @ordered
	 */
	protected SubscribableByOthers exCausedBy;

	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected SubscribableByMe causedBy;

	/**
	 * The cached value of the '{@link #getExTriggers() <em>Ex Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExTriggers()
	 * @generated
	 * @ordered
	 */
	protected PublishableByOthers exTriggers;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected PublishableByMe triggers;

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
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConversationPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getToState() {
		if (toState != null && toState.eIsProxy()) {
			InternalEObject oldToState = (InternalEObject)toState;
			toState = (State)eResolveProxy(oldToState);
			if (toState != oldToState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__TO_STATE, oldToState, toState));
			}
		}
		return toState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetToState() {
		return toState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToState(State newToState) {
		State oldToState = toState;
		toState = newToState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__TO_STATE, oldToState, toState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapping() {
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(String newMapping) {
		String oldMapping = mapping;
		mapping = newMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__MAPPING, oldMapping, mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiresExecution() {
		return requiresExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresExecution(boolean newRequiresExecution) {
		boolean oldRequiresExecution = requiresExecution;
		requiresExecution = newRequiresExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__REQUIRES_EXECUTION, oldRequiresExecution, requiresExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribableByOthers getExCausedBy() {
		if (exCausedBy != null && exCausedBy.eIsProxy()) {
			InternalEObject oldExCausedBy = (InternalEObject)exCausedBy;
			exCausedBy = (SubscribableByOthers)eResolveProxy(oldExCausedBy);
			if (exCausedBy != oldExCausedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__EX_CAUSED_BY, oldExCausedBy, exCausedBy));
			}
		}
		return exCausedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribableByOthers basicGetExCausedBy() {
		return exCausedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExCausedBy(SubscribableByOthers newExCausedBy) {
		SubscribableByOthers oldExCausedBy = exCausedBy;
		exCausedBy = newExCausedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__EX_CAUSED_BY, oldExCausedBy, exCausedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribableByMe getCausedBy() {
		if (causedBy != null && causedBy.eIsProxy()) {
			InternalEObject oldCausedBy = (InternalEObject)causedBy;
			causedBy = (SubscribableByMe)eResolveProxy(oldCausedBy);
			if (causedBy != oldCausedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__CAUSED_BY, oldCausedBy, causedBy));
			}
		}
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribableByMe basicGetCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(SubscribableByMe newCausedBy) {
		SubscribableByMe oldCausedBy = causedBy;
		causedBy = newCausedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__CAUSED_BY, oldCausedBy, causedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishableByOthers getExTriggers() {
		if (exTriggers != null && exTriggers.eIsProxy()) {
			InternalEObject oldExTriggers = (InternalEObject)exTriggers;
			exTriggers = (PublishableByOthers)eResolveProxy(oldExTriggers);
			if (exTriggers != oldExTriggers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__EX_TRIGGERS, oldExTriggers, exTriggers));
			}
		}
		return exTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishableByOthers basicGetExTriggers() {
		return exTriggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExTriggers(PublishableByOthers newExTriggers) {
		PublishableByOthers oldExTriggers = exTriggers;
		exTriggers = newExTriggers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__EX_TRIGGERS, oldExTriggers, exTriggers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishableByMe getTriggers() {
		if (triggers != null && triggers.eIsProxy()) {
			InternalEObject oldTriggers = (InternalEObject)triggers;
			triggers = (PublishableByMe)eResolveProxy(oldTriggers);
			if (triggers != oldTriggers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__TRIGGERS, oldTriggers, triggers));
			}
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishableByMe basicGetTriggers() {
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggers(PublishableByMe newTriggers) {
		PublishableByMe oldTriggers = triggers;
		triggers = newTriggers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__TRIGGERS, oldTriggers, triggers));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__FIELD_MAPPING, oldFieldMapping, fieldMapping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__FIELD_MAPPING, oldFieldMapping, fieldMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConversationPackage.TRANSITION__TO_STATE:
				if (resolve) return getToState();
				return basicGetToState();
			case ConversationPackage.TRANSITION__MAPPING:
				return getMapping();
			case ConversationPackage.TRANSITION__REQUIRES_EXECUTION:
				return isRequiresExecution();
			case ConversationPackage.TRANSITION__EX_CAUSED_BY:
				if (resolve) return getExCausedBy();
				return basicGetExCausedBy();
			case ConversationPackage.TRANSITION__CAUSED_BY:
				if (resolve) return getCausedBy();
				return basicGetCausedBy();
			case ConversationPackage.TRANSITION__EX_TRIGGERS:
				if (resolve) return getExTriggers();
				return basicGetExTriggers();
			case ConversationPackage.TRANSITION__TRIGGERS:
				if (resolve) return getTriggers();
				return basicGetTriggers();
			case ConversationPackage.TRANSITION__FIELD_MAPPING:
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
			case ConversationPackage.TRANSITION__TO_STATE:
				setToState((State)newValue);
				return;
			case ConversationPackage.TRANSITION__MAPPING:
				setMapping((String)newValue);
				return;
			case ConversationPackage.TRANSITION__REQUIRES_EXECUTION:
				setRequiresExecution((Boolean)newValue);
				return;
			case ConversationPackage.TRANSITION__EX_CAUSED_BY:
				setExCausedBy((SubscribableByOthers)newValue);
				return;
			case ConversationPackage.TRANSITION__CAUSED_BY:
				setCausedBy((SubscribableByMe)newValue);
				return;
			case ConversationPackage.TRANSITION__EX_TRIGGERS:
				setExTriggers((PublishableByOthers)newValue);
				return;
			case ConversationPackage.TRANSITION__TRIGGERS:
				setTriggers((PublishableByMe)newValue);
				return;
			case ConversationPackage.TRANSITION__FIELD_MAPPING:
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
			case ConversationPackage.TRANSITION__TO_STATE:
				setToState((State)null);
				return;
			case ConversationPackage.TRANSITION__MAPPING:
				setMapping(MAPPING_EDEFAULT);
				return;
			case ConversationPackage.TRANSITION__REQUIRES_EXECUTION:
				setRequiresExecution(REQUIRES_EXECUTION_EDEFAULT);
				return;
			case ConversationPackage.TRANSITION__EX_CAUSED_BY:
				setExCausedBy((SubscribableByOthers)null);
				return;
			case ConversationPackage.TRANSITION__CAUSED_BY:
				setCausedBy((SubscribableByMe)null);
				return;
			case ConversationPackage.TRANSITION__EX_TRIGGERS:
				setExTriggers((PublishableByOthers)null);
				return;
			case ConversationPackage.TRANSITION__TRIGGERS:
				setTriggers((PublishableByMe)null);
				return;
			case ConversationPackage.TRANSITION__FIELD_MAPPING:
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
			case ConversationPackage.TRANSITION__TO_STATE:
				return toState != null;
			case ConversationPackage.TRANSITION__MAPPING:
				return MAPPING_EDEFAULT == null ? mapping != null : !MAPPING_EDEFAULT.equals(mapping);
			case ConversationPackage.TRANSITION__REQUIRES_EXECUTION:
				return requiresExecution != REQUIRES_EXECUTION_EDEFAULT;
			case ConversationPackage.TRANSITION__EX_CAUSED_BY:
				return exCausedBy != null;
			case ConversationPackage.TRANSITION__CAUSED_BY:
				return causedBy != null;
			case ConversationPackage.TRANSITION__EX_TRIGGERS:
				return exTriggers != null;
			case ConversationPackage.TRANSITION__TRIGGERS:
				return triggers != null;
			case ConversationPackage.TRANSITION__FIELD_MAPPING:
				return fieldMapping != null;
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
		result.append(" (mapping: ");
		result.append(mapping);
		result.append(", requiresExecution: ");
		result.append(requiresExecution);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
