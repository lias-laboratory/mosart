/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.components;

// Start of user code for imports
import MoSaRT.HardwarePlatform.HardwarePlatformFactory;
import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;

import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

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
public class HpProcessingUnitPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for commChannel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings commChannelSettings;
	
	/**
	 * Settings for spaceProcesses ReferencesTable
	 */
	private ReferencesTableSettings spaceProcessesSettings;
	
	/**
	 * Settings for candidateTasks ReferencesTable
	 */
	private ReferencesTableSettings candidateTasksSettings;
	
	/**
	 * Settings for schedulableTasks ReferencesTable
	 */
	private ReferencesTableSettings schedulableTasksSettings;
	
	/**
	 * Settings for processorInterconnector EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings processorInterconnectorSettings;
	
	/**
	 * Settings for rtpComputingSpeed SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpComputingSpeedSettings;
	
	/**
	 * Settings for rtpUtilizationFactor SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpUtilizationFactorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HpProcessingUnitPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hpProcessingUnit, String editing_mode) {
		super(editingContext, hpProcessingUnit, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HardwarePlatformViewsRepository.class;
		partKey = HardwarePlatformViewsRepository.HpProcessingUnit.class;
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
			
			final HpProcessingUnit hpProcessingUnit = (HpProcessingUnit)elt;
			final HpProcessingUnitPropertiesEditionPart basePart = (HpProcessingUnitPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hpProcessingUnit.getName()));
			
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel)) {
				// init part
				commChannelSettings = new EObjectFlatComboSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CommChannel());
				basePart.initCommChannel(commChannelSettings);
				// set the button mode
				basePart.setCommChannelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses)) {
				spaceProcessesSettings = new ReferencesTableSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SpaceProcesses());
				basePart.initSpaceProcesses(spaceProcessesSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks)) {
				candidateTasksSettings = new ReferencesTableSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CandidateTasks());
				basePart.initCandidateTasks(candidateTasksSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks)) {
				schedulableTasksSettings = new ReferencesTableSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SchedulableTasks());
				basePart.initSchedulableTasks(schedulableTasksSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector)) {
				// init part
				processorInterconnectorSettings = new EObjectFlatComboSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_ProcessorInterconnector());
				basePart.initProcessorInterconnector(processorInterconnectorSettings);
				// set the button mode
				basePart.setProcessorInterconnectorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed)) {
				// init part
				rtpComputingSpeedSettings = new EObjectFlatComboSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpComputingSpeed());
				basePart.initRtpComputingSpeed(rtpComputingSpeedSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor)) {
				// init part
				rtpUtilizationFactorSettings = new EObjectFlatComboSettings(hpProcessingUnit, HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpUtilizationFactor());
				basePart.initRtpUtilizationFactor(rtpUtilizationFactorSettings);
			}
			// init filters
			
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel)) {
				basePart.addFilterToCommChannel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof HpCommunicationChannel); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for commChannel
				// End of user code
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses)) {
				basePart.addFilterToSpaceProcesses(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSpaceProcessesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSpaceProcesses(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS));
				// Start of user code for additional businessfilters for spaceProcesses
				// End of user code
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks)) {
				basePart.addFilterToCandidateTasks(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInCandidateTasksTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToCandidateTasks(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK));
				// Start of user code for additional businessfilters for candidateTasks
				// End of user code
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks)) {
				basePart.addFilterToSchedulableTasks(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSchedulableTasksTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSchedulableTasks(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK));
				// Start of user code for additional businessfilters for schedulableTasks
				// End of user code
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector)) {
				basePart.addFilterToProcessorInterconnector(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof HpProcessorInterconnector); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for processorInterconnector
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
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_Name();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CommChannel();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SpaceProcesses();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CandidateTasks();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SchedulableTasks();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_ProcessorInterconnector();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpComputingSpeed();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpUtilizationFactor();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HpProcessingUnit hpProcessingUnit = (HpProcessingUnit)semanticObject;
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name == event.getAffectedEditor()) {
			hpProcessingUnit.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				commChannelSettings.setToReference((HpCommunicationChannel)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HpCommunicationChannel eObject = HardwarePlatformFactory.eINSTANCE.createHpCommunicationChannel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				commChannelSettings.setToReference(eObject);
			}
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSpaceProcess) {
					spaceProcessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				spaceProcessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				spaceProcessesSettings.move(event.getNewIndex(), (SoSpaceProcess) event.getNewValue());
			}
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSchedulableTask) {
					candidateTasksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				candidateTasksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				candidateTasksSettings.move(event.getNewIndex(), (SoSchedulableTask) event.getNewValue());
			}
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSchedulableTask) {
					schedulableTasksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				schedulableTasksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				schedulableTasksSettings.move(event.getNewIndex(), (SoSchedulableTask) event.getNewValue());
			}
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processorInterconnectorSettings.setToReference((HpProcessorInterconnector)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				HpProcessorInterconnector eObject = HardwarePlatformFactory.eINSTANCE.createHpProcessorInterconnector();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				processorInterconnectorSettings.setToReference(eObject);
			}
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpComputingSpeedSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpComputingSpeedSettings, editingContext.getAdapterFactory());
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
						rtpComputingSpeedSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpComputingSpeedSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpComputingSpeedSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpComputingSpeedSettings.setToReference(null);
			}
			
		}
		if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpUtilizationFactorSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpUtilizationFactorSettings, editingContext.getAdapterFactory());
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
						rtpUtilizationFactorSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpUtilizationFactorSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpUtilizationFactorSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpUtilizationFactorSettings.setToReference(null);
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
			HpProcessingUnitPropertiesEditionPart basePart = (HpProcessingUnitPropertiesEditionPart)editingPart;
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CommChannel().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel))
				basePart.setCommChannel((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SpaceProcesses().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses))
				basePart.updateSpaceProcesses();
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CandidateTasks().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks))
				basePart.updateCandidateTasks();
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SchedulableTasks().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks))
				basePart.updateSchedulableTasks();
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_ProcessorInterconnector().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector))
				basePart.setProcessorInterconnector((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpComputingSpeed().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed))
				basePart.setRtpComputingSpeed((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpUtilizationFactor().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor))
				basePart.setRtpUtilizationFactor((EObject)msg.getNewValue());
			
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
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_Name(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CommChannel(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SpaceProcesses(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_CandidateTasks(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_SchedulableTasks(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_ProcessorInterconnector(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpComputingSpeed(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_RtpUtilizationFactor()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name;
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
				if (HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HardwarePlatformPackage.eINSTANCE.getHpProcessingUnit_Name().getEAttributeType(), newValue);
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
