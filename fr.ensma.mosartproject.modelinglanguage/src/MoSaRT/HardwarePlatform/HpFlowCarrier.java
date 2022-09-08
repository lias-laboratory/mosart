/**
 */
package MoSaRT.HardwarePlatform;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearAnalysisFunction;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.PiecewiseLinearComputationFunction;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Flow Carrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getHpNetworkNodeTargets <em>Hp Network Node Targets</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getServiceCurveFunction <em>Service Curve Function</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getTrafficShaperFunction <em>Traffic Shaper Function</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getProcessingUnitOrigin <em>Processing Unit Origin</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getRtpCommunicationArbitrationPolicy <em>Rtp Communication Arbitration Policy</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier()
 * @model
 * @generated
 */
public interface HpFlowCarrier extends HpNetworkNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hp Network Node Targets</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpNetworkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hp Network Node Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hp Network Node Targets</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier_HpNetworkNodeTargets()
	 * @model required="true"
	 * @generated
	 */
	EList<HpNetworkNode> getHpNetworkNodeTargets();

	/**
	 * Returns the value of the '<em><b>Service Curve Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Curve Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Curve Function</em>' containment reference.
	 * @see #setServiceCurveFunction(PiecewiseLinearAnalysisFunction)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier_ServiceCurveFunction()
	 * @model containment="true"
	 * @generated
	 */
	PiecewiseLinearAnalysisFunction getServiceCurveFunction();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getServiceCurveFunction <em>Service Curve Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Curve Function</em>' containment reference.
	 * @see #getServiceCurveFunction()
	 * @generated
	 */
	void setServiceCurveFunction(PiecewiseLinearAnalysisFunction value);

	/**
	 * Returns the value of the '<em><b>Traffic Shaper Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traffic Shaper Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic Shaper Function</em>' containment reference.
	 * @see #setTrafficShaperFunction(PiecewiseLinearAnalysisFunction)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier_TrafficShaperFunction()
	 * @model containment="true"
	 * @generated
	 */
	PiecewiseLinearAnalysisFunction getTrafficShaperFunction();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getTrafficShaperFunction <em>Traffic Shaper Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Shaper Function</em>' containment reference.
	 * @see #getTrafficShaperFunction()
	 * @generated
	 */
	void setTrafficShaperFunction(PiecewiseLinearAnalysisFunction value);

	/**
	 * Returns the value of the '<em><b>Processing Unit Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Unit Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Unit Origin</em>' reference.
	 * @see #setProcessingUnitOrigin(HpProcessingUnit)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier_ProcessingUnitOrigin()
	 * @model
	 * @generated
	 */
	HpProcessingUnit getProcessingUnitOrigin();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getProcessingUnitOrigin <em>Processing Unit Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Unit Origin</em>' reference.
	 * @see #getProcessingUnitOrigin()
	 * @generated
	 */
	void setProcessingUnitOrigin(HpProcessingUnit value);

	/**
	 * Returns the value of the '<em><b>Rtp Communication Arbitration Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Communication Arbitration Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Communication Arbitration Policy</em>' containment reference.
	 * @see #setRtpCommunicationArbitrationPolicy(RtpCommunicationArbitrationPolicyType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpFlowCarrier_RtpCommunicationArbitrationPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpCommunicationArbitrationPolicyType getRtpCommunicationArbitrationPolicy();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpFlowCarrier#getRtpCommunicationArbitrationPolicy <em>Rtp Communication Arbitration Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Communication Arbitration Policy</em>' containment reference.
	 * @see #getRtpCommunicationArbitrationPolicy()
	 * @generated
	 */
	void setRtpCommunicationArbitrationPolicy(RtpCommunicationArbitrationPolicyType value);

} // HpFlowCarrier
