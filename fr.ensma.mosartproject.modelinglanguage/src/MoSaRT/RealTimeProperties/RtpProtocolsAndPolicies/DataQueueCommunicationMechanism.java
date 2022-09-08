/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Queue Communication Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism#isOverwriting <em>Overwriting</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getDataQueueCommunicationMechanism()
 * @model
 * @generated
 */
public interface DataQueueCommunicationMechanism extends RtpCommunicationMechanismType {
	/**
	 * Returns the value of the '<em><b>Overwriting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overwriting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overwriting</em>' attribute.
	 * @see #setOverwriting(boolean)
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#getDataQueueCommunicationMechanism_Overwriting()
	 * @model required="true"
	 * @generated
	 */
	boolean isOverwriting();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism#isOverwriting <em>Overwriting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwriting</em>' attribute.
	 * @see #isOverwriting()
	 * @generated
	 */
	void setOverwriting(boolean value);

} // DataQueueCommunicationMechanism
