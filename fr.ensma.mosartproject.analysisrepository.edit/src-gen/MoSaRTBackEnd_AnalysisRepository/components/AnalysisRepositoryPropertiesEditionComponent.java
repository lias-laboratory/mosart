/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.AnalysisRepository;
import MoSaRTBackEnd_AnalysisRepository.ContextModel;
import MoSaRTBackEnd_AnalysisRepository.GeneralizationRelationship;
import MoSaRTBackEnd_AnalysisRepository.IdentificationRule;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.TestFamily;
import MoSaRTBackEnd_AnalysisRepository.Tool;

import MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class AnalysisRepositoryPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for allGeneralizationRelationships ReferencesTable
	 */
	protected ReferencesTableSettings allGeneralizationRelationshipsSettings;
	
	/**
	 * Settings for allContextModels ReferencesTable
	 */
	protected ReferencesTableSettings allContextModelsSettings;
	
	/**
	 * Settings for allRules ReferencesTable
	 */
	protected ReferencesTableSettings allRulesSettings;
	
	/**
	 * Settings for allTools ReferencesTable
	 */
	protected ReferencesTableSettings allToolsSettings;
	
	/**
	 * Settings for mosartMetamodel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mosartMetamodelSettings;
	
	/**
	 * Settings for allTestFamilies ReferencesTable
	 */
	protected ReferencesTableSettings allTestFamiliesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AnalysisRepositoryPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject analysisRepository, String editing_mode) {
		super(editingContext, analysisRepository, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.class;
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
			
			final AnalysisRepository analysisRepository = (AnalysisRepository)elt;
			final AnalysisRepositoryPropertiesEditionPart basePart = (AnalysisRepositoryPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, analysisRepository.getName()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, analysisRepository.getDescription()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships)) {
				allGeneralizationRelationshipsSettings = new ReferencesTableSettings(analysisRepository, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllGeneralizationRelationships());
				basePart.initGeneralizationRelationships(allGeneralizationRelationshipsSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels)) {
				allContextModelsSettings = new ReferencesTableSettings(analysisRepository, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllContextModels());
				basePart.initContextModels(allContextModelsSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules)) {
				allRulesSettings = new ReferencesTableSettings(analysisRepository, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllRules());
				basePart.initIdentificationRules(allRulesSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools)) {
				allToolsSettings = new ReferencesTableSettings(analysisRepository, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTools());
				basePart.initAnalysisTools(allToolsSettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT)) {
				// init part
				mosartMetamodelSettings = new EObjectFlatComboSettings(analysisRepository, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_MosartMetamodel());
				basePart.initMetaModelOfMoSaRT(mosartMetamodelSettings);
				// set the button mode
				basePart.setMetaModelOfMoSaRTButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies)) {
				allTestFamiliesSettings = new ReferencesTableSettings(analysisRepository, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTestFamilies());
				basePart.initTestFamilies(allTestFamiliesSettings);
			}
			// init filters
			
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships)) {
				basePart.addFilterToGeneralizationRelationships(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof GeneralizationRelationship); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for allGeneralizationRelationships
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels)) {
				basePart.addFilterToContextModels(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ContextModel); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for allContextModels
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules)) {
				basePart.addFilterToIdentificationRules(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof IdentificationRule); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for allRules
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools)) {
				basePart.addFilterToAnalysisTools(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Tool); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for allTools
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT)) {
				basePart.addFilterToMetaModelOfMoSaRT(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof EPackage);
					}
					
				});
				// Start of user code for additional businessfilters for mosartMetamodel
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies)) {
				basePart.addFilterToTestFamilies(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TestFamily); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for allTestFamilies
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Name();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Description();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllGeneralizationRelationships();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllContextModels();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllRules();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTools();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_MosartMetamodel();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTestFamilies();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AnalysisRepository analysisRepository = (AnalysisRepository)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name == event.getAffectedEditor()) {
			analysisRepository.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description == event.getAffectedEditor()) {
			analysisRepository.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, allGeneralizationRelationshipsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				allGeneralizationRelationshipsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				allGeneralizationRelationshipsSettings.move(event.getNewIndex(), (GeneralizationRelationship) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, allContextModelsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				allContextModelsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				allContextModelsSettings.move(event.getNewIndex(), (ContextModel) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, allRulesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				allRulesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				allRulesSettings.move(event.getNewIndex(), (IdentificationRule) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, allToolsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				allToolsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				allToolsSettings.move(event.getNewIndex(), (Tool) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mosartMetamodelSettings.setToReference((EPackage)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EPackage eObject = EcoreFactory.eINSTANCE.createEPackage();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				mosartMetamodelSettings.setToReference(eObject);
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, allTestFamiliesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				allTestFamiliesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				allTestFamiliesSettings.move(event.getNewIndex(), (TestFamily) event.getNewValue());
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
			AnalysisRepositoryPropertiesEditionPart basePart = (AnalysisRepositoryPropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllGeneralizationRelationships().equals(msg.getFeature()) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships))
				basePart.updateGeneralizationRelationships();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllContextModels().equals(msg.getFeature()) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels))
				basePart.updateContextModels();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllRules().equals(msg.getFeature()) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules))
				basePart.updateIdentificationRules();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTools().equals(msg.getFeature()) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools))
				basePart.updateAnalysisTools();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_MosartMetamodel().equals(msg.getFeature()) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT))
				basePart.setMetaModelOfMoSaRT((EObject)msg.getNewValue());
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTestFamilies().equals(msg.getFeature()) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies))
				basePart.updateTestFamilies();
			
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Name(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Description(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllGeneralizationRelationships(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllContextModels(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllRules(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTools(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_MosartMetamodel(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_AllTestFamilies()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT;
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Name().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getAnalysisRepository_Description().getEAttributeType(), newValue);
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
