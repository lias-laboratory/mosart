/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage
 * @generated
 */
public interface SoftwareBehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareBehaviorFactory eINSTANCE = MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Global Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Behavior</em>'.
	 * @generated
	 */
	GlobalBehavior createGlobalBehavior();

	/**
	 * Returns a new object of class '<em>Sb Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Time Trigger</em>'.
	 * @generated
	 */
	SbTimeTrigger createSbTimeTrigger();

	/**
	 * Returns a new object of class '<em>Sb External Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb External Event Trigger</em>'.
	 * @generated
	 */
	SbExternalEventTrigger createSbExternalEventTrigger();

	/**
	 * Returns a new object of class '<em>Sb Task Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Task Activity</em>'.
	 * @generated
	 */
	SbTaskActivity createSbTaskActivity();

	/**
	 * Returns a new object of class '<em>Sb Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Precedence Relation</em>'.
	 * @generated
	 */
	SbPrecedenceRelation createSbPrecedenceRelation();

	/**
	 * Returns a new object of class '<em>Sb Communication Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Communication Relation</em>'.
	 * @generated
	 */
	SbCommunicationRelation createSbCommunicationRelation();

	/**
	 * Returns a new object of class '<em>Sb Acquire Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Acquire Step</em>'.
	 * @generated
	 */
	SbAcquireStep createSbAcquireStep();

	/**
	 * Returns a new object of class '<em>Sb Send Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Send Step</em>'.
	 * @generated
	 */
	SbSendStep createSbSendStep();

	/**
	 * Returns a new object of class '<em>Sb Receive Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Receive Step</em>'.
	 * @generated
	 */
	SbReceiveStep createSbReceiveStep();

	/**
	 * Returns a new object of class '<em>Sb Write Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Write Step</em>'.
	 * @generated
	 */
	SbWriteStep createSbWriteStep();

	/**
	 * Returns a new object of class '<em>Sb Release Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Release Step</em>'.
	 * @generated
	 */
	SbReleaseStep createSbReleaseStep();

	/**
	 * Returns a new object of class '<em>Sb Read Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Read Step</em>'.
	 * @generated
	 */
	SbReadStep createSbReadStep();

	/**
	 * Returns a new object of class '<em>Sb Step Precedence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Step Precedence Relation</em>'.
	 * @generated
	 */
	SbStepPrecedenceRelation createSbStepPrecedenceRelation();

	/**
	 * Returns a new object of class '<em>Sb Action Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sb Action Step</em>'.
	 * @generated
	 */
	SbActionStep createSbActionStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftwareBehaviorPackage getSoftwareBehaviorPackage();

} //SoftwareBehaviorFactory
