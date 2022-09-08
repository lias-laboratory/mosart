/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.impl;

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

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class GeneralizationRelationshipPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GeneralizationRelationshipPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GeneralizationRelationshipPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
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
					return createPropertiesGroup(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name) {
					return createNameText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel) {
					return createSpecificModelFlatComboViewer(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel) {
					return createGenericModelFlatComboViewer(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind) {
					return createBehaviorKindMultiValuedEditor(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram) {
					return createLocationOfGenericToSpecificModelTransformationProgramText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram) {
					return createLocationOfSpecificToGenericModelTransformationProgramText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSpecificModelFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_SpecificModelLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		specificModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		specificModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		specificModel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSpecificModel()));
			}

		});
		GridData specificModelData = new GridData(GridData.FILL_HORIZONTAL);
		specificModel.setLayoutData(specificModelData);
		specificModel.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.specificModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createGenericModelFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_GenericModelLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		genericModel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		genericModel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		genericModel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getGenericModel()));
			}

		});
		GridData genericModelData = new GridData(GridData.FILL_HORIZONTAL);
		genericModel.setLayoutData(genericModelData);
		genericModel.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.genericModel, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createBehaviorKindMultiValuedEditor(Composite parent) {
		behaviorKind = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData behaviorKindData = new GridData(GridData.FILL_HORIZONTAL);
		behaviorKindData.horizontalSpan = 2;
		behaviorKind.setLayoutData(behaviorKindData);
		EditingUtils.setID(behaviorKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind);
		EditingUtils.setEEFtype(behaviorKind, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editBehaviorKind = new Button(parent, SWT.NONE);
		editBehaviorKind.setText(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_BehaviorKindLabel));
		GridData editBehaviorKindData = new GridData();
		editBehaviorKind.setLayoutData(editBehaviorKindData);
		editBehaviorKind.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(behaviorKindList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editBehaviorKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.behaviorKind);
		EditingUtils.setEEFtype(editBehaviorKind, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocationOfGenericToSpecificModelTransformationProgramText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_LocationOfGenericToSpecificModelTransformationProgramLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		locationOfGenericToSpecificModelTransformationProgram = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData locationOfGenericToSpecificModelTransformationProgramData = new GridData(GridData.FILL_HORIZONTAL);
		locationOfGenericToSpecificModelTransformationProgram.setLayoutData(locationOfGenericToSpecificModelTransformationProgramData);
		locationOfGenericToSpecificModelTransformationProgram.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfGenericToSpecificModelTransformationProgram.getText()));
			}

		});
		locationOfGenericToSpecificModelTransformationProgram.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfGenericToSpecificModelTransformationProgram.getText()));
				}
			}

		});
		EditingUtils.setID(locationOfGenericToSpecificModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram);
		EditingUtils.setEEFtype(locationOfGenericToSpecificModelTransformationProgram, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfGenericToSpecificModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocationOfSpecificToGenericModelTransformationProgramText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.GeneralizationRelationshipPropertiesEditionPart_LocationOfSpecificToGenericModelTransformationProgramLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		locationOfSpecificToGenericModelTransformationProgram = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData locationOfSpecificToGenericModelTransformationProgramData = new GridData(GridData.FILL_HORIZONTAL);
		locationOfSpecificToGenericModelTransformationProgram.setLayoutData(locationOfSpecificToGenericModelTransformationProgramData);
		locationOfSpecificToGenericModelTransformationProgram.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfSpecificToGenericModelTransformationProgram.getText()));
			}

		});
		locationOfSpecificToGenericModelTransformationProgram.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GeneralizationRelationshipPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfSpecificToGenericModelTransformationProgram.getText()));
				}
			}

		});
		EditingUtils.setID(locationOfSpecificToGenericModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram);
		EditingUtils.setEEFtype(locationOfSpecificToGenericModelTransformationProgram, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.GeneralizationRelationship.Properties.locationOfSpecificToGenericModelTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
