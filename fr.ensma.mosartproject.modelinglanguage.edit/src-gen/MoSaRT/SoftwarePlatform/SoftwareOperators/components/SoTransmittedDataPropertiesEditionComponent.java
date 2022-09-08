/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsFactory;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart;
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
public class SoTransmittedDataPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for sourceTask EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceTaskSettings;
	
	/**
	 * Settings for targetTasks ReferencesTable
	 */
	private ReferencesTableSettings targetTasksSettings;
	
	/**
	 * Settings for rtpDataSize SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpDataSizeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoTransmittedDataPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject soTransmittedData, String editing_mode) {
		super(editingContext, soTransmittedData, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SoTransmittedData.class;
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
			
			final SoTransmittedData soTransmittedData = (SoTransmittedData)elt;
			final SoTransmittedDataPropertiesEditionPart basePart = (SoTransmittedDataPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, soTransmittedData.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask)) {
				// init part
				sourceTaskSettings = new EObjectFlatComboSettings(soTransmittedData, SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_SourceTask());
				basePart.initSourceTask(sourceTaskSettings);
				// set the button mode
				basePart.setSourceTaskButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks)) {
				targetTasksSettings = new ReferencesTableSettings(soTransmittedData, SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_TargetTasks());
				basePart.initTargetTasks(targetTasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize)) {
				// init part
				rtpDataSizeSettings = new EObjectFlatComboSettings(soTransmittedData, SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_RtpDataSize());
				basePart.initRtpDataSize(rtpDataSizeSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask)) {
				basePart.addFilterToSourceTask(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SoSchedulableTask);
					}
					
				});
				// Start of user code for additional businessfilters for sourceTask
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks)) {
				basePart.addFilterToTargetTasks(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInTargetTasksTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToTargetTasks(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK));
				// Start of user code for additional businessfilters for targetTasks
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
		if (editorKey == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_SourceTask();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_TargetTasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_RtpDataSize();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoTransmittedData soTransmittedData = (SoTransmittedData)semanticObject;
		if (SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name == event.getAffectedEditor()) {
			soTransmittedData.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceTaskSettings.setToReference((SoSchedulableTask)event.getNewValue());
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
				sourceTaskSettings.setToReference(eObject);
			}
		}
		if (SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSchedulableTask) {
					targetTasksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				targetTasksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				targetTasksSettings.move(event.getNewIndex(), (SoSchedulableTask) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpDataSizeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpDataSizeSettings, editingContext.getAdapterFactory());
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
						rtpDataSizeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpDataSizeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpDataSizeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpDataSizeSettings.setToReference(null);
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
			SoTransmittedDataPropertiesEditionPart basePart = (SoTransmittedDataPropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_SourceTask().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask))
				basePart.setSourceTask((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_TargetTasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks))
				basePart.updateTargetTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_RtpDataSize().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize))
				basePart.setRtpDataSize((EObject)msg.getNewValue());
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_SourceTask(),
			SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_TargetTasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_RtpDataSize()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name || key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask || key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks;
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
				if (SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSoTransmittedData_Name().getEAttributeType(), newValue);
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
