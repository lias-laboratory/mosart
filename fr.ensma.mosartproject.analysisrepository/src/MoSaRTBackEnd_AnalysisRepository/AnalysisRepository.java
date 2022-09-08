/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllGeneralizationRelationships <em>All Generalization Relationships</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllContextModels <em>All Context Models</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllRules <em>All Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTests <em>All Tests</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTools <em>All Tools</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getAllTestFamilies <em>All Test Families</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getMosartMetamodel <em>Mosart Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository()
 * @model
 * @generated
 */
public interface AnalysisRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>All Generalization Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Generalization Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Generalization Relationships</em>' containment reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_AllGeneralizationRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneralizationRelationship> getAllGeneralizationRelationships();

	/**
	 * Returns the value of the '<em><b>All Context Models</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.ContextModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Context Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Context Models</em>' containment reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_AllContextModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextModel> getAllContextModels();

	/**
	 * Returns the value of the '<em><b>All Rules</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Rules</em>' containment reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_AllRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<IdentificationRule> getAllRules();

	/**
	 * Returns the value of the '<em><b>All Tests</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tests</em>' containment reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_AllTests()
	 * @model containment="true"
	 * @generated
	 */
	EList<Test> getAllTests();

	/**
	 * Returns the value of the '<em><b>All Tools</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.Tool}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Tools</em>' containment reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_AllTools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getAllTools();

	/**
	 * Returns the value of the '<em><b>All Test Families</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.TestFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Test Families</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Test Families</em>' containment reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_AllTestFamilies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestFamily> getAllTestFamilies();

	/**
	 * Returns the value of the '<em><b>Mosart Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mosart Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mosart Metamodel</em>' reference.
	 * @see #setMosartMetamodel(EPackage)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getAnalysisRepository_MosartMetamodel()
	 * @model required="true"
	 * @generated
	 */
	EPackage getMosartMetamodel();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.AnalysisRepository#getMosartMetamodel <em>Mosart Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mosart Metamodel</em>' reference.
	 * @see #getMosartMetamodel()
	 * @generated
	 */
	void setMosartMetamodel(EPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	List<ContextModel> appropriateModelsFinder(Map<IdentificationRule, EvaluationResultType> map);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Map<IdentificationRule, EvaluationResultType> identificationRuleChecker(EObject root);

} // AnalysisRepository
