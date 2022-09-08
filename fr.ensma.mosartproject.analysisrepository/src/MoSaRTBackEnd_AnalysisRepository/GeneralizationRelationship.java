/**
 */
package MoSaRTBackEnd_AnalysisRepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificModel <em>Specific Model</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericModel <em>Generic Model</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getBehaviorKind <em>Behavior Kind</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericToSpecificPath <em>Generic To Specific Path</em>}</li>
 *   <li>{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificToGenericPath <em>Specific To Generic Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship()
 * @model
 * @generated
 */
public interface GeneralizationRelationship extends EObject {
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
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getName <em>Name</em>}' attribute.
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
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Specific Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Model</em>' reference.
	 * @see #setSpecificModel(ContextModel)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_SpecificModel()
	 * @model required="true"
	 * @generated
	 */
	ContextModel getSpecificModel();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificModel <em>Specific Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Model</em>' reference.
	 * @see #getSpecificModel()
	 * @generated
	 */
	void setSpecificModel(ContextModel value);

	/**
	 * Returns the value of the '<em><b>Generic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Model</em>' reference.
	 * @see #setGenericModel(ContextModel)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_GenericModel()
	 * @model required="true"
	 * @generated
	 */
	ContextModel getGenericModel();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericModel <em>Generic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Model</em>' reference.
	 * @see #getGenericModel()
	 * @generated
	 */
	void setGenericModel(ContextModel value);

	/**
	 * Returns the value of the '<em><b>Behavior Kind</b></em>' attribute list.
	 * The list contents are of type {@link MoSaRTBackEnd_AnalysisRepository.BehaviorKindType}.
	 * The literals are from the enumeration {@link MoSaRTBackEnd_AnalysisRepository.BehaviorKindType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior Kind</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Kind</em>' attribute list.
	 * @see MoSaRTBackEnd_AnalysisRepository.BehaviorKindType
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_BehaviorKind()
	 * @model default=""
	 * @generated
	 */
	EList<BehaviorKindType> getBehaviorKind();

	/**
	 * Returns the value of the '<em><b>Generic To Specific Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic To Specific Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic To Specific Path</em>' attribute.
	 * @see #setGenericToSpecificPath(String)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_GenericToSpecificPath()
	 * @model
	 * @generated
	 */
	String getGenericToSpecificPath();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getGenericToSpecificPath <em>Generic To Specific Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic To Specific Path</em>' attribute.
	 * @see #getGenericToSpecificPath()
	 * @generated
	 */
	void setGenericToSpecificPath(String value);

	/**
	 * Returns the value of the '<em><b>Specific To Generic Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific To Generic Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific To Generic Path</em>' attribute.
	 * @see #setSpecificToGenericPath(String)
	 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage#getGeneralizationRelationship_SpecificToGenericPath()
	 * @model
	 * @generated
	 */
	String getSpecificToGenericPath();

	/**
	 * Sets the value of the '{@link MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship#getSpecificToGenericPath <em>Specific To Generic Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific To Generic Path</em>' attribute.
	 * @see #getSpecificToGenericPath()
	 * @generated
	 */
	void setSpecificToGenericPath(String value);

} // GeneralizationRelationship
