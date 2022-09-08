/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpTypes.*;

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
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage
 * @generated
 */
public class RtpTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = RtpTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case RtpTypesPackage.RTP_PRIORITY_TYPE: {
				RtpPriorityType rtpPriorityType = (RtpPriorityType)theEObject;
				T result = caseRtpPriorityType(rtpPriorityType);
				if (result == null) result = caseRealTimeCommonType(rtpPriorityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_PERIODICITY_TYPE: {
				RtpPeriodicityType rtpPeriodicityType = (RtpPeriodicityType)theEObject;
				T result = caseRtpPeriodicityType(rtpPeriodicityType);
				if (result == null) result = caseRealTimeCommonType(rtpPeriodicityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_PERIODIC_TYPE: {
				RtpPeriodicType rtpPeriodicType = (RtpPeriodicType)theEObject;
				T result = caseRtpPeriodicType(rtpPeriodicType);
				if (result == null) result = caseRtpPeriodicityType(rtpPeriodicType);
				if (result == null) result = caseRealTimeCommonType(rtpPeriodicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_APERIODIC_TYPE: {
				RtpAperiodicType rtpAperiodicType = (RtpAperiodicType)theEObject;
				T result = caseRtpAperiodicType(rtpAperiodicType);
				if (result == null) result = caseRtpPeriodicityType(rtpAperiodicType);
				if (result == null) result = caseRealTimeCommonType(rtpAperiodicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_SPORADIC_TYPE: {
				RtpSporadicType rtpSporadicType = (RtpSporadicType)theEObject;
				T result = caseRtpSporadicType(rtpSporadicType);
				if (result == null) result = caseRtpPeriodicityType(rtpSporadicType);
				if (result == null) result = caseRealTimeCommonType(rtpSporadicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE: {
				RtpReleaseTimeType rtpReleaseTimeType = (RtpReleaseTimeType)theEObject;
				T result = caseRtpReleaseTimeType(rtpReleaseTimeType);
				if (result == null) result = caseRealTimeCommonType(rtpReleaseTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_OFFSET_TYPE: {
				RtpOffsetType rtpOffsetType = (RtpOffsetType)theEObject;
				T result = caseRtpOffsetType(rtpOffsetType);
				if (result == null) result = caseRealTimeCommonType(rtpOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE: {
				RtpMutuExcluResourceUtilizationType rtpMutuExcluResourceUtilizationType = (RtpMutuExcluResourceUtilizationType)theEObject;
				T result = caseRtpMutuExcluResourceUtilizationType(rtpMutuExcluResourceUtilizationType);
				if (result == null) result = caseRealTimeCommonType(rtpMutuExcluResourceUtilizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_DEADLINE_TYPE: {
				RtpDeadlineType rtpDeadlineType = (RtpDeadlineType)theEObject;
				T result = caseRtpDeadlineType(rtpDeadlineType);
				if (result == null) result = caseRealTimeCommonType(rtpDeadlineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE: {
				RtpResponseTimeType rtpResponseTimeType = (RtpResponseTimeType)theEObject;
				T result = caseRtpResponseTimeType(rtpResponseTimeType);
				if (result == null) result = caseRealTimeCommonType(rtpResponseTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE: {
				RtpBlockingTimeType rtpBlockingTimeType = (RtpBlockingTimeType)theEObject;
				T result = caseRtpBlockingTimeType(rtpBlockingTimeType);
				if (result == null) result = caseRealTimeCommonType(rtpBlockingTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_REPETITION_TYPE: {
				RtpRepetitionType rtpRepetitionType = (RtpRepetitionType)theEObject;
				T result = caseRtpRepetitionType(rtpRepetitionType);
				if (result == null) result = caseRealTimeCommonType(rtpRepetitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE: {
				RtpFlowRateType rtpFlowRateType = (RtpFlowRateType)theEObject;
				T result = caseRtpFlowRateType(rtpFlowRateType);
				if (result == null) result = caseRealTimeCommonType(rtpFlowRateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE: {
				RtpUtilizationFactorType rtpUtilizationFactorType = (RtpUtilizationFactorType)theEObject;
				T result = caseRtpUtilizationFactorType(rtpUtilizationFactorType);
				if (result == null) result = caseRealTimeCommonType(rtpUtilizationFactorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE: {
				RtpExecutionTimeType rtpExecutionTimeType = (RtpExecutionTimeType)theEObject;
				T result = caseRtpExecutionTimeType(rtpExecutionTimeType);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_CRITICALITY_TYPE: {
				RtpCriticalityType rtpCriticalityType = (RtpCriticalityType)theEObject;
				T result = caseRtpCriticalityType(rtpCriticalityType);
				if (result == null) result = caseRealTimeCommonType(rtpCriticalityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE: {
				RtpComputingSpeedType rtpComputingSpeedType = (RtpComputingSpeedType)theEObject;
				T result = caseRtpComputingSpeedType(rtpComputingSpeedType);
				if (result == null) result = caseRealTimeCommonType(rtpComputingSpeedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_PREEMPTIBILITY_TYPE: {
				RtpPreemptibilityType rtpPreemptibilityType = (RtpPreemptibilityType)theEObject;
				T result = caseRtpPreemptibilityType(rtpPreemptibilityType);
				if (result == null) result = caseRealTimeCommonType(rtpPreemptibilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_PREEMPTIBLE_TYPE: {
				RtpPreemptibleType rtpPreemptibleType = (RtpPreemptibleType)theEObject;
				T result = caseRtpPreemptibleType(rtpPreemptibleType);
				if (result == null) result = caseRtpPreemptibilityType(rtpPreemptibleType);
				if (result == null) result = caseRealTimeCommonType(rtpPreemptibleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_NON_PREEMPTIBLE_TYPE: {
				RtpNonPreemptibleType rtpNonPreemptibleType = (RtpNonPreemptibleType)theEObject;
				T result = caseRtpNonPreemptibleType(rtpNonPreemptibleType);
				if (result == null) result = caseRtpPreemptibilityType(rtpNonPreemptibleType);
				if (result == null) result = caseRealTimeCommonType(rtpNonPreemptibleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE: {
				RtpCooperativeType rtpCooperativeType = (RtpCooperativeType)theEObject;
				T result = caseRtpCooperativeType(rtpCooperativeType);
				if (result == null) result = caseRtpPreemptibilityType(rtpCooperativeType);
				if (result == null) result = caseRealTimeCommonType(rtpCooperativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_SELF_SUSPENSION_TYPE: {
				RtpSelfSuspensionType rtpSelfSuspensionType = (RtpSelfSuspensionType)theEObject;
				T result = caseRtpSelfSuspensionType(rtpSelfSuspensionType);
				if (result == null) result = caseRealTimeCommonType(rtpSelfSuspensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE: {
				RtpSelfSuspendedType rtpSelfSuspendedType = (RtpSelfSuspendedType)theEObject;
				T result = caseRtpSelfSuspendedType(rtpSelfSuspendedType);
				if (result == null) result = caseRtpSelfSuspensionType(rtpSelfSuspendedType);
				if (result == null) result = caseRealTimeCommonType(rtpSelfSuspendedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpTypesPackage.RTP_NOT_SELF_SUSPENDED_TYPE: {
				RtpNotSelfSuspendedType rtpNotSelfSuspendedType = (RtpNotSelfSuspendedType)theEObject;
				T result = caseRtpNotSelfSuspendedType(rtpNotSelfSuspendedType);
				if (result == null) result = caseRtpSelfSuspensionType(rtpNotSelfSuspendedType);
				if (result == null) result = caseRealTimeCommonType(rtpNotSelfSuspendedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Priority Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Priority Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpPriorityType(RtpPriorityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Periodicity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Periodicity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpPeriodicityType(RtpPeriodicityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Periodic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Periodic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpPeriodicType(RtpPeriodicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Aperiodic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Aperiodic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpAperiodicType(RtpAperiodicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Sporadic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Sporadic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpSporadicType(RtpSporadicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Release Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Release Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpReleaseTimeType(RtpReleaseTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpOffsetType(RtpOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Mutu Exclu Resource Utilization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Mutu Exclu Resource Utilization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpMutuExcluResourceUtilizationType(RtpMutuExcluResourceUtilizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Deadline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Deadline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpDeadlineType(RtpDeadlineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Response Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Response Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpResponseTimeType(RtpResponseTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Blocking Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Blocking Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpBlockingTimeType(RtpBlockingTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Repetition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Repetition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpRepetitionType(RtpRepetitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Flow Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Flow Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpFlowRateType(RtpFlowRateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Utilization Factor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Utilization Factor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpUtilizationFactorType(RtpUtilizationFactorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeType(RtpExecutionTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Criticality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Criticality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpCriticalityType(RtpCriticalityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Computing Speed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Computing Speed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpComputingSpeedType(RtpComputingSpeedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Preemptibility Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Preemptibility Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpPreemptibilityType(RtpPreemptibilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Preemptible Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Preemptible Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpPreemptibleType(RtpPreemptibleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Non Preemptible Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Non Preemptible Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpNonPreemptibleType(RtpNonPreemptibleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Cooperative Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Cooperative Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpCooperativeType(RtpCooperativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Self Suspension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Self Suspension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpSelfSuspensionType(RtpSelfSuspensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Self Suspended Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Self Suspended Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpSelfSuspendedType(RtpSelfSuspendedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Not Self Suspended Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Not Self Suspended Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpNotSelfSuspendedType(RtpNotSelfSuspendedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time Common Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time Common Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTimeCommonType(RealTimeCommonType object) {
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

} //RtpTypesSwitch
