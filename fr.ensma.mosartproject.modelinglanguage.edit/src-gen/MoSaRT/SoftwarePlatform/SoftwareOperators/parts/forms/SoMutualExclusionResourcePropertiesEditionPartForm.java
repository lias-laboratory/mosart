/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms;

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

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

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
public class SoMutualExclusionResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SoMutualExclusionResourcePropertiesEditionPart {

	protected ReferencesTable tasks;
	protected List<ViewerFilter> tasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> tasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected SingleCompositionEditor rtpProtectProtocol;
	protected SingleCompositionEditor rtpWaitingQueuePolicy;



	/**
	 * For {@link ISection} use only.
	 */
	public SoMutualExclusionResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoMutualExclusionResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks) {
					return createTasksReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol) {
					return createRtpProtectProtocolSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy) {
					return createRtpWaitingQueuePolicySingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * 
	 */
	protected Composite createTasksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.tasks = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_TasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addTasks(); }
			public void handleEdit(EObject element) { editTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.tasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.tasks.createControls(parent, widgetFactory);
		this.tasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		tasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.tasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_NameLabel);
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
							SoMutualExclusionResourcePropertiesEditionPartForm.this,
							SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SoMutualExclusionResourcePropertiesEditionPartForm.this,
									SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name,
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
									SoMutualExclusionResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.name, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpProtectProtocolSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_RtpProtectProtocolLabel);
		//create widget
		rtpProtectProtocol = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpProtectProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		rtpProtectProtocol.setLayoutData(rtpProtectProtocolData);
		rtpProtectProtocol.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpProtectProtocol.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpProtectProtocol.refresh();
			}
		});
		rtpProtectProtocol.setID(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpProtectProtocol, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpWaitingQueuePolicySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, SoftwareOperatorsMessages.SoMutualExclusionResourcePropertiesEditionPart_RtpWaitingQueuePolicyLabel);
		//create widget
		rtpWaitingQueuePolicy = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpWaitingQueuePolicyData = new GridData(GridData.FILL_HORIZONTAL);
		rtpWaitingQueuePolicy.setLayoutData(rtpWaitingQueuePolicyData);
		rtpWaitingQueuePolicy.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpWaitingQueuePolicy.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoMutualExclusionResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpWaitingQueuePolicy.refresh();
			}
		});
		rtpWaitingQueuePolicy.setID(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoMutualExclusionResource.Properties.rtpWaitingQueuePolicy, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
