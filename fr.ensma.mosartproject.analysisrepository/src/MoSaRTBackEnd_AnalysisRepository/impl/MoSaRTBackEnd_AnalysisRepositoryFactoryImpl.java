/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository.impl;

import MoSaRTBackEnd_AnalysisRepository.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoSaRTBackEnd_AnalysisRepositoryFactoryImpl extends EFactoryImpl implements MoSaRTBackEnd_AnalysisRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MoSaRTBackEnd_AnalysisRepositoryFactory init() {
		try {
			MoSaRTBackEnd_AnalysisRepositoryFactory theMoSaRTBackEnd_AnalysisRepositoryFactory = (MoSaRTBackEnd_AnalysisRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ensma.fr/MoSaRTBackEnd/AnalysisRepository"); 
			if (theMoSaRTBackEnd_AnalysisRepositoryFactory != null) {
				return theMoSaRTBackEnd_AnalysisRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MoSaRTBackEnd_AnalysisRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSaRTBackEnd_AnalysisRepositoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.ANALYSIS_REPOSITORY: return createAnalysisRepository();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.CONTEXT_MODEL: return createContextModel();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST: return createTest();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.IDENTIFICATION_RULE: return createIdentificationRule();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TOOL: return createTool();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TEST_FAMILY: return createTestFamily();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.GENERALIZATION_RELATIONSHIP: return createGeneralizationRelationship();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.DEADLINE_SUSTAINABILITY: return createDeadline_Sustainability();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.JITTER_SUSTAINABILITY: return createJitter_Sustainability();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.PERIOD_SUSTAINABILITY: return createPeriod_Sustainability();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.EXECUTION_TIME_SUSTAINABILITY: return createExecutionTime_Sustainability();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.SUFFICIENT_CONDITION: return createSufficientCondition();
			case MoSaRTBackEnd_AnalysisRepositoryPackage.NECESSARY_CONDITION: return createNecessaryCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TIMING_KIND_TYPE:
				return createTimingKindTypeFromString(eDataType, initialValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.COMPONENT_KIND_TYPE:
				return createComponentKindTypeFromString(eDataType, initialValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.BEHAVIOR_KIND_TYPE:
				return createBehaviorKindTypeFromString(eDataType, initialValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.EVALUATION_RESULT_TYPE:
				return createEvaluationResultTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MoSaRTBackEnd_AnalysisRepositoryPackage.TIMING_KIND_TYPE:
				return convertTimingKindTypeToString(eDataType, instanceValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.COMPONENT_KIND_TYPE:
				return convertComponentKindTypeToString(eDataType, instanceValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.BEHAVIOR_KIND_TYPE:
				return convertBehaviorKindTypeToString(eDataType, instanceValue);
			case MoSaRTBackEnd_AnalysisRepositoryPackage.EVALUATION_RESULT_TYPE:
				return convertEvaluationResultTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisRepository createAnalysisRepository() {
		AnalysisRepositoryImpl analysisRepository = new AnalysisRepositoryImpl();
		return analysisRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModel createContextModel() {
		ContextModelImpl contextModel = new ContextModelImpl();
		return contextModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationRule createIdentificationRule() {
		IdentificationRuleImpl identificationRule = new IdentificationRuleImpl();
		return identificationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFamily createTestFamily() {
		TestFamilyImpl testFamily = new TestFamilyImpl();
		return testFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationRelationship createGeneralizationRelationship() {
		GeneralizationRelationshipImpl generalizationRelationship = new GeneralizationRelationshipImpl();
		return generalizationRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deadline_Sustainability createDeadline_Sustainability() {
		Deadline_SustainabilityImpl deadline_Sustainability = new Deadline_SustainabilityImpl();
		return deadline_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Jitter_Sustainability createJitter_Sustainability() {
		Jitter_SustainabilityImpl jitter_Sustainability = new Jitter_SustainabilityImpl();
		return jitter_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period_Sustainability createPeriod_Sustainability() {
		Period_SustainabilityImpl period_Sustainability = new Period_SustainabilityImpl();
		return period_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTime_Sustainability createExecutionTime_Sustainability() {
		ExecutionTime_SustainabilityImpl executionTime_Sustainability = new ExecutionTime_SustainabilityImpl();
		return executionTime_Sustainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SufficientCondition createSufficientCondition() {
		SufficientConditionImpl sufficientCondition = new SufficientConditionImpl();
		return sufficientCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NecessaryCondition createNecessaryCondition() {
		NecessaryConditionImpl necessaryCondition = new NecessaryConditionImpl();
		return necessaryCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingKindType createTimingKindTypeFromString(EDataType eDataType, String initialValue) {
		TimingKindType result = TimingKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimingKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentKindType createComponentKindTypeFromString(EDataType eDataType, String initialValue) {
		ComponentKindType result = ComponentKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorKindType createBehaviorKindTypeFromString(EDataType eDataType, String initialValue) {
		BehaviorKindType result = BehaviorKindType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorKindTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationResultType createEvaluationResultTypeFromString(EDataType eDataType, String initialValue) {
		EvaluationResultType result = EvaluationResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvaluationResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoSaRTBackEnd_AnalysisRepositoryPackage getMoSaRTBackEnd_AnalysisRepositoryPackage() {
		return (MoSaRTBackEnd_AnalysisRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MoSaRTBackEnd_AnalysisRepositoryPackage getPackage() {
		return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE;
	}

} //MoSaRTBackEnd_AnalysisRepositoryFactoryImpl
