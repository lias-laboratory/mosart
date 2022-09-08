/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.RtpComputationAndAnalysisFunctionsViewsRepository;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.WeibullComputationFunctionPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class WeibullComputationFunctionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public WeibullComputationFunctionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject weibullComputationFunction, String editing_mode) {
		super(editingContext, weibullComputationFunction, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpComputationAndAnalysisFunctionsViewsRepository.class;
		partKey = RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.class;
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
			
			final WeibullComputationFunction weibullComputationFunction = (WeibullComputationFunction)elt;
			final WeibullComputationFunctionPropertiesEditionPart basePart = (WeibullComputationFunctionPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType))
				basePart.setFunctionType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, weibullComputationFunction.getFunctionType()));
			
			if (isAccessible(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters))
				basePart.setParameters(weibullComputationFunction.getParameters());
			
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
		if (editorKey == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType) {
			return RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getRtpComputationFunction_FunctionType();
		}
		if (editorKey == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters) {
			return RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getWeibullComputationFunction_Parameters();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		WeibullComputationFunction weibullComputationFunction = (WeibullComputationFunction)semanticObject;
		if (RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				weibullComputationFunction.getParameters().clear();
				weibullComputationFunction.getParameters().addAll(((EList) event.getNewValue()));
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
			WeibullComputationFunctionPropertiesEditionPart basePart = (WeibullComputationFunctionPropertiesEditionPart)editingPart;
			if (RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getRtpComputationFunction_FunctionType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType)) {
				if (msg.getNewValue() != null) {
					basePart.setFunctionType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunctionType("");
				}
			}
			if (RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getWeibullComputationFunction_Parameters().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters)) {
				basePart.setParameters((EList<?>)msg.getNewValue());
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
			RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getRtpComputationFunction_FunctionType(),
			RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getWeibullComputationFunction_Parameters()		);
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
				if (RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getRtpComputationFunction_FunctionType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getRtpComputationFunction_FunctionType().getEAttributeType(), newValue);
				}
				if (RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getWeibullComputationFunction_Parameters().getEAttributeType(), iterator.next()));
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
