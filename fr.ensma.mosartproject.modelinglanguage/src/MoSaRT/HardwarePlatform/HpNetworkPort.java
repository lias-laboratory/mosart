/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Network Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpNetworkPort#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpNetworkPort#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpFlowRate <em>Rtp Flow Rate</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpNetworkPort#getFlowRate <em>Flow Rate</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpNetworkProtocol <em>Rtp Network Protocol</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpTransmissionMode <em>Rtp Transmission Mode</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort()
 * @model
 * @generated
 */
public interface HpNetworkPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Comm Channel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkPort <em>Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Channel</em>' reference.
	 * @see #setCommChannel(HpCommunicationChannel)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort_CommChannel()
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkPort
	 * @model opposite="networkPort" required="true"
	 * @generated
	 */
	HpCommunicationChannel getCommChannel();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getCommChannel <em>Comm Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Channel</em>' reference.
	 * @see #getCommChannel()
	 * @generated
	 */
	void setCommChannel(HpCommunicationChannel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rtp Flow Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Flow Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Flow Rate</em>' containment reference.
	 * @see #setRtpFlowRate(RtpFlowRateType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort_RtpFlowRate()
	 * @model containment="true"
	 * @generated
	 */
	RtpFlowRateType getRtpFlowRate();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpFlowRate <em>Rtp Flow Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Flow Rate</em>' containment reference.
	 * @see #getRtpFlowRate()
	 * @generated
	 */
	void setRtpFlowRate(RtpFlowRateType value);

	/**
	 * Returns the value of the '<em><b>Flow Rate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Rate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Rate</em>' reference.
	 * @see #setFlowRate(RtpFlowRateType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort_FlowRate()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpFlowRate'"
	 * @generated
	 */
	RtpFlowRateType getFlowRate();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getFlowRate <em>Flow Rate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Rate</em>' reference.
	 * @see #getFlowRate()
	 * @generated
	 */
	void setFlowRate(RtpFlowRateType value);

	/**
	 * Returns the value of the '<em><b>Rtp Network Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Network Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Network Protocol</em>' containment reference.
	 * @see #setRtpNetworkProtocol(RtpNetworkProtocolType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort_RtpNetworkProtocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpNetworkProtocolType getRtpNetworkProtocol();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpNetworkProtocol <em>Rtp Network Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Network Protocol</em>' containment reference.
	 * @see #getRtpNetworkProtocol()
	 * @generated
	 */
	void setRtpNetworkProtocol(RtpNetworkProtocolType value);

	/**
	 * Returns the value of the '<em><b>Rtp Transmission Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Transmission Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Transmission Mode</em>' containment reference.
	 * @see #setRtpTransmissionMode(RtpTransmissionModeType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpNetworkPort_RtpTransmissionMode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpTransmissionModeType getRtpTransmissionMode();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpTransmissionMode <em>Rtp Transmission Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Transmission Mode</em>' containment reference.
	 * @see #getRtpTransmissionMode()
	 * @generated
	 */
	void setRtpTransmissionMode(RtpTransmissionModeType value);

} // HpNetworkPort
