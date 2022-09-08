/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
public class MeasuredIntegerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public MeasuredIntegerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject measuredInteger, String editing_mode) {
		super(editingContext, measuredInteger, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.MeasuredInteger.class;
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
			
			final MeasuredInteger measuredInteger = (MeasuredInteger)elt;
			final MeasuredIntegerPropertiesEditionPart basePart = (MeasuredIntegerPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, measuredInteger.getValue()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName))
				basePart.setUnknownValueName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, measuredInteger.getUnknownValueName()));
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions))
				basePart.setToolUsedDescriptions(measuredInteger.getToolUsedDescriptions());
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues))
				basePart.setAllOldValues(measuredInteger.getAllOldValues());
			
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
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_Value();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_UnknownValueName();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_ToolUsedDescriptions();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_AllOldValues();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MeasuredInteger measuredInteger = (MeasuredInteger)semanticObject;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MeasuredIntegerPropertiesEditionPart basePart = (MeasuredIntegerPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_UnknownValueName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName)) {
				if (msg.getNewValue() != null) {
					basePart.setUnknownValueName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUnknownValueName("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_ToolUsedDescriptions().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions)) {
				basePart.setToolUsedDescriptions((EList<?>)msg.getNewValue());
			}
			
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_AllOldValues().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues)) {
				basePart.setAllOldValues((EList<?>)msg.getNewValue());
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
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_Value(),
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_UnknownValueName(),
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_ToolUsedDescriptions(),
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_AllOldValues()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value || key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName;
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
				if (RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_Value().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_UnknownValueName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_UnknownValueName().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_ToolUsedDescriptions().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_AllOldValues().getEAttributeType(), iterator.next()));
					}
					ret = chain;
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
