/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HeterogenousMultiprocessorCategory;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.HeterogenousMultiprocessorCategoryPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.RtpProtocolsAndPoliciesViewsRepository;

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
public class HeterogenousMultiprocessorCategoryPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public HeterogenousMultiprocessorCategoryPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject heterogenousMultiprocessorCategory, String editing_mode) {
		super(editingContext, heterogenousMultiprocessorCategory, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpProtocolsAndPoliciesViewsRepository.class;
		partKey = RtpProtocolsAndPoliciesViewsRepository.HeterogenousMultiprocessorCategory.class;
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
			
			final HeterogenousMultiprocessorCategory heterogenousMultiprocessorCategory = (HeterogenousMultiprocessorCategory)elt;
			final HeterogenousMultiprocessorCategoryPropertiesEditionPart basePart = (HeterogenousMultiprocessorCategoryPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpProtocolsAndPoliciesViewsRepository.HeterogenousMultiprocessorCategory.Properties.categoryType))
				basePart.setCategoryType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, heterogenousMultiprocessorCategory.getCategoryType()));
			
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
		if (editorKey == RtpProtocolsAndPoliciesViewsRepository.HeterogenousMultiprocessorCategory.Properties.categoryType) {
			return RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpMultiprocessorCategoryType_CategoryType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		HeterogenousMultiprocessorCategory heterogenousMultiprocessorCategory = (HeterogenousMultiprocessorCategory)semanticObject;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			HeterogenousMultiprocessorCategoryPropertiesEditionPart basePart = (HeterogenousMultiprocessorCategoryPropertiesEditionPart)editingPart;
			if (RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpMultiprocessorCategoryType_CategoryType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpProtocolsAndPoliciesViewsRepository.HeterogenousMultiprocessorCategory.Properties.categoryType)) {
				if (msg.getNewValue() != null) {
					basePart.setCategoryType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCategoryType("");
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
			RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpMultiprocessorCategoryType_CategoryType()		);
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
				if (RtpProtocolsAndPoliciesViewsRepository.HeterogenousMultiprocessorCategory.Properties.categoryType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpMultiprocessorCategoryType_CategoryType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpMultiprocessorCategoryType_CategoryType().getEAttributeType(), newValue);
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
