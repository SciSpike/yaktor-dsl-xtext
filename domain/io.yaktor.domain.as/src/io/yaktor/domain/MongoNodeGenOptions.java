/**
 */
package io.yaktor.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo Node Gen Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.MongoNodeGenOptions#isUseLogger <em>Use Logger</em>}</li>
 *   <li>{@link io.yaktor.domain.MongoNodeGenOptions#getModelPath <em>Model Path</em>}</li>
 *   <li>{@link io.yaktor.domain.MongoNodeGenOptions#getTestPath <em>Test Path</em>}</li>
 *   <li>{@link io.yaktor.domain.MongoNodeGenOptions#isGenerateTest <em>Generate Test</em>}</li>
 *   <li>{@link io.yaktor.domain.MongoNodeGenOptions#getTableOptions <em>Table Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getMongoNodeGenOptions()
 * @model
 * @generated
 */
public interface MongoNodeGenOptions extends NodeGenOption {
	/**
	 * Returns the value of the '<em><b>Use Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Logger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Logger</em>' attribute.
	 * @see #setUseLogger(boolean)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeGenOptions_UseLogger()
	 * @model
	 * @generated
	 */
	boolean isUseLogger();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeGenOptions#isUseLogger <em>Use Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Logger</em>' attribute.
	 * @see #isUseLogger()
	 * @generated
	 */
	void setUseLogger(boolean value);

	/**
	 * Returns the value of the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Path</em>' attribute.
	 * @see #setModelPath(String)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeGenOptions_ModelPath()
	 * @model
	 * @generated
	 */
	String getModelPath();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeGenOptions#getModelPath <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Path</em>' attribute.
	 * @see #getModelPath()
	 * @generated
	 */
	void setModelPath(String value);

	/**
	 * Returns the value of the '<em><b>Test Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Path</em>' attribute.
	 * @see #setTestPath(String)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeGenOptions_TestPath()
	 * @model
	 * @generated
	 */
	String getTestPath();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeGenOptions#getTestPath <em>Test Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Path</em>' attribute.
	 * @see #getTestPath()
	 * @generated
	 */
	void setTestPath(String value);

	/**
	 * Returns the value of the '<em><b>Generate Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Test</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Test</em>' attribute.
	 * @see #setGenerateTest(boolean)
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeGenOptions_GenerateTest()
	 * @model
	 * @generated
	 */
	boolean isGenerateTest();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.MongoNodeGenOptions#isGenerateTest <em>Generate Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Test</em>' attribute.
	 * @see #isGenerateTest()
	 * @generated
	 */
	void setGenerateTest(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Options</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.MongoNodeTableOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Options</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getMongoNodeGenOptions_TableOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MongoNodeTableOptions> getTableOptions();

} // MongoNodeGenOptions
