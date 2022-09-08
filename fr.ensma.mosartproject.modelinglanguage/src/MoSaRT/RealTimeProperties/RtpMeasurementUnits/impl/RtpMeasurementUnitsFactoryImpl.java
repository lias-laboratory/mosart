/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.*;

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
public class RtpMeasurementUnitsFactoryImpl extends EFactoryImpl implements RtpMeasurementUnitsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RtpMeasurementUnitsFactory init() {
		try {
			RtpMeasurementUnitsFactory theRtpMeasurementUnitsFactory = (RtpMeasurementUnitsFactory)EPackage.Registry.INSTANCE.getEFactory(RtpMeasurementUnitsPackage.eNS_URI);
			if (theRtpMeasurementUnitsFactory != null) {
				return theRtpMeasurementUnitsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RtpMeasurementUnitsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpMeasurementUnitsFactoryImpl() {
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
			case RtpMeasurementUnitsPackage.TIME_UNITS:
				return createTimeUnitsFromString(eDataType, initialValue);
			case RtpMeasurementUnitsPackage.DATA_SIZE_UNITS:
				return createDataSizeUnitsFromString(eDataType, initialValue);
			case RtpMeasurementUnitsPackage.POWER_UNITS:
				return createPowerUnitsFromString(eDataType, initialValue);
			case RtpMeasurementUnitsPackage.DATA_TX_RATE_UNITS:
				return createDataTxRateUnitsFromString(eDataType, initialValue);
			case RtpMeasurementUnitsPackage.FREQUENCY_UNITS:
				return createFrequencyUnitsFromString(eDataType, initialValue);
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
			case RtpMeasurementUnitsPackage.TIME_UNITS:
				return convertTimeUnitsToString(eDataType, instanceValue);
			case RtpMeasurementUnitsPackage.DATA_SIZE_UNITS:
				return convertDataSizeUnitsToString(eDataType, instanceValue);
			case RtpMeasurementUnitsPackage.POWER_UNITS:
				return convertPowerUnitsToString(eDataType, instanceValue);
			case RtpMeasurementUnitsPackage.DATA_TX_RATE_UNITS:
				return convertDataTxRateUnitsToString(eDataType, instanceValue);
			case RtpMeasurementUnitsPackage.FREQUENCY_UNITS:
				return convertFrequencyUnitsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnits createTimeUnitsFromString(EDataType eDataType, String initialValue) {
		TimeUnits result = TimeUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnits createDataSizeUnitsFromString(EDataType eDataType, String initialValue) {
		DataSizeUnits result = DataSizeUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataSizeUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerUnits createPowerUnitsFromString(EDataType eDataType, String initialValue) {
		PowerUnits result = PowerUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTxRateUnits createDataTxRateUnitsFromString(EDataType eDataType, String initialValue) {
		DataTxRateUnits result = DataTxRateUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTxRateUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnits createFrequencyUnitsFromString(EDataType eDataType, String initialValue) {
		FrequencyUnits result = FrequencyUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpMeasurementUnitsPackage getRtpMeasurementUnitsPackage() {
		return (RtpMeasurementUnitsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RtpMeasurementUnitsPackage getPackage() {
		return RtpMeasurementUnitsPackage.eINSTANCE;
	}

} //RtpMeasurementUnitsFactoryImpl
