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
 * A representation of the model object '<em><b>Rtp Blocking Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType#getBlockingTime <em>Blocking Time</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpBlockingTimeType()
 * @model
 * @generated
 */
public interface RtpBlockingTimeType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' containment reference.
	 * @see #setBlockingTime(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpBlockingTimeType_BlockingTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpDurationType getBlockingTime();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType#getBlockingTime <em>Blocking Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' containment reference.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(RtpDurationType value);

} // RtpBlockingTimeType
