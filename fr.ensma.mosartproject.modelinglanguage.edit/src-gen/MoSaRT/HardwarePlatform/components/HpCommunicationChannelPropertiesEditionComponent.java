/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.components;

// Start of user code for imports
import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpNetworkPort;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;

import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class HpCommunicationChannelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for processingUnits ReferencesTable
	 */
	private ReferencesTableSettings processingUnitsSettings;
	
	/**
	 * Settings for networkPort ReferencesTable
	 */
	private ReferencesTableSettings networkPortSettings;
	
	/**
	 * Settings for processingUnitSet ReferencesTable
	 */
	private ReferencesTableSettings processingUnitSetSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HpCommunicationChannelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hpCommunicationChannel, String editing_mode) {
		super(editingContext, hpCommunicationChannel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HardwarePlatformViewsRepository.class;
		partKey = HardwarePlatformViewsRepository.HpCommunicationChannel.class;
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
			
			final HpCommunicationChannel hpCommunicationChannel = (HpCommunicationChannel)elt;
			final HpCommunicationChannelPropertiesEditionPart basePart = (HpCommunicationChannelPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hpCommunicationChannel.getName()));
			
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits)) {
				processingUnitsSettings = new ReferencesTableSettings(hpCommunicationChannel, HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnits());
				basePart.initProcessingUnits(processingUnitsSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort)) {
				networkPortSettings = new ReferencesTableSettings(hpCommunicationChannel, HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_NetworkPort());
				basePart.initNetworkPort(networkPortSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet)) {
				processingUnitSetSettings = new ReferencesTableSettings(hpCommunicationChannel, HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnitSet());
				basePart.initProcessingUnitSet(processingUnitSetSettings);
			}
			// init filters
			
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits)) {
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
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort)) {
				basePart.addFilterToNetworkPort(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInNetworkPortTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToNetworkPort(new EObjectFilter(HardwarePlatformPackage.Literals.HP_NETWORK_PORT));
				// Start of user code for additional businessfilters for networkPort
				// End of user code
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet)) {
				basePart.addFilterToProcessingUnitSet(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInProcessingUnitSetTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToProcessingUnitSet(new EObjectFilter(HardwarePlatformPackage.Literals.HP_PROCESSOR_INTERCONNECTOR));
				// Start of user code for additional businessfilters for processingUnitSet
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
		if (editorKey == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name) {
			return HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_Name();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits) {
			return HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnits();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort) {
			return HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_NetworkPort();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet) {
			return HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnitSet();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HpCommunicationChannel hpCommunicationChannel = (HpCommunicationChannel)semanticObject;
		if (HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name == event.getAffectedEditor()) {
			hpCommunicationChannel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits == event.getAffectedEditor()) {
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
		if (HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HpNetworkPort) {
					networkPortSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				networkPortSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				networkPortSettings.move(event.getNewIndex(), (HpNetworkPort) event.getNewValue());
			}
		}
		if (HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof HpProcessorInterconnector) {
					processingUnitSetSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processingUnitSetSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processingUnitSetSettings.move(event.getNewIndex(), (HpProcessorInterconnector) event.getNewValue());
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
			HpCommunicationChannelPropertiesEditionPart basePart = (HpCommunicationChannelPropertiesEditionPart)editingPart;
			if (HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnits().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits))
				basePart.updateProcessingUnits();
			if (HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_NetworkPort().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort))
				basePart.updateNetworkPort();
			if (HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnitSet().equals(msg.getFeature())  && isAccessible(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet))
				basePart.updateProcessingUnitSet();
			
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
			HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_Name(),
			HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnits(),
			HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_NetworkPort(),
			HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_ProcessingUnitSet()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name || key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort;
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
				if (HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HardwarePlatformPackage.eINSTANCE.getHpCommunicationChannel_Name().getEAttributeType(), newValue);
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
