/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MoSaRTBackEnd_AnalysisRepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MoSaRTBackEnd_AnalysisRepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ensma.fr/MoSaRTBackEnd/AnalysisRepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MoSaRTBackEnd_AnalysisRepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoSaRTBackEnd_AnalysisRepositoryPackage eINSTANCE = MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl <em>Analysis Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getAnalysisRepository()
	 * @generated
	 */
	int ANALYSIS_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>All Generalization Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS = 2;

	/**
	 * The feature id for the '<em><b>All Context Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS = 3;

	/**
	 * The feature id for the '<em><b>All Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_RULES = 4;

	/**
	 * The feature id for the '<em><b>All Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_TESTS = 5;

	/**
	 * The feature id for the '<em><b>All Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_TOOLS = 6;

	/**
	 * The feature id for the '<em><b>All Test Families</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES = 7;

	/**
	 * The feature id for the '<em><b>Mosart Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY__MOSART_METAMODEL = 8;

	/**
	 * The number of structural features of the '<em>Analysis Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Appropriate Models Finder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY___APPROPRIATE_MODELS_FINDER__MAP = 0;

	/**
	 * The operation id for the '<em>Identification Rule Checker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY___IDENTIFICATION_RULE_CHECKER__EOBJECT = 1;

	/**
	 * The number of operations of the '<em>Analysis Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_REPOSITORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl <em>Context Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getContextModel()
	 * @generated
	 */
	int CONTEXT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>True Value Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__TRUE_VALUE_RULES = 3;

	/**
	 * The feature id for the '<em><b>False Value Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__FALSE_VALUE_RULES = 4;

	/**
	 * The feature id for the '<em><b>Undefined Value Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__UNDEFINED_VALUE_RULES = 5;

	/**
	 * The feature id for the '<em><b>Analysis Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL__ANALYSIS_TESTS = 6;

	/**
	 * The number of structural features of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Context Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.TestImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Its Test Family</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ITS_TEST_FAMILY = 4;

	/**
	 * The feature id for the '<em><b>Tools To Apply</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TOOLS_TO_APPLY = 5;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__CHARACTERISTICS = 6;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl <em>Identification Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getIdentificationRule()
	 * @generated
	 */
	int IDENTIFICATION_RULE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Timing Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__TIMING_KIND = 1;

	/**
	 * The feature id for the '<em><b>Component Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__COMPONENT_KIND = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__RULE = 3;

	/**
	 * The feature id for the '<em><b>Rule Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__RULE_CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Identification Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Identification Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.ToolImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Mosart To Tool Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__MOSART_TO_TOOL_PATH = 3;

	/**
	 * The feature id for the '<em><b>Tool To Mosart Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TOOL_TO_MOSART_PATH = 4;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.TestFamilyImpl <em>Test Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.TestFamilyImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTestFamily()
	 * @generated
	 */
	int TEST_FAMILY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FAMILY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FAMILY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FAMILY__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Contained Tests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FAMILY__CONTAINED_TESTS = 3;

	/**
	 * The number of structural features of the '<em>Test Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FAMILY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FAMILY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl <em>Generalization Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getGeneralizationRelationship()
	 * @generated
	 */
	int GENERALIZATION_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Specific Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Generic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__GENERIC_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Behavior Kind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND = 4;

	/**
	 * The feature id for the '<em><b>Generic To Specific Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH = 5;

	/**
	 * The feature id for the '<em><b>Specific To Generic Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH = 6;

	/**
	 * The number of structural features of the '<em>Generalization Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Generalization Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.ComponentKindType <em>Component Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.ComponentKindType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getComponentKindType()
	 * @generated
	 */
	int COMPONENT_KIND_TYPE = 17;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.BehaviorKindType <em>Behavior Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.BehaviorKindType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getBehaviorKindType()
	 * @generated
	 */
	int BEHAVIOR_KIND_TYPE = 18;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.EvaluationResultType <em>Evaluation Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.EvaluationResultType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getEvaluationResultType()
	 * @generated
	 */
	int EVALUATION_RESULT_TYPE = 19;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType <em>Test Characteristic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTestCharacteristicType()
	 * @generated
	 */
	int TEST_CHARACTERISTIC_TYPE = 7;


	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE__TEST_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE__CONTEXTS = 2;

	/**
	 * The number of structural features of the '<em>Test Characteristic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Characteristic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CHARACTERISTIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.SustainabilityType <em>Sustainability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.SustainabilityType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getSustainabilityType()
	 * @generated
	 */
	int SUSTAINABILITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE__TEST_VALUE = TEST_CHARACTERISTIC_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE__COMMENT = TEST_CHARACTERISTIC_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE__CONTEXTS = TEST_CHARACTERISTIC_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Sustainability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE_FEATURE_COUNT = TEST_CHARACTERISTIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sustainability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSTAINABILITY_TYPE_OPERATION_COUNT = TEST_CHARACTERISTIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.Deadline_SustainabilityImpl <em>Deadline Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.Deadline_SustainabilityImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getDeadline_Sustainability()
	 * @generated
	 */
	int DEADLINE_SUSTAINABILITY = 9;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY__TEST_VALUE = SUSTAINABILITY_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY__CONTEXTS = SUSTAINABILITY_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Deadline Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deadline Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLINE_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.Jitter_SustainabilityImpl <em>Jitter Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.Jitter_SustainabilityImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getJitter_Sustainability()
	 * @generated
	 */
	int JITTER_SUSTAINABILITY = 10;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY__TEST_VALUE = SUSTAINABILITY_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY__CONTEXTS = SUSTAINABILITY_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Jitter Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jitter Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JITTER_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl <em>Period Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getPeriod_Sustainability()
	 * @generated
	 */
	int PERIOD_SUSTAINABILITY = 11;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY__TEST_VALUE = SUSTAINABILITY_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY__CONTEXTS = SUSTAINABILITY_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Period Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Period Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.ExecutionTime_SustainabilityImpl <em>Execution Time Sustainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.ExecutionTime_SustainabilityImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getExecutionTime_Sustainability()
	 * @generated
	 */
	int EXECUTION_TIME_SUSTAINABILITY = 12;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY__TEST_VALUE = SUSTAINABILITY_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY__COMMENT = SUSTAINABILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY__CONTEXTS = SUSTAINABILITY_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Execution Time Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY_FEATURE_COUNT = SUSTAINABILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Time Sustainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_SUSTAINABILITY_OPERATION_COUNT = SUSTAINABILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.FeasibilityType <em>Feasibility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.FeasibilityType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getFeasibilityType()
	 * @generated
	 */
	int FEASIBILITY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE__TEST_VALUE = TEST_CHARACTERISTIC_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE__COMMENT = TEST_CHARACTERISTIC_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE__CONTEXTS = TEST_CHARACTERISTIC_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Feasibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE_FEATURE_COUNT = TEST_CHARACTERISTIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feasibility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEASIBILITY_TYPE_OPERATION_COUNT = TEST_CHARACTERISTIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.SufficientConditionImpl <em>Sufficient Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.SufficientConditionImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getSufficientCondition()
	 * @generated
	 */
	int SUFFICIENT_CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION__TEST_VALUE = FEASIBILITY_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION__COMMENT = FEASIBILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION__CONTEXTS = FEASIBILITY_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Sufficient Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION_FEATURE_COUNT = FEASIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sufficient Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUFFICIENT_CONDITION_OPERATION_COUNT = FEASIBILITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.NecessaryConditionImpl <em>Necessary Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.NecessaryConditionImpl
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getNecessaryCondition()
	 * @generated
	 */
	int NECESSARY_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Test Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION__TEST_VALUE = FEASIBILITY_TYPE__TEST_VALUE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION__COMMENT = FEASIBILITY_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION__CONTEXTS = FEASIBILITY_TYPE__CONTEXTS;

	/**
	 * The number of structural features of the '<em>Necessary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION_FEATURE_COUNT = FEASIBILITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Necessary Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NECESSARY_CONDITION_OPERATION_COUNT = FEASIBILITY_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link MoSaRTBackEnd_AnalysisRepository.TimingKindType <em>Timing Kind Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MoSaRTBackEnd_AnalysisRepository.TimingKindType
	 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTimingKindType()
	 * @generated
	 */
	int TIMING_KIND_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository <em>Analysis Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Repository</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository
	 * @generated
	 */
	EClass getAnalysisRepository();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getName()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EAttribute getAnalysisRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getDescription()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EAttribute getAnalysisRepository_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllGeneralizationRelationships <em>All Generalization Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Generalization Relationships</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllGeneralizationRelationships()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllGeneralizationRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllContextModels <em>All Context Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Context Models</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllContextModels()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllContextModels();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllRules <em>All Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Rules</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllRules()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllRules();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTests <em>All Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Tests</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTests()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllTests();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTools <em>All Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Tools</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTools()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllTools();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTestFamilies <em>All Test Families</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Test Families</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTestFamilies()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_AllTestFamilies();

	/**
	 * Returns the meta object for the reference '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getMosartMetamodel <em>Mosart Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mosart Metamodel</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getMosartMetamodel()
	 * @see #getAnalysisRepository()
	 * @generated
	 */
	EReference getAnalysisRepository_MosartMetamodel();

	/**
	 * Returns the meta object for the '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#appropriateModelsFinder(java.util.Map) <em>Appropriate Models Finder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Appropriate Models Finder</em>' operation.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#appropriateModelsFinder(java.util.Map)
	 * @generated
	 */
	EOperation getAnalysisRepository__AppropriateModelsFinder__Map();

	/**
	 * Returns the meta object for the '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#identificationRuleChecker(org.eclipse.emf.ecore.EObject) <em>Identification Rule Checker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identification Rule Checker</em>' operation.
	 * @see MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#identificationRuleChecker(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAnalysisRepository__IdentificationRuleChecker__EObject();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel <em>Context Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Model</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel
	 * @generated
	 */
	EClass getContextModel();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getName()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getDescription()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_Description();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getReferences()
	 * @see #getContextModel()
	 * @generated
	 */
	EAttribute getContextModel_References();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getTrueValueRules <em>True Value Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>True Value Rules</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getTrueValueRules()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_TrueValueRules();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getFalseValueRules <em>False Value Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>False Value Rules</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getFalseValueRules()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_FalseValueRules();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getUndefinedValueRules <em>Undefined Value Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Undefined Value Rules</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getUndefinedValueRules()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_UndefinedValueRules();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getAnalysisTests <em>Analysis Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Analysis Tests</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ContextModel#getAnalysisTests()
	 * @see #getContextModel()
	 * @generated
	 */
	EReference getContextModel_AnalysisTests();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Test#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getId()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Id();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRTBackEnd_AnalysisRepository.Test#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getReferences()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_References();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Test#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getDescription()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Description();

	/**
	 * Returns the meta object for the reference '{@link MoSaRTBackEnd_AnalysisRepository.Test#getItsTestFamily <em>Its Test Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Its Test Family</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getItsTestFamily()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_ItsTestFamily();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.Test#getToolsToApply <em>Tools To Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools To Apply</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getToolsToApply()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_ToolsToApply();

	/**
	 * Returns the meta object for the containment reference list '{@link MoSaRTBackEnd_AnalysisRepository.Test#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Test#getCharacteristics()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Characteristics();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule <em>Identification Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Rule</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule
	 * @generated
	 */
	EClass getIdentificationRule();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getId()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getTimingKind <em>Timing Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timing Kind</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getTimingKind()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_TimingKind();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getComponentKind <em>Component Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Kind</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getComponentKind()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_ComponentKind();

	/**
	 * Returns the meta object for the reference '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRule()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EReference getIdentificationRule_Rule();

	/**
	 * Returns the meta object for the reference '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRuleContext <em>Rule Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule Context</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRuleContext()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EReference getIdentificationRule_RuleContext();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getDescription()
	 * @see #getIdentificationRule()
	 * @generated
	 */
	EAttribute getIdentificationRule_Description();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Tool#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool#getId()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Id();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Tool#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool#getName()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Name();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Tool#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool#getDescription()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Description();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Tool#getMosartToToolPath <em>Mosart To Tool Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mosart To Tool Path</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool#getMosartToToolPath()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_MosartToToolPath();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.Tool#getToolToMosartPath <em>Tool To Mosart Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool To Mosart Path</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Tool#getToolToMosartPath()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_ToolToMosartPath();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.TestFamily <em>Test Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Family</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestFamily
	 * @generated
	 */
	EClass getTestFamily();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.TestFamily#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestFamily#getName()
	 * @see #getTestFamily()
	 * @generated
	 */
	EAttribute getTestFamily_Name();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.TestFamily#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestFamily#getDescription()
	 * @see #getTestFamily()
	 * @generated
	 */
	EAttribute getTestFamily_Description();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRTBackEnd_AnalysisRepository.TestFamily#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestFamily#getReferences()
	 * @see #getTestFamily()
	 * @generated
	 */
	EAttribute getTestFamily_References();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.TestFamily#getContainedTests <em>Contained Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Tests</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestFamily#getContainedTests()
	 * @see #getTestFamily()
	 * @generated
	 */
	EReference getTestFamily_ContainedTests();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship <em>Generalization Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Relationship</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship
	 * @generated
	 */
	EClass getGeneralizationRelationship();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getName()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EAttribute getGeneralizationRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getDescription()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EAttribute getGeneralizationRelationship_Description();

	/**
	 * Returns the meta object for the reference '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificModel <em>Specific Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific Model</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificModel()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EReference getGeneralizationRelationship_SpecificModel();

	/**
	 * Returns the meta object for the reference '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericModel <em>Generic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generic Model</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericModel()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EReference getGeneralizationRelationship_GenericModel();

	/**
	 * Returns the meta object for the attribute list '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getBehaviorKind <em>Behavior Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Behavior Kind</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getBehaviorKind()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EAttribute getGeneralizationRelationship_BehaviorKind();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericToSpecificPath <em>Generic To Specific Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic To Specific Path</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericToSpecificPath()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EAttribute getGeneralizationRelationship_GenericToSpecificPath();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificToGenericPath <em>Specific To Generic Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specific To Generic Path</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificToGenericPath()
	 * @see #getGeneralizationRelationship()
	 * @generated
	 */
	EAttribute getGeneralizationRelationship_SpecificToGenericPath();

	/**
	 * Returns the meta object for enum '{@link MoSaRTBackEnd_AnalysisRepository.ComponentKindType <em>Component Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Kind Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ComponentKindType
	 * @generated
	 */
	EEnum getComponentKindType();

	/**
	 * Returns the meta object for enum '{@link MoSaRTBackEnd_AnalysisRepository.BehaviorKindType <em>Behavior Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Kind Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.BehaviorKindType
	 * @generated
	 */
	EEnum getBehaviorKindType();

	/**
	 * Returns the meta object for enum '{@link MoSaRTBackEnd_AnalysisRepository.EvaluationResultType <em>Evaluation Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Result Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.EvaluationResultType
	 * @generated
	 */
	EEnum getEvaluationResultType();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType <em>Test Characteristic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Characteristic Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType
	 * @generated
	 */
	EClass getTestCharacteristicType();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType#getTestValue <em>Test Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Value</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType#getTestValue()
	 * @see #getTestCharacteristicType()
	 * @generated
	 */
	EAttribute getTestCharacteristicType_TestValue();

	/**
	 * Returns the meta object for the attribute '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType#getComment()
	 * @see #getTestCharacteristicType()
	 * @generated
	 */
	EAttribute getTestCharacteristicType_Comment();

	/**
	 * Returns the meta object for the reference list '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contexts</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType#getContexts()
	 * @see #getTestCharacteristicType()
	 * @generated
	 */
	EReference getTestCharacteristicType_Contexts();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.SustainabilityType <em>Sustainability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sustainability Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.SustainabilityType
	 * @generated
	 */
	EClass getSustainabilityType();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.Deadline_Sustainability <em>Deadline Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadline Sustainability</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Deadline_Sustainability
	 * @generated
	 */
	EClass getDeadline_Sustainability();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.Jitter_Sustainability <em>Jitter Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jitter Sustainability</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Jitter_Sustainability
	 * @generated
	 */
	EClass getJitter_Sustainability();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.Period_Sustainability <em>Period Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period Sustainability</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.Period_Sustainability
	 * @generated
	 */
	EClass getPeriod_Sustainability();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.ExecutionTime_Sustainability <em>Execution Time Sustainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Time Sustainability</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.ExecutionTime_Sustainability
	 * @generated
	 */
	EClass getExecutionTime_Sustainability();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.FeasibilityType <em>Feasibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feasibility Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.FeasibilityType
	 * @generated
	 */
	EClass getFeasibilityType();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.SufficientCondition <em>Sufficient Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sufficient Condition</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.SufficientCondition
	 * @generated
	 */
	EClass getSufficientCondition();

	/**
	 * Returns the meta object for class '{@link MoSaRTBackEnd_AnalysisRepository.NecessaryCondition <em>Necessary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Necessary Condition</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.NecessaryCondition
	 * @generated
	 */
	EClass getNecessaryCondition();

	/**
	 * Returns the meta object for enum '{@link MoSaRTBackEnd_AnalysisRepository.TimingKindType <em>Timing Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timing Kind Type</em>'.
	 * @see MoSaRTBackEnd_AnalysisRepository.TimingKindType
	 * @generated
	 */
	EEnum getTimingKindType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MoSaRTBackEnd_AnalysisRepositoryFactory getMoSaRTBackEnd_AnalysisRepositoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl <em>Analysis Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.AnalysisRepositoryImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getAnalysisRepository()
		 * @generated
		 */
		EClass ANALYSIS_REPOSITORY = eINSTANCE.getAnalysisRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_REPOSITORY__NAME = eINSTANCE.getAnalysisRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_REPOSITORY__DESCRIPTION = eINSTANCE.getAnalysisRepository_Description();

		/**
		 * The meta object literal for the '<em><b>All Generalization Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_GENERALIZATION_RELATIONSHIPS = eINSTANCE.getAnalysisRepository_AllGeneralizationRelationships();

		/**
		 * The meta object literal for the '<em><b>All Context Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_CONTEXT_MODELS = eINSTANCE.getAnalysisRepository_AllContextModels();

		/**
		 * The meta object literal for the '<em><b>All Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_RULES = eINSTANCE.getAnalysisRepository_AllRules();

		/**
		 * The meta object literal for the '<em><b>All Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_TESTS = eINSTANCE.getAnalysisRepository_AllTests();

		/**
		 * The meta object literal for the '<em><b>All Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_TOOLS = eINSTANCE.getAnalysisRepository_AllTools();

		/**
		 * The meta object literal for the '<em><b>All Test Families</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__ALL_TEST_FAMILIES = eINSTANCE.getAnalysisRepository_AllTestFamilies();

		/**
		 * The meta object literal for the '<em><b>Mosart Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_REPOSITORY__MOSART_METAMODEL = eINSTANCE.getAnalysisRepository_MosartMetamodel();

		/**
		 * The meta object literal for the '<em><b>Appropriate Models Finder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_REPOSITORY___APPROPRIATE_MODELS_FINDER__MAP = eINSTANCE.getAnalysisRepository__AppropriateModelsFinder__Map();

		/**
		 * The meta object literal for the '<em><b>Identification Rule Checker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANALYSIS_REPOSITORY___IDENTIFICATION_RULE_CHECKER__EOBJECT = eINSTANCE.getAnalysisRepository__IdentificationRuleChecker__EObject();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl <em>Context Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.ContextModelImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getContextModel()
		 * @generated
		 */
		EClass CONTEXT_MODEL = eINSTANCE.getContextModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__NAME = eINSTANCE.getContextModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__DESCRIPTION = eINSTANCE.getContextModel_Description();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_MODEL__REFERENCES = eINSTANCE.getContextModel_References();

		/**
		 * The meta object literal for the '<em><b>True Value Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__TRUE_VALUE_RULES = eINSTANCE.getContextModel_TrueValueRules();

		/**
		 * The meta object literal for the '<em><b>False Value Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__FALSE_VALUE_RULES = eINSTANCE.getContextModel_FalseValueRules();

		/**
		 * The meta object literal for the '<em><b>Undefined Value Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__UNDEFINED_VALUE_RULES = eINSTANCE.getContextModel_UndefinedValueRules();

		/**
		 * The meta object literal for the '<em><b>Analysis Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_MODEL__ANALYSIS_TESTS = eINSTANCE.getContextModel_AnalysisTests();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.TestImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__ID = eINSTANCE.getTest_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__REFERENCES = eINSTANCE.getTest_References();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__DESCRIPTION = eINSTANCE.getTest_Description();

		/**
		 * The meta object literal for the '<em><b>Its Test Family</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__ITS_TEST_FAMILY = eINSTANCE.getTest_ItsTestFamily();

		/**
		 * The meta object literal for the '<em><b>Tools To Apply</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__TOOLS_TO_APPLY = eINSTANCE.getTest_ToolsToApply();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__CHARACTERISTICS = eINSTANCE.getTest_Characteristics();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl <em>Identification Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.IdentificationRuleImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getIdentificationRule()
		 * @generated
		 */
		EClass IDENTIFICATION_RULE = eINSTANCE.getIdentificationRule();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__ID = eINSTANCE.getIdentificationRule_Id();

		/**
		 * The meta object literal for the '<em><b>Timing Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__TIMING_KIND = eINSTANCE.getIdentificationRule_TimingKind();

		/**
		 * The meta object literal for the '<em><b>Component Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__COMPONENT_KIND = eINSTANCE.getIdentificationRule_ComponentKind();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_RULE__RULE = eINSTANCE.getIdentificationRule_Rule();

		/**
		 * The meta object literal for the '<em><b>Rule Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFICATION_RULE__RULE_CONTEXT = eINSTANCE.getIdentificationRule_RuleContext();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION_RULE__DESCRIPTION = eINSTANCE.getIdentificationRule_Description();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.ToolImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__ID = eINSTANCE.getTool_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__NAME = eINSTANCE.getTool_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__DESCRIPTION = eINSTANCE.getTool_Description();

		/**
		 * The meta object literal for the '<em><b>Mosart To Tool Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__MOSART_TO_TOOL_PATH = eINSTANCE.getTool_MosartToToolPath();

		/**
		 * The meta object literal for the '<em><b>Tool To Mosart Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TOOL_TO_MOSART_PATH = eINSTANCE.getTool_ToolToMosartPath();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.TestFamilyImpl <em>Test Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.TestFamilyImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTestFamily()
		 * @generated
		 */
		EClass TEST_FAMILY = eINSTANCE.getTestFamily();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FAMILY__NAME = eINSTANCE.getTestFamily_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FAMILY__DESCRIPTION = eINSTANCE.getTestFamily_Description();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FAMILY__REFERENCES = eINSTANCE.getTestFamily_References();

		/**
		 * The meta object literal for the '<em><b>Contained Tests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_FAMILY__CONTAINED_TESTS = eINSTANCE.getTestFamily_ContainedTests();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl <em>Generalization Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.GeneralizationRelationshipImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getGeneralizationRelationship()
		 * @generated
		 */
		EClass GENERALIZATION_RELATIONSHIP = eINSTANCE.getGeneralizationRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATIONSHIP__NAME = eINSTANCE.getGeneralizationRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATIONSHIP__DESCRIPTION = eINSTANCE.getGeneralizationRelationship_Description();

		/**
		 * The meta object literal for the '<em><b>Specific Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_RELATIONSHIP__SPECIFIC_MODEL = eINSTANCE.getGeneralizationRelationship_SpecificModel();

		/**
		 * The meta object literal for the '<em><b>Generic Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_RELATIONSHIP__GENERIC_MODEL = eINSTANCE.getGeneralizationRelationship_GenericModel();

		/**
		 * The meta object literal for the '<em><b>Behavior Kind</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATIONSHIP__BEHAVIOR_KIND = eINSTANCE.getGeneralizationRelationship_BehaviorKind();

		/**
		 * The meta object literal for the '<em><b>Generic To Specific Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATIONSHIP__GENERIC_TO_SPECIFIC_PATH = eINSTANCE.getGeneralizationRelationship_GenericToSpecificPath();

		/**
		 * The meta object literal for the '<em><b>Specific To Generic Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_RELATIONSHIP__SPECIFIC_TO_GENERIC_PATH = eINSTANCE.getGeneralizationRelationship_SpecificToGenericPath();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.ComponentKindType <em>Component Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.ComponentKindType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getComponentKindType()
		 * @generated
		 */
		EEnum COMPONENT_KIND_TYPE = eINSTANCE.getComponentKindType();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.BehaviorKindType <em>Behavior Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.BehaviorKindType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getBehaviorKindType()
		 * @generated
		 */
		EEnum BEHAVIOR_KIND_TYPE = eINSTANCE.getBehaviorKindType();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.EvaluationResultType <em>Evaluation Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.EvaluationResultType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getEvaluationResultType()
		 * @generated
		 */
		EEnum EVALUATION_RESULT_TYPE = eINSTANCE.getEvaluationResultType();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType <em>Test Characteristic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTestCharacteristicType()
		 * @generated
		 */
		EClass TEST_CHARACTERISTIC_TYPE = eINSTANCE.getTestCharacteristicType();

		/**
		 * The meta object literal for the '<em><b>Test Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CHARACTERISTIC_TYPE__TEST_VALUE = eINSTANCE.getTestCharacteristicType_TestValue();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CHARACTERISTIC_TYPE__COMMENT = eINSTANCE.getTestCharacteristicType_Comment();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CHARACTERISTIC_TYPE__CONTEXTS = eINSTANCE.getTestCharacteristicType_Contexts();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.SustainabilityType <em>Sustainability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.SustainabilityType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getSustainabilityType()
		 * @generated
		 */
		EClass SUSTAINABILITY_TYPE = eINSTANCE.getSustainabilityType();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.Deadline_SustainabilityImpl <em>Deadline Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.Deadline_SustainabilityImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getDeadline_Sustainability()
		 * @generated
		 */
		EClass DEADLINE_SUSTAINABILITY = eINSTANCE.getDeadline_Sustainability();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.Jitter_SustainabilityImpl <em>Jitter Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.Jitter_SustainabilityImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getJitter_Sustainability()
		 * @generated
		 */
		EClass JITTER_SUSTAINABILITY = eINSTANCE.getJitter_Sustainability();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl <em>Period Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.Period_SustainabilityImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getPeriod_Sustainability()
		 * @generated
		 */
		EClass PERIOD_SUSTAINABILITY = eINSTANCE.getPeriod_Sustainability();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.ExecutionTime_SustainabilityImpl <em>Execution Time Sustainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.ExecutionTime_SustainabilityImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getExecutionTime_Sustainability()
		 * @generated
		 */
		EClass EXECUTION_TIME_SUSTAINABILITY = eINSTANCE.getExecutionTime_Sustainability();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.FeasibilityType <em>Feasibility Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.FeasibilityType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getFeasibilityType()
		 * @generated
		 */
		EClass FEASIBILITY_TYPE = eINSTANCE.getFeasibilityType();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.SufficientConditionImpl <em>Sufficient Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.SufficientConditionImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getSufficientCondition()
		 * @generated
		 */
		EClass SUFFICIENT_CONDITION = eINSTANCE.getSufficientCondition();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.impl.NecessaryConditionImpl <em>Necessary Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.NecessaryConditionImpl
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getNecessaryCondition()
		 * @generated
		 */
		EClass NECESSARY_CONDITION = eINSTANCE.getNecessaryCondition();

		/**
		 * The meta object literal for the '{@link MoSaRTBackEnd_AnalysisRepository.TimingKindType <em>Timing Kind Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MoSaRTBackEnd_AnalysisRepository.TimingKindType
		 * @see MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryPackageImpl#getTimingKindType()
		 * @generated
		 */
		EEnum TIMING_KIND_TYPE = eINSTANCE.getTimingKindType();

	}

} //MoSaRTBackEnd_AnalysisRepositoryPackage
