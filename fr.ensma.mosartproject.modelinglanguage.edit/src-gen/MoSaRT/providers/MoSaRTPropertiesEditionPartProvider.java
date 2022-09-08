/**
 * Generated with Acceleo
 */
package MoSaRT.providers;

import MoSaRT.parts.MoSaRTViewsRepository;

import MoSaRT.parts.forms.GlobalSystemPropertiesEditionPartForm;

import MoSaRT.parts.impl.GlobalSystemPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class MoSaRTPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == MoSaRTViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == MoSaRTViewsRepository.GlobalSystem.class) {
			if (kind == MoSaRTViewsRepository.SWT_KIND)
				return new GlobalSystemPropertiesEditionPartImpl(component);
			if (kind == MoSaRTViewsRepository.FORM_KIND)
				return new GlobalSystemPropertiesEditionPartForm(component);
		}
		return null;
	}

}
