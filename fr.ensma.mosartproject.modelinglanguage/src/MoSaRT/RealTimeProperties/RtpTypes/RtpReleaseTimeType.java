/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Start Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReleaseTime <em>Release Time</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReferring <em>Referring</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpReleaseTimeType()
 * @model
 * @generated
 */
public interface RtpReleaseTimeType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Release Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Time</em>' containment reference.
	 * @see #setReleaseTime(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpReleaseTimeType_ReleaseTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpDurationType getReleaseTime();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReleaseTime <em>Release Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Time</em>' containment reference.
	 * @see #getReleaseTime()
	 * @generated
	 */
	void setReleaseTime(RtpDurationType value);

	/**
	 * Returns the value of the '<em><b>Referring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referring</em>' containment reference.
	 * @see #setReferring(RtpReferenceType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpReleaseTimeType_Referring()
	 * @model containment="true"
	 * @generated
	 */
	RtpReferenceType getReferring();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType#getReferring <em>Referring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referring</em>' containment reference.
	 * @see #getReferring()
	 * @generated
	 */
	void setReferring(RtpReferenceType value);

} // RtpReleaseTimeType
