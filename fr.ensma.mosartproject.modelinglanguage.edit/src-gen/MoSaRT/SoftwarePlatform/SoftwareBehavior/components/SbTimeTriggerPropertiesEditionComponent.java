/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTimeTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class SbTimeTriggerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for schedulingActivities ReferencesTable
	 */
	private ReferencesTableSettings schedulingActivitiesSettings;
	
	/**
	 * Settings for rtpReleaseTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpReleaseTimeSettings;
	
	/**
	 * Settings for rtpPeriodicity SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpPeriodicitySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SbTimeTriggerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sbTimeTrigger, String editing_mode) {
		super(editingContext, sbTimeTrigger, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.SbTimeTrigger.class;
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
			
			final SbTimeTrigger sbTimeTrigger = (SbTimeTrigger)elt;
			final SbTimeTriggerPropertiesEditionPart basePart = (SbTimeTriggerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, sbTimeTrigger.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities)) {
				schedulingActivitiesSettings = new ReferencesTableSettings(sbTimeTrigger, SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities());
				basePart.initSchedulingActivities(schedulingActivitiesSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime)) {
				// init part
				rtpReleaseTimeSettings = new EObjectFlatComboSettings(sbTimeTrigger, SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpReleaseTime());
				basePart.initRtpReleaseTime(rtpReleaseTimeSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity)) {
				// init part
				rtpPeriodicitySettings = new EObjectFlatComboSettings(sbTimeTrigger, SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpPeriodicity());
				basePart.initRtpPeriodicity(rtpPeriodicitySettings);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities)) {
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
		if (editorKey == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpReleaseTime();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpPeriodicity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SbTimeTrigger sbTimeTrigger = (SbTimeTrigger)semanticObject;
		if (SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name == event.getAffectedEditor()) {
			sbTimeTrigger.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities == event.getAffectedEditor()) {
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
		if (SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpReleaseTimeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpReleaseTimeSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpReleaseTimeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpReleaseTimeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpReleaseTimeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpReleaseTimeSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpPeriodicitySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpPeriodicitySettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpPeriodicitySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpPeriodicitySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpPeriodicitySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpPeriodicitySettings.setToReference(null);
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
			SbTimeTriggerPropertiesEditionPart basePart = (SbTimeTriggerPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities().equals(msg.getFeature())  && isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities))
				basePart.updateSchedulingActivities();
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpReleaseTime().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime))
				basePart.setRtpReleaseTime((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpPeriodicity().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity))
				basePart.setRtpPeriodicity((EObject)msg.getNewValue());
			
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
			SoftwareBehaviorPackage.eINSTANCE.getSbTrigger_SchedulingActivities(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpReleaseTime(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTimeTrigger_RtpPeriodicity()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name;
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
				if (SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name == event.getAffectedEditor()) {
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
