/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.util;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage
 * @generated
 */
public class RtpUtilityTypesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RtpUtilityTypesValidator INSTANCE = new RtpUtilityTypesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MoSaRT.RealTimeProperties.RtpUtilityTypes";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilityTypesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RtpUtilityTypesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RtpUtilityTypesPackage.INTEGER_MATRIX:
				return validateIntegerMatrix((IntegerMatrix)value, diagnostics, context);
			case RtpUtilityTypesPackage.INTEGER_VECTOR:
				return validateIntegerVector((IntegerVector)value, diagnostics, context);
			case RtpUtilityTypesPackage.REAL_VECTOR:
				return validateRealVector((RealVector)value, diagnostics, context);
			case RtpUtilityTypesPackage.REAL_MATRIX:
				return validateRealMatrix((RealMatrix)value, diagnostics, context);
			case RtpUtilityTypesPackage.INTEGER_SET:
				return validateIntegerSet((IntegerSet)value, diagnostics, context);
			case RtpUtilityTypesPackage.INTEGER_LIST:
				return validateIntegerList((IntegerList)value, diagnostics, context);
			case RtpUtilityTypesPackage.REAL_SET:
				return validateRealSet((RealSet)value, diagnostics, context);
			case RtpUtilityTypesPackage.REAL_LIST:
				return validateRealList((RealList)value, diagnostics, context);
			case RtpUtilityTypesPackage.INTEGER_INTERVAL:
				return validateIntegerInterval((IntegerInterval)value, diagnostics, context);
			case RtpUtilityTypesPackage.REAL_INTERVAL:
				return validateRealInterval((RealInterval)value, diagnostics, context);
			case RtpUtilityTypesPackage.REAL_VARIABLE:
				return validateRealVariable((RealVariable)value, diagnostics, context);
			case RtpUtilityTypesPackage.MEASURED_REAL:
				return validateMeasuredReal((MeasuredReal)value, diagnostics, context);
			case RtpUtilityTypesPackage.UNKNOWN_REAL:
				return validateUnknownReal((UnknownReal)value, diagnostics, context);
			case RtpUtilityTypesPackage.SIMPLE_REAL:
				return validateSimpleReal((SimpleReal)value, diagnostics, context);
			case RtpUtilityTypesPackage.MAX_MIN_AVG_REAL:
				return validateMaxMinAvgReal((MaxMinAvgReal)value, diagnostics, context);
			case RtpUtilityTypesPackage.INTEGER_VARIABLE:
				return validateIntegerVariable((IntegerVariable)value, diagnostics, context);
			case RtpUtilityTypesPackage.MEASURED_INTEGER:
				return validateMeasuredInteger((MeasuredInteger)value, diagnostics, context);
			case RtpUtilityTypesPackage.UNKNOWN_INTEGER:
				return validateUnknownInteger((UnknownInteger)value, diagnostics, context);
			case RtpUtilityTypesPackage.SIMPLE_INTEGER:
				return validateSimpleInteger((SimpleInteger)value, diagnostics, context);
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER:
				return validateMaxMinAvgInteger((MaxMinAvgInteger)value, diagnostics, context);
			case RtpUtilityTypesPackage.DELIMITER_TYPE:
				return validateDelimiterType((DelimiterType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerMatrix(IntegerMatrix integerMatrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerMatrix, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerMatrix_IntegerMatrixRule1(integerMatrix, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IntegerMatrixRule1 constraint of '<em>Integer Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTEGER_MATRIX__INTEGER_MATRIX_RULE1__EEXPRESSION = "self.matrixElements->forAll(el1 : IntegerVector, el2 : IntegerVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())";

	/**
	 * Validates the IntegerMatrixRule1 constraint of '<em>Integer Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerMatrix_IntegerMatrixRule1(IntegerMatrix integerMatrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RtpUtilityTypesPackage.Literals.INTEGER_MATRIX,
				 integerMatrix,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IntegerMatrixRule1",
				 INTEGER_MATRIX__INTEGER_MATRIX_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerVector(IntegerVector integerVector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerVector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealVector(RealVector realVector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realVector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealMatrix(RealMatrix realMatrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realMatrix, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realMatrix, diagnostics, context);
		if (result || diagnostics != null) result &= validateRealMatrix_RealMatrixRule1(realMatrix, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RealMatrixRule1 constraint of '<em>Real Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REAL_MATRIX__REAL_MATRIX_RULE1__EEXPRESSION = "self.matrixElements->forAll(el1 : RealVector, el2 : RealVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())";

	/**
	 * Validates the RealMatrixRule1 constraint of '<em>Real Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealMatrix_RealMatrixRule1(RealMatrix realMatrix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RtpUtilityTypesPackage.Literals.REAL_MATRIX,
				 realMatrix,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RealMatrixRule1",
				 REAL_MATRIX__REAL_MATRIX_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerSet(IntegerSet integerSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerList(IntegerList integerList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealSet(RealSet realSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealList(RealList realList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerInterval(IntegerInterval integerInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerInterval_IntegerIntervalRule1(integerInterval, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IntegerIntervalRule1 constraint of '<em>Integer Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTEGER_INTERVAL__INTEGER_INTERVAL_RULE1__EEXPRESSION = "self.boundMin < self.boundMax";

	/**
	 * Validates the IntegerIntervalRule1 constraint of '<em>Integer Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerInterval_IntegerIntervalRule1(IntegerInterval integerInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RtpUtilityTypesPackage.Literals.INTEGER_INTERVAL,
				 integerInterval,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IntegerIntervalRule1",
				 INTEGER_INTERVAL__INTEGER_INTERVAL_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealInterval(RealInterval realInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(realInterval, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(realInterval, diagnostics, context);
		if (result || diagnostics != null) result &= validateRealInterval_RealIntervalRule1(realInterval, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RealIntervalRule1 constraint of '<em>Real Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REAL_INTERVAL__REAL_INTERVAL_RULE1__EEXPRESSION = "self.boundMin < self.boundMax";

	/**
	 * Validates the RealIntervalRule1 constraint of '<em>Real Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealInterval_RealIntervalRule1(RealInterval realInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RtpUtilityTypesPackage.Literals.REAL_INTERVAL,
				 realInterval,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RealIntervalRule1",
				 REAL_INTERVAL__REAL_INTERVAL_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealVariable(RealVariable realVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredReal(MeasuredReal measuredReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuredReal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownReal(UnknownReal unknownReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknownReal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleReal(SimpleReal simpleReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleReal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxMinAvgReal(MaxMinAvgReal maxMinAvgReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maxMinAvgReal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maxMinAvgReal, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaxMinAvgReal_MaxMinAvgRealRule1(maxMinAvgReal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MaxMinAvgRealRule1 constraint of '<em>Max Min Avg Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAX_MIN_AVG_REAL__MAX_MIN_AVG_REAL_RULE1__EEXPRESSION = "self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()";

	/**
	 * Validates the MaxMinAvgRealRule1 constraint of '<em>Max Min Avg Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxMinAvgReal_MaxMinAvgRealRule1(MaxMinAvgReal maxMinAvgReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RtpUtilityTypesPackage.Literals.MAX_MIN_AVG_REAL,
				 maxMinAvgReal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MaxMinAvgRealRule1",
				 MAX_MIN_AVG_REAL__MAX_MIN_AVG_REAL_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerVariable(IntegerVariable integerVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasuredInteger(MeasuredInteger measuredInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measuredInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnknownInteger(UnknownInteger unknownInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unknownInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleInteger(SimpleInteger simpleInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleInteger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxMinAvgInteger(MaxMinAvgInteger maxMinAvgInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maxMinAvgInteger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maxMinAvgInteger, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaxMinAvgInteger_MaxMinAvgIntegerRule1(maxMinAvgInteger, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the MaxMinAvgIntegerRule1 constraint of '<em>Max Min Avg Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAX_MIN_AVG_INTEGER__MAX_MIN_AVG_INTEGER_RULE1__EEXPRESSION = "self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()";

	/**
	 * Validates the MaxMinAvgIntegerRule1 constraint of '<em>Max Min Avg Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxMinAvgInteger_MaxMinAvgIntegerRule1(MaxMinAvgInteger maxMinAvgInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RtpUtilityTypesPackage.Literals.MAX_MIN_AVG_INTEGER,
				 maxMinAvgInteger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MaxMinAvgIntegerRule1",
				 MAX_MIN_AVG_INTEGER__MAX_MIN_AVG_INTEGER_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelimiterType(DelimiterType delimiterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RtpUtilityTypesValidator
