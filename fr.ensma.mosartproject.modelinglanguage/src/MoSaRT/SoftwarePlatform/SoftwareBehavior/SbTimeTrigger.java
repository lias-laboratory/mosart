/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpReleaseTime <em>Rtp Release Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpPeriodicity <em>Rtp Periodicity</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getPeriodicity <em>Periodicity</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTimeTrigger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbTimeTriggerRule1 SbTimeTriggerRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbTimeTriggerRule1='GlobalBehaviour.allInstances()->forAll(gb | gb.rootTrigger = self implies self.rtpStartTime->isEmpty())' SbTimeTriggerRule2='SbTimeTrigger.allInstances()->forAll(tt1 : SbTimeTrigger, tt2 : SbTimeTrigger | tt1.schedulingActivities->notEmpty() and tt1.rtpStartTime->notEmpty() and tt1.rtpStartTime.referring->notEmpty() and tt1.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and tt1.rtpStartTime.referring.oclAsType (RealTimeProperties ::RtpHelperTypes::RtpTimeReferenceType).timeLink->notEmpty() and tt2.rtpStartTime ->notEmpty() and tt2.rtpStartTime.referring->notEmpty() and tt2.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and  tt2.rtpStartTime. referring.oclAsType(RealTimeProperties::RtpHelperTypes:: RtpTimeReferenceType).timeLink->notEmpty() and tt1. schedulingActivities ->includes (tt2.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity) implies tt2.schedulingActivities->excludes(tt1.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity))\r\n'"
 * @generated
 */
public interface SbTimeTrigger extends SbTrigger {
	/**
	 * Returns the value of the '<em><b>Rtp Release Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Release Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Release Time</em>' containment reference.
	 * @see #setRtpReleaseTime(RtpReleaseTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTimeTrigger_RtpReleaseTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpReleaseTimeType getRtpReleaseTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpReleaseTime <em>Rtp Release Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Release Time</em>' containment reference.
	 * @see #getRtpReleaseTime()
	 * @generated
	 */
	void setRtpReleaseTime(RtpReleaseTimeType value);

	/**
	 * Returns the value of the '<em><b>Rtp Periodicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Periodicity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Periodicity</em>' containment reference.
	 * @see #setRtpPeriodicity(RtpPeriodicityType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTimeTrigger_RtpPeriodicity()
	 * @model containment="true"
	 * @generated
	 */
	RtpPeriodicityType getRtpPeriodicity();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getRtpPeriodicity <em>Rtp Periodicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Periodicity</em>' containment reference.
	 * @see #getRtpPeriodicity()
	 * @generated
	 */
	void setRtpPeriodicity(RtpPeriodicityType value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' reference.
	 * @see #setStartTime(RtpReleaseTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTimeTrigger_StartTime()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpStartTime'"
	 * @generated
	 */
	RtpReleaseTimeType getStartTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getStartTime <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' reference.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(RtpReleaseTimeType value);

	/**
	 * Returns the value of the '<em><b>Periodicity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicity</em>' reference.
	 * @see #setPeriodicity(RtpPeriodicityType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTimeTrigger_Periodicity()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpPeriodicity'"
	 * @generated
	 */
	RtpPeriodicityType getPeriodicity();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger#getPeriodicity <em>Periodicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity</em>' reference.
	 * @see #getPeriodicity()
	 * @generated
	 */
	void setPeriodicity(RtpPeriodicityType value);

} // SbTimeTrigger
