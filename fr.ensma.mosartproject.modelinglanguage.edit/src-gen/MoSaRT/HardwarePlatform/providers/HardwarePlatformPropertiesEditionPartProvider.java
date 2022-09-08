/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.providers;

import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;

import MoSaRT.HardwarePlatform.parts.forms.HpCommunicationChannelPropertiesEditionPartForm;
import MoSaRT.HardwarePlatform.parts.forms.HpCommunicationRouterPropertiesEditionPartForm;
import MoSaRT.HardwarePlatform.parts.forms.HpNetworkPortPropertiesEditionPartForm;
import MoSaRT.HardwarePlatform.parts.forms.HpProcessingUnitPropertiesEditionPartForm;
import MoSaRT.HardwarePlatform.parts.forms.HpProcessorInterconnectorPropertiesEditionPartForm;
import MoSaRT.HardwarePlatform.parts.forms.SystemHardwareSidePropertiesEditionPartForm;

import MoSaRT.HardwarePlatform.parts.impl.HpCommunicationChannelPropertiesEditionPartImpl;
import MoSaRT.HardwarePlatform.parts.impl.HpCommunicationRouterPropertiesEditionPartImpl;
import MoSaRT.HardwarePlatform.parts.impl.HpNetworkPortPropertiesEditionPartImpl;
import MoSaRT.HardwarePlatform.parts.impl.HpProcessingUnitPropertiesEditionPartImpl;
import MoSaRT.HardwarePlatform.parts.impl.HpProcessorInterconnectorPropertiesEditionPartImpl;
import MoSaRT.HardwarePlatform.parts.impl.SystemHardwareSidePropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class HardwarePlatformPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == HardwarePlatformViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == HardwarePlatformViewsRepository.SystemHardwareSide.class) {
			if (kind == HardwarePlatformViewsRepository.SWT_KIND)
				return new SystemHardwareSidePropertiesEditionPartImpl(component);
			if (kind == HardwarePlatformViewsRepository.FORM_KIND)
				return new SystemHardwareSidePropertiesEditionPartForm(component);
		}
		if (key == HardwarePlatformViewsRepository.HpProcessingUnit.class) {
			if (kind == HardwarePlatformViewsRepository.SWT_KIND)
				return new HpProcessingUnitPropertiesEditionPartImpl(component);
			if (kind == HardwarePlatformViewsRepository.FORM_KIND)
				return new HpProcessingUnitPropertiesEditionPartForm(component);
		}
		if (key == HardwarePlatformViewsRepository.HpCommunicationRouter.class) {
			if (kind == HardwarePlatformViewsRepository.SWT_KIND)
				return new HpCommunicationRouterPropertiesEditionPartImpl(component);
			if (kind == HardwarePlatformViewsRepository.FORM_KIND)
				return new HpCommunicationRouterPropertiesEditionPartForm(component);
		}
		if (key == HardwarePlatformViewsRepository.HpNetworkPort.class) {
			if (kind == HardwarePlatformViewsRepository.SWT_KIND)
				return new HpNetworkPortPropertiesEditionPartImpl(component);
			if (kind == HardwarePlatformViewsRepository.FORM_KIND)
				return new HpNetworkPortPropertiesEditionPartForm(component);
		}
		if (key == HardwarePlatformViewsRepository.HpCommunicationChannel.class) {
			if (kind == HardwarePlatformViewsRepository.SWT_KIND)
				return new HpCommunicationChannelPropertiesEditionPartImpl(component);
			if (kind == HardwarePlatformViewsRepository.FORM_KIND)
				return new HpCommunicationChannelPropertiesEditionPartForm(component);
		}
		if (key == HardwarePlatformViewsRepository.HpProcessorInterconnector.class) {
			if (kind == HardwarePlatformViewsRepository.SWT_KIND)
				return new HpProcessorInterconnectorPropertiesEditionPartImpl(component);
			if (kind == HardwarePlatformViewsRepository.FORM_KIND)
				return new HpProcessorInterconnectorPropertiesEditionPartForm(component);
		}
		return null;
	}

}
