/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.components;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryFactory;
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;
import MoSaRTBackEnd_AnalysisRepository.Test;
import MoSaRTBackEnd_AnalysisRepository.TestCharacteristicType;
import MoSaRTBackEnd_AnalysisRepository.TestFamily;
import MoSaRTBackEnd_AnalysisRepository.Tool;

import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;
import MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class TestPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for itsTestFamily EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings itsTestFamilySettings;
	
	/**
	 * Settings for toolsToApply ReferencesTable
	 */
	private ReferencesTableSettings toolsToApplySettings;
	
	/**
	 * Settings for characteristics ReferencesTable
	 */
	protected ReferencesTableSettings characteristicsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TestPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject test, String editing_mode) {
		super(editingContext, test, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.class;
		partKey = MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.class;
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
			
			final Test test = (Test)elt;
			final TestPropertiesEditionPart basePart = (TestPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, test.getId()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, test.getName()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references))
				basePart.setReferences(test.getReferences());
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, test.getDescription()));
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily)) {
				// init part
				itsTestFamilySettings = new EObjectFlatComboSettings(test, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ItsTestFamily());
				basePart.initItsTestFamily(itsTestFamilySettings);
				// set the button mode
				basePart.setItsTestFamilyButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply)) {
				toolsToApplySettings = new ReferencesTableSettings(test, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ToolsToApply());
				basePart.initToolsToApply(toolsToApplySettings);
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics)) {
				characteristicsSettings = new ReferencesTableSettings(test, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Characteristics());
				basePart.initCharacteristics(characteristicsSettings);
			}
			// init filters
			
			
			
			
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily)) {
				basePart.addFilterToItsTestFamily(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TestFamily); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for itsTestFamily
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply)) {
				basePart.addFilterToToolsToApply(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInToolsToApplyTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToToolsToApply(new EObjectFilter(MoSaRTBackEnd_AnalysisRepositoryPackage.Literals.TOOL));
				// Start of user code for additional businessfilters for toolsToApply
				// End of user code
			}
			if (isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics)) {
				basePart.addFilterToCharacteristics(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TestCharacteristicType); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for characteristics
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
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Id();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Name();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_References();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Description();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ItsTestFamily();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ToolsToApply();
		}
		if (editorKey == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics) {
			return MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Characteristics();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Test test = (Test)semanticObject;
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id == event.getAffectedEditor()) {
			test.setId((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name == event.getAffectedEditor()) {
			test.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				test.getReferences().clear();
				test.getReferences().addAll(((EList) event.getNewValue()));
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description == event.getAffectedEditor()) {
			test.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				itsTestFamilySettings.setToReference((TestFamily)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TestFamily eObject = MoSaRTBackEnd_AnalysisRepositoryFactory.eINSTANCE.createTestFamily();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				itsTestFamilySettings.setToReference(eObject);
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof Tool) {
					toolsToApplySettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				toolsToApplySettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				toolsToApplySettings.move(event.getNewIndex(), (Tool) event.getNewValue());
			}
		}
		if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, characteristicsSettings, editingContext.getAdapterFactory());
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
				characteristicsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				characteristicsSettings.move(event.getNewIndex(), (TestCharacteristicType) event.getNewValue());
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
			TestPropertiesEditionPart basePart = (TestPropertiesEditionPart)editingPart;
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Id().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_References().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references)) {
				basePart.setReferences((EList<?>)msg.getNewValue());
			}
			
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Description().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ItsTestFamily().equals(msg.getFeature()) && basePart != null && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily))
				basePart.setItsTestFamily((EObject)msg.getNewValue());
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ToolsToApply().equals(msg.getFeature())  && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply))
				basePart.updateToolsToApply();
			if (MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Characteristics().equals(msg.getFeature()) && isAccessible(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics))
				basePart.updateCharacteristics();
			
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
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Id(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Name(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_References(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Description(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ItsTestFamily(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_ToolsToApply(),
			MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Characteristics()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id || key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name;
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
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Id().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Name().getEAttributeType(), newValue);
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_References().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_Description().getEAttributeType(), newValue);
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
