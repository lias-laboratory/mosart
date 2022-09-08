/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Send Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbSendStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbSendStepRule1 SbSendStepRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbSendStepRule1='self.oclAsType(SbStep).interactionResource->notEmpty()' SbSendStepRule2='self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)'"
 * @generated
 */
public interface SbSendStep extends SbStep {
} // SbSendStep
