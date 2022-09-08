/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Start Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpReleaseTimeTypeImpl#getReleaseTime <em>Release Time</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpReleaseTimeTypeImpl#getReferring <em>Referring</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpReleaseTimeTypeImpl extends EObjectImpl implements RtpReleaseTimeType {
	/**
	 * The cached value of the '{@link #getReleaseTime() <em>Release Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTime()
	 * @generated
	 * @ordered
	 */
	protected RtpDurationType releaseTime;

	/**
	 * The cached value of the '{@link #getReferring() <em>Referring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferring()
	 * @generated
	 * @ordered
	 */
	protected RtpReferenceType referring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpReleaseTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_RELEASE_TIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDurationType getReleaseTime() {
		return releaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseTime(RtpDurationType newReleaseTime, NotificationChain msgs) {
		RtpDurationType oldReleaseTime = releaseTime;
		releaseTime = newReleaseTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME, oldReleaseTime, newReleaseTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseTime(RtpDurationType newReleaseTime) {
		if (newReleaseTime != releaseTime) {
			NotificationChain msgs = null;
			if (releaseTime != null)
				msgs = ((InternalEObject)releaseTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME, null, msgs);
			if (newReleaseTime != null)
				msgs = ((InternalEObject)newReleaseTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME, null, msgs);
			msgs = basicSetReleaseTime(newReleaseTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME, newReleaseTime, newReleaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpReferenceType getReferring() {
		return referring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferring(RtpReferenceType newReferring, NotificationChain msgs) {
		RtpReferenceType oldReferring = referring;
		referring = newReferring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING, oldReferring, newReferring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferring(RtpReferenceType newReferring) {
		if (newReferring != referring) {
			NotificationChain msgs = null;
			if (referring != null)
				msgs = ((InternalEObject)referring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING, null, msgs);
			if (newReferring != null)
				msgs = ((InternalEObject)newReferring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING, null, msgs);
			msgs = basicSetReferring(newReferring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING, newReferring, newReferring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME:
				return basicSetReleaseTime(null, msgs);
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING:
				return basicSetReferring(null, msgs);
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
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME:
				return getReleaseTime();
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING:
				return getReferring();
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
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME:
				setReleaseTime((RtpDurationType)newValue);
				return;
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING:
				setReferring((RtpReferenceType)newValue);
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
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME:
				setReleaseTime((RtpDurationType)null);
				return;
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING:
				setReferring((RtpReferenceType)null);
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
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__RELEASE_TIME:
				return releaseTime != null;
			case RtpTypesPackage.RTP_RELEASE_TIME_TYPE__REFERRING:
				return referring != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpReleaseTimeTypeImpl
