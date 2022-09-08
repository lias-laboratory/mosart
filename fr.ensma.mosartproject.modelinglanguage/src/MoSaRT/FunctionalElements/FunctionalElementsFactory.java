/**
 */
package MoSaRT.FunctionalElements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRT.FunctionalElements.FunctionalElementsPackage
 * @generated
 */
public interface FunctionalElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionalElementsFactory eINSTANCE = MoSaRT.FunctionalElements.impl.FunctionalElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Functional Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Functional Side</em>'.
	 * @generated
	 */
	SystemFunctionalSide createSystemFunctionalSide();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionalElementsPackage getFunctionalElementsPackage();

} //FunctionalElementsFactory
