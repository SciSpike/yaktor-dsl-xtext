/**
 */
package io.yaktor.domain.util;

import io.yaktor.domain.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see io.yaktor.domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSwitch() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DomainPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.NAMED_TYPE: {
				NamedType namedType = (NamedType)theEObject;
				T result = caseNamedType(namedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseTableType(entity);
				if (result == null) result = caseNamedType(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.SIMPLE_FIELD: {
				SimpleField simpleField = (SimpleField)theEObject;
				T result = caseSimpleField(simpleField);
				if (result == null) result = caseConstraintTypeField(simpleField);
				if (result == null) result = caseField(simpleField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.STRING_FIELD: {
				StringField stringField = (StringField)theEObject;
				T result = caseStringField(stringField);
				if (result == null) result = caseSimpleField(stringField);
				if (result == null) result = caseConstraintTypeField(stringField);
				if (result == null) result = caseField(stringField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.DATE_FIELD: {
				DateField dateField = (DateField)theEObject;
				T result = caseDateField(dateField);
				if (result == null) result = caseSimpleField(dateField);
				if (result == null) result = caseConstraintTypeField(dateField);
				if (result == null) result = caseField(dateField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.INTEGER_FIELD: {
				IntegerField integerField = (IntegerField)theEObject;
				T result = caseIntegerField(integerField);
				if (result == null) result = caseSimpleField(integerField);
				if (result == null) result = caseConstraintTypeField(integerField);
				if (result == null) result = caseField(integerField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseNamedType(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ASSOCIATION_END: {
				AssociationEnd associationEnd = (AssociationEnd)theEObject;
				T result = caseAssociationEnd(associationEnd);
				if (result == null) result = caseConstraintTypeField(associationEnd);
				if (result == null) result = caseComplexTypeField(associationEnd);
				if (result == null) result = caseField(associationEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ENUM_FIELD: {
				EnumField enumField = (EnumField)theEObject;
				T result = caseEnumField(enumField);
				if (result == null) result = caseSimpleField(enumField);
				if (result == null) result = caseConstraintTypeField(enumField);
				if (result == null) result = caseField(enumField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = caseNamedType(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.NUMERIC_FIELD: {
				NumericField numericField = (NumericField)theEObject;
				T result = caseNumericField(numericField);
				if (result == null) result = caseSimpleField(numericField);
				if (result == null) result = caseConstraintTypeField(numericField);
				if (result == null) result = caseField(numericField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.BOOLEAN_FIELD: {
				BooleanField booleanField = (BooleanField)theEObject;
				T result = caseBooleanField(booleanField);
				if (result == null) result = caseSimpleField(booleanField);
				if (result == null) result = caseConstraintTypeField(booleanField);
				if (result == null) result = caseField(booleanField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.GEN_OPTIONS: {
				GenOptions genOptions = (GenOptions)theEObject;
				T result = caseGenOptions(genOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ROO_GEN_OPTIONS: {
				RooGenOptions rooGenOptions = (RooGenOptions)theEObject;
				T result = caseRooGenOptions(rooGenOptions);
				if (result == null) result = caseGenOptions(rooGenOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PROJECT_OPTIONS: {
				ProjectOptions projectOptions = (ProjectOptions)theEObject;
				T result = caseProjectOptions(projectOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PERSISTENCE_OPTIONS: {
				PersistenceOptions persistenceOptions = (PersistenceOptions)theEObject;
				T result = casePersistenceOptions(persistenceOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseTableType(type);
				if (result == null) result = caseNamedType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.TYPE_FIELD: {
				TypeField typeField = (TypeField)theEObject;
				T result = caseTypeField(typeField);
				if (result == null) result = caseField(typeField);
				if (result == null) result = caseComplexTypeField(typeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ANY_FIELD: {
				AnyField anyField = (AnyField)theEObject;
				T result = caseAnyField(anyField);
				if (result == null) result = caseSimpleField(anyField);
				if (result == null) result = caseConstraintTypeField(anyField);
				if (result == null) result = caseField(anyField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.PRICE_FIELD: {
				PriceField priceField = (PriceField)theEObject;
				T result = casePriceField(priceField);
				if (result == null) result = caseSimpleField(priceField);
				if (result == null) result = caseConstraintTypeField(priceField);
				if (result == null) result = caseField(priceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.AMOUNT_FIELD: {
				AmountField amountField = (AmountField)theEObject;
				T result = caseAmountField(amountField);
				if (result == null) result = caseSimpleField(amountField);
				if (result == null) result = caseConstraintTypeField(amountField);
				if (result == null) result = caseField(amountField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.COUNT_FIELD: {
				CountField countField = (CountField)theEObject;
				T result = caseCountField(countField);
				if (result == null) result = caseSimpleField(countField);
				if (result == null) result = caseConstraintTypeField(countField);
				if (result == null) result = caseField(countField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ENTITY_REFERENCE_FIELD: {
				EntityReferenceField entityReferenceField = (EntityReferenceField)theEObject;
				T result = caseEntityReferenceField(entityReferenceField);
				if (result == null) result = caseSimpleField(entityReferenceField);
				if (result == null) result = caseComplexTypeField(entityReferenceField);
				if (result == null) result = caseConstraintTypeField(entityReferenceField);
				if (result == null) result = caseField(entityReferenceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.GEO_LOCATION_FIELD: {
				GeoLocationField geoLocationField = (GeoLocationField)theEObject;
				T result = caseGeoLocationField(geoLocationField);
				if (result == null) result = caseSimpleField(geoLocationField);
				if (result == null) result = caseConstraintTypeField(geoLocationField);
				if (result == null) result = caseField(geoLocationField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = caseNamedType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.JPA_GEN_OPTIONS: {
				JpaGenOptions jpaGenOptions = (JpaGenOptions)theEObject;
				T result = caseJpaGenOptions(jpaGenOptions);
				if (result == null) result = caseGenOptions(jpaGenOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.GENERATION_INCLUSION: {
				GenerationInclusion generationInclusion = (GenerationInclusion)theEObject;
				T result = caseGenerationInclusion(generationInclusion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ASSOCIATION_REF: {
				AssociationRef associationRef = (AssociationRef)theEObject;
				T result = caseAssociationRef(associationRef);
				if (result == null) result = caseNamedType(associationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.UNIQUE_CONSTRAINT: {
				UniqueConstraint uniqueConstraint = (UniqueConstraint)theEObject;
				T result = caseUniqueConstraint(uniqueConstraint);
				if (result == null) result = caseConstraint(uniqueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.INDEX_CONSTRAINT: {
				IndexConstraint indexConstraint = (IndexConstraint)theEObject;
				T result = caseIndexConstraint(indexConstraint);
				if (result == null) result = caseConstraint(indexConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.CONSTRAINT_TYPE_FIELD: {
				ConstraintTypeField constraintTypeField = (ConstraintTypeField)theEObject;
				T result = caseConstraintTypeField(constraintTypeField);
				if (result == null) result = caseField(constraintTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.NODE_GEN_OPTION: {
				NodeGenOption nodeGenOption = (NodeGenOption)theEObject;
				T result = caseNodeGenOption(nodeGenOption);
				if (result == null) result = caseGenOptions(nodeGenOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.MONGO_NODE_GEN_OPTIONS: {
				MongoNodeGenOptions mongoNodeGenOptions = (MongoNodeGenOptions)theEObject;
				T result = caseMongoNodeGenOptions(mongoNodeGenOptions);
				if (result == null) result = caseNodeGenOption(mongoNodeGenOptions);
				if (result == null) result = caseGenOptions(mongoNodeGenOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.COMPLEX_TYPE_FIELD: {
				ComplexTypeField complexTypeField = (ComplexTypeField)theEObject;
				T result = caseComplexTypeField(complexTypeField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.DOMAIN_MODEL_IMPORT: {
				DomainModelImport domainModelImport = (DomainModelImport)theEObject;
				T result = caseDomainModelImport(domainModelImport);
				if (result == null) result = caseImport(domainModelImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.MONGO_NODE_TABLE_OPTIONS: {
				MongoNodeTableOptions mongoNodeTableOptions = (MongoNodeTableOptions)theEObject;
				T result = caseMongoNodeTableOptions(mongoNodeTableOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.JPA_TABLE_OPTIONS: {
				JpaTableOptions jpaTableOptions = (JpaTableOptions)theEObject;
				T result = caseJpaTableOptions(jpaTableOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.ID_FIELD: {
				IdField idField = (IdField)theEObject;
				T result = caseIdField(idField);
				if (result == null) result = caseSimpleField(idField);
				if (result == null) result = caseConstraintTypeField(idField);
				if (result == null) result = caseField(idField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DomainPackage.SHORT_ID_FIELD: {
				ShortIdField shortIdField = (ShortIdField)theEObject;
				T result = caseShortIdField(shortIdField);
				if (result == null) result = caseSimpleField(shortIdField);
				if (result == null) result = caseConstraintTypeField(shortIdField);
				if (result == null) result = caseField(shortIdField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedType(NamedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleField(SimpleField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringField(StringField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateField(DateField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerField(IntegerField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationEnd(AssociationEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumField(EnumField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericField(NumericField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanField(BooleanField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenOptions(GenOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roo Gen Options</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roo Gen Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRooGenOptions(RooGenOptions object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Project Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectOptions(ProjectOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceOptions(PersistenceOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeField(TypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyField(AnyField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Price Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Price Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriceField(PriceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amount Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amount Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmountField(AmountField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountField(CountField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReferenceField(EntityReferenceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Location Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Location Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoLocationField(GeoLocationField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jpa Gen Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jpa Gen Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJpaGenOptions(JpaGenOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Inclusion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationInclusion(GenerationInclusion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationRef(AssociationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConstraint(Constraint object) {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueConstraint(UniqueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintTypeField(ConstraintTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Gen Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Gen Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeGenOption(NodeGenOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mongo Node Gen Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mongo Node Gen Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMongoNodeGenOptions(MongoNodeGenOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexConstraint(IndexConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexTypeField(ComplexTypeField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModelImport(DomainModelImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mongo Node Table Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mongo Node Table Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMongoNodeTableOptions(MongoNodeTableOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jpa Table Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jpa Table Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJpaTableOptions(JpaTableOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdField(IdField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short Id Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short Id Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShortIdField(ShortIdField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DomainSwitch
