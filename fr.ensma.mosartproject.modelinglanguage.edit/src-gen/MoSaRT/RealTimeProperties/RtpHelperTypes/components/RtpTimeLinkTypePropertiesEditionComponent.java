/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpScheduleLinkType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbSchedulingActivity;

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

import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class RtpTimeLinkTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for referenceActivity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings referenceActivitySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpTimeLinkTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpTimeLinkType, String editing_mode) {
		super(editingContext, rtpTimeLinkType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpHelperTypesViewsRepository.class;
		partKey = RtpHelperTypesViewsRepository.RtpTimeLinkType.class;
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
			
			final RtpTimeLinkType rtpTimeLinkType = (RtpTimeLinkType)elt;
			final RtpTimeLinkTypePropertiesEditionPart basePart = (RtpTimeLinkTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink)) {
				basePart.initScheduleLink(EEFUtils.choiceOfValues(rtpTimeLinkType, RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ScheduleLink()), rtpTimeLinkType.getScheduleLink());
			}
			if (isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber)) {
				basePart.setJobNumber(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, rtpTimeLinkType.getJobNumber()));
			}
			
			if (isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity)) {
				// init part
				referenceActivitySettings = new EObjectFlatComboSettings(rtpTimeLinkType, RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ReferenceActivity());
				basePart.initReferenceActivity(referenceActivitySettings);
				// set the button mode
				basePart.setReferenceActivityButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity)) {
				basePart.addFilterToReferenceActivity(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof SbSchedulingActivity);
					}
					
				});
				// Start of user code for additional businessfilters for referenceActivity
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
		if (editorKey == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ScheduleLink();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_JobNumber();
		}
		if (editorKey == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity) {
			return RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ReferenceActivity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpTimeLinkType rtpTimeLinkType = (RtpTimeLinkType)semanticObject;
		if (RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink == event.getAffectedEditor()) {
			rtpTimeLinkType.setScheduleLink((RtpScheduleLinkType)event.getNewValue());
		}
		if (RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber == event.getAffectedEditor()) {
			rtpTimeLinkType.setJobNumber((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				referenceActivitySettings.setToReference((SbSchedulingActivity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, referenceActivitySettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
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
			RtpTimeLinkTypePropertiesEditionPart basePart = (RtpTimeLinkTypePropertiesEditionPart)editingPart;
			if (RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ScheduleLink().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null  && isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink))
				basePart.setScheduleLink((Object)msg.getNewValue());
			
			if (RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_JobNumber().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber)) {
				if (msg.getNewValue() != null) {
					basePart.setJobNumber(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setJobNumber("");
				}
			}
			if (RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ReferenceActivity().equals(msg.getFeature()) && basePart != null && isAccessible(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity))
				basePart.setReferenceActivity((EObject)msg.getNewValue());
			
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
			RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ScheduleLink(),
			RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_JobNumber(),
			RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ReferenceActivity()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink || key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity;
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
				if (RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ScheduleLink().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_ScheduleLink().getEAttributeType(), newValue);
				}
				if (RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_JobNumber().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(RtpHelperTypesPackage.eINSTANCE.getRtpTimeLinkType_JobNumber().getEAttributeType(), newValue);
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
