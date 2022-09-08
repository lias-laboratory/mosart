/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.AnalysisRepository;
import MoSaRTBackEnd_AnalysisRepository.BehaviorKindType;
import MoSaRTBackEnd_AnalysisRepository.ComponentKindType;
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.Deadline_Sustainability;
import MoSaRTBackEnd_AnalysisRepository.EvaluationResultType;
import MoSaRTBackEnd_AnalysisRepository.ExecutionTime_Sustainability;
import MoSaRTBackEnd_AnalysisRepository.FeasibilityType;
import MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.Jitter_Sustainability;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryFactory;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.NecessaryCondition;
import MoSaRTBackEnd_AnalysisRepository.Period_Sustainability;
import MoSaRTBackEnd_AnalysisRepository.SufficientCondition;
import MoSaRTBackEnd_AnalysisRepository.SustainabilityType;
import MoSaRTBackEnd_AnalysisRepository.Test;
import MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType;
import MoSaRTBackEnd_AnalysisRepository.TestFamily;
import MoSaRTBackEnd_AnalysisRepository.TimingKindType;
import MoSaRTBackEnd_AnalysisRepository.Tool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoSaRTBackEnd_AnalysisRepositoryPackageImpl extends EPackageImpl implements MoSaRTBackEnd_AnalysisRepositoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCharacteristicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sustainabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadline_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jitter_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass period_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTime_SustainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feasibilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sufficientConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass necessaryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timingKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum behaviorKindTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationResultTypeEEnum = null;

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
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MoSaRTBackEnd_AnalysisRepositoryPackageImpl() {
		super(eNS_URI, MoSaRTBackEnd_AnalysisRepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MoSaRTBackEnd_AnalysisRepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MoSaRTBackEnd_AnalysisRepositoryPackage init() {
		if (isInited) return (MoSaRTBackEnd_AnalysisRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(MoSaRTBackEnd_AnalysisRepositoryPackage.eNS_URI);

		// Obtain or create and register package
		MoSaRTBackEnd_AnalysisRepositoryPackageImpl theMoSaRTBackEnd_AnalysisRepositoryPackage = (MoSaRTBackEnd_AnalysisRepositoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MoSaRTBackEnd_AnalysisRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MoSaRTBackEnd_AnalysisRepositoryPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMoSaRTBackEnd_AnalysisRepositoryPackage.createPackageContents();

		// Initialize created meta-data
		theMoSaRTBackEnd_AnalysisRepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMoSaRTBackEnd_AnalysisRepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MoSaRTBackEnd_AnalysisRepositoryPackage.eNS_URI, theMoSaRTBackEnd_AnalysisRepositoryPackage);
		return theMoSaRTBackEnd_AnalysisRepositoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisRepository() {
		return analysisRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisRepository_Name() {
		return (EAttribute)analysisRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisRepository_Description() {
		return (EAttribute)analysisRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllGeneralizationRelationships() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllContextModels() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllRules() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllTests() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllTools() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_AllTestFamilies() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisRepository_MosartMetamodel() {
		return (EReference)analysisRepositoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisRepository__AppropriateModelsFinder__Map() {
		return analysisRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnalysisRepository__IdentificationRuleChecker__EObject() {
		return analysisRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextModel() {
		return contextModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_Name() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_Description() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContextModel_References() {
		return (EAttribute)contextModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_TrueValueRules() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_FalseValueRules() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_UndefinedValueRules() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextModel_AnalysisTests() {
		return (EReference)contextModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Id() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Name() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_References() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Description() {
		return (EAttribute)testEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_ItsTestFamily() {
		return (EReference)testEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_ToolsToApply() {
		return (EReference)testEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Characteristics() {
		return (EReference)testEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationRule() {
		return identificationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_Id() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_TimingKind() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_ComponentKind() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationRule_Rule() {
		return (EReference)identificationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentificationRule_RuleContext() {
		return (EReference)identificationRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationRule_Description() {
		return (EAttribute)identificationRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Id() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Name() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_Description() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_MosartToToolPath() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTool_ToolToMosartPath() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestFamily() {
		return testFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestFamily_Name() {
		return (EAttribute)testFamilyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestFamily_Description() {
		return (EAttribute)testFamilyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestFamily_References() {
		return (EAttribute)testFamilyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestFamily_ContainedTests() {
		return (EReference)testFamilyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationRelationship() {
		return generalizationRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationship_Name() {
		return (EAttribute)generalizationRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationship_Description() {
		return (EAttribute)generalizationRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationRelationship_SpecificModel() {
		return (EReference)generalizationRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationRelationship_GenericModel() {
		return (EReference)generalizationRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationship_BehaviorKind() {
		return (EAttribute)generalizationRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationship_GenericToSpecificPath() {
		return (EAttribute)generalizationRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationRelationship_SpecificToGenericPath() {
		return (EAttribute)generalizationRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentKindType() {
		return componentKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBehaviorKindType() {
		return behaviorKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEvaluationResultType() {
		return evaluationResultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCharacteristicType() {
		return testCharacteristicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCharacteristicType_TestValue() {
		return (EAttribute)testCharacteristicTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCharacteristicType_Comment() {
		return (EAttribute)testCharacteristicTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCharacteristicType_Contexts() {
		return (EReference)testCharacteristicTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSustainabilityType() {
		return sustainabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeadline_Sustainability() {
		return deadline_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJitter_Sustainability() {
		return jitter_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod_Sustainability() {
		return period_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionTime_Sustainability() {
		return executionTime_SustainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeasibilityType() {
		return feasibilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSufficientCondition() {
		return sufficientConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNecessaryCondition() {
		return necessaryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimingKindType() {
		return timingKindTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSaRTBackEnd_AnalysisRepositoryFactory getMoSaRTBackEnd_AnalysisRepositoryFactory() {
		return (MoSaRTBackEnd_AnalysisRepositoryFactory)getEFactoryInstance();
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
		analysisRepositoryEClass = createEClass(ANALYSIS_REPOSITORY);
		createEAttribute(analysisRepositoryEClass, ANALYSIS_REPOSITORY__NAME);
		createEAttribute(analysisRepositoryEClass, ANALYSIS_REPOSITORY__DESCRIPTION);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_RULES);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_TESTS);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_TOOLS);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES);
		createEReference(analysisRepositoryEClass, ANALYSIS_REPOSITORY__MOSART_METAMODEL);
		createEOperation(analysisRepositoryEClass, ANALYSIS_REPOSITORY___APPROPRIATE_MODELS_FINDER__MAP);
		createEOperation(analysisRepositoryEClass, ANALYSIS_REPOSITORY___IDENTIFICATION_RULE_CHECKER__EOBJECT);

		contextModelEClass = createEClass(CONTEXT_MODEL);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__NAME);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__DESCRIPTION);
		createEAttribute(contextModelEClass, CONTEXT_MODEL__REFERENCES);
		createEReference(contextModelEClass, CONTEXT_MODEL__TRUE_VALUE_RULES);
		createEReference(contextModelEClass, CONTEXT_MODEL__FALSE_VALUE_RULES);
		createEReference(contextModelEClass, CONTEXT_MODEL__UNDEFINED_VALUE_RULES);
		createEReference(contextModelEClass, CONTEXT_MODEL__ANALYSIS_TESTS);

		testEClass = createEClass(TEST);
		createEAttribute(testEClass, TEST__ID);
		createEAttribute(testEClass, TEST__NAME);
		createEAttribute(testEClass, TEST__REFERENCES);
		createEAttribute(testEClass, TEST__DESCRIPTION);
		createEReference(testEClass, TEST__ITS_TEST_FAMILY);
		createEReference(testEClass, TEST__TOOLS_TO_APPLY);
		createEReference(testEClass, TEST__CHARACTERISTICS);

		identificationRuleEClass = createEClass(IDENTIFICATION_RULE);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__ID);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__TIMING_KIND);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__COMPONENT_KIND);
		createEReference(identificationRuleEClass, IDENTIFICATION_RULE__RULE);
		createEReference(identificationRuleEClass, IDENTIFICATION_RULE__RULE_CONTEXT);
		createEAttribute(identificationRuleEClass, IDENTIFICATION_RULE__DESCRIPTION);

		toolEClass = createEClass(TOOL);
		createEAttribute(toolEClass, TOOL__ID);
		createEAttribute(toolEClass, TOOL__NAME);
		createEAttribute(toolEClass, TOOL__DESCRIPTION);
		createEAttribute(toolEClass, TOOL__MOSART_TO_TOOL_PATH);
		createEAttribute(toolEClass, TOOL__TOOL_TO_MOSART_PATH);

		testFamilyEClass = createEClass(TEST_FAMILY);
		createEAttribute(testFamilyEClass, TEST_FAMILY__NAME);
		createEAttribute(testFamilyEClass, TEST_FAMILY__DESCRIPTION);
		createEAttribute(testFamilyEClass, TEST_FAMILY__REFERENCES);
		createEReference(testFamilyEClass, TEST_FAMILY__CONTAINED_TESTS);

		generalizationRelationshipEClass = createEClass(GENERALIZATION_RELATIONSHIP);
		createEAttribute(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__NAME);
		createEAttribute(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__DESCRIPTION);
		createEReference(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL);
		createEReference(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__GENERIC_MODEL);
		createEAttribute(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND);
		createEAttribute(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH);
		createEAttribute(generalizationRelationshipEClass, GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH);

		testCharacteristicTypeEClass = createEClass(TEST_CHARACTERISTIC_TYPE);
		createEAttribute(testCharacteristicTypeEClass, TEST_CHARACTERISTIC_TYPE__TEST_VALUE);
		createEAttribute(testCharacteristicTypeEClass, TEST_CHARACTERISTIC_TYPE__COMMENT);
		createEReference(testCharacteristicTypeEClass, TEST_CHARACTERISTIC_TYPE__CONTEXTS);

		sustainabilityTypeEClass = createEClass(SUSTAINABILITY_TYPE);

		deadline_SustainabilityEClass = createEClass(DEADLINE_SUSTAINABILITY);

		jitter_SustainabilityEClass = createEClass(JITTER_SUSTAINABILITY);

		period_SustainabilityEClass = createEClass(PERIOD_SUSTAINABILITY);

		executionTime_SustainabilityEClass = createEClass(EXECUTION_TIME_SUSTAINABILITY);

		feasibilityTypeEClass = createEClass(FEASIBILITY_TYPE);

		sufficientConditionEClass = createEClass(SUFFICIENT_CONDITION);

		necessaryConditionEClass = createEClass(NECESSARY_CONDITION);

		// Create enums
		timingKindTypeEEnum = createEEnum(TIMING_KIND_TYPE);
		componentKindTypeEEnum = createEEnum(COMPONENT_KIND_TYPE);
		behaviorKindTypeEEnum = createEEnum(BEHAVIOR_KIND_TYPE);
		evaluationResultTypeEEnum = createEEnum(EVALUATION_RESULT_TYPE);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sustainabilityTypeEClass.getESuperTypes().add(this.getTestCharacteristicType());
		deadline_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		jitter_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		period_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		executionTime_SustainabilityEClass.getESuperTypes().add(this.getSustainabilityType());
		feasibilityTypeEClass.getESuperTypes().add(this.getTestCharacteristicType());
		sufficientConditionEClass.getESuperTypes().add(this.getFeasibilityType());
		necessaryConditionEClass.getESuperTypes().add(this.getFeasibilityType());

		// Initialize classes, features, and operations; add parameters
		initEClass(analysisRepositoryEClass, AnalysisRepository.class, "AnalysisRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisRepository_Description(), ecorePackage.getEString(), "description", null, 0, 1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllGeneralizationRelationships(), this.getGeneralizationRelationship(), null, "allGeneralizationRelationships", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllContextModels(), this.getContextModel(), null, "allContextModels", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllRules(), this.getIdentificationRule(), null, "allRules", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllTests(), this.getTest(), null, "allTests", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllTools(), this.getTool(), null, "allTools", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_AllTestFamilies(), this.getTestFamily(), null, "allTestFamilies", null, 0, -1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisRepository_MosartMetamodel(), ecorePackage.getEPackage(), null, "mosartMetamodel", null, 1, 1, AnalysisRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnalysisRepository__AppropriateModelsFinder__Map(), this.getContextModel(), "appropriateModelsFinder", 0, -1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(this.getIdentificationRule());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getEvaluationResultType());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "resultSummary", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAnalysisRepository__IdentificationRuleChecker__EObject(), null, "identificationRuleChecker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(this.getIdentificationRule());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getEvaluationResultType());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(contextModelEClass, ContextModel.class, "ContextModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextModel_References(), ecorePackage.getEString(), "references", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_TrueValueRules(), this.getIdentificationRule(), null, "trueValueRules", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_FalseValueRules(), this.getIdentificationRule(), null, "falseValueRules", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_UndefinedValueRules(), this.getIdentificationRule(), null, "undefinedValueRules", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getContextModel_AnalysisTests(), this.getTest(), null, "analysisTests", null, 0, -1, ContextModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, Test.class, "Test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTest_Id(), ecorePackage.getEString(), "id", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Name(), ecorePackage.getEString(), "name", null, 1, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_References(), ecorePackage.getEString(), "references", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTest_Description(), ecorePackage.getEString(), "description", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_ItsTestFamily(), this.getTestFamily(), this.getTestFamily_ContainedTests(), "itsTestFamily", null, 0, 1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_ToolsToApply(), this.getTool(), null, "toolsToApply", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTest_Characteristics(), this.getTestCharacteristicType(), null, "characteristics", null, 0, -1, Test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationRuleEClass, IdentificationRule.class, "IdentificationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentificationRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationRule_TimingKind(), this.getTimingKindType(), "timingKind", "", 1, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationRule_ComponentKind(), this.getComponentKindType(), "componentKind", "", 0, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentificationRule_Rule(), theEcorePackage.getEStringToStringMapEntry(), null, "rule", null, 1, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentificationRule_RuleContext(), ecorePackage.getEClass(), null, "ruleContext", null, 1, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentificationRule_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentificationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTool_Id(), ecorePackage.getEString(), "id", null, 1, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_MosartToToolPath(), ecorePackage.getEString(), "mosartToToolPath", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_ToolToMosartPath(), ecorePackage.getEString(), "toolToMosartPath", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testFamilyEClass, TestFamily.class, "TestFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestFamily_Name(), ecorePackage.getEString(), "name", null, 1, 1, TestFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestFamily_Description(), ecorePackage.getEString(), "description", null, 0, 1, TestFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestFamily_References(), ecorePackage.getEString(), "references", null, 0, -1, TestFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestFamily_ContainedTests(), this.getTest(), this.getTest_ItsTestFamily(), "containedTests", null, 0, -1, TestFamily.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationRelationshipEClass, GeneralizationRelationship.class, "GeneralizationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationRelationship_Name(), ecorePackage.getEString(), "name", null, 1, 1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationRelationship_SpecificModel(), this.getContextModel(), null, "specificModel", null, 1, 1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizationRelationship_GenericModel(), this.getContextModel(), null, "genericModel", null, 1, 1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationship_BehaviorKind(), this.getBehaviorKindType(), "behaviorKind", "", 0, -1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationship_GenericToSpecificPath(), ecorePackage.getEString(), "genericToSpecificPath", null, 0, 1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralizationRelationship_SpecificToGenericPath(), ecorePackage.getEString(), "specificToGenericPath", null, 0, 1, GeneralizationRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCharacteristicTypeEClass, TestCharacteristicType.class, "TestCharacteristicType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCharacteristicType_TestValue(), ecorePackage.getEString(), "testValue", null, 0, 1, TestCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCharacteristicType_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, TestCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCharacteristicType_Contexts(), this.getContextModel(), null, "contexts", null, 0, -1, TestCharacteristicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sustainabilityTypeEClass, SustainabilityType.class, "SustainabilityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deadline_SustainabilityEClass, Deadline_Sustainability.class, "Deadline_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jitter_SustainabilityEClass, Jitter_Sustainability.class, "Jitter_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(period_SustainabilityEClass, Period_Sustainability.class, "Period_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionTime_SustainabilityEClass, ExecutionTime_Sustainability.class, "ExecutionTime_Sustainability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(feasibilityTypeEClass, FeasibilityType.class, "FeasibilityType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sufficientConditionEClass, SufficientCondition.class, "SufficientCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(necessaryConditionEClass, NecessaryCondition.class, "NecessaryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timingKindTypeEEnum, TimingKindType.class, "TimingKindType");
		addEEnumLiteral(timingKindTypeEEnum, TimingKindType.IMPROVING);
		addEEnumLiteral(timingKindTypeEEnum, TimingKindType.WORSENING);
		addEEnumLiteral(timingKindTypeEEnum, TimingKindType.INDIFFERENT);

		initEEnum(componentKindTypeEEnum, ComponentKindType.class, "ComponentKindType");
		addEEnumLiteral(componentKindTypeEEnum, ComponentKindType.HARDWARE);
		addEEnumLiteral(componentKindTypeEEnum, ComponentKindType.SOFTWARE);

		initEEnum(behaviorKindTypeEEnum, BehaviorKindType.class, "BehaviorKindType");
		addEEnumLiteral(behaviorKindTypeEEnum, BehaviorKindType.WORST_CASE_BEHAVIOR);
		addEEnumLiteral(behaviorKindTypeEEnum, BehaviorKindType.BEST_CASE_BEHAVIOR);

		initEEnum(evaluationResultTypeEEnum, EvaluationResultType.class, "EvaluationResultType");
		addEEnumLiteral(evaluationResultTypeEEnum, EvaluationResultType.TRUE);
		addEEnumLiteral(evaluationResultTypeEEnum, EvaluationResultType.FALSE);
		addEEnumLiteral(evaluationResultTypeEEnum, EvaluationResultType.UNDEFINED);

		// Create resource
		createResource(eNS_URI);

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
		  (getContextModel_UndefinedValueRules(), 
		   source, 
		   new String[] {
			 "derivation", "RuleToBeChecked.allInstances()->asOrderedSet()->excludesAll(self.trueValueRules->union(self.falseValueRules))"
		   });
	}

} //MoSaRTBackEnd_AnalysisRepositoryPackageImpl
