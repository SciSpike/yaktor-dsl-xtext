/**
 */
package io.yaktor.access;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rest Document Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.yaktor.access.AccessPackage#getRestDocumentType()
 * @model
 * @generated
 */
public enum RestDocumentType implements Enumerator {
	/**
	 * The '<em><b>Xhtml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XHTML_VALUE
	 * @generated
	 * @ordered
	 */
	XHTML(0, "xhtml", "text/html,application/xhtml+xml"),

	/**
	 * The '<em><b>Json</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(1, "json", "application/json"),

	/**
	 * The '<em><b>Xml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_VALUE
	 * @generated
	 * @ordered
	 */
	XML(2, "xml", "application/xml"),

	/**
	 * The '<em><b>Yaml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YAML_VALUE
	 * @generated
	 * @ordered
	 */
	YAML(3, "yaml", "application/x-yaml,text/yaml"), /**
	 * The '<em><b>Form</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORM_VALUE
	 * @generated
	 * @ordered
	 */
	FORM(4, "form", "application/x-www-form-urlencoded"), /**
	 * The '<em><b>Upload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOAD_VALUE
	 * @generated
	 * @ordered
	 */
	UPLOAD(5, "upload", "multipart/form-data");

	/**
	 * The '<em><b>Xhtml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xhtml</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XHTML
	 * @model name="xhtml" literal="text/html,application/xhtml+xml"
	 * @generated
	 * @ordered
	 */
	public static final int XHTML_VALUE = 0;

	/**
	 * The '<em><b>Json</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Json</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model name="json" literal="application/json"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 1;

	/**
	 * The '<em><b>Xml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xml</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML
	 * @model name="xml" literal="application/xml"
	 * @generated
	 * @ordered
	 */
	public static final int XML_VALUE = 2;

	/**
	 * The '<em><b>Yaml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Yaml</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YAML
	 * @model name="yaml" literal="application/x-yaml,text/yaml"
	 * @generated
	 * @ordered
	 */
	public static final int YAML_VALUE = 3;

	/**
	 * The '<em><b>Form</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Form</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORM
	 * @model name="form" literal="application/x-www-form-urlencoded"
	 * @generated
	 * @ordered
	 */
	public static final int FORM_VALUE = 4;

	/**
	 * The '<em><b>Upload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upload</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPLOAD
	 * @model name="upload" literal="multipart/form-data"
	 * @generated
	 * @ordered
	 */
	public static final int UPLOAD_VALUE = 5;

	/**
	 * An array of all the '<em><b>Rest Document Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RestDocumentType[] VALUES_ARRAY =
		new RestDocumentType[] {
			XHTML,
			JSON,
			XML,
			YAML,
			FORM,
			UPLOAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Rest Document Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RestDocumentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Rest Document Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestDocumentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestDocumentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rest Document Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestDocumentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RestDocumentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Rest Document Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestDocumentType get(int value) {
		switch (value) {
			case XHTML_VALUE: return XHTML;
			case JSON_VALUE: return JSON;
			case XML_VALUE: return XML;
			case YAML_VALUE: return YAML;
			case FORM_VALUE: return FORM;
			case UPLOAD_VALUE: return UPLOAD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RestDocumentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RestDocumentType
