/**
 */
package io.yaktor.types.util;

import io.yaktor.types.*;

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
 * @see io.yaktor.types.TypesPackage
 * @generated
 */
public class TypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.PROJECTION_FIELD: {
				ProjectionField projectionField = (ProjectionField)theEObject;
				T result = caseProjectionField(projectionField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.MAPPED_FIELD: {
				MappedField mappedField = (MappedField)theEObject;
				T result = caseMappedField(mappedField);
				if (result == null) result = caseProjectionField(mappedField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.NEW_FIELD: {
				NewField newField = (NewField)theEObject;
				T result = caseNewField(newField);
				if (result == null) result = caseProjectionField(newField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PROJECTION: {
				Projection projection = (Projection)theEObject;
				T result = caseProjection(projection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PROJECTION_CONTAINMENT_FIELD: {
				ProjectionContainmentField projectionContainmentField = (ProjectionContainmentField)theEObject;
				T result = caseProjectionContainmentField(projectionContainmentField);
				if (result == null) result = caseProjectionField(projectionContainmentField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TYPE_CONTAINMENT_FIELD: {
				TypeContainmentField typeContainmentField = (TypeContainmentField)theEObject;
				T result = caseTypeContainmentField(typeContainmentField);
				if (result == null) result = caseNewField(typeContainmentField);
				if (result == null) result = caseMappedField(typeContainmentField);
				if (result == null) result = caseProjectionField(typeContainmentField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectionField(ProjectionField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapped Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapped Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappedField(MappedField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewField(NewField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjection(Projection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projection Containment Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projection Containment Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectionContainmentField(ProjectionContainmentField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Containment Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Containment Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContainmentField(TypeContainmentField object) {
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

} //TypesSwitch
