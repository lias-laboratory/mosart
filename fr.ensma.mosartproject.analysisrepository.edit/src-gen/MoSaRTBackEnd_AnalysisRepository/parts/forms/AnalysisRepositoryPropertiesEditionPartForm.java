/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.forms;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

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
public class AnalysisRepositoryPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, AnalysisRepositoryPropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected ReferencesTable generalizationRelationships;
	protected List<ViewerFilter> generalizationRelationshipsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> generalizationRelationshipsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable contextModels;
	protected List<ViewerFilter> contextModelsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextModelsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable identificationRules;
	protected List<ViewerFilter> identificationRulesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> identificationRulesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable analysisTools;
	protected List<ViewerFilter> analysisToolsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> analysisToolsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer metaModelOfMoSaRT;
	protected ReferencesTable testFamilies;
	protected List<ViewerFilter> testFamiliesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> testFamiliesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public AnalysisRepositoryPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AnalysisRepositoryPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence analysisRepositoryStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = analysisRepositoryStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies);
		
		
		composer = new PartComposer(analysisRepositoryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships) {
					return createGeneralizationRelationshipsTableComposition(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels) {
					return createContextModelsTableComposition(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules) {
					return createIdentificationRulesTableComposition(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools) {
					return createAnalysisToolsTableComposition(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT) {
					return createMetaModelOfMoSaRTFlatComboViewer(parent, widgetFactory);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies) {
					return createTestFamiliesTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
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
							AnalysisRepositoryPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AnalysisRepositoryPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name,
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
									AnalysisRepositoryPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
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
							AnalysisRepositoryPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									AnalysisRepositoryPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description,
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
									AnalysisRepositoryPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGeneralizationRelationshipsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.generalizationRelationships = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_GeneralizationRelationshipsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				generalizationRelationships.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				generalizationRelationships.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				generalizationRelationships.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				generalizationRelationships.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.generalizationRelationshipsFilters) {
			this.generalizationRelationships.addFilter(filter);
		}
		this.generalizationRelationships.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.generalizationRelationships.createControls(parent, widgetFactory);
		this.generalizationRelationships.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData generalizationRelationshipsData = new GridData(GridData.FILL_HORIZONTAL);
		generalizationRelationshipsData.horizontalSpan = 3;
		this.generalizationRelationships.setLayoutData(generalizationRelationshipsData);
		this.generalizationRelationships.setLowerBound(0);
		this.generalizationRelationships.setUpperBound(-1);
		generalizationRelationships.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships);
		generalizationRelationships.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createContextModelsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.contextModels = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_ContextModelsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				contextModels.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				contextModels.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				contextModels.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				contextModels.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.contextModelsFilters) {
			this.contextModels.addFilter(filter);
		}
		this.contextModels.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.contextModels.createControls(parent, widgetFactory);
		this.contextModels.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextModelsData = new GridData(GridData.FILL_HORIZONTAL);
		contextModelsData.horizontalSpan = 3;
		this.contextModels.setLayoutData(contextModelsData);
		this.contextModels.setLowerBound(0);
		this.contextModels.setUpperBound(-1);
		contextModels.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels);
		contextModels.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createIdentificationRulesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.identificationRules = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_IdentificationRulesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				identificationRules.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				identificationRules.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				identificationRules.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				identificationRules.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.identificationRulesFilters) {
			this.identificationRules.addFilter(filter);
		}
		this.identificationRules.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.identificationRules.createControls(parent, widgetFactory);
		this.identificationRules.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData identificationRulesData = new GridData(GridData.FILL_HORIZONTAL);
		identificationRulesData.horizontalSpan = 3;
		this.identificationRules.setLayoutData(identificationRulesData);
		this.identificationRules.setLowerBound(0);
		this.identificationRules.setUpperBound(-1);
		identificationRules.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules);
		identificationRules.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnalysisToolsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.analysisTools = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_AnalysisToolsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				analysisTools.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				analysisTools.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				analysisTools.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				analysisTools.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.analysisToolsFilters) {
			this.analysisTools.addFilter(filter);
		}
		this.analysisTools.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.analysisTools.createControls(parent, widgetFactory);
		this.analysisTools.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData analysisToolsData = new GridData(GridData.FILL_HORIZONTAL);
		analysisToolsData.horizontalSpan = 3;
		this.analysisTools.setLayoutData(analysisToolsData);
		this.analysisTools.setLowerBound(0);
		this.analysisTools.setUpperBound(-1);
		analysisTools.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools);
		analysisTools.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMetaModelOfMoSaRTFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_MetaModelOfMoSaRTLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		metaModelOfMoSaRT = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		widgetFactory.adapt(metaModelOfMoSaRT);
		metaModelOfMoSaRT.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData metaModelOfMoSaRTData = new GridData(GridData.FILL_HORIZONTAL);
		metaModelOfMoSaRT.setLayoutData(metaModelOfMoSaRTData);
		metaModelOfMoSaRT.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMetaModelOfMoSaRT()));
			}

		});
		metaModelOfMoSaRT.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTestFamiliesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.testFamilies = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepositoryPropertiesEditionPart_TestFamiliesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				testFamilies.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				testFamilies.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				testFamilies.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				testFamilies.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.testFamiliesFilters) {
			this.testFamilies.addFilter(filter);
		}
		this.testFamilies.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.testFamilies.createControls(parent, widgetFactory);
		this.testFamilies.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnalysisRepositoryPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData testFamiliesData = new GridData(GridData.FILL_HORIZONTAL);
		testFamiliesData.horizontalSpan = 3;
		this.testFamilies.setLayoutData(testFamiliesData);
		this.testFamilies.setLowerBound(0);
		this.testFamilies.setUpperBound(-1);
		testFamilies.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies);
		testFamilies.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#initGeneralizationRelationships(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGeneralizationRelationships(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		generalizationRelationships.setContentProvider(contentProvider);
		generalizationRelationships.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.generalizationRelationships);
		if (readOnly && generalizationRelationships.isEnabled()) {
			generalizationRelationships.setEnabled(false);
			generalizationRelationships.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !generalizationRelationships.isEnabled()) {
			generalizationRelationships.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#updateGeneralizationRelationships()
	 * 
	 */
	public void updateGeneralizationRelationships() {
	generalizationRelationships.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addFilterGeneralizationRelationships(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGeneralizationRelationships(ViewerFilter filter) {
		generalizationRelationshipsFilters.add(filter);
		if (this.generalizationRelationships != null) {
			this.generalizationRelationships.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addBusinessFilterGeneralizationRelationships(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGeneralizationRelationships(ViewerFilter filter) {
		generalizationRelationshipsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#isContainedInGeneralizationRelationshipsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGeneralizationRelationshipsTable(EObject element) {
		return ((ReferencesTableSettings)generalizationRelationships.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#initContextModels(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContextModels(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contextModels.setContentProvider(contentProvider);
		contextModels.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.contextModels);
		if (readOnly && contextModels.isEnabled()) {
			contextModels.setEnabled(false);
			contextModels.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !contextModels.isEnabled()) {
			contextModels.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#updateContextModels()
	 * 
	 */
	public void updateContextModels() {
	contextModels.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addFilterContextModels(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContextModels(ViewerFilter filter) {
		contextModelsFilters.add(filter);
		if (this.contextModels != null) {
			this.contextModels.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addBusinessFilterContextModels(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContextModels(ViewerFilter filter) {
		contextModelsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#isContainedInContextModelsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextModelsTable(EObject element) {
		return ((ReferencesTableSettings)contextModels.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#initIdentificationRules(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIdentificationRules(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		identificationRules.setContentProvider(contentProvider);
		identificationRules.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.identificationRules);
		if (readOnly && identificationRules.isEnabled()) {
			identificationRules.setEnabled(false);
			identificationRules.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !identificationRules.isEnabled()) {
			identificationRules.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#updateIdentificationRules()
	 * 
	 */
	public void updateIdentificationRules() {
	identificationRules.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addFilterIdentificationRules(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIdentificationRules(ViewerFilter filter) {
		identificationRulesFilters.add(filter);
		if (this.identificationRules != null) {
			this.identificationRules.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addBusinessFilterIdentificationRules(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIdentificationRules(ViewerFilter filter) {
		identificationRulesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#isContainedInIdentificationRulesTable(EObject element)
	 * 
	 */
	public boolean isContainedInIdentificationRulesTable(EObject element) {
		return ((ReferencesTableSettings)identificationRules.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#initAnalysisTools(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnalysisTools(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		analysisTools.setContentProvider(contentProvider);
		analysisTools.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.analysisTools);
		if (readOnly && analysisTools.isEnabled()) {
			analysisTools.setEnabled(false);
			analysisTools.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !analysisTools.isEnabled()) {
			analysisTools.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#updateAnalysisTools()
	 * 
	 */
	public void updateAnalysisTools() {
	analysisTools.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addFilterAnalysisTools(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnalysisTools(ViewerFilter filter) {
		analysisToolsFilters.add(filter);
		if (this.analysisTools != null) {
			this.analysisTools.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addBusinessFilterAnalysisTools(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnalysisTools(ViewerFilter filter) {
		analysisToolsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#isContainedInAnalysisToolsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnalysisToolsTable(EObject element) {
		return ((ReferencesTableSettings)analysisTools.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#getMetaModelOfMoSaRT()
	 * 
	 */
	public EObject getMetaModelOfMoSaRT() {
		if (metaModelOfMoSaRT.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) metaModelOfMoSaRT.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#initMetaModelOfMoSaRT(EObjectFlatComboSettings)
	 */
	public void initMetaModelOfMoSaRT(EObjectFlatComboSettings settings) {
		metaModelOfMoSaRT.setInput(settings);
		if (current != null) {
			metaModelOfMoSaRT.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT);
		if (readOnly && metaModelOfMoSaRT.isEnabled()) {
			metaModelOfMoSaRT.setEnabled(false);
			metaModelOfMoSaRT.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !metaModelOfMoSaRT.isEnabled()) {
			metaModelOfMoSaRT.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#setMetaModelOfMoSaRT(EObject newValue)
	 * 
	 */
	public void setMetaModelOfMoSaRT(EObject newValue) {
		if (newValue != null) {
			metaModelOfMoSaRT.setSelection(new StructuredSelection(newValue));
		} else {
			metaModelOfMoSaRT.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.metaModelOfMoSaRT);
		if (readOnly && metaModelOfMoSaRT.isEnabled()) {
			metaModelOfMoSaRT.setEnabled(false);
			metaModelOfMoSaRT.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !metaModelOfMoSaRT.isEnabled()) {
			metaModelOfMoSaRT.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#setMetaModelOfMoSaRTButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMetaModelOfMoSaRTButtonMode(ButtonsModeEnum newValue) {
		metaModelOfMoSaRT.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addFilterMetaModelOfMoSaRT(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMetaModelOfMoSaRT(ViewerFilter filter) {
		metaModelOfMoSaRT.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addBusinessFilterMetaModelOfMoSaRT(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMetaModelOfMoSaRT(ViewerFilter filter) {
		metaModelOfMoSaRT.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#initTestFamilies(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTestFamilies(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		testFamilies.setContentProvider(contentProvider);
		testFamilies.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.AnalysisRepository.Properties.testFamilies);
		if (readOnly && testFamilies.isEnabled()) {
			testFamilies.setEnabled(false);
			testFamilies.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_ReadOnly);
		} else if (!readOnly && !testFamilies.isEnabled()) {
			testFamilies.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#updateTestFamilies()
	 * 
	 */
	public void updateTestFamilies() {
	testFamilies.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addFilterTestFamilies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTestFamilies(ViewerFilter filter) {
		testFamiliesFilters.add(filter);
		if (this.testFamilies != null) {
			this.testFamilies.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#addBusinessFilterTestFamilies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTestFamilies(ViewerFilter filter) {
		testFamiliesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.AnalysisRepositoryPropertiesEditionPart#isContainedInTestFamiliesTable(EObject element)
	 * 
	 */
	public boolean isContainedInTestFamiliesTable(EObject element) {
		return ((ReferencesTableSettings)testFamilies.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.AnalysisRepository_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
