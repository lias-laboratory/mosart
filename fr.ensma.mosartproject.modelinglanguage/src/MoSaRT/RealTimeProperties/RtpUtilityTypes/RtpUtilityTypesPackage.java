/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes;

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
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RtpUtilityTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RtpUtilityTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties/RtpUtilityTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RtpUT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpUtilityTypesPackage eINSTANCE = MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerMatrixImpl <em>Integer Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerMatrixImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerMatrix()
	 * @generated
	 */
	int INTEGER_MATRIX = 0;

	/**
	 * The feature id for the '<em><b>Matrix Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MATRIX__MATRIX_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MATRIX_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_MATRIX_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerVectorImpl <em>Integer Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerVectorImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerVector()
	 * @generated
	 */
	int INTEGER_VECTOR = 1;

	/**
	 * The feature id for the '<em><b>Vector Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VECTOR__VECTOR_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VECTOR_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VECTOR_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealVectorImpl <em>Real Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealVectorImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealVector()
	 * @generated
	 */
	int REAL_VECTOR = 2;

	/**
	 * The feature id for the '<em><b>Vector Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VECTOR__VECTOR_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VECTOR_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VECTOR___MAX_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VECTOR_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealMatrixImpl <em>Real Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealMatrixImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealMatrix()
	 * @generated
	 */
	int REAL_MATRIX = 3;

	/**
	 * The feature id for the '<em><b>Matrix Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_MATRIX__MATRIX_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_MATRIX_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_MATRIX_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerSetImpl <em>Integer Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerSetImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerSet()
	 * @generated
	 */
	int INTEGER_SET = 4;

	/**
	 * The feature id for the '<em><b>Set Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SET__SET_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SET_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SET_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerListImpl <em>Integer List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerListImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerList()
	 * @generated
	 */
	int INTEGER_LIST = 5;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LIST__LIST_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LIST_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LIST_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealSetImpl <em>Real Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealSetImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealSet()
	 * @generated
	 */
	int REAL_SET = 6;

	/**
	 * The feature id for the '<em><b>Set Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_SET__SET_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_SET_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_SET_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealListImpl <em>Real List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealListImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealList()
	 * @generated
	 */
	int REAL_LIST = 7;

	/**
	 * The feature id for the '<em><b>List Elements</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LIST__LIST_ELEMENTS = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LIST_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LIST_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl <em>Integer Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerInterval()
	 * @generated
	 */
	int INTEGER_INTERVAL = 8;

	/**
	 * The feature id for the '<em><b>Delimiter Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL__DELIMITER_MIN = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL__BOUND_MIN = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bound Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL__BOUND_MAX = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delimiter Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL__DELIMITER_MAX = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Integer Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Integer Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_INTERVAL_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealIntervalImpl <em>Real Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealIntervalImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealInterval()
	 * @generated
	 */
	int REAL_INTERVAL = 9;

	/**
	 * The feature id for the '<em><b>Delimiter Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_INTERVAL__DELIMITER_MIN = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bound Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_INTERVAL__BOUND_MIN = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bound Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_INTERVAL__BOUND_MAX = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delimiter Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_INTERVAL__DELIMITER_MAX = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Real Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_INTERVAL_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Real Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_INTERVAL_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable <em>Real Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealVariable()
	 * @generated
	 */
	int REAL_VARIABLE = 10;

	/**
	 * The number of structural features of the '<em>Real Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VARIABLE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VARIABLE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredRealImpl <em>Measured Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredRealImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMeasuredReal()
	 * @generated
	 */
	int MEASURED_REAL = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_REAL__VALUE = REAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_REAL__UNKNOWN_VALUE_NAME = REAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tool Used Descriptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_REAL__TOOL_USED_DESCRIPTIONS = REAL_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Old Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_REAL__ALL_OLD_VALUES = REAL_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measured Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_REAL_FEATURE_COUNT = REAL_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measured Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_REAL_OPERATION_COUNT = REAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownRealImpl <em>Unknown Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownRealImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getUnknownReal()
	 * @generated
	 */
	int UNKNOWN_REAL = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_REAL__VALUE = REAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unknown Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_REAL_FEATURE_COUNT = REAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unknown Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_REAL_OPERATION_COUNT = REAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleRealImpl <em>Simple Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleRealImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getSimpleReal()
	 * @generated
	 */
	int SIMPLE_REAL = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REAL__VALUE = REAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REAL_FEATURE_COUNT = REAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REAL_OPERATION_COUNT = REAL_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgRealImpl <em>Max Min Avg Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgRealImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMaxMinAvgReal()
	 * @generated
	 */
	int MAX_MIN_AVG_REAL = 14;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_REAL__MIN_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avg Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_REAL__AVG_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_REAL__MAX_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Max Min Avg Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_REAL_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Max Min Avg Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_REAL_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 15;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl <em>Measured Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMeasuredInteger()
	 * @generated
	 */
	int MEASURED_INTEGER = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__VALUE = INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__UNKNOWN_VALUE_NAME = INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tool Used Descriptions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__TOOL_USED_DESCRIPTIONS = INTEGER_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>All Old Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__ALL_OLD_VALUES = INTEGER_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Measured Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER_FEATURE_COUNT = INTEGER_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Measured Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER_OPERATION_COUNT = INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownIntegerImpl <em>Unknown Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownIntegerImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getUnknownInteger()
	 * @generated
	 */
	int UNKNOWN_INTEGER = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_INTEGER__VALUE = INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unknown Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_INTEGER_FEATURE_COUNT = INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unknown Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_INTEGER_OPERATION_COUNT = INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleIntegerImpl <em>Simple Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleIntegerImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getSimpleInteger()
	 * @generated
	 */
	int SIMPLE_INTEGER = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INTEGER__VALUE = INTEGER_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INTEGER_FEATURE_COUNT = INTEGER_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_INTEGER_OPERATION_COUNT = INTEGER_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl <em>Max Min Avg Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMaxMinAvgInteger()
	 * @generated
	 */
	int MAX_MIN_AVG_INTEGER = 19;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_INTEGER__MIN_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avg Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_INTEGER__AVG_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_INTEGER__MAX_VALUE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Max Min Avg Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_INTEGER_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Max Min Avg Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_MIN_AVG_INTEGER_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType <em>Delimiter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getDelimiterType()
	 * @generated
	 */
	int DELIMITER_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix <em>Integer Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Matrix</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix
	 * @generated
	 */
	EClass getIntegerMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix#getMatrixElements <em>Matrix Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix#getMatrixElements()
	 * @see #getIntegerMatrix()
	 * @generated
	 */
	EReference getIntegerMatrix_MatrixElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector <em>Integer Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Vector</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector
	 * @generated
	 */
	EClass getIntegerVector();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector#getVectorElements <em>Vector Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vector Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector#getVectorElements()
	 * @see #getIntegerVector()
	 * @generated
	 */
	EAttribute getIntegerVector_VectorElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector <em>Real Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Vector</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector
	 * @generated
	 */
	EClass getRealVector();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector#getVectorElements <em>Vector Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vector Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector#getVectorElements()
	 * @see #getRealVector()
	 * @generated
	 */
	EAttribute getRealVector_VectorElements();

	/**
	 * Returns the meta object for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector#maxValue() <em>Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Value</em>' operation.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector#maxValue()
	 * @generated
	 */
	EOperation getRealVector__MaxValue();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix <em>Real Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Matrix</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix
	 * @generated
	 */
	EClass getRealMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix#getMatrixElements <em>Matrix Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix#getMatrixElements()
	 * @see #getRealMatrix()
	 * @generated
	 */
	EReference getRealMatrix_MatrixElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet <em>Integer Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Set</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet
	 * @generated
	 */
	EClass getIntegerSet();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet#getSetElements <em>Set Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Set Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet#getSetElements()
	 * @see #getIntegerSet()
	 * @generated
	 */
	EAttribute getIntegerSet_SetElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList <em>Integer List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer List</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList
	 * @generated
	 */
	EClass getIntegerList();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList#getListElements()
	 * @see #getIntegerList()
	 * @generated
	 */
	EAttribute getIntegerList_ListElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet <em>Real Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Set</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet
	 * @generated
	 */
	EClass getRealSet();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet#getSetElements <em>Set Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Set Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet#getSetElements()
	 * @see #getRealSet()
	 * @generated
	 */
	EAttribute getRealSet_SetElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList <em>Real List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real List</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList
	 * @generated
	 */
	EClass getRealList();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList#getListElements <em>List Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Elements</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList#getListElements()
	 * @see #getRealList()
	 * @generated
	 */
	EAttribute getRealList_ListElements();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval <em>Integer Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Interval</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval
	 * @generated
	 */
	EClass getIntegerInterval();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMin <em>Delimiter Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter Min</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMin()
	 * @see #getIntegerInterval()
	 * @generated
	 */
	EAttribute getIntegerInterval_DelimiterMin();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMin <em>Bound Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Min</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMin()
	 * @see #getIntegerInterval()
	 * @generated
	 */
	EAttribute getIntegerInterval_BoundMin();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMax <em>Bound Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Max</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMax()
	 * @see #getIntegerInterval()
	 * @generated
	 */
	EAttribute getIntegerInterval_BoundMax();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMax <em>Delimiter Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter Max</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMax()
	 * @see #getIntegerInterval()
	 * @generated
	 */
	EAttribute getIntegerInterval_DelimiterMax();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval <em>Real Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Interval</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval
	 * @generated
	 */
	EClass getRealInterval();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getDelimiterMin <em>Delimiter Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter Min</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getDelimiterMin()
	 * @see #getRealInterval()
	 * @generated
	 */
	EAttribute getRealInterval_DelimiterMin();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getBoundMin <em>Bound Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Min</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getBoundMin()
	 * @see #getRealInterval()
	 * @generated
	 */
	EAttribute getRealInterval_BoundMin();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getBoundMax <em>Bound Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound Max</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getBoundMax()
	 * @see #getRealInterval()
	 * @generated
	 */
	EAttribute getRealInterval_BoundMax();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getDelimiterMax <em>Delimiter Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter Max</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval#getDelimiterMax()
	 * @see #getRealInterval()
	 * @generated
	 */
	EAttribute getRealInterval_DelimiterMax();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable <em>Real Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Variable</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable
	 * @generated
	 */
	EClass getRealVariable();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal <em>Measured Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Real</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal
	 * @generated
	 */
	EClass getMeasuredReal();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getValue()
	 * @see #getMeasuredReal()
	 * @generated
	 */
	EAttribute getMeasuredReal_Value();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getUnknownValueName <em>Unknown Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Value Name</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getUnknownValueName()
	 * @see #getMeasuredReal()
	 * @generated
	 */
	EAttribute getMeasuredReal_UnknownValueName();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getToolUsedDescriptions <em>Tool Used Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tool Used Descriptions</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getToolUsedDescriptions()
	 * @see #getMeasuredReal()
	 * @generated
	 */
	EAttribute getMeasuredReal_ToolUsedDescriptions();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getAllOldValues <em>All Old Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>All Old Values</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal#getAllOldValues()
	 * @see #getMeasuredReal()
	 * @generated
	 */
	EAttribute getMeasuredReal_AllOldValues();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal <em>Unknown Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Real</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal
	 * @generated
	 */
	EClass getUnknownReal();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal#getValue()
	 * @see #getUnknownReal()
	 * @generated
	 */
	EAttribute getUnknownReal_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal <em>Simple Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Real</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal
	 * @generated
	 */
	EClass getSimpleReal();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal#getValue()
	 * @see #getSimpleReal()
	 * @generated
	 */
	EAttribute getSimpleReal_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal <em>Max Min Avg Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Min Avg Real</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal
	 * @generated
	 */
	EClass getMaxMinAvgReal();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMinValue()
	 * @see #getMaxMinAvgReal()
	 * @generated
	 */
	EAttribute getMaxMinAvgReal_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getAvgValue <em>Avg Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getAvgValue()
	 * @see #getMaxMinAvgReal()
	 * @generated
	 */
	EAttribute getMaxMinAvgReal_AvgValue();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMaxValue()
	 * @see #getMaxMinAvgReal()
	 * @generated
	 */
	EAttribute getMaxMinAvgReal_MaxValue();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger <em>Measured Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Integer</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger
	 * @generated
	 */
	EClass getMeasuredInteger();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getValue()
	 * @see #getMeasuredInteger()
	 * @generated
	 */
	EAttribute getMeasuredInteger_Value();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getUnknownValueName <em>Unknown Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unknown Value Name</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getUnknownValueName()
	 * @see #getMeasuredInteger()
	 * @generated
	 */
	EAttribute getMeasuredInteger_UnknownValueName();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getToolUsedDescriptions <em>Tool Used Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tool Used Descriptions</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getToolUsedDescriptions()
	 * @see #getMeasuredInteger()
	 * @generated
	 */
	EAttribute getMeasuredInteger_ToolUsedDescriptions();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getAllOldValues <em>All Old Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>All Old Values</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getAllOldValues()
	 * @see #getMeasuredInteger()
	 * @generated
	 */
	EAttribute getMeasuredInteger_AllOldValues();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger <em>Unknown Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Integer</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger
	 * @generated
	 */
	EClass getUnknownInteger();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger#getValue()
	 * @see #getUnknownInteger()
	 * @generated
	 */
	EAttribute getUnknownInteger_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger <em>Simple Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Integer</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger
	 * @generated
	 */
	EClass getSimpleInteger();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger#getValue()
	 * @see #getSimpleInteger()
	 * @generated
	 */
	EAttribute getSimpleInteger_Value();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger <em>Max Min Avg Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Min Avg Integer</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger
	 * @generated
	 */
	EClass getMaxMinAvgInteger();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMinValue()
	 * @see #getMaxMinAvgInteger()
	 * @generated
	 */
	EAttribute getMaxMinAvgInteger_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getAvgValue <em>Avg Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getAvgValue()
	 * @see #getMaxMinAvgInteger()
	 * @generated
	 */
	EAttribute getMaxMinAvgInteger_AvgValue();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMaxValue()
	 * @see #getMaxMinAvgInteger()
	 * @generated
	 */
	EAttribute getMaxMinAvgInteger_MaxValue();

	/**
	 * Returns the meta object for enum '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType <em>Delimiter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Delimiter Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
	 * @generated
	 */
	EEnum getDelimiterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtpUtilityTypesFactory getRtpUtilityTypesFactory();

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
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerMatrixImpl <em>Integer Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerMatrixImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerMatrix()
		 * @generated
		 */
		EClass INTEGER_MATRIX = eINSTANCE.getIntegerMatrix();

		/**
		 * The meta object literal for the '<em><b>Matrix Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_MATRIX__MATRIX_ELEMENTS = eINSTANCE.getIntegerMatrix_MatrixElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerVectorImpl <em>Integer Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerVectorImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerVector()
		 * @generated
		 */
		EClass INTEGER_VECTOR = eINSTANCE.getIntegerVector();

		/**
		 * The meta object literal for the '<em><b>Vector Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VECTOR__VECTOR_ELEMENTS = eINSTANCE.getIntegerVector_VectorElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealVectorImpl <em>Real Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealVectorImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealVector()
		 * @generated
		 */
		EClass REAL_VECTOR = eINSTANCE.getRealVector();

		/**
		 * The meta object literal for the '<em><b>Vector Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_VECTOR__VECTOR_ELEMENTS = eINSTANCE.getRealVector_VectorElements();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REAL_VECTOR___MAX_VALUE = eINSTANCE.getRealVector__MaxValue();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealMatrixImpl <em>Real Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealMatrixImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealMatrix()
		 * @generated
		 */
		EClass REAL_MATRIX = eINSTANCE.getRealMatrix();

		/**
		 * The meta object literal for the '<em><b>Matrix Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REAL_MATRIX__MATRIX_ELEMENTS = eINSTANCE.getRealMatrix_MatrixElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerSetImpl <em>Integer Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerSetImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerSet()
		 * @generated
		 */
		EClass INTEGER_SET = eINSTANCE.getIntegerSet();

		/**
		 * The meta object literal for the '<em><b>Set Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_SET__SET_ELEMENTS = eINSTANCE.getIntegerSet_SetElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerListImpl <em>Integer List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerListImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerList()
		 * @generated
		 */
		EClass INTEGER_LIST = eINSTANCE.getIntegerList();

		/**
		 * The meta object literal for the '<em><b>List Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LIST__LIST_ELEMENTS = eINSTANCE.getIntegerList_ListElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealSetImpl <em>Real Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealSetImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealSet()
		 * @generated
		 */
		EClass REAL_SET = eINSTANCE.getRealSet();

		/**
		 * The meta object literal for the '<em><b>Set Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_SET__SET_ELEMENTS = eINSTANCE.getRealSet_SetElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealListImpl <em>Real List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealListImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealList()
		 * @generated
		 */
		EClass REAL_LIST = eINSTANCE.getRealList();

		/**
		 * The meta object literal for the '<em><b>List Elements</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LIST__LIST_ELEMENTS = eINSTANCE.getRealList_ListElements();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl <em>Integer Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerInterval()
		 * @generated
		 */
		EClass INTEGER_INTERVAL = eINSTANCE.getIntegerInterval();

		/**
		 * The meta object literal for the '<em><b>Delimiter Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL__DELIMITER_MIN = eINSTANCE.getIntegerInterval_DelimiterMin();

		/**
		 * The meta object literal for the '<em><b>Bound Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL__BOUND_MIN = eINSTANCE.getIntegerInterval_BoundMin();

		/**
		 * The meta object literal for the '<em><b>Bound Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL__BOUND_MAX = eINSTANCE.getIntegerInterval_BoundMax();

		/**
		 * The meta object literal for the '<em><b>Delimiter Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_INTERVAL__DELIMITER_MAX = eINSTANCE.getIntegerInterval_DelimiterMax();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealIntervalImpl <em>Real Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealIntervalImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealInterval()
		 * @generated
		 */
		EClass REAL_INTERVAL = eINSTANCE.getRealInterval();

		/**
		 * The meta object literal for the '<em><b>Delimiter Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_INTERVAL__DELIMITER_MIN = eINSTANCE.getRealInterval_DelimiterMin();

		/**
		 * The meta object literal for the '<em><b>Bound Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_INTERVAL__BOUND_MIN = eINSTANCE.getRealInterval_BoundMin();

		/**
		 * The meta object literal for the '<em><b>Bound Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_INTERVAL__BOUND_MAX = eINSTANCE.getRealInterval_BoundMax();

		/**
		 * The meta object literal for the '<em><b>Delimiter Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_INTERVAL__DELIMITER_MAX = eINSTANCE.getRealInterval_DelimiterMax();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable <em>Real Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getRealVariable()
		 * @generated
		 */
		EClass REAL_VARIABLE = eINSTANCE.getRealVariable();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredRealImpl <em>Measured Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredRealImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMeasuredReal()
		 * @generated
		 */
		EClass MEASURED_REAL = eINSTANCE.getMeasuredReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_REAL__VALUE = eINSTANCE.getMeasuredReal_Value();

		/**
		 * The meta object literal for the '<em><b>Unknown Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_REAL__UNKNOWN_VALUE_NAME = eINSTANCE.getMeasuredReal_UnknownValueName();

		/**
		 * The meta object literal for the '<em><b>Tool Used Descriptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_REAL__TOOL_USED_DESCRIPTIONS = eINSTANCE.getMeasuredReal_ToolUsedDescriptions();

		/**
		 * The meta object literal for the '<em><b>All Old Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_REAL__ALL_OLD_VALUES = eINSTANCE.getMeasuredReal_AllOldValues();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownRealImpl <em>Unknown Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownRealImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getUnknownReal()
		 * @generated
		 */
		EClass UNKNOWN_REAL = eINSTANCE.getUnknownReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_REAL__VALUE = eINSTANCE.getUnknownReal_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleRealImpl <em>Simple Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleRealImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getSimpleReal()
		 * @generated
		 */
		EClass SIMPLE_REAL = eINSTANCE.getSimpleReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_REAL__VALUE = eINSTANCE.getSimpleReal_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgRealImpl <em>Max Min Avg Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgRealImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMaxMinAvgReal()
		 * @generated
		 */
		EClass MAX_MIN_AVG_REAL = eINSTANCE.getMaxMinAvgReal();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MIN_AVG_REAL__MIN_VALUE = eINSTANCE.getMaxMinAvgReal_MinValue();

		/**
		 * The meta object literal for the '<em><b>Avg Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MIN_AVG_REAL__AVG_VALUE = eINSTANCE.getMaxMinAvgReal_AvgValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MIN_AVG_REAL__MAX_VALUE = eINSTANCE.getMaxMinAvgReal_MaxValue();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl <em>Measured Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMeasuredInteger()
		 * @generated
		 */
		EClass MEASURED_INTEGER = eINSTANCE.getMeasuredInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_INTEGER__VALUE = eINSTANCE.getMeasuredInteger_Value();

		/**
		 * The meta object literal for the '<em><b>Unknown Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_INTEGER__UNKNOWN_VALUE_NAME = eINSTANCE.getMeasuredInteger_UnknownValueName();

		/**
		 * The meta object literal for the '<em><b>Tool Used Descriptions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_INTEGER__TOOL_USED_DESCRIPTIONS = eINSTANCE.getMeasuredInteger_ToolUsedDescriptions();

		/**
		 * The meta object literal for the '<em><b>All Old Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_INTEGER__ALL_OLD_VALUES = eINSTANCE.getMeasuredInteger_AllOldValues();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownIntegerImpl <em>Unknown Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.UnknownIntegerImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getUnknownInteger()
		 * @generated
		 */
		EClass UNKNOWN_INTEGER = eINSTANCE.getUnknownInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNKNOWN_INTEGER__VALUE = eINSTANCE.getUnknownInteger_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleIntegerImpl <em>Simple Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleIntegerImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getSimpleInteger()
		 * @generated
		 */
		EClass SIMPLE_INTEGER = eINSTANCE.getSimpleInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_INTEGER__VALUE = eINSTANCE.getSimpleInteger_Value();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl <em>Max Min Avg Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getMaxMinAvgInteger()
		 * @generated
		 */
		EClass MAX_MIN_AVG_INTEGER = eINSTANCE.getMaxMinAvgInteger();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MIN_AVG_INTEGER__MIN_VALUE = eINSTANCE.getMaxMinAvgInteger_MinValue();

		/**
		 * The meta object literal for the '<em><b>Avg Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MIN_AVG_INTEGER__AVG_VALUE = eINSTANCE.getMaxMinAvgInteger_AvgValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_MIN_AVG_INTEGER__MAX_VALUE = eINSTANCE.getMaxMinAvgInteger_MaxValue();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType <em>Delimiter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
		 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl#getDelimiterType()
		 * @generated
		 */
		EEnum DELIMITER_TYPE = eINSTANCE.getDelimiterType();

	}

} //RtpUtilityTypesPackage
