/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.FunctionalElements.FunctionalElementsPackage;
import MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;

import MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl;

import MoSaRT.MoSaRTPackage;

import MoSaRT.RealTimeProperties.RealTimePropertiesPackage;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.RtpComputationAndAnalysisFunctionsPackageImpl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpClockRefrenceType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpFrequencyType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesFactory;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpPowerType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpReferenceType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType;
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
import org.eclipse.emf.ecore.EEnum;
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
public class RtpHelperTypesPackageImpl extends EPackageImpl implements RtpHelperTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpDurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpInterArrivalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpDataRateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpPowerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpDataSizeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpFrequencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeMmaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpTimeLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpTimeReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpClockRefrenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeValueToBeCalculatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeCalculatedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtpExecutionTimeConcreteValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rtpScheduleLinkTypeEEnum = null;

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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtpHelperTypesPackageImpl() {
		super(eNS_URI, RtpHelperTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtpHelperTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtpHelperTypesPackage init() {
		if (isInited) return (RtpHelperTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI);

		// Obtain or create and register package
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtpHelperTypesPackageImpl());

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
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRtpHelperTypesPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRtpHelperTypesPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRealTimePropertiesPackage.initializePackageContents();
		theRtpTypesPackage.initializePackageContents();
		theRtpUtilityTypesPackage.initializePackageContents();
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtpHelperTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtpHelperTypesPackage.eNS_URI, theRtpHelperTypesPackage);
		return theRtpHelperTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpDurationType() {
		return rtpDurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpDurationType_Unit() {
		return (EAttribute)rtpDurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpDurationType_Value() {
		return (EReference)rtpDurationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDurationType__Greater__RtpDurationType() {
		return rtpDurationTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDurationType__Lower__RtpDurationType() {
		return rtpDurationTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDurationType__Equals__RtpDurationType() {
		return rtpDurationTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDurationType__ConvertsTo__TimeUnits() {
		return rtpDurationTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpInterArrivalType() {
		return rtpInterArrivalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpInterArrivalType_Unit() {
		return (EAttribute)rtpInterArrivalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpInterArrivalType_Value() {
		return (EReference)rtpInterArrivalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpInterArrivalType__Greater__RtpInterArrivalType() {
		return rtpInterArrivalTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpInterArrivalType__Lower__RtpInterArrivalType() {
		return rtpInterArrivalTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpInterArrivalType__Equals__RtpInterArrivalType() {
		return rtpInterArrivalTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpInterArrivalType__ConvertsTo__TimeUnits() {
		return rtpInterArrivalTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpDataRateType() {
		return rtpDataRateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpDataRateType_Unit() {
		return (EAttribute)rtpDataRateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpDataRateType_Value() {
		return (EReference)rtpDataRateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataRateType__Greater__RtpDataRateType() {
		return rtpDataRateTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataRateType__Lower__RtpDataRateType() {
		return rtpDataRateTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataRateType__Equals__RtpDataRateType() {
		return rtpDataRateTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataRateType__ConvertsTo__DataTxRateUnits() {
		return rtpDataRateTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpPowerType() {
		return rtpPowerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpPowerType_Unit() {
		return (EAttribute)rtpPowerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpPowerType_Value() {
		return (EReference)rtpPowerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpPowerType__Greater__RtpPowerType() {
		return rtpPowerTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpPowerType__Lower__RtpPowerType() {
		return rtpPowerTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpPowerType__Equals__RtpPowerType() {
		return rtpPowerTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpPowerType__ConvertsTo__PowerUnits() {
		return rtpPowerTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpDataSizeType() {
		return rtpDataSizeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpDataSizeType_Unit() {
		return (EAttribute)rtpDataSizeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpDataSizeType_Value() {
		return (EReference)rtpDataSizeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataSizeType__Greater__RtpDataSizeType() {
		return rtpDataSizeTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataSizeType__Lower__RtpDataSizeType() {
		return rtpDataSizeTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataSizeType__Equals__RtpDataSizeType() {
		return rtpDataSizeTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpDataSizeType__ConvertsTo__DataSizeUnits() {
		return rtpDataSizeTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpFrequencyType() {
		return rtpFrequencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpFrequencyType_Unit() {
		return (EAttribute)rtpFrequencyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpFrequencyType_Value() {
		return (EReference)rtpFrequencyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpFrequencyType__Greater__RtpFrequencyType() {
		return rtpFrequencyTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpFrequencyType__Lower__RtpFrequencyType() {
		return rtpFrequencyTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpFrequencyType__Equals__RtpFrequencyType() {
		return rtpFrequencyTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRtpFrequencyType__ConvertsTo__FrequencyUnits() {
		return rtpFrequencyTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeValue() {
		return rtpExecutionTimeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeList() {
		return rtpExecutionTimeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeList_Vector() {
		return (EReference)rtpExecutionTimeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeSimple() {
		return rtpExecutionTimeSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpExecutionTimeSimple_Value() {
		return (EAttribute)rtpExecutionTimeSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeMma() {
		return rtpExecutionTimeMmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeMma_MinMaxAvg() {
		return (EReference)rtpExecutionTimeMmaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeInterval() {
		return rtpExecutionTimeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeInterval_Interval() {
		return (EReference)rtpExecutionTimeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpTimeLinkType() {
		return rtpTimeLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpTimeLinkType_ScheduleLink() {
		return (EAttribute)rtpTimeLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpTimeLinkType_JobNumber() {
		return (EAttribute)rtpTimeLinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpTimeLinkType_ReferenceActivity() {
		return (EReference)rtpTimeLinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpReferenceType() {
		return rtpReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpTimeReferenceType() {
		return rtpTimeReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpTimeReferenceType_TimeLink() {
		return (EReference)rtpTimeReferenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpClockRefrenceType() {
		return rtpClockRefrenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeValueToBeCalculated() {
		return rtpExecutionTimeValueToBeCalculatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpExecutionTimeValueToBeCalculated_UnknownValueName() {
		return (EAttribute)rtpExecutionTimeValueToBeCalculatedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested() {
		return (EReference)rtpExecutionTimeValueToBeCalculatedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeCalculatedValue() {
		return rtpExecutionTimeCalculatedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpExecutionTimeCalculatedValue_UnknownValueName() {
		return (EAttribute)rtpExecutionTimeCalculatedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions() {
		return (EAttribute)rtpExecutionTimeCalculatedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeCalculatedValue_Value() {
		return (EReference)rtpExecutionTimeCalculatedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRtpExecutionTimeCalculatedValue_AllOldValues() {
		return (EReference)rtpExecutionTimeCalculatedValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtpExecutionTimeConcreteValue() {
		return rtpExecutionTimeConcreteValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRtpScheduleLinkType() {
		return rtpScheduleLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpHelperTypesFactory getRtpHelperTypesFactory() {
		return (RtpHelperTypesFactory)getEFactoryInstance();
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
		rtpDurationTypeEClass = createEClass(RTP_DURATION_TYPE);
		createEAttribute(rtpDurationTypeEClass, RTP_DURATION_TYPE__UNIT);
		createEReference(rtpDurationTypeEClass, RTP_DURATION_TYPE__VALUE);
		createEOperation(rtpDurationTypeEClass, RTP_DURATION_TYPE___GREATER__RTPDURATIONTYPE);
		createEOperation(rtpDurationTypeEClass, RTP_DURATION_TYPE___LOWER__RTPDURATIONTYPE);
		createEOperation(rtpDurationTypeEClass, RTP_DURATION_TYPE___EQUALS__RTPDURATIONTYPE);
		createEOperation(rtpDurationTypeEClass, RTP_DURATION_TYPE___CONVERTS_TO__TIMEUNITS);

		rtpInterArrivalTypeEClass = createEClass(RTP_INTER_ARRIVAL_TYPE);
		createEAttribute(rtpInterArrivalTypeEClass, RTP_INTER_ARRIVAL_TYPE__UNIT);
		createEReference(rtpInterArrivalTypeEClass, RTP_INTER_ARRIVAL_TYPE__VALUE);
		createEOperation(rtpInterArrivalTypeEClass, RTP_INTER_ARRIVAL_TYPE___GREATER__RTPINTERARRIVALTYPE);
		createEOperation(rtpInterArrivalTypeEClass, RTP_INTER_ARRIVAL_TYPE___LOWER__RTPINTERARRIVALTYPE);
		createEOperation(rtpInterArrivalTypeEClass, RTP_INTER_ARRIVAL_TYPE___EQUALS__RTPINTERARRIVALTYPE);
		createEOperation(rtpInterArrivalTypeEClass, RTP_INTER_ARRIVAL_TYPE___CONVERTS_TO__TIMEUNITS);

		rtpDataRateTypeEClass = createEClass(RTP_DATA_RATE_TYPE);
		createEAttribute(rtpDataRateTypeEClass, RTP_DATA_RATE_TYPE__UNIT);
		createEReference(rtpDataRateTypeEClass, RTP_DATA_RATE_TYPE__VALUE);
		createEOperation(rtpDataRateTypeEClass, RTP_DATA_RATE_TYPE___GREATER__RTPDATARATETYPE);
		createEOperation(rtpDataRateTypeEClass, RTP_DATA_RATE_TYPE___LOWER__RTPDATARATETYPE);
		createEOperation(rtpDataRateTypeEClass, RTP_DATA_RATE_TYPE___EQUALS__RTPDATARATETYPE);
		createEOperation(rtpDataRateTypeEClass, RTP_DATA_RATE_TYPE___CONVERTS_TO__DATATXRATEUNITS);

		rtpPowerTypeEClass = createEClass(RTP_POWER_TYPE);
		createEAttribute(rtpPowerTypeEClass, RTP_POWER_TYPE__UNIT);
		createEReference(rtpPowerTypeEClass, RTP_POWER_TYPE__VALUE);
		createEOperation(rtpPowerTypeEClass, RTP_POWER_TYPE___GREATER__RTPPOWERTYPE);
		createEOperation(rtpPowerTypeEClass, RTP_POWER_TYPE___LOWER__RTPPOWERTYPE);
		createEOperation(rtpPowerTypeEClass, RTP_POWER_TYPE___EQUALS__RTPPOWERTYPE);
		createEOperation(rtpPowerTypeEClass, RTP_POWER_TYPE___CONVERTS_TO__POWERUNITS);

		rtpDataSizeTypeEClass = createEClass(RTP_DATA_SIZE_TYPE);
		createEAttribute(rtpDataSizeTypeEClass, RTP_DATA_SIZE_TYPE__UNIT);
		createEReference(rtpDataSizeTypeEClass, RTP_DATA_SIZE_TYPE__VALUE);
		createEOperation(rtpDataSizeTypeEClass, RTP_DATA_SIZE_TYPE___GREATER__RTPDATASIZETYPE);
		createEOperation(rtpDataSizeTypeEClass, RTP_DATA_SIZE_TYPE___LOWER__RTPDATASIZETYPE);
		createEOperation(rtpDataSizeTypeEClass, RTP_DATA_SIZE_TYPE___EQUALS__RTPDATASIZETYPE);
		createEOperation(rtpDataSizeTypeEClass, RTP_DATA_SIZE_TYPE___CONVERTS_TO__DATASIZEUNITS);

		rtpFrequencyTypeEClass = createEClass(RTP_FREQUENCY_TYPE);
		createEAttribute(rtpFrequencyTypeEClass, RTP_FREQUENCY_TYPE__UNIT);
		createEReference(rtpFrequencyTypeEClass, RTP_FREQUENCY_TYPE__VALUE);
		createEOperation(rtpFrequencyTypeEClass, RTP_FREQUENCY_TYPE___GREATER__RTPFREQUENCYTYPE);
		createEOperation(rtpFrequencyTypeEClass, RTP_FREQUENCY_TYPE___LOWER__RTPFREQUENCYTYPE);
		createEOperation(rtpFrequencyTypeEClass, RTP_FREQUENCY_TYPE___EQUALS__RTPFREQUENCYTYPE);
		createEOperation(rtpFrequencyTypeEClass, RTP_FREQUENCY_TYPE___CONVERTS_TO__FREQUENCYUNITS);

		rtpExecutionTimeValueEClass = createEClass(RTP_EXECUTION_TIME_VALUE);

		rtpExecutionTimeListEClass = createEClass(RTP_EXECUTION_TIME_LIST);
		createEReference(rtpExecutionTimeListEClass, RTP_EXECUTION_TIME_LIST__VECTOR);

		rtpExecutionTimeSimpleEClass = createEClass(RTP_EXECUTION_TIME_SIMPLE);
		createEAttribute(rtpExecutionTimeSimpleEClass, RTP_EXECUTION_TIME_SIMPLE__VALUE);

		rtpExecutionTimeMmaEClass = createEClass(RTP_EXECUTION_TIME_MMA);
		createEReference(rtpExecutionTimeMmaEClass, RTP_EXECUTION_TIME_MMA__MIN_MAX_AVG);

		rtpExecutionTimeIntervalEClass = createEClass(RTP_EXECUTION_TIME_INTERVAL);
		createEReference(rtpExecutionTimeIntervalEClass, RTP_EXECUTION_TIME_INTERVAL__INTERVAL);

		rtpTimeLinkTypeEClass = createEClass(RTP_TIME_LINK_TYPE);
		createEAttribute(rtpTimeLinkTypeEClass, RTP_TIME_LINK_TYPE__SCHEDULE_LINK);
		createEAttribute(rtpTimeLinkTypeEClass, RTP_TIME_LINK_TYPE__JOB_NUMBER);
		createEReference(rtpTimeLinkTypeEClass, RTP_TIME_LINK_TYPE__REFERENCE_ACTIVITY);

		rtpReferenceTypeEClass = createEClass(RTP_REFERENCE_TYPE);

		rtpTimeReferenceTypeEClass = createEClass(RTP_TIME_REFERENCE_TYPE);
		createEReference(rtpTimeReferenceTypeEClass, RTP_TIME_REFERENCE_TYPE__TIME_LINK);

		rtpClockRefrenceTypeEClass = createEClass(RTP_CLOCK_REFRENCE_TYPE);

		rtpExecutionTimeValueToBeCalculatedEClass = createEClass(RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED);
		createEAttribute(rtpExecutionTimeValueToBeCalculatedEClass, RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME);
		createEReference(rtpExecutionTimeValueToBeCalculatedEClass, RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED);

		rtpExecutionTimeCalculatedValueEClass = createEClass(RTP_EXECUTION_TIME_CALCULATED_VALUE);
		createEAttribute(rtpExecutionTimeCalculatedValueEClass, RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME);
		createEAttribute(rtpExecutionTimeCalculatedValueEClass, RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS);
		createEReference(rtpExecutionTimeCalculatedValueEClass, RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE);
		createEReference(rtpExecutionTimeCalculatedValueEClass, RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES);

		rtpExecutionTimeConcreteValueEClass = createEClass(RTP_EXECUTION_TIME_CONCRETE_VALUE);

		// Create enums
		rtpScheduleLinkTypeEEnum = createEEnum(RTP_SCHEDULE_LINK_TYPE);
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
		RtpMeasurementUnitsPackage theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI);
		RtpUtilityTypesPackage theRtpUtilityTypesPackage = (RtpUtilityTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI);
		SoftwareBehaviorPackage theSoftwareBehaviorPackage = (SoftwareBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI);
		RtpComputationAndAnalysisFunctionsPackage theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rtpDurationTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpInterArrivalTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpDataRateTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpPowerTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpDataSizeTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpFrequencyTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpExecutionTimeValueEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpExecutionTimeListEClass.getESuperTypes().add(this.getRtpExecutionTimeConcreteValue());
		rtpExecutionTimeSimpleEClass.getESuperTypes().add(this.getRtpExecutionTimeConcreteValue());
		rtpExecutionTimeMmaEClass.getESuperTypes().add(this.getRtpExecutionTimeConcreteValue());
		rtpExecutionTimeIntervalEClass.getESuperTypes().add(this.getRtpExecutionTimeConcreteValue());
		rtpTimeLinkTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpReferenceTypeEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		rtpTimeReferenceTypeEClass.getESuperTypes().add(this.getRtpReferenceType());
		rtpClockRefrenceTypeEClass.getESuperTypes().add(this.getRtpReferenceType());
		rtpExecutionTimeValueToBeCalculatedEClass.getESuperTypes().add(this.getRtpExecutionTimeValue());
		rtpExecutionTimeCalculatedValueEClass.getESuperTypes().add(this.getRtpExecutionTimeValue());
		rtpExecutionTimeConcreteValueEClass.getESuperTypes().add(this.getRtpExecutionTimeValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(rtpDurationTypeEClass, RtpDurationType.class, "RtpDurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpDurationType_Unit(), theRtpMeasurementUnitsPackage.getTimeUnits(), "unit", null, 1, 1, RtpDurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpDurationType_Value(), theRtpUtilityTypesPackage.getRealVariable(), null, "value", null, 1, 1, RtpDurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRtpDurationType__Greater__RtpDurationType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDurationType(), "otherDuration", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDurationType__Lower__RtpDurationType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDurationType(), "otherDuration", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDurationType__Equals__RtpDurationType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDurationType(), "otherDuration", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDurationType__ConvertsTo__TimeUnits(), this.getRtpDurationType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getTimeUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpInterArrivalTypeEClass, RtpInterArrivalType.class, "RtpInterArrivalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpInterArrivalType_Unit(), theRtpMeasurementUnitsPackage.getTimeUnits(), "unit", null, 1, 1, RtpInterArrivalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpInterArrivalType_Value(), theRtpUtilityTypesPackage.getMaxMinAvgReal(), null, "value", null, 1, 1, RtpInterArrivalType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRtpInterArrivalType__Greater__RtpInterArrivalType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpInterArrivalType(), "otherInterArrival", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpInterArrivalType__Lower__RtpInterArrivalType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpInterArrivalType(), "otherInterArrival", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpInterArrivalType__Equals__RtpInterArrivalType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpInterArrivalType(), "otherInterArrival", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpInterArrivalType__ConvertsTo__TimeUnits(), this.getRtpInterArrivalType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getTimeUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpDataRateTypeEClass, RtpDataRateType.class, "RtpDataRateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpDataRateType_Unit(), theRtpMeasurementUnitsPackage.getDataTxRateUnits(), "unit", null, 1, 1, RtpDataRateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpDataRateType_Value(), theRtpUtilityTypesPackage.getRealVariable(), null, "value", null, 1, 1, RtpDataRateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRtpDataRateType__Greater__RtpDataRateType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDataRateType(), "otherDataRate", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDataRateType__Lower__RtpDataRateType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDataRateType(), "otherDataRate", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDataRateType__Equals__RtpDataRateType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDataRateType(), "otherDataRate", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDataRateType__ConvertsTo__DataTxRateUnits(), this.getRtpDataRateType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getDataTxRateUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpPowerTypeEClass, RtpPowerType.class, "RtpPowerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpPowerType_Unit(), theRtpMeasurementUnitsPackage.getPowerUnits(), "unit", null, 1, 1, RtpPowerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpPowerType_Value(), theRtpUtilityTypesPackage.getRealVariable(), null, "value", null, 1, 1, RtpPowerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRtpPowerType__Greater__RtpPowerType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpPowerType(), "otherPower", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpPowerType__Lower__RtpPowerType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpPowerType(), "otherPower", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpPowerType__Equals__RtpPowerType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpPowerType(), "otherPower", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpPowerType__ConvertsTo__PowerUnits(), this.getRtpPowerType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getPowerUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpDataSizeTypeEClass, RtpDataSizeType.class, "RtpDataSizeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpDataSizeType_Unit(), theRtpMeasurementUnitsPackage.getDataSizeUnits(), "unit", null, 1, 1, RtpDataSizeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpDataSizeType_Value(), theRtpUtilityTypesPackage.getRealVariable(), null, "value", null, 1, 1, RtpDataSizeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRtpDataSizeType__Greater__RtpDataSizeType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDataSizeType(), "otherDataSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDataSizeType__Lower__RtpDataSizeType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDataSizeType(), "otherDataSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDataSizeType__Equals__RtpDataSizeType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpDataSizeType(), "otherDataSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpDataSizeType__ConvertsTo__DataSizeUnits(), this.getRtpDataSizeType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getDataSizeUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpFrequencyTypeEClass, RtpFrequencyType.class, "RtpFrequencyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpFrequencyType_Unit(), theRtpMeasurementUnitsPackage.getFrequencyUnits(), "unit", null, 1, 1, RtpFrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpFrequencyType_Value(), theRtpUtilityTypesPackage.getRealVariable(), null, "value", null, 1, 1, RtpFrequencyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRtpFrequencyType__Greater__RtpFrequencyType(), ecorePackage.getEBoolean(), "greater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpFrequencyType(), "otherFrequency", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpFrequencyType__Lower__RtpFrequencyType(), ecorePackage.getEBoolean(), "lower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpFrequencyType(), "otherFrequency", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpFrequencyType__Equals__RtpFrequencyType(), ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRtpFrequencyType(), "otherFrequency", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRtpFrequencyType__ConvertsTo__FrequencyUnits(), this.getRtpFrequencyType(), "convertsTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRtpMeasurementUnitsPackage.getFrequencyUnits(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rtpExecutionTimeValueEClass, RtpExecutionTimeValue.class, "RtpExecutionTimeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpExecutionTimeListEClass, RtpExecutionTimeList.class, "RtpExecutionTimeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpExecutionTimeList_Vector(), theRtpUtilityTypesPackage.getRealVector(), null, "vector", null, 1, 1, RtpExecutionTimeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpExecutionTimeSimpleEClass, RtpExecutionTimeSimple.class, "RtpExecutionTimeSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpExecutionTimeSimple_Value(), ecorePackage.getEDouble(), "value", "-1", 1, 1, RtpExecutionTimeSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpExecutionTimeMmaEClass, RtpExecutionTimeMma.class, "RtpExecutionTimeMma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpExecutionTimeMma_MinMaxAvg(), theRtpUtilityTypesPackage.getMaxMinAvgReal(), null, "minMaxAvg", null, 1, 1, RtpExecutionTimeMma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpExecutionTimeIntervalEClass, RtpExecutionTimeInterval.class, "RtpExecutionTimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpExecutionTimeInterval_Interval(), theRtpUtilityTypesPackage.getRealInterval(), null, "interval", null, 1, 1, RtpExecutionTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpTimeLinkTypeEClass, RtpTimeLinkType.class, "RtpTimeLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpTimeLinkType_ScheduleLink(), this.getRtpScheduleLinkType(), "scheduleLink", null, 1, 1, RtpTimeLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtpTimeLinkType_JobNumber(), ecorePackage.getEInt(), "jobNumber", "0", 0, 1, RtpTimeLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpTimeLinkType_ReferenceActivity(), theSoftwareBehaviorPackage.getSbSchedulingActivity(), null, "referenceActivity", null, 1, 1, RtpTimeLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpReferenceTypeEClass, RtpReferenceType.class, "RtpReferenceType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpTimeReferenceTypeEClass, RtpTimeReferenceType.class, "RtpTimeReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRtpTimeReferenceType_TimeLink(), this.getRtpTimeLinkType(), null, "timeLink", null, 1, 1, RtpTimeReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpClockRefrenceTypeEClass, RtpClockRefrenceType.class, "RtpClockRefrenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rtpExecutionTimeValueToBeCalculatedEClass, RtpExecutionTimeValueToBeCalculated.class, "RtpExecutionTimeValueToBeCalculated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpExecutionTimeValueToBeCalculated_UnknownValueName(), ecorePackage.getEString(), "unknownValueName", null, 1, 1, RtpExecutionTimeValueToBeCalculated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested(), theRtpComputationAndAnalysisFunctionsPackage.getRtpComputationFunction(), null, "FunctionToBeRequested", null, 0, 1, RtpExecutionTimeValueToBeCalculated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpExecutionTimeCalculatedValueEClass, RtpExecutionTimeCalculatedValue.class, "RtpExecutionTimeCalculatedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtpExecutionTimeCalculatedValue_UnknownValueName(), ecorePackage.getEString(), "unknownValueName", null, 1, 1, RtpExecutionTimeCalculatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions(), ecorePackage.getEString(), "toolUsedDescriptions", "", 0, -1, RtpExecutionTimeCalculatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpExecutionTimeCalculatedValue_Value(), this.getRtpExecutionTimeConcreteValue(), null, "value", null, 1, 1, RtpExecutionTimeCalculatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRtpExecutionTimeCalculatedValue_AllOldValues(), this.getRtpExecutionTimeConcreteValue(), null, "allOldValues", null, 0, -1, RtpExecutionTimeCalculatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtpExecutionTimeConcreteValueEClass, RtpExecutionTimeConcreteValue.class, "RtpExecutionTimeConcreteValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(rtpScheduleLinkTypeEEnum, RtpScheduleLinkType.class, "RtpScheduleLinkType");
		addEEnumLiteral(rtpScheduleLinkTypeEEnum, RtpScheduleLinkType.AFTER_THE_BEGINNING_OF);
		addEEnumLiteral(rtpScheduleLinkTypeEEnum, RtpScheduleLinkType.AFTER_THE_END_OF);

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

} //RtpHelperTypesPackageImpl
