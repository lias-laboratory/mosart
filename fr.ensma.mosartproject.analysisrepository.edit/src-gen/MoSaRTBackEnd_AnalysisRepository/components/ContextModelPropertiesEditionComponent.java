/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.Test;

import MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart;
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
public class ContextModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for trueValueRules ReferencesTable
	 */
	private ReferencesTableSettings trueValueRulesSettings;
	
	/**
	 * Settings for falseValueRules ReferencesTable
	 */
	private ReferencesTableSettings falseValueRulesSettings;
	
	/**
	 * Settings for undefinedValueRules ReferencesTable
	 */
	private ReferencesTableSettings undefinedValueRulesSettings;
	
	/**
	 * Settings for analysisTests ReferencesTable
	 */
	private ReferencesTableSettings analysisTestsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ContextModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject contextModel, String editing_mode) {
		super(editingContext, contextModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.class;
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
			
			final ContextModel contextModel = (ContextModel)elt;
			final ContextModelPropertiesEditionPart basePart = (ContextModelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, contextModel.getName()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, contextModel.getDescription()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references))
				basePart.setReferences(contextModel.getReferences());
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation)) {
				trueValueRulesSettings = new ReferencesTableSettings(contextModel, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_TrueValueRules());
				basePart.initTrueEvaluation(trueValueRulesSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation)) {
				falseValueRulesSettings = new ReferencesTableSettings(contextModel, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_FalseValueRules());
				basePart.initFalseEvaluation(falseValueRulesSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation)) {
				undefinedValueRulesSettings = new ReferencesTableSettings(contextModel, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_UndefinedValueRules());
				basePart.initUndefinedEvaluation(undefinedValueRulesSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests)) {
				analysisTestsSettings = new ReferencesTableSettings(contextModel, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_AnalysisTests());
				basePart.initAnalysisTests(analysisTestsSettings);
			}
			// init filters
			
			
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation)) {
				basePart.addFilterToTrueEvaluation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInTrueEvaluationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToTrueEvaluation(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.IDENTIFICATION_RULE));
				// Start of user code for additional businessfilters for trueValueRules
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation)) {
				basePart.addFilterToFalseEvaluation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInFalseEvaluationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToFalseEvaluation(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.IDENTIFICATION_RULE));
				// Start of user code for additional businessfilters for falseValueRules
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation)) {
				basePart.addFilterToUndefinedEvaluation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInUndefinedEvaluationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToUndefinedEvaluation(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.IDENTIFICATION_RULE));
				// Start of user code for additional businessfilters for undefinedValueRules
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests)) {
				basePart.addFilterToAnalysisTests(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInAnalysisTestsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToAnalysisTests(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.TEST));
				// Start of user code for additional businessfilters for analysisTests
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Name();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Description();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_References();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_TrueValueRules();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_FalseValueRules();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_UndefinedValueRules();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_AnalysisTests();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ContextModel contextModel = (ContextModel)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name == event.getAffectedEditor()) {
			contextModel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description == event.getAffectedEditor()) {
			contextModel.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				contextModel.getReferences().clear();
				contextModel.getReferences().addAll(((EList) event.getNewValue()));
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof IdentificationRule) {
					trueValueRulesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				trueValueRulesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				trueValueRulesSettings.move(event.getNewIndex(), (IdentificationRule) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof IdentificationRule) {
					falseValueRulesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				falseValueRulesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				falseValueRulesSettings.move(event.getNewIndex(), (IdentificationRule) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Test) {
					analysisTestsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				analysisTestsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				analysisTestsSettings.move(event.getNewIndex(), (Test) event.getNewValue());
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
			ContextModelPropertiesEditionPart basePart = (ContextModelPropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_References().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references)) {
				basePart.setReferences((EList<?>)msg.getNewValue());
			}
			
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_TrueValueRules().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation))
				basePart.updateTrueEvaluation();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_FalseValueRules().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation))
				basePart.updateFalseEvaluation();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_UndefinedValueRules().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation))
				basePart.updateUndefinedEvaluation();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_AnalysisTests().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests))
				basePart.updateAnalysisTests();
			
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Name(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Description(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_References(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_TrueValueRules(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_FalseValueRules(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_UndefinedValueRules(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_AnalysisTests()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name;
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Name().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_Description().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_References().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
