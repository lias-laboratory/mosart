/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.provider;



import MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbAcquireStepItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbActionStepItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbReadStepItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbReceiveStepItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbReleaseStepItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbSendStepItemProvider;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.provider.SbWriteStepItemProvider;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpCooperativeTypeItemProvider
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
	public RtpCooperativeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNonPreemptibleStepsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Non Preemptible Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNonPreemptibleStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RtpCooperativeType_nonPreemptibleSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RtpCooperativeType_nonPreemptibleSteps_feature", "_UI_RtpCooperativeType_type"),
				 RtpTypesPackage.Literals.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS,
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
			childrenFeatures.add(RtpTypesPackage.Literals.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS);
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
	 * This returns RtpCooperativeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RtpCooperativeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		
		String label = "Co-operative (";
		
		try{
		EList<RtpExecutionTimeType> labelValue1 = ((RtpCooperativeType)object).getNonPreemptibleIntervals();
		RtpExecutionTimeTypeItemProvider extItemProvider = new RtpExecutionTimeTypeItemProvider(adapterFactory);
		label=label.concat( "non-preemptible sections = (");
		for(int i=0; i<labelValue1.size();i++){
			
			label=label.concat(extItemProvider.getText(labelValue1.get(i)));
			if (i< labelValue1.size()-1) label=label.concat(", ");
		}
		label=label.concat( ")");
		}
		catch(NullPointerException e){
		}
		
		try{
		EList<SbStep> labelValue2 = ((RtpCooperativeType)object).getNonPreemptibleSteps();
		label=label.concat(" - non-preemptible steps = (");
		for(int i=0; i<labelValue2.size();i++){
		
			if (labelValue2.get(i) instanceof SbActionStep) {
				SbActionStepItemProvider extItemProvider = new SbActionStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
			
			if (labelValue2.get(i) instanceof SbReceiveStep) {
				SbReceiveStepItemProvider extItemProvider = new SbReceiveStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
			
			if (labelValue2.get(i) instanceof SbSendStep) {
				SbSendStepItemProvider extItemProvider = new SbSendStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
			
			if (labelValue2.get(i) instanceof SbAcquireStep) {
				SbAcquireStepItemProvider extItemProvider = new SbAcquireStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
			
			if (labelValue2.get(i) instanceof SbReleaseStep) {
				SbReleaseStepItemProvider extItemProvider = new SbReleaseStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
			
			if (labelValue2.get(i) instanceof SbReadStep) {
				SbReadStepItemProvider extItemProvider = new SbReadStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
			
			if (labelValue2.get(i) instanceof SbWriteStep) {
				SbWriteStepItemProvider extItemProvider = new SbWriteStepItemProvider(adapterFactory);
				label=label.concat(extItemProvider.getText(labelValue2.get(i)));
			}
		
			if (i< labelValue2.size()-1) label=label.concat(", ");
		
		}
		
		}
		catch(NullPointerException e){
		}
		
		
		label=label.concat(")"); 
		return label;
		//return getString("_UI_RtpCooperativeType_type");
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

		switch (notification.getFeatureID(RtpCooperativeType.class)) {
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS:
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
				(RtpTypesPackage.Literals.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS,
				 RtpTypesFactory.eINSTANCE.createRtpExecutionTimeType()));
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
