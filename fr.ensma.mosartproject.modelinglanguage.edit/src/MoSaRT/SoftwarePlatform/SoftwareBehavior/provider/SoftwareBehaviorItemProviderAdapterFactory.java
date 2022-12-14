/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.provider;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorAdapterFactory;

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
public class SoftwareBehaviorItemProviderAdapterFactory extends SoftwareBehaviorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SoftwareBehaviorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalBehaviorItemProvider globalBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGlobalBehaviorAdapter() {
		if (globalBehaviorItemProvider == null) {
			globalBehaviorItemProvider = new GlobalBehaviorItemProvider(this);
		}

		return globalBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbTimeTriggerItemProvider sbTimeTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbTimeTriggerAdapter() {
		if (sbTimeTriggerItemProvider == null) {
			sbTimeTriggerItemProvider = new SbTimeTriggerItemProvider(this);
		}

		return sbTimeTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbExternalEventTriggerItemProvider sbExternalEventTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbExternalEventTriggerAdapter() {
		if (sbExternalEventTriggerItemProvider == null) {
			sbExternalEventTriggerItemProvider = new SbExternalEventTriggerItemProvider(this);
		}

		return sbExternalEventTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbTaskActivityItemProvider sbTaskActivityItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbTaskActivityAdapter() {
		if (sbTaskActivityItemProvider == null) {
			sbTaskActivityItemProvider = new SbTaskActivityItemProvider(this);
		}

		return sbTaskActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbPrecedenceRelationItemProvider sbPrecedenceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbPrecedenceRelationAdapter() {
		if (sbPrecedenceRelationItemProvider == null) {
			sbPrecedenceRelationItemProvider = new SbPrecedenceRelationItemProvider(this);
		}

		return sbPrecedenceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbCommunicationRelationItemProvider sbCommunicationRelationItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbCommunicationRelationAdapter() {
		if (sbCommunicationRelationItemProvider == null) {
			sbCommunicationRelationItemProvider = new SbCommunicationRelationItemProvider(this);
		}

		return sbCommunicationRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbAcquireStepItemProvider sbAcquireStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbAcquireStepAdapter() {
		if (sbAcquireStepItemProvider == null) {
			sbAcquireStepItemProvider = new SbAcquireStepItemProvider(this);
		}

		return sbAcquireStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbSendStepItemProvider sbSendStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbSendStepAdapter() {
		if (sbSendStepItemProvider == null) {
			sbSendStepItemProvider = new SbSendStepItemProvider(this);
		}

		return sbSendStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbReceiveStepItemProvider sbReceiveStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbReceiveStepAdapter() {
		if (sbReceiveStepItemProvider == null) {
			sbReceiveStepItemProvider = new SbReceiveStepItemProvider(this);
		}

		return sbReceiveStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbWriteStepItemProvider sbWriteStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbWriteStepAdapter() {
		if (sbWriteStepItemProvider == null) {
			sbWriteStepItemProvider = new SbWriteStepItemProvider(this);
		}

		return sbWriteStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbReleaseStepItemProvider sbReleaseStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbReleaseStepAdapter() {
		if (sbReleaseStepItemProvider == null) {
			sbReleaseStepItemProvider = new SbReleaseStepItemProvider(this);
		}

		return sbReleaseStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbReadStepItemProvider sbReadStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbReadStepAdapter() {
		if (sbReadStepItemProvider == null) {
			sbReadStepItemProvider = new SbReadStepItemProvider(this);
		}

		return sbReadStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbStepPrecedenceRelationItemProvider sbStepPrecedenceRelationItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbStepPrecedenceRelationAdapter() {
		if (sbStepPrecedenceRelationItemProvider == null) {
			sbStepPrecedenceRelationItemProvider = new SbStepPrecedenceRelationItemProvider(this);
		}

		return sbStepPrecedenceRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbActionStepItemProvider sbActionStepItemProvider;

	/**
	 * This creates an adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSbActionStepAdapter() {
		if (sbActionStepItemProvider == null) {
			sbActionStepItemProvider = new SbActionStepItemProvider(this);
		}

		return sbActionStepItemProvider;
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
		if (globalBehaviorItemProvider != null) globalBehaviorItemProvider.dispose();
		if (sbTimeTriggerItemProvider != null) sbTimeTriggerItemProvider.dispose();
		if (sbExternalEventTriggerItemProvider != null) sbExternalEventTriggerItemProvider.dispose();
		if (sbTaskActivityItemProvider != null) sbTaskActivityItemProvider.dispose();
		if (sbPrecedenceRelationItemProvider != null) sbPrecedenceRelationItemProvider.dispose();
		if (sbCommunicationRelationItemProvider != null) sbCommunicationRelationItemProvider.dispose();
		if (sbAcquireStepItemProvider != null) sbAcquireStepItemProvider.dispose();
		if (sbSendStepItemProvider != null) sbSendStepItemProvider.dispose();
		if (sbReceiveStepItemProvider != null) sbReceiveStepItemProvider.dispose();
		if (sbWriteStepItemProvider != null) sbWriteStepItemProvider.dispose();
		if (sbReleaseStepItemProvider != null) sbReleaseStepItemProvider.dispose();
		if (sbReadStepItemProvider != null) sbReadStepItemProvider.dispose();
		if (sbStepPrecedenceRelationItemProvider != null) sbStepPrecedenceRelationItemProvider.dispose();
		if (sbActionStepItemProvider != null) sbActionStepItemProvider.dispose();
	}

}
