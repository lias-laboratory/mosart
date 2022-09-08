/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbExternalEventTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class SbExternalEventTriggerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for schedulingActivities ReferencesTable
	 */
	private ReferencesTableSettings schedulingActivitiesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SbExternalEventTriggerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sbExternalEventTrigger, String editing_mode) {
		super(editingContext, sbExternalEventTrigger, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.SbExternalEventTrigger.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final SbExternalEventTrigger sbExternalEventTrigger = (SbExternalEventTrigger)elt;
			final SbExternalEventTriggerPropertiesEditionPart basePart = (SbExternalEventTriggerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, sbExternalEventTrigger.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities)) {
				schedulingActivitiesSettings = new ReferencesTableSettings(sbExternalEventTrigger, SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities());
				basePart.initSchedulingActivities(schedulingActivitiesSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities)) {
				basePart.addFilterToSchedulingActivities(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSchedulingActivitiesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSchedulingActivities(new EObjectFilter(SoftwareBehaviorPackage.Literals.SB_SCHEDULING_ACTIVITY));
				// Start of user code for additional businessfilters for schedulingActivities
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SbExternalEventTrigger sbExternalEventTrigger = (SbExternalEventTrigger)semanticObject;
		if (SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name == event.getAffectedEditor()) {
			sbExternalEventTrigger.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SbSchedulingActivity) {
					schedulingActivitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				schedulingActivitiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				schedulingActivitiesSettings.move(event.getNewIndex(), (SbSchedulingActivity) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			SbExternalEventTriggerPropertiesEditionPart basePart = (SbExternalEventTriggerPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities().equals(msg.getFeature())  && isAccessible(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities))
				basePart.updateSchedulingActivities();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

}
