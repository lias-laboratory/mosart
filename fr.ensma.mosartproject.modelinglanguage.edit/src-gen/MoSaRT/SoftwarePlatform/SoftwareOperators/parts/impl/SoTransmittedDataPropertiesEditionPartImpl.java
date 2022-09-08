/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareOperators.providers.SoftwareOperatorsMessages;

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
public class SoTransmittedDataPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SoTransmittedDataPropertiesEditionPart {

	protected EObjectFlatComboViewer sourceTask;
	protected ReferencesTable targetTasks;
	protected List<ViewerFilter> targetTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> targetTasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	private SingleCompositionEditor rtpDataSize;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoTransmittedDataPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence soTransmittedDataStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = soTransmittedDataStep.addStep(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize);
		
		
		composer = new PartComposer(soTransmittedDataStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask) {
					return createSourceTaskFlatComboViewer(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks) {
					return createTargetTasksAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize) {
					return createRtpDataSizeSingleCompositionEditor(parent);
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
		propertiesGroup.setText(SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceTaskFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_SourceTaskLabel);
		sourceTask = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, SoftwareOperatorsViewsRepository.SWT_KIND));
		sourceTask.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sourceTask.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSourceTask()));
			}

		});
		GridData sourceTaskData = new GridData(GridData.FILL_HORIZONTAL);
		sourceTask.setLayoutData(sourceTaskData);
		sourceTask.setID(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTargetTasksAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_TargetTasksLabel);		 
		this.targetTasks = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTargetTasks(); }
			public void handleEdit(EObject element) { editTargetTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTargetTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTargetTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.targetTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.targetTasks.createControls(parent);
		this.targetTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData targetTasksData = new GridData(GridData.FILL_HORIZONTAL);
		targetTasksData.horizontalSpan = 3;
		this.targetTasks.setLayoutData(targetTasksData);
		this.targetTasks.disableMove();
		targetTasks.setID(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks);
		targetTasks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTargetTasks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(targetTasks.getInput(), targetTasksFilters, targetTasksBusinessFilters,
		"targetTasks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				targetTasks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTargetTasks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		targetTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTargetTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		targetTasks.refresh();
	}

	/**
	 * 
	 */
	protected void editTargetTasks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				targetTasks.refresh();
			}
		}
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpDataSizeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_RtpDataSizeLabel);
		//create widget
		rtpDataSize = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpDataSizeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDataSize.setLayoutData(rtpDataSizeData);
		rtpDataSize.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDataSize.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDataSize.refresh();
			}
		});
		rtpDataSize.setID(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#getSourceTask()
	 * 
	 */
	public EObject getSourceTask() {
		if (sourceTask.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourceTask.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#initSourceTask(EObjectFlatComboSettings)
	 */
	public void initSourceTask(EObjectFlatComboSettings settings) {
		sourceTask.setInput(settings);
		if (current != null) {
			sourceTask.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask);
		if (readOnly && sourceTask.isEnabled()) {
			sourceTask.setEnabled(false);
			sourceTask.setToolTipText(SoftwareOperatorsMessages.SoTransmittedData_ReadOnly);
		} else if (!readOnly && !sourceTask.isEnabled()) {
			sourceTask.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#setSourceTask(EObject newValue)
	 * 
	 */
	public void setSourceTask(EObject newValue) {
		if (newValue != null) {
			sourceTask.setSelection(new StructuredSelection(newValue));
		} else {
			sourceTask.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask);
		if (readOnly && sourceTask.isEnabled()) {
			sourceTask.setEnabled(false);
			sourceTask.setToolTipText(SoftwareOperatorsMessages.SoTransmittedData_ReadOnly);
		} else if (!readOnly && !sourceTask.isEnabled()) {
			sourceTask.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#setSourceTaskButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceTaskButtonMode(ButtonsModeEnum newValue) {
		sourceTask.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#addFilterSourceTask(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSourceTask(ViewerFilter filter) {
		sourceTask.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#addBusinessFilterSourceTask(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSourceTask(ViewerFilter filter) {
		sourceTask.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#initTargetTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTargetTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		targetTasks.setContentProvider(contentProvider);
		targetTasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks);
		if (readOnly && targetTasks.getTable().isEnabled()) {
			targetTasks.setEnabled(false);
			targetTasks.setToolTipText(SoftwareOperatorsMessages.SoTransmittedData_ReadOnly);
		} else if (!readOnly && !targetTasks.getTable().isEnabled()) {
			targetTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#updateTargetTasks()
	 * 
	 */
	public void updateTargetTasks() {
	targetTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#addFilterTargetTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetTasks(ViewerFilter filter) {
		targetTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#addBusinessFilterTargetTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetTasks(ViewerFilter filter) {
		targetTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#isContainedInTargetTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTasksTable(EObject element) {
		return ((ReferencesTableSettings)targetTasks.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SoTransmittedData_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#getRtpDataSize()
	 * 
	 */
	public EObject getRtpDataSize() {
		return (EObject) rtpDataSize.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#initRtpDataSize(EObjectFlatComboSettings)
	 */
	public void initRtpDataSize(EObjectFlatComboSettings settings) {
		rtpDataSize.setAdapterFactory(adapterFactory);
		rtpDataSize.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize);
		if (readOnly && rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(false);
			rtpDataSize.setToolTipText(SoftwareOperatorsMessages.SoTransmittedData_ReadOnly);
		} else if (!readOnly && !rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoTransmittedDataPropertiesEditionPart#setRtpDataSize(EObject newValue)
	 * 
	 */
	public void setRtpDataSize(EObject newValue) {
		rtpDataSize.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize);
		if (readOnly && rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(false);
			rtpDataSize.setToolTipText(SoftwareOperatorsMessages.SoTransmittedData_ReadOnly);
		} else if (!readOnly && !rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareOperatorsMessages.SoTransmittedData_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
