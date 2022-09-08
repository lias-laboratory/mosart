/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbReceiveStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStepPrecedenceRelation;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;

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

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;


// End of user code

/**
 * 
 * 
 */
public class SbReceiveStepPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for inputStepRelation ReferencesTable
	 */
	private ReferencesTableSettings inputStepRelationSettings;
	
	/**
	 * Settings for outputStepRelation ReferencesTable
	 */
	private ReferencesTableSettings outputStepRelationSettings;
	
	/**
	 * Settings for representedOperation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings representedOperationSettings;
	
	/**
	 * Settings for interactionResource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings interactionResourceSettings;
	
	/**
	 * Settings for rtpExecutionTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpExecutionTimeSettings;
	
	/**
	 * Settings for rtpDeadline SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpDeadlineSettings;
	
	/**
	 * Settings for rtpBlockingTime SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpBlockingTimeSettings;
	
	/**
	 * Settings for rtpRepetition SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpRepetitionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SbReceiveStepPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject sbReceiveStep, String editing_mode) {
		super(editingContext, sbReceiveStep, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareBehaviorViewsRepository.class;
		partKey = SoftwareBehaviorViewsRepository.SbReceiveStep.class;
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
			
			final SbReceiveStep sbReceiveStep = (SbReceiveStep)elt;
			final SbReceiveStepPropertiesEditionPart basePart = (SbReceiveStepPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, sbReceiveStep.getName()));
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation)) {
				inputStepRelationSettings = new ReferencesTableSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_InputStepRelation());
				basePart.initInputStepRelation(inputStepRelationSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation)) {
				outputStepRelationSettings = new ReferencesTableSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_OutputStepRelation());
				basePart.initOutputStepRelation(outputStepRelationSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation)) {
				// init part
				representedOperationSettings = new EObjectFlatComboSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_RepresentedOperation());
				basePart.initRepresentedOperation(representedOperationSettings);
				// set the button mode
				basePart.setRepresentedOperationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource)) {
				// init part
				interactionResourceSettings = new EObjectFlatComboSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_InteractionResource());
				basePart.initInteractionResource(interactionResourceSettings);
				// set the button mode
				basePart.setInteractionResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime)) {
				// init part
				rtpExecutionTimeSettings = new EObjectFlatComboSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpExecutionTime());
				basePart.initRtpExecutionTime(rtpExecutionTimeSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline)) {
				// init part
				rtpDeadlineSettings = new EObjectFlatComboSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpDeadline());
				basePart.initRtpDeadline(rtpDeadlineSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime)) {
				// init part
				rtpBlockingTimeSettings = new EObjectFlatComboSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpBlockingTime());
				basePart.initRtpBlockingTime(rtpBlockingTimeSettings);
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition)) {
				// init part
				rtpRepetitionSettings = new EObjectFlatComboSettings(sbReceiveStep, SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpRepetition());
				basePart.initRtpRepetition(rtpRepetitionSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation)) {
				basePart.addFilterToInputStepRelation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInInputStepRelationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToInputStepRelation(new EObjectFilter(SoftwareBehaviorPackage.Literals.SB_STEP_PRECEDENCE_RELATION));
				// Start of user code for additional businessfilters for inputStepRelation
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation)) {
				basePart.addFilterToOutputStepRelation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOutputStepRelationTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOutputStepRelation(new EObjectFilter(SoftwareBehaviorPackage.Literals.SB_STEP_PRECEDENCE_RELATION));
				// Start of user code for additional businessfilters for outputStepRelation
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation)) {
				basePart.addFilterToRepresentedOperation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Operation); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for representedOperation
				// End of user code
			}
			if (isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource)) {
				basePart.addFilterToInteractionResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SoInteractionResource); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for interactionResource
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
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_Name();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_InputStepRelation();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_OutputStepRelation();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_RepresentedOperation();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_InteractionResource();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpExecutionTime();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpDeadline();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpBlockingTime();
		}
		if (editorKey == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition) {
			return SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpRepetition();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SbReceiveStep sbReceiveStep = (SbReceiveStep)semanticObject;
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name == event.getAffectedEditor()) {
			sbReceiveStep.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SbStepPrecedenceRelation) {
					inputStepRelationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inputStepRelationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inputStepRelationSettings.move(event.getNewIndex(), (SbStepPrecedenceRelation) event.getNewValue());
			}
		}
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SbStepPrecedenceRelation) {
					outputStepRelationSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputStepRelationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputStepRelationSettings.move(event.getNewIndex(), (SbStepPrecedenceRelation) event.getNewValue());
			}
		}
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				representedOperationSettings.setToReference((Operation)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Operation eObject = UMLFactory.eINSTANCE.createOperation();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				representedOperationSettings.setToReference(eObject);
			}
		}
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				interactionResourceSettings.setToReference((SoInteractionResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, interactionResourceSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime == event.getAffectedEditor()) {
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
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline == event.getAffectedEditor()) {
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
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime == event.getAffectedEditor()) {
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
		if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition == event.getAffectedEditor()) {
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
			SbReceiveStepPropertiesEditionPart basePart = (SbReceiveStepPropertiesEditionPart)editingPart;
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_InputStepRelation().equals(msg.getFeature())  && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation))
				basePart.updateInputStepRelation();
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_OutputStepRelation().equals(msg.getFeature())  && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation))
				basePart.updateOutputStepRelation();
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_RepresentedOperation().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation))
				basePart.setRepresentedOperation((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_InteractionResource().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource))
				basePart.setInteractionResource((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpExecutionTime().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime))
				basePart.setRtpExecutionTime((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpDeadline().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline))
				basePart.setRtpDeadline((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpBlockingTime().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime))
				basePart.setRtpBlockingTime((EObject)msg.getNewValue());
			if (SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpRepetition().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition))
				basePart.setRtpRepetition((EObject)msg.getNewValue());
			
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
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_Name(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_InputStepRelation(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_OutputStepRelation(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_RepresentedOperation(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_InteractionResource(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpExecutionTime(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpDeadline(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpBlockingTime(),
			SoftwareBehaviorPackage.eINSTANCE.getSbStep_RtpRepetition()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name;
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
				if (SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareBehaviorPackage.eINSTANCE.getSbStep_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareBehaviorPackage.eINSTANCE.getSbStep_Name().getEAttributeType(), newValue);
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
