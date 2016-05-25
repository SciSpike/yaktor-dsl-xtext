/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.MongoNodeGenOptions;
import io.yaktor.domain.MongoNodeTableOptions;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mongo Node Gen Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl#isUseLogger <em>Use Logger</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl#getModelPath <em>Model Path</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl#getTestPath <em>Test Path</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl#isGenerateTest <em>Generate Test</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl#getTableOptions <em>Table Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MongoNodeGenOptionsImpl extends NodeGenOptionImpl implements MongoNodeGenOptions {
	/**
	 * The default value of the '{@link #isUseLogger() <em>Use Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseLogger()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_LOGGER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseLogger() <em>Use Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseLogger()
	 * @generated
	 * @ordered
	 */
	protected boolean useLogger = USE_LOGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected String modelPath = MODEL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestPath() <em>Test Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestPath() <em>Test Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestPath()
	 * @generated
	 * @ordered
	 */
	protected String testPath = TEST_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateTest() <em>Generate Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateTest() <em>Generate Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateTest()
	 * @generated
	 * @ordered
	 */
	protected boolean generateTest = GENERATE_TEST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableOptions() <em>Table Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MongoNodeTableOptions> tableOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MongoNodeGenOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.MONGO_NODE_GEN_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseLogger() {
		return useLogger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLogger(boolean newUseLogger) {
		boolean oldUseLogger = useLogger;
		useLogger = newUseLogger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_GEN_OPTIONS__USE_LOGGER, oldUseLogger, useLogger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelPath() {
		return modelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelPath(String newModelPath) {
		String oldModelPath = modelPath;
		modelPath = newModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_GEN_OPTIONS__MODEL_PATH, oldModelPath, modelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestPath() {
		return testPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestPath(String newTestPath) {
		String oldTestPath = testPath;
		testPath = newTestPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_GEN_OPTIONS__TEST_PATH, oldTestPath, testPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateTest() {
		return generateTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateTest(boolean newGenerateTest) {
		boolean oldGenerateTest = generateTest;
		generateTest = newGenerateTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.MONGO_NODE_GEN_OPTIONS__GENERATE_TEST, oldGenerateTest, generateTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MongoNodeTableOptions> getTableOptions() {
		if (tableOptions == null) {
			tableOptions = new EObjectContainmentEList<MongoNodeTableOptions>(MongoNodeTableOptions.class, this, DomainPackage.MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS);
		}
		return tableOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS:
				return ((InternalEList<?>)getTableOptions()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__USE_LOGGER:
				return isUseLogger();
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__MODEL_PATH:
				return getModelPath();
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TEST_PATH:
				return getTestPath();
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__GENERATE_TEST:
				return isGenerateTest();
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS:
				return getTableOptions();
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
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__USE_LOGGER:
				setUseLogger((Boolean)newValue);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__MODEL_PATH:
				setModelPath((String)newValue);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TEST_PATH:
				setTestPath((String)newValue);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__GENERATE_TEST:
				setGenerateTest((Boolean)newValue);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS:
				getTableOptions().clear();
				getTableOptions().addAll((Collection<? extends MongoNodeTableOptions>)newValue);
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
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__USE_LOGGER:
				setUseLogger(USE_LOGGER_EDEFAULT);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__MODEL_PATH:
				setModelPath(MODEL_PATH_EDEFAULT);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TEST_PATH:
				setTestPath(TEST_PATH_EDEFAULT);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__GENERATE_TEST:
				setGenerateTest(GENERATE_TEST_EDEFAULT);
				return;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS:
				getTableOptions().clear();
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
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__USE_LOGGER:
				return useLogger != USE_LOGGER_EDEFAULT;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__MODEL_PATH:
				return MODEL_PATH_EDEFAULT == null ? modelPath != null : !MODEL_PATH_EDEFAULT.equals(modelPath);
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TEST_PATH:
				return TEST_PATH_EDEFAULT == null ? testPath != null : !TEST_PATH_EDEFAULT.equals(testPath);
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__GENERATE_TEST:
				return generateTest != GENERATE_TEST_EDEFAULT;
			case DomainPackage.MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS:
				return tableOptions != null && !tableOptions.isEmpty();
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
		result.append(" (useLogger: ");
		result.append(useLogger);
		result.append(", modelPath: ");
		result.append(modelPath);
		result.append(", testPath: ");
		result.append(testPath);
		result.append(", generateTest: ");
		result.append(generateTest);
		result.append(')');
		return result.toString();
	}

} //MongoNodeGenOptionsImpl
