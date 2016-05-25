/**
 */
package io.yaktor.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jpa Gen Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.JpaGenOptions#getProject <em>Project</em>}</li>
 *   <li>{@link io.yaktor.domain.JpaGenOptions#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link io.yaktor.domain.JpaGenOptions#getGenerationInclusion <em>Generation Inclusion</em>}</li>
 *   <li>{@link io.yaktor.domain.JpaGenOptions#isUseAspects <em>Use Aspects</em>}</li>
 *   <li>{@link io.yaktor.domain.JpaGenOptions#isMetaData <em>Meta Data</em>}</li>
 *   <li>{@link io.yaktor.domain.JpaGenOptions#getTableOptions <em>Table Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions()
 * @model
 * @generated
 */
public interface JpaGenOptions extends GenOptions {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(ProjectOptions)
	 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions_Project()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProjectOptions getProject();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaGenOptions#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(ProjectOptions value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' containment reference.
	 * @see #setPersistence(PersistenceOptions)
	 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions_Persistence()
	 * @model containment="true"
	 * @generated
	 */
	PersistenceOptions getPersistence();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaGenOptions#getPersistence <em>Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' containment reference.
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(PersistenceOptions value);

	/**
	 * Returns the value of the '<em><b>Generation Inclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation Inclusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Inclusion</em>' containment reference.
	 * @see #setGenerationInclusion(GenerationInclusion)
	 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions_GenerationInclusion()
	 * @model containment="true"
	 * @generated
	 */
	GenerationInclusion getGenerationInclusion();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaGenOptions#getGenerationInclusion <em>Generation Inclusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Inclusion</em>' containment reference.
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	void setGenerationInclusion(GenerationInclusion value);

	/**
	 * Returns the value of the '<em><b>Use Aspects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Aspects</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Aspects</em>' attribute.
	 * @see #setUseAspects(boolean)
	 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions_UseAspects()
	 * @model
	 * @generated
	 */
	boolean isUseAspects();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaGenOptions#isUseAspects <em>Use Aspects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Aspects</em>' attribute.
	 * @see #isUseAspects()
	 * @generated
	 */
	void setUseAspects(boolean value);

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' attribute.
	 * @see #setMetaData(boolean)
	 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions_MetaData()
	 * @model
	 * @generated
	 */
	boolean isMetaData();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.JpaGenOptions#isMetaData <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' attribute.
	 * @see #isMetaData()
	 * @generated
	 */
	void setMetaData(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Options</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.JpaTableOptions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Options</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getJpaGenOptions_TableOptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<JpaTableOptions> getTableOptions();

} // JpaGenOptions
