/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.provider;


import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorFactory;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;

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
 * This is the item provider adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemSoftwareSideItemProvider
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
	public SystemSoftwareSideItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_SystemSoftwareSide_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemSoftwareSide_name_feature", "_UI_SystemSoftwareSide_type"),
				 SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__NAME,
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
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES);
			childrenFeatures.add(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS);
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
	 * This returns SystemSoftwareSide.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemSoftwareSide"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SystemSoftwareSide)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemSoftwareSide_type") :
			getString("_UI_SystemSoftwareSide_type") + " " + label;
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

		switch (notification.getFeatureID(SystemSoftwareSide.class)) {
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR:
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES:
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES:
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS:
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
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR,
				 SoftwareBehaviorFactory.eINSTANCE.createGlobalBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES,
				 SoftwareOperatorsFactory.eINSTANCE.createSoSpaceProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES,
				 SoftwareOperatorsFactory.eINSTANCE.createSoMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES,
				 SoftwareOperatorsFactory.eINSTANCE.createSoRemoteCommResource()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES,
				 SoftwareOperatorsFactory.eINSTANCE.createSoLocalCommResource()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS,
				 SoftwareOperatorsFactory.eINSTANCE.createSoSchedulableTask()));
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
