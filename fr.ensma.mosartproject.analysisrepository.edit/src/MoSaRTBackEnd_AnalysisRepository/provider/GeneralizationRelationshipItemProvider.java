/**
 */
package MoSaRTBackEnd_AnalysisRepository.provider;


import MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizationRelationshipItemProvider
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
	public GeneralizationRelationshipItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
			addSpecificModelPropertyDescriptor(object);
			addGenericModelPropertyDescriptor(object);
			addBehaviorKindPropertyDescriptor(object);
			addGenericToSpecificPathPropertyDescriptor(object);
			addSpecificToGenericPathPropertyDescriptor(object);
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
				 getString("_UI_GeneralizationRelationship_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_name_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralizationRelationship_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_description_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specific Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralizationRelationship_specificModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_specificModel_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generic Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenericModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralizationRelationship_genericModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_genericModel_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__GENERIC_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralizationRelationship_behaviorKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_behaviorKind_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generic To Specific Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenericToSpecificPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralizationRelationship_genericToSpecificPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_genericToSpecificPath_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specific To Generic Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificToGenericPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeneralizationRelationship_specificToGenericPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeneralizationRelationship_specificToGenericPath_feature", "_UI_GeneralizationRelationship_type"),
				 MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GeneralizationRelationship.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GeneralizationRelationship"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GeneralizationRelationship)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GeneralizationRelationship_type") :
			getString("_UI_GeneralizationRelationship_type") + " " + label;
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

		switch (notification.getFeatureID(GeneralizationRelationship.class)) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__NAME:
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__DESCRIPTION:
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND:
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH:
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MoSaRTBackEnd_AnalysisRepositoryEditPlugin.INSTANCE;
	}

}
