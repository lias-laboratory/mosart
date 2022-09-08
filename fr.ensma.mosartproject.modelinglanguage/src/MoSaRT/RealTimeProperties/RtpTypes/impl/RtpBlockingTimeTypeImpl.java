/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Blocking Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpBlockingTimeTypeImpl#getBlockingTime <em>Blocking Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpBlockingTimeTypeImpl extends EObjectImpl implements RtpBlockingTimeType {
	/**
	 * The cached value of the '{@link #getBlockingTime() <em>Blocking Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingTime()
	 * @generated
	 * @ordered
	 */
	protected RtpDurationType blockingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpBlockingTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_BLOCKING_TIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDurationType getBlockingTime() {
		return blockingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockingTime(RtpDurationType newBlockingTime, NotificationChain msgs) {
		RtpDurationType oldBlockingTime = blockingTime;
		blockingTime = newBlockingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME, oldBlockingTime, newBlockingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingTime(RtpDurationType newBlockingTime) {
		if (newBlockingTime != blockingTime) {
			NotificationChain msgs = null;
			if (blockingTime != null)
				msgs = ((InternalEObject)blockingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME, null, msgs);
			if (newBlockingTime != null)
				msgs = ((InternalEObject)newBlockingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME, null, msgs);
			msgs = basicSetBlockingTime(newBlockingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME, newBlockingTime, newBlockingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME:
				return basicSetBlockingTime(null, msgs);
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
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME:
				return getBlockingTime();
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
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME:
				setBlockingTime((RtpDurationType)newValue);
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
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME:
				setBlockingTime((RtpDurationType)null);
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
			case RtpTypesPackage.RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME:
				return blockingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpBlockingTimeTypeImpl
