/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>So Local Comm Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpCommunicationMechanism <em>Rtp Communication Mechanism</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoLocalCommResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoLocalCommResourceRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SoLocalCommResourceRule1='(self.oclAsType(SoCommunicationResource).writerTasks->union(self.oclAsType(SoCommunicationResource).readerTasks))->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)'"
 * @generated
 */
public interface SoLocalCommResource extends SoCommunicationResource {
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoLocalCommResource_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rtp Communication Mechanism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Communication Mechanism</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Communication Mechanism</em>' containment reference.
	 * @see #setRtpCommunicationMechanism(RtpCommunicationMechanismType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoLocalCommResource_RtpCommunicationMechanism()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpCommunicationMechanismType getRtpCommunicationMechanism();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpCommunicationMechanism <em>Rtp Communication Mechanism</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Communication Mechanism</em>' containment reference.
	 * @see #getRtpCommunicationMechanism()
	 * @generated
	 */
	void setRtpCommunicationMechanism(RtpCommunicationMechanismType value);

	/**
	 * Returns the value of the '<em><b>Rtp Waiting Queue Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Waiting Queue Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Waiting Queue Policy</em>' containment reference.
	 * @see #setRtpWaitingQueuePolicy(RtpWaitingQueuePolicyType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoLocalCommResource_RtpWaitingQueuePolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpWaitingQueuePolicyType getRtpWaitingQueuePolicy();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Waiting Queue Policy</em>' containment reference.
	 * @see #getRtpWaitingQueuePolicy()
	 * @generated
	 */
	void setRtpWaitingQueuePolicy(RtpWaitingQueuePolicyType value);

	/**
	 * Returns the value of the '<em><b>Rtp Protect Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Protect Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Protect Protocol</em>' containment reference.
	 * @see #setRtpProtectProtocol(RtpProtectProtocolType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoLocalCommResource_RtpProtectProtocol()
	 * @model containment="true"
	 * @generated
	 */
	RtpProtectProtocolType getRtpProtectProtocol();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Protect Protocol</em>' containment reference.
	 * @see #getRtpProtectProtocol()
	 * @generated
	 */
	void setRtpProtectProtocol(RtpProtectProtocolType value);

} // SoLocalCommResource
