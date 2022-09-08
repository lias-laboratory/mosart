/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.providers;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SoLocalCommResourcePropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SoMutualExclusionResourcePropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SoRemoteCommResourcePropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SoSchedulableTaskPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SoSpaceProcessPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SoTransmittedDataPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms.SystemSoftwareSidePropertiesEditionPartForm;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SoLocalCommResourcePropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SoMutualExclusionResourcePropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SoRemoteCommResourcePropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SoSchedulableTaskPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SoSpaceProcessPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SoTransmittedDataPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl.SystemSoftwareSidePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class SoftwareOperatorsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == SoftwareOperatorsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SystemSoftwareSidePropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SystemSoftwareSidePropertiesEditionPartForm(component);
		}
		if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SoSchedulableTaskPropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SoSchedulableTaskPropertiesEditionPartForm(component);
		}
		if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SoSpaceProcessPropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SoSpaceProcessPropertiesEditionPartForm(component);
		}
		if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SoMutualExclusionResourcePropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SoMutualExclusionResourcePropertiesEditionPartForm(component);
		}
		if (key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SoRemoteCommResourcePropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SoRemoteCommResourcePropertiesEditionPartForm(component);
		}
		if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SoLocalCommResourcePropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SoLocalCommResourcePropertiesEditionPartForm(component);
		}
		if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.class) {
			if (kind == SoftwareOperatorsViewsRepository.SWT_KIND)
				return new SoTransmittedDataPropertiesEditionPartImpl(component);
			if (kind == SoftwareOperatorsViewsRepository.FORM_KIND)
				return new SoTransmittedDataPropertiesEditionPartForm(component);
		}
		return null;
	}

}
