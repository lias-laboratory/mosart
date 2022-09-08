/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Receive Step</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbReceiveStep()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbReceiveStepRule1 SbReceiveStepRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbReceiveStepRule1='self.oclAsType(SbStep).interactionResource->notEmpty()' SbReceiveStepRule2='self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)'"
 * @generated
 */
public interface SbReceiveStep extends SbStep {
} // SbReceiveStep
