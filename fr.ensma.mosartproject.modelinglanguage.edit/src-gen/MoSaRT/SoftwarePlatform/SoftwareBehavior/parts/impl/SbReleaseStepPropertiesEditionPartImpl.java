/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart;
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
public class SbReleaseStepPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbReleaseStepPropertiesEditionPart {

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
	public SbReleaseStepPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbReleaseStepStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbReleaseStepStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition);
		
		
		composer = new PartComposer(sbReleaseStepStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation) {
					return createInputStepRelationAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation) {
					return createOutputStepRelationAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation) {
					return createRepresentedOperationFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource) {
					return createInteractionResourceFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime) {
					return createRtpExecutionTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline) {
					return createRtpDeadlineSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime) {
					return createRtpBlockingTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition) {
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInputStepRelationAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_InputStepRelationLabel);		 
		this.inputStepRelation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addInputStepRelation(); }
			public void handleEdit(EObject element) { editInputStepRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInputStepRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInputStepRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.inputStepRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.inputStepRelation.createControls(parent);
		this.inputStepRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputStepRelationData = new GridData(GridData.FILL_HORIZONTAL);
		inputStepRelationData.horizontalSpan = 3;
		this.inputStepRelation.setLayoutData(inputStepRelationData);
		this.inputStepRelation.disableMove();
		inputStepRelation.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInputStepRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_OutputStepRelationLabel);		 
		this.outputStepRelation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutputStepRelation(); }
			public void handleEdit(EObject element) { editOutputStepRelation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutputStepRelation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutputStepRelation(element); }
			public void navigateTo(EObject element) { }
		});
		this.outputStepRelation.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.outputStepRelation.createControls(parent);
		this.outputStepRelation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputStepRelationData = new GridData(GridData.FILL_HORIZONTAL);
		outputStepRelationData.horizontalSpan = 3;
		this.outputStepRelation.setLayoutData(outputStepRelationData);
		this.outputStepRelation.disableMove();
		outputStepRelation.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outputStepRelation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutputStepRelation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_RepresentedOperationLabel);
		representedOperation = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation, SoftwareBehaviorViewsRepository.SWT_KIND));
		representedOperation.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		representedOperation.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentedOperation()));
			}

		});
		GridData representedOperationData = new GridData(GridData.FILL_HORIZONTAL);
		representedOperation.setLayoutData(representedOperationData);
		representedOperation.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createInteractionResourceFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_InteractionResourceLabel);
		interactionResource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource, SoftwareBehaviorViewsRepository.SWT_KIND));
		interactionResource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		interactionResource.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getInteractionResource()));
			}

		});
		GridData interactionResourceData = new GridData(GridData.FILL_HORIZONTAL);
		interactionResource.setLayoutData(interactionResourceData);
		interactionResource.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpExecutionTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_RtpExecutionTimeLabel);
		//create widget
		rtpExecutionTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpExecutionTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpExecutionTime.setLayoutData(rtpExecutionTimeData);
		rtpExecutionTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpExecutionTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpExecutionTime.refresh();
			}
		});
		rtpExecutionTime.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpDeadlineSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_RtpDeadlineLabel);
		//create widget
		rtpDeadline = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpDeadlineData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDeadline.setLayoutData(rtpDeadlineData);
		rtpDeadline.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDeadline.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDeadline.refresh();
			}
		});
		rtpDeadline.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpBlockingTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_RtpBlockingTimeLabel);
		//create widget
		rtpBlockingTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpBlockingTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpBlockingTime.setLayoutData(rtpBlockingTimeData);
		rtpBlockingTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpBlockingTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpBlockingTime.refresh();
			}
		});
		rtpBlockingTime.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpRepetitionSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition, SoftwareBehaviorMessages.SbReleaseStepPropertiesEditionPart_RtpRepetitionLabel);
		//create widget
		rtpRepetition = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpRepetitionData = new GridData(GridData.FILL_HORIZONTAL);
		rtpRepetition.setLayoutData(rtpRepetitionData);
		rtpRepetition.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpRepetition.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbReleaseStepPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpRepetition.refresh();
			}
		});
		rtpRepetition.setID(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initInputStepRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInputStepRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputStepRelation.setContentProvider(contentProvider);
		inputStepRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.inputStepRelation);
		if (readOnly && inputStepRelation.getTable().isEnabled()) {
			inputStepRelation.setEnabled(false);
			inputStepRelation.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !inputStepRelation.getTable().isEnabled()) {
			inputStepRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#updateInputStepRelation()
	 * 
	 */
	public void updateInputStepRelation() {
	inputStepRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addFilterInputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputStepRelation(ViewerFilter filter) {
		inputStepRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addBusinessFilterInputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputStepRelation(ViewerFilter filter) {
		inputStepRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#isContainedInInputStepRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputStepRelationTable(EObject element) {
		return ((ReferencesTableSettings)inputStepRelation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initOutputStepRelation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutputStepRelation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputStepRelation.setContentProvider(contentProvider);
		outputStepRelation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.outputStepRelation);
		if (readOnly && outputStepRelation.getTable().isEnabled()) {
			outputStepRelation.setEnabled(false);
			outputStepRelation.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !outputStepRelation.getTable().isEnabled()) {
			outputStepRelation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#updateOutputStepRelation()
	 * 
	 */
	public void updateOutputStepRelation() {
	outputStepRelation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addFilterOutputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputStepRelation(ViewerFilter filter) {
		outputStepRelationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addBusinessFilterOutputStepRelation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputStepRelation(ViewerFilter filter) {
		outputStepRelationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#isContainedInOutputStepRelationTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputStepRelationTable(EObject element) {
		return ((ReferencesTableSettings)outputStepRelation.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getRepresentedOperation()
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initRepresentedOperation(EObjectFlatComboSettings)
	 */
	public void initRepresentedOperation(EObjectFlatComboSettings settings) {
		representedOperation.setInput(settings);
		if (current != null) {
			representedOperation.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation);
		if (readOnly && representedOperation.isEnabled()) {
			representedOperation.setEnabled(false);
			representedOperation.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !representedOperation.isEnabled()) {
			representedOperation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setRepresentedOperation(EObject newValue)
	 * 
	 */
	public void setRepresentedOperation(EObject newValue) {
		if (newValue != null) {
			representedOperation.setSelection(new StructuredSelection(newValue));
		} else {
			representedOperation.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.representedOperation);
		if (readOnly && representedOperation.isEnabled()) {
			representedOperation.setEnabled(false);
			representedOperation.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !representedOperation.isEnabled()) {
			representedOperation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setRepresentedOperationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentedOperationButtonMode(ButtonsModeEnum newValue) {
		representedOperation.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addFilterRepresentedOperation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentedOperation(ViewerFilter filter) {
		representedOperation.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addBusinessFilterRepresentedOperation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentedOperation(ViewerFilter filter) {
		representedOperation.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getInteractionResource()
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initInteractionResource(EObjectFlatComboSettings)
	 */
	public void initInteractionResource(EObjectFlatComboSettings settings) {
		interactionResource.setInput(settings);
		if (current != null) {
			interactionResource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource);
		if (readOnly && interactionResource.isEnabled()) {
			interactionResource.setEnabled(false);
			interactionResource.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !interactionResource.isEnabled()) {
			interactionResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setInteractionResource(EObject newValue)
	 * 
	 */
	public void setInteractionResource(EObject newValue) {
		if (newValue != null) {
			interactionResource.setSelection(new StructuredSelection(newValue));
		} else {
			interactionResource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.interactionResource);
		if (readOnly && interactionResource.isEnabled()) {
			interactionResource.setEnabled(false);
			interactionResource.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !interactionResource.isEnabled()) {
			interactionResource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setInteractionResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInteractionResourceButtonMode(ButtonsModeEnum newValue) {
		interactionResource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addFilterInteractionResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInteractionResource(ViewerFilter filter) {
		interactionResource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#addBusinessFilterInteractionResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInteractionResource(ViewerFilter filter) {
		interactionResource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getRtpExecutionTime()
	 * 
	 */
	public EObject getRtpExecutionTime() {
		return (EObject) rtpExecutionTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initRtpExecutionTime(EObjectFlatComboSettings)
	 */
	public void initRtpExecutionTime(EObjectFlatComboSettings settings) {
		rtpExecutionTime.setAdapterFactory(adapterFactory);
		rtpExecutionTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setRtpExecutionTime(EObject newValue)
	 * 
	 */
	public void setRtpExecutionTime(EObject newValue) {
		rtpExecutionTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpExecutionTime);
		if (readOnly && rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(false);
			rtpExecutionTime.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpExecutionTime.isEnabled()) {
			rtpExecutionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getRtpDeadline()
	 * 
	 */
	public EObject getRtpDeadline() {
		return (EObject) rtpDeadline.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initRtpDeadline(EObjectFlatComboSettings)
	 */
	public void initRtpDeadline(EObjectFlatComboSettings settings) {
		rtpDeadline.setAdapterFactory(adapterFactory);
		rtpDeadline.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setRtpDeadline(EObject newValue)
	 * 
	 */
	public void setRtpDeadline(EObject newValue) {
		rtpDeadline.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpDeadline);
		if (readOnly && rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(false);
			rtpDeadline.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpDeadline.isEnabled()) {
			rtpDeadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getRtpBlockingTime()
	 * 
	 */
	public EObject getRtpBlockingTime() {
		return (EObject) rtpBlockingTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initRtpBlockingTime(EObjectFlatComboSettings)
	 */
	public void initRtpBlockingTime(EObjectFlatComboSettings settings) {
		rtpBlockingTime.setAdapterFactory(adapterFactory);
		rtpBlockingTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setRtpBlockingTime(EObject newValue)
	 * 
	 */
	public void setRtpBlockingTime(EObject newValue) {
		rtpBlockingTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpBlockingTime);
		if (readOnly && rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(false);
			rtpBlockingTime.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpBlockingTime.isEnabled()) {
			rtpBlockingTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#getRtpRepetition()
	 * 
	 */
	public EObject getRtpRepetition() {
		return (EObject) rtpRepetition.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#initRtpRepetition(EObjectFlatComboSettings)
	 */
	public void initRtpRepetition(EObjectFlatComboSettings settings) {
		rtpRepetition.setAdapterFactory(adapterFactory);
		rtpRepetition.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
		} else if (!readOnly && !rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbReleaseStepPropertiesEditionPart#setRtpRepetition(EObject newValue)
	 * 
	 */
	public void setRtpRepetition(EObject newValue) {
		rtpRepetition.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbReleaseStep.Properties.rtpRepetition);
		if (readOnly && rtpRepetition.isEnabled()) {
			rtpRepetition.setEnabled(false);
			rtpRepetition.setToolTipText(SoftwareBehaviorMessages.SbReleaseStep_ReadOnly);
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
		return SoftwareBehaviorMessages.SbReleaseStep_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
