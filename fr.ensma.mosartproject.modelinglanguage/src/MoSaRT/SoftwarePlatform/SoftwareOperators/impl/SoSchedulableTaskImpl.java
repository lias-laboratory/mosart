/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>So Schedulable Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getCommWritingResources <em>Comm Writing Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getCommReadingResources <em>Comm Reading Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getMutualExclusionResourceUtilization <em>Mutual Exclusion Resource Utilization</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getFavoriteProcessors <em>Favorite Processors</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getRunOnProcessors <em>Run On Processors</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getRepresentedActivity <em>Represented Activity</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl#getRtpMutualExclusionResourceUtilization <em>Rtp Mutual Exclusion Resource Utilization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoSchedulableTaskImpl extends EObjectImpl implements SoSchedulableTask {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected SoSpaceProcess process;

	/**
	 * The cached value of the '{@link #getMutualExclusionResources() <em>Mutual Exclusion Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusionResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoMutualExclusionResource> mutualExclusionResources;

	/**
	 * The cached value of the '{@link #getCommWritingResources() <em>Comm Writing Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommWritingResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoCommunicationResource> commWritingResources;

	/**
	 * The cached value of the '{@link #getCommReadingResources() <em>Comm Reading Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommReadingResources()
	 * @generated
	 * @ordered
	 */
	protected EList<SoCommunicationResource> commReadingResources;

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
	 * The cached setting delegate for the '{@link #getMutualExclusionResourceUtilization() <em>Mutual Exclusion Resource Utilization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutualExclusionResourceUtilization()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MUTUAL_EXCLUSION_RESOURCE_UTILIZATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getFavoriteProcessors() <em>Favorite Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFavoriteProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessingUnit> favoriteProcessors;

	/**
	 * The cached value of the '{@link #getRunOnProcessors() <em>Run On Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunOnProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessingUnit> runOnProcessors;

	/**
	 * The cached value of the '{@link #getRepresentedActivity() <em>Represented Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedActivity()
	 * @generated
	 * @ordered
	 */
	protected SbTaskActivity representedActivity;

	/**
	 * The cached value of the '{@link #getRtpMutualExclusionResourceUtilization() <em>Rtp Mutual Exclusion Resource Utilization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpMutualExclusionResourceUtilization()
	 * @generated
	 * @ordered
	 */
	protected EList<RtpMutuExcluResourceUtilizationType> rtpMutualExclusionResourceUtilization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoSchedulableTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSpaceProcess getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (SoSpaceProcess)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSpaceProcess basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(SoSpaceProcess newProcess, NotificationChain msgs) {
		SoSpaceProcess oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS, oldProcess, newProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(SoSpaceProcess newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS, SoSpaceProcess.class, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS, SoSpaceProcess.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoMutualExclusionResource> getMutualExclusionResources() {
		if (mutualExclusionResources == null) {
			mutualExclusionResources = new EObjectWithInverseResolvingEList.ManyInverse<SoMutualExclusionResource>(SoMutualExclusionResource.class, this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS);
		}
		return mutualExclusionResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoCommunicationResource> getCommWritingResources() {
		if (commWritingResources == null) {
			commWritingResources = new EObjectWithInverseResolvingEList.ManyInverse<SoCommunicationResource>(SoCommunicationResource.class, this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES, SoftwareOperatorsPackage.SO_COMMUNICATION_RESOURCE__WRITER_TASKS);
		}
		return commWritingResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoCommunicationResource> getCommReadingResources() {
		if (commReadingResources == null) {
			commReadingResources = new EObjectWithInverseResolvingEList.ManyInverse<SoCommunicationResource>(SoCommunicationResource.class, this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES, SoftwareOperatorsPackage.SO_COMMUNICATION_RESOURCE__READER_TASKS);
		}
		return commReadingResources;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RtpMutuExcluResourceUtilizationType> getMutualExclusionResourceUtilization() {
		return (EList<RtpMutuExcluResourceUtilizationType>)MUTUAL_EXCLUSION_RESOURCE_UTILIZATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessingUnit> getFavoriteProcessors() {
		if (favoriteProcessors == null) {
			favoriteProcessors = new EObjectWithInverseResolvingEList.ManyInverse<HpProcessingUnit>(HpProcessingUnit.class, this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS, HardwarePlatformPackage.HP_PROCESSING_UNIT__CANDIDATE_TASKS);
		}
		return favoriteProcessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessingUnit> getRunOnProcessors() {
		if (runOnProcessors == null) {
			runOnProcessors = new EObjectWithInverseResolvingEList.ManyInverse<HpProcessingUnit>(HpProcessingUnit.class, this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS, HardwarePlatformPackage.HP_PROCESSING_UNIT__SCHEDULABLE_TASKS);
		}
		return runOnProcessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTaskActivity getRepresentedActivity() {
		if (representedActivity != null && representedActivity.eIsProxy()) {
			InternalEObject oldRepresentedActivity = (InternalEObject)representedActivity;
			representedActivity = (SbTaskActivity)eResolveProxy(oldRepresentedActivity);
			if (representedActivity != oldRepresentedActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY, oldRepresentedActivity, representedActivity));
			}
		}
		return representedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbTaskActivity basicGetRepresentedActivity() {
		return representedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentedActivity(SbTaskActivity newRepresentedActivity, NotificationChain msgs) {
		SbTaskActivity oldRepresentedActivity = representedActivity;
		representedActivity = newRepresentedActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY, oldRepresentedActivity, newRepresentedActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedActivity(SbTaskActivity newRepresentedActivity) {
		if (newRepresentedActivity != representedActivity) {
			NotificationChain msgs = null;
			if (representedActivity != null)
				msgs = ((InternalEObject)representedActivity).eInverseRemove(this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK, SbTaskActivity.class, msgs);
			if (newRepresentedActivity != null)
				msgs = ((InternalEObject)newRepresentedActivity).eInverseAdd(this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK, SbTaskActivity.class, msgs);
			msgs = basicSetRepresentedActivity(newRepresentedActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY, newRepresentedActivity, newRepresentedActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RtpMutuExcluResourceUtilizationType> getRtpMutualExclusionResourceUtilization() {
		if (rtpMutualExclusionResourceUtilization == null) {
			rtpMutualExclusionResourceUtilization = new EObjectContainmentEList<RtpMutuExcluResourceUtilizationType>(RtpMutuExcluResourceUtilizationType.class, this, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION);
		}
		return rtpMutualExclusionResourceUtilization;
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
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS:
				if (process != null)
					msgs = ((InternalEObject)process).eInverseRemove(this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS, SoSpaceProcess.class, msgs);
				return basicSetProcess((SoSpaceProcess)otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMutualExclusionResources()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommWritingResources()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCommReadingResources()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFavoriteProcessors()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRunOnProcessors()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY:
				if (representedActivity != null)
					msgs = ((InternalEObject)representedActivity).eInverseRemove(this, SoftwareBehaviorPackage.SB_TASK_ACTIVITY__REPRESENTED_TASK, SbTaskActivity.class, msgs);
				return basicSetRepresentedActivity((SbTaskActivity)otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS:
				return basicSetProcess(null, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES:
				return ((InternalEList<?>)getMutualExclusionResources()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES:
				return ((InternalEList<?>)getCommWritingResources()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES:
				return ((InternalEList<?>)getCommReadingResources()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS:
				return ((InternalEList<?>)getFavoriteProcessors()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS:
				return ((InternalEList<?>)getRunOnProcessors()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY:
				return basicSetRepresentedActivity(null, msgs);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				return ((InternalEList<?>)getRtpMutualExclusionResourceUtilization()).basicRemove(otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES:
				return getMutualExclusionResources();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES:
				return getCommWritingResources();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES:
				return getCommReadingResources();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__NAME:
				return getName();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				return getMutualExclusionResourceUtilization();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS:
				return getFavoriteProcessors();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS:
				return getRunOnProcessors();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY:
				if (resolve) return getRepresentedActivity();
				return basicGetRepresentedActivity();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				return getRtpMutualExclusionResourceUtilization();
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
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS:
				setProcess((SoSpaceProcess)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				getMutualExclusionResources().addAll((Collection<? extends SoMutualExclusionResource>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES:
				getCommWritingResources().clear();
				getCommWritingResources().addAll((Collection<? extends SoCommunicationResource>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES:
				getCommReadingResources().clear();
				getCommReadingResources().addAll((Collection<? extends SoCommunicationResource>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__NAME:
				setName((String)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				getMutualExclusionResourceUtilization().clear();
				getMutualExclusionResourceUtilization().addAll((Collection<? extends RtpMutuExcluResourceUtilizationType>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS:
				getFavoriteProcessors().clear();
				getFavoriteProcessors().addAll((Collection<? extends HpProcessingUnit>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS:
				getRunOnProcessors().clear();
				getRunOnProcessors().addAll((Collection<? extends HpProcessingUnit>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY:
				setRepresentedActivity((SbTaskActivity)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				getRtpMutualExclusionResourceUtilization().clear();
				getRtpMutualExclusionResourceUtilization().addAll((Collection<? extends RtpMutuExcluResourceUtilizationType>)newValue);
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
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS:
				setProcess((SoSpaceProcess)null);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES:
				getMutualExclusionResources().clear();
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES:
				getCommWritingResources().clear();
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES:
				getCommReadingResources().clear();
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				getMutualExclusionResourceUtilization().clear();
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS:
				getFavoriteProcessors().clear();
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS:
				getRunOnProcessors().clear();
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY:
				setRepresentedActivity((SbTaskActivity)null);
				return;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				getRtpMutualExclusionResourceUtilization().clear();
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
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS:
				return process != null;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES:
				return mutualExclusionResources != null && !mutualExclusionResources.isEmpty();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES:
				return commWritingResources != null && !commWritingResources.isEmpty();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES:
				return commReadingResources != null && !commReadingResources.isEmpty();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				return MUTUAL_EXCLUSION_RESOURCE_UTILIZATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS:
				return favoriteProcessors != null && !favoriteProcessors.isEmpty();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS:
				return runOnProcessors != null && !runOnProcessors.isEmpty();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY:
				return representedActivity != null;
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION:
				return rtpMutualExclusionResourceUtilization != null && !rtpMutualExclusionResourceUtilization.isEmpty();
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

} //SoSchedulableTaskImpl
