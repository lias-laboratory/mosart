/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PartitionedTaskAllocationPropertiesEditionPart;
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
public class PartitionedTaskAllocationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PartitionedTaskAllocationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject partitionedTaskAllocation, String editing_mode) {
		super(editingContext, partitionedTaskAllocation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpProtocolsAndPoliciesViewsRepository.class;
		partKey = RtpProtocolsAndPoliciesViewsRepository.PartitionedTaskAllocation.class;
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
			
			final PartitionedTaskAllocation partitionedTaskAllocation = (PartitionedTaskAllocation)elt;
			final PartitionedTaskAllocationPropertiesEditionPart basePart = (PartitionedTaskAllocationPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpProtocolsAndPoliciesViewsRepository.PartitionedTaskAllocation.Properties.allocationType))
				basePart.setAllocationType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, partitionedTaskAllocation.getAllocationType()));
			
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
		if (editorKey == RtpProtocolsAndPoliciesViewsRepository.PartitionedTaskAllocation.Properties.allocationType) {
			return RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpTaskAllocationType_AllocationType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		PartitionedTaskAllocation partitionedTaskAllocation = (PartitionedTaskAllocation)semanticObject;
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			PartitionedTaskAllocationPropertiesEditionPart basePart = (PartitionedTaskAllocationPropertiesEditionPart)editingPart;
			if (RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpTaskAllocationType_AllocationType().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpProtocolsAndPoliciesViewsRepository.PartitionedTaskAllocation.Properties.allocationType)) {
				if (msg.getNewValue() != null) {
					basePart.setAllocationType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAllocationType("");
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
			RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpTaskAllocationType_AllocationType()		);
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
				if (RtpProtocolsAndPoliciesViewsRepository.PartitionedTaskAllocation.Properties.allocationType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpTaskAllocationType_AllocationType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpProtocolsAndPoliciesPackage.eINSTANCE.getRtpTaskAllocationType_AllocationType().getEAttributeType(), newValue);
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
