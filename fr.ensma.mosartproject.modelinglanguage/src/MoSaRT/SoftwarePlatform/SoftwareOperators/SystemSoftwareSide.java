/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Software Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSystemBehavior <em>System Behavior</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSpaceProcesses <em>Space Processes</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getInteractionResources <em>Interaction Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSchedulableTasks <em>Schedulable Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSystemSoftwareSide()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SystemSoftwareSideRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SystemSoftwareSideRule1='self.systemBehaviour.sequencingRelations->select(r | r.oclIsTypeOf(SoftwareBehaviour::SbCommunicationRelation))->size() = SoTransmittedData.allInstances()->collect(td : SoTransmittedData | td.targetTasks)->size()->sum() + SoLocalCommResource.allInstances()->collect(rsc : SoLocalCommResource | rsc.readerTasks)->size()->sum()'"
 * @generated
 */
public interface SystemSoftwareSide extends EObject {
	/**
	 * Returns the value of the '<em><b>System Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Behavior</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Behavior</em>' containment reference.
	 * @see #setSystemBehavior(GlobalBehavior)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSystemSoftwareSide_SystemBehavior()
	 * @model containment="true"
	 * @generated
	 */
	GlobalBehavior getSystemBehavior();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getSystemBehavior <em>System Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Behavior</em>' containment reference.
	 * @see #getSystemBehavior()
	 * @generated
	 */
	void setSystemBehavior(GlobalBehavior value);

	/**
	 * Returns the value of the '<em><b>Space Processes</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Processes</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSystemSoftwareSide_SpaceProcesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoSpaceProcess> getSpaceProcesses();

	/**
	 * Returns the value of the '<em><b>Interaction Resources</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Resources</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSystemSoftwareSide_InteractionResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoInteractionResource> getInteractionResources();

	/**
	 * Returns the value of the '<em><b>Schedulable Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Tasks</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSystemSoftwareSide_SchedulableTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoSchedulableTask> getSchedulableTasks();

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSystemSoftwareSide_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SystemSoftwareSide
