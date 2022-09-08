/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.provider;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.util.RtpProtocolsAndPoliciesAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpProtocolsAndPoliciesItemProviderAdapterFactory extends RtpProtocolsAndPoliciesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtocolsAndPoliciesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIPProtectProtocolItemProvider pipProtectProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPIPProtectProtocolAdapter() {
		if (pipProtectProtocolItemProvider == null) {
			pipProtectProtocolItemProvider = new PIPProtectProtocolItemProvider(this);
		}

		return pipProtectProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FIFOCommunicationArbitrationPolicyItemProvider fifoCommunicationArbitrationPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFIFOCommunicationArbitrationPolicyAdapter() {
		if (fifoCommunicationArbitrationPolicyItemProvider == null) {
			fifoCommunicationArbitrationPolicyItemProvider = new FIFOCommunicationArbitrationPolicyItemProvider(this);
		}

		return fifoCommunicationArbitrationPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPriorityCommunicationArbitrationPolicyItemProvider fixedPriorityCommunicationArbitrationPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedPriorityCommunicationArbitrationPolicyAdapter() {
		if (fixedPriorityCommunicationArbitrationPolicyItemProvider == null) {
			fixedPriorityCommunicationArbitrationPolicyItemProvider = new FixedPriorityCommunicationArbitrationPolicyItemProvider(this);
		}

		return fixedPriorityCommunicationArbitrationPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIFOCommunicationArbitrationPolicyItemProvider lifoCommunicationArbitrationPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLIFOCommunicationArbitrationPolicyAdapter() {
		if (lifoCommunicationArbitrationPolicyItemProvider == null) {
			lifoCommunicationArbitrationPolicyItemProvider = new LIFOCommunicationArbitrationPolicyItemProvider(this);
		}

		return lifoCommunicationArbitrationPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FIFOWaitingQueuePolicyItemProvider fifoWaitingQueuePolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFIFOWaitingQueuePolicyAdapter() {
		if (fifoWaitingQueuePolicyItemProvider == null) {
			fifoWaitingQueuePolicyItemProvider = new FIFOWaitingQueuePolicyItemProvider(this);
		}

		return fifoWaitingQueuePolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIFOWaitingQueuePolicyItemProvider lifoWaitingQueuePolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLIFOWaitingQueuePolicyAdapter() {
		if (lifoWaitingQueuePolicyItemProvider == null) {
			lifoWaitingQueuePolicyItemProvider = new LIFOWaitingQueuePolicyItemProvider(this);
		}

		return lifoWaitingQueuePolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorityWaitingQueuePolicyItemProvider priorityWaitingQueuePolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPriorityWaitingQueuePolicyAdapter() {
		if (priorityWaitingQueuePolicyItemProvider == null) {
			priorityWaitingQueuePolicyItemProvider = new PriorityWaitingQueuePolicyItemProvider(this);
		}

		return priorityWaitingQueuePolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CANNetworkProtocolItemProvider canNetworkProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCANNetworkProtocolAdapter() {
		if (canNetworkProtocolItemProvider == null) {
			canNetworkProtocolItemProvider = new CANNetworkProtocolItemProvider(this);
		}

		return canNetworkProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDXNetworkProtocolItemProvider afdxNetworkProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAFDXNetworkProtocolAdapter() {
		if (afdxNetworkProtocolItemProvider == null) {
			afdxNetworkProtocolItemProvider = new AFDXNetworkProtocolItemProvider(this);
		}

		return afdxNetworkProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATMNetworkProtocolItemProvider atmNetworkProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createATMNetworkProtocolAdapter() {
		if (atmNetworkProtocolItemProvider == null) {
			atmNetworkProtocolItemProvider = new ATMNetworkProtocolItemProvider(this);
		}

		return atmNetworkProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FIPNetworkProtocolItemProvider fipNetworkProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFIPNetworkProtocolAdapter() {
		if (fipNetworkProtocolItemProvider == null) {
			fipNetworkProtocolItemProvider = new FIPNetworkProtocolItemProvider(this);
		}

		return fipNetworkProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FDDINetworkProtocolItemProvider fddiNetworkProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFDDINetworkProtocolAdapter() {
		if (fddiNetworkProtocolItemProvider == null) {
			fddiNetworkProtocolItemProvider = new FDDINetworkProtocolItemProvider(this);
		}

		return fddiNetworkProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedPrioritySchedulingPolicyItemProvider fixedPrioritySchedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedPrioritySchedulingPolicyAdapter() {
		if (fixedPrioritySchedulingPolicyItemProvider == null) {
			fixedPrioritySchedulingPolicyItemProvider = new FixedPrioritySchedulingPolicyItemProvider(this);
		}

		return fixedPrioritySchedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeastLaxityFirstSchedulingPolicyItemProvider leastLaxityFirstSchedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLeastLaxityFirstSchedulingPolicyAdapter() {
		if (leastLaxityFirstSchedulingPolicyItemProvider == null) {
			leastLaxityFirstSchedulingPolicyItemProvider = new LeastLaxityFirstSchedulingPolicyItemProvider(this);
		}

		return leastLaxityFirstSchedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundRobinSchedulingPolicyItemProvider roundRobinSchedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoundRobinSchedulingPolicyAdapter() {
		if (roundRobinSchedulingPolicyItemProvider == null) {
			roundRobinSchedulingPolicyItemProvider = new RoundRobinSchedulingPolicyItemProvider(this);
		}

		return roundRobinSchedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarliestDeadlineFirstSchedulingPolicyItemProvider earliestDeadlineFirstSchedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEarliestDeadlineFirstSchedulingPolicyAdapter() {
		if (earliestDeadlineFirstSchedulingPolicyItemProvider == null) {
			earliestDeadlineFirstSchedulingPolicyItemProvider = new EarliestDeadlineFirstSchedulingPolicyItemProvider(this);
		}

		return earliestDeadlineFirstSchedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeCommunicationMechanismItemProvider pipeCommunicationMechanismItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipeCommunicationMechanismAdapter() {
		if (pipeCommunicationMechanismItemProvider == null) {
			pipeCommunicationMechanismItemProvider = new PipeCommunicationMechanismItemProvider(this);
		}

		return pipeCommunicationMechanismItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQueueCommunicationMechanismItemProvider dataQueueCommunicationMechanismItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataQueueCommunicationMechanismAdapter() {
		if (dataQueueCommunicationMechanismItemProvider == null) {
			dataQueueCommunicationMechanismItemProvider = new DataQueueCommunicationMechanismItemProvider(this);
		}

		return dataQueueCommunicationMechanismItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullDuplexTransmissionModeItemProvider fullDuplexTransmissionModeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFullDuplexTransmissionModeAdapter() {
		if (fullDuplexTransmissionModeItemProvider == null) {
			fullDuplexTransmissionModeItemProvider = new FullDuplexTransmissionModeItemProvider(this);
		}

		return fullDuplexTransmissionModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalfDuplexTransmissionModeItemProvider halfDuplexTransmissionModeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHalfDuplexTransmissionModeAdapter() {
		if (halfDuplexTransmissionModeItemProvider == null) {
			halfDuplexTransmissionModeItemProvider = new HalfDuplexTransmissionModeItemProvider(this);
		}

		return halfDuplexTransmissionModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTransmissionModeItemProvider simpleTransmissionModeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleTransmissionModeAdapter() {
		if (simpleTransmissionModeItemProvider == null) {
			simpleTransmissionModeItemProvider = new SimpleTransmissionModeItemProvider(this);
		}

		return simpleTransmissionModeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICPPProtectProtocolItemProvider icppProtectProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createICPPProtectProtocolAdapter() {
		if (icppProtectProtocolItemProvider == null) {
			icppProtectProtocolItemProvider = new ICPPProtectProtocolItemProvider(this);
		}

		return icppProtectProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCPPProtectProtocolItemProvider ocppProtectProtocolItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOCPPProtectProtocolAdapter() {
		if (ocppProtectProtocolItemProvider == null) {
			ocppProtectProtocolItemProvider = new OCPPProtectProtocolItemProvider(this);
		}

		return ocppProtectProtocolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlineMonotonicSchedulingPolicyItemProvider deadlineMonotonicSchedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeadlineMonotonicSchedulingPolicyAdapter() {
		if (deadlineMonotonicSchedulingPolicyItemProvider == null) {
			deadlineMonotonicSchedulingPolicyItemProvider = new DeadlineMonotonicSchedulingPolicyItemProvider(this);
		}

		return deadlineMonotonicSchedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateMonotonicSchedulingPolicyItemProvider rateMonotonicSchedulingPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRateMonotonicSchedulingPolicyAdapter() {
		if (rateMonotonicSchedulingPolicyItemProvider == null) {
			rateMonotonicSchedulingPolicyItemProvider = new RateMonotonicSchedulingPolicyItemProvider(this);
		}

		return rateMonotonicSchedulingPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionedTaskAllocationItemProvider partitionedTaskAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartitionedTaskAllocationAdapter() {
		if (partitionedTaskAllocationItemProvider == null) {
			partitionedTaskAllocationItemProvider = new PartitionedTaskAllocationItemProvider(this);
		}

		return partitionedTaskAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullMigrationTaskAllocationItemProvider fullMigrationTaskAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFullMigrationTaskAllocationAdapter() {
		if (fullMigrationTaskAllocationItemProvider == null) {
			fullMigrationTaskAllocationItemProvider = new FullMigrationTaskAllocationItemProvider(this);
		}

		return fullMigrationTaskAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictedMigrationTaskAllocationItemProvider restrictedMigrationTaskAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRestrictedMigrationTaskAllocationAdapter() {
		if (restrictedMigrationTaskAllocationItemProvider == null) {
			restrictedMigrationTaskAllocationItemProvider = new RestrictedMigrationTaskAllocationItemProvider(this);
		}

		return restrictedMigrationTaskAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeterogenousMultiprocessorCategoryItemProvider heterogenousMultiprocessorCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeterogenousMultiprocessorCategoryAdapter() {
		if (heterogenousMultiprocessorCategoryItemProvider == null) {
			heterogenousMultiprocessorCategoryItemProvider = new HeterogenousMultiprocessorCategoryItemProvider(this);
		}

		return heterogenousMultiprocessorCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomogeneousMultiprocessorCategoryItemProvider homogeneousMultiprocessorCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHomogeneousMultiprocessorCategoryAdapter() {
		if (homogeneousMultiprocessorCategoryItemProvider == null) {
			homogeneousMultiprocessorCategoryItemProvider = new HomogeneousMultiprocessorCategoryItemProvider(this);
		}

		return homogeneousMultiprocessorCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformMultiprocessorCategoryItemProvider uniformMultiprocessorCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUniformMultiprocessorCategoryAdapter() {
		if (uniformMultiprocessorCategoryItemProvider == null) {
			uniformMultiprocessorCategoryItemProvider = new UniformMultiprocessorCategoryItemProvider(this);
		}

		return uniformMultiprocessorCategoryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (pipProtectProtocolItemProvider != null) pipProtectProtocolItemProvider.dispose();
		if (fifoCommunicationArbitrationPolicyItemProvider != null) fifoCommunicationArbitrationPolicyItemProvider.dispose();
		if (fixedPriorityCommunicationArbitrationPolicyItemProvider != null) fixedPriorityCommunicationArbitrationPolicyItemProvider.dispose();
		if (lifoCommunicationArbitrationPolicyItemProvider != null) lifoCommunicationArbitrationPolicyItemProvider.dispose();
		if (fifoWaitingQueuePolicyItemProvider != null) fifoWaitingQueuePolicyItemProvider.dispose();
		if (lifoWaitingQueuePolicyItemProvider != null) lifoWaitingQueuePolicyItemProvider.dispose();
		if (priorityWaitingQueuePolicyItemProvider != null) priorityWaitingQueuePolicyItemProvider.dispose();
		if (canNetworkProtocolItemProvider != null) canNetworkProtocolItemProvider.dispose();
		if (afdxNetworkProtocolItemProvider != null) afdxNetworkProtocolItemProvider.dispose();
		if (atmNetworkProtocolItemProvider != null) atmNetworkProtocolItemProvider.dispose();
		if (fipNetworkProtocolItemProvider != null) fipNetworkProtocolItemProvider.dispose();
		if (fddiNetworkProtocolItemProvider != null) fddiNetworkProtocolItemProvider.dispose();
		if (fixedPrioritySchedulingPolicyItemProvider != null) fixedPrioritySchedulingPolicyItemProvider.dispose();
		if (leastLaxityFirstSchedulingPolicyItemProvider != null) leastLaxityFirstSchedulingPolicyItemProvider.dispose();
		if (roundRobinSchedulingPolicyItemProvider != null) roundRobinSchedulingPolicyItemProvider.dispose();
		if (earliestDeadlineFirstSchedulingPolicyItemProvider != null) earliestDeadlineFirstSchedulingPolicyItemProvider.dispose();
		if (pipeCommunicationMechanismItemProvider != null) pipeCommunicationMechanismItemProvider.dispose();
		if (dataQueueCommunicationMechanismItemProvider != null) dataQueueCommunicationMechanismItemProvider.dispose();
		if (fullDuplexTransmissionModeItemProvider != null) fullDuplexTransmissionModeItemProvider.dispose();
		if (halfDuplexTransmissionModeItemProvider != null) halfDuplexTransmissionModeItemProvider.dispose();
		if (simpleTransmissionModeItemProvider != null) simpleTransmissionModeItemProvider.dispose();
		if (icppProtectProtocolItemProvider != null) icppProtectProtocolItemProvider.dispose();
		if (ocppProtectProtocolItemProvider != null) ocppProtectProtocolItemProvider.dispose();
		if (deadlineMonotonicSchedulingPolicyItemProvider != null) deadlineMonotonicSchedulingPolicyItemProvider.dispose();
		if (rateMonotonicSchedulingPolicyItemProvider != null) rateMonotonicSchedulingPolicyItemProvider.dispose();
		if (partitionedTaskAllocationItemProvider != null) partitionedTaskAllocationItemProvider.dispose();
		if (fullMigrationTaskAllocationItemProvider != null) fullMigrationTaskAllocationItemProvider.dispose();
		if (restrictedMigrationTaskAllocationItemProvider != null) restrictedMigrationTaskAllocationItemProvider.dispose();
		if (heterogenousMultiprocessorCategoryItemProvider != null) heterogenousMultiprocessorCategoryItemProvider.dispose();
		if (homogeneousMultiprocessorCategoryItemProvider != null) homogeneousMultiprocessorCategoryItemProvider.dispose();
		if (uniformMultiprocessorCategoryItemProvider != null) uniformMultiprocessorCategoryItemProvider.dispose();
	}

}