/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.*;

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
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage
 * @generated
 */
public class RtpUtilityTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpUtilityTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilityTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = RtpUtilityTypesPackage.eINSTANCE;
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
			case RtpUtilityTypesPackage.INTEGER_MATRIX: {
				IntegerMatrix integerMatrix = (IntegerMatrix)theEObject;
				T result = caseIntegerMatrix(integerMatrix);
				if (result == null) result = caseRealTimeCommonType(integerMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.INTEGER_VECTOR: {
				IntegerVector integerVector = (IntegerVector)theEObject;
				T result = caseIntegerVector(integerVector);
				if (result == null) result = caseRealTimeCommonType(integerVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.REAL_VECTOR: {
				RealVector realVector = (RealVector)theEObject;
				T result = caseRealVector(realVector);
				if (result == null) result = caseRealTimeCommonType(realVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.REAL_MATRIX: {
				RealMatrix realMatrix = (RealMatrix)theEObject;
				T result = caseRealMatrix(realMatrix);
				if (result == null) result = caseRealTimeCommonType(realMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.INTEGER_SET: {
				IntegerSet integerSet = (IntegerSet)theEObject;
				T result = caseIntegerSet(integerSet);
				if (result == null) result = caseRealTimeCommonType(integerSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.INTEGER_LIST: {
				IntegerList integerList = (IntegerList)theEObject;
				T result = caseIntegerList(integerList);
				if (result == null) result = caseRealTimeCommonType(integerList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.REAL_SET: {
				RealSet realSet = (RealSet)theEObject;
				T result = caseRealSet(realSet);
				if (result == null) result = caseRealTimeCommonType(realSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.REAL_LIST: {
				RealList realList = (RealList)theEObject;
				T result = caseRealList(realList);
				if (result == null) result = caseRealTimeCommonType(realList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.INTEGER_INTERVAL: {
				IntegerInterval integerInterval = (IntegerInterval)theEObject;
				T result = caseIntegerInterval(integerInterval);
				if (result == null) result = caseRealTimeCommonType(integerInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.REAL_INTERVAL: {
				RealInterval realInterval = (RealInterval)theEObject;
				T result = caseRealInterval(realInterval);
				if (result == null) result = caseRealTimeCommonType(realInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.REAL_VARIABLE: {
				RealVariable realVariable = (RealVariable)theEObject;
				T result = caseRealVariable(realVariable);
				if (result == null) result = caseRealTimeCommonType(realVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.MEASURED_REAL: {
				MeasuredReal measuredReal = (MeasuredReal)theEObject;
				T result = caseMeasuredReal(measuredReal);
				if (result == null) result = caseRealVariable(measuredReal);
				if (result == null) result = caseRealTimeCommonType(measuredReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.UNKNOWN_REAL: {
				UnknownReal unknownReal = (UnknownReal)theEObject;
				T result = caseUnknownReal(unknownReal);
				if (result == null) result = caseRealVariable(unknownReal);
				if (result == null) result = caseRealTimeCommonType(unknownReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.SIMPLE_REAL: {
				SimpleReal simpleReal = (SimpleReal)theEObject;
				T result = caseSimpleReal(simpleReal);
				if (result == null) result = caseRealVariable(simpleReal);
				if (result == null) result = caseRealTimeCommonType(simpleReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.MAX_MIN_AVG_REAL: {
				MaxMinAvgReal maxMinAvgReal = (MaxMinAvgReal)theEObject;
				T result = caseMaxMinAvgReal(maxMinAvgReal);
				if (result == null) result = caseRealTimeCommonType(maxMinAvgReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.INTEGER_VARIABLE: {
				IntegerVariable integerVariable = (IntegerVariable)theEObject;
				T result = caseIntegerVariable(integerVariable);
				if (result == null) result = caseRealTimeCommonType(integerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.MEASURED_INTEGER: {
				MeasuredInteger measuredInteger = (MeasuredInteger)theEObject;
				T result = caseMeasuredInteger(measuredInteger);
				if (result == null) result = caseIntegerVariable(measuredInteger);
				if (result == null) result = caseRealTimeCommonType(measuredInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.UNKNOWN_INTEGER: {
				UnknownInteger unknownInteger = (UnknownInteger)theEObject;
				T result = caseUnknownInteger(unknownInteger);
				if (result == null) result = caseIntegerVariable(unknownInteger);
				if (result == null) result = caseRealTimeCommonType(unknownInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.SIMPLE_INTEGER: {
				SimpleInteger simpleInteger = (SimpleInteger)theEObject;
				T result = caseSimpleInteger(simpleInteger);
				if (result == null) result = caseIntegerVariable(simpleInteger);
				if (result == null) result = caseRealTimeCommonType(simpleInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER: {
				MaxMinAvgInteger maxMinAvgInteger = (MaxMinAvgInteger)theEObject;
				T result = caseMaxMinAvgInteger(maxMinAvgInteger);
				if (result == null) result = caseRealTimeCommonType(maxMinAvgInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerMatrix(IntegerMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVector(IntegerVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealVector(RealVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealMatrix(RealMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerSet(IntegerSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerList(IntegerList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealSet(RealSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealList(RealList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerInterval(IntegerInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealInterval(RealInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealVariable(RealVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredReal(MeasuredReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownReal(UnknownReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleReal(SimpleReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Min Avg Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Min Avg Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxMinAvgReal(MaxMinAvgReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerVariable(IntegerVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredInteger(MeasuredInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownInteger(UnknownInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleInteger(SimpleInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Min Avg Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Min Avg Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxMinAvgInteger(MaxMinAvgInteger object) {
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

} //RtpUtilityTypesSwitch
