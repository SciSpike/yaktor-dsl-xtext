/**
 */
package io.yaktor.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.yaktor.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Xtext/io.yaktor.types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = io.yaktor.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.yaktor.types.impl.ProjectionFieldImpl <em>Projection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.types.impl.ProjectionFieldImpl
	 * @see io.yaktor.types.impl.TypesPackageImpl#getProjectionField()
	 * @generated
	 */
	int PROJECTION_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FIELD__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Old Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FIELD__OLD_FIELD = 1;

	/**
	 * The feature id for the '<em><b>New Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FIELD__NEW_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FIELD__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Projection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FIELD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Projection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.types.impl.MappedFieldImpl <em>Mapped Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.types.impl.MappedFieldImpl
	 * @see io.yaktor.types.impl.TypesPackageImpl#getMappedField()
	 * @generated
	 */
	int MAPPED_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD__ALIAS = PROJECTION_FIELD__ALIAS;

	/**
	 * The feature id for the '<em><b>Old Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD__OLD_FIELD = PROJECTION_FIELD__OLD_FIELD;

	/**
	 * The feature id for the '<em><b>New Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD__NEW_FIELD = PROJECTION_FIELD__NEW_FIELD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD__PARENT = PROJECTION_FIELD__PARENT;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD__PROJECTION = PROJECTION_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapped Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD_FEATURE_COUNT = PROJECTION_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapped Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_FIELD_OPERATION_COUNT = PROJECTION_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.types.impl.NewFieldImpl <em>New Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.types.impl.NewFieldImpl
	 * @see io.yaktor.types.impl.TypesPackageImpl#getNewField()
	 * @generated
	 */
	int NEW_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FIELD__ALIAS = PROJECTION_FIELD__ALIAS;

	/**
	 * The feature id for the '<em><b>Old Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FIELD__OLD_FIELD = PROJECTION_FIELD__OLD_FIELD;

	/**
	 * The feature id for the '<em><b>New Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FIELD__NEW_FIELD = PROJECTION_FIELD__NEW_FIELD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FIELD__PARENT = PROJECTION_FIELD__PARENT;

	/**
	 * The number of structural features of the '<em>New Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FIELD_FEATURE_COUNT = PROJECTION_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>New Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FIELD_OPERATION_COUNT = PROJECTION_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.types.impl.ProjectionImpl <em>Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.types.impl.ProjectionImpl
	 * @see io.yaktor.types.impl.TypesPackageImpl#getProjection()
	 * @generated
	 */
	int PROJECTION = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link io.yaktor.types.impl.ProjectionContainmentFieldImpl <em>Projection Containment Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.types.impl.ProjectionContainmentFieldImpl
	 * @see io.yaktor.types.impl.TypesPackageImpl#getProjectionContainmentField()
	 * @generated
	 */
	int PROJECTION_CONTAINMENT_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD__ALIAS = PROJECTION_FIELD__ALIAS;

	/**
	 * The feature id for the '<em><b>Old Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD__OLD_FIELD = PROJECTION_FIELD__OLD_FIELD;

	/**
	 * The feature id for the '<em><b>New Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD__NEW_FIELD = PROJECTION_FIELD__NEW_FIELD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD__PARENT = PROJECTION_FIELD__PARENT;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD__PROJECTION = PROJECTION_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD__CARDINALITY = PROJECTION_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Projection Containment Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD_FEATURE_COUNT = PROJECTION_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Projection Containment Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_CONTAINMENT_FIELD_OPERATION_COUNT = PROJECTION_FIELD_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link io.yaktor.types.impl.TypeContainmentFieldImpl <em>Type Containment Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.types.impl.TypeContainmentFieldImpl
	 * @see io.yaktor.types.impl.TypesPackageImpl#getTypeContainmentField()
	 * @generated
	 */
	int TYPE_CONTAINMENT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD__ALIAS = NEW_FIELD__ALIAS;

	/**
	 * The feature id for the '<em><b>Old Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD__OLD_FIELD = NEW_FIELD__OLD_FIELD;

	/**
	 * The feature id for the '<em><b>New Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD__NEW_FIELD = NEW_FIELD__NEW_FIELD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD__PARENT = NEW_FIELD__PARENT;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD__PROJECTION = NEW_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Containment Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD_FEATURE_COUNT = NEW_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Containment Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONTAINMENT_FIELD_OPERATION_COUNT = NEW_FIELD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link io.yaktor.types.ProjectionField <em>Projection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection Field</em>'.
	 * @see io.yaktor.types.ProjectionField
	 * @generated
	 */
	EClass getProjectionField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.types.ProjectionField#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see io.yaktor.types.ProjectionField#getAlias()
	 * @see #getProjectionField()
	 * @generated
	 */
	EAttribute getProjectionField_Alias();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.types.ProjectionField#getOldField <em>Old Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Field</em>'.
	 * @see io.yaktor.types.ProjectionField#getOldField()
	 * @see #getProjectionField()
	 * @generated
	 */
	EReference getProjectionField_OldField();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.types.ProjectionField#getNewField <em>New Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New Field</em>'.
	 * @see io.yaktor.types.ProjectionField#getNewField()
	 * @see #getProjectionField()
	 * @generated
	 */
	EReference getProjectionField_NewField();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.types.ProjectionField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.yaktor.types.ProjectionField#getParent()
	 * @see #getProjectionField()
	 * @generated
	 */
	EReference getProjectionField_Parent();

	/**
	 * Returns the meta object for class '{@link io.yaktor.types.MappedField <em>Mapped Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Field</em>'.
	 * @see io.yaktor.types.MappedField
	 * @generated
	 */
	EClass getMappedField();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.types.MappedField#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Projection</em>'.
	 * @see io.yaktor.types.MappedField#getProjection()
	 * @see #getMappedField()
	 * @generated
	 */
	EReference getMappedField_Projection();

	/**
	 * Returns the meta object for class '{@link io.yaktor.types.NewField <em>New Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Field</em>'.
	 * @see io.yaktor.types.NewField
	 * @generated
	 */
	EClass getNewField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.types.Projection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection</em>'.
	 * @see io.yaktor.types.Projection
	 * @generated
	 */
	EClass getProjection();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.types.Projection#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see io.yaktor.types.Projection#getFields()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_Fields();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.types.Projection#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see io.yaktor.types.Projection#getEntity()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_Entity();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.types.Projection#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.yaktor.types.Projection#getParent()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_Parent();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.types.Projection#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see io.yaktor.types.Projection#getAlias()
	 * @see #getProjection()
	 * @generated
	 */
	EAttribute getProjection_Alias();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.types.Projection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.types.Projection#getName()
	 * @see #getProjection()
	 * @generated
	 */
	EAttribute getProjection_Name();

	/**
	 * Returns the meta object for class '{@link io.yaktor.types.ProjectionContainmentField <em>Projection Containment Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection Containment Field</em>'.
	 * @see io.yaktor.types.ProjectionContainmentField
	 * @generated
	 */
	EClass getProjectionContainmentField();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.types.ProjectionContainmentField#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projection</em>'.
	 * @see io.yaktor.types.ProjectionContainmentField#getProjection()
	 * @see #getProjectionContainmentField()
	 * @generated
	 */
	EReference getProjectionContainmentField_Projection();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.types.ProjectionContainmentField#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see io.yaktor.types.ProjectionContainmentField#getCardinality()
	 * @see #getProjectionContainmentField()
	 * @generated
	 */
	EAttribute getProjectionContainmentField_Cardinality();

	/**
	 * Returns the meta object for class '{@link io.yaktor.types.TypeContainmentField <em>Type Containment Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Containment Field</em>'.
	 * @see io.yaktor.types.TypeContainmentField
	 * @generated
	 */
	EClass getTypeContainmentField();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.yaktor.types.impl.ProjectionFieldImpl <em>Projection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.types.impl.ProjectionFieldImpl
		 * @see io.yaktor.types.impl.TypesPackageImpl#getProjectionField()
		 * @generated
		 */
		EClass PROJECTION_FIELD = eINSTANCE.getProjectionField();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION_FIELD__ALIAS = eINSTANCE.getProjectionField_Alias();

		/**
		 * The meta object literal for the '<em><b>Old Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_FIELD__OLD_FIELD = eINSTANCE.getProjectionField_OldField();

		/**
		 * The meta object literal for the '<em><b>New Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_FIELD__NEW_FIELD = eINSTANCE.getProjectionField_NewField();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_FIELD__PARENT = eINSTANCE.getProjectionField_Parent();

		/**
		 * The meta object literal for the '{@link io.yaktor.types.impl.MappedFieldImpl <em>Mapped Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.types.impl.MappedFieldImpl
		 * @see io.yaktor.types.impl.TypesPackageImpl#getMappedField()
		 * @generated
		 */
		EClass MAPPED_FIELD = eINSTANCE.getMappedField();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_FIELD__PROJECTION = eINSTANCE.getMappedField_Projection();

		/**
		 * The meta object literal for the '{@link io.yaktor.types.impl.NewFieldImpl <em>New Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.types.impl.NewFieldImpl
		 * @see io.yaktor.types.impl.TypesPackageImpl#getNewField()
		 * @generated
		 */
		EClass NEW_FIELD = eINSTANCE.getNewField();

		/**
		 * The meta object literal for the '{@link io.yaktor.types.impl.ProjectionImpl <em>Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.types.impl.ProjectionImpl
		 * @see io.yaktor.types.impl.TypesPackageImpl#getProjection()
		 * @generated
		 */
		EClass PROJECTION = eINSTANCE.getProjection();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__FIELDS = eINSTANCE.getProjection_Fields();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__ENTITY = eINSTANCE.getProjection_Entity();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__PARENT = eINSTANCE.getProjection_Parent();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION__ALIAS = eINSTANCE.getProjection_Alias();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION__NAME = eINSTANCE.getProjection_Name();

		/**
		 * The meta object literal for the '{@link io.yaktor.types.impl.ProjectionContainmentFieldImpl <em>Projection Containment Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.types.impl.ProjectionContainmentFieldImpl
		 * @see io.yaktor.types.impl.TypesPackageImpl#getProjectionContainmentField()
		 * @generated
		 */
		EClass PROJECTION_CONTAINMENT_FIELD = eINSTANCE.getProjectionContainmentField();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION_CONTAINMENT_FIELD__PROJECTION = eINSTANCE.getProjectionContainmentField_Projection();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTION_CONTAINMENT_FIELD__CARDINALITY = eINSTANCE.getProjectionContainmentField_Cardinality();

		/**
		 * The meta object literal for the '{@link io.yaktor.types.impl.TypeContainmentFieldImpl <em>Type Containment Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.types.impl.TypeContainmentFieldImpl
		 * @see io.yaktor.types.impl.TypesPackageImpl#getTypeContainmentField()
		 * @generated
		 */
		EClass TYPE_CONTAINMENT_FIELD = eINSTANCE.getTypeContainmentField();

	}

} //TypesPackage
