/**
 */
package io.yaktor.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see io.yaktor.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/Xtext/io.yaktor.domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = io.yaktor.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.DomainModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.DomainModelImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Gen Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__GEN_OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Domain Model Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.NamedTypeImpl <em>Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.NamedTypeImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.TableTypeImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__MODEL = NAMED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__FIELDS = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SUPERTYPE = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__IS_ABSTRACT = NAMED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__UNIQUE_CONSTRAINTS = NAMED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__META_DATA = NAMED_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Index Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__INDEX_CONSTRAINTS = NAMED_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__KEYS = NAMED_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.EntityImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = TABLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MODEL = TABLE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = TABLE_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPERTYPE = TABLE_TYPE__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_ABSTRACT = TABLE_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UNIQUE_CONSTRAINTS = TABLE_TYPE__UNIQUE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__META_DATA = TABLE_TYPE__META_DATA;

	/**
	 * The feature id for the '<em><b>Index Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INDEX_CONSTRAINTS = TABLE_TYPE__INDEX_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__KEYS = TABLE_TYPE__KEYS;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = TABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = TABLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.FieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.ConstraintTypeFieldImpl <em>Constraint Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.ConstraintTypeFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getConstraintTypeField()
	 * @generated
	 */
	int CONSTRAINT_TYPE_FIELD = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_FIELD__CARDINALITY = FIELD__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Constraint Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_TYPE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.SimpleFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getSimpleField()
	 * @generated
	 */
	int SIMPLE_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__NAME = CONSTRAINT_TYPE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__CARDINALITY = CONSTRAINT_TYPE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__UNIQUE = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD__INDEXED = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_FEATURE_COUNT = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_OPERATION_COUNT = CONSTRAINT_TYPE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.StringFieldImpl <em>String Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.StringFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getStringField()
	 * @generated
	 */
	int STRING_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__DEFAULT_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__PATTERN = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__MIN_LENGTH = SIMPLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__MAX_LENGTH = SIMPLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Obscured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD__OBSCURED = SIMPLE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.DateFieldImpl <em>Date Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.DateFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getDateField()
	 * @generated
	 */
	int DATE_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__DEFAULT_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__BEFORE = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__AFTER = SIMPLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Past</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__PAST = SIMPLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Future</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD__FUTURE = SIMPLE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Date Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.IntegerFieldImpl <em>Integer Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.IntegerFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getIntegerField()
	 * @generated
	 */
	int INTEGER_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__DEFAULT_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__MIN_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD__MAX_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.AssociationImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MODEL = NAMED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__START = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_UNIDIRECTIONAL = NAMED_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.AssociationEndImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAME = CONSTRAINT_TYPE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CARDINALITY = CONSTRAINT_TYPE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__IS_COMPOSITION = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__REFERENCES = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__UNIQUE = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = CONSTRAINT_TYPE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_OPERATION_COUNT = CONSTRAINT_TYPE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.EnumFieldImpl <em>Enum Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.EnumFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getEnumField()
	 * @generated
	 */
	int ENUM_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Is Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__IS_TYPE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__DEFAULT_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Jpa Enum Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD__IS_JPA_ENUM_TYPE = SIMPLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enum Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Enum Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.EnumTypeImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__MODEL = NAMED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__VALUES = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.NumericFieldImpl <em>Numeric Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.NumericFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getNumericField()
	 * @generated
	 */
	int NUMERIC_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__DEFAULT_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__MIN_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD__MAX_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Numeric Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.EnumValueImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.BooleanFieldImpl <em>Boolean Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.BooleanFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getBooleanField()
	 * @generated
	 */
	int BOOLEAN_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD__DEFAULT_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.GenOptionsImpl <em>Gen Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.GenOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getGenOptions()
	 * @generated
	 */
	int GEN_OPTIONS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPTIONS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.RooGenOptionsImpl <em>Roo Gen Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.RooGenOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getRooGenOptions()
	 * @generated
	 */
	int ROO_GEN_OPTIONS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_GEN_OPTIONS__NAME = GEN_OPTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_GEN_OPTIONS__PROJECT = GEN_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_GEN_OPTIONS__PERSISTENCE = GEN_OPTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Roo Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_GEN_OPTIONS_FEATURE_COUNT = GEN_OPTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Roo Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_GEN_OPTIONS_OPERATION_COUNT = GEN_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.ProjectOptionsImpl <em>Project Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.ProjectOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getProjectOptions()
	 * @generated
	 */
	int PROJECT_OPTIONS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Root Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS__ROOT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Domain Subpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS__DOMAIN_SUBPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Json Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS__JSON_SUPPORT = 3;

	/**
	 * The feature id for the '<em><b>Controller Subpackage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Project Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.PersistenceOptionsImpl <em>Persistence Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.PersistenceOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getPersistenceOptions()
	 * @generated
	 */
	int PERSISTENCE_OPTIONS = 17;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS__DB_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Db Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS__DB_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS__USER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Db Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS__DB_NAME = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS__URL = 5;

	/**
	 * The number of structural features of the '<em>Persistence Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Persistence Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.TypeImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TABLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MODEL = TABLE_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FIELDS = TABLE_TYPE__FIELDS;

	/**
	 * The feature id for the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPERTYPE = TABLE_TYPE__SUPERTYPE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_ABSTRACT = TABLE_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__UNIQUE_CONSTRAINTS = TABLE_TYPE__UNIQUE_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__META_DATA = TABLE_TYPE__META_DATA;

	/**
	 * The feature id for the '<em><b>Index Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__INDEX_CONSTRAINTS = TABLE_TYPE__INDEX_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__KEYS = TABLE_TYPE__KEYS;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = TABLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.TypeFieldImpl <em>Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.TypeFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getTypeField()
	 * @generated
	 */
	int TYPE_FIELD = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FIELD__CARDINALITY = FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Is Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FIELD__IS_TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.AnyFieldImpl <em>Any Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.AnyFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getAnyField()
	 * @generated
	 */
	int ANY_FIELD = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The number of structural features of the '<em>Any Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.PriceFieldImpl <em>Price Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.PriceFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getPriceField()
	 * @generated
	 */
	int PRICE_FIELD = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The number of structural features of the '<em>Price Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Price Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICE_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.AmountFieldImpl <em>Amount Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.AmountFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getAmountField()
	 * @generated
	 */
	int AMOUNT_FIELD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The number of structural features of the '<em>Amount Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Amount Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOUNT_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.CountFieldImpl <em>Count Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.CountFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getCountField()
	 * @generated
	 */
	int COUNT_FIELD = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The number of structural features of the '<em>Count Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.EntityReferenceFieldImpl <em>Entity Reference Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.EntityReferenceFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getEntityReferenceField()
	 * @generated
	 */
	int ENTITY_REFERENCE_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD__REF_TYPE = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REFERENCE_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.GeoLocationFieldImpl <em>Geo Location Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.GeoLocationFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getGeoLocationField()
	 * @generated
	 */
	int GEO_LOCATION_FIELD = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The number of structural features of the '<em>Geo Location Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geo Location Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_LOCATION_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.JpaGenOptionsImpl <em>Jpa Gen Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.JpaGenOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getJpaGenOptions()
	 * @generated
	 */
	int JPA_GEN_OPTIONS = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__NAME = GEN_OPTIONS__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__PROJECT = GEN_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__PERSISTENCE = GEN_OPTIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generation Inclusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__GENERATION_INCLUSION = GEN_OPTIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Aspects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__USE_ASPECTS = GEN_OPTIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__META_DATA = GEN_OPTIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Table Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS__TABLE_OPTIONS = GEN_OPTIONS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Jpa Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS_FEATURE_COUNT = GEN_OPTIONS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Jpa Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_GEN_OPTIONS_OPERATION_COUNT = GEN_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.GenerationInclusionImpl <em>Generation Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.GenerationInclusionImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getGenerationInclusion()
	 * @generated
	 */
	int GENERATION_INCLUSION = 29;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__VIEWS = 4;

	/**
	 * The feature id for the '<em><b>Webxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__WEBXML = 5;

	/**
	 * The feature id for the '<em><b>Pom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__POM = 6;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__STYLES = 7;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__CLASSES = 8;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__LAYOUTS = 9;

	/**
	 * The feature id for the '<em><b>Webmvc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__WEBMVC = 10;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION__TAGS = 11;

	/**
	 * The number of structural features of the '<em>Generation Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Generation Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_INCLUSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.AssociationRefImpl <em>Association Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.AssociationRefImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getAssociationRef()
	 * @generated
	 */
	int ASSOCIATION_REF = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REF__NAME = NAMED_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REF__MODEL = NAMED_TYPE__MODEL;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REF__REF = NAMED_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REF_FEATURE_COUNT = NAMED_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_REF_OPERATION_COUNT = NAMED_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.ConstraintImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 32;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.UniqueConstraintImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 31;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__FIELDS = CONSTRAINT__FIELDS;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.IndexConstraintImpl <em>Index Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.IndexConstraintImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getIndexConstraint()
	 * @generated
	 */
	int INDEX_CONSTRAINT = 33;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT__FIELDS = CONSTRAINT__FIELDS;

	/**
	 * The number of structural features of the '<em>Index Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Index Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.NodeGenOptionImpl <em>Node Gen Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.NodeGenOptionImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getNodeGenOption()
	 * @generated
	 */
	int NODE_GEN_OPTION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEN_OPTION__NAME = GEN_OPTIONS__NAME;

	/**
	 * The number of structural features of the '<em>Node Gen Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEN_OPTION_FEATURE_COUNT = GEN_OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node Gen Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_GEN_OPTION_OPERATION_COUNT = GEN_OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl <em>Mongo Node Gen Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.MongoNodeGenOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getMongoNodeGenOptions()
	 * @generated
	 */
	int MONGO_NODE_GEN_OPTIONS = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS__NAME = NODE_GEN_OPTION__NAME;

	/**
	 * The feature id for the '<em><b>Use Logger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS__USE_LOGGER = NODE_GEN_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS__MODEL_PATH = NODE_GEN_OPTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS__TEST_PATH = NODE_GEN_OPTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS__GENERATE_TEST = NODE_GEN_OPTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Table Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS = NODE_GEN_OPTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mongo Node Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS_FEATURE_COUNT = NODE_GEN_OPTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Mongo Node Gen Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_GEN_OPTIONS_OPERATION_COUNT = NODE_GEN_OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.ComplexTypeFieldImpl <em>Complex Type Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.ComplexTypeFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getComplexTypeField()
	 * @generated
	 */
	int COMPLEX_TYPE_FIELD = 37;

	/**
	 * The number of structural features of the '<em>Complex Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FIELD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Complex Type Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.ImportImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 38;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.DomainModelImportImpl <em>Model Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.DomainModelImportImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getDomainModelImport()
	 * @generated
	 */
	int DOMAIN_MODEL_IMPORT = 39;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_IMPORT__ALIAS = IMPORT__ALIAS;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_IMPORT__REF = IMPORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_IMPORT_OPERATION_COUNT = IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.MongoNodeTableOptionsImpl <em>Mongo Node Table Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.MongoNodeTableOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getMongoNodeTableOptions()
	 * @generated
	 */
	int MONGO_NODE_TABLE_OPTIONS = 40;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_TABLE_OPTIONS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_TABLE_OPTIONS__TTL = 1;

	/**
	 * The feature id for the '<em><b>Single Table Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT = 2;

	/**
	 * The number of structural features of the '<em>Mongo Node Table Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_TABLE_OPTIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mongo Node Table Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_NODE_TABLE_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.JpaTableOptionsImpl <em>Jpa Table Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.JpaTableOptionsImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getJpaTableOptions()
	 * @generated
	 */
	int JPA_TABLE_OPTIONS = 41;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_TABLE_OPTIONS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Single Table Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Jpa Table Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_TABLE_OPTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Jpa Table Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPA_TABLE_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.IdFieldImpl <em>Id Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.IdFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getIdField()
	 * @generated
	 */
	int ID_FIELD = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The number of structural features of the '<em>Id Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.impl.ShortIdFieldImpl <em>Short Id Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.impl.ShortIdFieldImpl
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getShortIdField()
	 * @generated
	 */
	int SHORT_ID_FIELD = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD__NAME = SIMPLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD__CARDINALITY = SIMPLE_FIELD__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD__UNIQUE = SIMPLE_FIELD__UNIQUE;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD__INDEXED = SIMPLE_FIELD__INDEXED;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD__PATTERN = SIMPLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD__MAX_VALUE = SIMPLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Short Id Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD_FEATURE_COUNT = SIMPLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Short Id Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_ID_FIELD_OPERATION_COUNT = SIMPLE_FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.Cardinality
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 44;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.DbType <em>Db Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.DbType
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getDbType()
	 * @generated
	 */
	int DB_TYPE = 45;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.DbProvider <em>Db Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.DbProvider
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getDbProvider()
	 * @generated
	 */
	int DB_PROVIDER = 46;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.InclusionType <em>Inclusion Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.InclusionType
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getInclusionType()
	 * @generated
	 */
	int INCLUSION_TYPE = 47;

	/**
	 * The meta object id for the '{@link io.yaktor.domain.JpaEnumType <em>Jpa Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.yaktor.domain.JpaEnumType
	 * @see io.yaktor.domain.impl.DomainPackageImpl#getJpaEnumType()
	 * @generated
	 */
	int JPA_ENUM_TYPE = 48;


	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.DomainModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see io.yaktor.domain.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.DomainModel#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see io.yaktor.domain.DomainModel#getTypes()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Types();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.DomainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.domain.DomainModel#getName()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.DomainModel#getGenOptions <em>Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gen Options</em>'.
	 * @see io.yaktor.domain.DomainModel#getGenOptions()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_GenOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.DomainModel#getDomainModelImports <em>Domain Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Model Imports</em>'.
	 * @see io.yaktor.domain.DomainModel#getDomainModelImports()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_DomainModelImports();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see io.yaktor.domain.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.NamedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.domain.NamedType#getName()
	 * @see #getNamedType()
	 * @generated
	 */
	EAttribute getNamedType_Name();

	/**
	 * Returns the meta object for the container reference '{@link io.yaktor.domain.NamedType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see io.yaktor.domain.NamedType#getModel()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Model();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see io.yaktor.domain.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field</em>'.
	 * @see io.yaktor.domain.SimpleField
	 * @generated
	 */
	EClass getSimpleField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.SimpleField#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see io.yaktor.domain.SimpleField#isUnique()
	 * @see #getSimpleField()
	 * @generated
	 */
	EAttribute getSimpleField_Unique();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.SimpleField#isIndexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexed</em>'.
	 * @see io.yaktor.domain.SimpleField#isIndexed()
	 * @see #getSimpleField()
	 * @generated
	 */
	EAttribute getSimpleField_Indexed();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.StringField <em>String Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Field</em>'.
	 * @see io.yaktor.domain.StringField
	 * @generated
	 */
	EClass getStringField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.StringField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see io.yaktor.domain.StringField#getDefaultValue()
	 * @see #getStringField()
	 * @generated
	 */
	EAttribute getStringField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.StringField#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see io.yaktor.domain.StringField#getPattern()
	 * @see #getStringField()
	 * @generated
	 */
	EAttribute getStringField_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.StringField#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see io.yaktor.domain.StringField#getMinLength()
	 * @see #getStringField()
	 * @generated
	 */
	EAttribute getStringField_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.StringField#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see io.yaktor.domain.StringField#getMaxLength()
	 * @see #getStringField()
	 * @generated
	 */
	EAttribute getStringField_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.StringField#isObscured <em>Obscured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obscured</em>'.
	 * @see io.yaktor.domain.StringField#isObscured()
	 * @see #getStringField()
	 * @generated
	 */
	EAttribute getStringField_Obscured();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Field</em>'.
	 * @see io.yaktor.domain.DateField
	 * @generated
	 */
	EClass getDateField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.DateField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see io.yaktor.domain.DateField#getDefaultValue()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.DateField#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see io.yaktor.domain.DateField#getBefore()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Before();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.DateField#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After</em>'.
	 * @see io.yaktor.domain.DateField#getAfter()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_After();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.DateField#isPast <em>Past</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Past</em>'.
	 * @see io.yaktor.domain.DateField#isPast()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Past();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.DateField#isFuture <em>Future</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Future</em>'.
	 * @see io.yaktor.domain.DateField#isFuture()
	 * @see #getDateField()
	 * @generated
	 */
	EAttribute getDateField_Future();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.IntegerField <em>Integer Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Field</em>'.
	 * @see io.yaktor.domain.IntegerField
	 * @generated
	 */
	EClass getIntegerField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.IntegerField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see io.yaktor.domain.IntegerField#getDefaultValue()
	 * @see #getIntegerField()
	 * @generated
	 */
	EAttribute getIntegerField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.IntegerField#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see io.yaktor.domain.IntegerField#getMinValue()
	 * @see #getIntegerField()
	 * @generated
	 */
	EAttribute getIntegerField_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.IntegerField#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see io.yaktor.domain.IntegerField#getMaxValue()
	 * @see #getIntegerField()
	 * @generated
	 */
	EAttribute getIntegerField_MaxValue();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see io.yaktor.domain.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.Association#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see io.yaktor.domain.Association#getStart()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Start();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.Association#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see io.yaktor.domain.Association#getEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_End();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.Association#isIsUnidirectional <em>Is Unidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unidirectional</em>'.
	 * @see io.yaktor.domain.Association#isIsUnidirectional()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsUnidirectional();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see io.yaktor.domain.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.AssociationEnd#isIsComposition <em>Is Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composition</em>'.
	 * @see io.yaktor.domain.AssociationEnd#isIsComposition()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_IsComposition();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.AssociationEnd#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see io.yaktor.domain.AssociationEnd#getReferences()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd_References();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.AssociationEnd#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see io.yaktor.domain.AssociationEnd#isUnique()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_Unique();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.EnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Field</em>'.
	 * @see io.yaktor.domain.EnumField
	 * @generated
	 */
	EClass getEnumField();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.EnumField#getIsType <em>Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Type</em>'.
	 * @see io.yaktor.domain.EnumField#getIsType()
	 * @see #getEnumField()
	 * @generated
	 */
	EReference getEnumField_IsType();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.EnumField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see io.yaktor.domain.EnumField#getDefaultValue()
	 * @see #getEnumField()
	 * @generated
	 */
	EReference getEnumField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.EnumField#getIsJpaEnumType <em>Is Jpa Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Jpa Enum Type</em>'.
	 * @see io.yaktor.domain.EnumField#getIsJpaEnumType()
	 * @see #getEnumField()
	 * @generated
	 */
	EAttribute getEnumField_IsJpaEnumType();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see io.yaktor.domain.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.EnumType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see io.yaktor.domain.EnumType#getValues()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_Values();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.NumericField <em>Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Field</em>'.
	 * @see io.yaktor.domain.NumericField
	 * @generated
	 */
	EClass getNumericField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.NumericField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see io.yaktor.domain.NumericField#getDefaultValue()
	 * @see #getNumericField()
	 * @generated
	 */
	EAttribute getNumericField_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.NumericField#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see io.yaktor.domain.NumericField#getMinValue()
	 * @see #getNumericField()
	 * @generated
	 */
	EAttribute getNumericField_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.NumericField#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see io.yaktor.domain.NumericField#getMaxValue()
	 * @see #getNumericField()
	 * @generated
	 */
	EAttribute getNumericField_MaxValue();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see io.yaktor.domain.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.EnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.domain.EnumValue#getName()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see io.yaktor.domain.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.BooleanField <em>Boolean Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Field</em>'.
	 * @see io.yaktor.domain.BooleanField
	 * @generated
	 */
	EClass getBooleanField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.BooleanField#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see io.yaktor.domain.BooleanField#getDefaultValue()
	 * @see #getBooleanField()
	 * @generated
	 */
	EAttribute getBooleanField_DefaultValue();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.GenOptions <em>Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Options</em>'.
	 * @see io.yaktor.domain.GenOptions
	 * @generated
	 */
	EClass getGenOptions();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenOptions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.domain.GenOptions#getName()
	 * @see #getGenOptions()
	 * @generated
	 */
	EAttribute getGenOptions_Name();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.RooGenOptions <em>Roo Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roo Gen Options</em>'.
	 * @see io.yaktor.domain.RooGenOptions
	 * @generated
	 */
	EClass getRooGenOptions();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.RooGenOptions#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see io.yaktor.domain.RooGenOptions#getProject()
	 * @see #getRooGenOptions()
	 * @generated
	 */
	EReference getRooGenOptions_Project();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.RooGenOptions#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence</em>'.
	 * @see io.yaktor.domain.RooGenOptions#getPersistence()
	 * @see #getRooGenOptions()
	 * @generated
	 */
	EReference getRooGenOptions_Persistence();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.ProjectOptions <em>Project Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Options</em>'.
	 * @see io.yaktor.domain.ProjectOptions
	 * @generated
	 */
	EClass getProjectOptions();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ProjectOptions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.domain.ProjectOptions#getName()
	 * @see #getProjectOptions()
	 * @generated
	 */
	EAttribute getProjectOptions_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ProjectOptions#getRootPackage <em>Root Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Package</em>'.
	 * @see io.yaktor.domain.ProjectOptions#getRootPackage()
	 * @see #getProjectOptions()
	 * @generated
	 */
	EAttribute getProjectOptions_RootPackage();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ProjectOptions#getDomainSubpackage <em>Domain Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Subpackage</em>'.
	 * @see io.yaktor.domain.ProjectOptions#getDomainSubpackage()
	 * @see #getProjectOptions()
	 * @generated
	 */
	EAttribute getProjectOptions_DomainSubpackage();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ProjectOptions#isJsonSupport <em>Json Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Support</em>'.
	 * @see io.yaktor.domain.ProjectOptions#isJsonSupport()
	 * @see #getProjectOptions()
	 * @generated
	 */
	EAttribute getProjectOptions_JsonSupport();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ProjectOptions#getControllerSubpackage <em>Controller Subpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller Subpackage</em>'.
	 * @see io.yaktor.domain.ProjectOptions#getControllerSubpackage()
	 * @see #getProjectOptions()
	 * @generated
	 */
	EAttribute getProjectOptions_ControllerSubpackage();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.PersistenceOptions <em>Persistence Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Options</em>'.
	 * @see io.yaktor.domain.PersistenceOptions
	 * @generated
	 */
	EClass getPersistenceOptions();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.PersistenceOptions#getDbType <em>Db Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Type</em>'.
	 * @see io.yaktor.domain.PersistenceOptions#getDbType()
	 * @see #getPersistenceOptions()
	 * @generated
	 */
	EAttribute getPersistenceOptions_DbType();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.PersistenceOptions#getDbProvider <em>Db Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Provider</em>'.
	 * @see io.yaktor.domain.PersistenceOptions#getDbProvider()
	 * @see #getPersistenceOptions()
	 * @generated
	 */
	EAttribute getPersistenceOptions_DbProvider();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.PersistenceOptions#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see io.yaktor.domain.PersistenceOptions#getUserName()
	 * @see #getPersistenceOptions()
	 * @generated
	 */
	EAttribute getPersistenceOptions_UserName();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.PersistenceOptions#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see io.yaktor.domain.PersistenceOptions#getPassword()
	 * @see #getPersistenceOptions()
	 * @generated
	 */
	EAttribute getPersistenceOptions_Password();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.PersistenceOptions#getDbName <em>Db Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Name</em>'.
	 * @see io.yaktor.domain.PersistenceOptions#getDbName()
	 * @see #getPersistenceOptions()
	 * @generated
	 */
	EAttribute getPersistenceOptions_DbName();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.PersistenceOptions#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see io.yaktor.domain.PersistenceOptions#getUrl()
	 * @see #getPersistenceOptions()
	 * @generated
	 */
	EAttribute getPersistenceOptions_Url();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see io.yaktor.domain.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.TypeField <em>Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Field</em>'.
	 * @see io.yaktor.domain.TypeField
	 * @generated
	 */
	EClass getTypeField();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.TypeField#getIsType <em>Is Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Type</em>'.
	 * @see io.yaktor.domain.TypeField#getIsType()
	 * @see #getTypeField()
	 * @generated
	 */
	EReference getTypeField_IsType();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.AnyField <em>Any Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Field</em>'.
	 * @see io.yaktor.domain.AnyField
	 * @generated
	 */
	EClass getAnyField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see io.yaktor.domain.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.yaktor.domain.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.Field#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see io.yaktor.domain.Field#getCardinality()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Cardinality();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.PriceField <em>Price Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Price Field</em>'.
	 * @see io.yaktor.domain.PriceField
	 * @generated
	 */
	EClass getPriceField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.AmountField <em>Amount Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amount Field</em>'.
	 * @see io.yaktor.domain.AmountField
	 * @generated
	 */
	EClass getAmountField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.CountField <em>Count Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Field</em>'.
	 * @see io.yaktor.domain.CountField
	 * @generated
	 */
	EClass getCountField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.EntityReferenceField <em>Entity Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Reference Field</em>'.
	 * @see io.yaktor.domain.EntityReferenceField
	 * @generated
	 */
	EClass getEntityReferenceField();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.EntityReferenceField#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Type</em>'.
	 * @see io.yaktor.domain.EntityReferenceField#getRefType()
	 * @see #getEntityReferenceField()
	 * @generated
	 */
	EReference getEntityReferenceField_RefType();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.GeoLocationField <em>Geo Location Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Location Field</em>'.
	 * @see io.yaktor.domain.GeoLocationField
	 * @generated
	 */
	EClass getGeoLocationField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see io.yaktor.domain.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.TableType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see io.yaktor.domain.TableType#getFields()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Fields();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.TableType#getSupertype <em>Supertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supertype</em>'.
	 * @see io.yaktor.domain.TableType#getSupertype()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Supertype();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.TableType#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see io.yaktor.domain.TableType#isIsAbstract()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_IsAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.TableType#getUniqueConstraints <em>Unique Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unique Constraints</em>'.
	 * @see io.yaktor.domain.TableType#getUniqueConstraints()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_UniqueConstraints();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.TableType#isMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see io.yaktor.domain.TableType#isMetaData()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_MetaData();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.TableType#getIndexConstraints <em>Index Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index Constraints</em>'.
	 * @see io.yaktor.domain.TableType#getIndexConstraints()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_IndexConstraints();

	/**
	 * Returns the meta object for the reference list '{@link io.yaktor.domain.TableType#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Keys</em>'.
	 * @see io.yaktor.domain.TableType#getKeys()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Keys();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.JpaGenOptions <em>Jpa Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jpa Gen Options</em>'.
	 * @see io.yaktor.domain.JpaGenOptions
	 * @generated
	 */
	EClass getJpaGenOptions();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.JpaGenOptions#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see io.yaktor.domain.JpaGenOptions#getProject()
	 * @see #getJpaGenOptions()
	 * @generated
	 */
	EReference getJpaGenOptions_Project();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.JpaGenOptions#getPersistence <em>Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistence</em>'.
	 * @see io.yaktor.domain.JpaGenOptions#getPersistence()
	 * @see #getJpaGenOptions()
	 * @generated
	 */
	EReference getJpaGenOptions_Persistence();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.JpaGenOptions#getGenerationInclusion <em>Generation Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generation Inclusion</em>'.
	 * @see io.yaktor.domain.JpaGenOptions#getGenerationInclusion()
	 * @see #getJpaGenOptions()
	 * @generated
	 */
	EReference getJpaGenOptions_GenerationInclusion();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.JpaGenOptions#isUseAspects <em>Use Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Aspects</em>'.
	 * @see io.yaktor.domain.JpaGenOptions#isUseAspects()
	 * @see #getJpaGenOptions()
	 * @generated
	 */
	EAttribute getJpaGenOptions_UseAspects();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.JpaGenOptions#isMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Data</em>'.
	 * @see io.yaktor.domain.JpaGenOptions#isMetaData()
	 * @see #getJpaGenOptions()
	 * @generated
	 */
	EAttribute getJpaGenOptions_MetaData();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.JpaGenOptions#getTableOptions <em>Table Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Options</em>'.
	 * @see io.yaktor.domain.JpaGenOptions#getTableOptions()
	 * @see #getJpaGenOptions()
	 * @generated
	 */
	EReference getJpaGenOptions_TableOptions();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.GenerationInclusion <em>Generation Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation Inclusion</em>'.
	 * @see io.yaktor.domain.GenerationInclusion
	 * @generated
	 */
	EClass getGenerationInclusion();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Types</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getTypes()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Types();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getController()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Controller();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resources</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getResources()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Resources();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getProperties()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Properties();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Views</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getViews()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Views();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getWebxml <em>Webxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webxml</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getWebxml()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Webxml();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getPom <em>Pom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pom</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getPom()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Pom();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Styles</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getStyles()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Styles();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classes</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getClasses()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Classes();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layouts</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getLayouts()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Layouts();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getWebmvc <em>Webmvc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webmvc</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getWebmvc()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Webmvc();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.GenerationInclusion#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags</em>'.
	 * @see io.yaktor.domain.GenerationInclusion#getTags()
	 * @see #getGenerationInclusion()
	 * @generated
	 */
	EAttribute getGenerationInclusion_Tags();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.AssociationRef <em>Association Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Ref</em>'.
	 * @see io.yaktor.domain.AssociationRef
	 * @generated
	 */
	EClass getAssociationRef();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.AssociationRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see io.yaktor.domain.AssociationRef#getRef()
	 * @see #getAssociationRef()
	 * @generated
	 */
	EReference getAssociationRef_Ref();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see io.yaktor.domain.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see io.yaktor.domain.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference list '{@link io.yaktor.domain.Constraint#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see io.yaktor.domain.Constraint#getFields()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Fields();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.IndexConstraint <em>Index Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Constraint</em>'.
	 * @see io.yaktor.domain.IndexConstraint
	 * @generated
	 */
	EClass getIndexConstraint();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.ConstraintTypeField <em>Constraint Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Type Field</em>'.
	 * @see io.yaktor.domain.ConstraintTypeField
	 * @generated
	 */
	EClass getConstraintTypeField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.NodeGenOption <em>Node Gen Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Gen Option</em>'.
	 * @see io.yaktor.domain.NodeGenOption
	 * @generated
	 */
	EClass getNodeGenOption();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.MongoNodeGenOptions <em>Mongo Node Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo Node Gen Options</em>'.
	 * @see io.yaktor.domain.MongoNodeGenOptions
	 * @generated
	 */
	EClass getMongoNodeGenOptions();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.MongoNodeGenOptions#isUseLogger <em>Use Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Logger</em>'.
	 * @see io.yaktor.domain.MongoNodeGenOptions#isUseLogger()
	 * @see #getMongoNodeGenOptions()
	 * @generated
	 */
	EAttribute getMongoNodeGenOptions_UseLogger();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.MongoNodeGenOptions#getModelPath <em>Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Path</em>'.
	 * @see io.yaktor.domain.MongoNodeGenOptions#getModelPath()
	 * @see #getMongoNodeGenOptions()
	 * @generated
	 */
	EAttribute getMongoNodeGenOptions_ModelPath();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.MongoNodeGenOptions#getTestPath <em>Test Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Path</em>'.
	 * @see io.yaktor.domain.MongoNodeGenOptions#getTestPath()
	 * @see #getMongoNodeGenOptions()
	 * @generated
	 */
	EAttribute getMongoNodeGenOptions_TestPath();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.MongoNodeGenOptions#isGenerateTest <em>Generate Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Test</em>'.
	 * @see io.yaktor.domain.MongoNodeGenOptions#isGenerateTest()
	 * @see #getMongoNodeGenOptions()
	 * @generated
	 */
	EAttribute getMongoNodeGenOptions_GenerateTest();

	/**
	 * Returns the meta object for the containment reference list '{@link io.yaktor.domain.MongoNodeGenOptions#getTableOptions <em>Table Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Options</em>'.
	 * @see io.yaktor.domain.MongoNodeGenOptions#getTableOptions()
	 * @see #getMongoNodeGenOptions()
	 * @generated
	 */
	EReference getMongoNodeGenOptions_TableOptions();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.ComplexTypeField <em>Complex Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Field</em>'.
	 * @see io.yaktor.domain.ComplexTypeField
	 * @generated
	 */
	EClass getComplexTypeField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see io.yaktor.domain.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.Import#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see io.yaktor.domain.Import#getAlias()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Alias();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.DomainModelImport <em>Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Import</em>'.
	 * @see io.yaktor.domain.DomainModelImport
	 * @generated
	 */
	EClass getDomainModelImport();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.DomainModelImport#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see io.yaktor.domain.DomainModelImport#getRef()
	 * @see #getDomainModelImport()
	 * @generated
	 */
	EReference getDomainModelImport_Ref();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.MongoNodeTableOptions <em>Mongo Node Table Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo Node Table Options</em>'.
	 * @see io.yaktor.domain.MongoNodeTableOptions
	 * @generated
	 */
	EClass getMongoNodeTableOptions();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.MongoNodeTableOptions#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see io.yaktor.domain.MongoNodeTableOptions#getType()
	 * @see #getMongoNodeTableOptions()
	 * @generated
	 */
	EReference getMongoNodeTableOptions_Type();

	/**
	 * Returns the meta object for the containment reference '{@link io.yaktor.domain.MongoNodeTableOptions#getTtl <em>Ttl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ttl</em>'.
	 * @see io.yaktor.domain.MongoNodeTableOptions#getTtl()
	 * @see #getMongoNodeTableOptions()
	 * @generated
	 */
	EReference getMongoNodeTableOptions_Ttl();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.MongoNodeTableOptions#isSingleTableRoot <em>Single Table Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Table Root</em>'.
	 * @see io.yaktor.domain.MongoNodeTableOptions#isSingleTableRoot()
	 * @see #getMongoNodeTableOptions()
	 * @generated
	 */
	EAttribute getMongoNodeTableOptions_SingleTableRoot();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.JpaTableOptions <em>Jpa Table Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jpa Table Options</em>'.
	 * @see io.yaktor.domain.JpaTableOptions
	 * @generated
	 */
	EClass getJpaTableOptions();

	/**
	 * Returns the meta object for the reference '{@link io.yaktor.domain.JpaTableOptions#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see io.yaktor.domain.JpaTableOptions#getType()
	 * @see #getJpaTableOptions()
	 * @generated
	 */
	EReference getJpaTableOptions_Type();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.JpaTableOptions#isSingleTableRoot <em>Single Table Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Table Root</em>'.
	 * @see io.yaktor.domain.JpaTableOptions#isSingleTableRoot()
	 * @see #getJpaTableOptions()
	 * @generated
	 */
	EAttribute getJpaTableOptions_SingleTableRoot();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.IdField <em>Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Field</em>'.
	 * @see io.yaktor.domain.IdField
	 * @generated
	 */
	EClass getIdField();

	/**
	 * Returns the meta object for class '{@link io.yaktor.domain.ShortIdField <em>Short Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Id Field</em>'.
	 * @see io.yaktor.domain.ShortIdField
	 * @generated
	 */
	EClass getShortIdField();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ShortIdField#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see io.yaktor.domain.ShortIdField#getPattern()
	 * @see #getShortIdField()
	 * @generated
	 */
	EAttribute getShortIdField_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link io.yaktor.domain.ShortIdField#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see io.yaktor.domain.ShortIdField#getMaxValue()
	 * @see #getShortIdField()
	 * @generated
	 */
	EAttribute getShortIdField_MaxValue();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.domain.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see io.yaktor.domain.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.domain.DbType <em>Db Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Db Type</em>'.
	 * @see io.yaktor.domain.DbType
	 * @generated
	 */
	EEnum getDbType();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.domain.DbProvider <em>Db Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Db Provider</em>'.
	 * @see io.yaktor.domain.DbProvider
	 * @generated
	 */
	EEnum getDbProvider();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.domain.InclusionType <em>Inclusion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Inclusion Type</em>'.
	 * @see io.yaktor.domain.InclusionType
	 * @generated
	 */
	EEnum getInclusionType();

	/**
	 * Returns the meta object for enum '{@link io.yaktor.domain.JpaEnumType <em>Jpa Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Jpa Enum Type</em>'.
	 * @see io.yaktor.domain.JpaEnumType
	 * @generated
	 */
	EEnum getJpaEnumType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link io.yaktor.domain.impl.DomainModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.DomainModelImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__TYPES = eINSTANCE.getDomainModel_Types();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Gen Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__GEN_OPTIONS = eINSTANCE.getDomainModel_GenOptions();

		/**
		 * The meta object literal for the '<em><b>Domain Model Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS = eINSTANCE.getDomainModel_DomainModelImports();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.NamedTypeImpl <em>Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.NamedTypeImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TYPE__NAME = eINSTANCE.getNamedType_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__MODEL = eINSTANCE.getNamedType_Model();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.EntityImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.SimpleFieldImpl <em>Simple Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.SimpleFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getSimpleField()
		 * @generated
		 */
		EClass SIMPLE_FIELD = eINSTANCE.getSimpleField();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_FIELD__UNIQUE = eINSTANCE.getSimpleField_Unique();

		/**
		 * The meta object literal for the '<em><b>Indexed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_FIELD__INDEXED = eINSTANCE.getSimpleField_Indexed();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.StringFieldImpl <em>String Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.StringFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getStringField()
		 * @generated
		 */
		EClass STRING_FIELD = eINSTANCE.getStringField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FIELD__DEFAULT_VALUE = eINSTANCE.getStringField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FIELD__PATTERN = eINSTANCE.getStringField_Pattern();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FIELD__MIN_LENGTH = eINSTANCE.getStringField_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FIELD__MAX_LENGTH = eINSTANCE.getStringField_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Obscured</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_FIELD__OBSCURED = eINSTANCE.getStringField_Obscured();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.DateFieldImpl <em>Date Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.DateFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getDateField()
		 * @generated
		 */
		EClass DATE_FIELD = eINSTANCE.getDateField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__DEFAULT_VALUE = eINSTANCE.getDateField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__BEFORE = eINSTANCE.getDateField_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__AFTER = eINSTANCE.getDateField_After();

		/**
		 * The meta object literal for the '<em><b>Past</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__PAST = eINSTANCE.getDateField_Past();

		/**
		 * The meta object literal for the '<em><b>Future</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_FIELD__FUTURE = eINSTANCE.getDateField_Future();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.IntegerFieldImpl <em>Integer Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.IntegerFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getIntegerField()
		 * @generated
		 */
		EClass INTEGER_FIELD = eINSTANCE.getIntegerField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FIELD__DEFAULT_VALUE = eINSTANCE.getIntegerField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FIELD__MIN_VALUE = eINSTANCE.getIntegerField_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FIELD__MAX_VALUE = eINSTANCE.getIntegerField_MaxValue();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.AssociationImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__START = eINSTANCE.getAssociation_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END = eINSTANCE.getAssociation_End();

		/**
		 * The meta object literal for the '<em><b>Is Unidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_UNIDIRECTIONAL = eINSTANCE.getAssociation_IsUnidirectional();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.AssociationEndImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Is Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__IS_COMPOSITION = eINSTANCE.getAssociationEnd_IsComposition();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__REFERENCES = eINSTANCE.getAssociationEnd_References();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__UNIQUE = eINSTANCE.getAssociationEnd_Unique();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.EnumFieldImpl <em>Enum Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.EnumFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getEnumField()
		 * @generated
		 */
		EClass ENUM_FIELD = eINSTANCE.getEnumField();

		/**
		 * The meta object literal for the '<em><b>Is Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD__IS_TYPE = eINSTANCE.getEnumField_IsType();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_FIELD__DEFAULT_VALUE = eINSTANCE.getEnumField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Jpa Enum Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_FIELD__IS_JPA_ENUM_TYPE = eINSTANCE.getEnumField_IsJpaEnumType();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.EnumTypeImpl <em>Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.EnumTypeImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_TYPE__VALUES = eINSTANCE.getEnumType_Values();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.NumericFieldImpl <em>Numeric Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.NumericFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getNumericField()
		 * @generated
		 */
		EClass NUMERIC_FIELD = eINSTANCE.getNumericField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FIELD__DEFAULT_VALUE = eINSTANCE.getNumericField_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FIELD__MIN_VALUE = eINSTANCE.getNumericField_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_FIELD__MAX_VALUE = eINSTANCE.getNumericField_MaxValue();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.EnumValueImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__NAME = eINSTANCE.getEnumValue_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.BooleanFieldImpl <em>Boolean Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.BooleanFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getBooleanField()
		 * @generated
		 */
		EClass BOOLEAN_FIELD = eINSTANCE.getBooleanField();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_FIELD__DEFAULT_VALUE = eINSTANCE.getBooleanField_DefaultValue();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.GenOptionsImpl <em>Gen Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.GenOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getGenOptions()
		 * @generated
		 */
		EClass GEN_OPTIONS = eINSTANCE.getGenOptions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_OPTIONS__NAME = eINSTANCE.getGenOptions_Name();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.RooGenOptionsImpl <em>Roo Gen Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.RooGenOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getRooGenOptions()
		 * @generated
		 */
		EClass ROO_GEN_OPTIONS = eINSTANCE.getRooGenOptions();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROO_GEN_OPTIONS__PROJECT = eINSTANCE.getRooGenOptions_Project();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROO_GEN_OPTIONS__PERSISTENCE = eINSTANCE.getRooGenOptions_Persistence();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.ProjectOptionsImpl <em>Project Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.ProjectOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getProjectOptions()
		 * @generated
		 */
		EClass PROJECT_OPTIONS = eINSTANCE.getProjectOptions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_OPTIONS__NAME = eINSTANCE.getProjectOptions_Name();

		/**
		 * The meta object literal for the '<em><b>Root Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_OPTIONS__ROOT_PACKAGE = eINSTANCE.getProjectOptions_RootPackage();

		/**
		 * The meta object literal for the '<em><b>Domain Subpackage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_OPTIONS__DOMAIN_SUBPACKAGE = eINSTANCE.getProjectOptions_DomainSubpackage();

		/**
		 * The meta object literal for the '<em><b>Json Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_OPTIONS__JSON_SUPPORT = eINSTANCE.getProjectOptions_JsonSupport();

		/**
		 * The meta object literal for the '<em><b>Controller Subpackage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE = eINSTANCE.getProjectOptions_ControllerSubpackage();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.PersistenceOptionsImpl <em>Persistence Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.PersistenceOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getPersistenceOptions()
		 * @generated
		 */
		EClass PERSISTENCE_OPTIONS = eINSTANCE.getPersistenceOptions();

		/**
		 * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_OPTIONS__DB_TYPE = eINSTANCE.getPersistenceOptions_DbType();

		/**
		 * The meta object literal for the '<em><b>Db Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_OPTIONS__DB_PROVIDER = eINSTANCE.getPersistenceOptions_DbProvider();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_OPTIONS__USER_NAME = eINSTANCE.getPersistenceOptions_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_OPTIONS__PASSWORD = eINSTANCE.getPersistenceOptions_Password();

		/**
		 * The meta object literal for the '<em><b>Db Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_OPTIONS__DB_NAME = eINSTANCE.getPersistenceOptions_DbName();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_OPTIONS__URL = eINSTANCE.getPersistenceOptions_Url();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.TypeImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.TypeFieldImpl <em>Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.TypeFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getTypeField()
		 * @generated
		 */
		EClass TYPE_FIELD = eINSTANCE.getTypeField();

		/**
		 * The meta object literal for the '<em><b>Is Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_FIELD__IS_TYPE = eINSTANCE.getTypeField_IsType();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.AnyFieldImpl <em>Any Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.AnyFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getAnyField()
		 * @generated
		 */
		EClass ANY_FIELD = eINSTANCE.getAnyField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.FieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__CARDINALITY = eINSTANCE.getField_Cardinality();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.PriceFieldImpl <em>Price Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.PriceFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getPriceField()
		 * @generated
		 */
		EClass PRICE_FIELD = eINSTANCE.getPriceField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.AmountFieldImpl <em>Amount Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.AmountFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getAmountField()
		 * @generated
		 */
		EClass AMOUNT_FIELD = eINSTANCE.getAmountField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.CountFieldImpl <em>Count Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.CountFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getCountField()
		 * @generated
		 */
		EClass COUNT_FIELD = eINSTANCE.getCountField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.EntityReferenceFieldImpl <em>Entity Reference Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.EntityReferenceFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getEntityReferenceField()
		 * @generated
		 */
		EClass ENTITY_REFERENCE_FIELD = eINSTANCE.getEntityReferenceField();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_REFERENCE_FIELD__REF_TYPE = eINSTANCE.getEntityReferenceField_RefType();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.GeoLocationFieldImpl <em>Geo Location Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.GeoLocationFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getGeoLocationField()
		 * @generated
		 */
		EClass GEO_LOCATION_FIELD = eINSTANCE.getGeoLocationField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.TableTypeImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__FIELDS = eINSTANCE.getTableType_Fields();

		/**
		 * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__SUPERTYPE = eINSTANCE.getTableType_Supertype();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__IS_ABSTRACT = eINSTANCE.getTableType_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Unique Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__UNIQUE_CONSTRAINTS = eINSTANCE.getTableType_UniqueConstraints();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__META_DATA = eINSTANCE.getTableType_MetaData();

		/**
		 * The meta object literal for the '<em><b>Index Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__INDEX_CONSTRAINTS = eINSTANCE.getTableType_IndexConstraints();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__KEYS = eINSTANCE.getTableType_Keys();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.JpaGenOptionsImpl <em>Jpa Gen Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.JpaGenOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getJpaGenOptions()
		 * @generated
		 */
		EClass JPA_GEN_OPTIONS = eINSTANCE.getJpaGenOptions();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_GEN_OPTIONS__PROJECT = eINSTANCE.getJpaGenOptions_Project();

		/**
		 * The meta object literal for the '<em><b>Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_GEN_OPTIONS__PERSISTENCE = eINSTANCE.getJpaGenOptions_Persistence();

		/**
		 * The meta object literal for the '<em><b>Generation Inclusion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_GEN_OPTIONS__GENERATION_INCLUSION = eINSTANCE.getJpaGenOptions_GenerationInclusion();

		/**
		 * The meta object literal for the '<em><b>Use Aspects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPA_GEN_OPTIONS__USE_ASPECTS = eINSTANCE.getJpaGenOptions_UseAspects();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPA_GEN_OPTIONS__META_DATA = eINSTANCE.getJpaGenOptions_MetaData();

		/**
		 * The meta object literal for the '<em><b>Table Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_GEN_OPTIONS__TABLE_OPTIONS = eINSTANCE.getJpaGenOptions_TableOptions();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.GenerationInclusionImpl <em>Generation Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.GenerationInclusionImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getGenerationInclusion()
		 * @generated
		 */
		EClass GENERATION_INCLUSION = eINSTANCE.getGenerationInclusion();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__TYPES = eINSTANCE.getGenerationInclusion_Types();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__CONTROLLER = eINSTANCE.getGenerationInclusion_Controller();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__RESOURCES = eINSTANCE.getGenerationInclusion_Resources();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__PROPERTIES = eINSTANCE.getGenerationInclusion_Properties();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__VIEWS = eINSTANCE.getGenerationInclusion_Views();

		/**
		 * The meta object literal for the '<em><b>Webxml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__WEBXML = eINSTANCE.getGenerationInclusion_Webxml();

		/**
		 * The meta object literal for the '<em><b>Pom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__POM = eINSTANCE.getGenerationInclusion_Pom();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__STYLES = eINSTANCE.getGenerationInclusion_Styles();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__CLASSES = eINSTANCE.getGenerationInclusion_Classes();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__LAYOUTS = eINSTANCE.getGenerationInclusion_Layouts();

		/**
		 * The meta object literal for the '<em><b>Webmvc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__WEBMVC = eINSTANCE.getGenerationInclusion_Webmvc();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATION_INCLUSION__TAGS = eINSTANCE.getGenerationInclusion_Tags();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.AssociationRefImpl <em>Association Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.AssociationRefImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getAssociationRef()
		 * @generated
		 */
		EClass ASSOCIATION_REF = eINSTANCE.getAssociationRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_REF__REF = eINSTANCE.getAssociationRef_Ref();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.UniqueConstraintImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.ConstraintImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__FIELDS = eINSTANCE.getConstraint_Fields();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.IndexConstraintImpl <em>Index Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.IndexConstraintImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getIndexConstraint()
		 * @generated
		 */
		EClass INDEX_CONSTRAINT = eINSTANCE.getIndexConstraint();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.ConstraintTypeFieldImpl <em>Constraint Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.ConstraintTypeFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getConstraintTypeField()
		 * @generated
		 */
		EClass CONSTRAINT_TYPE_FIELD = eINSTANCE.getConstraintTypeField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.NodeGenOptionImpl <em>Node Gen Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.NodeGenOptionImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getNodeGenOption()
		 * @generated
		 */
		EClass NODE_GEN_OPTION = eINSTANCE.getNodeGenOption();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.MongoNodeGenOptionsImpl <em>Mongo Node Gen Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.MongoNodeGenOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getMongoNodeGenOptions()
		 * @generated
		 */
		EClass MONGO_NODE_GEN_OPTIONS = eINSTANCE.getMongoNodeGenOptions();

		/**
		 * The meta object literal for the '<em><b>Use Logger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_NODE_GEN_OPTIONS__USE_LOGGER = eINSTANCE.getMongoNodeGenOptions_UseLogger();

		/**
		 * The meta object literal for the '<em><b>Model Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_NODE_GEN_OPTIONS__MODEL_PATH = eINSTANCE.getMongoNodeGenOptions_ModelPath();

		/**
		 * The meta object literal for the '<em><b>Test Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_NODE_GEN_OPTIONS__TEST_PATH = eINSTANCE.getMongoNodeGenOptions_TestPath();

		/**
		 * The meta object literal for the '<em><b>Generate Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_NODE_GEN_OPTIONS__GENERATE_TEST = eINSTANCE.getMongoNodeGenOptions_GenerateTest();

		/**
		 * The meta object literal for the '<em><b>Table Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS = eINSTANCE.getMongoNodeGenOptions_TableOptions();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.ComplexTypeFieldImpl <em>Complex Type Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.ComplexTypeFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getComplexTypeField()
		 * @generated
		 */
		EClass COMPLEX_TYPE_FIELD = eINSTANCE.getComplexTypeField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.ImportImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ALIAS = eINSTANCE.getImport_Alias();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.DomainModelImportImpl <em>Model Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.DomainModelImportImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getDomainModelImport()
		 * @generated
		 */
		EClass DOMAIN_MODEL_IMPORT = eINSTANCE.getDomainModelImport();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL_IMPORT__REF = eINSTANCE.getDomainModelImport_Ref();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.MongoNodeTableOptionsImpl <em>Mongo Node Table Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.MongoNodeTableOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getMongoNodeTableOptions()
		 * @generated
		 */
		EClass MONGO_NODE_TABLE_OPTIONS = eINSTANCE.getMongoNodeTableOptions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONGO_NODE_TABLE_OPTIONS__TYPE = eINSTANCE.getMongoNodeTableOptions_Type();

		/**
		 * The meta object literal for the '<em><b>Ttl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONGO_NODE_TABLE_OPTIONS__TTL = eINSTANCE.getMongoNodeTableOptions_Ttl();

		/**
		 * The meta object literal for the '<em><b>Single Table Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT = eINSTANCE.getMongoNodeTableOptions_SingleTableRoot();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.JpaTableOptionsImpl <em>Jpa Table Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.JpaTableOptionsImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getJpaTableOptions()
		 * @generated
		 */
		EClass JPA_TABLE_OPTIONS = eINSTANCE.getJpaTableOptions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPA_TABLE_OPTIONS__TYPE = eINSTANCE.getJpaTableOptions_Type();

		/**
		 * The meta object literal for the '<em><b>Single Table Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT = eINSTANCE.getJpaTableOptions_SingleTableRoot();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.IdFieldImpl <em>Id Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.IdFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getIdField()
		 * @generated
		 */
		EClass ID_FIELD = eINSTANCE.getIdField();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.impl.ShortIdFieldImpl <em>Short Id Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.impl.ShortIdFieldImpl
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getShortIdField()
		 * @generated
		 */
		EClass SHORT_ID_FIELD = eINSTANCE.getShortIdField();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_ID_FIELD__PATTERN = eINSTANCE.getShortIdField_Pattern();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORT_ID_FIELD__MAX_VALUE = eINSTANCE.getShortIdField_MaxValue();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.Cardinality
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.DbType <em>Db Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.DbType
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getDbType()
		 * @generated
		 */
		EEnum DB_TYPE = eINSTANCE.getDbType();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.DbProvider <em>Db Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.DbProvider
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getDbProvider()
		 * @generated
		 */
		EEnum DB_PROVIDER = eINSTANCE.getDbProvider();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.InclusionType <em>Inclusion Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.InclusionType
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getInclusionType()
		 * @generated
		 */
		EEnum INCLUSION_TYPE = eINSTANCE.getInclusionType();

		/**
		 * The meta object literal for the '{@link io.yaktor.domain.JpaEnumType <em>Jpa Enum Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.yaktor.domain.JpaEnumType
		 * @see io.yaktor.domain.impl.DomainPackageImpl#getJpaEnumType()
		 * @generated
		 */
		EEnum JPA_ENUM_TYPE = eINSTANCE.getJpaEnumType();

	}

} //DomainPackage
