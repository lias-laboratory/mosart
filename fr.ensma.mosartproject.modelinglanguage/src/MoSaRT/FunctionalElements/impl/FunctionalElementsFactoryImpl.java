/**
 */
package MoSaRT.FunctionalElements.impl;

import MoSaRT.FunctionalElements.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalElementsFactoryImpl extends EFactoryImpl implements FunctionalElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionalElementsFactory init() {
		try {
			FunctionalElementsFactory theFunctionalElementsFactory = (FunctionalElementsFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionalElementsPackage.eNS_URI);
			if (theFunctionalElementsFactory != null) {
				return theFunctionalElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionalElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalElementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FunctionalElementsPackage.SYSTEM_FUNCTIONAL_SIDE: return createSystemFunctionalSide();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionalSide createSystemFunctionalSide() {
		SystemFunctionalSideImpl systemFunctionalSide = new SystemFunctionalSideImpl();
		return systemFunctionalSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalElementsPackage getFunctionalElementsPackage() {
		return (FunctionalElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionalElementsPackage getPackage() {
		return FunctionalElementsPackage.eINSTANCE;
	}

} //FunctionalElementsFactoryImpl
