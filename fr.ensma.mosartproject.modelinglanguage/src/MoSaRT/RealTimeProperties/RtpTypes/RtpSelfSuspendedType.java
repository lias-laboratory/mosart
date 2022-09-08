/**
 */
package MoSaRT.RealTimeProperties.RtpTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Self Suspended Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType#getSelfSuspensionTime <em>Self Suspension Time</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpSelfSuspendedType()
 * @model
 * @generated
 */
public interface RtpSelfSuspendedType extends RtpSelfSuspensionType {
	/**
	 * Returns the value of the '<em><b>Self Suspension Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Suspension Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Suspension Time</em>' containment reference.
	 * @see #setSelfSuspensionTime(RtpExecutionTimeType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpSelfSuspendedType_SelfSuspensionTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpExecutionTimeType getSelfSuspensionTime();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType#getSelfSuspensionTime <em>Self Suspension Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Suspension Time</em>' containment reference.
	 * @see #getSelfSuspensionTime()
	 * @generated
	 */
	void setSelfSuspensionTime(RtpExecutionTimeType value);

} // RtpSelfSuspendedType
