/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Acquire Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbAcquireStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbAcquireStepRule1 SbAcquireStepRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbAcquireStepRule1='self.oclAsType(SbStep).interactionResource->notEmpty()' SbAcquireStepRule2='self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource)or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource .oclAsType(SoftwareOperators:: SoLocalCommResource). rtpProtectProtocol-> notEmpty())'"
 * @generated
 */
public interface SbAcquireStep extends SbStep {
} // SbAcquireStep
