/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SoftwareOperatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SoftwareOperators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/SoftwarePlatform/SoftwareOperators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SO";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareOperatorsPackage eINSTANCE = MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl <em>System Software Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSystemSoftwareSide()
	 * @generated
	 */
	int SYSTEM_SOFTWARE_SIDE = 0;

	/**
	 * The feature id for the '<em><b>System Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Space Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES = 1;

	/**
	 * The feature id for the '<em><b>Interaction Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Schedulable Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE__NAME = 4;

	/**
	 * The number of structural features of the '<em>System Software Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Software Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_SOFTWARE_SIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl <em>So Schedulable Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoSchedulableTask()
	 * @generated
	 */
	int SO_SCHEDULABLE_TASK = 1;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Comm Writing Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Comm Reading Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__NAME = 4;

	/**
	 * The feature id for the '<em><b>Mutual Exclusion Resource Utilization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION = 5;

	/**
	 * The feature id for the '<em><b>Favorite Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS = 6;

	/**
	 * The feature id for the '<em><b>Run On Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS = 7;

	/**
	 * The feature id for the '<em><b>Represented Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Rtp Mutual Exclusion Resource Utilization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION = 9;

	/**
	 * The number of structural features of the '<em>So Schedulable Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>So Schedulable Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SCHEDULABLE_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl <em>So Space Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoSpaceProcess()
	 * @generated
	 */
	int SO_SPACE_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Space Process Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__SPACE_PROCESS_PARENT = 0;

	/**
	 * The feature id for the '<em><b>Space Process Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Schedulable Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__SCHEDULABLE_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__NAME = 3;

	/**
	 * The feature id for the '<em><b>Processing Unit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__PROCESSING_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Rtp Scheduling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY = 5;

	/**
	 * The feature id for the '<em><b>All Space Process Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS = 6;

	/**
	 * The feature id for the '<em><b>Rtp Task Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS__RTP_TASK_ALLOCATION = 7;

	/**
	 * The number of structural features of the '<em>So Space Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>So Space Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_SPACE_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource <em>So Interaction Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoInteractionResource()
	 * @generated
	 */
	int SO_INTERACTION_RESOURCE = 3;

	/**
	 * The number of structural features of the '<em>So Interaction Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_INTERACTION_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>So Interaction Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_INTERACTION_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl <em>So Mutual Exclusion Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoMutualExclusionResource()
	 * @generated
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE__TASKS = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE__NAME = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rtp Protect Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtp Waiting Queue Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>So Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE_FEATURE_COUNT = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>So Mutual Exclusion Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_MUTUAL_EXCLUSION_RESOURCE_OPERATION_COUNT = SO_INTERACTION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource <em>So Communication Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoCommunicationResource()
	 * @generated
	 */
	int SO_COMMUNICATION_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Writer Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_COMMUNICATION_RESOURCE__WRITER_TASKS = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reader Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_COMMUNICATION_RESOURCE__READER_TASKS = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>So Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_COMMUNICATION_RESOURCE_FEATURE_COUNT = SO_INTERACTION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>So Communication Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_COMMUNICATION_RESOURCE_OPERATION_COUNT = SO_INTERACTION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl <em>So Remote Comm Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoRemoteCommResource()
	 * @generated
	 */
	int SO_REMOTE_COMM_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Writer Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_REMOTE_COMM_RESOURCE__WRITER_TASKS = SO_COMMUNICATION_RESOURCE__WRITER_TASKS;

	/**
	 * The feature id for the '<em><b>Reader Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_REMOTE_COMM_RESOURCE__READER_TASKS = SO_COMMUNICATION_RESOURCE__READER_TASKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_REMOTE_COMM_RESOURCE__NAME = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transmitted Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>So Remote Comm Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_REMOTE_COMM_RESOURCE_FEATURE_COUNT = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>So Remote Comm Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_REMOTE_COMM_RESOURCE_OPERATION_COUNT = SO_COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoLocalCommResourceImpl <em>So Local Comm Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoLocalCommResourceImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoLocalCommResource()
	 * @generated
	 */
	int SO_LOCAL_COMM_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Writer Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE__WRITER_TASKS = SO_COMMUNICATION_RESOURCE__WRITER_TASKS;

	/**
	 * The feature id for the '<em><b>Reader Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE__READER_TASKS = SO_COMMUNICATION_RESOURCE__READER_TASKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE__NAME = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rtp Communication Mechanism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rtp Waiting Queue Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtp Protect Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>So Local Comm Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE_FEATURE_COUNT = SO_COMMUNICATION_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>So Local Comm Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_LOCAL_COMM_RESOURCE_OPERATION_COUNT = SO_COMMUNICATION_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl <em>So Transmitted Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoTransmittedData()
	 * @generated
	 */
	int SO_TRANSMITTED_DATA = 8;

	/**
	 * The feature id for the '<em><b>Source Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA__SOURCE_TASK = 0;

	/**
	 * The feature id for the '<em><b>Target Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA__TARGET_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA__NAME = 2;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA__DATA_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Rtp Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA__RTP_DATA_SIZE = 4;

	/**
	 * The number of structural features of the '<em>So Transmitted Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>So Transmitted Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SO_TRANSMITTED_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide <em>System Software Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Software Side</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide
	 * @generated
	 */
	EClass getSystemSoftwareSide();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSystemBehavior <em>System Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Behavior</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSystemBehavior()
	 * @see #getSystemSoftwareSide()
	 * @generated
	 */
	EReference getSystemSoftwareSide_SystemBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSpaceProcesses <em>Space Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Space Processes</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSpaceProcesses()
	 * @see #getSystemSoftwareSide()
	 * @generated
	 */
	EReference getSystemSoftwareSide_SpaceProcesses();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getInteractionResources <em>Interaction Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Resources</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getInteractionResources()
	 * @see #getSystemSoftwareSide()
	 * @generated
	 */
	EReference getSystemSoftwareSide_InteractionResources();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSchedulableTasks <em>Schedulable Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedulable Tasks</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSchedulableTasks()
	 * @see #getSystemSoftwareSide()
	 * @generated
	 */
	EReference getSystemSoftwareSide_SchedulableTasks();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getName()
	 * @see #getSystemSoftwareSide()
	 * @generated
	 */
	EAttribute getSystemSoftwareSide_Name();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask <em>So Schedulable Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Schedulable Task</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask
	 * @generated
	 */
	EClass getSoSchedulableTask();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getProcess()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_Process();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mutual Exclusion Resources</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResources()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_MutualExclusionResources();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommWritingResources <em>Comm Writing Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comm Writing Resources</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommWritingResources()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_CommWritingResources();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommReadingResources <em>Comm Reading Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comm Reading Resources</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommReadingResources()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_CommReadingResources();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getName()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EAttribute getSoSchedulableTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResourceUtilization <em>Mutual Exclusion Resource Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mutual Exclusion Resource Utilization</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResourceUtilization()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_MutualExclusionResourceUtilization();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getFavoriteProcessors <em>Favorite Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Favorite Processors</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getFavoriteProcessors()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_FavoriteProcessors();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRunOnProcessors <em>Run On Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Run On Processors</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRunOnProcessors()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_RunOnProcessors();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRepresentedActivity <em>Represented Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented Activity</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRepresentedActivity()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_RepresentedActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRtpMutualExclusionResourceUtilization <em>Rtp Mutual Exclusion Resource Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtp Mutual Exclusion Resource Utilization</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRtpMutualExclusionResourceUtilization()
	 * @see #getSoSchedulableTask()
	 * @generated
	 */
	EReference getSoSchedulableTask_RtpMutualExclusionResourceUtilization();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess <em>So Space Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Space Process</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess
	 * @generated
	 */
	EClass getSoSpaceProcess();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessParent <em>Space Process Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Space Process Parent</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessParent()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_SpaceProcessParent();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessChildren <em>Space Process Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Space Process Children</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessChildren()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_SpaceProcessChildren();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSchedulableTasks <em>Schedulable Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedulable Tasks</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSchedulableTasks()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_SchedulableTasks();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getName()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EAttribute getSoSpaceProcess_Name();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getProcessingUnit <em>Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Unit</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getProcessingUnit()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_ProcessingUnit();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpSchedulingPolicy <em>Rtp Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Scheduling Policy</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpSchedulingPolicy()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_RtpSchedulingPolicy();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getAllSpaceProcessParents <em>All Space Process Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Space Process Parents</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getAllSpaceProcessParents()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_AllSpaceProcessParents();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpTaskAllocation <em>Rtp Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Task Allocation</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpTaskAllocation()
	 * @see #getSoSpaceProcess()
	 * @generated
	 */
	EReference getSoSpaceProcess_RtpTaskAllocation();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource <em>So Interaction Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Interaction Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource
	 * @generated
	 */
	EClass getSoInteractionResource();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource <em>So Mutual Exclusion Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Mutual Exclusion Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource
	 * @generated
	 */
	EClass getSoMutualExclusionResource();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tasks</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getTasks()
	 * @see #getSoMutualExclusionResource()
	 * @generated
	 */
	EReference getSoMutualExclusionResource_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getName()
	 * @see #getSoMutualExclusionResource()
	 * @generated
	 */
	EAttribute getSoMutualExclusionResource_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Protect Protocol</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpProtectProtocol()
	 * @see #getSoMutualExclusionResource()
	 * @generated
	 */
	EReference getSoMutualExclusionResource_RtpProtectProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Waiting Queue Policy</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpWaitingQueuePolicy()
	 * @see #getSoMutualExclusionResource()
	 * @generated
	 */
	EReference getSoMutualExclusionResource_RtpWaitingQueuePolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource <em>So Communication Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Communication Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource
	 * @generated
	 */
	EClass getSoCommunicationResource();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getWriterTasks <em>Writer Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Writer Tasks</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getWriterTasks()
	 * @see #getSoCommunicationResource()
	 * @generated
	 */
	EReference getSoCommunicationResource_WriterTasks();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getReaderTasks <em>Reader Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reader Tasks</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getReaderTasks()
	 * @see #getSoCommunicationResource()
	 * @generated
	 */
	EReference getSoCommunicationResource_ReaderTasks();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource <em>So Remote Comm Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Remote Comm Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource
	 * @generated
	 */
	EClass getSoRemoteCommResource();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getName()
	 * @see #getSoRemoteCommResource()
	 * @generated
	 */
	EAttribute getSoRemoteCommResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getTransmittedData <em>Transmitted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmitted Data</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource#getTransmittedData()
	 * @see #getSoRemoteCommResource()
	 * @generated
	 */
	EReference getSoRemoteCommResource_TransmittedData();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource <em>So Local Comm Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Local Comm Resource</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource
	 * @generated
	 */
	EClass getSoLocalCommResource();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getName()
	 * @see #getSoLocalCommResource()
	 * @generated
	 */
	EAttribute getSoLocalCommResource_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpCommunicationMechanism <em>Rtp Communication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Communication Mechanism</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpCommunicationMechanism()
	 * @see #getSoLocalCommResource()
	 * @generated
	 */
	EReference getSoLocalCommResource_RtpCommunicationMechanism();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Waiting Queue Policy</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpWaitingQueuePolicy()
	 * @see #getSoLocalCommResource()
	 * @generated
	 */
	EReference getSoLocalCommResource_RtpWaitingQueuePolicy();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Protect Protocol</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpProtectProtocol()
	 * @see #getSoLocalCommResource()
	 * @generated
	 */
	EReference getSoLocalCommResource_RtpProtectProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData <em>So Transmitted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>So Transmitted Data</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData
	 * @generated
	 */
	EClass getSoTransmittedData();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getSourceTask <em>Source Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Task</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getSourceTask()
	 * @see #getSoTransmittedData()
	 * @generated
	 */
	EReference getSoTransmittedData_SourceTask();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getTargetTasks <em>Target Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Tasks</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getTargetTasks()
	 * @see #getSoTransmittedData()
	 * @generated
	 */
	EReference getSoTransmittedData_TargetTasks();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getName()
	 * @see #getSoTransmittedData()
	 * @generated
	 */
	EAttribute getSoTransmittedData_Name();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Size</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getDataSize()
	 * @see #getSoTransmittedData()
	 * @generated
	 */
	EReference getSoTransmittedData_DataSize();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getRtpDataSize <em>Rtp Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Data Size</em>'.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData#getRtpDataSize()
	 * @see #getSoTransmittedData()
	 * @generated
	 */
	EReference getSoTransmittedData_RtpDataSize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareOperatorsFactory getSoftwareOperatorsFactory();

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
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl <em>System Software Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SystemSoftwareSideImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSystemSoftwareSide()
		 * @generated
		 */
		EClass SYSTEM_SOFTWARE_SIDE = eINSTANCE.getSystemSoftwareSide();

		/**
		 * The meta object literal for the '<em><b>System Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR = eINSTANCE.getSystemSoftwareSide_SystemBehavior();

		/**
		 * The meta object literal for the '<em><b>Space Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES = eINSTANCE.getSystemSoftwareSide_SpaceProcesses();

		/**
		 * The meta object literal for the '<em><b>Interaction Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES = eINSTANCE.getSystemSoftwareSide_InteractionResources();

		/**
		 * The meta object literal for the '<em><b>Schedulable Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS = eINSTANCE.getSystemSoftwareSide_SchedulableTasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_SOFTWARE_SIDE__NAME = eINSTANCE.getSystemSoftwareSide_Name();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl <em>So Schedulable Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSchedulableTaskImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoSchedulableTask()
		 * @generated
		 */
		EClass SO_SCHEDULABLE_TASK = eINSTANCE.getSoSchedulableTask();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__PROCESS = eINSTANCE.getSoSchedulableTask_Process();

		/**
		 * The meta object literal for the '<em><b>Mutual Exclusion Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES = eINSTANCE.getSoSchedulableTask_MutualExclusionResources();

		/**
		 * The meta object literal for the '<em><b>Comm Writing Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES = eINSTANCE.getSoSchedulableTask_CommWritingResources();

		/**
		 * The meta object literal for the '<em><b>Comm Reading Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES = eINSTANCE.getSoSchedulableTask_CommReadingResources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SO_SCHEDULABLE_TASK__NAME = eINSTANCE.getSoSchedulableTask_Name();

		/**
		 * The meta object literal for the '<em><b>Mutual Exclusion Resource Utilization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION = eINSTANCE.getSoSchedulableTask_MutualExclusionResourceUtilization();

		/**
		 * The meta object literal for the '<em><b>Favorite Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS = eINSTANCE.getSoSchedulableTask_FavoriteProcessors();

		/**
		 * The meta object literal for the '<em><b>Run On Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS = eINSTANCE.getSoSchedulableTask_RunOnProcessors();

		/**
		 * The meta object literal for the '<em><b>Represented Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY = eINSTANCE.getSoSchedulableTask_RepresentedActivity();

		/**
		 * The meta object literal for the '<em><b>Rtp Mutual Exclusion Resource Utilization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION = eINSTANCE.getSoSchedulableTask_RtpMutualExclusionResourceUtilization();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl <em>So Space Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoSpaceProcessImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoSpaceProcess()
		 * @generated
		 */
		EClass SO_SPACE_PROCESS = eINSTANCE.getSoSpaceProcess();

		/**
		 * The meta object literal for the '<em><b>Space Process Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__SPACE_PROCESS_PARENT = eINSTANCE.getSoSpaceProcess_SpaceProcessParent();

		/**
		 * The meta object literal for the '<em><b>Space Process Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN = eINSTANCE.getSoSpaceProcess_SpaceProcessChildren();

		/**
		 * The meta object literal for the '<em><b>Schedulable Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__SCHEDULABLE_TASKS = eINSTANCE.getSoSpaceProcess_SchedulableTasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SO_SPACE_PROCESS__NAME = eINSTANCE.getSoSpaceProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Processing Unit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__PROCESSING_UNIT = eINSTANCE.getSoSpaceProcess_ProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Rtp Scheduling Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY = eINSTANCE.getSoSpaceProcess_RtpSchedulingPolicy();

		/**
		 * The meta object literal for the '<em><b>All Space Process Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS = eINSTANCE.getSoSpaceProcess_AllSpaceProcessParents();

		/**
		 * The meta object literal for the '<em><b>Rtp Task Allocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_SPACE_PROCESS__RTP_TASK_ALLOCATION = eINSTANCE.getSoSpaceProcess_RtpTaskAllocation();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource <em>So Interaction Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoInteractionResource()
		 * @generated
		 */
		EClass SO_INTERACTION_RESOURCE = eINSTANCE.getSoInteractionResource();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl <em>So Mutual Exclusion Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoMutualExclusionResourceImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoMutualExclusionResource()
		 * @generated
		 */
		EClass SO_MUTUAL_EXCLUSION_RESOURCE = eINSTANCE.getSoMutualExclusionResource();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_MUTUAL_EXCLUSION_RESOURCE__TASKS = eINSTANCE.getSoMutualExclusionResource_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SO_MUTUAL_EXCLUSION_RESOURCE__NAME = eINSTANCE.getSoMutualExclusionResource_Name();

		/**
		 * The meta object literal for the '<em><b>Rtp Protect Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL = eINSTANCE.getSoMutualExclusionResource_RtpProtectProtocol();

		/**
		 * The meta object literal for the '<em><b>Rtp Waiting Queue Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY = eINSTANCE.getSoMutualExclusionResource_RtpWaitingQueuePolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource <em>So Communication Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoCommunicationResource()
		 * @generated
		 */
		EClass SO_COMMUNICATION_RESOURCE = eINSTANCE.getSoCommunicationResource();

		/**
		 * The meta object literal for the '<em><b>Writer Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_COMMUNICATION_RESOURCE__WRITER_TASKS = eINSTANCE.getSoCommunicationResource_WriterTasks();

		/**
		 * The meta object literal for the '<em><b>Reader Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_COMMUNICATION_RESOURCE__READER_TASKS = eINSTANCE.getSoCommunicationResource_ReaderTasks();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl <em>So Remote Comm Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoRemoteCommResourceImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoRemoteCommResource()
		 * @generated
		 */
		EClass SO_REMOTE_COMM_RESOURCE = eINSTANCE.getSoRemoteCommResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SO_REMOTE_COMM_RESOURCE__NAME = eINSTANCE.getSoRemoteCommResource_Name();

		/**
		 * The meta object literal for the '<em><b>Transmitted Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA = eINSTANCE.getSoRemoteCommResource_TransmittedData();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoLocalCommResourceImpl <em>So Local Comm Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoLocalCommResourceImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoLocalCommResource()
		 * @generated
		 */
		EClass SO_LOCAL_COMM_RESOURCE = eINSTANCE.getSoLocalCommResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SO_LOCAL_COMM_RESOURCE__NAME = eINSTANCE.getSoLocalCommResource_Name();

		/**
		 * The meta object literal for the '<em><b>Rtp Communication Mechanism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM = eINSTANCE.getSoLocalCommResource_RtpCommunicationMechanism();

		/**
		 * The meta object literal for the '<em><b>Rtp Waiting Queue Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY = eINSTANCE.getSoLocalCommResource_RtpWaitingQueuePolicy();

		/**
		 * The meta object literal for the '<em><b>Rtp Protect Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL = eINSTANCE.getSoLocalCommResource_RtpProtectProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl <em>So Transmitted Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoTransmittedDataImpl
		 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl#getSoTransmittedData()
		 * @generated
		 */
		EClass SO_TRANSMITTED_DATA = eINSTANCE.getSoTransmittedData();

		/**
		 * The meta object literal for the '<em><b>Source Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_TRANSMITTED_DATA__SOURCE_TASK = eINSTANCE.getSoTransmittedData_SourceTask();

		/**
		 * The meta object literal for the '<em><b>Target Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_TRANSMITTED_DATA__TARGET_TASKS = eINSTANCE.getSoTransmittedData_TargetTasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SO_TRANSMITTED_DATA__NAME = eINSTANCE.getSoTransmittedData_Name();

		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_TRANSMITTED_DATA__DATA_SIZE = eINSTANCE.getSoTransmittedData_DataSize();

		/**
		 * The meta object literal for the '<em><b>Rtp Data Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SO_TRANSMITTED_DATA__RTP_DATA_SIZE = eINSTANCE.getSoTransmittedData_RtpDataSize();

	}

} //SoftwareOperatorsPackage
