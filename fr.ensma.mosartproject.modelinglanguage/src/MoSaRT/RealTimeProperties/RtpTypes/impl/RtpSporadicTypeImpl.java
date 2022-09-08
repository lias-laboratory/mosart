/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Sporadic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSporadicTypeImpl#getInterArrival <em>Inter Arrival</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpSporadicTypeImpl extends EObjectImpl implements RtpSporadicType {
	/**
	 * The cached value of the '{@link #getInterArrival() <em>Inter Arrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterArrival()
	 * @generated
	 * @ordered
	 */
	protected RtpInterArrivalType interArrival;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpSporadicTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_SPORADIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpInterArrivalType getInterArrival() {
		return interArrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterArrival(RtpInterArrivalType newInterArrival, NotificationChain msgs) {
		RtpInterArrivalType oldInterArrival = interArrival;
		interArrival = newInterArrival;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL, oldInterArrival, newInterArrival);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterArrival(RtpInterArrivalType newInterArrival) {
		if (newInterArrival != interArrival) {
			NotificationChain msgs = null;
			if (interArrival != null)
				msgs = ((InternalEObject)interArrival).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL, null, msgs);
			if (newInterArrival != null)
				msgs = ((InternalEObject)newInterArrival).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL, null, msgs);
			msgs = basicSetInterArrival(newInterArrival, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL, newInterArrival, newInterArrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL:
				return basicSetInterArrival(null, msgs);
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
			case RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL:
				return getInterArrival();
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
			case RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL:
				setInterArrival((RtpInterArrivalType)newValue);
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
			case RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL:
				setInterArrival((RtpInterArrivalType)null);
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
			case RtpTypesPackage.RTP_SPORADIC_TYPE__INTER_ARRIVAL:
				return interArrival != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpSporadicTypeImpl
