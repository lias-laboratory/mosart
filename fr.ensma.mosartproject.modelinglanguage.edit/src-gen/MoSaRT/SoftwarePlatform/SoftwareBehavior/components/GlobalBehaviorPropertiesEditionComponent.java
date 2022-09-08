/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.GlobalBehavior;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

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
public class GlobalBehaviorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for rootTrigger EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings rootTriggerSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public GlobalBehaviorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject globalBehavior, String editing_mode) {
		super(editingContext, globalBehavior, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.GlobalBehavior.class;
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
			
			final GlobalBehavior globalBehavior = (GlobalBehavior)elt;
			final GlobalBehaviorPropertiesEditionPart basePart = (GlobalBehaviorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, globalBehavior.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger)) {
				// init part
				rootTriggerSettings = new EObjectFlatComboSettings(globalBehavior, SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_RootTrigger());
				basePart.initRootTrigger(rootTriggerSettings);
				// set the button mode
				basePart.setRootTriggerButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger)) {
				basePart.addFilterToRootTrigger(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbTrigger); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for rootTrigger
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
		if (editorKey == SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger) {
			return SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_RootTrigger();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GlobalBehavior globalBehavior = (GlobalBehavior)semanticObject;
		if (SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name == event.getAffectedEditor()) {
			globalBehavior.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				rootTriggerSettings.setToReference((SbTrigger)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rootTriggerSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
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
			GlobalBehaviorPropertiesEditionPart basePart = (GlobalBehaviorPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_RootTrigger().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger))
				basePart.setRootTrigger((EObject)msg.getNewValue());
			
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
			SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_Name(),
			SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_RootTrigger()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name;
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
				if (SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareBehaviorPackage.eINSTANCE.getGlobalBehavior_Name().getEAttributeType(), newValue);
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
