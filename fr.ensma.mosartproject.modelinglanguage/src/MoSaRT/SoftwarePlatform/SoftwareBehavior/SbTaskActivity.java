/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Task Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getActionSteps <em>Action Steps</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRootActionStep <em>Root Action Step</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getStepPrecedenceRelations <em>Step Precedence Relations</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpDeadline <em>Rtp Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpExecutionTime <em>Rtp Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpOffset <em>Rtp Offset</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpBlockingTime <em>Rtp Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpRepetition <em>Rtp Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpResponseTime <em>Rtp Response Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPriority <em>Rtp Priority</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepresentedTask <em>Represented Task</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getPriority <em>Priority</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getOffset <em>Offset</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpCriticality <em>Rtp Criticality</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPreemptibility <em>Rtp Preemptibility</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpSelfSuspension <em>Rtp Self Suspension</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbTaskActivityRule1 SbTaskActivityRule2 SbTaskActivityRule3 SbTaskActivityRule4 SbTaskActivityRule5 SbTaskActivityRule6 SbTaskActivityRule7 SbTaskActivityRule8'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbTaskActivityRule1='self.oclAsType(SbSchedulingActivity).trigger->isEmpty() implies self.oclAsType(SbSchedulingActivity).inputSquencingRelation->notEmpty()' SbTaskActivityRule2='(self.actionSteps->notEmpty() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep) or s.oclIsTypeOf(SbAcquireStep)) )-> size()>0)  implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))->size() = (self.actionSteps->select(s| s.oclIsTypeOf(SbAcquireStep)))->size() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))-> size() <= self.representedTask.rtpMutualExclusionResourceUtilization->size())' SbTaskActivityRule3='(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size() <= (self.representedTask.commWritingResources->select(wr | wr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())' SbTaskActivityRule4='(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size() <= (self.representedTask.commReadingResources->select(rr :SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())' SbTaskActivityRule5='(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size()>0) implies ( (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size() <= (self.representedTask.commWritingResources->select(wr : SoftwareOperators::SoCommunicationResource| wr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())' SbTaskActivityRule6='( self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep | s.oclIsTypeOf(SbReceiveStep)))->size()>0 ) implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReceiveStep)))->size() <= (self.representedTask.commReadingResources->select(rr:SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())\r\n' SbTaskActivityRule7='self.actionSteps->notEmpty() implies ( (self.actionSteps->select(gr : SbStep| gr.interactionResource->notEmpty())->collect(s : SbStep | s.interactionResource))->forAll(rsc:SoftwareOperators::SoInteractionResource | rsc.oclIsKindOf (SoftwareOperators::SoInteractionResource) implies self.representedTask.mutualExclusionResources->includes(rsc) or ( self.representedTask. commWritingResources->includes(rsc) or self.representedTask.commReadingResources->includes(rsc))) )' SbTaskActivityRule8='self.actionSteps->select(s | s.oclIsTypeOf(SbAcquireStep) or s.oclIsTypeOf(SbReleaseStep))->forAll(a , b | a.oclIsTypeOf(SbAcquireStep) and b.oclIsTypeOf(SbReleaseStep) and a.oclAsType(SbStep).interactionResource = b.oclAsType(SbStep).interactionResource implies a.oclAsType(SbStep).stepPredecessors->excludes(b))'"
 * @generated
 */
public interface SbTaskActivity extends SbSchedulingActivity {
	/**
	 * Returns the value of the '<em><b>Action Steps</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Steps</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_ActionSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<SbStep> getActionSteps();

	/**
	 * Returns the value of the '<em><b>Root Action Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Action Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Action Step</em>' reference.
	 * @see #setRootActionStep(SbStep)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RootActionStep()
	 * @model
	 * @generated
	 */
	SbStep getRootActionStep();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRootActionStep <em>Root Action Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Action Step</em>' reference.
	 * @see #getRootActionStep()
	 * @generated
	 */
	void setRootActionStep(SbStep value);

	/**
	 * Returns the value of the '<em><b>Step Precedence Relations</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Precedence Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Precedence Relations</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_StepPrecedenceRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SbStepPrecedenceRelation> getStepPrecedenceRelations();

	/**
	 * Returns the value of the '<em><b>Rtp Deadline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Deadline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Deadline</em>' containment reference.
	 * @see #setRtpDeadline(RtpDeadlineType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpDeadline()
	 * @model containment="true"
	 * @generated
	 */
	RtpDeadlineType getRtpDeadline();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpDeadline <em>Rtp Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Deadline</em>' containment reference.
	 * @see #getRtpDeadline()
	 * @generated
	 */
	void setRtpDeadline(RtpDeadlineType value);

	/**
	 * Returns the value of the '<em><b>Rtp Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Execution Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Execution Time</em>' containment reference.
	 * @see #setRtpExecutionTime(RtpExecutionTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpExecutionTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpExecutionTimeType getRtpExecutionTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpExecutionTime <em>Rtp Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Execution Time</em>' containment reference.
	 * @see #getRtpExecutionTime()
	 * @generated
	 */
	void setRtpExecutionTime(RtpExecutionTimeType value);

	/**
	 * Returns the value of the '<em><b>Rtp Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Offset</em>' containment reference.
	 * @see #setRtpOffset(RtpOffsetType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpOffset()
	 * @model containment="true"
	 * @generated
	 */
	RtpOffsetType getRtpOffset();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpOffset <em>Rtp Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Offset</em>' containment reference.
	 * @see #getRtpOffset()
	 * @generated
	 */
	void setRtpOffset(RtpOffsetType value);

	/**
	 * Returns the value of the '<em><b>Rtp Blocking Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Blocking Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Blocking Time</em>' containment reference.
	 * @see #setRtpBlockingTime(RtpBlockingTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpBlockingTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpBlockingTimeType getRtpBlockingTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpBlockingTime <em>Rtp Blocking Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Blocking Time</em>' containment reference.
	 * @see #getRtpBlockingTime()
	 * @generated
	 */
	void setRtpBlockingTime(RtpBlockingTimeType value);

	/**
	 * Returns the value of the '<em><b>Rtp Repetition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Repetition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Repetition</em>' containment reference.
	 * @see #setRtpRepetition(RtpRepetitionType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpRepetition()
	 * @model containment="true"
	 * @generated
	 */
	RtpRepetitionType getRtpRepetition();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpRepetition <em>Rtp Repetition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Repetition</em>' containment reference.
	 * @see #getRtpRepetition()
	 * @generated
	 */
	void setRtpRepetition(RtpRepetitionType value);

	/**
	 * Returns the value of the '<em><b>Rtp Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Response Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Response Time</em>' containment reference.
	 * @see #setRtpResponseTime(RtpResponseTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpResponseTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpResponseTimeType getRtpResponseTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpResponseTime <em>Rtp Response Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Response Time</em>' containment reference.
	 * @see #getRtpResponseTime()
	 * @generated
	 */
	void setRtpResponseTime(RtpResponseTimeType value);

	/**
	 * Returns the value of the '<em><b>Rtp Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Priority</em>' containment reference.
	 * @see #setRtpPriority(RtpPriorityType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpPriority()
	 * @model containment="true"
	 * @generated
	 */
	RtpPriorityType getRtpPriority();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPriority <em>Rtp Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Priority</em>' containment reference.
	 * @see #getRtpPriority()
	 * @generated
	 */
	void setRtpPriority(RtpPriorityType value);

	/**
	 * Returns the value of the '<em><b>Represented Task</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRepresentedActivity <em>Represented Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Task</em>' reference.
	 * @see #setRepresentedTask(SoSchedulableTask)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RepresentedTask()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRepresentedActivity
	 * @model opposite="representedActivity" required="true"
	 * @generated
	 */
	SoSchedulableTask getRepresentedTask();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepresentedTask <em>Represented Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Task</em>' reference.
	 * @see #getRepresentedTask()
	 * @generated
	 */
	void setRepresentedTask(SoSchedulableTask value);

	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition</em>' reference.
	 * @see #setRepetition(RtpRepetitionType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_Repetition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpRepetition'"
	 * @generated
	 */
	RtpRepetitionType getRepetition();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepetition <em>Repetition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition</em>' reference.
	 * @see #getRepetition()
	 * @generated
	 */
	void setRepetition(RtpRepetitionType value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' reference.
	 * @see #setDeadline(RtpDeadlineType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_Deadline()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpDeadline'"
	 * @generated
	 */
	RtpDeadlineType getDeadline();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getDeadline <em>Deadline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' reference.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(RtpDeadlineType value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' reference.
	 * @see #setExecutionTime(RtpExecutionTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_ExecutionTime()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpExecutionTime'"
	 * @generated
	 */
	RtpExecutionTimeType getExecutionTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getExecutionTime <em>Execution Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' reference.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(RtpExecutionTimeType value);

	/**
	 * Returns the value of the '<em><b>Blocking Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Time</em>' reference.
	 * @see #setBlockingTime(RtpBlockingTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_BlockingTime()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpBlockingTime'"
	 * @generated
	 */
	RtpBlockingTimeType getBlockingTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getBlockingTime <em>Blocking Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' reference.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(RtpBlockingTimeType value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(RtpPriorityType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_Priority()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpPriority'"
	 * @generated
	 */
	RtpPriorityType getPriority();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RtpPriorityType value);

	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' reference.
	 * @see #setResponseTime(RtpResponseTimeType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_ResponseTime()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpResponseTime'"
	 * @generated
	 */
	RtpResponseTimeType getResponseTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getResponseTime <em>Response Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' reference.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(RtpResponseTimeType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' reference.
	 * @see #setOffset(RtpOffsetType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_Offset()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpOffset'"
	 * @generated
	 */
	RtpOffsetType getOffset();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getOffset <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(RtpOffsetType value);

	/**
	 * Returns the value of the '<em><b>Rtp Criticality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Criticality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Criticality</em>' containment reference.
	 * @see #setRtpCriticality(RtpCriticalityType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpCriticality()
	 * @model containment="true"
	 * @generated
	 */
	RtpCriticalityType getRtpCriticality();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpCriticality <em>Rtp Criticality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Criticality</em>' containment reference.
	 * @see #getRtpCriticality()
	 * @generated
	 */
	void setRtpCriticality(RtpCriticalityType value);

	/**
	 * Returns the value of the '<em><b>Rtp Preemptibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Preemptibility</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Preemptibility</em>' containment reference.
	 * @see #setRtpPreemptibility(RtpPreemptibilityType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpPreemptibility()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpPreemptibilityType getRtpPreemptibility();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpPreemptibility <em>Rtp Preemptibility</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Preemptibility</em>' containment reference.
	 * @see #getRtpPreemptibility()
	 * @generated
	 */
	void setRtpPreemptibility(RtpPreemptibilityType value);

	/**
	 * Returns the value of the '<em><b>Rtp Self Suspension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Self Suspension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Self Suspension</em>' containment reference.
	 * @see #setRtpSelfSuspension(RtpSelfSuspensionType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTaskActivity_RtpSelfSuspension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpSelfSuspensionType getRtpSelfSuspension();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRtpSelfSuspension <em>Rtp Self Suspension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Self Suspension</em>' containment reference.
	 * @see #getRtpSelfSuspension()
	 * @generated
	 */
	void setRtpSelfSuspension(RtpSelfSuspensionType value);

} // SbTaskActivity
