/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.forms;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
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
public class GeneralizationRelationshipPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GeneralizationRelationshipPropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected EObjectFlatComboViewer specificModel;
	protected EObjectFlatComboViewer genericModel;
	protected Text behaviorKind;
	protected Button editBehaviorKind;
	private EList behaviorKindList;
	protected Text locationOfGenericToSpecificModelTransformationProgram;
	protected Text locationOfSpecificToGenericModelTransformationProgram;



	/**
	 * For {@link ISection} use only.
	 */
	public GeneralizationRelationshipPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralizationRelationshipPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence generalizationRelationshipStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = generalizationRelationshipStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram);
		
		
		composer = new PartComposer(generalizationRelationshipStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel) {
					return createSpecificModelFlatComboViewer(parent, widgetFactory);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel) {
					return createGenericModelFlatComboViewer(parent, widgetFactory);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind) {
					return createBehaviorKindMultiValuedEditor(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram) {
					return createLocationOfGenericToSpecificModelTransformationProgramText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram) {
					return createLocationOfSpecificToGenericModelTransformationProgramText(widgetFactory, parent);
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
		propertiesSection.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_PropertiesGroupLabel);
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
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
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
							GeneralizationRelationshipPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralizationRelationshipPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name,
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
									GeneralizationRelationshipPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
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
							GeneralizationRelationshipPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralizationRelationshipPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description,
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
									GeneralizationRelationshipPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSpecificModelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_SpecificModelLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		specificModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		widgetFactory.adapt(specificModel);
		specificModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData specificModelData = new GridData(GridData.FILL_HORIZONTAL);
		specificModel.setLayoutData(specificModelData);
		specificModel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSpecificModel()));
			}

		});
		specificModel.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createGenericModelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_GenericModelLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		genericModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		widgetFactory.adapt(genericModel);
		genericModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData genericModelData = new GridData(GridData.FILL_HORIZONTAL);
		genericModel.setLayoutData(genericModelData);
		genericModel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGenericModel()));
			}

		});
		genericModel.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createBehaviorKindMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		behaviorKind = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData behaviorKindData = new GridData(GridData.FILL_HORIZONTAL);
		behaviorKindData.horizontalSpan = 2;
		behaviorKind.setLayoutData(behaviorKindData);
		EditingUtils.setID(behaviorKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind);
		EditingUtils.setEEFtype(behaviorKind, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editBehaviorKind = widgetFactory.createButton(parent, getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_BehaviorKindLabel), SWT.NONE);
		GridData editBehaviorKindData = new GridData();
		editBehaviorKind.setLayoutData(editBehaviorKindData);
		editBehaviorKind.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						behaviorKind.getShell(), "GeneralizationRelationship", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						behaviorKindList, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getGeneralizationRelationship_BehaviorKind().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					behaviorKindList = dialog.getResult();
					if (behaviorKindList == null) {
						behaviorKindList = new BasicEList();
					}
					behaviorKind.setText(behaviorKindList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(behaviorKindList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editBehaviorKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind);
		EditingUtils.setEEFtype(editBehaviorKind, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocationOfGenericToSpecificModelTransformationProgramText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_LocationOfGenericToSpecificModelTransformationProgramLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		locationOfGenericToSpecificModelTransformationProgram = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		locationOfGenericToSpecificModelTransformationProgram.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData locationOfGenericToSpecificModelTransformationProgramData = new GridData(GridData.FILL_HORIZONTAL);
		locationOfGenericToSpecificModelTransformationProgram.setLayoutData(locationOfGenericToSpecificModelTransformationProgramData);
		locationOfGenericToSpecificModelTransformationProgram.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralizationRelationshipPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfGenericToSpecificModelTransformationProgram.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralizationRelationshipPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, locationOfGenericToSpecificModelTransformationProgram.getText()));
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
									GeneralizationRelationshipPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		locationOfGenericToSpecificModelTransformationProgram.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfGenericToSpecificModelTransformationProgram.getText()));
				}
			}
		});
		EditingUtils.setID(locationOfGenericToSpecificModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram);
		EditingUtils.setEEFtype(locationOfGenericToSpecificModelTransformationProgram, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocationOfSpecificToGenericModelTransformationProgramText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_LocationOfSpecificToGenericModelTransformationProgramLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		locationOfSpecificToGenericModelTransformationProgram = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		locationOfSpecificToGenericModelTransformationProgram.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData locationOfSpecificToGenericModelTransformationProgramData = new GridData(GridData.FILL_HORIZONTAL);
		locationOfSpecificToGenericModelTransformationProgram.setLayoutData(locationOfSpecificToGenericModelTransformationProgramData);
		locationOfSpecificToGenericModelTransformationProgram.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GeneralizationRelationshipPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfSpecificToGenericModelTransformationProgram.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GeneralizationRelationshipPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, locationOfSpecificToGenericModelTransformationProgram.getText()));
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
									GeneralizationRelationshipPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		locationOfSpecificToGenericModelTransformationProgram.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfSpecificToGenericModelTransformationProgram.getText()));
				}
			}
		});
		EditingUtils.setID(locationOfSpecificToGenericModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram);
		EditingUtils.setEEFtype(locationOfSpecificToGenericModelTransformationProgram, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getSpecificModel()
	 * 
	 */
	public EObject getSpecificModel() {
		if (specificModel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) specificModel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#initSpecificModel(EObjectFlatComboSettings)
	 */
	public void initSpecificModel(EObjectFlatComboSettings settings) {
		specificModel.setInput(settings);
		if (current != null) {
			specificModel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel);
		if (readOnly && specificModel.isEnabled()) {
			specificModel.setEnabled(false);
			specificModel.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !specificModel.isEnabled()) {
			specificModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setSpecificModel(EObject newValue)
	 * 
	 */
	public void setSpecificModel(EObject newValue) {
		if (newValue != null) {
			specificModel.setSelection(new StructuredSelection(newValue));
		} else {
			specificModel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel);
		if (readOnly && specificModel.isEnabled()) {
			specificModel.setEnabled(false);
			specificModel.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !specificModel.isEnabled()) {
			specificModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setSpecificModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSpecificModelButtonMode(ButtonsModeEnum newValue) {
		specificModel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#addFilterSpecificModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpecificModel(ViewerFilter filter) {
		specificModel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#addBusinessFilterSpecificModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpecificModel(ViewerFilter filter) {
		specificModel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getGenericModel()
	 * 
	 */
	public EObject getGenericModel() {
		if (genericModel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) genericModel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#initGenericModel(EObjectFlatComboSettings)
	 */
	public void initGenericModel(EObjectFlatComboSettings settings) {
		genericModel.setInput(settings);
		if (current != null) {
			genericModel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel);
		if (readOnly && genericModel.isEnabled()) {
			genericModel.setEnabled(false);
			genericModel.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !genericModel.isEnabled()) {
			genericModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setGenericModel(EObject newValue)
	 * 
	 */
	public void setGenericModel(EObject newValue) {
		if (newValue != null) {
			genericModel.setSelection(new StructuredSelection(newValue));
		} else {
			genericModel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel);
		if (readOnly && genericModel.isEnabled()) {
			genericModel.setEnabled(false);
			genericModel.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !genericModel.isEnabled()) {
			genericModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setGenericModelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setGenericModelButtonMode(ButtonsModeEnum newValue) {
		genericModel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#addFilterGenericModel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGenericModel(ViewerFilter filter) {
		genericModel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#addBusinessFilterGenericModel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGenericModel(ViewerFilter filter) {
		genericModel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getBehaviorKind()
	 * 
	 */
	public EList getBehaviorKind() {
		return behaviorKindList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setBehaviorKind(EList newValue)
	 * 
	 */
	public void setBehaviorKind(EList newValue) {
		behaviorKindList = newValue;
		if (newValue != null) {
			behaviorKind.setText(behaviorKindList.toString());
		} else {
			behaviorKind.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind);
		if (readOnly && behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(false);
			behaviorKind.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !behaviorKind.isEnabled()) {
			behaviorKind.setEnabled(true);
		}	
		
	}

	public void addToBehaviorKind(Object newValue) {
		behaviorKindList.add(newValue);
		if (newValue != null) {
			behaviorKind.setText(behaviorKindList.toString());
		} else {
			behaviorKind.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToBehaviorKind(Object newValue) {
		behaviorKindList.remove(newValue);
		if (newValue != null) {
			behaviorKind.setText(behaviorKindList.toString());
		} else {
			behaviorKind.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getLocationOfGenericToSpecificModelTransformationProgram()
	 * 
	 */
	public String getLocationOfGenericToSpecificModelTransformationProgram() {
		return locationOfGenericToSpecificModelTransformationProgram.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setLocationOfGenericToSpecificModelTransformationProgram(String newValue)
	 * 
	 */
	public void setLocationOfGenericToSpecificModelTransformationProgram(String newValue) {
		if (newValue != null) {
			locationOfGenericToSpecificModelTransformationProgram.setText(newValue);
		} else {
			locationOfGenericToSpecificModelTransformationProgram.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram);
		if (readOnly && locationOfGenericToSpecificModelTransformationProgram.isEnabled()) {
			locationOfGenericToSpecificModelTransformationProgram.setEnabled(false);
			locationOfGenericToSpecificModelTransformationProgram.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !locationOfGenericToSpecificModelTransformationProgram.isEnabled()) {
			locationOfGenericToSpecificModelTransformationProgram.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#getLocationOfSpecificToGenericModelTransformationProgram()
	 * 
	 */
	public String getLocationOfSpecificToGenericModelTransformationProgram() {
		return locationOfSpecificToGenericModelTransformationProgram.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.GeneralizationRelationshipPropertiesEditionPart#setLocationOfSpecificToGenericModelTransformationProgram(String newValue)
	 * 
	 */
	public void setLocationOfSpecificToGenericModelTransformationProgram(String newValue) {
		if (newValue != null) {
			locationOfSpecificToGenericModelTransformationProgram.setText(newValue);
		} else {
			locationOfSpecificToGenericModelTransformationProgram.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram);
		if (readOnly && locationOfSpecificToGenericModelTransformationProgram.isEnabled()) {
			locationOfSpecificToGenericModelTransformationProgram.setEnabled(false);
			locationOfSpecificToGenericModelTransformationProgram.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_ReadOnly);
		} else if (!readOnly && !locationOfSpecificToGenericModelTransformationProgram.isEnabled()) {
			locationOfSpecificToGenericModelTransformationProgram.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationship_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
