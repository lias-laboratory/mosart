/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorFactory;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoCommunicationResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoMutualExclusionResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;

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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

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
public class SoSchedulableTaskPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for process EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings processSettings;
	
	/**
	 * Settings for mutualExclusionResources ReferencesTable
	 */
	private ReferencesTableSettings mutualExclusionResourcesSettings;
	
	/**
	 * Settings for commWritingResources ReferencesTable
	 */
	private ReferencesTableSettings commWritingResourcesSettings;
	
	/**
	 * Settings for commReadingResources ReferencesTable
	 */
	private ReferencesTableSettings commReadingResourcesSettings;
	
	/**
	 * Settings for favoriteProcessors ReferencesTable
	 */
	private ReferencesTableSettings favoriteProcessorsSettings;
	
	/**
	 * Settings for runOnProcessors ReferencesTable
	 */
	private ReferencesTableSettings runOnProcessorsSettings;
	
	/**
	 * Settings for representedActivity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings representedActivitySettings;
	
	/**
	 * Settings for rtpMutualExclusionResourceUtilization ReferencesTable
	 */
	protected ReferencesTableSettings rtpMutualExclusionResourceUtilizationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoSchedulableTaskPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject soSchedulableTask, String editing_mode) {
		super(editingContext, soSchedulableTask, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SoSchedulableTask.class;
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
			
			final SoSchedulableTask soSchedulableTask = (SoSchedulableTask)elt;
			final SoSchedulableTaskPropertiesEditionPart basePart = (SoSchedulableTaskPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, soSchedulableTask.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process)) {
				// init part
				processSettings = new EObjectFlatComboSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Process());
				basePart.initProcess(processSettings);
				// set the button mode
				basePart.setProcessButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources)) {
				mutualExclusionResourcesSettings = new ReferencesTableSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_MutualExclusionResources());
				basePart.initMutualExclusionResources(mutualExclusionResourcesSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources)) {
				commWritingResourcesSettings = new ReferencesTableSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommWritingResources());
				basePart.initCommWritingResources(commWritingResourcesSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources)) {
				commReadingResourcesSettings = new ReferencesTableSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommReadingResources());
				basePart.initCommReadingResources(commReadingResourcesSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors)) {
				favoriteProcessorsSettings = new ReferencesTableSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_FavoriteProcessors());
				basePart.initFavoriteProcessors(favoriteProcessorsSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors)) {
				runOnProcessorsSettings = new ReferencesTableSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RunOnProcessors());
				basePart.initRunOnProcessors(runOnProcessorsSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity)) {
				// init part
				representedActivitySettings = new EObjectFlatComboSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RepresentedActivity());
				basePart.initRepresentedActivity(representedActivitySettings);
				// set the button mode
				basePart.setRepresentedActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization)) {
				rtpMutualExclusionResourceUtilizationSettings = new ReferencesTableSettings(soSchedulableTask, SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RtpMutualExclusionResourceUtilization());
				basePart.initRtpMutualExclusionResourceUtilization(rtpMutualExclusionResourceUtilizationSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process)) {
				basePart.addFilterToProcess(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SoSpaceProcess);
					}
					
				});
				// Start of user code for additional businessfilters for process
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources)) {
				basePart.addFilterToMutualExclusionResources(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInMutualExclusionResourcesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToMutualExclusionResources(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_MUTUAL_EXCLUSION_RESOURCE));
				// Start of user code for additional businessfilters for mutualExclusionResources
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources)) {
				basePart.addFilterToCommWritingResources(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInCommWritingResourcesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToCommWritingResources(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_COMMUNICATION_RESOURCE));
				// Start of user code for additional businessfilters for commWritingResources
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources)) {
				basePart.addFilterToCommReadingResources(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInCommReadingResourcesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToCommReadingResources(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_COMMUNICATION_RESOURCE));
				// Start of user code for additional businessfilters for commReadingResources
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors)) {
				basePart.addFilterToFavoriteProcessors(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInFavoriteProcessorsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToFavoriteProcessors(new EObjectFilter(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT));
				// Start of user code for additional businessfilters for favoriteProcessors
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors)) {
				basePart.addFilterToRunOnProcessors(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInRunOnProcessorsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToRunOnProcessors(new EObjectFilter(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT));
				// Start of user code for additional businessfilters for runOnProcessors
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity)) {
				basePart.addFilterToRepresentedActivity(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbTaskActivity); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for representedActivity
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization)) {
				basePart.addFilterToRtpMutualExclusionResourceUtilization(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RtpMutuExcluResourceUtilizationType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for rtpMutualExclusionResourceUtilization
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
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Process();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_MutualExclusionResources();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommWritingResources();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommReadingResources();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_FavoriteProcessors();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RunOnProcessors();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RepresentedActivity();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RtpMutualExclusionResourceUtilization();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoSchedulableTask soSchedulableTask = (SoSchedulableTask)semanticObject;
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name == event.getAffectedEditor()) {
			soSchedulableTask.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processSettings.setToReference((SoSpaceProcess)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SoSpaceProcess eObject = SoftwareOperatorsFactory.eINSTANCE.createSoSpaceProcess();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				processSettings.setToReference(eObject);
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoMutualExclusionResource) {
					mutualExclusionResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				mutualExclusionResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mutualExclusionResourcesSettings.move(event.getNewIndex(), (SoMutualExclusionResource) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoCommunicationResource) {
					commWritingResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				commWritingResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				commWritingResourcesSettings.move(event.getNewIndex(), (SoCommunicationResource) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoCommunicationResource) {
					commReadingResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				commReadingResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				commReadingResourcesSettings.move(event.getNewIndex(), (SoCommunicationResource) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HpProcessingUnit) {
					favoriteProcessorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				favoriteProcessorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				favoriteProcessorsSettings.move(event.getNewIndex(), (HpProcessingUnit) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HpProcessingUnit) {
					runOnProcessorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				runOnProcessorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				runOnProcessorsSettings.move(event.getNewIndex(), (HpProcessingUnit) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				representedActivitySettings.setToReference((SbTaskActivity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SbTaskActivity eObject = SoftwareBehaviorFactory.eINSTANCE.createSbTaskActivity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				representedActivitySettings.setToReference(eObject);
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpMutualExclusionResourceUtilizationSettings, editingContext.getAdapterFactory());
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
				rtpMutualExclusionResourceUtilizationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rtpMutualExclusionResourceUtilizationSettings.move(event.getNewIndex(), (RtpMutuExcluResourceUtilizationType) event.getNewValue());
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
			SoSchedulableTaskPropertiesEditionPart basePart = (SoSchedulableTaskPropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Process().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process))
				basePart.setProcess((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_MutualExclusionResources().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources))
				basePart.updateMutualExclusionResources();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommWritingResources().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources))
				basePart.updateCommWritingResources();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommReadingResources().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources))
				basePart.updateCommReadingResources();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_FavoriteProcessors().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors))
				basePart.updateFavoriteProcessors();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RunOnProcessors().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors))
				basePart.updateRunOnProcessors();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RepresentedActivity().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity))
				basePart.setRepresentedActivity((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RtpMutualExclusionResourceUtilization().equals(msg.getFeature()) && isAccessible(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization))
				basePart.updateRtpMutualExclusionResourceUtilization();
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Process(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_MutualExclusionResources(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommWritingResources(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_CommReadingResources(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_FavoriteProcessors(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RunOnProcessors(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RepresentedActivity(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_RtpMutualExclusionResourceUtilization()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name || key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process;
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
				if (SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSoSchedulableTask_Name().getEAttributeType(), newValue);
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
