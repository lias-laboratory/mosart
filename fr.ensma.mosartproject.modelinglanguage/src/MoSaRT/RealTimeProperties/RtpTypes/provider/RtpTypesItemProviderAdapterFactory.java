/**
 */
package MoSaRT.RealTimeProperties.RtpTypes.provider;

import MoSaRT.RealTimeProperties.RtpTypes.util.RtpTypesAdapterFactory;

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
public class RtpTypesItemProviderAdapterFactory extends RtpTypesAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public RtpTypesItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpPriorityTypeItemProvider rtpPriorityTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpPriorityTypeAdapter() {
		if (rtpPriorityTypeItemProvider == null) {
			rtpPriorityTypeItemProvider = new RtpPriorityTypeItemProvider(this);
		}

		return rtpPriorityTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpPeriodicTypeItemProvider rtpPeriodicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpPeriodicTypeAdapter() {
		if (rtpPeriodicTypeItemProvider == null) {
			rtpPeriodicTypeItemProvider = new RtpPeriodicTypeItemProvider(this);
		}

		return rtpPeriodicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpAperiodicTypeItemProvider rtpAperiodicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpAperiodicTypeAdapter() {
		if (rtpAperiodicTypeItemProvider == null) {
			rtpAperiodicTypeItemProvider = new RtpAperiodicTypeItemProvider(this);
		}

		return rtpAperiodicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpSporadicTypeItemProvider rtpSporadicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpSporadicTypeAdapter() {
		if (rtpSporadicTypeItemProvider == null) {
			rtpSporadicTypeItemProvider = new RtpSporadicTypeItemProvider(this);
		}

		return rtpSporadicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpReleaseTimeTypeItemProvider rtpReleaseTimeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpReleaseTimeTypeAdapter() {
		if (rtpReleaseTimeTypeItemProvider == null) {
			rtpReleaseTimeTypeItemProvider = new RtpReleaseTimeTypeItemProvider(this);
		}

		return rtpReleaseTimeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpOffsetTypeItemProvider rtpOffsetTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpOffsetTypeAdapter() {
		if (rtpOffsetTypeItemProvider == null) {
			rtpOffsetTypeItemProvider = new RtpOffsetTypeItemProvider(this);
		}

		return rtpOffsetTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpMutuExcluResourceUtilizationTypeItemProvider rtpMutuExcluResourceUtilizationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpMutuExcluResourceUtilizationTypeAdapter() {
		if (rtpMutuExcluResourceUtilizationTypeItemProvider == null) {
			rtpMutuExcluResourceUtilizationTypeItemProvider = new RtpMutuExcluResourceUtilizationTypeItemProvider(this);
		}

		return rtpMutuExcluResourceUtilizationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpDeadlineTypeItemProvider rtpDeadlineTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpDeadlineTypeAdapter() {
		if (rtpDeadlineTypeItemProvider == null) {
			rtpDeadlineTypeItemProvider = new RtpDeadlineTypeItemProvider(this);
		}

		return rtpDeadlineTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpResponseTimeTypeItemProvider rtpResponseTimeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpResponseTimeTypeAdapter() {
		if (rtpResponseTimeTypeItemProvider == null) {
			rtpResponseTimeTypeItemProvider = new RtpResponseTimeTypeItemProvider(this);
		}

		return rtpResponseTimeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpBlockingTimeTypeItemProvider rtpBlockingTimeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpBlockingTimeTypeAdapter() {
		if (rtpBlockingTimeTypeItemProvider == null) {
			rtpBlockingTimeTypeItemProvider = new RtpBlockingTimeTypeItemProvider(this);
		}

		return rtpBlockingTimeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpRepetitionTypeItemProvider rtpRepetitionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpRepetitionTypeAdapter() {
		if (rtpRepetitionTypeItemProvider == null) {
			rtpRepetitionTypeItemProvider = new RtpRepetitionTypeItemProvider(this);
		}

		return rtpRepetitionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpFlowRateTypeItemProvider rtpFlowRateTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpFlowRateTypeAdapter() {
		if (rtpFlowRateTypeItemProvider == null) {
			rtpFlowRateTypeItemProvider = new RtpFlowRateTypeItemProvider(this);
		}

		return rtpFlowRateTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpUtilizationFactorTypeItemProvider rtpUtilizationFactorTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpUtilizationFactorTypeAdapter() {
		if (rtpUtilizationFactorTypeItemProvider == null) {
			rtpUtilizationFactorTypeItemProvider = new RtpUtilizationFactorTypeItemProvider(this);
		}

		return rtpUtilizationFactorTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpExecutionTimeTypeItemProvider rtpExecutionTimeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpExecutionTimeTypeAdapter() {
		if (rtpExecutionTimeTypeItemProvider == null) {
			rtpExecutionTimeTypeItemProvider = new RtpExecutionTimeTypeItemProvider(this);
		}

		return rtpExecutionTimeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpCriticalityTypeItemProvider rtpCriticalityTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpCriticalityTypeAdapter() {
		if (rtpCriticalityTypeItemProvider == null) {
			rtpCriticalityTypeItemProvider = new RtpCriticalityTypeItemProvider(this);
		}

		return rtpCriticalityTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpComputingSpeedTypeItemProvider rtpComputingSpeedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpComputingSpeedTypeAdapter() {
		if (rtpComputingSpeedTypeItemProvider == null) {
			rtpComputingSpeedTypeItemProvider = new RtpComputingSpeedTypeItemProvider(this);
		}

		return rtpComputingSpeedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpPreemptibleTypeItemProvider rtpPreemptibleTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpPreemptibleTypeAdapter() {
		if (rtpPreemptibleTypeItemProvider == null) {
			rtpPreemptibleTypeItemProvider = new RtpPreemptibleTypeItemProvider(this);
		}

		return rtpPreemptibleTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpNonPreemptibleTypeItemProvider rtpNonPreemptibleTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpNonPreemptibleTypeAdapter() {
		if (rtpNonPreemptibleTypeItemProvider == null) {
			rtpNonPreemptibleTypeItemProvider = new RtpNonPreemptibleTypeItemProvider(this);
		}

		return rtpNonPreemptibleTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpCooperativeTypeItemProvider rtpCooperativeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpCooperativeTypeAdapter() {
		if (rtpCooperativeTypeItemProvider == null) {
			rtpCooperativeTypeItemProvider = new RtpCooperativeTypeItemProvider(this);
		}

		return rtpCooperativeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpSelfSuspendedTypeItemProvider rtpSelfSuspendedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpSelfSuspendedTypeAdapter() {
		if (rtpSelfSuspendedTypeItemProvider == null) {
			rtpSelfSuspendedTypeItemProvider = new RtpSelfSuspendedTypeItemProvider(this);
		}

		return rtpSelfSuspendedTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpNotSelfSuspendedTypeItemProvider rtpNotSelfSuspendedTypeItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRtpNotSelfSuspendedTypeAdapter() {
		if (rtpNotSelfSuspendedTypeItemProvider == null) {
			rtpNotSelfSuspendedTypeItemProvider = new RtpNotSelfSuspendedTypeItemProvider(this);
		}

		return rtpNotSelfSuspendedTypeItemProvider;
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
		if (rtpPriorityTypeItemProvider != null) rtpPriorityTypeItemProvider.dispose();
		if (rtpPeriodicTypeItemProvider != null) rtpPeriodicTypeItemProvider.dispose();
		if (rtpAperiodicTypeItemProvider != null) rtpAperiodicTypeItemProvider.dispose();
		if (rtpSporadicTypeItemProvider != null) rtpSporadicTypeItemProvider.dispose();
		if (rtpReleaseTimeTypeItemProvider != null) rtpReleaseTimeTypeItemProvider.dispose();
		if (rtpOffsetTypeItemProvider != null) rtpOffsetTypeItemProvider.dispose();
		if (rtpMutuExcluResourceUtilizationTypeItemProvider != null) rtpMutuExcluResourceUtilizationTypeItemProvider.dispose();
		if (rtpDeadlineTypeItemProvider != null) rtpDeadlineTypeItemProvider.dispose();
		if (rtpResponseTimeTypeItemProvider != null) rtpResponseTimeTypeItemProvider.dispose();
		if (rtpBlockingTimeTypeItemProvider != null) rtpBlockingTimeTypeItemProvider.dispose();
		if (rtpRepetitionTypeItemProvider != null) rtpRepetitionTypeItemProvider.dispose();
		if (rtpFlowRateTypeItemProvider != null) rtpFlowRateTypeItemProvider.dispose();
		if (rtpUtilizationFactorTypeItemProvider != null) rtpUtilizationFactorTypeItemProvider.dispose();
		if (rtpExecutionTimeTypeItemProvider != null) rtpExecutionTimeTypeItemProvider.dispose();
		if (rtpCriticalityTypeItemProvider != null) rtpCriticalityTypeItemProvider.dispose();
		if (rtpComputingSpeedTypeItemProvider != null) rtpComputingSpeedTypeItemProvider.dispose();
		if (rtpPreemptibleTypeItemProvider != null) rtpPreemptibleTypeItemProvider.dispose();
		if (rtpNonPreemptibleTypeItemProvider != null) rtpNonPreemptibleTypeItemProvider.dispose();
		if (rtpCooperativeTypeItemProvider != null) rtpCooperativeTypeItemProvider.dispose();
		if (rtpSelfSuspendedTypeItemProvider != null) rtpSelfSuspendedTypeItemProvider.dispose();
		if (rtpNotSelfSuspendedTypeItemProvider != null) rtpNotSelfSuspendedTypeItemProvider.dispose();
	}

}
