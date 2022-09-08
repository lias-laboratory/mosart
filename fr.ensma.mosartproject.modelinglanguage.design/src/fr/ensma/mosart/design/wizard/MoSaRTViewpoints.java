package fr.ensma.mosart.design.wizard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public class MoSaRTViewpoints {

	private ViewpointRegistry registry;

	public MoSaRTViewpoints(ViewpointRegistry registry) {
		this.registry = registry;
	}

	public Viewpoint global() {
		return registry.getViewpoint(URI.createURI("viewpoint:/fr.ensma.mosartproject.modelinglanguage.design/GlobalSystemViewPoint"));
	}

	public Viewpoint functional() {
		return registry.getViewpoint(URI.createURI("viewpoint:/fr.ensma.mosartproject.modelinglanguage.design/FunctionalViewPoint"));
	}

	public Viewpoint hardware() {
		return registry.getViewpoint(URI.createURI("viewpoint:/fr.ensma.mosartproject.modelinglanguage.design/HardwarePlatformViewPoint"));
	}

	public Viewpoint software() {
		return registry.getViewpoint(URI.createURI("viewpoint:/fr.ensma.mosartproject.modelinglanguage.design/SoftwarePlatformViewPoint"));
	}

	public static MoSaRTViewpoints fromViewpointRegistry() {
		return new MoSaRTViewpoints(ViewpointRegistry.getInstance());
	}
}

