/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.impl;

import MoSaRT.FunctionalElements.FunctionalElementsPackage;
import MoSaRT.FunctionalElements.impl.FunctionalElementsPackageImpl;


import MoSaRT.HardwarePlatform.HardwarePlatformPackage;

import MoSaRT.HardwarePlatform.impl.HardwarePlatformPackageImpl;

import MoSaRT.MoSaRTPackage;

import MoSaRT.RealTimeProperties.RealTimeCommonType;
import MoSaRT.RealTimeProperties.RealTimePropertiesFactory;
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

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.impl.SoftwareBehaviorPackageImpl;


import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl;

import MoSaRT.impl.MoSaRTPackageImpl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RealTimePropertiesPackageImpl extends EPackageImpl implements RealTimePropertiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTimeCommonTypeEClass = null;

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
	 * @see MoSaRT.RealTimeProperties.RealTimePropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RealTimePropertiesPackageImpl() {
		super(eNS_URI, RealTimePropertiesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RealTimePropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RealTimePropertiesPackage init() {
		if (isInited) return (RealTimePropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(RealTimePropertiesPackage.eNS_URI);

		// Obtain or create and register package
		RealTimePropertiesPackageImpl theRealTimePropertiesPackage = (RealTimePropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RealTimePropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RealTimePropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MoSaRTPackageImpl theMoSaRTPackage = (MoSaRTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) instanceof MoSaRTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) : MoSaRTPackage.eINSTANCE);
		SoftwareOperatorsPackageImpl theSoftwareOperatorsPackage = (SoftwareOperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) instanceof SoftwareOperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) : SoftwareOperatorsPackage.eINSTANCE);
		SoftwareBehaviorPackageImpl theSoftwareBehaviorPackage = (SoftwareBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) instanceof SoftwareBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI) : SoftwareBehaviorPackage.eINSTANCE);
		HardwarePlatformPackageImpl theHardwarePlatformPackage = (HardwarePlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) instanceof HardwarePlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePlatformPackage.eNS_URI) : HardwarePlatformPackage.eINSTANCE);
		RtpTypesPackageImpl theRtpTypesPackage = (RtpTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) instanceof RtpTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpTypesPackage.eNS_URI) : RtpTypesPackage.eINSTANCE);
		RtpUtilityTypesPackageImpl theRtpUtilityTypesPackage = (RtpUtilityTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) instanceof RtpUtilityTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI) : RtpUtilityTypesPackage.eINSTANCE);
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) : RtpMeasurementUnitsPackage.eINSTANCE);
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRealTimePropertiesPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpUtilityTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRealTimePropertiesPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRtpTypesPackage.initializePackageContents();
		theRtpUtilityTypesPackage.initializePackageContents();
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theRtpHelperTypesPackage.initializePackageContents();
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRealTimePropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RealTimePropertiesPackage.eNS_URI, theRealTimePropertiesPackage);
		return theRealTimePropertiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealTimeCommonType() {
		return realTimeCommonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealTimePropertiesFactory getRealTimePropertiesFactory() {
		return (RealTimePropertiesFactory)getEFactoryInstance();
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
		realTimeCommonTypeEClass = createEClass(REAL_TIME_COMMON_TYPE);
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
		RtpUtilityTypesPackage theRtpUtilityTypesPackage = (RtpUtilityTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI);
		RtpMeasurementUnitsPackage theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI);
		RtpHelperTypesPackage theRtpHelperTypesPackage = (RtpHelperTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI);
		RtpProtocolsAndPoliciesPackage theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI);
		RtpComputationAndAnalysisFunctionsPackage theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRtpTypesPackage);
		getESubpackages().add(theRtpUtilityTypesPackage);
		getESubpackages().add(theRtpMeasurementUnitsPackage);
		getESubpackages().add(theRtpHelperTypesPackage);
		getESubpackages().add(theRtpProtocolsAndPoliciesPackage);
		getESubpackages().add(theRtpComputationAndAnalysisFunctionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(realTimeCommonTypeEClass, RealTimeCommonType.class, "RealTimeCommonType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

} //RealTimePropertiesPackageImpl
