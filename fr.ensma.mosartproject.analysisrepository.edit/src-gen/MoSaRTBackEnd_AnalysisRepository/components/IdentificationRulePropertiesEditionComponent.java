/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.ComponentKindType;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.TimingKindType;

import MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

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
public class IdentificationRulePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for rule EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings ruleSettings;
	
	/**
	 * Settings for ruleContext EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings ruleContextSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public IdentificationRulePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject identificationRule, String editing_mode) {
		super(editingContext, identificationRule, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.class;
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
			
			final IdentificationRule identificationRule = (IdentificationRule)elt;
			final IdentificationRulePropertiesEditionPart basePart = (IdentificationRulePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, identificationRule.getId()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind)) {
				basePart.initTimingKind(EEFUtils.choiceOfValues(identificationRule, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_TimingKind()), identificationRule.getTimingKind());
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind)) {
				basePart.initComponentKind(EEFUtils.choiceOfValues(identificationRule, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_ComponentKind()), identificationRule.getComponentKind());
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule)) {
				// init part
				ruleSettings = new EObjectFlatComboSettings(identificationRule, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Rule());
				basePart.initRule(ruleSettings);
				// set the button mode
				basePart.setRuleButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext)) {
				// init part
				ruleContextSettings = new EObjectFlatComboSettings(identificationRule, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_RuleContext());
				basePart.initRuleContext(ruleContextSettings);
				// set the button mode
				basePart.setRuleContextButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, identificationRule.getDescription()));
			
			// init filters
			
			
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule)) {
				basePart.addFilterToRule(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Entry);
					}
					
				});
				// Start of user code for additional businessfilters for rule
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext)) {
				basePart.addFilterToRuleContext(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EClass);
					}
					
				});
				// Start of user code for additional businessfilters for ruleContext
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Id();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_TimingKind();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_ComponentKind();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Rule();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_RuleContext();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Description();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		IdentificationRule identificationRule = (IdentificationRule)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id == event.getAffectedEditor()) {
			identificationRule.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind == event.getAffectedEditor()) {
			identificationRule.setTimingKind((TimingKindType)event.getNewValue());
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind == event.getAffectedEditor()) {
			identificationRule.setComponentKind((ComponentKindType)event.getNewValue());
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				ruleSettings.setToReference((Entry)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Entry eObject = (Entry) EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY);
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				ruleSettings.setToReference(eObject);
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				ruleContextSettings.setToReference((EClass)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EClass eObject = EcoreFactory.eINSTANCE.createEClass();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				ruleContextSettings.setToReference(eObject);
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description == event.getAffectedEditor()) {
			identificationRule.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			IdentificationRulePropertiesEditionPart basePart = (IdentificationRulePropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_TimingKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind))
				basePart.setTimingKind((TimingKindType)msg.getNewValue());
			
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_ComponentKind().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind))
				basePart.setComponentKind((ComponentKindType)msg.getNewValue());
			
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Rule().equals(msg.getFeature()) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule))
				basePart.setRule((EObject)msg.getNewValue());
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_RuleContext().equals(msg.getFeature()) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext))
				basePart.setRuleContext((EObject)msg.getNewValue());
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Id(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_TimingKind(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_ComponentKind(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Rule(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_RuleContext(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Description()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext;
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Id().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_TimingKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_TimingKind().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_ComponentKind().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_ComponentKind().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getIdentificationRule_Description().getEAttributeType(), newValue);
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
