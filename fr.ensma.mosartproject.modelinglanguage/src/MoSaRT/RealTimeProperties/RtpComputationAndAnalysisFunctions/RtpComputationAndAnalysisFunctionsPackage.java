/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions;

import MoSaRT.RealTimeProperties.RealTimePropertiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RtpComputationAndAnalysisFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RtpComputationAndAnalysisFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties/RtpComputationAndAnalysisFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RtpCAF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpComputationAndAnalysisFunctionsPackage eINSTANCE = MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction <em>Rtp Computation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getRtpComputationFunction()
	 * @generated
	 */
	int RTP_COMPUTATION_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMPUTATION_FUNCTION__FUNCTION_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Computation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMPUTATION_FUNCTION_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Computation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMPUTATION_FUNCTION_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.WeibullComputationFunctionImpl <em>Weibull Computation Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.WeibullComputationFunctionImpl
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getWeibullComputationFunction()
	 * @generated
	 */
	int WEIBULL_COMPUTATION_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Function Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_COMPUTATION_FUNCTION__FUNCTION_TYPE = RTP_COMPUTATION_FUNCTION__FUNCTION_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_COMPUTATION_FUNCTION__PARAMETERS = RTP_COMPUTATION_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weibull Computation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_COMPUTATION_FUNCTION_FEATURE_COUNT = RTP_COMPUTATION_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weibull Computation Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_COMPUTATION_FUNCTION_OPERATION_COUNT = RTP_COMPUTATION_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpAnalysisFunctionImpl <em>Rtp Analysis Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpAnalysisFunctionImpl
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getRtpAnalysisFunction()
	 * @generated
	 */
	int RTP_ANALYSIS_FUNCTION = 2;

	/**
	 * The number of structural features of the '<em>Rtp Analysis Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_ANALYSIS_FUNCTION_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Analysis Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_ANALYSIS_FUNCTION_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearAnalysisFunctionImpl <em>Piecewise Linear Analysis Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearAnalysisFunctionImpl
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getPiecewiseLinearAnalysisFunction()
	 * @generated
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION__INTERVALS = RTP_ANALYSIS_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplication Coefficient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION__MULTIPLICATION_COEFFICIENT = RTP_ANALYSIS_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION__XUNIT = RTP_ANALYSIS_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YUnit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION__YUNIT = RTP_ANALYSIS_FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Piecewise Linear Analysis Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION_FEATURE_COUNT = RTP_ANALYSIS_FUNCTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Piecewise Linear Analysis Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECEWISE_LINEAR_ANALYSIS_FUNCTION_OPERATION_COUNT = RTP_ANALYSIS_FUNCTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction <em>Rtp Computation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Computation Function</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction
	 * @generated
	 */
	EClass getRtpComputationFunction();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction#getFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction#getFunctionType()
	 * @see #getRtpComputationFunction()
	 * @generated
	 */
	EAttribute getRtpComputationFunction_FunctionType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction <em>Weibull Computation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull Computation Function</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction
	 * @generated
	 */
	EClass getWeibullComputationFunction();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction#getParameters()
	 * @see #getWeibullComputationFunction()
	 * @generated
	 */
	EAttribute getWeibullComputationFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpAnalysisFunction <em>Rtp Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Analysis Function</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpAnalysisFunction
	 * @generated
	 */
	EClass getRtpAnalysisFunction();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction <em>Piecewise Linear Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piecewise Linear Analysis Function</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction
	 * @generated
	 */
	EClass getPiecewiseLinearAnalysisFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intervals</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getIntervals()
	 * @see #getPiecewiseLinearAnalysisFunction()
	 * @generated
	 */
	EReference getPiecewiseLinearAnalysisFunction_Intervals();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getMultiplicationCoefficient <em>Multiplication Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multiplication Coefficient</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getMultiplicationCoefficient()
	 * @see #getPiecewiseLinearAnalysisFunction()
	 * @generated
	 */
	EReference getPiecewiseLinearAnalysisFunction_MultiplicationCoefficient();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getXUnit <em>XUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XUnit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getXUnit()
	 * @see #getPiecewiseLinearAnalysisFunction()
	 * @generated
	 */
	EAttribute getPiecewiseLinearAnalysisFunction_XUnit();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getYUnit <em>YUnit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YUnit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getYUnit()
	 * @see #getPiecewiseLinearAnalysisFunction()
	 * @generated
	 */
	EAttribute getPiecewiseLinearAnalysisFunction_YUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtpComputationAndAnalysisFunctionsFactory getRtpComputationAndAnalysisFunctionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction <em>Rtp Computation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getRtpComputationFunction()
		 * @generated
		 */
		EClass RTP_COMPUTATION_FUNCTION = eINSTANCE.getRtpComputationFunction();

		/**
		 * The meta object literal for the '<em><b>Function Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_COMPUTATION_FUNCTION__FUNCTION_TYPE = eINSTANCE.getRtpComputationFunction_FunctionType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.WeibullComputationFunctionImpl <em>Weibull Computation Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.WeibullComputationFunctionImpl
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getWeibullComputationFunction()
		 * @generated
		 */
		EClass WEIBULL_COMPUTATION_FUNCTION = eINSTANCE.getWeibullComputationFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIBULL_COMPUTATION_FUNCTION__PARAMETERS = eINSTANCE.getWeibullComputationFunction_Parameters();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpAnalysisFunctionImpl <em>Rtp Analysis Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpAnalysisFunctionImpl
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getRtpAnalysisFunction()
		 * @generated
		 */
		EClass RTP_ANALYSIS_FUNCTION = eINSTANCE.getRtpAnalysisFunction();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearAnalysisFunctionImpl <em>Piecewise Linear Analysis Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.PiecewiseLinearAnalysisFunctionImpl
		 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl#getPiecewiseLinearAnalysisFunction()
		 * @generated
		 */
		EClass PIECEWISE_LINEAR_ANALYSIS_FUNCTION = eINSTANCE.getPiecewiseLinearAnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECEWISE_LINEAR_ANALYSIS_FUNCTION__INTERVALS = eINSTANCE.getPiecewiseLinearAnalysisFunction_Intervals();

		/**
		 * The meta object literal for the '<em><b>Multiplication Coefficient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECEWISE_LINEAR_ANALYSIS_FUNCTION__MULTIPLICATION_COEFFICIENT = eINSTANCE.getPiecewiseLinearAnalysisFunction_MultiplicationCoefficient();

		/**
		 * The meta object literal for the '<em><b>XUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECEWISE_LINEAR_ANALYSIS_FUNCTION__XUNIT = eINSTANCE.getPiecewiseLinearAnalysisFunction_XUnit();

		/**
		 * The meta object literal for the '<em><b>YUnit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECEWISE_LINEAR_ANALYSIS_FUNCTION__YUNIT = eINSTANCE.getPiecewiseLinearAnalysisFunction_YUnit();

	}

} //RtpComputationAndAnalysisFunctionsPackage
