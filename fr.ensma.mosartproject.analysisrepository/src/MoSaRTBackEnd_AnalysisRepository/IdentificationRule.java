/**
 */
package MoSaRTBackEnd_AnalysisRepository;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getId <em>Id</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getTimingKind <em>Timing Kind</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getComponentKind <em>Component Kind</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRule <em>Rule</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRuleContext <em>Rule Context</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule()
 * @model
 * @generated
 */
public interface IdentificationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timing Kind</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link MoSaRTBackEnd_AnalysisRepository.TimingKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Kind</em>' attribute.
	 * @see MoSaRTBackEnd_AnalysisRepository.TimingKindType
	 * @see #setTimingKind(TimingKindType)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule_TimingKind()
	 * @model default="" required="true"
	 * @generated
	 */
	TimingKindType getTimingKind();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getTimingKind <em>Timing Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Kind</em>' attribute.
	 * @see MoSaRTBackEnd_AnalysisRepository.TimingKindType
	 * @see #getTimingKind()
	 * @generated
	 */
	void setTimingKind(TimingKindType value);

	/**
	 * Returns the value of the '<em><b>Component Kind</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link MoSaRTBackEnd_AnalysisRepository.ComponentKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Kind</em>' attribute.
	 * @see MoSaRTBackEnd_AnalysisRepository.ComponentKindType
	 * @see #setComponentKind(ComponentKindType)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule_ComponentKind()
	 * @model default=""
	 * @generated
	 */
	ComponentKindType getComponentKind();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getComponentKind <em>Component Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Kind</em>' attribute.
	 * @see MoSaRTBackEnd_AnalysisRepository.ComponentKindType
	 * @see #getComponentKind()
	 * @generated
	 */
	void setComponentKind(ComponentKindType value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(Map.Entry)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule_Rule()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	Map.Entry<String, String> getRule();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Map.Entry<String, String> value);

	/**
	 * Returns the value of the '<em><b>Rule Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Context</em>' reference.
	 * @see #setRuleContext(EClass)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule_RuleContext()
	 * @model required="true"
	 * @generated
	 */
	EClass getRuleContext();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getRuleContext <em>Rule Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Context</em>' reference.
	 * @see #getRuleContext()
	 * @generated
	 */
	void setRuleContext(EClass value);

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
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getIdentificationRule_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.IdentificationRule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // IdentificationRule
