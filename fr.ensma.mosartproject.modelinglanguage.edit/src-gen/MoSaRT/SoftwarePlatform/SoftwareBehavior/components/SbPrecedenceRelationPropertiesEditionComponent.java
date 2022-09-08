/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart;
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
public class SbPrecedenceRelationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for targetSchedulingActivity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetSchedulingActivitySettings;
	
	/**
	 * Settings for sourceSchedulingActivity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceSchedulingActivitySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SbPrecedenceRelationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sbPrecedenceRelation, String editing_mode) {
		super(editingContext, sbPrecedenceRelation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.SbPrecedenceRelation.class;
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
			
			final SbPrecedenceRelation sbPrecedenceRelation = (SbPrecedenceRelation)elt;
			final SbPrecedenceRelationPropertiesEditionPart basePart = (SbPrecedenceRelationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, sbPrecedenceRelation.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity)) {
				// init part
				targetSchedulingActivitySettings = new EObjectFlatComboSettings(sbPrecedenceRelation, SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_TargetSchedulingActivity());
				basePart.initTargetSchedulingActivity(targetSchedulingActivitySettings);
				// set the button mode
				basePart.setTargetSchedulingActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity)) {
				// init part
				sourceSchedulingActivitySettings = new EObjectFlatComboSettings(sbPrecedenceRelation, SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_SourceSchedulingActivity());
				basePart.initSourceSchedulingActivity(sourceSchedulingActivitySettings);
				// set the button mode
				basePart.setSourceSchedulingActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity)) {
				basePart.addFilterToTargetSchedulingActivity(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SbSchedulingActivity);
					}
					
				});
				// Start of user code for additional businessfilters for targetSchedulingActivity
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity)) {
				basePart.addFilterToSourceSchedulingActivity(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SbSchedulingActivity);
					}
					
				});
				// Start of user code for additional businessfilters for sourceSchedulingActivity
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
		if (editorKey == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_TargetSchedulingActivity();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_SourceSchedulingActivity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SbPrecedenceRelation sbPrecedenceRelation = (SbPrecedenceRelation)semanticObject;
		if (SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name == event.getAffectedEditor()) {
			sbPrecedenceRelation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetSchedulingActivitySettings.setToReference((SbSchedulingActivity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, targetSchedulingActivitySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceSchedulingActivitySettings.setToReference((SbSchedulingActivity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, sourceSchedulingActivitySettings, editingContext.getAdapterFactory());
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
			SbPrecedenceRelationPropertiesEditionPart basePart = (SbPrecedenceRelationPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_TargetSchedulingActivity().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity))
				basePart.setTargetSchedulingActivity((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_SourceSchedulingActivity().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity))
				basePart.setSourceSchedulingActivity((EObject)msg.getNewValue());
			
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
			SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_Name(),
			SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_TargetSchedulingActivity(),
			SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_SourceSchedulingActivity()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name || key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity || key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity;
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
				if (SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareBehaviorPackage.eINSTANCE.getSbSequencingRelation_Name().getEAttributeType(), newValue);
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
