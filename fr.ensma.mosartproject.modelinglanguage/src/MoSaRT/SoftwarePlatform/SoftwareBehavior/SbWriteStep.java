/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Write Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbWriteStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbWriteStepRule1 SbWriteStepRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbWriteStepRule1='self.oclAsType(SbStep).interactionResource->notEmpty()' SbWriteStepRule2='self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)'"
 * @generated
 */
public interface SbWriteStep extends SbStep {
} // SbWriteStep
