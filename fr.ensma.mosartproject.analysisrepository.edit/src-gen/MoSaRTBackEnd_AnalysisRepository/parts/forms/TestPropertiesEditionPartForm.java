/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.forms;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;
import MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class TestPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TestPropertiesEditionPart {

	protected Text id;
	protected Text name;
	protected Text references;
	protected Button editReferences;
	private EList referencesList;
	protected Text description;
	protected ReferencesTable toolsToApply;
	protected List<ViewerFilter> toolsToApplyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> toolsToApplyFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer itsTestFamily;
	protected ReferencesTable characteristics;
	protected List<ViewerFilter> characteristicsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> characteristicsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public TestPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TestPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence testStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = testStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics);
		
		
		composer = new PartComposer(testStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references) {
					return createReferencesMultiValuedEditor(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply) {
					return createToolsToApplyReferencesTable(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily) {
					return createItsTestFamilyFlatComboViewer(parent, widgetFactory);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics) {
					return createCharacteristicsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TestPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TestPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TestPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TestPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TestPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TestPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createReferencesMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		references = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData referencesData = new GridData(GridData.FILL_HORIZONTAL);
		referencesData.horizontalSpan = 2;
		references.setLayoutData(referencesData);
		EditingUtils.setID(references, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references);
		EditingUtils.setEEFtype(references, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editReferences = widgetFactory.createButton(parent, getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_ReferencesLabel), SWT.NONE);
		GridData editReferencesData = new GridData();
		editReferences.setLayoutData(editReferencesData);
		editReferences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						references.getShell(), "Test", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						referencesList, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTest_References().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					referencesList = dialog.getResult();
					if (referencesList == null) {
						referencesList = new BasicEList();
					}
					references.setText(referencesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(referencesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editReferences, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references);
		EditingUtils.setEEFtype(editReferences, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TestPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TestPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TestPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createToolsToApplyReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.toolsToApply = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_ToolsToApplyLabel), new ReferencesTableListener	() {
			public void handleAdd() { addToolsToApply(); }
			public void handleEdit(EObject element) { editToolsToApply(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveToolsToApply(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromToolsToApply(element); }
			public void navigateTo(EObject element) { }
		});
		this.toolsToApply.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.toolsToApply.createControls(parent, widgetFactory);
		this.toolsToApply.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData toolsToApplyData = new GridData(GridData.FILL_HORIZONTAL);
		toolsToApplyData.horizontalSpan = 3;
		this.toolsToApply.setLayoutData(toolsToApplyData);
		this.toolsToApply.disableMove();
		toolsToApply.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply);
		toolsToApply.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addToolsToApply() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(toolsToApply.getInput(), toolsToApplyFilters, toolsToApplyBusinessFilters,
		"tools To Apply", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				toolsToApply.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveToolsToApply(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		toolsToApply.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromToolsToApply(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		toolsToApply.refresh();
	}

	/**
	 * 
	 */
	protected void editToolsToApply(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				toolsToApply.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createItsTestFamilyFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_ItsTestFamilyLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		itsTestFamily = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		widgetFactory.adapt(itsTestFamily);
		itsTestFamily.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData itsTestFamilyData = new GridData(GridData.FILL_HORIZONTAL);
		itsTestFamily.setLayoutData(itsTestFamilyData);
		itsTestFamily.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getItsTestFamily()));
			}

		});
		itsTestFamily.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCharacteristicsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.characteristics = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, MoSaRTBackEnd_AnalysisRepositoryMessages.TestPropertiesEditionPart_CharacteristicsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				characteristics.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				characteristics.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				characteristics.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				characteristics.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.characteristicsFilters) {
			this.characteristics.addFilter(filter);
		}
		this.characteristics.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.characteristics.createControls(parent, widgetFactory);
		this.characteristics.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData characteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		characteristicsData.horizontalSpan = 3;
		this.characteristics.setLayoutData(characteristicsData);
		this.characteristics.setLowerBound(0);
		this.characteristics.setUpperBound(-1);
		characteristics.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics);
		characteristics.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.id);
		if (readOnly && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#getReferences()
	 * 
	 */
	public EList getReferences() {
		return referencesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#setReferences(EList newValue)
	 * 
	 */
	public void setReferences(EList newValue) {
		referencesList = newValue;
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.references);
		if (readOnly && references.isEnabled()) {
			references.setEnabled(false);
			references.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !references.isEnabled()) {
			references.setEnabled(true);
		}	
		
	}

	public void addToReferences(Object newValue) {
		referencesList.add(newValue);
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToReferences(Object newValue) {
		referencesList.remove(newValue);
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#initToolsToApply(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initToolsToApply(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		toolsToApply.setContentProvider(contentProvider);
		toolsToApply.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.toolsToApply);
		if (readOnly && toolsToApply.getTable().isEnabled()) {
			toolsToApply.setEnabled(false);
			toolsToApply.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !toolsToApply.getTable().isEnabled()) {
			toolsToApply.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#updateToolsToApply()
	 * 
	 */
	public void updateToolsToApply() {
	toolsToApply.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#addFilterToolsToApply(ViewerFilter filter)
	 * 
	 */
	public void addFilterToToolsToApply(ViewerFilter filter) {
		toolsToApplyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#addBusinessFilterToolsToApply(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToToolsToApply(ViewerFilter filter) {
		toolsToApplyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#isContainedInToolsToApplyTable(EObject element)
	 * 
	 */
	public boolean isContainedInToolsToApplyTable(EObject element) {
		return ((ReferencesTableSettings)toolsToApply.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#getItsTestFamily()
	 * 
	 */
	public EObject getItsTestFamily() {
		if (itsTestFamily.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) itsTestFamily.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#initItsTestFamily(EObjectFlatComboSettings)
	 */
	public void initItsTestFamily(EObjectFlatComboSettings settings) {
		itsTestFamily.setInput(settings);
		if (current != null) {
			itsTestFamily.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily);
		if (readOnly && itsTestFamily.isEnabled()) {
			itsTestFamily.setEnabled(false);
			itsTestFamily.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !itsTestFamily.isEnabled()) {
			itsTestFamily.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#setItsTestFamily(EObject newValue)
	 * 
	 */
	public void setItsTestFamily(EObject newValue) {
		if (newValue != null) {
			itsTestFamily.setSelection(new StructuredSelection(newValue));
		} else {
			itsTestFamily.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.itsTestFamily);
		if (readOnly && itsTestFamily.isEnabled()) {
			itsTestFamily.setEnabled(false);
			itsTestFamily.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !itsTestFamily.isEnabled()) {
			itsTestFamily.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#setItsTestFamilyButtonMode(ButtonsModeEnum newValue)
	 */
	public void setItsTestFamilyButtonMode(ButtonsModeEnum newValue) {
		itsTestFamily.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#addFilterItsTestFamily(ViewerFilter filter)
	 * 
	 */
	public void addFilterToItsTestFamily(ViewerFilter filter) {
		itsTestFamily.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#addBusinessFilterItsTestFamily(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToItsTestFamily(ViewerFilter filter) {
		itsTestFamily.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#initCharacteristics(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCharacteristics(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		characteristics.setContentProvider(contentProvider);
		characteristics.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Test.Properties.characteristics);
		if (readOnly && characteristics.isEnabled()) {
			characteristics.setEnabled(false);
			characteristics.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Test_ReadOnly);
		} else if (!readOnly && !characteristics.isEnabled()) {
			characteristics.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#updateCharacteristics()
	 * 
	 */
	public void updateCharacteristics() {
	characteristics.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#addFilterCharacteristics(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCharacteristics(ViewerFilter filter) {
		characteristicsFilters.add(filter);
		if (this.characteristics != null) {
			this.characteristics.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#addBusinessFilterCharacteristics(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCharacteristics(ViewerFilter filter) {
		characteristicsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestPropertiesEditionPart#isContainedInCharacteristicsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCharacteristicsTable(EObject element) {
		return ((ReferencesTableSettings)characteristics.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.Test_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
