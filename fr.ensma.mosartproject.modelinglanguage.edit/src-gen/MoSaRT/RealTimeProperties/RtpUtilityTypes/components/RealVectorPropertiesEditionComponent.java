/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealVectorPropertiesEditionPart;
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
public class RealVectorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public RealVectorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject realVector, String editing_mode) {
		super(editingContext, realVector, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpUtilityTypesViewsRepository.class;
		partKey = RtpUtilityTypesViewsRepository.RealVector.class;
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
			
			final RealVector realVector = (RealVector)elt;
			final RealVectorPropertiesEditionPart basePart = (RealVectorPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpUtilityTypesViewsRepository.RealVector.Properties.vectorElements))
				basePart.setVectorElements(realVector.getVectorElements());
			
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
		if (editorKey == RtpUtilityTypesViewsRepository.RealVector.Properties.vectorElements) {
			return RtpUtilityTypesPackage.eINSTANCE.getRealVector_VectorElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RealVector realVector = (RealVector)semanticObject;
		if (RtpUtilityTypesViewsRepository.RealVector.Properties.vectorElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				realVector.getVectorElements().clear();
				realVector.getVectorElements().addAll(((EList) event.getNewValue()));
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
			RealVectorPropertiesEditionPart basePart = (RealVectorPropertiesEditionPart)editingPart;
			if (RtpUtilityTypesPackage.eINSTANCE.getRealVector_VectorElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpUtilityTypesViewsRepository.RealVector.Properties.vectorElements)) {
				basePart.setVectorElements((EList<?>)msg.getNewValue());
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
			RtpUtilityTypesPackage.eINSTANCE.getRealVector_VectorElements()		);
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
				if (RtpUtilityTypesViewsRepository.RealVector.Properties.vectorElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(RtpUtilityTypesPackage.eINSTANCE.getRealVector_VectorElements().getEAttributeType(), iterator.next()));
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
