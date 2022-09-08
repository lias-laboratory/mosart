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
 * A representation of the model object '<em><b>Hp Communication Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkPort <em>Network Port</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnitSet <em>Processing Unit Set</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getNetworkNodeSet <em>Network Node Set</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationChannel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HpCommunicationChannelRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot HpCommunicationChannelRule1='self.processingUnits->isEmpty() implies (self.processingUnitSet->notEmpty() or self.networkPort->size()>=2)'"
 * @generated
 */
public interface HpCommunicationChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Units</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getCommChannel <em>Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Units</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationChannel_ProcessingUnits()
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getCommChannel
	 * @model opposite="commChannel"
	 * @generated
	 */
	EList<HpProcessingUnit> getProcessingUnits();

	/**
	 * Returns the value of the '<em><b>Network Port</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpNetworkPort}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpNetworkPort#getCommChannel <em>Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Port</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationChannel_NetworkPort()
	 * @see MoSaRT.HardwarePlatform.HpNetworkPort#getCommChannel
	 * @model opposite="commChannel" required="true"
	 * @generated
	 */
	EList<HpNetworkPort> getNetworkPort();

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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationChannel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Processing Unit Set</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessorInterconnector}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getCommChannel <em>Comm Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Unit Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Unit Set</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationChannel_ProcessingUnitSet()
	 * @see MoSaRT.HardwarePlatform.HpProcessorInterconnector#getCommChannel
	 * @model opposite="commChannel"
	 * @generated
	 */
	EList<HpProcessorInterconnector> getProcessingUnitSet();

	/**
	 * Returns the value of the '<em><b>Network Node Set</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpNetworkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Node Set</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Node Set</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpCommunicationChannel_NetworkNodeSet()
	 * @model
	 * @generated
	 */
	EList<HpNetworkNode> getNetworkNodeSet();

} // HpCommunicationChannel
