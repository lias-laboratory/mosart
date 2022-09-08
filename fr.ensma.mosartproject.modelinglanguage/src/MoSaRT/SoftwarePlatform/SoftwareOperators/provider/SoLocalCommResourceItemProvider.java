/**
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.provider;


import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesFactory;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.provider.MoSaRTEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoLocalCommResourceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoLocalCommResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addWriterTasksPropertyDescriptor(object);
			addReaderTasksPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Writer Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriterTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoCommunicationResource_writerTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoCommunicationResource_writerTasks_feature", "_UI_SoCommunicationResource_type"),
				 SoftwareOperatorsPackage.Literals.SO_COMMUNICATION_RESOURCE__WRITER_TASKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reader Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReaderTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoCommunicationResource_readerTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoCommunicationResource_readerTasks_feature", "_UI_SoCommunicationResource_type"),
				 SoftwareOperatorsPackage.Literals.SO_COMMUNICATION_RESOURCE__READER_TASKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoLocalCommResource_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoLocalCommResource_name_feature", "_UI_SoLocalCommResource_type"),
				 SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SoLocalCommResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoLocalCommResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoLocalCommResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoLocalCommResource_type") :
			getString("_UI_SoLocalCommResource_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SoLocalCommResource.class)) {
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM:
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY:
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createPipeCommunicationMechanism()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createDataQueueCommunicationMechanism()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFIFOWaitingQueuePolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createLIFOWaitingQueuePolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createPriorityWaitingQueuePolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createPIPProtectProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createICPPProtectProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createOCPPProtectProtocol()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MoSaRTEditPlugin.INSTANCE;
	}

}
