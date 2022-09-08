/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Execution Time Mma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma#getMinMaxAvg <em>Min Max Avg</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeMma()
 * @model
 * @generated
 */
public interface RtpExecutionTimeMma extends RtpExecutionTimeConcreteValue {
	/**
	 * Returns the value of the '<em><b>Min Max Avg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Max Avg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Max Avg</em>' containment reference.
	 * @see #setMinMaxAvg(MaxMinAvgReal)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeMma_MinMaxAvg()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MaxMinAvgReal getMinMaxAvg();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma#getMinMaxAvg <em>Min Max Avg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Max Avg</em>' containment reference.
	 * @see #getMinMaxAvg()
	 * @generated
	 */
	void setMinMaxAvg(MaxMinAvgReal value);

} // RtpExecutionTimeMma
