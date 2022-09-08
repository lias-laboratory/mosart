/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoRemoteCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoTransmittedData;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class SoRemoteCommResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for writerTasks ReferencesTable
	 */
	private ReferencesTableSettings writerTasksSettings;
	
	/**
	 * Settings for readerTasks ReferencesTable
	 */
	private ReferencesTableSettings readerTasksSettings;
	
	/**
	 * Settings for transmittedData ReferencesTable
	 */
	protected ReferencesTableSettings transmittedDataSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoRemoteCommResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject soRemoteCommResource, String editing_mode) {
		super(editingContext, soRemoteCommResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SoRemoteCommResource.class;
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
			
			final SoRemoteCommResource soRemoteCommResource = (SoRemoteCommResource)elt;
			final SoRemoteCommResourcePropertiesEditionPart basePart = (SoRemoteCommResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, soRemoteCommResource.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks)) {
				writerTasksSettings = new ReferencesTableSettings(soRemoteCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks());
				basePart.initWriterTasks(writerTasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks)) {
				readerTasksSettings = new ReferencesTableSettings(soRemoteCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks());
				basePart.initReaderTasks(readerTasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData)) {
				transmittedDataSettings = new ReferencesTableSettings(soRemoteCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_TransmittedData());
				basePart.initTransmittedData(transmittedDataSettings);
			}
			// init filters
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks)) {
				basePart.addFilterToWriterTasks(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInWriterTasksTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToWriterTasks(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK));
				// Start of user code for additional businessfilters for writerTasks
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks)) {
				basePart.addFilterToReaderTasks(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInReaderTasksTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToReaderTasks(new EObjectFilter(SoftwareOperatorsPackage.Literals.SO_SCHEDULABLE_TASK));
				// Start of user code for additional businessfilters for readerTasks
				// End of user code
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData)) {
				basePart.addFilterToTransmittedData(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SoTransmittedData);
					}
			
				});
				// Start of user code for additional businessfilters for transmittedData
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
		if (editorKey == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_TransmittedData();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoRemoteCommResource soRemoteCommResource = (SoRemoteCommResource)semanticObject;
		if (SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name == event.getAffectedEditor()) {
			soRemoteCommResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSchedulableTask) {
					writerTasksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				writerTasksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				writerTasksSettings.move(event.getNewIndex(), (SoSchedulableTask) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SoSchedulableTask) {
					readerTasksSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				readerTasksSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				readerTasksSettings.move(event.getNewIndex(), (SoSchedulableTask) event.getNewValue());
			}
		}
		if (SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, transmittedDataSettings, editingContext.getAdapterFactory());
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
				transmittedDataSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				transmittedDataSettings.move(event.getNewIndex(), (SoTransmittedData) event.getNewValue());
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
			SoRemoteCommResourcePropertiesEditionPart basePart = (SoRemoteCommResourcePropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks))
				basePart.updateWriterTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks))
				basePart.updateReaderTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_TransmittedData().equals(msg.getFeature()) && isAccessible(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData))
				basePart.updateTransmittedData();
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_TransmittedData()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name || key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks || key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks || key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData;
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
				if (SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSoRemoteCommResource_Name().getEAttributeType(), newValue);
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
