/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Read Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbReadStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbReadStepRule1 SbReadStepRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbReadStepRule1='self.oclAsType(SbStep).interactionResource->notEmpty()' SbReadStepRule2='self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)'"
 * @generated
 */
public interface SbReadStep extends SbStep {
} // SbReadStep
