/**
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.impl;

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

import MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbAcquireStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbActionStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbCommunicationRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReadStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReleaseStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSendStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbWriteStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorFactory;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.util.SoftwareBehaviorValidator;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.impl.SoftwareOperatorsPackageImpl;

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
public class SoftwareBehaviorPackageImpl extends EPackageImpl implements SoftwareBehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbExternalEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbSchedulingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbTaskActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbPrecedenceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbSequencingRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbCommunicationRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbAcquireStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbSendStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbReceiveStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbWriteStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbReleaseStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbReadStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbStepPrecedenceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbActionStepEClass = null;

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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwareBehaviorPackageImpl() {
		super(eNS_URI, SoftwareBehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SoftwareBehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwareBehaviorPackage init() {
		if (isInited) return (SoftwareBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(SoftwareBehaviorPackage.eNS_URI);

		// Obtain or create and register package
		SoftwareBehaviorPackageImpl theSoftwareBehaviorPackage = (SoftwareBehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwareBehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwareBehaviorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MoSaRTPackageImpl theMoSaRTPackage = (MoSaRTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) instanceof MoSaRTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MoSaRTPackage.eNS_URI) : MoSaRTPackage.eINSTANCE);
		SoftwareOperatorsPackageImpl theSoftwareOperatorsPackage = (SoftwareOperatorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) instanceof SoftwareOperatorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwareOperatorsPackage.eNS_URI) : SoftwareOperatorsPackage.eINSTANCE);
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
		theSoftwareBehaviorPackage.createPackageContents();
		theMoSaRTPackage.createPackageContents();
		theSoftwareOperatorsPackage.createPackageContents();
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
		theSoftwareBehaviorPackage.initializePackageContents();
		theMoSaRTPackage.initializePackageContents();
		theSoftwareOperatorsPackage.initializePackageContents();
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
			(theSoftwareBehaviorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SoftwareBehaviorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSoftwareBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwareBehaviorPackage.eNS_URI, theSoftwareBehaviorPackage);
		return theSoftwareBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalBehavior() {
		return globalBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBehavior_Triggers() {
		return (EReference)globalBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBehavior_SchedulingActivities() {
		return (EReference)globalBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBehavior_SequencingRelations() {
		return (EReference)globalBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalBehavior_RootTrigger() {
		return (EReference)globalBehaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalBehavior_Name() {
		return (EAttribute)globalBehaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbTrigger() {
		return sbTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTrigger_SchedulingActivities() {
		return (EReference)sbTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSbTrigger_Name() {
		return (EAttribute)sbTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbTimeTrigger() {
		return sbTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTimeTrigger_RtpReleaseTime() {
		return (EReference)sbTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTimeTrigger_RtpPeriodicity() {
		return (EReference)sbTimeTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTimeTrigger_StartTime() {
		return (EReference)sbTimeTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTimeTrigger_Periodicity() {
		return (EReference)sbTimeTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbExternalEventTrigger() {
		return sbExternalEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbSchedulingActivity() {
		return sbSchedulingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbSchedulingActivity_Trigger() {
		return (EReference)sbSchedulingActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSbSchedulingActivity_Name() {
		return (EAttribute)sbSchedulingActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbSchedulingActivity_InputSquencingRelation() {
		return (EReference)sbSchedulingActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbSchedulingActivity_OutputSequencingRelation() {
		return (EReference)sbSchedulingActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbTaskActivity() {
		return sbTaskActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_ActionSteps() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RootActionStep() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_StepPrecedenceRelations() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpDeadline() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpExecutionTime() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpOffset() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpBlockingTime() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpRepetition() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpResponseTime() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpPriority() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RepresentedTask() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_Repetition() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_Deadline() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_ExecutionTime() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_BlockingTime() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_Priority() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_ResponseTime() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_Offset() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpCriticality() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpPreemptibility() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbTaskActivity_RtpSelfSuspension() {
		return (EReference)sbTaskActivityEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbPrecedenceRelation() {
		return sbPrecedenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbSequencingRelation() {
		return sbSequencingRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSbSequencingRelation_Name() {
		return (EAttribute)sbSequencingRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbSequencingRelation_TargetSchedulingActivity() {
		return (EReference)sbSequencingRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbSequencingRelation_SourceSchedulingActivity() {
		return (EReference)sbSequencingRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbCommunicationRelation() {
		return sbCommunicationRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbCommunicationRelation_CommResource() {
		return (EReference)sbCommunicationRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbStep() {
		return sbStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_InputStepRelation() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_OutputStepRelation() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSbStep_Name() {
		return (EAttribute)sbStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_RtpDeadline() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_RtpExecutionTime() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_RtpBlockingTime() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_RtpRepetition() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_RepresentedOperation() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_Repetition() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_Deadline() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_ExecutionTime() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_BlockingTime() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_InteractionResource() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStep_StepPredecessors() {
		return (EReference)sbStepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbAcquireStep() {
		return sbAcquireStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbSendStep() {
		return sbSendStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbReceiveStep() {
		return sbReceiveStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbWriteStep() {
		return sbWriteStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbReleaseStep() {
		return sbReleaseStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbReadStep() {
		return sbReadStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbStepPrecedenceRelation() {
		return sbStepPrecedenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStepPrecedenceRelation_TargetStep() {
		return (EReference)sbStepPrecedenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSbStepPrecedenceRelation_SourceStep() {
		return (EReference)sbStepPrecedenceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSbStepPrecedenceRelation_Name() {
		return (EAttribute)sbStepPrecedenceRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSbActionStep() {
		return sbActionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareBehaviorFactory getSoftwareBehaviorFactory() {
		return (SoftwareBehaviorFactory)getEFactoryInstance();
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
		globalBehaviorEClass = createEClass(GLOBAL_BEHAVIOR);
		createEReference(globalBehaviorEClass, GLOBAL_BEHAVIOR__TRIGGERS);
		createEReference(globalBehaviorEClass, GLOBAL_BEHAVIOR__SCHEDULING_ACTIVITIES);
		createEReference(globalBehaviorEClass, GLOBAL_BEHAVIOR__SEQUENCING_RELATIONS);
		createEReference(globalBehaviorEClass, GLOBAL_BEHAVIOR__ROOT_TRIGGER);
		createEAttribute(globalBehaviorEClass, GLOBAL_BEHAVIOR__NAME);

		sbTriggerEClass = createEClass(SB_TRIGGER);
		createEReference(sbTriggerEClass, SB_TRIGGER__SCHEDULING_ACTIVITIES);
		createEAttribute(sbTriggerEClass, SB_TRIGGER__NAME);

		sbTimeTriggerEClass = createEClass(SB_TIME_TRIGGER);
		createEReference(sbTimeTriggerEClass, SB_TIME_TRIGGER__RTP_RELEASE_TIME);
		createEReference(sbTimeTriggerEClass, SB_TIME_TRIGGER__RTP_PERIODICITY);
		createEReference(sbTimeTriggerEClass, SB_TIME_TRIGGER__START_TIME);
		createEReference(sbTimeTriggerEClass, SB_TIME_TRIGGER__PERIODICITY);

		sbExternalEventTriggerEClass = createEClass(SB_EXTERNAL_EVENT_TRIGGER);

		sbSchedulingActivityEClass = createEClass(SB_SCHEDULING_ACTIVITY);
		createEReference(sbSchedulingActivityEClass, SB_SCHEDULING_ACTIVITY__TRIGGER);
		createEAttribute(sbSchedulingActivityEClass, SB_SCHEDULING_ACTIVITY__NAME);
		createEReference(sbSchedulingActivityEClass, SB_SCHEDULING_ACTIVITY__INPUT_SQUENCING_RELATION);
		createEReference(sbSchedulingActivityEClass, SB_SCHEDULING_ACTIVITY__OUTPUT_SEQUENCING_RELATION);

		sbTaskActivityEClass = createEClass(SB_TASK_ACTIVITY);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__ACTION_STEPS);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__ROOT_ACTION_STEP);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__STEP_PRECEDENCE_RELATIONS);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_DEADLINE);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_EXECUTION_TIME);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_OFFSET);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_BLOCKING_TIME);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_REPETITION);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_RESPONSE_TIME);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_PRIORITY);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__REPRESENTED_TASK);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__REPETITION);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__DEADLINE);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__EXECUTION_TIME);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__BLOCKING_TIME);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__PRIORITY);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RESPONSE_TIME);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__OFFSET);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_CRITICALITY);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_PREEMPTIBILITY);
		createEReference(sbTaskActivityEClass, SB_TASK_ACTIVITY__RTP_SELF_SUSPENSION);

		sbPrecedenceRelationEClass = createEClass(SB_PRECEDENCE_RELATION);

		sbSequencingRelationEClass = createEClass(SB_SEQUENCING_RELATION);
		createEAttribute(sbSequencingRelationEClass, SB_SEQUENCING_RELATION__NAME);
		createEReference(sbSequencingRelationEClass, SB_SEQUENCING_RELATION__TARGET_SCHEDULING_ACTIVITY);
		createEReference(sbSequencingRelationEClass, SB_SEQUENCING_RELATION__SOURCE_SCHEDULING_ACTIVITY);

		sbCommunicationRelationEClass = createEClass(SB_COMMUNICATION_RELATION);
		createEReference(sbCommunicationRelationEClass, SB_COMMUNICATION_RELATION__COMM_RESOURCE);

		sbStepEClass = createEClass(SB_STEP);
		createEReference(sbStepEClass, SB_STEP__INPUT_STEP_RELATION);
		createEReference(sbStepEClass, SB_STEP__OUTPUT_STEP_RELATION);
		createEAttribute(sbStepEClass, SB_STEP__NAME);
		createEReference(sbStepEClass, SB_STEP__RTP_DEADLINE);
		createEReference(sbStepEClass, SB_STEP__RTP_EXECUTION_TIME);
		createEReference(sbStepEClass, SB_STEP__RTP_BLOCKING_TIME);
		createEReference(sbStepEClass, SB_STEP__RTP_REPETITION);
		createEReference(sbStepEClass, SB_STEP__REPRESENTED_OPERATION);
		createEReference(sbStepEClass, SB_STEP__REPETITION);
		createEReference(sbStepEClass, SB_STEP__DEADLINE);
		createEReference(sbStepEClass, SB_STEP__EXECUTION_TIME);
		createEReference(sbStepEClass, SB_STEP__BLOCKING_TIME);
		createEReference(sbStepEClass, SB_STEP__INTERACTION_RESOURCE);
		createEReference(sbStepEClass, SB_STEP__STEP_PREDECESSORS);

		sbAcquireStepEClass = createEClass(SB_ACQUIRE_STEP);

		sbSendStepEClass = createEClass(SB_SEND_STEP);

		sbReceiveStepEClass = createEClass(SB_RECEIVE_STEP);

		sbWriteStepEClass = createEClass(SB_WRITE_STEP);

		sbReleaseStepEClass = createEClass(SB_RELEASE_STEP);

		sbReadStepEClass = createEClass(SB_READ_STEP);

		sbStepPrecedenceRelationEClass = createEClass(SB_STEP_PRECEDENCE_RELATION);
		createEReference(sbStepPrecedenceRelationEClass, SB_STEP_PRECEDENCE_RELATION__TARGET_STEP);
		createEReference(sbStepPrecedenceRelationEClass, SB_STEP_PRECEDENCE_RELATION__SOURCE_STEP);
		createEAttribute(sbStepPrecedenceRelationEClass, SB_STEP_PRECEDENCE_RELATION__NAME);

		sbActionStepEClass = createEClass(SB_ACTION_STEP);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sbTimeTriggerEClass.getESuperTypes().add(this.getSbTrigger());
		sbExternalEventTriggerEClass.getESuperTypes().add(this.getSbTrigger());
		sbTaskActivityEClass.getESuperTypes().add(this.getSbSchedulingActivity());
		sbPrecedenceRelationEClass.getESuperTypes().add(this.getSbSequencingRelation());
		sbCommunicationRelationEClass.getESuperTypes().add(this.getSbSequencingRelation());
		sbAcquireStepEClass.getESuperTypes().add(this.getSbStep());
		sbSendStepEClass.getESuperTypes().add(this.getSbStep());
		sbReceiveStepEClass.getESuperTypes().add(this.getSbStep());
		sbWriteStepEClass.getESuperTypes().add(this.getSbStep());
		sbReleaseStepEClass.getESuperTypes().add(this.getSbStep());
		sbReadStepEClass.getESuperTypes().add(this.getSbStep());
		sbActionStepEClass.getESuperTypes().add(this.getSbStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(globalBehaviorEClass, GlobalBehavior.class, "GlobalBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalBehavior_Triggers(), this.getSbTrigger(), null, "triggers", null, 0, -1, GlobalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalBehavior_SchedulingActivities(), this.getSbSchedulingActivity(), null, "schedulingActivities", null, 0, -1, GlobalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalBehavior_SequencingRelations(), this.getSbSequencingRelation(), null, "sequencingRelations", null, 0, -1, GlobalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalBehavior_RootTrigger(), this.getSbTrigger(), null, "rootTrigger", null, 0, 1, GlobalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlobalBehavior_Name(), ecorePackage.getEString(), "name", null, 1, 1, GlobalBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbTriggerEClass, SbTrigger.class, "SbTrigger", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbTrigger_SchedulingActivities(), this.getSbSchedulingActivity(), this.getSbSchedulingActivity_Trigger(), "schedulingActivities", null, 0, -1, SbTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSbTrigger_Name(), ecorePackage.getEString(), "name", null, 1, 1, SbTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbTimeTriggerEClass, SbTimeTrigger.class, "SbTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbTimeTrigger_RtpReleaseTime(), theRtpTypesPackage.getRtpReleaseTimeType(), null, "rtpReleaseTime", null, 0, 1, SbTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTimeTrigger_RtpPeriodicity(), theRtpTypesPackage.getRtpPeriodicityType(), null, "rtpPeriodicity", null, 0, 1, SbTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTimeTrigger_StartTime(), theRtpTypesPackage.getRtpReleaseTimeType(), null, "startTime", null, 0, 1, SbTimeTrigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTimeTrigger_Periodicity(), theRtpTypesPackage.getRtpPeriodicityType(), null, "periodicity", null, 0, 1, SbTimeTrigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sbExternalEventTriggerEClass, SbExternalEventTrigger.class, "SbExternalEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbSchedulingActivityEClass, SbSchedulingActivity.class, "SbSchedulingActivity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbSchedulingActivity_Trigger(), this.getSbTrigger(), this.getSbTrigger_SchedulingActivities(), "trigger", null, 0, 1, SbSchedulingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSbSchedulingActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, SbSchedulingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbSchedulingActivity_InputSquencingRelation(), this.getSbSequencingRelation(), this.getSbSequencingRelation_TargetSchedulingActivity(), "inputSquencingRelation", null, 0, -1, SbSchedulingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbSchedulingActivity_OutputSequencingRelation(), this.getSbSequencingRelation(), this.getSbSequencingRelation_SourceSchedulingActivity(), "outputSequencingRelation", null, 0, -1, SbSchedulingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbTaskActivityEClass, SbTaskActivity.class, "SbTaskActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbTaskActivity_ActionSteps(), this.getSbStep(), null, "actionSteps", null, 0, -1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RootActionStep(), this.getSbStep(), null, "rootActionStep", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_StepPrecedenceRelations(), this.getSbStepPrecedenceRelation(), null, "stepPrecedenceRelations", null, 0, -1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpDeadline(), theRtpTypesPackage.getRtpDeadlineType(), null, "rtpDeadline", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpExecutionTime(), theRtpTypesPackage.getRtpExecutionTimeType(), null, "rtpExecutionTime", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpOffset(), theRtpTypesPackage.getRtpOffsetType(), null, "rtpOffset", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpBlockingTime(), theRtpTypesPackage.getRtpBlockingTimeType(), null, "rtpBlockingTime", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpRepetition(), theRtpTypesPackage.getRtpRepetitionType(), null, "rtpRepetition", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpResponseTime(), theRtpTypesPackage.getRtpResponseTimeType(), null, "rtpResponseTime", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpPriority(), theRtpTypesPackage.getRtpPriorityType(), null, "rtpPriority", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RepresentedTask(), theSoftwareOperatorsPackage.getSoSchedulableTask(), theSoftwareOperatorsPackage.getSoSchedulableTask_RepresentedActivity(), "representedTask", null, 1, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_Repetition(), theRtpTypesPackage.getRtpRepetitionType(), null, "repetition", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_Deadline(), theRtpTypesPackage.getRtpDeadlineType(), null, "deadline", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_ExecutionTime(), theRtpTypesPackage.getRtpExecutionTimeType(), null, "executionTime", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_BlockingTime(), theRtpTypesPackage.getRtpBlockingTimeType(), null, "blockingTime", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_Priority(), theRtpTypesPackage.getRtpPriorityType(), null, "priority", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_ResponseTime(), theRtpTypesPackage.getRtpResponseTimeType(), null, "responseTime", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_Offset(), theRtpTypesPackage.getRtpOffsetType(), null, "offset", null, 0, 1, SbTaskActivity.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpCriticality(), theRtpTypesPackage.getRtpCriticalityType(), null, "rtpCriticality", null, 0, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpPreemptibility(), theRtpTypesPackage.getRtpPreemptibilityType(), null, "rtpPreemptibility", null, 1, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbTaskActivity_RtpSelfSuspension(), theRtpTypesPackage.getRtpSelfSuspensionType(), null, "rtpSelfSuspension", null, 1, 1, SbTaskActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbPrecedenceRelationEClass, SbPrecedenceRelation.class, "SbPrecedenceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbSequencingRelationEClass, SbSequencingRelation.class, "SbSequencingRelation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSbSequencingRelation_Name(), ecorePackage.getEString(), "name", null, 1, 1, SbSequencingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbSequencingRelation_TargetSchedulingActivity(), this.getSbSchedulingActivity(), this.getSbSchedulingActivity_InputSquencingRelation(), "targetSchedulingActivity", null, 1, 1, SbSequencingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbSequencingRelation_SourceSchedulingActivity(), this.getSbSchedulingActivity(), this.getSbSchedulingActivity_OutputSequencingRelation(), "sourceSchedulingActivity", null, 1, 1, SbSequencingRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbCommunicationRelationEClass, SbCommunicationRelation.class, "SbCommunicationRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbCommunicationRelation_CommResource(), theSoftwareOperatorsPackage.getSoCommunicationResource(), null, "commResource", null, 1, 1, SbCommunicationRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbStepEClass, SbStep.class, "SbStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbStep_InputStepRelation(), this.getSbStepPrecedenceRelation(), this.getSbStepPrecedenceRelation_TargetStep(), "inputStepRelation", null, 0, -1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_OutputStepRelation(), this.getSbStepPrecedenceRelation(), this.getSbStepPrecedenceRelation_SourceStep(), "outputStepRelation", null, 0, -1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSbStep_Name(), ecorePackage.getEString(), "name", null, 1, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_RtpDeadline(), theRtpTypesPackage.getRtpDeadlineType(), null, "rtpDeadline", null, 0, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_RtpExecutionTime(), theRtpTypesPackage.getRtpExecutionTimeType(), null, "rtpExecutionTime", null, 0, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_RtpBlockingTime(), theRtpTypesPackage.getRtpBlockingTimeType(), null, "rtpBlockingTime", null, 0, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_RtpRepetition(), theRtpTypesPackage.getRtpRepetitionType(), null, "rtpRepetition", null, 0, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_RepresentedOperation(), theUMLPackage.getOperation(), null, "representedOperation", null, 0, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_Repetition(), theRtpTypesPackage.getRtpRepetitionType(), null, "repetition", null, 0, 1, SbStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_Deadline(), theRtpTypesPackage.getRtpDeadlineType(), null, "deadline", null, 0, 1, SbStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_ExecutionTime(), theRtpTypesPackage.getRtpExecutionTimeType(), null, "executionTime", null, 0, 1, SbStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_BlockingTime(), theRtpTypesPackage.getRtpBlockingTimeType(), null, "blockingTime", null, 0, 1, SbStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_InteractionResource(), theSoftwareOperatorsPackage.getSoInteractionResource(), null, "interactionResource", null, 0, 1, SbStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStep_StepPredecessors(), this.getSbStep(), null, "stepPredecessors", null, 0, -1, SbStep.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(sbAcquireStepEClass, SbAcquireStep.class, "SbAcquireStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbSendStepEClass, SbSendStep.class, "SbSendStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbReceiveStepEClass, SbReceiveStep.class, "SbReceiveStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbWriteStepEClass, SbWriteStep.class, "SbWriteStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbReleaseStepEClass, SbReleaseStep.class, "SbReleaseStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbReadStepEClass, SbReadStep.class, "SbReadStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sbStepPrecedenceRelationEClass, SbStepPrecedenceRelation.class, "SbStepPrecedenceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbStepPrecedenceRelation_TargetStep(), this.getSbStep(), this.getSbStep_InputStepRelation(), "targetStep", null, 0, 1, SbStepPrecedenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSbStepPrecedenceRelation_SourceStep(), this.getSbStep(), this.getSbStep_OutputStepRelation(), "sourceStep", null, 0, 1, SbStepPrecedenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSbStepPrecedenceRelation_Name(), ecorePackage.getEString(), "name", null, 1, 1, SbStepPrecedenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbActionStepEClass, SbActionStep.class, "SbActionStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (globalBehaviorEClass, 
		   source, 
		   new String[] {
			 "constraints", "GlobalBehaviourRule1 GlobalBehaviourRule2"
		   });	
		addAnnotation
		  (sbTimeTriggerEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbTimeTriggerRule1 SbTimeTriggerRule2"
		   });	
		addAnnotation
		  (sbTaskActivityEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbTaskActivityRule1 SbTaskActivityRule2 SbTaskActivityRule3 SbTaskActivityRule4 SbTaskActivityRule5 SbTaskActivityRule6 SbTaskActivityRule7 SbTaskActivityRule8"
		   });	
		addAnnotation
		  (sbPrecedenceRelationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbPrecedenceRelationRule1"
		   });	
		addAnnotation
		  (sbCommunicationRelationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbCommunicationRelationRule1 SbCommunicationRelationRule2"
		   });	
		addAnnotation
		  (sbAcquireStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbAcquireStepRule1 SbAcquireStepRule2"
		   });	
		addAnnotation
		  (sbSendStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbSendStepRule1 SbSendStepRule2"
		   });	
		addAnnotation
		  (sbReceiveStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbReceiveStepRule1 SbReceiveStepRule2"
		   });	
		addAnnotation
		  (sbWriteStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbWriteStepRule1 SbWriteStepRule2"
		   });	
		addAnnotation
		  (sbReleaseStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbReleaseStepRule1 SbReleaseStepRule2"
		   });	
		addAnnotation
		  (sbReadStepEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbReadStepRule1 SbReadStepRule2"
		   });	
		addAnnotation
		  (sbStepPrecedenceRelationEClass, 
		   source, 
		   new String[] {
			 "constraints", "SbStepPrecedenceRelationRule1 SbStepPrecedenceRelationRule2"
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
		  (globalBehaviorEClass, 
		   source, 
		   new String[] {
			 "GlobalBehaviourRule1", "self.triggers->notEmpty() implies rootTrigger.oclAsSet()->notEmpty()",
			 "GlobalBehaviourRule2", "self.sequencingRelations->select(r | r.oclIsTypeOf(SbPrecedenceRelation))->forAll(pr1,pr2 | pr1 <> pr2 and pr1.targetSchedulingActivity = pr2.sourceSchedulingActivity implies pr1.sourceSchedulingActivity <> pr2. targetSchedulingActivity)"
		   });	
		addAnnotation
		  (sbTimeTriggerEClass, 
		   source, 
		   new String[] {
			 "SbTimeTriggerRule1", "GlobalBehaviour.allInstances()->forAll(gb | gb.rootTrigger = self implies self.rtpStartTime->isEmpty())",
			 "SbTimeTriggerRule2", "SbTimeTrigger.allInstances()->forAll(tt1 : SbTimeTrigger, tt2 : SbTimeTrigger | tt1.schedulingActivities->notEmpty() and tt1.rtpStartTime->notEmpty() and tt1.rtpStartTime.referring->notEmpty() and tt1.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and tt1.rtpStartTime.referring.oclAsType (RealTimeProperties ::RtpHelperTypes::RtpTimeReferenceType).timeLink->notEmpty() and tt2.rtpStartTime ->notEmpty() and tt2.rtpStartTime.referring->notEmpty() and tt2.rtpStartTime.referring.oclIsTypeOf(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType) and  tt2.rtpStartTime. referring.oclAsType(RealTimeProperties::RtpHelperTypes:: RtpTimeReferenceType).timeLink->notEmpty() and tt1. schedulingActivities ->includes (tt2.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity) implies tt2.schedulingActivities->excludes(tt1.rtpStartTime.referring.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeReferenceType).timeLink.oclAsType(RealTimeProperties::RtpHelperTypes::RtpTimeLinkType).referenceActivity))\r\n"
		   });	
		addAnnotation
		  (getSbTimeTrigger_StartTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpStartTime"
		   });	
		addAnnotation
		  (getSbTimeTrigger_Periodicity(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpPeriodicity"
		   });	
		addAnnotation
		  (sbTaskActivityEClass, 
		   source, 
		   new String[] {
			 "SbTaskActivityRule1", "self.oclAsType(SbSchedulingActivity).trigger->isEmpty() implies self.oclAsType(SbSchedulingActivity).inputSquencingRelation->notEmpty()",
			 "SbTaskActivityRule2", "(self.actionSteps->notEmpty() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep) or s.oclIsTypeOf(SbAcquireStep)) )-> size()>0)  implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))->size() = (self.actionSteps->select(s| s.oclIsTypeOf(SbAcquireStep)))->size() and (self.actionSteps->select(s| s.oclIsTypeOf(SbReleaseStep)))-> size() <= self.representedTask.rtpMutualExclusionResourceUtilization->size())",
			 "SbTaskActivityRule3", "(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbWriteStep)))->size() <= (self.representedTask.commWritingResources->select(wr | wr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())",
			 "SbTaskActivityRule4", "(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size()>0) implies ((self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbReadStep)))->size() <= (self.representedTask.commReadingResources->select(rr :SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)))->size())",
			 "SbTaskActivityRule5", "(self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size()>0) implies ( (self.actionSteps->select(s : SbStep| s.oclIsTypeOf(SbSendStep)))->size() <= (self.representedTask.commWritingResources->select(wr : SoftwareOperators::SoCommunicationResource| wr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())",
			 "SbTaskActivityRule6", "( self.actionSteps->notEmpty() and (self.actionSteps->select(s : SbStep | s.oclIsTypeOf(SbReceiveStep)))->size()>0 ) implies ( (self.actionSteps->select(s| s.oclIsTypeOf(SbReceiveStep)))->size() <= (self.representedTask.commReadingResources->select(rr:SoftwareOperators::SoCommunicationResource | rr.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)))->size())\r\n",
			 "SbTaskActivityRule7", "self.actionSteps->notEmpty() implies ( (self.actionSteps->select(gr : SbStep| gr.interactionResource->notEmpty())->collect(s : SbStep | s.interactionResource))->forAll(rsc:SoftwareOperators::SoInteractionResource | rsc.oclIsKindOf (SoftwareOperators::SoInteractionResource) implies self.representedTask.mutualExclusionResources->includes(rsc) or ( self.representedTask. commWritingResources->includes(rsc) or self.representedTask.commReadingResources->includes(rsc))) )",
			 "SbTaskActivityRule8", "self.actionSteps->select(s | s.oclIsTypeOf(SbAcquireStep) or s.oclIsTypeOf(SbReleaseStep))->forAll(a , b | a.oclIsTypeOf(SbAcquireStep) and b.oclIsTypeOf(SbReleaseStep) and a.oclAsType(SbStep).interactionResource = b.oclAsType(SbStep).interactionResource implies a.oclAsType(SbStep).stepPredecessors->excludes(b))"
		   });	
		addAnnotation
		  (getSbTaskActivity_Repetition(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpRepetition"
		   });	
		addAnnotation
		  (getSbTaskActivity_Deadline(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpDeadline"
		   });	
		addAnnotation
		  (getSbTaskActivity_ExecutionTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpExecutionTime"
		   });	
		addAnnotation
		  (getSbTaskActivity_BlockingTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpBlockingTime"
		   });	
		addAnnotation
		  (getSbTaskActivity_Priority(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpPriority"
		   });	
		addAnnotation
		  (getSbTaskActivity_ResponseTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpResponseTime"
		   });	
		addAnnotation
		  (getSbTaskActivity_Offset(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpOffset"
		   });	
		addAnnotation
		  (sbPrecedenceRelationEClass, 
		   source, 
		   new String[] {
			 "SbPrecedenceRelationRule1", "self.targetSchedulingActivity <> self.sourceSchedulingActivity"
		   });	
		addAnnotation
		  (sbCommunicationRelationEClass, 
		   source, 
		   new String[] {
			 "SbCommunicationRelationRule1", "self.targetSchedulingActivity <> self.sourceSchedulingActivity",
			 "SbCommunicationRelationRule2", "(self.commResource.writerTasks-> includes (self.oclAsType(SbSequencingRelation). sourceSchedulingActivity.oclAsType(SbTaskActivity).representedTask)) and (self.commResource.readerTasks->includes(self.oclAsType(SbSequencingRelation). targetSchedulingActivity.oclAsType(SbTaskActivity).representedTask))"
		   });	
		addAnnotation
		  (getSbStep_Repetition(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpRepetition"
		   });	
		addAnnotation
		  (getSbStep_Deadline(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpDeadline"
		   });	
		addAnnotation
		  (getSbStep_ExecutionTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpExecutionTime"
		   });	
		addAnnotation
		  (getSbStep_BlockingTime(), 
		   source, 
		   new String[] {
			 "derivation", "self.rtpBlockingTime"
		   });	
		addAnnotation
		  (getSbStep_StepPredecessors(), 
		   source, 
		   new String[] {
			 "derivation", "self.inputStepRelation->collect(r : SbStepPrecedenceRelation | r.sourceStep)->collect(s : SbStep | s.stepPredecessors)->union(self.inputStepRelation->collect(r : SbStepPrecedenceRelation | r.sourceStep))"
		   });	
		addAnnotation
		  (sbAcquireStepEClass, 
		   source, 
		   new String[] {
			 "SbAcquireStepRule1", "self.oclAsType(SbStep).interactionResource->notEmpty()",
			 "SbAcquireStepRule2", "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource)or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource .oclAsType(SoftwareOperators:: SoLocalCommResource). rtpProtectProtocol-> notEmpty())"
		   });	
		addAnnotation
		  (sbSendStepEClass, 
		   source, 
		   new String[] {
			 "SbSendStepRule1", "self.oclAsType(SbStep).interactionResource->notEmpty()",
			 "SbSendStepRule2", "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)"
		   });	
		addAnnotation
		  (sbReceiveStepEClass, 
		   source, 
		   new String[] {
			 "SbReceiveStepRule1", "self.oclAsType(SbStep).interactionResource->notEmpty()",
			 "SbReceiveStepRule2", "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoRemoteCommResource)"
		   });	
		addAnnotation
		  (sbWriteStepEClass, 
		   source, 
		   new String[] {
			 "SbWriteStepRule1", "self.oclAsType(SbStep).interactionResource->notEmpty()",
			 "SbWriteStepRule2", "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)"
		   });	
		addAnnotation
		  (sbReleaseStepEClass, 
		   source, 
		   new String[] {
			 "SbReleaseStepRule1", "self.oclAsType(SbStep).interactionResource->notEmpty()",
			 "SbReleaseStepRule2", "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoMutualExclusionResource) or (self.oclAsType(SbStep).interactionResource.oclIsTypeOf (SoftwareOperators::SoLocalCommResource)and self.oclAsType(SbStep). interactionResource.oclAsType(SoftwareOperators::SoLocalCommResource). rtpProtectProtocol -> notEmpty())"
		   });	
		addAnnotation
		  (sbReadStepEClass, 
		   source, 
		   new String[] {
			 "SbReadStepRule1", "self.oclAsType(SbStep).interactionResource->notEmpty()",
			 "SbReadStepRule2", "self.oclAsType(SbStep).interactionResource.oclIsTypeOf(SoftwareOperators::SoLocalCommResource)"
		   });	
		addAnnotation
		  (sbStepPrecedenceRelationEClass, 
		   source, 
		   new String[] {
			 "SbStepPrecedenceRelationRule1", "self.sourceStep.oclIsTypeOf(SbAcquireStep) implies not self.targetStep.oclIsTypeOf(SbAcquireStep)",
			 "SbStepPrecedenceRelationRule2", "self.sourceStep.oclIsTypeOf(SbReleaseStep) implies not self.targetStep.oclIsTypeOf(SbReleaseStep)"
		   });
	}

} //SoftwareBehaviorPackageImpl
