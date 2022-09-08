/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;


// End of user code

/**
 * 
 * 
 */
public class IntegerIntervalPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public IntegerIntervalPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject integerInterval, String editing_mode) {
		super(editingContext, integerInterval, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.IntegerInterval.class;
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
			
			final IntegerInterval integerInterval = (IntegerInterval)elt;
			final IntegerIntervalPropertiesEditionPart basePart = (IntegerIntervalPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin)) {
				basePart.initDelimiterMin(EEFUtils.choiceOfValues(integerInterval, RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMin()), integerInterval.getDelimiterMin());
			}
			if (isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin)) {
				basePart.setBoundMin(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, integerInterval.getBoundMin()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax)) {
				basePart.setBoundMax(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, integerInterval.getBoundMax()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax)) {
				basePart.initDelimiterMax(EEFUtils.choiceOfValues(integerInterval, RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMax()), integerInterval.getDelimiterMax());
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
		if (editorKey == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin) {
			return RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMin();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin) {
			return RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMin();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax) {
			return RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMax();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax) {
			return RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMax();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		IntegerInterval integerInterval = (IntegerInterval)semanticObject;
		if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin == event.getAffectedEditor()) {
			integerInterval.setDelimiterMin((DelimiterType)event.getNewValue());
		}
		if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin == event.getAffectedEditor()) {
			integerInterval.setBoundMin((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax == event.getAffectedEditor()) {
			integerInterval.setBoundMax((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax == event.getAffectedEditor()) {
			integerInterval.setDelimiterMax((DelimiterType)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			IntegerIntervalPropertiesEditionPart basePart = (IntegerIntervalPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null  && isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin))
				basePart.setDelimiterMin((Object)msg.getNewValue());
			
			if (RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin)) {
				if (msg.getNewValue() != null) {
					basePart.setBoundMin(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setBoundMin("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMax().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax)) {
				if (msg.getNewValue() != null) {
					basePart.setBoundMax(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setBoundMax("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMax().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null  && isAccessible(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax))
				basePart.setDelimiterMax((Object)msg.getNewValue());
			
			
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
			RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMin(),
			RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMin(),
			RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMax(),
			RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMax()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin || key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin || key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax || key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax;
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
				if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMin().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMin().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMax().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_BoundMax().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMax().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getIntegerInterval_DelimiterMax().getEAttributeType(), newValue);
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
