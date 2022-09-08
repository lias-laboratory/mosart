/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sb Acquire Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getInputStepRelation <em>Input Step Relation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getOutputStepRelation <em>Output Step Relation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getRtpDeadline <em>Rtp Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getRtpExecutionTime <em>Rtp Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getRtpBlockingTime <em>Rtp Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getRtpRepetition <em>Rtp Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getRepresentedOperation <em>Represented Operation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getInteractionResource <em>Interaction Resource</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbAcquireStepImpl#getStepPredecessors <em>Step Predecessors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbAcquireStepImpl extends EObjectImpl implements SbAcquireStep {
	/**
	 * The cached value of the '{@link #getInputStepRelation() <em>Input Step Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputStepRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<SbStepPrecedenceRelation> inputStepRelation;

	/**
	 * The cached value of the '{@link #getOutputStepRelation() <em>Output Step Relation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputStepRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<SbStepPrecedenceRelation> outputStepRelation;

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
	 * The cached value of the '{@link #getRepresentedOperation() <em>Represented Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation representedOperation;

	/**
	 * The cached setting delegate for the '{@link #getRepetition() <em>Repetition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REPETITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_STEP__REPETITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getDeadline() <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DEADLINE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_STEP__DEADLINE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getExecutionTime() <em>Execution Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXECUTION_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_STEP__EXECUTION_TIME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getBlockingTime() <em>Blocking Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BLOCKING_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_STEP__BLOCKING_TIME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getInteractionResource() <em>Interaction Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionResource()
	 * @generated
	 * @ordered
	 */
	protected SoInteractionResource interactionResource;

	/**
	 * The cached setting delegate for the '{@link #getStepPredecessors() <em>Step Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STEP_PREDECESSORS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_STEP__STEP_PREDECESSORS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbAcquireStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.SB_ACQUIRE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbStepPrecedenceRelation> getInputStepRelation() {
		if (inputStepRelation == null) {
			inputStepRelation = new EObjectWithInverseResolvingEList<SbStepPrecedenceRelation>(SbStepPrecedenceRelation.class, this, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__TARGET_STEP);
		}
		return inputStepRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbStepPrecedenceRelation> getOutputStepRelation() {
		if (outputStepRelation == null) {
			outputStepRelation = new EObjectWithInverseResolvingEList<SbStepPrecedenceRelation>(SbStepPrecedenceRelation.class, this, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION, SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP);
		}
		return outputStepRelation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE, oldRtpDeadline, newRtpDeadline);
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
				msgs = ((InternalEObject)rtpDeadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE, null, msgs);
			if (newRtpDeadline != null)
				msgs = ((InternalEObject)newRtpDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE, null, msgs);
			msgs = basicSetRtpDeadline(newRtpDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE, newRtpDeadline, newRtpDeadline));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME, oldRtpExecutionTime, newRtpExecutionTime);
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
				msgs = ((InternalEObject)rtpExecutionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME, null, msgs);
			if (newRtpExecutionTime != null)
				msgs = ((InternalEObject)newRtpExecutionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME, null, msgs);
			msgs = basicSetRtpExecutionTime(newRtpExecutionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME, newRtpExecutionTime, newRtpExecutionTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME, oldRtpBlockingTime, newRtpBlockingTime);
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
				msgs = ((InternalEObject)rtpBlockingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME, null, msgs);
			if (newRtpBlockingTime != null)
				msgs = ((InternalEObject)newRtpBlockingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME, null, msgs);
			msgs = basicSetRtpBlockingTime(newRtpBlockingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME, newRtpBlockingTime, newRtpBlockingTime));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION, oldRtpRepetition, newRtpRepetition);
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
				msgs = ((InternalEObject)rtpRepetition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION, null, msgs);
			if (newRtpRepetition != null)
				msgs = ((InternalEObject)newRtpRepetition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION, null, msgs);
			msgs = basicSetRtpRepetition(newRtpRepetition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION, newRtpRepetition, newRtpRepetition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRepresentedOperation() {
		if (representedOperation != null && representedOperation.eIsProxy()) {
			InternalEObject oldRepresentedOperation = (InternalEObject)representedOperation;
			representedOperation = (Operation)eResolveProxy(oldRepresentedOperation);
			if (representedOperation != oldRepresentedOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPRESENTED_OPERATION, oldRepresentedOperation, representedOperation));
			}
		}
		return representedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetRepresentedOperation() {
		return representedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedOperation(Operation newRepresentedOperation) {
		Operation oldRepresentedOperation = representedOperation;
		representedOperation = newRepresentedOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPRESENTED_OPERATION, oldRepresentedOperation, representedOperation));
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
	public SoInteractionResource getInteractionResource() {
		if (interactionResource != null && interactionResource.eIsProxy()) {
			InternalEObject oldInteractionResource = (InternalEObject)interactionResource;
			interactionResource = (SoInteractionResource)eResolveProxy(oldInteractionResource);
			if (interactionResource != oldInteractionResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INTERACTION_RESOURCE, oldInteractionResource, interactionResource));
			}
		}
		return interactionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoInteractionResource basicGetInteractionResource() {
		return interactionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionResource(SoInteractionResource newInteractionResource) {
		SoInteractionResource oldInteractionResource = interactionResource;
		interactionResource = newInteractionResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INTERACTION_RESOURCE, oldInteractionResource, interactionResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SbStep> getStepPredecessors() {
		return (EList<SbStep>)STEP_PREDECESSORS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputStepRelation()).basicAdd(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputStepRelation()).basicAdd(otherEnd, msgs);
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
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION:
				return ((InternalEList<?>)getInputStepRelation()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION:
				return ((InternalEList<?>)getOutputStepRelation()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE:
				return basicSetRtpDeadline(null, msgs);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME:
				return basicSetRtpExecutionTime(null, msgs);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME:
				return basicSetRtpBlockingTime(null, msgs);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION:
				return basicSetRtpRepetition(null, msgs);
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
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION:
				return getInputStepRelation();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION:
				return getOutputStepRelation();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__NAME:
				return getName();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE:
				return getRtpDeadline();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME:
				return getRtpExecutionTime();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME:
				return getRtpBlockingTime();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION:
				return getRtpRepetition();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPRESENTED_OPERATION:
				if (resolve) return getRepresentedOperation();
				return basicGetRepresentedOperation();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPETITION:
				if (resolve) return getRepetition();
				return basicGetRepetition();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__DEADLINE:
				if (resolve) return getDeadline();
				return basicGetDeadline();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__EXECUTION_TIME:
				if (resolve) return getExecutionTime();
				return basicGetExecutionTime();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__BLOCKING_TIME:
				if (resolve) return getBlockingTime();
				return basicGetBlockingTime();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INTERACTION_RESOURCE:
				if (resolve) return getInteractionResource();
				return basicGetInteractionResource();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__STEP_PREDECESSORS:
				return getStepPredecessors();
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
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION:
				getInputStepRelation().clear();
				getInputStepRelation().addAll((Collection<? extends SbStepPrecedenceRelation>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION:
				getOutputStepRelation().clear();
				getOutputStepRelation().addAll((Collection<? extends SbStepPrecedenceRelation>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__NAME:
				setName((String)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE:
				setRtpDeadline((RtpDeadlineType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME:
				setRtpExecutionTime((RtpExecutionTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME:
				setRtpBlockingTime((RtpBlockingTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION:
				setRtpRepetition((RtpRepetitionType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPRESENTED_OPERATION:
				setRepresentedOperation((Operation)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPETITION:
				setRepetition((RtpRepetitionType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__DEADLINE:
				setDeadline((RtpDeadlineType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__EXECUTION_TIME:
				setExecutionTime((RtpExecutionTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__BLOCKING_TIME:
				setBlockingTime((RtpBlockingTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INTERACTION_RESOURCE:
				setInteractionResource((SoInteractionResource)newValue);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__STEP_PREDECESSORS:
				getStepPredecessors().clear();
				getStepPredecessors().addAll((Collection<? extends SbStep>)newValue);
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
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION:
				getInputStepRelation().clear();
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION:
				getOutputStepRelation().clear();
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE:
				setRtpDeadline((RtpDeadlineType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME:
				setRtpExecutionTime((RtpExecutionTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME:
				setRtpBlockingTime((RtpBlockingTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION:
				setRtpRepetition((RtpRepetitionType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPRESENTED_OPERATION:
				setRepresentedOperation((Operation)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPETITION:
				setRepetition((RtpRepetitionType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__DEADLINE:
				setDeadline((RtpDeadlineType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__EXECUTION_TIME:
				setExecutionTime((RtpExecutionTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__BLOCKING_TIME:
				setBlockingTime((RtpBlockingTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INTERACTION_RESOURCE:
				setInteractionResource((SoInteractionResource)null);
				return;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__STEP_PREDECESSORS:
				getStepPredecessors().clear();
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
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INPUT_STEP_RELATION:
				return inputStepRelation != null && !inputStepRelation.isEmpty();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__OUTPUT_STEP_RELATION:
				return outputStepRelation != null && !outputStepRelation.isEmpty();
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_DEADLINE:
				return rtpDeadline != null;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_EXECUTION_TIME:
				return rtpExecutionTime != null;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_BLOCKING_TIME:
				return rtpBlockingTime != null;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__RTP_REPETITION:
				return rtpRepetition != null;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPRESENTED_OPERATION:
				return representedOperation != null;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__REPETITION:
				return REPETITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__DEADLINE:
				return DEADLINE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__EXECUTION_TIME:
				return EXECUTION_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__BLOCKING_TIME:
				return BLOCKING_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__INTERACTION_RESOURCE:
				return interactionResource != null;
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP__STEP_PREDECESSORS:
				return STEP_PREDECESSORS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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

} //SbAcquireStepImpl
