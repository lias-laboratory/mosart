/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart;
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
public class MeasuredRealPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public MeasuredRealPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject measuredReal, String editing_mode) {
		super(editingContext, measuredReal, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.MeasuredReal.class;
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
			
			final MeasuredReal measuredReal = (MeasuredReal)elt;
			final MeasuredRealPropertiesEditionPart basePart = (MeasuredRealPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, measuredReal.getValue()));
			}
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName))
				basePart.setUnknownValueName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, measuredReal.getUnknownValueName()));
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions))
				basePart.setToolUsedDescriptions(measuredReal.getToolUsedDescriptions());
			
			if (isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues))
				basePart.setAllOldValues(measuredReal.getAllOldValues());
			
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
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_Value();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_UnknownValueName();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_ToolUsedDescriptions();
		}
		if (editorKey == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues) {
			return RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_AllOldValues();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		MeasuredReal measuredReal = (MeasuredReal)semanticObject;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			MeasuredRealPropertiesEditionPart basePart = (MeasuredRealPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_Value().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_UnknownValueName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName)) {
				if (msg.getNewValue() != null) {
					basePart.setUnknownValueName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUnknownValueName("");
				}
			}
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_ToolUsedDescriptions().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions)) {
				basePart.setToolUsedDescriptions((EList<?>)msg.getNewValue());
			}
			
			if (RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_AllOldValues().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues)) {
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
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_Value(),
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_UnknownValueName(),
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_ToolUsedDescriptions(),
			RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_AllOldValues()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value || key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName;
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
				if (RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_Value().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_UnknownValueName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_UnknownValueName().getEAttributeType(), newValue);
				}
				if (RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_ToolUsedDescriptions().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_AllOldValues().getEAttributeType(), iterator.next()));
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
