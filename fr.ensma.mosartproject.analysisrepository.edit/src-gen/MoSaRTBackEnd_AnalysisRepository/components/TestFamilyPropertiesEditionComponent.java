/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.Test;
import MoSaRTBackEnd_AnalysisRepository.TestFamily;

import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;
import MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart;

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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class TestFamilyPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for containedTests ReferencesTable
	 */
	private ReferencesTableSettings containedTestsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TestFamilyPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject testFamily, String editing_mode) {
		super(editingContext, testFamily, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.class;
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
			
			final TestFamily testFamily = (TestFamily)elt;
			final TestFamilyPropertiesEditionPart basePart = (TestFamilyPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, testFamily.getName()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, testFamily.getDescription()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references))
				basePart.setReferences(testFamily.getReferences());
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests)) {
				containedTestsSettings = new ReferencesTableSettings(testFamily, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_ContainedTests());
				basePart.initContainedTests(containedTestsSettings);
			}
			// init filters
			
			
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests)) {
				basePart.addFilterToContainedTests(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInContainedTestsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToContainedTests(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.TEST));
				// Start of user code for additional businessfilters for containedTests
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Name();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Description();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_References();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_ContainedTests();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TestFamily testFamily = (TestFamily)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name == event.getAffectedEditor()) {
			testFamily.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description == event.getAffectedEditor()) {
			testFamily.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				testFamily.getReferences().clear();
				testFamily.getReferences().addAll(((EList) event.getNewValue()));
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Test) {
					containedTestsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				containedTestsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				containedTestsSettings.move(event.getNewIndex(), (Test) event.getNewValue());
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
			TestFamilyPropertiesEditionPart basePart = (TestFamilyPropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_References().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references)) {
				basePart.setReferences((EList<?>)msg.getNewValue());
			}
			
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_ContainedTests().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests))
				basePart.updateContainedTests();
			
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Name(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Description(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_References(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_ContainedTests()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name;
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Name().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_Description().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_References().getEAttributeType(), iterator.next()));
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
