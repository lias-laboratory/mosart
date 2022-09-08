/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Flow Rate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType#getFlowRate <em>Flow Rate</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpFlowRateType()
 * @model
 * @generated
 */
public interface RtpFlowRateType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Flow Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Rate</em>' containment reference.
	 * @see #setFlowRate(RtpDataRateType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpFlowRateType_FlowRate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpDataRateType getFlowRate();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType#getFlowRate <em>Flow Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Rate</em>' containment reference.
	 * @see #getFlowRate()
	 * @generated
	 */
	void setFlowRate(RtpDataRateType value);

} // RtpFlowRateType
