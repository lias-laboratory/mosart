/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpNetworkPort;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hp Network Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl#getRtpFlowRate <em>Rtp Flow Rate</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl#getFlowRate <em>Flow Rate</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl#getRtpNetworkProtocol <em>Rtp Network Protocol</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl#getRtpTransmissionMode <em>Rtp Transmission Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpNetworkPortImpl extends EObjectImpl implements HpNetworkPort {
	/**
	 * The cached value of the '{@link #getCommChannel() <em>Comm Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommChannel()
	 * @generated
	 * @ordered
	 */
	protected HpCommunicationChannel commChannel;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRtpFlowRate() <em>Rtp Flow Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpFlowRate()
	 * @generated
	 * @ordered
	 */
	protected RtpFlowRateType rtpFlowRate;

	/**
	 * The cached setting delegate for the '{@link #getFlowRate() <em>Flow Rate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowRate()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FLOW_RATE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HardwarePlatformPackage.Literals.HP_NETWORK_PORT__FLOW_RATE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getRtpNetworkProtocol() <em>Rtp Network Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpNetworkProtocol()
	 * @generated
	 * @ordered
	 */
	protected RtpNetworkProtocolType rtpNetworkProtocol;

	/**
	 * The cached value of the '{@link #getRtpTransmissionMode() <em>Rtp Transmission Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpTransmissionMode()
	 * @generated
	 * @ordered
	 */
	protected RtpTransmissionModeType rtpTransmissionMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpNetworkPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_NETWORK_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel getCommChannel() {
		if (commChannel != null && commChannel.eIsProxy()) {
			InternalEObject oldCommChannel = (InternalEObject)commChannel;
			commChannel = (HpCommunicationChannel)eResolveProxy(oldCommChannel);
			if (commChannel != oldCommChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL, oldCommChannel, commChannel));
			}
		}
		return commChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel basicGetCommChannel() {
		return commChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommChannel(HpCommunicationChannel newCommChannel, NotificationChain msgs) {
		HpCommunicationChannel oldCommChannel = commChannel;
		commChannel = newCommChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL, oldCommChannel, newCommChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommChannel(HpCommunicationChannel newCommChannel) {
		if (newCommChannel != commChannel) {
			NotificationChain msgs = null;
			if (commChannel != null)
				msgs = ((InternalEObject)commChannel).eInverseRemove(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT, HpCommunicationChannel.class, msgs);
			if (newCommChannel != null)
				msgs = ((InternalEObject)newCommChannel).eInverseAdd(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT, HpCommunicationChannel.class, msgs);
			msgs = basicSetCommChannel(newCommChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL, newCommChannel, newCommChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpFlowRateType getRtpFlowRate() {
		return rtpFlowRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpFlowRate(RtpFlowRateType newRtpFlowRate, NotificationChain msgs) {
		RtpFlowRateType oldRtpFlowRate = rtpFlowRate;
		rtpFlowRate = newRtpFlowRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE, oldRtpFlowRate, newRtpFlowRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpFlowRate(RtpFlowRateType newRtpFlowRate) {
		if (newRtpFlowRate != rtpFlowRate) {
			NotificationChain msgs = null;
			if (rtpFlowRate != null)
				msgs = ((InternalEObject)rtpFlowRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE, null, msgs);
			if (newRtpFlowRate != null)
				msgs = ((InternalEObject)newRtpFlowRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE, null, msgs);
			msgs = basicSetRtpFlowRate(newRtpFlowRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE, newRtpFlowRate, newRtpFlowRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpFlowRateType getFlowRate() {
		return (RtpFlowRateType)FLOW_RATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpFlowRateType basicGetFlowRate() {
		return (RtpFlowRateType)FLOW_RATE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowRate(RtpFlowRateType newFlowRate) {
		FLOW_RATE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newFlowRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpNetworkProtocolType getRtpNetworkProtocol() {
		return rtpNetworkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpNetworkProtocol(RtpNetworkProtocolType newRtpNetworkProtocol, NotificationChain msgs) {
		RtpNetworkProtocolType oldRtpNetworkProtocol = rtpNetworkProtocol;
		rtpNetworkProtocol = newRtpNetworkProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL, oldRtpNetworkProtocol, newRtpNetworkProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpNetworkProtocol(RtpNetworkProtocolType newRtpNetworkProtocol) {
		if (newRtpNetworkProtocol != rtpNetworkProtocol) {
			NotificationChain msgs = null;
			if (rtpNetworkProtocol != null)
				msgs = ((InternalEObject)rtpNetworkProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL, null, msgs);
			if (newRtpNetworkProtocol != null)
				msgs = ((InternalEObject)newRtpNetworkProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL, null, msgs);
			msgs = basicSetRtpNetworkProtocol(newRtpNetworkProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL, newRtpNetworkProtocol, newRtpNetworkProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTransmissionModeType getRtpTransmissionMode() {
		return rtpTransmissionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpTransmissionMode(RtpTransmissionModeType newRtpTransmissionMode, NotificationChain msgs) {
		RtpTransmissionModeType oldRtpTransmissionMode = rtpTransmissionMode;
		rtpTransmissionMode = newRtpTransmissionMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE, oldRtpTransmissionMode, newRtpTransmissionMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpTransmissionMode(RtpTransmissionModeType newRtpTransmissionMode) {
		if (newRtpTransmissionMode != rtpTransmissionMode) {
			NotificationChain msgs = null;
			if (rtpTransmissionMode != null)
				msgs = ((InternalEObject)rtpTransmissionMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE, null, msgs);
			if (newRtpTransmissionMode != null)
				msgs = ((InternalEObject)newRtpTransmissionMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE, null, msgs);
			msgs = basicSetRtpTransmissionMode(newRtpTransmissionMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE, newRtpTransmissionMode, newRtpTransmissionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL:
				if (commChannel != null)
					msgs = ((InternalEObject)commChannel).eInverseRemove(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT, HpCommunicationChannel.class, msgs);
				return basicSetCommChannel((HpCommunicationChannel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL:
				return basicSetCommChannel(null, msgs);
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE:
				return basicSetRtpFlowRate(null, msgs);
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL:
				return basicSetRtpNetworkProtocol(null, msgs);
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE:
				return basicSetRtpTransmissionMode(null, msgs);
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
			case HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL:
				if (resolve) return getCommChannel();
				return basicGetCommChannel();
			case HardwarePlatformPackage.HP_NETWORK_PORT__NAME:
				return getName();
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE:
				return getRtpFlowRate();
			case HardwarePlatformPackage.HP_NETWORK_PORT__FLOW_RATE:
				if (resolve) return getFlowRate();
				return basicGetFlowRate();
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL:
				return getRtpNetworkProtocol();
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE:
				return getRtpTransmissionMode();
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
			case HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL:
				setCommChannel((HpCommunicationChannel)newValue);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__NAME:
				setName((String)newValue);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE:
				setRtpFlowRate((RtpFlowRateType)newValue);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__FLOW_RATE:
				setFlowRate((RtpFlowRateType)newValue);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL:
				setRtpNetworkProtocol((RtpNetworkProtocolType)newValue);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE:
				setRtpTransmissionMode((RtpTransmissionModeType)newValue);
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
			case HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL:
				setCommChannel((HpCommunicationChannel)null);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE:
				setRtpFlowRate((RtpFlowRateType)null);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__FLOW_RATE:
				setFlowRate((RtpFlowRateType)null);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL:
				setRtpNetworkProtocol((RtpNetworkProtocolType)null);
				return;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE:
				setRtpTransmissionMode((RtpTransmissionModeType)null);
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
			case HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL:
				return commChannel != null;
			case HardwarePlatformPackage.HP_NETWORK_PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_FLOW_RATE:
				return rtpFlowRate != null;
			case HardwarePlatformPackage.HP_NETWORK_PORT__FLOW_RATE:
				return FLOW_RATE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL:
				return rtpNetworkProtocol != null;
			case HardwarePlatformPackage.HP_NETWORK_PORT__RTP_TRANSMISSION_MODE:
				return rtpTransmissionMode != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HpNetworkPortImpl
