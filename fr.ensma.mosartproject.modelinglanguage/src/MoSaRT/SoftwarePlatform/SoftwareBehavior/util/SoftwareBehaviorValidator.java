/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.util;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage
 * @generated
 */
public class SoftwareBehaviorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SoftwareBehaviorValidator INSTANCE = new SoftwareBehaviorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MoSaRT.SoftwarePlatform.SoftwareBehavior";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SoftwareBehaviorPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SoftwareBehaviorPackage.GLOBAL_BEHAVIOR:
				return validateGlobalBehavior((GlobalBehavior)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_TRIGGER:
				return validateSbTrigger((SbTrigger)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_TIME_TRIGGER:
				return validateSbTimeTrigger((SbTimeTrigger)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_EXTERNAL_EVENT_TRIGGER:
				return validateSbExternalEventTrigger((SbExternalEventTrigger)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_SCHEDULING_ACTIVITY:
				return validateSbSchedulingActivity((SbSchedulingActivity)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_TASK_ACTIVITY:
				return validateSbTaskActivity((SbTaskActivity)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_PRECEDENCE_RELATION:
				return validateSbPrecedenceRelation((SbPrecedenceRelation)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_SEQUENCING_RELATION:
				return validateSbSequencingRelation((SbSequencingRelation)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_COMMUNICATION_RELATION:
				return validateSbCommunicationRelation((SbCommunicationRelation)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_STEP:
				return validateSbStep((SbStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_ACQUIRE_STEP:
				return validateSbAcquireStep((SbAcquireStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_SEND_STEP:
				return validateSbSendStep((SbSendStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_RECEIVE_STEP:
				return validateSbReceiveStep((SbReceiveStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_WRITE_STEP:
				return validateSbWriteStep((SbWriteStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_RELEASE_STEP:
				return validateSbReleaseStep((SbReleaseStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_READ_STEP:
				return validateSbReadStep((SbReadStep)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_STEP_PRECEDENCE_RELATION:
				return validateSbStepPrecedenceRelation((SbStepPrecedenceRelation)value, diagnostics, context);
			case SoftwareBehaviorPackage.SB_ACTION_STEP:
				return validateSbActionStep((SbActionStep)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalBehavior(GlobalBehavior globalBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalBehavior, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalBehavior_GlobalBehaviourRule1(globalBehavior, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalBehavior_GlobalBehaviourRule2(globalBehavior, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the GlobalBehaviourRule1 constraint of '<em>Global Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_BEHAVIOR__GLOBAL_BEHAVIOUR_RULE1__EEXPRESSION = "self.triggers->notEmpty() implies rootTrigger.oclAsSet()->notEmpty()";

	/**
	 * Validates the GlobalBehaviourRule1 constraint of '<em>Global Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalBehavior_GlobalBehaviourRule1(GlobalBehavior globalBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.GLOBAL_BEHAVIOR,
				 globalBehavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GlobalBehaviourRule1",
				 GLOBAL_BEHAVIOR__GLOBAL_BEHAVIOUR_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the GlobalBehaviourRule2 constraint of '<em>Global Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_BEHAVIOR__GLOBAL_BEHAVIOUR_RULE2__EEXPRESSION = "self.sequencingRelations->select(r | r.oclIsTypeOf(SbPrecedenceRelation))->forAll(pr1,pr2 | pr1 <> pr2 and pr1.targetSchedulingActivity = pr2.sourceSchedulingActivity implies pr1.sourceSchedulingActivity <> pr2. targetSchedulingActivity)";

	/**
	 * Validates the GlobalBehaviourRule2 constraint of '<em>Global Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalBehavior_GlobalBehaviourRule2(GlobalBehavior globalBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.GLOBAL_BEHAVIOR,
				 globalBehavior,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GlobalBehaviourRule2",
				 GLOBAL_BEHAVIOR__GLOBAL_BEHAVIOUR_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTrigger(SbTrigger sbTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTimeTrigger(SbTimeTrigger sbTimeTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbTimeTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTimeTrigger_SbTimeTriggerRule1(sbTimeTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTimeTrigger_SbTimeTriggerRule2(sbTimeTrigger, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbTimeTriggerRule1 constraint of '<em>Sb Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TIME_TRIGGER__SB_TIME_TRIGGER_RULE1__EEXPRESSION = "GlobalBehaviour.allInstances()->forAll(gb | gb.rootTrigger = self implies self.rtpStartTime->isEmpty())";

	/**
	 * Validates the SbTimeTriggerRule1 constraint of '<em>Sb Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTimeTrigger_SbTimeTriggerRule1(SbTimeTrigger sbTimeTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TIME_TRIGGER,
				 sbTimeTrigger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTimeTriggerRule1",
				 SB_TIME_TRIGGER__SB_TIME_TRIGGER_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTimeTriggerRule2 constraint of '<em>Sb Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TIME_TRIGGER__SB_TIME_TRIGGER_RULE2__EEXPRESSION = "SbTimeTrigger.allInstances()->forAll(tt1 : SbTimeTrigger, tt2 : SbTimeTrigger | tt1.schedulingActivities->notEmpty() and tt1.rtpStartTime->notEmpty() and tt1.rtpStartTime.referring->notEmpty() and tt1.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and tt1.rtpStartTime.referring.oclAsType (RealTimeProperties ::RtpHelperTypes::RtpTimeReferenceType).timeLink->notEmpty() and tt2.rtpStartTime ->notEmpty() and tt2.rtpStartTime.referring->notEmpty() and tt2.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and  tt2.rtpStartTime. referring.oclAsType(RealTimeProperties::RtpHelperTypes:: RtpTimeReferenceType).timeLink->notEmpty() and tt1. schedulingActivities ->includes (tt2.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity) implies tt2.schedulingActivities->excludes(tt1.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity))\r\n" +
		"";

	/**
	 * Validates the SbTimeTriggerRule2 constraint of '<em>Sb Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTimeTrigger_SbTimeTriggerRule2(SbTimeTrigger sbTimeTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TIME_TRIGGER,
				 sbTimeTrigger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTimeTriggerRule2",
				 SB_TIME_TRIGGER__SB_TIME_TRIGGER_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbExternalEventTrigger(SbExternalEventTrigger sbExternalEventTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbExternalEventTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbSchedulingActivity(SbSchedulingActivity sbSchedulingActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbSchedulingActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbTaskActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule1(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule2(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule3(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule4(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule5(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule6(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule7(sbTaskActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbTaskActivity_SbTaskActivityRule8(sbTaskActivity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule1 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE1__EEXPRESSION = "self.oclAsType(SbSchedulingActivity).trigger->isEmpty() implies self.oclAsType(SbSchedulingActivity).inputSquencingRelation->notEmpty()";

	/**
	 * Validates the SbTaskActivityRule1 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule1(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule1",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule2 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE2__EEXPRESSION = "(self.actionSteps->notEmpty() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep) or s.oclIsTypeOf(SbAcquireStep)) )-> size()>0)  implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))->size() = (self.actionSteps->select(s| s.oclIsTypeOf(SbAcquireStep)))->size() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))-> size() <= self.representedTask.rtpMutualExclusionResourceUtilization->size())";

	/**
	 * Validates the SbTaskActivityRule2 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule2(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule2",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule3 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE3__EEXPRESSION = "(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size() <= (self.representedTask.commWritingResources->select(wr | wr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())";

	/**
	 * Validates the SbTaskActivityRule3 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule3(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule3",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule4 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE4__EEXPRESSION = "(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size() <= (self.representedTask.commReadingResources->select(rr :SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())";

	/**
	 * Validates the SbTaskActivityRule4 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule4(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule4",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule5 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE5__EEXPRESSION = "(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size()>0) implies ( (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size() <= (self.representedTask.commWritingResources->select(wr : SoftwareOperators::SoCommunicationResource| wr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())";

	/**
	 * Validates the SbTaskActivityRule5 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule5(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule5",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE5__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule6 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE6__EEXPRESSION = "( self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep | s.oclIsTypeOf(SbReceiveStep)))->size()>0 ) implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReceiveStep)))->size() <= (self.representedTask.commReadingResources->select(rr:SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())\r\n" +
		"";

	/**
	 * Validates the SbTaskActivityRule6 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule6(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule6",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE6__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule7 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE7__EEXPRESSION = "self.actionSteps->notEmpty() implies ( (self.actionSteps->select(gr : SbStep| gr.interactionResource->notEmpty())->collect(s : SbStep | s.interactionResource))->forAll(rsc:SoftwareOperators::SoInteractionResource | rsc.oclIsKindOf (SoftwareOperators::SoInteractionResource) implies self.representedTask.mutualExclusionResources->includes(rsc) or ( self.representedTask. commWritingResources->includes(rsc) or self.representedTask.commReadingResources->includes(rsc))) )";

	/**
	 * Validates the SbTaskActivityRule7 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule7(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule7",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE7__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbTaskActivityRule8 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE8__EEXPRESSION = "self.actionSteps->select(s | s.oclIsTypeOf(SbAcquireStep) or s.oclIsTypeOf(SbReleaseStep))->forAll(a , b | a.oclIsTypeOf(SbAcquireStep) and b.oclIsTypeOf(SbReleaseStep) and a.oclAsType(SbStep).interactionResource = b.oclAsType(SbStep).interactionResource implies a.oclAsType(SbStep).stepPredecessors->excludes(b))";

	/**
	 * Validates the SbTaskActivityRule8 constraint of '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbTaskActivity_SbTaskActivityRule8(SbTaskActivity sbTaskActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_TASK_ACTIVITY,
				 sbTaskActivity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbTaskActivityRule8",
				 SB_TASK_ACTIVITY__SB_TASK_ACTIVITY_RULE8__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbPrecedenceRelation(SbPrecedenceRelation sbPrecedenceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbPrecedenceRelation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbPrecedenceRelation_SbPrecedenceRelationRule1(sbPrecedenceRelation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbPrecedenceRelationRule1 constraint of '<em>Sb Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_PRECEDENCE_RELATION__SB_PRECEDENCE_RELATION_RULE1__EEXPRESSION = "self.targetSchedulingActivity <> self.sourceSchedulingActivity";

	/**
	 * Validates the SbPrecedenceRelationRule1 constraint of '<em>Sb Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbPrecedenceRelation_SbPrecedenceRelationRule1(SbPrecedenceRelation sbPrecedenceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_PRECEDENCE_RELATION,
				 sbPrecedenceRelation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbPrecedenceRelationRule1",
				 SB_PRECEDENCE_RELATION__SB_PRECEDENCE_RELATION_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbSequencingRelation(SbSequencingRelation sbSequencingRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbSequencingRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbCommunicationRelation(SbCommunicationRelation sbCommunicationRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbCommunicationRelation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbCommunicationRelation_SbCommunicationRelationRule1(sbCommunicationRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbCommunicationRelation_SbCommunicationRelationRule2(sbCommunicationRelation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbCommunicationRelationRule1 constraint of '<em>Sb Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_COMMUNICATION_RELATION__SB_COMMUNICATION_RELATION_RULE1__EEXPRESSION = "self.targetSchedulingActivity <> self.sourceSchedulingActivity";

	/**
	 * Validates the SbCommunicationRelationRule1 constraint of '<em>Sb Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbCommunicationRelation_SbCommunicationRelationRule1(SbCommunicationRelation sbCommunicationRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_COMMUNICATION_RELATION,
				 sbCommunicationRelation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbCommunicationRelationRule1",
				 SB_COMMUNICATION_RELATION__SB_COMMUNICATION_RELATION_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbCommunicationRelationRule2 constraint of '<em>Sb Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_COMMUNICATION_RELATION__SB_COMMUNICATION_RELATION_RULE2__EEXPRESSION = "(self.commResource.writerTasks-> includes (self.oclAsType(SbSequencingRelation). sourceSchedulingActivity.oclAsType(SbTaskActivity).representedTask)) and (self.commResource.readerTasks->includes(self.oclAsType(SbSequencingRelation). targetSchedulingActivity.oclAsType(SbTaskActivity).representedTask))";

	/**
	 * Validates the SbCommunicationRelationRule2 constraint of '<em>Sb Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbCommunicationRelation_SbCommunicationRelationRule2(SbCommunicationRelation sbCommunicationRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_COMMUNICATION_RELATION,
				 sbCommunicationRelation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbCommunicationRelationRule2",
				 SB_COMMUNICATION_RELATION__SB_COMMUNICATION_RELATION_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbStep(SbStep sbStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbStep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbAcquireStep(SbAcquireStep sbAcquireStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbAcquireStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbAcquireStep_SbAcquireStepRule1(sbAcquireStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbAcquireStep_SbAcquireStepRule2(sbAcquireStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbAcquireStepRule1 constraint of '<em>Sb Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_ACQUIRE_STEP__SB_ACQUIRE_STEP_RULE1__EEXPRESSION = "self.oclAsType(SbStep).interactionResource->notEmpty()";

	/**
	 * Validates the SbAcquireStepRule1 constraint of '<em>Sb Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbAcquireStep_SbAcquireStepRule1(SbAcquireStep sbAcquireStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_ACQUIRE_STEP,
				 sbAcquireStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbAcquireStepRule1",
				 SB_ACQUIRE_STEP__SB_ACQUIRE_STEP_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbAcquireStepRule2 constraint of '<em>Sb Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_ACQUIRE_STEP__SB_ACQUIRE_STEP_RULE2__EEXPRESSION = "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource)or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource .oclAsType(SoftwareOperators:: SoLocalCommResource). rtpProtectProtocol-> notEmpty())";

	/**
	 * Validates the SbAcquireStepRule2 constraint of '<em>Sb Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbAcquireStep_SbAcquireStepRule2(SbAcquireStep sbAcquireStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_ACQUIRE_STEP,
				 sbAcquireStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbAcquireStepRule2",
				 SB_ACQUIRE_STEP__SB_ACQUIRE_STEP_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbSendStep(SbSendStep sbSendStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbSendStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbSendStep_SbSendStepRule1(sbSendStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbSendStep_SbSendStepRule2(sbSendStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbSendStepRule1 constraint of '<em>Sb Send Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_SEND_STEP__SB_SEND_STEP_RULE1__EEXPRESSION = "self.oclAsType(SbStep).interactionResource->notEmpty()";

	/**
	 * Validates the SbSendStepRule1 constraint of '<em>Sb Send Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbSendStep_SbSendStepRule1(SbSendStep sbSendStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_SEND_STEP,
				 sbSendStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbSendStepRule1",
				 SB_SEND_STEP__SB_SEND_STEP_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbSendStepRule2 constraint of '<em>Sb Send Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_SEND_STEP__SB_SEND_STEP_RULE2__EEXPRESSION = "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)";

	/**
	 * Validates the SbSendStepRule2 constraint of '<em>Sb Send Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbSendStep_SbSendStepRule2(SbSendStep sbSendStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_SEND_STEP,
				 sbSendStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbSendStepRule2",
				 SB_SEND_STEP__SB_SEND_STEP_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReceiveStep(SbReceiveStep sbReceiveStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbReceiveStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbReceiveStep_SbReceiveStepRule1(sbReceiveStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbReceiveStep_SbReceiveStepRule2(sbReceiveStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbReceiveStepRule1 constraint of '<em>Sb Receive Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_RECEIVE_STEP__SB_RECEIVE_STEP_RULE1__EEXPRESSION = "self.oclAsType(SbStep).interactionResource->notEmpty()";

	/**
	 * Validates the SbReceiveStepRule1 constraint of '<em>Sb Receive Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReceiveStep_SbReceiveStepRule1(SbReceiveStep sbReceiveStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_RECEIVE_STEP,
				 sbReceiveStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbReceiveStepRule1",
				 SB_RECEIVE_STEP__SB_RECEIVE_STEP_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbReceiveStepRule2 constraint of '<em>Sb Receive Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_RECEIVE_STEP__SB_RECEIVE_STEP_RULE2__EEXPRESSION = "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)";

	/**
	 * Validates the SbReceiveStepRule2 constraint of '<em>Sb Receive Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReceiveStep_SbReceiveStepRule2(SbReceiveStep sbReceiveStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_RECEIVE_STEP,
				 sbReceiveStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbReceiveStepRule2",
				 SB_RECEIVE_STEP__SB_RECEIVE_STEP_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbWriteStep(SbWriteStep sbWriteStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbWriteStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbWriteStep_SbWriteStepRule1(sbWriteStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbWriteStep_SbWriteStepRule2(sbWriteStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbWriteStepRule1 constraint of '<em>Sb Write Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_WRITE_STEP__SB_WRITE_STEP_RULE1__EEXPRESSION = "self.oclAsType(SbStep).interactionResource->notEmpty()";

	/**
	 * Validates the SbWriteStepRule1 constraint of '<em>Sb Write Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbWriteStep_SbWriteStepRule1(SbWriteStep sbWriteStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_WRITE_STEP,
				 sbWriteStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbWriteStepRule1",
				 SB_WRITE_STEP__SB_WRITE_STEP_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbWriteStepRule2 constraint of '<em>Sb Write Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_WRITE_STEP__SB_WRITE_STEP_RULE2__EEXPRESSION = "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)";

	/**
	 * Validates the SbWriteStepRule2 constraint of '<em>Sb Write Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbWriteStep_SbWriteStepRule2(SbWriteStep sbWriteStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_WRITE_STEP,
				 sbWriteStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbWriteStepRule2",
				 SB_WRITE_STEP__SB_WRITE_STEP_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReleaseStep(SbReleaseStep sbReleaseStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbReleaseStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbReleaseStep_SbReleaseStepRule1(sbReleaseStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbReleaseStep_SbReleaseStepRule2(sbReleaseStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbReleaseStepRule1 constraint of '<em>Sb Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_RELEASE_STEP__SB_RELEASE_STEP_RULE1__EEXPRESSION = "self.oclAsType(SbStep).interactionResource->notEmpty()";

	/**
	 * Validates the SbReleaseStepRule1 constraint of '<em>Sb Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReleaseStep_SbReleaseStepRule1(SbReleaseStep sbReleaseStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_RELEASE_STEP,
				 sbReleaseStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbReleaseStepRule1",
				 SB_RELEASE_STEP__SB_RELEASE_STEP_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbReleaseStepRule2 constraint of '<em>Sb Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_RELEASE_STEP__SB_RELEASE_STEP_RULE2__EEXPRESSION = "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource) or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource.oclAsType(SoftwareOperators::SoLocalCommResource). rtpProtectProtocol -> notEmpty())";

	/**
	 * Validates the SbReleaseStepRule2 constraint of '<em>Sb Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReleaseStep_SbReleaseStepRule2(SbReleaseStep sbReleaseStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_RELEASE_STEP,
				 sbReleaseStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbReleaseStepRule2",
				 SB_RELEASE_STEP__SB_RELEASE_STEP_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReadStep(SbReadStep sbReadStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbReadStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbReadStep_SbReadStepRule1(sbReadStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbReadStep_SbReadStepRule2(sbReadStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbReadStepRule1 constraint of '<em>Sb Read Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_READ_STEP__SB_READ_STEP_RULE1__EEXPRESSION = "self.oclAsType(SbStep).interactionResource->notEmpty()";

	/**
	 * Validates the SbReadStepRule1 constraint of '<em>Sb Read Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReadStep_SbReadStepRule1(SbReadStep sbReadStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_READ_STEP,
				 sbReadStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbReadStepRule1",
				 SB_READ_STEP__SB_READ_STEP_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbReadStepRule2 constraint of '<em>Sb Read Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_READ_STEP__SB_READ_STEP_RULE2__EEXPRESSION = "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)";

	/**
	 * Validates the SbReadStepRule2 constraint of '<em>Sb Read Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbReadStep_SbReadStepRule2(SbReadStep sbReadStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_READ_STEP,
				 sbReadStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbReadStepRule2",
				 SB_READ_STEP__SB_READ_STEP_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbStepPrecedenceRelation(SbStepPrecedenceRelation sbStepPrecedenceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sbStepPrecedenceRelation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbStepPrecedenceRelation_SbStepPrecedenceRelationRule1(sbStepPrecedenceRelation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSbStepPrecedenceRelation_SbStepPrecedenceRelationRule2(sbStepPrecedenceRelation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SbStepPrecedenceRelationRule1 constraint of '<em>Sb Step Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_STEP_PRECEDENCE_RELATION__SB_STEP_PRECEDENCE_RELATION_RULE1__EEXPRESSION = "self.sourceStep.oclIsTypeOf(SbAcquireStep) implies not self.targetStep.oclIsTypeOf(SbAcquireStep)";

	/**
	 * Validates the SbStepPrecedenceRelationRule1 constraint of '<em>Sb Step Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbStepPrecedenceRelation_SbStepPrecedenceRelationRule1(SbStepPrecedenceRelation sbStepPrecedenceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_STEP_PRECEDENCE_RELATION,
				 sbStepPrecedenceRelation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbStepPrecedenceRelationRule1",
				 SB_STEP_PRECEDENCE_RELATION__SB_STEP_PRECEDENCE_RELATION_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SbStepPrecedenceRelationRule2 constraint of '<em>Sb Step Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SB_STEP_PRECEDENCE_RELATION__SB_STEP_PRECEDENCE_RELATION_RULE2__EEXPRESSION = "self.sourceStep.oclIsTypeOf(SbReleaseStep) implies not self.targetStep.oclIsTypeOf(SbReleaseStep)";

	/**
	 * Validates the SbStepPrecedenceRelationRule2 constraint of '<em>Sb Step Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbStepPrecedenceRelation_SbStepPrecedenceRelationRule2(SbStepPrecedenceRelation sbStepPrecedenceRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareBehaviorPackage.Literals.SB_STEP_PRECEDENCE_RELATION,
				 sbStepPrecedenceRelation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SbStepPrecedenceRelationRule2",
				 SB_STEP_PRECEDENCE_RELATION__SB_STEP_PRECEDENCE_RELATION_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSbActionStep(SbActionStep sbActionStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sbActionStep, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SoftwareBehaviorValidator
