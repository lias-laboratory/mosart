/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getSchedulingActivities <em>Scheduling Activities</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getSequencingRelations <em>Sequencing Relations</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getRootTrigger <em>Root Trigger</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getGlobalBehavior()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='GlobalBehaviourRule1 GlobalBehaviourRule2'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot GlobalBehaviourRule1='self.triggers->notEmpty() implies rootTrigger.oclAsSet()->notEmpty()' GlobalBehaviourRule2='self.sequencingRelations->select(r | r.oclIsTypeOf(SbPrecedenceRelation))->forAll(pr1,pr2 | pr1 <> pr2 and pr1.targetSchedulingActivity = pr2.sourceSchedulingActivity implies pr1.sourceSchedulingActivity <> pr2. targetSchedulingActivity)'"
 * @generated
 */
public interface GlobalBehavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getGlobalBehavior_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<SbTrigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Scheduling Activities</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Activities</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getGlobalBehavior_SchedulingActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<SbSchedulingActivity> getSchedulingActivities();

	/**
	 * Returns the value of the '<em><b>Sequencing Relations</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequencing Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequencing Relations</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getGlobalBehavior_SequencingRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SbSequencingRelation> getSequencingRelations();

	/**
	 * Returns the value of the '<em><b>Root Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Trigger</em>' reference.
	 * @see #setRootTrigger(SbTrigger)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getGlobalBehavior_RootTrigger()
	 * @model
	 * @generated
	 */
	SbTrigger getRootTrigger();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getRootTrigger <em>Root Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Trigger</em>' reference.
	 * @see #getRootTrigger()
	 * @generated
	 */
	void setRootTrigger(SbTrigger value);

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getGlobalBehavior_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // GlobalBehavior
