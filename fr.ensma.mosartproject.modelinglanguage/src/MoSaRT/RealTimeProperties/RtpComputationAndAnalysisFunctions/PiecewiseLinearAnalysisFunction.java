/**
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piecewise Linear Analysis Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getIntervals <em>Intervals</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getMultiplicationCoefficient <em>Multiplication Coefficient</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getYUnit <em>YUnit</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getPiecewiseLinearAnalysisFunction()
 * @model
 * @generated
 */
public interface PiecewiseLinearAnalysisFunction extends RtpAnalysisFunction {
	/**
	 * Returns the value of the '<em><b>Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervals</em>' containment reference list.
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getPiecewiseLinearAnalysisFunction_Intervals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RealInterval> getIntervals();

	/**
	 * Returns the value of the '<em><b>Multiplication Coefficient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplication Coefficient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplication Coefficient</em>' reference.
	 * @see #setMultiplicationCoefficient(RealList)
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getPiecewiseLinearAnalysisFunction_MultiplicationCoefficient()
	 * @model required="true"
	 * @generated
	 */
	RealList getMultiplicationCoefficient();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getMultiplicationCoefficient <em>Multiplication Coefficient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplication Coefficient</em>' reference.
	 * @see #getMultiplicationCoefficient()
	 * @generated
	 */
	void setMultiplicationCoefficient(RealList value);

	/**
	 * Returns the value of the '<em><b>XUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XUnit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XUnit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
	 * @see #setXUnit(TimeUnits)
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getPiecewiseLinearAnalysisFunction_XUnit()
	 * @model
	 * @generated
	 */
	TimeUnits getXUnit();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getXUnit <em>XUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUnit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
	 * @see #getXUnit()
	 * @generated
	 */
	void setXUnit(TimeUnits value);

	/**
	 * Returns the value of the '<em><b>YUnit</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YUnit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YUnit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
	 * @see #setYUnit(DataSizeUnits)
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage#getPiecewiseLinearAnalysisFunction_YUnit()
	 * @model
	 * @generated
	 */
	DataSizeUnits getYUnit();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction#getYUnit <em>YUnit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YUnit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
	 * @see #getYUnit()
	 * @generated
	 */
	void setYUnit(DataSizeUnits value);

} // PiecewiseLinearAnalysisFunction
