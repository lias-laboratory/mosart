/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpTypes.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage
 * @generated
 */
public class RtpTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RtpTypesPackage.eINSTANCE;
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
	protected RtpTypesSwitch<Adapter> modelSwitch =
		new RtpTypesSwitch<Adapter>() {
			@Override
			public Adapter caseRtpPriorityType(RtpPriorityType object) {
				return createRtpPriorityTypeAdapter();
			}
			@Override
			public Adapter caseRtpPeriodicityType(RtpPeriodicityType object) {
				return createRtpPeriodicityTypeAdapter();
			}
			@Override
			public Adapter caseRtpPeriodicType(RtpPeriodicType object) {
				return createRtpPeriodicTypeAdapter();
			}
			@Override
			public Adapter caseRtpAperiodicType(RtpAperiodicType object) {
				return createRtpAperiodicTypeAdapter();
			}
			@Override
			public Adapter caseRtpSporadicType(RtpSporadicType object) {
				return createRtpSporadicTypeAdapter();
			}
			@Override
			public Adapter caseRtpReleaseTimeType(RtpReleaseTimeType object) {
				return createRtpReleaseTimeTypeAdapter();
			}
			@Override
			public Adapter caseRtpOffsetType(RtpOffsetType object) {
				return createRtpOffsetTypeAdapter();
			}
			@Override
			public Adapter caseRtpMutuExcluResourceUtilizationType(RtpMutuExcluResourceUtilizationType object) {
				return createRtpMutuExcluResourceUtilizationTypeAdapter();
			}
			@Override
			public Adapter caseRtpDeadlineType(RtpDeadlineType object) {
				return createRtpDeadlineTypeAdapter();
			}
			@Override
			public Adapter caseRtpResponseTimeType(RtpResponseTimeType object) {
				return createRtpResponseTimeTypeAdapter();
			}
			@Override
			public Adapter caseRtpBlockingTimeType(RtpBlockingTimeType object) {
				return createRtpBlockingTimeTypeAdapter();
			}
			@Override
			public Adapter caseRtpRepetitionType(RtpRepetitionType object) {
				return createRtpRepetitionTypeAdapter();
			}
			@Override
			public Adapter caseRtpFlowRateType(RtpFlowRateType object) {
				return createRtpFlowRateTypeAdapter();
			}
			@Override
			public Adapter caseRtpUtilizationFactorType(RtpUtilizationFactorType object) {
				return createRtpUtilizationFactorTypeAdapter();
			}
			@Override
			public Adapter caseRtpExecutionTimeType(RtpExecutionTimeType object) {
				return createRtpExecutionTimeTypeAdapter();
			}
			@Override
			public Adapter caseRtpCriticalityType(RtpCriticalityType object) {
				return createRtpCriticalityTypeAdapter();
			}
			@Override
			public Adapter caseRtpComputingSpeedType(RtpComputingSpeedType object) {
				return createRtpComputingSpeedTypeAdapter();
			}
			@Override
			public Adapter caseRtpPreemptibilityType(RtpPreemptibilityType object) {
				return createRtpPreemptibilityTypeAdapter();
			}
			@Override
			public Adapter caseRtpPreemptibleType(RtpPreemptibleType object) {
				return createRtpPreemptibleTypeAdapter();
			}
			@Override
			public Adapter caseRtpNonPreemptibleType(RtpNonPreemptibleType object) {
				return createRtpNonPreemptibleTypeAdapter();
			}
			@Override
			public Adapter caseRtpCooperativeType(RtpCooperativeType object) {
				return createRtpCooperativeTypeAdapter();
			}
			@Override
			public Adapter caseRtpSelfSuspensionType(RtpSelfSuspensionType object) {
				return createRtpSelfSuspensionTypeAdapter();
			}
			@Override
			public Adapter caseRtpSelfSuspendedType(RtpSelfSuspendedType object) {
				return createRtpSelfSuspendedTypeAdapter();
			}
			@Override
			public Adapter caseRtpNotSelfSuspendedType(RtpNotSelfSuspendedType object) {
				return createRtpNotSelfSuspendedTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType <em>Rtp Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType
	 * @generated
	 */
	public Adapter createRtpPriorityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType <em>Rtp Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType
	 * @generated
	 */
	public Adapter createRtpPeriodicityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType <em>Rtp Periodic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType
	 * @generated
	 */
	public Adapter createRtpPeriodicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType <em>Rtp Aperiodic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType
	 * @generated
	 */
	public Adapter createRtpAperiodicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType <em>Rtp Sporadic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType
	 * @generated
	 */
	public Adapter createRtpSporadicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType <em>Rtp Release Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType
	 * @generated
	 */
	public Adapter createRtpReleaseTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType <em>Rtp Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType
	 * @generated
	 */
	public Adapter createRtpOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType <em>Rtp Mutu Exclu Resource Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType
	 * @generated
	 */
	public Adapter createRtpMutuExcluResourceUtilizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType <em>Rtp Deadline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType
	 * @generated
	 */
	public Adapter createRtpDeadlineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType <em>Rtp Response Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType
	 * @generated
	 */
	public Adapter createRtpResponseTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType <em>Rtp Blocking Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType
	 * @generated
	 */
	public Adapter createRtpBlockingTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType <em>Rtp Repetition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType
	 * @generated
	 */
	public Adapter createRtpRepetitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType <em>Rtp Flow Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType
	 * @generated
	 */
	public Adapter createRtpFlowRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType <em>Rtp Utilization Factor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType
	 * @generated
	 */
	public Adapter createRtpUtilizationFactorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType <em>Rtp Execution Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType
	 * @generated
	 */
	public Adapter createRtpExecutionTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType <em>Rtp Criticality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType
	 * @generated
	 */
	public Adapter createRtpCriticalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType <em>Rtp Computing Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType
	 * @generated
	 */
	public Adapter createRtpComputingSpeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType <em>Rtp Preemptibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType
	 * @generated
	 */
	public Adapter createRtpPreemptibilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType <em>Rtp Preemptible Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType
	 * @generated
	 */
	public Adapter createRtpPreemptibleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType <em>Rtp Non Preemptible Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType
	 * @generated
	 */
	public Adapter createRtpNonPreemptibleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType <em>Rtp Cooperative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType
	 * @generated
	 */
	public Adapter createRtpCooperativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType <em>Rtp Self Suspension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType
	 * @generated
	 */
	public Adapter createRtpSelfSuspensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType <em>Rtp Self Suspended Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType
	 * @generated
	 */
	public Adapter createRtpSelfSuspendedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType <em>Rtp Not Self Suspended Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType
	 * @generated
	 */
	public Adapter createRtpNotSelfSuspendedTypeAdapter() {
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

} //RtpTypesAdapterFactory
