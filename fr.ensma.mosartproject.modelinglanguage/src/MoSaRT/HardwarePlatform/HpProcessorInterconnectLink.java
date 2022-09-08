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
 * A representation of the model object '<em><b>Hp Processor Interconnect Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnectLink#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnectLink#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnectLink#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnectLink()
 * @model
 * @generated
 */
public interface HpProcessorInterconnectLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Processing Units</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnectLink <em>Processor Interconnect Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Units</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnectLink_ProcessingUnits()
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnectLink
	 * @model opposite="processorInterconnectLink" lower="2"
	 * @generated
	 */
	EList<HpProcessingUnit> getProcessingUnits();

	/**
	 * Returns the value of the '<em><b>Comm Channel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnitSet <em>Processing Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Channel</em>' reference.
	 * @see #setCommChannel(HpCommunicationChannel)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnectLink_CommChannel()
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnitSet
	 * @model opposite="processingUnitSet"
	 * @generated
	 */
	HpCommunicationChannel getCommChannel();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnectLink#getCommChannel <em>Comm Channel</em>}' reference.
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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnectLink_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnectLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HpProcessorInterconnectLink
