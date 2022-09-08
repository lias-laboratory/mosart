/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.providers;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.RtpComputationAndAnalysisFunctionsViewsRepository;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.forms.WeibullComputationFunctionPropertiesEditionPartForm;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.impl.WeibullComputationFunctionPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class RtpComputationAndAnalysisFunctionsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RtpComputationAndAnalysisFunctionsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.class) {
			if (kind == RtpComputationAndAnalysisFunctionsViewsRepository.SWT_KIND)
				return new WeibullComputationFunctionPropertiesEditionPartImpl(component);
			if (kind == RtpComputationAndAnalysisFunctionsViewsRepository.FORM_KIND)
				return new WeibullComputationFunctionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
