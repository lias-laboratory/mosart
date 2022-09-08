/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage
 * @generated
 */
public class RtpUtilityTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpUtilityTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilityTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RtpUtilityTypesPackage.eINSTANCE;
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
	protected RtpUtilityTypesSwitch<Adapter> modelSwitch =
		new RtpUtilityTypesSwitch<Adapter>() {
			@Override
			public Adapter caseIntegerMatrix(IntegerMatrix object) {
				return createIntegerMatrixAdapter();
			}
			@Override
			public Adapter caseIntegerVector(IntegerVector object) {
				return createIntegerVectorAdapter();
			}
			@Override
			public Adapter caseRealVector(RealVector object) {
				return createRealVectorAdapter();
			}
			@Override
			public Adapter caseRealMatrix(RealMatrix object) {
				return createRealMatrixAdapter();
			}
			@Override
			public Adapter caseIntegerSet(IntegerSet object) {
				return createIntegerSetAdapter();
			}
			@Override
			public Adapter caseIntegerList(IntegerList object) {
				return createIntegerListAdapter();
			}
			@Override
			public Adapter caseRealSet(RealSet object) {
				return createRealSetAdapter();
			}
			@Override
			public Adapter caseRealList(RealList object) {
				return createRealListAdapter();
			}
			@Override
			public Adapter caseIntegerInterval(IntegerInterval object) {
				return createIntegerIntervalAdapter();
			}
			@Override
			public Adapter caseRealInterval(RealInterval object) {
				return createRealIntervalAdapter();
			}
			@Override
			public Adapter caseRealVariable(RealVariable object) {
				return createRealVariableAdapter();
			}
			@Override
			public Adapter caseMeasuredReal(MeasuredReal object) {
				return createMeasuredRealAdapter();
			}
			@Override
			public Adapter caseUnknownReal(UnknownReal object) {
				return createUnknownRealAdapter();
			}
			@Override
			public Adapter caseSimpleReal(SimpleReal object) {
				return createSimpleRealAdapter();
			}
			@Override
			public Adapter caseMaxMinAvgReal(MaxMinAvgReal object) {
				return createMaxMinAvgRealAdapter();
			}
			@Override
			public Adapter caseIntegerVariable(IntegerVariable object) {
				return createIntegerVariableAdapter();
			}
			@Override
			public Adapter caseMeasuredInteger(MeasuredInteger object) {
				return createMeasuredIntegerAdapter();
			}
			@Override
			public Adapter caseUnknownInteger(UnknownInteger object) {
				return createUnknownIntegerAdapter();
			}
			@Override
			public Adapter caseSimpleInteger(SimpleInteger object) {
				return createSimpleIntegerAdapter();
			}
			@Override
			public Adapter caseMaxMinAvgInteger(MaxMinAvgInteger object) {
				return createMaxMinAvgIntegerAdapter();
			}
			@Override
			public Adapter caseRealTimeCommonType(RealTimeCommonType object) {
				return createRealTimeCommonTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix <em>Integer Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix
	 * @generated
	 */
	public Adapter createIntegerMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector <em>Integer Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector
	 * @generated
	 */
	public Adapter createIntegerVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector <em>Real Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector
	 * @generated
	 */
	public Adapter createRealVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix <em>Real Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix
	 * @generated
	 */
	public Adapter createRealMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet <em>Integer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet
	 * @generated
	 */
	public Adapter createIntegerSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList <em>Integer List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList
	 * @generated
	 */
	public Adapter createIntegerListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet <em>Real Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet
	 * @generated
	 */
	public Adapter createRealSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList <em>Real List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList
	 * @generated
	 */
	public Adapter createRealListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval <em>Integer Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval
	 * @generated
	 */
	public Adapter createIntegerIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval <em>Real Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval
	 * @generated
	 */
	public Adapter createRealIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable <em>Real Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable
	 * @generated
	 */
	public Adapter createRealVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal <em>Measured Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal
	 * @generated
	 */
	public Adapter createMeasuredRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal <em>Unknown Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal
	 * @generated
	 */
	public Adapter createUnknownRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal <em>Simple Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal
	 * @generated
	 */
	public Adapter createSimpleRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal <em>Max Min Avg Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal
	 * @generated
	 */
	public Adapter createMaxMinAvgRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable
	 * @generated
	 */
	public Adapter createIntegerVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger <em>Measured Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger
	 * @generated
	 */
	public Adapter createMeasuredIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger <em>Unknown Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger
	 * @generated
	 */
	public Adapter createUnknownIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger <em>Simple Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger
	 * @generated
	 */
	public Adapter createSimpleIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger <em>Max Min Avg Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger
	 * @generated
	 */
	public Adapter createMaxMinAvgIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RealTimeCommonType <em>Real Time Common Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RealTimeCommonType
	 * @generated
	 */
	public Adapter createRealTimeCommonTypeAdapter() {
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

} //RtpUtilityTypesAdapterFactory
