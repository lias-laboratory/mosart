/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.components;

// Start of user code for imports
import MoSaRT.HardwarePlatform.HardwarePlatformFactory;
import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpNetworkPort;

import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

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

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class HpNetworkPortPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for commChannel EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings commChannelSettings;
	
	/**
	 * Settings for rtpFlowRate SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpFlowRateSettings;
	
	/**
	 * Settings for rtpTransmissionMode SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpTransmissionModeSettings;
	
	/**
	 * Settings for rtpNetworkProtocol SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpNetworkProtocolSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public HpNetworkPortPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject hpNetworkPort, String editing_mode) {
		super(editingContext, hpNetworkPort, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HardwarePlatformViewsRepository.class;
		partKey = HardwarePlatformViewsRepository.HpNetworkPort.class;
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
			
			final HpNetworkPort hpNetworkPort = (HpNetworkPort)elt;
			final HpNetworkPortPropertiesEditionPart basePart = (HpNetworkPortPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, hpNetworkPort.getName()));
			
			if (isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel)) {
				// init part
				commChannelSettings = new EObjectFlatComboSettings(hpNetworkPort, HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_CommChannel());
				basePart.initCommChannel(commChannelSettings);
				// set the button mode
				basePart.setCommChannelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate)) {
				// init part
				rtpFlowRateSettings = new EObjectFlatComboSettings(hpNetworkPort, HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpFlowRate());
				basePart.initRtpFlowRate(rtpFlowRateSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode)) {
				// init part
				rtpTransmissionModeSettings = new EObjectFlatComboSettings(hpNetworkPort, HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpTransmissionMode());
				basePart.initRtpTransmissionMode(rtpTransmissionModeSettings);
			}
			if (isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol)) {
				// init part
				rtpNetworkProtocolSettings = new EObjectFlatComboSettings(hpNetworkPort, HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpNetworkProtocol());
				basePart.initRtpNetworkProtocol(rtpNetworkProtocolSettings);
			}
			// init filters
			
			if (isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel)) {
				basePart.addFilterToCommChannel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof HpCommunicationChannel);
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
		if (editorKey == HardwarePlatformViewsRepository.HpNetworkPort.Properties.name) {
			return HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_Name();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel) {
			return HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_CommChannel();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate) {
			return HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpFlowRate();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode) {
			return HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpTransmissionMode();
		}
		if (editorKey == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol) {
			return HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpNetworkProtocol();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HpNetworkPort hpNetworkPort = (HpNetworkPort)semanticObject;
		if (HardwarePlatformViewsRepository.HpNetworkPort.Properties.name == event.getAffectedEditor()) {
			hpNetworkPort.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel == event.getAffectedEditor()) {
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
		if (HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpFlowRateSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpFlowRateSettings, editingContext.getAdapterFactory());
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
						rtpFlowRateSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpFlowRateSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpFlowRateSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpFlowRateSettings.setToReference(null);
			}
			
		}
		if (HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpTransmissionModeSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpTransmissionModeSettings, editingContext.getAdapterFactory());
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
						rtpTransmissionModeSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpTransmissionModeSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpTransmissionModeSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpTransmissionModeSettings.setToReference(null);
			}
			
		}
		if (HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (rtpNetworkProtocolSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, rtpNetworkProtocolSettings, editingContext.getAdapterFactory());
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
						rtpNetworkProtocolSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) rtpNetworkProtocolSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(rtpNetworkProtocolSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				rtpNetworkProtocolSettings.setToReference(null);
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
			HpNetworkPortPropertiesEditionPart basePart = (HpNetworkPortPropertiesEditionPart)editingPart;
			if (HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_CommChannel().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel))
				basePart.setCommChannel((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpFlowRate().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate))
				basePart.setRtpFlowRate((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpTransmissionMode().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode))
				basePart.setRtpTransmissionMode((EObject)msg.getNewValue());
			if (HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpNetworkProtocol().equals(msg.getFeature()) && basePart != null && isAccessible(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol))
				basePart.setRtpNetworkProtocol((EObject)msg.getNewValue());
			
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
			HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_Name(),
			HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_CommChannel(),
			HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpFlowRate(),
			HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpTransmissionMode(),
			HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_RtpNetworkProtocol()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.name || key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel || key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode || key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol;
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
				if (HardwarePlatformViewsRepository.HpNetworkPort.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HardwarePlatformPackage.eINSTANCE.getHpNetworkPort_Name().getEAttributeType(), newValue);
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
