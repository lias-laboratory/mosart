/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Flow Rate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpFlowRateTypeImpl#getFlowRate <em>Flow Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpFlowRateTypeImpl extends EObjectImpl implements RtpFlowRateType {
	/**
	 * The cached value of the '{@link #getFlowRate() <em>Flow Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowRate()
	 * @generated
	 * @ordered
	 */
	protected RtpDataRateType flowRate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpFlowRateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_FLOW_RATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataRateType getFlowRate() {
		return flowRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowRate(RtpDataRateType newFlowRate, NotificationChain msgs) {
		RtpDataRateType oldFlowRate = flowRate;
		flowRate = newFlowRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE, oldFlowRate, newFlowRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowRate(RtpDataRateType newFlowRate) {
		if (newFlowRate != flowRate) {
			NotificationChain msgs = null;
			if (flowRate != null)
				msgs = ((InternalEObject)flowRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE, null, msgs);
			if (newFlowRate != null)
				msgs = ((InternalEObject)newFlowRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE, null, msgs);
			msgs = basicSetFlowRate(newFlowRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE, newFlowRate, newFlowRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE:
				return basicSetFlowRate(null, msgs);
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
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE:
				return getFlowRate();
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
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE:
				setFlowRate((RtpDataRateType)newValue);
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
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE:
				setFlowRate((RtpDataRateType)null);
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
			case RtpTypesPackage.RTP_FLOW_RATE_TYPE__FLOW_RATE:
				return flowRate != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpFlowRateTypeImpl
