/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.providers.SoftwareBehaviorMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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
public class SbWriteStepPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SbWriteStepPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable inputStepRelation;
	protected List<ViewerFilter> inputStepRelationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inputStepRelationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputStepRelation;
	protected List<ViewerFilter> outputStepRelationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputStepRelationFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer representedOperation;
	protected EObjectFlatComboViewer interactionResource;
	protected SingleCompositionEditor rtpExecutionTime;
	protected SingleCompositionEditor rtpDeadline;
	protected SingleCompositionEditor rtpBlockingTime;
	protected SingleCompositionEditor rtpRepetition;



	/**
	 * For {@link ISection} use only.
	 */
	public SbWriteStepPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbWriteStepPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbWriteStepStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbWriteStepStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition);
		
		
		composer = new PartComposer(sbWriteStepStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation) {
					return createInputStepRelationReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation) {
					return createOutputStepRelationReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation) {
					return createRepresentedOperationFlatComboViewer(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource) {
					return createInteractionResourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime) {
					return createRtpExecutionTimeSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline) {
					return createRtpDeadlineSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime) {
					return createRtpBlockingTimeSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition) {
					return createRtpRepetitionSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_NameLabel);
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
							SbWriteStepPropertiesEditionPartForm.this,
							SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SbWriteStepPropertiesEditionPartForm.this,
									SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name,
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
									SbWriteStepPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInputStepRelationReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.inputStepRelation = new ReferencesTable(getDescription(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_InputStepRelationLabel), new ReferencesTableListener	() {
			public void handleAdd() { addInputStepRelation(); }
			public void handleEdit(EObject element) { editInputStepRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInputStepRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInputStepRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.inputStepRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation, SoftwareBehaviorViewsRepository.FORM_KIND));
		this.inputStepRelation.createControls(parent, widgetFactory);
		this.inputStepRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputStepRelationData = new GridData(GridData.FILL_HORIZONTAL);
		inputStepRelationData.horizontalSpan = 3;
		this.inputStepRelation.setLayoutData(inputStepRelationData);
		this.inputStepRelation.disableMove();
		inputStepRelation.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation);
		inputStepRelation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInputStepRelation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inputStepRelation.getInput(), inputStepRelationFilters, inputStepRelationBusinessFilters,
		"inputStepRelation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inputStepRelation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInputStepRelation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInputStepRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void editInputStepRelation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inputStepRelation.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutputStepRelationReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outputStepRelation = new ReferencesTable(getDescription(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_OutputStepRelationLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutputStepRelation(); }
			public void handleEdit(EObject element) { editOutputStepRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutputStepRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutputStepRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.outputStepRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation, SoftwareBehaviorViewsRepository.FORM_KIND));
		this.outputStepRelation.createControls(parent, widgetFactory);
		this.outputStepRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputStepRelationData = new GridData(GridData.FILL_HORIZONTAL);
		outputStepRelationData.horizontalSpan = 3;
		this.outputStepRelation.setLayoutData(outputStepRelationData);
		this.outputStepRelation.disableMove();
		outputStepRelation.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation);
		outputStepRelation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutputStepRelation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outputStepRelation.getInput(), outputStepRelationFilters, outputStepRelationBusinessFilters,
		"outputStepRelation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outputStepRelation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutputStepRelation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutputStepRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void editOutputStepRelation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outputStepRelation.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRepresentedOperationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_RepresentedOperationLabel);
		representedOperation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation, SoftwareBehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(representedOperation);
		representedOperation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData representedOperationData = new GridData(GridData.FILL_HORIZONTAL);
		representedOperation.setLayoutData(representedOperationData);
		representedOperation.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRepresentedOperation()));
			}

		});
		representedOperation.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInteractionResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_InteractionResourceLabel);
		interactionResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource, SoftwareBehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(interactionResource);
		interactionResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData interactionResourceData = new GridData(GridData.FILL_HORIZONTAL);
		interactionResource.setLayoutData(interactionResourceData);
		interactionResource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInteractionResource()));
			}

		});
		interactionResource.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpExecutionTimeSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_RtpExecutionTimeLabel);
		//create widget
		rtpExecutionTime = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpExecutionTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpExecutionTime.setLayoutData(rtpExecutionTimeData);
		rtpExecutionTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpExecutionTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpExecutionTime.refresh();
			}
		});
		rtpExecutionTime.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpDeadlineSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_RtpDeadlineLabel);
		//create widget
		rtpDeadline = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpDeadlineData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDeadline.setLayoutData(rtpDeadlineData);
		rtpDeadline.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDeadline.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDeadline.refresh();
			}
		});
		rtpDeadline.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpBlockingTimeSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_RtpBlockingTimeLabel);
		//create widget
		rtpBlockingTime = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpBlockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpBlockingTime.setLayoutData(rtpBlockingTimeData);
		rtpBlockingTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpBlockingTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpBlockingTime.refresh();
			}
		});
		rtpBlockingTime.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpRepetitionSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition, SoftwareBehaviorMessages.SbWriteStepPropertiesEditionPart_RtpRepetitionLabel);
		//create widget
		rtpRepetition = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpRepetitionData = new GridData(GridData.FILL_HORIZONTAL);
		rtpRepetition.setLayoutData(rtpRepetitionData);
		rtpRepetition.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpRepetition.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbWriteStepPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpRepetition.refresh();
			}
		});
		rtpRepetition.setID(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initInputStepRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInputStepRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputStepRelation.setContentProvider(contentProvider);
		inputStepRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.inputStepRelation);
		if (readOnly && inputStepRelation.getTable().isEnabled()) {
			inputStepRelation.setEnabled(false);
			inputStepRelation.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !inputStepRelation.getTable().isEnabled()) {
			inputStepRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#updateInputStepRelation()
	 * 
	 */
	public void updateInputStepRelation() {
	inputStepRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addFilterInputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputStepRelation(ViewerFilter filter) {
		inputStepRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addBusinessFilterInputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputStepRelation(ViewerFilter filter) {
		inputStepRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#isContainedInInputStepRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputStepRelationTable(EObject element) {
		return ((ReferencesTableSettings)inputStepRelation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initOutputStepRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutputStepRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputStepRelation.setContentProvider(contentProvider);
		outputStepRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.outputStepRelation);
		if (readOnly && outputStepRelation.getTable().isEnabled()) {
			outputStepRelation.setEnabled(false);
			outputStepRelation.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !outputStepRelation.getTable().isEnabled()) {
			outputStepRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#updateOutputStepRelation()
	 * 
	 */
	public void updateOutputStepRelation() {
	outputStepRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addFilterOutputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputStepRelation(ViewerFilter filter) {
		outputStepRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addBusinessFilterOutputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputStepRelation(ViewerFilter filter) {
		outputStepRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#isContainedInOutputStepRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputStepRelationTable(EObject element) {
		return ((ReferencesTableSettings)outputStepRelation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getRepresentedOperation()
	 * 
	 */
	public EObject getRepresentedOperation() {
		if (representedOperation.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) representedOperation.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initRepresentedOperation(EObjectFlatComboSettings)
	 */
	public void initRepresentedOperation(EObjectFlatComboSettings settings) {
		representedOperation.setInput(settings);
		if (current != null) {
			representedOperation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation);
		if (readOnly && representedOperation.isEnabled()) {
			representedOperation.setEnabled(false);
			representedOperation.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !representedOperation.isEnabled()) {
			representedOperation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setRepresentedOperation(EObject newValue)
	 * 
	 */
	public void setRepresentedOperation(EObject newValue) {
		if (newValue != null) {
			representedOperation.setSelection(new StructuredSelection(newValue));
		} else {
			representedOperation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.representedOperation);
		if (readOnly && representedOperation.isEnabled()) {
			representedOperation.setEnabled(false);
			representedOperation.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !representedOperation.isEnabled()) {
			representedOperation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setRepresentedOperationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentedOperationButtonMode(ButtonsModeEnum newValue) {
		representedOperation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addFilterRepresentedOperation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentedOperation(ViewerFilter filter) {
		representedOperation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addBusinessFilterRepresentedOperation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentedOperation(ViewerFilter filter) {
		representedOperation.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getInteractionResource()
	 * 
	 */
	public EObject getInteractionResource() {
		if (interactionResource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) interactionResource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initInteractionResource(EObjectFlatComboSettings)
	 */
	public void initInteractionResource(EObjectFlatComboSettings settings) {
		interactionResource.setInput(settings);
		if (current != null) {
			interactionResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource);
		if (readOnly && interactionResource.isEnabled()) {
			interactionResource.setEnabled(false);
			interactionResource.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !interactionResource.isEnabled()) {
			interactionResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setInteractionResource(EObject newValue)
	 * 
	 */
	public void setInteractionResource(EObject newValue) {
		if (newValue != null) {
			interactionResource.setSelection(new StructuredSelection(newValue));
		} else {
			interactionResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.interactionResource);
		if (readOnly && interactionResource.isEnabled()) {
			interactionResource.setEnabled(false);
			interactionResource.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !interactionResource.isEnabled()) {
			interactionResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setInteractionResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInteractionResourceButtonMode(ButtonsModeEnum newValue) {
		interactionResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addFilterInteractionResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInteractionResource(ViewerFilter filter) {
		interactionResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#addBusinessFilterInteractionResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInteractionResource(ViewerFilter filter) {
		interactionResource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getRtpExecutionTime()
	 * 
	 */
	public EObject getRtpExecutionTime() {
		return (EObject) rtpExecutionTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initRtpExecutionTime(EObjectFlatComboSettings)
	 */
	public void initRtpExecutionTime(EObjectFlatComboSettings settings) {
		rtpExecutionTime.setAdapterFactory(adapterFactory);
		rtpExecutionTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setRtpExecutionTime(EObject newValue)
	 * 
	 */
	public void setRtpExecutionTime(EObject newValue) {
		rtpExecutionTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getRtpDeadline()
	 * 
	 */
	public EObject getRtpDeadline() {
		return (EObject) rtpDeadline.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initRtpDeadline(EObjectFlatComboSettings)
	 */
	public void initRtpDeadline(EObjectFlatComboSettings settings) {
		rtpDeadline.setAdapterFactory(adapterFactory);
		rtpDeadline.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setRtpDeadline(EObject newValue)
	 * 
	 */
	public void setRtpDeadline(EObject newValue) {
		rtpDeadline.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getRtpBlockingTime()
	 * 
	 */
	public EObject getRtpBlockingTime() {
		return (EObject) rtpBlockingTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initRtpBlockingTime(EObjectFlatComboSettings)
	 */
	public void initRtpBlockingTime(EObjectFlatComboSettings settings) {
		rtpBlockingTime.setAdapterFactory(adapterFactory);
		rtpBlockingTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setRtpBlockingTime(EObject newValue)
	 * 
	 */
	public void setRtpBlockingTime(EObject newValue) {
		rtpBlockingTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#getRtpRepetition()
	 * 
	 */
	public EObject getRtpRepetition() {
		return (EObject) rtpRepetition.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#initRtpRepetition(EObjectFlatComboSettings)
	 */
	public void initRtpRepetition(EObjectFlatComboSettings settings) {
		rtpRepetition.setAdapterFactory(adapterFactory);
		rtpRepetition.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbWriteStepPropertiesEditionPart#setRtpRepetition(EObject newValue)
	 * 
	 */
	public void setRtpRepetition(EObject newValue) {
		rtpRepetition.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbWriteStep.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbWriteStep_ReadOnly);
		} else if (!readOnly && !rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.SbWriteStep_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
