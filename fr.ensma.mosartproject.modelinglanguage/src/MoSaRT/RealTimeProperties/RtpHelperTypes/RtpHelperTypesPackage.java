/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RealTimePropertiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RtpHelperTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RtpHelperTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties/RtpHelperTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RtpHT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpHelperTypesPackage eINSTANCE = MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDurationTypeImpl <em>Rtp Duration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDurationTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpDurationType()
	 * @generated
	 */
	int RTP_DURATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Duration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE___GREATER__RTPDURATIONTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE___LOWER__RTPDURATIONTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE___EQUALS__RTPDURATIONTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE___CONVERTS_TO__TIMEUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Duration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DURATION_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpInterArrivalTypeImpl <em>Rtp Inter Arrival Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpInterArrivalTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpInterArrivalType()
	 * @generated
	 */
	int RTP_INTER_ARRIVAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Inter Arrival Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE___GREATER__RTPINTERARRIVALTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE___LOWER__RTPINTERARRIVALTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE___EQUALS__RTPINTERARRIVALTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE___CONVERTS_TO__TIMEUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Inter Arrival Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_INTER_ARRIVAL_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataRateTypeImpl <em>Rtp Data Rate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataRateTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpDataRateType()
	 * @generated
	 */
	int RTP_DATA_RATE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Data Rate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE___GREATER__RTPDATARATETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE___LOWER__RTPDATARATETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE___EQUALS__RTPDATARATETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE___CONVERTS_TO__DATATXRATEUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Data Rate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_RATE_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpPowerTypeImpl <em>Rtp Power Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpPowerTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpPowerType()
	 * @generated
	 */
	int RTP_POWER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE___GREATER__RTPPOWERTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE___LOWER__RTPPOWERTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE___EQUALS__RTPPOWERTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE___CONVERTS_TO__POWERUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_POWER_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataSizeTypeImpl <em>Rtp Data Size Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataSizeTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpDataSizeType()
	 * @generated
	 */
	int RTP_DATA_SIZE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Data Size Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE___GREATER__RTPDATASIZETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE___LOWER__RTPDATASIZETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE___EQUALS__RTPDATASIZETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE___CONVERTS_TO__DATASIZEUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Data Size Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DATA_SIZE_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpFrequencyTypeImpl <em>Rtp Frequency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpFrequencyTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpFrequencyType()
	 * @generated
	 */
	int RTP_FREQUENCY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE___GREATER__RTPFREQUENCYTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE___LOWER__RTPFREQUENCYTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE___EQUALS__RTPFREQUENCYTYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE___CONVERTS_TO__FREQUENCYUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Frequency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FREQUENCY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue <em>Rtp Execution Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeValue()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_VALUE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue <em>Rtp Execution Time Concrete Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeConcreteValue()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_CONCRETE_VALUE = 17;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Concrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Concrete Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CONCRETE_VALUE_OPERATION_COUNT = RTP_EXECUTION_TIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeListImpl <em>Rtp Execution Time List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeListImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeList()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_LIST = 7;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_LIST__VECTOR = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_LIST_FEATURE_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Execution Time List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_LIST_OPERATION_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeSimpleImpl <em>Rtp Execution Time Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeSimpleImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeSimple()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_SIMPLE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_SIMPLE__VALUE = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_SIMPLE_FEATURE_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_SIMPLE_OPERATION_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeMmaImpl <em>Rtp Execution Time Mma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeMmaImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeMma()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_MMA = 9;

	/**
	 * The feature id for the '<em><b>Min Max Avg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Mma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_MMA_FEATURE_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Mma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_MMA_OPERATION_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeIntervalImpl <em>Rtp Execution Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeIntervalImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeInterval()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_INTERVAL = 10;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_INTERVAL__INTERVAL = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_INTERVAL_FEATURE_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_INTERVAL_OPERATION_COUNT = RTP_EXECUTION_TIME_CONCRETE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl <em>Rtp Time Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpTimeLinkType()
	 * @generated
	 */
	int RTP_TIME_LINK_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Schedule Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_LINK_TYPE__SCHEDULE_LINK = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_LINK_TYPE__JOB_NUMBER = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rtp Time Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_LINK_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Time Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_LINK_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType <em>Rtp Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpReferenceType()
	 * @generated
	 */
	int RTP_REFERENCE_TYPE = 12;

	/**
	 * The number of structural features of the '<em>Rtp Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_REFERENCE_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_REFERENCE_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeReferenceTypeImpl <em>Rtp Time Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeReferenceTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpTimeReferenceType()
	 * @generated
	 */
	int RTP_TIME_REFERENCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Time Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_REFERENCE_TYPE__TIME_LINK = RTP_REFERENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Time Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_REFERENCE_TYPE_FEATURE_COUNT = RTP_REFERENCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Time Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TIME_REFERENCE_TYPE_OPERATION_COUNT = RTP_REFERENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpClockRefrenceTypeImpl <em>Rtp Clock Refrence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpClockRefrenceTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpClockRefrenceType()
	 * @generated
	 */
	int RTP_CLOCK_REFRENCE_TYPE = 14;

	/**
	 * The number of structural features of the '<em>Rtp Clock Refrence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_CLOCK_REFRENCE_TYPE_FEATURE_COUNT = RTP_REFERENCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Clock Refrence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_CLOCK_REFRENCE_TYPE_OPERATION_COUNT = RTP_REFERENCE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeValueToBeCalculatedImpl <em>Rtp Execution Time Value To Be Calculated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeValueToBeCalculatedImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeValueToBeCalculated()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED = 15;

	/**
	 * The feature id for the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function To Be Requested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Value To Be Calculated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED_FEATURE_COUNT = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Value To Be Calculated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED_OPERATION_COUNT = RTP_EXECUTION_TIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl <em>Rtp Execution Time Calculated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeCalculatedValue()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool Used Descriptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Old Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Calculated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE_FEATURE_COUNT = RTP_EXECUTION_TIME_VALUE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Calculated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_CALCULATED_VALUE_OPERATION_COUNT = RTP_EXECUTION_TIME_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType <em>Rtp Schedule Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpScheduleLinkType()
	 * @generated
	 */
	int RTP_SCHEDULE_LINK_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType <em>Rtp Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Duration Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType
	 * @generated
	 */
	EClass getRtpDurationType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#getUnit()
	 * @see #getRtpDurationType()
	 * @generated
	 */
	EAttribute getRtpDurationType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#getValue()
	 * @see #getRtpDurationType()
	 * @generated
	 */
	EReference getRtpDurationType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType)
	 * @generated
	 */
	EOperation getRtpDurationType__Greater__RtpDurationType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType)
	 * @generated
	 */
	EOperation getRtpDurationType__Lower__RtpDurationType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType)
	 * @generated
	 */
	EOperation getRtpDurationType__Equals__RtpDurationType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits)
	 * @generated
	 */
	EOperation getRtpDurationType__ConvertsTo__TimeUnits();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType <em>Rtp Inter Arrival Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Inter Arrival Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType
	 * @generated
	 */
	EClass getRtpInterArrivalType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getUnit()
	 * @see #getRtpInterArrivalType()
	 * @generated
	 */
	EAttribute getRtpInterArrivalType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getValue()
	 * @see #getRtpInterArrivalType()
	 * @generated
	 */
	EReference getRtpInterArrivalType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType)
	 * @generated
	 */
	EOperation getRtpInterArrivalType__Greater__RtpInterArrivalType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType)
	 * @generated
	 */
	EOperation getRtpInterArrivalType__Lower__RtpInterArrivalType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType)
	 * @generated
	 */
	EOperation getRtpInterArrivalType__Equals__RtpInterArrivalType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits)
	 * @generated
	 */
	EOperation getRtpInterArrivalType__ConvertsTo__TimeUnits();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType <em>Rtp Data Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Data Rate Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType
	 * @generated
	 */
	EClass getRtpDataRateType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getUnit()
	 * @see #getRtpDataRateType()
	 * @generated
	 */
	EAttribute getRtpDataRateType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getValue()
	 * @see #getRtpDataRateType()
	 * @generated
	 */
	EReference getRtpDataRateType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType)
	 * @generated
	 */
	EOperation getRtpDataRateType__Greater__RtpDataRateType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType)
	 * @generated
	 */
	EOperation getRtpDataRateType__Lower__RtpDataRateType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType)
	 * @generated
	 */
	EOperation getRtpDataRateType__Equals__RtpDataRateType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits)
	 * @generated
	 */
	EOperation getRtpDataRateType__ConvertsTo__DataTxRateUnits();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType <em>Rtp Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Power Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType
	 * @generated
	 */
	EClass getRtpPowerType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#getUnit()
	 * @see #getRtpPowerType()
	 * @generated
	 */
	EAttribute getRtpPowerType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#getValue()
	 * @see #getRtpPowerType()
	 * @generated
	 */
	EReference getRtpPowerType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType)
	 * @generated
	 */
	EOperation getRtpPowerType__Greater__RtpPowerType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType)
	 * @generated
	 */
	EOperation getRtpPowerType__Lower__RtpPowerType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType)
	 * @generated
	 */
	EOperation getRtpPowerType__Equals__RtpPowerType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits)
	 * @generated
	 */
	EOperation getRtpPowerType__ConvertsTo__PowerUnits();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType <em>Rtp Data Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Data Size Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType
	 * @generated
	 */
	EClass getRtpDataSizeType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getUnit()
	 * @see #getRtpDataSizeType()
	 * @generated
	 */
	EAttribute getRtpDataSizeType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getValue()
	 * @see #getRtpDataSizeType()
	 * @generated
	 */
	EReference getRtpDataSizeType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType)
	 * @generated
	 */
	EOperation getRtpDataSizeType__Greater__RtpDataSizeType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType)
	 * @generated
	 */
	EOperation getRtpDataSizeType__Lower__RtpDataSizeType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType)
	 * @generated
	 */
	EOperation getRtpDataSizeType__Equals__RtpDataSizeType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits)
	 * @generated
	 */
	EOperation getRtpDataSizeType__ConvertsTo__DataSizeUnits();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType <em>Rtp Frequency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Frequency Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType
	 * @generated
	 */
	EClass getRtpFrequencyType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#getUnit()
	 * @see #getRtpFrequencyType()
	 * @generated
	 */
	EAttribute getRtpFrequencyType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#getValue()
	 * @see #getRtpFrequencyType()
	 * @generated
	 */
	EReference getRtpFrequencyType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#greater(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType)
	 * @generated
	 */
	EOperation getRtpFrequencyType__Greater__RtpFrequencyType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#lower(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType)
	 * @generated
	 */
	EOperation getRtpFrequencyType__Lower__RtpFrequencyType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#equals(MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType)
	 * @generated
	 */
	EOperation getRtpFrequencyType__Equals__RtpFrequencyType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits)
	 * @generated
	 */
	EOperation getRtpFrequencyType__ConvertsTo__FrequencyUnits();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue <em>Rtp Execution Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue
	 * @generated
	 */
	EClass getRtpExecutionTimeValue();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList <em>Rtp Execution Time List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time List</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList
	 * @generated
	 */
	EClass getRtpExecutionTimeList();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList#getVector()
	 * @see #getRtpExecutionTimeList()
	 * @generated
	 */
	EReference getRtpExecutionTimeList_Vector();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple <em>Rtp Execution Time Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Simple</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple
	 * @generated
	 */
	EClass getRtpExecutionTimeSimple();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple#getValue()
	 * @see #getRtpExecutionTimeSimple()
	 * @generated
	 */
	EAttribute getRtpExecutionTimeSimple_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma <em>Rtp Execution Time Mma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Mma</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma
	 * @generated
	 */
	EClass getRtpExecutionTimeMma();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma#getMinMaxAvg <em>Min Max Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Max Avg</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma#getMinMaxAvg()
	 * @see #getRtpExecutionTimeMma()
	 * @generated
	 */
	EReference getRtpExecutionTimeMma_MinMaxAvg();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval <em>Rtp Execution Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Interval</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval
	 * @generated
	 */
	EClass getRtpExecutionTimeInterval();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval#getInterval()
	 * @see #getRtpExecutionTimeInterval()
	 * @generated
	 */
	EReference getRtpExecutionTimeInterval_Interval();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType <em>Rtp Time Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Time Link Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType
	 * @generated
	 */
	EClass getRtpTimeLinkType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getScheduleLink <em>Schedule Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Link</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getScheduleLink()
	 * @see #getRtpTimeLinkType()
	 * @generated
	 */
	EAttribute getRtpTimeLinkType_ScheduleLink();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getJobNumber <em>Job Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Number</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getJobNumber()
	 * @see #getRtpTimeLinkType()
	 * @generated
	 */
	EAttribute getRtpTimeLinkType_JobNumber();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getReferenceActivity <em>Reference Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Activity</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getReferenceActivity()
	 * @see #getRtpTimeLinkType()
	 * @generated
	 */
	EReference getRtpTimeLinkType_ReferenceActivity();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType <em>Rtp Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Reference Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType
	 * @generated
	 */
	EClass getRtpReferenceType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType <em>Rtp Time Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Time Reference Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType
	 * @generated
	 */
	EClass getRtpTimeReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType#getTimeLink <em>Time Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Link</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType#getTimeLink()
	 * @see #getRtpTimeReferenceType()
	 * @generated
	 */
	EReference getRtpTimeReferenceType_TimeLink();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpClockRefrenceType <em>Rtp Clock Refrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Clock Refrence Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpClockRefrenceType
	 * @generated
	 */
	EClass getRtpClockRefrenceType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated <em>Rtp Execution Time Value To Be Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Value To Be Calculated</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated
	 * @generated
	 */
	EClass getRtpExecutionTimeValueToBeCalculated();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getUnknownValueName <em>Unknown Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Value Name</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getUnknownValueName()
	 * @see #getRtpExecutionTimeValueToBeCalculated()
	 * @generated
	 */
	EAttribute getRtpExecutionTimeValueToBeCalculated_UnknownValueName();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getFunctionToBeRequested <em>Function To Be Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function To Be Requested</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated#getFunctionToBeRequested()
	 * @see #getRtpExecutionTimeValueToBeCalculated()
	 * @generated
	 */
	EReference getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue <em>Rtp Execution Time Calculated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Calculated Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue
	 * @generated
	 */
	EClass getRtpExecutionTimeCalculatedValue();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getUnknownValueName <em>Unknown Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Value Name</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getUnknownValueName()
	 * @see #getRtpExecutionTimeCalculatedValue()
	 * @generated
	 */
	EAttribute getRtpExecutionTimeCalculatedValue_UnknownValueName();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getToolUsedDescriptions <em>Tool Used Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tool Used Descriptions</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getToolUsedDescriptions()
	 * @see #getRtpExecutionTimeCalculatedValue()
	 * @generated
	 */
	EAttribute getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getValue()
	 * @see #getRtpExecutionTimeCalculatedValue()
	 * @generated
	 */
	EReference getRtpExecutionTimeCalculatedValue_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getAllOldValues <em>All Old Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Old Values</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getAllOldValues()
	 * @see #getRtpExecutionTimeCalculatedValue()
	 * @generated
	 */
	EReference getRtpExecutionTimeCalculatedValue_AllOldValues();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue <em>Rtp Execution Time Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Concrete Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue
	 * @generated
	 */
	EClass getRtpExecutionTimeConcreteValue();

	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType <em>Rtp Schedule Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rtp Schedule Link Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType
	 * @generated
	 */
	EEnum getRtpScheduleLinkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtpHelperTypesFactory getRtpHelperTypesFactory();

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
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDurationTypeImpl <em>Rtp Duration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDurationTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpDurationType()
		 * @generated
		 */
		EClass RTP_DURATION_TYPE = eINSTANCE.getRtpDurationType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_DURATION_TYPE__UNIT = eINSTANCE.getRtpDurationType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_DURATION_TYPE__VALUE = eINSTANCE.getRtpDurationType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DURATION_TYPE___GREATER__RTPDURATIONTYPE = eINSTANCE.getRtpDurationType__Greater__RtpDurationType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DURATION_TYPE___LOWER__RTPDURATIONTYPE = eINSTANCE.getRtpDurationType__Lower__RtpDurationType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DURATION_TYPE___EQUALS__RTPDURATIONTYPE = eINSTANCE.getRtpDurationType__Equals__RtpDurationType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DURATION_TYPE___CONVERTS_TO__TIMEUNITS = eINSTANCE.getRtpDurationType__ConvertsTo__TimeUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpInterArrivalTypeImpl <em>Rtp Inter Arrival Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpInterArrivalTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpInterArrivalType()
		 * @generated
		 */
		EClass RTP_INTER_ARRIVAL_TYPE = eINSTANCE.getRtpInterArrivalType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_INTER_ARRIVAL_TYPE__UNIT = eINSTANCE.getRtpInterArrivalType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_INTER_ARRIVAL_TYPE__VALUE = eINSTANCE.getRtpInterArrivalType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_INTER_ARRIVAL_TYPE___GREATER__RTPINTERARRIVALTYPE = eINSTANCE.getRtpInterArrivalType__Greater__RtpInterArrivalType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_INTER_ARRIVAL_TYPE___LOWER__RTPINTERARRIVALTYPE = eINSTANCE.getRtpInterArrivalType__Lower__RtpInterArrivalType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_INTER_ARRIVAL_TYPE___EQUALS__RTPINTERARRIVALTYPE = eINSTANCE.getRtpInterArrivalType__Equals__RtpInterArrivalType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_INTER_ARRIVAL_TYPE___CONVERTS_TO__TIMEUNITS = eINSTANCE.getRtpInterArrivalType__ConvertsTo__TimeUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataRateTypeImpl <em>Rtp Data Rate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataRateTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpDataRateType()
		 * @generated
		 */
		EClass RTP_DATA_RATE_TYPE = eINSTANCE.getRtpDataRateType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_DATA_RATE_TYPE__UNIT = eINSTANCE.getRtpDataRateType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_DATA_RATE_TYPE__VALUE = eINSTANCE.getRtpDataRateType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_RATE_TYPE___GREATER__RTPDATARATETYPE = eINSTANCE.getRtpDataRateType__Greater__RtpDataRateType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_RATE_TYPE___LOWER__RTPDATARATETYPE = eINSTANCE.getRtpDataRateType__Lower__RtpDataRateType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_RATE_TYPE___EQUALS__RTPDATARATETYPE = eINSTANCE.getRtpDataRateType__Equals__RtpDataRateType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_RATE_TYPE___CONVERTS_TO__DATATXRATEUNITS = eINSTANCE.getRtpDataRateType__ConvertsTo__DataTxRateUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpPowerTypeImpl <em>Rtp Power Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpPowerTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpPowerType()
		 * @generated
		 */
		EClass RTP_POWER_TYPE = eINSTANCE.getRtpPowerType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_POWER_TYPE__UNIT = eINSTANCE.getRtpPowerType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_POWER_TYPE__VALUE = eINSTANCE.getRtpPowerType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_POWER_TYPE___GREATER__RTPPOWERTYPE = eINSTANCE.getRtpPowerType__Greater__RtpPowerType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_POWER_TYPE___LOWER__RTPPOWERTYPE = eINSTANCE.getRtpPowerType__Lower__RtpPowerType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_POWER_TYPE___EQUALS__RTPPOWERTYPE = eINSTANCE.getRtpPowerType__Equals__RtpPowerType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_POWER_TYPE___CONVERTS_TO__POWERUNITS = eINSTANCE.getRtpPowerType__ConvertsTo__PowerUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataSizeTypeImpl <em>Rtp Data Size Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataSizeTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpDataSizeType()
		 * @generated
		 */
		EClass RTP_DATA_SIZE_TYPE = eINSTANCE.getRtpDataSizeType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_DATA_SIZE_TYPE__UNIT = eINSTANCE.getRtpDataSizeType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_DATA_SIZE_TYPE__VALUE = eINSTANCE.getRtpDataSizeType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_SIZE_TYPE___GREATER__RTPDATASIZETYPE = eINSTANCE.getRtpDataSizeType__Greater__RtpDataSizeType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_SIZE_TYPE___LOWER__RTPDATASIZETYPE = eINSTANCE.getRtpDataSizeType__Lower__RtpDataSizeType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_SIZE_TYPE___EQUALS__RTPDATASIZETYPE = eINSTANCE.getRtpDataSizeType__Equals__RtpDataSizeType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_DATA_SIZE_TYPE___CONVERTS_TO__DATASIZEUNITS = eINSTANCE.getRtpDataSizeType__ConvertsTo__DataSizeUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpFrequencyTypeImpl <em>Rtp Frequency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpFrequencyTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpFrequencyType()
		 * @generated
		 */
		EClass RTP_FREQUENCY_TYPE = eINSTANCE.getRtpFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_FREQUENCY_TYPE__UNIT = eINSTANCE.getRtpFrequencyType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_FREQUENCY_TYPE__VALUE = eINSTANCE.getRtpFrequencyType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_FREQUENCY_TYPE___GREATER__RTPFREQUENCYTYPE = eINSTANCE.getRtpFrequencyType__Greater__RtpFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_FREQUENCY_TYPE___LOWER__RTPFREQUENCYTYPE = eINSTANCE.getRtpFrequencyType__Lower__RtpFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_FREQUENCY_TYPE___EQUALS__RTPFREQUENCYTYPE = eINSTANCE.getRtpFrequencyType__Equals__RtpFrequencyType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_FREQUENCY_TYPE___CONVERTS_TO__FREQUENCYUNITS = eINSTANCE.getRtpFrequencyType__ConvertsTo__FrequencyUnits();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue <em>Rtp Execution Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeValue()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_VALUE = eINSTANCE.getRtpExecutionTimeValue();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeListImpl <em>Rtp Execution Time List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeListImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeList()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_LIST = eINSTANCE.getRtpExecutionTimeList();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_LIST__VECTOR = eINSTANCE.getRtpExecutionTimeList_Vector();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeSimpleImpl <em>Rtp Execution Time Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeSimpleImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeSimple()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_SIMPLE = eINSTANCE.getRtpExecutionTimeSimple();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_EXECUTION_TIME_SIMPLE__VALUE = eINSTANCE.getRtpExecutionTimeSimple_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeMmaImpl <em>Rtp Execution Time Mma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeMmaImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeMma()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_MMA = eINSTANCE.getRtpExecutionTimeMma();

		/**
		 * The meta object literal for the '<em><b>Min Max Avg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG = eINSTANCE.getRtpExecutionTimeMma_MinMaxAvg();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeIntervalImpl <em>Rtp Execution Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeIntervalImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeInterval()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_INTERVAL = eINSTANCE.getRtpExecutionTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_INTERVAL__INTERVAL = eINSTANCE.getRtpExecutionTimeInterval_Interval();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl <em>Rtp Time Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeLinkTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpTimeLinkType()
		 * @generated
		 */
		EClass RTP_TIME_LINK_TYPE = eINSTANCE.getRtpTimeLinkType();

		/**
		 * The meta object literal for the '<em><b>Schedule Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_TIME_LINK_TYPE__SCHEDULE_LINK = eINSTANCE.getRtpTimeLinkType_ScheduleLink();

		/**
		 * The meta object literal for the '<em><b>Job Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_TIME_LINK_TYPE__JOB_NUMBER = eINSTANCE.getRtpTimeLinkType_JobNumber();

		/**
		 * The meta object literal for the '<em><b>Reference Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY = eINSTANCE.getRtpTimeLinkType_ReferenceActivity();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType <em>Rtp Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpReferenceType()
		 * @generated
		 */
		EClass RTP_REFERENCE_TYPE = eINSTANCE.getRtpReferenceType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeReferenceTypeImpl <em>Rtp Time Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeReferenceTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpTimeReferenceType()
		 * @generated
		 */
		EClass RTP_TIME_REFERENCE_TYPE = eINSTANCE.getRtpTimeReferenceType();

		/**
		 * The meta object literal for the '<em><b>Time Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_TIME_REFERENCE_TYPE__TIME_LINK = eINSTANCE.getRtpTimeReferenceType_TimeLink();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpClockRefrenceTypeImpl <em>Rtp Clock Refrence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpClockRefrenceTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpClockRefrenceType()
		 * @generated
		 */
		EClass RTP_CLOCK_REFRENCE_TYPE = eINSTANCE.getRtpClockRefrenceType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeValueToBeCalculatedImpl <em>Rtp Execution Time Value To Be Calculated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeValueToBeCalculatedImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeValueToBeCalculated()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED = eINSTANCE.getRtpExecutionTimeValueToBeCalculated();

		/**
		 * The meta object literal for the '<em><b>Unknown Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME = eINSTANCE.getRtpExecutionTimeValueToBeCalculated_UnknownValueName();

		/**
		 * The meta object literal for the '<em><b>Function To Be Requested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED = eINSTANCE.getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl <em>Rtp Execution Time Calculated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeCalculatedValue()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_CALCULATED_VALUE = eINSTANCE.getRtpExecutionTimeCalculatedValue();

		/**
		 * The meta object literal for the '<em><b>Unknown Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME = eINSTANCE.getRtpExecutionTimeCalculatedValue_UnknownValueName();

		/**
		 * The meta object literal for the '<em><b>Tool Used Descriptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS = eINSTANCE.getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE = eINSTANCE.getRtpExecutionTimeCalculatedValue_Value();

		/**
		 * The meta object literal for the '<em><b>All Old Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES = eINSTANCE.getRtpExecutionTimeCalculatedValue_AllOldValues();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue <em>Rtp Execution Time Concrete Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpExecutionTimeConcreteValue()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_CONCRETE_VALUE = eINSTANCE.getRtpExecutionTimeConcreteValue();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType <em>Rtp Schedule Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType
		 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl#getRtpScheduleLinkType()
		 * @generated
		 */
		EEnum RTP_SCHEDULE_LINK_TYPE = eINSTANCE.getRtpScheduleLinkType();

	}

} //RtpHelperTypesPackage
