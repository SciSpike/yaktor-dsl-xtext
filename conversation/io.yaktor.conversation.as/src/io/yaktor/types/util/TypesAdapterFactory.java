/**
 */
package io.yaktor.types.util;

import io.yaktor.types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.yaktor.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseProjectionField(ProjectionField object) {
				return createProjectionFieldAdapter();
			}
			@Override
			public Adapter caseMappedField(MappedField object) {
				return createMappedFieldAdapter();
			}
			@Override
			public Adapter caseNewField(NewField object) {
				return createNewFieldAdapter();
			}
			@Override
			public Adapter caseProjection(Projection object) {
				return createProjectionAdapter();
			}
			@Override
			public Adapter caseProjectionContainmentField(ProjectionContainmentField object) {
				return createProjectionContainmentFieldAdapter();
			}
			@Override
			public Adapter caseTypeContainmentField(TypeContainmentField object) {
				return createTypeContainmentFieldAdapter();
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
	 * Creates a new adapter for an object of class '{@link io.yaktor.types.ProjectionField <em>Projection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.types.ProjectionField
	 * @generated
	 */
	public Adapter createProjectionFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.types.MappedField <em>Mapped Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.types.MappedField
	 * @generated
	 */
	public Adapter createMappedFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.types.NewField <em>New Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.types.NewField
	 * @generated
	 */
	public Adapter createNewFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.types.Projection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.types.Projection
	 * @generated
	 */
	public Adapter createProjectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.types.ProjectionContainmentField <em>Projection Containment Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.types.ProjectionContainmentField
	 * @generated
	 */
	public Adapter createProjectionContainmentFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.yaktor.types.TypeContainmentField <em>Type Containment Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.yaktor.types.TypeContainmentField
	 * @generated
	 */
	public Adapter createTypeContainmentFieldAdapter() {
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

} //TypesAdapterFactory
