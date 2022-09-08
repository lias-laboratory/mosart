/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Computation Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction#getFunctionType <em>Function Type</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getRtpComputationFunction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RtpComputationFunction extends RealTimeCommonType {

	/**
	 * Returns the value of the '<em><b>Function Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Type</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getRtpComputationFunction_FunctionType()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	String getFunctionType();
} // RtpComputationFunction
