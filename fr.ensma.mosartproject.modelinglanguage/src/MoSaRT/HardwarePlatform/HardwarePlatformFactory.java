/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage
 * @generated
 */
public interface HardwarePlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HardwarePlatformFactory eINSTANCE = MoSaRT.HardwarePlatform.impl.HardwarePlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Hardware Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Hardware Side</em>'.
	 * @generated
	 */
	SystemHardwareSide createSystemHardwareSide();

	/**
	 * Returns a new object of class '<em>Hp Processing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hp Processing Unit</em>'.
	 * @generated
	 */
	HpProcessingUnit createHpProcessingUnit();

	/**
	 * Returns a new object of class '<em>Hp Flow Carrier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hp Flow Carrier</em>'.
	 * @generated
	 */
	HpFlowCarrier createHpFlowCarrier();

	/**
	 * Returns a new object of class '<em>Hp Communication Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hp Communication Router</em>'.
	 * @generated
	 */
	HpCommunicationRouter createHpCommunicationRouter();

	/**
	 * Returns a new object of class '<em>Hp Network Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hp Network Port</em>'.
	 * @generated
	 */
	HpNetworkPort createHpNetworkPort();

	/**
	 * Returns a new object of class '<em>Hp Communication Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hp Communication Channel</em>'.
	 * @generated
	 */
	HpCommunicationChannel createHpCommunicationChannel();

	/**
	 * Returns a new object of class '<em>Hp Processor Interconnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hp Processor Interconnector</em>'.
	 * @generated
	 */
	HpProcessorInterconnector createHpProcessorInterconnector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HardwarePlatformPackage getHardwarePlatformPackage();

} //HardwarePlatformFactory
