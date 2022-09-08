/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.SoftwarePlatform.SoftwareOperators.*;

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
public class SoftwareOperatorsFactoryImpl extends EFactoryImpl implements SoftwareOperatorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareOperatorsFactory init() {
		try {
			SoftwareOperatorsFactory theSoftwareOperatorsFactory = (SoftwareOperatorsFactory)EPackage.Registry.INSTANCE.getEFactory(SoftwareOperatorsPackage.eNS_URI);
			if (theSoftwareOperatorsFactory != null) {
				return theSoftwareOperatorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareOperatorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareOperatorsFactoryImpl() {
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
			case SoftwareOperatorsPackage.SYSTEM_SOFTWARE_SIDE: return createSystemSoftwareSide();
			case SoftwareOperatorsPackage.SO_SCHEDULABLE_TASK: return createSoSchedulableTask();
			case SoftwareOperatorsPackage.SO_SPACE_PROCESS: return createSoSpaceProcess();
			case SoftwareOperatorsPackage.SO_MUTUAL_EXCLUSION_RESOURCE: return createSoMutualExclusionResource();
			case SoftwareOperatorsPackage.SO_REMOTE_COMM_RESOURCE: return createSoRemoteCommResource();
			case SoftwareOperatorsPackage.SO_LOCAL_COMM_RESOURCE: return createSoLocalCommResource();
			case SoftwareOperatorsPackage.SO_TRANSMITTED_DATA: return createSoTransmittedData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemSoftwareSide createSystemSoftwareSide() {
		SystemSoftwareSideImpl systemSoftwareSide = new SystemSoftwareSideImpl();
		return systemSoftwareSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSchedulableTask createSoSchedulableTask() {
		SoSchedulableTaskImpl soSchedulableTask = new SoSchedulableTaskImpl();
		return soSchedulableTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoSpaceProcess createSoSpaceProcess() {
		SoSpaceProcessImpl soSpaceProcess = new SoSpaceProcessImpl();
		return soSpaceProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoMutualExclusionResource createSoMutualExclusionResource() {
		SoMutualExclusionResourceImpl soMutualExclusionResource = new SoMutualExclusionResourceImpl();
		return soMutualExclusionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoRemoteCommResource createSoRemoteCommResource() {
		SoRemoteCommResourceImpl soRemoteCommResource = new SoRemoteCommResourceImpl();
		return soRemoteCommResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoLocalCommResource createSoLocalCommResource() {
		SoLocalCommResourceImpl soLocalCommResource = new SoLocalCommResourceImpl();
		return soLocalCommResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoTransmittedData createSoTransmittedData() {
		SoTransmittedDataImpl soTransmittedData = new SoTransmittedDataImpl();
		return soTransmittedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareOperatorsPackage getSoftwareOperatorsPackage() {
		return (SoftwareOperatorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwareOperatorsPackage getPackage() {
		return SoftwareOperatorsPackage.eINSTANCE;
	}

} //SoftwareOperatorsFactoryImpl
