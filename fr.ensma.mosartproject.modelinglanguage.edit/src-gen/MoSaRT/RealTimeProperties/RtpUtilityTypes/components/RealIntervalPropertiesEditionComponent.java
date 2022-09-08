/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart;
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
public class RealIntervalPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public RealIntervalPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject realInterval, String editing_mode) {
		super(editingContext, realInterval, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.RealInterval.class;
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
			
			final RealInterval realInterval = (RealInterval)elt;
			final RealIntervalPropertiesEditionPart basePart = (RealIntervalPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin)) {
				basePart.initDelimiterMin(EEFUtils.choiceOfValues(realInterval, RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMin()), realInterval.getDelimiterMin());
			}
			if (isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin)) {
				basePart.setBoundMin(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, realInterval.getBoundMin()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax)) {
				basePart.setBoundMax(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, realInterval.getBoundMax()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax)) {
				basePart.initDelimiterMax(EEFUtils.choiceOfValues(realInterval, RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMax()), realInterval.getDelimiterMax());
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
		if (editorKey == RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin) {
			return RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMin();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin) {
			return RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMin();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax) {
			return RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMax();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax) {
			return RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMax();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RealInterval realInterval = (RealInterval)semanticObject;
		if (RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin == event.getAffectedEditor()) {
			realInterval.setDelimiterMin((DelimiterType)event.getNewValue());
		}
		if (RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin == event.getAffectedEditor()) {
			realInterval.setBoundMin((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax == event.getAffectedEditor()) {
			realInterval.setBoundMax((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax == event.getAffectedEditor()) {
			realInterval.setDelimiterMax((DelimiterType)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			RealIntervalPropertiesEditionPart basePart = (RealIntervalPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null  && isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin))
				basePart.setDelimiterMin((Object)msg.getNewValue());
			
			if (RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMin().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin)) {
				if (msg.getNewValue() != null) {
					basePart.setBoundMin(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setBoundMin("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMax().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax)) {
				if (msg.getNewValue() != null) {
					basePart.setBoundMax(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setBoundMax("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMax().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null  && isAccessible(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax))
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
			RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMin(),
			RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMin(),
			RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMax(),
			RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMax()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin || key == RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin || key == RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax || key == RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax;
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
				if (RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMin().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMin().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMin().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMax().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_BoundMax().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMax().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getRealInterval_DelimiterMax().getEAttributeType(), newValue);
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
