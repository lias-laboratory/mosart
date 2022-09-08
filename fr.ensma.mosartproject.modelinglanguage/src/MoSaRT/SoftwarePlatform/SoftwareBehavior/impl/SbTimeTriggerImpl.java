/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

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
 * An implementation of the model object '<em><b>Sb Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl#getSchedulingActivities <em>Scheduling Activities</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl#getRtpReleaseTime <em>Rtp Release Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl#getRtpPeriodicity <em>Rtp Periodicity</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SbTimeTriggerImpl#getPeriodicity <em>Periodicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbTimeTriggerImpl extends EObjectImpl implements SbTimeTrigger {
	/**
	 * The cached value of the '{@link #getSchedulingActivities() <em>Scheduling Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<SbSchedulingActivity> schedulingActivities;

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
	 * The cached value of the '{@link #getRtpReleaseTime() <em>Rtp Release Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected RtpReleaseTimeType rtpReleaseTime;

	/**
	 * The cached value of the '{@link #getRtpPeriodicity() <em>Rtp Periodicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected RtpPeriodicityType rtpPeriodicity;

	/**
	 * The cached setting delegate for the '{@link #getStartTime() <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate START_TIME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TIME_TRIGGER__START_TIME).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getPeriodicity() <em>Periodicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicity()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PERIODICITY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SoftwareBehaviorPackage.Literals.SB_TIME_TRIGGER__PERIODICITY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbTimeTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwareBehaviorPackage.Literals.SB_TIME_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbSchedulingActivity> getSchedulingActivities() {
		if (schedulingActivities == null) {
			schedulingActivities = new EObjectWithInverseResolvingEList<SbSchedulingActivity>(SbSchedulingActivity.class, this, SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES, SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY__TRIGGER);
		}
		return schedulingActivities;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TIME_TRIGGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpReleaseTimeType getRtpReleaseTime() {
		return rtpReleaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpReleaseTime(RtpReleaseTimeType newRtpReleaseTime, NotificationChain msgs) {
		RtpReleaseTimeType oldRtpReleaseTime = rtpReleaseTime;
		rtpReleaseTime = newRtpReleaseTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME, oldRtpReleaseTime, newRtpReleaseTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpReleaseTime(RtpReleaseTimeType newRtpReleaseTime) {
		if (newRtpReleaseTime != rtpReleaseTime) {
			NotificationChain msgs = null;
			if (rtpReleaseTime != null)
				msgs = ((InternalEObject)rtpReleaseTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME, null, msgs);
			if (newRtpReleaseTime != null)
				msgs = ((InternalEObject)newRtpReleaseTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME, null, msgs);
			msgs = basicSetRtpReleaseTime(newRtpReleaseTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME, newRtpReleaseTime, newRtpReleaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPeriodicityType getRtpPeriodicity() {
		return rtpPeriodicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpPeriodicity(RtpPeriodicityType newRtpPeriodicity, NotificationChain msgs) {
		RtpPeriodicityType oldRtpPeriodicity = rtpPeriodicity;
		rtpPeriodicity = newRtpPeriodicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY, oldRtpPeriodicity, newRtpPeriodicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpPeriodicity(RtpPeriodicityType newRtpPeriodicity) {
		if (newRtpPeriodicity != rtpPeriodicity) {
			NotificationChain msgs = null;
			if (rtpPeriodicity != null)
				msgs = ((InternalEObject)rtpPeriodicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY, null, msgs);
			if (newRtpPeriodicity != null)
				msgs = ((InternalEObject)newRtpPeriodicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY, null, msgs);
			msgs = basicSetRtpPeriodicity(newRtpPeriodicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY, newRtpPeriodicity, newRtpPeriodicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpReleaseTimeType getStartTime() {
		return (RtpReleaseTimeType)START_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpReleaseTimeType basicGetStartTime() {
		return (RtpReleaseTimeType)START_TIME__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(RtpReleaseTimeType newStartTime) {
		START_TIME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPeriodicityType getPeriodicity() {
		return (RtpPeriodicityType)PERIODICITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPeriodicityType basicGetPeriodicity() {
		return (RtpPeriodicityType)PERIODICITY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicity(RtpPeriodicityType newPeriodicity) {
		PERIODICITY__ESETTING_DELEGATE.dynamicSet(this, null, 0, newPeriodicity);
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
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSchedulingActivities()).basicAdd(otherEnd, msgs);
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
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES:
				return ((InternalEList<?>)getSchedulingActivities()).basicRemove(otherEnd, msgs);
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME:
				return basicSetRtpReleaseTime(null, msgs);
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY:
				return basicSetRtpPeriodicity(null, msgs);
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
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES:
				return getSchedulingActivities();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__NAME:
				return getName();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME:
				return getRtpReleaseTime();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY:
				return getRtpPeriodicity();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__START_TIME:
				if (resolve) return getStartTime();
				return basicGetStartTime();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__PERIODICITY:
				if (resolve) return getPeriodicity();
				return basicGetPeriodicity();
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
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES:
				getSchedulingActivities().clear();
				getSchedulingActivities().addAll((Collection<? extends SbSchedulingActivity>)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__NAME:
				setName((String)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME:
				setRtpReleaseTime((RtpReleaseTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY:
				setRtpPeriodicity((RtpPeriodicityType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__START_TIME:
				setStartTime((RtpReleaseTimeType)newValue);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__PERIODICITY:
				setPeriodicity((RtpPeriodicityType)newValue);
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
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES:
				getSchedulingActivities().clear();
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME:
				setRtpReleaseTime((RtpReleaseTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY:
				setRtpPeriodicity((RtpPeriodicityType)null);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__START_TIME:
				setStartTime((RtpReleaseTimeType)null);
				return;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__PERIODICITY:
				setPeriodicity((RtpPeriodicityType)null);
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
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__SCHEDULING_ACTIVITIES:
				return schedulingActivities != null && !schedulingActivities.isEmpty();
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_RELEASE_TIME:
				return rtpReleaseTime != null;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__RTP_PERIODICITY:
				return rtpPeriodicity != null;
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__START_TIME:
				return START_TIME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER__PERIODICITY:
				return PERIODICITY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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

} //SbTimeTriggerImpl
