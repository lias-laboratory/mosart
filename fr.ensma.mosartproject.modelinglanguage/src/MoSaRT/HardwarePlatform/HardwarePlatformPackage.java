/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

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
 * @see MoSaRT.HardwarePlatform.HardwarePlatformFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface HardwarePlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HardwarePlatform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/HardwarePlatform";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HardwarePlatformPackage eINSTANCE = MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl <em>System Hardware Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getSystemHardwareSide()
	 * @generated
	 */
	int SYSTEM_HARDWARE_SIDE = 0;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Comm Routers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE__COMM_ROUTERS = 1;

	/**
	 * The feature id for the '<em><b>Comm Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE__COMM_CHANNELS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Processor Interconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS = 4;

	/**
	 * The feature id for the '<em><b>Hpflowcarrier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER = 5;

	/**
	 * The number of structural features of the '<em>System Hardware Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>System Hardware Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_HARDWARE_SIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.HpNetworkNode <em>Hp Network Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.HpNetworkNode
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpNetworkNode()
	 * @generated
	 */
	int HP_NETWORK_NODE = 7;

	/**
	 * The number of structural features of the '<em>Hp Network Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hp Network Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl <em>Hp Processing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpProcessingUnit()
	 * @generated
	 */
	int HP_PROCESSING_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Comm Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__COMM_CHANNEL = HP_NETWORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__NAME = HP_NETWORK_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rtp Utilization Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR = HP_NETWORK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Space Processes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__SPACE_PROCESSES = HP_NETWORK_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Candidate Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__CANDIDATE_TASKS = HP_NETWORK_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Schedulable Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__SCHEDULABLE_TASKS = HP_NETWORK_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Utilization Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__UTILIZATION_FACTOR = HP_NETWORK_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Processor Interconnector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR = HP_NETWORK_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rtp Computing Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED = HP_NETWORK_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Hp Processing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT_FEATURE_COUNT = HP_NETWORK_NODE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Hp Processing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSING_UNIT_OPERATION_COUNT = HP_NETWORK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl <em>Hp Flow Carrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpFlowCarrier()
	 * @generated
	 */
	int HP_FLOW_CARRIER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER__NAME = HP_NETWORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hp Network Node Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS = HP_NETWORK_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Curve Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION = HP_NETWORK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Traffic Shaper Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION = HP_NETWORK_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Processing Unit Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN = HP_NETWORK_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rtp Communication Arbitration Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY = HP_NETWORK_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hp Flow Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER_FEATURE_COUNT = HP_NETWORK_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Hp Flow Carrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_FLOW_CARRIER_OPERATION_COUNT = HP_NETWORK_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.HpCommunicationRouterImpl <em>Hp Communication Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.HpCommunicationRouterImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpCommunicationRouter()
	 * @generated
	 */
	int HP_COMMUNICATION_ROUTER = 3;

	/**
	 * The feature id for the '<em><b>Network Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_ROUTER__NETWORK_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_ROUTER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Hp Communication Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_ROUTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hp Communication Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_ROUTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl <em>Hp Network Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpNetworkPort()
	 * @generated
	 */
	int HP_NETWORK_PORT = 4;

	/**
	 * The feature id for the '<em><b>Comm Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT__COMM_CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rtp Flow Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT__RTP_FLOW_RATE = 2;

	/**
	 * The feature id for the '<em><b>Flow Rate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT__FLOW_RATE = 3;

	/**
	 * The feature id for the '<em><b>Rtp Network Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL = 4;

	/**
	 * The feature id for the '<em><b>Rtp Transmission Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT__RTP_TRANSMISSION_MODE = 5;

	/**
	 * The number of structural features of the '<em>Hp Network Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hp Network Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_NETWORK_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl <em>Hp Communication Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpCommunicationChannel()
	 * @generated
	 */
	int HP_COMMUNICATION_CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Network Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL__NETWORK_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Processing Unit Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET = 3;

	/**
	 * The feature id for the '<em><b>Network Node Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET = 4;

	/**
	 * The number of structural features of the '<em>Hp Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hp Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_COMMUNICATION_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl <em>Hp Processor Interconnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl
	 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpProcessorInterconnector()
	 * @generated
	 */
	int HP_PROCESSOR_INTERCONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Processing Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS = HP_NETWORK_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comm Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL = HP_NETWORK_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSOR_INTERCONNECTOR__NAME = HP_NETWORK_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtp Multiprocessor Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY = HP_NETWORK_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hp Processor Interconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSOR_INTERCONNECTOR_FEATURE_COUNT = HP_NETWORK_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hp Processor Interconnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HP_PROCESSOR_INTERCONNECTOR_OPERATION_COUNT = HP_NETWORK_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.SystemHardwareSide <em>System Hardware Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Hardware Side</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide
	 * @generated
	 */
	EClass getSystemHardwareSide();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Units</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide#getProcessingUnits()
	 * @see #getSystemHardwareSide()
	 * @generated
	 */
	EReference getSystemHardwareSide_ProcessingUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getCommRouters <em>Comm Routers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm Routers</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide#getCommRouters()
	 * @see #getSystemHardwareSide()
	 * @generated
	 */
	EReference getSystemHardwareSide_CommRouters();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getCommChannels <em>Comm Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm Channels</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide#getCommChannels()
	 * @see #getSystemHardwareSide()
	 * @generated
	 */
	EReference getSystemHardwareSide_CommChannels();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide#getName()
	 * @see #getSystemHardwareSide()
	 * @generated
	 */
	EAttribute getSystemHardwareSide_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getProcessorInterconnectors <em>Processor Interconnectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor Interconnectors</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide#getProcessorInterconnectors()
	 * @see #getSystemHardwareSide()
	 * @generated
	 */
	EReference getSystemHardwareSide_ProcessorInterconnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getHpflowcarrier <em>Hpflowcarrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hpflowcarrier</em>'.
	 * @see MoSaRT.HardwarePlatform.SystemHardwareSide#getHpflowcarrier()
	 * @see #getSystemHardwareSide()
	 * @generated
	 */
	EReference getSystemHardwareSide_Hpflowcarrier();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpProcessingUnit <em>Hp Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Processing Unit</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit
	 * @generated
	 */
	EClass getHpProcessingUnit();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCommChannel <em>Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Channel</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getCommChannel()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_CommChannel();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getName()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EAttribute getHpProcessingUnit_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpUtilizationFactor <em>Rtp Utilization Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Utilization Factor</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpUtilizationFactor()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_RtpUtilizationFactor();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getSpaceProcesses <em>Space Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Space Processes</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getSpaceProcesses()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_SpaceProcesses();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCandidateTasks <em>Candidate Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Candidate Tasks</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getCandidateTasks()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_CandidateTasks();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getSchedulableTasks <em>Schedulable Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Schedulable Tasks</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getSchedulableTasks()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_SchedulableTasks();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getUtilizationFactor <em>Utilization Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utilization Factor</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getUtilizationFactor()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_UtilizationFactor();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnector <em>Processor Interconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor Interconnector</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnector()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_ProcessorInterconnector();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpComputingSpeed <em>Rtp Computing Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Computing Speed</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpComputingSpeed()
	 * @see #getHpProcessingUnit()
	 * @generated
	 */
	EReference getHpProcessingUnit_RtpComputingSpeed();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpFlowCarrier <em>Hp Flow Carrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Flow Carrier</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier
	 * @generated
	 */
	EClass getHpFlowCarrier();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier#getName()
	 * @see #getHpFlowCarrier()
	 * @generated
	 */
	EAttribute getHpFlowCarrier_Name();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getHpNetworkNodeTargets <em>Hp Network Node Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hp Network Node Targets</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier#getHpNetworkNodeTargets()
	 * @see #getHpFlowCarrier()
	 * @generated
	 */
	EReference getHpFlowCarrier_HpNetworkNodeTargets();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getServiceCurveFunction <em>Service Curve Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Curve Function</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier#getServiceCurveFunction()
	 * @see #getHpFlowCarrier()
	 * @generated
	 */
	EReference getHpFlowCarrier_ServiceCurveFunction();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getTrafficShaperFunction <em>Traffic Shaper Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Traffic Shaper Function</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier#getTrafficShaperFunction()
	 * @see #getHpFlowCarrier()
	 * @generated
	 */
	EReference getHpFlowCarrier_TrafficShaperFunction();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getProcessingUnitOrigin <em>Processing Unit Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing Unit Origin</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier#getProcessingUnitOrigin()
	 * @see #getHpFlowCarrier()
	 * @generated
	 */
	EReference getHpFlowCarrier_ProcessingUnitOrigin();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getRtpCommunicationArbitrationPolicy <em>Rtp Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Communication Arbitration Policy</em>'.
	 * @see MoSaRT.HardwarePlatform.HpFlowCarrier#getRtpCommunicationArbitrationPolicy()
	 * @see #getHpFlowCarrier()
	 * @generated
	 */
	EReference getHpFlowCarrier_RtpCommunicationArbitrationPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpCommunicationRouter <em>Hp Communication Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Communication Router</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationRouter
	 * @generated
	 */
	EClass getHpCommunicationRouter();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRT.HardwarePlatform.HpCommunicationRouter#getNetworkPorts <em>Network Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Ports</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationRouter#getNetworkPorts()
	 * @see #getHpCommunicationRouter()
	 * @generated
	 */
	EReference getHpCommunicationRouter_NetworkPorts();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.HpCommunicationRouter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationRouter#getName()
	 * @see #getHpCommunicationRouter()
	 * @generated
	 */
	EAttribute getHpCommunicationRouter_Name();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpNetworkPort <em>Hp Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Network Port</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort
	 * @generated
	 */
	EClass getHpNetworkPort();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getCommChannel <em>Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Channel</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getCommChannel()
	 * @see #getHpNetworkPort()
	 * @generated
	 */
	EReference getHpNetworkPort_CommChannel();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getName()
	 * @see #getHpNetworkPort()
	 * @generated
	 */
	EAttribute getHpNetworkPort_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpFlowRate <em>Rtp Flow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Flow Rate</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getRtpFlowRate()
	 * @see #getHpNetworkPort()
	 * @generated
	 */
	EReference getHpNetworkPort_RtpFlowRate();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getFlowRate <em>Flow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Rate</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getFlowRate()
	 * @see #getHpNetworkPort()
	 * @generated
	 */
	EReference getHpNetworkPort_FlowRate();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpNetworkProtocol <em>Rtp Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Network Protocol</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getRtpNetworkProtocol()
	 * @see #getHpNetworkPort()
	 * @generated
	 */
	EReference getHpNetworkPort_RtpNetworkProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getRtpTransmissionMode <em>Rtp Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Transmission Mode</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getRtpTransmissionMode()
	 * @see #getHpNetworkPort()
	 * @generated
	 */
	EReference getHpNetworkPort_RtpTransmissionMode();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel <em>Hp Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Communication Channel</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel
	 * @generated
	 */
	EClass getHpCommunicationChannel();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Units</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnits()
	 * @see #getHpCommunicationChannel()
	 * @generated
	 */
	EReference getHpCommunicationChannel_ProcessingUnits();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkPort <em>Network Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Port</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkPort()
	 * @see #getHpCommunicationChannel()
	 * @generated
	 */
	EReference getHpCommunicationChannel_NetworkPort();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getName()
	 * @see #getHpCommunicationChannel()
	 * @generated
	 */
	EAttribute getHpCommunicationChannel_Name();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnitSet <em>Processing Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Unit Set</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnitSet()
	 * @see #getHpCommunicationChannel()
	 * @generated
	 */
	EReference getHpCommunicationChannel_ProcessingUnitSet();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkNodeSet <em>Network Node Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Network Node Set</em>'.
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkNodeSet()
	 * @see #getHpCommunicationChannel()
	 * @generated
	 */
	EReference getHpCommunicationChannel_NetworkNodeSet();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector <em>Hp Processor Interconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Processor Interconnector</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector
	 * @generated
	 */
	EClass getHpProcessorInterconnector();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Units</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector#getProcessingUnits()
	 * @see #getHpProcessorInterconnector()
	 * @generated
	 */
	EReference getHpProcessorInterconnector_ProcessingUnits();

	/**
	 * Returns the meta object for the reference '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getCommChannel <em>Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Channel</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector#getCommChannel()
	 * @see #getHpProcessorInterconnector()
	 * @generated
	 */
	EReference getHpProcessorInterconnector_CommChannel();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector#getName()
	 * @see #getHpProcessorInterconnector()
	 * @generated
	 */
	EAttribute getHpProcessorInterconnector_Name();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getRtpMultiprocessorCategory <em>Rtp Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Multiprocessor Category</em>'.
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector#getRtpMultiprocessorCategory()
	 * @see #getHpProcessorInterconnector()
	 * @generated
	 */
	EReference getHpProcessorInterconnector_RtpMultiprocessorCategory();

	/**
	 * Returns the meta object for class '{@link MoSaRT.HardwarePlatform.HpNetworkNode <em>Hp Network Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hp Network Node</em>'.
	 * @see MoSaRT.HardwarePlatform.HpNetworkNode
	 * @generated
	 */
	EClass getHpNetworkNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HardwarePlatformFactory getHardwarePlatformFactory();

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
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl <em>System Hardware Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.SystemHardwareSideImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getSystemHardwareSide()
		 * @generated
		 */
		EClass SYSTEM_HARDWARE_SIDE = eINSTANCE.getSystemHardwareSide();

		/**
		 * The meta object literal for the '<em><b>Processing Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS = eINSTANCE.getSystemHardwareSide_ProcessingUnits();

		/**
		 * The meta object literal for the '<em><b>Comm Routers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HARDWARE_SIDE__COMM_ROUTERS = eINSTANCE.getSystemHardwareSide_CommRouters();

		/**
		 * The meta object literal for the '<em><b>Comm Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HARDWARE_SIDE__COMM_CHANNELS = eINSTANCE.getSystemHardwareSide_CommChannels();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_HARDWARE_SIDE__NAME = eINSTANCE.getSystemHardwareSide_Name();

		/**
		 * The meta object literal for the '<em><b>Processor Interconnectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS = eINSTANCE.getSystemHardwareSide_ProcessorInterconnectors();

		/**
		 * The meta object literal for the '<em><b>Hpflowcarrier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER = eINSTANCE.getSystemHardwareSide_Hpflowcarrier();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl <em>Hp Processing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.HpProcessingUnitImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpProcessingUnit()
		 * @generated
		 */
		EClass HP_PROCESSING_UNIT = eINSTANCE.getHpProcessingUnit();

		/**
		 * The meta object literal for the '<em><b>Comm Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__COMM_CHANNEL = eINSTANCE.getHpProcessingUnit_CommChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HP_PROCESSING_UNIT__NAME = eINSTANCE.getHpProcessingUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Rtp Utilization Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR = eINSTANCE.getHpProcessingUnit_RtpUtilizationFactor();

		/**
		 * The meta object literal for the '<em><b>Space Processes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__SPACE_PROCESSES = eINSTANCE.getHpProcessingUnit_SpaceProcesses();

		/**
		 * The meta object literal for the '<em><b>Candidate Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__CANDIDATE_TASKS = eINSTANCE.getHpProcessingUnit_CandidateTasks();

		/**
		 * The meta object literal for the '<em><b>Schedulable Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__SCHEDULABLE_TASKS = eINSTANCE.getHpProcessingUnit_SchedulableTasks();

		/**
		 * The meta object literal for the '<em><b>Utilization Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__UTILIZATION_FACTOR = eINSTANCE.getHpProcessingUnit_UtilizationFactor();

		/**
		 * The meta object literal for the '<em><b>Processor Interconnector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR = eINSTANCE.getHpProcessingUnit_ProcessorInterconnector();

		/**
		 * The meta object literal for the '<em><b>Rtp Computing Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED = eINSTANCE.getHpProcessingUnit_RtpComputingSpeed();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl <em>Hp Flow Carrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.HpFlowCarrierImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpFlowCarrier()
		 * @generated
		 */
		EClass HP_FLOW_CARRIER = eINSTANCE.getHpFlowCarrier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HP_FLOW_CARRIER__NAME = eINSTANCE.getHpFlowCarrier_Name();

		/**
		 * The meta object literal for the '<em><b>Hp Network Node Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS = eINSTANCE.getHpFlowCarrier_HpNetworkNodeTargets();

		/**
		 * The meta object literal for the '<em><b>Service Curve Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION = eINSTANCE.getHpFlowCarrier_ServiceCurveFunction();

		/**
		 * The meta object literal for the '<em><b>Traffic Shaper Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION = eINSTANCE.getHpFlowCarrier_TrafficShaperFunction();

		/**
		 * The meta object literal for the '<em><b>Processing Unit Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN = eINSTANCE.getHpFlowCarrier_ProcessingUnitOrigin();

		/**
		 * The meta object literal for the '<em><b>Rtp Communication Arbitration Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY = eINSTANCE.getHpFlowCarrier_RtpCommunicationArbitrationPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.HpCommunicationRouterImpl <em>Hp Communication Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.HpCommunicationRouterImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpCommunicationRouter()
		 * @generated
		 */
		EClass HP_COMMUNICATION_ROUTER = eINSTANCE.getHpCommunicationRouter();

		/**
		 * The meta object literal for the '<em><b>Network Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_COMMUNICATION_ROUTER__NETWORK_PORTS = eINSTANCE.getHpCommunicationRouter_NetworkPorts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HP_COMMUNICATION_ROUTER__NAME = eINSTANCE.getHpCommunicationRouter_Name();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl <em>Hp Network Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.HpNetworkPortImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpNetworkPort()
		 * @generated
		 */
		EClass HP_NETWORK_PORT = eINSTANCE.getHpNetworkPort();

		/**
		 * The meta object literal for the '<em><b>Comm Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_NETWORK_PORT__COMM_CHANNEL = eINSTANCE.getHpNetworkPort_CommChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HP_NETWORK_PORT__NAME = eINSTANCE.getHpNetworkPort_Name();

		/**
		 * The meta object literal for the '<em><b>Rtp Flow Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_NETWORK_PORT__RTP_FLOW_RATE = eINSTANCE.getHpNetworkPort_RtpFlowRate();

		/**
		 * The meta object literal for the '<em><b>Flow Rate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_NETWORK_PORT__FLOW_RATE = eINSTANCE.getHpNetworkPort_FlowRate();

		/**
		 * The meta object literal for the '<em><b>Rtp Network Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL = eINSTANCE.getHpNetworkPort_RtpNetworkProtocol();

		/**
		 * The meta object literal for the '<em><b>Rtp Transmission Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_NETWORK_PORT__RTP_TRANSMISSION_MODE = eINSTANCE.getHpNetworkPort_RtpTransmissionMode();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl <em>Hp Communication Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpCommunicationChannel()
		 * @generated
		 */
		EClass HP_COMMUNICATION_CHANNEL = eINSTANCE.getHpCommunicationChannel();

		/**
		 * The meta object literal for the '<em><b>Processing Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS = eINSTANCE.getHpCommunicationChannel_ProcessingUnits();

		/**
		 * The meta object literal for the '<em><b>Network Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_COMMUNICATION_CHANNEL__NETWORK_PORT = eINSTANCE.getHpCommunicationChannel_NetworkPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HP_COMMUNICATION_CHANNEL__NAME = eINSTANCE.getHpCommunicationChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Processing Unit Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET = eINSTANCE.getHpCommunicationChannel_ProcessingUnitSet();

		/**
		 * The meta object literal for the '<em><b>Network Node Set</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET = eINSTANCE.getHpCommunicationChannel_NetworkNodeSet();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl <em>Hp Processor Interconnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpProcessorInterconnector()
		 * @generated
		 */
		EClass HP_PROCESSOR_INTERCONNECTOR = eINSTANCE.getHpProcessorInterconnector();

		/**
		 * The meta object literal for the '<em><b>Processing Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS = eINSTANCE.getHpProcessorInterconnector_ProcessingUnits();

		/**
		 * The meta object literal for the '<em><b>Comm Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL = eINSTANCE.getHpProcessorInterconnector_CommChannel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HP_PROCESSOR_INTERCONNECTOR__NAME = eINSTANCE.getHpProcessorInterconnector_Name();

		/**
		 * The meta object literal for the '<em><b>Rtp Multiprocessor Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY = eINSTANCE.getHpProcessorInterconnector_RtpMultiprocessorCategory();

		/**
		 * The meta object literal for the '{@link MoSaRT.HardwarePlatform.HpNetworkNode <em>Hp Network Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.HardwarePlatform.HpNetworkNode
		 * @see MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl#getHpNetworkNode()
		 * @generated
		 */
		EClass HP_NETWORK_NODE = eINSTANCE.getHpNetworkNode();

	}

} //HardwarePlatformPackage
