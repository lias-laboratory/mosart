/**
 */
package MoSaRT.HardwarePlatform.provider;


import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpNetworkPort;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesFactory;

import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;

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
 * This is the item provider adapter for a {@link MoSaRT.HardwarePlatform.HpNetworkPort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HpNetworkPortItemProvider 
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
	public HpNetworkPortItemProvider(AdapterFactory adapterFactory) {
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

			addCommChannelPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addFlowRatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comm Channel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HpNetworkPort_commChannel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HpNetworkPort_commChannel_feature", "_UI_HpNetworkPort_type"),
				 HardwarePlatformPackage.Literals.HP_NETWORK_PORT__COMM_CHANNEL,
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
				 getString("_UI_HpNetworkPort_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HpNetworkPort_name_feature", "_UI_HpNetworkPort_type"),
				 HardwarePlatformPackage.Literals.HP_NETWORK_PORT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Flow Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlowRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HpNetworkPort_flowRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HpNetworkPort_flowRate_feature", "_UI_HpNetworkPort_type"),
				 HardwarePlatformPackage.Literals.HP_NETWORK_PORT__FLOW_RATE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_FLOW_RATE);
			childrenFeatures.add(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL);
			childrenFeatures.add(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE);
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
	 * This returns HpNetworkPort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HpNetworkPort"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HpNetworkPort)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HpNetworkPort_type") :
			getString("_UI_HpNetworkPort_type") + " " + label;
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

		switch (notification.getFeatureID(HpNetworkPort.class)) {
			case HardwarePlatformPackage.HP_NETWORK_PORT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE:
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL:
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE:
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
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_FLOW_RATE,
				 RtpTypesFactory.eINSTANCE.createRtpFlowRateType()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createCANNetworkProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createAFDXNetworkProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createATMNetworkProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFIPNetworkProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFDDINetworkProtocol()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFullDuplexTransmissionMode()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createHalfDuplexTransmissionMode()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createSimpleTransmissionMode()));
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
