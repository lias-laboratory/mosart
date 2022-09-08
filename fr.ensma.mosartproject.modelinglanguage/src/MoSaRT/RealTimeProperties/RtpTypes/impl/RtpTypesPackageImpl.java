/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

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

import MoSaRT.RealTimeProperties.RtpTypes.RtpAperiodicType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpBlockingTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpComputingSpeedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpCriticalityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpDeadlineType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpFlowRateType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpNonPreemptibleType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpNotSelfSuspendedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpOffsetType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibilityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpRepetitionType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpResponseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspensionType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpSporadicType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesFactory;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.RealTimeProperties.RtpTypes.RtpUtilizationFactorType;
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

import org.eclipse.emf.ecore.EOperation;
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
public class RtpTypesPackageImpl extends EPackageImpl implements RtpTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpPriorityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpPeriodicityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpPeriodicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpAperiodicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpSporadicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpReleaseTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpOffsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpMutuExcluResourceUtilizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpDeadlineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpResponseTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpBlockingTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpRepetitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpFlowRateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpUtilizationFactorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpCriticalityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpComputingSpeedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpPreemptibilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpPreemptibleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpNonPreemptibleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpCooperativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpSelfSuspensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpSelfSuspendedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpNotSelfSuspendedTypeEClass = null;

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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtpTypesPackageImpl() {
		super(eNS_URI, RtpTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtpTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtpTypesPackage init() {
		if (isInited) return (RtpTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI);

		// Obtain or create and register package
		RtpTypesPackageImpl theRtpTypesPackage = (RtpTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtpTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtpTypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MoSaRTPackageImpl theMoSaRTPackage = (MoSaRTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) instanceof MoSaRTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) : MoSaRTPackage.eINSTANCE);
		SoftwareOperatorsPackageImpl theSoftwareOperatorsPackage = (SoftwareOperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) instanceof SoftwareOperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) : SoftwareOperatorsPackage.eINSTANCE);
		SoftwareBehaviorPackageImpl theSoftwareBehaviorPackage = (SoftwareBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) instanceof SoftwareBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) : SoftwareBehaviorPackage.eINSTANCE);
		HardwarePlatformPackageImpl theHardwarePlatformPackage = (HardwarePlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) instanceof HardwarePlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) : HardwarePlatformPackage.eINSTANCE);
		RealTimePropertiesPackageImpl theRealTimePropertiesPackage = (RealTimePropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) instanceof RealTimePropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI) : RealTimePropertiesPackage.eINSTANCE);
		RtpUtilityTypesPackageImpl theRtpUtilityTypesPackage = (RtpUtilityTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) instanceof RtpUtilityTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) : RtpUtilityTypesPackage.eINSTANCE);
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) : RtpMeasurementUnitsPackage.eINSTANCE);
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRtpTypesPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRtpTypesPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRealTimePropertiesPackage.initializePackageContents();
		theRtpUtilityTypesPackage.initializePackageContents();
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theRtpHelperTypesPackage.initializePackageContents();
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtpTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtpTypesPackage.eNS_URI, theRtpTypesPackage);
		return theRtpTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpPriorityType() {
		return rtpPriorityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpPriorityType_Value() {
		return (EReference)rtpPriorityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpPeriodicityType() {
		return rtpPeriodicityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpPeriodicType() {
		return rtpPeriodicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpPeriodicType_Jitter() {
		return (EReference)rtpPeriodicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpPeriodicType_Period() {
		return (EReference)rtpPeriodicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpAperiodicType() {
		return rtpAperiodicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpSporadicType() {
		return rtpSporadicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpSporadicType_InterArrival() {
		return (EReference)rtpSporadicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpReleaseTimeType() {
		return rtpReleaseTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpReleaseTimeType_ReleaseTime() {
		return (EReference)rtpReleaseTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpReleaseTimeType_Referring() {
		return (EReference)rtpReleaseTimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpOffsetType() {
		return rtpOffsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpOffsetType_Offset() {
		return (EReference)rtpOffsetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpMutuExcluResourceUtilizationType() {
		return rtpMutuExcluResourceUtilizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpMutuExcluResourceUtilizationType_TimeUtilization() {
		return (EReference)rtpMutuExcluResourceUtilizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority() {
		return (EReference)rtpMutuExcluResourceUtilizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpMutuExcluResourceUtilizationType_Resource() {
		return (EReference)rtpMutuExcluResourceUtilizationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpDeadlineType() {
		return rtpDeadlineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpDeadlineType_Deadline() {
		return (EReference)rtpDeadlineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpResponseTimeType() {
		return rtpResponseTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpResponseTimeType_ResponseTime() {
		return (EReference)rtpResponseTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpBlockingTimeType() {
		return rtpBlockingTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpBlockingTimeType_BlockingTime() {
		return (EReference)rtpBlockingTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpRepetitionType() {
		return rtpRepetitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpRepetitionType_Repetition() {
		return (EAttribute)rtpRepetitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpFlowRateType() {
		return rtpFlowRateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpFlowRateType_FlowRate() {
		return (EReference)rtpFlowRateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpUtilizationFactorType() {
		return rtpUtilizationFactorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpUtilizationFactorType_U() {
		return (EReference)rtpUtilizationFactorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeType() {
		return rtpExecutionTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpExecutionTimeType_Unit() {
		return (EAttribute)rtpExecutionTimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeType_Value() {
		return (EReference)rtpExecutionTimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpExecutionTimeType__Greater__RtpExecutionTimeType() {
		return rtpExecutionTimeTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpExecutionTimeType__Lower__RtpExecutionTimeType() {
		return rtpExecutionTimeTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpExecutionTimeType__Equals__RtpExecutionTimeType() {
		return rtpExecutionTimeTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpExecutionTimeType__ConvertsTo__TimeUnits() {
		return rtpExecutionTimeTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpExecutionTimeType__AdoptsCalculatedValue() {
		return rtpExecutionTimeTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpCriticalityType() {
		return rtpCriticalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpCriticalityType_Value() {
		return (EReference)rtpCriticalityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpComputingSpeedType() {
		return rtpComputingSpeedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpComputingSpeedType_ComputingSpeed() {
		return (EReference)rtpComputingSpeedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpPreemptibilityType() {
		return rtpPreemptibilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpPreemptibleType() {
		return rtpPreemptibleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpPreemptibleType_Cost() {
		return (EReference)rtpPreemptibleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpNonPreemptibleType() {
		return rtpNonPreemptibleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpCooperativeType() {
		return rtpCooperativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpCooperativeType_NonPreemptibleSteps() {
		return (EReference)rtpCooperativeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpCooperativeType_NonPreemptibleIntervals() {
		return (EReference)rtpCooperativeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpSelfSuspensionType() {
		return rtpSelfSuspensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpSelfSuspendedType() {
		return rtpSelfSuspendedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpSelfSuspendedType_SelfSuspensionTime() {
		return (EReference)rtpSelfSuspendedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpNotSelfSuspendedType() {
		return rtpNotSelfSuspendedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTypesFactory getRtpTypesFactory() {
		return (RtpTypesFactory)getEFactoryInstance();
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
		rtpPriorityTypeEClass = createEClass(RTP_PRIORITY_TYPE);
		createEReference(rtpPriorityTypeEClass, RTP_PRIORITY_TYPE__VALUE);

		rtpPeriodicityTypeEClass = createEClass(RTP_PERIODICITY_TYPE);

		rtpPeriodicTypeEClass = createEClass(RTP_PERIODIC_TYPE);
		createEReference(rtpPeriodicTypeEClass, RTP_PERIODIC_TYPE__JITTER);
		createEReference(rtpPeriodicTypeEClass, RTP_PERIODIC_TYPE__PERIOD);

		rtpAperiodicTypeEClass = createEClass(RTP_APERIODIC_TYPE);

		rtpSporadicTypeEClass = createEClass(RTP_SPORADIC_TYPE);
		createEReference(rtpSporadicTypeEClass, RTP_SPORADIC_TYPE__INTER_ARRIVAL);

		rtpReleaseTimeTypeEClass = createEClass(RTP_RELEASE_TIME_TYPE);
		createEReference(rtpReleaseTimeTypeEClass, RTP_RELEASE_TIME_TYPE__RELEASE_TIME);
		createEReference(rtpReleaseTimeTypeEClass, RTP_RELEASE_TIME_TYPE__REFERRING);

		rtpOffsetTypeEClass = createEClass(RTP_OFFSET_TYPE);
		createEReference(rtpOffsetTypeEClass, RTP_OFFSET_TYPE__OFFSET);

		rtpMutuExcluResourceUtilizationTypeEClass = createEClass(RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE);
		createEReference(rtpMutuExcluResourceUtilizationTypeEClass, RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION);
		createEReference(rtpMutuExcluResourceUtilizationTypeEClass, RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY);
		createEReference(rtpMutuExcluResourceUtilizationTypeEClass, RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE);

		rtpDeadlineTypeEClass = createEClass(RTP_DEADLINE_TYPE);
		createEReference(rtpDeadlineTypeEClass, RTP_DEADLINE_TYPE__DEADLINE);

		rtpResponseTimeTypeEClass = createEClass(RTP_RESPONSE_TIME_TYPE);
		createEReference(rtpResponseTimeTypeEClass, RTP_RESPONSE_TIME_TYPE__RESPONSE_TIME);

		rtpBlockingTimeTypeEClass = createEClass(RTP_BLOCKING_TIME_TYPE);
		createEReference(rtpBlockingTimeTypeEClass, RTP_BLOCKING_TIME_TYPE__BLOCKING_TIME);

		rtpRepetitionTypeEClass = createEClass(RTP_REPETITION_TYPE);
		createEAttribute(rtpRepetitionTypeEClass, RTP_REPETITION_TYPE__REPETITION);

		rtpFlowRateTypeEClass = createEClass(RTP_FLOW_RATE_TYPE);
		createEReference(rtpFlowRateTypeEClass, RTP_FLOW_RATE_TYPE__FLOW_RATE);

		rtpUtilizationFactorTypeEClass = createEClass(RTP_UTILIZATION_FACTOR_TYPE);
		createEReference(rtpUtilizationFactorTypeEClass, RTP_UTILIZATION_FACTOR_TYPE__U);

		rtpExecutionTimeTypeEClass = createEClass(RTP_EXECUTION_TIME_TYPE);
		createEAttribute(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE__UNIT);
		createEReference(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE__VALUE);
		createEOperation(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE___GREATER__RTPEXECUTIONTIMETYPE);
		createEOperation(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE___LOWER__RTPEXECUTIONTIMETYPE);
		createEOperation(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE___EQUALS__RTPEXECUTIONTIMETYPE);
		createEOperation(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE___CONVERTS_TO__TIMEUNITS);
		createEOperation(rtpExecutionTimeTypeEClass, RTP_EXECUTION_TIME_TYPE___ADOPTS_CALCULATED_VALUE);

		rtpCriticalityTypeEClass = createEClass(RTP_CRITICALITY_TYPE);
		createEReference(rtpCriticalityTypeEClass, RTP_CRITICALITY_TYPE__VALUE);

		rtpComputingSpeedTypeEClass = createEClass(RTP_COMPUTING_SPEED_TYPE);
		createEReference(rtpComputingSpeedTypeEClass, RTP_COMPUTING_SPEED_TYPE__COMPUTING_SPEED);

		rtpPreemptibilityTypeEClass = createEClass(RTP_PREEMPTIBILITY_TYPE);

		rtpPreemptibleTypeEClass = createEClass(RTP_PREEMPTIBLE_TYPE);
		createEReference(rtpPreemptibleTypeEClass, RTP_PREEMPTIBLE_TYPE__COST);

		rtpNonPreemptibleTypeEClass = createEClass(RTP_NON_PREEMPTIBLE_TYPE);

		rtpCooperativeTypeEClass = createEClass(RTP_COOPERATIVE_TYPE);
		createEReference(rtpCooperativeTypeEClass, RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS);
		createEReference(rtpCooperativeTypeEClass, RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS);

		rtpSelfSuspensionTypeEClass = createEClass(RTP_SELF_SUSPENSION_TYPE);

		rtpSelfSuspendedTypeEClass = createEClass(RTP_SELF_SUSPENDED_TYPE);
		createEReference(rtpSelfSuspendedTypeEClass, RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME);

		rtpNotSelfSuspendedTypeEClass = createEClass(RTP_NOT_SELF_SUSPENDED_TYPE);
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
		RtpUtilityTypesPackage theRtpUtilityTypesPackage = (RtpUtilityTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI);
		RtpHelperTypesPackage theRtpHelperTypesPackage = (RtpHelperTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI);
		SoftwareOperatorsPackage theSoftwareOperatorsPackage = (SoftwareOperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI);
		RtpMeasurementUnitsPackage theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI);
		SoftwareBehaviorPackage theSoftwareBehaviorPackage = (SoftwareBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rtpPriorityTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpPeriodicityTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpPeriodicTypeEClass.getESuperTypes().add(this.getRtpPeriodicityType());
		rtpAperiodicTypeEClass.getESuperTypes().add(this.getRtpPeriodicityType());
		rtpSporadicTypeEClass.getESuperTypes().add(this.getRtpPeriodicityType());
		rtpReleaseTimeTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpOffsetTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpMutuExcluResourceUtilizationTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpDeadlineTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpResponseTimeTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpBlockingTimeTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpRepetitionTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpFlowRateTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpUtilizationFactorTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpExecutionTimeTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpCriticalityTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpComputingSpeedTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpPreemptibilityTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpPreemptibleTypeEClass.getESuperTypes().add(this.getRtpPreemptibilityType());
		rtpNonPreemptibleTypeEClass.getESuperTypes().add(this.getRtpPreemptibilityType());
		rtpCooperativeTypeEClass.getESuperTypes().add(this.getRtpPreemptibilityType());
		rtpSelfSuspensionTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpSelfSuspendedTypeEClass.getESuperTypes().add(this.getRtpSelfSuspensionType());
		rtpNotSelfSuspendedTypeEClass.getESuperTypes().add(this.getRtpSelfSuspensionType());

		// Initialize classes, features, and operations; add parameters
		initEClass(rtpPriorityTypeEClass, RtpPriorityType.class, "RtpPriorityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpPriorityType_Value(), theRtpUtilityTypesPackage.getIntegerVariable(), null, "value", null, 1, 1, RtpPriorityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpPeriodicityTypeEClass, RtpPeriodicityType.class, "RtpPeriodicityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpPeriodicTypeEClass, RtpPeriodicType.class, "RtpPeriodicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpPeriodicType_Jitter(), theRtpHelperTypesPackage.getRtpDurationType(), null, "jitter", null, 0, 1, RtpPeriodicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpPeriodicType_Period(), theRtpHelperTypesPackage.getRtpDurationType(), null, "period", null, 1, 1, RtpPeriodicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpAperiodicTypeEClass, RtpAperiodicType.class, "RtpAperiodicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpSporadicTypeEClass, RtpSporadicType.class, "RtpSporadicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpSporadicType_InterArrival(), theRtpHelperTypesPackage.getRtpInterArrivalType(), null, "interArrival", null, 1, 1, RtpSporadicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpReleaseTimeTypeEClass, RtpReleaseTimeType.class, "RtpReleaseTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpReleaseTimeType_ReleaseTime(), theRtpHelperTypesPackage.getRtpDurationType(), null, "releaseTime", null, 1, 1, RtpReleaseTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpReleaseTimeType_Referring(), theRtpHelperTypesPackage.getRtpReferenceType(), null, "referring", null, 0, 1, RtpReleaseTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpOffsetTypeEClass, RtpOffsetType.class, "RtpOffsetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpOffsetType_Offset(), theRtpHelperTypesPackage.getRtpDurationType(), null, "offset", null, 1, 1, RtpOffsetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpMutuExcluResourceUtilizationTypeEClass, RtpMutuExcluResourceUtilizationType.class, "RtpMutuExcluResourceUtilizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpMutuExcluResourceUtilizationType_TimeUtilization(), theRtpHelperTypesPackage.getRtpDurationType(), null, "timeUtilization", null, 1, 1, RtpMutuExcluResourceUtilizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority(), this.getRtpPriorityType(), null, "specialAccessPriority", null, 0, 1, RtpMutuExcluResourceUtilizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpMutuExcluResourceUtilizationType_Resource(), theSoftwareOperatorsPackage.getSoInteractionResource(), null, "resource", null, 1, 1, RtpMutuExcluResourceUtilizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpDeadlineTypeEClass, RtpDeadlineType.class, "RtpDeadlineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpDeadlineType_Deadline(), theRtpHelperTypesPackage.getRtpDurationType(), null, "deadline", null, 1, 1, RtpDeadlineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpResponseTimeTypeEClass, RtpResponseTimeType.class, "RtpResponseTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpResponseTimeType_ResponseTime(), theRtpHelperTypesPackage.getRtpDurationType(), null, "responseTime", null, 1, 1, RtpResponseTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpBlockingTimeTypeEClass, RtpBlockingTimeType.class, "RtpBlockingTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpBlockingTimeType_BlockingTime(), theRtpHelperTypesPackage.getRtpDurationType(), null, "blockingTime", null, 1, 1, RtpBlockingTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpRepetitionTypeEClass, RtpRepetitionType.class, "RtpRepetitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpRepetitionType_Repetition(), ecorePackage.getEInt(), "repetition", "0", 1, 1, RtpRepetitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpFlowRateTypeEClass, RtpFlowRateType.class, "RtpFlowRateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpFlowRateType_FlowRate(), theRtpHelperTypesPackage.getRtpDataRateType(), null, "flowRate", null, 1, 1, RtpFlowRateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpUtilizationFactorTypeEClass, RtpUtilizationFactorType.class, "RtpUtilizationFactorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpUtilizationFactorType_U(), theRtpUtilityTypesPackage.getRealVariable(), null, "U", null, 1, 1, RtpUtilizationFactorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpExecutionTimeTypeEClass, RtpExecutionTimeType.class, "RtpExecutionTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpExecutionTimeType_Unit(), theRtpMeasurementUnitsPackage.getTimeUnits(), "unit", null, 1, 1, RtpExecutionTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpExecutionTimeType_Value(), theRtpHelperTypesPackage.getRtpExecutionTimeValue(), null, "value", null, 1, 1, RtpExecutionTimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRtpExecutionTimeType__Greater__RtpExecutionTimeType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpExecutionTimeType(), "otherExecutionTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpExecutionTimeType__Lower__RtpExecutionTimeType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpExecutionTimeType(), "otherExecutionTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpExecutionTimeType__Equals__RtpExecutionTimeType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpExecutionTimeType(), "otherExecutionTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpExecutionTimeType__ConvertsTo__TimeUnits(), this.getRtpExecutionTimeType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getTimeUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRtpExecutionTimeType__AdoptsCalculatedValue(), this.getRtpExecutionTimeType(), "adoptsCalculatedValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpCriticalityTypeEClass, RtpCriticalityType.class, "RtpCriticalityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpCriticalityType_Value(), theRtpUtilityTypesPackage.getIntegerVariable(), null, "value", null, 1, 1, RtpCriticalityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpComputingSpeedTypeEClass, RtpComputingSpeedType.class, "RtpComputingSpeedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpComputingSpeedType_ComputingSpeed(), theRtpHelperTypesPackage.getRtpFrequencyType(), null, "computingSpeed", null, 1, 1, RtpComputingSpeedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpPreemptibilityTypeEClass, RtpPreemptibilityType.class, "RtpPreemptibilityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpPreemptibleTypeEClass, RtpPreemptibleType.class, "RtpPreemptibleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpPreemptibleType_Cost(), theRtpHelperTypesPackage.getRtpDurationType(), null, "cost", null, 0, 1, RtpPreemptibleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpNonPreemptibleTypeEClass, RtpNonPreemptibleType.class, "RtpNonPreemptibleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpCooperativeTypeEClass, RtpCooperativeType.class, "RtpCooperativeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpCooperativeType_NonPreemptibleSteps(), theSoftwareBehaviorPackage.getSbStep(), null, "nonPreemptibleSteps", null, 0, -1, RtpCooperativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpCooperativeType_NonPreemptibleIntervals(), this.getRtpExecutionTimeType(), null, "nonPreemptibleIntervals", null, 0, -1, RtpCooperativeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpSelfSuspensionTypeEClass, RtpSelfSuspensionType.class, "RtpSelfSuspensionType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpSelfSuspendedTypeEClass, RtpSelfSuspendedType.class, "RtpSelfSuspendedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpSelfSuspendedType_SelfSuspensionTime(), this.getRtpExecutionTimeType(), null, "selfSuspensionTime", null, 0, 1, RtpSelfSuspendedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpNotSelfSuspendedTypeEClass, RtpNotSelfSuspendedType.class, "RtpNotSelfSuspendedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //RtpTypesPackageImpl
