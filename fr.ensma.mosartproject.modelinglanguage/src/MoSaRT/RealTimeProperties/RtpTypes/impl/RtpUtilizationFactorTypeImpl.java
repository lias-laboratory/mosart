/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;
import MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Utilization Factor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpUtilizationFactorTypeImpl#getU <em>U</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpUtilizationFactorTypeImpl extends EObjectImpl implements RtpUtilizationFactorType {
	/**
	 * The cached value of the '{@link #getU() <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected RealVariable u;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpUtilizationFactorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_UTILIZATION_FACTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealVariable getU() {
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetU(RealVariable newU, NotificationChain msgs) {
		RealVariable oldU = u;
		u = newU;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U, oldU, newU);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setU(RealVariable newU) {
		if (newU != u) {
			NotificationChain msgs = null;
			if (u != null)
				msgs = ((InternalEObject)u).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U, null, msgs);
			if (newU != null)
				msgs = ((InternalEObject)newU).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U, null, msgs);
			msgs = basicSetU(newU, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U, newU, newU));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U:
				return basicSetU(null, msgs);
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
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U:
				return getU();
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
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U:
				setU((RealVariable)newValue);
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
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U:
				setU((RealVariable)null);
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
			case RtpTypesPackage.RTP_UTILIZATION_FACTOR_TYPE__U:
				return u != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpUtilizationFactorTypeImpl
