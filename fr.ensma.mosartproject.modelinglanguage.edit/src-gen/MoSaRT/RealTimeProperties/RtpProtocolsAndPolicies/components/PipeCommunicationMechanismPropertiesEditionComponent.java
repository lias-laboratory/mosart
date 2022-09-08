/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PipeCommunicationMechanism;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.RtpProtocolsAndPoliciesViewsRepository;

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

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public class PipeCommunicationMechanismPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for RtpDataSize SingleCompositionEditor
	 */
	private EObjectFlatComboSettings rtpDataSizeSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public PipeCommunicationMechanismPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject pipeCommunicationMechanism, String editing_mode) {
		super(editingContext, pipeCommunicationMechanism, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpProtocolsAndPoliciesViewsRepository.class;
		partKey = RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.class;
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
			
			final PipeCommunicationMechanism pipeCommunicationMechanism = (PipeCommunicationMechanism)elt;
			final PipeCommunicationMechanismPropertiesEditionPart basePart = (PipeCommunicationMechanismPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType))
				basePart.setMechanismType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, pipeCommunicationMechanism.getMechanismType()));
			
			if (isAccessible(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize)) {
				// init part
				rtpDataSizeSettings = new EObjectFlatComboSettings(pipeCommunicationMechanism, RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_RtpDataSize());
				basePart.initRtpDataSize(rtpDataSizeSettings);
			}
			// init filters
			
			
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
		if (editorKey == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType) {
			return RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_MechanismType();
		}
		if (editorKey == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize) {
			return RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_RtpDataSize();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PipeCommunicationMechanism pipeCommunicationMechanism = (PipeCommunicationMechanism)semanticObject;
		if (RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize == event.getAffectedEditor()) {
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
			PipeCommunicationMechanismPropertiesEditionPart basePart = (PipeCommunicationMechanismPropertiesEditionPart)editingPart;
			if (RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_MechanismType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType)) {
				if (msg.getNewValue() != null) {
					basePart.setMechanismType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMechanismType("");
				}
			}
			if (RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_RtpDataSize().equals(msg.getFeature()) && basePart != null && isAccessible(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize))
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
			RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_MechanismType(),
			RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_RtpDataSize()		);
		return new NotificationFilter[] {filter,};
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
				if (RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_MechanismType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpCommunicationMechanismType_MechanismType().getEAttributeType(), newValue);
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
