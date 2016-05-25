/**
 */
package io.yaktor.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.yaktor.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = io.yaktor.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>String Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Field</em>'.
	 * @generated
	 */
	StringField createStringField();

	/**
	 * Returns a new object of class '<em>Date Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Field</em>'.
	 * @generated
	 */
	DateField createDateField();

	/**
	 * Returns a new object of class '<em>Integer Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Field</em>'.
	 * @generated
	 */
	IntegerField createIntegerField();

	/**
	 * Returns a new object of class '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns a new object of class '<em>Association End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association End</em>'.
	 * @generated
	 */
	AssociationEnd createAssociationEnd();

	/**
	 * Returns a new object of class '<em>Enum Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Field</em>'.
	 * @generated
	 */
	EnumField createEnumField();

	/**
	 * Returns a new object of class '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Type</em>'.
	 * @generated
	 */
	EnumType createEnumType();

	/**
	 * Returns a new object of class '<em>Numeric Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Field</em>'.
	 * @generated
	 */
	NumericField createNumericField();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Boolean Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Field</em>'.
	 * @generated
	 */
	BooleanField createBooleanField();

	/**
	 * Returns a new object of class '<em>Roo Gen Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roo Gen Options</em>'.
	 * @generated
	 */
	RooGenOptions createRooGenOptions();

	/**
	 * Returns a new object of class '<em>Project Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Options</em>'.
	 * @generated
	 */
	ProjectOptions createProjectOptions();

	/**
	 * Returns a new object of class '<em>Persistence Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Options</em>'.
	 * @generated
	 */
	PersistenceOptions createPersistenceOptions();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Field</em>'.
	 * @generated
	 */
	TypeField createTypeField();

	/**
	 * Returns a new object of class '<em>Any Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Field</em>'.
	 * @generated
	 */
	AnyField createAnyField();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Price Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Price Field</em>'.
	 * @generated
	 */
	PriceField createPriceField();

	/**
	 * Returns a new object of class '<em>Amount Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Amount Field</em>'.
	 * @generated
	 */
	AmountField createAmountField();

	/**
	 * Returns a new object of class '<em>Count Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Field</em>'.
	 * @generated
	 */
	CountField createCountField();

	/**
	 * Returns a new object of class '<em>Entity Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Reference Field</em>'.
	 * @generated
	 */
	EntityReferenceField createEntityReferenceField();

	/**
	 * Returns a new object of class '<em>Geo Location Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Location Field</em>'.
	 * @generated
	 */
	GeoLocationField createGeoLocationField();

	/**
	 * Returns a new object of class '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Type</em>'.
	 * @generated
	 */
	TableType createTableType();

	/**
	 * Returns a new object of class '<em>Jpa Gen Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jpa Gen Options</em>'.
	 * @generated
	 */
	JpaGenOptions createJpaGenOptions();

	/**
	 * Returns a new object of class '<em>Generation Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generation Inclusion</em>'.
	 * @generated
	 */
	GenerationInclusion createGenerationInclusion();

	/**
	 * Returns a new object of class '<em>Association Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Ref</em>'.
	 * @generated
	 */
	AssociationRef createAssociationRef();

	/**
	 * Returns a new object of class '<em>Unique Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Constraint</em>'.
	 * @generated
	 */
	UniqueConstraint createUniqueConstraint();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>Index Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Index Constraint</em>'.
	 * @generated
	 */
	IndexConstraint createIndexConstraint();

	/**
	 * Returns a new object of class '<em>Constraint Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Type Field</em>'.
	 * @generated
	 */
	ConstraintTypeField createConstraintTypeField();

	/**
	 * Returns a new object of class '<em>Mongo Node Gen Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mongo Node Gen Options</em>'.
	 * @generated
	 */
	MongoNodeGenOptions createMongoNodeGenOptions();

	/**
	 * Returns a new object of class '<em>Complex Type Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Type Field</em>'.
	 * @generated
	 */
	ComplexTypeField createComplexTypeField();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Model Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Import</em>'.
	 * @generated
	 */
	DomainModelImport createDomainModelImport();

	/**
	 * Returns a new object of class '<em>Mongo Node Table Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mongo Node Table Options</em>'.
	 * @generated
	 */
	MongoNodeTableOptions createMongoNodeTableOptions();

	/**
	 * Returns a new object of class '<em>Jpa Table Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jpa Table Options</em>'.
	 * @generated
	 */
	JpaTableOptions createJpaTableOptions();

	/**
	 * Returns a new object of class '<em>Id Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Field</em>'.
	 * @generated
	 */
	IdField createIdField();

	/**
	 * Returns a new object of class '<em>Short Id Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short Id Field</em>'.
	 * @generated
	 */
	ShortIdField createShortIdField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} //DomainFactory
