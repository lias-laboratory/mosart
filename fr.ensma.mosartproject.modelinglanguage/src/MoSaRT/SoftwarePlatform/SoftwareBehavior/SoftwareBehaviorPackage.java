/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SoftwareBehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SoftwareBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/SoftwarePlatform/SoftwareBehavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SB";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareBehaviorPackage eINSTANCE = MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl <em>Global Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getGlobalBehavior()
	 * @generated
	 */
	int GLOBAL_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR__TRIGGERS = 0;

	/**
	 * The feature id for the '<em><b>Scheduling Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES = 1;

	/**
	 * The feature id for the '<em><b>Sequencing Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Root Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR__ROOT_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR__NAME = 4;

	/**
	 * The number of structural features of the '<em>Global Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Global Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger <em>Sb Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbTrigger()
	 * @generated
	 */
	int SB_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Scheduling Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TRIGGER__SCHEDULING_ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TRIGGER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Sb Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sb Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl <em>Sb Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbTimeTrigger()
	 * @generated
	 */
	int SB_TIME_TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Scheduling Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES = SB_TRIGGER__SCHEDULING_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER__NAME = SB_TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Release Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER__RTP_RELEASE_TIME = SB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rtp Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER__RTP_PERIODICITY = SB_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER__START_TIME = SB_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Periodicity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER__PERIODICITY = SB_TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sb Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER_FEATURE_COUNT = SB_TRIGGER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sb Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TIME_TRIGGER_OPERATION_COUNT = SB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbExternalEventTriggerImpl <em>Sb External Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbExternalEventTriggerImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbExternalEventTrigger()
	 * @generated
	 */
	int SB_EXTERNAL_EVENT_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Scheduling Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_EXTERNAL_EVENT_TRIGGER__SCHEDULING_ACTIVITIES = SB_TRIGGER__SCHEDULING_ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_EXTERNAL_EVENT_TRIGGER__NAME = SB_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>Sb External Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_EXTERNAL_EVENT_TRIGGER_FEATURE_COUNT = SB_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb External Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_EXTERNAL_EVENT_TRIGGER_OPERATION_COUNT = SB_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity <em>Sb Scheduling Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbSchedulingActivity()
	 * @generated
	 */
	int SB_SCHEDULING_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SCHEDULING_ACTIVITY__TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SCHEDULING_ACTIVITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Input Squencing Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION = 2;

	/**
	 * The feature id for the '<em><b>Output Sequencing Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION = 3;

	/**
	 * The number of structural features of the '<em>Sb Scheduling Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SCHEDULING_ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sb Scheduling Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SCHEDULING_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl <em>Sb Task Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbTaskActivity()
	 * @generated
	 */
	int SB_TASK_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__TRIGGER = SB_SCHEDULING_ACTIVITY__TRIGGER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__NAME = SB_SCHEDULING_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Input Squencing Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION = SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION;

	/**
	 * The feature id for the '<em><b>Output Sequencing Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION = SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION;

	/**
	 * The feature id for the '<em><b>Action Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__ACTION_STEPS = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Action Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__ROOT_ACTION_STEP = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Precedence Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_DEADLINE = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_EXECUTION_TIME = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rtp Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_OFFSET = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_BLOCKING_TIME = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_REPETITION = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rtp Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_RESPONSE_TIME = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rtp Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_PRIORITY = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Represented Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__REPRESENTED_TASK = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__REPETITION = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__DEADLINE = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__EXECUTION_TIME = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__BLOCKING_TIME = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__PRIORITY = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RESPONSE_TIME = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__OFFSET = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Rtp Criticality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_CRITICALITY = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Rtp Preemptibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Rtp Self Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Sb Task Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY_FEATURE_COUNT = SB_SCHEDULING_ACTIVITY_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Sb Task Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_TASK_ACTIVITY_OPERATION_COUNT = SB_SCHEDULING_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation <em>Sb Sequencing Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbSequencingRelation()
	 * @generated
	 */
	int SB_SEQUENCING_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEQUENCING_RELATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Scheduling Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEQUENCING_RELATION__TARGET_SCHEDULING_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Source Scheduling Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEQUENCING_RELATION__SOURCE_SCHEDULING_ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Sb Sequencing Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEQUENCING_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sb Sequencing Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEQUENCING_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl <em>Sb Precedence Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbPrecedenceRelation()
	 * @generated
	 */
	int SB_PRECEDENCE_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_PRECEDENCE_RELATION__NAME = SB_SEQUENCING_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Target Scheduling Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_PRECEDENCE_RELATION__TARGET_SCHEDULING_ACTIVITY = SB_SEQUENCING_RELATION__TARGET_SCHEDULING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Source Scheduling Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_PRECEDENCE_RELATION__SOURCE_SCHEDULING_ACTIVITY = SB_SEQUENCING_RELATION__SOURCE_SCHEDULING_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Sb Precedence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_PRECEDENCE_RELATION_FEATURE_COUNT = SB_SEQUENCING_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Precedence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_PRECEDENCE_RELATION_OPERATION_COUNT = SB_SEQUENCING_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbCommunicationRelationImpl <em>Sb Communication Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbCommunicationRelationImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbCommunicationRelation()
	 * @generated
	 */
	int SB_COMMUNICATION_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_COMMUNICATION_RELATION__NAME = SB_SEQUENCING_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Target Scheduling Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_COMMUNICATION_RELATION__TARGET_SCHEDULING_ACTIVITY = SB_SEQUENCING_RELATION__TARGET_SCHEDULING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Source Scheduling Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_COMMUNICATION_RELATION__SOURCE_SCHEDULING_ACTIVITY = SB_SEQUENCING_RELATION__SOURCE_SCHEDULING_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Comm Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_COMMUNICATION_RELATION__COMM_RESOURCE = SB_SEQUENCING_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sb Communication Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_COMMUNICATION_RELATION_FEATURE_COUNT = SB_SEQUENCING_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sb Communication Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_COMMUNICATION_RELATION_OPERATION_COUNT = SB_SEQUENCING_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep <em>Sb Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbStep()
	 * @generated
	 */
	int SB_STEP = 9;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__INPUT_STEP_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__OUTPUT_STEP_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__RTP_DEADLINE = 3;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__RTP_EXECUTION_TIME = 4;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__RTP_BLOCKING_TIME = 5;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__RTP_REPETITION = 6;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__REPRESENTED_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__REPETITION = 8;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__DEADLINE = 9;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__EXECUTION_TIME = 10;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__BLOCKING_TIME = 11;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__INTERACTION_RESOURCE = 12;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP__STEP_PREDECESSORS = 13;

	/**
	 * The number of structural features of the '<em>Sb Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Sb Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl <em>Sb Acquire Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbAcquireStep()
	 * @generated
	 */
	int SB_ACQUIRE_STEP = 10;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Acquire Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Acquire Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACQUIRE_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbSendStepImpl <em>Sb Send Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbSendStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbSendStep()
	 * @generated
	 */
	int SB_SEND_STEP = 11;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Send Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Send Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_SEND_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReceiveStepImpl <em>Sb Receive Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReceiveStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbReceiveStep()
	 * @generated
	 */
	int SB_RECEIVE_STEP = 12;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Receive Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Receive Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RECEIVE_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbWriteStepImpl <em>Sb Write Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbWriteStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbWriteStep()
	 * @generated
	 */
	int SB_WRITE_STEP = 13;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Write Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Write Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_WRITE_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReleaseStepImpl <em>Sb Release Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReleaseStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbReleaseStep()
	 * @generated
	 */
	int SB_RELEASE_STEP = 14;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Release Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Release Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_RELEASE_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReadStepImpl <em>Sb Read Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReadStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbReadStep()
	 * @generated
	 */
	int SB_READ_STEP = 15;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Read Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Read Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_READ_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl <em>Sb Step Precedence Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbStepPrecedenceRelation()
	 * @generated
	 */
	int SB_STEP_PRECEDENCE_RELATION = 16;

	/**
	 * The feature id for the '<em><b>Target Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_PRECEDENCE_RELATION__TARGET_STEP = 0;

	/**
	 * The feature id for the '<em><b>Source Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_PRECEDENCE_RELATION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Sb Step Precedence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_PRECEDENCE_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sb Step Precedence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_STEP_PRECEDENCE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbActionStepImpl <em>Sb Action Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbActionStepImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbActionStep()
	 * @generated
	 */
	int SB_ACTION_STEP = 17;

	/**
	 * The feature id for the '<em><b>Input Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__INPUT_STEP_RELATION = SB_STEP__INPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Output Step Relation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__OUTPUT_STEP_RELATION = SB_STEP__OUTPUT_STEP_RELATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__NAME = SB_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__RTP_DEADLINE = SB_STEP__RTP_DEADLINE;

	/**
	 * The feature id for the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__RTP_EXECUTION_TIME = SB_STEP__RTP_EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__RTP_BLOCKING_TIME = SB_STEP__RTP_BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__RTP_REPETITION = SB_STEP__RTP_REPETITION;

	/**
	 * The feature id for the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__REPRESENTED_OPERATION = SB_STEP__REPRESENTED_OPERATION;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__REPETITION = SB_STEP__REPETITION;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__DEADLINE = SB_STEP__DEADLINE;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__EXECUTION_TIME = SB_STEP__EXECUTION_TIME;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__BLOCKING_TIME = SB_STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__INTERACTION_RESOURCE = SB_STEP__INTERACTION_RESOURCE;

	/**
	 * The feature id for the '<em><b>Step Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP__STEP_PREDECESSORS = SB_STEP__STEP_PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Sb Action Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP_FEATURE_COUNT = SB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sb Action Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SB_ACTION_STEP_OPERATION_COUNT = SB_STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior <em>Global Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Behavior</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior
	 * @generated
	 */
	EClass getGlobalBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getTriggers()
	 * @see #getGlobalBehavior()
	 * @generated
	 */
	EReference getGlobalBehavior_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getSchedulingActivities <em>Scheduling Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Activities</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getSchedulingActivities()
	 * @see #getGlobalBehavior()
	 * @generated
	 */
	EReference getGlobalBehavior_SchedulingActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getSequencingRelations <em>Sequencing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequencing Relations</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getSequencingRelations()
	 * @see #getGlobalBehavior()
	 * @generated
	 */
	EReference getGlobalBehavior_SequencingRelations();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getRootTrigger <em>Root Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Trigger</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getRootTrigger()
	 * @see #getGlobalBehavior()
	 * @generated
	 */
	EReference getGlobalBehavior_RootTrigger();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getName()
	 * @see #getGlobalBehavior()
	 * @generated
	 */
	EAttribute getGlobalBehavior_Name();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger <em>Sb Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Trigger</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger
	 * @generated
	 */
	EClass getSbTrigger();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getSchedulingActivities <em>Scheduling Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scheduling Activities</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getSchedulingActivities()
	 * @see #getSbTrigger()
	 * @generated
	 */
	EReference getSbTrigger_SchedulingActivities();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getName()
	 * @see #getSbTrigger()
	 * @generated
	 */
	EAttribute getSbTrigger_Name();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger <em>Sb Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Time Trigger</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger
	 * @generated
	 */
	EClass getSbTimeTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpReleaseTime <em>Rtp Release Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Release Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpReleaseTime()
	 * @see #getSbTimeTrigger()
	 * @generated
	 */
	EReference getSbTimeTrigger_RtpReleaseTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpPeriodicity <em>Rtp Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Periodicity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpPeriodicity()
	 * @see #getSbTimeTrigger()
	 * @generated
	 */
	EReference getSbTimeTrigger_RtpPeriodicity();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getStartTime()
	 * @see #getSbTimeTrigger()
	 * @generated
	 */
	EReference getSbTimeTrigger_StartTime();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getPeriodicity <em>Periodicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Periodicity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getPeriodicity()
	 * @see #getSbTimeTrigger()
	 * @generated
	 */
	EReference getSbTimeTrigger_Periodicity();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger <em>Sb External Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb External Event Trigger</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger
	 * @generated
	 */
	EClass getSbExternalEventTrigger();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity <em>Sb Scheduling Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Scheduling Activity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity
	 * @generated
	 */
	EClass getSbSchedulingActivity();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getTrigger()
	 * @see #getSbSchedulingActivity()
	 * @generated
	 */
	EReference getSbSchedulingActivity_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getName()
	 * @see #getSbSchedulingActivity()
	 * @generated
	 */
	EAttribute getSbSchedulingActivity_Name();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getInputSquencingRelation <em>Input Squencing Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Squencing Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getInputSquencingRelation()
	 * @see #getSbSchedulingActivity()
	 * @generated
	 */
	EReference getSbSchedulingActivity_InputSquencingRelation();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getOutputSequencingRelation <em>Output Sequencing Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Sequencing Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getOutputSequencingRelation()
	 * @see #getSbSchedulingActivity()
	 * @generated
	 */
	EReference getSbSchedulingActivity_OutputSequencingRelation();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity <em>Sb Task Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Task Activity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity
	 * @generated
	 */
	EClass getSbTaskActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getActionSteps <em>Action Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Steps</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getActionSteps()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_ActionSteps();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRootActionStep <em>Root Action Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Action Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRootActionStep()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RootActionStep();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getStepPrecedenceRelations <em>Step Precedence Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step Precedence Relations</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getStepPrecedenceRelations()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_StepPrecedenceRelations();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpDeadline <em>Rtp Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Deadline</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpDeadline()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpDeadline();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpExecutionTime <em>Rtp Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Execution Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpExecutionTime()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpExecutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpOffset <em>Rtp Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Offset</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpOffset()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpOffset();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpBlockingTime <em>Rtp Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Blocking Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpBlockingTime()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpBlockingTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpRepetition <em>Rtp Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Repetition</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpRepetition()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpRepetition();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpResponseTime <em>Rtp Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Response Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpResponseTime()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpResponseTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPriority <em>Rtp Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Priority</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPriority()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpPriority();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepresentedTask <em>Represented Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented Task</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepresentedTask()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RepresentedTask();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repetition</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepetition()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_Repetition();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deadline</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getDeadline()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_Deadline();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getExecutionTime()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_ExecutionTime();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blocking Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getBlockingTime()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_BlockingTime();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getPriority()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_Priority();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getResponseTime()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_ResponseTime();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offset</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getOffset()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_Offset();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpCriticality <em>Rtp Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Criticality</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpCriticality()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpCriticality();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPreemptibility <em>Rtp Preemptibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Preemptibility</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPreemptibility()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpPreemptibility();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpSelfSuspension <em>Rtp Self Suspension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Self Suspension</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpSelfSuspension()
	 * @see #getSbTaskActivity()
	 * @generated
	 */
	EReference getSbTaskActivity_RtpSelfSuspension();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation <em>Sb Precedence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Precedence Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation
	 * @generated
	 */
	EClass getSbPrecedenceRelation();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation <em>Sb Sequencing Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Sequencing Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation
	 * @generated
	 */
	EClass getSbSequencingRelation();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getName()
	 * @see #getSbSequencingRelation()
	 * @generated
	 */
	EAttribute getSbSequencingRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getTargetSchedulingActivity <em>Target Scheduling Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Scheduling Activity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getTargetSchedulingActivity()
	 * @see #getSbSequencingRelation()
	 * @generated
	 */
	EReference getSbSequencingRelation_TargetSchedulingActivity();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getSourceSchedulingActivity <em>Source Scheduling Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Scheduling Activity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getSourceSchedulingActivity()
	 * @see #getSbSequencingRelation()
	 * @generated
	 */
	EReference getSbSequencingRelation_SourceSchedulingActivity();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation <em>Sb Communication Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Communication Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation
	 * @generated
	 */
	EClass getSbCommunicationRelation();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation#getCommResource <em>Comm Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation#getCommResource()
	 * @see #getSbCommunicationRelation()
	 * @generated
	 */
	EReference getSbCommunicationRelation_CommResource();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep <em>Sb Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep
	 * @generated
	 */
	EClass getSbStep();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInputStepRelation <em>Input Step Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Step Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInputStepRelation()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_InputStepRelation();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getOutputStepRelation <em>Output Step Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Step Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getOutputStepRelation()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_OutputStepRelation();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getName()
	 * @see #getSbStep()
	 * @generated
	 */
	EAttribute getSbStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpDeadline <em>Rtp Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Deadline</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpDeadline()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_RtpDeadline();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpExecutionTime <em>Rtp Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Execution Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpExecutionTime()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_RtpExecutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpBlockingTime <em>Rtp Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Blocking Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpBlockingTime()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_RtpBlockingTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpRepetition <em>Rtp Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Repetition</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpRepetition()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_RtpRepetition();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepresentedOperation <em>Represented Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented Operation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepresentedOperation()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_RepresentedOperation();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repetition</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepetition()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_Repetition();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deadline</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getDeadline()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_Deadline();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getExecutionTime()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_ExecutionTime();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blocking Time</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getBlockingTime()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_BlockingTime();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInteractionResource <em>Interaction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interaction Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInteractionResource()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_InteractionResource();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getStepPredecessors <em>Step Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step Predecessors</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getStepPredecessors()
	 * @see #getSbStep()
	 * @generated
	 */
	EReference getSbStep_StepPredecessors();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep <em>Sb Acquire Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Acquire Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep
	 * @generated
	 */
	EClass getSbAcquireStep();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep <em>Sb Send Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Send Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep
	 * @generated
	 */
	EClass getSbSendStep();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep <em>Sb Receive Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Receive Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep
	 * @generated
	 */
	EClass getSbReceiveStep();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep <em>Sb Write Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Write Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep
	 * @generated
	 */
	EClass getSbWriteStep();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep <em>Sb Release Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Release Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep
	 * @generated
	 */
	EClass getSbReleaseStep();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep <em>Sb Read Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Read Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep
	 * @generated
	 */
	EClass getSbReadStep();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation <em>Sb Step Precedence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Step Precedence Relation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation
	 * @generated
	 */
	EClass getSbStepPrecedenceRelation();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getTargetStep <em>Target Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getTargetStep()
	 * @see #getSbStepPrecedenceRelation()
	 * @generated
	 */
	EReference getSbStepPrecedenceRelation_TargetStep();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getSourceStep <em>Source Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getSourceStep()
	 * @see #getSbStepPrecedenceRelation()
	 * @generated
	 */
	EReference getSbStepPrecedenceRelation_SourceStep();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getName()
	 * @see #getSbStepPrecedenceRelation()
	 * @generated
	 */
	EAttribute getSbStepPrecedenceRelation_Name();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep <em>Sb Action Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sb Action Step</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep
	 * @generated
	 */
	EClass getSbActionStep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareBehaviorFactory getSoftwareBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl <em>Global Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.GlobalBehaviorImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getGlobalBehavior()
		 * @generated
		 */
		EClass GLOBAL_BEHAVIOR = eINSTANCE.getGlobalBehavior();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BEHAVIOR__TRIGGERS = eINSTANCE.getGlobalBehavior_Triggers();

		/**
		 * The meta object literal for the '<em><b>Scheduling Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES = eINSTANCE.getGlobalBehavior_SchedulingActivities();

		/**
		 * The meta object literal for the '<em><b>Sequencing Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS = eINSTANCE.getGlobalBehavior_SequencingRelations();

		/**
		 * The meta object literal for the '<em><b>Root Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BEHAVIOR__ROOT_TRIGGER = eINSTANCE.getGlobalBehavior_RootTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BEHAVIOR__NAME = eINSTANCE.getGlobalBehavior_Name();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger <em>Sb Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbTrigger()
		 * @generated
		 */
		EClass SB_TRIGGER = eINSTANCE.getSbTrigger();

		/**
		 * The meta object literal for the '<em><b>Scheduling Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TRIGGER__SCHEDULING_ACTIVITIES = eINSTANCE.getSbTrigger_SchedulingActivities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SB_TRIGGER__NAME = eINSTANCE.getSbTrigger_Name();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl <em>Sb Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbTimeTrigger()
		 * @generated
		 */
		EClass SB_TIME_TRIGGER = eINSTANCE.getSbTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Rtp Release Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TIME_TRIGGER__RTP_RELEASE_TIME = eINSTANCE.getSbTimeTrigger_RtpReleaseTime();

		/**
		 * The meta object literal for the '<em><b>Rtp Periodicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TIME_TRIGGER__RTP_PERIODICITY = eINSTANCE.getSbTimeTrigger_RtpPeriodicity();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TIME_TRIGGER__START_TIME = eINSTANCE.getSbTimeTrigger_StartTime();

		/**
		 * The meta object literal for the '<em><b>Periodicity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TIME_TRIGGER__PERIODICITY = eINSTANCE.getSbTimeTrigger_Periodicity();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbExternalEventTriggerImpl <em>Sb External Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbExternalEventTriggerImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbExternalEventTrigger()
		 * @generated
		 */
		EClass SB_EXTERNAL_EVENT_TRIGGER = eINSTANCE.getSbExternalEventTrigger();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity <em>Sb Scheduling Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbSchedulingActivity()
		 * @generated
		 */
		EClass SB_SCHEDULING_ACTIVITY = eINSTANCE.getSbSchedulingActivity();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_SCHEDULING_ACTIVITY__TRIGGER = eINSTANCE.getSbSchedulingActivity_Trigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SB_SCHEDULING_ACTIVITY__NAME = eINSTANCE.getSbSchedulingActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Input Squencing Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION = eINSTANCE.getSbSchedulingActivity_InputSquencingRelation();

		/**
		 * The meta object literal for the '<em><b>Output Sequencing Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION = eINSTANCE.getSbSchedulingActivity_OutputSequencingRelation();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl <em>Sb Task Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbTaskActivity()
		 * @generated
		 */
		EClass SB_TASK_ACTIVITY = eINSTANCE.getSbTaskActivity();

		/**
		 * The meta object literal for the '<em><b>Action Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__ACTION_STEPS = eINSTANCE.getSbTaskActivity_ActionSteps();

		/**
		 * The meta object literal for the '<em><b>Root Action Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__ROOT_ACTION_STEP = eINSTANCE.getSbTaskActivity_RootActionStep();

		/**
		 * The meta object literal for the '<em><b>Step Precedence Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS = eINSTANCE.getSbTaskActivity_StepPrecedenceRelations();

		/**
		 * The meta object literal for the '<em><b>Rtp Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_DEADLINE = eINSTANCE.getSbTaskActivity_RtpDeadline();

		/**
		 * The meta object literal for the '<em><b>Rtp Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_EXECUTION_TIME = eINSTANCE.getSbTaskActivity_RtpExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Rtp Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_OFFSET = eINSTANCE.getSbTaskActivity_RtpOffset();

		/**
		 * The meta object literal for the '<em><b>Rtp Blocking Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_BLOCKING_TIME = eINSTANCE.getSbTaskActivity_RtpBlockingTime();

		/**
		 * The meta object literal for the '<em><b>Rtp Repetition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_REPETITION = eINSTANCE.getSbTaskActivity_RtpRepetition();

		/**
		 * The meta object literal for the '<em><b>Rtp Response Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_RESPONSE_TIME = eINSTANCE.getSbTaskActivity_RtpResponseTime();

		/**
		 * The meta object literal for the '<em><b>Rtp Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_PRIORITY = eINSTANCE.getSbTaskActivity_RtpPriority();

		/**
		 * The meta object literal for the '<em><b>Represented Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__REPRESENTED_TASK = eINSTANCE.getSbTaskActivity_RepresentedTask();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__REPETITION = eINSTANCE.getSbTaskActivity_Repetition();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__DEADLINE = eINSTANCE.getSbTaskActivity_Deadline();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__EXECUTION_TIME = eINSTANCE.getSbTaskActivity_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__BLOCKING_TIME = eINSTANCE.getSbTaskActivity_BlockingTime();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__PRIORITY = eINSTANCE.getSbTaskActivity_Priority();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RESPONSE_TIME = eINSTANCE.getSbTaskActivity_ResponseTime();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__OFFSET = eINSTANCE.getSbTaskActivity_Offset();

		/**
		 * The meta object literal for the '<em><b>Rtp Criticality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_CRITICALITY = eINSTANCE.getSbTaskActivity_RtpCriticality();

		/**
		 * The meta object literal for the '<em><b>Rtp Preemptibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY = eINSTANCE.getSbTaskActivity_RtpPreemptibility();

		/**
		 * The meta object literal for the '<em><b>Rtp Self Suspension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION = eINSTANCE.getSbTaskActivity_RtpSelfSuspension();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl <em>Sb Precedence Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbPrecedenceRelationImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbPrecedenceRelation()
		 * @generated
		 */
		EClass SB_PRECEDENCE_RELATION = eINSTANCE.getSbPrecedenceRelation();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation <em>Sb Sequencing Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbSequencingRelation()
		 * @generated
		 */
		EClass SB_SEQUENCING_RELATION = eINSTANCE.getSbSequencingRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SB_SEQUENCING_RELATION__NAME = eINSTANCE.getSbSequencingRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Target Scheduling Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_SEQUENCING_RELATION__TARGET_SCHEDULING_ACTIVITY = eINSTANCE.getSbSequencingRelation_TargetSchedulingActivity();

		/**
		 * The meta object literal for the '<em><b>Source Scheduling Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_SEQUENCING_RELATION__SOURCE_SCHEDULING_ACTIVITY = eINSTANCE.getSbSequencingRelation_SourceSchedulingActivity();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbCommunicationRelationImpl <em>Sb Communication Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbCommunicationRelationImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbCommunicationRelation()
		 * @generated
		 */
		EClass SB_COMMUNICATION_RELATION = eINSTANCE.getSbCommunicationRelation();

		/**
		 * The meta object literal for the '<em><b>Comm Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_COMMUNICATION_RELATION__COMM_RESOURCE = eINSTANCE.getSbCommunicationRelation_CommResource();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep <em>Sb Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbStep()
		 * @generated
		 */
		EClass SB_STEP = eINSTANCE.getSbStep();

		/**
		 * The meta object literal for the '<em><b>Input Step Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__INPUT_STEP_RELATION = eINSTANCE.getSbStep_InputStepRelation();

		/**
		 * The meta object literal for the '<em><b>Output Step Relation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__OUTPUT_STEP_RELATION = eINSTANCE.getSbStep_OutputStepRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SB_STEP__NAME = eINSTANCE.getSbStep_Name();

		/**
		 * The meta object literal for the '<em><b>Rtp Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__RTP_DEADLINE = eINSTANCE.getSbStep_RtpDeadline();

		/**
		 * The meta object literal for the '<em><b>Rtp Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__RTP_EXECUTION_TIME = eINSTANCE.getSbStep_RtpExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Rtp Blocking Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__RTP_BLOCKING_TIME = eINSTANCE.getSbStep_RtpBlockingTime();

		/**
		 * The meta object literal for the '<em><b>Rtp Repetition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__RTP_REPETITION = eINSTANCE.getSbStep_RtpRepetition();

		/**
		 * The meta object literal for the '<em><b>Represented Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__REPRESENTED_OPERATION = eINSTANCE.getSbStep_RepresentedOperation();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__REPETITION = eINSTANCE.getSbStep_Repetition();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__DEADLINE = eINSTANCE.getSbStep_Deadline();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__EXECUTION_TIME = eINSTANCE.getSbStep_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__BLOCKING_TIME = eINSTANCE.getSbStep_BlockingTime();

		/**
		 * The meta object literal for the '<em><b>Interaction Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__INTERACTION_RESOURCE = eINSTANCE.getSbStep_InteractionResource();

		/**
		 * The meta object literal for the '<em><b>Step Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP__STEP_PREDECESSORS = eINSTANCE.getSbStep_StepPredecessors();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl <em>Sb Acquire Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbAcquireStep()
		 * @generated
		 */
		EClass SB_ACQUIRE_STEP = eINSTANCE.getSbAcquireStep();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbSendStepImpl <em>Sb Send Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbSendStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbSendStep()
		 * @generated
		 */
		EClass SB_SEND_STEP = eINSTANCE.getSbSendStep();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReceiveStepImpl <em>Sb Receive Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReceiveStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbReceiveStep()
		 * @generated
		 */
		EClass SB_RECEIVE_STEP = eINSTANCE.getSbReceiveStep();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbWriteStepImpl <em>Sb Write Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbWriteStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbWriteStep()
		 * @generated
		 */
		EClass SB_WRITE_STEP = eINSTANCE.getSbWriteStep();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReleaseStepImpl <em>Sb Release Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReleaseStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbReleaseStep()
		 * @generated
		 */
		EClass SB_RELEASE_STEP = eINSTANCE.getSbReleaseStep();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReadStepImpl <em>Sb Read Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbReadStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbReadStep()
		 * @generated
		 */
		EClass SB_READ_STEP = eINSTANCE.getSbReadStep();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl <em>Sb Step Precedence Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbStepPrecedenceRelationImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbStepPrecedenceRelation()
		 * @generated
		 */
		EClass SB_STEP_PRECEDENCE_RELATION = eINSTANCE.getSbStepPrecedenceRelation();

		/**
		 * The meta object literal for the '<em><b>Target Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP_PRECEDENCE_RELATION__TARGET_STEP = eINSTANCE.getSbStepPrecedenceRelation_TargetStep();

		/**
		 * The meta object literal for the '<em><b>Source Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP = eINSTANCE.getSbStepPrecedenceRelation_SourceStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SB_STEP_PRECEDENCE_RELATION__NAME = eINSTANCE.getSbStepPrecedenceRelation_Name();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbActionStepImpl <em>Sb Action Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbActionStepImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl#getSbActionStep()
		 * @generated
		 */
		EClass SB_ACTION_STEP = eINSTANCE.getSbActionStep();

	}

} //SoftwareBehaviorPackage
