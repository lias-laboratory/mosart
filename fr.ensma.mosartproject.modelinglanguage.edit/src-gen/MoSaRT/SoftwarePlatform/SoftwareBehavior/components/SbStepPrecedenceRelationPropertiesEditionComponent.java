/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart;
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
public class SbStepPrecedenceRelationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for sourceStep EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceStepSettings;
	
	/**
	 * Settings for targetStep EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetStepSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SbStepPrecedenceRelationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sbStepPrecedenceRelation, String editing_mode) {
		super(editingContext, sbStepPrecedenceRelation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.class;
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
			
			final SbStepPrecedenceRelation sbStepPrecedenceRelation = (SbStepPrecedenceRelation)elt;
			final SbStepPrecedenceRelationPropertiesEditionPart basePart = (SbStepPrecedenceRelationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, sbStepPrecedenceRelation.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep)) {
				// init part
				sourceStepSettings = new EObjectFlatComboSettings(sbStepPrecedenceRelation, SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_SourceStep());
				basePart.initSourceStep(sourceStepSettings);
				// set the button mode
				basePart.setSourceStepButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep)) {
				// init part
				targetStepSettings = new EObjectFlatComboSettings(sbStepPrecedenceRelation, SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_TargetStep());
				basePart.initTargetStep(targetStepSettings);
				// set the button mode
				basePart.setTargetStepButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep)) {
				basePart.addFilterToSourceStep(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbStep); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for sourceStep
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep)) {
				basePart.addFilterToTargetStep(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbStep); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for targetStep
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
		if (editorKey == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_SourceStep();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_TargetStep();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SbStepPrecedenceRelation sbStepPrecedenceRelation = (SbStepPrecedenceRelation)semanticObject;
		if (SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name == event.getAffectedEditor()) {
			sbStepPrecedenceRelation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceStepSettings.setToReference((SbStep)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, sourceStepSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetStepSettings.setToReference((SbStep)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, targetStepSettings, editingContext.getAdapterFactory());
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
			SbStepPrecedenceRelationPropertiesEditionPart basePart = (SbStepPrecedenceRelationPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_SourceStep().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep))
				basePart.setSourceStep((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_TargetStep().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep))
				basePart.setTargetStep((EObject)msg.getNewValue());
			
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
			SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_Name(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_SourceStep(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_TargetStep()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name;
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
				if (SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareBehaviorPackage.eINSTANCE.getSbStepPrecedenceRelation_Name().getEAttributeType(), newValue);
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
