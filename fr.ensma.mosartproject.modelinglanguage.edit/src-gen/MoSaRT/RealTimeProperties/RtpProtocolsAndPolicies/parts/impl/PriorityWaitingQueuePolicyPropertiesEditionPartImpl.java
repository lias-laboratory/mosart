/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PriorityWaitingQueuePolicyPropertiesEditionPart;
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
public class PriorityWaitingQueuePolicyPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PriorityWaitingQueuePolicyPropertiesEditionPart {

	protected Text policyType;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PriorityWaitingQueuePolicyPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence priorityWaitingQueuePolicyStep = new BindingCompositionSequence(propertiesEditionComponent);
		priorityWaitingQueuePolicyStep
			.addStep(RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.class)
			.addStep(RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType);
		
		
		composer = new PartComposer(priorityWaitingQueuePolicyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType) {
					return createPolicyTypeText(parent);
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
		propertiesGroup.setText(RtpProtocolsAndPoliciesMessages.PriorityWaitingQueuePolicyPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createPolicyTypeText(Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType, RtpProtocolsAndPoliciesMessages.PriorityWaitingQueuePolicyPropertiesEditionPart_PolicyTypeLabel);
		policyType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData policyTypeData = new GridData(GridData.FILL_HORIZONTAL);
		policyType.setLayoutData(policyTypeData);
		policyType.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PriorityWaitingQueuePolicyPropertiesEditionPartImpl.this, RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, policyType.getText()));
			}

		});
		policyType.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PriorityWaitingQueuePolicyPropertiesEditionPartImpl.this, RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, policyType.getText()));
				}
			}

		});
		EditingUtils.setID(policyType, RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType);
		EditingUtils.setEEFtype(policyType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.PriorityWaitingQueuePolicy.Properties.policyType, RtpProtocolsAndPoliciesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PriorityWaitingQueuePolicyPropertiesEditionPart#getPolicyType()
	 * 
	 */
	public String getPolicyType() {
		return policyType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PriorityWaitingQueuePolicyPropertiesEditionPart#setPolicyType(String newValue)
	 * 
	 */
	public void setPolicyType(String newValue) {
		if (newValue != null) {
			policyType.setText(newValue);
		} else {
			policyType.setText(""); //$NON-NLS-1$
		}
		policyType.setEnabled(false);
		policyType.setToolTipText(RtpProtocolsAndPoliciesMessages.PriorityWaitingQueuePolicy_ReadOnly);
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpProtocolsAndPoliciesMessages.PriorityWaitingQueuePolicy_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
