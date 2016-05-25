/**
 */
package io.yaktor.types.impl;

import io.yaktor.access.AccessPackage;
import io.yaktor.access.impl.AccessPackageImpl;
import io.yaktor.conversation.ConversationPackage;
import io.yaktor.conversation.impl.ConversationPackageImpl;
import io.yaktor.domain.DomainPackage;
import io.yaktor.mongoNode.MongoNodePackage;
import io.yaktor.types.MappedField;
import io.yaktor.types.NewField;
import io.yaktor.types.Projection;
import io.yaktor.types.ProjectionContainmentField;
import io.yaktor.types.ProjectionField;
import io.yaktor.types.TypeContainmentField;
import io.yaktor.types.TypesFactory;
import io.yaktor.types.TypesPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectionContainmentFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeContainmentFieldEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see io.yaktor.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DomainPackage.eINSTANCE.eClass();
		MongoNodePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ConversationPackageImpl theConversationPackage = (ConversationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConversationPackage.eNS_URI) instanceof ConversationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConversationPackage.eNS_URI) : ConversationPackage.eINSTANCE);
		AccessPackageImpl theAccessPackage = (AccessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI) instanceof AccessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccessPackage.eNS_URI) : AccessPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theConversationPackage.createPackageContents();
		theAccessPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theConversationPackage.initializePackageContents();
		theAccessPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionField() {
		return projectionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionField_Alias() {
		return (EAttribute)projectionFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionField_OldField() {
		return (EReference)projectionFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionField_NewField() {
		return (EReference)projectionFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionField_Parent() {
		return (EReference)projectionFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappedField() {
		return mappedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedField_Projection() {
		return (EReference)mappedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewField() {
		return newFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjection() {
		return projectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjection_Fields() {
		return (EReference)projectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjection_Entity() {
		return (EReference)projectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjection_Parent() {
		return (EReference)projectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjection_Alias() {
		return (EAttribute)projectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjection_Name() {
		return (EAttribute)projectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectionContainmentField() {
		return projectionContainmentFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectionContainmentField_Projection() {
		return (EReference)projectionContainmentFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectionContainmentField_Cardinality() {
		return (EAttribute)projectionContainmentFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeContainmentField() {
		return typeContainmentFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projectionFieldEClass = createEClass(PROJECTION_FIELD);
		createEAttribute(projectionFieldEClass, PROJECTION_FIELD__ALIAS);
		createEReference(projectionFieldEClass, PROJECTION_FIELD__OLD_FIELD);
		createEReference(projectionFieldEClass, PROJECTION_FIELD__NEW_FIELD);
		createEReference(projectionFieldEClass, PROJECTION_FIELD__PARENT);

		mappedFieldEClass = createEClass(MAPPED_FIELD);
		createEReference(mappedFieldEClass, MAPPED_FIELD__PROJECTION);

		newFieldEClass = createEClass(NEW_FIELD);

		projectionEClass = createEClass(PROJECTION);
		createEReference(projectionEClass, PROJECTION__FIELDS);
		createEReference(projectionEClass, PROJECTION__ENTITY);
		createEReference(projectionEClass, PROJECTION__PARENT);
		createEAttribute(projectionEClass, PROJECTION__ALIAS);
		createEAttribute(projectionEClass, PROJECTION__NAME);

		projectionContainmentFieldEClass = createEClass(PROJECTION_CONTAINMENT_FIELD);
		createEReference(projectionContainmentFieldEClass, PROJECTION_CONTAINMENT_FIELD__PROJECTION);
		createEAttribute(projectionContainmentFieldEClass, PROJECTION_CONTAINMENT_FIELD__CARDINALITY);

		typeContainmentFieldEClass = createEClass(TYPE_CONTAINMENT_FIELD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mappedFieldEClass.getESuperTypes().add(this.getProjectionField());
		newFieldEClass.getESuperTypes().add(this.getProjectionField());
		projectionContainmentFieldEClass.getESuperTypes().add(this.getProjectionField());
		typeContainmentFieldEClass.getESuperTypes().add(this.getNewField());
		typeContainmentFieldEClass.getESuperTypes().add(this.getMappedField());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectionFieldEClass, ProjectionField.class, "ProjectionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectionField_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ProjectionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionField_OldField(), theDomainPackage.getField(), null, "oldField", null, 0, 1, ProjectionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionField_NewField(), theDomainPackage.getField(), null, "newField", null, 0, 1, ProjectionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectionField_Parent(), this.getProjection(), this.getProjection_Fields(), "parent", null, 0, 1, ProjectionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappedFieldEClass, MappedField.class, "MappedField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappedField_Projection(), this.getProjection(), this.getProjection_Parent(), "projection", null, 0, 1, MappedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newFieldEClass, NewField.class, "NewField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectionEClass, Projection.class, "Projection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjection_Fields(), this.getProjectionField(), this.getProjectionField_Parent(), "fields", null, 0, -1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjection_Entity(), theDomainPackage.getEntity(), null, "entity", null, 0, 1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjection_Parent(), this.getMappedField(), this.getMappedField_Projection(), "parent", null, 0, 1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjection_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Projection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectionContainmentFieldEClass, ProjectionContainmentField.class, "ProjectionContainmentField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectionContainmentField_Projection(), this.getProjection(), null, "projection", null, 0, 1, ProjectionContainmentField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectionContainmentField_Cardinality(), theDomainPackage.getCardinality(), "cardinality", "!", 0, 1, ProjectionContainmentField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContainmentFieldEClass, TypeContainmentField.class, "TypeContainmentField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TypesPackageImpl
