/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.provider;


import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesFactory;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpDataSizeTypeItemProvider;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

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
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataQueueCommunicationMechanismItemProvider
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
	public DataQueueCommunicationMechanismItemProvider(AdapterFactory adapterFactory) {
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

			addMechanismTypePropertyDescriptor(object);
			addOverwritingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mechanism Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMechanismTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtpCommunicationMechanismType_mechanismType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpCommunicationMechanismType_mechanismType_feature", "_UI_RtpCommunicationMechanismType_type"),
				 RtpProtocolsAndPoliciesPackage.Literals.RTP_COMMUNICATION_MECHANISM_TYPE__MECHANISM_TYPE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overwriting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverwritingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataQueueCommunicationMechanism_overwriting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataQueueCommunicationMechanism_overwriting_feature", "_UI_DataQueueCommunicationMechanism_type"),
				 RtpProtocolsAndPoliciesPackage.Literals.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(RtpProtocolsAndPoliciesPackage.Literals.RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE);
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
	 * This returns DataQueueCommunicationMechanism.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataQueueCommunicationMechanism"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		
		String label = "(Queuing)";
		
		try{
			String label1= ((DataQueueCommunicationMechanism)object).getMechanismType();
			label=label1.concat(label);
			if (((DataQueueCommunicationMechanism)object).isOverwriting()==true)
					{label=label.concat(" : Overwriting = True");}
			else {label=label.concat(" : Overwriting = False");}
		}catch(NullPointerException e){}
		
		try{
			
		RtpDataSizeType label2 = ((DataQueueCommunicationMechanism)object).getRtpDataSize();
		RtpDataSizeTypeItemProvider extItemprovider = new RtpDataSizeTypeItemProvider(adapterFactory);
		if (label2!=null)
		label=label.concat(", DataSize = ("+extItemprovider.getText(label2)+")");
			
		}catch(NullPointerException e){}
				
				
		return label; //== null || label.length() == 0 ?
			//getString("_UI_DataQueueCommunicationMechanism_type") :
			//getString("_UI_DataQueueCommunicationMechanism_type") + " " + label;
		
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

		switch (notification.getFeatureID(DataQueueCommunicationMechanism.class)) {
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__MECHANISM_TYPE:
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE:
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
				(RtpProtocolsAndPoliciesPackage.Literals.RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpDataSizeType()));
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
