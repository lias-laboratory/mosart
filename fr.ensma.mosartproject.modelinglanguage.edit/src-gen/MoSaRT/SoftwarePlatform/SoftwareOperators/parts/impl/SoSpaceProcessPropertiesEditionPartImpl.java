/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart;
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
public class SoSpaceProcessPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SoSpaceProcessPropertiesEditionPart {

	protected EObjectFlatComboViewer spaceProcessParent;
	protected ReferencesTable spaceProcessChildren;
	protected List<ViewerFilter> spaceProcessChildrenBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> spaceProcessChildrenFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable schedulableTasks;
	protected List<ViewerFilter> schedulableTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulableTasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected ReferencesTable processingUnit;
	protected List<ViewerFilter> processingUnitBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processingUnitFilters = new ArrayList<ViewerFilter>();
	private SingleCompositionEditor rtpSchedulingPolicy;
	private SingleCompositionEditor rtpTaskAllocation;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoSpaceProcessPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence soSpaceProcessStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = soSpaceProcessStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation);
		
		
		composer = new PartComposer(soSpaceProcessStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent) {
					return createSpaceProcessParentFlatComboViewer(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren) {
					return createSpaceProcessChildrenAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks) {
					return createSchedulableTasksAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit) {
					return createProcessingUnitAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy) {
					return createRtpSchedulingPolicySingleCompositionEditor(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation) {
					return createRtpTaskAllocationSingleCompositionEditor(parent);
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
		propertiesGroup.setText(SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createSpaceProcessParentFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_SpaceProcessParentLabel);
		spaceProcessParent = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent, SoftwareOperatorsViewsRepository.SWT_KIND));
		spaceProcessParent.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		spaceProcessParent.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSpaceProcessParent()));
			}

		});
		GridData spaceProcessParentData = new GridData(GridData.FILL_HORIZONTAL);
		spaceProcessParent.setLayoutData(spaceProcessParentData);
		spaceProcessParent.setID(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSpaceProcessChildrenAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_SpaceProcessChildrenLabel);		 
		this.spaceProcessChildren = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSpaceProcessChildren(); }
			public void handleEdit(EObject element) { editSpaceProcessChildren(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSpaceProcessChildren(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSpaceProcessChildren(element); }
			public void navigateTo(EObject element) { }
		});
		this.spaceProcessChildren.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.spaceProcessChildren.createControls(parent);
		this.spaceProcessChildren.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData spaceProcessChildrenData = new GridData(GridData.FILL_HORIZONTAL);
		spaceProcessChildrenData.horizontalSpan = 3;
		this.spaceProcessChildren.setLayoutData(spaceProcessChildrenData);
		this.spaceProcessChildren.disableMove();
		spaceProcessChildren.setID(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren);
		spaceProcessChildren.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSpaceProcessChildren() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(spaceProcessChildren.getInput(), spaceProcessChildrenFilters, spaceProcessChildrenBusinessFilters,
		"spaceProcessChildren", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				spaceProcessChildren.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSpaceProcessChildren(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		spaceProcessChildren.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSpaceProcessChildren(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		spaceProcessChildren.refresh();
	}

	/**
	 * 
	 */
	protected void editSpaceProcessChildren(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				spaceProcessChildren.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createSchedulableTasksAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_SchedulableTasksLabel);		 
		this.schedulableTasks = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSchedulableTasks(); }
			public void handleEdit(EObject element) { editSchedulableTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSchedulableTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSchedulableTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.schedulableTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.schedulableTasks.createControls(parent);
		this.schedulableTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulableTasksData = new GridData(GridData.FILL_HORIZONTAL);
		schedulableTasksData.horizontalSpan = 3;
		this.schedulableTasks.setLayoutData(schedulableTasksData);
		this.schedulableTasks.disableMove();
		schedulableTasks.setID(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulableTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulableTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessingUnitAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_ProcessingUnitLabel);		 
		this.processingUnit = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcessingUnit(); }
			public void handleEdit(EObject element) { editProcessingUnit(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcessingUnit(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcessingUnit(element); }
			public void navigateTo(EObject element) { }
		});
		this.processingUnit.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.processingUnit.createControls(parent);
		this.processingUnit.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processingUnitData = new GridData(GridData.FILL_HORIZONTAL);
		processingUnitData.horizontalSpan = 3;
		this.processingUnit.setLayoutData(processingUnitData);
		this.processingUnit.disableMove();
		processingUnit.setID(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit);
		processingUnit.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessingUnit() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processingUnit.getInput(), processingUnitFilters, processingUnitBusinessFilters,
		"processingUnit", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processingUnit.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessingUnit(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processingUnit.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessingUnit(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processingUnit.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessingUnit(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processingUnit.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpSchedulingPolicySingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_RtpSchedulingPolicyLabel);
		//create widget
		rtpSchedulingPolicy = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpSchedulingPolicyData = new GridData(GridData.FILL_HORIZONTAL);
		rtpSchedulingPolicy.setLayoutData(rtpSchedulingPolicyData);
		rtpSchedulingPolicy.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpSchedulingPolicy.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpSchedulingPolicy.refresh();
			}
		});
		rtpSchedulingPolicy.setID(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpTaskAllocationSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation, SoftwareOperatorsMessages.SoSpaceProcessPropertiesEditionPart_RtpTaskAllocationLabel);
		//create widget
		rtpTaskAllocation = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpTaskAllocationData = new GridData(GridData.FILL_HORIZONTAL);
		rtpTaskAllocation.setLayoutData(rtpTaskAllocationData);
		rtpTaskAllocation.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpTaskAllocation.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSpaceProcessPropertiesEditionPartImpl.this,  SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpTaskAllocation.refresh();
			}
		});
		rtpTaskAllocation.setID(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#getSpaceProcessParent()
	 * 
	 */
	public EObject getSpaceProcessParent() {
		if (spaceProcessParent.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) spaceProcessParent.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#initSpaceProcessParent(EObjectFlatComboSettings)
	 */
	public void initSpaceProcessParent(EObjectFlatComboSettings settings) {
		spaceProcessParent.setInput(settings);
		if (current != null) {
			spaceProcessParent.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent);
		if (readOnly && spaceProcessParent.isEnabled()) {
			spaceProcessParent.setEnabled(false);
			spaceProcessParent.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !spaceProcessParent.isEnabled()) {
			spaceProcessParent.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#setSpaceProcessParent(EObject newValue)
	 * 
	 */
	public void setSpaceProcessParent(EObject newValue) {
		if (newValue != null) {
			spaceProcessParent.setSelection(new StructuredSelection(newValue));
		} else {
			spaceProcessParent.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessParent);
		if (readOnly && spaceProcessParent.isEnabled()) {
			spaceProcessParent.setEnabled(false);
			spaceProcessParent.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !spaceProcessParent.isEnabled()) {
			spaceProcessParent.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#setSpaceProcessParentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSpaceProcessParentButtonMode(ButtonsModeEnum newValue) {
		spaceProcessParent.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addFilterSpaceProcessParent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpaceProcessParent(ViewerFilter filter) {
		spaceProcessParent.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addBusinessFilterSpaceProcessParent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpaceProcessParent(ViewerFilter filter) {
		spaceProcessParent.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#initSpaceProcessChildren(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSpaceProcessChildren(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		spaceProcessChildren.setContentProvider(contentProvider);
		spaceProcessChildren.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.spaceProcessChildren);
		if (readOnly && spaceProcessChildren.getTable().isEnabled()) {
			spaceProcessChildren.setEnabled(false);
			spaceProcessChildren.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !spaceProcessChildren.getTable().isEnabled()) {
			spaceProcessChildren.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#updateSpaceProcessChildren()
	 * 
	 */
	public void updateSpaceProcessChildren() {
	spaceProcessChildren.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addFilterSpaceProcessChildren(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSpaceProcessChildren(ViewerFilter filter) {
		spaceProcessChildrenFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addBusinessFilterSpaceProcessChildren(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSpaceProcessChildren(ViewerFilter filter) {
		spaceProcessChildrenBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#isContainedInSpaceProcessChildrenTable(EObject element)
	 * 
	 */
	public boolean isContainedInSpaceProcessChildrenTable(EObject element) {
		return ((ReferencesTableSettings)spaceProcessChildren.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#initSchedulableTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSchedulableTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulableTasks.setContentProvider(contentProvider);
		schedulableTasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.schedulableTasks);
		if (readOnly && schedulableTasks.getTable().isEnabled()) {
			schedulableTasks.setEnabled(false);
			schedulableTasks.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !schedulableTasks.getTable().isEnabled()) {
			schedulableTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#updateSchedulableTasks()
	 * 
	 */
	public void updateSchedulableTasks() {
	schedulableTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addFilterSchedulableTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSchedulableTasks(ViewerFilter filter) {
		schedulableTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addBusinessFilterSchedulableTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSchedulableTasks(ViewerFilter filter) {
		schedulableTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#isContainedInSchedulableTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInSchedulableTasksTable(EObject element) {
		return ((ReferencesTableSettings)schedulableTasks.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#initProcessingUnit(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessingUnit(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processingUnit.setContentProvider(contentProvider);
		processingUnit.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.processingUnit);
		if (readOnly && processingUnit.getTable().isEnabled()) {
			processingUnit.setEnabled(false);
			processingUnit.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !processingUnit.getTable().isEnabled()) {
			processingUnit.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#updateProcessingUnit()
	 * 
	 */
	public void updateProcessingUnit() {
	processingUnit.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addFilterProcessingUnit(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessingUnit(ViewerFilter filter) {
		processingUnitFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#addBusinessFilterProcessingUnit(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnit(ViewerFilter filter) {
		processingUnitBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#isContainedInProcessingUnitTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessingUnitTable(EObject element) {
		return ((ReferencesTableSettings)processingUnit.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#getRtpSchedulingPolicy()
	 * 
	 */
	public EObject getRtpSchedulingPolicy() {
		return (EObject) rtpSchedulingPolicy.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#initRtpSchedulingPolicy(EObjectFlatComboSettings)
	 */
	public void initRtpSchedulingPolicy(EObjectFlatComboSettings settings) {
		rtpSchedulingPolicy.setAdapterFactory(adapterFactory);
		rtpSchedulingPolicy.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy);
		if (readOnly && rtpSchedulingPolicy.isEnabled()) {
			rtpSchedulingPolicy.setEnabled(false);
			rtpSchedulingPolicy.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !rtpSchedulingPolicy.isEnabled()) {
			rtpSchedulingPolicy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#setRtpSchedulingPolicy(EObject newValue)
	 * 
	 */
	public void setRtpSchedulingPolicy(EObject newValue) {
		rtpSchedulingPolicy.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpSchedulingPolicy);
		if (readOnly && rtpSchedulingPolicy.isEnabled()) {
			rtpSchedulingPolicy.setEnabled(false);
			rtpSchedulingPolicy.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !rtpSchedulingPolicy.isEnabled()) {
			rtpSchedulingPolicy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#getRtpTaskAllocation()
	 * 
	 */
	public EObject getRtpTaskAllocation() {
		return (EObject) rtpTaskAllocation.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#initRtpTaskAllocation(EObjectFlatComboSettings)
	 */
	public void initRtpTaskAllocation(EObjectFlatComboSettings settings) {
		rtpTaskAllocation.setAdapterFactory(adapterFactory);
		rtpTaskAllocation.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation);
		if (readOnly && rtpTaskAllocation.isEnabled()) {
			rtpTaskAllocation.setEnabled(false);
			rtpTaskAllocation.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !rtpTaskAllocation.isEnabled()) {
			rtpTaskAllocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSpaceProcessPropertiesEditionPart#setRtpTaskAllocation(EObject newValue)
	 * 
	 */
	public void setRtpTaskAllocation(EObject newValue) {
		rtpTaskAllocation.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSpaceProcess.Properties.rtpTaskAllocation);
		if (readOnly && rtpTaskAllocation.isEnabled()) {
			rtpTaskAllocation.setEnabled(false);
			rtpTaskAllocation.setToolTipText(SoftwareOperatorsMessages.SoSpaceProcess_ReadOnly);
		} else if (!readOnly && !rtpTaskAllocation.isEnabled()) {
			rtpTaskAllocation.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareOperatorsMessages.SoSpaceProcess_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
