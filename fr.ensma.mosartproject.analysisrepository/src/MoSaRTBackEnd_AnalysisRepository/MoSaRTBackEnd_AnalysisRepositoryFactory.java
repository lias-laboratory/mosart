/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRTBackEnd_AnalysisRepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage
 * @generated
 */
public interface MoSaRTBackEnd_AnalysisRepositoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MoSaRTBackEnd_AnalysisRepositoryFactory eINSTANCE = MoSaRTBackEnd_AnalysisRepository.impl.MoSaRTBackEnd_AnalysisRepositoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Analysis Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Repository</em>'.
	 * @generated
	 */
	AnalysisRepository createAnalysisRepository();

	/**
	 * Returns a new object of class '<em>Context Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Model</em>'.
	 * @generated
	 */
	ContextModel createContextModel();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Identification Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identification Rule</em>'.
	 * @generated
	 */
	IdentificationRule createIdentificationRule();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>Test Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Family</em>'.
	 * @generated
	 */
	TestFamily createTestFamily();

	/**
	 * Returns a new object of class '<em>Generalization Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Relationship</em>'.
	 * @generated
	 */
	GeneralizationRelationship createGeneralizationRelationship();

	/**
	 * Returns a new object of class '<em>Deadline Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deadline Sustainability</em>'.
	 * @generated
	 */
	Deadline_Sustainability createDeadline_Sustainability();

	/**
	 * Returns a new object of class '<em>Jitter Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jitter Sustainability</em>'.
	 * @generated
	 */
	Jitter_Sustainability createJitter_Sustainability();

	/**
	 * Returns a new object of class '<em>Period Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period Sustainability</em>'.
	 * @generated
	 */
	Period_Sustainability createPeriod_Sustainability();

	/**
	 * Returns a new object of class '<em>Execution Time Sustainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Time Sustainability</em>'.
	 * @generated
	 */
	ExecutionTime_Sustainability createExecutionTime_Sustainability();

	/**
	 * Returns a new object of class '<em>Sufficient Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sufficient Condition</em>'.
	 * @generated
	 */
	SufficientCondition createSufficientCondition();

	/**
	 * Returns a new object of class '<em>Necessary Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Necessary Condition</em>'.
	 * @generated
	 */
	NecessaryCondition createNecessaryCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MoSaRTBackEnd_AnalysisRepositoryPackage getMoSaRTBackEnd_AnalysisRepositoryPackage();

} //MoSaRTBackEnd_AnalysisRepositoryFactory
