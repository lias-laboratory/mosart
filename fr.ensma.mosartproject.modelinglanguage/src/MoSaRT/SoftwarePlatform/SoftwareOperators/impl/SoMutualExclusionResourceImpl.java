/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>So Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoMutualExclusionResourceImpl extends EObjectImpl implements SoMutualExclusionResource {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> tasks;

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
	 * The cached value of the '{@link #getRtpProtectProtocol() <em>Rtp Protect Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpProtectProtocol()
	 * @generated
	 * @ordered
	 */
	protected RtpProtectProtocolType rtpProtectProtocol;

	/**
	 * The cached value of the '{@link #getRtpWaitingQueuePolicy() <em>Rtp Waiting Queue Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpWaitingQueuePolicy()
	 * @generated
	 * @ordered
	 */
	protected RtpWaitingQueuePolicyType rtpWaitingQueuePolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoMutualExclusionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareOperatorsPackage.Literals.SO_MUTUAL_EXCLUSION_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getTasks() {
		if (tasks == null) {
			tasks = new EObjectWithInverseResolvingEList.ManyInverse<SoSchedulableTask>(SoSchedulableTask.class, this, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS, SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES);
		}
		return tasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtectProtocolType getRtpProtectProtocol() {
		return rtpProtectProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpProtectProtocol(RtpProtectProtocolType newRtpProtectProtocol, NotificationChain msgs) {
		RtpProtectProtocolType oldRtpProtectProtocol = rtpProtectProtocol;
		rtpProtectProtocol = newRtpProtectProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL, oldRtpProtectProtocol, newRtpProtectProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpProtectProtocol(RtpProtectProtocolType newRtpProtectProtocol) {
		if (newRtpProtectProtocol != rtpProtectProtocol) {
			NotificationChain msgs = null;
			if (rtpProtectProtocol != null)
				msgs = ((InternalEObject)rtpProtectProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL, null, msgs);
			if (newRtpProtectProtocol != null)
				msgs = ((InternalEObject)newRtpProtectProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL, null, msgs);
			msgs = basicSetRtpProtectProtocol(newRtpProtectProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL, newRtpProtectProtocol, newRtpProtectProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpWaitingQueuePolicyType getRtpWaitingQueuePolicy() {
		return rtpWaitingQueuePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpWaitingQueuePolicy(RtpWaitingQueuePolicyType newRtpWaitingQueuePolicy, NotificationChain msgs) {
		RtpWaitingQueuePolicyType oldRtpWaitingQueuePolicy = rtpWaitingQueuePolicy;
		rtpWaitingQueuePolicy = newRtpWaitingQueuePolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY, oldRtpWaitingQueuePolicy, newRtpWaitingQueuePolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpWaitingQueuePolicy(RtpWaitingQueuePolicyType newRtpWaitingQueuePolicy) {
		if (newRtpWaitingQueuePolicy != rtpWaitingQueuePolicy) {
			NotificationChain msgs = null;
			if (rtpWaitingQueuePolicy != null)
				msgs = ((InternalEObject)rtpWaitingQueuePolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY, null, msgs);
			if (newRtpWaitingQueuePolicy != null)
				msgs = ((InternalEObject)newRtpWaitingQueuePolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY, null, msgs);
			msgs = basicSetRtpWaitingQueuePolicy(newRtpWaitingQueuePolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY, newRtpWaitingQueuePolicy, newRtpWaitingQueuePolicy));
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
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
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
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL:
				return basicSetRtpProtectProtocol(null, msgs);
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY:
				return basicSetRtpWaitingQueuePolicy(null, msgs);
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
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS:
				return getTasks();
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__NAME:
				return getName();
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL:
				return getRtpProtectProtocol();
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY:
				return getRtpWaitingQueuePolicy();
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
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL:
				setRtpProtectProtocol((RtpProtectProtocolType)newValue);
				return;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY:
				setRtpWaitingQueuePolicy((RtpWaitingQueuePolicyType)newValue);
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
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS:
				getTasks().clear();
				return;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL:
				setRtpProtectProtocol((RtpProtectProtocolType)null);
				return;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY:
				setRtpWaitingQueuePolicy((RtpWaitingQueuePolicyType)null);
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
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL:
				return rtpProtectProtocol != null;
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY:
				return rtpWaitingQueuePolicy != null;
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

} //SoMutualExclusionResourceImpl
