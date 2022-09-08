/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Periodic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getJitter <em>Jitter</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpPeriodicType()
 * @model
 * @generated
 */
public interface RtpPeriodicType extends RtpPeriodicityType {
	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' containment reference.
	 * @see #setJitter(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpPeriodicType_Jitter()
	 * @model containment="true"
	 * @generated
	 */
	RtpDurationType getJitter();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getJitter <em>Jitter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' containment reference.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(RtpDurationType value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpPeriodicType_Period()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpDurationType getPeriod();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(RtpDurationType value);

} // RtpPeriodicType
