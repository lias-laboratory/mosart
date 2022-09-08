/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts.impl;

// Start of user code for imports
import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart;

import MoSaRT.HardwarePlatform.providers.HardwarePlatformMessages;

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
public class HpProcessorInterconnectorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, HpProcessorInterconnectorPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable processingUnits;
	protected List<ViewerFilter> processingUnitsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processingUnitsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer commChannel;
	private SingleCompositionEditor rtpMultiprocessorCategory;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HpProcessorInterconnectorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hpProcessorInterconnectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hpProcessorInterconnectorStep.addStep(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.class);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory);
		
		
		composer = new PartComposer(hpProcessorInterconnectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name) {
					return createNameText(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits) {
					return createProcessingUnitsAdvancedReferencesTable(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel) {
					return createCommChannelFlatComboViewer(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory) {
					return createRtpMultiprocessorCategorySingleCompositionEditor(parent);
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
		propertiesGroup.setText(HardwarePlatformMessages.HpProcessorInterconnectorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name, HardwarePlatformMessages.HpProcessorInterconnectorPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessingUnitsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits, HardwarePlatformMessages.HpProcessorInterconnectorPropertiesEditionPart_ProcessingUnitsLabel);		 
		this.processingUnits = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcessingUnits(); }
			public void handleEdit(EObject element) { editProcessingUnits(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcessingUnits(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcessingUnits(element); }
			public void navigateTo(EObject element) { }
		});
		this.processingUnits.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits, HardwarePlatformViewsRepository.SWT_KIND));
		this.processingUnits.createControls(parent);
		this.processingUnits.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processingUnitsData = new GridData(GridData.FILL_HORIZONTAL);
		processingUnitsData.horizontalSpan = 3;
		this.processingUnits.setLayoutData(processingUnitsData);
		this.processingUnits.disableMove();
		processingUnits.setID(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processingUnits.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcessingUnits(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCommChannelFlatComboViewer(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel, HardwarePlatformMessages.HpProcessorInterconnectorPropertiesEditionPart_CommChannelLabel);
		commChannel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel, HardwarePlatformViewsRepository.SWT_KIND));
		commChannel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		commChannel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCommChannel()));
			}

		});
		GridData commChannelData = new GridData(GridData.FILL_HORIZONTAL);
		commChannel.setLayoutData(commChannelData);
		commChannel.setID(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpMultiprocessorCategorySingleCompositionEditor(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory, HardwarePlatformMessages.HpProcessorInterconnectorPropertiesEditionPart_RtpMultiprocessorCategoryLabel);
		//create widget
		rtpMultiprocessorCategory = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpMultiprocessorCategoryData = new GridData(GridData.FILL_HORIZONTAL);
		rtpMultiprocessorCategory.setLayoutData(rtpMultiprocessorCategoryData);
		rtpMultiprocessorCategory.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpMultiprocessorCategory.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpProcessorInterconnectorPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpMultiprocessorCategory.refresh();
			}
		});
		rtpMultiprocessorCategory.setID(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(HardwarePlatformMessages.HpProcessorInterconnector_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#initProcessingUnits(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcessingUnits(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processingUnits.setContentProvider(contentProvider);
		processingUnits.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.processingUnits);
		if (readOnly && processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(false);
			processingUnits.setToolTipText(HardwarePlatformMessages.HpProcessorInterconnector_ReadOnly);
		} else if (!readOnly && !processingUnits.getTable().isEnabled()) {
			processingUnits.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#updateProcessingUnits()
	 * 
	 */
	public void updateProcessingUnits() {
	processingUnits.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#addFilterProcessingUnits(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#addBusinessFilterProcessingUnits(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter) {
		processingUnitsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#isContainedInProcessingUnitsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element) {
		return ((ReferencesTableSettings)processingUnits.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#getCommChannel()
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
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#initCommChannel(EObjectFlatComboSettings)
	 */
	public void initCommChannel(EObjectFlatComboSettings settings) {
		commChannel.setInput(settings);
		if (current != null) {
			commChannel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel);
		if (readOnly && commChannel.isEnabled()) {
			commChannel.setEnabled(false);
			commChannel.setToolTipText(HardwarePlatformMessages.HpProcessorInterconnector_ReadOnly);
		} else if (!readOnly && !commChannel.isEnabled()) {
			commChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#setCommChannel(EObject newValue)
	 * 
	 */
	public void setCommChannel(EObject newValue) {
		if (newValue != null) {
			commChannel.setSelection(new StructuredSelection(newValue));
		} else {
			commChannel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.commChannel);
		if (readOnly && commChannel.isEnabled()) {
			commChannel.setEnabled(false);
			commChannel.setToolTipText(HardwarePlatformMessages.HpProcessorInterconnector_ReadOnly);
		} else if (!readOnly && !commChannel.isEnabled()) {
			commChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#setCommChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCommChannelButtonMode(ButtonsModeEnum newValue) {
		commChannel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#addFilterCommChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommChannel(ViewerFilter filter) {
		commChannel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#addBusinessFilterCommChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommChannel(ViewerFilter filter) {
		commChannel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#getRtpMultiprocessorCategory()
	 * 
	 */
	public EObject getRtpMultiprocessorCategory() {
		return (EObject) rtpMultiprocessorCategory.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#initRtpMultiprocessorCategory(EObjectFlatComboSettings)
	 */
	public void initRtpMultiprocessorCategory(EObjectFlatComboSettings settings) {
		rtpMultiprocessorCategory.setAdapterFactory(adapterFactory);
		rtpMultiprocessorCategory.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory);
		if (readOnly && rtpMultiprocessorCategory.isEnabled()) {
			rtpMultiprocessorCategory.setEnabled(false);
			rtpMultiprocessorCategory.setToolTipText(HardwarePlatformMessages.HpProcessorInterconnector_ReadOnly);
		} else if (!readOnly && !rtpMultiprocessorCategory.isEnabled()) {
			rtpMultiprocessorCategory.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpProcessorInterconnectorPropertiesEditionPart#setRtpMultiprocessorCategory(EObject newValue)
	 * 
	 */
	public void setRtpMultiprocessorCategory(EObject newValue) {
		rtpMultiprocessorCategory.refresh();
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpProcessorInterconnector.Properties.rtpMultiprocessorCategory);
		if (readOnly && rtpMultiprocessorCategory.isEnabled()) {
			rtpMultiprocessorCategory.setEnabled(false);
			rtpMultiprocessorCategory.setToolTipText(HardwarePlatformMessages.HpProcessorInterconnector_ReadOnly);
		} else if (!readOnly && !rtpMultiprocessorCategory.isEnabled()) {
			rtpMultiprocessorCategory.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HardwarePlatformMessages.HpProcessorInterconnector_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
