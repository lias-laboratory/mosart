/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.provider;


import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
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
 * This is the item provider adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoSchedulableTaskItemProvider
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
	public SoSchedulableTaskItemProvider(AdapterFactory adapterFactory) {
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

			addProcessPropertyDescriptor(object);
			addMutualExclusionResourcesPropertyDescriptor(object);
			addCommWritingResourcesPropertyDescriptor(object);
			addCommReadingResourcesPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addMutualExclusionResourceUtilizationPropertyDescriptor(object);
			addFavoriteProcessorsPropertyDescriptor(object);
			addRunOnProcessorsPropertyDescriptor(object);
			addRepresentedActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_process_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_process_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__PROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutual Exclusion Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutualExclusionResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_mutualExclusionResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_mutualExclusionResources_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comm Writing Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommWritingResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_commWritingResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_commWritingResources_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comm Reading Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommReadingResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_commReadingResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_commReadingResources_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES,
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
				 getString("_UI_SoSchedulableTask_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_name_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutual Exclusion Resource Utilization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutualExclusionResourceUtilizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_mutualExclusionResourceUtilization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_mutualExclusionResourceUtilization_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Favorite Processors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFavoriteProcessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_favoriteProcessors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_favoriteProcessors_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run On Processors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunOnProcessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_runOnProcessors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_runOnProcessors_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS,
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
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION);
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
	 * This returns SoSchedulableTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoSchedulableTask"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoSchedulableTask)object).getName();
		return label == null || label.length() == 0 ?
			//getString("_UI_SoSchedulableTask_type") :
			//getString("_UI_SoSchedulableTask_type") + " " + label;
				"SchedulableTask Unknown" :
				"SchedulableTask" + " "+label;
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

		switch (notification.getFeatureID(SoSchedulableTask.class)) {
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
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
				(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION,
				 RtpTypesFactory.eINSTANCE.createRtpMutuExcluResourceUtilizationType()));
	}
	
	
	/**
	 * This adds a property descriptor for the Represented Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentedActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoSchedulableTask_representedActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoSchedulableTask_representedActivity_feature", "_UI_SoSchedulableTask_type"),
				 SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
