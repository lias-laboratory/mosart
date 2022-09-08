/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryFactory;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

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
public class GeneralizationRelationshipPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for specificModel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings specificModelSettings;
	
	/**
	 * Settings for genericModel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings genericModelSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public GeneralizationRelationshipPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject generalizationRelationship, String editing_mode) {
		super(editingContext, generalizationRelationship, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.class;
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
			
			final GeneralizationRelationship generalizationRelationship = (GeneralizationRelationship)elt;
			final GeneralizationRelationshipPropertiesEditionPart basePart = (GeneralizationRelationshipPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, generalizationRelationship.getName()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, generalizationRelationship.getDescription()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel)) {
				// init part
				specificModelSettings = new EObjectFlatComboSettings(generalizationRelationship, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificModel());
				basePart.initSpecificModel(specificModelSettings);
				// set the button mode
				basePart.setSpecificModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel)) {
				// init part
				genericModelSettings = new EObjectFlatComboSettings(generalizationRelationship, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericModel());
				basePart.initGenericModel(genericModelSettings);
				// set the button mode
				basePart.setGenericModelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind))
				basePart.setBehaviorKind(generalizationRelationship.getBehaviorKind());
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram))
				basePart.setLocationOfGenericToSpecificModelTransformationProgram(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, generalizationRelationship.getGenericToSpecificPath()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram))
				basePart.setLocationOfSpecificToGenericModelTransformationProgram(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, generalizationRelationship.getSpecificToGenericPath()));
			
			// init filters
			
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel)) {
				basePart.addFilterToSpecificModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ContextModel);
					}
					
				});
				// Start of user code for additional businessfilters for specificModel
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel)) {
				basePart.addFilterToGenericModel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof ContextModel);
					}
					
				});
				// Start of user code for additional businessfilters for genericModel
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Name();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Description();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificModel();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericModel();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_BehaviorKind();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericToSpecificPath();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificToGenericPath();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GeneralizationRelationship generalizationRelationship = (GeneralizationRelationship)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name == event.getAffectedEditor()) {
			generalizationRelationship.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description == event.getAffectedEditor()) {
			generalizationRelationship.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				specificModelSettings.setToReference((ContextModel)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ContextModel eObject = MoSaRTBackEnd_AnalysisRepositoryFactory.eINSTANCE.createContextModel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				specificModelSettings.setToReference(eObject);
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				genericModelSettings.setToReference((ContextModel)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				ContextModel eObject = MoSaRTBackEnd_AnalysisRepositoryFactory.eINSTANCE.createContextModel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				genericModelSettings.setToReference(eObject);
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				generalizationRelationship.getBehaviorKind().clear();
				generalizationRelationship.getBehaviorKind().addAll(((EList) event.getNewValue()));
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram == event.getAffectedEditor()) {
			generalizationRelationship.setGenericToSpecificPath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram == event.getAffectedEditor()) {
			generalizationRelationship.setSpecificToGenericPath((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			GeneralizationRelationshipPropertiesEditionPart basePart = (GeneralizationRelationshipPropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificModel().equals(msg.getFeature()) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel))
				basePart.setSpecificModel((EObject)msg.getNewValue());
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericModel().equals(msg.getFeature()) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel))
				basePart.setGenericModel((EObject)msg.getNewValue());
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_BehaviorKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind)) {
				basePart.setBehaviorKind((EList<?>)msg.getNewValue());
			}
			
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericToSpecificPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram)) {
				if (msg.getNewValue() != null) {
					basePart.setLocationOfGenericToSpecificModelTransformationProgram(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLocationOfGenericToSpecificModelTransformationProgram("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificToGenericPath().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram)) {
				if (msg.getNewValue() != null) {
					basePart.setLocationOfSpecificToGenericModelTransformationProgram(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLocationOfSpecificToGenericModelTransformationProgram("");
				}
			}
			
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Name(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Description(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificModel(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericModel(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_BehaviorKind(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericToSpecificPath(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificToGenericPath()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel;
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Name().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_Description().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_BehaviorKind().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericToSpecificPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_GenericToSpecificPath().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificToGenericPath().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_SpecificToGenericPath().getEAttributeType(), newValue);
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
