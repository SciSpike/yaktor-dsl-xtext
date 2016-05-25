/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.GenerationInclusion;
import io.yaktor.domain.InclusionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getController <em>Controller</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getViews <em>Views</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getWebxml <em>Webxml</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getPom <em>Pom</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getLayouts <em>Layouts</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getWebmvc <em>Webmvc</em>}</li>
 *   <li>{@link io.yaktor.domain.impl.GenerationInclusionImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenerationInclusionImpl extends MinimalEObjectImpl.Container implements GenerationInclusion {
	/**
	 * The default value of the '{@link #getTypes() <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType TYPES_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected InclusionType types = TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType CONTROLLER_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected InclusionType controller = CONTROLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType RESOURCES_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected InclusionType resources = RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType PROPERTIES_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected InclusionType properties = PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getViews() <em>Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType VIEWS_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected InclusionType views = VIEWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebxml() <em>Webxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebxml()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType WEBXML_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getWebxml() <em>Webxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebxml()
	 * @generated
	 * @ordered
	 */
	protected InclusionType webxml = WEBXML_EDEFAULT;

	/**
	 * The default value of the '{@link #getPom() <em>Pom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPom()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType POM_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getPom() <em>Pom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPom()
	 * @generated
	 * @ordered
	 */
	protected InclusionType pom = POM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyles() <em>Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType STYLES_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected InclusionType styles = STYLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClasses() <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType CLASSES_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected InclusionType classes = CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayouts() <em>Layouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType LAYOUTS_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected InclusionType layouts = LAYOUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebmvc() <em>Webmvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmvc()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType WEBMVC_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getWebmvc() <em>Webmvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebmvc()
	 * @generated
	 * @ordered
	 */
	protected InclusionType webmvc = WEBMVC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTags() <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected static final InclusionType TAGS_EDEFAULT = InclusionType.NONE;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected InclusionType tags = TAGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.GENERATION_INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(InclusionType newTypes) {
		InclusionType oldTypes = types;
		types = newTypes == null ? TYPES_EDEFAULT : newTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__TYPES, oldTypes, types));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(InclusionType newController) {
		InclusionType oldController = controller;
		controller = newController == null ? CONTROLLER_EDEFAULT : newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__CONTROLLER, oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(InclusionType newResources) {
		InclusionType oldResources = resources;
		resources = newResources == null ? RESOURCES_EDEFAULT : newResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__RESOURCES, oldResources, resources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(InclusionType newProperties) {
		InclusionType oldProperties = properties;
		properties = newProperties == null ? PROPERTIES_EDEFAULT : newProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__PROPERTIES, oldProperties, properties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getViews() {
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViews(InclusionType newViews) {
		InclusionType oldViews = views;
		views = newViews == null ? VIEWS_EDEFAULT : newViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__VIEWS, oldViews, views));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getWebxml() {
		return webxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebxml(InclusionType newWebxml) {
		InclusionType oldWebxml = webxml;
		webxml = newWebxml == null ? WEBXML_EDEFAULT : newWebxml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__WEBXML, oldWebxml, webxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getPom() {
		return pom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPom(InclusionType newPom) {
		InclusionType oldPom = pom;
		pom = newPom == null ? POM_EDEFAULT : newPom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__POM, oldPom, pom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getStyles() {
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyles(InclusionType newStyles) {
		InclusionType oldStyles = styles;
		styles = newStyles == null ? STYLES_EDEFAULT : newStyles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__STYLES, oldStyles, styles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getClasses() {
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasses(InclusionType newClasses) {
		InclusionType oldClasses = classes;
		classes = newClasses == null ? CLASSES_EDEFAULT : newClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__CLASSES, oldClasses, classes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getLayouts() {
		return layouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayouts(InclusionType newLayouts) {
		InclusionType oldLayouts = layouts;
		layouts = newLayouts == null ? LAYOUTS_EDEFAULT : newLayouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__LAYOUTS, oldLayouts, layouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getWebmvc() {
		return webmvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebmvc(InclusionType newWebmvc) {
		InclusionType oldWebmvc = webmvc;
		webmvc = newWebmvc == null ? WEBMVC_EDEFAULT : newWebmvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__WEBMVC, oldWebmvc, webmvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(InclusionType newTags) {
		InclusionType oldTags = tags;
		tags = newTags == null ? TAGS_EDEFAULT : newTags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.GENERATION_INCLUSION__TAGS, oldTags, tags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.GENERATION_INCLUSION__TYPES:
				return getTypes();
			case DomainPackage.GENERATION_INCLUSION__CONTROLLER:
				return getController();
			case DomainPackage.GENERATION_INCLUSION__RESOURCES:
				return getResources();
			case DomainPackage.GENERATION_INCLUSION__PROPERTIES:
				return getProperties();
			case DomainPackage.GENERATION_INCLUSION__VIEWS:
				return getViews();
			case DomainPackage.GENERATION_INCLUSION__WEBXML:
				return getWebxml();
			case DomainPackage.GENERATION_INCLUSION__POM:
				return getPom();
			case DomainPackage.GENERATION_INCLUSION__STYLES:
				return getStyles();
			case DomainPackage.GENERATION_INCLUSION__CLASSES:
				return getClasses();
			case DomainPackage.GENERATION_INCLUSION__LAYOUTS:
				return getLayouts();
			case DomainPackage.GENERATION_INCLUSION__WEBMVC:
				return getWebmvc();
			case DomainPackage.GENERATION_INCLUSION__TAGS:
				return getTags();
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
			case DomainPackage.GENERATION_INCLUSION__TYPES:
				setTypes((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__CONTROLLER:
				setController((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__RESOURCES:
				setResources((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__PROPERTIES:
				setProperties((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__VIEWS:
				setViews((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__WEBXML:
				setWebxml((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__POM:
				setPom((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__STYLES:
				setStyles((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__CLASSES:
				setClasses((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__LAYOUTS:
				setLayouts((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__WEBMVC:
				setWebmvc((InclusionType)newValue);
				return;
			case DomainPackage.GENERATION_INCLUSION__TAGS:
				setTags((InclusionType)newValue);
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
			case DomainPackage.GENERATION_INCLUSION__TYPES:
				setTypes(TYPES_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__CONTROLLER:
				setController(CONTROLLER_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__RESOURCES:
				setResources(RESOURCES_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__PROPERTIES:
				setProperties(PROPERTIES_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__VIEWS:
				setViews(VIEWS_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__WEBXML:
				setWebxml(WEBXML_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__POM:
				setPom(POM_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__STYLES:
				setStyles(STYLES_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__CLASSES:
				setClasses(CLASSES_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__LAYOUTS:
				setLayouts(LAYOUTS_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__WEBMVC:
				setWebmvc(WEBMVC_EDEFAULT);
				return;
			case DomainPackage.GENERATION_INCLUSION__TAGS:
				setTags(TAGS_EDEFAULT);
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
			case DomainPackage.GENERATION_INCLUSION__TYPES:
				return types != TYPES_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__CONTROLLER:
				return controller != CONTROLLER_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__RESOURCES:
				return resources != RESOURCES_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__PROPERTIES:
				return properties != PROPERTIES_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__VIEWS:
				return views != VIEWS_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__WEBXML:
				return webxml != WEBXML_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__POM:
				return pom != POM_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__STYLES:
				return styles != STYLES_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__CLASSES:
				return classes != CLASSES_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__LAYOUTS:
				return layouts != LAYOUTS_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__WEBMVC:
				return webmvc != WEBMVC_EDEFAULT;
			case DomainPackage.GENERATION_INCLUSION__TAGS:
				return tags != TAGS_EDEFAULT;
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
		result.append(" (types: ");
		result.append(types);
		result.append(", controller: ");
		result.append(controller);
		result.append(", resources: ");
		result.append(resources);
		result.append(", properties: ");
		result.append(properties);
		result.append(", views: ");
		result.append(views);
		result.append(", webxml: ");
		result.append(webxml);
		result.append(", pom: ");
		result.append(pom);
		result.append(", styles: ");
		result.append(styles);
		result.append(", classes: ");
		result.append(classes);
		result.append(", layouts: ");
		result.append(layouts);
		result.append(", webmvc: ");
		result.append(webmvc);
		result.append(", tags: ");
		result.append(tags);
		result.append(')');
		return result.toString();
	}

} //GenerationInclusionImpl
