/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Execution Time Value To Be Calculated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getUnknownValueName <em>Unknown Value Name</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getFunctionToBeRequested <em>Function To Be Requested</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeValueToBeCalculated()
 * @model
 * @generated
 */
public interface RtpExecutionTimeValueToBeCalculated extends RtpExecutionTimeValue {
	/**
	 * Returns the value of the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Value Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Value Name</em>' attribute.
	 * @see #setUnknownValueName(String)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeValueToBeCalculated_UnknownValueName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUnknownValueName();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getUnknownValueName <em>Unknown Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Value Name</em>' attribute.
	 * @see #getUnknownValueName()
	 * @generated
	 */
	void setUnknownValueName(String value);

	/**
	 * Returns the value of the '<em><b>Function To Be Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function To Be Requested</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function To Be Requested</em>' containment reference.
	 * @see #setFunctionToBeRequested(RtpComputationFunction)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested()
	 * @model containment="true"
	 * @generated
	 */
	RtpComputationFunction getFunctionToBeRequested();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getFunctionToBeRequested <em>Function To Be Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function To Be Requested</em>' containment reference.
	 * @see #getFunctionToBeRequested()
	 * @generated
	 */
	void setFunctionToBeRequested(RtpComputationFunction value);

} // RtpExecutionTimeValueToBeCalculated
