/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts.impl;

// Start of user code for imports
import MoSaRT.HardwarePlatform.parts.HardwarePlatformViewsRepository;
import MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart;

import MoSaRT.HardwarePlatform.providers.HardwarePlatformMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

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
public class HpNetworkPortPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, HpNetworkPortPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer commChannel;
	private SingleCompositionEditor rtpFlowRate;
	private SingleCompositionEditor rtpNetworkProtocol;
	private SingleCompositionEditor rtpTransmissionMode;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public HpNetworkPortPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence hpNetworkPortStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = hpNetworkPortStep.addStep(HardwarePlatformViewsRepository.HpNetworkPort.Properties.class);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpNetworkPort.Properties.name);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol);
		propertiesStep.addStep(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode);
		
		
		composer = new PartComposer(hpNetworkPortStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.name) {
					return createNameText(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel) {
					return createCommChannelFlatComboViewer(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate) {
					return createRtpFlowRateSingleCompositionEditor(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol) {
					return createRtpNetworkProtocolSingleCompositionEditor(parent);
				}
				if (key == HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode) {
					return createRtpTransmissionModeSingleCompositionEditor(parent);
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
		propertiesGroup.setText(HardwarePlatformMessages.HpNetworkPortPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpNetworkPort.Properties.name, HardwarePlatformMessages.HpNetworkPortPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpNetworkPort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpNetworkPort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, HardwarePlatformViewsRepository.HpNetworkPort.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpNetworkPort.Properties.name, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCommChannelFlatComboViewer(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel, HardwarePlatformMessages.HpNetworkPortPropertiesEditionPart_CommChannelLabel);
		commChannel = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel, HardwarePlatformViewsRepository.SWT_KIND));
		commChannel.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		commChannel.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this, HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCommChannel()));
			}

		});
		GridData commChannelData = new GridData(GridData.FILL_HORIZONTAL);
		commChannel.setLayoutData(commChannelData);
		commChannel.setID(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpFlowRateSingleCompositionEditor(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate, HardwarePlatformMessages.HpNetworkPortPropertiesEditionPart_RtpFlowRateLabel);
		//create widget
		rtpFlowRate = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpFlowRateData = new GridData(GridData.FILL_HORIZONTAL);
		rtpFlowRate.setLayoutData(rtpFlowRateData);
		rtpFlowRate.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpFlowRate.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpFlowRate.refresh();
			}
		});
		rtpFlowRate.setID(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpNetworkProtocolSingleCompositionEditor(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol, HardwarePlatformMessages.HpNetworkPortPropertiesEditionPart_RtpNetworkProtocolLabel);
		//create widget
		rtpNetworkProtocol = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpNetworkProtocolData = new GridData(GridData.FILL_HORIZONTAL);
		rtpNetworkProtocol.setLayoutData(rtpNetworkProtocolData);
		rtpNetworkProtocol.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpNetworkProtocol.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpNetworkProtocol.refresh();
			}
		});
		rtpNetworkProtocol.setID(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpTransmissionModeSingleCompositionEditor(Composite parent) {
		createDescription(parent, HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode, HardwarePlatformMessages.HpNetworkPortPropertiesEditionPart_RtpTransmissionModeLabel);
		//create widget
		rtpTransmissionMode = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpTransmissionModeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpTransmissionMode.setLayoutData(rtpTransmissionModeData);
		rtpTransmissionMode.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpTransmissionMode.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(HpNetworkPortPropertiesEditionPartImpl.this,  HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpTransmissionMode.refresh();
			}
		});
		rtpTransmissionMode.setID(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode, HardwarePlatformViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#getCommChannel()
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
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#initCommChannel(EObjectFlatComboSettings)
	 */
	public void initCommChannel(EObjectFlatComboSettings settings) {
		commChannel.setInput(settings);
		if (current != null) {
			commChannel.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel);
		if (readOnly && commChannel.isEnabled()) {
			commChannel.setEnabled(false);
			commChannel.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !commChannel.isEnabled()) {
			commChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#setCommChannel(EObject newValue)
	 * 
	 */
	public void setCommChannel(EObject newValue) {
		if (newValue != null) {
			commChannel.setSelection(new StructuredSelection(newValue));
		} else {
			commChannel.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.commChannel);
		if (readOnly && commChannel.isEnabled()) {
			commChannel.setEnabled(false);
			commChannel.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !commChannel.isEnabled()) {
			commChannel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#setCommChannelButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCommChannelButtonMode(ButtonsModeEnum newValue) {
		commChannel.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#addFilterCommChannel(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommChannel(ViewerFilter filter) {
		commChannel.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#addBusinessFilterCommChannel(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommChannel(ViewerFilter filter) {
		commChannel.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#getRtpFlowRate()
	 * 
	 */
	public EObject getRtpFlowRate() {
		return (EObject) rtpFlowRate.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#initRtpFlowRate(EObjectFlatComboSettings)
	 */
	public void initRtpFlowRate(EObjectFlatComboSettings settings) {
		rtpFlowRate.setAdapterFactory(adapterFactory);
		rtpFlowRate.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate);
		if (readOnly && rtpFlowRate.isEnabled()) {
			rtpFlowRate.setEnabled(false);
			rtpFlowRate.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !rtpFlowRate.isEnabled()) {
			rtpFlowRate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#setRtpFlowRate(EObject newValue)
	 * 
	 */
	public void setRtpFlowRate(EObject newValue) {
		rtpFlowRate.refresh();
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpFlowRate);
		if (readOnly && rtpFlowRate.isEnabled()) {
			rtpFlowRate.setEnabled(false);
			rtpFlowRate.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !rtpFlowRate.isEnabled()) {
			rtpFlowRate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#getRtpNetworkProtocol()
	 * 
	 */
	public EObject getRtpNetworkProtocol() {
		return (EObject) rtpNetworkProtocol.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#initRtpNetworkProtocol(EObjectFlatComboSettings)
	 */
	public void initRtpNetworkProtocol(EObjectFlatComboSettings settings) {
		rtpNetworkProtocol.setAdapterFactory(adapterFactory);
		rtpNetworkProtocol.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol);
		if (readOnly && rtpNetworkProtocol.isEnabled()) {
			rtpNetworkProtocol.setEnabled(false);
			rtpNetworkProtocol.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !rtpNetworkProtocol.isEnabled()) {
			rtpNetworkProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#setRtpNetworkProtocol(EObject newValue)
	 * 
	 */
	public void setRtpNetworkProtocol(EObject newValue) {
		rtpNetworkProtocol.refresh();
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpNetworkProtocol);
		if (readOnly && rtpNetworkProtocol.isEnabled()) {
			rtpNetworkProtocol.setEnabled(false);
			rtpNetworkProtocol.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !rtpNetworkProtocol.isEnabled()) {
			rtpNetworkProtocol.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#getRtpTransmissionMode()
	 * 
	 */
	public EObject getRtpTransmissionMode() {
		return (EObject) rtpTransmissionMode.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#initRtpTransmissionMode(EObjectFlatComboSettings)
	 */
	public void initRtpTransmissionMode(EObjectFlatComboSettings settings) {
		rtpTransmissionMode.setAdapterFactory(adapterFactory);
		rtpTransmissionMode.setInput(settings);
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode);
		if (readOnly && rtpTransmissionMode.isEnabled()) {
			rtpTransmissionMode.setEnabled(false);
			rtpTransmissionMode.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !rtpTransmissionMode.isEnabled()) {
			rtpTransmissionMode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.HardwarePlatform.parts.HpNetworkPortPropertiesEditionPart#setRtpTransmissionMode(EObject newValue)
	 * 
	 */
	public void setRtpTransmissionMode(EObject newValue) {
		rtpTransmissionMode.refresh();
		boolean readOnly = isReadOnly(HardwarePlatformViewsRepository.HpNetworkPort.Properties.rtpTransmissionMode);
		if (readOnly && rtpTransmissionMode.isEnabled()) {
			rtpTransmissionMode.setEnabled(false);
			rtpTransmissionMode.setToolTipText(HardwarePlatformMessages.HpNetworkPort_ReadOnly);
		} else if (!readOnly && !rtpTransmissionMode.isEnabled()) {
			rtpTransmissionMode.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HardwarePlatformMessages.HpNetworkPort_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
