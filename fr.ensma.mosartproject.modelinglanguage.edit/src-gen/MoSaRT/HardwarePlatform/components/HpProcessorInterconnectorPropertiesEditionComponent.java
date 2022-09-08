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
import MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart;

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
public class HpProcessorInterconnectorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for processingUnits ReferencesTable
	 */
	private ReferencesTableSettings processingUnitsSettings;
	
	/**
	 * Settings for commChannel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings commChannelSettings;
	
	/**
	 * Settings for rtpMultiprocessorCategory SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpMultiprocessorCategorySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HpProcessorInterconnectorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hpProcessorInterconnector, String editing_mode) {
		super(editingContext, hpProcessorInterconnector, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HardwarePlatformViewsRepository.class;
		partKey = HardwarePlatformViewsRepository.HpProcessorInterconnector.class;
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
			
			final HpProcessorInterconnector hpProcessorInterconnector = (HpProcessorInterconnector)elt;
			final HpProcessorInterconnectorPropertiesEditionPart basePart = (HpProcessorInterconnectorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hpProcessorInterconnector.getName()));
			
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits)) {
				processingUnitsSettings = new ReferencesTableSettings(hpProcessorInterconnector, HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_ProcessingUnits());
				basePart.initProcessingUnits(processingUnitsSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel)) {
				// init part
				commChannelSettings = new EObjectFlatComboSettings(hpProcessorInterconnector, HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_CommChannel());
				basePart.initCommChannel(commChannelSettings);
				// set the button mode
				basePart.setCommChannelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory)) {
				// init part
				rtpMultiprocessorCategorySettings = new EObjectFlatComboSettings(hpProcessorInterconnector, HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_RtpMultiprocessorCategory());
				basePart.initRtpMultiprocessorCategory(rtpMultiprocessorCategorySettings);
			}
			// init filters
			
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits)) {
				basePart.addFilterToProcessingUnits(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInProcessingUnitsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToProcessingUnits(new EObjectFilter(HardwarePlatformPackage.Literals.HP_PROCESSING_UNIT));
				// Start of user code for additional businessfilters for processingUnits
				// End of user code
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel)) {
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
		if (editorKey == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_Name();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_ProcessingUnits();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_CommChannel();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory) {
			return HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_RtpMultiprocessorCategory();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HpProcessorInterconnector hpProcessorInterconnector = (HpProcessorInterconnector)semanticObject;
		if (HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name == event.getAffectedEditor()) {
			hpProcessorInterconnector.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HpProcessingUnit) {
					processingUnitsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processingUnitsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processingUnitsSettings.move(event.getNewIndex(), (HpProcessingUnit) event.getNewValue());
			}
		}
		if (HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel == event.getAffectedEditor()) {
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
		if (HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpMultiprocessorCategorySettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpMultiprocessorCategorySettings, editingContext.getAdapterFactory());
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
						rtpMultiprocessorCategorySettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpMultiprocessorCategorySettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpMultiprocessorCategorySettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpMultiprocessorCategorySettings.setToReference(null);
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
			HpProcessorInterconnectorPropertiesEditionPart basePart = (HpProcessorInterconnectorPropertiesEditionPart)editingPart;
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_ProcessingUnits().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits))
				basePart.updateProcessingUnits();
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_CommChannel().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel))
				basePart.setCommChannel((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_RtpMultiprocessorCategory().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory))
				basePart.setRtpMultiprocessorCategory((EObject)msg.getNewValue());
			
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
			HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_Name(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_ProcessingUnits(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_CommChannel(),
			HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_RtpMultiprocessorCategory()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name || key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits || key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory;
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
				if (HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HardwarePlatformPackage.eINSTANCE.getHpProcessorInterconnector_Name().getEAttributeType(), newValue);
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
