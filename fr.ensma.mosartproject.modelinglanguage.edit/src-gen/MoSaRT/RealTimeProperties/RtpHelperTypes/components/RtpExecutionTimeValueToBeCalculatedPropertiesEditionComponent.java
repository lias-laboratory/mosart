/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

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
public class RtpExecutionTimeValueToBeCalculatedPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for FunctionToBeRequested SingleCompositionEditor
	 */
	private EObjectFlatComboSettings functionToBeRequestedSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpExecutionTimeValueToBeCalculatedPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpExecutionTimeValueToBeCalculated, String editing_mode) {
		super(editingContext, rtpExecutionTimeValueToBeCalculated, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpHelperTypesViewsRepository.class;
		partKey = RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.class;
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
			
			final RtpExecutionTimeValueToBeCalculated rtpExecutionTimeValueToBeCalculated = (RtpExecutionTimeValueToBeCalculated)elt;
			final RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart basePart = (RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName))
				basePart.setUnknownValueName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, rtpExecutionTimeValueToBeCalculated.getUnknownValueName()));
			
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested)) {
				// init part
				functionToBeRequestedSettings = new EObjectFlatComboSettings(rtpExecutionTimeValueToBeCalculated, RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested());
				basePart.initFunctionToBeRequested(functionToBeRequestedSettings);
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
		if (editorKey == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_UnknownValueName();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpExecutionTimeValueToBeCalculated rtpExecutionTimeValueToBeCalculated = (RtpExecutionTimeValueToBeCalculated)semanticObject;
		if (RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName == event.getAffectedEditor()) {
			rtpExecutionTimeValueToBeCalculated.setUnknownValueName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (functionToBeRequestedSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, functionToBeRequestedSettings, editingContext.getAdapterFactory());
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
						functionToBeRequestedSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) functionToBeRequestedSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(functionToBeRequestedSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				functionToBeRequestedSettings.setToReference(null);
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
			RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart basePart = (RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart)editingPart;
			if (RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_UnknownValueName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName)) {
				if (msg.getNewValue() != null) {
					basePart.setUnknownValueName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUnknownValueName("");
				}
			}
			if (RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested().equals(msg.getFeature()) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested))
				basePart.setFunctionToBeRequested((EObject)msg.getNewValue());
			
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
			RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_UnknownValueName(),
			RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_FunctionToBeRequested()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName;
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
				if (RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_UnknownValueName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeValueToBeCalculated_UnknownValueName().getEAttributeType(), newValue);
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
