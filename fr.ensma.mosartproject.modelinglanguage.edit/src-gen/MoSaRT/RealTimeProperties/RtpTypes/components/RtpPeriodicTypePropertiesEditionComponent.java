/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.RtpPeriodicType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

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

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public class RtpPeriodicTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for period SingleCompositionEditor
	 */
	private EObjectFlatComboSettings periodSettings;
	
	/**
	 * Settings for jitter SingleCompositionEditor
	 */
	private EObjectFlatComboSettings jitterSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpPeriodicTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpPeriodicType, String editing_mode) {
		super(editingContext, rtpPeriodicType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpTypesViewsRepository.class;
		partKey = RtpTypesViewsRepository.RtpPeriodicType.class;
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
			
			final RtpPeriodicType rtpPeriodicType = (RtpPeriodicType)elt;
			final RtpPeriodicTypePropertiesEditionPart basePart = (RtpPeriodicTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpTypesViewsRepository.RtpPeriodicType.Properties.period)) {
				// init part
				periodSettings = new EObjectFlatComboSettings(rtpPeriodicType, RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Period());
				basePart.initPeriod(periodSettings);
			}
			if (isAccessible(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter)) {
				// init part
				jitterSettings = new EObjectFlatComboSettings(rtpPeriodicType, RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Jitter());
				basePart.initJitter(jitterSettings);
			}
			// init filters
			
			
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
		if (editorKey == RtpTypesViewsRepository.RtpPeriodicType.Properties.period) {
			return RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Period();
		}
		if (editorKey == RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter) {
			return RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Jitter();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpPeriodicType rtpPeriodicType = (RtpPeriodicType)semanticObject;
		if (RtpTypesViewsRepository.RtpPeriodicType.Properties.period == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (periodSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, periodSettings, editingContext.getAdapterFactory());
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
						periodSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) periodSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(periodSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				periodSettings.setToReference(null);
			}
			
		}
		if (RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (jitterSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, jitterSettings, editingContext.getAdapterFactory());
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
						jitterSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) jitterSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(jitterSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				jitterSettings.setToReference(null);
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
			RtpPeriodicTypePropertiesEditionPart basePart = (RtpPeriodicTypePropertiesEditionPart)editingPart;
			if (RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Period().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpPeriodicType.Properties.period))
				basePart.setPeriod((EObject)msg.getNewValue());
			if (RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Jitter().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter))
				basePart.setJitter((EObject)msg.getNewValue());
			
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
			RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Period(),
			RtpTypesPackage.eINSTANCE.getRtpPeriodicType_Jitter()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpTypesViewsRepository.RtpPeriodicType.Properties.period;
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
