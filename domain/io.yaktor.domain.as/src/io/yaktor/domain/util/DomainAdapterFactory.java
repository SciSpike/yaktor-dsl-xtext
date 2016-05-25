/**
 */
package io.yaktor.domain.util;

import io.yaktor.domain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.yaktor.domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseNamedType(NamedType object) {
				return createNamedTypeAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseSimpleField(SimpleField object) {
				return createSimpleFieldAdapter();
			}
			@Override
			public Adapter caseStringField(StringField object) {
				return createStringFieldAdapter();
			}
			@Override
			public Adapter caseDateField(DateField object) {
				return createDateFieldAdapter();
			}
			@Override
			public Adapter caseIntegerField(IntegerField object) {
				return createIntegerFieldAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseAssociationEnd(AssociationEnd object) {
				return createAssociationEndAdapter();
			}
			@Override
			public Adapter caseEnumField(EnumField object) {
				return createEnumFieldAdapter();
			}
			@Override
			public Adapter caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			@Override
			public Adapter caseNumericField(NumericField object) {
				return createNumericFieldAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter caseBooleanField(BooleanField object) {
				return createBooleanFieldAdapter();
			}
			@Override
			public Adapter caseGenOptions(GenOptions object) {
				return createGenOptionsAdapter();
			}
			@Override
			public Adapter caseRooGenOptions(RooGenOptions object) {
				return createRooGenOptionsAdapter();
			}
			@Override
			public Adapter caseProjectOptions(ProjectOptions object) {
				return createProjectOptionsAdapter();
			}
			@Override
			public Adapter casePersistenceOptions(PersistenceOptions object) {
				return createPersistenceOptionsAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeField(TypeField object) {
				return createTypeFieldAdapter();
			}
			@Override
			public Adapter caseAnyField(AnyField object) {
				return createAnyFieldAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter casePriceField(PriceField object) {
				return createPriceFieldAdapter();
			}
			@Override
			public Adapter caseAmountField(AmountField object) {
				return createAmountFieldAdapter();
			}
			@Override
			public Adapter caseCountField(CountField object) {
				return createCountFieldAdapter();
			}
			@Override
			public Adapter caseEntityReferenceField(EntityReferenceField object) {
				return createEntityReferenceFieldAdapter();
			}
			@Override
			public Adapter caseGeoLocationField(GeoLocationField object) {
				return createGeoLocationFieldAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseJpaGenOptions(JpaGenOptions object) {
				return createJpaGenOptionsAdapter();
			}
			@Override
			public Adapter caseGenerationInclusion(GenerationInclusion object) {
				return createGenerationInclusionAdapter();
			}
			@Override
			public Adapter caseAssociationRef(AssociationRef object) {
				return createAssociationRefAdapter();
			}
			@Override
			public Adapter caseUniqueConstraint(UniqueConstraint object) {
				return createUniqueConstraintAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseIndexConstraint(IndexConstraint object) {
				return createIndexConstraintAdapter();
			}
			@Override
			public Adapter caseConstraintTypeField(ConstraintTypeField object) {
				return createConstraintTypeFieldAdapter();
			}
			@Override
			public Adapter caseNodeGenOption(NodeGenOption object) {
				return createNodeGenOptionAdapter();
			}
			@Override
			public Adapter caseMongoNodeGenOptions(MongoNodeGenOptions object) {
				return createMongoNodeGenOptionsAdapter();
			}
			@Override
			public Adapter caseComplexTypeField(ComplexTypeField object) {
				return createComplexTypeFieldAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseDomainModelImport(DomainModelImport object) {
				return createDomainModelImportAdapter();
			}
			@Override
			public Adapter caseMongoNodeTableOptions(MongoNodeTableOptions object) {
				return createMongoNodeTableOptionsAdapter();
			}
			@Override
			public Adapter caseJpaTableOptions(JpaTableOptions object) {
				return createJpaTableOptionsAdapter();
			}
			@Override
			public Adapter caseIdField(IdField object) {
				return createIdFieldAdapter();
			}
			@Override
			public Adapter caseShortIdField(ShortIdField object) {
				return createShortIdFieldAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.DomainModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.NamedType
	 * @generated
	 */
	public Adapter createNamedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.SimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.SimpleField
	 * @generated
	 */
	public Adapter createSimpleFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.StringField <em>String Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.StringField
	 * @generated
	 */
	public Adapter createStringFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.DateField <em>Date Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.DateField
	 * @generated
	 */
	public Adapter createDateFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.IntegerField <em>Integer Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.IntegerField
	 * @generated
	 */
	public Adapter createIntegerFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.AssociationEnd
	 * @generated
	 */
	public Adapter createAssociationEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.EnumField <em>Enum Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.EnumField
	 * @generated
	 */
	public Adapter createEnumFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.NumericField <em>Numeric Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.NumericField
	 * @generated
	 */
	public Adapter createNumericFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.BooleanField <em>Boolean Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.BooleanField
	 * @generated
	 */
	public Adapter createBooleanFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.GenOptions <em>Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.GenOptions
	 * @generated
	 */
	public Adapter createGenOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.RooGenOptions <em>Roo Gen Options</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.RooGenOptions
	 * @generated
	 */
  public Adapter createRooGenOptionsAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.ProjectOptions <em>Project Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.ProjectOptions
	 * @generated
	 */
	public Adapter createProjectOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.PersistenceOptions <em>Persistence Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.PersistenceOptions
	 * @generated
	 */
	public Adapter createPersistenceOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.TypeField <em>Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.TypeField
	 * @generated
	 */
	public Adapter createTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.AnyField <em>Any Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.AnyField
	 * @generated
	 */
	public Adapter createAnyFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.PriceField <em>Price Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.PriceField
	 * @generated
	 */
	public Adapter createPriceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.AmountField <em>Amount Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.AmountField
	 * @generated
	 */
	public Adapter createAmountFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.CountField <em>Count Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.CountField
	 * @generated
	 */
	public Adapter createCountFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.EntityReferenceField <em>Entity Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.EntityReferenceField
	 * @generated
	 */
	public Adapter createEntityReferenceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.GeoLocationField <em>Geo Location Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.GeoLocationField
	 * @generated
	 */
	public Adapter createGeoLocationFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.JpaGenOptions <em>Jpa Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.JpaGenOptions
	 * @generated
	 */
	public Adapter createJpaGenOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.GenerationInclusion <em>Generation Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.GenerationInclusion
	 * @generated
	 */
	public Adapter createGenerationInclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.AssociationRef <em>Association Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.AssociationRef
	 * @generated
	 */
	public Adapter createAssociationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.Constraint
	 * @generated
	 */
  public Adapter createConstraintAdapter() {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.UniqueConstraint
	 * @generated
	 */
	public Adapter createUniqueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.ConstraintTypeField <em>Constraint Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.ConstraintTypeField
	 * @generated
	 */
	public Adapter createConstraintTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.NodeGenOption <em>Node Gen Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.NodeGenOption
	 * @generated
	 */
	public Adapter createNodeGenOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.MongoNodeGenOptions <em>Mongo Node Gen Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.MongoNodeGenOptions
	 * @generated
	 */
	public Adapter createMongoNodeGenOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.IndexConstraint <em>Index Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.IndexConstraint
	 * @generated
	 */
	public Adapter createIndexConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.ComplexTypeField <em>Complex Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.ComplexTypeField
	 * @generated
	 */
	public Adapter createComplexTypeFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.DomainModelImport <em>Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.DomainModelImport
	 * @generated
	 */
	public Adapter createDomainModelImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.MongoNodeTableOptions <em>Mongo Node Table Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.MongoNodeTableOptions
	 * @generated
	 */
	public Adapter createMongoNodeTableOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.JpaTableOptions <em>Jpa Table Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.JpaTableOptions
	 * @generated
	 */
	public Adapter createJpaTableOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.IdField <em>Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.IdField
	 * @generated
	 */
	public Adapter createIdFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.domain.ShortIdField <em>Short Id Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.domain.ShortIdField
	 * @generated
	 */
	public Adapter createShortIdFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DomainAdapterFactory
