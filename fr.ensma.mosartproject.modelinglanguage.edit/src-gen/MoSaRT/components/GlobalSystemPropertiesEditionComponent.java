/**
 * Generated with Acceleo
 */
package MoSaRT.components;

// Start of user code for imports
import MoSaRT.GlobalSystem;
import MoSaRT.MoSaRTPackage;

import MoSaRT.parts.GlobalSystemPropertiesEditionPart;
import MoSaRT.parts.MoSaRTViewsRepository;

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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class GlobalSystemPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GlobalSystemPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject globalSystem, String editing_mode) {
		super(editingContext, globalSystem, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTViewsRepository.class;
		partKey = MoSaRTViewsRepository.GlobalSystem.class;
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
			
			final GlobalSystem globalSystem = (GlobalSystem)elt;
			final GlobalSystemPropertiesEditionPart basePart = (GlobalSystemPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTViewsRepository.GlobalSystem.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, globalSystem.getName()));
			
				if (isAccessible(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation)) {
					basePart.setAnalysisRepositoryLocation(EEFConverterUtil.convertToString(MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation().getEAttributeType(), globalSystem.getAnalysisRepositoryLocation()));
				}
			
			if (isAccessible(MoSaRTViewsRepository.GlobalSystem.Properties.comment))
				basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, globalSystem.getComment()));
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
		if (editorKey == MoSaRTViewsRepository.GlobalSystem.Properties.name) {
			return MoSaRTPackage.eINSTANCE.getGlobalSystem_Name();
		}
		if (editorKey == MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation) {
			return MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation();
		}
		if (editorKey == MoSaRTViewsRepository.GlobalSystem.Properties.comment) {
			return MoSaRTPackage.eINSTANCE.getGlobalSystem_Comment();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GlobalSystem globalSystem = (GlobalSystem)semanticObject;
		if (MoSaRTViewsRepository.GlobalSystem.Properties.name == event.getAffectedEditor()) {
			globalSystem.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation == event.getAffectedEditor()) {
			globalSystem.setAnalysisRepositoryLocation((String)event.getNewValue());
		}
		if (MoSaRTViewsRepository.GlobalSystem.Properties.comment == event.getAffectedEditor()) {
			globalSystem.setComment((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			GlobalSystemPropertiesEditionPart basePart = (GlobalSystemPropertiesEditionPart)editingPart;
			if (MoSaRTPackage.eINSTANCE.getGlobalSystem_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTViewsRepository.GlobalSystem.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation)) {
				if (msg.getNewValue() != null) {
					basePart.setAnalysisRepositoryLocation(EcoreUtil.convertToString(MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation().getEAttributeType(), msg.getNewValue()));
				} else {
					basePart.setAnalysisRepositoryLocation("");
				}
			}
			if (MoSaRTPackage.eINSTANCE.getGlobalSystem_Comment().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTViewsRepository.GlobalSystem.Properties.comment)){
				if (msg.getNewValue() != null) {
					basePart.setComment(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setComment("");
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
			MoSaRTPackage.eINSTANCE.getGlobalSystem_Name(),
			MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation(),
			MoSaRTPackage.eINSTANCE.getGlobalSystem_Comment()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTViewsRepository.GlobalSystem.Properties.name;
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
				if (MoSaRTViewsRepository.GlobalSystem.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTPackage.eINSTANCE.getGlobalSystem_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTPackage.eINSTANCE.getGlobalSystem_Name().getEAttributeType(), newValue);
				}
				if (MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTPackage.eINSTANCE.getGlobalSystem_AnalysisRepositoryLocation().getEAttributeType(), newValue);
				}
				if (MoSaRTViewsRepository.GlobalSystem.Properties.comment == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTPackage.eINSTANCE.getGlobalSystem_Comment().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTPackage.eINSTANCE.getGlobalSystem_Comment().getEAttributeType(), newValue);
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
