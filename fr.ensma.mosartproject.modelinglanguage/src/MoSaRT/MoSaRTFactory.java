/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.MoSaRTPackage
 * @generated
 */
public interface MoSaRTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoSaRTFactory eINSTANCE = MoSaRT.impl.MoSaRTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Global System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global System</em>'.
	 * @generated
	 */
	GlobalSystem createGlobalSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MoSaRTPackage getMoSaRTPackage();

} //MoSaRTFactory
