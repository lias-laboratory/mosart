/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Utilization Factor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType#getU <em>U</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpUtilizationFactorType()
 * @model
 * @generated
 */
public interface RtpUtilizationFactorType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference.
	 * @see #setU(RealVariable)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpUtilizationFactorType_U()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RealVariable getU();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType#getU <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' containment reference.
	 * @see #getU()
	 * @generated
	 */
	void setU(RealVariable value);

} // RtpUtilizationFactorType
