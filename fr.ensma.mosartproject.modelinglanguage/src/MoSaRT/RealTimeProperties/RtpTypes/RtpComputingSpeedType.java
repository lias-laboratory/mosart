/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Computing Speed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType#getComputingSpeed <em>Computing Speed</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpComputingSpeedType()
 * @model
 * @generated
 */
public interface RtpComputingSpeedType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Computing Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computing Speed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Speed</em>' containment reference.
	 * @see #setComputingSpeed(RtpFrequencyType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpComputingSpeedType_ComputingSpeed()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpFrequencyType getComputingSpeed();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType#getComputingSpeed <em>Computing Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Speed</em>' containment reference.
	 * @see #getComputingSpeed()
	 * @generated
	 */
	void setComputingSpeed(RtpFrequencyType value);

} // RtpComputingSpeedType
