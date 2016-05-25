/**
 */
package io.yaktor.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getTypes <em>Types</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getController <em>Controller</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getResources <em>Resources</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getProperties <em>Properties</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getViews <em>Views</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getWebxml <em>Webxml</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getPom <em>Pom</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getStyles <em>Styles</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getClasses <em>Classes</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getWebmvc <em>Webmvc</em>}</li>
 *   <li>{@link io.yaktor.domain.GenerationInclusion#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion()
 * @model
 * @generated
 */
public interface GenerationInclusion extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setTypes(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Types()
	 * @model
	 * @generated
	 */
	InclusionType getTypes();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getTypes <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setController(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Controller()
	 * @model
	 * @generated
	 */
	InclusionType getController();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getController <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getController()
	 * @generated
	 */
	void setController(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setResources(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Resources()
	 * @model
	 * @generated
	 */
	InclusionType getResources();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getResources <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getResources()
	 * @generated
	 */
	void setResources(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setProperties(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Properties()
	 * @model
	 * @generated
	 */
	InclusionType getProperties();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setViews(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Views()
	 * @model
	 * @generated
	 */
	InclusionType getViews();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getViews <em>Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Views</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getViews()
	 * @generated
	 */
	void setViews(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Webxml</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webxml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webxml</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setWebxml(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Webxml()
	 * @model
	 * @generated
	 */
	InclusionType getWebxml();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getWebxml <em>Webxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webxml</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getWebxml()
	 * @generated
	 */
	void setWebxml(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Pom</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pom</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setPom(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Pom()
	 * @model
	 * @generated
	 */
	InclusionType getPom();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getPom <em>Pom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pom</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getPom()
	 * @generated
	 */
	void setPom(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setStyles(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Styles()
	 * @model
	 * @generated
	 */
	InclusionType getStyles();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getStyles <em>Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styles</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getStyles()
	 * @generated
	 */
	void setStyles(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setClasses(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Classes()
	 * @model
	 * @generated
	 */
	InclusionType getClasses();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getClasses <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Layouts</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layouts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layouts</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setLayouts(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Layouts()
	 * @model
	 * @generated
	 */
	InclusionType getLayouts();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getLayouts <em>Layouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layouts</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getLayouts()
	 * @generated
	 */
	void setLayouts(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Webmvc</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webmvc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webmvc</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setWebmvc(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Webmvc()
	 * @model
	 * @generated
	 */
	InclusionType getWebmvc();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getWebmvc <em>Webmvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webmvc</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getWebmvc()
	 * @generated
	 */
	void setWebmvc(InclusionType value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute.
	 * The literals are from the enumeration {@link io.yaktor.domain.InclusionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #setTags(InclusionType)
	 * @see io.yaktor.domain.DomainPackage#getGenerationInclusion_Tags()
	 * @model
	 * @generated
	 */
	InclusionType getTags();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.GenerationInclusion#getTags <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' attribute.
	 * @see io.yaktor.domain.InclusionType
	 * @see #getTags()
	 * @generated
	 */
	void setTags(InclusionType value);

} // GenerationInclusion
