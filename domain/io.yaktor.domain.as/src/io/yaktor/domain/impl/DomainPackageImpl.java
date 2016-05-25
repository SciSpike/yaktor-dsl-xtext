/**
 */
package io.yaktor.domain.impl;

import io.yaktor.domain.AmountField;
import io.yaktor.domain.AnyField;
import io.yaktor.domain.Association;
import io.yaktor.domain.AssociationEnd;
import io.yaktor.domain.AssociationRef;
import io.yaktor.domain.BooleanField;
import io.yaktor.domain.Cardinality;
import io.yaktor.domain.ComplexTypeField;
import io.yaktor.domain.Constraint;
import io.yaktor.domain.ConstraintTypeField;
import io.yaktor.domain.CountField;
import io.yaktor.domain.DateField;
import io.yaktor.domain.DbProvider;
import io.yaktor.domain.DbType;
import io.yaktor.domain.DomainFactory;
import io.yaktor.domain.DomainModel;
import io.yaktor.domain.DomainModelImport;
import io.yaktor.domain.DomainPackage;
import io.yaktor.domain.Entity;
import io.yaktor.domain.EntityReferenceField;
import io.yaktor.domain.EnumField;
import io.yaktor.domain.EnumType;
import io.yaktor.domain.EnumValue;
import io.yaktor.domain.Field;
import io.yaktor.domain.GenOptions;
import io.yaktor.domain.GenerationInclusion;
import io.yaktor.domain.GeoLocationField;
import io.yaktor.domain.IdField;
import io.yaktor.domain.Import;
import io.yaktor.domain.InclusionType;
import io.yaktor.domain.IndexConstraint;
import io.yaktor.domain.IntegerField;
import io.yaktor.domain.JpaEnumType;
import io.yaktor.domain.JpaGenOptions;
import io.yaktor.domain.JpaTableOptions;
import io.yaktor.domain.MongoNodeGenOptions;
import io.yaktor.domain.MongoNodeTableOptions;
import io.yaktor.domain.NamedType;
import io.yaktor.domain.NodeGenOption;
import io.yaktor.domain.NumericField;
import io.yaktor.domain.PersistenceOptions;
import io.yaktor.domain.PriceField;
import io.yaktor.domain.ProjectOptions;
import io.yaktor.domain.RooGenOptions;
import io.yaktor.domain.ShortIdField;
import io.yaktor.domain.SimpleField;
import io.yaktor.domain.StringField;
import io.yaktor.domain.TableType;
import io.yaktor.domain.Type;
import io.yaktor.domain.TypeField;
import io.yaktor.domain.UniqueConstraint;
import io.yaktor.mongoNode.MongoNodePackage;
import io.yaktor.mongoNode.impl.MongoNodePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rooGenOptionsEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass amountFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityReferenceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoLocationFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaGenOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass constraintEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeGenOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongoNodeGenOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mongoNodeTableOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpaTableOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortIdFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbProviderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inclusionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jpaEnumTypeEEnum = null;

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
	 * @see io.yaktor.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DomainPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MongoNodePackageImpl theMongoNodePackage = (MongoNodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MongoNodePackage.eNS_URI) instanceof MongoNodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MongoNodePackage.eNS_URI) : MongoNodePackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theMongoNodePackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theMongoNodePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_Types() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainModel_Name() {
		return (EAttribute)domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_GenOptions() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DomainModelImports() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedType() {
		return namedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedType_Name() {
		return (EAttribute)namedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedType_Model() {
		return (EReference)namedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleField() {
		return simpleFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleField_Unique() {
		return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleField_Indexed() {
		return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringField() {
		return stringFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringField_DefaultValue() {
		return (EAttribute)stringFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringField_Pattern() {
		return (EAttribute)stringFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringField_MinLength() {
		return (EAttribute)stringFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringField_MaxLength() {
		return (EAttribute)stringFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringField_Obscured() {
		return (EAttribute)stringFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateField() {
		return dateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_DefaultValue() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Before() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_After() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Past() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Future() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerField() {
		return integerFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerField_DefaultValue() {
		return (EAttribute)integerFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerField_MinValue() {
		return (EAttribute)integerFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerField_MaxValue() {
		return (EAttribute)integerFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_Start() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_End() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsUnidirectional() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationEnd() {
		return associationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_IsComposition() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationEnd_References() {
		return (EReference)associationEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationEnd_Unique() {
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumField() {
		return enumFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumField_IsType() {
		return (EReference)enumFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumField_DefaultValue() {
		return (EReference)enumFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumField_IsJpaEnumType() {
		return (EAttribute)enumFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumType() {
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumType_Values() {
		return (EReference)enumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericField() {
		return numericFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericField_DefaultValue() {
		return (EAttribute)numericFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericField_MinValue() {
		return (EAttribute)numericFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericField_MaxValue() {
		return (EAttribute)numericFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValue_Name() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValue_Value() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanField() {
		return booleanFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanField_DefaultValue() {
		return (EAttribute)booleanFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenOptions() {
		return genOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenOptions_Name() {
		return (EAttribute)genOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRooGenOptions() {
		return rooGenOptionsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRooGenOptions_Project() {
		return (EReference)rooGenOptionsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRooGenOptions_Persistence() {
		return (EReference)rooGenOptionsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectOptions() {
		return projectOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectOptions_Name() {
		return (EAttribute)projectOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectOptions_RootPackage() {
		return (EAttribute)projectOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectOptions_DomainSubpackage() {
		return (EAttribute)projectOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectOptions_JsonSupport() {
		return (EAttribute)projectOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectOptions_ControllerSubpackage() {
		return (EAttribute)projectOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceOptions() {
		return persistenceOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceOptions_DbType() {
		return (EAttribute)persistenceOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceOptions_DbProvider() {
		return (EAttribute)persistenceOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceOptions_UserName() {
		return (EAttribute)persistenceOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceOptions_Password() {
		return (EAttribute)persistenceOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceOptions_DbName() {
		return (EAttribute)persistenceOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersistenceOptions_Url() {
		return (EAttribute)persistenceOptionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeField() {
		return typeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeField_IsType() {
		return (EReference)typeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyField() {
		return anyFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Cardinality() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriceField() {
		return priceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmountField() {
		return amountFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountField() {
		return countFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityReferenceField() {
		return entityReferenceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityReferenceField_RefType() {
		return (EReference)entityReferenceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoLocationField() {
		return geoLocationFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Fields() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Supertype() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_IsAbstract() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_UniqueConstraints() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_MetaData() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_IndexConstraints() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Keys() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJpaGenOptions() {
		return jpaGenOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJpaGenOptions_Project() {
		return (EReference)jpaGenOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJpaGenOptions_Persistence() {
		return (EReference)jpaGenOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJpaGenOptions_GenerationInclusion() {
		return (EReference)jpaGenOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJpaGenOptions_UseAspects() {
		return (EAttribute)jpaGenOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJpaGenOptions_MetaData() {
		return (EAttribute)jpaGenOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJpaGenOptions_TableOptions() {
		return (EReference)jpaGenOptionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationInclusion() {
		return generationInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Types() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Controller() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Resources() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Properties() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Views() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Webxml() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Pom() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Styles() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Classes() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Layouts() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Webmvc() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationInclusion_Tags() {
		return (EAttribute)generationInclusionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationRef() {
		return associationRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationRef_Ref() {
		return (EReference)associationRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getConstraint() {
		return constraintEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getConstraint_Fields() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueConstraint() {
		return uniqueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintTypeField() {
		return constraintTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeGenOption() {
		return nodeGenOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMongoNodeGenOptions() {
		return mongoNodeGenOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoNodeGenOptions_UseLogger() {
		return (EAttribute)mongoNodeGenOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoNodeGenOptions_ModelPath() {
		return (EAttribute)mongoNodeGenOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoNodeGenOptions_TestPath() {
		return (EAttribute)mongoNodeGenOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoNodeGenOptions_GenerateTest() {
		return (EAttribute)mongoNodeGenOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMongoNodeGenOptions_TableOptions() {
		return (EReference)mongoNodeGenOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexConstraint() {
		return indexConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTypeField() {
		return complexTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Alias() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModelImport() {
		return domainModelImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModelImport_Ref() {
		return (EReference)domainModelImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMongoNodeTableOptions() {
		return mongoNodeTableOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMongoNodeTableOptions_Type() {
		return (EReference)mongoNodeTableOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMongoNodeTableOptions_Ttl() {
		return (EReference)mongoNodeTableOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMongoNodeTableOptions_SingleTableRoot() {
		return (EAttribute)mongoNodeTableOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJpaTableOptions() {
		return jpaTableOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJpaTableOptions_Type() {
		return (EReference)jpaTableOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJpaTableOptions_SingleTableRoot() {
		return (EAttribute)jpaTableOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdField() {
		return idFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortIdField() {
		return shortIdFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortIdField_Pattern() {
		return (EAttribute)shortIdFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShortIdField_MaxValue() {
		return (EAttribute)shortIdFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbType() {
		return dbTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDbProvider() {
		return dbProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInclusionType() {
		return inclusionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJpaEnumType() {
		return jpaEnumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
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
		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__TYPES);
		createEAttribute(domainModelEClass, DOMAIN_MODEL__NAME);
		createEReference(domainModelEClass, DOMAIN_MODEL__GEN_OPTIONS);
		createEReference(domainModelEClass, DOMAIN_MODEL__DOMAIN_MODEL_IMPORTS);

		namedTypeEClass = createEClass(NAMED_TYPE);
		createEAttribute(namedTypeEClass, NAMED_TYPE__NAME);
		createEReference(namedTypeEClass, NAMED_TYPE__MODEL);

		entityEClass = createEClass(ENTITY);

		simpleFieldEClass = createEClass(SIMPLE_FIELD);
		createEAttribute(simpleFieldEClass, SIMPLE_FIELD__UNIQUE);
		createEAttribute(simpleFieldEClass, SIMPLE_FIELD__INDEXED);

		stringFieldEClass = createEClass(STRING_FIELD);
		createEAttribute(stringFieldEClass, STRING_FIELD__DEFAULT_VALUE);
		createEAttribute(stringFieldEClass, STRING_FIELD__PATTERN);
		createEAttribute(stringFieldEClass, STRING_FIELD__MIN_LENGTH);
		createEAttribute(stringFieldEClass, STRING_FIELD__MAX_LENGTH);
		createEAttribute(stringFieldEClass, STRING_FIELD__OBSCURED);

		dateFieldEClass = createEClass(DATE_FIELD);
		createEAttribute(dateFieldEClass, DATE_FIELD__DEFAULT_VALUE);
		createEAttribute(dateFieldEClass, DATE_FIELD__BEFORE);
		createEAttribute(dateFieldEClass, DATE_FIELD__AFTER);
		createEAttribute(dateFieldEClass, DATE_FIELD__PAST);
		createEAttribute(dateFieldEClass, DATE_FIELD__FUTURE);

		integerFieldEClass = createEClass(INTEGER_FIELD);
		createEAttribute(integerFieldEClass, INTEGER_FIELD__DEFAULT_VALUE);
		createEAttribute(integerFieldEClass, INTEGER_FIELD__MIN_VALUE);
		createEAttribute(integerFieldEClass, INTEGER_FIELD__MAX_VALUE);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__START);
		createEReference(associationEClass, ASSOCIATION__END);
		createEAttribute(associationEClass, ASSOCIATION__IS_UNIDIRECTIONAL);

		associationEndEClass = createEClass(ASSOCIATION_END);
		createEAttribute(associationEndEClass, ASSOCIATION_END__IS_COMPOSITION);
		createEReference(associationEndEClass, ASSOCIATION_END__REFERENCES);
		createEAttribute(associationEndEClass, ASSOCIATION_END__UNIQUE);

		enumFieldEClass = createEClass(ENUM_FIELD);
		createEReference(enumFieldEClass, ENUM_FIELD__IS_TYPE);
		createEReference(enumFieldEClass, ENUM_FIELD__DEFAULT_VALUE);
		createEAttribute(enumFieldEClass, ENUM_FIELD__IS_JPA_ENUM_TYPE);

		enumTypeEClass = createEClass(ENUM_TYPE);
		createEReference(enumTypeEClass, ENUM_TYPE__VALUES);

		numericFieldEClass = createEClass(NUMERIC_FIELD);
		createEAttribute(numericFieldEClass, NUMERIC_FIELD__DEFAULT_VALUE);
		createEAttribute(numericFieldEClass, NUMERIC_FIELD__MIN_VALUE);
		createEAttribute(numericFieldEClass, NUMERIC_FIELD__MAX_VALUE);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEAttribute(enumValueEClass, ENUM_VALUE__NAME);
		createEAttribute(enumValueEClass, ENUM_VALUE__VALUE);

		booleanFieldEClass = createEClass(BOOLEAN_FIELD);
		createEAttribute(booleanFieldEClass, BOOLEAN_FIELD__DEFAULT_VALUE);

		genOptionsEClass = createEClass(GEN_OPTIONS);
		createEAttribute(genOptionsEClass, GEN_OPTIONS__NAME);

		rooGenOptionsEClass = createEClass(ROO_GEN_OPTIONS);
		createEReference(rooGenOptionsEClass, ROO_GEN_OPTIONS__PROJECT);
		createEReference(rooGenOptionsEClass, ROO_GEN_OPTIONS__PERSISTENCE);

		projectOptionsEClass = createEClass(PROJECT_OPTIONS);
		createEAttribute(projectOptionsEClass, PROJECT_OPTIONS__NAME);
		createEAttribute(projectOptionsEClass, PROJECT_OPTIONS__ROOT_PACKAGE);
		createEAttribute(projectOptionsEClass, PROJECT_OPTIONS__DOMAIN_SUBPACKAGE);
		createEAttribute(projectOptionsEClass, PROJECT_OPTIONS__JSON_SUPPORT);
		createEAttribute(projectOptionsEClass, PROJECT_OPTIONS__CONTROLLER_SUBPACKAGE);

		persistenceOptionsEClass = createEClass(PERSISTENCE_OPTIONS);
		createEAttribute(persistenceOptionsEClass, PERSISTENCE_OPTIONS__DB_TYPE);
		createEAttribute(persistenceOptionsEClass, PERSISTENCE_OPTIONS__DB_PROVIDER);
		createEAttribute(persistenceOptionsEClass, PERSISTENCE_OPTIONS__USER_NAME);
		createEAttribute(persistenceOptionsEClass, PERSISTENCE_OPTIONS__PASSWORD);
		createEAttribute(persistenceOptionsEClass, PERSISTENCE_OPTIONS__DB_NAME);
		createEAttribute(persistenceOptionsEClass, PERSISTENCE_OPTIONS__URL);

		typeEClass = createEClass(TYPE);

		typeFieldEClass = createEClass(TYPE_FIELD);
		createEReference(typeFieldEClass, TYPE_FIELD__IS_TYPE);

		anyFieldEClass = createEClass(ANY_FIELD);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__CARDINALITY);

		priceFieldEClass = createEClass(PRICE_FIELD);

		amountFieldEClass = createEClass(AMOUNT_FIELD);

		countFieldEClass = createEClass(COUNT_FIELD);

		entityReferenceFieldEClass = createEClass(ENTITY_REFERENCE_FIELD);
		createEReference(entityReferenceFieldEClass, ENTITY_REFERENCE_FIELD__REF_TYPE);

		geoLocationFieldEClass = createEClass(GEO_LOCATION_FIELD);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__FIELDS);
		createEReference(tableTypeEClass, TABLE_TYPE__SUPERTYPE);
		createEAttribute(tableTypeEClass, TABLE_TYPE__IS_ABSTRACT);
		createEReference(tableTypeEClass, TABLE_TYPE__UNIQUE_CONSTRAINTS);
		createEAttribute(tableTypeEClass, TABLE_TYPE__META_DATA);
		createEReference(tableTypeEClass, TABLE_TYPE__INDEX_CONSTRAINTS);
		createEReference(tableTypeEClass, TABLE_TYPE__KEYS);

		jpaGenOptionsEClass = createEClass(JPA_GEN_OPTIONS);
		createEReference(jpaGenOptionsEClass, JPA_GEN_OPTIONS__PROJECT);
		createEReference(jpaGenOptionsEClass, JPA_GEN_OPTIONS__PERSISTENCE);
		createEReference(jpaGenOptionsEClass, JPA_GEN_OPTIONS__GENERATION_INCLUSION);
		createEAttribute(jpaGenOptionsEClass, JPA_GEN_OPTIONS__USE_ASPECTS);
		createEAttribute(jpaGenOptionsEClass, JPA_GEN_OPTIONS__META_DATA);
		createEReference(jpaGenOptionsEClass, JPA_GEN_OPTIONS__TABLE_OPTIONS);

		generationInclusionEClass = createEClass(GENERATION_INCLUSION);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__TYPES);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__CONTROLLER);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__RESOURCES);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__PROPERTIES);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__VIEWS);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__WEBXML);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__POM);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__STYLES);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__CLASSES);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__LAYOUTS);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__WEBMVC);
		createEAttribute(generationInclusionEClass, GENERATION_INCLUSION__TAGS);

		associationRefEClass = createEClass(ASSOCIATION_REF);
		createEReference(associationRefEClass, ASSOCIATION_REF__REF);

		uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__FIELDS);

		indexConstraintEClass = createEClass(INDEX_CONSTRAINT);

		constraintTypeFieldEClass = createEClass(CONSTRAINT_TYPE_FIELD);

		nodeGenOptionEClass = createEClass(NODE_GEN_OPTION);

		mongoNodeGenOptionsEClass = createEClass(MONGO_NODE_GEN_OPTIONS);
		createEAttribute(mongoNodeGenOptionsEClass, MONGO_NODE_GEN_OPTIONS__USE_LOGGER);
		createEAttribute(mongoNodeGenOptionsEClass, MONGO_NODE_GEN_OPTIONS__MODEL_PATH);
		createEAttribute(mongoNodeGenOptionsEClass, MONGO_NODE_GEN_OPTIONS__TEST_PATH);
		createEAttribute(mongoNodeGenOptionsEClass, MONGO_NODE_GEN_OPTIONS__GENERATE_TEST);
		createEReference(mongoNodeGenOptionsEClass, MONGO_NODE_GEN_OPTIONS__TABLE_OPTIONS);

		complexTypeFieldEClass = createEClass(COMPLEX_TYPE_FIELD);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__ALIAS);

		domainModelImportEClass = createEClass(DOMAIN_MODEL_IMPORT);
		createEReference(domainModelImportEClass, DOMAIN_MODEL_IMPORT__REF);

		mongoNodeTableOptionsEClass = createEClass(MONGO_NODE_TABLE_OPTIONS);
		createEReference(mongoNodeTableOptionsEClass, MONGO_NODE_TABLE_OPTIONS__TYPE);
		createEReference(mongoNodeTableOptionsEClass, MONGO_NODE_TABLE_OPTIONS__TTL);
		createEAttribute(mongoNodeTableOptionsEClass, MONGO_NODE_TABLE_OPTIONS__SINGLE_TABLE_ROOT);

		jpaTableOptionsEClass = createEClass(JPA_TABLE_OPTIONS);
		createEReference(jpaTableOptionsEClass, JPA_TABLE_OPTIONS__TYPE);
		createEAttribute(jpaTableOptionsEClass, JPA_TABLE_OPTIONS__SINGLE_TABLE_ROOT);

		idFieldEClass = createEClass(ID_FIELD);

		shortIdFieldEClass = createEClass(SHORT_ID_FIELD);
		createEAttribute(shortIdFieldEClass, SHORT_ID_FIELD__PATTERN);
		createEAttribute(shortIdFieldEClass, SHORT_ID_FIELD__MAX_VALUE);

		// Create enums
		cardinalityEEnum = createEEnum(CARDINALITY);
		dbTypeEEnum = createEEnum(DB_TYPE);
		dbProviderEEnum = createEEnum(DB_PROVIDER);
		inclusionTypeEEnum = createEEnum(INCLUSION_TYPE);
		jpaEnumTypeEEnum = createEEnum(JPA_ENUM_TYPE);
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
		MongoNodePackage theMongoNodePackage = (MongoNodePackage)EPackage.Registry.INSTANCE.getEPackage(MongoNodePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getTableType());
		simpleFieldEClass.getESuperTypes().add(this.getConstraintTypeField());
		stringFieldEClass.getESuperTypes().add(this.getSimpleField());
		dateFieldEClass.getESuperTypes().add(this.getSimpleField());
		integerFieldEClass.getESuperTypes().add(this.getSimpleField());
		associationEClass.getESuperTypes().add(this.getNamedType());
		associationEndEClass.getESuperTypes().add(this.getConstraintTypeField());
		associationEndEClass.getESuperTypes().add(this.getComplexTypeField());
		enumFieldEClass.getESuperTypes().add(this.getSimpleField());
		enumTypeEClass.getESuperTypes().add(this.getNamedType());
		numericFieldEClass.getESuperTypes().add(this.getSimpleField());
		booleanFieldEClass.getESuperTypes().add(this.getSimpleField());
		rooGenOptionsEClass.getESuperTypes().add(this.getGenOptions());
		typeEClass.getESuperTypes().add(this.getTableType());
		typeFieldEClass.getESuperTypes().add(this.getField());
		typeFieldEClass.getESuperTypes().add(this.getComplexTypeField());
		anyFieldEClass.getESuperTypes().add(this.getSimpleField());
		priceFieldEClass.getESuperTypes().add(this.getSimpleField());
		amountFieldEClass.getESuperTypes().add(this.getSimpleField());
		countFieldEClass.getESuperTypes().add(this.getSimpleField());
		entityReferenceFieldEClass.getESuperTypes().add(this.getSimpleField());
		entityReferenceFieldEClass.getESuperTypes().add(this.getComplexTypeField());
		geoLocationFieldEClass.getESuperTypes().add(this.getSimpleField());
		tableTypeEClass.getESuperTypes().add(this.getNamedType());
		jpaGenOptionsEClass.getESuperTypes().add(this.getGenOptions());
		associationRefEClass.getESuperTypes().add(this.getNamedType());
		uniqueConstraintEClass.getESuperTypes().add(this.getConstraint());
		indexConstraintEClass.getESuperTypes().add(this.getConstraint());
		constraintTypeFieldEClass.getESuperTypes().add(this.getField());
		nodeGenOptionEClass.getESuperTypes().add(this.getGenOptions());
		mongoNodeGenOptionsEClass.getESuperTypes().add(this.getNodeGenOption());
		domainModelImportEClass.getESuperTypes().add(this.getImport());
		idFieldEClass.getESuperTypes().add(this.getSimpleField());
		shortIdFieldEClass.getESuperTypes().add(this.getSimpleField());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_Types(), this.getNamedType(), this.getNamedType_Model(), "types", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_GenOptions(), this.getGenOptions(), null, "genOptions", null, 0, 1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_DomainModelImports(), this.getDomainModelImport(), null, "domainModelImports", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedTypeEClass, NamedType.class, "NamedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedType_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedType_Model(), this.getDomainModel(), this.getDomainModel_Types(), "model", null, 0, 1, NamedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleFieldEClass, SimpleField.class, "SimpleField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleField_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleField_Indexed(), ecorePackage.getEBoolean(), "indexed", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringFieldEClass, StringField.class, "StringField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, StringField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringField_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, StringField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringField_MinLength(), ecorePackage.getEInt(), "minLength", null, 0, 1, StringField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringField_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 0, 1, StringField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringField_Obscured(), ecorePackage.getEBoolean(), "obscured", "false", 0, 1, StringField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateField_Before(), ecorePackage.getEString(), "before", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateField_After(), ecorePackage.getEString(), "after", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateField_Past(), ecorePackage.getEBoolean(), "past", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateField_Future(), ecorePackage.getEBoolean(), "future", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerFieldEClass, IntegerField.class, "IntegerField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, IntegerField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerField_MinValue(), ecorePackage.getEString(), "minValue", null, 0, 1, IntegerField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerField_MaxValue(), ecorePackage.getEString(), "maxValue", null, 0, 1, IntegerField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_Start(), this.getAssociationEnd(), null, "start", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_End(), this.getAssociationEnd(), null, "end", null, 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_IsUnidirectional(), ecorePackage.getEBoolean(), "isUnidirectional", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationEnd_IsComposition(), ecorePackage.getEBoolean(), "isComposition", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationEnd_References(), this.getEntity(), null, "references", null, 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumFieldEClass, EnumField.class, "EnumField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumField_IsType(), this.getEnumType(), null, "isType", null, 1, 1, EnumField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumField_DefaultValue(), this.getEnumValue(), null, "defaultValue", null, 0, 1, EnumField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumField_IsJpaEnumType(), this.getJpaEnumType(), "isJpaEnumType", null, 0, 1, EnumField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumType_Values(), this.getEnumValue(), null, "values", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericFieldEClass, NumericField.class, "NumericField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, NumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericField_MinValue(), ecorePackage.getEString(), "minValue", null, 0, 1, NumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericField_MaxValue(), ecorePackage.getEString(), "maxValue", null, 0, 1, NumericField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumValue_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanFieldEClass, BooleanField.class, "BooleanField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, BooleanField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genOptionsEClass, GenOptions.class, "GenOptions", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenOptions_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rooGenOptionsEClass, RooGenOptions.class, "RooGenOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRooGenOptions_Project(), this.getProjectOptions(), null, "project", null, 1, 1, RooGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRooGenOptions_Persistence(), this.getPersistenceOptions(), null, "persistence", null, 0, 1, RooGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectOptionsEClass, ProjectOptions.class, "ProjectOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectOptions_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectOptions_RootPackage(), ecorePackage.getEString(), "rootPackage", null, 0, 1, ProjectOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectOptions_DomainSubpackage(), ecorePackage.getEString(), "domainSubpackage", null, 0, 1, ProjectOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectOptions_JsonSupport(), ecorePackage.getEBoolean(), "jsonSupport", null, 0, 1, ProjectOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectOptions_ControllerSubpackage(), ecorePackage.getEString(), "controllerSubpackage", null, 0, 1, ProjectOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceOptionsEClass, PersistenceOptions.class, "PersistenceOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersistenceOptions_DbType(), this.getDbType(), "dbType", null, 1, 1, PersistenceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceOptions_DbProvider(), this.getDbProvider(), "dbProvider", null, 0, 1, PersistenceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceOptions_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, PersistenceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceOptions_Password(), ecorePackage.getEString(), "password", null, 0, 1, PersistenceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceOptions_DbName(), ecorePackage.getEString(), "dbName", null, 0, 1, PersistenceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersistenceOptions_Url(), ecorePackage.getEString(), "url", null, 0, 1, PersistenceOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeFieldEClass, TypeField.class, "TypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeField_IsType(), this.getType(), null, "isType", null, 1, 1, TypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyFieldEClass, AnyField.class, "AnyField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Cardinality(), this.getCardinality(), "cardinality", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priceFieldEClass, PriceField.class, "PriceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(amountFieldEClass, AmountField.class, "AmountField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countFieldEClass, CountField.class, "CountField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityReferenceFieldEClass, EntityReferenceField.class, "EntityReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityReferenceField_RefType(), this.getEntity(), null, "refType", null, 1, 1, EntityReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoLocationFieldEClass, GeoLocationField.class, "GeoLocationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Fields(), this.getField(), null, "fields", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Supertype(), this.getTableType(), null, "supertype", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_UniqueConstraints(), this.getUniqueConstraint(), null, "uniqueConstraints", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_MetaData(), ecorePackage.getEBoolean(), "metaData", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_IndexConstraints(), this.getIndexConstraint(), null, "indexConstraints", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Keys(), this.getField(), null, "keys", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jpaGenOptionsEClass, JpaGenOptions.class, "JpaGenOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJpaGenOptions_Project(), this.getProjectOptions(), null, "project", null, 1, 1, JpaGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJpaGenOptions_Persistence(), this.getPersistenceOptions(), null, "persistence", null, 0, 1, JpaGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJpaGenOptions_GenerationInclusion(), this.getGenerationInclusion(), null, "generationInclusion", null, 0, 1, JpaGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJpaGenOptions_UseAspects(), ecorePackage.getEBoolean(), "useAspects", null, 0, 1, JpaGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJpaGenOptions_MetaData(), ecorePackage.getEBoolean(), "metaData", null, 0, 1, JpaGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJpaGenOptions_TableOptions(), this.getJpaTableOptions(), null, "tableOptions", null, 0, -1, JpaGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationInclusionEClass, GenerationInclusion.class, "GenerationInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenerationInclusion_Types(), this.getInclusionType(), "types", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Controller(), this.getInclusionType(), "controller", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Resources(), this.getInclusionType(), "resources", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Properties(), this.getInclusionType(), "properties", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Views(), this.getInclusionType(), "views", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Webxml(), this.getInclusionType(), "webxml", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Pom(), this.getInclusionType(), "pom", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Styles(), this.getInclusionType(), "styles", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Classes(), this.getInclusionType(), "classes", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Layouts(), this.getInclusionType(), "layouts", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Webmvc(), this.getInclusionType(), "webmvc", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenerationInclusion_Tags(), this.getInclusionType(), "tags", null, 0, 1, GenerationInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationRefEClass, AssociationRef.class, "AssociationRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationRef_Ref(), this.getAssociation(), null, "ref", null, 0, 1, AssociationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Fields(), this.getConstraintTypeField(), null, "fields", null, 1, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexConstraintEClass, IndexConstraint.class, "IndexConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintTypeFieldEClass, ConstraintTypeField.class, "ConstraintTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeGenOptionEClass, NodeGenOption.class, "NodeGenOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mongoNodeGenOptionsEClass, MongoNodeGenOptions.class, "MongoNodeGenOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMongoNodeGenOptions_UseLogger(), ecorePackage.getEBoolean(), "useLogger", null, 0, 1, MongoNodeGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoNodeGenOptions_ModelPath(), ecorePackage.getEString(), "modelPath", null, 0, 1, MongoNodeGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoNodeGenOptions_TestPath(), ecorePackage.getEString(), "testPath", null, 0, 1, MongoNodeGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoNodeGenOptions_GenerateTest(), ecorePackage.getEBoolean(), "generateTest", null, 0, 1, MongoNodeGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMongoNodeGenOptions_TableOptions(), this.getMongoNodeTableOptions(), null, "tableOptions", null, 0, -1, MongoNodeGenOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeFieldEClass, ComplexTypeField.class, "ComplexTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelImportEClass, DomainModelImport.class, "DomainModelImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModelImport_Ref(), this.getDomainModel(), null, "ref", null, 0, 1, DomainModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mongoNodeTableOptionsEClass, MongoNodeTableOptions.class, "MongoNodeTableOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMongoNodeTableOptions_Type(), this.getTableType(), null, "type", null, 0, 1, MongoNodeTableOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMongoNodeTableOptions_Ttl(), theMongoNodePackage.getTtl(), null, "ttl", null, 0, 1, MongoNodeTableOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMongoNodeTableOptions_SingleTableRoot(), ecorePackage.getEBoolean(), "singleTableRoot", "false", 0, 1, MongoNodeTableOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jpaTableOptionsEClass, JpaTableOptions.class, "JpaTableOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJpaTableOptions_Type(), this.getTableType(), null, "type", null, 0, 1, JpaTableOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJpaTableOptions_SingleTableRoot(), ecorePackage.getEBoolean(), "singleTableRoot", "false", 0, 1, JpaTableOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idFieldEClass, IdField.class, "IdField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shortIdFieldEClass, ShortIdField.class, "ShortIdField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShortIdField_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, ShortIdField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShortIdField_MaxValue(), ecorePackage.getEIntegerObject(), "maxValue", null, 0, 1, ShortIdField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.REQUIRED);
		addEEnumLiteral(cardinalityEEnum, Cardinality.OPTIONAL);
		addEEnumLiteral(cardinalityEEnum, Cardinality.ONE_OR_MORE);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MANY);

		initEEnum(dbTypeEEnum, DbType.class, "DbType");
		addEEnumLiteral(dbTypeEEnum, DbType.ORACLE);
		addEEnumLiteral(dbTypeEEnum, DbType.MY_SQL);
		addEEnumLiteral(dbTypeEEnum, DbType.DATABASE_DOT_COM);
		addEEnumLiteral(dbTypeEEnum, DbType.DB2400);
		addEEnumLiteral(dbTypeEEnum, DbType.DB2_EXPRESS_C);
		addEEnumLiteral(dbTypeEEnum, DbType.DERBY_CLIENT);
		addEEnumLiteral(dbTypeEEnum, DbType.DERBY_EMBEDDED);
		addEEnumLiteral(dbTypeEEnum, DbType.FIREBIRD);
		addEEnumLiteral(dbTypeEEnum, DbType.GOOGLE_APP_ENGINE);
		addEEnumLiteral(dbTypeEEnum, DbType.H2_IN_MEMORY);
		addEEnumLiteral(dbTypeEEnum, DbType.HYPERSONIC_IN_MEMORY);
		addEEnumLiteral(dbTypeEEnum, DbType.HYPERSONIC_PERSISTENT);
		addEEnumLiteral(dbTypeEEnum, DbType.MS_SQL);
		addEEnumLiteral(dbTypeEEnum, DbType.POSTGRES);
		addEEnumLiteral(dbTypeEEnum, DbType.SYBASE);

		initEEnum(dbProviderEEnum, DbProvider.class, "DbProvider");
		addEEnumLiteral(dbProviderEEnum, DbProvider.HIBERNATE);
		addEEnumLiteral(dbProviderEEnum, DbProvider.DATA_NUCLEUS);
		addEEnumLiteral(dbProviderEEnum, DbProvider.ECLIPSE_LINK);
		addEEnumLiteral(dbProviderEEnum, DbProvider.OPEN_JPA);

		initEEnum(inclusionTypeEEnum, InclusionType.class, "InclusionType");
		addEEnumLiteral(inclusionTypeEEnum, InclusionType.NONE);
		addEEnumLiteral(inclusionTypeEEnum, InclusionType.OVERWRITE);
		addEEnumLiteral(inclusionTypeEEnum, InclusionType.PROTECTED);

		initEEnum(jpaEnumTypeEEnum, JpaEnumType.class, "JpaEnumType");
		addEEnumLiteral(jpaEnumTypeEEnum, JpaEnumType.NONE);
		addEEnumLiteral(jpaEnumTypeEEnum, JpaEnumType.ORDINAL);
		addEEnumLiteral(jpaEnumTypeEEnum, JpaEnumType.STRING);

		// Create resource
		createResource(eNS_URI);
	}

} //DomainPackageImpl
