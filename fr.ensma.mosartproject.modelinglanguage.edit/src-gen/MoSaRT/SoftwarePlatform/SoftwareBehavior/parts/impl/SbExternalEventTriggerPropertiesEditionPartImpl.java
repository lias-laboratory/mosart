/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.providers.SoftwareBehaviorMessages;

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
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

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
public class SbExternalEventTriggerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbExternalEventTriggerPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable schedulingActivities;
	protected List<ViewerFilter> schedulingActivitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulingActivitiesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbExternalEventTriggerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbExternalEventTriggerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbExternalEventTriggerStep.addStep(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities);
		
		
		composer = new PartComposer(sbExternalEventTriggerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities) {
					return createSchedulingActivitiesAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbExternalEventTriggerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name, SoftwareBehaviorMessages.SbExternalEventTriggerPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbExternalEventTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbExternalEventTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSchedulingActivitiesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities, SoftwareBehaviorMessages.SbExternalEventTriggerPropertiesEditionPart_SchedulingActivitiesLabel);		 
		this.schedulingActivities = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSchedulingActivities(); }
			public void handleEdit(EObject element) { editSchedulingActivities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSchedulingActivities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSchedulingActivities(element); }
			public void navigateTo(EObject element) { }
		});
		this.schedulingActivities.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.schedulingActivities.createControls(parent);
		this.schedulingActivities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbExternalEventTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulingActivitiesData = new GridData(GridData.FILL_HORIZONTAL);
		schedulingActivitiesData.horizontalSpan = 3;
		this.schedulingActivities.setLayoutData(schedulingActivitiesData);
		this.schedulingActivities.disableMove();
		schedulingActivities.setID(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities);
		schedulingActivities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSchedulingActivities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(schedulingActivities.getInput(), schedulingActivitiesFilters, schedulingActivitiesBusinessFilters,
		"schedulingActivities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbExternalEventTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				schedulingActivities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSchedulingActivities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbExternalEventTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulingActivities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulingActivities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbExternalEventTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		schedulingActivities.refresh();
	}

	/**
	 * 
	 */
	protected void editSchedulingActivities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				schedulingActivities.refresh();
			}
		}
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbExternalEventTrigger_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#initSchedulingActivities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSchedulingActivities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulingActivities.setContentProvider(contentProvider);
		schedulingActivities.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbExternalEventTrigger.Properties.schedulingActivities);
		if (readOnly && schedulingActivities.getTable().isEnabled()) {
			schedulingActivities.setEnabled(false);
			schedulingActivities.setToolTipText(SoftwareBehaviorMessages.SbExternalEventTrigger_ReadOnly);
		} else if (!readOnly && !schedulingActivities.getTable().isEnabled()) {
			schedulingActivities.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#updateSchedulingActivities()
	 * 
	 */
	public void updateSchedulingActivities() {
	schedulingActivities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#addFilterSchedulingActivities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSchedulingActivities(ViewerFilter filter) {
		schedulingActivitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#addBusinessFilterSchedulingActivities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSchedulingActivities(ViewerFilter filter) {
		schedulingActivitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbExternalEventTriggerPropertiesEditionPart#isContainedInSchedulingActivitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSchedulingActivitiesTable(EObject element) {
		return ((ReferencesTableSettings)schedulingActivities.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.SbExternalEventTrigger_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
