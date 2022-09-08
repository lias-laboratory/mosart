/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage
 * @generated
 */
public class RtpComputationAndAnalysisFunctionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpComputationAndAnalysisFunctionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputationAndAnalysisFunctionsSwitch() {
		if (modelPackage == null) {
			modelPackage = RtpComputationAndAnalysisFunctionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RtpComputationAndAnalysisFunctionsPackage.RTP_COMPUTATION_FUNCTION: {
				RtpComputationFunction rtpComputationFunction = (RtpComputationFunction)theEObject;
				T result = caseRtpComputationFunction(rtpComputationFunction);
				if (result == null) result = caseRealTimeCommonType(rtpComputationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION: {
				WeibullComputationFunction weibullComputationFunction = (WeibullComputationFunction)theEObject;
				T result = caseWeibullComputationFunction(weibullComputationFunction);
				if (result == null) result = caseRtpComputationFunction(weibullComputationFunction);
				if (result == null) result = caseRealTimeCommonType(weibullComputationFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpComputationAndAnalysisFunctionsPackage.RTP_ANALYSIS_FUNCTION: {
				RtpAnalysisFunction rtpAnalysisFunction = (RtpAnalysisFunction)theEObject;
				T result = caseRtpAnalysisFunction(rtpAnalysisFunction);
				if (result == null) result = caseRealTimeCommonType(rtpAnalysisFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_ANALYSIS_FUNCTION: {
				PiecewiseLinearAnalysisFunction piecewiseLinearAnalysisFunction = (PiecewiseLinearAnalysisFunction)theEObject;
				T result = casePiecewiseLinearAnalysisFunction(piecewiseLinearAnalysisFunction);
				if (result == null) result = caseRtpAnalysisFunction(piecewiseLinearAnalysisFunction);
				if (result == null) result = caseRealTimeCommonType(piecewiseLinearAnalysisFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Computation Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Computation Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpComputationFunction(RtpComputationFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weibull Computation Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weibull Computation Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeibullComputationFunction(WeibullComputationFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Analysis Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpAnalysisFunction(RtpAnalysisFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Piecewise Linear Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Piecewise Linear Analysis Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiecewiseLinearAnalysisFunction(PiecewiseLinearAnalysisFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time Common Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time Common Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTimeCommonType(RealTimeCommonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RtpComputationAndAnalysisFunctionsSwitch
