/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

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

import MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerList;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerSet;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVariable;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealList;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesFactory;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.UnknownReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.util.RtpUtilityTypesValidator;

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
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RtpUtilityTypesPackageImpl extends EPackageImpl implements RtpUtilityTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxMinAvgRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxMinAvgIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum delimiterTypeEEnum = null;

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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RtpUtilityTypesPackageImpl() {
		super(eNS_URI, RtpUtilityTypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RtpUtilityTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RtpUtilityTypesPackage init() {
		if (isInited) return (RtpUtilityTypesPackage)EPackage.Registry.INSTANCE.getEPackage(RtpUtilityTypesPackage.eNS_URI);

		// Obtain or create and register package
		RtpUtilityTypesPackageImpl theRtpUtilityTypesPackage = (RtpUtilityTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RtpUtilityTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RtpUtilityTypesPackageImpl());

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
		RtpMeasurementUnitsPackageImpl theRtpMeasurementUnitsPackage = (RtpMeasurementUnitsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) instanceof RtpMeasurementUnitsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpMeasurementUnitsPackage.eNS_URI) : RtpMeasurementUnitsPackage.eINSTANCE);
		RtpHelperTypesPackageImpl theRtpHelperTypesPackage = (RtpHelperTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) instanceof RtpHelperTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpHelperTypesPackage.eNS_URI) : RtpHelperTypesPackage.eINSTANCE);
		RtpProtocolsAndPoliciesPackageImpl theRtpProtocolsAndPoliciesPackage = (RtpProtocolsAndPoliciesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) instanceof RtpProtocolsAndPoliciesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpProtocolsAndPoliciesPackage.eNS_URI) : RtpProtocolsAndPoliciesPackage.eINSTANCE);
		RtpComputationAndAnalysisFunctionsPackageImpl theRtpComputationAndAnalysisFunctionsPackage = (RtpComputationAndAnalysisFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) instanceof RtpComputationAndAnalysisFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RtpComputationAndAnalysisFunctionsPackage.eNS_URI) : RtpComputationAndAnalysisFunctionsPackage.eINSTANCE);
		FunctionalElementsPackageImpl theFunctionalElementsPackage = (FunctionalElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) instanceof FunctionalElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionalElementsPackage.eNS_URI) : FunctionalElementsPackage.eINSTANCE);

		// Create package meta-data objects
		theRtpUtilityTypesPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
		theSoftwareBehaviorPackage.createPackageContents();
		theHardwarePlatformPackage.createPackageContents();
		theRealTimePropertiesPackage.createPackageContents();
		theRtpTypesPackage.createPackageContents();
		theRtpMeasurementUnitsPackage.createPackageContents();
		theRtpHelperTypesPackage.createPackageContents();
		theRtpProtocolsAndPoliciesPackage.createPackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.createPackageContents();
		theFunctionalElementsPackage.createPackageContents();

		// Initialize created meta-data
		theRtpUtilityTypesPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
		theSoftwareBehaviorPackage.initializePackageContents();
		theHardwarePlatformPackage.initializePackageContents();
		theRealTimePropertiesPackage.initializePackageContents();
		theRtpTypesPackage.initializePackageContents();
		theRtpMeasurementUnitsPackage.initializePackageContents();
		theRtpHelperTypesPackage.initializePackageContents();
		theRtpProtocolsAndPoliciesPackage.initializePackageContents();
		theRtpComputationAndAnalysisFunctionsPackage.initializePackageContents();
		theFunctionalElementsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRtpUtilityTypesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RtpUtilityTypesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRtpUtilityTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RtpUtilityTypesPackage.eNS_URI, theRtpUtilityTypesPackage);
		return theRtpUtilityTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerMatrix() {
		return integerMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerMatrix_MatrixElements() {
		return (EReference)integerMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVector() {
		return integerVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerVector_VectorElements() {
		return (EAttribute)integerVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealVector() {
		return realVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealVector_VectorElements() {
		return (EAttribute)realVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRealVector__MaxValue() {
		return realVectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealMatrix() {
		return realMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealMatrix_MatrixElements() {
		return (EReference)realMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerSet() {
		return integerSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerSet_SetElements() {
		return (EAttribute)integerSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerList() {
		return integerListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerList_ListElements() {
		return (EAttribute)integerListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealSet() {
		return realSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealSet_SetElements() {
		return (EAttribute)realSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealList() {
		return realListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealList_ListElements() {
		return (EAttribute)realListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerInterval() {
		return integerIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInterval_DelimiterMin() {
		return (EAttribute)integerIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInterval_BoundMin() {
		return (EAttribute)integerIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInterval_BoundMax() {
		return (EAttribute)integerIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerInterval_DelimiterMax() {
		return (EAttribute)integerIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealInterval() {
		return realIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealInterval_DelimiterMin() {
		return (EAttribute)realIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealInterval_BoundMin() {
		return (EAttribute)realIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealInterval_BoundMax() {
		return (EAttribute)realIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealInterval_DelimiterMax() {
		return (EAttribute)realIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealVariable() {
		return realVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasuredReal() {
		return measuredRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredReal_Value() {
		return (EAttribute)measuredRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredReal_UnknownValueName() {
		return (EAttribute)measuredRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredReal_ToolUsedDescriptions() {
		return (EAttribute)measuredRealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredReal_AllOldValues() {
		return (EAttribute)measuredRealEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownReal() {
		return unknownRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnknownReal_Value() {
		return (EAttribute)unknownRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleReal() {
		return simpleRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleReal_Value() {
		return (EAttribute)simpleRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxMinAvgReal() {
		return maxMinAvgRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMinAvgReal_MinValue() {
		return (EAttribute)maxMinAvgRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMinAvgReal_AvgValue() {
		return (EAttribute)maxMinAvgRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMinAvgReal_MaxValue() {
		return (EAttribute)maxMinAvgRealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasuredInteger() {
		return measuredIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredInteger_Value() {
		return (EAttribute)measuredIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredInteger_UnknownValueName() {
		return (EAttribute)measuredIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredInteger_ToolUsedDescriptions() {
		return (EAttribute)measuredIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasuredInteger_AllOldValues() {
		return (EAttribute)measuredIntegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownInteger() {
		return unknownIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnknownInteger_Value() {
		return (EAttribute)unknownIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleInteger() {
		return simpleIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleInteger_Value() {
		return (EAttribute)simpleIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxMinAvgInteger() {
		return maxMinAvgIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMinAvgInteger_MinValue() {
		return (EAttribute)maxMinAvgIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMinAvgInteger_AvgValue() {
		return (EAttribute)maxMinAvgIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaxMinAvgInteger_MaxValue() {
		return (EAttribute)maxMinAvgIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDelimiterType() {
		return delimiterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpUtilityTypesFactory getRtpUtilityTypesFactory() {
		return (RtpUtilityTypesFactory)getEFactoryInstance();
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
		integerMatrixEClass = createEClass(INTEGER_MATRIX);
		createEReference(integerMatrixEClass, INTEGER_MATRIX__MATRIX_ELEMENTS);

		integerVectorEClass = createEClass(INTEGER_VECTOR);
		createEAttribute(integerVectorEClass, INTEGER_VECTOR__VECTOR_ELEMENTS);

		realVectorEClass = createEClass(REAL_VECTOR);
		createEAttribute(realVectorEClass, REAL_VECTOR__VECTOR_ELEMENTS);
		createEOperation(realVectorEClass, REAL_VECTOR___MAX_VALUE);

		realMatrixEClass = createEClass(REAL_MATRIX);
		createEReference(realMatrixEClass, REAL_MATRIX__MATRIX_ELEMENTS);

		integerSetEClass = createEClass(INTEGER_SET);
		createEAttribute(integerSetEClass, INTEGER_SET__SET_ELEMENTS);

		integerListEClass = createEClass(INTEGER_LIST);
		createEAttribute(integerListEClass, INTEGER_LIST__LIST_ELEMENTS);

		realSetEClass = createEClass(REAL_SET);
		createEAttribute(realSetEClass, REAL_SET__SET_ELEMENTS);

		realListEClass = createEClass(REAL_LIST);
		createEAttribute(realListEClass, REAL_LIST__LIST_ELEMENTS);

		integerIntervalEClass = createEClass(INTEGER_INTERVAL);
		createEAttribute(integerIntervalEClass, INTEGER_INTERVAL__DELIMITER_MIN);
		createEAttribute(integerIntervalEClass, INTEGER_INTERVAL__BOUND_MIN);
		createEAttribute(integerIntervalEClass, INTEGER_INTERVAL__BOUND_MAX);
		createEAttribute(integerIntervalEClass, INTEGER_INTERVAL__DELIMITER_MAX);

		realIntervalEClass = createEClass(REAL_INTERVAL);
		createEAttribute(realIntervalEClass, REAL_INTERVAL__DELIMITER_MIN);
		createEAttribute(realIntervalEClass, REAL_INTERVAL__BOUND_MIN);
		createEAttribute(realIntervalEClass, REAL_INTERVAL__BOUND_MAX);
		createEAttribute(realIntervalEClass, REAL_INTERVAL__DELIMITER_MAX);

		realVariableEClass = createEClass(REAL_VARIABLE);

		measuredRealEClass = createEClass(MEASURED_REAL);
		createEAttribute(measuredRealEClass, MEASURED_REAL__VALUE);
		createEAttribute(measuredRealEClass, MEASURED_REAL__UNKNOWN_VALUE_NAME);
		createEAttribute(measuredRealEClass, MEASURED_REAL__TOOL_USED_DESCRIPTIONS);
		createEAttribute(measuredRealEClass, MEASURED_REAL__ALL_OLD_VALUES);

		unknownRealEClass = createEClass(UNKNOWN_REAL);
		createEAttribute(unknownRealEClass, UNKNOWN_REAL__VALUE);

		simpleRealEClass = createEClass(SIMPLE_REAL);
		createEAttribute(simpleRealEClass, SIMPLE_REAL__VALUE);

		maxMinAvgRealEClass = createEClass(MAX_MIN_AVG_REAL);
		createEAttribute(maxMinAvgRealEClass, MAX_MIN_AVG_REAL__MIN_VALUE);
		createEAttribute(maxMinAvgRealEClass, MAX_MIN_AVG_REAL__AVG_VALUE);
		createEAttribute(maxMinAvgRealEClass, MAX_MIN_AVG_REAL__MAX_VALUE);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);

		measuredIntegerEClass = createEClass(MEASURED_INTEGER);
		createEAttribute(measuredIntegerEClass, MEASURED_INTEGER__VALUE);
		createEAttribute(measuredIntegerEClass, MEASURED_INTEGER__UNKNOWN_VALUE_NAME);
		createEAttribute(measuredIntegerEClass, MEASURED_INTEGER__TOOL_USED_DESCRIPTIONS);
		createEAttribute(measuredIntegerEClass, MEASURED_INTEGER__ALL_OLD_VALUES);

		unknownIntegerEClass = createEClass(UNKNOWN_INTEGER);
		createEAttribute(unknownIntegerEClass, UNKNOWN_INTEGER__VALUE);

		simpleIntegerEClass = createEClass(SIMPLE_INTEGER);
		createEAttribute(simpleIntegerEClass, SIMPLE_INTEGER__VALUE);

		maxMinAvgIntegerEClass = createEClass(MAX_MIN_AVG_INTEGER);
		createEAttribute(maxMinAvgIntegerEClass, MAX_MIN_AVG_INTEGER__MIN_VALUE);
		createEAttribute(maxMinAvgIntegerEClass, MAX_MIN_AVG_INTEGER__AVG_VALUE);
		createEAttribute(maxMinAvgIntegerEClass, MAX_MIN_AVG_INTEGER__MAX_VALUE);

		// Create enums
		delimiterTypeEEnum = createEEnum(DELIMITER_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		integerMatrixEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		integerVectorEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		realVectorEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		realMatrixEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		integerSetEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		integerListEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		realSetEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		realListEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		integerIntervalEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		realIntervalEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		realVariableEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		measuredRealEClass.getESuperTypes().add(this.getRealVariable());
		unknownRealEClass.getESuperTypes().add(this.getRealVariable());
		simpleRealEClass.getESuperTypes().add(this.getRealVariable());
		maxMinAvgRealEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		integerVariableEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());
		measuredIntegerEClass.getESuperTypes().add(this.getIntegerVariable());
		unknownIntegerEClass.getESuperTypes().add(this.getIntegerVariable());
		simpleIntegerEClass.getESuperTypes().add(this.getIntegerVariable());
		maxMinAvgIntegerEClass.getESuperTypes().add(theRealTimePropertiesPackage.getRealTimeCommonType());

		// Initialize classes, features, and operations; add parameters
		initEClass(integerMatrixEClass, IntegerMatrix.class, "IntegerMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerMatrix_MatrixElements(), this.getIntegerVector(), null, "matrixElements", null, 1, -1, IntegerMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerVectorEClass, IntegerVector.class, "IntegerVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerVector_VectorElements(), ecorePackage.getEInt(), "vectorElements", null, 0, -1, IntegerVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realVectorEClass, RealVector.class, "RealVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealVector_VectorElements(), ecorePackage.getEDouble(), "vectorElements", null, 0, -1, RealVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRealVector__MaxValue(), ecorePackage.getEDouble(), "maxValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(realMatrixEClass, RealMatrix.class, "RealMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealMatrix_MatrixElements(), this.getRealVector(), null, "matrixElements", null, 1, -1, RealMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerSetEClass, IntegerSet.class, "IntegerSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerSet_SetElements(), ecorePackage.getEInt(), "setElements", null, 0, -1, IntegerSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(integerListEClass, IntegerList.class, "IntegerList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerList_ListElements(), ecorePackage.getEInt(), "listElements", null, 0, -1, IntegerList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realSetEClass, RealSet.class, "RealSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealSet_SetElements(), ecorePackage.getEDouble(), "setElements", null, 0, -1, RealSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realListEClass, RealList.class, "RealList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealList_ListElements(), ecorePackage.getEDouble(), "listElements", null, 0, -1, RealList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerIntervalEClass, IntegerInterval.class, "IntegerInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerInterval_DelimiterMin(), this.getDelimiterType(), "delimiterMin", null, 1, 1, IntegerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerInterval_BoundMin(), ecorePackage.getEInt(), "boundMin", "-1", 1, 1, IntegerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerInterval_BoundMax(), ecorePackage.getEInt(), "boundMax", "-1", 1, 1, IntegerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerInterval_DelimiterMax(), this.getDelimiterType(), "delimiterMax", null, 1, 1, IntegerInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realIntervalEClass, RealInterval.class, "RealInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealInterval_DelimiterMin(), this.getDelimiterType(), "delimiterMin", null, 1, 1, RealInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealInterval_BoundMin(), ecorePackage.getEDouble(), "boundMin", "-1", 1, 1, RealInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealInterval_BoundMax(), ecorePackage.getEDouble(), "boundMax", "-1", 1, 1, RealInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealInterval_DelimiterMax(), this.getDelimiterType(), "delimiterMax", null, 1, 1, RealInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realVariableEClass, RealVariable.class, "RealVariable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measuredRealEClass, MeasuredReal.class, "MeasuredReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasuredReal_Value(), ecorePackage.getEDouble(), "value", "-1", 1, 1, MeasuredReal.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasuredReal_UnknownValueName(), ecorePackage.getEString(), "unknownValueName", null, 1, 1, MeasuredReal.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasuredReal_ToolUsedDescriptions(), ecorePackage.getEString(), "toolUsedDescriptions", null, 0, -1, MeasuredReal.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasuredReal_AllOldValues(), ecorePackage.getEDouble(), "allOldValues", null, 0, -1, MeasuredReal.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownRealEClass, UnknownReal.class, "UnknownReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownReal_Value(), ecorePackage.getEString(), "value", null, 1, 1, UnknownReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRealEClass, SimpleReal.class, "SimpleReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleReal_Value(), ecorePackage.getEDouble(), "value", "-1", 1, 1, SimpleReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxMinAvgRealEClass, MaxMinAvgReal.class, "MaxMinAvgReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxMinAvgReal_MinValue(), ecorePackage.getEDouble(), "minValue", "-1", 0, 1, MaxMinAvgReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxMinAvgReal_AvgValue(), ecorePackage.getEDouble(), "avgValue", "-1", 0, 1, MaxMinAvgReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxMinAvgReal_MaxValue(), ecorePackage.getEDouble(), "maxValue", "-1", 0, 1, MaxMinAvgReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measuredIntegerEClass, MeasuredInteger.class, "MeasuredInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasuredInteger_Value(), ecorePackage.getEInt(), "value", "-1", 1, 1, MeasuredInteger.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasuredInteger_UnknownValueName(), ecorePackage.getEString(), "unknownValueName", null, 1, 1, MeasuredInteger.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasuredInteger_ToolUsedDescriptions(), ecorePackage.getEString(), "toolUsedDescriptions", null, 0, -1, MeasuredInteger.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasuredInteger_AllOldValues(), ecorePackage.getEDouble(), "allOldValues", null, 0, -1, MeasuredInteger.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unknownIntegerEClass, UnknownInteger.class, "UnknownInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownInteger_Value(), ecorePackage.getEString(), "value", "", 1, 1, UnknownInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleIntegerEClass, SimpleInteger.class, "SimpleInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleInteger_Value(), ecorePackage.getEInt(), "value", "-1", 1, 1, SimpleInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maxMinAvgIntegerEClass, MaxMinAvgInteger.class, "MaxMinAvgInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaxMinAvgInteger_MinValue(), ecorePackage.getEInt(), "minValue", "-1", 0, 1, MaxMinAvgInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxMinAvgInteger_AvgValue(), ecorePackage.getEInt(), "avgValue", "-1", 0, 1, MaxMinAvgInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaxMinAvgInteger_MaxValue(), ecorePackage.getEInt(), "maxValue", "-1", 0, 1, MaxMinAvgInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(delimiterTypeEEnum, DelimiterType.class, "DelimiterType");
		addEEnumLiteral(delimiterTypeEEnum, DelimiterType.OPEN);
		addEEnumLiteral(delimiterTypeEEnum, DelimiterType.CLOSED);

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
		  (integerMatrixEClass, 
		   source, 
		   new String[] {
			 "constraints", "IntegerMatrixRule1"
		   });	
		addAnnotation
		  (realMatrixEClass, 
		   source, 
		   new String[] {
			 "constraints", "RealMatrixRule1"
		   });	
		addAnnotation
		  (integerIntervalEClass, 
		   source, 
		   new String[] {
			 "constraints", "IntegerIntervalRule1"
		   });	
		addAnnotation
		  (realIntervalEClass, 
		   source, 
		   new String[] {
			 "constraints", "RealIntervalRule1"
		   });	
		addAnnotation
		  (maxMinAvgRealEClass, 
		   source, 
		   new String[] {
			 "constraints", "MaxMinAvgRealRule1"
		   });	
		addAnnotation
		  (maxMinAvgIntegerEClass, 
		   source, 
		   new String[] {
			 "constraints", "MaxMinAvgIntegerRule1"
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
		  (integerMatrixEClass, 
		   source, 
		   new String[] {
			 "IntegerMatrixRule1", "self.matrixElements->forAll(el1 : IntegerVector, el2 : IntegerVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())"
		   });	
		addAnnotation
		  (realMatrixEClass, 
		   source, 
		   new String[] {
			 "RealMatrixRule1", "self.matrixElements->forAll(el1 : RealVector, el2 : RealVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())"
		   });	
		addAnnotation
		  (integerIntervalEClass, 
		   source, 
		   new String[] {
			 "IntegerIntervalRule1", "self.boundMin < self.boundMax"
		   });	
		addAnnotation
		  (realIntervalEClass, 
		   source, 
		   new String[] {
			 "RealIntervalRule1", "self.boundMin < self.boundMax"
		   });	
		addAnnotation
		  (maxMinAvgRealEClass, 
		   source, 
		   new String[] {
			 "MaxMinAvgRealRule1", "self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()"
		   });	
		addAnnotation
		  (maxMinAvgIntegerEClass, 
		   source, 
		   new String[] {
			 "MaxMinAvgIntegerRule1", "self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()"
		   });
	}

} //RtpUtilityTypesPackageImpl
