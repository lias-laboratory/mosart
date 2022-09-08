/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Release Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbReleaseStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbReleaseStepRule1 SbReleaseStepRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbReleaseStepRule1='self.oclAsType(SbStep).interactionResource->notEmpty()' SbReleaseStepRule2='self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource) or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource.oclAsType(SoftwareOperators::SoLocalCommResource). rtpProtectProtocol -> notEmpty())'"
 * @generated
 */
public interface SbReleaseStep extends SbStep {
} // SbReleaseStep
