/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage
 * @generated
 */
public class RtpProtocolsAndPoliciesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpProtocolsAndPoliciesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtocolsAndPoliciesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RtpProtocolsAndPoliciesPackage.eINSTANCE;
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
	protected RtpProtocolsAndPoliciesSwitch<Adapter> modelSwitch =
		new RtpProtocolsAndPoliciesSwitch<Adapter>() {
			@Override
			public Adapter caseRtpProtectProtocolType(RtpProtectProtocolType object) {
				return createRtpProtectProtocolTypeAdapter();
			}
			@Override
			public Adapter casePIPProtectProtocol(PIPProtectProtocol object) {
				return createPIPProtectProtocolAdapter();
			}
			@Override
			public Adapter casePCPProtectProtocol(PCPProtectProtocol object) {
				return createPCPProtectProtocolAdapter();
			}
			@Override
			public Adapter caseRtpCommunicationArbitrationPolicyType(RtpCommunicationArbitrationPolicyType object) {
				return createRtpCommunicationArbitrationPolicyTypeAdapter();
			}
			@Override
			public Adapter caseFIFOCommunicationArbitrationPolicy(FIFOCommunicationArbitrationPolicy object) {
				return createFIFOCommunicationArbitrationPolicyAdapter();
			}
			@Override
			public Adapter caseFixedPriorityCommunicationArbitrationPolicy(FixedPriorityCommunicationArbitrationPolicy object) {
				return createFixedPriorityCommunicationArbitrationPolicyAdapter();
			}
			@Override
			public Adapter caseLIFOCommunicationArbitrationPolicy(LIFOCommunicationArbitrationPolicy object) {
				return createLIFOCommunicationArbitrationPolicyAdapter();
			}
			@Override
			public Adapter caseRtpWaitingQueuePolicyType(RtpWaitingQueuePolicyType object) {
				return createRtpWaitingQueuePolicyTypeAdapter();
			}
			@Override
			public Adapter caseFIFOWaitingQueuePolicy(FIFOWaitingQueuePolicy object) {
				return createFIFOWaitingQueuePolicyAdapter();
			}
			@Override
			public Adapter caseLIFOWaitingQueuePolicy(LIFOWaitingQueuePolicy object) {
				return createLIFOWaitingQueuePolicyAdapter();
			}
			@Override
			public Adapter casePriorityWaitingQueuePolicy(PriorityWaitingQueuePolicy object) {
				return createPriorityWaitingQueuePolicyAdapter();
			}
			@Override
			public Adapter caseRtpNetworkProtocolType(RtpNetworkProtocolType object) {
				return createRtpNetworkProtocolTypeAdapter();
			}
			@Override
			public Adapter caseCANNetworkProtocol(CANNetworkProtocol object) {
				return createCANNetworkProtocolAdapter();
			}
			@Override
			public Adapter caseAFDXNetworkProtocol(AFDXNetworkProtocol object) {
				return createAFDXNetworkProtocolAdapter();
			}
			@Override
			public Adapter caseATMNetworkProtocol(ATMNetworkProtocol object) {
				return createATMNetworkProtocolAdapter();
			}
			@Override
			public Adapter caseFIPNetworkProtocol(FIPNetworkProtocol object) {
				return createFIPNetworkProtocolAdapter();
			}
			@Override
			public Adapter caseFDDINetworkProtocol(FDDINetworkProtocol object) {
				return createFDDINetworkProtocolAdapter();
			}
			@Override
			public Adapter caseRtpSchedulingPolicyType(RtpSchedulingPolicyType object) {
				return createRtpSchedulingPolicyTypeAdapter();
			}
			@Override
			public Adapter caseFixedPrioritySchedulingPolicy(FixedPrioritySchedulingPolicy object) {
				return createFixedPrioritySchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseLeastLaxityFirstSchedulingPolicy(LeastLaxityFirstSchedulingPolicy object) {
				return createLeastLaxityFirstSchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseRoundRobinSchedulingPolicy(RoundRobinSchedulingPolicy object) {
				return createRoundRobinSchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseEarliestDeadlineFirstSchedulingPolicy(EarliestDeadlineFirstSchedulingPolicy object) {
				return createEarliestDeadlineFirstSchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseRtpCommunicationMechanismType(RtpCommunicationMechanismType object) {
				return createRtpCommunicationMechanismTypeAdapter();
			}
			@Override
			public Adapter casePipeCommunicationMechanism(PipeCommunicationMechanism object) {
				return createPipeCommunicationMechanismAdapter();
			}
			@Override
			public Adapter caseDataQueueCommunicationMechanism(DataQueueCommunicationMechanism object) {
				return createDataQueueCommunicationMechanismAdapter();
			}
			@Override
			public Adapter caseRtpTransmissionModeType(RtpTransmissionModeType object) {
				return createRtpTransmissionModeTypeAdapter();
			}
			@Override
			public Adapter caseFullDuplexTransmissionMode(FullDuplexTransmissionMode object) {
				return createFullDuplexTransmissionModeAdapter();
			}
			@Override
			public Adapter caseHalfDuplexTransmissionMode(HalfDuplexTransmissionMode object) {
				return createHalfDuplexTransmissionModeAdapter();
			}
			@Override
			public Adapter caseSimpleTransmissionMode(SimpleTransmissionMode object) {
				return createSimpleTransmissionModeAdapter();
			}
			@Override
			public Adapter caseICPPProtectProtocol(ICPPProtectProtocol object) {
				return createICPPProtectProtocolAdapter();
			}
			@Override
			public Adapter caseOCPPProtectProtocol(OCPPProtectProtocol object) {
				return createOCPPProtectProtocolAdapter();
			}
			@Override
			public Adapter caseDeadlineMonotonicSchedulingPolicy(DeadlineMonotonicSchedulingPolicy object) {
				return createDeadlineMonotonicSchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseRateMonotonicSchedulingPolicy(RateMonotonicSchedulingPolicy object) {
				return createRateMonotonicSchedulingPolicyAdapter();
			}
			@Override
			public Adapter caseRtpTaskAllocationType(RtpTaskAllocationType object) {
				return createRtpTaskAllocationTypeAdapter();
			}
			@Override
			public Adapter casePartitionedTaskAllocation(PartitionedTaskAllocation object) {
				return createPartitionedTaskAllocationAdapter();
			}
			@Override
			public Adapter caseFullMigrationTaskAllocation(FullMigrationTaskAllocation object) {
				return createFullMigrationTaskAllocationAdapter();
			}
			@Override
			public Adapter caseRestrictedMigrationTaskAllocation(RestrictedMigrationTaskAllocation object) {
				return createRestrictedMigrationTaskAllocationAdapter();
			}
			@Override
			public Adapter caseRtpMultiprocessorCategoryType(RtpMultiprocessorCategoryType object) {
				return createRtpMultiprocessorCategoryTypeAdapter();
			}
			@Override
			public Adapter caseHeterogenousMultiprocessorCategory(HeterogenousMultiprocessorCategory object) {
				return createHeterogenousMultiprocessorCategoryAdapter();
			}
			@Override
			public Adapter caseHomogeneousMultiprocessorCategory(HomogeneousMultiprocessorCategory object) {
				return createHomogeneousMultiprocessorCategoryAdapter();
			}
			@Override
			public Adapter caseUniformMultiprocessorCategory(UniformMultiprocessorCategory object) {
				return createUniformMultiprocessorCategoryAdapter();
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
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType <em>Rtp Protect Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType
	 * @generated
	 */
	public Adapter createRtpProtectProtocolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol <em>PIP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol
	 * @generated
	 */
	public Adapter createPIPProtectProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol <em>PCP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol
	 * @generated
	 */
	public Adapter createPCPProtectProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType <em>Rtp Communication Arbitration Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType
	 * @generated
	 */
	public Adapter createRtpCommunicationArbitrationPolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy <em>FIFO Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy
	 * @generated
	 */
	public Adapter createFIFOCommunicationArbitrationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy <em>Fixed Priority Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy
	 * @generated
	 */
	public Adapter createFixedPriorityCommunicationArbitrationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy <em>LIFO Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy
	 * @generated
	 */
	public Adapter createLIFOCommunicationArbitrationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType <em>Rtp Waiting Queue Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType
	 * @generated
	 */
	public Adapter createRtpWaitingQueuePolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy <em>FIFO Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy
	 * @generated
	 */
	public Adapter createFIFOWaitingQueuePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy <em>LIFO Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy
	 * @generated
	 */
	public Adapter createLIFOWaitingQueuePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy <em>Priority Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy
	 * @generated
	 */
	public Adapter createPriorityWaitingQueuePolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType <em>Rtp Network Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType
	 * @generated
	 */
	public Adapter createRtpNetworkProtocolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol <em>CAN Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol
	 * @generated
	 */
	public Adapter createCANNetworkProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol <em>AFDX Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol
	 * @generated
	 */
	public Adapter createAFDXNetworkProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol <em>ATM Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol
	 * @generated
	 */
	public Adapter createATMNetworkProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol <em>FIP Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol
	 * @generated
	 */
	public Adapter createFIPNetworkProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol <em>FDDI Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol
	 * @generated
	 */
	public Adapter createFDDINetworkProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType <em>Rtp Scheduling Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType
	 * @generated
	 */
	public Adapter createRtpSchedulingPolicyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy <em>Fixed Priority Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy
	 * @generated
	 */
	public Adapter createFixedPrioritySchedulingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy <em>Least Laxity First Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy
	 * @generated
	 */
	public Adapter createLeastLaxityFirstSchedulingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy <em>Round Robin Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy
	 * @generated
	 */
	public Adapter createRoundRobinSchedulingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy <em>Earliest Deadline First Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy
	 * @generated
	 */
	public Adapter createEarliestDeadlineFirstSchedulingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType <em>Rtp Communication Mechanism Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType
	 * @generated
	 */
	public Adapter createRtpCommunicationMechanismTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism <em>Pipe Communication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism
	 * @generated
	 */
	public Adapter createPipeCommunicationMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism <em>Data Queue Communication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism
	 * @generated
	 */
	public Adapter createDataQueueCommunicationMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType <em>Rtp Transmission Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType
	 * @generated
	 */
	public Adapter createRtpTransmissionModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode <em>Full Duplex Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode
	 * @generated
	 */
	public Adapter createFullDuplexTransmissionModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode <em>Half Duplex Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode
	 * @generated
	 */
	public Adapter createHalfDuplexTransmissionModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode <em>Simple Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode
	 * @generated
	 */
	public Adapter createSimpleTransmissionModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol <em>ICPP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol
	 * @generated
	 */
	public Adapter createICPPProtectProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol <em>OCPP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol
	 * @generated
	 */
	public Adapter createOCPPProtectProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy <em>Deadline Monotonic Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy
	 * @generated
	 */
	public Adapter createDeadlineMonotonicSchedulingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy <em>Rate Monotonic Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy
	 * @generated
	 */
	public Adapter createRateMonotonicSchedulingPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType <em>Rtp Task Allocation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType
	 * @generated
	 */
	public Adapter createRtpTaskAllocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation <em>Partitioned Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation
	 * @generated
	 */
	public Adapter createPartitionedTaskAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation <em>Full Migration Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation
	 * @generated
	 */
	public Adapter createFullMigrationTaskAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation <em>Restricted Migration Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation
	 * @generated
	 */
	public Adapter createRestrictedMigrationTaskAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType <em>Rtp Multiprocessor Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType
	 * @generated
	 */
	public Adapter createRtpMultiprocessorCategoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory <em>Heterogenous Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory
	 * @generated
	 */
	public Adapter createHeterogenousMultiprocessorCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory <em>Homogeneous Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory
	 * @generated
	 */
	public Adapter createHomogeneousMultiprocessorCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory <em>Uniform Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory
	 * @generated
	 */
	public Adapter createUniformMultiprocessorCategoryAdapter() {
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

} //RtpProtocolsAndPoliciesAdapterFactory
