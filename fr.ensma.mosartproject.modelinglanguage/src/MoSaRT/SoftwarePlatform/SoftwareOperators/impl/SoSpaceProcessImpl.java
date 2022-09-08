/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import java.util.ArrayList;
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
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>So Space Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getSpaceProcessParent <em>Space Process Parent</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getSpaceProcessChildren <em>Space Process Children</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getSchedulableTasks <em>Schedulable Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getProcessingUnit <em>Processing Unit</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getRtpSchedulingPolicy <em>Rtp Scheduling Policy</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getAllSpaceProcessParents <em>All Space Process Parents</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl#getRtpTaskAllocation <em>Rtp Task Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoSpaceProcessImpl extends EObjectImpl implements SoSpaceProcess {
	/**
	 * The cached value of the '{@link #getSpaceProcessParent() <em>Space Process Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceProcessParent()
	 * @generated
	 * @ordered
	 */
	protected SoSpaceProcess spaceProcessParent;

	/**
	 * The cached value of the '{@link #getSpaceProcessChildren() <em>Space Process Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceProcessChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSpaceProcess> spaceProcessChildren;

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
	 * The cached value of the '{@link #getProcessingUnit() <em>Processing Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessingUnit> processingUnit;

	/**
	 * The cached value of the '{@link #getRtpSchedulingPolicy() <em>Rtp Scheduling Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpSchedulingPolicy()
	 * @generated
	 * @ordered
	 */
	protected RtpSchedulingPolicyType rtpSchedulingPolicy;

	/**
	 * The cached value of the '{@link #getRtpTaskAllocation() <em>Rtp Task Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpTaskAllocation()
	 * @generated
	 * @ordered
	 */
	protected RtpTaskAllocationType rtpTaskAllocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoSpaceProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSpaceProcess getSpaceProcessParent() {
		if (spaceProcessParent != null && spaceProcessParent.eIsProxy()) {
			InternalEObject oldSpaceProcessParent = (InternalEObject)spaceProcessParent;
			spaceProcessParent = (SoSpaceProcess)eResolveProxy(oldSpaceProcessParent);
			if (spaceProcessParent != oldSpaceProcessParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT, oldSpaceProcessParent, spaceProcessParent));
			}
		}
		return spaceProcessParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSpaceProcess basicGetSpaceProcessParent() {
		return spaceProcessParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpaceProcessParent(SoSpaceProcess newSpaceProcessParent, NotificationChain msgs) {
		SoSpaceProcess oldSpaceProcessParent = spaceProcessParent;
		spaceProcessParent = newSpaceProcessParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT, oldSpaceProcessParent, newSpaceProcessParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceProcessParent(SoSpaceProcess newSpaceProcessParent) {
		if (newSpaceProcessParent != spaceProcessParent) {
			NotificationChain msgs = null;
			if (spaceProcessParent != null)
				msgs = ((InternalEObject)spaceProcessParent).eInverseRemove(this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN, SoSpaceProcess.class, msgs);
			if (newSpaceProcessParent != null)
				msgs = ((InternalEObject)newSpaceProcessParent).eInverseAdd(this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN, SoSpaceProcess.class, msgs);
			msgs = basicSetSpaceProcessParent(newSpaceProcessParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT, newSpaceProcessParent, newSpaceProcessParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSpaceProcess> getSpaceProcessChildren() {
		if (spaceProcessChildren == null) {
			spaceProcessChildren = new EObjectWithInverseResolvingEList<SoSpaceProcess>(SoSpaceProcess.class, this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT);
		}
		return spaceProcessChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getSchedulableTasks() {
		if (schedulableTasks == null) {
			schedulableTasks = new EObjectWithInverseResolvingEList<SoSchedulableTask>(SoSchedulableTask.class, this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__PROCESS);
		}
		return schedulableTasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessingUnit> getProcessingUnit() {
		if (processingUnit == null) {
			processingUnit = new EObjectWithInverseResolvingEList.ManyInverse<HpProcessingUnit>(HpProcessingUnit.class, this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT, HardwarePlatformPackage.HP_PROCESSING_UNIT__SPACE_PROCESSES);
		}
		return processingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpSchedulingPolicyType getRtpSchedulingPolicy() {
		return rtpSchedulingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpSchedulingPolicy(RtpSchedulingPolicyType newRtpSchedulingPolicy, NotificationChain msgs) {
		RtpSchedulingPolicyType oldRtpSchedulingPolicy = rtpSchedulingPolicy;
		rtpSchedulingPolicy = newRtpSchedulingPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY, oldRtpSchedulingPolicy, newRtpSchedulingPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpSchedulingPolicy(RtpSchedulingPolicyType newRtpSchedulingPolicy) {
		if (newRtpSchedulingPolicy != rtpSchedulingPolicy) {
			NotificationChain msgs = null;
			if (rtpSchedulingPolicy != null)
				msgs = ((InternalEObject)rtpSchedulingPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY, null, msgs);
			if (newRtpSchedulingPolicy != null)
				msgs = ((InternalEObject)newRtpSchedulingPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY, null, msgs);
			msgs = basicSetRtpSchedulingPolicy(newRtpSchedulingPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY, newRtpSchedulingPolicy, newRtpSchedulingPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	
	public EList<SoSpaceProcess> getAllSpaceProcessParents() {
		
		EStructuralFeature eFeature = SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS;
		SoSpaceProcess processParent = this.spaceProcessParent;
		Collection<SoSpaceProcess> result = new ArrayList<SoSpaceProcess>();
		
		
		result.clear();
		
		
		while (processParent != null){
			
			if(this.spaceProcessChildren.contains(processParent)) { 
				result.add(processParent);
				
				break;
				}
			
			result.add(processParent);
			processParent=processParent.getSpaceProcessParent();	
			
			}
			
		return new EcoreEList.UnmodifiableEList<SoSpaceProcess>(this, eFeature, result.size(), result.toArray());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTaskAllocationType getRtpTaskAllocation() {
		return rtpTaskAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpTaskAllocation(RtpTaskAllocationType newRtpTaskAllocation, NotificationChain msgs) {
		RtpTaskAllocationType oldRtpTaskAllocation = rtpTaskAllocation;
		rtpTaskAllocation = newRtpTaskAllocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION, oldRtpTaskAllocation, newRtpTaskAllocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpTaskAllocation(RtpTaskAllocationType newRtpTaskAllocation) {
		if (newRtpTaskAllocation != rtpTaskAllocation) {
			NotificationChain msgs = null;
			if (rtpTaskAllocation != null)
				msgs = ((InternalEObject)rtpTaskAllocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION, null, msgs);
			if (newRtpTaskAllocation != null)
				msgs = ((InternalEObject)newRtpTaskAllocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION, null, msgs);
			msgs = basicSetRtpTaskAllocation(newRtpTaskAllocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION, newRtpTaskAllocation, newRtpTaskAllocation));
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
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT:
				if (spaceProcessParent != null)
					msgs = ((InternalEObject)spaceProcessParent).eInverseRemove(this, SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN, SoSpaceProcess.class, msgs);
				return basicSetSpaceProcessParent((SoSpaceProcess)otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpaceProcessChildren()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulableTasks()).basicAdd(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessingUnit()).basicAdd(otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT:
				return basicSetSpaceProcessParent(null, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN:
				return ((InternalEList<?>)getSpaceProcessChildren()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS:
				return ((InternalEList<?>)getSchedulableTasks()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT:
				return ((InternalEList<?>)getProcessingUnit()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY:
				return basicSetRtpSchedulingPolicy(null, msgs);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION:
				return basicSetRtpTaskAllocation(null, msgs);
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
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT:
				if (resolve) return getSpaceProcessParent();
				return basicGetSpaceProcessParent();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN:
				return getSpaceProcessChildren();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS:
				return getSchedulableTasks();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__NAME:
				return getName();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT:
				return getProcessingUnit();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY:
				return getRtpSchedulingPolicy();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS:
				return getAllSpaceProcessParents();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION:
				return getRtpTaskAllocation();
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
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT:
				setSpaceProcessParent((SoSpaceProcess)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN:
				getSpaceProcessChildren().clear();
				getSpaceProcessChildren().addAll((Collection<? extends SoSpaceProcess>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS:
				getSchedulableTasks().clear();
				getSchedulableTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__NAME:
				setName((String)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT:
				getProcessingUnit().clear();
				getProcessingUnit().addAll((Collection<? extends HpProcessingUnit>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY:
				setRtpSchedulingPolicy((RtpSchedulingPolicyType)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS:
				getAllSpaceProcessParents().clear();
				getAllSpaceProcessParents().addAll((Collection<? extends SoSpaceProcess>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION:
				setRtpTaskAllocation((RtpTaskAllocationType)newValue);
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
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT:
				setSpaceProcessParent((SoSpaceProcess)null);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN:
				getSpaceProcessChildren().clear();
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS:
				getSchedulableTasks().clear();
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT:
				getProcessingUnit().clear();
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY:
				setRtpSchedulingPolicy((RtpSchedulingPolicyType)null);
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS:
				getAllSpaceProcessParents().clear();
				return;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION:
				setRtpTaskAllocation((RtpTaskAllocationType)null);
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
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_PARENT:
				return spaceProcessParent != null;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN:
				return spaceProcessChildren != null && !spaceProcessChildren.isEmpty();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__SCHEDULABLE_TASKS:
				return schedulableTasks != null && !schedulableTasks.isEmpty();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__PROCESSING_UNIT:
				return processingUnit != null && !processingUnit.isEmpty();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY:
				return rtpSchedulingPolicy != null;
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS:
				return !getAllSpaceProcessParents().isEmpty();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS__RTP_TASK_ALLOCATION:
				return rtpTaskAllocation != null;
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

} //SoSpaceProcessImpl
