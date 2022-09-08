/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart;
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
public class SbTimeTriggerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbTimeTriggerPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable schedulingActivities;
	protected List<ViewerFilter> schedulingActivitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulingActivitiesFilters = new ArrayList<ViewerFilter>();
	private SingleCompositionEditor rtpReleaseTime;
	private SingleCompositionEditor rtpPeriodicity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbTimeTriggerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbTimeTriggerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbTimeTriggerStep.addStep(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity);
		
		
		composer = new PartComposer(sbTimeTriggerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities) {
					return createSchedulingActivitiesAdvancedReferencesTable(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime) {
					return createRtpReleaseTimeSingleCompositionEditor(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity) {
					return createRtpPeriodicitySingleCompositionEditor(parent);
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSchedulingActivitiesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_SchedulingActivitiesLabel);		 
		this.schedulingActivities = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSchedulingActivities(); }
			public void handleEdit(EObject element) { editSchedulingActivities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSchedulingActivities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSchedulingActivities(element); }
			public void navigateTo(EObject element) { }
		});
		this.schedulingActivities.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, SoftwareBehaviorViewsRepository.SWT_KIND));
		this.schedulingActivities.createControls(parent);
		this.schedulingActivities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData schedulingActivitiesData = new GridData(GridData.FILL_HORIZONTAL);
		schedulingActivitiesData.horizontalSpan = 3;
		this.schedulingActivities.setLayoutData(schedulingActivitiesData);
		this.schedulingActivities.disableMove();
		schedulingActivities.setID(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulingActivities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulingActivities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpReleaseTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_RtpReleaseTimeLabel);
		//create widget
		rtpReleaseTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpReleaseTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpReleaseTime.setLayoutData(rtpReleaseTimeData);
		rtpReleaseTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpReleaseTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpReleaseTime.refresh();
			}
		});
		rtpReleaseTime.setID(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpPeriodicitySingleCompositionEditor(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_RtpPeriodicityLabel);
		//create widget
		rtpPeriodicity = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpPeriodicityData = new GridData(GridData.FILL_HORIZONTAL);
		rtpPeriodicity.setLayoutData(rtpPeriodicityData);
		rtpPeriodicity.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpPeriodicity.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartImpl.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpPeriodicity.refresh();
			}
		});
		rtpPeriodicity.setID(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbTimeTrigger_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#initSchedulingActivities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSchedulingActivities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		schedulingActivities.setContentProvider(contentProvider);
		schedulingActivities.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities);
		if (readOnly && schedulingActivities.getTable().isEnabled()) {
			schedulingActivities.setEnabled(false);
			schedulingActivities.setToolTipText(SoftwareBehaviorMessages.SbTimeTrigger_ReadOnly);
		} else if (!readOnly && !schedulingActivities.getTable().isEnabled()) {
			schedulingActivities.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#updateSchedulingActivities()
	 * 
	 */
	public void updateSchedulingActivities() {
	schedulingActivities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#addFilterSchedulingActivities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSchedulingActivities(ViewerFilter filter) {
		schedulingActivitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#addBusinessFilterSchedulingActivities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSchedulingActivities(ViewerFilter filter) {
		schedulingActivitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#isContainedInSchedulingActivitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSchedulingActivitiesTable(EObject element) {
		return ((ReferencesTableSettings)schedulingActivities.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#getRtpReleaseTime()
	 * 
	 */
	public EObject getRtpReleaseTime() {
		return (EObject) rtpReleaseTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#initRtpReleaseTime(EObjectFlatComboSettings)
	 */
	public void initRtpReleaseTime(EObjectFlatComboSettings settings) {
		rtpReleaseTime.setAdapterFactory(adapterFactory);
		rtpReleaseTime.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime);
		if (readOnly && rtpReleaseTime.isEnabled()) {
			rtpReleaseTime.setEnabled(false);
			rtpReleaseTime.setToolTipText(SoftwareBehaviorMessages.SbTimeTrigger_ReadOnly);
		} else if (!readOnly && !rtpReleaseTime.isEnabled()) {
			rtpReleaseTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#setRtpReleaseTime(EObject newValue)
	 * 
	 */
	public void setRtpReleaseTime(EObject newValue) {
		rtpReleaseTime.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime);
		if (readOnly && rtpReleaseTime.isEnabled()) {
			rtpReleaseTime.setEnabled(false);
			rtpReleaseTime.setToolTipText(SoftwareBehaviorMessages.SbTimeTrigger_ReadOnly);
		} else if (!readOnly && !rtpReleaseTime.isEnabled()) {
			rtpReleaseTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#getRtpPeriodicity()
	 * 
	 */
	public EObject getRtpPeriodicity() {
		return (EObject) rtpPeriodicity.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#initRtpPeriodicity(EObjectFlatComboSettings)
	 */
	public void initRtpPeriodicity(EObjectFlatComboSettings settings) {
		rtpPeriodicity.setAdapterFactory(adapterFactory);
		rtpPeriodicity.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity);
		if (readOnly && rtpPeriodicity.isEnabled()) {
			rtpPeriodicity.setEnabled(false);
			rtpPeriodicity.setToolTipText(SoftwareBehaviorMessages.SbTimeTrigger_ReadOnly);
		} else if (!readOnly && !rtpPeriodicity.isEnabled()) {
			rtpPeriodicity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbTimeTriggerPropertiesEditionPart#setRtpPeriodicity(EObject newValue)
	 * 
	 */
	public void setRtpPeriodicity(EObject newValue) {
		rtpPeriodicity.refresh();
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity);
		if (readOnly && rtpPeriodicity.isEnabled()) {
			rtpPeriodicity.setEnabled(false);
			rtpPeriodicity.setToolTipText(SoftwareBehaviorMessages.SbTimeTrigger_ReadOnly);
		} else if (!readOnly && !rtpPeriodicity.isEnabled()) {
			rtpPeriodicity.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.SbTimeTrigger_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
