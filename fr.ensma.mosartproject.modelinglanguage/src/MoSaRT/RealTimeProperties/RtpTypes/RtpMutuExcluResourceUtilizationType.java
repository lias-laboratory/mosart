/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Mutu Exclu Resource Utilization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getTimeUtilization <em>Time Utilization</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getSpecialAccessPriority <em>Special Access Priority</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpMutuExcluResourceUtilizationType()
 * @model
 * @generated
 */
public interface RtpMutuExcluResourceUtilizationType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Time Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Utilization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Utilization</em>' containment reference.
	 * @see #setTimeUtilization(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpMutuExcluResourceUtilizationType_TimeUtilization()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpDurationType getTimeUtilization();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getTimeUtilization <em>Time Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Utilization</em>' containment reference.
	 * @see #getTimeUtilization()
	 * @generated
	 */
	void setTimeUtilization(RtpDurationType value);

	/**
	 * Returns the value of the '<em><b>Special Access Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Access Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Access Priority</em>' containment reference.
	 * @see #setSpecialAccessPriority(RtpPriorityType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority()
	 * @model containment="true"
	 * @generated
	 */
	RtpPriorityType getSpecialAccessPriority();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getSpecialAccessPriority <em>Special Access Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Access Priority</em>' containment reference.
	 * @see #getSpecialAccessPriority()
	 * @generated
	 */
	void setSpecialAccessPriority(RtpPriorityType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(SoInteractionResource)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpMutuExcluResourceUtilizationType_Resource()
	 * @model required="true"
	 * @generated
	 */
	SoInteractionResource getResource();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(SoInteractionResource value);

} // RtpMutuExcluResourceUtilizationType
