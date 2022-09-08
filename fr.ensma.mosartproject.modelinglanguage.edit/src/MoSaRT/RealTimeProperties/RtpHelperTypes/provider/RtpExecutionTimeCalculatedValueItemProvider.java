/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.provider;


import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesFactory;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.provider.MoSaRTEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
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
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpExecutionTimeCalculatedValueItemProvider
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
	public RtpExecutionTimeCalculatedValueItemProvider(AdapterFactory adapterFactory) {
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

			addUnknownValueNamePropertyDescriptor(object);
			addToolUsedDescriptionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Unknown Value Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnknownValueNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtpExecutionTimeCalculatedValue_unknownValueName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpExecutionTimeCalculatedValue_unknownValueName_feature", "_UI_RtpExecutionTimeCalculatedValue_type"),
				 RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool Used Descriptions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolUsedDescriptionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtpExecutionTimeCalculatedValue_toolUsedDescriptions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpExecutionTimeCalculatedValue_toolUsedDescriptions_feature", "_UI_RtpExecutionTimeCalculatedValue_type"),
				 RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS,
				 false,
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
			childrenFeatures.add(RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE);
			childrenFeatures.add(RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES);
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
	 * This returns RtpExecutionTimeCalculatedValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtpExecutionTimeCalculatedValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		RtpExecutionTimeConcreteValue labelvalue1 = ((RtpExecutionTimeCalculatedValue)object).getValue();
		String labelvalue2 = ((RtpExecutionTimeCalculatedValue)object).getUnknownValueName();
		EList<String> labelvalue3 = ((RtpExecutionTimeCalculatedValue)object).getToolUsedDescriptions();
		EList<RtpExecutionTimeConcreteValue> labelvalue4 = ((RtpExecutionTimeCalculatedValue)object).getAllOldValues();
		
		String label= "CalculatedValue (value = " ;
		
		if ( labelvalue1 instanceof RtpExecutionTimeSimple){
			RtpExecutionTimeSimpleItemProvider extIemProvider = new RtpExecutionTimeSimpleItemProvider(adapterFactory);
			label = label.concat(extIemProvider.getText(labelvalue1)+", ");
		}
		
		if ( labelvalue1 instanceof RtpExecutionTimeMma){
			RtpExecutionTimeMmaItemProvider extIemProvider = new RtpExecutionTimeMmaItemProvider(adapterFactory);
			label = label.concat("("+extIemProvider.getText(labelvalue1)+"), ");
		}
		
		if ( labelvalue1 instanceof RtpExecutionTimeList){
			RtpExecutionTimeListItemProvider extIemProvider = new RtpExecutionTimeListItemProvider(adapterFactory);
			label = label.concat(extIemProvider.getText(labelvalue1)+", ");
		}
		
		if ( labelvalue1 instanceof RtpExecutionTimeInterval){
			RtpExecutionTimeIntervalItemProvider extIemProvider = new RtpExecutionTimeIntervalItemProvider(adapterFactory);
			label = label.concat(extIemProvider.getText(labelvalue1)+", ");
		}
		
		label = label.concat("unknownValueName = "+labelvalue2+", tools = [");
		
		for(int i=0; i<labelvalue3.size();i++){
			
			label=label.concat(labelvalue3.get(i));
			if (i== labelvalue3.size()-1) label=label.concat(" - ");
		}
		
		label=label.concat("], oldValues = [");
		
		for(int i=0; i<labelvalue4.size();i++){
			
			
			if ( labelvalue4.get(i) instanceof RtpExecutionTimeSimple){
				RtpExecutionTimeSimpleItemProvider extIemProvider = new RtpExecutionTimeSimpleItemProvider(adapterFactory);
				label = label.concat(extIemProvider.getText(labelvalue4.get(i))+", ");
			}
			
			if ( labelvalue4.get(i) instanceof RtpExecutionTimeMma){
				RtpExecutionTimeMmaItemProvider extIemProvider = new RtpExecutionTimeMmaItemProvider(adapterFactory);
				label = label.concat("("+extIemProvider.getText(labelvalue4.get(i))+"), ");
			}
			
			if ( labelvalue4.get(i) instanceof RtpExecutionTimeList){
				RtpExecutionTimeListItemProvider extIemProvider = new RtpExecutionTimeListItemProvider(adapterFactory);
				label = label.concat(extIemProvider.getText(labelvalue4.get(i))+", ");
			}
			
			if ( labelvalue4.get(i) instanceof RtpExecutionTimeInterval){
				RtpExecutionTimeIntervalItemProvider extIemProvider = new RtpExecutionTimeIntervalItemProvider(adapterFactory);
				label = label.concat(extIemProvider.getText(labelvalue4.get(i))+", ");
			}
			
			if (i<labelvalue4.size()-1) label=label.concat(" - ");
		}
		
		label=label.concat("])");
		
		return label == null || label.length() == 0 ?
			//getString("_UI_RtpExecutionTimeCalculatedValue_type") :
			//getString("_UI_RtpExecutionTimeCalculatedValue_type") + " " + label;
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

		switch (notification.getFeatureID(RtpExecutionTimeCalculatedValue.class)) {
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME:
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE:
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES:
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
				(RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeList()));

		newChildDescriptors.add
			(createChildParameter
				(RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeSimple()));

		newChildDescriptors.add
			(createChildParameter
				(RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeMma()));

		newChildDescriptors.add
			(createChildParameter
				(RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE,
				 RtpHelperTypesFactory.eINSTANCE.createRtpExecutionTimeInterval()));
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
