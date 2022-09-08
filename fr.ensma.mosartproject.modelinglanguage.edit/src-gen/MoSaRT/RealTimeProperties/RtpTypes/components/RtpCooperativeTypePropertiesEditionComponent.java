/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.components;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.SoftwareBehaviorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class RtpCooperativeTypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for nonPreemptibleSteps ReferencesTable
	 */
	private ReferencesTableSettings nonPreemptibleStepsSettings;
	
	/**
	 * Settings for nonPreemptibleIntervals ReferencesTable
	 */
	protected ReferencesTableSettings nonPreemptibleIntervalsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public RtpCooperativeTypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject rtpCooperativeType, String editing_mode) {
		super(editingContext, rtpCooperativeType, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RtpTypesViewsRepository.class;
		partKey = RtpTypesViewsRepository.RtpCooperativeType.class;
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
			
			final RtpCooperativeType rtpCooperativeType = (RtpCooperativeType)elt;
			final RtpCooperativeTypePropertiesEditionPart basePart = (RtpCooperativeTypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps)) {
				nonPreemptibleStepsSettings = new ReferencesTableSettings(rtpCooperativeType, RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleSteps());
				basePart.initNonPreemptibleSteps(nonPreemptibleStepsSettings);
			}
			if (isAccessible(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals)) {
				nonPreemptibleIntervalsSettings = new ReferencesTableSettings(rtpCooperativeType, RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleIntervals());
				basePart.initNonPreemptibleIntervals(nonPreemptibleIntervalsSettings);
			}
			// init filters
			if (isAccessible(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps)) {
				basePart.addFilterToNonPreemptibleSteps(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInNonPreemptibleStepsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToNonPreemptibleSteps(new EObjectFilter(SoftwareBehaviorPackage.Literals.SB_STEP));
				// Start of user code for additional businessfilters for nonPreemptibleSteps
				// End of user code
			}
			if (isAccessible(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals)) {
				basePart.addFilterToNonPreemptibleIntervals(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof RtpExecutionTimeType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for nonPreemptibleIntervals
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
		if (editorKey == RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps) {
			return RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleSteps();
		}
		if (editorKey == RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals) {
			return RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleIntervals();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		RtpCooperativeType rtpCooperativeType = (RtpCooperativeType)semanticObject;
		if (RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof SbStep) {
					nonPreemptibleStepsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				nonPreemptibleStepsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				nonPreemptibleStepsSettings.move(event.getNewIndex(), (SbStep) event.getNewValue());
			}
		}
		if (RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, nonPreemptibleIntervalsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				nonPreemptibleIntervalsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				nonPreemptibleIntervalsSettings.move(event.getNewIndex(), (RtpExecutionTimeType) event.getNewValue());
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
			RtpCooperativeTypePropertiesEditionPart basePart = (RtpCooperativeTypePropertiesEditionPart)editingPart;
			if (RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleSteps().equals(msg.getFeature())  && isAccessible(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps))
				basePart.updateNonPreemptibleSteps();
			if (RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleIntervals().equals(msg.getFeature()) && isAccessible(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals))
				basePart.updateNonPreemptibleIntervals();
			
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
			RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleSteps(),
			RtpTypesPackage.eINSTANCE.getRtpCooperativeType_NonPreemptibleIntervals()		);
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

}
