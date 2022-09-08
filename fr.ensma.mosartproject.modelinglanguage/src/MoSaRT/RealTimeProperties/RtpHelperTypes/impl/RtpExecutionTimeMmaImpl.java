/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Execution Time Mma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeMmaImpl#getMinMaxAvg <em>Min Max Avg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpExecutionTimeMmaImpl extends EObjectImpl implements RtpExecutionTimeMma {
	/**
	 * The cached value of the '{@link #getMinMaxAvg() <em>Min Max Avg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMaxAvg()
	 * @generated
	 * @ordered
	 */
	protected MaxMinAvgReal minMaxAvg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RtpExecutionTimeMmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_MMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxMinAvgReal getMinMaxAvg() {
		return minMaxAvg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinMaxAvg(MaxMinAvgReal newMinMaxAvg, NotificationChain msgs) {
		MaxMinAvgReal oldMinMaxAvg = minMaxAvg;
		minMaxAvg = newMinMaxAvg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG, oldMinMaxAvg, newMinMaxAvg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinMaxAvg(MaxMinAvgReal newMinMaxAvg) {
		if (newMinMaxAvg != minMaxAvg) {
			NotificationChain msgs = null;
			if (minMaxAvg != null)
				msgs = ((InternalEObject)minMaxAvg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG, null, msgs);
			if (newMinMaxAvg != null)
				msgs = ((InternalEObject)newMinMaxAvg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG, null, msgs);
			msgs = basicSetMinMaxAvg(newMinMaxAvg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG, newMinMaxAvg, newMinMaxAvg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG:
				return basicSetMinMaxAvg(null, msgs);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG:
				return getMinMaxAvg();
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG:
				setMinMaxAvg((MaxMinAvgReal)newValue);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG:
				setMinMaxAvg((MaxMinAvgReal)null);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG:
				return minMaxAvg != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpExecutionTimeMmaImpl
