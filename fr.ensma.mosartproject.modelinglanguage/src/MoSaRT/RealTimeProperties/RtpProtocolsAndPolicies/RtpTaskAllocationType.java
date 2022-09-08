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
 * A representation of the model object '<em><b>Rtp Task Allocation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType#getAllocationType <em>Allocation Type</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpTaskAllocationType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RtpTaskAllocationType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Allocation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Type</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getRtpTaskAllocationType_AllocationType()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getAllocationType();

} // RtpTaskAllocationType
