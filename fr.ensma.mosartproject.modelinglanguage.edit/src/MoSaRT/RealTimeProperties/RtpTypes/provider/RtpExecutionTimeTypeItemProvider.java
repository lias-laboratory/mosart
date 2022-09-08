/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.provider;


import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesFactory;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpExecutionTimeCalculatedValueItemProvider;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpExecutionTimeIntervalItemProvider;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpExecutionTimeListItemProvider;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpExecutionTimeMmaItemProvider;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpExecutionTimeSimpleItemProvider;
import MoSaRT.RealTimeProperties.RtpHelperTypes.provider.RtpExecutionTimeValueToBeCalculatedItemProvider;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;

import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

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
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpExecutionTimeTypeItemProvider
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
	public RtpExecutionTimeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtpExecutionTimeType_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpExecutionTimeType_unit_feature", "_UI_RtpExecutionTimeType_type"),
				 RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__UNIT,
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
			childrenFeatures.add(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE);
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
	 * This returns RtpExecutionTimeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtpExecutionTimeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
				
		String labelValue="";
		RtpExecutionTimeValue labelValue1 = ((RtpExecutionTimeType)object).getValue();
		TimeUnits labelValue2 = ((RtpExecutionTimeType)object).getUnit();
		
		if( ((RtpExecutionTimeType)object).eContainer().eClass().toString().contains("SelfSuspended")){
			
			labelValue = "Suspension Time (value = ";
			
		}
		
		else{
		
		 labelValue = "Execution Time (value = ";
		 
		}
		
		if(labelValue1 instanceof RtpExecutionTimeSimple){
		RtpExecutionTimeSimpleItemProvider extItemProvider=new RtpExecutionTimeSimpleItemProvider(adapterFactory);
		labelValue= labelValue.concat(extItemProvider.getText(labelValue1));
		}
		
		if(labelValue1 instanceof RtpExecutionTimeList){
			RtpExecutionTimeListItemProvider extItemProvider=new RtpExecutionTimeListItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue1));
		}
		
		if(labelValue1 instanceof RtpExecutionTimeMma){
			RtpExecutionTimeMmaItemProvider extItemProvider=new RtpExecutionTimeMmaItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue1));
		}
		
		if(labelValue1 instanceof RtpExecutionTimeInterval){
			RtpExecutionTimeIntervalItemProvider extItemProvider=new RtpExecutionTimeIntervalItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue1));
		}
		
		if(labelValue1 instanceof RtpExecutionTimeValueToBeCalculated){
			RtpExecutionTimeValueToBeCalculatedItemProvider extItemProvider=new RtpExecutionTimeValueToBeCalculatedItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue1));
		}
		
		if(labelValue1 instanceof RtpExecutionTimeCalculatedValue){
			RtpExecutionTimeCalculatedValueItemProvider extItemProvider=new RtpExecutionTimeCalculatedValueItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue1));
		}
		
		labelValue = labelValue.concat(", unit = "+labelValue2.toString()+")");
		

		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			//getString("_UI_RtpExecutionTimeType_type") :
			//getString("_UI_RtpExecutionTimeType_type") + " " + label;
				"malformed": label;
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

		switch (notification.getFeatureID(RtpExecutionTimeType.class)) {
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE:
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
				(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeList()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeSimple()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeMma()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeInterval()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeValueToBeCalculated()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeCalculatedValue()));
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
