/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.*;

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
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage
 * @generated
 */
public class RtpProtocolsAndPoliciesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpProtocolsAndPoliciesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtocolsAndPoliciesSwitch() {
		if (modelPackage == null) {
			modelPackage = RtpProtocolsAndPoliciesPackage.eINSTANCE;
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
			case RtpProtocolsAndPoliciesPackage.RTP_PROTECT_PROTOCOL_TYPE: {
				RtpProtectProtocolType rtpProtectProtocolType = (RtpProtectProtocolType)theEObject;
				T result = caseRtpProtectProtocolType(rtpProtectProtocolType);
				if (result == null) result = caseRealTimeCommonType(rtpProtectProtocolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.PIP_PROTECT_PROTOCOL: {
				PIPProtectProtocol pipProtectProtocol = (PIPProtectProtocol)theEObject;
				T result = casePIPProtectProtocol(pipProtectProtocol);
				if (result == null) result = caseRtpProtectProtocolType(pipProtectProtocol);
				if (result == null) result = caseRealTimeCommonType(pipProtectProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.PCP_PROTECT_PROTOCOL: {
				PCPProtectProtocol pcpProtectProtocol = (PCPProtectProtocol)theEObject;
				T result = casePCPProtectProtocol(pcpProtectProtocol);
				if (result == null) result = caseRtpProtectProtocolType(pcpProtectProtocol);
				if (result == null) result = caseRealTimeCommonType(pcpProtectProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE: {
				RtpCommunicationArbitrationPolicyType rtpCommunicationArbitrationPolicyType = (RtpCommunicationArbitrationPolicyType)theEObject;
				T result = caseRtpCommunicationArbitrationPolicyType(rtpCommunicationArbitrationPolicyType);
				if (result == null) result = caseRealTimeCommonType(rtpCommunicationArbitrationPolicyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FIFO_COMMUNICATION_ARBITRATION_POLICY: {
				FIFOCommunicationArbitrationPolicy fifoCommunicationArbitrationPolicy = (FIFOCommunicationArbitrationPolicy)theEObject;
				T result = caseFIFOCommunicationArbitrationPolicy(fifoCommunicationArbitrationPolicy);
				if (result == null) result = caseRtpCommunicationArbitrationPolicyType(fifoCommunicationArbitrationPolicy);
				if (result == null) result = caseRealTimeCommonType(fifoCommunicationArbitrationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY: {
				FixedPriorityCommunicationArbitrationPolicy fixedPriorityCommunicationArbitrationPolicy = (FixedPriorityCommunicationArbitrationPolicy)theEObject;
				T result = caseFixedPriorityCommunicationArbitrationPolicy(fixedPriorityCommunicationArbitrationPolicy);
				if (result == null) result = caseRtpCommunicationArbitrationPolicyType(fixedPriorityCommunicationArbitrationPolicy);
				if (result == null) result = caseRealTimeCommonType(fixedPriorityCommunicationArbitrationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.LIFO_COMMUNICATION_ARBITRATION_POLICY: {
				LIFOCommunicationArbitrationPolicy lifoCommunicationArbitrationPolicy = (LIFOCommunicationArbitrationPolicy)theEObject;
				T result = caseLIFOCommunicationArbitrationPolicy(lifoCommunicationArbitrationPolicy);
				if (result == null) result = caseRtpCommunicationArbitrationPolicyType(lifoCommunicationArbitrationPolicy);
				if (result == null) result = caseRealTimeCommonType(lifoCommunicationArbitrationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_WAITING_QUEUE_POLICY_TYPE: {
				RtpWaitingQueuePolicyType rtpWaitingQueuePolicyType = (RtpWaitingQueuePolicyType)theEObject;
				T result = caseRtpWaitingQueuePolicyType(rtpWaitingQueuePolicyType);
				if (result == null) result = caseRealTimeCommonType(rtpWaitingQueuePolicyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FIFO_WAITING_QUEUE_POLICY: {
				FIFOWaitingQueuePolicy fifoWaitingQueuePolicy = (FIFOWaitingQueuePolicy)theEObject;
				T result = caseFIFOWaitingQueuePolicy(fifoWaitingQueuePolicy);
				if (result == null) result = caseRtpWaitingQueuePolicyType(fifoWaitingQueuePolicy);
				if (result == null) result = caseRealTimeCommonType(fifoWaitingQueuePolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.LIFO_WAITING_QUEUE_POLICY: {
				LIFOWaitingQueuePolicy lifoWaitingQueuePolicy = (LIFOWaitingQueuePolicy)theEObject;
				T result = caseLIFOWaitingQueuePolicy(lifoWaitingQueuePolicy);
				if (result == null) result = caseRtpWaitingQueuePolicyType(lifoWaitingQueuePolicy);
				if (result == null) result = caseRealTimeCommonType(lifoWaitingQueuePolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.PRIORITY_WAITING_QUEUE_POLICY: {
				PriorityWaitingQueuePolicy priorityWaitingQueuePolicy = (PriorityWaitingQueuePolicy)theEObject;
				T result = casePriorityWaitingQueuePolicy(priorityWaitingQueuePolicy);
				if (result == null) result = caseRtpWaitingQueuePolicyType(priorityWaitingQueuePolicy);
				if (result == null) result = caseRealTimeCommonType(priorityWaitingQueuePolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_NETWORK_PROTOCOL_TYPE: {
				RtpNetworkProtocolType rtpNetworkProtocolType = (RtpNetworkProtocolType)theEObject;
				T result = caseRtpNetworkProtocolType(rtpNetworkProtocolType);
				if (result == null) result = caseRealTimeCommonType(rtpNetworkProtocolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.CAN_NETWORK_PROTOCOL: {
				CANNetworkProtocol canNetworkProtocol = (CANNetworkProtocol)theEObject;
				T result = caseCANNetworkProtocol(canNetworkProtocol);
				if (result == null) result = caseRtpNetworkProtocolType(canNetworkProtocol);
				if (result == null) result = caseRealTimeCommonType(canNetworkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.AFDX_NETWORK_PROTOCOL: {
				AFDXNetworkProtocol afdxNetworkProtocol = (AFDXNetworkProtocol)theEObject;
				T result = caseAFDXNetworkProtocol(afdxNetworkProtocol);
				if (result == null) result = caseRtpNetworkProtocolType(afdxNetworkProtocol);
				if (result == null) result = caseRealTimeCommonType(afdxNetworkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.ATM_NETWORK_PROTOCOL: {
				ATMNetworkProtocol atmNetworkProtocol = (ATMNetworkProtocol)theEObject;
				T result = caseATMNetworkProtocol(atmNetworkProtocol);
				if (result == null) result = caseRtpNetworkProtocolType(atmNetworkProtocol);
				if (result == null) result = caseRealTimeCommonType(atmNetworkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FIP_NETWORK_PROTOCOL: {
				FIPNetworkProtocol fipNetworkProtocol = (FIPNetworkProtocol)theEObject;
				T result = caseFIPNetworkProtocol(fipNetworkProtocol);
				if (result == null) result = caseRtpNetworkProtocolType(fipNetworkProtocol);
				if (result == null) result = caseRealTimeCommonType(fipNetworkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FDDI_NETWORK_PROTOCOL: {
				FDDINetworkProtocol fddiNetworkProtocol = (FDDINetworkProtocol)theEObject;
				T result = caseFDDINetworkProtocol(fddiNetworkProtocol);
				if (result == null) result = caseRtpNetworkProtocolType(fddiNetworkProtocol);
				if (result == null) result = caseRealTimeCommonType(fddiNetworkProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_SCHEDULING_POLICY_TYPE: {
				RtpSchedulingPolicyType rtpSchedulingPolicyType = (RtpSchedulingPolicyType)theEObject;
				T result = caseRtpSchedulingPolicyType(rtpSchedulingPolicyType);
				if (result == null) result = caseRealTimeCommonType(rtpSchedulingPolicyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FIXED_PRIORITY_SCHEDULING_POLICY: {
				FixedPrioritySchedulingPolicy fixedPrioritySchedulingPolicy = (FixedPrioritySchedulingPolicy)theEObject;
				T result = caseFixedPrioritySchedulingPolicy(fixedPrioritySchedulingPolicy);
				if (result == null) result = caseRtpSchedulingPolicyType(fixedPrioritySchedulingPolicy);
				if (result == null) result = caseRealTimeCommonType(fixedPrioritySchedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.LEAST_LAXITY_FIRST_SCHEDULING_POLICY: {
				LeastLaxityFirstSchedulingPolicy leastLaxityFirstSchedulingPolicy = (LeastLaxityFirstSchedulingPolicy)theEObject;
				T result = caseLeastLaxityFirstSchedulingPolicy(leastLaxityFirstSchedulingPolicy);
				if (result == null) result = caseRtpSchedulingPolicyType(leastLaxityFirstSchedulingPolicy);
				if (result == null) result = caseRealTimeCommonType(leastLaxityFirstSchedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.ROUND_ROBIN_SCHEDULING_POLICY: {
				RoundRobinSchedulingPolicy roundRobinSchedulingPolicy = (RoundRobinSchedulingPolicy)theEObject;
				T result = caseRoundRobinSchedulingPolicy(roundRobinSchedulingPolicy);
				if (result == null) result = caseRtpSchedulingPolicyType(roundRobinSchedulingPolicy);
				if (result == null) result = caseRealTimeCommonType(roundRobinSchedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY: {
				EarliestDeadlineFirstSchedulingPolicy earliestDeadlineFirstSchedulingPolicy = (EarliestDeadlineFirstSchedulingPolicy)theEObject;
				T result = caseEarliestDeadlineFirstSchedulingPolicy(earliestDeadlineFirstSchedulingPolicy);
				if (result == null) result = caseRtpSchedulingPolicyType(earliestDeadlineFirstSchedulingPolicy);
				if (result == null) result = caseRealTimeCommonType(earliestDeadlineFirstSchedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_COMMUNICATION_MECHANISM_TYPE: {
				RtpCommunicationMechanismType rtpCommunicationMechanismType = (RtpCommunicationMechanismType)theEObject;
				T result = caseRtpCommunicationMechanismType(rtpCommunicationMechanismType);
				if (result == null) result = caseRealTimeCommonType(rtpCommunicationMechanismType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.PIPE_COMMUNICATION_MECHANISM: {
				PipeCommunicationMechanism pipeCommunicationMechanism = (PipeCommunicationMechanism)theEObject;
				T result = casePipeCommunicationMechanism(pipeCommunicationMechanism);
				if (result == null) result = caseRtpCommunicationMechanismType(pipeCommunicationMechanism);
				if (result == null) result = caseRealTimeCommonType(pipeCommunicationMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM: {
				DataQueueCommunicationMechanism dataQueueCommunicationMechanism = (DataQueueCommunicationMechanism)theEObject;
				T result = caseDataQueueCommunicationMechanism(dataQueueCommunicationMechanism);
				if (result == null) result = caseRtpCommunicationMechanismType(dataQueueCommunicationMechanism);
				if (result == null) result = caseRealTimeCommonType(dataQueueCommunicationMechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_TRANSMISSION_MODE_TYPE: {
				RtpTransmissionModeType rtpTransmissionModeType = (RtpTransmissionModeType)theEObject;
				T result = caseRtpTransmissionModeType(rtpTransmissionModeType);
				if (result == null) result = caseRealTimeCommonType(rtpTransmissionModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FULL_DUPLEX_TRANSMISSION_MODE: {
				FullDuplexTransmissionMode fullDuplexTransmissionMode = (FullDuplexTransmissionMode)theEObject;
				T result = caseFullDuplexTransmissionMode(fullDuplexTransmissionMode);
				if (result == null) result = caseRtpTransmissionModeType(fullDuplexTransmissionMode);
				if (result == null) result = caseRealTimeCommonType(fullDuplexTransmissionMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.HALF_DUPLEX_TRANSMISSION_MODE: {
				HalfDuplexTransmissionMode halfDuplexTransmissionMode = (HalfDuplexTransmissionMode)theEObject;
				T result = caseHalfDuplexTransmissionMode(halfDuplexTransmissionMode);
				if (result == null) result = caseRtpTransmissionModeType(halfDuplexTransmissionMode);
				if (result == null) result = caseRealTimeCommonType(halfDuplexTransmissionMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.SIMPLE_TRANSMISSION_MODE: {
				SimpleTransmissionMode simpleTransmissionMode = (SimpleTransmissionMode)theEObject;
				T result = caseSimpleTransmissionMode(simpleTransmissionMode);
				if (result == null) result = caseRtpTransmissionModeType(simpleTransmissionMode);
				if (result == null) result = caseRealTimeCommonType(simpleTransmissionMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.ICPP_PROTECT_PROTOCOL: {
				ICPPProtectProtocol icppProtectProtocol = (ICPPProtectProtocol)theEObject;
				T result = caseICPPProtectProtocol(icppProtectProtocol);
				if (result == null) result = casePCPProtectProtocol(icppProtectProtocol);
				if (result == null) result = caseRtpProtectProtocolType(icppProtectProtocol);
				if (result == null) result = caseRealTimeCommonType(icppProtectProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.OCPP_PROTECT_PROTOCOL: {
				OCPPProtectProtocol ocppProtectProtocol = (OCPPProtectProtocol)theEObject;
				T result = caseOCPPProtectProtocol(ocppProtectProtocol);
				if (result == null) result = casePCPProtectProtocol(ocppProtectProtocol);
				if (result == null) result = caseRtpProtectProtocolType(ocppProtectProtocol);
				if (result == null) result = caseRealTimeCommonType(ocppProtectProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.DEADLINE_MONOTONIC_SCHEDULING_POLICY: {
				DeadlineMonotonicSchedulingPolicy deadlineMonotonicSchedulingPolicy = (DeadlineMonotonicSchedulingPolicy)theEObject;
				T result = caseDeadlineMonotonicSchedulingPolicy(deadlineMonotonicSchedulingPolicy);
				if (result == null) result = caseFixedPrioritySchedulingPolicy(deadlineMonotonicSchedulingPolicy);
				if (result == null) result = caseRtpSchedulingPolicyType(deadlineMonotonicSchedulingPolicy);
				if (result == null) result = caseRealTimeCommonType(deadlineMonotonicSchedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RATE_MONOTONIC_SCHEDULING_POLICY: {
				RateMonotonicSchedulingPolicy rateMonotonicSchedulingPolicy = (RateMonotonicSchedulingPolicy)theEObject;
				T result = caseRateMonotonicSchedulingPolicy(rateMonotonicSchedulingPolicy);
				if (result == null) result = caseFixedPrioritySchedulingPolicy(rateMonotonicSchedulingPolicy);
				if (result == null) result = caseRtpSchedulingPolicyType(rateMonotonicSchedulingPolicy);
				if (result == null) result = caseRealTimeCommonType(rateMonotonicSchedulingPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_TASK_ALLOCATION_TYPE: {
				RtpTaskAllocationType rtpTaskAllocationType = (RtpTaskAllocationType)theEObject;
				T result = caseRtpTaskAllocationType(rtpTaskAllocationType);
				if (result == null) result = caseRealTimeCommonType(rtpTaskAllocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.PARTITIONED_TASK_ALLOCATION: {
				PartitionedTaskAllocation partitionedTaskAllocation = (PartitionedTaskAllocation)theEObject;
				T result = casePartitionedTaskAllocation(partitionedTaskAllocation);
				if (result == null) result = caseRtpTaskAllocationType(partitionedTaskAllocation);
				if (result == null) result = caseRealTimeCommonType(partitionedTaskAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.FULL_MIGRATION_TASK_ALLOCATION: {
				FullMigrationTaskAllocation fullMigrationTaskAllocation = (FullMigrationTaskAllocation)theEObject;
				T result = caseFullMigrationTaskAllocation(fullMigrationTaskAllocation);
				if (result == null) result = caseRtpTaskAllocationType(fullMigrationTaskAllocation);
				if (result == null) result = caseRealTimeCommonType(fullMigrationTaskAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RESTRICTED_MIGRATION_TASK_ALLOCATION: {
				RestrictedMigrationTaskAllocation restrictedMigrationTaskAllocation = (RestrictedMigrationTaskAllocation)theEObject;
				T result = caseRestrictedMigrationTaskAllocation(restrictedMigrationTaskAllocation);
				if (result == null) result = caseRtpTaskAllocationType(restrictedMigrationTaskAllocation);
				if (result == null) result = caseRealTimeCommonType(restrictedMigrationTaskAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.RTP_MULTIPROCESSOR_CATEGORY_TYPE: {
				RtpMultiprocessorCategoryType rtpMultiprocessorCategoryType = (RtpMultiprocessorCategoryType)theEObject;
				T result = caseRtpMultiprocessorCategoryType(rtpMultiprocessorCategoryType);
				if (result == null) result = caseRealTimeCommonType(rtpMultiprocessorCategoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.HETEROGENOUS_MULTIPROCESSOR_CATEGORY: {
				HeterogenousMultiprocessorCategory heterogenousMultiprocessorCategory = (HeterogenousMultiprocessorCategory)theEObject;
				T result = caseHeterogenousMultiprocessorCategory(heterogenousMultiprocessorCategory);
				if (result == null) result = caseRtpMultiprocessorCategoryType(heterogenousMultiprocessorCategory);
				if (result == null) result = caseRealTimeCommonType(heterogenousMultiprocessorCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.HOMOGENEOUS_MULTIPROCESSOR_CATEGORY: {
				HomogeneousMultiprocessorCategory homogeneousMultiprocessorCategory = (HomogeneousMultiprocessorCategory)theEObject;
				T result = caseHomogeneousMultiprocessorCategory(homogeneousMultiprocessorCategory);
				if (result == null) result = caseRtpMultiprocessorCategoryType(homogeneousMultiprocessorCategory);
				if (result == null) result = caseRealTimeCommonType(homogeneousMultiprocessorCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpProtocolsAndPoliciesPackage.UNIFORM_MULTIPROCESSOR_CATEGORY: {
				UniformMultiprocessorCategory uniformMultiprocessorCategory = (UniformMultiprocessorCategory)theEObject;
				T result = caseUniformMultiprocessorCategory(uniformMultiprocessorCategory);
				if (result == null) result = caseRtpMultiprocessorCategoryType(uniformMultiprocessorCategory);
				if (result == null) result = caseRealTimeCommonType(uniformMultiprocessorCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Protect Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Protect Protocol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpProtectProtocolType(RtpProtectProtocolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PIP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PIP Protect Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePIPProtectProtocol(PIPProtectProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCP Protect Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCPProtectProtocol(PCPProtectProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Communication Arbitration Policy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Communication Arbitration Policy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpCommunicationArbitrationPolicyType(RtpCommunicationArbitrationPolicyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FIFO Communication Arbitration Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FIFO Communication Arbitration Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFIFOCommunicationArbitrationPolicy(FIFOCommunicationArbitrationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Communication Arbitration Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Communication Arbitration Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPriorityCommunicationArbitrationPolicy(FixedPriorityCommunicationArbitrationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIFO Communication Arbitration Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIFO Communication Arbitration Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIFOCommunicationArbitrationPolicy(LIFOCommunicationArbitrationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Waiting Queue Policy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Waiting Queue Policy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpWaitingQueuePolicyType(RtpWaitingQueuePolicyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FIFO Waiting Queue Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FIFO Waiting Queue Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFIFOWaitingQueuePolicy(FIFOWaitingQueuePolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LIFO Waiting Queue Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LIFO Waiting Queue Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIFOWaitingQueuePolicy(LIFOWaitingQueuePolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Waiting Queue Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Waiting Queue Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityWaitingQueuePolicy(PriorityWaitingQueuePolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Network Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Network Protocol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpNetworkProtocolType(RtpNetworkProtocolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAN Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAN Network Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCANNetworkProtocol(CANNetworkProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AFDX Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AFDX Network Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAFDXNetworkProtocol(AFDXNetworkProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATM Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATM Network Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATMNetworkProtocol(ATMNetworkProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FIP Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FIP Network Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFIPNetworkProtocol(FIPNetworkProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FDDI Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FDDI Network Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFDDINetworkProtocol(FDDINetworkProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Scheduling Policy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Scheduling Policy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpSchedulingPolicyType(RtpSchedulingPolicyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Priority Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Priority Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedPrioritySchedulingPolicy(FixedPrioritySchedulingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Least Laxity First Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Least Laxity First Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeastLaxityFirstSchedulingPolicy(LeastLaxityFirstSchedulingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Robin Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Robin Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundRobinSchedulingPolicy(RoundRobinSchedulingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Earliest Deadline First Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earliest Deadline First Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEarliestDeadlineFirstSchedulingPolicy(EarliestDeadlineFirstSchedulingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Communication Mechanism Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Communication Mechanism Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpCommunicationMechanismType(RtpCommunicationMechanismType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe Communication Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe Communication Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeCommunicationMechanism(PipeCommunicationMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Queue Communication Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Queue Communication Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataQueueCommunicationMechanism(DataQueueCommunicationMechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Transmission Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Transmission Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpTransmissionModeType(RtpTransmissionModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Duplex Transmission Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Duplex Transmission Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullDuplexTransmissionMode(FullDuplexTransmissionMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Duplex Transmission Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Duplex Transmission Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfDuplexTransmissionMode(HalfDuplexTransmissionMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Transmission Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Transmission Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTransmissionMode(SimpleTransmissionMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICPP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICPP Protect Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICPPProtectProtocol(ICPPProtectProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCPP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCPP Protect Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCPPProtectProtocol(OCPPProtectProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlineMonotonicSchedulingPolicy(DeadlineMonotonicSchedulingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate Monotonic Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate Monotonic Scheduling Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRateMonotonicSchedulingPolicy(RateMonotonicSchedulingPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Task Allocation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Task Allocation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpTaskAllocationType(RtpTaskAllocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partitioned Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partitioned Task Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionedTaskAllocation(PartitionedTaskAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Full Migration Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Full Migration Task Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFullMigrationTaskAllocation(FullMigrationTaskAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restricted Migration Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restricted Migration Task Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestrictedMigrationTaskAllocation(RestrictedMigrationTaskAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Multiprocessor Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Multiprocessor Category Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpMultiprocessorCategoryType(RtpMultiprocessorCategoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heterogenous Multiprocessor Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heterogenous Multiprocessor Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeterogenousMultiprocessorCategory(HeterogenousMultiprocessorCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Homogeneous Multiprocessor Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Homogeneous Multiprocessor Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHomogeneousMultiprocessorCategory(HomogeneousMultiprocessorCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform Multiprocessor Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform Multiprocessor Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniformMultiprocessorCategory(UniformMultiprocessorCategory object) {
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

} //RtpProtocolsAndPoliciesSwitch
