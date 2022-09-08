/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareOperators.providers.SoftwareOperatorsMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
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
public class SoMutualExclusionResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SoMutualExclusionResourcePropertiesEditionPart {

	protected ReferencesTable tasks;
	protected List<ViewerFilter> tasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	private SingleCompositionEditor rtpProtectProtocol;
	private SingleCompositionEditor rtpWaitingQueuePolicy;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoMutualExclusionResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence soMutualExclusionResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = soMutualExclusionResourceStep.addStep(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy);
		
		
		composer = new PartComposer(soMutualExclusionResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks) {
					return createTasksAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol) {
					return createRtpProtectProtocolSingleCompositionEditor(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy) {
					return createRtpWaitingQueuePolicySingleCompositionEditor(parent);
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
		propertiesGroup.setText(SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createTasksAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_TasksLabel);		 
		this.tasks = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTasks(); }
			public void handleEdit(EObject element) { editTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.tasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.tasks.createControls(parent);
		this.tasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData tasksData = new GridData(GridData.FILL_HORIZONTAL);
		tasksData.horizontalSpan = 3;
		this.tasks.setLayoutData(tasksData);
		this.tasks.disableMove();
		tasks.setID(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks);
		tasks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTasks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(tasks.getInput(), tasksFilters, tasksBusinessFilters,
		"tasks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				tasks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTasks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		tasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		tasks.refresh();
	}

	/**
	 * 
	 */
	protected void editTasks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				tasks.refresh();
			}
		}
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpProtectProtocolSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_RtpProtectProtocolLabel);
		//create widget
		rtpProtectProtocol = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpProtectProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		rtpProtectProtocol.setLayoutData(rtpProtectProtocolData);
		rtpProtectProtocol.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpProtectProtocol.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpProtectProtocol.refresh();
			}
		});
		rtpProtectProtocol.setID(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpWaitingQueuePolicySingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_RtpWaitingQueuePolicyLabel);
		//create widget
		rtpWaitingQueuePolicy = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpWaitingQueuePolicyData = new GridData(GridData.FILL_HORIZONTAL);
		rtpWaitingQueuePolicy.setLayoutData(rtpWaitingQueuePolicyData);
		rtpWaitingQueuePolicy.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpWaitingQueuePolicy.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpWaitingQueuePolicy.refresh();
			}
		});
		rtpWaitingQueuePolicy.setID(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#initTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		tasks.setContentProvider(contentProvider);
		tasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks);
		if (readOnly && tasks.getTable().isEnabled()) {
			tasks.setEnabled(false);
			tasks.setToolTipText(SoftwareOperatorsMessages.SoMutualExclusionResource_ReadOnly);
		} else if (!readOnly && !tasks.getTable().isEnabled()) {
			tasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#updateTasks()
	 * 
	 */
	public void updateTasks() {
	tasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#addFilterTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTasks(ViewerFilter filter) {
		tasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#addBusinessFilterTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTasks(ViewerFilter filter) {
		tasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#isContainedInTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInTasksTable(EObject element) {
		return ((ReferencesTableSettings)tasks.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SoMutualExclusionResource_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#getRtpProtectProtocol()
	 * 
	 */
	public EObject getRtpProtectProtocol() {
		return (EObject) rtpProtectProtocol.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#initRtpProtectProtocol(EObjectFlatComboSettings)
	 */
	public void initRtpProtectProtocol(EObjectFlatComboSettings settings) {
		rtpProtectProtocol.setAdapterFactory(adapterFactory);
		rtpProtectProtocol.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol);
		if (readOnly && rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(false);
			rtpProtectProtocol.setToolTipText(SoftwareOperatorsMessages.SoMutualExclusionResource_ReadOnly);
		} else if (!readOnly && !rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#setRtpProtectProtocol(EObject newValue)
	 * 
	 */
	public void setRtpProtectProtocol(EObject newValue) {
		rtpProtectProtocol.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol);
		if (readOnly && rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(false);
			rtpProtectProtocol.setToolTipText(SoftwareOperatorsMessages.SoMutualExclusionResource_ReadOnly);
		} else if (!readOnly && !rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#getRtpWaitingQueuePolicy()
	 * 
	 */
	public EObject getRtpWaitingQueuePolicy() {
		return (EObject) rtpWaitingQueuePolicy.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#initRtpWaitingQueuePolicy(EObjectFlatComboSettings)
	 */
	public void initRtpWaitingQueuePolicy(EObjectFlatComboSettings settings) {
		rtpWaitingQueuePolicy.setAdapterFactory(adapterFactory);
		rtpWaitingQueuePolicy.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy);
		if (readOnly && rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(false);
			rtpWaitingQueuePolicy.setToolTipText(SoftwareOperatorsMessages.SoMutualExclusionResource_ReadOnly);
		} else if (!readOnly && !rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoMutualExclusionResourcePropertiesEditionPart#setRtpWaitingQueuePolicy(EObject newValue)
	 * 
	 */
	public void setRtpWaitingQueuePolicy(EObject newValue) {
		rtpWaitingQueuePolicy.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy);
		if (readOnly && rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(false);
			rtpWaitingQueuePolicy.setToolTipText(SoftwareOperatorsMessages.SoMutualExclusionResource_ReadOnly);
		} else if (!readOnly && !rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareOperatorsMessages.SoMutualExclusionResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
