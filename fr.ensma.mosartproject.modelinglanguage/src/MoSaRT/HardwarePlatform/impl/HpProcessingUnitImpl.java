/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;
import MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hp Processing Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getRtpUtilizationFactor <em>Rtp Utilization Factor</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getSpaceProcesses <em>Space Processes</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getCandidateTasks <em>Candidate Tasks</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getSchedulableTasks <em>Schedulable Tasks</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getUtilizationFactor <em>Utilization Factor</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getProcessorInterconnector <em>Processor Interconnector</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl#getRtpComputingSpeed <em>Rtp Computing Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpProcessingUnitImpl extends EObjectImpl implements HpProcessingUnit {
	/**
	 * The cached value of the '{@link #getCommChannel() <em>Comm Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommChannel()
	 * @generated
	 * @ordered
	 */
	protected HpCommunicationChannel commChannel;

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
	 * The cached value of the '{@link #getRtpUtilizationFactor() <em>Rtp Utilization Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpUtilizationFactor()
	 * @generated
	 * @ordered
	 */
	protected RtpUtilizationFactorType rtpUtilizationFactor;

	/**
	 * The cached value of the '{@link #getSpaceProcesses() <em>Space Processes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSpaceProcess> spaceProcesses;

	/**
	 * The cached value of the '{@link #getCandidateTasks() <em>Candidate Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> candidateTasks;

	/**
	 * The cached value of the '{@link #getSchedulableTasks() <em>Schedulable Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulableTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> schedulableTasks;

	/**
	 * The cached setting delegate for the '{@link #getUtilizationFactor() <em>Utilization Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationFactor()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate UTILIZATION_FACTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT__UTILIZATION_FACTOR).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getProcessorInterconnector() <em>Processor Interconnector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorInterconnector()
	 * @generated
	 * @ordered
	 */
	protected HpProcessorInterconnector processorInterconnector;

	/**
	 * The cached value of the '{@link #getRtpComputingSpeed() <em>Rtp Computing Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpComputingSpeed()
	 * @generated
	 * @ordered
	 */
	protected RtpComputingSpeedType rtpComputingSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpProcessingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel getCommChannel() {
		if (commChannel != null && commChannel.eIsProxy()) {
			InternalEObject oldCommChannel = (InternalEObject)commChannel;
			commChannel = (HpCommunicationChannel)eResolveProxy(oldCommChannel);
			if (commChannel != oldCommChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL, oldCommChannel, commChannel));
			}
		}
		return commChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel basicGetCommChannel() {
		return commChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommChannel(HpCommunicationChannel newCommChannel, NotificationChain msgs) {
		HpCommunicationChannel oldCommChannel = commChannel;
		commChannel = newCommChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL, oldCommChannel, newCommChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommChannel(HpCommunicationChannel newCommChannel) {
		if (newCommChannel != commChannel) {
			NotificationChain msgs = null;
			if (commChannel != null)
				msgs = ((InternalEObject)commChannel).eInverseRemove(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS, HpCommunicationChannel.class, msgs);
			if (newCommChannel != null)
				msgs = ((InternalEObject)newCommChannel).eInverseAdd(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS, HpCommunicationChannel.class, msgs);
			msgs = basicSetCommChannel(newCommChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL, newCommChannel, newCommChannel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilizationFactorType getRtpUtilizationFactor() {
		return rtpUtilizationFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpUtilizationFactor(RtpUtilizationFactorType newRtpUtilizationFactor, NotificationChain msgs) {
		RtpUtilizationFactorType oldRtpUtilizationFactor = rtpUtilizationFactor;
		rtpUtilizationFactor = newRtpUtilizationFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR, oldRtpUtilizationFactor, newRtpUtilizationFactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpUtilizationFactor(RtpUtilizationFactorType newRtpUtilizationFactor) {
		if (newRtpUtilizationFactor != rtpUtilizationFactor) {
			NotificationChain msgs = null;
			if (rtpUtilizationFactor != null)
				msgs = ((InternalEObject)rtpUtilizationFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR, null, msgs);
			if (newRtpUtilizationFactor != null)
				msgs = ((InternalEObject)newRtpUtilizationFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR, null, msgs);
			msgs = basicSetRtpUtilizationFactor(newRtpUtilizationFactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR, newRtpUtilizationFactor, newRtpUtilizationFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSpaceProcess> getSpaceProcesses() {
		if (spaceProcesses == null) {
			spaceProcesses = new EObjectWithInverseResolvingEList.ManyInverse<SoSpaceProcess>(SoSpaceProcess.class, this, HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES, SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT);
		}
		return spaceProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getCandidateTasks() {
		if (candidateTasks == null) {
			candidateTasks = new EObjectWithInverseResolvingEList.ManyInverse<SoSchedulableTask>(SoSchedulableTask.class, this, HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS);
		}
		return candidateTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getSchedulableTasks() {
		if (schedulableTasks == null) {
			schedulableTasks = new EObjectWithInverseResolvingEList.ManyInverse<SoSchedulableTask>(SoSchedulableTask.class, this, HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS);
		}
		return schedulableTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilizationFactorType getUtilizationFactor() {
		return (RtpUtilizationFactorType)UTILIZATION_FACTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilizationFactorType basicGetUtilizationFactor() {
		return (RtpUtilizationFactorType)UTILIZATION_FACTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizationFactor(RtpUtilizationFactorType newUtilizationFactor) {
		UTILIZATION_FACTOR__ESETTING_DELEGATE.dynamicSet(this, null, 0, newUtilizationFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpProcessorInterconnector getProcessorInterconnector() {
		if (processorInterconnector != null && processorInterconnector.eIsProxy()) {
			InternalEObject oldProcessorInterconnector = (InternalEObject)processorInterconnector;
			processorInterconnector = (HpProcessorInterconnector)eResolveProxy(oldProcessorInterconnector);
			if (processorInterconnector != oldProcessorInterconnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR, oldProcessorInterconnector, processorInterconnector));
			}
		}
		return processorInterconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpProcessorInterconnector basicGetProcessorInterconnector() {
		return processorInterconnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessorInterconnector(HpProcessorInterconnector newProcessorInterconnector, NotificationChain msgs) {
		HpProcessorInterconnector oldProcessorInterconnector = processorInterconnector;
		processorInterconnector = newProcessorInterconnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR, oldProcessorInterconnector, newProcessorInterconnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorInterconnector(HpProcessorInterconnector newProcessorInterconnector) {
		if (newProcessorInterconnector != processorInterconnector) {
			NotificationChain msgs = null;
			if (processorInterconnector != null)
				msgs = ((InternalEObject)processorInterconnector).eInverseRemove(this, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS, HpProcessorInterconnector.class, msgs);
			if (newProcessorInterconnector != null)
				msgs = ((InternalEObject)newProcessorInterconnector).eInverseAdd(this, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS, HpProcessorInterconnector.class, msgs);
			msgs = basicSetProcessorInterconnector(newProcessorInterconnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR, newProcessorInterconnector, newProcessorInterconnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputingSpeedType getRtpComputingSpeed() {
		return rtpComputingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpComputingSpeed(RtpComputingSpeedType newRtpComputingSpeed, NotificationChain msgs) {
		RtpComputingSpeedType oldRtpComputingSpeed = rtpComputingSpeed;
		rtpComputingSpeed = newRtpComputingSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED, oldRtpComputingSpeed, newRtpComputingSpeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpComputingSpeed(RtpComputingSpeedType newRtpComputingSpeed) {
		if (newRtpComputingSpeed != rtpComputingSpeed) {
			NotificationChain msgs = null;
			if (rtpComputingSpeed != null)
				msgs = ((InternalEObject)rtpComputingSpeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED, null, msgs);
			if (newRtpComputingSpeed != null)
				msgs = ((InternalEObject)newRtpComputingSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED, null, msgs);
			msgs = basicSetRtpComputingSpeed(newRtpComputingSpeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED, newRtpComputingSpeed, newRtpComputingSpeed));
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
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL:
				if (commChannel != null)
					msgs = ((InternalEObject)commChannel).eInverseRemove(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS, HpCommunicationChannel.class, msgs);
				return basicSetCommChannel((HpCommunicationChannel)otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpaceProcesses()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCandidateTasks()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulableTasks()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR:
				if (processorInterconnector != null)
					msgs = ((InternalEObject)processorInterconnector).eInverseRemove(this, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS, HpProcessorInterconnector.class, msgs);
				return basicSetProcessorInterconnector((HpProcessorInterconnector)otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL:
				return basicSetCommChannel(null, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR:
				return basicSetRtpUtilizationFactor(null, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES:
				return ((InternalEList<?>)getSpaceProcesses()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS:
				return ((InternalEList<?>)getCandidateTasks()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS:
				return ((InternalEList<?>)getSchedulableTasks()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR:
				return basicSetProcessorInterconnector(null, msgs);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED:
				return basicSetRtpComputingSpeed(null, msgs);
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
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL:
				if (resolve) return getCommChannel();
				return basicGetCommChannel();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__NAME:
				return getName();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR:
				return getRtpUtilizationFactor();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES:
				return getSpaceProcesses();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS:
				return getCandidateTasks();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS:
				return getSchedulableTasks();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__UTILIZATION_FACTOR:
				if (resolve) return getUtilizationFactor();
				return basicGetUtilizationFactor();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR:
				if (resolve) return getProcessorInterconnector();
				return basicGetProcessorInterconnector();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED:
				return getRtpComputingSpeed();
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
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL:
				setCommChannel((HpCommunicationChannel)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__NAME:
				setName((String)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR:
				setRtpUtilizationFactor((RtpUtilizationFactorType)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES:
				getSpaceProcesses().clear();
				getSpaceProcesses().addAll((Collection<? extends SoSpaceProcess>)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS:
				getCandidateTasks().clear();
				getCandidateTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS:
				getSchedulableTasks().clear();
				getSchedulableTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__UTILIZATION_FACTOR:
				setUtilizationFactor((RtpUtilizationFactorType)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR:
				setProcessorInterconnector((HpProcessorInterconnector)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED:
				setRtpComputingSpeed((RtpComputingSpeedType)newValue);
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
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL:
				setCommChannel((HpCommunicationChannel)null);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR:
				setRtpUtilizationFactor((RtpUtilizationFactorType)null);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES:
				getSpaceProcesses().clear();
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS:
				getCandidateTasks().clear();
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS:
				getSchedulableTasks().clear();
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__UTILIZATION_FACTOR:
				setUtilizationFactor((RtpUtilizationFactorType)null);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR:
				setProcessorInterconnector((HpProcessorInterconnector)null);
				return;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED:
				setRtpComputingSpeed((RtpComputingSpeedType)null);
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
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL:
				return commChannel != null;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR:
				return rtpUtilizationFactor != null;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES:
				return spaceProcesses != null && !spaceProcesses.isEmpty();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS:
				return candidateTasks != null && !candidateTasks.isEmpty();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS:
				return schedulableTasks != null && !schedulableTasks.isEmpty();
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__UTILIZATION_FACTOR:
				return UTILIZATION_FACTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR:
				return processorInterconnector != null;
			case HardwarePlatformPackage.HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED:
				return rtpComputingSpeed != null;
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

} //HpProcessingUnitImpl
