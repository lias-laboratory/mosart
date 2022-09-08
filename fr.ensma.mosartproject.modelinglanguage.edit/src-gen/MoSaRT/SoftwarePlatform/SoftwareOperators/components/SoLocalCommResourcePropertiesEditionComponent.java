/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoLocalCommResource;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoSchedulableTask;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart;
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

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class SoLocalCommResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Settings for rtpCommunicationMechanism SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpCommunicationMechanismSettings;
	
	/**
	 * Settings for rtpProtectProtocol SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpProtectProtocolSettings;
	
	/**
	 * Settings for rtpWaitingQueuePolicy SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpWaitingQueuePolicySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SoLocalCommResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject soLocalCommResource, String editing_mode) {
		super(editingContext, soLocalCommResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SoLocalCommResource.class;
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
			
			final SoLocalCommResource soLocalCommResource = (SoLocalCommResource)elt;
			final SoLocalCommResourcePropertiesEditionPart basePart = (SoLocalCommResourcePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, soLocalCommResource.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks)) {
				writerTasksSettings = new ReferencesTableSettings(soLocalCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks());
				basePart.initWriterTasks(writerTasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks)) {
				readerTasksSettings = new ReferencesTableSettings(soLocalCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks());
				basePart.initReaderTasks(readerTasksSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism)) {
				// init part
				rtpCommunicationMechanismSettings = new EObjectFlatComboSettings(soLocalCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpCommunicationMechanism());
				basePart.initRtpCommunicationMechanism(rtpCommunicationMechanismSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol)) {
				// init part
				rtpProtectProtocolSettings = new EObjectFlatComboSettings(soLocalCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpProtectProtocol());
				basePart.initRtpProtectProtocol(rtpProtectProtocolSettings);
			}
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy)) {
				// init part
				rtpWaitingQueuePolicySettings = new EObjectFlatComboSettings(soLocalCommResource, SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpWaitingQueuePolicy());
				basePart.initRtpWaitingQueuePolicy(rtpWaitingQueuePolicySettings);
			}
			// init filters
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks)) {
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
			if (isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks)) {
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
		if (editorKey == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpCommunicationMechanism();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpProtectProtocol();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy) {
			return SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpWaitingQueuePolicy();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SoLocalCommResource soLocalCommResource = (SoLocalCommResource)semanticObject;
		if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name == event.getAffectedEditor()) {
			soLocalCommResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks == event.getAffectedEditor()) {
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
		if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks == event.getAffectedEditor()) {
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
		if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpCommunicationMechanismSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpCommunicationMechanismSettings, editingContext.getAdapterFactory());
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
						rtpCommunicationMechanismSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpCommunicationMechanismSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpCommunicationMechanismSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpCommunicationMechanismSettings.setToReference(null);
			}
			
		}
		if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpProtectProtocolSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpProtectProtocolSettings, editingContext.getAdapterFactory());
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
						rtpProtectProtocolSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpProtectProtocolSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpProtectProtocolSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpProtectProtocolSettings.setToReference(null);
			}
			
		}
		if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpWaitingQueuePolicySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpWaitingQueuePolicySettings, editingContext.getAdapterFactory());
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
						rtpWaitingQueuePolicySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpWaitingQueuePolicySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpWaitingQueuePolicySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpWaitingQueuePolicySettings.setToReference(null);
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
			SoLocalCommResourcePropertiesEditionPart basePart = (SoLocalCommResourcePropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks))
				basePart.updateWriterTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks().equals(msg.getFeature())  && isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks))
				basePart.updateReaderTasks();
			if (SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpCommunicationMechanism().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism))
				basePart.setRtpCommunicationMechanism((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpProtectProtocol().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol))
				basePart.setRtpProtectProtocol((EObject)msg.getNewValue());
			if (SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpWaitingQueuePolicy().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy))
				basePart.setRtpWaitingQueuePolicy((EObject)msg.getNewValue());
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_WriterTasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoCommunicationResource_ReaderTasks(),
			SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpCommunicationMechanism(),
			SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpProtectProtocol(),
			SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_RtpWaitingQueuePolicy()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name || key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks || key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks || key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism || key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy;
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
				if (SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSoLocalCommResource_Name().getEAttributeType(), newValue);
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
