/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.impl;

import MoSaRT.FunctionalElements.FunctionalElementsPackage;
import MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;

import MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl;

import MoSaRT.MoSaRTPackage;

import MoSaRT.RealTimeProperties.RealTimePropertiesPackage;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpHelperTypesPackageImpl;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.RtpMeasurementUnitsPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl.RtpMeasurementUnitsPackageImpl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RtpProtocolsAndPoliciesPackageImpl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.RealTimeProperties.RtpTypes.impl.RtpTypesPackageImpl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RtpUtilityTypesPackageImpl;

import MoSaRT.RealTimeProperties.impl.RealTimePropertiesPackageImpl;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;
import MoSaRT.SoftwarePlatform.SoftwareOperators.util.SoftwareOperatorsValidator;

import MoSaRT.impl.MoSaRTPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareOperatorsPackageImpl extends EPackageImpl implements SoftwareOperatorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemSoftwareSideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soSchedulableTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soSpaceProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soInteractionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soMutualExclusionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soCommunicationResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soRemoteCommResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soLocalCommResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soTransmittedDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwareOperatorsPackageImpl() {
		super(eNS_URI, SoftwareOperatorsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SoftwareOperatorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwareOperatorsPackage init() {
		if (isInited) return (SoftwareOperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI);

		// Obtain or create and register package
		SoftwareOperatorsPackageImpl theSoftwareOperatorsPackage = (SoftwareOperatorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwareOperatorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwareOperatorsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MoSaRTPackageImpl theMoSaRTPackage = (MoSaRTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) instanceof MoSaRTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) : MoSaRTPackage.eINSTANCE);
		SoftwareBehaviorPackageImpl theSoftwareBehaviorPackage = (SoftwareBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) instanceof SoftwareBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) : SoftwareBehaviorPackage.eINSTANCE);
		HardwarePlatformPackageImpl theHardwarePlatformPackage = (HardwarePlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) instanceof HardwarePlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) : HardwarePlatformPackage.eINSTANCE);
		RealTimePropertiesPackageImpl theRealTimePropertiesPackage = (RealTimePropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) instanceof RealTimePropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) : RealTimePropertiesPackage.eINSTANCE);
		RtpTypesPackageImpl theRtpTypesPackage = (RtpTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) instanceof RtpTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) : RtpTypesPackage.eINSTANCE);
		RtpUtilityTypesPackageImpl theRtpUtilityTypesPackage = (RtpUtilityTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) instanceof RtpUtilityTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) : RtpUtilityTypesPackage.eINSTANCE);
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) : RtpMeasurementUnitsPackage.eINSTANCE);
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theSoftwareOperatorsPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theSoftwareOperatorsPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRealTimePropertiesPackage.initializePackageContents();
		theRtpTypesPackage.initializePackageContents();
		theRtpUtilityTypesPackage.initializePackageContents();
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theRtpHelperTypesPackage.initializePackageContents();
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSoftwareOperatorsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SoftwareOperatorsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSoftwareOperatorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwareOperatorsPackage.eNS_URI, theSoftwareOperatorsPackage);
		return theSoftwareOperatorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemSoftwareSide() {
		return systemSoftwareSideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSoftwareSide_SystemBehavior() {
		return (EReference)systemSoftwareSideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSoftwareSide_SpaceProcesses() {
		return (EReference)systemSoftwareSideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSoftwareSide_InteractionResources() {
		return (EReference)systemSoftwareSideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemSoftwareSide_SchedulableTasks() {
		return (EReference)systemSoftwareSideEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemSoftwareSide_Name() {
		return (EAttribute)systemSoftwareSideEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoSchedulableTask() {
		return soSchedulableTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_Process() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_MutualExclusionResources() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_CommWritingResources() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_CommReadingResources() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoSchedulableTask_Name() {
		return (EAttribute)soSchedulableTaskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_MutualExclusionResourceUtilization() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_FavoriteProcessors() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_RunOnProcessors() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_RepresentedActivity() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSchedulableTask_RtpMutualExclusionResourceUtilization() {
		return (EReference)soSchedulableTaskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoSpaceProcess() {
		return soSpaceProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_SpaceProcessParent() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_SpaceProcessChildren() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_SchedulableTasks() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoSpaceProcess_Name() {
		return (EAttribute)soSpaceProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_ProcessingUnit() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_RtpSchedulingPolicy() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_AllSpaceProcessParents() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoSpaceProcess_RtpTaskAllocation() {
		return (EReference)soSpaceProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoInteractionResource() {
		return soInteractionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoMutualExclusionResource() {
		return soMutualExclusionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoMutualExclusionResource_Tasks() {
		return (EReference)soMutualExclusionResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoMutualExclusionResource_Name() {
		return (EAttribute)soMutualExclusionResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoMutualExclusionResource_RtpProtectProtocol() {
		return (EReference)soMutualExclusionResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoMutualExclusionResource_RtpWaitingQueuePolicy() {
		return (EReference)soMutualExclusionResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoCommunicationResource() {
		return soCommunicationResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoCommunicationResource_WriterTasks() {
		return (EReference)soCommunicationResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoCommunicationResource_ReaderTasks() {
		return (EReference)soCommunicationResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoRemoteCommResource() {
		return soRemoteCommResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoRemoteCommResource_Name() {
		return (EAttribute)soRemoteCommResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoRemoteCommResource_TransmittedData() {
		return (EReference)soRemoteCommResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoLocalCommResource() {
		return soLocalCommResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoLocalCommResource_Name() {
		return (EAttribute)soLocalCommResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoLocalCommResource_RtpCommunicationMechanism() {
		return (EReference)soLocalCommResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoLocalCommResource_RtpWaitingQueuePolicy() {
		return (EReference)soLocalCommResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoLocalCommResource_RtpProtectProtocol() {
		return (EReference)soLocalCommResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoTransmittedData() {
		return soTransmittedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoTransmittedData_SourceTask() {
		return (EReference)soTransmittedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoTransmittedData_TargetTasks() {
		return (EReference)soTransmittedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoTransmittedData_Name() {
		return (EAttribute)soTransmittedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoTransmittedData_DataSize() {
		return (EReference)soTransmittedDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoTransmittedData_RtpDataSize() {
		return (EReference)soTransmittedDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareOperatorsFactory getSoftwareOperatorsFactory() {
		return (SoftwareOperatorsFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemSoftwareSideEClass = createEClass(SYSTEM_SOFTWARE_SIDE);
		createEReference(systemSoftwareSideEClass, SYSTEM_SOFTWARE_SIDE__SYSTEM_BEHAVIOR);
		createEReference(systemSoftwareSideEClass, SYSTEM_SOFTWARE_SIDE__SPACE_PROCESSES);
		createEReference(systemSoftwareSideEClass, SYSTEM_SOFTWARE_SIDE__INTERACTION_RESOURCES);
		createEReference(systemSoftwareSideEClass, SYSTEM_SOFTWARE_SIDE__SCHEDULABLE_TASKS);
		createEAttribute(systemSoftwareSideEClass, SYSTEM_SOFTWARE_SIDE__NAME);

		soSchedulableTaskEClass = createEClass(SO_SCHEDULABLE_TASK);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__PROCESS);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCES);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__COMM_WRITING_RESOURCES);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__COMM_READING_RESOURCES);
		createEAttribute(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__NAME);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__MUTUAL_EXCLUSION_RESOURCE_UTILIZATION);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__FAVORITE_PROCESSORS);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__RUN_ON_PROCESSORS);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__REPRESENTED_ACTIVITY);
		createEReference(soSchedulableTaskEClass, SO_SCHEDULABLE_TASK__RTP_MUTUAL_EXCLUSION_RESOURCE_UTILIZATION);

		soSpaceProcessEClass = createEClass(SO_SPACE_PROCESS);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__SPACE_PROCESS_PARENT);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__SPACE_PROCESS_CHILDREN);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__SCHEDULABLE_TASKS);
		createEAttribute(soSpaceProcessEClass, SO_SPACE_PROCESS__NAME);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__PROCESSING_UNIT);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__RTP_SCHEDULING_POLICY);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__ALL_SPACE_PROCESS_PARENTS);
		createEReference(soSpaceProcessEClass, SO_SPACE_PROCESS__RTP_TASK_ALLOCATION);

		soInteractionResourceEClass = createEClass(SO_INTERACTION_RESOURCE);

		soMutualExclusionResourceEClass = createEClass(SO_MUTUAL_EXCLUSION_RESOURCE);
		createEReference(soMutualExclusionResourceEClass, SO_MUTUAL_EXCLUSION_RESOURCE__TASKS);
		createEAttribute(soMutualExclusionResourceEClass, SO_MUTUAL_EXCLUSION_RESOURCE__NAME);
		createEReference(soMutualExclusionResourceEClass, SO_MUTUAL_EXCLUSION_RESOURCE__RTP_PROTECT_PROTOCOL);
		createEReference(soMutualExclusionResourceEClass, SO_MUTUAL_EXCLUSION_RESOURCE__RTP_WAITING_QUEUE_POLICY);

		soCommunicationResourceEClass = createEClass(SO_COMMUNICATION_RESOURCE);
		createEReference(soCommunicationResourceEClass, SO_COMMUNICATION_RESOURCE__WRITER_TASKS);
		createEReference(soCommunicationResourceEClass, SO_COMMUNICATION_RESOURCE__READER_TASKS);

		soRemoteCommResourceEClass = createEClass(SO_REMOTE_COMM_RESOURCE);
		createEAttribute(soRemoteCommResourceEClass, SO_REMOTE_COMM_RESOURCE__NAME);
		createEReference(soRemoteCommResourceEClass, SO_REMOTE_COMM_RESOURCE__TRANSMITTED_DATA);

		soLocalCommResourceEClass = createEClass(SO_LOCAL_COMM_RESOURCE);
		createEAttribute(soLocalCommResourceEClass, SO_LOCAL_COMM_RESOURCE__NAME);
		createEReference(soLocalCommResourceEClass, SO_LOCAL_COMM_RESOURCE__RTP_COMMUNICATION_MECHANISM);
		createEReference(soLocalCommResourceEClass, SO_LOCAL_COMM_RESOURCE__RTP_WAITING_QUEUE_POLICY);
		createEReference(soLocalCommResourceEClass, SO_LOCAL_COMM_RESOURCE__RTP_PROTECT_PROTOCOL);

		soTransmittedDataEClass = createEClass(SO_TRANSMITTED_DATA);
		createEReference(soTransmittedDataEClass, SO_TRANSMITTED_DATA__SOURCE_TASK);
		createEReference(soTransmittedDataEClass, SO_TRANSMITTED_DATA__TARGET_TASKS);
		createEAttribute(soTransmittedDataEClass, SO_TRANSMITTED_DATA__NAME);
		createEReference(soTransmittedDataEClass, SO_TRANSMITTED_DATA__DATA_SIZE);
		createEReference(soTransmittedDataEClass, SO_TRANSMITTED_DATA__RTP_DATA_SIZE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SoftwareBehaviorPackage theSoftwareBehaviorPackage = (SoftwareBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI);
		RtpTypesPackage theRtpTypesPackage = (RtpTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI);
		HardwarePlatformPackage theHardwarePlatformPackage = (HardwarePlatformPackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI);
		RtpProtocolsAndPoliciesPackage theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI);
		RtpHelperTypesPackage theRtpHelperTypesPackage = (RtpHelperTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		soMutualExclusionResourceEClass.getESuperTypes().add(this.getSoInteractionResource());
		soCommunicationResourceEClass.getESuperTypes().add(this.getSoInteractionResource());
		soRemoteCommResourceEClass.getESuperTypes().add(this.getSoCommunicationResource());
		soLocalCommResourceEClass.getESuperTypes().add(this.getSoCommunicationResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemSoftwareSideEClass, SystemSoftwareSide.class, "SystemSoftwareSide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemSoftwareSide_SystemBehavior(), theSoftwareBehaviorPackage.getGlobalBehavior(), null, "systemBehavior", null, 0, 1, SystemSoftwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemSoftwareSide_SpaceProcesses(), this.getSoSpaceProcess(), null, "spaceProcesses", null, 0, -1, SystemSoftwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemSoftwareSide_InteractionResources(), this.getSoInteractionResource(), null, "interactionResources", null, 0, -1, SystemSoftwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemSoftwareSide_SchedulableTasks(), this.getSoSchedulableTask(), null, "schedulableTasks", null, 0, -1, SystemSoftwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemSoftwareSide_Name(), ecorePackage.getEString(), "name", null, 1, 1, SystemSoftwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soSchedulableTaskEClass, SoSchedulableTask.class, "SoSchedulableTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoSchedulableTask_Process(), this.getSoSpaceProcess(), this.getSoSpaceProcess_SchedulableTasks(), "process", null, 1, 1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_MutualExclusionResources(), this.getSoMutualExclusionResource(), this.getSoMutualExclusionResource_Tasks(), "mutualExclusionResources", null, 0, -1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_CommWritingResources(), this.getSoCommunicationResource(), this.getSoCommunicationResource_WriterTasks(), "commWritingResources", null, 0, -1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_CommReadingResources(), this.getSoCommunicationResource(), this.getSoCommunicationResource_ReaderTasks(), "commReadingResources", null, 0, -1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoSchedulableTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_MutualExclusionResourceUtilization(), theRtpTypesPackage.getRtpMutuExcluResourceUtilizationType(), null, "mutualExclusionResourceUtilization", null, 0, -1, SoSchedulableTask.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_FavoriteProcessors(), theHardwarePlatformPackage.getHpProcessingUnit(), theHardwarePlatformPackage.getHpProcessingUnit_CandidateTasks(), "favoriteProcessors", null, 0, -1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_RunOnProcessors(), theHardwarePlatformPackage.getHpProcessingUnit(), theHardwarePlatformPackage.getHpProcessingUnit_SchedulableTasks(), "runOnProcessors", null, 0, -1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_RepresentedActivity(), theSoftwareBehaviorPackage.getSbTaskActivity(), theSoftwareBehaviorPackage.getSbTaskActivity_RepresentedTask(), "representedActivity", null, 0, 1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSchedulableTask_RtpMutualExclusionResourceUtilization(), theRtpTypesPackage.getRtpMutuExcluResourceUtilizationType(), null, "rtpMutualExclusionResourceUtilization", null, 0, -1, SoSchedulableTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soSpaceProcessEClass, SoSpaceProcess.class, "SoSpaceProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoSpaceProcess_SpaceProcessParent(), this.getSoSpaceProcess(), this.getSoSpaceProcess_SpaceProcessChildren(), "spaceProcessParent", null, 0, 1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSpaceProcess_SpaceProcessChildren(), this.getSoSpaceProcess(), this.getSoSpaceProcess_SpaceProcessParent(), "spaceProcessChildren", null, 0, -1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSpaceProcess_SchedulableTasks(), this.getSoSchedulableTask(), this.getSoSchedulableTask_Process(), "schedulableTasks", null, 0, -1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoSpaceProcess_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSpaceProcess_ProcessingUnit(), theHardwarePlatformPackage.getHpProcessingUnit(), theHardwarePlatformPackage.getHpProcessingUnit_SpaceProcesses(), "processingUnit", null, 0, -1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSpaceProcess_RtpSchedulingPolicy(), theRtpProtocolsAndPoliciesPackage.getRtpSchedulingPolicyType(), null, "rtpSchedulingPolicy", null, 1, 1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoSpaceProcess_AllSpaceProcessParents(), this.getSoSpaceProcess(), null, "allSpaceProcessParents", null, 0, -1, SoSpaceProcess.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSoSpaceProcess_RtpTaskAllocation(), theRtpProtocolsAndPoliciesPackage.getRtpTaskAllocationType(), null, "rtpTaskAllocation", null, 0, 1, SoSpaceProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soInteractionResourceEClass, SoInteractionResource.class, "SoInteractionResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soMutualExclusionResourceEClass, SoMutualExclusionResource.class, "SoMutualExclusionResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoMutualExclusionResource_Tasks(), this.getSoSchedulableTask(), this.getSoSchedulableTask_MutualExclusionResources(), "tasks", null, 2, -1, SoMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoMutualExclusionResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoMutualExclusionResource_RtpProtectProtocol(), theRtpProtocolsAndPoliciesPackage.getRtpProtectProtocolType(), null, "rtpProtectProtocol", null, 1, 1, SoMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoMutualExclusionResource_RtpWaitingQueuePolicy(), theRtpProtocolsAndPoliciesPackage.getRtpWaitingQueuePolicyType(), null, "rtpWaitingQueuePolicy", null, 1, 1, SoMutualExclusionResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soCommunicationResourceEClass, SoCommunicationResource.class, "SoCommunicationResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoCommunicationResource_WriterTasks(), this.getSoSchedulableTask(), this.getSoSchedulableTask_CommWritingResources(), "writerTasks", null, 1, -1, SoCommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoCommunicationResource_ReaderTasks(), this.getSoSchedulableTask(), this.getSoSchedulableTask_CommReadingResources(), "readerTasks", null, 1, -1, SoCommunicationResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soRemoteCommResourceEClass, SoRemoteCommResource.class, "SoRemoteCommResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoRemoteCommResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoRemoteCommResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoRemoteCommResource_TransmittedData(), this.getSoTransmittedData(), null, "transmittedData", null, 1, -1, SoRemoteCommResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soLocalCommResourceEClass, SoLocalCommResource.class, "SoLocalCommResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoLocalCommResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoLocalCommResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoLocalCommResource_RtpCommunicationMechanism(), theRtpProtocolsAndPoliciesPackage.getRtpCommunicationMechanismType(), null, "rtpCommunicationMechanism", null, 1, 1, SoLocalCommResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoLocalCommResource_RtpWaitingQueuePolicy(), theRtpProtocolsAndPoliciesPackage.getRtpWaitingQueuePolicyType(), null, "rtpWaitingQueuePolicy", null, 1, 1, SoLocalCommResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoLocalCommResource_RtpProtectProtocol(), theRtpProtocolsAndPoliciesPackage.getRtpProtectProtocolType(), null, "rtpProtectProtocol", null, 0, 1, SoLocalCommResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soTransmittedDataEClass, SoTransmittedData.class, "SoTransmittedData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoTransmittedData_SourceTask(), this.getSoSchedulableTask(), null, "sourceTask", null, 1, 1, SoTransmittedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoTransmittedData_TargetTasks(), this.getSoSchedulableTask(), null, "targetTasks", null, 1, -1, SoTransmittedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoTransmittedData_Name(), ecorePackage.getEString(), "name", null, 1, 1, SoTransmittedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoTransmittedData_DataSize(), theRtpHelperTypesPackage.getRtpDataSizeType(), null, "dataSize", null, 0, 1, SoTransmittedData.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSoTransmittedData_RtpDataSize(), theRtpHelperTypesPackage.getRtpDataSizeType(), null, "rtpDataSize", null, 0, 1, SoTransmittedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (systemSoftwareSideEClass, 
		   source, 
		   new String[] {
			 "constraints", "SystemSoftwareSideRule1"
		   });	
		addAnnotation
		  (soSchedulableTaskEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoSchedulableTaskRule1 SoSchedulableTaskRule2 SoSchedulableTaskRule3 SoSchedulableTaskRule4 SoSchedulableTaskRule5"
		   });	
		addAnnotation
		  (soSpaceProcessEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoSpaceProcessRule1 SoSpaceProcessRule2 SoSpaceProcessRule3 SoSpaceProcessRule4"
		   });	
		addAnnotation
		  (soMutualExclusionResourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoMutualExclusionResourceRule1"
		   });	
		addAnnotation
		  (soLocalCommResourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoLocalCommResourceRule1"
		   });	
		addAnnotation
		  (soTransmittedDataEClass, 
		   source, 
		   new String[] {
			 "constraints", "SoTransmittedDataRule1 SoTransmittedDataRule2 SoTransmittedDataRule3 SoTransmittedDataRule4"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (systemSoftwareSideEClass, 
		   source, 
		   new String[] {
			 "SystemSoftwareSideRule1", "self.systemBehaviour.sequencingRelations->select(r | r.oclIsTypeOf(SoftwareBehaviour::SbCommunicationRelation))->size() = SoTransmittedData.allInstances()->collect(td : SoTransmittedData | td.targetTasks)->size()->sum() + SoLocalCommResource.allInstances()->collect(rsc : SoLocalCommResource | rsc.readerTasks)->size()->sum()"
		   });	
		addAnnotation
		  (soSchedulableTaskEClass, 
		   source, 
		   new String[] {
			 "SoSchedulableTaskRule1", "self.rtpMutualExclusionResourceUtilization->size() = ( SoLocalCommResource.allInstances()->select(r : SoLocalCommResource | (self.commWritingResources->includes(r) or self.commReadingResources->includes(r) ) and r.rtpProtectProtocol->notEmpty())->size() + self.mutualExclusionResources->size() )",
			 "SoSchedulableTaskRule2", "self.rtpMutualExclusionResourceUtilization->size() = self.mutualExclusionResources->size() + self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty() )->size() + self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty())->size()",
			 "SoSchedulableTaskRule3", "self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoMutualExclusionResource))->includesAll(self.mutualExclusionResources)",
			 "SoSchedulableTaskRule4", "self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commWritingResources->select(wr : SoCommunicationResource| wr.oclIsKindOf(SoLocalCommResource) and wr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))",
			 "SoSchedulableTaskRule5", "self.rtpMutualExclusionResourceUtilization->collect(meru | meru.resource)->select(rsc|rsc.oclIsTypeOf(SoCommunicationResource))->includesAll(self.commReadingResources->select(rr : SoCommunicationResource |rr.oclIsKindOf(SoLocalCommResource) and rr.oclAsType(SoLocalCommResource).rtpProtectProtocol->notEmpty()))"
		   });	
		addAnnotation
		  (getSoSchedulableTask_MutualExclusionResourceUtilization(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpMutualExclusionResourceUtilization"
		   });	
		addAnnotation
		  (soSpaceProcessEClass, 
		   source, 
		   new String[] {
			 "SoSpaceProcessRule1", "(self.spaceProcessChildren->notEmpty() implies self.spaceProcessChildren->excludes(self)) and (self.spaceProcessParent->notEmpty() implies self.spaceProcessParent <> self)",
			 "SoSpaceProcessRule2", "self.allSpaceProcessParents->excludesAll(self.spaceProcessChildren)",
			 "SoSpaceProcessRule3", "self.processingUnit->size()>1 implies self.processingUnit->forAll(pr1,pr2 | pr1<>pr2 implies  pr1.processorInterconnector->notEmpty() and pr1.processorInterconnector = pr2.processorInterconnector)",
			 "SoSpaceProcessRule4", "(self.spaceProcessChildren->isEmpty() or self.spaceProcessParent->isEmpty()) implies self.processingUnit->notEmpty()"
		   });	
		addAnnotation
		  (soMutualExclusionResourceEClass, 
		   source, 
		   new String[] {
			 "SoMutualExclusionResourceRule1", "self.tasks->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)"
		   });	
		addAnnotation
		  (soLocalCommResourceEClass, 
		   source, 
		   new String[] {
			 "SoLocalCommResourceRule1", "(self.oclAsType(SoCommunicationResource).writerTasks->union(self.oclAsType(SoCommunicationResource).readerTasks))->forAll(t1,t2 | t1 <> t2 implies t1.process = t2.process)"
		   });	
		addAnnotation
		  (soTransmittedDataEClass, 
		   source, 
		   new String[] {
			 "SoTransmittedDataRule1", "self.targetTasks->excludes(self.sourceTask)",
			 "SoTransmittedDataRule2", "SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).readerTasks -> includesAll(self.targetTasks))",
			 "SoTransmittedDataRule3", "SoRemoteCommResource.allInstances()->forAll( rsc | rsc.transmittedData->includes(self) implies  rsc.oclAsType(SoCommunicationResource).writerTasks -> includes(self.sourceTask))",
			 "SoTransmittedDataRule4", "self.targetTasks->forAll( t : SoSchedulableTask | t.process->notEmpty() implies t.process <> self.sourceTask.process)"
		   });	
		addAnnotation
		  (getSoTransmittedData_DataSize(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpDataSize"
		   });
	}

} //SoftwareOperatorsPackageImpl
