/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.ATMNetworkProtocolPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.RtpProtocolsAndPoliciesViewsRepository;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.providers.RtpProtocolsAndPoliciesMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
public class ATMNetworkProtocolPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ATMNetworkProtocolPropertiesEditionPart {

	protected Text protocolType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ATMNetworkProtocolPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence aTMNetworkProtocolStep = new BindingCompositionSequence(propertiesEditionComponent);
		aTMNetworkProtocolStep
			.addStep(RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.class)
			.addStep(RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType);
		
		
		composer = new PartComposer(aTMNetworkProtocolStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType) {
					return createProtocolTypeText(parent);
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
		propertiesGroup.setText(RtpProtocolsAndPoliciesMessages.ATMNetworkProtocolPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createProtocolTypeText(Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType, RtpProtocolsAndPoliciesMessages.ATMNetworkProtocolPropertiesEditionPart_ProtocolTypeLabel);
		protocolType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData protocolTypeData = new GridData(GridData.FILL_HORIZONTAL);
		protocolType.setLayoutData(protocolTypeData);
		protocolType.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ATMNetworkProtocolPropertiesEditionPartImpl.this, RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolType.getText()));
			}

		});
		protocolType.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ATMNetworkProtocolPropertiesEditionPartImpl.this, RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolType.getText()));
				}
			}

		});
		EditingUtils.setID(protocolType, RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType);
		EditingUtils.setEEFtype(protocolType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.ATMNetworkProtocol.Properties.protocolType, RtpProtocolsAndPoliciesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.ATMNetworkProtocolPropertiesEditionPart#getProtocolType()
	 * 
	 */
	public String getProtocolType() {
		return protocolType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.ATMNetworkProtocolPropertiesEditionPart#setProtocolType(String newValue)
	 * 
	 */
	public void setProtocolType(String newValue) {
		if (newValue != null) {
			protocolType.setText(newValue);
		} else {
			protocolType.setText(""); //$NON-NLS-1$
		}
		protocolType.setEnabled(false);
		protocolType.setToolTipText(RtpProtocolsAndPoliciesMessages.ATMNetworkProtocol_ReadOnly);
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpProtocolsAndPoliciesMessages.ATMNetworkProtocol_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
