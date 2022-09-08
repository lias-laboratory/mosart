/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms;

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
public class SbTimeTriggerPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SbTimeTriggerPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable schedulingActivities;
	protected List<ViewerFilter> schedulingActivitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> schedulingActivitiesFilters = new ArrayList<ViewerFilter>();
	protected SingleCompositionEditor rtpReleaseTime;
	protected SingleCompositionEditor rtpPeriodicity;



	/**
	 * For {@link ISection} use only.
	 */
	public SbTimeTriggerPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbTimeTriggerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities) {
					return createSchedulingActivitiesReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime) {
					return createRtpReleaseTimeSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity) {
					return createRtpPeriodicitySingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_NameLabel);
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
							SbTimeTriggerPropertiesEditionPartForm.this,
							SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SbTimeTriggerPropertiesEditionPartForm.this,
									SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name,
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
									SbTimeTriggerPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.name, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSchedulingActivitiesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.schedulingActivities = new ReferencesTable(getDescription(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_SchedulingActivitiesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSchedulingActivities(); }
			public void handleEdit(EObject element) { editSchedulingActivities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSchedulingActivities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSchedulingActivities(element); }
			public void navigateTo(EObject element) { }
		});
		this.schedulingActivities.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, SoftwareBehaviorViewsRepository.FORM_KIND));
		this.schedulingActivities.createControls(parent, widgetFactory);
		this.schedulingActivities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		schedulingActivities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSchedulingActivities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.schedulingActivities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpReleaseTimeSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_RtpReleaseTimeLabel);
		//create widget
		rtpReleaseTime = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpReleaseTimeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpReleaseTime.setLayoutData(rtpReleaseTimeData);
		rtpReleaseTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpReleaseTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpReleaseTime.refresh();
			}
		});
		rtpReleaseTime.setID(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpReleaseTime, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpPeriodicitySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, SoftwareBehaviorMessages.SbTimeTriggerPropertiesEditionPart_RtpPeriodicityLabel);
		//create widget
		rtpPeriodicity = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpPeriodicityData = new GridData(GridData.FILL_HORIZONTAL);
		rtpPeriodicity.setLayoutData(rtpPeriodicityData);
		rtpPeriodicity.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpPeriodicity.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbTimeTriggerPropertiesEditionPartForm.this,  SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpPeriodicity.refresh();
			}
		});
		rtpPeriodicity.setID(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbTimeTrigger.Properties.rtpPeriodicity, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
