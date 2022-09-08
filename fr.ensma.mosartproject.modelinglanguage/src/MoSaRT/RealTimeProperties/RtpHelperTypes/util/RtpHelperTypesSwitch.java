/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.util;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.*;

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
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage
 * @generated
 */
public class RtpHelperTypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RtpHelperTypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpHelperTypesSwitch() {
		if (modelPackage == null) {
			modelPackage = RtpHelperTypesPackage.eINSTANCE;
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE: {
				RtpDurationType rtpDurationType = (RtpDurationType)theEObject;
				T result = caseRtpDurationType(rtpDurationType);
				if (result == null) result = caseRealTimeCommonType(rtpDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_INTER_ARRIVAL_TYPE: {
				RtpInterArrivalType rtpInterArrivalType = (RtpInterArrivalType)theEObject;
				T result = caseRtpInterArrivalType(rtpInterArrivalType);
				if (result == null) result = caseRealTimeCommonType(rtpInterArrivalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE: {
				RtpDataRateType rtpDataRateType = (RtpDataRateType)theEObject;
				T result = caseRtpDataRateType(rtpDataRateType);
				if (result == null) result = caseRealTimeCommonType(rtpDataRateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_POWER_TYPE: {
				RtpPowerType rtpPowerType = (RtpPowerType)theEObject;
				T result = caseRtpPowerType(rtpPowerType);
				if (result == null) result = caseRealTimeCommonType(rtpPowerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE: {
				RtpDataSizeType rtpDataSizeType = (RtpDataSizeType)theEObject;
				T result = caseRtpDataSizeType(rtpDataSizeType);
				if (result == null) result = caseRealTimeCommonType(rtpDataSizeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_FREQUENCY_TYPE: {
				RtpFrequencyType rtpFrequencyType = (RtpFrequencyType)theEObject;
				T result = caseRtpFrequencyType(rtpFrequencyType);
				if (result == null) result = caseRealTimeCommonType(rtpFrequencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE: {
				RtpExecutionTimeValue rtpExecutionTimeValue = (RtpExecutionTimeValue)theEObject;
				T result = caseRtpExecutionTimeValue(rtpExecutionTimeValue);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_LIST: {
				RtpExecutionTimeList rtpExecutionTimeList = (RtpExecutionTimeList)theEObject;
				T result = caseRtpExecutionTimeList(rtpExecutionTimeList);
				if (result == null) result = caseRtpExecutionTimeConcreteValue(rtpExecutionTimeList);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeList);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_SIMPLE: {
				RtpExecutionTimeSimple rtpExecutionTimeSimple = (RtpExecutionTimeSimple)theEObject;
				T result = caseRtpExecutionTimeSimple(rtpExecutionTimeSimple);
				if (result == null) result = caseRtpExecutionTimeConcreteValue(rtpExecutionTimeSimple);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeSimple);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA: {
				RtpExecutionTimeMma rtpExecutionTimeMma = (RtpExecutionTimeMma)theEObject;
				T result = caseRtpExecutionTimeMma(rtpExecutionTimeMma);
				if (result == null) result = caseRtpExecutionTimeConcreteValue(rtpExecutionTimeMma);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeMma);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeMma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_INTERVAL: {
				RtpExecutionTimeInterval rtpExecutionTimeInterval = (RtpExecutionTimeInterval)theEObject;
				T result = caseRtpExecutionTimeInterval(rtpExecutionTimeInterval);
				if (result == null) result = caseRtpExecutionTimeConcreteValue(rtpExecutionTimeInterval);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeInterval);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE: {
				RtpTimeLinkType rtpTimeLinkType = (RtpTimeLinkType)theEObject;
				T result = caseRtpTimeLinkType(rtpTimeLinkType);
				if (result == null) result = caseRealTimeCommonType(rtpTimeLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_REFERENCE_TYPE: {
				RtpReferenceType rtpReferenceType = (RtpReferenceType)theEObject;
				T result = caseRtpReferenceType(rtpReferenceType);
				if (result == null) result = caseRealTimeCommonType(rtpReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE: {
				RtpTimeReferenceType rtpTimeReferenceType = (RtpTimeReferenceType)theEObject;
				T result = caseRtpTimeReferenceType(rtpTimeReferenceType);
				if (result == null) result = caseRtpReferenceType(rtpTimeReferenceType);
				if (result == null) result = caseRealTimeCommonType(rtpTimeReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_CLOCK_REFRENCE_TYPE: {
				RtpClockRefrenceType rtpClockRefrenceType = (RtpClockRefrenceType)theEObject;
				T result = caseRtpClockRefrenceType(rtpClockRefrenceType);
				if (result == null) result = caseRtpReferenceType(rtpClockRefrenceType);
				if (result == null) result = caseRealTimeCommonType(rtpClockRefrenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED: {
				RtpExecutionTimeValueToBeCalculated rtpExecutionTimeValueToBeCalculated = (RtpExecutionTimeValueToBeCalculated)theEObject;
				T result = caseRtpExecutionTimeValueToBeCalculated(rtpExecutionTimeValueToBeCalculated);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeValueToBeCalculated);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeValueToBeCalculated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE: {
				RtpExecutionTimeCalculatedValue rtpExecutionTimeCalculatedValue = (RtpExecutionTimeCalculatedValue)theEObject;
				T result = caseRtpExecutionTimeCalculatedValue(rtpExecutionTimeCalculatedValue);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeCalculatedValue);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeCalculatedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CONCRETE_VALUE: {
				RtpExecutionTimeConcreteValue rtpExecutionTimeConcreteValue = (RtpExecutionTimeConcreteValue)theEObject;
				T result = caseRtpExecutionTimeConcreteValue(rtpExecutionTimeConcreteValue);
				if (result == null) result = caseRtpExecutionTimeValue(rtpExecutionTimeConcreteValue);
				if (result == null) result = caseRealTimeCommonType(rtpExecutionTimeConcreteValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpDurationType(RtpDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Inter Arrival Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Inter Arrival Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpInterArrivalType(RtpInterArrivalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Data Rate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Data Rate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpDataRateType(RtpDataRateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Power Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Power Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpPowerType(RtpPowerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Data Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Data Size Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpDataSizeType(RtpDataSizeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Frequency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Frequency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpFrequencyType(RtpFrequencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeValue(RtpExecutionTimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeList(RtpExecutionTimeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeSimple(RtpExecutionTimeSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Mma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Mma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeMma(RtpExecutionTimeMma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeInterval(RtpExecutionTimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Time Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Time Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpTimeLinkType(RtpTimeLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpReferenceType(RtpReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Time Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Time Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpTimeReferenceType(RtpTimeReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Clock Refrence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Clock Refrence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpClockRefrenceType(RtpClockRefrenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Value To Be Calculated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Value To Be Calculated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeValueToBeCalculated(RtpExecutionTimeValueToBeCalculated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Calculated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Calculated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeCalculatedValue(RtpExecutionTimeCalculatedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtp Execution Time Concrete Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtp Execution Time Concrete Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtpExecutionTimeConcreteValue(RtpExecutionTimeConcreteValue object) {
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

} //RtpHelperTypesSwitch
