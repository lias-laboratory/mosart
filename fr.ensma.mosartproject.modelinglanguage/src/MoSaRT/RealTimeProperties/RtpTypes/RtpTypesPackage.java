/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimePropertiesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RtpTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RtpTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties/RtpTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RtpTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpTypesPackage eINSTANCE = MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPriorityTypeImpl <em>Rtp Priority Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPriorityTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPriorityType()
	 * @generated
	 */
	int RTP_PRIORITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PRIORITY_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Priority Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PRIORITY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Priority Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PRIORITY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType <em>Rtp Periodicity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPeriodicityType()
	 * @generated
	 */
	int RTP_PERIODICITY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Rtp Periodicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PERIODICITY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Periodicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PERIODICITY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPeriodicTypeImpl <em>Rtp Periodic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPeriodicTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPeriodicType()
	 * @generated
	 */
	int RTP_PERIODIC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PERIODIC_TYPE__JITTER = RTP_PERIODICITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PERIODIC_TYPE__PERIOD = RTP_PERIODICITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Periodic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PERIODIC_TYPE_FEATURE_COUNT = RTP_PERIODICITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rtp Periodic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PERIODIC_TYPE_OPERATION_COUNT = RTP_PERIODICITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpAperiodicTypeImpl <em>Rtp Aperiodic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpAperiodicTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpAperiodicType()
	 * @generated
	 */
	int RTP_APERIODIC_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Rtp Aperiodic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_APERIODIC_TYPE_FEATURE_COUNT = RTP_PERIODICITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Aperiodic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_APERIODIC_TYPE_OPERATION_COUNT = RTP_PERIODICITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSporadicTypeImpl <em>Rtp Sporadic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSporadicTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpSporadicType()
	 * @generated
	 */
	int RTP_SPORADIC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Inter Arrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SPORADIC_TYPE__INTER_ARRIVAL = RTP_PERIODICITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Sporadic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SPORADIC_TYPE_FEATURE_COUNT = RTP_PERIODICITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Sporadic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SPORADIC_TYPE_OPERATION_COUNT = RTP_PERIODICITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpReleaseTimeTypeImpl <em>Rtp Release Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpReleaseTimeTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpReleaseTimeType()
	 * @generated
	 */
	int RTP_RELEASE_TIME_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Release Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RELEASE_TIME_TYPE__RELEASE_TIME = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RELEASE_TIME_TYPE__REFERRING = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Release Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RELEASE_TIME_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rtp Release Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RELEASE_TIME_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpOffsetTypeImpl <em>Rtp Offset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpOffsetTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpOffsetType()
	 * @generated
	 */
	int RTP_OFFSET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_OFFSET_TYPE__OFFSET = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Offset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_OFFSET_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Offset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_OFFSET_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl <em>Rtp Mutu Exclu Resource Utilization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpMutuExcluResourceUtilizationType()
	 * @generated
	 */
	int RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Time Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Special Access Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rtp Mutu Exclu Resource Utilization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rtp Mutu Exclu Resource Utilization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpDeadlineTypeImpl <em>Rtp Deadline Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpDeadlineTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpDeadlineType()
	 * @generated
	 */
	int RTP_DEADLINE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DEADLINE_TYPE__DEADLINE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Deadline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DEADLINE_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Deadline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_DEADLINE_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpResponseTimeTypeImpl <em>Rtp Response Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpResponseTimeTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpResponseTimeType()
	 * @generated
	 */
	int RTP_RESPONSE_TIME_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Response Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RESPONSE_TIME_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Response Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_RESPONSE_TIME_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpBlockingTimeTypeImpl <em>Rtp Blocking Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpBlockingTimeTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpBlockingTimeType()
	 * @generated
	 */
	int RTP_BLOCKING_TIME_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Blocking Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_BLOCKING_TIME_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Blocking Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_BLOCKING_TIME_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpRepetitionTypeImpl <em>Rtp Repetition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpRepetitionTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpRepetitionType()
	 * @generated
	 */
	int RTP_REPETITION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_REPETITION_TYPE__REPETITION = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Repetition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_REPETITION_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Repetition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_REPETITION_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpFlowRateTypeImpl <em>Rtp Flow Rate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpFlowRateTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpFlowRateType()
	 * @generated
	 */
	int RTP_FLOW_RATE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Flow Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FLOW_RATE_TYPE__FLOW_RATE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Flow Rate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FLOW_RATE_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Flow Rate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_FLOW_RATE_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpUtilizationFactorTypeImpl <em>Rtp Utilization Factor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpUtilizationFactorTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpUtilizationFactorType()
	 * @generated
	 */
	int RTP_UTILIZATION_FACTOR_TYPE = 13;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_UTILIZATION_FACTOR_TYPE__U = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Utilization Factor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_UTILIZATION_FACTOR_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Utilization Factor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_UTILIZATION_FACTOR_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpExecutionTimeTypeImpl <em>Rtp Execution Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpExecutionTimeTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpExecutionTimeType()
	 * @generated
	 */
	int RTP_EXECUTION_TIME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE__UNIT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Execution Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Greater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE___GREATER__RTPEXECUTIONTIMETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE___LOWER__RTPEXECUTIONTIMETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE___EQUALS__RTPEXECUTIONTIMETYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Converts To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE___CONVERTS_TO__TIMEUNITS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Adopts Calculated Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE___ADOPTS_CALCULATED_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Rtp Execution Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_EXECUTION_TIME_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCriticalityTypeImpl <em>Rtp Criticality Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCriticalityTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpCriticalityType()
	 * @generated
	 */
	int RTP_CRITICALITY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_CRITICALITY_TYPE__VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Criticality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_CRITICALITY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Criticality Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_CRITICALITY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpComputingSpeedTypeImpl <em>Rtp Computing Speed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpComputingSpeedTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpComputingSpeedType()
	 * @generated
	 */
	int RTP_COMPUTING_SPEED_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Computing Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Computing Speed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMPUTING_SPEED_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Computing Speed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMPUTING_SPEED_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType <em>Rtp Preemptibility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPreemptibilityType()
	 * @generated
	 */
	int RTP_PREEMPTIBILITY_TYPE = 17;

	/**
	 * The number of structural features of the '<em>Rtp Preemptibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Preemptibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PREEMPTIBILITY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPreemptibleTypeImpl <em>Rtp Preemptible Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPreemptibleTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPreemptibleType()
	 * @generated
	 */
	int RTP_PREEMPTIBLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PREEMPTIBLE_TYPE__COST = RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Preemptible Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PREEMPTIBLE_TYPE_FEATURE_COUNT = RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Preemptible Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PREEMPTIBLE_TYPE_OPERATION_COUNT = RTP_PREEMPTIBILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNonPreemptibleTypeImpl <em>Rtp Non Preemptible Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNonPreemptibleTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpNonPreemptibleType()
	 * @generated
	 */
	int RTP_NON_PREEMPTIBLE_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Rtp Non Preemptible Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NON_PREEMPTIBLE_TYPE_FEATURE_COUNT = RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Non Preemptible Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NON_PREEMPTIBLE_TYPE_OPERATION_COUNT = RTP_PREEMPTIBILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCooperativeTypeImpl <em>Rtp Cooperative Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCooperativeTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpCooperativeType()
	 * @generated
	 */
	int RTP_COOPERATIVE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Non Preemptible Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS = RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Preemptible Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS = RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Cooperative Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COOPERATIVE_TYPE_FEATURE_COUNT = RTP_PREEMPTIBILITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rtp Cooperative Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COOPERATIVE_TYPE_OPERATION_COUNT = RTP_PREEMPTIBILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType <em>Rtp Self Suspension Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpSelfSuspensionType()
	 * @generated
	 */
	int RTP_SELF_SUSPENSION_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Rtp Self Suspension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SELF_SUSPENSION_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Self Suspension Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SELF_SUSPENSION_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSelfSuspendedTypeImpl <em>Rtp Self Suspended Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSelfSuspendedTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpSelfSuspendedType()
	 * @generated
	 */
	int RTP_SELF_SUSPENDED_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Self Suspension Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME = RTP_SELF_SUSPENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Self Suspended Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SELF_SUSPENDED_TYPE_FEATURE_COUNT = RTP_SELF_SUSPENSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Self Suspended Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SELF_SUSPENDED_TYPE_OPERATION_COUNT = RTP_SELF_SUSPENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNotSelfSuspendedTypeImpl <em>Rtp Not Self Suspended Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNotSelfSuspendedTypeImpl
	 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpNotSelfSuspendedType()
	 * @generated
	 */
	int RTP_NOT_SELF_SUSPENDED_TYPE = 23;

	/**
	 * The number of structural features of the '<em>Rtp Not Self Suspended Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NOT_SELF_SUSPENDED_TYPE_FEATURE_COUNT = RTP_SELF_SUSPENSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rtp Not Self Suspended Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NOT_SELF_SUSPENDED_TYPE_OPERATION_COUNT = RTP_SELF_SUSPENSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType <em>Rtp Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Priority Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType
	 * @generated
	 */
	EClass getRtpPriorityType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType#getValue()
	 * @see #getRtpPriorityType()
	 * @generated
	 */
	EReference getRtpPriorityType_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType <em>Rtp Periodicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Periodicity Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType
	 * @generated
	 */
	EClass getRtpPeriodicityType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType <em>Rtp Periodic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Periodic Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType
	 * @generated
	 */
	EClass getRtpPeriodicType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Jitter</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getJitter()
	 * @see #getRtpPeriodicType()
	 * @generated
	 */
	EReference getRtpPeriodicType_Jitter();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getPeriod()
	 * @see #getRtpPeriodicType()
	 * @generated
	 */
	EReference getRtpPeriodicType_Period();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType <em>Rtp Aperiodic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Aperiodic Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType
	 * @generated
	 */
	EClass getRtpAperiodicType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType <em>Rtp Sporadic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Sporadic Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType
	 * @generated
	 */
	EClass getRtpSporadicType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType#getInterArrival <em>Inter Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inter Arrival</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType#getInterArrival()
	 * @see #getRtpSporadicType()
	 * @generated
	 */
	EReference getRtpSporadicType_InterArrival();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType <em>Rtp Release Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Release Time Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType
	 * @generated
	 */
	EClass getRtpReleaseTimeType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReleaseTime <em>Release Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release Time</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReleaseTime()
	 * @see #getRtpReleaseTimeType()
	 * @generated
	 */
	EReference getRtpReleaseTimeType_ReleaseTime();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReferring <em>Referring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referring</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReferring()
	 * @see #getRtpReleaseTimeType()
	 * @generated
	 */
	EReference getRtpReleaseTimeType_Referring();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType <em>Rtp Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Offset Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType
	 * @generated
	 */
	EClass getRtpOffsetType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType#getOffset()
	 * @see #getRtpOffsetType()
	 * @generated
	 */
	EReference getRtpOffsetType_Offset();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType <em>Rtp Mutu Exclu Resource Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Mutu Exclu Resource Utilization Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType
	 * @generated
	 */
	EClass getRtpMutuExcluResourceUtilizationType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getTimeUtilization <em>Time Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Utilization</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getTimeUtilization()
	 * @see #getRtpMutuExcluResourceUtilizationType()
	 * @generated
	 */
	EReference getRtpMutuExcluResourceUtilizationType_TimeUtilization();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getSpecialAccessPriority <em>Special Access Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Access Priority</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getSpecialAccessPriority()
	 * @see #getRtpMutuExcluResourceUtilizationType()
	 * @generated
	 */
	EReference getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getResource()
	 * @see #getRtpMutuExcluResourceUtilizationType()
	 * @generated
	 */
	EReference getRtpMutuExcluResourceUtilizationType_Resource();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType <em>Rtp Deadline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Deadline Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType
	 * @generated
	 */
	EClass getRtpDeadlineType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deadline</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType#getDeadline()
	 * @see #getRtpDeadlineType()
	 * @generated
	 */
	EReference getRtpDeadlineType_Deadline();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType <em>Rtp Response Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Response Time Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType
	 * @generated
	 */
	EClass getRtpResponseTimeType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType#getResponseTime <em>Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Time</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType#getResponseTime()
	 * @see #getRtpResponseTimeType()
	 * @generated
	 */
	EReference getRtpResponseTimeType_ResponseTime();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType <em>Rtp Blocking Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Blocking Time Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType
	 * @generated
	 */
	EClass getRtpBlockingTimeType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blocking Time</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType#getBlockingTime()
	 * @see #getRtpBlockingTimeType()
	 * @generated
	 */
	EReference getRtpBlockingTimeType_BlockingTime();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType <em>Rtp Repetition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Repetition Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType
	 * @generated
	 */
	EClass getRtpRepetitionType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType#getRepetition()
	 * @see #getRtpRepetitionType()
	 * @generated
	 */
	EAttribute getRtpRepetitionType_Repetition();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType <em>Rtp Flow Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Flow Rate Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType
	 * @generated
	 */
	EClass getRtpFlowRateType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType#getFlowRate <em>Flow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Rate</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType#getFlowRate()
	 * @see #getRtpFlowRateType()
	 * @generated
	 */
	EReference getRtpFlowRateType_FlowRate();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType <em>Rtp Utilization Factor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Utilization Factor Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType
	 * @generated
	 */
	EClass getRtpUtilizationFactorType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>U</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType#getU()
	 * @see #getRtpUtilizationFactorType()
	 * @generated
	 */
	EReference getRtpUtilizationFactorType_U();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType <em>Rtp Execution Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Execution Time Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType
	 * @generated
	 */
	EClass getRtpExecutionTimeType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getUnit()
	 * @see #getRtpExecutionTimeType()
	 * @generated
	 */
	EAttribute getRtpExecutionTimeType_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getValue()
	 * @see #getRtpExecutionTimeType()
	 * @generated
	 */
	EReference getRtpExecutionTimeType_Value();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#greater(MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType) <em>Greater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#greater(MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType)
	 * @generated
	 */
	EOperation getRtpExecutionTimeType__Greater__RtpExecutionTimeType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#lower(MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType) <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lower</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#lower(MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType)
	 * @generated
	 */
	EOperation getRtpExecutionTimeType__Lower__RtpExecutionTimeType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#equals(MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#equals(MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType)
	 * @generated
	 */
	EOperation getRtpExecutionTimeType__Equals__RtpExecutionTimeType();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits) <em>Converts To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Converts To</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#convertsTo(MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits)
	 * @generated
	 */
	EOperation getRtpExecutionTimeType__ConvertsTo__TimeUnits();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#adoptsCalculatedValue() <em>Adopts Calculated Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Adopts Calculated Value</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#adoptsCalculatedValue()
	 * @generated
	 */
	EOperation getRtpExecutionTimeType__AdoptsCalculatedValue();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType <em>Rtp Criticality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Criticality Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType
	 * @generated
	 */
	EClass getRtpCriticalityType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType#getValue()
	 * @see #getRtpCriticalityType()
	 * @generated
	 */
	EReference getRtpCriticalityType_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType <em>Rtp Computing Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Computing Speed Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType
	 * @generated
	 */
	EClass getRtpComputingSpeedType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType#getComputingSpeed <em>Computing Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Computing Speed</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType#getComputingSpeed()
	 * @see #getRtpComputingSpeedType()
	 * @generated
	 */
	EReference getRtpComputingSpeedType_ComputingSpeed();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType <em>Rtp Preemptibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Preemptibility Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType
	 * @generated
	 */
	EClass getRtpPreemptibilityType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType <em>Rtp Preemptible Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Preemptible Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType
	 * @generated
	 */
	EClass getRtpPreemptibleType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cost</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType#getCost()
	 * @see #getRtpPreemptibleType()
	 * @generated
	 */
	EReference getRtpPreemptibleType_Cost();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType <em>Rtp Non Preemptible Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Non Preemptible Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType
	 * @generated
	 */
	EClass getRtpNonPreemptibleType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType <em>Rtp Cooperative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Cooperative Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType
	 * @generated
	 */
	EClass getRtpCooperativeType();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType#getNonPreemptibleSteps <em>Non Preemptible Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Non Preemptible Steps</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType#getNonPreemptibleSteps()
	 * @see #getRtpCooperativeType()
	 * @generated
	 */
	EReference getRtpCooperativeType_NonPreemptibleSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType#getNonPreemptibleIntervals <em>Non Preemptible Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Non Preemptible Intervals</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType#getNonPreemptibleIntervals()
	 * @see #getRtpCooperativeType()
	 * @generated
	 */
	EReference getRtpCooperativeType_NonPreemptibleIntervals();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType <em>Rtp Self Suspension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Self Suspension Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType
	 * @generated
	 */
	EClass getRtpSelfSuspensionType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType <em>Rtp Self Suspended Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Self Suspended Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType
	 * @generated
	 */
	EClass getRtpSelfSuspendedType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType#getSelfSuspensionTime <em>Self Suspension Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self Suspension Time</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType#getSelfSuspensionTime()
	 * @see #getRtpSelfSuspendedType()
	 * @generated
	 */
	EReference getRtpSelfSuspendedType_SelfSuspensionTime();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType <em>Rtp Not Self Suspended Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Not Self Suspended Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType
	 * @generated
	 */
	EClass getRtpNotSelfSuspendedType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtpTypesFactory getRtpTypesFactory();

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
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPriorityTypeImpl <em>Rtp Priority Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPriorityTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPriorityType()
		 * @generated
		 */
		EClass RTP_PRIORITY_TYPE = eINSTANCE.getRtpPriorityType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_PRIORITY_TYPE__VALUE = eINSTANCE.getRtpPriorityType_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType <em>Rtp Periodicity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPeriodicityType()
		 * @generated
		 */
		EClass RTP_PERIODICITY_TYPE = eINSTANCE.getRtpPeriodicityType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPeriodicTypeImpl <em>Rtp Periodic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPeriodicTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPeriodicType()
		 * @generated
		 */
		EClass RTP_PERIODIC_TYPE = eINSTANCE.getRtpPeriodicType();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_PERIODIC_TYPE__JITTER = eINSTANCE.getRtpPeriodicType_Jitter();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_PERIODIC_TYPE__PERIOD = eINSTANCE.getRtpPeriodicType_Period();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpAperiodicTypeImpl <em>Rtp Aperiodic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpAperiodicTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpAperiodicType()
		 * @generated
		 */
		EClass RTP_APERIODIC_TYPE = eINSTANCE.getRtpAperiodicType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSporadicTypeImpl <em>Rtp Sporadic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSporadicTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpSporadicType()
		 * @generated
		 */
		EClass RTP_SPORADIC_TYPE = eINSTANCE.getRtpSporadicType();

		/**
		 * The meta object literal for the '<em><b>Inter Arrival</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_SPORADIC_TYPE__INTER_ARRIVAL = eINSTANCE.getRtpSporadicType_InterArrival();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpReleaseTimeTypeImpl <em>Rtp Release Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpReleaseTimeTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpReleaseTimeType()
		 * @generated
		 */
		EClass RTP_RELEASE_TIME_TYPE = eINSTANCE.getRtpReleaseTimeType();

		/**
		 * The meta object literal for the '<em><b>Release Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_RELEASE_TIME_TYPE__RELEASE_TIME = eINSTANCE.getRtpReleaseTimeType_ReleaseTime();

		/**
		 * The meta object literal for the '<em><b>Referring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_RELEASE_TIME_TYPE__REFERRING = eINSTANCE.getRtpReleaseTimeType_Referring();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpOffsetTypeImpl <em>Rtp Offset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpOffsetTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpOffsetType()
		 * @generated
		 */
		EClass RTP_OFFSET_TYPE = eINSTANCE.getRtpOffsetType();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_OFFSET_TYPE__OFFSET = eINSTANCE.getRtpOffsetType_Offset();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl <em>Rtp Mutu Exclu Resource Utilization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpMutuExcluResourceUtilizationType()
		 * @generated
		 */
		EClass RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE = eINSTANCE.getRtpMutuExcluResourceUtilizationType();

		/**
		 * The meta object literal for the '<em><b>Time Utilization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION = eINSTANCE.getRtpMutuExcluResourceUtilizationType_TimeUtilization();

		/**
		 * The meta object literal for the '<em><b>Special Access Priority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY = eINSTANCE.getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE = eINSTANCE.getRtpMutuExcluResourceUtilizationType_Resource();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpDeadlineTypeImpl <em>Rtp Deadline Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpDeadlineTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpDeadlineType()
		 * @generated
		 */
		EClass RTP_DEADLINE_TYPE = eINSTANCE.getRtpDeadlineType();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_DEADLINE_TYPE__DEADLINE = eINSTANCE.getRtpDeadlineType_Deadline();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpResponseTimeTypeImpl <em>Rtp Response Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpResponseTimeTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpResponseTimeType()
		 * @generated
		 */
		EClass RTP_RESPONSE_TIME_TYPE = eINSTANCE.getRtpResponseTimeType();

		/**
		 * The meta object literal for the '<em><b>Response Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME = eINSTANCE.getRtpResponseTimeType_ResponseTime();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpBlockingTimeTypeImpl <em>Rtp Blocking Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpBlockingTimeTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpBlockingTimeType()
		 * @generated
		 */
		EClass RTP_BLOCKING_TIME_TYPE = eINSTANCE.getRtpBlockingTimeType();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME = eINSTANCE.getRtpBlockingTimeType_BlockingTime();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpRepetitionTypeImpl <em>Rtp Repetition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpRepetitionTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpRepetitionType()
		 * @generated
		 */
		EClass RTP_REPETITION_TYPE = eINSTANCE.getRtpRepetitionType();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_REPETITION_TYPE__REPETITION = eINSTANCE.getRtpRepetitionType_Repetition();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpFlowRateTypeImpl <em>Rtp Flow Rate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpFlowRateTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpFlowRateType()
		 * @generated
		 */
		EClass RTP_FLOW_RATE_TYPE = eINSTANCE.getRtpFlowRateType();

		/**
		 * The meta object literal for the '<em><b>Flow Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_FLOW_RATE_TYPE__FLOW_RATE = eINSTANCE.getRtpFlowRateType_FlowRate();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpUtilizationFactorTypeImpl <em>Rtp Utilization Factor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpUtilizationFactorTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpUtilizationFactorType()
		 * @generated
		 */
		EClass RTP_UTILIZATION_FACTOR_TYPE = eINSTANCE.getRtpUtilizationFactorType();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_UTILIZATION_FACTOR_TYPE__U = eINSTANCE.getRtpUtilizationFactorType_U();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpExecutionTimeTypeImpl <em>Rtp Execution Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpExecutionTimeTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpExecutionTimeType()
		 * @generated
		 */
		EClass RTP_EXECUTION_TIME_TYPE = eINSTANCE.getRtpExecutionTimeType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_EXECUTION_TIME_TYPE__UNIT = eINSTANCE.getRtpExecutionTimeType_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_EXECUTION_TIME_TYPE__VALUE = eINSTANCE.getRtpExecutionTimeType_Value();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_EXECUTION_TIME_TYPE___GREATER__RTPEXECUTIONTIMETYPE = eINSTANCE.getRtpExecutionTimeType__Greater__RtpExecutionTimeType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_EXECUTION_TIME_TYPE___LOWER__RTPEXECUTIONTIMETYPE = eINSTANCE.getRtpExecutionTimeType__Lower__RtpExecutionTimeType();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_EXECUTION_TIME_TYPE___EQUALS__RTPEXECUTIONTIMETYPE = eINSTANCE.getRtpExecutionTimeType__Equals__RtpExecutionTimeType();

		/**
		 * The meta object literal for the '<em><b>Converts To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_EXECUTION_TIME_TYPE___CONVERTS_TO__TIMEUNITS = eINSTANCE.getRtpExecutionTimeType__ConvertsTo__TimeUnits();

		/**
		 * The meta object literal for the '<em><b>Adopts Calculated Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RTP_EXECUTION_TIME_TYPE___ADOPTS_CALCULATED_VALUE = eINSTANCE.getRtpExecutionTimeType__AdoptsCalculatedValue();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCriticalityTypeImpl <em>Rtp Criticality Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCriticalityTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpCriticalityType()
		 * @generated
		 */
		EClass RTP_CRITICALITY_TYPE = eINSTANCE.getRtpCriticalityType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_CRITICALITY_TYPE__VALUE = eINSTANCE.getRtpCriticalityType_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpComputingSpeedTypeImpl <em>Rtp Computing Speed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpComputingSpeedTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpComputingSpeedType()
		 * @generated
		 */
		EClass RTP_COMPUTING_SPEED_TYPE = eINSTANCE.getRtpComputingSpeedType();

		/**
		 * The meta object literal for the '<em><b>Computing Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED = eINSTANCE.getRtpComputingSpeedType_ComputingSpeed();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType <em>Rtp Preemptibility Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPreemptibilityType()
		 * @generated
		 */
		EClass RTP_PREEMPTIBILITY_TYPE = eINSTANCE.getRtpPreemptibilityType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPreemptibleTypeImpl <em>Rtp Preemptible Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpPreemptibleTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpPreemptibleType()
		 * @generated
		 */
		EClass RTP_PREEMPTIBLE_TYPE = eINSTANCE.getRtpPreemptibleType();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_PREEMPTIBLE_TYPE__COST = eINSTANCE.getRtpPreemptibleType_Cost();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNonPreemptibleTypeImpl <em>Rtp Non Preemptible Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNonPreemptibleTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpNonPreemptibleType()
		 * @generated
		 */
		EClass RTP_NON_PREEMPTIBLE_TYPE = eINSTANCE.getRtpNonPreemptibleType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCooperativeTypeImpl <em>Rtp Cooperative Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCooperativeTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpCooperativeType()
		 * @generated
		 */
		EClass RTP_COOPERATIVE_TYPE = eINSTANCE.getRtpCooperativeType();

		/**
		 * The meta object literal for the '<em><b>Non Preemptible Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS = eINSTANCE.getRtpCooperativeType_NonPreemptibleSteps();

		/**
		 * The meta object literal for the '<em><b>Non Preemptible Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS = eINSTANCE.getRtpCooperativeType_NonPreemptibleIntervals();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType <em>Rtp Self Suspension Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpSelfSuspensionType()
		 * @generated
		 */
		EClass RTP_SELF_SUSPENSION_TYPE = eINSTANCE.getRtpSelfSuspensionType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSelfSuspendedTypeImpl <em>Rtp Self Suspended Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSelfSuspendedTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpSelfSuspendedType()
		 * @generated
		 */
		EClass RTP_SELF_SUSPENDED_TYPE = eINSTANCE.getRtpSelfSuspendedType();

		/**
		 * The meta object literal for the '<em><b>Self Suspension Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME = eINSTANCE.getRtpSelfSuspendedType_SelfSuspensionTime();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNotSelfSuspendedTypeImpl <em>Rtp Not Self Suspended Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpNotSelfSuspendedTypeImpl
		 * @see MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl#getRtpNotSelfSuspendedType()
		 * @generated
		 */
		EClass RTP_NOT_SELF_SUSPENDED_TYPE = eINSTANCE.getRtpNotSelfSuspendedType();

	}

} //RtpTypesPackage
