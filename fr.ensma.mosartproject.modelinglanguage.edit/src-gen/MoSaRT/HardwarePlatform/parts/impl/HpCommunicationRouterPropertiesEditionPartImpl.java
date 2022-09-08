/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts.impl;

// Start of user code for imports
import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart;

import MoSaRT.HardwarePlatform.providers.HardwarePlatformMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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
public class HpCommunicationRouterPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, HpCommunicationRouterPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable networkPorts;
	protected List<ViewerFilter> networkPortsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> networkPortsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HpCommunicationRouterPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hpCommunicationRouterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hpCommunicationRouterStep.addStep(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.class);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts);
		
		
		composer = new PartComposer(hpCommunicationRouterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name) {
					return createNameText(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts) {
					return createNetworkPortsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(HardwarePlatformMessages.HpCommunicationRouterPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name, HardwarePlatformMessages.HpCommunicationRouterPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createNetworkPortsAdvancedTableComposition(Composite parent) {
		this.networkPorts = new ReferencesTable(getDescription(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, HardwarePlatformMessages.HpCommunicationRouterPropertiesEditionPart_NetworkPortsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				networkPorts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				networkPorts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				networkPorts.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				networkPorts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.networkPortsFilters) {
			this.networkPorts.addFilter(filter);
		}
		this.networkPorts.setHelpText(propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, HardwarePlatformViewsRepository.SWT_KIND));
		this.networkPorts.createControls(parent);
		this.networkPorts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpCommunicationRouterPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData networkPortsData = new GridData(GridData.FILL_HORIZONTAL);
		networkPortsData.horizontalSpan = 3;
		this.networkPorts.setLayoutData(networkPortsData);
		this.networkPorts.setLowerBound(1);
		this.networkPorts.setUpperBound(-1);
		networkPorts.setID(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts);
		networkPorts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(HardwarePlatformMessages.HpCommunicationRouter_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#initNetworkPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initNetworkPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		networkPorts.setContentProvider(contentProvider);
		networkPorts.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpCommunicationRouter.Properties.networkPorts);
		if (readOnly && networkPorts.isEnabled()) {
			networkPorts.setEnabled(false);
			networkPorts.setToolTipText(HardwarePlatformMessages.HpCommunicationRouter_ReadOnly);
		} else if (!readOnly && !networkPorts.isEnabled()) {
			networkPorts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#updateNetworkPorts()
	 * 
	 */
	public void updateNetworkPorts() {
	networkPorts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#addFilterNetworkPorts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNetworkPorts(ViewerFilter filter) {
		networkPortsFilters.add(filter);
		if (this.networkPorts != null) {
			this.networkPorts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#addBusinessFilterNetworkPorts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNetworkPorts(ViewerFilter filter) {
		networkPortsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpCommunicationRouterPropertiesEditionPart#isContainedInNetworkPortsTable(EObject element)
	 * 
	 */
	public boolean isContainedInNetworkPortsTable(EObject element) {
		return ((ReferencesTableSettings)networkPorts.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HardwarePlatformMessages.HpCommunicationRouter_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
