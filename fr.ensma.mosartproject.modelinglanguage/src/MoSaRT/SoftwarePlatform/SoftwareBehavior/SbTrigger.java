/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sb Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getSchedulingActivities <em>Scheduling Activities</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTrigger()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SbTrigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheduling Activities</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Activities</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTrigger_SchedulingActivities()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity#getTrigger
	 * @model opposite="trigger"
	 * @generated
	 */
	EList<SbSchedulingActivity> getSchedulingActivities();

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#getSbTrigger_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SbTrigger
