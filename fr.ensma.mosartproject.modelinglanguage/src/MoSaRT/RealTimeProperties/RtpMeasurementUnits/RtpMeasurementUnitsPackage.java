/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpMeasurementUnits;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.RtpMeasurementUnitsFactory
 * @model kind="package"
 * @generated
 */
public interface RtpMeasurementUnitsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RtpMeasurementUnits";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties/RtpMeasurementUnits";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RtpMU";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpMeasurementUnitsPackage eINSTANCE = MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits <em>Time Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getTimeUnits()
	 * @generated
	 */
	int TIME_UNITS = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits <em>Data Size Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getDataSizeUnits()
	 * @generated
	 */
	int DATA_SIZE_UNITS = 1;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits <em>Power Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getPowerUnits()
	 * @generated
	 */
	int POWER_UNITS = 2;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits <em>Data Tx Rate Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getDataTxRateUnits()
	 * @generated
	 */
	int DATA_TX_RATE_UNITS = 3;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits <em>Frequency Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getFrequencyUnits()
	 * @generated
	 */
	int FREQUENCY_UNITS = 4;


	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits <em>Time Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Units</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
	 * @generated
	 */
	EEnum getTimeUnits();

	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits <em>Data Size Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Size Units</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
	 * @generated
	 */
	EEnum getDataSizeUnits();

	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits <em>Power Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Units</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits
	 * @generated
	 */
	EEnum getPowerUnits();

	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits <em>Data Tx Rate Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Tx Rate Units</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits
	 * @generated
	 */
	EEnum getDataTxRateUnits();

	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits <em>Frequency Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Units</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits
	 * @generated
	 */
	EEnum getFrequencyUnits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtpMeasurementUnitsFactory getRtpMeasurementUnitsFactory();

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
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits <em>Time Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getTimeUnits()
		 * @generated
		 */
		EEnum TIME_UNITS = eINSTANCE.getTimeUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits <em>Data Size Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getDataSizeUnits()
		 * @generated
		 */
		EEnum DATA_SIZE_UNITS = eINSTANCE.getDataSizeUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits <em>Power Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getPowerUnits()
		 * @generated
		 */
		EEnum POWER_UNITS = eINSTANCE.getPowerUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits <em>Data Tx Rate Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getDataTxRateUnits()
		 * @generated
		 */
		EEnum DATA_TX_RATE_UNITS = eINSTANCE.getDataTxRateUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits <em>Frequency Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits
		 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl#getFrequencyUnits()
		 * @generated
		 */
		EEnum FREQUENCY_UNITS = eINSTANCE.getFrequencyUnits();

	}

} //RtpMeasurementUnitsPackage
