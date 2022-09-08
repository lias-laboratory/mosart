/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Communication Mechanism Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getRtpDataSize <em>Rtp Data Size</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getMechanismType <em>Mechanism Type</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpCommunicationMechanismType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RtpCommunicationMechanismType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Rtp Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Data Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Data Size</em>' containment reference.
	 * @see #setRtpDataSize(RtpDataSizeType)
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpCommunicationMechanismType_RtpDataSize()
	 * @model containment="true"
	 * @generated
	 */
	RtpDataSizeType getRtpDataSize();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getRtpDataSize <em>Rtp Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Data Size</em>' containment reference.
	 * @see #getRtpDataSize()
	 * @generated
	 */
	void setRtpDataSize(RtpDataSizeType value);

	/**
	 * Returns the value of the '<em><b>Mechanism Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism Type</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpCommunicationMechanismType_MechanismType()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getMechanismType();

} // RtpCommunicationMechanismType
