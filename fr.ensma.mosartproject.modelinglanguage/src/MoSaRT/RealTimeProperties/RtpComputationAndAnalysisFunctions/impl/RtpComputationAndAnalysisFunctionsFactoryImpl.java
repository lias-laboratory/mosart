/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpComputationAndAnalysisFunctionsFactoryImpl extends EFactoryImpl implements RtpComputationAndAnalysisFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtpComputationAndAnalysisFunctionsFactory init() {
		try {
			RtpComputationAndAnalysisFunctionsFactory theRtpComputationAndAnalysisFunctionsFactory = (RtpComputationAndAnalysisFunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(RtpComputationAndAnalysisFunctionsPackage.eNS_URI);
			if (theRtpComputationAndAnalysisFunctionsFactory != null) {
				return theRtpComputationAndAnalysisFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtpComputationAndAnalysisFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputationAndAnalysisFunctionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION: return createWeibullComputationFunction();
			case RtpComputationAndAnalysisFunctionsPackage.RTP_ANALYSIS_FUNCTION: return createRtpAnalysisFunction();
			case RtpComputationAndAnalysisFunctionsPackage.PIECEWISE_LINEAR_ANALYSIS_FUNCTION: return createPiecewiseLinearAnalysisFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeibullComputationFunction createWeibullComputationFunction() {
		WeibullComputationFunctionImpl weibullComputationFunction = new WeibullComputationFunctionImpl();
		return weibullComputationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpAnalysisFunction createRtpAnalysisFunction() {
		RtpAnalysisFunctionImpl rtpAnalysisFunction = new RtpAnalysisFunctionImpl();
		return rtpAnalysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecewiseLinearAnalysisFunction createPiecewiseLinearAnalysisFunction() {
		PiecewiseLinearAnalysisFunctionImpl piecewiseLinearAnalysisFunction = new PiecewiseLinearAnalysisFunctionImpl();
		return piecewiseLinearAnalysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputationAndAnalysisFunctionsPackage getRtpComputationAndAnalysisFunctionsPackage() {
		return (RtpComputationAndAnalysisFunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtpComputationAndAnalysisFunctionsPackage getPackage() {
		return RtpComputationAndAnalysisFunctionsPackage.eINSTANCE;
	}

} //RtpComputationAndAnalysisFunctionsFactoryImpl
