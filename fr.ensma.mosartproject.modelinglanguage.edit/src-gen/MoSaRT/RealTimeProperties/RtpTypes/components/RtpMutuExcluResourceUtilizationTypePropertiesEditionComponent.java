/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class RtpMutuExcluResourceUtilizationTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for resource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings resourceSettings;
	
	/**
	 * Settings for timeUtilization SingleCompositionEditor
	 */
	private EObjectFlatComboSettings timeUtilizationSettings;
	
	/**
	 * Settings for specialAccessPriority SingleCompositionEditor
	 */
	private EObjectFlatComboSettings specialAccessPrioritySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpMutuExcluResourceUtilizationTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpMutuExcluResourceUtilizationType, String editing_mode) {
		super(editingContext, rtpMutuExcluResourceUtilizationType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpTypesViewsRepository.class;
		partKey = RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.class;
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
			
			final RtpMutuExcluResourceUtilizationType rtpMutuExcluResourceUtilizationType = (RtpMutuExcluResourceUtilizationType)elt;
			final RtpMutuExcluResourceUtilizationTypePropertiesEditionPart basePart = (RtpMutuExcluResourceUtilizationTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource)) {
				// init part
				resourceSettings = new EObjectFlatComboSettings(rtpMutuExcluResourceUtilizationType, RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_Resource());
				basePart.initResource(resourceSettings);
				// set the button mode
				basePart.setResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization)) {
				// init part
				timeUtilizationSettings = new EObjectFlatComboSettings(rtpMutuExcluResourceUtilizationType, RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_TimeUtilization());
				basePart.initTimeUtilization(timeUtilizationSettings);
			}
			if (isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority)) {
				// init part
				specialAccessPrioritySettings = new EObjectFlatComboSettings(rtpMutuExcluResourceUtilizationType, RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority());
				basePart.initSpecialAccessPriority(specialAccessPrioritySettings);
			}
			// init filters
			if (isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource)) {
				basePart.addFilterToResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SoInteractionResource);
					}
					
				});
				// Start of user code for additional businessfilters for resource
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
		if (editorKey == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource) {
			return RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_Resource();
		}
		if (editorKey == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization) {
			return RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_TimeUtilization();
		}
		if (editorKey == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority) {
			return RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpMutuExcluResourceUtilizationType rtpMutuExcluResourceUtilizationType = (RtpMutuExcluResourceUtilizationType)semanticObject;
		if (RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resourceSettings.setToReference((SoInteractionResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourceSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (timeUtilizationSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, timeUtilizationSettings, editingContext.getAdapterFactory());
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
						timeUtilizationSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) timeUtilizationSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(timeUtilizationSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				timeUtilizationSettings.setToReference(null);
			}
			
		}
		if (RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (specialAccessPrioritySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, specialAccessPrioritySettings, editingContext.getAdapterFactory());
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
						specialAccessPrioritySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) specialAccessPrioritySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(specialAccessPrioritySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				specialAccessPrioritySettings.setToReference(null);
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
			RtpMutuExcluResourceUtilizationTypePropertiesEditionPart basePart = (RtpMutuExcluResourceUtilizationTypePropertiesEditionPart)editingPart;
			if (RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_Resource().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource))
				basePart.setResource((EObject)msg.getNewValue());
			if (RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_TimeUtilization().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization))
				basePart.setTimeUtilization((EObject)msg.getNewValue());
			if (RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority))
				basePart.setSpecialAccessPriority((EObject)msg.getNewValue());
			
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
			RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_Resource(),
			RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_TimeUtilization(),
			RtpTypesPackage.eINSTANCE.getRtpMutuExcluResourceUtilizationType_SpecialAccessPriority()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource || key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization;
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

}
