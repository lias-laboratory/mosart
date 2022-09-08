/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts.forms;

// Start of user code for imports
import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart;

import MoSaRT.HardwarePlatform.providers.HardwarePlatformMessages;

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
public class HpCommunicationChannelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, HpCommunicationChannelPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable processingUnits;
	protected List<ViewerFilter> processingUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processingUnitsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable networkPort;
	protected List<ViewerFilter> networkPortBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> networkPortFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable processingUnitSet;
	protected List<ViewerFilter> processingUnitSetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processingUnitSetFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public HpCommunicationChannelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HpCommunicationChannelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hpCommunicationChannelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hpCommunicationChannelStep.addStep(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.class);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet);
		
		
		composer = new PartComposer(hpCommunicationChannelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits) {
					return createProcessingUnitsReferencesTable(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort) {
					return createNetworkPortReferencesTable(widgetFactory, parent);
				}
				if (key == HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet) {
					return createProcessingUnitSetReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(HardwarePlatformMessages.HpCommunicationChannelPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name, HardwarePlatformMessages.HpCommunicationChannelPropertiesEditionPart_NameLabel);
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
							HpCommunicationChannelPropertiesEditionPartForm.this,
							HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									HpCommunicationChannelPropertiesEditionPartForm.this,
									HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name,
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
									HpCommunicationChannelPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name, HardwarePlatformViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessingUnitsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processingUnits = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits, HardwarePlatformMessages.HpCommunicationChannelPropertiesEditionPart_ProcessingUnitsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcessingUnits(); }
			public void handleEdit(EObject element) { editProcessingUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcessingUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcessingUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.processingUnits.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits, HardwarePlatformViewsRepository.FORM_KIND));
		this.processingUnits.createControls(parent, widgetFactory);
		this.processingUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processingUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		processingUnitsData.horizontalSpan = 3;
		this.processingUnits.setLayoutData(processingUnitsData);
		this.processingUnits.disableMove();
		processingUnits.setID(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits);
		processingUnits.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessingUnits() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processingUnits.getInput(), processingUnitsFilters, processingUnitsBusinessFilters,
		"processingUnits", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processingUnits.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessingUnits(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessingUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessingUnits(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processingUnits.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createNetworkPortReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.networkPort = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort, HardwarePlatformMessages.HpCommunicationChannelPropertiesEditionPart_NetworkPortLabel), new ReferencesTableListener	() {
			public void handleAdd() { addNetworkPort(); }
			public void handleEdit(EObject element) { editNetworkPort(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveNetworkPort(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromNetworkPort(element); }
			public void navigateTo(EObject element) { }
		});
		this.networkPort.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort, HardwarePlatformViewsRepository.FORM_KIND));
		this.networkPort.createControls(parent, widgetFactory);
		this.networkPort.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData networkPortData = new GridData(GridData.FILL_HORIZONTAL);
		networkPortData.horizontalSpan = 3;
		this.networkPort.setLayoutData(networkPortData);
		this.networkPort.disableMove();
		networkPort.setID(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort);
		networkPort.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addNetworkPort() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(networkPort.getInput(), networkPortFilters, networkPortBusinessFilters,
		"networkPort", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				networkPort.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveNetworkPort(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		networkPort.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromNetworkPort(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		networkPort.refresh();
	}

	/**
	 * 
	 */
	protected void editNetworkPort(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				networkPort.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createProcessingUnitSetReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processingUnitSet = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet, HardwarePlatformMessages.HpCommunicationChannelPropertiesEditionPart_ProcessingUnitSetLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcessingUnitSet(); }
			public void handleEdit(EObject element) { editProcessingUnitSet(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcessingUnitSet(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcessingUnitSet(element); }
			public void navigateTo(EObject element) { }
		});
		this.processingUnitSet.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet, HardwarePlatformViewsRepository.FORM_KIND));
		this.processingUnitSet.createControls(parent, widgetFactory);
		this.processingUnitSet.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processingUnitSetData = new GridData(GridData.FILL_HORIZONTAL);
		processingUnitSetData.horizontalSpan = 3;
		this.processingUnitSet.setLayoutData(processingUnitSetData);
		this.processingUnitSet.disableMove();
		processingUnitSet.setID(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet);
		processingUnitSet.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcessingUnitSet() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processingUnitSet.getInput(), processingUnitSetFilters, processingUnitSetBusinessFilters,
		"processingUnitSet", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processingUnitSet.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcessingUnitSet(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processingUnitSet.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessingUnitSet(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationChannelPropertiesEditionPartForm.this, HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processingUnitSet.refresh();
	}

	/**
	 * 
	 */
	protected void editProcessingUnitSet(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processingUnitSet.refresh();
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
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(HardwarePlatformMessages.HpCommunicationChannel_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#initProcessingUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessingUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processingUnits.setContentProvider(contentProvider);
		processingUnits.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnits);
		if (readOnly && processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(false);
			processingUnits.setToolTipText(HardwarePlatformMessages.HpCommunicationChannel_ReadOnly);
		} else if (!readOnly && !processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#updateProcessingUnits()
	 * 
	 */
	public void updateProcessingUnits() {
	processingUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#addFilterProcessingUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#addBusinessFilterProcessingUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#isContainedInProcessingUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element) {
		return ((ReferencesTableSettings)processingUnits.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#initNetworkPort(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initNetworkPort(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		networkPort.setContentProvider(contentProvider);
		networkPort.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.networkPort);
		if (readOnly && networkPort.getTable().isEnabled()) {
			networkPort.setEnabled(false);
			networkPort.setToolTipText(HardwarePlatformMessages.HpCommunicationChannel_ReadOnly);
		} else if (!readOnly && !networkPort.getTable().isEnabled()) {
			networkPort.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#updateNetworkPort()
	 * 
	 */
	public void updateNetworkPort() {
	networkPort.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#addFilterNetworkPort(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNetworkPort(ViewerFilter filter) {
		networkPortFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#addBusinessFilterNetworkPort(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNetworkPort(ViewerFilter filter) {
		networkPortBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#isContainedInNetworkPortTable(EObject element)
	 * 
	 */
	public boolean isContainedInNetworkPortTable(EObject element) {
		return ((ReferencesTableSettings)networkPort.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#initProcessingUnitSet(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessingUnitSet(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processingUnitSet.setContentProvider(contentProvider);
		processingUnitSet.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpCommunicationChannel.Properties.processingUnitSet);
		if (readOnly && processingUnitSet.getTable().isEnabled()) {
			processingUnitSet.setEnabled(false);
			processingUnitSet.setToolTipText(HardwarePlatformMessages.HpCommunicationChannel_ReadOnly);
		} else if (!readOnly && !processingUnitSet.getTable().isEnabled()) {
			processingUnitSet.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#updateProcessingUnitSet()
	 * 
	 */
	public void updateProcessingUnitSet() {
	processingUnitSet.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#addFilterProcessingUnitSet(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessingUnitSet(ViewerFilter filter) {
		processingUnitSetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#addBusinessFilterProcessingUnitSet(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnitSet(ViewerFilter filter) {
		processingUnitSetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationChannelPropertiesEditionPart#isContainedInProcessingUnitSetTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessingUnitSetTable(EObject element) {
		return ((ReferencesTableSettings)processingUnitSet.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HardwarePlatformMessages.HpCommunicationChannel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
