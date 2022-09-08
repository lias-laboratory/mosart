/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage
 * @generated
 */
public interface RtpProtocolsAndPoliciesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpProtocolsAndPoliciesFactory eINSTANCE = MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PIP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIP Protect Protocol</em>'.
	 * @generated
	 */
	PIPProtectProtocol createPIPProtectProtocol();

	/**
	 * Returns a new object of class '<em>FIFO Communication Arbitration Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FIFO Communication Arbitration Policy</em>'.
	 * @generated
	 */
	FIFOCommunicationArbitrationPolicy createFIFOCommunicationArbitrationPolicy();

	/**
	 * Returns a new object of class '<em>Fixed Priority Communication Arbitration Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Priority Communication Arbitration Policy</em>'.
	 * @generated
	 */
	FixedPriorityCommunicationArbitrationPolicy createFixedPriorityCommunicationArbitrationPolicy();

	/**
	 * Returns a new object of class '<em>LIFO Communication Arbitration Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LIFO Communication Arbitration Policy</em>'.
	 * @generated
	 */
	LIFOCommunicationArbitrationPolicy createLIFOCommunicationArbitrationPolicy();

	/**
	 * Returns a new object of class '<em>FIFO Waiting Queue Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FIFO Waiting Queue Policy</em>'.
	 * @generated
	 */
	FIFOWaitingQueuePolicy createFIFOWaitingQueuePolicy();

	/**
	 * Returns a new object of class '<em>LIFO Waiting Queue Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LIFO Waiting Queue Policy</em>'.
	 * @generated
	 */
	LIFOWaitingQueuePolicy createLIFOWaitingQueuePolicy();

	/**
	 * Returns a new object of class '<em>Priority Waiting Queue Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority Waiting Queue Policy</em>'.
	 * @generated
	 */
	PriorityWaitingQueuePolicy createPriorityWaitingQueuePolicy();

	/**
	 * Returns a new object of class '<em>CAN Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAN Network Protocol</em>'.
	 * @generated
	 */
	CANNetworkProtocol createCANNetworkProtocol();

	/**
	 * Returns a new object of class '<em>AFDX Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AFDX Network Protocol</em>'.
	 * @generated
	 */
	AFDXNetworkProtocol createAFDXNetworkProtocol();

	/**
	 * Returns a new object of class '<em>ATM Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATM Network Protocol</em>'.
	 * @generated
	 */
	ATMNetworkProtocol createATMNetworkProtocol();

	/**
	 * Returns a new object of class '<em>FIP Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FIP Network Protocol</em>'.
	 * @generated
	 */
	FIPNetworkProtocol createFIPNetworkProtocol();

	/**
	 * Returns a new object of class '<em>FDDI Network Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FDDI Network Protocol</em>'.
	 * @generated
	 */
	FDDINetworkProtocol createFDDINetworkProtocol();

	/**
	 * Returns a new object of class '<em>Fixed Priority Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Priority Scheduling Policy</em>'.
	 * @generated
	 */
	FixedPrioritySchedulingPolicy createFixedPrioritySchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Least Laxity First Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Least Laxity First Scheduling Policy</em>'.
	 * @generated
	 */
	LeastLaxityFirstSchedulingPolicy createLeastLaxityFirstSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Round Robin Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Robin Scheduling Policy</em>'.
	 * @generated
	 */
	RoundRobinSchedulingPolicy createRoundRobinSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Earliest Deadline First Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earliest Deadline First Scheduling Policy</em>'.
	 * @generated
	 */
	EarliestDeadlineFirstSchedulingPolicy createEarliestDeadlineFirstSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Pipe Communication Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipe Communication Mechanism</em>'.
	 * @generated
	 */
	PipeCommunicationMechanism createPipeCommunicationMechanism();

	/**
	 * Returns a new object of class '<em>Data Queue Communication Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Queue Communication Mechanism</em>'.
	 * @generated
	 */
	DataQueueCommunicationMechanism createDataQueueCommunicationMechanism();

	/**
	 * Returns a new object of class '<em>Full Duplex Transmission Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Duplex Transmission Mode</em>'.
	 * @generated
	 */
	FullDuplexTransmissionMode createFullDuplexTransmissionMode();

	/**
	 * Returns a new object of class '<em>Half Duplex Transmission Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Half Duplex Transmission Mode</em>'.
	 * @generated
	 */
	HalfDuplexTransmissionMode createHalfDuplexTransmissionMode();

	/**
	 * Returns a new object of class '<em>Simple Transmission Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Transmission Mode</em>'.
	 * @generated
	 */
	SimpleTransmissionMode createSimpleTransmissionMode();

	/**
	 * Returns a new object of class '<em>ICPP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICPP Protect Protocol</em>'.
	 * @generated
	 */
	ICPPProtectProtocol createICPPProtectProtocol();

	/**
	 * Returns a new object of class '<em>OCPP Protect Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OCPP Protect Protocol</em>'.
	 * @generated
	 */
	OCPPProtectProtocol createOCPPProtectProtocol();

	/**
	 * Returns a new object of class '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * @generated
	 */
	DeadlineMonotonicSchedulingPolicy createDeadlineMonotonicSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Rate Monotonic Scheduling Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate Monotonic Scheduling Policy</em>'.
	 * @generated
	 */
	RateMonotonicSchedulingPolicy createRateMonotonicSchedulingPolicy();

	/**
	 * Returns a new object of class '<em>Partitioned Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partitioned Task Allocation</em>'.
	 * @generated
	 */
	PartitionedTaskAllocation createPartitionedTaskAllocation();

	/**
	 * Returns a new object of class '<em>Full Migration Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Full Migration Task Allocation</em>'.
	 * @generated
	 */
	FullMigrationTaskAllocation createFullMigrationTaskAllocation();

	/**
	 * Returns a new object of class '<em>Restricted Migration Task Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restricted Migration Task Allocation</em>'.
	 * @generated
	 */
	RestrictedMigrationTaskAllocation createRestrictedMigrationTaskAllocation();

	/**
	 * Returns a new object of class '<em>Heterogenous Multiprocessor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heterogenous Multiprocessor Category</em>'.
	 * @generated
	 */
	HeterogenousMultiprocessorCategory createHeterogenousMultiprocessorCategory();

	/**
	 * Returns a new object of class '<em>Homogeneous Multiprocessor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Homogeneous Multiprocessor Category</em>'.
	 * @generated
	 */
	HomogeneousMultiprocessorCategory createHomogeneousMultiprocessorCategory();

	/**
	 * Returns a new object of class '<em>Uniform Multiprocessor Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform Multiprocessor Category</em>'.
	 * @generated
	 */
	UniformMultiprocessorCategory createUniformMultiprocessorCategory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RtpProtocolsAndPoliciesPackage getRtpProtocolsAndPoliciesPackage();

} //RtpProtocolsAndPoliciesFactory
