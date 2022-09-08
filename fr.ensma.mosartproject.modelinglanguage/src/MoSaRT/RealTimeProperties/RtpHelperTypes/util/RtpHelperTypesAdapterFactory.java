/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage
 * @generated
 */
public class RtpHelperTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpHelperTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpHelperTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RtpHelperTypesPackage.eINSTANCE;
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
	protected RtpHelperTypesSwitch<Adapter> modelSwitch =
		new RtpHelperTypesSwitch<Adapter>() {
			@Override
			public Adapter caseRtpDurationType(RtpDurationType object) {
				return createRtpDurationTypeAdapter();
			}
			@Override
			public Adapter caseRtpInterArrivalType(RtpInterArrivalType object) {
				return createRtpInterArrivalTypeAdapter();
			}
			@Override
			public Adapter caseRtpDataRateType(RtpDataRateType object) {
				return createRtpDataRateTypeAdapter();
			}
			@Override
			public Adapter caseRtpPowerType(RtpPowerType object) {
				return createRtpPowerTypeAdapter();
			}
			@Override
			public Adapter caseRtpDataSizeType(RtpDataSizeType object) {
				return createRtpDataSizeTypeAdapter();
			}
			@Override
			public Adapter caseRtpFrequencyType(RtpFrequencyType object) {
				return createRtpFrequencyTypeAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeValue(RtpExecutionTimeValue object) {
				return createRtpExecutionTimeValueAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeList(RtpExecutionTimeList object) {
				return createRtpExecutionTimeListAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeSimple(RtpExecutionTimeSimple object) {
				return createRtpExecutionTimeSimpleAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeMma(RtpExecutionTimeMma object) {
				return createRtpExecutionTimeMmaAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeInterval(RtpExecutionTimeInterval object) {
				return createRtpExecutionTimeIntervalAdapter();
			}
			@Override
			public Adapter caseRtpTimeLinkType(RtpTimeLinkType object) {
				return createRtpTimeLinkTypeAdapter();
			}
			@Override
			public Adapter caseRtpReferenceType(RtpReferenceType object) {
				return createRtpReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRtpTimeReferenceType(RtpTimeReferenceType object) {
				return createRtpTimeReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRtpClockRefrenceType(RtpClockRefrenceType object) {
				return createRtpClockRefrenceTypeAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeValueToBeCalculated(RtpExecutionTimeValueToBeCalculated object) {
				return createRtpExecutionTimeValueToBeCalculatedAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeCalculatedValue(RtpExecutionTimeCalculatedValue object) {
				return createRtpExecutionTimeCalculatedValueAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeConcreteValue(RtpExecutionTimeConcreteValue object) {
				return createRtpExecutionTimeConcreteValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType <em>Rtp Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType
	 * @generated
	 */
	public Adapter createRtpDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType <em>Rtp Inter Arrival Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType
	 * @generated
	 */
	public Adapter createRtpInterArrivalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType <em>Rtp Data Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType
	 * @generated
	 */
	public Adapter createRtpDataRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType <em>Rtp Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType
	 * @generated
	 */
	public Adapter createRtpPowerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType <em>Rtp Data Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType
	 * @generated
	 */
	public Adapter createRtpDataSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType <em>Rtp Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType
	 * @generated
	 */
	public Adapter createRtpFrequencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue <em>Rtp Execution Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue
	 * @generated
	 */
	public Adapter createRtpExecutionTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList <em>Rtp Execution Time List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList
	 * @generated
	 */
	public Adapter createRtpExecutionTimeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple <em>Rtp Execution Time Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple
	 * @generated
	 */
	public Adapter createRtpExecutionTimeSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma <em>Rtp Execution Time Mma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma
	 * @generated
	 */
	public Adapter createRtpExecutionTimeMmaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval <em>Rtp Execution Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval
	 * @generated
	 */
	public Adapter createRtpExecutionTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType <em>Rtp Time Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType
	 * @generated
	 */
	public Adapter createRtpTimeLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType <em>Rtp Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType
	 * @generated
	 */
	public Adapter createRtpReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType <em>Rtp Time Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType
	 * @generated
	 */
	public Adapter createRtpTimeReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpClockRefrenceType <em>Rtp Clock Refrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpClockRefrenceType
	 * @generated
	 */
	public Adapter createRtpClockRefrenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated <em>Rtp Execution Time Value To Be Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated
	 * @generated
	 */
	public Adapter createRtpExecutionTimeValueToBeCalculatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue <em>Rtp Execution Time Calculated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue
	 * @generated
	 */
	public Adapter createRtpExecutionTimeCalculatedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue <em>Rtp Execution Time Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue
	 * @generated
	 */
	public Adapter createRtpExecutionTimeConcreteValueAdapter() {
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

} //RtpHelperTypesAdapterFactory
