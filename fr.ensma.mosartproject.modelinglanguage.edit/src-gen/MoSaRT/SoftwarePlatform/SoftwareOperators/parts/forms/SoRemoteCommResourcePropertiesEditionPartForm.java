/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart;
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
public class SoRemoteCommResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SoRemoteCommResourcePropertiesEditionPart {

	protected ReferencesTable writerTasks;
	protected List<ViewerFilter> writerTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> writerTasksFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable readerTasks;
	protected List<ViewerFilter> readerTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> readerTasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected ReferencesTable transmittedData;
	protected List<ViewerFilter> transmittedDataBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> transmittedDataFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public SoRemoteCommResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoRemoteCommResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence soRemoteCommResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = soRemoteCommResourceStep.addStep(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData);
		
		
		composer = new PartComposer(soRemoteCommResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks) {
					return createWriterTasksReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks) {
					return createReaderTasksReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData) {
					return createTransmittedDataTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(SoftwareOperatorsMessages.SoRemoteCommResourcePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createWriterTasksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.writerTasks = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks, SoftwareOperatorsMessages.SoRemoteCommResourcePropertiesEditionPart_WriterTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addWriterTasks(); }
			public void handleEdit(EObject element) { editWriterTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveWriterTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromWriterTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.writerTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.writerTasks.createControls(parent, widgetFactory);
		this.writerTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData writerTasksData = new GridData(GridData.FILL_HORIZONTAL);
		writerTasksData.horizontalSpan = 3;
		this.writerTasks.setLayoutData(writerTasksData);
		this.writerTasks.disableMove();
		writerTasks.setID(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks);
		writerTasks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addWriterTasks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(writerTasks.getInput(), writerTasksFilters, writerTasksBusinessFilters,
		"writerTasks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				writerTasks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveWriterTasks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		writerTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromWriterTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		writerTasks.refresh();
	}

	/**
	 * 
	 */
	protected void editWriterTasks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				writerTasks.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createReaderTasksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.readerTasks = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks, SoftwareOperatorsMessages.SoRemoteCommResourcePropertiesEditionPart_ReaderTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addReaderTasks(); }
			public void handleEdit(EObject element) { editReaderTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReaderTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReaderTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.readerTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.readerTasks.createControls(parent, widgetFactory);
		this.readerTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData readerTasksData = new GridData(GridData.FILL_HORIZONTAL);
		readerTasksData.horizontalSpan = 3;
		this.readerTasks.setLayoutData(readerTasksData);
		this.readerTasks.disableMove();
		readerTasks.setID(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks);
		readerTasks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addReaderTasks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(readerTasks.getInput(), readerTasksFilters, readerTasksBusinessFilters,
		"readerTasks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				readerTasks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveReaderTasks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		readerTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReaderTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		readerTasks.refresh();
	}

	/**
	 * 
	 */
	protected void editReaderTasks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				readerTasks.refresh();
			}
		}
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name, SoftwareOperatorsMessages.SoRemoteCommResourcePropertiesEditionPart_NameLabel);
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
							SoRemoteCommResourcePropertiesEditionPartForm.this,
							SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SoRemoteCommResourcePropertiesEditionPartForm.this,
									SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name,
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
									SoRemoteCommResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createTransmittedDataTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.transmittedData = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, SoftwareOperatorsMessages.SoRemoteCommResourcePropertiesEditionPart_TransmittedDataLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				transmittedData.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				transmittedData.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				transmittedData.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				transmittedData.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.transmittedDataFilters) {
			this.transmittedData.addFilter(filter);
		}
		this.transmittedData.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.transmittedData.createControls(parent, widgetFactory);
		this.transmittedData.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoRemoteCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData transmittedDataData = new GridData(GridData.FILL_HORIZONTAL);
		transmittedDataData.horizontalSpan = 3;
		this.transmittedData.setLayoutData(transmittedDataData);
		this.transmittedData.setLowerBound(1);
		this.transmittedData.setUpperBound(-1);
		transmittedData.setID(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData);
		transmittedData.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#initWriterTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initWriterTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		writerTasks.setContentProvider(contentProvider);
		writerTasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.writerTasks);
		if (readOnly && writerTasks.getTable().isEnabled()) {
			writerTasks.setEnabled(false);
			writerTasks.setToolTipText(SoftwareOperatorsMessages.SoRemoteCommResource_ReadOnly);
		} else if (!readOnly && !writerTasks.getTable().isEnabled()) {
			writerTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#updateWriterTasks()
	 * 
	 */
	public void updateWriterTasks() {
	writerTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#addFilterWriterTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToWriterTasks(ViewerFilter filter) {
		writerTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#addBusinessFilterWriterTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToWriterTasks(ViewerFilter filter) {
		writerTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#isContainedInWriterTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInWriterTasksTable(EObject element) {
		return ((ReferencesTableSettings)writerTasks.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#initReaderTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReaderTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		readerTasks.setContentProvider(contentProvider);
		readerTasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.readerTasks);
		if (readOnly && readerTasks.getTable().isEnabled()) {
			readerTasks.setEnabled(false);
			readerTasks.setToolTipText(SoftwareOperatorsMessages.SoRemoteCommResource_ReadOnly);
		} else if (!readOnly && !readerTasks.getTable().isEnabled()) {
			readerTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#updateReaderTasks()
	 * 
	 */
	public void updateReaderTasks() {
	readerTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#addFilterReaderTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReaderTasks(ViewerFilter filter) {
		readerTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#addBusinessFilterReaderTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReaderTasks(ViewerFilter filter) {
		readerTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#isContainedInReaderTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInReaderTasksTable(EObject element) {
		return ((ReferencesTableSettings)readerTasks.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SoRemoteCommResource_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#initTransmittedData(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTransmittedData(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		transmittedData.setContentProvider(contentProvider);
		transmittedData.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoRemoteCommResource.Properties.transmittedData);
		if (readOnly && transmittedData.isEnabled()) {
			transmittedData.setEnabled(false);
			transmittedData.setToolTipText(SoftwareOperatorsMessages.SoRemoteCommResource_ReadOnly);
		} else if (!readOnly && !transmittedData.isEnabled()) {
			transmittedData.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#updateTransmittedData()
	 * 
	 */
	public void updateTransmittedData() {
	transmittedData.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#addFilterTransmittedData(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTransmittedData(ViewerFilter filter) {
		transmittedDataFilters.add(filter);
		if (this.transmittedData != null) {
			this.transmittedData.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#addBusinessFilterTransmittedData(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTransmittedData(ViewerFilter filter) {
		transmittedDataBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoRemoteCommResourcePropertiesEditionPart#isContainedInTransmittedDataTable(EObject element)
	 * 
	 */
	public boolean isContainedInTransmittedDataTable(EObject element) {
		return ((ReferencesTableSettings)transmittedData.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareOperatorsMessages.SoRemoteCommResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
