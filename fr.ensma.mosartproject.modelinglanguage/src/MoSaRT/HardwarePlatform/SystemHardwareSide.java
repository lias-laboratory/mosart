/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Hardware Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getCommRouters <em>Comm Routers</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getCommChannels <em>Comm Channels</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getProcessorInterconnectors <em>Processor Interconnectors</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getHpflowcarrier <em>Hpflowcarrier</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SystemHardwareSideRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SystemHardwareSideRule1='self.processingUnits->size()>1 implies self.processingUnits->select(pr : HpProcessingUnit | pr.commChannel->isEmpty() and pr.processorInterconnector->isEmpty())->size()=0'"
 * @generated
 */
public interface SystemHardwareSide extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Units</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Units</em>' containment reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide_ProcessingUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<HpProcessingUnit> getProcessingUnits();

	/**
	 * Returns the value of the '<em><b>Comm Routers</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpCommunicationRouter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Routers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Routers</em>' containment reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide_CommRouters()
	 * @model containment="true"
	 * @generated
	 */
	EList<HpCommunicationRouter> getCommRouters();

	/**
	 * Returns the value of the '<em><b>Comm Channels</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpCommunicationChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Channels</em>' containment reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide_CommChannels()
	 * @model containment="true"
	 * @generated
	 */
	EList<HpCommunicationChannel> getCommChannels();

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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.SystemHardwareSide#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Processor Interconnectors</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessorInterconnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Interconnectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Interconnectors</em>' containment reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide_ProcessorInterconnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<HpProcessorInterconnector> getProcessorInterconnectors();

	/**
	 * Returns the value of the '<em><b>Hpflowcarrier</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpFlowCarrier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hpflowcarrier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hpflowcarrier</em>' containment reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getSystemHardwareSide_Hpflowcarrier()
	 * @model containment="true"
	 * @generated
	 */
	EList<HpFlowCarrier> getHpflowcarrier();

} // SystemHardwareSide
