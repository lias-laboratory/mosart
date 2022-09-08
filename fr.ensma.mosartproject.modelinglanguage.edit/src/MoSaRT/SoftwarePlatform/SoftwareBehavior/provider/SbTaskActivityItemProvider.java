/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.provider;


import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorFactory;
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
 * This is the item provider adapter for a {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SbTaskActivityItemProvider
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
	public SbTaskActivityItemProvider(AdapterFactory adapterFactory) {
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

			addTriggerPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addInputSquencingRelationPropertyDescriptor(object);
			addOutputSequencingRelationPropertyDescriptor(object);
			addRootActionStepPropertyDescriptor(object);
			addRepresentedTaskPropertyDescriptor(object);
			addRepetitionPropertyDescriptor(object);
			addDeadlinePropertyDescriptor(object);
			addExecutionTimePropertyDescriptor(object);
			addBlockingTimePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addResponseTimePropertyDescriptor(object);
			addOffsetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbSchedulingActivity_trigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbSchedulingActivity_trigger_feature", "_UI_SbSchedulingActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_SCHEDULING_ACTIVITY__TRIGGER,
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
				 getString("_UI_SbSchedulingActivity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbSchedulingActivity_name_feature", "_UI_SbSchedulingActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_SCHEDULING_ACTIVITY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Squencing Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputSquencingRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbSchedulingActivity_inputSquencingRelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbSchedulingActivity_inputSquencingRelation_feature", "_UI_SbSchedulingActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Sequencing Relation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputSequencingRelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbSchedulingActivity_outputSequencingRelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbSchedulingActivity_outputSequencingRelation_feature", "_UI_SbSchedulingActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Action Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootActionStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbTaskActivity_rootActionStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_rootActionStep_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ROOT_ACTION_STEP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Represented Task feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentedTaskPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbTaskActivity_representedTask_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_representedTask_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__REPRESENTED_TASK,
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
				 getString("_UI_SbTaskActivity_repetition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_repetition_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__REPETITION,
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
				 getString("_UI_SbTaskActivity_deadline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_deadline_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__DEADLINE,
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
				 getString("_UI_SbTaskActivity_executionTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_executionTime_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__EXECUTION_TIME,
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
				 getString("_UI_SbTaskActivity_blockingTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_blockingTime_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__BLOCKING_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbTaskActivity_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_priority_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__PRIORITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbTaskActivity_responseTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_responseTime_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RESPONSE_TIME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SbTaskActivity_offset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SbTaskActivity_offset_feature", "_UI_SbTaskActivity_type"),
				 SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__OFFSET,
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
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_DEADLINE);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_OFFSET);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_REPETITION);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_PRIORITY);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_CRITICALITY);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY);
			childrenFeatures.add(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION);
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
	 * This returns SbTaskActivity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SbTaskActivity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((SbTaskActivity)object).getName();
		return label == null || label.length() == 0 ?
			//getString("_UI_SbTaskActivity_type") :
			//getString("_UI_SbTaskActivity_type") + " " + label;
				"TaskActivity":
					"TaskActivity "+label;
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

		switch (notification.getFeatureID(SbTaskActivity.class)) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY:
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION:
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
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbAcquireStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbSendStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbReceiveStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbWriteStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbReleaseStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbReadStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__ACTION_STEPS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbActionStep()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS,
				 SoftwareBehaviorFactory.eINSTANCE.createSbStepPrecedenceRelation()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_DEADLINE,
				 RtpTypesFactory.eINSTANCE.createRtpDeadlineType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME,
				 RtpTypesFactory.eINSTANCE.createRtpExecutionTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_OFFSET,
				 RtpTypesFactory.eINSTANCE.createRtpOffsetType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME,
				 RtpTypesFactory.eINSTANCE.createRtpBlockingTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_REPETITION,
				 RtpTypesFactory.eINSTANCE.createRtpRepetitionType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME,
				 RtpTypesFactory.eINSTANCE.createRtpResponseTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_PRIORITY,
				 RtpTypesFactory.eINSTANCE.createRtpPriorityType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_CRITICALITY,
				 RtpTypesFactory.eINSTANCE.createRtpCriticalityType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY,
				 RtpTypesFactory.eINSTANCE.createRtpPreemptibleType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY,
				 RtpTypesFactory.eINSTANCE.createRtpNonPreemptibleType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY,
				 RtpTypesFactory.eINSTANCE.createRtpCooperativeType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION,
				 RtpTypesFactory.eINSTANCE.createRtpSelfSuspendedType()));

		newChildDescriptors.add
			(createChildParameter
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION,
				 RtpTypesFactory.eINSTANCE.createRtpNotSelfSuspendedType()));
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
