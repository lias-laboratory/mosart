/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDataRateTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public class RtpDataRateTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for value SingleCompositionEditor
	 */
	private EObjectFlatComboSettings valueSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpDataRateTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpDataRateType, String editing_mode) {
		super(editingContext, rtpDataRateType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpHelperTypesViewsRepository.class;
		partKey = RtpHelperTypesViewsRepository.RtpDataRateType.class;
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
			
			final RtpDataRateType rtpDataRateType = (RtpDataRateType)elt;
			final RtpDataRateTypePropertiesEditionPart basePart = (RtpDataRateTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpHelperTypesViewsRepository.RtpDataRateType.Properties.unit)) {
				basePart.initUnit(EEFUtils.choiceOfValues(rtpDataRateType, RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Unit()), rtpDataRateType.getUnit());
			}
			if (isAccessible(RtpHelperTypesViewsRepository.RtpDataRateType.Properties.value)) {
				// init part
				valueSettings = new EObjectFlatComboSettings(rtpDataRateType, RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Value());
				basePart.initValue(valueSettings);
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
		if (editorKey == RtpHelperTypesViewsRepository.RtpDataRateType.Properties.unit) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Unit();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpDataRateType.Properties.value) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Value();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpDataRateType rtpDataRateType = (RtpDataRateType)semanticObject;
		if (RtpHelperTypesViewsRepository.RtpDataRateType.Properties.unit == event.getAffectedEditor()) {
			rtpDataRateType.setUnit((DataTxRateUnits)event.getNewValue());
		}
		if (RtpHelperTypesViewsRepository.RtpDataRateType.Properties.value == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.EDIT) {
				if (valueSettings.getValue() == "") {
					EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, valueSettings, editingContext.getAdapterFactory());
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
						valueSettings.setToReference(result);
					}
				} else {
					EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) valueSettings.getValue(), editingContext.getAdapterFactory());
					PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(valueSettings.getValue(), PropertiesEditingProvider.class);
					if (provider != null) {
						PropertiesEditingPolicy policy = provider.getPolicy(context);
						if (policy != null) {
							policy.execute();
						}
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.UNSET) {
				valueSettings.setToReference(null);
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
			RtpDataRateTypePropertiesEditionPart basePart = (RtpDataRateTypePropertiesEditionPart)editingPart;
			if (RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Unit().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && isAccessible(RtpHelperTypesViewsRepository.RtpDataRateType.Properties.unit))
				basePart.setUnit((DataTxRateUnits)msg.getNewValue());
			
			if (RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Value().equals(msg.getFeature()) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpDataRateType.Properties.value))
				basePart.setValue((EObject)msg.getNewValue());
			
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
			RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Unit(),
			RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Value()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpHelperTypesViewsRepository.RtpDataRateType.Properties.unit || key == RtpHelperTypesViewsRepository.RtpDataRateType.Properties.value;
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
				if (RtpHelperTypesViewsRepository.RtpDataRateType.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpHelperTypesPackage.eINSTANCE.getRtpDataRateType_Unit().getEAttributeType(), newValue);
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
