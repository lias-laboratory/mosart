/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.provider;


import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

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
 * This is the item provider adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SbSendStepItemProvider 
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
	public SbSendStepItemProvider(AdapterFactory adapterFactory) {
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

			addInputStepRelationPropertyDescriptor(object);
			addOutputStepRelationPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addRepresentedOperationPropertyDescriptor(object);
			addRepetitionPropertyDescriptor(object);
			addDeadlinePropertyDescriptor(object);
			addExecutionTimePropertyDescriptor(object);
			addBlockingTimePropertyDescriptor(object);
			addInteractionResourcePropertyDescriptor(object);
			addStepPredecessorsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input Step Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputStepRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_inputStepRelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_inputStepRelation_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__INPUT_STEP_RELATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Step Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputStepRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_outputStepRelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_outputStepRelation_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__OUTPUT_STEP_RELATION,
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
				 getString("_UI_SbStep_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_name_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Represented Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentedOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_representedOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_representedOperation_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__REPRESENTED_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repetition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepetitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_repetition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_repetition_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__REPETITION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_deadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_deadline_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__DEADLINE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_executionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_executionTime_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__EXECUTION_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blocking Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_blockingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_blockingTime_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__BLOCKING_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interaction Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInteractionResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_interactionResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_interactionResource_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__INTERACTION_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Step Predecessors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPredecessorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbStep_stepPredecessors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbStep_stepPredecessors_feature", "_UI_SbStep_type"),
				 SoftwareBehaviorPackage.Literals.SB_STEP__STEP_PREDECESSORS,
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
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_DEADLINE);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_EXECUTION_TIME);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_BLOCKING_TIME);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_REPETITION);
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
	 * This returns SbSendStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SbSendStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SbSendStep)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SbSendStep_type") :
			getString("_UI_SbSendStep_type") + " " + label;
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

		switch (notification.getFeatureID(SbSendStep.class)) {
			case SoftwareBehaviorPackage.SB_SEND_STEP__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwareBehaviorPackage.SB_SEND_STEP__RTP_DEADLINE:
			case SoftwareBehaviorPackage.SB_SEND_STEP__RTP_EXECUTION_TIME:
			case SoftwareBehaviorPackage.SB_SEND_STEP__RTP_BLOCKING_TIME:
			case SoftwareBehaviorPackage.SB_SEND_STEP__RTP_REPETITION:
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
				(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_DEADLINE,
				 RtpTypesFactory.eINSTANCE.createRtpDeadlineType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_EXECUTION_TIME,
				 RtpTypesFactory.eINSTANCE.createRtpExecutionTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_BLOCKING_TIME,
				 RtpTypesFactory.eINSTANCE.createRtpBlockingTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_STEP__RTP_REPETITION,
				 RtpTypesFactory.eINSTANCE.createRtpRepetitionType()));
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
