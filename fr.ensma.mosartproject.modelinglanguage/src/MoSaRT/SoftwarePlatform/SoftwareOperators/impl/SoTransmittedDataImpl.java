/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>So Transmitted Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl#getSourceTask <em>Source Task</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl#getTargetTasks <em>Target Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl#getRtpDataSize <em>Rtp Data Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoTransmittedDataImpl extends EObjectImpl implements SoTransmittedData {
	/**
	 * The cached value of the '{@link #getSourceTask() <em>Source Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTask()
	 * @generated
	 * @ordered
	 */
	protected SoSchedulableTask sourceTask;

	/**
	 * The cached value of the '{@link #getTargetTasks() <em>Target Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<SoSchedulableTask> targetTasks;

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
	 * The cached setting delegate for the '{@link #getDataSize() <em>Data Size</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DATA_SIZE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareOperatorsPackage.Literals.SO_TRANSMITTED_DATA__DATA_SIZE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRtpDataSize() <em>Rtp Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpDataSize()
	 * @generated
	 * @ordered
	 */
	protected RtpDataSizeType rtpDataSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoTransmittedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareOperatorsPackage.Literals.SO_TRANSMITTED_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSchedulableTask getSourceTask() {
		if (sourceTask != null && sourceTask.eIsProxy()) {
			InternalEObject oldSourceTask = (InternalEObject)sourceTask;
			sourceTask = (SoSchedulableTask)eResolveProxy(oldSourceTask);
			if (sourceTask != oldSourceTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__SOURCE_TASK, oldSourceTask, sourceTask));
			}
		}
		return sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSchedulableTask basicGetSourceTask() {
		return sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTask(SoSchedulableTask newSourceTask) {
		SoSchedulableTask oldSourceTask = sourceTask;
		sourceTask = newSourceTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__SOURCE_TASK, oldSourceTask, sourceTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoSchedulableTask> getTargetTasks() {
		if (targetTasks == null) {
			targetTasks = new EObjectResolvingEList<SoSchedulableTask>(SoSchedulableTask.class, this, SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__TARGET_TASKS);
		}
		return targetTasks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataSizeType getDataSize() {
		return (RtpDataSizeType)DATA_SIZE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataSizeType basicGetDataSize() {
		return (RtpDataSizeType)DATA_SIZE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSize(RtpDataSizeType newDataSize) {
		DATA_SIZE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newDataSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataSizeType getRtpDataSize() {
		return rtpDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpDataSize(RtpDataSizeType newRtpDataSize, NotificationChain msgs) {
		RtpDataSizeType oldRtpDataSize = rtpDataSize;
		rtpDataSize = newRtpDataSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE, oldRtpDataSize, newRtpDataSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpDataSize(RtpDataSizeType newRtpDataSize) {
		if (newRtpDataSize != rtpDataSize) {
			NotificationChain msgs = null;
			if (rtpDataSize != null)
				msgs = ((InternalEObject)rtpDataSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE, null, msgs);
			if (newRtpDataSize != null)
				msgs = ((InternalEObject)newRtpDataSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE, null, msgs);
			msgs = basicSetRtpDataSize(newRtpDataSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE, newRtpDataSize, newRtpDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE:
				return basicSetRtpDataSize(null, msgs);
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
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__SOURCE_TASK:
				if (resolve) return getSourceTask();
				return basicGetSourceTask();
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__TARGET_TASKS:
				return getTargetTasks();
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__NAME:
				return getName();
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__DATA_SIZE:
				if (resolve) return getDataSize();
				return basicGetDataSize();
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE:
				return getRtpDataSize();
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
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__SOURCE_TASK:
				setSourceTask((SoSchedulableTask)newValue);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__TARGET_TASKS:
				getTargetTasks().clear();
				getTargetTasks().addAll((Collection<? extends SoSchedulableTask>)newValue);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__NAME:
				setName((String)newValue);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__DATA_SIZE:
				setDataSize((RtpDataSizeType)newValue);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE:
				setRtpDataSize((RtpDataSizeType)newValue);
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
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__SOURCE_TASK:
				setSourceTask((SoSchedulableTask)null);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__TARGET_TASKS:
				getTargetTasks().clear();
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__DATA_SIZE:
				setDataSize((RtpDataSizeType)null);
				return;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE:
				setRtpDataSize((RtpDataSizeType)null);
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
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__SOURCE_TASK:
				return sourceTask != null;
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__TARGET_TASKS:
				return targetTasks != null && !targetTasks.isEmpty();
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__DATA_SIZE:
				return DATA_SIZE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA__RTP_DATA_SIZE:
				return rtpDataSize != null;
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

} //SoTransmittedDataImpl
