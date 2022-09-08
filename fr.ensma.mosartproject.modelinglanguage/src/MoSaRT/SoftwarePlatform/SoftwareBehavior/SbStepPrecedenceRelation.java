/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Step Precedence Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getTargetStep <em>Target Step</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getSourceStep <em>Source Step</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStepPrecedenceRelation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SbStepPrecedenceRelationRule1 SbStepPrecedenceRelationRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SbStepPrecedenceRelationRule1='self.sourceStep.oclIsTypeOf(SbAcquireStep) implies not self.targetStep.oclIsTypeOf(SbAcquireStep)' SbStepPrecedenceRelationRule2='self.sourceStep.oclIsTypeOf(SbReleaseStep) implies not self.targetStep.oclIsTypeOf(SbReleaseStep)'"
 * @generated
 */
public interface SbStepPrecedenceRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInputStepRelation <em>Input Step Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Step</em>' reference.
	 * @see #setTargetStep(SbStep)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStepPrecedenceRelation_TargetStep()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getInputStepRelation
	 * @model opposite="inputStepRelation"
	 * @generated
	 */
	SbStep getTargetStep();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getTargetStep <em>Target Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Step</em>' reference.
	 * @see #getTargetStep()
	 * @generated
	 */
	void setTargetStep(SbStep value);

	/**
	 * Returns the value of the '<em><b>Source Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getOutputStepRelation <em>Output Step Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Step</em>' reference.
	 * @see #setSourceStep(SbStep)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStepPrecedenceRelation_SourceStep()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep#getOutputStepRelation
	 * @model opposite="outputStepRelation"
	 * @generated
	 */
	SbStep getSourceStep();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getSourceStep <em>Source Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Step</em>' reference.
	 * @see #getSourceStep()
	 * @generated
	 */
	void setSourceStep(SbStep value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbStepPrecedenceRelation_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SbStepPrecedenceRelation
