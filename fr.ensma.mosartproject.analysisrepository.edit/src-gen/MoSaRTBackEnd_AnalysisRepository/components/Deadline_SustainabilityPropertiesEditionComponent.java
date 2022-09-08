/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.Deadline_Sustainability;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import MoSaRTBackEnd_AnalysisRepository.parts.Deadline_SustainabilityPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

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
public class Deadline_SustainabilityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for contexts ReferencesTable
	 */
	private ReferencesTableSettings contextsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public Deadline_SustainabilityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject deadline_Sustainability, String editing_mode) {
		super(editingContext, deadline_Sustainability, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.class;
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
			
			final Deadline_Sustainability deadline_Sustainability = (Deadline_Sustainability)elt;
			final Deadline_SustainabilityPropertiesEditionPart basePart = (Deadline_SustainabilityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.comment))
				basePart.setComment(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, deadline_Sustainability.getComment()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.contexts)) {
				contextsSettings = new ReferencesTableSettings(deadline_Sustainability, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Contexts());
				basePart.initContexts(contextsSettings);
			}
			// init filters
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.contexts)) {
				basePart.addFilterToContexts(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInContextsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToContexts(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.CONTEXT_MODEL));
				// Start of user code for additional businessfilters for contexts
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.comment) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Comment();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.contexts) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Contexts();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Deadline_Sustainability deadline_Sustainability = (Deadline_Sustainability)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.comment == event.getAffectedEditor()) {
			deadline_Sustainability.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.contexts == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ContextModel) {
					contextsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				contextsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				contextsSettings.move(event.getNewIndex(), (ContextModel) event.getNewValue());
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
			Deadline_SustainabilityPropertiesEditionPart basePart = (Deadline_SustainabilityPropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.comment)) {
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Contexts().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.contexts))
				basePart.updateContexts();
			
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Comment(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Contexts()		);
		return new NotificationFilter[] {filter,};
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Deadline_Sustainability.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestCharacteristicType_Comment().getEAttributeType(), newValue);
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
