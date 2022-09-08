/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies;

import MoSaRT.RealTimeProperties.RealTimePropertiesPackage;

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
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RtpProtocolsAndPoliciesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RtpProtocolsAndPolicies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRT/RealTimeProperties/RtpProtocolsAndPolicies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RtpPAP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RtpProtocolsAndPoliciesPackage eINSTANCE = MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType <em>Rtp Protect Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpProtectProtocolType()
	 * @generated
	 */
	int RTP_PROTECT_PROTOCOL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PROTECT_PROTOCOL_TYPE__PROTOCOL_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Protect Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PROTECT_PROTOCOL_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Protect Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_PROTECT_PROTOCOL_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PIPProtectProtocolImpl <em>PIP Protect Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PIPProtectProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPIPProtectProtocol()
	 * @generated
	 */
	int PIP_PROTECT_PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_PROTECT_PROTOCOL__PROTOCOL_TYPE = RTP_PROTECT_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>PIP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_PROTECT_PROTOCOL_FEATURE_COUNT = RTP_PROTECT_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PIP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIP_PROTECT_PROTOCOL_OPERATION_COUNT = RTP_PROTECT_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol <em>PCP Protect Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPCPProtectProtocol()
	 * @generated
	 */
	int PCP_PROTECT_PROTOCOL = 2;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCP_PROTECT_PROTOCOL__PROTOCOL_TYPE = RTP_PROTECT_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>PCP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCP_PROTECT_PROTOCOL_FEATURE_COUNT = RTP_PROTECT_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCP_PROTECT_PROTOCOL_OPERATION_COUNT = RTP_PROTECT_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType <em>Rtp Communication Arbitration Policy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpCommunicationArbitrationPolicyType()
	 * @generated
	 */
	int RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE__POLICY_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Communication Arbitration Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Communication Arbitration Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOCommunicationArbitrationPolicyImpl <em>FIFO Communication Arbitration Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOCommunicationArbitrationPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFIFOCommunicationArbitrationPolicy()
	 * @generated
	 */
	int FIFO_COMMUNICATION_ARBITRATION_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION_ARBITRATION_POLICY__POLICY_TYPE = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>FIFO Communication Arbitration Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION_ARBITRATION_POLICY_FEATURE_COUNT = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FIFO Communication Arbitration Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION_ARBITRATION_POLICY_OPERATION_COUNT = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPriorityCommunicationArbitrationPolicyImpl <em>Fixed Priority Communication Arbitration Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPriorityCommunicationArbitrationPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFixedPriorityCommunicationArbitrationPolicy()
	 * @generated
	 */
	int FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY = 5;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY__POLICY_TYPE = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Fixed Priority Communication Arbitration Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY_FEATURE_COUNT = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixed Priority Communication Arbitration Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY_OPERATION_COUNT = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOCommunicationArbitrationPolicyImpl <em>LIFO Communication Arbitration Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOCommunicationArbitrationPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getLIFOCommunicationArbitrationPolicy()
	 * @generated
	 */
	int LIFO_COMMUNICATION_ARBITRATION_POLICY = 6;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFO_COMMUNICATION_ARBITRATION_POLICY__POLICY_TYPE = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>LIFO Communication Arbitration Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFO_COMMUNICATION_ARBITRATION_POLICY_FEATURE_COUNT = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LIFO Communication Arbitration Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFO_COMMUNICATION_ARBITRATION_POLICY_OPERATION_COUNT = RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType <em>Rtp Waiting Queue Policy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpWaitingQueuePolicyType()
	 * @generated
	 */
	int RTP_WAITING_QUEUE_POLICY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_WAITING_QUEUE_POLICY_TYPE__POLICY_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Waiting Queue Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_WAITING_QUEUE_POLICY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Waiting Queue Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_WAITING_QUEUE_POLICY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOWaitingQueuePolicyImpl <em>FIFO Waiting Queue Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOWaitingQueuePolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFIFOWaitingQueuePolicy()
	 * @generated
	 */
	int FIFO_WAITING_QUEUE_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_WAITING_QUEUE_POLICY__POLICY_TYPE = RTP_WAITING_QUEUE_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>FIFO Waiting Queue Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_WAITING_QUEUE_POLICY_FEATURE_COUNT = RTP_WAITING_QUEUE_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FIFO Waiting Queue Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_WAITING_QUEUE_POLICY_OPERATION_COUNT = RTP_WAITING_QUEUE_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOWaitingQueuePolicyImpl <em>LIFO Waiting Queue Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOWaitingQueuePolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getLIFOWaitingQueuePolicy()
	 * @generated
	 */
	int LIFO_WAITING_QUEUE_POLICY = 9;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFO_WAITING_QUEUE_POLICY__POLICY_TYPE = RTP_WAITING_QUEUE_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>LIFO Waiting Queue Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFO_WAITING_QUEUE_POLICY_FEATURE_COUNT = RTP_WAITING_QUEUE_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LIFO Waiting Queue Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFO_WAITING_QUEUE_POLICY_OPERATION_COUNT = RTP_WAITING_QUEUE_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PriorityWaitingQueuePolicyImpl <em>Priority Waiting Queue Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PriorityWaitingQueuePolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPriorityWaitingQueuePolicy()
	 * @generated
	 */
	int PRIORITY_WAITING_QUEUE_POLICY = 10;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_WAITING_QUEUE_POLICY__POLICY_TYPE = RTP_WAITING_QUEUE_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Priority Waiting Queue Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_WAITING_QUEUE_POLICY_FEATURE_COUNT = RTP_WAITING_QUEUE_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Priority Waiting Queue Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_WAITING_QUEUE_POLICY_OPERATION_COUNT = RTP_WAITING_QUEUE_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType <em>Rtp Network Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpNetworkProtocolType()
	 * @generated
	 */
	int RTP_NETWORK_PROTOCOL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Network Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NETWORK_PROTOCOL_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Network Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_NETWORK_PROTOCOL_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.CANNetworkProtocolImpl <em>CAN Network Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.CANNetworkProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getCANNetworkProtocol()
	 * @generated
	 */
	int CAN_NETWORK_PROTOCOL = 12;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_NETWORK_PROTOCOL__PROTOCOL_TYPE = RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>CAN Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_NETWORK_PROTOCOL_FEATURE_COUNT = RTP_NETWORK_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CAN Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAN_NETWORK_PROTOCOL_OPERATION_COUNT = RTP_NETWORK_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.AFDXNetworkProtocolImpl <em>AFDX Network Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.AFDXNetworkProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getAFDXNetworkProtocol()
	 * @generated
	 */
	int AFDX_NETWORK_PROTOCOL = 13;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_NETWORK_PROTOCOL__PROTOCOL_TYPE = RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>AFDX Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_NETWORK_PROTOCOL_FEATURE_COUNT = RTP_NETWORK_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AFDX Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFDX_NETWORK_PROTOCOL_OPERATION_COUNT = RTP_NETWORK_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ATMNetworkProtocolImpl <em>ATM Network Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ATMNetworkProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getATMNetworkProtocol()
	 * @generated
	 */
	int ATM_NETWORK_PROTOCOL = 14;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_NETWORK_PROTOCOL__PROTOCOL_TYPE = RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>ATM Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_NETWORK_PROTOCOL_FEATURE_COUNT = RTP_NETWORK_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ATM Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_NETWORK_PROTOCOL_OPERATION_COUNT = RTP_NETWORK_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIPNetworkProtocolImpl <em>FIP Network Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIPNetworkProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFIPNetworkProtocol()
	 * @generated
	 */
	int FIP_NETWORK_PROTOCOL = 15;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIP_NETWORK_PROTOCOL__PROTOCOL_TYPE = RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>FIP Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIP_NETWORK_PROTOCOL_FEATURE_COUNT = RTP_NETWORK_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FIP Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIP_NETWORK_PROTOCOL_OPERATION_COUNT = RTP_NETWORK_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FDDINetworkProtocolImpl <em>FDDI Network Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FDDINetworkProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFDDINetworkProtocol()
	 * @generated
	 */
	int FDDI_NETWORK_PROTOCOL = 16;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDDI_NETWORK_PROTOCOL__PROTOCOL_TYPE = RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>FDDI Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDDI_NETWORK_PROTOCOL_FEATURE_COUNT = RTP_NETWORK_PROTOCOL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FDDI Network Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDDI_NETWORK_PROTOCOL_OPERATION_COUNT = RTP_NETWORK_PROTOCOL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType <em>Rtp Scheduling Policy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpSchedulingPolicyType()
	 * @generated
	 */
	int RTP_SCHEDULING_POLICY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Scheduling Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SCHEDULING_POLICY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Scheduling Policy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_SCHEDULING_POLICY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPrioritySchedulingPolicyImpl <em>Fixed Priority Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPrioritySchedulingPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFixedPrioritySchedulingPolicy()
	 * @generated
	 */
	int FIXED_PRIORITY_SCHEDULING_POLICY = 18;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULING_POLICY__POLICY_TYPE = RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Fixed Priority Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULING_POLICY_FEATURE_COUNT = RTP_SCHEDULING_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fixed Priority Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_PRIORITY_SCHEDULING_POLICY_OPERATION_COUNT = RTP_SCHEDULING_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LeastLaxityFirstSchedulingPolicyImpl <em>Least Laxity First Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LeastLaxityFirstSchedulingPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getLeastLaxityFirstSchedulingPolicy()
	 * @generated
	 */
	int LEAST_LAXITY_FIRST_SCHEDULING_POLICY = 19;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_LAXITY_FIRST_SCHEDULING_POLICY__POLICY_TYPE = RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Least Laxity First Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_LAXITY_FIRST_SCHEDULING_POLICY_FEATURE_COUNT = RTP_SCHEDULING_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Least Laxity First Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAST_LAXITY_FIRST_SCHEDULING_POLICY_OPERATION_COUNT = RTP_SCHEDULING_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RoundRobinSchedulingPolicyImpl <em>Round Robin Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RoundRobinSchedulingPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRoundRobinSchedulingPolicy()
	 * @generated
	 */
	int ROUND_ROBIN_SCHEDULING_POLICY = 20;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_SCHEDULING_POLICY__POLICY_TYPE = RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Round Robin Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_SCHEDULING_POLICY_FEATURE_COUNT = RTP_SCHEDULING_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Round Robin Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_ROBIN_SCHEDULING_POLICY_OPERATION_COUNT = RTP_SCHEDULING_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.EarliestDeadlineFirstSchedulingPolicyImpl <em>Earliest Deadline First Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.EarliestDeadlineFirstSchedulingPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getEarliestDeadlineFirstSchedulingPolicy()
	 * @generated
	 */
	int EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY = 21;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY__POLICY_TYPE = RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Earliest Deadline First Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY_FEATURE_COUNT = RTP_SCHEDULING_POLICY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Earliest Deadline First Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY_OPERATION_COUNT = RTP_SCHEDULING_POLICY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType <em>Rtp Communication Mechanism Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpCommunicationMechanismType()
	 * @generated
	 */
	int RTP_COMMUNICATION_MECHANISM_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Rtp Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mechanism Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_MECHANISM_TYPE__MECHANISM_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rtp Communication Mechanism Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_MECHANISM_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rtp Communication Mechanism Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_COMMUNICATION_MECHANISM_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PipeCommunicationMechanismImpl <em>Pipe Communication Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PipeCommunicationMechanismImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPipeCommunicationMechanism()
	 * @generated
	 */
	int PIPE_COMMUNICATION_MECHANISM = 23;

	/**
	 * The feature id for the '<em><b>Rtp Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE = RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Mechanism Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_COMMUNICATION_MECHANISM__MECHANISM_TYPE = RTP_COMMUNICATION_MECHANISM_TYPE__MECHANISM_TYPE;

	/**
	 * The number of structural features of the '<em>Pipe Communication Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_COMMUNICATION_MECHANISM_FEATURE_COUNT = RTP_COMMUNICATION_MECHANISM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pipe Communication Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_COMMUNICATION_MECHANISM_OPERATION_COUNT = RTP_COMMUNICATION_MECHANISM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl <em>Data Queue Communication Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getDataQueueCommunicationMechanism()
	 * @generated
	 */
	int DATA_QUEUE_COMMUNICATION_MECHANISM = 24;

	/**
	 * The feature id for the '<em><b>Rtp Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_COMMUNICATION_MECHANISM__RTP_DATA_SIZE = RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE;

	/**
	 * The feature id for the '<em><b>Mechanism Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_COMMUNICATION_MECHANISM__MECHANISM_TYPE = RTP_COMMUNICATION_MECHANISM_TYPE__MECHANISM_TYPE;

	/**
	 * The feature id for the '<em><b>Overwriting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING = RTP_COMMUNICATION_MECHANISM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Queue Communication Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_COMMUNICATION_MECHANISM_FEATURE_COUNT = RTP_COMMUNICATION_MECHANISM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Queue Communication Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_QUEUE_COMMUNICATION_MECHANISM_OPERATION_COUNT = RTP_COMMUNICATION_MECHANISM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType <em>Rtp Transmission Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpTransmissionModeType()
	 * @generated
	 */
	int RTP_TRANSMISSION_MODE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mode Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TRANSMISSION_MODE_TYPE__MODE_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Transmission Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TRANSMISSION_MODE_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Transmission Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TRANSMISSION_MODE_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullDuplexTransmissionModeImpl <em>Full Duplex Transmission Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullDuplexTransmissionModeImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFullDuplexTransmissionMode()
	 * @generated
	 */
	int FULL_DUPLEX_TRANSMISSION_MODE = 26;

	/**
	 * The feature id for the '<em><b>Mode Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_DUPLEX_TRANSMISSION_MODE__MODE_TYPE = RTP_TRANSMISSION_MODE_TYPE__MODE_TYPE;

	/**
	 * The number of structural features of the '<em>Full Duplex Transmission Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_DUPLEX_TRANSMISSION_MODE_FEATURE_COUNT = RTP_TRANSMISSION_MODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Full Duplex Transmission Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_DUPLEX_TRANSMISSION_MODE_OPERATION_COUNT = RTP_TRANSMISSION_MODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HalfDuplexTransmissionModeImpl <em>Half Duplex Transmission Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HalfDuplexTransmissionModeImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getHalfDuplexTransmissionMode()
	 * @generated
	 */
	int HALF_DUPLEX_TRANSMISSION_MODE = 27;

	/**
	 * The feature id for the '<em><b>Mode Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_DUPLEX_TRANSMISSION_MODE__MODE_TYPE = RTP_TRANSMISSION_MODE_TYPE__MODE_TYPE;

	/**
	 * The number of structural features of the '<em>Half Duplex Transmission Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_DUPLEX_TRANSMISSION_MODE_FEATURE_COUNT = RTP_TRANSMISSION_MODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Half Duplex Transmission Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_DUPLEX_TRANSMISSION_MODE_OPERATION_COUNT = RTP_TRANSMISSION_MODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.SimpleTransmissionModeImpl <em>Simple Transmission Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.SimpleTransmissionModeImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getSimpleTransmissionMode()
	 * @generated
	 */
	int SIMPLE_TRANSMISSION_MODE = 28;

	/**
	 * The feature id for the '<em><b>Mode Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRANSMISSION_MODE__MODE_TYPE = RTP_TRANSMISSION_MODE_TYPE__MODE_TYPE;

	/**
	 * The number of structural features of the '<em>Simple Transmission Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRANSMISSION_MODE_FEATURE_COUNT = RTP_TRANSMISSION_MODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Transmission Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TRANSMISSION_MODE_OPERATION_COUNT = RTP_TRANSMISSION_MODE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ICPPProtectProtocolImpl <em>ICPP Protect Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ICPPProtectProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getICPPProtectProtocol()
	 * @generated
	 */
	int ICPP_PROTECT_PROTOCOL = 29;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICPP_PROTECT_PROTOCOL__PROTOCOL_TYPE = PCP_PROTECT_PROTOCOL__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>ICPP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICPP_PROTECT_PROTOCOL_FEATURE_COUNT = PCP_PROTECT_PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ICPP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICPP_PROTECT_PROTOCOL_OPERATION_COUNT = PCP_PROTECT_PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.OCPPProtectProtocolImpl <em>OCPP Protect Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.OCPPProtectProtocolImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getOCPPProtectProtocol()
	 * @generated
	 */
	int OCPP_PROTECT_PROTOCOL = 30;

	/**
	 * The feature id for the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCPP_PROTECT_PROTOCOL__PROTOCOL_TYPE = PCP_PROTECT_PROTOCOL__PROTOCOL_TYPE;

	/**
	 * The number of structural features of the '<em>OCPP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCPP_PROTECT_PROTOCOL_FEATURE_COUNT = PCP_PROTECT_PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OCPP Protect Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCPP_PROTECT_PROTOCOL_OPERATION_COUNT = PCP_PROTECT_PROTOCOL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DeadlineMonotonicSchedulingPolicyImpl <em>Deadline Monotonic Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DeadlineMonotonicSchedulingPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getDeadlineMonotonicSchedulingPolicy()
	 * @generated
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY = 31;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY__POLICY_TYPE = FIXED_PRIORITY_SCHEDULING_POLICY__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Deadline Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY_FEATURE_COUNT = FIXED_PRIORITY_SCHEDULING_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deadline Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_MONOTONIC_SCHEDULING_POLICY_OPERATION_COUNT = FIXED_PRIORITY_SCHEDULING_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RateMonotonicSchedulingPolicyImpl <em>Rate Monotonic Scheduling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RateMonotonicSchedulingPolicyImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRateMonotonicSchedulingPolicy()
	 * @generated
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY = 32;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY__POLICY_TYPE = FIXED_PRIORITY_SCHEDULING_POLICY__POLICY_TYPE;

	/**
	 * The number of structural features of the '<em>Rate Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY_FEATURE_COUNT = FIXED_PRIORITY_SCHEDULING_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rate Monotonic Scheduling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_MONOTONIC_SCHEDULING_POLICY_OPERATION_COUNT = FIXED_PRIORITY_SCHEDULING_POLICY_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType <em>Rtp Task Allocation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpTaskAllocationType()
	 * @generated
	 */
	int RTP_TASK_ALLOCATION_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Allocation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TASK_ALLOCATION_TYPE__ALLOCATION_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Task Allocation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TASK_ALLOCATION_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Task Allocation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_TASK_ALLOCATION_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PartitionedTaskAllocationImpl <em>Partitioned Task Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PartitionedTaskAllocationImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPartitionedTaskAllocation()
	 * @generated
	 */
	int PARTITIONED_TASK_ALLOCATION = 34;

	/**
	 * The feature id for the '<em><b>Allocation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIONED_TASK_ALLOCATION__ALLOCATION_TYPE = RTP_TASK_ALLOCATION_TYPE__ALLOCATION_TYPE;

	/**
	 * The number of structural features of the '<em>Partitioned Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIONED_TASK_ALLOCATION_FEATURE_COUNT = RTP_TASK_ALLOCATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partitioned Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTITIONED_TASK_ALLOCATION_OPERATION_COUNT = RTP_TASK_ALLOCATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullMigrationTaskAllocationImpl <em>Full Migration Task Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullMigrationTaskAllocationImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFullMigrationTaskAllocation()
	 * @generated
	 */
	int FULL_MIGRATION_TASK_ALLOCATION = 35;

	/**
	 * The feature id for the '<em><b>Allocation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_MIGRATION_TASK_ALLOCATION__ALLOCATION_TYPE = RTP_TASK_ALLOCATION_TYPE__ALLOCATION_TYPE;

	/**
	 * The number of structural features of the '<em>Full Migration Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_MIGRATION_TASK_ALLOCATION_FEATURE_COUNT = RTP_TASK_ALLOCATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Full Migration Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FULL_MIGRATION_TASK_ALLOCATION_OPERATION_COUNT = RTP_TASK_ALLOCATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RestrictedMigrationTaskAllocationImpl <em>Restricted Migration Task Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RestrictedMigrationTaskAllocationImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRestrictedMigrationTaskAllocation()
	 * @generated
	 */
	int RESTRICTED_MIGRATION_TASK_ALLOCATION = 36;

	/**
	 * The feature id for the '<em><b>Allocation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_MIGRATION_TASK_ALLOCATION__ALLOCATION_TYPE = RTP_TASK_ALLOCATION_TYPE__ALLOCATION_TYPE;

	/**
	 * The number of structural features of the '<em>Restricted Migration Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_MIGRATION_TASK_ALLOCATION_FEATURE_COUNT = RTP_TASK_ALLOCATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restricted Migration Task Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTRICTED_MIGRATION_TASK_ALLOCATION_OPERATION_COUNT = RTP_TASK_ALLOCATION_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType <em>Rtp Multiprocessor Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpMultiprocessorCategoryType()
	 * @generated
	 */
	int RTP_MULTIPROCESSOR_CATEGORY_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MULTIPROCESSOR_CATEGORY_TYPE__CATEGORY_TYPE = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rtp Multiprocessor Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MULTIPROCESSOR_CATEGORY_TYPE_FEATURE_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rtp Multiprocessor Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTP_MULTIPROCESSOR_CATEGORY_TYPE_OPERATION_COUNT = RealTimePropertiesPackage.REAL_TIME_COMMON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HeterogenousMultiprocessorCategoryImpl <em>Heterogenous Multiprocessor Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HeterogenousMultiprocessorCategoryImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getHeterogenousMultiprocessorCategory()
	 * @generated
	 */
	int HETEROGENOUS_MULTIPROCESSOR_CATEGORY = 38;

	/**
	 * The feature id for the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HETEROGENOUS_MULTIPROCESSOR_CATEGORY__CATEGORY_TYPE = RTP_MULTIPROCESSOR_CATEGORY_TYPE__CATEGORY_TYPE;

	/**
	 * The number of structural features of the '<em>Heterogenous Multiprocessor Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HETEROGENOUS_MULTIPROCESSOR_CATEGORY_FEATURE_COUNT = RTP_MULTIPROCESSOR_CATEGORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heterogenous Multiprocessor Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HETEROGENOUS_MULTIPROCESSOR_CATEGORY_OPERATION_COUNT = RTP_MULTIPROCESSOR_CATEGORY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HomogeneousMultiprocessorCategoryImpl <em>Homogeneous Multiprocessor Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HomogeneousMultiprocessorCategoryImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getHomogeneousMultiprocessorCategory()
	 * @generated
	 */
	int HOMOGENEOUS_MULTIPROCESSOR_CATEGORY = 39;

	/**
	 * The feature id for the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMOGENEOUS_MULTIPROCESSOR_CATEGORY__CATEGORY_TYPE = RTP_MULTIPROCESSOR_CATEGORY_TYPE__CATEGORY_TYPE;

	/**
	 * The number of structural features of the '<em>Homogeneous Multiprocessor Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMOGENEOUS_MULTIPROCESSOR_CATEGORY_FEATURE_COUNT = RTP_MULTIPROCESSOR_CATEGORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Homogeneous Multiprocessor Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOMOGENEOUS_MULTIPROCESSOR_CATEGORY_OPERATION_COUNT = RTP_MULTIPROCESSOR_CATEGORY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.UniformMultiprocessorCategoryImpl <em>Uniform Multiprocessor Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.UniformMultiprocessorCategoryImpl
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getUniformMultiprocessorCategory()
	 * @generated
	 */
	int UNIFORM_MULTIPROCESSOR_CATEGORY = 40;

	/**
	 * The feature id for the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_MULTIPROCESSOR_CATEGORY__CATEGORY_TYPE = RTP_MULTIPROCESSOR_CATEGORY_TYPE__CATEGORY_TYPE;

	/**
	 * The number of structural features of the '<em>Uniform Multiprocessor Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_MULTIPROCESSOR_CATEGORY_FEATURE_COUNT = RTP_MULTIPROCESSOR_CATEGORY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Uniform Multiprocessor Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_MULTIPROCESSOR_CATEGORY_OPERATION_COUNT = RTP_MULTIPROCESSOR_CATEGORY_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType <em>Rtp Protect Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Protect Protocol Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType
	 * @generated
	 */
	EClass getRtpProtectProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType#getProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType#getProtocolType()
	 * @see #getRtpProtectProtocolType()
	 * @generated
	 */
	EAttribute getRtpProtectProtocolType_ProtocolType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol <em>PIP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIP Protect Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol
	 * @generated
	 */
	EClass getPIPProtectProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol <em>PCP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCP Protect Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol
	 * @generated
	 */
	EClass getPCPProtectProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType <em>Rtp Communication Arbitration Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Communication Arbitration Policy Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType
	 * @generated
	 */
	EClass getRtpCommunicationArbitrationPolicyType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType#getPolicyType()
	 * @see #getRtpCommunicationArbitrationPolicyType()
	 * @generated
	 */
	EAttribute getRtpCommunicationArbitrationPolicyType_PolicyType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy <em>FIFO Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FIFO Communication Arbitration Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy
	 * @generated
	 */
	EClass getFIFOCommunicationArbitrationPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy <em>Fixed Priority Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Priority Communication Arbitration Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy
	 * @generated
	 */
	EClass getFixedPriorityCommunicationArbitrationPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy <em>LIFO Communication Arbitration Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIFO Communication Arbitration Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy
	 * @generated
	 */
	EClass getLIFOCommunicationArbitrationPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType <em>Rtp Waiting Queue Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Waiting Queue Policy Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType
	 * @generated
	 */
	EClass getRtpWaitingQueuePolicyType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType#getPolicyType()
	 * @see #getRtpWaitingQueuePolicyType()
	 * @generated
	 */
	EAttribute getRtpWaitingQueuePolicyType_PolicyType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy <em>FIFO Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FIFO Waiting Queue Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy
	 * @generated
	 */
	EClass getFIFOWaitingQueuePolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy <em>LIFO Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LIFO Waiting Queue Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy
	 * @generated
	 */
	EClass getLIFOWaitingQueuePolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy <em>Priority Waiting Queue Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Waiting Queue Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy
	 * @generated
	 */
	EClass getPriorityWaitingQueuePolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType <em>Rtp Network Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Network Protocol Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType
	 * @generated
	 */
	EClass getRtpNetworkProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType#getProtocolType <em>Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType#getProtocolType()
	 * @see #getRtpNetworkProtocolType()
	 * @generated
	 */
	EAttribute getRtpNetworkProtocolType_ProtocolType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol <em>CAN Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAN Network Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol
	 * @generated
	 */
	EClass getCANNetworkProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol <em>AFDX Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AFDX Network Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol
	 * @generated
	 */
	EClass getAFDXNetworkProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol <em>ATM Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATM Network Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol
	 * @generated
	 */
	EClass getATMNetworkProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol <em>FIP Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FIP Network Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol
	 * @generated
	 */
	EClass getFIPNetworkProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol <em>FDDI Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FDDI Network Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol
	 * @generated
	 */
	EClass getFDDINetworkProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType <em>Rtp Scheduling Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Scheduling Policy Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType
	 * @generated
	 */
	EClass getRtpSchedulingPolicyType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType#getPolicyType()
	 * @see #getRtpSchedulingPolicyType()
	 * @generated
	 */
	EAttribute getRtpSchedulingPolicyType_PolicyType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy <em>Fixed Priority Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Priority Scheduling Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy
	 * @generated
	 */
	EClass getFixedPrioritySchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy <em>Least Laxity First Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Least Laxity First Scheduling Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy
	 * @generated
	 */
	EClass getLeastLaxityFirstSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy <em>Round Robin Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Robin Scheduling Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy
	 * @generated
	 */
	EClass getRoundRobinSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy <em>Earliest Deadline First Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Earliest Deadline First Scheduling Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy
	 * @generated
	 */
	EClass getEarliestDeadlineFirstSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType <em>Rtp Communication Mechanism Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Communication Mechanism Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType
	 * @generated
	 */
	EClass getRtpCommunicationMechanismType();

	/**
	 * Returns the meta object for the containment reference '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getRtpDataSize <em>Rtp Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtp Data Size</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getRtpDataSize()
	 * @see #getRtpCommunicationMechanismType()
	 * @generated
	 */
	EReference getRtpCommunicationMechanismType_RtpDataSize();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getMechanismType <em>Mechanism Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType#getMechanismType()
	 * @see #getRtpCommunicationMechanismType()
	 * @generated
	 */
	EAttribute getRtpCommunicationMechanismType_MechanismType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism <em>Pipe Communication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe Communication Mechanism</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism
	 * @generated
	 */
	EClass getPipeCommunicationMechanism();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism <em>Data Queue Communication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Queue Communication Mechanism</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism
	 * @generated
	 */
	EClass getDataQueueCommunicationMechanism();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism#isOverwriting <em>Overwriting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overwriting</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism#isOverwriting()
	 * @see #getDataQueueCommunicationMechanism()
	 * @generated
	 */
	EAttribute getDataQueueCommunicationMechanism_Overwriting();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType <em>Rtp Transmission Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Transmission Mode Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType
	 * @generated
	 */
	EClass getRtpTransmissionModeType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType#getModeType <em>Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType#getModeType()
	 * @see #getRtpTransmissionModeType()
	 * @generated
	 */
	EAttribute getRtpTransmissionModeType_ModeType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode <em>Full Duplex Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Duplex Transmission Mode</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode
	 * @generated
	 */
	EClass getFullDuplexTransmissionMode();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode <em>Half Duplex Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Half Duplex Transmission Mode</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode
	 * @generated
	 */
	EClass getHalfDuplexTransmissionMode();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode <em>Simple Transmission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Transmission Mode</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode
	 * @generated
	 */
	EClass getSimpleTransmissionMode();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol <em>ICPP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICPP Protect Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol
	 * @generated
	 */
	EClass getICPPProtectProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol <em>OCPP Protect Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCPP Protect Protocol</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol
	 * @generated
	 */
	EClass getOCPPProtectProtocol();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy <em>Deadline Monotonic Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Monotonic Scheduling Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy
	 * @generated
	 */
	EClass getDeadlineMonotonicSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy <em>Rate Monotonic Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate Monotonic Scheduling Policy</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy
	 * @generated
	 */
	EClass getRateMonotonicSchedulingPolicy();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType <em>Rtp Task Allocation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Task Allocation Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType
	 * @generated
	 */
	EClass getRtpTaskAllocationType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType#getAllocationType <em>Allocation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType#getAllocationType()
	 * @see #getRtpTaskAllocationType()
	 * @generated
	 */
	EAttribute getRtpTaskAllocationType_AllocationType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation <em>Partitioned Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partitioned Task Allocation</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation
	 * @generated
	 */
	EClass getPartitionedTaskAllocation();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation <em>Full Migration Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Full Migration Task Allocation</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation
	 * @generated
	 */
	EClass getFullMigrationTaskAllocation();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation <em>Restricted Migration Task Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restricted Migration Task Allocation</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation
	 * @generated
	 */
	EClass getRestrictedMigrationTaskAllocation();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType <em>Rtp Multiprocessor Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtp Multiprocessor Category Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType
	 * @generated
	 */
	EClass getRtpMultiprocessorCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType#getCategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Type</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType#getCategoryType()
	 * @see #getRtpMultiprocessorCategoryType()
	 * @generated
	 */
	EAttribute getRtpMultiprocessorCategoryType_CategoryType();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory <em>Heterogenous Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heterogenous Multiprocessor Category</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory
	 * @generated
	 */
	EClass getHeterogenousMultiprocessorCategory();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory <em>Homogeneous Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Homogeneous Multiprocessor Category</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory
	 * @generated
	 */
	EClass getHomogeneousMultiprocessorCategory();

	/**
	 * Returns the meta object for class '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory <em>Uniform Multiprocessor Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Multiprocessor Category</em>'.
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory
	 * @generated
	 */
	EClass getUniformMultiprocessorCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RtpProtocolsAndPoliciesFactory getRtpProtocolsAndPoliciesFactory();

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
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType <em>Rtp Protect Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpProtectProtocolType()
		 * @generated
		 */
		EClass RTP_PROTECT_PROTOCOL_TYPE = eINSTANCE.getRtpProtectProtocolType();

		/**
		 * The meta object literal for the '<em><b>Protocol Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_PROTECT_PROTOCOL_TYPE__PROTOCOL_TYPE = eINSTANCE.getRtpProtectProtocolType_ProtocolType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PIPProtectProtocolImpl <em>PIP Protect Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PIPProtectProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPIPProtectProtocol()
		 * @generated
		 */
		EClass PIP_PROTECT_PROTOCOL = eINSTANCE.getPIPProtectProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol <em>PCP Protect Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPCPProtectProtocol()
		 * @generated
		 */
		EClass PCP_PROTECT_PROTOCOL = eINSTANCE.getPCPProtectProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType <em>Rtp Communication Arbitration Policy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpCommunicationArbitrationPolicyType()
		 * @generated
		 */
		EClass RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE = eINSTANCE.getRtpCommunicationArbitrationPolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE__POLICY_TYPE = eINSTANCE.getRtpCommunicationArbitrationPolicyType_PolicyType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOCommunicationArbitrationPolicyImpl <em>FIFO Communication Arbitration Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOCommunicationArbitrationPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFIFOCommunicationArbitrationPolicy()
		 * @generated
		 */
		EClass FIFO_COMMUNICATION_ARBITRATION_POLICY = eINSTANCE.getFIFOCommunicationArbitrationPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPriorityCommunicationArbitrationPolicyImpl <em>Fixed Priority Communication Arbitration Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPriorityCommunicationArbitrationPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFixedPriorityCommunicationArbitrationPolicy()
		 * @generated
		 */
		EClass FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY = eINSTANCE.getFixedPriorityCommunicationArbitrationPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOCommunicationArbitrationPolicyImpl <em>LIFO Communication Arbitration Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOCommunicationArbitrationPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getLIFOCommunicationArbitrationPolicy()
		 * @generated
		 */
		EClass LIFO_COMMUNICATION_ARBITRATION_POLICY = eINSTANCE.getLIFOCommunicationArbitrationPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType <em>Rtp Waiting Queue Policy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpWaitingQueuePolicyType()
		 * @generated
		 */
		EClass RTP_WAITING_QUEUE_POLICY_TYPE = eINSTANCE.getRtpWaitingQueuePolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_WAITING_QUEUE_POLICY_TYPE__POLICY_TYPE = eINSTANCE.getRtpWaitingQueuePolicyType_PolicyType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOWaitingQueuePolicyImpl <em>FIFO Waiting Queue Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOWaitingQueuePolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFIFOWaitingQueuePolicy()
		 * @generated
		 */
		EClass FIFO_WAITING_QUEUE_POLICY = eINSTANCE.getFIFOWaitingQueuePolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOWaitingQueuePolicyImpl <em>LIFO Waiting Queue Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOWaitingQueuePolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getLIFOWaitingQueuePolicy()
		 * @generated
		 */
		EClass LIFO_WAITING_QUEUE_POLICY = eINSTANCE.getLIFOWaitingQueuePolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PriorityWaitingQueuePolicyImpl <em>Priority Waiting Queue Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PriorityWaitingQueuePolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPriorityWaitingQueuePolicy()
		 * @generated
		 */
		EClass PRIORITY_WAITING_QUEUE_POLICY = eINSTANCE.getPriorityWaitingQueuePolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType <em>Rtp Network Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpNetworkProtocolType()
		 * @generated
		 */
		EClass RTP_NETWORK_PROTOCOL_TYPE = eINSTANCE.getRtpNetworkProtocolType();

		/**
		 * The meta object literal for the '<em><b>Protocol Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE = eINSTANCE.getRtpNetworkProtocolType_ProtocolType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.CANNetworkProtocolImpl <em>CAN Network Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.CANNetworkProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getCANNetworkProtocol()
		 * @generated
		 */
		EClass CAN_NETWORK_PROTOCOL = eINSTANCE.getCANNetworkProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.AFDXNetworkProtocolImpl <em>AFDX Network Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.AFDXNetworkProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getAFDXNetworkProtocol()
		 * @generated
		 */
		EClass AFDX_NETWORK_PROTOCOL = eINSTANCE.getAFDXNetworkProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ATMNetworkProtocolImpl <em>ATM Network Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ATMNetworkProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getATMNetworkProtocol()
		 * @generated
		 */
		EClass ATM_NETWORK_PROTOCOL = eINSTANCE.getATMNetworkProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIPNetworkProtocolImpl <em>FIP Network Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIPNetworkProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFIPNetworkProtocol()
		 * @generated
		 */
		EClass FIP_NETWORK_PROTOCOL = eINSTANCE.getFIPNetworkProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FDDINetworkProtocolImpl <em>FDDI Network Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FDDINetworkProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFDDINetworkProtocol()
		 * @generated
		 */
		EClass FDDI_NETWORK_PROTOCOL = eINSTANCE.getFDDINetworkProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType <em>Rtp Scheduling Policy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpSchedulingPolicyType()
		 * @generated
		 */
		EClass RTP_SCHEDULING_POLICY_TYPE = eINSTANCE.getRtpSchedulingPolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE = eINSTANCE.getRtpSchedulingPolicyType_PolicyType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPrioritySchedulingPolicyImpl <em>Fixed Priority Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FixedPrioritySchedulingPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFixedPrioritySchedulingPolicy()
		 * @generated
		 */
		EClass FIXED_PRIORITY_SCHEDULING_POLICY = eINSTANCE.getFixedPrioritySchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LeastLaxityFirstSchedulingPolicyImpl <em>Least Laxity First Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LeastLaxityFirstSchedulingPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getLeastLaxityFirstSchedulingPolicy()
		 * @generated
		 */
		EClass LEAST_LAXITY_FIRST_SCHEDULING_POLICY = eINSTANCE.getLeastLaxityFirstSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RoundRobinSchedulingPolicyImpl <em>Round Robin Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RoundRobinSchedulingPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRoundRobinSchedulingPolicy()
		 * @generated
		 */
		EClass ROUND_ROBIN_SCHEDULING_POLICY = eINSTANCE.getRoundRobinSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.EarliestDeadlineFirstSchedulingPolicyImpl <em>Earliest Deadline First Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.EarliestDeadlineFirstSchedulingPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getEarliestDeadlineFirstSchedulingPolicy()
		 * @generated
		 */
		EClass EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY = eINSTANCE.getEarliestDeadlineFirstSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType <em>Rtp Communication Mechanism Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpCommunicationMechanismType()
		 * @generated
		 */
		EClass RTP_COMMUNICATION_MECHANISM_TYPE = eINSTANCE.getRtpCommunicationMechanismType();

		/**
		 * The meta object literal for the '<em><b>Rtp Data Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE = eINSTANCE.getRtpCommunicationMechanismType_RtpDataSize();

		/**
		 * The meta object literal for the '<em><b>Mechanism Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_COMMUNICATION_MECHANISM_TYPE__MECHANISM_TYPE = eINSTANCE.getRtpCommunicationMechanismType_MechanismType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PipeCommunicationMechanismImpl <em>Pipe Communication Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PipeCommunicationMechanismImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPipeCommunicationMechanism()
		 * @generated
		 */
		EClass PIPE_COMMUNICATION_MECHANISM = eINSTANCE.getPipeCommunicationMechanism();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl <em>Data Queue Communication Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DataQueueCommunicationMechanismImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getDataQueueCommunicationMechanism()
		 * @generated
		 */
		EClass DATA_QUEUE_COMMUNICATION_MECHANISM = eINSTANCE.getDataQueueCommunicationMechanism();

		/**
		 * The meta object literal for the '<em><b>Overwriting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING = eINSTANCE.getDataQueueCommunicationMechanism_Overwriting();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType <em>Rtp Transmission Mode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpTransmissionModeType()
		 * @generated
		 */
		EClass RTP_TRANSMISSION_MODE_TYPE = eINSTANCE.getRtpTransmissionModeType();

		/**
		 * The meta object literal for the '<em><b>Mode Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_TRANSMISSION_MODE_TYPE__MODE_TYPE = eINSTANCE.getRtpTransmissionModeType_ModeType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullDuplexTransmissionModeImpl <em>Full Duplex Transmission Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullDuplexTransmissionModeImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFullDuplexTransmissionMode()
		 * @generated
		 */
		EClass FULL_DUPLEX_TRANSMISSION_MODE = eINSTANCE.getFullDuplexTransmissionMode();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HalfDuplexTransmissionModeImpl <em>Half Duplex Transmission Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HalfDuplexTransmissionModeImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getHalfDuplexTransmissionMode()
		 * @generated
		 */
		EClass HALF_DUPLEX_TRANSMISSION_MODE = eINSTANCE.getHalfDuplexTransmissionMode();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.SimpleTransmissionModeImpl <em>Simple Transmission Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.SimpleTransmissionModeImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getSimpleTransmissionMode()
		 * @generated
		 */
		EClass SIMPLE_TRANSMISSION_MODE = eINSTANCE.getSimpleTransmissionMode();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ICPPProtectProtocolImpl <em>ICPP Protect Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.ICPPProtectProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getICPPProtectProtocol()
		 * @generated
		 */
		EClass ICPP_PROTECT_PROTOCOL = eINSTANCE.getICPPProtectProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.OCPPProtectProtocolImpl <em>OCPP Protect Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.OCPPProtectProtocolImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getOCPPProtectProtocol()
		 * @generated
		 */
		EClass OCPP_PROTECT_PROTOCOL = eINSTANCE.getOCPPProtectProtocol();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DeadlineMonotonicSchedulingPolicyImpl <em>Deadline Monotonic Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.DeadlineMonotonicSchedulingPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getDeadlineMonotonicSchedulingPolicy()
		 * @generated
		 */
		EClass DEADLINE_MONOTONIC_SCHEDULING_POLICY = eINSTANCE.getDeadlineMonotonicSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RateMonotonicSchedulingPolicyImpl <em>Rate Monotonic Scheduling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RateMonotonicSchedulingPolicyImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRateMonotonicSchedulingPolicy()
		 * @generated
		 */
		EClass RATE_MONOTONIC_SCHEDULING_POLICY = eINSTANCE.getRateMonotonicSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType <em>Rtp Task Allocation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpTaskAllocationType()
		 * @generated
		 */
		EClass RTP_TASK_ALLOCATION_TYPE = eINSTANCE.getRtpTaskAllocationType();

		/**
		 * The meta object literal for the '<em><b>Allocation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_TASK_ALLOCATION_TYPE__ALLOCATION_TYPE = eINSTANCE.getRtpTaskAllocationType_AllocationType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PartitionedTaskAllocationImpl <em>Partitioned Task Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PartitionedTaskAllocationImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getPartitionedTaskAllocation()
		 * @generated
		 */
		EClass PARTITIONED_TASK_ALLOCATION = eINSTANCE.getPartitionedTaskAllocation();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullMigrationTaskAllocationImpl <em>Full Migration Task Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullMigrationTaskAllocationImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getFullMigrationTaskAllocation()
		 * @generated
		 */
		EClass FULL_MIGRATION_TASK_ALLOCATION = eINSTANCE.getFullMigrationTaskAllocation();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RestrictedMigrationTaskAllocationImpl <em>Restricted Migration Task Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RestrictedMigrationTaskAllocationImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRestrictedMigrationTaskAllocation()
		 * @generated
		 */
		EClass RESTRICTED_MIGRATION_TASK_ALLOCATION = eINSTANCE.getRestrictedMigrationTaskAllocation();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType <em>Rtp Multiprocessor Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getRtpMultiprocessorCategoryType()
		 * @generated
		 */
		EClass RTP_MULTIPROCESSOR_CATEGORY_TYPE = eINSTANCE.getRtpMultiprocessorCategoryType();

		/**
		 * The meta object literal for the '<em><b>Category Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTP_MULTIPROCESSOR_CATEGORY_TYPE__CATEGORY_TYPE = eINSTANCE.getRtpMultiprocessorCategoryType_CategoryType();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HeterogenousMultiprocessorCategoryImpl <em>Heterogenous Multiprocessor Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HeterogenousMultiprocessorCategoryImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getHeterogenousMultiprocessorCategory()
		 * @generated
		 */
		EClass HETEROGENOUS_MULTIPROCESSOR_CATEGORY = eINSTANCE.getHeterogenousMultiprocessorCategory();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HomogeneousMultiprocessorCategoryImpl <em>Homogeneous Multiprocessor Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HomogeneousMultiprocessorCategoryImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getHomogeneousMultiprocessorCategory()
		 * @generated
		 */
		EClass HOMOGENEOUS_MULTIPROCESSOR_CATEGORY = eINSTANCE.getHomogeneousMultiprocessorCategory();

		/**
		 * The meta object literal for the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.UniformMultiprocessorCategoryImpl <em>Uniform Multiprocessor Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.UniformMultiprocessorCategoryImpl
		 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl#getUniformMultiprocessorCategory()
		 * @generated
		 */
		EClass UNIFORM_MULTIPROCESSOR_CATEGORY = eINSTANCE.getUniformMultiprocessorCategory();

	}

} //RtpProtocolsAndPoliciesPackage
