/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage
 * @generated
 */
public interface RtpComputationAndAnalysisFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpComputationAndAnalysisFunctionsFactory eINSTANCE = MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Weibull Computation Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weibull Computation Function</em>'.
	 * @generated
	 */
	WeibullComputationFunction createWeibullComputationFunction();

	/**
	 * Returns a new object of class '<em>Rtp Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtp Analysis Function</em>'.
	 * @generated
	 */
	RtpAnalysisFunction createRtpAnalysisFunction();

	/**
	 * Returns a new object of class '<em>Piecewise Linear Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Piecewise Linear Analysis Function</em>'.
	 * @generated
	 */
	PiecewiseLinearAnalysisFunction createPiecewiseLinearAnalysisFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RtpComputationAndAnalysisFunctionsPackage getRtpComputationAndAnalysisFunctionsPackage();

} //RtpComputationAndAnalysisFunctionsFactory
