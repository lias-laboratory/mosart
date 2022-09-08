/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sb Task Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getInputSquencingRelation <em>Input Squencing Relation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getOutputSequencingRelation <em>Output Sequencing Relation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getActionSteps <em>Action Steps</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRootActionStep <em>Root Action Step</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getStepPrecedenceRelations <em>Step Precedence Relations</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpDeadline <em>Rtp Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpExecutionTime <em>Rtp Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpOffset <em>Rtp Offset</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpBlockingTime <em>Rtp Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpRepetition <em>Rtp Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpResponseTime <em>Rtp Response Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpPriority <em>Rtp Priority</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRepresentedTask <em>Represented Task</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpCriticality <em>Rtp Criticality</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpPreemptibility <em>Rtp Preemptibility</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTaskActivityImpl#getRtpSelfSuspension <em>Rtp Self Suspension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbTaskActivityImpl extends EObjectImpl implements SbTaskActivity {
	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected SbTrigger trigger;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputSquencingRelation() <em>Input Squencing Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputSquencingRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<SbSequencingRelation> inputSquencingRelation;

	/**
	 * The cached value of the '{@link #getOutputSequencingRelation() <em>Output Sequencing Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSequencingRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<SbSequencingRelation> outputSequencingRelation;

	/**
	 * The cached value of the '{@link #getActionSteps() <em>Action Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SbStep> actionSteps;

	/**
	 * The cached value of the '{@link #getRootActionStep() <em>Root Action Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootActionStep()
	 * @generated
	 * @ordered
	 */
	protected SbStep rootActionStep;

	/**
	 * The cached value of the '{@link #getStepPrecedenceRelations() <em>Step Precedence Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPrecedenceRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SbStepPrecedenceRelation> stepPrecedenceRelations;

	/**
	 * The cached value of the '{@link #getRtpDeadline() <em>Rtp Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpDeadline()
	 * @generated
	 * @ordered
	 */
	protected RtpDeadlineType rtpDeadline;

	/**
	 * The cached value of the '{@link #getRtpExecutionTime() <em>Rtp Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected RtpExecutionTimeType rtpExecutionTime;

	/**
	 * The cached value of the '{@link #getRtpOffset() <em>Rtp Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpOffset()
	 * @generated
	 * @ordered
	 */
	protected RtpOffsetType rtpOffset;

	/**
	 * The cached value of the '{@link #getRtpBlockingTime() <em>Rtp Blocking Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected RtpBlockingTimeType rtpBlockingTime;

	/**
	 * The cached value of the '{@link #getRtpRepetition() <em>Rtp Repetition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpRepetition()
	 * @generated
	 * @ordered
	 */
	protected RtpRepetitionType rtpRepetition;

	/**
	 * The cached value of the '{@link #getRtpResponseTime() <em>Rtp Response Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpResponseTime()
	 * @generated
	 * @ordered
	 */
	protected RtpResponseTimeType rtpResponseTime;

	/**
	 * The cached value of the '{@link #getRtpPriority() <em>Rtp Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpPriority()
	 * @generated
	 * @ordered
	 */
	protected RtpPriorityType rtpPriority;

	/**
	 * The cached value of the '{@link #getRepresentedTask() <em>Represented Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedTask()
	 * @generated
	 * @ordered
	 */
	protected SoSchedulableTask representedTask;

	/**
	 * The cached setting delegate for the '{@link #getRepetition() <em>Repetition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REPETITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__REPETITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDeadline() <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DEADLINE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__DEADLINE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getExecutionTime() <em>Execution Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXECUTION_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__EXECUTION_TIME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBlockingTime() <em>Blocking Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BLOCKING_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__BLOCKING_TIME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PRIORITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__PRIORITY).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getResponseTime() <em>Response Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RESPONSE_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__RESPONSE_TIME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getOffset() <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OFFSET__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY__OFFSET).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRtpCriticality() <em>Rtp Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpCriticality()
	 * @generated
	 * @ordered
	 */
	protected RtpCriticalityType rtpCriticality;

	/**
	 * The cached value of the '{@link #getRtpPreemptibility() <em>Rtp Preemptibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpPreemptibility()
	 * @generated
	 * @ordered
	 */
	protected RtpPreemptibilityType rtpPreemptibility;

	/**
	 * The cached value of the '{@link #getRtpSelfSuspension() <em>Rtp Self Suspension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpSelfSuspension()
	 * @generated
	 * @ordered
	 */
	protected RtpSelfSuspensionType rtpSelfSuspension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbTaskActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTrigger getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (SbTrigger)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTrigger basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(SbTrigger newTrigger, NotificationChain msgs) {
		SbTrigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(SbTrigger newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, SoftwareBehaviorPackage.SB_TRIGGER__SCHEDULING_ACTIVITIES, SbTrigger.class, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, SoftwareBehaviorPackage.SB_TRIGGER__SCHEDULING_ACTIVITIES, SbTrigger.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbSequencingRelation> getInputSquencingRelation() {
		if (inputSquencingRelation == null) {
			inputSquencingRelation = new EObjectWithInverseResolvingEList<SbSequencingRelation>(SbSequencingRelation.class, this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION, SoftwareBehaviorPackage.SB_SEQUENCING_RELATION__TARGET_SCHEDULING_ACTIVITY);
		}
		return inputSquencingRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbSequencingRelation> getOutputSequencingRelation() {
		if (outputSequencingRelation == null) {
			outputSequencingRelation = new EObjectWithInverseResolvingEList<SbSequencingRelation>(SbSequencingRelation.class, this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION, SoftwareBehaviorPackage.SB_SEQUENCING_RELATION__SOURCE_SCHEDULING_ACTIVITY);
		}
		return outputSequencingRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbStep> getActionSteps() {
		if (actionSteps == null) {
			actionSteps = new EObjectContainmentEList<SbStep>(SbStep.class, this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS);
		}
		return actionSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStep getRootActionStep() {
		if (rootActionStep != null && rootActionStep.eIsProxy()) {
			InternalEObject oldRootActionStep = (InternalEObject)rootActionStep;
			rootActionStep = (SbStep)eResolveProxy(oldRootActionStep);
			if (rootActionStep != oldRootActionStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ROOT_ACTION_STEP, oldRootActionStep, rootActionStep));
			}
		}
		return rootActionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbStep basicGetRootActionStep() {
		return rootActionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootActionStep(SbStep newRootActionStep) {
		SbStep oldRootActionStep = rootActionStep;
		rootActionStep = newRootActionStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ROOT_ACTION_STEP, oldRootActionStep, rootActionStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbStepPrecedenceRelation> getStepPrecedenceRelations() {
		if (stepPrecedenceRelations == null) {
			stepPrecedenceRelations = new EObjectContainmentEList<SbStepPrecedenceRelation>(SbStepPrecedenceRelation.class, this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS);
		}
		return stepPrecedenceRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDeadlineType getRtpDeadline() {
		return rtpDeadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpDeadline(RtpDeadlineType newRtpDeadline, NotificationChain msgs) {
		RtpDeadlineType oldRtpDeadline = rtpDeadline;
		rtpDeadline = newRtpDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE, oldRtpDeadline, newRtpDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpDeadline(RtpDeadlineType newRtpDeadline) {
		if (newRtpDeadline != rtpDeadline) {
			NotificationChain msgs = null;
			if (rtpDeadline != null)
				msgs = ((InternalEObject)rtpDeadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE, null, msgs);
			if (newRtpDeadline != null)
				msgs = ((InternalEObject)newRtpDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE, null, msgs);
			msgs = basicSetRtpDeadline(newRtpDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE, newRtpDeadline, newRtpDeadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeType getRtpExecutionTime() {
		return rtpExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpExecutionTime(RtpExecutionTimeType newRtpExecutionTime, NotificationChain msgs) {
		RtpExecutionTimeType oldRtpExecutionTime = rtpExecutionTime;
		rtpExecutionTime = newRtpExecutionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME, oldRtpExecutionTime, newRtpExecutionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpExecutionTime(RtpExecutionTimeType newRtpExecutionTime) {
		if (newRtpExecutionTime != rtpExecutionTime) {
			NotificationChain msgs = null;
			if (rtpExecutionTime != null)
				msgs = ((InternalEObject)rtpExecutionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME, null, msgs);
			if (newRtpExecutionTime != null)
				msgs = ((InternalEObject)newRtpExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME, null, msgs);
			msgs = basicSetRtpExecutionTime(newRtpExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME, newRtpExecutionTime, newRtpExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpOffsetType getRtpOffset() {
		return rtpOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpOffset(RtpOffsetType newRtpOffset, NotificationChain msgs) {
		RtpOffsetType oldRtpOffset = rtpOffset;
		rtpOffset = newRtpOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET, oldRtpOffset, newRtpOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpOffset(RtpOffsetType newRtpOffset) {
		if (newRtpOffset != rtpOffset) {
			NotificationChain msgs = null;
			if (rtpOffset != null)
				msgs = ((InternalEObject)rtpOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET, null, msgs);
			if (newRtpOffset != null)
				msgs = ((InternalEObject)newRtpOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET, null, msgs);
			msgs = basicSetRtpOffset(newRtpOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET, newRtpOffset, newRtpOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpBlockingTimeType getRtpBlockingTime() {
		return rtpBlockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpBlockingTime(RtpBlockingTimeType newRtpBlockingTime, NotificationChain msgs) {
		RtpBlockingTimeType oldRtpBlockingTime = rtpBlockingTime;
		rtpBlockingTime = newRtpBlockingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME, oldRtpBlockingTime, newRtpBlockingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpBlockingTime(RtpBlockingTimeType newRtpBlockingTime) {
		if (newRtpBlockingTime != rtpBlockingTime) {
			NotificationChain msgs = null;
			if (rtpBlockingTime != null)
				msgs = ((InternalEObject)rtpBlockingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME, null, msgs);
			if (newRtpBlockingTime != null)
				msgs = ((InternalEObject)newRtpBlockingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME, null, msgs);
			msgs = basicSetRtpBlockingTime(newRtpBlockingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME, newRtpBlockingTime, newRtpBlockingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpRepetitionType getRtpRepetition() {
		return rtpRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpRepetition(RtpRepetitionType newRtpRepetition, NotificationChain msgs) {
		RtpRepetitionType oldRtpRepetition = rtpRepetition;
		rtpRepetition = newRtpRepetition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION, oldRtpRepetition, newRtpRepetition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpRepetition(RtpRepetitionType newRtpRepetition) {
		if (newRtpRepetition != rtpRepetition) {
			NotificationChain msgs = null;
			if (rtpRepetition != null)
				msgs = ((InternalEObject)rtpRepetition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION, null, msgs);
			if (newRtpRepetition != null)
				msgs = ((InternalEObject)newRtpRepetition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION, null, msgs);
			msgs = basicSetRtpRepetition(newRtpRepetition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION, newRtpRepetition, newRtpRepetition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpResponseTimeType getRtpResponseTime() {
		return rtpResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpResponseTime(RtpResponseTimeType newRtpResponseTime, NotificationChain msgs) {
		RtpResponseTimeType oldRtpResponseTime = rtpResponseTime;
		rtpResponseTime = newRtpResponseTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME, oldRtpResponseTime, newRtpResponseTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpResponseTime(RtpResponseTimeType newRtpResponseTime) {
		if (newRtpResponseTime != rtpResponseTime) {
			NotificationChain msgs = null;
			if (rtpResponseTime != null)
				msgs = ((InternalEObject)rtpResponseTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME, null, msgs);
			if (newRtpResponseTime != null)
				msgs = ((InternalEObject)newRtpResponseTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME, null, msgs);
			msgs = basicSetRtpResponseTime(newRtpResponseTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME, newRtpResponseTime, newRtpResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPriorityType getRtpPriority() {
		return rtpPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpPriority(RtpPriorityType newRtpPriority, NotificationChain msgs) {
		RtpPriorityType oldRtpPriority = rtpPriority;
		rtpPriority = newRtpPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY, oldRtpPriority, newRtpPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpPriority(RtpPriorityType newRtpPriority) {
		if (newRtpPriority != rtpPriority) {
			NotificationChain msgs = null;
			if (rtpPriority != null)
				msgs = ((InternalEObject)rtpPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY, null, msgs);
			if (newRtpPriority != null)
				msgs = ((InternalEObject)newRtpPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY, null, msgs);
			msgs = basicSetRtpPriority(newRtpPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY, newRtpPriority, newRtpPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSchedulableTask getRepresentedTask() {
		if (representedTask != null && representedTask.eIsProxy()) {
			InternalEObject oldRepresentedTask = (InternalEObject)representedTask;
			representedTask = (SoSchedulableTask)eResolveProxy(oldRepresentedTask);
			if (representedTask != oldRepresentedTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK, oldRepresentedTask, representedTask));
			}
		}
		return representedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSchedulableTask basicGetRepresentedTask() {
		return representedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedTask(SoSchedulableTask newRepresentedTask, NotificationChain msgs) {
		SoSchedulableTask oldRepresentedTask = representedTask;
		representedTask = newRepresentedTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK, oldRepresentedTask, newRepresentedTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedTask(SoSchedulableTask newRepresentedTask) {
		if (newRepresentedTask != representedTask) {
			NotificationChain msgs = null;
			if (representedTask != null)
				msgs = ((InternalEObject)representedTask).eInverseRemove(this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY, SoSchedulableTask.class, msgs);
			if (newRepresentedTask != null)
				msgs = ((InternalEObject)newRepresentedTask).eInverseAdd(this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY, SoSchedulableTask.class, msgs);
			msgs = basicSetRepresentedTask(newRepresentedTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK, newRepresentedTask, newRepresentedTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpRepetitionType getRepetition() {
		return (RtpRepetitionType)REPETITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpRepetitionType basicGetRepetition() {
		return (RtpRepetitionType)REPETITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetition(RtpRepetitionType newRepetition) {
		REPETITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRepetition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDeadlineType getDeadline() {
		return (RtpDeadlineType)DEADLINE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDeadlineType basicGetDeadline() {
		return (RtpDeadlineType)DEADLINE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(RtpDeadlineType newDeadline) {
		DEADLINE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDeadline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeType getExecutionTime() {
		return (RtpExecutionTimeType)EXECUTION_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeType basicGetExecutionTime() {
		return (RtpExecutionTimeType)EXECUTION_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTime(RtpExecutionTimeType newExecutionTime) {
		EXECUTION_TIME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newExecutionTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpBlockingTimeType getBlockingTime() {
		return (RtpBlockingTimeType)BLOCKING_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpBlockingTimeType basicGetBlockingTime() {
		return (RtpBlockingTimeType)BLOCKING_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(RtpBlockingTimeType newBlockingTime) {
		BLOCKING_TIME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newBlockingTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPriorityType getPriority() {
		return (RtpPriorityType)PRIORITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPriorityType basicGetPriority() {
		return (RtpPriorityType)PRIORITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(RtpPriorityType newPriority) {
		PRIORITY__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpResponseTimeType getResponseTime() {
		return (RtpResponseTimeType)RESPONSE_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpResponseTimeType basicGetResponseTime() {
		return (RtpResponseTimeType)RESPONSE_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(RtpResponseTimeType newResponseTime) {
		RESPONSE_TIME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newResponseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpOffsetType getOffset() {
		return (RtpOffsetType)OFFSET__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpOffsetType basicGetOffset() {
		return (RtpOffsetType)OFFSET__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(RtpOffsetType newOffset) {
		OFFSET__ESETTING_DELEGATE.dynamicSet(this, null, 0, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpCriticalityType getRtpCriticality() {
		return rtpCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpCriticality(RtpCriticalityType newRtpCriticality, NotificationChain msgs) {
		RtpCriticalityType oldRtpCriticality = rtpCriticality;
		rtpCriticality = newRtpCriticality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY, oldRtpCriticality, newRtpCriticality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpCriticality(RtpCriticalityType newRtpCriticality) {
		if (newRtpCriticality != rtpCriticality) {
			NotificationChain msgs = null;
			if (rtpCriticality != null)
				msgs = ((InternalEObject)rtpCriticality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY, null, msgs);
			if (newRtpCriticality != null)
				msgs = ((InternalEObject)newRtpCriticality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY, null, msgs);
			msgs = basicSetRtpCriticality(newRtpCriticality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY, newRtpCriticality, newRtpCriticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPreemptibilityType getRtpPreemptibility() {
		return rtpPreemptibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpPreemptibility(RtpPreemptibilityType newRtpPreemptibility, NotificationChain msgs) {
		RtpPreemptibilityType oldRtpPreemptibility = rtpPreemptibility;
		rtpPreemptibility = newRtpPreemptibility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY, oldRtpPreemptibility, newRtpPreemptibility);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpPreemptibility(RtpPreemptibilityType newRtpPreemptibility) {
		if (newRtpPreemptibility != rtpPreemptibility) {
			NotificationChain msgs = null;
			if (rtpPreemptibility != null)
				msgs = ((InternalEObject)rtpPreemptibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY, null, msgs);
			if (newRtpPreemptibility != null)
				msgs = ((InternalEObject)newRtpPreemptibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY, null, msgs);
			msgs = basicSetRtpPreemptibility(newRtpPreemptibility, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY, newRtpPreemptibility, newRtpPreemptibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpSelfSuspensionType getRtpSelfSuspension() {
		return rtpSelfSuspension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpSelfSuspension(RtpSelfSuspensionType newRtpSelfSuspension, NotificationChain msgs) {
		RtpSelfSuspensionType oldRtpSelfSuspension = rtpSelfSuspension;
		rtpSelfSuspension = newRtpSelfSuspension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION, oldRtpSelfSuspension, newRtpSelfSuspension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpSelfSuspension(RtpSelfSuspensionType newRtpSelfSuspension) {
		if (newRtpSelfSuspension != rtpSelfSuspension) {
			NotificationChain msgs = null;
			if (rtpSelfSuspension != null)
				msgs = ((InternalEObject)rtpSelfSuspension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION, null, msgs);
			if (newRtpSelfSuspension != null)
				msgs = ((InternalEObject)newRtpSelfSuspension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION, null, msgs);
			msgs = basicSetRtpSelfSuspension(newRtpSelfSuspension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION, newRtpSelfSuspension, newRtpSelfSuspension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER:
				if (trigger != null)
					msgs = ((InternalEObject)trigger).eInverseRemove(this, SoftwareBehaviorPackage.SB_TRIGGER__SCHEDULING_ACTIVITIES, SbTrigger.class, msgs);
				return basicSetTrigger((SbTrigger)otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputSquencingRelation()).basicAdd(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputSequencingRelation()).basicAdd(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK:
				if (representedTask != null)
					msgs = ((InternalEObject)representedTask).eInverseRemove(this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY, SoSchedulableTask.class, msgs);
				return basicSetRepresentedTask((SoSchedulableTask)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER:
				return basicSetTrigger(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION:
				return ((InternalEList<?>)getInputSquencingRelation()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION:
				return ((InternalEList<?>)getOutputSequencingRelation()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS:
				return ((InternalEList<?>)getActionSteps()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS:
				return ((InternalEList<?>)getStepPrecedenceRelations()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE:
				return basicSetRtpDeadline(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME:
				return basicSetRtpExecutionTime(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET:
				return basicSetRtpOffset(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME:
				return basicSetRtpBlockingTime(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION:
				return basicSetRtpRepetition(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME:
				return basicSetRtpResponseTime(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY:
				return basicSetRtpPriority(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK:
				return basicSetRepresentedTask(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY:
				return basicSetRtpCriticality(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY:
				return basicSetRtpPreemptibility(null, msgs);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION:
				return basicSetRtpSelfSuspension(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__NAME:
				return getName();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION:
				return getInputSquencingRelation();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION:
				return getOutputSequencingRelation();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS:
				return getActionSteps();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ROOT_ACTION_STEP:
				if (resolve) return getRootActionStep();
				return basicGetRootActionStep();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS:
				return getStepPrecedenceRelations();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE:
				return getRtpDeadline();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME:
				return getRtpExecutionTime();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET:
				return getRtpOffset();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME:
				return getRtpBlockingTime();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION:
				return getRtpRepetition();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME:
				return getRtpResponseTime();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY:
				return getRtpPriority();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK:
				if (resolve) return getRepresentedTask();
				return basicGetRepresentedTask();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPETITION:
				if (resolve) return getRepetition();
				return basicGetRepetition();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__DEADLINE:
				if (resolve) return getDeadline();
				return basicGetDeadline();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__EXECUTION_TIME:
				if (resolve) return getExecutionTime();
				return basicGetExecutionTime();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__BLOCKING_TIME:
				if (resolve) return getBlockingTime();
				return basicGetBlockingTime();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RESPONSE_TIME:
				if (resolve) return getResponseTime();
				return basicGetResponseTime();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OFFSET:
				if (resolve) return getOffset();
				return basicGetOffset();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY:
				return getRtpCriticality();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY:
				return getRtpPreemptibility();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION:
				return getRtpSelfSuspension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER:
				setTrigger((SbTrigger)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION:
				getInputSquencingRelation().clear();
				getInputSquencingRelation().addAll((Collection<? extends SbSequencingRelation>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION:
				getOutputSequencingRelation().clear();
				getOutputSequencingRelation().addAll((Collection<? extends SbSequencingRelation>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS:
				getActionSteps().clear();
				getActionSteps().addAll((Collection<? extends SbStep>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ROOT_ACTION_STEP:
				setRootActionStep((SbStep)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS:
				getStepPrecedenceRelations().clear();
				getStepPrecedenceRelations().addAll((Collection<? extends SbStepPrecedenceRelation>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE:
				setRtpDeadline((RtpDeadlineType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME:
				setRtpExecutionTime((RtpExecutionTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET:
				setRtpOffset((RtpOffsetType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME:
				setRtpBlockingTime((RtpBlockingTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION:
				setRtpRepetition((RtpRepetitionType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME:
				setRtpResponseTime((RtpResponseTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY:
				setRtpPriority((RtpPriorityType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK:
				setRepresentedTask((SoSchedulableTask)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPETITION:
				setRepetition((RtpRepetitionType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__DEADLINE:
				setDeadline((RtpDeadlineType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__EXECUTION_TIME:
				setExecutionTime((RtpExecutionTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__BLOCKING_TIME:
				setBlockingTime((RtpBlockingTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__PRIORITY:
				setPriority((RtpPriorityType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RESPONSE_TIME:
				setResponseTime((RtpResponseTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OFFSET:
				setOffset((RtpOffsetType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY:
				setRtpCriticality((RtpCriticalityType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY:
				setRtpPreemptibility((RtpPreemptibilityType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION:
				setRtpSelfSuspension((RtpSelfSuspensionType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER:
				setTrigger((SbTrigger)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION:
				getInputSquencingRelation().clear();
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION:
				getOutputSequencingRelation().clear();
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS:
				getActionSteps().clear();
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ROOT_ACTION_STEP:
				setRootActionStep((SbStep)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS:
				getStepPrecedenceRelations().clear();
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE:
				setRtpDeadline((RtpDeadlineType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME:
				setRtpExecutionTime((RtpExecutionTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET:
				setRtpOffset((RtpOffsetType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME:
				setRtpBlockingTime((RtpBlockingTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION:
				setRtpRepetition((RtpRepetitionType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME:
				setRtpResponseTime((RtpResponseTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY:
				setRtpPriority((RtpPriorityType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK:
				setRepresentedTask((SoSchedulableTask)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPETITION:
				setRepetition((RtpRepetitionType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__DEADLINE:
				setDeadline((RtpDeadlineType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__EXECUTION_TIME:
				setExecutionTime((RtpExecutionTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__BLOCKING_TIME:
				setBlockingTime((RtpBlockingTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__PRIORITY:
				setPriority((RtpPriorityType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RESPONSE_TIME:
				setResponseTime((RtpResponseTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OFFSET:
				setOffset((RtpOffsetType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY:
				setRtpCriticality((RtpCriticalityType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY:
				setRtpPreemptibility((RtpPreemptibilityType)null);
				return;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION:
				setRtpSelfSuspension((RtpSelfSuspensionType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__TRIGGER:
				return trigger != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__INPUT_SQUENCING_RELATION:
				return inputSquencingRelation != null && !inputSquencingRelation.isEmpty();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OUTPUT_SEQUENCING_RELATION:
				return outputSequencingRelation != null && !outputSequencingRelation.isEmpty();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ACTION_STEPS:
				return actionSteps != null && !actionSteps.isEmpty();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__ROOT_ACTION_STEP:
				return rootActionStep != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS:
				return stepPrecedenceRelations != null && !stepPrecedenceRelations.isEmpty();
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_DEADLINE:
				return rtpDeadline != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_EXECUTION_TIME:
				return rtpExecutionTime != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_OFFSET:
				return rtpOffset != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_BLOCKING_TIME:
				return rtpBlockingTime != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_REPETITION:
				return rtpRepetition != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_RESPONSE_TIME:
				return rtpResponseTime != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PRIORITY:
				return rtpPriority != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK:
				return representedTask != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPETITION:
				return REPETITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__DEADLINE:
				return DEADLINE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__EXECUTION_TIME:
				return EXECUTION_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__BLOCKING_TIME:
				return BLOCKING_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__PRIORITY:
				return PRIORITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RESPONSE_TIME:
				return RESPONSE_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__OFFSET:
				return OFFSET__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_CRITICALITY:
				return rtpCriticality != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY:
				return rtpPreemptibility != null;
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION:
				return rtpSelfSuspension != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SbTaskActivityImpl
