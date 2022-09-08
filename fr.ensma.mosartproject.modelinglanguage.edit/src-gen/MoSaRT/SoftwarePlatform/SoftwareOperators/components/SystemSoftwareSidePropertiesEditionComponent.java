/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.components;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.SoftwareOperatorsPackage;
import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;

import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public class SystemSoftwareSidePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base MoSaRT FrontEnd"; //$NON-NLS-1$

	
	/**
	 * Settings for systemBehavior EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings systemBehaviorSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public SystemSoftwareSidePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject systemSoftwareSide, String editing_mode) {
		super(editingContext, systemSoftwareSide, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = SoftwareOperatorsViewsRepository.class;
		partKey = SoftwareOperatorsViewsRepository.SystemSoftwareSide.class;
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
			
			final SystemSoftwareSide systemSoftwareSide = (SystemSoftwareSide)elt;
			final SystemSoftwareSidePropertiesEditionPart basePart = (SystemSoftwareSidePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, systemSoftwareSide.getName()));
			
			if (isAccessible(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior)) {
				// init part
				systemBehaviorSettings = new EObjectFlatComboSettings(systemSoftwareSide, SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_SystemBehavior());
				basePart.initSystemBehavior(systemBehaviorSettings);
				// set the button mode
				basePart.setSystemBehaviorButtonMode(ButtonsModeEnum.CREATE);
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
		if (editorKey == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name) {
			return SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_Name();
		}
		if (editorKey == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior) {
			return SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_SystemBehavior();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		SystemSoftwareSide systemSoftwareSide = (SystemSoftwareSide)semanticObject;
		if (SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name == event.getAffectedEditor()) {
			systemSoftwareSide.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			SystemSoftwareSidePropertiesEditionPart basePart = (SystemSoftwareSidePropertiesEditionPart)editingPart;
			if (SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_SystemBehavior().equals(msg.getFeature()) && basePart != null && isAccessible(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior))
				basePart.setSystemBehavior((EObject)msg.getNewValue());
			
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
			SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_Name(),
			SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_SystemBehavior()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name;
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
				if (SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SoftwareOperatorsPackage.eINSTANCE.getSystemSoftwareSide_Name().getEAttributeType(), newValue);
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
