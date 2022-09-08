/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgIntegerPropertiesEditionPart;
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
public class MaxMinAvgIntegerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public MaxMinAvgIntegerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject maxMinAvgInteger, String editing_mode) {
		super(editingContext, maxMinAvgInteger, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.MaxMinAvgInteger.class;
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
			
			final MaxMinAvgInteger maxMinAvgInteger = (MaxMinAvgInteger)elt;
			final MaxMinAvgIntegerPropertiesEditionPart basePart = (MaxMinAvgIntegerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.minValue)) {
				basePart.setMinValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, maxMinAvgInteger.getMinValue()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.avgValue)) {
				basePart.setAvgValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, maxMinAvgInteger.getAvgValue()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.maxValue)) {
				basePart.setMaxValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, maxMinAvgInteger.getMaxValue()));
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
		if (editorKey == RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.minValue) {
			return RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MinValue();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.avgValue) {
			return RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_AvgValue();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.maxValue) {
			return RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MaxValue();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MaxMinAvgInteger maxMinAvgInteger = (MaxMinAvgInteger)semanticObject;
		if (RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.minValue == event.getAffectedEditor()) {
			maxMinAvgInteger.setMinValue((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.avgValue == event.getAffectedEditor()) {
			maxMinAvgInteger.setAvgValue((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.maxValue == event.getAffectedEditor()) {
			maxMinAvgInteger.setMaxValue((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MaxMinAvgIntegerPropertiesEditionPart basePart = (MaxMinAvgIntegerPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MinValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.minValue)) {
				if (msg.getNewValue() != null) {
					basePart.setMinValue(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setMinValue("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_AvgValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.avgValue)) {
				if (msg.getNewValue() != null) {
					basePart.setAvgValue(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setAvgValue("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MaxValue().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.maxValue)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxValue(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
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
			RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MinValue(),
			RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_AvgValue(),
			RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MaxValue()		);
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
				if (RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.minValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MinValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MinValue().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.avgValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_AvgValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_AvgValue().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MaxMinAvgInteger.Properties.maxValue == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MaxValue().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMaxMinAvgInteger_MaxValue().getEAttributeType(), newValue);
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
