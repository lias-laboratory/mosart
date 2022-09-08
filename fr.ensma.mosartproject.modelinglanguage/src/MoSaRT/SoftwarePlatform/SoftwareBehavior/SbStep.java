/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInputStepRelation <em>Input Step Relation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getOutputStepRelation <em>Output Step Relation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpDeadline <em>Rtp Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpExecutionTime <em>Rtp Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpBlockingTime <em>Rtp Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpRepetition <em>Rtp Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepresentedOperation <em>Represented Operation</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getBlockingTime <em>Blocking Time</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInteractionResource <em>Interaction Resource</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getStepPredecessors <em>Step Predecessors</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SbStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Step Relation</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getTargetStep <em>Target Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Step Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Step Relation</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_InputStepRelation()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getTargetStep
	 * @model opposite="targetStep"
	 * @generated
	 */
	EList<SbStepPrecedenceRelation> getInputStepRelation();

	/**
	 * Returns the value of the '<em><b>Output Step Relation</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getSourceStep <em>Source Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Step Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Step Relation</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_OutputStepRelation()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getSourceStep
	 * @model opposite="sourceStep"
	 * @generated
	 */
	EList<SbStepPrecedenceRelation> getOutputStepRelation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_RtpDeadline()
	 * @model containment="true"
	 * @generated
	 */
	RtpDeadlineType getRtpDeadline();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpDeadline <em>Rtp Deadline</em>}' containment reference.
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_RtpExecutionTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpExecutionTimeType getRtpExecutionTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpExecutionTime <em>Rtp Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Execution Time</em>' containment reference.
	 * @see #getRtpExecutionTime()
	 * @generated
	 */
	void setRtpExecutionTime(RtpExecutionTimeType value);

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_RtpBlockingTime()
	 * @model containment="true"
	 * @generated
	 */
	RtpBlockingTimeType getRtpBlockingTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpBlockingTime <em>Rtp Blocking Time</em>}' containment reference.
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_RtpRepetition()
	 * @model containment="true"
	 * @generated
	 */
	RtpRepetitionType getRtpRepetition();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRtpRepetition <em>Rtp Repetition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Repetition</em>' containment reference.
	 * @see #getRtpRepetition()
	 * @generated
	 */
	void setRtpRepetition(RtpRepetitionType value);

	/**
	 * Returns the value of the '<em><b>Represented Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Operation</em>' reference.
	 * @see #setRepresentedOperation(Operation)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_RepresentedOperation()
	 * @model
	 * @generated
	 */
	Operation getRepresentedOperation();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepresentedOperation <em>Represented Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Operation</em>' reference.
	 * @see #getRepresentedOperation()
	 * @generated
	 */
	void setRepresentedOperation(Operation value);

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_Repetition()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpRepetition'"
	 * @generated
	 */
	RtpRepetitionType getRepetition();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getRepetition <em>Repetition</em>}' reference.
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_Deadline()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpDeadline'"
	 * @generated
	 */
	RtpDeadlineType getDeadline();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getDeadline <em>Deadline</em>}' reference.
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_ExecutionTime()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpExecutionTime'"
	 * @generated
	 */
	RtpExecutionTimeType getExecutionTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getExecutionTime <em>Execution Time</em>}' reference.
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_BlockingTime()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpBlockingTime'"
	 * @generated
	 */
	RtpBlockingTimeType getBlockingTime();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getBlockingTime <em>Blocking Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Time</em>' reference.
	 * @see #getBlockingTime()
	 * @generated
	 */
	void setBlockingTime(RtpBlockingTimeType value);

	/**
	 * Returns the value of the '<em><b>Interaction Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Resource</em>' reference.
	 * @see #setInteractionResource(SoInteractionResource)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_InteractionResource()
	 * @model
	 * @generated
	 */
	SoInteractionResource getInteractionResource();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInteractionResource <em>Interaction Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Resource</em>' reference.
	 * @see #getInteractionResource()
	 * @generated
	 */
	void setInteractionResource(SoInteractionResource value);

	/**
	 * Returns the value of the '<em><b>Step Predecessors</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Predecessors</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStep_StepPredecessors()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.inputStepRelation->collect(r : SbStepPrecedenceRelation | r.sourceStep)->collect(s : SbStep | s.stepPredecessors)->union(self.inputStepRelation->collect(r : SbStepPrecedenceRelation | r.sourceStep))'"
	 * @generated
	 */
	EList<SbStep> getStepPredecessors();

} // SbStep
