/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DomainPackage.DOMAIN_MODEL: return createDomainModel();
			case DomainPackage.ENTITY: return createEntity();
			case DomainPackage.STRING_FIELD: return createStringField();
			case DomainPackage.DATE_FIELD: return createDateField();
			case DomainPackage.INTEGER_FIELD: return createIntegerField();
			case DomainPackage.ASSOCIATION: return createAssociation();
			case DomainPackage.ASSOCIATION_END: return createAssociationEnd();
			case DomainPackage.ENUM_FIELD: return createEnumField();
			case DomainPackage.ENUM_TYPE: return createEnumType();
			case DomainPackage.NUMERIC_FIELD: return createNumericField();
			case DomainPackage.ENUM_VALUE: return createEnumValue();
			case DomainPackage.BOOLEAN_FIELD: return createBooleanField();
			case DomainPackage.ROO_GEN_OPTIONS: return createRooGenOptions();
			case DomainPackage.PROJECT_OPTIONS: return createProjectOptions();
			case DomainPackage.PERSISTENCE_OPTIONS: return createPersistenceOptions();
			case DomainPackage.TYPE: return createType();
			case DomainPackage.TYPE_FIELD: return createTypeField();
			case DomainPackage.ANY_FIELD: return createAnyField();
			case DomainPackage.FIELD: return createField();
			case DomainPackage.PRICE_FIELD: return createPriceField();
			case DomainPackage.AMOUNT_FIELD: return createAmountField();
			case DomainPackage.COUNT_FIELD: return createCountField();
			case DomainPackage.ENTITY_REFERENCE_FIELD: return createEntityReferenceField();
			case DomainPackage.GEO_LOCATION_FIELD: return createGeoLocationField();
			case DomainPackage.TABLE_TYPE: return createTableType();
			case DomainPackage.JPA_GEN_OPTIONS: return createJpaGenOptions();
			case DomainPackage.GENERATION_INCLUSION: return createGenerationInclusion();
			case DomainPackage.ASSOCIATION_REF: return createAssociationRef();
			case DomainPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
			case DomainPackage.CONSTRAINT: return createConstraint();
			case DomainPackage.INDEX_CONSTRAINT: return createIndexConstraint();
			case DomainPackage.CONSTRAINT_TYPE_FIELD: return createConstraintTypeField();
			case DomainPackage.MONGO_NODE_GEN_OPTIONS: return createMongoNodeGenOptions();
			case DomainPackage.COMPLEX_TYPE_FIELD: return createComplexTypeField();
			case DomainPackage.IMPORT: return createImport();
			case DomainPackage.DOMAIN_MODEL_IMPORT: return createDomainModelImport();
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS: return createMongoNodeTableOptions();
			case DomainPackage.JPA_TABLE_OPTIONS: return createJpaTableOptions();
			case DomainPackage.ID_FIELD: return createIdField();
			case DomainPackage.SHORT_ID_FIELD: return createShortIdField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DomainPackage.CARDINALITY:
				return createCardinalityFromString(eDataType, initialValue);
			case DomainPackage.DB_TYPE:
				return createDbTypeFromString(eDataType, initialValue);
			case DomainPackage.DB_PROVIDER:
				return createDbProviderFromString(eDataType, initialValue);
			case DomainPackage.INCLUSION_TYPE:
				return createInclusionTypeFromString(eDataType, initialValue);
			case DomainPackage.JPA_ENUM_TYPE:
				return createJpaEnumTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DomainPackage.CARDINALITY:
				return convertCardinalityToString(eDataType, instanceValue);
			case DomainPackage.DB_TYPE:
				return convertDbTypeToString(eDataType, instanceValue);
			case DomainPackage.DB_PROVIDER:
				return convertDbProviderToString(eDataType, instanceValue);
			case DomainPackage.INCLUSION_TYPE:
				return convertInclusionTypeToString(eDataType, instanceValue);
			case DomainPackage.JPA_ENUM_TYPE:
				return convertJpaEnumTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringField createStringField() {
		StringFieldImpl stringField = new StringFieldImpl();
		return stringField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateField createDateField() {
		DateFieldImpl dateField = new DateFieldImpl();
		return dateField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerField createIntegerField() {
		IntegerFieldImpl integerField = new IntegerFieldImpl();
		return integerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationEnd createAssociationEnd() {
		AssociationEndImpl associationEnd = new AssociationEndImpl();
		return associationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField createEnumField() {
		EnumFieldImpl enumField = new EnumFieldImpl();
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericField createNumericField() {
		NumericFieldImpl numericField = new NumericFieldImpl();
		return numericField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanField createBooleanField() {
		BooleanFieldImpl booleanField = new BooleanFieldImpl();
		return booleanField;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RooGenOptions createRooGenOptions() {
		RooGenOptionsImpl rooGenOptions = new RooGenOptionsImpl();
		return rooGenOptions;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectOptions createProjectOptions() {
		ProjectOptionsImpl projectOptions = new ProjectOptionsImpl();
		return projectOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceOptions createPersistenceOptions() {
		PersistenceOptionsImpl persistenceOptions = new PersistenceOptionsImpl();
		return persistenceOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeField createTypeField() {
		TypeFieldImpl typeField = new TypeFieldImpl();
		return typeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnyField createAnyField() {
		AnyFieldImpl anyField = new AnyFieldImpl();
		return anyField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceField createPriceField() {
		PriceFieldImpl priceField = new PriceFieldImpl();
		return priceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountField createAmountField() {
		AmountFieldImpl amountField = new AmountFieldImpl();
		return amountField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountField createCountField() {
		CountFieldImpl countField = new CountFieldImpl();
		return countField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityReferenceField createEntityReferenceField() {
		EntityReferenceFieldImpl entityReferenceField = new EntityReferenceFieldImpl();
		return entityReferenceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoLocationField createGeoLocationField() {
		GeoLocationFieldImpl geoLocationField = new GeoLocationFieldImpl();
		return geoLocationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JpaGenOptions createJpaGenOptions() {
		JpaGenOptionsImpl jpaGenOptions = new JpaGenOptionsImpl();
		return jpaGenOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationInclusion createGenerationInclusion() {
		GenerationInclusionImpl generationInclusion = new GenerationInclusionImpl();
		return generationInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationRef createAssociationRef() {
		AssociationRefImpl associationRef = new AssociationRefImpl();
		return associationRef;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint createUniqueConstraint() {
		UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
		return uniqueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintTypeField createConstraintTypeField() {
		ConstraintTypeFieldImpl constraintTypeField = new ConstraintTypeFieldImpl();
		return constraintTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongoNodeGenOptions createMongoNodeGenOptions() {
		MongoNodeGenOptionsImpl mongoNodeGenOptions = new MongoNodeGenOptionsImpl();
		return mongoNodeGenOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexConstraint createIndexConstraint() {
		IndexConstraintImpl indexConstraint = new IndexConstraintImpl();
		return indexConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeField createComplexTypeField() {
		ComplexTypeFieldImpl complexTypeField = new ComplexTypeFieldImpl();
		return complexTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModelImport createDomainModelImport() {
		DomainModelImportImpl domainModelImport = new DomainModelImportImpl();
		return domainModelImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongoNodeTableOptions createMongoNodeTableOptions() {
		MongoNodeTableOptionsImpl mongoNodeTableOptions = new MongoNodeTableOptionsImpl();
		return mongoNodeTableOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JpaTableOptions createJpaTableOptions() {
		JpaTableOptionsImpl jpaTableOptions = new JpaTableOptionsImpl();
		return jpaTableOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdField createIdField() {
		IdFieldImpl idField = new IdFieldImpl();
		return idField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortIdField createShortIdField() {
		ShortIdFieldImpl shortIdField = new ShortIdFieldImpl();
		return shortIdField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue) {
		Cardinality result = Cardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbType createDbTypeFromString(EDataType eDataType, String initialValue) {
		DbType result = DbType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DbProvider createDbProviderFromString(EDataType eDataType, String initialValue) {
		DbProvider result = DbProvider.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDbProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusionType createInclusionTypeFromString(EDataType eDataType, String initialValue) {
		InclusionType result = InclusionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInclusionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JpaEnumType createJpaEnumTypeFromString(EDataType eDataType, String initialValue) {
		JpaEnumType result = JpaEnumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJpaEnumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
