/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class MaxMinAvgRealPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public MaxMinAvgRealPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject maxMinAvgReal, String editing_mode) {
		super(editingContext, maxMinAvgReal, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.MaxMinAvgReal.class;
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
			
			final MaxMinAvgReal maxMinAvgReal = (MaxMinAvgReal)elt;
			final MaxMinAvgRealPropertiesEditionPart basePart = (MaxMinAvgRealPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue)) {
				basePart.setMinValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, maxMinAvgReal.getMinValue()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue)) {
				basePart.setAvgValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, maxMinAvgReal.getAvgValue()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue)) {
				basePart.setMaxValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, maxMinAvgReal.getMaxValue()));
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
		if (editorKey == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue) {
			return RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MinValue();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue) {
			return RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_AvgValue();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue) {
			return RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MaxValue();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MaxMinAvgReal maxMinAvgReal = (MaxMinAvgReal)semanticObject;
		if (RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue == event.getAffectedEditor()) {
			maxMinAvgReal.setMinValue((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue == event.getAffectedEditor()) {
			maxMinAvgReal.setAvgValue((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue == event.getAffectedEditor()) {
			maxMinAvgReal.setMaxValue((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MaxMinAvgRealPropertiesEditionPart basePart = (MaxMinAvgRealPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MinValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue)) {
				if (msg.getNewValue() != null) {
					basePart.setMinValue(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setMinValue("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_AvgValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue)) {
				if (msg.getNewValue() != null) {
					basePart.setAvgValue(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setAvgValue("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MaxValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxValue(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setMaxValue("");
				}
			}
			
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
			RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MinValue(),
			RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_AvgValue(),
			RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MaxValue()		);
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
				if (RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MinValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MinValue().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_AvgValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_AvgValue().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MaxValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgReal_MaxValue().getEAttributeType(), newValue);
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
