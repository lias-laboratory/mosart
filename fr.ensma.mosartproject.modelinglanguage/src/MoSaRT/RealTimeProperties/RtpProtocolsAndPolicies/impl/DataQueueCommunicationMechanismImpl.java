/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Queue Communication Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl#getRtpDataSize <em>Rtp Data Size</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl#getMechanismType <em>Mechanism Type</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl#isOverwriting <em>Overwriting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataQueueCommunicationMechanismImpl extends EObjectImpl implements DataQueueCommunicationMechanism {
	/**
	 * The cached value of the '{@link #getRtpDataSize() <em>Rtp Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpDataSize()
	 * @generated
	 * @ordered
	 */
	protected RtpDataSizeType rtpDataSize;

	/**
	 * The default value of the '{@link #getMechanismType() <em>Mechanism Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanismType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String MECHANISM_TYPE_EDEFAULT = "Data Queue Communication";

	/**
	 * The default value of the '{@link #isOverwriting() <em>Overwriting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwriting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERWRITING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverwriting() <em>Overwriting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverwriting()
	 * @generated
	 * @ordered
	 */
	protected boolean overwriting = OVERWRITING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataQueueCommunicationMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.DATA_QUEUE_COMMUNICATION_MECHANISM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataSizeType getRtpDataSize() {
		return rtpDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpDataSize(RtpDataSizeType newRtpDataSize, NotificationChain msgs) {
		RtpDataSizeType oldRtpDataSize = rtpDataSize;
		rtpDataSize = newRtpDataSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE, oldRtpDataSize, newRtpDataSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpDataSize(RtpDataSizeType newRtpDataSize) {
		if (newRtpDataSize != rtpDataSize) {
			NotificationChain msgs = null;
			if (rtpDataSize != null)
				msgs = ((InternalEObject)rtpDataSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE, null, msgs);
			if (newRtpDataSize != null)
				msgs = ((InternalEObject)newRtpDataSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE, null, msgs);
			msgs = basicSetRtpDataSize(newRtpDataSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE, newRtpDataSize, newRtpDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getMechanismType() {
		// TODO: implement this method to return the 'Mechanism Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return MECHANISM_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverwriting() {
		return overwriting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverwriting(boolean newOverwriting) {
		boolean oldOverwriting = overwriting;
		overwriting = newOverwriting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING, oldOverwriting, overwriting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE:
				return basicSetRtpDataSize(null, msgs);
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
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE:
				return getRtpDataSize();
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__MECHANISM_TYPE:
				return getMechanismType();
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING:
				return isOverwriting();
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
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE:
				setRtpDataSize((RtpDataSizeType)newValue);
				return;
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING:
				setOverwriting((Boolean)newValue);
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
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE:
				setRtpDataSize((RtpDataSizeType)null);
				return;
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING:
				setOverwriting(OVERWRITING_EDEFAULT);
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
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE:
				return rtpDataSize != null;
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__MECHANISM_TYPE:
				return MECHANISM_TYPE_EDEFAULT == null ? getMechanismType() != null : !MECHANISM_TYPE_EDEFAULT.equals(getMechanismType());
			case RtpProtocolsAndPoliciesPackage.DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING:
				return overwriting != OVERWRITING_EDEFAULT;
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
		result.append(" (overwriting: ");
		result.append(overwriting);
		result.append(')');
		return result.toString();
	}

} //DataQueueCommunicationMechanismImpl
