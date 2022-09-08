/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

import MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Processing Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpUtilizationFactor <em>Rtp Utilization Factor</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getSpaceProcesses <em>Space Processes</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCandidateTasks <em>Candidate Tasks</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getSchedulableTasks <em>Schedulable Tasks</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getUtilizationFactor <em>Utilization Factor</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnector <em>Processor Interconnector</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpComputingSpeed <em>Rtp Computing Speed</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HpProcessingUnitRule1 HpProcessingUnitRule2 HpProcessingUnitRule3'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot HpProcessingUnitRule1='(self.commChannel->notEmpty() and self.processorInterconnector->notEmpty()) implies  self.commChannel<>self.processorInterconnector.commChannel' HpProcessingUnitRule2='self.candidateTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.candidateTasks)' HpProcessingUnitRule3='self.schedulableTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.schedulableTasks)'"
 * @generated
 */
public interface HpProcessingUnit extends HpNetworkNode {
	/**
	 * Returns the value of the '<em><b>Comm Channel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Channel</em>' reference.
	 * @see #setCommChannel(HpCommunicationChannel)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_CommChannel()
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnits
	 * @model opposite="processingUnits"
	 * @generated
	 */
	HpCommunicationChannel getCommChannel();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCommChannel <em>Comm Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Channel</em>' reference.
	 * @see #getCommChannel()
	 * @generated
	 */
	void setCommChannel(HpCommunicationChannel value);

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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rtp Utilization Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Utilization Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Utilization Factor</em>' containment reference.
	 * @see #setRtpUtilizationFactor(RtpUtilizationFactorType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_RtpUtilizationFactor()
	 * @model containment="true"
	 * @generated
	 */
	RtpUtilizationFactorType getRtpUtilizationFactor();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpUtilizationFactor <em>Rtp Utilization Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Utilization Factor</em>' containment reference.
	 * @see #getRtpUtilizationFactor()
	 * @generated
	 */
	void setRtpUtilizationFactor(RtpUtilizationFactorType value);

	/**
	 * Returns the value of the '<em><b>Space Processes</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getProcessingUnit <em>Processing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Processes</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_SpaceProcesses()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess#getProcessingUnit
	 * @model opposite="processingUnit"
	 * @generated
	 */
	EList<SoSpaceProcess> getSpaceProcesses();

	/**
	 * Returns the value of the '<em><b>Candidate Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getFavoriteProcessors <em>Favorite Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Tasks</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_CandidateTasks()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getFavoriteProcessors
	 * @model opposite="favoriteProcessors"
	 * @generated
	 */
	EList<SoSchedulableTask> getCandidateTasks();

	/**
	 * Returns the value of the '<em><b>Schedulable Tasks</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRunOnProcessors <em>Run On Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulable Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulable Tasks</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_SchedulableTasks()
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask#getRunOnProcessors
	 * @model opposite="runOnProcessors"
	 * @generated
	 */
	EList<SoSchedulableTask> getSchedulableTasks();

	/**
	 * Returns the value of the '<em><b>Utilization Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization Factor</em>' reference.
	 * @see #setUtilizationFactor(RtpUtilizationFactorType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_UtilizationFactor()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.rtpUtilizationFactor'"
	 * @generated
	 */
	RtpUtilizationFactorType getUtilizationFactor();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getUtilizationFactor <em>Utilization Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization Factor</em>' reference.
	 * @see #getUtilizationFactor()
	 * @generated
	 */
	void setUtilizationFactor(RtpUtilizationFactorType value);

	/**
	 * Returns the value of the '<em><b>Processor Interconnector</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getProcessingUnits <em>Processing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Interconnector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Interconnector</em>' reference.
	 * @see #setProcessorInterconnector(HpProcessorInterconnector)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_ProcessorInterconnector()
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector#getProcessingUnits
	 * @model opposite="processingUnits"
	 * @generated
	 */
	HpProcessorInterconnector getProcessorInterconnector();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnector <em>Processor Interconnector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Interconnector</em>' reference.
	 * @see #getProcessorInterconnector()
	 * @generated
	 */
	void setProcessorInterconnector(HpProcessorInterconnector value);

	/**
	 * Returns the value of the '<em><b>Rtp Computing Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Computing Speed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Computing Speed</em>' containment reference.
	 * @see #setRtpComputingSpeed(RtpComputingSpeedType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessingUnit_RtpComputingSpeed()
	 * @model containment="true"
	 * @generated
	 */
	RtpComputingSpeedType getRtpComputingSpeed();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getRtpComputingSpeed <em>Rtp Computing Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Computing Speed</em>' containment reference.
	 * @see #getRtpComputingSpeed()
	 * @generated
	 */
	void setRtpComputingSpeed(RtpComputingSpeedType value);

} // HpProcessingUnit
