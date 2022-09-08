/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;

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
public class SoMutualExclusionResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for tasks ReferencesTable
	 */
	private ReferencesTableSettings tasksSettings;
	
	/**
	 * Settings for rtpProtectProtocol SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpProtectProtocolSettings;
	
	/**
	 * Settings for rtpWaitingQueuePolicy SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpWaitingQueuePolicySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoMutualExclusionResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject soMutualExclusionResource, String editing_mode) {
		super(editingContext, soMutualExclusionResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SoMutualExclusionResource.class;
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
			
			final SoMutualExclusionResource soMutualExclusionResource = (SoMutualExclusionResource)elt;
			final SoMutualExclusionResourcePropertiesEditionPart basePart = (SoMutualExclusionResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, soMutualExclusionResource.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks)) {
				tasksSettings = new ReferencesTableSettings(soMutualExclusionResource, SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Tasks());
				basePart.initTasks(tasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol)) {
				// init part
				rtpProtectProtocolSettings = new EObjectFlatComboSettings(soMutualExclusionResource, SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpProtectProtocol());
				basePart.initRtpProtectProtocol(rtpProtectProtocolSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy)) {
				// init part
				rtpWaitingQueuePolicySettings = new EObjectFlatComboSettings(soMutualExclusionResource, SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpWaitingQueuePolicy());
				basePart.initRtpWaitingQueuePolicy(rtpWaitingQueuePolicySettings);
			}
			// init filters
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks)) {
				basePart.addFilterToTasks(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInTasksTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToTasks(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK));
				// Start of user code for additional businessfilters for tasks
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
		if (editorKey == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Tasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpProtectProtocol();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpWaitingQueuePolicy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoMutualExclusionResource soMutualExclusionResource = (SoMutualExclusionResource)semanticObject;
		if (SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name == event.getAffectedEditor()) {
			soMutualExclusionResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSchedulableTask) {
					tasksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				tasksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				tasksSettings.move(event.getNewIndex(), (SoSchedulableTask) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpProtectProtocolSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpProtectProtocolSettings, editingContext.getAdapterFactory());
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
						rtpProtectProtocolSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpProtectProtocolSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpProtectProtocolSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpProtectProtocolSettings.setToReference(null);
			}
			
		}
		if (SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpWaitingQueuePolicySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpWaitingQueuePolicySettings, editingContext.getAdapterFactory());
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
						rtpWaitingQueuePolicySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpWaitingQueuePolicySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpWaitingQueuePolicySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpWaitingQueuePolicySettings.setToReference(null);
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
			SoMutualExclusionResourcePropertiesEditionPart basePart = (SoMutualExclusionResourcePropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Tasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks))
				basePart.updateTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpProtectProtocol().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol))
				basePart.setRtpProtectProtocol((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpWaitingQueuePolicy().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy))
				basePart.setRtpWaitingQueuePolicy((EObject)msg.getNewValue());
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Tasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpProtectProtocol(),
			SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_RtpWaitingQueuePolicy()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name || key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks || key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol || key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy;
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
				if (SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSoMutualExclusionResource_Name().getEAttributeType(), newValue);
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
