/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Computing Speed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpComputingSpeedTypeImpl#getComputingSpeed <em>Computing Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpComputingSpeedTypeImpl extends EObjectImpl implements RtpComputingSpeedType {
	/**
	 * The cached value of the '{@link #getComputingSpeed() <em>Computing Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingSpeed()
	 * @generated
	 * @ordered
	 */
	protected RtpFrequencyType computingSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpComputingSpeedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_COMPUTING_SPEED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpFrequencyType getComputingSpeed() {
		return computingSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputingSpeed(RtpFrequencyType newComputingSpeed, NotificationChain msgs) {
		RtpFrequencyType oldComputingSpeed = computingSpeed;
		computingSpeed = newComputingSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED, oldComputingSpeed, newComputingSpeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingSpeed(RtpFrequencyType newComputingSpeed) {
		if (newComputingSpeed != computingSpeed) {
			NotificationChain msgs = null;
			if (computingSpeed != null)
				msgs = ((InternalEObject)computingSpeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED, null, msgs);
			if (newComputingSpeed != null)
				msgs = ((InternalEObject)newComputingSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED, null, msgs);
			msgs = basicSetComputingSpeed(newComputingSpeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED, newComputingSpeed, newComputingSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED:
				return basicSetComputingSpeed(null, msgs);
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
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED:
				return getComputingSpeed();
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
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED:
				setComputingSpeed((RtpFrequencyType)newValue);
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
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED:
				setComputingSpeed((RtpFrequencyType)null);
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
			case RtpTypesPackage.RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED:
				return computingSpeed != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpComputingSpeedTypeImpl
