/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>So Space Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessParent <em>Space Process Parent</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessChildren <em>Space Process Children</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSchedulableTasks <em>Schedulable Tasks</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getProcessingUnit <em>Processing Unit</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpSchedulingPolicy <em>Rtp Scheduling Policy</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getAllSpaceProcessParents <em>All Space Process Parents</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpTaskAllocation <em>Rtp Task Allocation</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoSpaceProcessRule1 SoSpaceProcessRule2 SoSpaceProcessRule3 SoSpaceProcessRule4'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SoSpaceProcessRule1='(self.spaceProcessChildren->notEmpty() implies self.spaceProcessChildren->excludes(self)) and (self.spaceProcessParent->notEmpty() implies self.spaceProcessParent <> self)' SoSpaceProcessRule2='self.allSpaceProcessParents->excludesAll(self.spaceProcessChildren)' SoSpaceProcessRule3='self.processingUnit->size()>1 implies self.processingUnit->forAll(pr1,pr2 | pr1<>pr2 implies  pr1.processorInterconnector->notEmpty() and pr1.processorInterconnector = pr2.processorInterconnector)' SoSpaceProcessRule4='(self.spaceProcessChildren->isEmpty() or self.spaceProcessParent->isEmpty()) implies self.processingUnit->notEmpty()'"
 * @generated
 */
public interface SoSpaceProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Space Process Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessChildren <em>Space Process Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Process Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Process Parent</em>' reference.
	 * @see #setSpaceProcessParent(SoSpaceProcess)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_SpaceProcessParent()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessChildren
	 * @model opposite="spaceProcessChildren"
	 * @generated
	 */
	SoSpaceProcess getSpaceProcessParent();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessParent <em>Space Process Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Process Parent</em>' reference.
	 * @see #getSpaceProcessParent()
	 * @generated
	 */
	void setSpaceProcessParent(SoSpaceProcess value);

	/**
	 * Returns the value of the '<em><b>Space Process Children</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessParent <em>Space Process Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Process Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Process Children</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_SpaceProcessChildren()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSpaceProcessParent
	 * @model opposite="spaceProcessParent"
	 * @generated
	 */
	EList<SoSpaceProcess> getSpaceProcessChildren();

	/**
	 * Returns the value of the '<em><b>Schedulable Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Tasks</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_SchedulableTasks()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getProcess
	 * @model opposite="process"
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Processing Unit</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getSpaceProcesses <em>Space Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Unit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Unit</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_ProcessingUnit()
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getSpaceProcesses
	 * @model opposite="spaceProcesses"
	 * @generated
	 */
	EList<HpProcessingUnit> getProcessingUnit();

	/**
	 * Returns the value of the '<em><b>Rtp Scheduling Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Scheduling Policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Scheduling Policy</em>' containment reference.
	 * @see #setRtpSchedulingPolicy(RtpSchedulingPolicyType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_RtpSchedulingPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpSchedulingPolicyType getRtpSchedulingPolicy();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpSchedulingPolicy <em>Rtp Scheduling Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Scheduling Policy</em>' containment reference.
	 * @see #getRtpSchedulingPolicy()
	 * @generated
	 */
	void setRtpSchedulingPolicy(RtpSchedulingPolicyType value);

	/**
	 * Returns the value of the '<em><b>All Space Process Parents</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Space Process Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Space Process Parents</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_AllSpaceProcessParents()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<SoSpaceProcess> getAllSpaceProcessParents();

	/**
	 * Returns the value of the '<em><b>Rtp Task Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Task Allocation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Task Allocation</em>' containment reference.
	 * @see #setRtpTaskAllocation(RtpTaskAllocationType)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSpaceProcess_RtpTaskAllocation()
	 * @model containment="true"
	 * @generated
	 */
	RtpTaskAllocationType getRtpTaskAllocation();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getRtpTaskAllocation <em>Rtp Task Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Task Allocation</em>' containment reference.
	 * @see #getRtpTaskAllocation()
	 * @generated
	 */
	void setRtpTaskAllocation(RtpTaskAllocationType value);

} // SoSpaceProcess
