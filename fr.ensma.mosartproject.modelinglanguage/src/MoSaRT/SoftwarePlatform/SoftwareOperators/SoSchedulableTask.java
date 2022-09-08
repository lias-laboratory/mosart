/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>So Schedulable Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getProcess <em>Process</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResources <em>Mutual Exclusion Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommWritingResources <em>Comm Writing Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getCommReadingResources <em>Comm Reading Resources</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getMutualExclusionResourceUtilization <em>Mutual Exclusion Resource Utilization</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getFavoriteProcessors <em>Favorite Processors</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRunOnProcessors <em>Run On Processors</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRepresentedActivity <em>Represented Activity</em>}</li>
 *   <li>{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRtpMutualExclusionResourceUtilization <em>Rtp Mutual Exclusion Resource Utilization</em>}</li>
 * </ul>
 *
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SoSchedulableTaskRule1 SoSchedulableTaskRule2 SoSchedulableTaskRule3 SoSchedulableTaskRule4 SoSchedulableTaskRule5'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SoSchedulableTaskRule1='self.rtpMutualExclusionResourceUtilization->size() = ( SoLocalCommResource.allInstances()->select(r : SoLocalCommResource | (self.commWritingResources->includes(r) or self.commReadingResources->includes(r) ) and r.rtpProtectProtocol->notEmpty())->size() + self.mutualExclusionResources->size() )' SoSchedulableTaskRule2='self.rtpMutualExclusionResourceUtilization->size() = self.mutualExclusionResources->size() + self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty() )->size() + self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty())->size()' SoSchedulableTaskRule3='self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoMutualExclusionResource))->includesAll(self.mutualExclusionResources)' SoSchedulableTaskRule4='self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))' SoSchedulableTaskRule5='self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))'"
 * @generated
 */
public interface SoSchedulableTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSchedulableTasks <em>Schedulable Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(SoSpaceProcess)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_Process()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getSchedulableTasks
	 * @model opposite="schedulableTasks" required="true"
	 * @generated
	 */
	SoSpaceProcess getProcess();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(SoSpaceProcess value);

	/**
	 * Returns the value of the '<em><b>Mutual Exclusion Resources</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutual Exclusion Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual Exclusion Resources</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_MutualExclusionResources()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource#getTasks
	 * @model opposite="tasks"
	 * @generated
	 */
	EList<SoMutualExclusionResource> getMutualExclusionResources();

	/**
	 * Returns the value of the '<em><b>Comm Writing Resources</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getWriterTasks <em>Writer Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Writing Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Writing Resources</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_CommWritingResources()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getWriterTasks
	 * @model opposite="writerTasks"
	 * @generated
	 */
	EList<SoCommunicationResource> getCommWritingResources();

	/**
	 * Returns the value of the '<em><b>Comm Reading Resources</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getReaderTasks <em>Reader Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Reading Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Reading Resources</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_CommReadingResources()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource#getReaderTasks
	 * @model opposite="readerTasks"
	 * @generated
	 */
	EList<SoCommunicationResource> getCommReadingResources();

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mutual Exclusion Resource Utilization</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutual Exclusion Resource Utilization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual Exclusion Resource Utilization</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_MutualExclusionResourceUtilization()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpMutualExclusionResourceUtilization'"
	 * @generated
	 */
	EList<RtpMutuExcluResourceUtilizationType> getMutualExclusionResourceUtilization();

	/**
	 * Returns the value of the '<em><b>Favorite Processors</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCandidateTasks <em>Candidate Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Favorite Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Favorite Processors</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_FavoriteProcessors()
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getCandidateTasks
	 * @model opposite="candidateTasks"
	 * @generated
	 */
	EList<HpProcessingUnit> getFavoriteProcessors();

	/**
	 * Returns the value of the '<em><b>Run On Processors</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getSchedulableTasks <em>Schedulable Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run On Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run On Processors</em>' reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_RunOnProcessors()
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getSchedulableTasks
	 * @model opposite="schedulableTasks"
	 * @generated
	 */
	EList<HpProcessingUnit> getRunOnProcessors();

	/**
	 * Returns the value of the '<em><b>Represented Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepresentedTask <em>Represented Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Activity</em>' reference.
	 * @see #setRepresentedActivity(SbTaskActivity)
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_RepresentedActivity()
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity#getRepresentedTask
	 * @model opposite="representedTask"
	 * @generated
	 */
	SbTaskActivity getRepresentedActivity();

	/**
	 * Sets the value of the '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRepresentedActivity <em>Represented Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Activity</em>' reference.
	 * @see #getRepresentedActivity()
	 * @generated
	 */
	void setRepresentedActivity(SbTaskActivity value);

	/**
	 * Returns the value of the '<em><b>Rtp Mutual Exclusion Resource Utilization</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Mutual Exclusion Resource Utilization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Mutual Exclusion Resource Utilization</em>' containment reference list.
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#getSoSchedulableTask_RtpMutualExclusionResourceUtilization()
	 * @model containment="true"
	 * @generated
	 */
	EList<RtpMutuExcluResourceUtilizationType> getRtpMutualExclusionResourceUtilization();

} // SoSchedulableTask
