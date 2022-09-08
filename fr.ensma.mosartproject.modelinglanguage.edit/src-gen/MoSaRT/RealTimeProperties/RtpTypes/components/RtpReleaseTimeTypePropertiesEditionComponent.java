/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.RtpReleaseTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart;
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
public class RtpReleaseTimeTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for releaseTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings releaseTimeSettings;
	
	/**
	 * Settings for referring SingleCompositionEditor
	 */
	private EObjectFlatComboSettings referringSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpReleaseTimeTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpReleaseTimeType, String editing_mode) {
		super(editingContext, rtpReleaseTimeType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpTypesViewsRepository.class;
		partKey = RtpTypesViewsRepository.RtpReleaseTimeType.class;
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
			
			final RtpReleaseTimeType rtpReleaseTimeType = (RtpReleaseTimeType)elt;
			final RtpReleaseTimeTypePropertiesEditionPart basePart = (RtpReleaseTimeTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime)) {
				// init part
				releaseTimeSettings = new EObjectFlatComboSettings(rtpReleaseTimeType, RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_ReleaseTime());
				basePart.initReleaseTime(releaseTimeSettings);
			}
			if (isAccessible(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring)) {
				// init part
				referringSettings = new EObjectFlatComboSettings(rtpReleaseTimeType, RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_Referring());
				basePart.initReferring(referringSettings);
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
		if (editorKey == RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime) {
			return RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_ReleaseTime();
		}
		if (editorKey == RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring) {
			return RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_Referring();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpReleaseTimeType rtpReleaseTimeType = (RtpReleaseTimeType)semanticObject;
		if (RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (releaseTimeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, releaseTimeSettings, editingContext.getAdapterFactory());
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
						releaseTimeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) releaseTimeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(releaseTimeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				releaseTimeSettings.setToReference(null);
			}
			
		}
		if (RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (referringSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, referringSettings, editingContext.getAdapterFactory());
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
						referringSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) referringSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(referringSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				referringSettings.setToReference(null);
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
			RtpReleaseTimeTypePropertiesEditionPart basePart = (RtpReleaseTimeTypePropertiesEditionPart)editingPart;
			if (RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_ReleaseTime().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime))
				basePart.setReleaseTime((EObject)msg.getNewValue());
			if (RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_Referring().equals(msg.getFeature()) && basePart != null && isAccessible(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring))
				basePart.setReferring((EObject)msg.getNewValue());
			
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
			RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_ReleaseTime(),
			RtpTypesPackage.eINSTANCE.getRtpReleaseTimeType_Referring()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime;
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
