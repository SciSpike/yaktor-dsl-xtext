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
import io.yaktor.types.Projection;
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
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getCausedByName <em>Caused By Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getTriggersName <em>Triggers Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getExCausedByName <em>Ex Caused By Name</em>}</li>
 *   <li>{@link io.yaktor.conversation.impl.TransitionImpl#getExTriggersName <em>Ex Triggers Name</em>}</li>
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
	 * The cached value of the '{@link #getRefType() <em>Ref Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefType()
	 * @generated
	 * @ordered
	 */
	protected Projection refType;

	/**
	 * The default value of the '{@link #getCausedByName() <em>Caused By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedByName()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSED_BY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCausedByName() <em>Caused By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedByName()
	 * @generated
	 * @ordered
	 */
	protected String causedByName = CAUSED_BY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggersName() <em>Triggers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGERS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggersName() <em>Triggers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggersName()
	 * @generated
	 * @ordered
	 */
	protected String triggersName = TRIGGERS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExCausedByName() <em>Ex Caused By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExCausedByName()
	 * @generated
	 * @ordered
	 */
	protected static final String EX_CAUSED_BY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExCausedByName() <em>Ex Caused By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExCausedByName()
	 * @generated
	 * @ordered
	 */
	protected String exCausedByName = EX_CAUSED_BY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExTriggersName() <em>Ex Triggers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExTriggersName()
	 * @generated
	 * @ordered
	 */
	protected static final String EX_TRIGGERS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExTriggersName() <em>Ex Triggers Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExTriggersName()
	 * @generated
	 * @ordered
	 */
	protected String exTriggersName = EX_TRIGGERS_NAME_EDEFAULT;

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
	public Projection getRefType() {
		if (refType != null && refType.eIsProxy()) {
			InternalEObject oldRefType = (InternalEObject)refType;
			refType = (Projection)eResolveProxy(oldRefType);
			if (refType != oldRefType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConversationPackage.TRANSITION__REF_TYPE, oldRefType, refType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__REF_TYPE, oldRefType, refType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCausedByName() {
		return causedByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedByName(String newCausedByName) {
		String oldCausedByName = causedByName;
		causedByName = newCausedByName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__CAUSED_BY_NAME, oldCausedByName, causedByName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggersName() {
		return triggersName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggersName(String newTriggersName) {
		String oldTriggersName = triggersName;
		triggersName = newTriggersName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__TRIGGERS_NAME, oldTriggersName, triggersName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExCausedByName() {
		return exCausedByName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExCausedByName(String newExCausedByName) {
		String oldExCausedByName = exCausedByName;
		exCausedByName = newExCausedByName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__EX_CAUSED_BY_NAME, oldExCausedByName, exCausedByName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExTriggersName() {
		return exTriggersName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExTriggersName(String newExTriggersName) {
		String oldExTriggersName = exTriggersName;
		exTriggersName = newExTriggersName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConversationPackage.TRANSITION__EX_TRIGGERS_NAME, oldExTriggersName, exTriggersName));
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
			case ConversationPackage.TRANSITION__REF_TYPE:
				if (resolve) return getRefType();
				return basicGetRefType();
			case ConversationPackage.TRANSITION__CAUSED_BY_NAME:
				return getCausedByName();
			case ConversationPackage.TRANSITION__TRIGGERS_NAME:
				return getTriggersName();
			case ConversationPackage.TRANSITION__EX_CAUSED_BY_NAME:
				return getExCausedByName();
			case ConversationPackage.TRANSITION__EX_TRIGGERS_NAME:
				return getExTriggersName();
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
			case ConversationPackage.TRANSITION__REF_TYPE:
				setRefType((Projection)newValue);
				return;
			case ConversationPackage.TRANSITION__CAUSED_BY_NAME:
				setCausedByName((String)newValue);
				return;
			case ConversationPackage.TRANSITION__TRIGGERS_NAME:
				setTriggersName((String)newValue);
				return;
			case ConversationPackage.TRANSITION__EX_CAUSED_BY_NAME:
				setExCausedByName((String)newValue);
				return;
			case ConversationPackage.TRANSITION__EX_TRIGGERS_NAME:
				setExTriggersName((String)newValue);
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
			case ConversationPackage.TRANSITION__REF_TYPE:
				setRefType((Projection)null);
				return;
			case ConversationPackage.TRANSITION__CAUSED_BY_NAME:
				setCausedByName(CAUSED_BY_NAME_EDEFAULT);
				return;
			case ConversationPackage.TRANSITION__TRIGGERS_NAME:
				setTriggersName(TRIGGERS_NAME_EDEFAULT);
				return;
			case ConversationPackage.TRANSITION__EX_CAUSED_BY_NAME:
				setExCausedByName(EX_CAUSED_BY_NAME_EDEFAULT);
				return;
			case ConversationPackage.TRANSITION__EX_TRIGGERS_NAME:
				setExTriggersName(EX_TRIGGERS_NAME_EDEFAULT);
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
			case ConversationPackage.TRANSITION__REF_TYPE:
				return refType != null;
			case ConversationPackage.TRANSITION__CAUSED_BY_NAME:
				return CAUSED_BY_NAME_EDEFAULT == null ? causedByName != null : !CAUSED_BY_NAME_EDEFAULT.equals(causedByName);
			case ConversationPackage.TRANSITION__TRIGGERS_NAME:
				return TRIGGERS_NAME_EDEFAULT == null ? triggersName != null : !TRIGGERS_NAME_EDEFAULT.equals(triggersName);
			case ConversationPackage.TRANSITION__EX_CAUSED_BY_NAME:
				return EX_CAUSED_BY_NAME_EDEFAULT == null ? exCausedByName != null : !EX_CAUSED_BY_NAME_EDEFAULT.equals(exCausedByName);
			case ConversationPackage.TRANSITION__EX_TRIGGERS_NAME:
				return EX_TRIGGERS_NAME_EDEFAULT == null ? exTriggersName != null : !EX_TRIGGERS_NAME_EDEFAULT.equals(exTriggersName);
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
		result.append(", causedByName: ");
		result.append(causedByName);
		result.append(", triggersName: ");
		result.append(triggersName);
		result.append(", exCausedByName: ");
		result.append(exCausedByName);
		result.append(", exTriggersName: ");
		result.append(exTriggersName);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
