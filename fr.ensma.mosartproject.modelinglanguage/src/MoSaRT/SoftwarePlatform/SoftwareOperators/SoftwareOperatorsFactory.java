/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage
 * @generated
 */
public interface SoftwareOperatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareOperatorsFactory eINSTANCE = MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Software Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Software Side</em>'.
	 * @generated
	 */
	SystemSoftwareSide createSystemSoftwareSide();

	/**
	 * Returns a new object of class '<em>So Schedulable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So Schedulable Task</em>'.
	 * @generated
	 */
	SoSchedulableTask createSoSchedulableTask();

	/**
	 * Returns a new object of class '<em>So Space Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So Space Process</em>'.
	 * @generated
	 */
	SoSpaceProcess createSoSpaceProcess();

	/**
	 * Returns a new object of class '<em>So Mutual Exclusion Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So Mutual Exclusion Resource</em>'.
	 * @generated
	 */
	SoMutualExclusionResource createSoMutualExclusionResource();

	/**
	 * Returns a new object of class '<em>So Remote Comm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So Remote Comm Resource</em>'.
	 * @generated
	 */
	SoRemoteCommResource createSoRemoteCommResource();

	/**
	 * Returns a new object of class '<em>So Local Comm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So Local Comm Resource</em>'.
	 * @generated
	 */
	SoLocalCommResource createSoLocalCommResource();

	/**
	 * Returns a new object of class '<em>So Transmitted Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>So Transmitted Data</em>'.
	 * @generated
	 */
	SoTransmittedData createSoTransmittedData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftwareOperatorsPackage getSoftwareOperatorsPackage();

} //SoftwareOperatorsFactory
