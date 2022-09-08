/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Time Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getScheduleLink <em>Schedule Link</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getReferenceActivity <em>Reference Activity</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpTimeLinkType()
 * @model
 * @generated
 */
public interface RtpTimeLinkType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Schedule Link</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Link</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType
	 * @see #setScheduleLink(RtpScheduleLinkType)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpTimeLinkType_ScheduleLink()
	 * @model required="true"
	 * @generated
	 */
	RtpScheduleLinkType getScheduleLink();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getScheduleLink <em>Schedule Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Link</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType
	 * @see #getScheduleLink()
	 * @generated
	 */
	void setScheduleLink(RtpScheduleLinkType value);

	/**
	 * Returns the value of the '<em><b>Job Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Number</em>' attribute.
	 * @see #setJobNumber(int)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpTimeLinkType_JobNumber()
	 * @model default="0"
	 * @generated
	 */
	int getJobNumber();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getJobNumber <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Number</em>' attribute.
	 * @see #getJobNumber()
	 * @generated
	 */
	void setJobNumber(int value);

	/**
	 * Returns the value of the '<em><b>Reference Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Activity</em>' reference.
	 * @see #setReferenceActivity(SbSchedulingActivity)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpTimeLinkType_ReferenceActivity()
	 * @model required="true"
	 * @generated
	 */
	SbSchedulingActivity getReferenceActivity();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType#getReferenceActivity <em>Reference Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Activity</em>' reference.
	 * @see #getReferenceActivity()
	 * @generated
	 */
	void setReferenceActivity(SbSchedulingActivity value);

} // RtpTimeLinkType
