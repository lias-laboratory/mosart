/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Response Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpResponseTimeTypeImpl#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpResponseTimeTypeImpl extends EObjectImpl implements RtpResponseTimeType {
	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected RtpDurationType responseTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpResponseTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_RESPONSE_TIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDurationType getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseTime(RtpDurationType newResponseTime, NotificationChain msgs) {
		RtpDurationType oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME, oldResponseTime, newResponseTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(RtpDurationType newResponseTime) {
		if (newResponseTime != responseTime) {
			NotificationChain msgs = null;
			if (responseTime != null)
				msgs = ((InternalEObject)responseTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME, null, msgs);
			if (newResponseTime != null)
				msgs = ((InternalEObject)newResponseTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME, null, msgs);
			msgs = basicSetResponseTime(newResponseTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME, newResponseTime, newResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME:
				return basicSetResponseTime(null, msgs);
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
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME:
				return getResponseTime();
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
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME:
				setResponseTime((RtpDurationType)newValue);
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
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME:
				setResponseTime((RtpDurationType)null);
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
			case RtpTypesPackage.RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME:
				return responseTime != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpResponseTimeTypeImpl
