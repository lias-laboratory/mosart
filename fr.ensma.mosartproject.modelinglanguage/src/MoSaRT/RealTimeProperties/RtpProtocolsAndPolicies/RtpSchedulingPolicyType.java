/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Scheduling Policy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType#getPolicyType <em>Policy Type</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpSchedulingPolicyType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RtpSchedulingPolicyType extends RealTimeCommonType {

	/**
	 * Returns the value of the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Type</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpSchedulingPolicyType_PolicyType()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getPolicyType();
} // RtpSchedulingPolicyType
