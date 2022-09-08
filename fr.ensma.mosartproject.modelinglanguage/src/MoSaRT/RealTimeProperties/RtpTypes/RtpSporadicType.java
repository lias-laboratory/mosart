/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Sporadic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType#getInterArrival <em>Inter Arrival</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpSporadicType()
 * @model
 * @generated
 */
public interface RtpSporadicType extends RtpPeriodicityType {
	/**
	 * Returns the value of the '<em><b>Inter Arrival</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inter Arrival</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Arrival</em>' containment reference.
	 * @see #setInterArrival(RtpInterArrivalType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpSporadicType_InterArrival()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpInterArrivalType getInterArrival();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType#getInterArrival <em>Inter Arrival</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Arrival</em>' containment reference.
	 * @see #getInterArrival()
	 * @generated
	 */
	void setInterArrival(RtpInterArrivalType value);

} // RtpSporadicType
