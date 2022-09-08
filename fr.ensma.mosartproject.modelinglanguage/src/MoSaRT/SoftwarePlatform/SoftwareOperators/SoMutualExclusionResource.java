/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>So Mutual Exclusion Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getTasks <em>Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoMutualExclusionResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoMutualExclusionResourceRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SoMutualExclusionResourceRule1='self.tasks->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)'"
 * @generated
 */
public interface SoMutualExclusionResource extends SoInteractionResource {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoMutualExclusionResource_Tasks()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResources
	 * @model opposite="mutualExclusionResources" lower="2"
	 * @generated
	 */
	EList<SoSchedulableTask> getTasks();

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoMutualExclusionResource_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoMutualExclusionResource_RtpProtectProtocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpProtectProtocolType getRtpProtectProtocol();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpProtectProtocol <em>Rtp Protect Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Protect Protocol</em>' containment reference.
	 * @see #getRtpProtectProtocol()
	 * @generated
	 */
	void setRtpProtectProtocol(RtpProtectProtocolType value);

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoMutualExclusionResource_RtpWaitingQueuePolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpWaitingQueuePolicyType getRtpWaitingQueuePolicy();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getRtpWaitingQueuePolicy <em>Rtp Waiting Queue Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Waiting Queue Policy</em>' containment reference.
	 * @see #getRtpWaitingQueuePolicy()
	 * @generated
	 */
	void setRtpWaitingQueuePolicy(RtpWaitingQueuePolicyType value);

} // SoMutualExclusionResource
