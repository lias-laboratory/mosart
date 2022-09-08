/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

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

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ATMNetworkProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.CANNetworkProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DataQueueCommunicationMechanism;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.EarliestDeadlineFirstSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FDDINetworkProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOCommunicationArbitrationPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWaitingQueuePolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIPNetworkProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPriorityCommunicationArbitrationPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FixedPrioritySchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullDuplexTransmissionMode;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HomogeneousMultiprocessorCategory;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.ICPPProtectProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOCommunicationArbitrationPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PCPProtectProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PriorityWaitingQueuePolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RoundRobinSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationArbitrationPolicyType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpCommunicationMechanismType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpNetworkProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtectProtocolType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesFactory;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpSchedulingPolicyType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTaskAllocationType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpTransmissionModeType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpWaitingQueuePolicyType;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.SimpleTransmissionMode;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory;
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

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpProtocolsAndPoliciesPackageImpl extends EPackageImpl implements RtpProtocolsAndPoliciesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpProtectProtocolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipProtectProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcpProtectProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpCommunicationArbitrationPolicyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fifoCommunicationArbitrationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPriorityCommunicationArbitrationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifoCommunicationArbitrationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpWaitingQueuePolicyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fifoWaitingQueuePolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifoWaitingQueuePolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityWaitingQueuePolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpNetworkProtocolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canNetworkProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afdxNetworkProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atmNetworkProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fipNetworkProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fddiNetworkProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpSchedulingPolicyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedPrioritySchedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leastLaxityFirstSchedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundRobinSchedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earliestDeadlineFirstSchedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpCommunicationMechanismTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeCommunicationMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataQueueCommunicationMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpTransmissionModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullDuplexTransmissionModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfDuplexTransmissionModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTransmissionModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass icppProtectProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ocppProtectProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlineMonotonicSchedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateMonotonicSchedulingPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpTaskAllocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionedTaskAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fullMigrationTaskAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restrictedMigrationTaskAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpMultiprocessorCategoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heterogenousMultiprocessorCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass homogeneousMultiprocessorCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformMultiprocessorCategoryEClass = null;

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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtpProtocolsAndPoliciesPackageImpl() {
		super(eNS_URI, RtpProtocolsAndPoliciesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtpProtocolsAndPoliciesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtpProtocolsAndPoliciesPackage init() {
		if (isInited) return (RtpProtocolsAndPoliciesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI);

		// Obtain or create and register package
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtpProtocolsAndPoliciesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MoSaRTPackageImpl theMoSaRTPackage = (MoSaRTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) instanceof MoSaRTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) : MoSaRTPackage.eINSTANCE);
		SoftwareOperatorsPackageImpl theSoftwareOperatorsPackage = (SoftwareOperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) instanceof SoftwareOperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) : SoftwareOperatorsPackage.eINSTANCE);
		SoftwareBehaviorPackageImpl theSoftwareBehaviorPackage = (SoftwareBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) instanceof SoftwareBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) : SoftwareBehaviorPackage.eINSTANCE);
		HardwarePlatformPackageImpl theHardwarePlatformPackage = (HardwarePlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) instanceof HardwarePlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) : HardwarePlatformPackage.eINSTANCE);
		RealTimePropertiesPackageImpl theRealTimePropertiesPackage = (RealTimePropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) instanceof RealTimePropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) : RealTimePropertiesPackage.eINSTANCE);
		RtpTypesPackageImpl theRtpTypesPackage = (RtpTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) instanceof RtpTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) : RtpTypesPackage.eINSTANCE);
		RtpUtilityTypesPackageImpl theRtpUtilityTypesPackage = (RtpUtilityTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) instanceof RtpUtilityTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) : RtpUtilityTypesPackage.eINSTANCE);
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) : RtpMeasurementUnitsPackage.eINSTANCE);
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRealTimePropertiesPackage.initializePackageContents();
		theRtpTypesPackage.initializePackageContents();
		theRtpUtilityTypesPackage.initializePackageContents();
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theRtpHelperTypesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtpProtocolsAndPoliciesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtpProtocolsAndPoliciesPackage.eNS_URI, theRtpProtocolsAndPoliciesPackage);
		return theRtpProtocolsAndPoliciesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpProtectProtocolType() {
		return rtpProtectProtocolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpProtectProtocolType_ProtocolType() {
		return (EAttribute)rtpProtectProtocolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPIPProtectProtocol() {
		return pipProtectProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCPProtectProtocol() {
		return pcpProtectProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpCommunicationArbitrationPolicyType() {
		return rtpCommunicationArbitrationPolicyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpCommunicationArbitrationPolicyType_PolicyType() {
		return (EAttribute)rtpCommunicationArbitrationPolicyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFIFOCommunicationArbitrationPolicy() {
		return fifoCommunicationArbitrationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPriorityCommunicationArbitrationPolicy() {
		return fixedPriorityCommunicationArbitrationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLIFOCommunicationArbitrationPolicy() {
		return lifoCommunicationArbitrationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpWaitingQueuePolicyType() {
		return rtpWaitingQueuePolicyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpWaitingQueuePolicyType_PolicyType() {
		return (EAttribute)rtpWaitingQueuePolicyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFIFOWaitingQueuePolicy() {
		return fifoWaitingQueuePolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLIFOWaitingQueuePolicy() {
		return lifoWaitingQueuePolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityWaitingQueuePolicy() {
		return priorityWaitingQueuePolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpNetworkProtocolType() {
		return rtpNetworkProtocolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpNetworkProtocolType_ProtocolType() {
		return (EAttribute)rtpNetworkProtocolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCANNetworkProtocol() {
		return canNetworkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFDXNetworkProtocol() {
		return afdxNetworkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATMNetworkProtocol() {
		return atmNetworkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFIPNetworkProtocol() {
		return fipNetworkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFDDINetworkProtocol() {
		return fddiNetworkProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpSchedulingPolicyType() {
		return rtpSchedulingPolicyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpSchedulingPolicyType_PolicyType() {
		return (EAttribute)rtpSchedulingPolicyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedPrioritySchedulingPolicy() {
		return fixedPrioritySchedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeastLaxityFirstSchedulingPolicy() {
		return leastLaxityFirstSchedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundRobinSchedulingPolicy() {
		return roundRobinSchedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarliestDeadlineFirstSchedulingPolicy() {
		return earliestDeadlineFirstSchedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpCommunicationMechanismType() {
		return rtpCommunicationMechanismTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpCommunicationMechanismType_RtpDataSize() {
		return (EReference)rtpCommunicationMechanismTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpCommunicationMechanismType_MechanismType() {
		return (EAttribute)rtpCommunicationMechanismTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipeCommunicationMechanism() {
		return pipeCommunicationMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataQueueCommunicationMechanism() {
		return dataQueueCommunicationMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataQueueCommunicationMechanism_Overwriting() {
		return (EAttribute)dataQueueCommunicationMechanismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpTransmissionModeType() {
		return rtpTransmissionModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpTransmissionModeType_ModeType() {
		return (EAttribute)rtpTransmissionModeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullDuplexTransmissionMode() {
		return fullDuplexTransmissionModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfDuplexTransmissionMode() {
		return halfDuplexTransmissionModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTransmissionMode() {
		return simpleTransmissionModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICPPProtectProtocol() {
		return icppProtectProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCPPProtectProtocol() {
		return ocppProtectProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadlineMonotonicSchedulingPolicy() {
		return deadlineMonotonicSchedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateMonotonicSchedulingPolicy() {
		return rateMonotonicSchedulingPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpTaskAllocationType() {
		return rtpTaskAllocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpTaskAllocationType_AllocationType() {
		return (EAttribute)rtpTaskAllocationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionedTaskAllocation() {
		return partitionedTaskAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFullMigrationTaskAllocation() {
		return fullMigrationTaskAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestrictedMigrationTaskAllocation() {
		return restrictedMigrationTaskAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpMultiprocessorCategoryType() {
		return rtpMultiprocessorCategoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpMultiprocessorCategoryType_CategoryType() {
		return (EAttribute)rtpMultiprocessorCategoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeterogenousMultiprocessorCategory() {
		return heterogenousMultiprocessorCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHomogeneousMultiprocessorCategory() {
		return homogeneousMultiprocessorCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformMultiprocessorCategory() {
		return uniformMultiprocessorCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpProtocolsAndPoliciesFactory getRtpProtocolsAndPoliciesFactory() {
		return (RtpProtocolsAndPoliciesFactory)getEFactoryInstance();
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
		rtpProtectProtocolTypeEClass = createEClass(RTP_PROTECT_PROTOCOL_TYPE);
		createEAttribute(rtpProtectProtocolTypeEClass, RTP_PROTECT_PROTOCOL_TYPE__PROTOCOL_TYPE);

		pipProtectProtocolEClass = createEClass(PIP_PROTECT_PROTOCOL);

		pcpProtectProtocolEClass = createEClass(PCP_PROTECT_PROTOCOL);

		rtpCommunicationArbitrationPolicyTypeEClass = createEClass(RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE);
		createEAttribute(rtpCommunicationArbitrationPolicyTypeEClass, RTP_COMMUNICATION_ARBITRATION_POLICY_TYPE__POLICY_TYPE);

		fifoCommunicationArbitrationPolicyEClass = createEClass(FIFO_COMMUNICATION_ARBITRATION_POLICY);

		fixedPriorityCommunicationArbitrationPolicyEClass = createEClass(FIXED_PRIORITY_COMMUNICATION_ARBITRATION_POLICY);

		lifoCommunicationArbitrationPolicyEClass = createEClass(LIFO_COMMUNICATION_ARBITRATION_POLICY);

		rtpWaitingQueuePolicyTypeEClass = createEClass(RTP_WAITING_QUEUE_POLICY_TYPE);
		createEAttribute(rtpWaitingQueuePolicyTypeEClass, RTP_WAITING_QUEUE_POLICY_TYPE__POLICY_TYPE);

		fifoWaitingQueuePolicyEClass = createEClass(FIFO_WAITING_QUEUE_POLICY);

		lifoWaitingQueuePolicyEClass = createEClass(LIFO_WAITING_QUEUE_POLICY);

		priorityWaitingQueuePolicyEClass = createEClass(PRIORITY_WAITING_QUEUE_POLICY);

		rtpNetworkProtocolTypeEClass = createEClass(RTP_NETWORK_PROTOCOL_TYPE);
		createEAttribute(rtpNetworkProtocolTypeEClass, RTP_NETWORK_PROTOCOL_TYPE__PROTOCOL_TYPE);

		canNetworkProtocolEClass = createEClass(CAN_NETWORK_PROTOCOL);

		afdxNetworkProtocolEClass = createEClass(AFDX_NETWORK_PROTOCOL);

		atmNetworkProtocolEClass = createEClass(ATM_NETWORK_PROTOCOL);

		fipNetworkProtocolEClass = createEClass(FIP_NETWORK_PROTOCOL);

		fddiNetworkProtocolEClass = createEClass(FDDI_NETWORK_PROTOCOL);

		rtpSchedulingPolicyTypeEClass = createEClass(RTP_SCHEDULING_POLICY_TYPE);
		createEAttribute(rtpSchedulingPolicyTypeEClass, RTP_SCHEDULING_POLICY_TYPE__POLICY_TYPE);

		fixedPrioritySchedulingPolicyEClass = createEClass(FIXED_PRIORITY_SCHEDULING_POLICY);

		leastLaxityFirstSchedulingPolicyEClass = createEClass(LEAST_LAXITY_FIRST_SCHEDULING_POLICY);

		roundRobinSchedulingPolicyEClass = createEClass(ROUND_ROBIN_SCHEDULING_POLICY);

		earliestDeadlineFirstSchedulingPolicyEClass = createEClass(EARLIEST_DEADLINE_FIRST_SCHEDULING_POLICY);

		rtpCommunicationMechanismTypeEClass = createEClass(RTP_COMMUNICATION_MECHANISM_TYPE);
		createEReference(rtpCommunicationMechanismTypeEClass, RTP_COMMUNICATION_MECHANISM_TYPE__RTP_DATA_SIZE);
		createEAttribute(rtpCommunicationMechanismTypeEClass, RTP_COMMUNICATION_MECHANISM_TYPE__MECHANISM_TYPE);

		pipeCommunicationMechanismEClass = createEClass(PIPE_COMMUNICATION_MECHANISM);

		dataQueueCommunicationMechanismEClass = createEClass(DATA_QUEUE_COMMUNICATION_MECHANISM);
		createEAttribute(dataQueueCommunicationMechanismEClass, DATA_QUEUE_COMMUNICATION_MECHANISM__OVERWRITING);

		rtpTransmissionModeTypeEClass = createEClass(RTP_TRANSMISSION_MODE_TYPE);
		createEAttribute(rtpTransmissionModeTypeEClass, RTP_TRANSMISSION_MODE_TYPE__MODE_TYPE);

		fullDuplexTransmissionModeEClass = createEClass(FULL_DUPLEX_TRANSMISSION_MODE);

		halfDuplexTransmissionModeEClass = createEClass(HALF_DUPLEX_TRANSMISSION_MODE);

		simpleTransmissionModeEClass = createEClass(SIMPLE_TRANSMISSION_MODE);

		icppProtectProtocolEClass = createEClass(ICPP_PROTECT_PROTOCOL);

		ocppProtectProtocolEClass = createEClass(OCPP_PROTECT_PROTOCOL);

		deadlineMonotonicSchedulingPolicyEClass = createEClass(DEADLINE_MONOTONIC_SCHEDULING_POLICY);

		rateMonotonicSchedulingPolicyEClass = createEClass(RATE_MONOTONIC_SCHEDULING_POLICY);

		rtpTaskAllocationTypeEClass = createEClass(RTP_TASK_ALLOCATION_TYPE);
		createEAttribute(rtpTaskAllocationTypeEClass, RTP_TASK_ALLOCATION_TYPE__ALLOCATION_TYPE);

		partitionedTaskAllocationEClass = createEClass(PARTITIONED_TASK_ALLOCATION);

		fullMigrationTaskAllocationEClass = createEClass(FULL_MIGRATION_TASK_ALLOCATION);

		restrictedMigrationTaskAllocationEClass = createEClass(RESTRICTED_MIGRATION_TASK_ALLOCATION);

		rtpMultiprocessorCategoryTypeEClass = createEClass(RTP_MULTIPROCESSOR_CATEGORY_TYPE);
		createEAttribute(rtpMultiprocessorCategoryTypeEClass, RTP_MULTIPROCESSOR_CATEGORY_TYPE__CATEGORY_TYPE);

		heterogenousMultiprocessorCategoryEClass = createEClass(HETEROGENOUS_MULTIPROCESSOR_CATEGORY);

		homogeneousMultiprocessorCategoryEClass = createEClass(HOMOGENEOUS_MULTIPROCESSOR_CATEGORY);

		uniformMultiprocessorCategoryEClass = createEClass(UNIFORM_MULTIPROCESSOR_CATEGORY);
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
		RealTimePropertiesPackage theRealTimePropertiesPackage = (RealTimePropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI);
		RtpHelperTypesPackage theRtpHelperTypesPackage = (RtpHelperTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rtpProtectProtocolTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		pipProtectProtocolEClass.getESuperTypes().add(this.getRtpProtectProtocolType());
		pcpProtectProtocolEClass.getESuperTypes().add(this.getRtpProtectProtocolType());
		rtpCommunicationArbitrationPolicyTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		fifoCommunicationArbitrationPolicyEClass.getESuperTypes().add(this.getRtpCommunicationArbitrationPolicyType());
		fixedPriorityCommunicationArbitrationPolicyEClass.getESuperTypes().add(this.getRtpCommunicationArbitrationPolicyType());
		lifoCommunicationArbitrationPolicyEClass.getESuperTypes().add(this.getRtpCommunicationArbitrationPolicyType());
		rtpWaitingQueuePolicyTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		fifoWaitingQueuePolicyEClass.getESuperTypes().add(this.getRtpWaitingQueuePolicyType());
		lifoWaitingQueuePolicyEClass.getESuperTypes().add(this.getRtpWaitingQueuePolicyType());
		priorityWaitingQueuePolicyEClass.getESuperTypes().add(this.getRtpWaitingQueuePolicyType());
		rtpNetworkProtocolTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		canNetworkProtocolEClass.getESuperTypes().add(this.getRtpNetworkProtocolType());
		afdxNetworkProtocolEClass.getESuperTypes().add(this.getRtpNetworkProtocolType());
		atmNetworkProtocolEClass.getESuperTypes().add(this.getRtpNetworkProtocolType());
		fipNetworkProtocolEClass.getESuperTypes().add(this.getRtpNetworkProtocolType());
		fddiNetworkProtocolEClass.getESuperTypes().add(this.getRtpNetworkProtocolType());
		rtpSchedulingPolicyTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		fixedPrioritySchedulingPolicyEClass.getESuperTypes().add(this.getRtpSchedulingPolicyType());
		leastLaxityFirstSchedulingPolicyEClass.getESuperTypes().add(this.getRtpSchedulingPolicyType());
		roundRobinSchedulingPolicyEClass.getESuperTypes().add(this.getRtpSchedulingPolicyType());
		earliestDeadlineFirstSchedulingPolicyEClass.getESuperTypes().add(this.getRtpSchedulingPolicyType());
		rtpCommunicationMechanismTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		pipeCommunicationMechanismEClass.getESuperTypes().add(this.getRtpCommunicationMechanismType());
		dataQueueCommunicationMechanismEClass.getESuperTypes().add(this.getRtpCommunicationMechanismType());
		rtpTransmissionModeTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		fullDuplexTransmissionModeEClass.getESuperTypes().add(this.getRtpTransmissionModeType());
		halfDuplexTransmissionModeEClass.getESuperTypes().add(this.getRtpTransmissionModeType());
		simpleTransmissionModeEClass.getESuperTypes().add(this.getRtpTransmissionModeType());
		icppProtectProtocolEClass.getESuperTypes().add(this.getPCPProtectProtocol());
		ocppProtectProtocolEClass.getESuperTypes().add(this.getPCPProtectProtocol());
		deadlineMonotonicSchedulingPolicyEClass.getESuperTypes().add(this.getFixedPrioritySchedulingPolicy());
		rateMonotonicSchedulingPolicyEClass.getESuperTypes().add(this.getFixedPrioritySchedulingPolicy());
		rtpTaskAllocationTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		partitionedTaskAllocationEClass.getESuperTypes().add(this.getRtpTaskAllocationType());
		fullMigrationTaskAllocationEClass.getESuperTypes().add(this.getRtpTaskAllocationType());
		restrictedMigrationTaskAllocationEClass.getESuperTypes().add(this.getRtpTaskAllocationType());
		rtpMultiprocessorCategoryTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		heterogenousMultiprocessorCategoryEClass.getESuperTypes().add(this.getRtpMultiprocessorCategoryType());
		homogeneousMultiprocessorCategoryEClass.getESuperTypes().add(this.getRtpMultiprocessorCategoryType());
		uniformMultiprocessorCategoryEClass.getESuperTypes().add(this.getRtpMultiprocessorCategoryType());

		// Initialize classes, features, and operations; add parameters
		initEClass(rtpProtectProtocolTypeEClass, RtpProtectProtocolType.class, "RtpProtectProtocolType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpProtectProtocolType_ProtocolType(), ecorePackage.getEString(), "protocolType", null, 0, 1, RtpProtectProtocolType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipProtectProtocolEClass, PIPProtectProtocol.class, "PIPProtectProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcpProtectProtocolEClass, PCPProtectProtocol.class, "PCPProtectProtocol", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpCommunicationArbitrationPolicyTypeEClass, RtpCommunicationArbitrationPolicyType.class, "RtpCommunicationArbitrationPolicyType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpCommunicationArbitrationPolicyType_PolicyType(), ecorePackage.getEString(), "policyType", null, 0, 1, RtpCommunicationArbitrationPolicyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fifoCommunicationArbitrationPolicyEClass, FIFOCommunicationArbitrationPolicy.class, "FIFOCommunicationArbitrationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedPriorityCommunicationArbitrationPolicyEClass, FixedPriorityCommunicationArbitrationPolicy.class, "FixedPriorityCommunicationArbitrationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifoCommunicationArbitrationPolicyEClass, LIFOCommunicationArbitrationPolicy.class, "LIFOCommunicationArbitrationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpWaitingQueuePolicyTypeEClass, RtpWaitingQueuePolicyType.class, "RtpWaitingQueuePolicyType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpWaitingQueuePolicyType_PolicyType(), ecorePackage.getEString(), "policyType", null, 0, 1, RtpWaitingQueuePolicyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fifoWaitingQueuePolicyEClass, FIFOWaitingQueuePolicy.class, "FIFOWaitingQueuePolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lifoWaitingQueuePolicyEClass, LIFOWaitingQueuePolicy.class, "LIFOWaitingQueuePolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(priorityWaitingQueuePolicyEClass, PriorityWaitingQueuePolicy.class, "PriorityWaitingQueuePolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpNetworkProtocolTypeEClass, RtpNetworkProtocolType.class, "RtpNetworkProtocolType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpNetworkProtocolType_ProtocolType(), ecorePackage.getEString(), "protocolType", null, 0, 1, RtpNetworkProtocolType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canNetworkProtocolEClass, CANNetworkProtocol.class, "CANNetworkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(afdxNetworkProtocolEClass, AFDXNetworkProtocol.class, "AFDXNetworkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atmNetworkProtocolEClass, ATMNetworkProtocol.class, "ATMNetworkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fipNetworkProtocolEClass, FIPNetworkProtocol.class, "FIPNetworkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fddiNetworkProtocolEClass, FDDINetworkProtocol.class, "FDDINetworkProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpSchedulingPolicyTypeEClass, RtpSchedulingPolicyType.class, "RtpSchedulingPolicyType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpSchedulingPolicyType_PolicyType(), ecorePackage.getEString(), "policyType", null, 0, 1, RtpSchedulingPolicyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixedPrioritySchedulingPolicyEClass, FixedPrioritySchedulingPolicy.class, "FixedPrioritySchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(leastLaxityFirstSchedulingPolicyEClass, LeastLaxityFirstSchedulingPolicy.class, "LeastLaxityFirstSchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roundRobinSchedulingPolicyEClass, RoundRobinSchedulingPolicy.class, "RoundRobinSchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earliestDeadlineFirstSchedulingPolicyEClass, EarliestDeadlineFirstSchedulingPolicy.class, "EarliestDeadlineFirstSchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpCommunicationMechanismTypeEClass, RtpCommunicationMechanismType.class, "RtpCommunicationMechanismType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpCommunicationMechanismType_RtpDataSize(), theRtpHelperTypesPackage.getRtpDataSizeType(), null, "RtpDataSize", null, 0, 1, RtpCommunicationMechanismType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtpCommunicationMechanismType_MechanismType(), ecorePackage.getEString(), "mechanismType", null, 0, 1, RtpCommunicationMechanismType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipeCommunicationMechanismEClass, PipeCommunicationMechanism.class, "PipeCommunicationMechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataQueueCommunicationMechanismEClass, DataQueueCommunicationMechanism.class, "DataQueueCommunicationMechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataQueueCommunicationMechanism_Overwriting(), ecorePackage.getEBoolean(), "overwriting", null, 1, 1, DataQueueCommunicationMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpTransmissionModeTypeEClass, RtpTransmissionModeType.class, "RtpTransmissionModeType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpTransmissionModeType_ModeType(), ecorePackage.getEString(), "modeType", null, 0, 1, RtpTransmissionModeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fullDuplexTransmissionModeEClass, FullDuplexTransmissionMode.class, "FullDuplexTransmissionMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(halfDuplexTransmissionModeEClass, HalfDuplexTransmissionMode.class, "HalfDuplexTransmissionMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleTransmissionModeEClass, SimpleTransmissionMode.class, "SimpleTransmissionMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(icppProtectProtocolEClass, ICPPProtectProtocol.class, "ICPPProtectProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ocppProtectProtocolEClass, OCPPProtectProtocol.class, "OCPPProtectProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadlineMonotonicSchedulingPolicyEClass, DeadlineMonotonicSchedulingPolicy.class, "DeadlineMonotonicSchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rateMonotonicSchedulingPolicyEClass, RateMonotonicSchedulingPolicy.class, "RateMonotonicSchedulingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpTaskAllocationTypeEClass, RtpTaskAllocationType.class, "RtpTaskAllocationType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpTaskAllocationType_AllocationType(), ecorePackage.getEString(), "AllocationType", null, 0, 1, RtpTaskAllocationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partitionedTaskAllocationEClass, PartitionedTaskAllocation.class, "PartitionedTaskAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fullMigrationTaskAllocationEClass, FullMigrationTaskAllocation.class, "FullMigrationTaskAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(restrictedMigrationTaskAllocationEClass, RestrictedMigrationTaskAllocation.class, "RestrictedMigrationTaskAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpMultiprocessorCategoryTypeEClass, RtpMultiprocessorCategoryType.class, "RtpMultiprocessorCategoryType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpMultiprocessorCategoryType_CategoryType(), ecorePackage.getEString(), "categoryType", null, 0, 1, RtpMultiprocessorCategoryType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(heterogenousMultiprocessorCategoryEClass, HeterogenousMultiprocessorCategory.class, "HeterogenousMultiprocessorCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(homogeneousMultiprocessorCategoryEClass, HomogeneousMultiprocessorCategory.class, "HomogeneousMultiprocessorCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniformMultiprocessorCategoryEClass, UniformMultiprocessorCategory.class, "UniformMultiprocessorCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //RtpProtocolsAndPoliciesPackageImpl
