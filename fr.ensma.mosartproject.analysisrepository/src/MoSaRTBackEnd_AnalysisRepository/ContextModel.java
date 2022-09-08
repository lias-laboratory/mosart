/**
 */
package MoSaRTBackEnd_AnalysisRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getReferences <em>References</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getTrueValueRules <em>True Value Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getFalseValueRules <em>False Value Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getUndefinedValueRules <em>Undefined Value Rules</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getAnalysisTests <em>Analysis Tests</em>}</li>
 * </ul>
 * </p>
 *
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject {
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
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getName <em>Name</em>}' attribute.
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
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.ContextModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_References()
	 * @model
	 * @generated
	 */
	EList<String> getReferences();

	/**
	 * Returns the value of the '<em><b>True Value Rules</b></em>' reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Value Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Value Rules</em>' reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_TrueValueRules()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getTrueValueRules();

	/**
	 * Returns the value of the '<em><b>False Value Rules</b></em>' reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Value Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Value Rules</em>' reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_FalseValueRules()
	 * @model
	 * @generated
	 */
	EList<IdentificationRule> getFalseValueRules();

	/**
	 * Returns the value of the '<em><b>Undefined Value Rules</b></em>' reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Undefined Value Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Undefined Value Rules</em>' reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_UndefinedValueRules()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='RuleToBeChecked.allInstances()->asOrderedSet()->excludesAll(self.trueValueRules->union(self.falseValueRules))'"
	 * @generated
	 */
	EList<IdentificationRule> getUndefinedValueRules();

	/**
	 * Returns the value of the '<em><b>Analysis Tests</b></em>' reference list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.Test}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Tests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Tests</em>' reference list.
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getContextModel_AnalysisTests()
	 * @model
	 * @generated
	 */
	EList<Test> getAnalysisTests();

} // ContextModel
