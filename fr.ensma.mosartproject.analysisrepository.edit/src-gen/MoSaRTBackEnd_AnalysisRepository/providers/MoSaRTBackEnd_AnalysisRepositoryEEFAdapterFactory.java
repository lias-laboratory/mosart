/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.providers;

import MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class MoSaRTBackEnd_AnalysisRepositoryEEFAdapterFactory extends MoSaRTBackEnd_AnalysisRepositoryAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createAnalysisRepositoryAdapter()
	 * 
	 */
	public Adapter createAnalysisRepositoryAdapter() {
		return new AnalysisRepositoryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createContextModelAdapter()
	 * 
	 */
	public Adapter createContextModelAdapter() {
		return new ContextModelPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createTestAdapter()
	 * 
	 */
	public Adapter createTestAdapter() {
		return new TestPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createIdentificationRuleAdapter()
	 * 
	 */
	public Adapter createIdentificationRuleAdapter() {
		return new IdentificationRulePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createToolAdapter()
	 * 
	 */
	public Adapter createToolAdapter() {
		return new ToolPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createTestFamilyAdapter()
	 * 
	 */
	public Adapter createTestFamilyAdapter() {
		return new TestFamilyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createGeneralizationRelationshipAdapter()
	 * 
	 */
	public Adapter createGeneralizationRelationshipAdapter() {
		return new GeneralizationRelationshipPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createDeadline_SustainabilityAdapter()
	 * 
	 */
	public Adapter createDeadline_SustainabilityAdapter() {
		return new Deadline_SustainabilityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createJitter_SustainabilityAdapter()
	 * 
	 */
	public Adapter createJitter_SustainabilityAdapter() {
		return new Jitter_SustainabilityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createPeriod_SustainabilityAdapter()
	 * 
	 */
	public Adapter createPeriod_SustainabilityAdapter() {
		return new Period_SustainabilityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createExecutionTime_SustainabilityAdapter()
	 * 
	 */
	public Adapter createExecutionTime_SustainabilityAdapter() {
		return new ExecutionTime_SustainabilityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createSufficientConditionAdapter()
	 * 
	 */
	public Adapter createSufficientConditionAdapter() {
		return new SufficientConditionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .MoSaRTBackEnd_AnalysisRepository.util.MoSaRTBackEnd_AnalysisRepositoryAdapterFactory#createNecessaryConditionAdapter()
	 * 
	 */
	public Adapter createNecessaryConditionAdapter() {
		return new NecessaryConditionPropertiesEditionProvider();
	}

}
