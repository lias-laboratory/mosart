/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts.forms;

// Start of user code for imports
import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart;

import MoSaRT.HardwarePlatform.providers.HardwarePlatformMessages;

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
public class HpProcessingUnitPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, HpProcessingUnitPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer commChannel;
	protected ReferencesTable spaceProcesses;
	protected List<ViewerFilter> spaceProcessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> spaceProcessesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable candidateTasks;
	protected List<ViewerFilter> candidateTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> candidateTasksFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedulableTasks;
	protected List<ViewerFilter> schedulableTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulableTasksFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer processorInterconnector;
	protected SingleCompositionEditor rtpUtilizationFactor;
	protected SingleCompositionEditor rtpComputingSpeed;



	/**
	 * For {@link ISection} use only.
	 */
	public HpProcessingUnitPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HpProcessingUnitPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hpProcessingUnitStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hpProcessingUnitStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.class);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed);
		
		
		composer = new PartComposer(hpProcessingUnitStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel) {
					return createCommChannelFlatComboViewer(parent, widgetFactory);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses) {
					return createSpaceProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks) {
					return createCandidateTasksReferencesTable(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks) {
					return createSchedulableTasksReferencesTable(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector) {
					return createProcessorInterconnectorFlatComboViewer(parent, widgetFactory);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor) {
					return createRtpUtilizationFactorSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed) {
					return createRtpComputingSpeedSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_NameLabel);
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
							HpProcessingUnitPropertiesEditionPartForm.this,
							HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									HpProcessingUnitPropertiesEditionPartForm.this,
									HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name,
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
									HpProcessingUnitPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name, HardwarePlatformViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCommChannelFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_CommChannelLabel);
		commChannel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel, HardwarePlatformViewsRepository.FORM_KIND));
		widgetFactory.adapt(commChannel);
		commChannel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData commChannelData = new GridData(GridData.FILL_HORIZONTAL);
		commChannel.setLayoutData(commChannelData);
		commChannel.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCommChannel()));
			}

		});
		commChannel.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel, HardwarePlatformViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSpaceProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.spaceProcesses = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_SpaceProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSpaceProcesses(); }
			public void handleEdit(EObject element) { editSpaceProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSpaceProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSpaceProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.spaceProcesses.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses, HardwarePlatformViewsRepository.FORM_KIND));
		this.spaceProcesses.createControls(parent, widgetFactory);
		this.spaceProcesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData spaceProcessesData = new GridData(GridData.FILL_HORIZONTAL);
		spaceProcessesData.horizontalSpan = 3;
		this.spaceProcesses.setLayoutData(spaceProcessesData);
		this.spaceProcesses.disableMove();
		spaceProcesses.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses);
		spaceProcesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSpaceProcesses() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(spaceProcesses.getInput(), spaceProcessesFilters, spaceProcessesBusinessFilters,
		"spaceProcesses", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				spaceProcesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSpaceProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		spaceProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSpaceProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		spaceProcesses.refresh();
	}

	/**
	 * 
	 */
	protected void editSpaceProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				spaceProcesses.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCandidateTasksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.candidateTasks = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_CandidateTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addCandidateTasks(); }
			public void handleEdit(EObject element) { editCandidateTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCandidateTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCandidateTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.candidateTasks.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks, HardwarePlatformViewsRepository.FORM_KIND));
		this.candidateTasks.createControls(parent, widgetFactory);
		this.candidateTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData candidateTasksData = new GridData(GridData.FILL_HORIZONTAL);
		candidateTasksData.horizontalSpan = 3;
		this.candidateTasks.setLayoutData(candidateTasksData);
		this.candidateTasks.disableMove();
		candidateTasks.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks);
		candidateTasks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCandidateTasks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(candidateTasks.getInput(), candidateTasksFilters, candidateTasksBusinessFilters,
		"candidateTasks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				candidateTasks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCandidateTasks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		candidateTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCandidateTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		candidateTasks.refresh();
	}

	/**
	 * 
	 */
	protected void editCandidateTasks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				candidateTasks.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSchedulableTasksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.schedulableTasks = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_SchedulableTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSchedulableTasks(); }
			public void handleEdit(EObject element) { editSchedulableTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSchedulableTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSchedulableTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.schedulableTasks.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks, HardwarePlatformViewsRepository.FORM_KIND));
		this.schedulableTasks.createControls(parent, widgetFactory);
		this.schedulableTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulableTasksData = new GridData(GridData.FILL_HORIZONTAL);
		schedulableTasksData.horizontalSpan = 3;
		this.schedulableTasks.setLayoutData(schedulableTasksData);
		this.schedulableTasks.disableMove();
		schedulableTasks.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks);
		schedulableTasks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSchedulableTasks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(schedulableTasks.getInput(), schedulableTasksFilters, schedulableTasksBusinessFilters,
		"schedulableTasks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				schedulableTasks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSchedulableTasks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulableTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulableTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		schedulableTasks.refresh();
	}

	/**
	 * 
	 */
	protected void editSchedulableTasks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				schedulableTasks.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createProcessorInterconnectorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_ProcessorInterconnectorLabel);
		processorInterconnector = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector, HardwarePlatformViewsRepository.FORM_KIND));
		widgetFactory.adapt(processorInterconnector);
		processorInterconnector.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData processorInterconnectorData = new GridData(GridData.FILL_HORIZONTAL);
		processorInterconnector.setLayoutData(processorInterconnectorData);
		processorInterconnector.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProcessorInterconnector()));
			}

		});
		processorInterconnector.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector, HardwarePlatformViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpUtilizationFactorSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_RtpUtilizationFactorLabel);
		//create widget
		rtpUtilizationFactor = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpUtilizationFactorData = new GridData(GridData.FILL_HORIZONTAL);
		rtpUtilizationFactor.setLayoutData(rtpUtilizationFactorData);
		rtpUtilizationFactor.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this,  HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpUtilizationFactor.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this,  HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpUtilizationFactor.refresh();
			}
		});
		rtpUtilizationFactor.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor, HardwarePlatformViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpComputingSpeedSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed, HardwarePlatformMessages.HpProcessingUnitPropertiesEditionPart_RtpComputingSpeedLabel);
		//create widget
		rtpComputingSpeed = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpComputingSpeedData = new GridData(GridData.FILL_HORIZONTAL);
		rtpComputingSpeed.setLayoutData(rtpComputingSpeedData);
		rtpComputingSpeed.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this,  HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpComputingSpeed.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessingUnitPropertiesEditionPartForm.this,  HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpComputingSpeed.refresh();
			}
		});
		rtpComputingSpeed.setID(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed, HardwarePlatformViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#getCommChannel()
	 * 
	 */
	public EObject getCommChannel() {
		if (commChannel.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) commChannel.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initCommChannel(EObjectFlatComboSettings)
	 */
	public void initCommChannel(EObjectFlatComboSettings settings) {
		commChannel.setInput(settings);
		if (current != null) {
			commChannel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel);
		if (readOnly && commChannel.isEnabled()) {
			commChannel.setEnabled(false);
			commChannel.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !commChannel.isEnabled()) {
			commChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setCommChannel(EObject newValue)
	 * 
	 */
	public void setCommChannel(EObject newValue) {
		if (newValue != null) {
			commChannel.setSelection(new StructuredSelection(newValue));
		} else {
			commChannel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.commChannel);
		if (readOnly && commChannel.isEnabled()) {
			commChannel.setEnabled(false);
			commChannel.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !commChannel.isEnabled()) {
			commChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setCommChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCommChannelButtonMode(ButtonsModeEnum newValue) {
		commChannel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addFilterCommChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommChannel(ViewerFilter filter) {
		commChannel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addBusinessFilterCommChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommChannel(ViewerFilter filter) {
		commChannel.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initSpaceProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSpaceProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		spaceProcesses.setContentProvider(contentProvider);
		spaceProcesses.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.spaceProcesses);
		if (readOnly && spaceProcesses.getTable().isEnabled()) {
			spaceProcesses.setEnabled(false);
			spaceProcesses.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !spaceProcesses.getTable().isEnabled()) {
			spaceProcesses.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#updateSpaceProcesses()
	 * 
	 */
	public void updateSpaceProcesses() {
	spaceProcesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addFilterSpaceProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpaceProcesses(ViewerFilter filter) {
		spaceProcessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addBusinessFilterSpaceProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpaceProcesses(ViewerFilter filter) {
		spaceProcessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#isContainedInSpaceProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSpaceProcessesTable(EObject element) {
		return ((ReferencesTableSettings)spaceProcesses.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initCandidateTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCandidateTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		candidateTasks.setContentProvider(contentProvider);
		candidateTasks.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.candidateTasks);
		if (readOnly && candidateTasks.getTable().isEnabled()) {
			candidateTasks.setEnabled(false);
			candidateTasks.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !candidateTasks.getTable().isEnabled()) {
			candidateTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#updateCandidateTasks()
	 * 
	 */
	public void updateCandidateTasks() {
	candidateTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addFilterCandidateTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCandidateTasks(ViewerFilter filter) {
		candidateTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addBusinessFilterCandidateTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCandidateTasks(ViewerFilter filter) {
		candidateTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#isContainedInCandidateTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInCandidateTasksTable(EObject element) {
		return ((ReferencesTableSettings)candidateTasks.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initSchedulableTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSchedulableTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulableTasks.setContentProvider(contentProvider);
		schedulableTasks.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.schedulableTasks);
		if (readOnly && schedulableTasks.getTable().isEnabled()) {
			schedulableTasks.setEnabled(false);
			schedulableTasks.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !schedulableTasks.getTable().isEnabled()) {
			schedulableTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#updateSchedulableTasks()
	 * 
	 */
	public void updateSchedulableTasks() {
	schedulableTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addFilterSchedulableTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSchedulableTasks(ViewerFilter filter) {
		schedulableTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addBusinessFilterSchedulableTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSchedulableTasks(ViewerFilter filter) {
		schedulableTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#isContainedInSchedulableTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInSchedulableTasksTable(EObject element) {
		return ((ReferencesTableSettings)schedulableTasks.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#getProcessorInterconnector()
	 * 
	 */
	public EObject getProcessorInterconnector() {
		if (processorInterconnector.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) processorInterconnector.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initProcessorInterconnector(EObjectFlatComboSettings)
	 */
	public void initProcessorInterconnector(EObjectFlatComboSettings settings) {
		processorInterconnector.setInput(settings);
		if (current != null) {
			processorInterconnector.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector);
		if (readOnly && processorInterconnector.isEnabled()) {
			processorInterconnector.setEnabled(false);
			processorInterconnector.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !processorInterconnector.isEnabled()) {
			processorInterconnector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setProcessorInterconnector(EObject newValue)
	 * 
	 */
	public void setProcessorInterconnector(EObject newValue) {
		if (newValue != null) {
			processorInterconnector.setSelection(new StructuredSelection(newValue));
		} else {
			processorInterconnector.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.processorInterconnector);
		if (readOnly && processorInterconnector.isEnabled()) {
			processorInterconnector.setEnabled(false);
			processorInterconnector.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !processorInterconnector.isEnabled()) {
			processorInterconnector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setProcessorInterconnectorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProcessorInterconnectorButtonMode(ButtonsModeEnum newValue) {
		processorInterconnector.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addFilterProcessorInterconnector(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessorInterconnector(ViewerFilter filter) {
		processorInterconnector.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#addBusinessFilterProcessorInterconnector(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessorInterconnector(ViewerFilter filter) {
		processorInterconnector.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#getRtpUtilizationFactor()
	 * 
	 */
	public EObject getRtpUtilizationFactor() {
		return (EObject) rtpUtilizationFactor.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initRtpUtilizationFactor(EObjectFlatComboSettings)
	 */
	public void initRtpUtilizationFactor(EObjectFlatComboSettings settings) {
		rtpUtilizationFactor.setAdapterFactory(adapterFactory);
		rtpUtilizationFactor.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor);
		if (readOnly && rtpUtilizationFactor.isEnabled()) {
			rtpUtilizationFactor.setEnabled(false);
			rtpUtilizationFactor.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !rtpUtilizationFactor.isEnabled()) {
			rtpUtilizationFactor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setRtpUtilizationFactor(EObject newValue)
	 * 
	 */
	public void setRtpUtilizationFactor(EObject newValue) {
		rtpUtilizationFactor.refresh();
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpUtilizationFactor);
		if (readOnly && rtpUtilizationFactor.isEnabled()) {
			rtpUtilizationFactor.setEnabled(false);
			rtpUtilizationFactor.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !rtpUtilizationFactor.isEnabled()) {
			rtpUtilizationFactor.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#getRtpComputingSpeed()
	 * 
	 */
	public EObject getRtpComputingSpeed() {
		return (EObject) rtpComputingSpeed.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#initRtpComputingSpeed(EObjectFlatComboSettings)
	 */
	public void initRtpComputingSpeed(EObjectFlatComboSettings settings) {
		rtpComputingSpeed.setAdapterFactory(adapterFactory);
		rtpComputingSpeed.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed);
		if (readOnly && rtpComputingSpeed.isEnabled()) {
			rtpComputingSpeed.setEnabled(false);
			rtpComputingSpeed.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !rtpComputingSpeed.isEnabled()) {
			rtpComputingSpeed.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessingUnitPropertiesEditionPart#setRtpComputingSpeed(EObject newValue)
	 * 
	 */
	public void setRtpComputingSpeed(EObject newValue) {
		rtpComputingSpeed.refresh();
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessingUnit.Properties.rtpComputingSpeed);
		if (readOnly && rtpComputingSpeed.isEnabled()) {
			rtpComputingSpeed.setEnabled(false);
			rtpComputingSpeed.setToolTipText(HardwarePlatformMessages.HpProcessingUnit_ReadOnly);
		} else if (!readOnly && !rtpComputingSpeed.isEnabled()) {
			rtpComputingSpeed.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HardwarePlatformMessages.HpProcessingUnit_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
