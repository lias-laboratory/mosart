/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.providers;

import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.parts.forms.AnalysisRepositoryPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.ContextModelPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.Deadline_SustainabilityPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.ExecutionTime_SustainabilityPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.GeneralizationRelationshipPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.IdentificationRulePropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.Jitter_SustainabilityPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.NecessaryConditionPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.Period_SustainabilityPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.SufficientConditionPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.TestFamilyPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.TestPropertiesEditionPartForm;
import MoSaRTBackEnd_AnalysisRepository.parts.forms.ToolPropertiesEditionPartForm;

import MoSaRTBackEnd_AnalysisRepository.parts.impl.AnalysisRepositoryPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.ContextModelPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.Deadline_SustainabilityPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.ExecutionTime_SustainabilityPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.GeneralizationRelationshipPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.IdentificationRulePropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.Jitter_SustainabilityPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.NecessaryConditionPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.Period_SustainabilityPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.SufficientConditionPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.TestFamilyPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.TestPropertiesEditionPartImpl;
import MoSaRTBackEnd_AnalysisRepository.parts.impl.ToolPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class MoSaRTBackEnd_AnalysisRepositoryPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new AnalysisRepositoryPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new AnalysisRepositoryPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new ContextModelPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new ContextModelPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new TestPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new TestPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new IdentificationRulePropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new IdentificationRulePropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new ToolPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new ToolPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new TestFamilyPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new TestFamilyPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new GeneralizationRelationshipPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new GeneralizationRelationshipPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new Deadline_SustainabilityPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new Deadline_SustainabilityPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new Jitter_SustainabilityPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new Jitter_SustainabilityPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Period_Sustainability.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new Period_SustainabilityPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new Period_SustainabilityPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new ExecutionTime_SustainabilityPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new ExecutionTime_SustainabilityPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SufficientCondition.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new SufficientConditionPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new SufficientConditionPropertiesEditionPartForm(component);
		}
		if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.NecessaryCondition.class) {
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND)
				return new NecessaryConditionPropertiesEditionPartImpl(component);
			if (kind == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND)
				return new NecessaryConditionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
