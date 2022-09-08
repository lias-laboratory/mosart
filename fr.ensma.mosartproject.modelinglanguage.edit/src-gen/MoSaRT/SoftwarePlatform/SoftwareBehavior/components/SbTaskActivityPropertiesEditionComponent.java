/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSequencingRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTaskActivity;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbTrigger;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory;

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
public class SbTaskActivityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for trigger EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings triggerSettings;
	
	/**
	 * Settings for inputSquencingRelation ReferencesTable
	 */
	private ReferencesTableSettings inputSquencingRelationSettings;
	
	/**
	 * Settings for outputSequencingRelation ReferencesTable
	 */
	private ReferencesTableSettings outputSequencingRelationSettings;
	
	/**
	 * Settings for rootActionStep EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings rootActionStepSettings;
	
	/**
	 * Settings for representedTask EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings representedTaskSettings;
	
	/**
	 * Settings for rtpExecutionTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpExecutionTimeSettings;
	
	/**
	 * Settings for rtpOffset SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpOffsetSettings;
	
	/**
	 * Settings for rtpDeadline SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpDeadlineSettings;
	
	/**
	 * Settings for rtpPreemptibility SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpPreemptibilitySettings;
	
	/**
	 * Settings for rtpSelfSuspension SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpSelfSuspensionSettings;
	
	/**
	 * Settings for rtpPriority SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpPrioritySettings;
	
	/**
	 * Settings for rtpCriticality SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpCriticalitySettings;
	
	/**
	 * Settings for rtpBlockingTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpBlockingTimeSettings;
	
	/**
	 * Settings for rtpResponseTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpResponseTimeSettings;
	
	/**
	 * Settings for rtpRepetition SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpRepetitionSettings;
	
	/**
	 * Settings for actionSteps ReferencesTable
	 */
	protected ReferencesTableSettings actionStepsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SbTaskActivityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sbTaskActivity, String editing_mode) {
		super(editingContext, sbTaskActivity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.SbTaskActivity.class;
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
			
			final SbTaskActivity sbTaskActivity = (SbTaskActivity)elt;
			final SbTaskActivityPropertiesEditionPart basePart = (SbTaskActivityPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, sbTaskActivity.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger)) {
				// init part
				triggerSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Trigger());
				basePart.initTrigger(triggerSettings);
				// set the button mode
				basePart.setTriggerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation)) {
				inputSquencingRelationSettings = new ReferencesTableSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_InputSquencingRelation());
				basePart.initInputSquencingRelation(inputSquencingRelationSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation)) {
				outputSequencingRelationSettings = new ReferencesTableSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_OutputSequencingRelation());
				basePart.initOutputSequencingRelation(outputSequencingRelationSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep)) {
				// init part
				rootActionStepSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RootActionStep());
				basePart.initRootActionStep(rootActionStepSettings);
				// set the button mode
				basePart.setRootActionStepButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask)) {
				// init part
				representedTaskSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RepresentedTask());
				basePart.initRepresentedTask(representedTaskSettings);
				// set the button mode
				basePart.setRepresentedTaskButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime)) {
				// init part
				rtpExecutionTimeSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpExecutionTime());
				basePart.initRtpExecutionTime(rtpExecutionTimeSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset)) {
				// init part
				rtpOffsetSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpOffset());
				basePart.initRtpOffset(rtpOffsetSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline)) {
				// init part
				rtpDeadlineSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpDeadline());
				basePart.initRtpDeadline(rtpDeadlineSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility)) {
				// init part
				rtpPreemptibilitySettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPreemptibility());
				basePart.initRtpPreemptibility(rtpPreemptibilitySettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension)) {
				// init part
				rtpSelfSuspensionSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpSelfSuspension());
				basePart.initRtpSelfSuspension(rtpSelfSuspensionSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority)) {
				// init part
				rtpPrioritySettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPriority());
				basePart.initRtpPriority(rtpPrioritySettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality)) {
				// init part
				rtpCriticalitySettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpCriticality());
				basePart.initRtpCriticality(rtpCriticalitySettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime)) {
				// init part
				rtpBlockingTimeSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpBlockingTime());
				basePart.initRtpBlockingTime(rtpBlockingTimeSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime)) {
				// init part
				rtpResponseTimeSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpResponseTime());
				basePart.initRtpResponseTime(rtpResponseTimeSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition)) {
				// init part
				rtpRepetitionSettings = new EObjectFlatComboSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpRepetition());
				basePart.initRtpRepetition(rtpRepetitionSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps)) {
				actionStepsSettings = new ReferencesTableSettings(sbTaskActivity, SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_ActionSteps());
				basePart.initActionSteps(actionStepsSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger)) {
				basePart.addFilterToTrigger(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbTrigger); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for trigger
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation)) {
				basePart.addFilterToInputSquencingRelation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInInputSquencingRelationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToInputSquencingRelation(new EObjectFilter(SoftwareBehaviorPackage.Literals.SB_SEQUENCING_RELATION));
				// Start of user code for additional businessfilters for inputSquencingRelation
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation)) {
				basePart.addFilterToOutputSequencingRelation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOutputSequencingRelationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOutputSequencingRelation(new EObjectFilter(SoftwareBehaviorPackage.Literals.SB_SEQUENCING_RELATION));
				// Start of user code for additional businessfilters for outputSequencingRelation
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep)) {
				basePart.addFilterToRootActionStep(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbStep); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for rootActionStep
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask)) {
				basePart.addFilterToRepresentedTask(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SoSchedulableTask);
					}
					
				});
				// Start of user code for additional businessfilters for representedTask
				// End of user code
			}
			
			
			
			
			
			
			
			
			
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps)) {
				basePart.addFilterToActionSteps(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SbStep); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for actionSteps
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
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Trigger();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_InputSquencingRelation();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_OutputSequencingRelation();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RootActionStep();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RepresentedTask();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpExecutionTime();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpOffset();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpDeadline();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPreemptibility();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpSelfSuspension();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPriority();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpCriticality();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpBlockingTime();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpResponseTime();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpRepetition();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_ActionSteps();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SbTaskActivity sbTaskActivity = (SbTaskActivity)semanticObject;
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name == event.getAffectedEditor()) {
			sbTaskActivity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				triggerSettings.setToReference((SbTrigger)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, triggerSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SbSequencingRelation) {
					inputSquencingRelationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inputSquencingRelationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inputSquencingRelationSettings.move(event.getNewIndex(), (SbSequencingRelation) event.getNewValue());
			}
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SbSequencingRelation) {
					outputSequencingRelationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputSequencingRelationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputSequencingRelationSettings.move(event.getNewIndex(), (SbSequencingRelation) event.getNewValue());
			}
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				rootActionStepSettings.setToReference((SbStep)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rootActionStepSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				representedTaskSettings.setToReference((SoSchedulableTask)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				SoSchedulableTask eObject = SoftwareOperatorsFactory.eINSTANCE.createSoSchedulableTask();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				representedTaskSettings.setToReference(eObject);
			}
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpExecutionTimeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpExecutionTimeSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpExecutionTimeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpExecutionTimeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpExecutionTimeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpExecutionTimeSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpOffsetSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpOffsetSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpOffsetSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpOffsetSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpOffsetSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpOffsetSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpDeadlineSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpDeadlineSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpDeadlineSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpDeadlineSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpDeadlineSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpDeadlineSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpPreemptibilitySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpPreemptibilitySettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpPreemptibilitySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpPreemptibilitySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpPreemptibilitySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpPreemptibilitySettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpSelfSuspensionSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpSelfSuspensionSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpSelfSuspensionSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpSelfSuspensionSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpSelfSuspensionSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpSelfSuspensionSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpPrioritySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpPrioritySettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpPrioritySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpPrioritySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpPrioritySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpPrioritySettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpCriticalitySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpCriticalitySettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpCriticalitySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpCriticalitySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpCriticalitySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpCriticalitySettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpBlockingTimeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpBlockingTimeSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpBlockingTimeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpBlockingTimeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpBlockingTimeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpBlockingTimeSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpResponseTimeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpResponseTimeSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpResponseTimeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpResponseTimeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpResponseTimeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpResponseTimeSettings.setToReference(null);
			}
			
		}
		if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpRepetitionSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpRepetitionSettings, editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(editingContext.getEObject(), PropertiesEditingProvider.class);
					Object result = null;
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy instanceof CreateEditingPolicy) {
							policy.execute();
							result = ((CreateEditingPolicy) policy).getResult();
						}
					}
					if (result != null) {
						rtpRepetitionSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpRepetitionSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpRepetitionSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpRepetitionSettings.setToReference(null);
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
			SbTaskActivityPropertiesEditionPart basePart = (SbTaskActivityPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Trigger().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger))
				basePart.setTrigger((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_InputSquencingRelation().equals(msg.getFeature())  && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation))
				basePart.updateInputSquencingRelation();
			if (SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_OutputSequencingRelation().equals(msg.getFeature())  && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation))
				basePart.updateOutputSequencingRelation();
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RootActionStep().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep))
				basePart.setRootActionStep((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RepresentedTask().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask))
				basePart.setRepresentedTask((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpExecutionTime().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime))
				basePart.setRtpExecutionTime((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpOffset().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset))
				basePart.setRtpOffset((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpDeadline().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline))
				basePart.setRtpDeadline((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPreemptibility().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility))
				basePart.setRtpPreemptibility((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpSelfSuspension().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension))
				basePart.setRtpSelfSuspension((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPriority().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority))
				basePart.setRtpPriority((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpCriticality().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality))
				basePart.setRtpCriticality((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpBlockingTime().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime))
				basePart.setRtpBlockingTime((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpResponseTime().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime))
				basePart.setRtpResponseTime((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpRepetition().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition))
				basePart.setRtpRepetition((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_ActionSteps().equals(msg.getFeature()) && isAccessible(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps))
				basePart.updateActionSteps();
			
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
			SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Name(),
			SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Trigger(),
			SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_InputSquencingRelation(),
			SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_OutputSequencingRelation(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RootActionStep(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RepresentedTask(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpExecutionTime(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpOffset(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpDeadline(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPreemptibility(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpSelfSuspension(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpPriority(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpCriticality(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpBlockingTime(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpResponseTime(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_RtpRepetition(),
			SoftwareBehaviorPackage.eINSTANCE.getSbTaskActivity_ActionSteps()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name || key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask || key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility || key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension;
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
				if (SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareBehaviorPackage.eINSTANCE.getSbSchedulingActivity_Name().getEAttributeType(), newValue);
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
