/**
 * Generated with Acceleo
 */
package MoSaRT.FunctionalElements.providers;

import MoSaRT.FunctionalElements.parts.FunctionalElementsViewsRepository;

import MoSaRT.FunctionalElements.parts.forms.SystemFunctionalSidePropertiesEditionPartForm;

import MoSaRT.FunctionalElements.parts.impl.SystemFunctionalSidePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class FunctionalElementsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == FunctionalElementsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == FunctionalElementsViewsRepository.SystemFunctionalSide.class) {
			if (kind == FunctionalElementsViewsRepository.SWT_KIND)
				return new SystemFunctionalSidePropertiesEditionPartImpl(component);
			if (kind == FunctionalElementsViewsRepository.FORM_KIND)
				return new SystemFunctionalSidePropertiesEditionPartForm(component);
		}
		return null;
	}

}
