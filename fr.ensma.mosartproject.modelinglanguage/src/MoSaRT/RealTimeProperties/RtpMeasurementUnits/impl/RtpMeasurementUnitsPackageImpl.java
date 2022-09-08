/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpMeasurementUnits.impl;

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

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.FrequencyUnits;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.PowerUnits;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.RtpMeasurementUnitsFactory;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.RtpMeasurementUnitsPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;
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

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpMeasurementUnitsPackageImpl extends EPackageImpl implements RtpMeasurementUnitsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataSizeUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum powerUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTxRateUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyUnitsEEnum = null;

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
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.RtpMeasurementUnitsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtpMeasurementUnitsPackageImpl() {
		super(eNS_URI, RtpMeasurementUnitsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtpMeasurementUnitsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtpMeasurementUnitsPackage init() {
		if (isInited) return (RtpMeasurementUnitsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI);

		// Obtain or create and register package
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtpMeasurementUnitsPackageImpl());

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
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRtpMeasurementUnitsPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRealTimePropertiesPackage.initializePackageContents();
		theRtpTypesPackage.initializePackageContents();
		theRtpUtilityTypesPackage.initializePackageContents();
		theRtpHelperTypesPackage.initializePackageContents();
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRtpMeasurementUnitsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtpMeasurementUnitsPackage.eNS_URI, theRtpMeasurementUnitsPackage);
		return theRtpMeasurementUnitsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnits() {
		return timeUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataSizeUnits() {
		return dataSizeUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPowerUnits() {
		return powerUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTxRateUnits() {
		return dataTxRateUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyUnits() {
		return frequencyUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpMeasurementUnitsFactory getRtpMeasurementUnitsFactory() {
		return (RtpMeasurementUnitsFactory)getEFactoryInstance();
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

		// Create enums
		timeUnitsEEnum = createEEnum(TIME_UNITS);
		dataSizeUnitsEEnum = createEEnum(DATA_SIZE_UNITS);
		powerUnitsEEnum = createEEnum(POWER_UNITS);
		dataTxRateUnitsEEnum = createEEnum(DATA_TX_RATE_UNITS);
		frequencyUnitsEEnum = createEEnum(FREQUENCY_UNITS);
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

		// Initialize enums and add enum literals
		initEEnum(timeUnitsEEnum, TimeUnits.class, "TimeUnits");
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.US);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.MS);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.S);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.MIN);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.HR);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.DAY);

		initEEnum(dataSizeUnitsEEnum, DataSizeUnits.class, "DataSizeUnits");
		addEEnumLiteral(dataSizeUnitsEEnum, DataSizeUnits.BIT);
		addEEnumLiteral(dataSizeUnitsEEnum, DataSizeUnits.BYTE);
		addEEnumLiteral(dataSizeUnitsEEnum, DataSizeUnits.KB);
		addEEnumLiteral(dataSizeUnitsEEnum, DataSizeUnits.MB);
		addEEnumLiteral(dataSizeUnitsEEnum, DataSizeUnits.GB);

		initEEnum(powerUnitsEEnum, PowerUnits.class, "PowerUnits");
		addEEnumLiteral(powerUnitsEEnum, PowerUnits.W);
		addEEnumLiteral(powerUnitsEEnum, PowerUnits.KW);
		addEEnumLiteral(powerUnitsEEnum, PowerUnits.MW);
		addEEnumLiteral(powerUnitsEEnum, PowerUnits.GW);

		initEEnum(dataTxRateUnitsEEnum, DataTxRateUnits.class, "DataTxRateUnits");
		addEEnumLiteral(dataTxRateUnitsEEnum, DataTxRateUnits.BPER_S);
		addEEnumLiteral(dataTxRateUnitsEEnum, DataTxRateUnits.KB_PER_S);
		addEEnumLiteral(dataTxRateUnitsEEnum, DataTxRateUnits.MB_PER_S);
		addEEnumLiteral(dataTxRateUnitsEEnum, DataTxRateUnits.GB_PER_S);

		initEEnum(frequencyUnitsEEnum, FrequencyUnits.class, "FrequencyUnits");
		addEEnumLiteral(frequencyUnitsEEnum, FrequencyUnits.HZ);
		addEEnumLiteral(frequencyUnitsEEnum, FrequencyUnits.KHZ);
		addEEnumLiteral(frequencyUnitsEEnum, FrequencyUnits.MHZ);
		addEEnumLiteral(frequencyUnitsEEnum, FrequencyUnits.GHZ);
	}

} //RtpMeasurementUnitsPackageImpl
