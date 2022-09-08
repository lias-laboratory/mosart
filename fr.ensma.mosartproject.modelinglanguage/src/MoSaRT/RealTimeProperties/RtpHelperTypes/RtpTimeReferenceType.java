/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Time Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType#getTimeLink <em>Time Link</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpTimeReferenceType()
 * @model
 * @generated
 */
public interface RtpTimeReferenceType extends RtpReferenceType {
	/**
	 * Returns the value of the '<em><b>Time Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Link</em>' containment reference.
	 * @see #setTimeLink(RtpTimeLinkType)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpTimeReferenceType_TimeLink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpTimeLinkType getTimeLink();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType#getTimeLink <em>Time Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Link</em>' containment reference.
	 * @see #getTimeLink()
	 * @generated
	 */
	void setTimeLink(RtpTimeLinkType value);

} // RtpTimeReferenceType
