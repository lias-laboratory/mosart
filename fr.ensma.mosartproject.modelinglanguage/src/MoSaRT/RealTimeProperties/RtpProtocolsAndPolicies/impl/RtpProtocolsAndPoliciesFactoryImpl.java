/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.*;

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
public class RtpProtocolsAndPoliciesFactoryImpl extends EFactoryImpl implements RtpProtocolsAndPoliciesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtpProtocolsAndPoliciesFactory init() {
		try {
			RtpProtocolsAndPoliciesFactory theRtpProtocolsAndPoliciesFactory = (RtpProtocolsAndPoliciesFactory)EPackage.Registry.INSTANCE.getEFactory(RtpProtocolsAndPoliciesPackage.eNS_URI);
			if (theRtpProtocolsAndPoliciesFactory != null) {
				return theRtpProtocolsAndPoliciesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtpProtocolsAndPoliciesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtocolsAndPoliciesFactoryImpl() {
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
			case RtpProtocolsAndPoliciesPackage.PIP_PROTECT_PROTOCOL: return createPIPProtectProtocol();
			case RtpProtocolsAndPoliciesPackage.FIFO_COMMUNICATION_ARBITRATION_POLICY: return createFIFOCommunicationArbitrationPolicy();
			case RtpProtocolsAndPoliciesPackage.FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY: return createFixedPriorityCommunicationArbitrationPolicy();
			case RtpProtocolsAndPoliciesPackage.LIFO_COMMUNICATION_ARBITRATION_POLICY: return createLIFOCommunicationArbitrationPolicy();
			case RtpProtocolsAndPoliciesPackage.FIFO_WAITING_QUEUE_POLICY: return createFIFOWaitingQueuePolicy();
			case RtpProtocolsAndPoliciesPackage.LIFO_WAITING_QUEUE_POLICY: return createLIFOWaitingQueuePolicy();
			case RtpProtocolsAndPoliciesPackage.PRIORITY_WAITING_QUEUE_POLICY: return createPriorityWaitingQueuePolicy();
			case RtpProtocolsAndPoliciesPackage.CAN_NETWORK_PROTOCOL: return createCANNetworkProtocol();
			case RtpProtocolsAndPoliciesPackage.AFDX_NETWORK_PROTOCOL: return createAFDXNetworkProtocol();
			case RtpProtocolsAndPoliciesPackage.ATM_NETWORK_PROTOCOL: return createATMNetworkProtocol();
			case RtpProtocolsAndPoliciesPackage.FIP_NETWORK_PROTOCOL: return createFIPNetworkProtocol();
			case RtpProtocolsAndPoliciesPackage.FDDI_NETWORK_PROTOCOL: return createFDDINetworkProtocol();
			case RtpProtocolsAndPoliciesPackage.FIXED_PRIORITY_SCHEDULING_POLICY: return createFixedPrioritySchedulingPolicy();
			case RtpProtocolsAndPoliciesPackage.LEAST_LAXITY_FIRST_SCHEDULING_POLICY: return createLeastLaxityFirstSchedulingPolicy();
			case RtpProtocolsAndPoliciesPackage.ROUND_ROBIN_SCHEDULING_POLICY: return createRoundRobinSchedulingPolicy();
			case RtpProtocolsAndPoliciesPackage.EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY: return createEarliestDeadlineFirstSchedulingPolicy();
			case RtpProtocolsAndPoliciesPackage.PIPE_COMMUNICATION_MECHANISM: return createPipeCommunicationMechanism();
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM: return createDataQueueCommunicationMechanism();
			case RtpProtocolsAndPoliciesPackage.FULL_DUPLEX_TRANSMISSION_MODE: return createFullDuplexTransmissionMode();
			case RtpProtocolsAndPoliciesPackage.HALF_DUPLEX_TRANSMISSION_MODE: return createHalfDuplexTransmissionMode();
			case RtpProtocolsAndPoliciesPackage.SIMPLE_TRANSMISSION_MODE: return createSimpleTransmissionMode();
			case RtpProtocolsAndPoliciesPackage.ICPP_PROTECT_PROTOCOL: return createICPPProtectProtocol();
			case RtpProtocolsAndPoliciesPackage.OCPP_PROTECT_PROTOCOL: return createOCPPProtectProtocol();
			case RtpProtocolsAndPoliciesPackage.DEADLINE_MONOTONIC_SCHEDULING_POLICY: return createDeadlineMonotonicSchedulingPolicy();
			case RtpProtocolsAndPoliciesPackage.RATE_MONOTONIC_SCHEDULING_POLICY: return createRateMonotonicSchedulingPolicy();
			case RtpProtocolsAndPoliciesPackage.PARTITIONED_TASK_ALLOCATION: return createPartitionedTaskAllocation();
			case RtpProtocolsAndPoliciesPackage.FULL_MIGRATION_TASK_ALLOCATION: return createFullMigrationTaskAllocation();
			case RtpProtocolsAndPoliciesPackage.RESTRICTED_MIGRATION_TASK_ALLOCATION: return createRestrictedMigrationTaskAllocation();
			case RtpProtocolsAndPoliciesPackage.HETEROGENOUS_MULTIPROCESSOR_CATEGORY: return createHeterogenousMultiprocessorCategory();
			case RtpProtocolsAndPoliciesPackage.HOMOGENEOUS_MULTIPROCESSOR_CATEGORY: return createHomogeneousMultiprocessorCategory();
			case RtpProtocolsAndPoliciesPackage.UNIFORM_MULTIPROCESSOR_CATEGORY: return createUniformMultiprocessorCategory();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIPProtectProtocol createPIPProtectProtocol() {
		PIPProtectProtocolImpl pipProtectProtocol = new PIPProtectProtocolImpl();
		return pipProtectProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIFOCommunicationArbitrationPolicy createFIFOCommunicationArbitrationPolicy() {
		FIFOCommunicationArbitrationPolicyImpl fifoCommunicationArbitrationPolicy = new FIFOCommunicationArbitrationPolicyImpl();
		return fifoCommunicationArbitrationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityCommunicationArbitrationPolicy createFixedPriorityCommunicationArbitrationPolicy() {
		FixedPriorityCommunicationArbitrationPolicyImpl fixedPriorityCommunicationArbitrationPolicy = new FixedPriorityCommunicationArbitrationPolicyImpl();
		return fixedPriorityCommunicationArbitrationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIFOCommunicationArbitrationPolicy createLIFOCommunicationArbitrationPolicy() {
		LIFOCommunicationArbitrationPolicyImpl lifoCommunicationArbitrationPolicy = new LIFOCommunicationArbitrationPolicyImpl();
		return lifoCommunicationArbitrationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIFOWaitingQueuePolicy createFIFOWaitingQueuePolicy() {
		FIFOWaitingQueuePolicyImpl fifoWaitingQueuePolicy = new FIFOWaitingQueuePolicyImpl();
		return fifoWaitingQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LIFOWaitingQueuePolicy createLIFOWaitingQueuePolicy() {
		LIFOWaitingQueuePolicyImpl lifoWaitingQueuePolicy = new LIFOWaitingQueuePolicyImpl();
		return lifoWaitingQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityWaitingQueuePolicy createPriorityWaitingQueuePolicy() {
		PriorityWaitingQueuePolicyImpl priorityWaitingQueuePolicy = new PriorityWaitingQueuePolicyImpl();
		return priorityWaitingQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CANNetworkProtocol createCANNetworkProtocol() {
		CANNetworkProtocolImpl canNetworkProtocol = new CANNetworkProtocolImpl();
		return canNetworkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFDXNetworkProtocol createAFDXNetworkProtocol() {
		AFDXNetworkProtocolImpl afdxNetworkProtocol = new AFDXNetworkProtocolImpl();
		return afdxNetworkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATMNetworkProtocol createATMNetworkProtocol() {
		ATMNetworkProtocolImpl atmNetworkProtocol = new ATMNetworkProtocolImpl();
		return atmNetworkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIPNetworkProtocol createFIPNetworkProtocol() {
		FIPNetworkProtocolImpl fipNetworkProtocol = new FIPNetworkProtocolImpl();
		return fipNetworkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FDDINetworkProtocol createFDDINetworkProtocol() {
		FDDINetworkProtocolImpl fddiNetworkProtocol = new FDDINetworkProtocolImpl();
		return fddiNetworkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPrioritySchedulingPolicy createFixedPrioritySchedulingPolicy() {
		FixedPrioritySchedulingPolicyImpl fixedPrioritySchedulingPolicy = new FixedPrioritySchedulingPolicyImpl();
		return fixedPrioritySchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeastLaxityFirstSchedulingPolicy createLeastLaxityFirstSchedulingPolicy() {
		LeastLaxityFirstSchedulingPolicyImpl leastLaxityFirstSchedulingPolicy = new LeastLaxityFirstSchedulingPolicyImpl();
		return leastLaxityFirstSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinSchedulingPolicy createRoundRobinSchedulingPolicy() {
		RoundRobinSchedulingPolicyImpl roundRobinSchedulingPolicy = new RoundRobinSchedulingPolicyImpl();
		return roundRobinSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarliestDeadlineFirstSchedulingPolicy createEarliestDeadlineFirstSchedulingPolicy() {
		EarliestDeadlineFirstSchedulingPolicyImpl earliestDeadlineFirstSchedulingPolicy = new EarliestDeadlineFirstSchedulingPolicyImpl();
		return earliestDeadlineFirstSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeCommunicationMechanism createPipeCommunicationMechanism() {
		PipeCommunicationMechanismImpl pipeCommunicationMechanism = new PipeCommunicationMechanismImpl();
		return pipeCommunicationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataQueueCommunicationMechanism createDataQueueCommunicationMechanism() {
		DataQueueCommunicationMechanismImpl dataQueueCommunicationMechanism = new DataQueueCommunicationMechanismImpl();
		return dataQueueCommunicationMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullDuplexTransmissionMode createFullDuplexTransmissionMode() {
		FullDuplexTransmissionModeImpl fullDuplexTransmissionMode = new FullDuplexTransmissionModeImpl();
		return fullDuplexTransmissionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfDuplexTransmissionMode createHalfDuplexTransmissionMode() {
		HalfDuplexTransmissionModeImpl halfDuplexTransmissionMode = new HalfDuplexTransmissionModeImpl();
		return halfDuplexTransmissionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTransmissionMode createSimpleTransmissionMode() {
		SimpleTransmissionModeImpl simpleTransmissionMode = new SimpleTransmissionModeImpl();
		return simpleTransmissionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICPPProtectProtocol createICPPProtectProtocol() {
		ICPPProtectProtocolImpl icppProtectProtocol = new ICPPProtectProtocolImpl();
		return icppProtectProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCPPProtectProtocol createOCPPProtectProtocol() {
		OCPPProtectProtocolImpl ocppProtectProtocol = new OCPPProtectProtocolImpl();
		return ocppProtectProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineMonotonicSchedulingPolicy createDeadlineMonotonicSchedulingPolicy() {
		DeadlineMonotonicSchedulingPolicyImpl deadlineMonotonicSchedulingPolicy = new DeadlineMonotonicSchedulingPolicyImpl();
		return deadlineMonotonicSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateMonotonicSchedulingPolicy createRateMonotonicSchedulingPolicy() {
		RateMonotonicSchedulingPolicyImpl rateMonotonicSchedulingPolicy = new RateMonotonicSchedulingPolicyImpl();
		return rateMonotonicSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionedTaskAllocation createPartitionedTaskAllocation() {
		PartitionedTaskAllocationImpl partitionedTaskAllocation = new PartitionedTaskAllocationImpl();
		return partitionedTaskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullMigrationTaskAllocation createFullMigrationTaskAllocation() {
		FullMigrationTaskAllocationImpl fullMigrationTaskAllocation = new FullMigrationTaskAllocationImpl();
		return fullMigrationTaskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictedMigrationTaskAllocation createRestrictedMigrationTaskAllocation() {
		RestrictedMigrationTaskAllocationImpl restrictedMigrationTaskAllocation = new RestrictedMigrationTaskAllocationImpl();
		return restrictedMigrationTaskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeterogenousMultiprocessorCategory createHeterogenousMultiprocessorCategory() {
		HeterogenousMultiprocessorCategoryImpl heterogenousMultiprocessorCategory = new HeterogenousMultiprocessorCategoryImpl();
		return heterogenousMultiprocessorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomogeneousMultiprocessorCategory createHomogeneousMultiprocessorCategory() {
		HomogeneousMultiprocessorCategoryImpl homogeneousMultiprocessorCategory = new HomogeneousMultiprocessorCategoryImpl();
		return homogeneousMultiprocessorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformMultiprocessorCategory createUniformMultiprocessorCategory() {
		UniformMultiprocessorCategoryImpl uniformMultiprocessorCategory = new UniformMultiprocessorCategoryImpl();
		return uniformMultiprocessorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtocolsAndPoliciesPackage getRtpProtocolsAndPoliciesPackage() {
		return (RtpProtocolsAndPoliciesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtpProtocolsAndPoliciesPackage getPackage() {
		return RtpProtocolsAndPoliciesPackage.eINSTANCE;
	}

} //RtpProtocolsAndPoliciesFactoryImpl
