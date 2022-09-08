/**
 */
package MoSaRT.HardwarePlatform.provider;


import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpFlowCarrier;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsFactory;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesFactory;

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
 * This is the item provider adapter for a {@link MoSaRT.HardwarePlatform.HpFlowCarrier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HpFlowCarrierItemProvider 
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
	public HpFlowCarrierItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addHpNetworkNodeTargetsPropertyDescriptor(object);
			addProcessingUnitOriginPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_HpFlowCarrier_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HpFlowCarrier_name_feature", "_UI_HpFlowCarrier_type"),
				 HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hp Network Node Targets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHpNetworkNodeTargetsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HpFlowCarrier_hpNetworkNodeTargets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HpFlowCarrier_hpNetworkNodeTargets_feature", "_UI_HpFlowCarrier_type"),
				 HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Unit Origin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingUnitOriginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HpFlowCarrier_processingUnitOrigin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HpFlowCarrier_processingUnitOrigin_feature", "_UI_HpFlowCarrier_type"),
				 HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN,
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
			childrenFeatures.add(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION);
			childrenFeatures.add(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION);
			childrenFeatures.add(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY);
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
	 * This returns HpFlowCarrier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HpFlowCarrier"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HpFlowCarrier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HpFlowCarrier_type") :
			getString("_UI_HpFlowCarrier_type") + " " + label;
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

		switch (notification.getFeatureID(HpFlowCarrier.class)) {
			case HardwarePlatformPackage.HP_FLOW_CARRIER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HardwarePlatformPackage.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION:
			case HardwarePlatformPackage.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION:
			case HardwarePlatformPackage.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY:
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
				(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION,
				 RtpComputationAndAnalysisFunctionsFactory.eINSTANCE.createPiecewiseLinearAnalysisFunction()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION,
				 RtpComputationAndAnalysisFunctionsFactory.eINSTANCE.createPiecewiseLinearAnalysisFunction()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFIFOCommunicationArbitrationPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFixedPriorityCommunicationArbitrationPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createLIFOCommunicationArbitrationPolicy()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION ||
			childFeature == HardwarePlatformPackage.Literals.HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
