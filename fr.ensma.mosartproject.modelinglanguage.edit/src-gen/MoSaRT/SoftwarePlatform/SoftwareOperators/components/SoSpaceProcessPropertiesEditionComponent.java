/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpProcessingUnit;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSpaceProcess;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart;
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
public class SoSpaceProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for spaceProcessParent EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings spaceProcessParentSettings;
	
	/**
	 * Settings for spaceProcessChildren ReferencesTable
	 */
	private ReferencesTableSettings spaceProcessChildrenSettings;
	
	/**
	 * Settings for schedulableTasks ReferencesTable
	 */
	private ReferencesTableSettings schedulableTasksSettings;
	
	/**
	 * Settings for processingUnit ReferencesTable
	 */
	private ReferencesTableSettings processingUnitSettings;
	
	/**
	 * Settings for rtpSchedulingPolicy SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpSchedulingPolicySettings;
	
	/**
	 * Settings for rtpTaskAllocation SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpTaskAllocationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoSpaceProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject soSpaceProcess, String editing_mode) {
		super(editingContext, soSpaceProcess, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SoSpaceProcess.class;
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
			
			final SoSpaceProcess soSpaceProcess = (SoSpaceProcess)elt;
			final SoSpaceProcessPropertiesEditionPart basePart = (SoSpaceProcessPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, soSpaceProcess.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent)) {
				// init part
				spaceProcessParentSettings = new EObjectFlatComboSettings(soSpaceProcess, SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessParent());
				basePart.initSpaceProcessParent(spaceProcessParentSettings);
				// set the button mode
				basePart.setSpaceProcessParentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren)) {
				spaceProcessChildrenSettings = new ReferencesTableSettings(soSpaceProcess, SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessChildren());
				basePart.initSpaceProcessChildren(spaceProcessChildrenSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks)) {
				schedulableTasksSettings = new ReferencesTableSettings(soSpaceProcess, SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SchedulableTasks());
				basePart.initSchedulableTasks(schedulableTasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit)) {
				processingUnitSettings = new ReferencesTableSettings(soSpaceProcess, SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_ProcessingUnit());
				basePart.initProcessingUnit(processingUnitSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy)) {
				// init part
				rtpSchedulingPolicySettings = new EObjectFlatComboSettings(soSpaceProcess, SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpSchedulingPolicy());
				basePart.initRtpSchedulingPolicy(rtpSchedulingPolicySettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation)) {
				// init part
				rtpTaskAllocationSettings = new EObjectFlatComboSettings(soSpaceProcess, SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpTaskAllocation());
				basePart.initRtpTaskAllocation(rtpTaskAllocationSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent)) {
				basePart.addFilterToSpaceProcessParent(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof SoSpaceProcess); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for spaceProcessParent
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren)) {
				basePart.addFilterToSpaceProcessChildren(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSpaceProcessChildrenTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSpaceProcessChildren(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SPACE_PROCESS));
				// Start of user code for additional businessfilters for spaceProcessChildren
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks)) {
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
			if (isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit)) {
				basePart.addFilterToProcessingUnit(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInProcessingUnitTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToProcessingUnit(new EObjectFilter(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT));
				// Start of user code for additional businessfilters for processingUnit
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
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessParent();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessChildren();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SchedulableTasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_ProcessingUnit();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpSchedulingPolicy();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpTaskAllocation();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoSpaceProcess soSpaceProcess = (SoSpaceProcess)semanticObject;
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name == event.getAffectedEditor()) {
			soSpaceProcess.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				spaceProcessParentSettings.setToReference((SoSpaceProcess)event.getNewValue());
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
				spaceProcessParentSettings.setToReference(eObject);
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSpaceProcess) {
					spaceProcessChildrenSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				spaceProcessChildrenSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				spaceProcessChildrenSettings.move(event.getNewIndex(), (SoSpaceProcess) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks == event.getAffectedEditor()) {
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
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HpProcessingUnit) {
					processingUnitSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processingUnitSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processingUnitSettings.move(event.getNewIndex(), (HpProcessingUnit) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpSchedulingPolicySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpSchedulingPolicySettings, editingContext.getAdapterFactory());
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
						rtpSchedulingPolicySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpSchedulingPolicySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpSchedulingPolicySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpSchedulingPolicySettings.setToReference(null);
			}
			
		}
		if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpTaskAllocationSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpTaskAllocationSettings, editingContext.getAdapterFactory());
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
						rtpTaskAllocationSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpTaskAllocationSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpTaskAllocationSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpTaskAllocationSettings.setToReference(null);
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
			SoSpaceProcessPropertiesEditionPart basePart = (SoSpaceProcessPropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessParent().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent))
				basePart.setSpaceProcessParent((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessChildren().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren))
				basePart.updateSpaceProcessChildren();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SchedulableTasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks))
				basePart.updateSchedulableTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_ProcessingUnit().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit))
				basePart.updateProcessingUnit();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpSchedulingPolicy().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy))
				basePart.setRtpSchedulingPolicy((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpTaskAllocation().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation))
				basePart.setRtpTaskAllocation((EObject)msg.getNewValue());
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessParent(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SpaceProcessChildren(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_SchedulableTasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_ProcessingUnit(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpSchedulingPolicy(),
			SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_RtpTaskAllocation()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name || key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy;
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
				if (SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSoSpaceProcess_Name().getEAttributeType(), newValue);
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
