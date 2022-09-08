/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpTypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpTypesFactoryImpl extends EFactoryImpl implements RtpTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtpTypesFactory init() {
		try {
			RtpTypesFactory theRtpTypesFactory = (RtpTypesFactory)EPackage.Registry.INSTANCE.getEFactory(RtpTypesPackage.eNS_URI);
			if (theRtpTypesFactory != null) {
				return theRtpTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtpTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RtpTypesPackage.RTP_PRIORITY_TYPE: return createRtpPriorityType();
			case RtpTypesPackage.RTP_PERIODIC_TYPE: return createRtpPeriodicType();
			case RtpTypesPackage.RTP_APERIODIC_TYPE: return createRtpAperiodicType();
			case RtpTypesPackage.RTP_SPORADIC_TYPE: return createRtpSporadicType();
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE: return createRtpReleaseTimeType();
			case RtpTypesPackage.RTP_OFFSET_TYPE: return createRtpOffsetType();
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE: return createRtpMutuExcluResourceUtilizationType();
			case RtpTypesPackage.RTP_DEADLINE_TYPE: return createRtpDeadlineType();
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE: return createRtpResponseTimeType();
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE: return createRtpBlockingTimeType();
			case RtpTypesPackage.RTP_REPETITION_TYPE: return createRtpRepetitionType();
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE: return createRtpFlowRateType();
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE: return createRtpUtilizationFactorType();
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE: return createRtpExecutionTimeType();
			case RtpTypesPackage.RTP_CRITICALITY_TYPE: return createRtpCriticalityType();
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE: return createRtpComputingSpeedType();
			case RtpTypesPackage.RTP_PREEMPTIBLE_TYPE: return createRtpPreemptibleType();
			case RtpTypesPackage.RTP_NON_PREEMPTIBLE_TYPE: return createRtpNonPreemptibleType();
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE: return createRtpCooperativeType();
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE: return createRtpSelfSuspendedType();
			case RtpTypesPackage.RTP_NOT_SELF_SUSPENDED_TYPE: return createRtpNotSelfSuspendedType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPriorityType createRtpPriorityType() {
		RtpPriorityTypeImpl rtpPriorityType = new RtpPriorityTypeImpl();
		return rtpPriorityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPeriodicType createRtpPeriodicType() {
		RtpPeriodicTypeImpl rtpPeriodicType = new RtpPeriodicTypeImpl();
		return rtpPeriodicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpAperiodicType createRtpAperiodicType() {
		RtpAperiodicTypeImpl rtpAperiodicType = new RtpAperiodicTypeImpl();
		return rtpAperiodicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpSporadicType createRtpSporadicType() {
		RtpSporadicTypeImpl rtpSporadicType = new RtpSporadicTypeImpl();
		return rtpSporadicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpReleaseTimeType createRtpReleaseTimeType() {
		RtpReleaseTimeTypeImpl rtpReleaseTimeType = new RtpReleaseTimeTypeImpl();
		return rtpReleaseTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpOffsetType createRtpOffsetType() {
		RtpOffsetTypeImpl rtpOffsetType = new RtpOffsetTypeImpl();
		return rtpOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpMutuExcluResourceUtilizationType createRtpMutuExcluResourceUtilizationType() {
		RtpMutuExcluResourceUtilizationTypeImpl rtpMutuExcluResourceUtilizationType = new RtpMutuExcluResourceUtilizationTypeImpl();
		return rtpMutuExcluResourceUtilizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDeadlineType createRtpDeadlineType() {
		RtpDeadlineTypeImpl rtpDeadlineType = new RtpDeadlineTypeImpl();
		return rtpDeadlineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpResponseTimeType createRtpResponseTimeType() {
		RtpResponseTimeTypeImpl rtpResponseTimeType = new RtpResponseTimeTypeImpl();
		return rtpResponseTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpBlockingTimeType createRtpBlockingTimeType() {
		RtpBlockingTimeTypeImpl rtpBlockingTimeType = new RtpBlockingTimeTypeImpl();
		return rtpBlockingTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpRepetitionType createRtpRepetitionType() {
		RtpRepetitionTypeImpl rtpRepetitionType = new RtpRepetitionTypeImpl();
		return rtpRepetitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpFlowRateType createRtpFlowRateType() {
		RtpFlowRateTypeImpl rtpFlowRateType = new RtpFlowRateTypeImpl();
		return rtpFlowRateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilizationFactorType createRtpUtilizationFactorType() {
		RtpUtilizationFactorTypeImpl rtpUtilizationFactorType = new RtpUtilizationFactorTypeImpl();
		return rtpUtilizationFactorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeType createRtpExecutionTimeType() {
		RtpExecutionTimeTypeImpl rtpExecutionTimeType = new RtpExecutionTimeTypeImpl();
		return rtpExecutionTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpCriticalityType createRtpCriticalityType() {
		RtpCriticalityTypeImpl rtpCriticalityType = new RtpCriticalityTypeImpl();
		return rtpCriticalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputingSpeedType createRtpComputingSpeedType() {
		RtpComputingSpeedTypeImpl rtpComputingSpeedType = new RtpComputingSpeedTypeImpl();
		return rtpComputingSpeedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPreemptibleType createRtpPreemptibleType() {
		RtpPreemptibleTypeImpl rtpPreemptibleType = new RtpPreemptibleTypeImpl();
		return rtpPreemptibleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpNonPreemptibleType createRtpNonPreemptibleType() {
		RtpNonPreemptibleTypeImpl rtpNonPreemptibleType = new RtpNonPreemptibleTypeImpl();
		return rtpNonPreemptibleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpCooperativeType createRtpCooperativeType() {
		RtpCooperativeTypeImpl rtpCooperativeType = new RtpCooperativeTypeImpl();
		return rtpCooperativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpSelfSuspendedType createRtpSelfSuspendedType() {
		RtpSelfSuspendedTypeImpl rtpSelfSuspendedType = new RtpSelfSuspendedTypeImpl();
		return rtpSelfSuspendedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpNotSelfSuspendedType createRtpNotSelfSuspendedType() {
		RtpNotSelfSuspendedTypeImpl rtpNotSelfSuspendedType = new RtpNotSelfSuspendedTypeImpl();
		return rtpNotSelfSuspendedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTypesPackage getRtpTypesPackage() {
		return (RtpTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtpTypesPackage getPackage() {
		return RtpTypesPackage.eINSTANCE;
	}

} //RtpTypesFactoryImpl
