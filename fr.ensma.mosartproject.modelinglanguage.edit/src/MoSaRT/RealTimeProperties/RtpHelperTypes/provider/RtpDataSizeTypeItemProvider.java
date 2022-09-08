/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.provider;


import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesFactory;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.provider.MeasuredRealItemProvider;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.provider.SimpleRealItemProvider;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.provider.UnknownRealItemProvider;

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
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpDataSizeTypeItemProvider
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
	public RtpDataSizeTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_RtpDataSizeType_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpDataSizeType_unit_feature", "_UI_RtpDataSizeType_type"),
				 RtpHelperTypesPackage.Literals.RTP_DATA_SIZE_TYPE__UNIT,
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
			childrenFeatures.add(RtpHelperTypesPackage.Literals.RTP_DATA_SIZE_TYPE__VALUE);
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
	 * This returns RtpDataSizeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtpDataSizeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		try{
		DataSizeUnits labelValue1 = ((RtpDataSizeType)object).getUnit();
		RealVariable labelValue2 = ((RtpDataSizeType)object).getValue();
		String labelValue = "value = ";
		
		if (labelValue2==null) return "";
		
		else{
		if (labelValue2 instanceof MeasuredReal) {
			MeasuredRealItemProvider extItemProvider = new MeasuredRealItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue2));
		}
		
		if (labelValue2 instanceof UnknownReal) {
			UnknownRealItemProvider extItemProvider = new UnknownRealItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue2));
		}
		
		if (labelValue2 instanceof SimpleReal) {
			SimpleRealItemProvider extItemProvider = new SimpleRealItemProvider(adapterFactory);
			labelValue= labelValue.concat(extItemProvider.getText(labelValue2));
		}
		
		labelValue = labelValue.concat(", unit = "+labelValue1.toString());
		
		return labelValue;
		}
		}catch(NullPointerException e){ return "malformed";}
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

		switch (notification.getFeatureID(RtpDataSizeType.class)) {
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE:
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
				(RtpHelperTypesPackage.Literals.RTP_DATA_SIZE_TYPE__VALUE,
				 RtpUtilityTypesFactory.eINSTANCE.createMeasuredReal()));

		newChildDescriptors.add
			(createChildParameter
				(RtpHelperTypesPackage.Literals.RTP_DATA_SIZE_TYPE__VALUE,
				 RtpUtilityTypesFactory.eINSTANCE.createUnknownReal()));

		newChildDescriptors.add
			(createChildParameter
				(RtpHelperTypesPackage.Literals.RTP_DATA_SIZE_TYPE__VALUE,
				 RtpUtilityTypesFactory.eINSTANCE.createSimpleReal()));
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
