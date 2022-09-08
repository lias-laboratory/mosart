/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hp Processor Interconnector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getRtpMultiprocessorCategory <em>Rtp Multiprocessor Category</em>}</li>
 * </ul>
 *
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnector()
 * @model
 * @generated
 */
public interface HpProcessorInterconnector extends HpNetworkNode {
	/**
	 * Returns the value of the '<em><b>Processing Units</b></em>' reference list.
	 * The list contents are of type {@link MoSaRT.HardwarePlatform.HpProcessingUnit}.
	 * It is bidirectional and its opposite is '{@link MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnector <em>Processor Interconnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Units</em>' reference list.
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnector_ProcessingUnits()
	 * @see MoSaRT.HardwarePlatform.HpProcessingUnit#getProcessorInterconnector
	 * @model opposite="processorInterconnector" lower="2"
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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnector_CommChannel()
	 * @see MoSaRT.HardwarePlatform.HpCommunicationChannel#getProcessingUnitSet
	 * @model opposite="processingUnitSet"
	 * @generated
	 */
	HpCommunicationChannel getCommChannel();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getCommChannel <em>Comm Channel</em>}' reference.
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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnector_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rtp Multiprocessor Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtp Multiprocessor Category</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtp Multiprocessor Category</em>' containment reference.
	 * @see #setRtpMultiprocessorCategory(RtpMultiprocessorCategoryType)
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#getHpProcessorInterconnector_RtpMultiprocessorCategory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpMultiprocessorCategoryType getRtpMultiprocessorCategory();

	/**
	 * Sets the value of the '{@link MoSaRT.HardwarePlatform.HpProcessorInterconnector#getRtpMultiprocessorCategory <em>Rtp Multiprocessor Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtp Multiprocessor Category</em>' containment reference.
	 * @see #getRtpMultiprocessorCategory()
	 * @generated
	 */
	void setRtpMultiprocessorCategory(RtpMultiprocessorCategoryType value);

} // HpProcessorInterconnector
