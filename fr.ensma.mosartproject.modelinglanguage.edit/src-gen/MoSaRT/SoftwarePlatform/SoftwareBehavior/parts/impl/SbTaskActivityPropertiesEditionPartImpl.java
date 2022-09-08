/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.providers.SoftwareBehaviorMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class SbTaskActivityPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbTaskActivityPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer trigger;
	protected ReferencesTable inputSquencingRelation;
	protected List<ViewerFilter> inputSquencingRelationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inputSquencingRelationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputSequencingRelation;
	protected List<ViewerFilter> outputSequencingRelationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputSequencingRelationFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer rootActionStep;
	protected EObjectFlatComboViewer representedTask;
	private SingleCompositionEditor rtpExecutionTime;
	private SingleCompositionEditor rtpDeadline;
	private SingleCompositionEditor rtpOffset;
	private SingleCompositionEditor rtpPriority;
	private SingleCompositionEditor rtpCriticality;
	private SingleCompositionEditor rtpPreemptibility;
	private SingleCompositionEditor rtpSelfSuspension;
	private SingleCompositionEditor rtpBlockingTime;
	private SingleCompositionEditor rtpResponseTime;
	private SingleCompositionEditor rtpRepetition;
	protected ReferencesTable actionSteps;
	protected List<ViewerFilter> actionStepsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> actionStepsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbTaskActivityPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbTaskActivityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbTaskActivityStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps);
		
		
		composer = new PartComposer(sbTaskActivityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger) {
					return createTriggerFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation) {
					return createInputSquencingRelationAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation) {
					return createOutputSequencingRelationAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep) {
					return createRootActionStepFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask) {
					return createRepresentedTaskFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime) {
					return createRtpExecutionTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline) {
					return createRtpDeadlineSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset) {
					return createRtpOffsetSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority) {
					return createRtpPrioritySingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality) {
					return createRtpCriticalitySingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility) {
					return createRtpPreemptibilitySingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension) {
					return createRtpSelfSuspensionSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime) {
					return createRtpBlockingTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime) {
					return createRtpResponseTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition) {
					return createRtpRepetitionSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps) {
					return createActionStepsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTriggerFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_TriggerLabel);
		trigger = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger, SoftwareBehaviorViewsRepository.SWT_KIND));
		trigger.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		trigger.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTrigger()));
			}

		});
		GridData triggerData = new GridData(GridData.FILL_HORIZONTAL);
		trigger.setLayoutData(triggerData);
		trigger.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInputSquencingRelationAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_InputSquencingRelationLabel);		 
		this.inputSquencingRelation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addInputSquencingRelation(); }
			public void handleEdit(EObject element) { editInputSquencingRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInputSquencingRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInputSquencingRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.inputSquencingRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.inputSquencingRelation.createControls(parent);
		this.inputSquencingRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputSquencingRelationData = new GridData(GridData.FILL_HORIZONTAL);
		inputSquencingRelationData.horizontalSpan = 3;
		this.inputSquencingRelation.setLayoutData(inputSquencingRelationData);
		this.inputSquencingRelation.disableMove();
		inputSquencingRelation.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation);
		inputSquencingRelation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInputSquencingRelation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inputSquencingRelation.getInput(), inputSquencingRelationFilters, inputSquencingRelationBusinessFilters,
		"inputSquencingRelation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inputSquencingRelation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInputSquencingRelation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inputSquencingRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInputSquencingRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inputSquencingRelation.refresh();
	}

	/**
	 * 
	 */
	protected void editInputSquencingRelation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inputSquencingRelation.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutputSequencingRelationAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_OutputSequencingRelationLabel);		 
		this.outputSequencingRelation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutputSequencingRelation(); }
			public void handleEdit(EObject element) { editOutputSequencingRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutputSequencingRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutputSequencingRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.outputSequencingRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.outputSequencingRelation.createControls(parent);
		this.outputSequencingRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputSequencingRelationData = new GridData(GridData.FILL_HORIZONTAL);
		outputSequencingRelationData.horizontalSpan = 3;
		this.outputSequencingRelation.setLayoutData(outputSequencingRelationData);
		this.outputSequencingRelation.disableMove();
		outputSequencingRelation.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation);
		outputSequencingRelation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutputSequencingRelation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outputSequencingRelation.getInput(), outputSequencingRelationFilters, outputSequencingRelationBusinessFilters,
		"outputSequencingRelation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outputSequencingRelation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutputSequencingRelation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outputSequencingRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutputSequencingRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outputSequencingRelation.refresh();
	}

	/**
	 * 
	 */
	protected void editOutputSequencingRelation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outputSequencingRelation.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRootActionStepFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RootActionStepLabel);
		rootActionStep = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep, SoftwareBehaviorViewsRepository.SWT_KIND));
		rootActionStep.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		rootActionStep.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRootActionStep()));
			}

		});
		GridData rootActionStepData = new GridData(GridData.FILL_HORIZONTAL);
		rootActionStep.setLayoutData(rootActionStepData);
		rootActionStep.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRepresentedTaskFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RepresentedTaskLabel);
		representedTask = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask, SoftwareBehaviorViewsRepository.SWT_KIND));
		representedTask.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		representedTask.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentedTask()));
			}

		});
		GridData representedTaskData = new GridData(GridData.FILL_HORIZONTAL);
		representedTask.setLayoutData(representedTaskData);
		representedTask.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpExecutionTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpExecutionTimeLabel);
		//create widget
		rtpExecutionTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpExecutionTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpExecutionTime.setLayoutData(rtpExecutionTimeData);
		rtpExecutionTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpExecutionTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpExecutionTime.refresh();
			}
		});
		rtpExecutionTime.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpDeadlineSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpDeadlineLabel);
		//create widget
		rtpDeadline = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpDeadlineData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDeadline.setLayoutData(rtpDeadlineData);
		rtpDeadline.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDeadline.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDeadline.refresh();
			}
		});
		rtpDeadline.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpOffsetSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpOffsetLabel);
		//create widget
		rtpOffset = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpOffsetData = new GridData(GridData.FILL_HORIZONTAL);
		rtpOffset.setLayoutData(rtpOffsetData);
		rtpOffset.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpOffset.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpOffset.refresh();
			}
		});
		rtpOffset.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpPrioritySingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpPriorityLabel);
		//create widget
		rtpPriority = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpPriorityData = new GridData(GridData.FILL_HORIZONTAL);
		rtpPriority.setLayoutData(rtpPriorityData);
		rtpPriority.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpPriority.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpPriority.refresh();
			}
		});
		rtpPriority.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpCriticalitySingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpCriticalityLabel);
		//create widget
		rtpCriticality = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpCriticalityData = new GridData(GridData.FILL_HORIZONTAL);
		rtpCriticality.setLayoutData(rtpCriticalityData);
		rtpCriticality.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpCriticality.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpCriticality.refresh();
			}
		});
		rtpCriticality.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpPreemptibilitySingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpPreemptibilityLabel);
		//create widget
		rtpPreemptibility = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpPreemptibilityData = new GridData(GridData.FILL_HORIZONTAL);
		rtpPreemptibility.setLayoutData(rtpPreemptibilityData);
		rtpPreemptibility.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpPreemptibility.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpPreemptibility.refresh();
			}
		});
		rtpPreemptibility.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpSelfSuspensionSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpSelfSuspensionLabel);
		//create widget
		rtpSelfSuspension = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpSelfSuspensionData = new GridData(GridData.FILL_HORIZONTAL);
		rtpSelfSuspension.setLayoutData(rtpSelfSuspensionData);
		rtpSelfSuspension.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpSelfSuspension.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpSelfSuspension.refresh();
			}
		});
		rtpSelfSuspension.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpBlockingTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpBlockingTimeLabel);
		//create widget
		rtpBlockingTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpBlockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpBlockingTime.setLayoutData(rtpBlockingTimeData);
		rtpBlockingTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpBlockingTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpBlockingTime.refresh();
			}
		});
		rtpBlockingTime.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpResponseTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpResponseTimeLabel);
		//create widget
		rtpResponseTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpResponseTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpResponseTime.setLayoutData(rtpResponseTimeData);
		rtpResponseTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpResponseTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpResponseTime.refresh();
			}
		});
		rtpResponseTime.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpRepetitionSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_RtpRepetitionLabel);
		//create widget
		rtpRepetition = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpRepetitionData = new GridData(GridData.FILL_HORIZONTAL);
		rtpRepetition.setLayoutData(rtpRepetitionData);
		rtpRepetition.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpRepetition.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpRepetition.refresh();
			}
		});
		rtpRepetition.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createActionStepsAdvancedTableComposition(Composite parent) {
		this.actionSteps = new ReferencesTable(getDescription(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, SoftwareBehaviorMessages.SbTaskActivityPropertiesEditionPart_ActionStepsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				actionSteps.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				actionSteps.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				actionSteps.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				actionSteps.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.actionStepsFilters) {
			this.actionSteps.addFilter(filter);
		}
		this.actionSteps.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.actionSteps.createControls(parent);
		this.actionSteps.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTaskActivityPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData actionStepsData = new GridData(GridData.FILL_HORIZONTAL);
		actionStepsData.horizontalSpan = 3;
		this.actionSteps.setLayoutData(actionStepsData);
		this.actionSteps.setLowerBound(0);
		this.actionSteps.setUpperBound(-1);
		actionSteps.setID(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.actionSteps);
		actionSteps.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getTrigger()
	 * 
	 */
	public EObject getTrigger() {
		if (trigger.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) trigger.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initTrigger(EObjectFlatComboSettings)
	 */
	public void initTrigger(EObjectFlatComboSettings settings) {
		trigger.setInput(settings);
		if (current != null) {
			trigger.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger);
		if (readOnly && trigger.isEnabled()) {
			trigger.setEnabled(false);
			trigger.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !trigger.isEnabled()) {
			trigger.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setTrigger(EObject newValue)
	 * 
	 */
	public void setTrigger(EObject newValue) {
		if (newValue != null) {
			trigger.setSelection(new StructuredSelection(newValue));
		} else {
			trigger.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.trigger);
		if (readOnly && trigger.isEnabled()) {
			trigger.setEnabled(false);
			trigger.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !trigger.isEnabled()) {
			trigger.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setTriggerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTriggerButtonMode(ButtonsModeEnum newValue) {
		trigger.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addFilterTrigger(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTrigger(ViewerFilter filter) {
		trigger.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addBusinessFilterTrigger(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTrigger(ViewerFilter filter) {
		trigger.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initInputSquencingRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInputSquencingRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputSquencingRelation.setContentProvider(contentProvider);
		inputSquencingRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.inputSquencingRelation);
		if (readOnly && inputSquencingRelation.getTable().isEnabled()) {
			inputSquencingRelation.setEnabled(false);
			inputSquencingRelation.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !inputSquencingRelation.getTable().isEnabled()) {
			inputSquencingRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#updateInputSquencingRelation()
	 * 
	 */
	public void updateInputSquencingRelation() {
	inputSquencingRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addFilterInputSquencingRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputSquencingRelation(ViewerFilter filter) {
		inputSquencingRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addBusinessFilterInputSquencingRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputSquencingRelation(ViewerFilter filter) {
		inputSquencingRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#isContainedInInputSquencingRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputSquencingRelationTable(EObject element) {
		return ((ReferencesTableSettings)inputSquencingRelation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initOutputSequencingRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutputSequencingRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputSequencingRelation.setContentProvider(contentProvider);
		outputSequencingRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.outputSequencingRelation);
		if (readOnly && outputSequencingRelation.getTable().isEnabled()) {
			outputSequencingRelation.setEnabled(false);
			outputSequencingRelation.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !outputSequencingRelation.getTable().isEnabled()) {
			outputSequencingRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#updateOutputSequencingRelation()
	 * 
	 */
	public void updateOutputSequencingRelation() {
	outputSequencingRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addFilterOutputSequencingRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputSequencingRelation(ViewerFilter filter) {
		outputSequencingRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addBusinessFilterOutputSequencingRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputSequencingRelation(ViewerFilter filter) {
		outputSequencingRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#isContainedInOutputSequencingRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputSequencingRelationTable(EObject element) {
		return ((ReferencesTableSettings)outputSequencingRelation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRootActionStep()
	 * 
	 */
	public EObject getRootActionStep() {
		if (rootActionStep.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) rootActionStep.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRootActionStep(EObjectFlatComboSettings)
	 */
	public void initRootActionStep(EObjectFlatComboSettings settings) {
		rootActionStep.setInput(settings);
		if (current != null) {
			rootActionStep.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep);
		if (readOnly && rootActionStep.isEnabled()) {
			rootActionStep.setEnabled(false);
			rootActionStep.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rootActionStep.isEnabled()) {
			rootActionStep.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRootActionStep(EObject newValue)
	 * 
	 */
	public void setRootActionStep(EObject newValue) {
		if (newValue != null) {
			rootActionStep.setSelection(new StructuredSelection(newValue));
		} else {
			rootActionStep.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rootActionStep);
		if (readOnly && rootActionStep.isEnabled()) {
			rootActionStep.setEnabled(false);
			rootActionStep.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rootActionStep.isEnabled()) {
			rootActionStep.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRootActionStepButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRootActionStepButtonMode(ButtonsModeEnum newValue) {
		rootActionStep.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addFilterRootActionStep(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRootActionStep(ViewerFilter filter) {
		rootActionStep.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addBusinessFilterRootActionStep(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRootActionStep(ViewerFilter filter) {
		rootActionStep.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRepresentedTask()
	 * 
	 */
	public EObject getRepresentedTask() {
		if (representedTask.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) representedTask.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRepresentedTask(EObjectFlatComboSettings)
	 */
	public void initRepresentedTask(EObjectFlatComboSettings settings) {
		representedTask.setInput(settings);
		if (current != null) {
			representedTask.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask);
		if (readOnly && representedTask.isEnabled()) {
			representedTask.setEnabled(false);
			representedTask.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !representedTask.isEnabled()) {
			representedTask.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRepresentedTask(EObject newValue)
	 * 
	 */
	public void setRepresentedTask(EObject newValue) {
		if (newValue != null) {
			representedTask.setSelection(new StructuredSelection(newValue));
		} else {
			representedTask.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.representedTask);
		if (readOnly && representedTask.isEnabled()) {
			representedTask.setEnabled(false);
			representedTask.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !representedTask.isEnabled()) {
			representedTask.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRepresentedTaskButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentedTaskButtonMode(ButtonsModeEnum newValue) {
		representedTask.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addFilterRepresentedTask(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentedTask(ViewerFilter filter) {
		representedTask.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addBusinessFilterRepresentedTask(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentedTask(ViewerFilter filter) {
		representedTask.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpExecutionTime()
	 * 
	 */
	public EObject getRtpExecutionTime() {
		return (EObject) rtpExecutionTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpExecutionTime(EObjectFlatComboSettings)
	 */
	public void initRtpExecutionTime(EObjectFlatComboSettings settings) {
		rtpExecutionTime.setAdapterFactory(adapterFactory);
		rtpExecutionTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpExecutionTime(EObject newValue)
	 * 
	 */
	public void setRtpExecutionTime(EObject newValue) {
		rtpExecutionTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpDeadline()
	 * 
	 */
	public EObject getRtpDeadline() {
		return (EObject) rtpDeadline.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpDeadline(EObjectFlatComboSettings)
	 */
	public void initRtpDeadline(EObjectFlatComboSettings settings) {
		rtpDeadline.setAdapterFactory(adapterFactory);
		rtpDeadline.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpDeadline(EObject newValue)
	 * 
	 */
	public void setRtpDeadline(EObject newValue) {
		rtpDeadline.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpOffset()
	 * 
	 */
	public EObject getRtpOffset() {
		return (EObject) rtpOffset.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpOffset(EObjectFlatComboSettings)
	 */
	public void initRtpOffset(EObjectFlatComboSettings settings) {
		rtpOffset.setAdapterFactory(adapterFactory);
		rtpOffset.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset);
		if (readOnly && rtpOffset.isEnabled()) {
			rtpOffset.setEnabled(false);
			rtpOffset.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpOffset.isEnabled()) {
			rtpOffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpOffset(EObject newValue)
	 * 
	 */
	public void setRtpOffset(EObject newValue) {
		rtpOffset.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpOffset);
		if (readOnly && rtpOffset.isEnabled()) {
			rtpOffset.setEnabled(false);
			rtpOffset.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpOffset.isEnabled()) {
			rtpOffset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpPriority()
	 * 
	 */
	public EObject getRtpPriority() {
		return (EObject) rtpPriority.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpPriority(EObjectFlatComboSettings)
	 */
	public void initRtpPriority(EObjectFlatComboSettings settings) {
		rtpPriority.setAdapterFactory(adapterFactory);
		rtpPriority.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority);
		if (readOnly && rtpPriority.isEnabled()) {
			rtpPriority.setEnabled(false);
			rtpPriority.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpPriority.isEnabled()) {
			rtpPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpPriority(EObject newValue)
	 * 
	 */
	public void setRtpPriority(EObject newValue) {
		rtpPriority.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPriority);
		if (readOnly && rtpPriority.isEnabled()) {
			rtpPriority.setEnabled(false);
			rtpPriority.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpPriority.isEnabled()) {
			rtpPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpCriticality()
	 * 
	 */
	public EObject getRtpCriticality() {
		return (EObject) rtpCriticality.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpCriticality(EObjectFlatComboSettings)
	 */
	public void initRtpCriticality(EObjectFlatComboSettings settings) {
		rtpCriticality.setAdapterFactory(adapterFactory);
		rtpCriticality.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality);
		if (readOnly && rtpCriticality.isEnabled()) {
			rtpCriticality.setEnabled(false);
			rtpCriticality.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpCriticality.isEnabled()) {
			rtpCriticality.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpCriticality(EObject newValue)
	 * 
	 */
	public void setRtpCriticality(EObject newValue) {
		rtpCriticality.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpCriticality);
		if (readOnly && rtpCriticality.isEnabled()) {
			rtpCriticality.setEnabled(false);
			rtpCriticality.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpCriticality.isEnabled()) {
			rtpCriticality.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpPreemptibility()
	 * 
	 */
	public EObject getRtpPreemptibility() {
		return (EObject) rtpPreemptibility.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpPreemptibility(EObjectFlatComboSettings)
	 */
	public void initRtpPreemptibility(EObjectFlatComboSettings settings) {
		rtpPreemptibility.setAdapterFactory(adapterFactory);
		rtpPreemptibility.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility);
		if (readOnly && rtpPreemptibility.isEnabled()) {
			rtpPreemptibility.setEnabled(false);
			rtpPreemptibility.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpPreemptibility.isEnabled()) {
			rtpPreemptibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpPreemptibility(EObject newValue)
	 * 
	 */
	public void setRtpPreemptibility(EObject newValue) {
		rtpPreemptibility.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpPreemptibility);
		if (readOnly && rtpPreemptibility.isEnabled()) {
			rtpPreemptibility.setEnabled(false);
			rtpPreemptibility.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpPreemptibility.isEnabled()) {
			rtpPreemptibility.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpSelfSuspension()
	 * 
	 */
	public EObject getRtpSelfSuspension() {
		return (EObject) rtpSelfSuspension.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpSelfSuspension(EObjectFlatComboSettings)
	 */
	public void initRtpSelfSuspension(EObjectFlatComboSettings settings) {
		rtpSelfSuspension.setAdapterFactory(adapterFactory);
		rtpSelfSuspension.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension);
		if (readOnly && rtpSelfSuspension.isEnabled()) {
			rtpSelfSuspension.setEnabled(false);
			rtpSelfSuspension.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpSelfSuspension.isEnabled()) {
			rtpSelfSuspension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpSelfSuspension(EObject newValue)
	 * 
	 */
	public void setRtpSelfSuspension(EObject newValue) {
		rtpSelfSuspension.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpSelfSuspension);
		if (readOnly && rtpSelfSuspension.isEnabled()) {
			rtpSelfSuspension.setEnabled(false);
			rtpSelfSuspension.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpSelfSuspension.isEnabled()) {
			rtpSelfSuspension.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpBlockingTime()
	 * 
	 */
	public EObject getRtpBlockingTime() {
		return (EObject) rtpBlockingTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpBlockingTime(EObjectFlatComboSettings)
	 */
	public void initRtpBlockingTime(EObjectFlatComboSettings settings) {
		rtpBlockingTime.setAdapterFactory(adapterFactory);
		rtpBlockingTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpBlockingTime(EObject newValue)
	 * 
	 */
	public void setRtpBlockingTime(EObject newValue) {
		rtpBlockingTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpResponseTime()
	 * 
	 */
	public EObject getRtpResponseTime() {
		return (EObject) rtpResponseTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpResponseTime(EObjectFlatComboSettings)
	 */
	public void initRtpResponseTime(EObjectFlatComboSettings settings) {
		rtpResponseTime.setAdapterFactory(adapterFactory);
		rtpResponseTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime);
		if (readOnly && rtpResponseTime.isEnabled()) {
			rtpResponseTime.setEnabled(false);
			rtpResponseTime.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpResponseTime.isEnabled()) {
			rtpResponseTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpResponseTime(EObject newValue)
	 * 
	 */
	public void setRtpResponseTime(EObject newValue) {
		rtpResponseTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpResponseTime);
		if (readOnly && rtpResponseTime.isEnabled()) {
			rtpResponseTime.setEnabled(false);
			rtpResponseTime.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpResponseTime.isEnabled()) {
			rtpResponseTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#getRtpRepetition()
	 * 
	 */
	public EObject getRtpRepetition() {
		return (EObject) rtpRepetition.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initRtpRepetition(EObjectFlatComboSettings)
	 */
	public void initRtpRepetition(EObjectFlatComboSettings settings) {
		rtpRepetition.setAdapterFactory(adapterFactory);
		rtpRepetition.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#setRtpRepetition(EObject newValue)
	 * 
	 */
	public void setRtpRepetition(EObject newValue) {
		rtpRepetition.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTaskActivity.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		} else if (!readOnly && !rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#initActionSteps(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initActionSteps(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		actionSteps.setContentProvider(contentProvider);
		actionSteps.setInput(settings);
		actionSteps.setEnabled(false);
		actionSteps.setToolTipText(SoftwareBehaviorMessages.SbTaskActivity_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#updateActionSteps()
	 * 
	 */
	public void updateActionSteps() {
	actionSteps.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addFilterActionSteps(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActionSteps(ViewerFilter filter) {
		actionStepsFilters.add(filter);
		if (this.actionSteps != null) {
			this.actionSteps.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#addBusinessFilterActionSteps(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActionSteps(ViewerFilter filter) {
		actionStepsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTaskActivityPropertiesEditionPart#isContainedInActionStepsTable(EObject element)
	 * 
	 */
	public boolean isContainedInActionStepsTable(EObject element) {
		return ((ReferencesTableSettings)actionSteps.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.SbTaskActivity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
