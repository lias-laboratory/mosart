/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Sequencing Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getTargetSchedulingActivity <em>Target Scheduling Activity</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getSourceSchedulingActivity <em>Source Scheduling Activity</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbSequencingRelation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SbSequencingRelation extends EObject {
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbSequencingRelation_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Scheduling Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getInputSquencingRelation <em>Input Squencing Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Scheduling Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scheduling Activity</em>' reference.
	 * @see #setTargetSchedulingActivity(SbSchedulingActivity)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbSequencingRelation_TargetSchedulingActivity()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getInputSquencingRelation
	 * @model opposite="inputSquencingRelation" required="true"
	 * @generated
	 */
	SbSchedulingActivity getTargetSchedulingActivity();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getTargetSchedulingActivity <em>Target Scheduling Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scheduling Activity</em>' reference.
	 * @see #getTargetSchedulingActivity()
	 * @generated
	 */
	void setTargetSchedulingActivity(SbSchedulingActivity value);

	/**
	 * Returns the value of the '<em><b>Source Scheduling Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getOutputSequencingRelation <em>Output Sequencing Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Scheduling Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Scheduling Activity</em>' reference.
	 * @see #setSourceSchedulingActivity(SbSchedulingActivity)
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbSequencingRelation_SourceSchedulingActivity()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getOutputSequencingRelation
	 * @model opposite="outputSequencingRelation" required="true"
	 * @generated
	 */
	SbSchedulingActivity getSourceSchedulingActivity();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation#getSourceSchedulingActivity <em>Source Scheduling Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Scheduling Activity</em>' reference.
	 * @see #getSourceSchedulingActivity()
	 * @generated
	 */
	void setSourceSchedulingActivity(SbSchedulingActivity value);

} // SbSequencingRelation
