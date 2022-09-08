/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RtpHelperTypesFactoryImpl extends EFactoryImpl implements RtpHelperTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtpHelperTypesFactory init() {
		try {
			RtpHelperTypesFactory theRtpHelperTypesFactory = (RtpHelperTypesFactory)EPackage.Registry.INSTANCE.getEFactory(RtpHelperTypesPackage.eNS_URI);
			if (theRtpHelperTypesFactory != null) {
				return theRtpHelperTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtpHelperTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpHelperTypesFactoryImpl() {
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE: return createRtpDurationType();
			case RtpHelperTypesPackage.RTP_INTER_ARRIVAL_TYPE: return createRtpInterArrivalType();
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE: return createRtpDataRateType();
			case RtpHelperTypesPackage.RTP_POWER_TYPE: return createRtpPowerType();
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE: return createRtpDataSizeType();
			case RtpHelperTypesPackage.RTP_FREQUENCY_TYPE: return createRtpFrequencyType();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_LIST: return createRtpExecutionTimeList();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_SIMPLE: return createRtpExecutionTimeSimple();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_MMA: return createRtpExecutionTimeMma();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_INTERVAL: return createRtpExecutionTimeInterval();
			case RtpHelperTypesPackage.RTP_TIME_LINK_TYPE: return createRtpTimeLinkType();
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE: return createRtpTimeReferenceType();
			case RtpHelperTypesPackage.RTP_CLOCK_REFRENCE_TYPE: return createRtpClockRefrenceType();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED: return createRtpExecutionTimeValueToBeCalculated();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE: return createRtpExecutionTimeCalculatedValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RtpHelperTypesPackage.RTP_SCHEDULE_LINK_TYPE:
				return createRtpScheduleLinkTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RtpHelperTypesPackage.RTP_SCHEDULE_LINK_TYPE:
				return convertRtpScheduleLinkTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDurationType createRtpDurationType() {
		RtpDurationTypeImpl rtpDurationType = new RtpDurationTypeImpl();
		return rtpDurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpInterArrivalType createRtpInterArrivalType() {
		RtpInterArrivalTypeImpl rtpInterArrivalType = new RtpInterArrivalTypeImpl();
		return rtpInterArrivalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataRateType createRtpDataRateType() {
		RtpDataRateTypeImpl rtpDataRateType = new RtpDataRateTypeImpl();
		return rtpDataRateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPowerType createRtpPowerType() {
		RtpPowerTypeImpl rtpPowerType = new RtpPowerTypeImpl();
		return rtpPowerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDataSizeType createRtpDataSizeType() {
		RtpDataSizeTypeImpl rtpDataSizeType = new RtpDataSizeTypeImpl();
		return rtpDataSizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpFrequencyType createRtpFrequencyType() {
		RtpFrequencyTypeImpl rtpFrequencyType = new RtpFrequencyTypeImpl();
		return rtpFrequencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeList createRtpExecutionTimeList() {
		RtpExecutionTimeListImpl rtpExecutionTimeList = new RtpExecutionTimeListImpl();
		return rtpExecutionTimeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeSimple createRtpExecutionTimeSimple() {
		RtpExecutionTimeSimpleImpl rtpExecutionTimeSimple = new RtpExecutionTimeSimpleImpl();
		return rtpExecutionTimeSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeMma createRtpExecutionTimeMma() {
		RtpExecutionTimeMmaImpl rtpExecutionTimeMma = new RtpExecutionTimeMmaImpl();
		return rtpExecutionTimeMma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeInterval createRtpExecutionTimeInterval() {
		RtpExecutionTimeIntervalImpl rtpExecutionTimeInterval = new RtpExecutionTimeIntervalImpl();
		return rtpExecutionTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTimeLinkType createRtpTimeLinkType() {
		RtpTimeLinkTypeImpl rtpTimeLinkType = new RtpTimeLinkTypeImpl();
		return rtpTimeLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTimeReferenceType createRtpTimeReferenceType() {
		RtpTimeReferenceTypeImpl rtpTimeReferenceType = new RtpTimeReferenceTypeImpl();
		return rtpTimeReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpClockRefrenceType createRtpClockRefrenceType() {
		RtpClockRefrenceTypeImpl rtpClockRefrenceType = new RtpClockRefrenceTypeImpl();
		return rtpClockRefrenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeValueToBeCalculated createRtpExecutionTimeValueToBeCalculated() {
		RtpExecutionTimeValueToBeCalculatedImpl rtpExecutionTimeValueToBeCalculated = new RtpExecutionTimeValueToBeCalculatedImpl();
		return rtpExecutionTimeValueToBeCalculated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeCalculatedValue createRtpExecutionTimeCalculatedValue() {
		RtpExecutionTimeCalculatedValueImpl rtpExecutionTimeCalculatedValue = new RtpExecutionTimeCalculatedValueImpl();
		return rtpExecutionTimeCalculatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpScheduleLinkType createRtpScheduleLinkTypeFromString(EDataType eDataType, String initialValue) {
		RtpScheduleLinkType result = RtpScheduleLinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRtpScheduleLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpHelperTypesPackage getRtpHelperTypesPackage() {
		return (RtpHelperTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtpHelperTypesPackage getPackage() {
		return RtpHelperTypesPackage.eINSTANCE;
	}

} //RtpHelperTypesFactoryImpl
