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

import MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.provider.MoSaRTEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpPeriodicTypeItemProvider
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
	public RtpPeriodicTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(RtpTypesPackage.Literals.RTP_PERIODIC_TYPE__JITTER);
			childrenFeatures.add(RtpTypesPackage.Literals.RTP_PERIODIC_TYPE__PERIOD);
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
	 * This returns RtpPeriodicType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtpPeriodicType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		String label = "Periodic (";
		
		try{
		
		RtpDurationType labelValue1= ((RtpPeriodicType)object).getPeriod();
		
		RtpDurationTypeItemProvider extItemProvider= new  RtpDurationTypeItemProvider(adapterFactory);
		
		label=label.concat("period = ("+extItemProvider.getText(labelValue1)+")");
		}
		catch (NullPointerException e){}
		
		try{
			RtpDurationType labelValue2= ((RtpPeriodicType)object).getJitter();
			RtpDurationTypeItemProvider extItemProvider= new  RtpDurationTypeItemProvider(adapterFactory);
			if(labelValue2!=null)
			label=label.concat(", jitter ("+extItemProvider.getText(labelValue2)+")");
		}catch (NullPointerException e){}
		
		label=label.concat(")");
		
		return label;
		//return getString("_UI_RtpPeriodicType_type");
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

		switch (notification.getFeatureID(RtpPeriodicType.class)) {
			case RtpTypesPackage.RTP_PERIODIC_TYPE__JITTER:
			case RtpTypesPackage.RTP_PERIODIC_TYPE__PERIOD:
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
				(RtpTypesPackage.Literals.RTP_PERIODIC_TYPE__JITTER,
				 RtpHelperTypesFactory.eINSTANCE.createRtpDurationType()));

		newChildDescriptors.add
			(createChildParameter
				(RtpTypesPackage.Literals.RTP_PERIODIC_TYPE__PERIOD,
				 RtpHelperTypesFactory.eINSTANCE.createRtpDurationType()));
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
			childFeature == RtpTypesPackage.Literals.RTP_PERIODIC_TYPE__JITTER ||
			childFeature == RtpTypesPackage.Literals.RTP_PERIODIC_TYPE__PERIOD;

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