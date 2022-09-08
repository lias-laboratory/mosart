/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

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

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class RtpExecutionTimeCalculatedValuePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for allOldValues ReferencesTable
	 */
	protected ReferencesTableSettings allOldValuesSettings;
	
	/**
	 * Settings for value SingleCompositionEditor
	 */
	private EObjectFlatComboSettings valueSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpExecutionTimeCalculatedValuePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpExecutionTimeCalculatedValue, String editing_mode) {
		super(editingContext, rtpExecutionTimeCalculatedValue, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpHelperTypesViewsRepository.class;
		partKey = RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.class;
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
			
			final RtpExecutionTimeCalculatedValue rtpExecutionTimeCalculatedValue = (RtpExecutionTimeCalculatedValue)elt;
			final RtpExecutionTimeCalculatedValuePropertiesEditionPart basePart = (RtpExecutionTimeCalculatedValuePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName))
				basePart.setUnknownValueName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, rtpExecutionTimeCalculatedValue.getUnknownValueName()));
			
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions))
				basePart.setToolUsedDescriptions(rtpExecutionTimeCalculatedValue.getToolUsedDescriptions());
			
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues)) {
				allOldValuesSettings = new ReferencesTableSettings(rtpExecutionTimeCalculatedValue, RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_AllOldValues());
				basePart.initAllOldValues(allOldValuesSettings);
			}
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value)) {
				// init part
				valueSettings = new EObjectFlatComboSettings(rtpExecutionTimeCalculatedValue, RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_Value());
				basePart.initValue(valueSettings);
			}
			// init filters
			
			
			if (isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues)) {
				basePart.addFilterToAllOldValues(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RtpExecutionTimeConcreteValue); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for allOldValues
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
		if (editorKey == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_UnknownValueName();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_AllOldValues();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_Value();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpExecutionTimeCalculatedValue rtpExecutionTimeCalculatedValue = (RtpExecutionTimeCalculatedValue)semanticObject;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			RtpExecutionTimeCalculatedValuePropertiesEditionPart basePart = (RtpExecutionTimeCalculatedValuePropertiesEditionPart)editingPart;
			if (RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_UnknownValueName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName)) {
				if (msg.getNewValue() != null) {
					basePart.setUnknownValueName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUnknownValueName("");
				}
			}
			if (RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions)) {
				basePart.setToolUsedDescriptions((EList<?>)msg.getNewValue());
			}
			
			if (RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_AllOldValues().equals(msg.getFeature()) && isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues))
				basePart.updateAllOldValues();
			if (RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_Value().equals(msg.getFeature()) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value))
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
			RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_UnknownValueName(),
			RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions(),
			RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_AllOldValues(),
			RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_Value()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName || key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value;
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
				if (RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_UnknownValueName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_UnknownValueName().getEAttributeType(), newValue);
				}
				if (RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions().getEAttributeType(), iterator.next()));
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
