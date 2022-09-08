/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.impl;

import MoSaRT.*;

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
public class MoSaRTFactoryImpl extends EFactoryImpl implements MoSaRTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoSaRTFactory init() {
		try {
			MoSaRTFactory theMoSaRTFactory = (MoSaRTFactory)EPackage.Registry.INSTANCE.getEFactory(MoSaRTPackage.eNS_URI);
			if (theMoSaRTFactory != null) {
				return theMoSaRTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MoSaRTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSaRTFactoryImpl() {
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
			case MoSaRTPackage.GLOBAL_SYSTEM: return createGlobalSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalSystem createGlobalSystem() {
		GlobalSystemImpl globalSystem = new GlobalSystemImpl();
		return globalSystem;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSaRTPackage getMoSaRTPackage() {
		return (MoSaRTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MoSaRTPackage getPackage() {
		return MoSaRTPackage.eINSTANCE;
	}

} //MoSaRTFactoryImpl
