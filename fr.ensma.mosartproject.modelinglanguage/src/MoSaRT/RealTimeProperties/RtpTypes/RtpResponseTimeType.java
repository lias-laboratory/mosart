/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Response Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType#getResponseTime <em>Response Time</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpResponseTimeType()
 * @model
 * @generated
 */
public interface RtpResponseTimeType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' containment reference.
	 * @see #setResponseTime(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpResponseTimeType_ResponseTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpDurationType getResponseTime();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType#getResponseTime <em>Response Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' containment reference.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(RtpDurationType value);

} // RtpResponseTimeType
