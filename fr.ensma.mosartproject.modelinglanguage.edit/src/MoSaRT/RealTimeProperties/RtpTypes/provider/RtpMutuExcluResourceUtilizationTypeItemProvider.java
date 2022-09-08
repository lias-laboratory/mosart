/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.provider;


import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesFactory;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpDurationTypeItemProvider;

import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.provider.SoLocalCommResourceItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareOperators.provider.SoMutualExclusionResourceItemProvider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpMutuExcluResourceUtilizationTypeItemProvider
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
	public RtpMutuExcluResourceUtilizationTypeItemProvider(AdapterFactory adapterFactory) {
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

			addResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtpMutuExcluResourceUtilizationType_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpMutuExcluResourceUtilizationType_resource_feature", "_UI_RtpMutuExcluResourceUtilizationType_type"),
				 RtpTypesPackage.Literals.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE,
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
			childrenFeatures.add(RtpTypesPackage.Literals.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION);
			childrenFeatures.add(RtpTypesPackage.Literals.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY);
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
	 * This returns RtpMutuExcluResourceUtilizationType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtpMutuExcluResourceUtilizationType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		//return getString("_UI_RtpMutuExcluResourceUtilizationType_type");
		String label="Utilization Detail of <";
		try{
		
			SoInteractionResource labelValue2 = ((RtpMutuExcluResourceUtilizationType)object).getResource();
			
			if (labelValue2 instanceof SoLocalCommResource){
				
				SoLocalCommResourceItemProvider extItemprovider = new SoLocalCommResourceItemProvider(adapterFactory);
				label=label.concat(""+extItemprovider.getText(labelValue2)+"> :");
				
			}
			
			if (labelValue2 instanceof SoMutualExclusionResource){
				
				SoMutualExclusionResourceItemProvider extItemprovider = new SoMutualExclusionResourceItemProvider(adapterFactory);
				label=label.concat(""+extItemprovider.getText(labelValue2)+"> :");	
			}
		}catch(NullPointerException e){}
		
		
		
		try{
		RtpDurationType labelValue1 = ((RtpMutuExcluResourceUtilizationType)object).getTimeUtilization();
		RtpDurationTypeItemProvider extItemprovider = new RtpDurationTypeItemProvider(adapterFactory);
		
		label=label.concat("AccessTime = ("+extItemprovider.getText(labelValue1)+")");	
		}catch(NullPointerException e){}
		
		
		try{
			RtpPriorityType labelValue3 = ((RtpMutuExcluResourceUtilizationType)object).getSpecialAccessPriority();
			RtpPriorityTypeItemProvider extItemprovider = new RtpPriorityTypeItemProvider(adapterFactory);
			if(labelValue3.getValue() != null){
			label=label.concat(", SpecialAccessPriority = "+extItemprovider.getText(labelValue3));}
			}catch(NullPointerException e){}
		
		return label;
		
		
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RtpMutuExcluResourceUtilizationType.class)) {
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE:
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION:
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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
				(RtpTypesPackage.Literals.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION,
				 RtpHelperTypesFactory.eINSTANCE.createRtpDurationType()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY,
				 RtpTypesFactory.eINSTANCE.createRtpPriorityType()));
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
