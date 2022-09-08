/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart;
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
public class SbReceiveStepPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbReceiveStepPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable inputStepRelation;
	protected List<ViewerFilter> inputStepRelationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inputStepRelationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputStepRelation;
	protected List<ViewerFilter> outputStepRelationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputStepRelationFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer representedOperation;
	protected EObjectFlatComboViewer interactionResource;
	private SingleCompositionEditor rtpExecutionTime;
	private SingleCompositionEditor rtpDeadline;
	private SingleCompositionEditor rtpBlockingTime;
	private SingleCompositionEditor rtpRepetition;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbReceiveStepPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbReceiveStepStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbReceiveStepStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition);
		
		
		composer = new PartComposer(sbReceiveStepStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation) {
					return createInputStepRelationAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation) {
					return createOutputStepRelationAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation) {
					return createRepresentedOperationFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource) {
					return createInteractionResourceFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime) {
					return createRtpExecutionTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline) {
					return createRtpDeadlineSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime) {
					return createRtpBlockingTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition) {
					return createRtpRepetitionSingleCompositionEditor(parent);
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInputStepRelationAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_InputStepRelationLabel);		 
		this.inputStepRelation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addInputStepRelation(); }
			public void handleEdit(EObject element) { editInputStepRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInputStepRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInputStepRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.inputStepRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.inputStepRelation.createControls(parent);
		this.inputStepRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputStepRelationData = new GridData(GridData.FILL_HORIZONTAL);
		inputStepRelationData.horizontalSpan = 3;
		this.inputStepRelation.setLayoutData(inputStepRelationData);
		this.inputStepRelation.disableMove();
		inputStepRelation.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInputStepRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOutputStepRelationAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_OutputStepRelationLabel);		 
		this.outputStepRelation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutputStepRelation(); }
			public void handleEdit(EObject element) { editOutputStepRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutputStepRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutputStepRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.outputStepRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.outputStepRelation.createControls(parent);
		this.outputStepRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputStepRelationData = new GridData(GridData.FILL_HORIZONTAL);
		outputStepRelationData.horizontalSpan = 3;
		this.outputStepRelation.setLayoutData(outputStepRelationData);
		this.outputStepRelation.disableMove();
		outputStepRelation.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutputStepRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createRepresentedOperationFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_RepresentedOperationLabel);
		representedOperation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation, SoftwareBehaviorViewsRepository.SWT_KIND));
		representedOperation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		representedOperation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentedOperation()));
			}

		});
		GridData representedOperationData = new GridData(GridData.FILL_HORIZONTAL);
		representedOperation.setLayoutData(representedOperationData);
		representedOperation.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createInteractionResourceFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_InteractionResourceLabel);
		interactionResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource, SoftwareBehaviorViewsRepository.SWT_KIND));
		interactionResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		interactionResource.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInteractionResource()));
			}

		});
		GridData interactionResourceData = new GridData(GridData.FILL_HORIZONTAL);
		interactionResource.setLayoutData(interactionResourceData);
		interactionResource.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpExecutionTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_RtpExecutionTimeLabel);
		//create widget
		rtpExecutionTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpExecutionTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpExecutionTime.setLayoutData(rtpExecutionTimeData);
		rtpExecutionTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpExecutionTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpExecutionTime.refresh();
			}
		});
		rtpExecutionTime.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpDeadlineSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_RtpDeadlineLabel);
		//create widget
		rtpDeadline = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpDeadlineData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDeadline.setLayoutData(rtpDeadlineData);
		rtpDeadline.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDeadline.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDeadline.refresh();
			}
		});
		rtpDeadline.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpBlockingTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_RtpBlockingTimeLabel);
		//create widget
		rtpBlockingTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpBlockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpBlockingTime.setLayoutData(rtpBlockingTimeData);
		rtpBlockingTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpBlockingTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpBlockingTime.refresh();
			}
		});
		rtpBlockingTime.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpRepetitionSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition, SoftwareBehaviorMessages.SbReceiveStepPropertiesEditionPart_RtpRepetitionLabel);
		//create widget
		rtpRepetition = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpRepetitionData = new GridData(GridData.FILL_HORIZONTAL);
		rtpRepetition.setLayoutData(rtpRepetitionData);
		rtpRepetition.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpRepetition.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReceiveStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpRepetition.refresh();
			}
		});
		rtpRepetition.setID(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initInputStepRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInputStepRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputStepRelation.setContentProvider(contentProvider);
		inputStepRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.inputStepRelation);
		if (readOnly && inputStepRelation.getTable().isEnabled()) {
			inputStepRelation.setEnabled(false);
			inputStepRelation.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !inputStepRelation.getTable().isEnabled()) {
			inputStepRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#updateInputStepRelation()
	 * 
	 */
	public void updateInputStepRelation() {
	inputStepRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addFilterInputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputStepRelation(ViewerFilter filter) {
		inputStepRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addBusinessFilterInputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputStepRelation(ViewerFilter filter) {
		inputStepRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#isContainedInInputStepRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputStepRelationTable(EObject element) {
		return ((ReferencesTableSettings)inputStepRelation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initOutputStepRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutputStepRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputStepRelation.setContentProvider(contentProvider);
		outputStepRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.outputStepRelation);
		if (readOnly && outputStepRelation.getTable().isEnabled()) {
			outputStepRelation.setEnabled(false);
			outputStepRelation.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !outputStepRelation.getTable().isEnabled()) {
			outputStepRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#updateOutputStepRelation()
	 * 
	 */
	public void updateOutputStepRelation() {
	outputStepRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addFilterOutputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputStepRelation(ViewerFilter filter) {
		outputStepRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addBusinessFilterOutputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputStepRelation(ViewerFilter filter) {
		outputStepRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#isContainedInOutputStepRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputStepRelationTable(EObject element) {
		return ((ReferencesTableSettings)outputStepRelation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getRepresentedOperation()
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initRepresentedOperation(EObjectFlatComboSettings)
	 */
	public void initRepresentedOperation(EObjectFlatComboSettings settings) {
		representedOperation.setInput(settings);
		if (current != null) {
			representedOperation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation);
		if (readOnly && representedOperation.isEnabled()) {
			representedOperation.setEnabled(false);
			representedOperation.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !representedOperation.isEnabled()) {
			representedOperation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setRepresentedOperation(EObject newValue)
	 * 
	 */
	public void setRepresentedOperation(EObject newValue) {
		if (newValue != null) {
			representedOperation.setSelection(new StructuredSelection(newValue));
		} else {
			representedOperation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.representedOperation);
		if (readOnly && representedOperation.isEnabled()) {
			representedOperation.setEnabled(false);
			representedOperation.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !representedOperation.isEnabled()) {
			representedOperation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setRepresentedOperationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentedOperationButtonMode(ButtonsModeEnum newValue) {
		representedOperation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addFilterRepresentedOperation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentedOperation(ViewerFilter filter) {
		representedOperation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addBusinessFilterRepresentedOperation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentedOperation(ViewerFilter filter) {
		representedOperation.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getInteractionResource()
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initInteractionResource(EObjectFlatComboSettings)
	 */
	public void initInteractionResource(EObjectFlatComboSettings settings) {
		interactionResource.setInput(settings);
		if (current != null) {
			interactionResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource);
		if (readOnly && interactionResource.isEnabled()) {
			interactionResource.setEnabled(false);
			interactionResource.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !interactionResource.isEnabled()) {
			interactionResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setInteractionResource(EObject newValue)
	 * 
	 */
	public void setInteractionResource(EObject newValue) {
		if (newValue != null) {
			interactionResource.setSelection(new StructuredSelection(newValue));
		} else {
			interactionResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.interactionResource);
		if (readOnly && interactionResource.isEnabled()) {
			interactionResource.setEnabled(false);
			interactionResource.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !interactionResource.isEnabled()) {
			interactionResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setInteractionResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInteractionResourceButtonMode(ButtonsModeEnum newValue) {
		interactionResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addFilterInteractionResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInteractionResource(ViewerFilter filter) {
		interactionResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#addBusinessFilterInteractionResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInteractionResource(ViewerFilter filter) {
		interactionResource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getRtpExecutionTime()
	 * 
	 */
	public EObject getRtpExecutionTime() {
		return (EObject) rtpExecutionTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initRtpExecutionTime(EObjectFlatComboSettings)
	 */
	public void initRtpExecutionTime(EObjectFlatComboSettings settings) {
		rtpExecutionTime.setAdapterFactory(adapterFactory);
		rtpExecutionTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setRtpExecutionTime(EObject newValue)
	 * 
	 */
	public void setRtpExecutionTime(EObject newValue) {
		rtpExecutionTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getRtpDeadline()
	 * 
	 */
	public EObject getRtpDeadline() {
		return (EObject) rtpDeadline.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initRtpDeadline(EObjectFlatComboSettings)
	 */
	public void initRtpDeadline(EObjectFlatComboSettings settings) {
		rtpDeadline.setAdapterFactory(adapterFactory);
		rtpDeadline.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setRtpDeadline(EObject newValue)
	 * 
	 */
	public void setRtpDeadline(EObject newValue) {
		rtpDeadline.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getRtpBlockingTime()
	 * 
	 */
	public EObject getRtpBlockingTime() {
		return (EObject) rtpBlockingTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initRtpBlockingTime(EObjectFlatComboSettings)
	 */
	public void initRtpBlockingTime(EObjectFlatComboSettings settings) {
		rtpBlockingTime.setAdapterFactory(adapterFactory);
		rtpBlockingTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setRtpBlockingTime(EObject newValue)
	 * 
	 */
	public void setRtpBlockingTime(EObject newValue) {
		rtpBlockingTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#getRtpRepetition()
	 * 
	 */
	public EObject getRtpRepetition() {
		return (EObject) rtpRepetition.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#initRtpRepetition(EObjectFlatComboSettings)
	 */
	public void initRtpRepetition(EObjectFlatComboSettings settings) {
		rtpRepetition.setAdapterFactory(adapterFactory);
		rtpRepetition.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
		} else if (!readOnly && !rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReceiveStepPropertiesEditionPart#setRtpRepetition(EObject newValue)
	 * 
	 */
	public void setRtpRepetition(EObject newValue) {
		rtpRepetition.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReceiveStep.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbReceiveStep_ReadOnly);
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
		return SoftwareBehaviorMessages.SbReceiveStep_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
