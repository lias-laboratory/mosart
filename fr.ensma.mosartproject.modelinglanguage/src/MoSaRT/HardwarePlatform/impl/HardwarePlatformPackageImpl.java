/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.FunctionalElements.FunctionalElementsPackage;
import MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl;

import MoSaRT.HardwarePlatform.HardwarePlatformFactory;
import MoSaRT.HardwarePlatform.HardwarePlatformPackage;

import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpCommunicationRouter;
import MoSaRT.HardwarePlatform.HpFlowCarrier;
import MoSaRT.HardwarePlatform.HpNetworkNode;
import MoSaRT.HardwarePlatform.HpNetworkPort;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;
import MoSaRT.HardwarePlatform.SystemHardwareSide;
import MoSaRT.HardwarePlatform.util.HardwarePlatformValidator;

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


import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl;

import MoSaRT.impl.MoSaRTPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwarePlatformPackageImpl extends EPackageImpl implements HardwarePlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemHardwareSideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpProcessingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpFlowCarrierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpCommunicationRouterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpNetworkPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpCommunicationChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpProcessorInterconnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hpNetworkNodeEClass = null;

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
	 * @see MoSaRT.HardwarePlatform.HardwarePlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HardwarePlatformPackageImpl() {
		super(eNS_URI, HardwarePlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HardwarePlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HardwarePlatformPackage init() {
		if (isInited) return (HardwarePlatformPackage)EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI);

		// Obtain or create and register package
		HardwarePlatformPackageImpl theHardwarePlatformPackage = (HardwarePlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HardwarePlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HardwarePlatformPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MoSaRTPackageImpl theMoSaRTPackage = (MoSaRTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) instanceof MoSaRTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) : MoSaRTPackage.eINSTANCE);
		SoftwareOperatorsPackageImpl theSoftwareOperatorsPackage = (SoftwareOperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) instanceof SoftwareOperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) : SoftwareOperatorsPackage.eINSTANCE);
		SoftwareBehaviorPackageImpl theSoftwareBehaviorPackage = (SoftwareBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) instanceof SoftwareBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) : SoftwareBehaviorPackage.eINSTANCE);
		RealTimePropertiesPackageImpl theRealTimePropertiesPackage = (RealTimePropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) instanceof RealTimePropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) : RealTimePropertiesPackage.eINSTANCE);
		RtpTypesPackageImpl theRtpTypesPackage = (RtpTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) instanceof RtpTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) : RtpTypesPackage.eINSTANCE);
		RtpUtilityTypesPackageImpl theRtpUtilityTypesPackage = (RtpUtilityTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) instanceof RtpUtilityTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) : RtpUtilityTypesPackage.eINSTANCE);
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) : RtpMeasurementUnitsPackage.eINSTANCE);
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theHardwarePlatformPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theHardwarePlatformPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
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
			(theHardwarePlatformPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return HardwarePlatformValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theHardwarePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HardwarePlatformPackage.eNS_URI, theHardwarePlatformPackage);
		return theHardwarePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemHardwareSide() {
		return systemHardwareSideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemHardwareSide_ProcessingUnits() {
		return (EReference)systemHardwareSideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemHardwareSide_CommRouters() {
		return (EReference)systemHardwareSideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemHardwareSide_CommChannels() {
		return (EReference)systemHardwareSideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemHardwareSide_Name() {
		return (EAttribute)systemHardwareSideEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemHardwareSide_ProcessorInterconnectors() {
		return (EReference)systemHardwareSideEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemHardwareSide_Hpflowcarrier() {
		return (EReference)systemHardwareSideEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpProcessingUnit() {
		return hpProcessingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_CommChannel() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHpProcessingUnit_Name() {
		return (EAttribute)hpProcessingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_RtpUtilizationFactor() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_SpaceProcesses() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_CandidateTasks() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_SchedulableTasks() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_UtilizationFactor() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_ProcessorInterconnector() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessingUnit_RtpComputingSpeed() {
		return (EReference)hpProcessingUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpFlowCarrier() {
		return hpFlowCarrierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHpFlowCarrier_Name() {
		return (EAttribute)hpFlowCarrierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpFlowCarrier_HpNetworkNodeTargets() {
		return (EReference)hpFlowCarrierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpFlowCarrier_ServiceCurveFunction() {
		return (EReference)hpFlowCarrierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpFlowCarrier_TrafficShaperFunction() {
		return (EReference)hpFlowCarrierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpFlowCarrier_ProcessingUnitOrigin() {
		return (EReference)hpFlowCarrierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpFlowCarrier_RtpCommunicationArbitrationPolicy() {
		return (EReference)hpFlowCarrierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpCommunicationRouter() {
		return hpCommunicationRouterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpCommunicationRouter_NetworkPorts() {
		return (EReference)hpCommunicationRouterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHpCommunicationRouter_Name() {
		return (EAttribute)hpCommunicationRouterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpNetworkPort() {
		return hpNetworkPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpNetworkPort_CommChannel() {
		return (EReference)hpNetworkPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHpNetworkPort_Name() {
		return (EAttribute)hpNetworkPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpNetworkPort_RtpFlowRate() {
		return (EReference)hpNetworkPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpNetworkPort_FlowRate() {
		return (EReference)hpNetworkPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpNetworkPort_RtpNetworkProtocol() {
		return (EReference)hpNetworkPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpNetworkPort_RtpTransmissionMode() {
		return (EReference)hpNetworkPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpCommunicationChannel() {
		return hpCommunicationChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpCommunicationChannel_ProcessingUnits() {
		return (EReference)hpCommunicationChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpCommunicationChannel_NetworkPort() {
		return (EReference)hpCommunicationChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHpCommunicationChannel_Name() {
		return (EAttribute)hpCommunicationChannelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpCommunicationChannel_ProcessingUnitSet() {
		return (EReference)hpCommunicationChannelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpCommunicationChannel_NetworkNodeSet() {
		return (EReference)hpCommunicationChannelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpProcessorInterconnector() {
		return hpProcessorInterconnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessorInterconnector_ProcessingUnits() {
		return (EReference)hpProcessorInterconnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessorInterconnector_CommChannel() {
		return (EReference)hpProcessorInterconnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHpProcessorInterconnector_Name() {
		return (EAttribute)hpProcessorInterconnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHpProcessorInterconnector_RtpMultiprocessorCategory() {
		return (EReference)hpProcessorInterconnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHpNetworkNode() {
		return hpNetworkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwarePlatformFactory getHardwarePlatformFactory() {
		return (HardwarePlatformFactory)getEFactoryInstance();
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
		systemHardwareSideEClass = createEClass(SYSTEM_HARDWARE_SIDE);
		createEReference(systemHardwareSideEClass, SYSTEM_HARDWARE_SIDE__PROCESSING_UNITS);
		createEReference(systemHardwareSideEClass, SYSTEM_HARDWARE_SIDE__COMM_ROUTERS);
		createEReference(systemHardwareSideEClass, SYSTEM_HARDWARE_SIDE__COMM_CHANNELS);
		createEAttribute(systemHardwareSideEClass, SYSTEM_HARDWARE_SIDE__NAME);
		createEReference(systemHardwareSideEClass, SYSTEM_HARDWARE_SIDE__PROCESSOR_INTERCONNECTORS);
		createEReference(systemHardwareSideEClass, SYSTEM_HARDWARE_SIDE__HPFLOWCARRIER);

		hpProcessingUnitEClass = createEClass(HP_PROCESSING_UNIT);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__COMM_CHANNEL);
		createEAttribute(hpProcessingUnitEClass, HP_PROCESSING_UNIT__NAME);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__RTP_UTILIZATION_FACTOR);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__SPACE_PROCESSES);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__CANDIDATE_TASKS);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__SCHEDULABLE_TASKS);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__UTILIZATION_FACTOR);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR);
		createEReference(hpProcessingUnitEClass, HP_PROCESSING_UNIT__RTP_COMPUTING_SPEED);

		hpFlowCarrierEClass = createEClass(HP_FLOW_CARRIER);
		createEAttribute(hpFlowCarrierEClass, HP_FLOW_CARRIER__NAME);
		createEReference(hpFlowCarrierEClass, HP_FLOW_CARRIER__HP_NETWORK_NODE_TARGETS);
		createEReference(hpFlowCarrierEClass, HP_FLOW_CARRIER__SERVICE_CURVE_FUNCTION);
		createEReference(hpFlowCarrierEClass, HP_FLOW_CARRIER__TRAFFIC_SHAPER_FUNCTION);
		createEReference(hpFlowCarrierEClass, HP_FLOW_CARRIER__PROCESSING_UNIT_ORIGIN);
		createEReference(hpFlowCarrierEClass, HP_FLOW_CARRIER__RTP_COMMUNICATION_ARBITRATION_POLICY);

		hpCommunicationRouterEClass = createEClass(HP_COMMUNICATION_ROUTER);
		createEReference(hpCommunicationRouterEClass, HP_COMMUNICATION_ROUTER__NETWORK_PORTS);
		createEAttribute(hpCommunicationRouterEClass, HP_COMMUNICATION_ROUTER__NAME);

		hpNetworkPortEClass = createEClass(HP_NETWORK_PORT);
		createEReference(hpNetworkPortEClass, HP_NETWORK_PORT__COMM_CHANNEL);
		createEAttribute(hpNetworkPortEClass, HP_NETWORK_PORT__NAME);
		createEReference(hpNetworkPortEClass, HP_NETWORK_PORT__RTP_FLOW_RATE);
		createEReference(hpNetworkPortEClass, HP_NETWORK_PORT__FLOW_RATE);
		createEReference(hpNetworkPortEClass, HP_NETWORK_PORT__RTP_NETWORK_PROTOCOL);
		createEReference(hpNetworkPortEClass, HP_NETWORK_PORT__RTP_TRANSMISSION_MODE);

		hpCommunicationChannelEClass = createEClass(HP_COMMUNICATION_CHANNEL);
		createEReference(hpCommunicationChannelEClass, HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS);
		createEReference(hpCommunicationChannelEClass, HP_COMMUNICATION_CHANNEL__NETWORK_PORT);
		createEAttribute(hpCommunicationChannelEClass, HP_COMMUNICATION_CHANNEL__NAME);
		createEReference(hpCommunicationChannelEClass, HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET);
		createEReference(hpCommunicationChannelEClass, HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET);

		hpProcessorInterconnectorEClass = createEClass(HP_PROCESSOR_INTERCONNECTOR);
		createEReference(hpProcessorInterconnectorEClass, HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS);
		createEReference(hpProcessorInterconnectorEClass, HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL);
		createEAttribute(hpProcessorInterconnectorEClass, HP_PROCESSOR_INTERCONNECTOR__NAME);
		createEReference(hpProcessorInterconnectorEClass, HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY);

		hpNetworkNodeEClass = createEClass(HP_NETWORK_NODE);
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
		RtpTypesPackage theRtpTypesPackage = (RtpTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI);
		SoftwareOperatorsPackage theSoftwareOperatorsPackage = (SoftwareOperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RtpComputationAndAnalysisFunctionsPackage theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI);
		RtpProtocolsAndPoliciesPackage theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hpProcessingUnitEClass.getESuperTypes().add(this.getHpNetworkNode());
		hpFlowCarrierEClass.getESuperTypes().add(this.getHpNetworkNode());
		hpProcessorInterconnectorEClass.getESuperTypes().add(this.getHpNetworkNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemHardwareSideEClass, SystemHardwareSide.class, "SystemHardwareSide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemHardwareSide_ProcessingUnits(), this.getHpProcessingUnit(), null, "processingUnits", null, 0, -1, SystemHardwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemHardwareSide_CommRouters(), this.getHpCommunicationRouter(), null, "commRouters", null, 0, -1, SystemHardwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemHardwareSide_CommChannels(), this.getHpCommunicationChannel(), null, "commChannels", null, 0, -1, SystemHardwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemHardwareSide_Name(), ecorePackage.getEString(), "name", null, 1, 1, SystemHardwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemHardwareSide_ProcessorInterconnectors(), this.getHpProcessorInterconnector(), null, "processorInterconnectors", null, 0, -1, SystemHardwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemHardwareSide_Hpflowcarrier(), this.getHpFlowCarrier(), null, "hpflowcarrier", null, 0, -1, SystemHardwareSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpProcessingUnitEClass, HpProcessingUnit.class, "HpProcessingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHpProcessingUnit_CommChannel(), this.getHpCommunicationChannel(), this.getHpCommunicationChannel_ProcessingUnits(), "commChannel", null, 0, 1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHpProcessingUnit_Name(), ecorePackage.getEString(), "name", null, 1, 1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_RtpUtilizationFactor(), theRtpTypesPackage.getRtpUtilizationFactorType(), null, "rtpUtilizationFactor", null, 0, 1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_SpaceProcesses(), theSoftwareOperatorsPackage.getSoSpaceProcess(), theSoftwareOperatorsPackage.getSoSpaceProcess_ProcessingUnit(), "spaceProcesses", null, 0, -1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_CandidateTasks(), theSoftwareOperatorsPackage.getSoSchedulableTask(), theSoftwareOperatorsPackage.getSoSchedulableTask_FavoriteProcessors(), "candidateTasks", null, 0, -1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_SchedulableTasks(), theSoftwareOperatorsPackage.getSoSchedulableTask(), theSoftwareOperatorsPackage.getSoSchedulableTask_RunOnProcessors(), "schedulableTasks", null, 0, -1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_UtilizationFactor(), theRtpTypesPackage.getRtpUtilizationFactorType(), null, "utilizationFactor", null, 0, 1, HpProcessingUnit.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_ProcessorInterconnector(), this.getHpProcessorInterconnector(), this.getHpProcessorInterconnector_ProcessingUnits(), "processorInterconnector", null, 0, 1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessingUnit_RtpComputingSpeed(), theRtpTypesPackage.getRtpComputingSpeedType(), null, "rtpComputingSpeed", null, 0, 1, HpProcessingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpFlowCarrierEClass, HpFlowCarrier.class, "HpFlowCarrier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHpFlowCarrier_Name(), theEcorePackage.getEString(), "name", null, 1, 1, HpFlowCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpFlowCarrier_HpNetworkNodeTargets(), this.getHpNetworkNode(), null, "hpNetworkNodeTargets", null, 1, -1, HpFlowCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpFlowCarrier_ServiceCurveFunction(), theRtpComputationAndAnalysisFunctionsPackage.getPiecewiseLinearAnalysisFunction(), null, "ServiceCurveFunction", null, 0, 1, HpFlowCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpFlowCarrier_TrafficShaperFunction(), theRtpComputationAndAnalysisFunctionsPackage.getPiecewiseLinearAnalysisFunction(), null, "TrafficShaperFunction", null, 0, 1, HpFlowCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpFlowCarrier_ProcessingUnitOrigin(), this.getHpProcessingUnit(), null, "processingUnitOrigin", null, 0, 1, HpFlowCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpFlowCarrier_RtpCommunicationArbitrationPolicy(), theRtpProtocolsAndPoliciesPackage.getRtpCommunicationArbitrationPolicyType(), null, "rtpCommunicationArbitrationPolicy", null, 1, 1, HpFlowCarrier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpCommunicationRouterEClass, HpCommunicationRouter.class, "HpCommunicationRouter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHpCommunicationRouter_NetworkPorts(), this.getHpNetworkPort(), null, "networkPorts", null, 1, -1, HpCommunicationRouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHpCommunicationRouter_Name(), ecorePackage.getEString(), "name", "", 1, 1, HpCommunicationRouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpNetworkPortEClass, HpNetworkPort.class, "HpNetworkPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHpNetworkPort_CommChannel(), this.getHpCommunicationChannel(), this.getHpCommunicationChannel_NetworkPort(), "commChannel", null, 1, 1, HpNetworkPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHpNetworkPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, HpNetworkPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpNetworkPort_RtpFlowRate(), theRtpTypesPackage.getRtpFlowRateType(), null, "rtpFlowRate", null, 0, 1, HpNetworkPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpNetworkPort_FlowRate(), theRtpTypesPackage.getRtpFlowRateType(), null, "flowRate", null, 0, 1, HpNetworkPort.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getHpNetworkPort_RtpNetworkProtocol(), theRtpProtocolsAndPoliciesPackage.getRtpNetworkProtocolType(), null, "rtpNetworkProtocol", null, 1, 1, HpNetworkPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpNetworkPort_RtpTransmissionMode(), theRtpProtocolsAndPoliciesPackage.getRtpTransmissionModeType(), null, "rtpTransmissionMode", null, 1, 1, HpNetworkPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpCommunicationChannelEClass, HpCommunicationChannel.class, "HpCommunicationChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHpCommunicationChannel_ProcessingUnits(), this.getHpProcessingUnit(), this.getHpProcessingUnit_CommChannel(), "processingUnits", null, 0, -1, HpCommunicationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpCommunicationChannel_NetworkPort(), this.getHpNetworkPort(), this.getHpNetworkPort_CommChannel(), "networkPort", null, 1, -1, HpCommunicationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHpCommunicationChannel_Name(), ecorePackage.getEString(), "name", null, 1, 1, HpCommunicationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpCommunicationChannel_ProcessingUnitSet(), this.getHpProcessorInterconnector(), this.getHpProcessorInterconnector_CommChannel(), "processingUnitSet", null, 0, -1, HpCommunicationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpCommunicationChannel_NetworkNodeSet(), this.getHpNetworkNode(), null, "networkNodeSet", null, 0, -1, HpCommunicationChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpProcessorInterconnectorEClass, HpProcessorInterconnector.class, "HpProcessorInterconnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHpProcessorInterconnector_ProcessingUnits(), this.getHpProcessingUnit(), this.getHpProcessingUnit_ProcessorInterconnector(), "processingUnits", null, 2, -1, HpProcessorInterconnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessorInterconnector_CommChannel(), this.getHpCommunicationChannel(), this.getHpCommunicationChannel_ProcessingUnitSet(), "commChannel", null, 0, 1, HpProcessorInterconnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHpProcessorInterconnector_Name(), ecorePackage.getEString(), "name", null, 1, 1, HpProcessorInterconnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHpProcessorInterconnector_RtpMultiprocessorCategory(), theRtpProtocolsAndPoliciesPackage.getRtpMultiprocessorCategoryType(), null, "rtpMultiprocessorCategory", null, 1, 1, HpProcessorInterconnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hpNetworkNodeEClass, HpNetworkNode.class, "HpNetworkNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (systemHardwareSideEClass, 
		   source, 
		   new String[] {
			 "constraints", "SystemHardwareSideRule1"
		   });	
		addAnnotation
		  (hpProcessingUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "HpProcessingUnitRule1 HpProcessingUnitRule2 HpProcessingUnitRule3"
		   });	
		addAnnotation
		  (hpCommunicationRouterEClass, 
		   source, 
		   new String[] {
			 "constraints", "HpCommunicationRouterRule1"
		   });	
		addAnnotation
		  (hpCommunicationChannelEClass, 
		   source, 
		   new String[] {
			 "constraints", "HpCommunicationChannelRule1"
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
		  (systemHardwareSideEClass, 
		   source, 
		   new String[] {
			 "SystemHardwareSideRule1", "self.processingUnits->size()>1 implies self.processingUnits->select(pr : HpProcessingUnit | pr.commChannel->isEmpty() and pr.processorInterconnector->isEmpty())->size()=0"
		   });	
		addAnnotation
		  (hpProcessingUnitEClass, 
		   source, 
		   new String[] {
			 "HpProcessingUnitRule1", "(self.commChannel->notEmpty() and self.processorInterconnector->notEmpty()) implies  self.commChannel<>self.processorInterconnector.commChannel",
			 "HpProcessingUnitRule2", "self.candidateTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.candidateTasks)",
			 "HpProcessingUnitRule3", "self.schedulableTasks->notEmpty() implies  (self.spaceProcesses->collect(sp | sp.schedulableTasks))->includesAll(self.schedulableTasks)"
		   });	
		addAnnotation
		  (getHpProcessingUnit_UtilizationFactor(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpUtilizationFactor"
		   });	
		addAnnotation
		  (hpCommunicationRouterEClass, 
		   source, 
		   new String[] {
			 "HpCommunicationRouterRule1", "self.networkPorts->forAll(np1,np2 | np1 <> np2 implies np1.commChannel <> np2.commChannel)"
		   });	
		addAnnotation
		  (getHpNetworkPort_FlowRate(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpFlowRate"
		   });	
		addAnnotation
		  (hpCommunicationChannelEClass, 
		   source, 
		   new String[] {
			 "HpCommunicationChannelRule1", "self.processingUnits->isEmpty() implies (self.processingUnitSet->notEmpty() or self.networkPort->size()>=2)"
		   });
	}

} //HardwarePlatformPackageImpl
