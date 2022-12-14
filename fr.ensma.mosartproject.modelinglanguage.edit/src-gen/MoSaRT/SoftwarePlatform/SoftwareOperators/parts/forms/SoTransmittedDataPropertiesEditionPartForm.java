/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms;

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
public class SoTransmittedDataPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SoTransmittedDataPropertiesEditionPart {

	protected EObjectFlatComboViewer sourceTask;
	protected ReferencesTable targetTasks;
	protected List<ViewerFilter> targetTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> targetTasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected SingleCompositionEditor rtpDataSize;



	/**
	 * For {@link ISection} use only.
	 */
	public SoTransmittedDataPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoTransmittedDataPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask) {
					return createSourceTaskFlatComboViewer(parent, widgetFactory);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks) {
					return createTargetTasksReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize) {
					return createRtpDataSizeSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceTaskFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_SourceTaskLabel);
		sourceTask = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, SoftwareOperatorsViewsRepository.FORM_KIND));
		widgetFactory.adapt(sourceTask);
		sourceTask.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceTaskData = new GridData(GridData.FILL_HORIZONTAL);
		sourceTask.setLayoutData(sourceTaskData);
		sourceTask.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSourceTask()));
			}

		});
		sourceTask.setID(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.sourceTask, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createTargetTasksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.targetTasks = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_TargetTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addTargetTasks(); }
			public void handleEdit(EObject element) { editTargetTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTargetTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTargetTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.targetTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.targetTasks.createControls(parent, widgetFactory);
		this.targetTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		targetTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTargetTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.targetTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_NameLabel);
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
							SoTransmittedDataPropertiesEditionPartForm.this,
							SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SoTransmittedDataPropertiesEditionPartForm.this,
									SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name,
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
									SoTransmittedDataPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.name, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpDataSizeSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, SoftwareOperatorsMessages.SoTransmittedDataPropertiesEditionPart_RtpDataSizeLabel);
		//create widget
		rtpDataSize = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpDataSizeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDataSize.setLayoutData(rtpDataSizeData);
		rtpDataSize.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDataSize.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoTransmittedDataPropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDataSize.refresh();
			}
		});
		rtpDataSize.setID(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoTransmittedData.Properties.rtpDataSize, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
