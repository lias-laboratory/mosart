/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart;
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
public class SoLocalCommResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SoLocalCommResourcePropertiesEditionPart {

	protected ReferencesTable writerTasks;
	protected List<ViewerFilter> writerTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> writerTasksFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable readerTasks;
	protected List<ViewerFilter> readerTasksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> readerTasksFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected SingleCompositionEditor rtpCommunicationMechanism;
	protected SingleCompositionEditor rtpProtectProtocol;
	protected SingleCompositionEditor rtpWaitingQueuePolicy;



	/**
	 * For {@link ISection} use only.
	 */
	public SoLocalCommResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SoLocalCommResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence soLocalCommResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = soLocalCommResourceStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy);
		
		
		composer = new PartComposer(soLocalCommResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks) {
					return createWriterTasksReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks) {
					return createReaderTasksReferencesTable(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism) {
					return createRtpCommunicationMechanismSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol) {
					return createRtpProtectProtocolSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy) {
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
		propertiesSection.setText(SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		this.writerTasks = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks, SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_WriterTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addWriterTasks(); }
			public void handleEdit(EObject element) { editWriterTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveWriterTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromWriterTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.writerTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.writerTasks.createControls(parent, widgetFactory);
		this.writerTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData writerTasksData = new GridData(GridData.FILL_HORIZONTAL);
		writerTasksData.horizontalSpan = 3;
		this.writerTasks.setLayoutData(writerTasksData);
		this.writerTasks.disableMove();
		writerTasks.setID(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		writerTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromWriterTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		this.readerTasks = new ReferencesTable(getDescription(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks, SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_ReaderTasksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addReaderTasks(); }
			public void handleEdit(EObject element) { editReaderTasks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveReaderTasks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromReaderTasks(element); }
			public void navigateTo(EObject element) { }
		});
		this.readerTasks.setHelpText(propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks, SoftwareOperatorsViewsRepository.FORM_KIND));
		this.readerTasks.createControls(parent, widgetFactory);
		this.readerTasks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData readerTasksData = new GridData(GridData.FILL_HORIZONTAL);
		readerTasksData.horizontalSpan = 3;
		this.readerTasks.setLayoutData(readerTasksData);
		this.readerTasks.disableMove();
		readerTasks.setID(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		readerTasks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromReaderTasks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name, SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_NameLabel);
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
							SoLocalCommResourcePropertiesEditionPartForm.this,
							SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SoLocalCommResourcePropertiesEditionPartForm.this,
									SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name,
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
									SoLocalCommResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpCommunicationMechanismSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism, SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_RtpCommunicationMechanismLabel);
		//create widget
		rtpCommunicationMechanism = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpCommunicationMechanismData = new GridData(GridData.FILL_HORIZONTAL);
		rtpCommunicationMechanism.setLayoutData(rtpCommunicationMechanismData);
		rtpCommunicationMechanism.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpCommunicationMechanism.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpCommunicationMechanism.refresh();
			}
		});
		rtpCommunicationMechanism.setID(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpProtectProtocolSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol, SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_RtpProtectProtocolLabel);
		//create widget
		rtpProtectProtocol = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpProtectProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		rtpProtectProtocol.setLayoutData(rtpProtectProtocolData);
		rtpProtectProtocol.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpProtectProtocol.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpProtectProtocol.refresh();
			}
		});
		rtpProtectProtocol.setID(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpWaitingQueuePolicySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy, SoftwareOperatorsMessages.SoLocalCommResourcePropertiesEditionPart_RtpWaitingQueuePolicyLabel);
		//create widget
		rtpWaitingQueuePolicy = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpWaitingQueuePolicyData = new GridData(GridData.FILL_HORIZONTAL);
		rtpWaitingQueuePolicy.setLayoutData(rtpWaitingQueuePolicyData);
		rtpWaitingQueuePolicy.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpWaitingQueuePolicy.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SoLocalCommResourcePropertiesEditionPartForm.this,  SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpWaitingQueuePolicy.refresh();
			}
		});
		rtpWaitingQueuePolicy.setID(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#initWriterTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initWriterTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		writerTasks.setContentProvider(contentProvider);
		writerTasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.writerTasks);
		if (readOnly && writerTasks.getTable().isEnabled()) {
			writerTasks.setEnabled(false);
			writerTasks.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !writerTasks.getTable().isEnabled()) {
			writerTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#updateWriterTasks()
	 * 
	 */
	public void updateWriterTasks() {
	writerTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#addFilterWriterTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToWriterTasks(ViewerFilter filter) {
		writerTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#addBusinessFilterWriterTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToWriterTasks(ViewerFilter filter) {
		writerTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#isContainedInWriterTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInWriterTasksTable(EObject element) {
		return ((ReferencesTableSettings)writerTasks.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#initReaderTasks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initReaderTasks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		readerTasks.setContentProvider(contentProvider);
		readerTasks.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.readerTasks);
		if (readOnly && readerTasks.getTable().isEnabled()) {
			readerTasks.setEnabled(false);
			readerTasks.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !readerTasks.getTable().isEnabled()) {
			readerTasks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#updateReaderTasks()
	 * 
	 */
	public void updateReaderTasks() {
	readerTasks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#addFilterReaderTasks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReaderTasks(ViewerFilter filter) {
		readerTasksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#addBusinessFilterReaderTasks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReaderTasks(ViewerFilter filter) {
		readerTasksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#isContainedInReaderTasksTable(EObject element)
	 * 
	 */
	public boolean isContainedInReaderTasksTable(EObject element) {
		return ((ReferencesTableSettings)readerTasks.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#getRtpCommunicationMechanism()
	 * 
	 */
	public EObject getRtpCommunicationMechanism() {
		return (EObject) rtpCommunicationMechanism.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#initRtpCommunicationMechanism(EObjectFlatComboSettings)
	 */
	public void initRtpCommunicationMechanism(EObjectFlatComboSettings settings) {
		rtpCommunicationMechanism.setAdapterFactory(adapterFactory);
		rtpCommunicationMechanism.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism);
		if (readOnly && rtpCommunicationMechanism.isEnabled()) {
			rtpCommunicationMechanism.setEnabled(false);
			rtpCommunicationMechanism.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !rtpCommunicationMechanism.isEnabled()) {
			rtpCommunicationMechanism.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#setRtpCommunicationMechanism(EObject newValue)
	 * 
	 */
	public void setRtpCommunicationMechanism(EObject newValue) {
		rtpCommunicationMechanism.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpCommunicationMechanism);
		if (readOnly && rtpCommunicationMechanism.isEnabled()) {
			rtpCommunicationMechanism.setEnabled(false);
			rtpCommunicationMechanism.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !rtpCommunicationMechanism.isEnabled()) {
			rtpCommunicationMechanism.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#getRtpProtectProtocol()
	 * 
	 */
	public EObject getRtpProtectProtocol() {
		return (EObject) rtpProtectProtocol.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#initRtpProtectProtocol(EObjectFlatComboSettings)
	 */
	public void initRtpProtectProtocol(EObjectFlatComboSettings settings) {
		rtpProtectProtocol.setAdapterFactory(adapterFactory);
		rtpProtectProtocol.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol);
		if (readOnly && rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(false);
			rtpProtectProtocol.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#setRtpProtectProtocol(EObject newValue)
	 * 
	 */
	public void setRtpProtectProtocol(EObject newValue) {
		rtpProtectProtocol.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpProtectProtocol);
		if (readOnly && rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(false);
			rtpProtectProtocol.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !rtpProtectProtocol.isEnabled()) {
			rtpProtectProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#getRtpWaitingQueuePolicy()
	 * 
	 */
	public EObject getRtpWaitingQueuePolicy() {
		return (EObject) rtpWaitingQueuePolicy.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#initRtpWaitingQueuePolicy(EObjectFlatComboSettings)
	 */
	public void initRtpWaitingQueuePolicy(EObjectFlatComboSettings settings) {
		rtpWaitingQueuePolicy.setAdapterFactory(adapterFactory);
		rtpWaitingQueuePolicy.setInput(settings);
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy);
		if (readOnly && rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(false);
			rtpWaitingQueuePolicy.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
		} else if (!readOnly && !rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoLocalCommResourcePropertiesEditionPart#setRtpWaitingQueuePolicy(EObject newValue)
	 * 
	 */
	public void setRtpWaitingQueuePolicy(EObject newValue) {
		rtpWaitingQueuePolicy.refresh();
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SoLocalCommResource.Properties.rtpWaitingQueuePolicy);
		if (readOnly && rtpWaitingQueuePolicy.isEnabled()) {
			rtpWaitingQueuePolicy.setEnabled(false);
			rtpWaitingQueuePolicy.setToolTipText(SoftwareOperatorsMessages.SoLocalCommResource_ReadOnly);
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
		return SoftwareOperatorsMessages.SoLocalCommResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
