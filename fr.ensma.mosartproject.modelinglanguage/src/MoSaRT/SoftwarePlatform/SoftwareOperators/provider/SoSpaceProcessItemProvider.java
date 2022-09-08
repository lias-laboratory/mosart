/**
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.provider;


import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesFactory;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
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
 * This is the item provider adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoSpaceProcessItemProvider 
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
	public SoSpaceProcessItemProvider(AdapterFactory adapterFactory) {
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

			addSpaceProcessParentPropertyDescriptor(object);
			addSpaceProcessChildrenPropertyDescriptor(object);
			addSchedulableTasksPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addProcessingUnitPropertyDescriptor(object);
			addAllSpaceProcessParentsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Space Process Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpaceProcessParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSpaceProcess_spaceProcessParent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSpaceProcess_spaceProcessParent_feature", "_UI_SoSpaceProcess_type"),
				 SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Space Process Children feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpaceProcessChildrenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSpaceProcess_spaceProcessChildren_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSpaceProcess_spaceProcessChildren_feature", "_UI_SoSpaceProcess_type"),
				 SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedulable Tasks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulableTasksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSpaceProcess_schedulableTasks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSpaceProcess_schedulableTasks_feature", "_UI_SoSpaceProcess_type"),
				 SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__SCHEDULABLE_TASKS,
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
				 getString("_UI_SoSpaceProcess_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSpaceProcess_name_feature", "_UI_SoSpaceProcess_type"),
				 SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Processing Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSpaceProcess_processingUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSpaceProcess_processingUnit_feature", "_UI_SoSpaceProcess_type"),
				 SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__PROCESSING_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Space Process Parents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllSpaceProcessParentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSpaceProcess_allSpaceProcessParents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSpaceProcess_allSpaceProcessParents_feature", "_UI_SoSpaceProcess_type"),
				 SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS,
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
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION);
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
	 * This returns SoSpaceProcess.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoSpaceProcess"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoSpaceProcess)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoSpaceProcess_type") :
			getString("_UI_SoSpaceProcess_type") + " " + label;
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

		switch (notification.getFeatureID(SoSpaceProcess.class)) {
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY:
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION:
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
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFixedPrioritySchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createLeastLaxityFirstSchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createRoundRobinSchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createEarliestDeadlineFirstSchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createDeadlineMonotonicSchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createRateMonotonicSchedulingPolicy()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createPartitionedTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createFullMigrationTaskAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION,
				 RtpProtocolsAndPoliciesFactory.eINSTANCE.createRestrictedMigrationTaskAllocation()));
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
