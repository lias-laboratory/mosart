/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.RtpProtocolsAndPoliciesViewsRepository;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.providers.RtpProtocolsAndPoliciesMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

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
public class PipeCommunicationMechanismPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PipeCommunicationMechanismPropertiesEditionPart {

	protected Text mechanismType;
	private SingleCompositionEditor rtpDataSize;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PipeCommunicationMechanismPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence pipeCommunicationMechanismStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = pipeCommunicationMechanismStep.addStep(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.class);
		propertiesStep.addStep(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType);
		propertiesStep.addStep(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize);
		
		
		composer = new PartComposer(pipeCommunicationMechanismStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType) {
					return createMechanismTypeText(parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize) {
					return createRtpDataSizeSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanismPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createMechanismTypeText(Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanismPropertiesEditionPart_MechanismTypeLabel);
		mechanismType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData mechanismTypeData = new GridData(GridData.FILL_HORIZONTAL);
		mechanismType.setLayoutData(mechanismTypeData);
		mechanismType.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartImpl.this, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mechanismType.getText()));
			}

		});
		mechanismType.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartImpl.this, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mechanismType.getText()));
				}
			}

		});
		EditingUtils.setID(mechanismType, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType);
		EditingUtils.setEEFtype(mechanismType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, RtpProtocolsAndPoliciesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createRtpDataSizeSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanismPropertiesEditionPart_RtpDataSizeLabel);
		//create widget
		rtpDataSize = new SingleCompositionEditor(parent, SWT.NONE);
		GridData rtpDataSizeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDataSize.setLayoutData(rtpDataSizeData);
		rtpDataSize.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartImpl.this,  RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDataSize.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartImpl.this,  RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDataSize.refresh();
			}
		});
		rtpDataSize.setID(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, RtpProtocolsAndPoliciesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart#getMechanismType()
	 * 
	 */
	public String getMechanismType() {
		return mechanismType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart#setMechanismType(String newValue)
	 * 
	 */
	public void setMechanismType(String newValue) {
		if (newValue != null) {
			mechanismType.setText(newValue);
		} else {
			mechanismType.setText(""); //$NON-NLS-1$
		}
		mechanismType.setEnabled(false);
		mechanismType.setToolTipText(RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanism_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart#getRtpDataSize()
	 * 
	 */
	public EObject getRtpDataSize() {
		return (EObject) rtpDataSize.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart#initRtpDataSize(EObjectFlatComboSettings)
	 */
	public void initRtpDataSize(EObjectFlatComboSettings settings) {
		rtpDataSize.setAdapterFactory(adapterFactory);
		rtpDataSize.setInput(settings);
		boolean readOnly = isReadOnly(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize);
		if (readOnly && rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(false);
			rtpDataSize.setToolTipText(RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanism_ReadOnly);
		} else if (!readOnly && !rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart#setRtpDataSize(EObject newValue)
	 * 
	 */
	public void setRtpDataSize(EObject newValue) {
		rtpDataSize.refresh();
		boolean readOnly = isReadOnly(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize);
		if (readOnly && rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(false);
			rtpDataSize.setToolTipText(RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanism_ReadOnly);
		} else if (!readOnly && !rtpDataSize.isEnabled()) {
			rtpDataSize.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanism_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
