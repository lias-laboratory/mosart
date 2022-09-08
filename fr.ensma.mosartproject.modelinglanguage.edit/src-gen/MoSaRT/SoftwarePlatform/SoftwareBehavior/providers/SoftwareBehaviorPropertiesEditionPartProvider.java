/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.providers;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.GlobalBehaviorPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbAcquireStepPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbActionStepPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbCommunicationRelationPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbExternalEventTriggerPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbPrecedenceRelationPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbReadStepPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbReceiveStepPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbReleaseStepPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbSendStepPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbStepPrecedenceRelationPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbTaskActivityPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbTimeTriggerPropertiesEditionPartForm;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms.SbWriteStepPropertiesEditionPartForm;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.GlobalBehaviorPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbAcquireStepPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbActionStepPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbCommunicationRelationPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbExternalEventTriggerPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbPrecedenceRelationPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbReadStepPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbReceiveStepPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbReleaseStepPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbSendStepPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbStepPrecedenceRelationPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbTaskActivityPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbTimeTriggerPropertiesEditionPartImpl;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl.SbWriteStepPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class SoftwareBehaviorPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == SoftwareBehaviorViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == SoftwareBehaviorViewsRepository.GlobalBehavior.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new GlobalBehaviorPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new GlobalBehaviorPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbTimeTriggerPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbTimeTriggerPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbExternalEventTriggerPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbExternalEventTriggerPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbTaskActivityPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbTaskActivityPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbPrecedenceRelationPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbPrecedenceRelationPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbCommunicationRelation.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbCommunicationRelationPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbCommunicationRelationPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbAcquireStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbAcquireStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbAcquireStepPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbSendStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbSendStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbSendStepPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbReceiveStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbReceiveStepPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbWriteStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbWriteStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbWriteStepPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbReleaseStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbReleaseStepPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbReadStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbReadStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbReadStepPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbStepPrecedenceRelationPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbStepPrecedenceRelationPropertiesEditionPartForm(component);
		}
		if (key == SoftwareBehaviorViewsRepository.SbActionStep.class) {
			if (kind == SoftwareBehaviorViewsRepository.SWT_KIND)
				return new SbActionStepPropertiesEditionPartImpl(component);
			if (kind == SoftwareBehaviorViewsRepository.FORM_KIND)
				return new SbActionStepPropertiesEditionPartForm(component);
		}
		return null;
	}

}
