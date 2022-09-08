/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Time Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl#getScheduleLink <em>Schedule Link</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl#getReferenceActivity <em>Reference Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpTimeLinkTypeImpl extends EObjectImpl implements RtpTimeLinkType {
	/**
	 * The default value of the '{@link #getScheduleLink() <em>Schedule Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleLink()
	 * @generated
	 * @ordered
	 */
	protected static final RtpScheduleLinkType SCHEDULE_LINK_EDEFAULT = RtpScheduleLinkType.AFTER_THE_BEGINNING_OF;

	/**
	 * The cached value of the '{@link #getScheduleLink() <em>Schedule Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleLink()
	 * @generated
	 * @ordered
	 */
	protected RtpScheduleLinkType scheduleLink = SCHEDULE_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int JOB_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJobNumber() <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNumber()
	 * @generated
	 * @ordered
	 */
	protected int jobNumber = JOB_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceActivity() <em>Reference Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceActivity()
	 * @generated
	 * @ordered
	 */
	protected SbSchedulingActivity referenceActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpTimeLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_TIME_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpScheduleLinkType getScheduleLink() {
		return scheduleLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleLink(RtpScheduleLinkType newScheduleLink) {
		RtpScheduleLinkType oldScheduleLink = scheduleLink;
		scheduleLink = newScheduleLink == null ? SCHEDULE_LINK_EDEFAULT : newScheduleLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__SCHEDULE_LINK, oldScheduleLink, scheduleLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJobNumber() {
		return jobNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobNumber(int newJobNumber) {
		int oldJobNumber = jobNumber;
		jobNumber = newJobNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__JOB_NUMBER, oldJobNumber, jobNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSchedulingActivity getReferenceActivity() {
		if (referenceActivity != null && referenceActivity.eIsProxy()) {
			InternalEObject oldReferenceActivity = (InternalEObject)referenceActivity;
			referenceActivity = (SbSchedulingActivity)eResolveProxy(oldReferenceActivity);
			if (referenceActivity != oldReferenceActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY, oldReferenceActivity, referenceActivity));
			}
		}
		return referenceActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbSchedulingActivity basicGetReferenceActivity() {
		return referenceActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceActivity(SbSchedulingActivity newReferenceActivity) {
		SbSchedulingActivity oldReferenceActivity = referenceActivity;
		referenceActivity = newReferenceActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY, oldReferenceActivity, referenceActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__SCHEDULE_LINK:
				return getScheduleLink();
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__JOB_NUMBER:
				return getJobNumber();
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY:
				if (resolve) return getReferenceActivity();
				return basicGetReferenceActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__SCHEDULE_LINK:
				setScheduleLink((RtpScheduleLinkType)newValue);
				return;
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__JOB_NUMBER:
				setJobNumber((Integer)newValue);
				return;
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY:
				setReferenceActivity((SbSchedulingActivity)newValue);
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
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__SCHEDULE_LINK:
				setScheduleLink(SCHEDULE_LINK_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__JOB_NUMBER:
				setJobNumber(JOB_NUMBER_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY:
				setReferenceActivity((SbSchedulingActivity)null);
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
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__SCHEDULE_LINK:
				return scheduleLink != SCHEDULE_LINK_EDEFAULT;
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__JOB_NUMBER:
				return jobNumber != JOB_NUMBER_EDEFAULT;
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY:
				return referenceActivity != null;
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
		result.append(" (scheduleLink: ");
		result.append(scheduleLink);
		result.append(", jobNumber: ");
		result.append(jobNumber);
		result.append(')');
		return result.toString();
	}

} //RtpTimeLinkTypeImpl
