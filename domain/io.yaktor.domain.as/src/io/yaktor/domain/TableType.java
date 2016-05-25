/**
 */
package io.yaktor.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link io.yaktor.domain.TableType#getFields <em>Fields</em>}</li>
 *   <li>{@link io.yaktor.domain.TableType#getSupertype <em>Supertype</em>}</li>
 *   <li>{@link io.yaktor.domain.TableType#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link io.yaktor.domain.TableType#getUniqueConstraints <em>Unique Constraints</em>}</li>
 *   <li>{@link io.yaktor.domain.TableType#isMetaData <em>Meta Data</em>}</li>
 *   <li>{@link io.yaktor.domain.TableType#getIndexConstraints <em>Index Constraints</em>}</li>
 *   <li>{@link io.yaktor.domain.TableType#getKeys <em>Keys</em>}</li>
 * </ul>
 * </p>
 *
 * @see io.yaktor.domain.DomainPackage#getTableType()
 * @model
 * @generated
 */
public interface TableType extends NamedType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getTableType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Supertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype</em>' reference.
	 * @see #setSupertype(TableType)
	 * @see io.yaktor.domain.DomainPackage#getTableType_Supertype()
	 * @model
	 * @generated
	 */
	TableType getSupertype();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.TableType#getSupertype <em>Supertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype</em>' reference.
	 * @see #getSupertype()
	 * @generated
	 */
	void setSupertype(TableType value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see io.yaktor.domain.DomainPackage#getTableType_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.TableType#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Constraints</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getTableType_UniqueConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniqueConstraint> getUniqueConstraints();

	/**
	 * Returns the value of the '<em><b>Meta Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Data</em>' attribute.
	 * @see #setMetaData(boolean)
	 * @see io.yaktor.domain.DomainPackage#getTableType_MetaData()
	 * @model
	 * @generated
	 */
	boolean isMetaData();

	/**
	 * Sets the value of the '{@link io.yaktor.domain.TableType#isMetaData <em>Meta Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Data</em>' attribute.
	 * @see #isMetaData()
	 * @generated
	 */
	void setMetaData(boolean value);

	/**
	 * Returns the value of the '<em><b>Index Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link io.yaktor.domain.IndexConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Constraints</em>' containment reference list.
	 * @see io.yaktor.domain.DomainPackage#getTableType_IndexConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<IndexConstraint> getIndexConstraints();

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link io.yaktor.domain.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see io.yaktor.domain.DomainPackage#getTableType_Keys()
	 * @model
	 * @generated
	 */
	EList<Field> getKeys();

} // TableType
