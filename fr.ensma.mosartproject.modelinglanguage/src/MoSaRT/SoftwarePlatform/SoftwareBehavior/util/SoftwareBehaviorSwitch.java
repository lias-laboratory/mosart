/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.util;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage
 * @generated
 */
public class SoftwareBehaviorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwareBehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = SoftwareBehaviorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR: {
				GlobalBehavior globalBehavior = (GlobalBehavior)theEObject;
				T result = caseGlobalBehavior(globalBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_TRIGGER: {
				SbTrigger sbTrigger = (SbTrigger)theEObject;
				T result = caseSbTrigger(sbTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER: {
				SbTimeTrigger sbTimeTrigger = (SbTimeTrigger)theEObject;
				T result = caseSbTimeTrigger(sbTimeTrigger);
				if (result == null) result = caseSbTrigger(sbTimeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER: {
				SbExternalEventTrigger sbExternalEventTrigger = (SbExternalEventTrigger)theEObject;
				T result = caseSbExternalEventTrigger(sbExternalEventTrigger);
				if (result == null) result = caseSbTrigger(sbExternalEventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY: {
				SbSchedulingActivity sbSchedulingActivity = (SbSchedulingActivity)theEObject;
				T result = caseSbSchedulingActivity(sbSchedulingActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY: {
				SbTaskActivity sbTaskActivity = (SbTaskActivity)theEObject;
				T result = caseSbTaskActivity(sbTaskActivity);
				if (result == null) result = caseSbSchedulingActivity(sbTaskActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION: {
				SbPrecedenceRelation sbPrecedenceRelation = (SbPrecedenceRelation)theEObject;
				T result = caseSbPrecedenceRelation(sbPrecedenceRelation);
				if (result == null) result = caseSbSequencingRelation(sbPrecedenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_SEQUENCING_RELATION: {
				SbSequencingRelation sbSequencingRelation = (SbSequencingRelation)theEObject;
				T result = caseSbSequencingRelation(sbSequencingRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_COMMUNICATION_RELATION: {
				SbCommunicationRelation sbCommunicationRelation = (SbCommunicationRelation)theEObject;
				T result = caseSbCommunicationRelation(sbCommunicationRelation);
				if (result == null) result = caseSbSequencingRelation(sbCommunicationRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_STEP: {
				SbStep sbStep = (SbStep)theEObject;
				T result = caseSbStep(sbStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP: {
				SbAcquireStep sbAcquireStep = (SbAcquireStep)theEObject;
				T result = caseSbAcquireStep(sbAcquireStep);
				if (result == null) result = caseSbStep(sbAcquireStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_SEND_STEP: {
				SbSendStep sbSendStep = (SbSendStep)theEObject;
				T result = caseSbSendStep(sbSendStep);
				if (result == null) result = caseSbStep(sbSendStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_RECEIVE_STEP: {
				SbReceiveStep sbReceiveStep = (SbReceiveStep)theEObject;
				T result = caseSbReceiveStep(sbReceiveStep);
				if (result == null) result = caseSbStep(sbReceiveStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_WRITE_STEP: {
				SbWriteStep sbWriteStep = (SbWriteStep)theEObject;
				T result = caseSbWriteStep(sbWriteStep);
				if (result == null) result = caseSbStep(sbWriteStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_RELEASE_STEP: {
				SbReleaseStep sbReleaseStep = (SbReleaseStep)theEObject;
				T result = caseSbReleaseStep(sbReleaseStep);
				if (result == null) result = caseSbStep(sbReleaseStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_READ_STEP: {
				SbReadStep sbReadStep = (SbReadStep)theEObject;
				T result = caseSbReadStep(sbReadStep);
				if (result == null) result = caseSbStep(sbReadStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION: {
				SbStepPrecedenceRelation sbStepPrecedenceRelation = (SbStepPrecedenceRelation)theEObject;
				T result = caseSbStepPrecedenceRelation(sbStepPrecedenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwareBehaviorPackage.SB_ACTION_STEP: {
				SbActionStep sbActionStep = (SbActionStep)theEObject;
				T result = caseSbActionStep(sbActionStep);
				if (result == null) result = caseSbStep(sbActionStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalBehavior(GlobalBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbTrigger(SbTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbTimeTrigger(SbTimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb External Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb External Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbExternalEventTrigger(SbExternalEventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Scheduling Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Scheduling Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbSchedulingActivity(SbSchedulingActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Task Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbTaskActivity(SbTaskActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Precedence Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbPrecedenceRelation(SbPrecedenceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Sequencing Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Sequencing Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbSequencingRelation(SbSequencingRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Communication Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbCommunicationRelation(SbCommunicationRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbStep(SbStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Acquire Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbAcquireStep(SbAcquireStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Send Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Send Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbSendStep(SbSendStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Receive Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Receive Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbReceiveStep(SbReceiveStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Write Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Write Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbWriteStep(SbWriteStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Release Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbReleaseStep(SbReleaseStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Read Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Read Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbReadStep(SbReadStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Step Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Step Precedence Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbStepPrecedenceRelation(SbStepPrecedenceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sb Action Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sb Action Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSbActionStep(SbActionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SoftwareBehaviorSwitch
