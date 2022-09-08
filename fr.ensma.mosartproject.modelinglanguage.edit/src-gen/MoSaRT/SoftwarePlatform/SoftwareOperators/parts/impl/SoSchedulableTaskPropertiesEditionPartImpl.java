/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart;
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
public class SoSchedulableTaskPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SoSchedulableTaskPropertiesEditionPart {

	protected EObjectFlatComboViewer process;
	protected ReferencesTable mutualExclusionResources;
	protected List<ViewerFilter> mutualExclusionResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mutualExclusionResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable commWritingResources;
	protected List<ViewerFilter> commWritingResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> commWritingResourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable commReadingResources;
	protected List<ViewerFilter> commReadingResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> commReadingResourcesFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected ReferencesTable favoriteProcessors;
	protected List<ViewerFilter> favoriteProcessorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> favoriteProcessorsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable runOnProcessors;
	protected List<ViewerFilter> runOnProcessorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> runOnProcessorsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer representedActivity;
	protected ReferencesTable rtpMutualExclusionResourceUtilization;
	protected List<ViewerFilter> rtpMutualExclusionResourceUtilizationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> rtpMutualExclusionResourceUtilizationFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoSchedulableTaskPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence soSchedulableTaskStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = soSchedulableTaskStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization);
		
		
		composer = new PartComposer(soSchedulableTaskStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process) {
					return createProcessFlatComboViewer(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources) {
					return createMutualExclusionResourcesAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources) {
					return createCommWritingResourcesAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources) {
					return createCommReadingResourcesAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors) {
					return createFavoriteProcessorsAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors) {
					return createRunOnProcessorsAdvancedReferencesTable(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity) {
					return createRepresentedActivityFlatComboViewer(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization) {
					return createRtpMutualExclusionResourceUtilizationAdvancedTableComposition(parent);
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
		propertiesGroup.setText(SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createProcessFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_ProcessLabel);
		process = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process, SoftwareOperatorsViewsRepository.SWT_KIND));
		process.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		process.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getProcess()));
			}

		});
		GridData processData = new GridData(GridData.FILL_HORIZONTAL);
		process.setLayoutData(processData);
		process.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createMutualExclusionResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_MutualExclusionResourcesLabel);		 
		this.mutualExclusionResources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addMutualExclusionResources(); }
			public void handleEdit(EObject element) { editMutualExclusionResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMutualExclusionResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMutualExclusionResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.mutualExclusionResources.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.mutualExclusionResources.createControls(parent);
		this.mutualExclusionResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData mutualExclusionResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		mutualExclusionResourcesData.horizontalSpan = 3;
		this.mutualExclusionResources.setLayoutData(mutualExclusionResourcesData);
		this.mutualExclusionResources.disableMove();
		mutualExclusionResources.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources);
		mutualExclusionResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMutualExclusionResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(mutualExclusionResources.getInput(), mutualExclusionResourcesFilters, mutualExclusionResourcesBusinessFilters,
		"mutualExclusionResources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				mutualExclusionResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveMutualExclusionResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		mutualExclusionResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMutualExclusionResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		mutualExclusionResources.refresh();
	}

	/**
	 * 
	 */
	protected void editMutualExclusionResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				mutualExclusionResources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCommWritingResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_CommWritingResourcesLabel);		 
		this.commWritingResources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCommWritingResources(); }
			public void handleEdit(EObject element) { editCommWritingResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommWritingResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommWritingResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.commWritingResources.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.commWritingResources.createControls(parent);
		this.commWritingResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData commWritingResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		commWritingResourcesData.horizontalSpan = 3;
		this.commWritingResources.setLayoutData(commWritingResourcesData);
		this.commWritingResources.disableMove();
		commWritingResources.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources);
		commWritingResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCommWritingResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(commWritingResources.getInput(), commWritingResourcesFilters, commWritingResourcesBusinessFilters,
		"commWritingResources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				commWritingResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCommWritingResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		commWritingResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCommWritingResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		commWritingResources.refresh();
	}

	/**
	 * 
	 */
	protected void editCommWritingResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				commWritingResources.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createCommReadingResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_CommReadingResourcesLabel);		 
		this.commReadingResources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCommReadingResources(); }
			public void handleEdit(EObject element) { editCommReadingResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCommReadingResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCommReadingResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.commReadingResources.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.commReadingResources.createControls(parent);
		this.commReadingResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData commReadingResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		commReadingResourcesData.horizontalSpan = 3;
		this.commReadingResources.setLayoutData(commReadingResourcesData);
		this.commReadingResources.disableMove();
		commReadingResources.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources);
		commReadingResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCommReadingResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(commReadingResources.getInput(), commReadingResourcesFilters, commReadingResourcesBusinessFilters,
		"commReadingResources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				commReadingResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCommReadingResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		commReadingResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCommReadingResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		commReadingResources.refresh();
	}

	/**
	 * 
	 */
	protected void editCommReadingResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				commReadingResources.refresh();
			}
		}
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFavoriteProcessorsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_FavoriteProcessorsLabel);		 
		this.favoriteProcessors = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFavoriteProcessors(); }
			public void handleEdit(EObject element) { editFavoriteProcessors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFavoriteProcessors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFavoriteProcessors(element); }
			public void navigateTo(EObject element) { }
		});
		this.favoriteProcessors.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.favoriteProcessors.createControls(parent);
		this.favoriteProcessors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData favoriteProcessorsData = new GridData(GridData.FILL_HORIZONTAL);
		favoriteProcessorsData.horizontalSpan = 3;
		this.favoriteProcessors.setLayoutData(favoriteProcessorsData);
		this.favoriteProcessors.disableMove();
		favoriteProcessors.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors);
		favoriteProcessors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFavoriteProcessors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(favoriteProcessors.getInput(), favoriteProcessorsFilters, favoriteProcessorsBusinessFilters,
		"favoriteProcessors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				favoriteProcessors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFavoriteProcessors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		favoriteProcessors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFavoriteProcessors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		favoriteProcessors.refresh();
	}

	/**
	 * 
	 */
	protected void editFavoriteProcessors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				favoriteProcessors.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createRunOnProcessorsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_RunOnProcessorsLabel);		 
		this.runOnProcessors = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addRunOnProcessors(); }
			public void handleEdit(EObject element) { editRunOnProcessors(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveRunOnProcessors(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromRunOnProcessors(element); }
			public void navigateTo(EObject element) { }
		});
		this.runOnProcessors.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.runOnProcessors.createControls(parent);
		this.runOnProcessors.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData runOnProcessorsData = new GridData(GridData.FILL_HORIZONTAL);
		runOnProcessorsData.horizontalSpan = 3;
		this.runOnProcessors.setLayoutData(runOnProcessorsData);
		this.runOnProcessors.disableMove();
		runOnProcessors.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors);
		runOnProcessors.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addRunOnProcessors() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(runOnProcessors.getInput(), runOnProcessorsFilters, runOnProcessorsBusinessFilters,
		"runOnProcessors", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				runOnProcessors.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveRunOnProcessors(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		runOnProcessors.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromRunOnProcessors(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		runOnProcessors.refresh();
	}

	/**
	 * 
	 */
	protected void editRunOnProcessors(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				runOnProcessors.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRepresentedActivityFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_RepresentedActivityLabel);
		representedActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity, SoftwareOperatorsViewsRepository.SWT_KIND));
		representedActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		representedActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getRepresentedActivity()));
			}

		});
		GridData representedActivityData = new GridData(GridData.FILL_HORIZONTAL);
		representedActivity.setLayoutData(representedActivityData);
		representedActivity.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createRtpMutualExclusionResourceUtilizationAdvancedTableComposition(Composite parent) {
		this.rtpMutualExclusionResourceUtilization = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, SoftwareOperatorsMessages.SoSchedulableTaskPropertiesEditionPart_RtpMutualExclusionResourceUtilizationLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				rtpMutualExclusionResourceUtilization.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				rtpMutualExclusionResourceUtilization.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				rtpMutualExclusionResourceUtilization.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				rtpMutualExclusionResourceUtilization.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.rtpMutualExclusionResourceUtilizationFilters) {
			this.rtpMutualExclusionResourceUtilization.addFilter(filter);
		}
		this.rtpMutualExclusionResourceUtilization.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, SoftwareOperatorsViewsRepository.SWT_KIND));
		this.rtpMutualExclusionResourceUtilization.createControls(parent);
		this.rtpMutualExclusionResourceUtilization.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoSchedulableTaskPropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData rtpMutualExclusionResourceUtilizationData = new GridData(GridData.FILL_HORIZONTAL);
		rtpMutualExclusionResourceUtilizationData.horizontalSpan = 3;
		this.rtpMutualExclusionResourceUtilization.setLayoutData(rtpMutualExclusionResourceUtilizationData);
		this.rtpMutualExclusionResourceUtilization.setLowerBound(0);
		this.rtpMutualExclusionResourceUtilization.setUpperBound(-1);
		rtpMutualExclusionResourceUtilization.setID(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization);
		rtpMutualExclusionResourceUtilization.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#getProcess()
	 * 
	 */
	public EObject getProcess() {
		if (process.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) process.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initProcess(EObjectFlatComboSettings)
	 */
	public void initProcess(EObjectFlatComboSettings settings) {
		process.setInput(settings);
		if (current != null) {
			process.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process);
		if (readOnly && process.isEnabled()) {
			process.setEnabled(false);
			process.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !process.isEnabled()) {
			process.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#setProcess(EObject newValue)
	 * 
	 */
	public void setProcess(EObject newValue) {
		if (newValue != null) {
			process.setSelection(new StructuredSelection(newValue));
		} else {
			process.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.process);
		if (readOnly && process.isEnabled()) {
			process.setEnabled(false);
			process.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !process.isEnabled()) {
			process.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#setProcessButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProcessButtonMode(ButtonsModeEnum newValue) {
		process.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcess(ViewerFilter filter) {
		process.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcess(ViewerFilter filter) {
		process.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initMutualExclusionResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMutualExclusionResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mutualExclusionResources.setContentProvider(contentProvider);
		mutualExclusionResources.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.mutualExclusionResources);
		if (readOnly && mutualExclusionResources.getTable().isEnabled()) {
			mutualExclusionResources.setEnabled(false);
			mutualExclusionResources.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !mutualExclusionResources.getTable().isEnabled()) {
			mutualExclusionResources.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#updateMutualExclusionResources()
	 * 
	 */
	public void updateMutualExclusionResources() {
	mutualExclusionResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterMutualExclusionResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMutualExclusionResources(ViewerFilter filter) {
		mutualExclusionResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterMutualExclusionResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMutualExclusionResources(ViewerFilter filter) {
		mutualExclusionResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#isContainedInMutualExclusionResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInMutualExclusionResourcesTable(EObject element) {
		return ((ReferencesTableSettings)mutualExclusionResources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initCommWritingResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCommWritingResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		commWritingResources.setContentProvider(contentProvider);
		commWritingResources.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commWritingResources);
		if (readOnly && commWritingResources.getTable().isEnabled()) {
			commWritingResources.setEnabled(false);
			commWritingResources.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !commWritingResources.getTable().isEnabled()) {
			commWritingResources.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#updateCommWritingResources()
	 * 
	 */
	public void updateCommWritingResources() {
	commWritingResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterCommWritingResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommWritingResources(ViewerFilter filter) {
		commWritingResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterCommWritingResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommWritingResources(ViewerFilter filter) {
		commWritingResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#isContainedInCommWritingResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommWritingResourcesTable(EObject element) {
		return ((ReferencesTableSettings)commWritingResources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initCommReadingResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCommReadingResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		commReadingResources.setContentProvider(contentProvider);
		commReadingResources.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.commReadingResources);
		if (readOnly && commReadingResources.getTable().isEnabled()) {
			commReadingResources.setEnabled(false);
			commReadingResources.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !commReadingResources.getTable().isEnabled()) {
			commReadingResources.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#updateCommReadingResources()
	 * 
	 */
	public void updateCommReadingResources() {
	commReadingResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterCommReadingResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommReadingResources(ViewerFilter filter) {
		commReadingResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterCommReadingResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommReadingResources(ViewerFilter filter) {
		commReadingResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#isContainedInCommReadingResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommReadingResourcesTable(EObject element) {
		return ((ReferencesTableSettings)commReadingResources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initFavoriteProcessors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFavoriteProcessors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		favoriteProcessors.setContentProvider(contentProvider);
		favoriteProcessors.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.favoriteProcessors);
		if (readOnly && favoriteProcessors.getTable().isEnabled()) {
			favoriteProcessors.setEnabled(false);
			favoriteProcessors.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !favoriteProcessors.getTable().isEnabled()) {
			favoriteProcessors.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#updateFavoriteProcessors()
	 * 
	 */
	public void updateFavoriteProcessors() {
	favoriteProcessors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterFavoriteProcessors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFavoriteProcessors(ViewerFilter filter) {
		favoriteProcessorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterFavoriteProcessors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFavoriteProcessors(ViewerFilter filter) {
		favoriteProcessorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#isContainedInFavoriteProcessorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInFavoriteProcessorsTable(EObject element) {
		return ((ReferencesTableSettings)favoriteProcessors.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initRunOnProcessors(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initRunOnProcessors(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		runOnProcessors.setContentProvider(contentProvider);
		runOnProcessors.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.runOnProcessors);
		if (readOnly && runOnProcessors.getTable().isEnabled()) {
			runOnProcessors.setEnabled(false);
			runOnProcessors.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !runOnProcessors.getTable().isEnabled()) {
			runOnProcessors.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#updateRunOnProcessors()
	 * 
	 */
	public void updateRunOnProcessors() {
	runOnProcessors.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterRunOnProcessors(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRunOnProcessors(ViewerFilter filter) {
		runOnProcessorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterRunOnProcessors(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRunOnProcessors(ViewerFilter filter) {
		runOnProcessorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#isContainedInRunOnProcessorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInRunOnProcessorsTable(EObject element) {
		return ((ReferencesTableSettings)runOnProcessors.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#getRepresentedActivity()
	 * 
	 */
	public EObject getRepresentedActivity() {
		if (representedActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) representedActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initRepresentedActivity(EObjectFlatComboSettings)
	 */
	public void initRepresentedActivity(EObjectFlatComboSettings settings) {
		representedActivity.setInput(settings);
		if (current != null) {
			representedActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity);
		if (readOnly && representedActivity.isEnabled()) {
			representedActivity.setEnabled(false);
			representedActivity.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !representedActivity.isEnabled()) {
			representedActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#setRepresentedActivity(EObject newValue)
	 * 
	 */
	public void setRepresentedActivity(EObject newValue) {
		if (newValue != null) {
			representedActivity.setSelection(new StructuredSelection(newValue));
		} else {
			representedActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.representedActivity);
		if (readOnly && representedActivity.isEnabled()) {
			representedActivity.setEnabled(false);
			representedActivity.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !representedActivity.isEnabled()) {
			representedActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#setRepresentedActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRepresentedActivityButtonMode(ButtonsModeEnum newValue) {
		representedActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterRepresentedActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRepresentedActivity(ViewerFilter filter) {
		representedActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterRepresentedActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRepresentedActivity(ViewerFilter filter) {
		representedActivity.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#initRtpMutualExclusionResourceUtilization(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initRtpMutualExclusionResourceUtilization(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		rtpMutualExclusionResourceUtilization.setContentProvider(contentProvider);
		rtpMutualExclusionResourceUtilization.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoSchedulableTask.Properties.rtpMutualExclusionResourceUtilization);
		if (readOnly && rtpMutualExclusionResourceUtilization.isEnabled()) {
			rtpMutualExclusionResourceUtilization.setEnabled(false);
			rtpMutualExclusionResourceUtilization.setToolTipText(SoftwareOperatorsMessages.SoSchedulableTask_ReadOnly);
		} else if (!readOnly && !rtpMutualExclusionResourceUtilization.isEnabled()) {
			rtpMutualExclusionResourceUtilization.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#updateRtpMutualExclusionResourceUtilization()
	 * 
	 */
	public void updateRtpMutualExclusionResourceUtilization() {
	rtpMutualExclusionResourceUtilization.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addFilterRtpMutualExclusionResourceUtilization(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRtpMutualExclusionResourceUtilization(ViewerFilter filter) {
		rtpMutualExclusionResourceUtilizationFilters.add(filter);
		if (this.rtpMutualExclusionResourceUtilization != null) {
			this.rtpMutualExclusionResourceUtilization.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#addBusinessFilterRtpMutualExclusionResourceUtilization(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRtpMutualExclusionResourceUtilization(ViewerFilter filter) {
		rtpMutualExclusionResourceUtilizationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoSchedulableTaskPropertiesEditionPart#isContainedInRtpMutualExclusionResourceUtilizationTable(EObject element)
	 * 
	 */
	public boolean isContainedInRtpMutualExclusionResourceUtilizationTable(EObject element) {
		return ((ReferencesTableSettings)rtpMutualExclusionResourceUtilization.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareOperatorsMessages.SoSchedulableTask_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
