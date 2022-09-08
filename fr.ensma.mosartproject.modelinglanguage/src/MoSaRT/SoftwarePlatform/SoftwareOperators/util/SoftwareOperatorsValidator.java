/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.util;

import MoSaRT.SoftwarePlatform.SoftwareOperators.*;

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
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage
 * @generated
 */
public class SoftwareOperatorsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SoftwareOperatorsValidator INSTANCE = new SoftwareOperatorsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "MoSaRT.SoftwarePlatform.SoftwareOperators";

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
	public SoftwareOperatorsValidator() {
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
	  return SoftwareOperatorsPackage.eINSTANCE;
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
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE:
				return validateSystemSoftwareSide((SystemSoftwareSide)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK:
				return validateSoSchedulableTask((SoSchedulableTask)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS:
				return validateSoSpaceProcess((SoSpaceProcess)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_INTERACTION_RESOURCE:
				return validateSoInteractionResource((SoInteractionResource)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE:
				return validateSoMutualExclusionResource((SoMutualExclusionResource)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_COMMUNICATION_RESOURCE:
				return validateSoCommunicationResource((SoCommunicationResource)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE:
				return validateSoRemoteCommResource((SoRemoteCommResource)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE:
				return validateSoLocalCommResource((SoLocalCommResource)value, diagnostics, context);
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA:
				return validateSoTransmittedData((SoTransmittedData)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSoftwareSide(SystemSoftwareSide systemSoftwareSide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemSoftwareSide, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemSoftwareSide, diagnostics, context);
		if (result || diagnostics != null) result &= validateSystemSoftwareSide_SystemSoftwareSideRule1(systemSoftwareSide, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SystemSoftwareSideRule1 constraint of '<em>System Software Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SYSTEM_SOFTWARE_SIDE__SYSTEM_SOFTWARE_SIDE_RULE1__EEXPRESSION = "self.systemBehaviour.sequencingRelations->select(r | r.oclIsTypeOf(SoftwareBehaviour::SbCommunicationRelation))->size() = SoTransmittedData.allInstances()->collect(td : SoTransmittedData | td.targetTasks)->size()->sum() + SoLocalCommResource.allInstances()->collect(rsc : SoLocalCommResource | rsc.readerTasks)->size()->sum()";

	/**
	 * Validates the SystemSoftwareSideRule1 constraint of '<em>System Software Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemSoftwareSide_SystemSoftwareSideRule1(SystemSoftwareSide systemSoftwareSide, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SYSTEM_SOFTWARE_SIDE,
				 systemSoftwareSide,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SystemSoftwareSideRule1",
				 SYSTEM_SOFTWARE_SIDE__SYSTEM_SOFTWARE_SIDE_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSchedulableTask(SoSchedulableTask soSchedulableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(soSchedulableTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSchedulableTask_SoSchedulableTaskRule1(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSchedulableTask_SoSchedulableTaskRule2(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSchedulableTask_SoSchedulableTaskRule3(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSchedulableTask_SoSchedulableTaskRule4(soSchedulableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSchedulableTask_SoSchedulableTaskRule5(soSchedulableTask, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoSchedulableTaskRule1 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE1__EEXPRESSION = "self.rtpMutualExclusionResourceUtilization->size() = ( SoLocalCommResource.allInstances()->select(r : SoLocalCommResource | (self.commWritingResources->includes(r) or self.commReadingResources->includes(r) ) and r.rtpProtectProtocol->notEmpty())->size() + self.mutualExclusionResources->size() )";

	/**
	 * Validates the SoSchedulableTaskRule1 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSchedulableTask_SoSchedulableTaskRule1(SoSchedulableTask soSchedulableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK,
				 soSchedulableTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSchedulableTaskRule1",
				 SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSchedulableTaskRule2 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE2__EEXPRESSION = "self.rtpMutualExclusionResourceUtilization->size() = self.mutualExclusionResources->size() + self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty() )->size() + self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty())->size()";

	/**
	 * Validates the SoSchedulableTaskRule2 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSchedulableTask_SoSchedulableTaskRule2(SoSchedulableTask soSchedulableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK,
				 soSchedulableTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSchedulableTaskRule2",
				 SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSchedulableTaskRule3 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE3__EEXPRESSION = "self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoMutualExclusionResource))->includesAll(self.mutualExclusionResources)";

	/**
	 * Validates the SoSchedulableTaskRule3 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSchedulableTask_SoSchedulableTaskRule3(SoSchedulableTask soSchedulableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK,
				 soSchedulableTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSchedulableTaskRule3",
				 SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSchedulableTaskRule4 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE4__EEXPRESSION = "self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))";

	/**
	 * Validates the SoSchedulableTaskRule4 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSchedulableTask_SoSchedulableTaskRule4(SoSchedulableTask soSchedulableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK,
				 soSchedulableTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSchedulableTaskRule4",
				 SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSchedulableTaskRule5 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE5__EEXPRESSION = "self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))";

	/**
	 * Validates the SoSchedulableTaskRule5 constraint of '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSchedulableTask_SoSchedulableTaskRule5(SoSchedulableTask soSchedulableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK,
				 soSchedulableTask,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSchedulableTaskRule5",
				 SO_SCHEDULABLE_TASK__SO_SCHEDULABLE_TASK_RULE5__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSpaceProcess(SoSpaceProcess soSpaceProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(soSpaceProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSpaceProcess_SoSpaceProcessRule1(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSpaceProcess_SoSpaceProcessRule2(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSpaceProcess_SoSpaceProcessRule3(soSpaceProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoSpaceProcess_SoSpaceProcessRule4(soSpaceProcess, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoSpaceProcessRule1 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE1__EEXPRESSION = "(self.spaceProcessChildren->notEmpty() implies self.spaceProcessChildren->excludes(self)) and (self.spaceProcessParent->notEmpty() implies self.spaceProcessParent <> self)";

	/**
	 * Validates the SoSpaceProcessRule1 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSpaceProcess_SoSpaceProcessRule1(SoSpaceProcess soSpaceProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS,
				 soSpaceProcess,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSpaceProcessRule1",
				 SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSpaceProcessRule2 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE2__EEXPRESSION = "self.allSpaceProcessParents->excludesAll(self.spaceProcessChildren)";

	/**
	 * Validates the SoSpaceProcessRule2 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSpaceProcess_SoSpaceProcessRule2(SoSpaceProcess soSpaceProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS,
				 soSpaceProcess,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSpaceProcessRule2",
				 SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSpaceProcessRule3 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE3__EEXPRESSION = "self.processingUnit->size()>1 implies self.processingUnit->forAll(pr1,pr2 | pr1<>pr2 implies  pr1.processorInterconnector->notEmpty() and pr1.processorInterconnector = pr2.processorInterconnector)";

	/**
	 * Validates the SoSpaceProcessRule3 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSpaceProcess_SoSpaceProcessRule3(SoSpaceProcess soSpaceProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS,
				 soSpaceProcess,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSpaceProcessRule3",
				 SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoSpaceProcessRule4 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE4__EEXPRESSION = "(self.spaceProcessChildren->isEmpty() or self.spaceProcessParent->isEmpty()) implies self.processingUnit->notEmpty()";

	/**
	 * Validates the SoSpaceProcessRule4 constraint of '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoSpaceProcess_SoSpaceProcessRule4(SoSpaceProcess soSpaceProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS,
				 soSpaceProcess,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoSpaceProcessRule4",
				 SO_SPACE_PROCESS__SO_SPACE_PROCESS_RULE4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoInteractionResource(SoInteractionResource soInteractionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soInteractionResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoMutualExclusionResource(SoMutualExclusionResource soMutualExclusionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(soMutualExclusionResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(soMutualExclusionResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoMutualExclusionResource_SoMutualExclusionResourceRule1(soMutualExclusionResource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoMutualExclusionResourceRule1 constraint of '<em>So Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_MUTUAL_EXCLUSION_RESOURCE__SO_MUTUAL_EXCLUSION_RESOURCE_RULE1__EEXPRESSION = "self.tasks->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)";

	/**
	 * Validates the SoMutualExclusionResourceRule1 constraint of '<em>So Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoMutualExclusionResource_SoMutualExclusionResourceRule1(SoMutualExclusionResource soMutualExclusionResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_MUTUAL_EXCLUSION_RESOURCE,
				 soMutualExclusionResource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoMutualExclusionResourceRule1",
				 SO_MUTUAL_EXCLUSION_RESOURCE__SO_MUTUAL_EXCLUSION_RESOURCE_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoCommunicationResource(SoCommunicationResource soCommunicationResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soCommunicationResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoRemoteCommResource(SoRemoteCommResource soRemoteCommResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(soRemoteCommResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoLocalCommResource(SoLocalCommResource soLocalCommResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(soLocalCommResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(soLocalCommResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoLocalCommResource_SoLocalCommResourceRule1(soLocalCommResource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoLocalCommResourceRule1 constraint of '<em>So Local Comm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_LOCAL_COMM_RESOURCE__SO_LOCAL_COMM_RESOURCE_RULE1__EEXPRESSION = "(self.oclAsType(SoCommunicationResource).writerTasks->union(self.oclAsType(SoCommunicationResource).readerTasks))->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)";

	/**
	 * Validates the SoLocalCommResourceRule1 constraint of '<em>So Local Comm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoLocalCommResource_SoLocalCommResourceRule1(SoLocalCommResource soLocalCommResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_LOCAL_COMM_RESOURCE,
				 soLocalCommResource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoLocalCommResourceRule1",
				 SO_LOCAL_COMM_RESOURCE__SO_LOCAL_COMM_RESOURCE_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoTransmittedData(SoTransmittedData soTransmittedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(soTransmittedData, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoTransmittedData_SoTransmittedDataRule1(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoTransmittedData_SoTransmittedDataRule2(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoTransmittedData_SoTransmittedDataRule3(soTransmittedData, diagnostics, context);
		if (result || diagnostics != null) result &= validateSoTransmittedData_SoTransmittedDataRule4(soTransmittedData, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the SoTransmittedDataRule1 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE1__EEXPRESSION = "self.targetTasks->excludes(self.sourceTask)";

	/**
	 * Validates the SoTransmittedDataRule1 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoTransmittedData_SoTransmittedDataRule1(SoTransmittedData soTransmittedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_TRANSMITTED_DATA,
				 soTransmittedData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoTransmittedDataRule1",
				 SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE1__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoTransmittedDataRule2 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE2__EEXPRESSION = "SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).readerTasks -> includesAll(self.targetTasks))";

	/**
	 * Validates the SoTransmittedDataRule2 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoTransmittedData_SoTransmittedDataRule2(SoTransmittedData soTransmittedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_TRANSMITTED_DATA,
				 soTransmittedData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoTransmittedDataRule2",
				 SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE2__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoTransmittedDataRule3 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE3__EEXPRESSION = "SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).writerTasks -> includes(self.sourceTask))";

	/**
	 * Validates the SoTransmittedDataRule3 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoTransmittedData_SoTransmittedDataRule3(SoTransmittedData soTransmittedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_TRANSMITTED_DATA,
				 soTransmittedData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoTransmittedDataRule3",
				 SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE3__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SoTransmittedDataRule4 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE4__EEXPRESSION = "self.targetTasks->forAll( t : SoSchedulableTask | t.process->notEmpty() implies t.process <> self.sourceTask.process)";

	/**
	 * Validates the SoTransmittedDataRule4 constraint of '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSoTransmittedData_SoTransmittedDataRule4(SoTransmittedData soTransmittedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoftwareOperatorsPackage.Literals.SO_TRANSMITTED_DATA,
				 soTransmittedData,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SoTransmittedDataRule4",
				 SO_TRANSMITTED_DATA__SO_TRANSMITTED_DATA_RULE4__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //SoftwareOperatorsValidator
