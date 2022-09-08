/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.LeastLaxityFirstSchedulingPolicyPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.RtpProtocolsAndPoliciesViewsRepository;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.providers.RtpProtocolsAndPoliciesMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

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
public class LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, LeastLaxityFirstSchedulingPolicyPropertiesEditionPart {

	protected Text policyType;



	/**
	 * For {@link ISection} use only.
	 */
	public LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence leastLaxityFirstSchedulingPolicyStep = new BindingCompositionSequence(propertiesEditionComponent);
		leastLaxityFirstSchedulingPolicyStep
			.addStep(RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.class)
			.addStep(RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType);
		
		
		composer = new PartComposer(leastLaxityFirstSchedulingPolicyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType) {
					return createPolicyTypeText(widgetFactory, parent);
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
		propertiesSection.setText(RtpProtocolsAndPoliciesMessages.LeastLaxityFirstSchedulingPolicyPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createPolicyTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType, RtpProtocolsAndPoliciesMessages.LeastLaxityFirstSchedulingPolicyPropertiesEditionPart_PolicyTypeLabel);
		policyType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		policyType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData policyTypeData = new GridData(GridData.FILL_HORIZONTAL);
		policyType.setLayoutData(policyTypeData);
		policyType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm.this,
							RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, policyType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm.this,
									RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, policyType.getText()));
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
									LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		policyType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LeastLaxityFirstSchedulingPolicyPropertiesEditionPartForm.this, RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, policyType.getText()));
				}
			}
		});
		EditingUtils.setID(policyType, RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType);
		EditingUtils.setEEFtype(policyType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.LeastLaxityFirstSchedulingPolicy.Properties.policyType, RtpProtocolsAndPoliciesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.LeastLaxityFirstSchedulingPolicyPropertiesEditionPart#getPolicyType()
	 * 
	 */
	public String getPolicyType() {
		return policyType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.LeastLaxityFirstSchedulingPolicyPropertiesEditionPart#setPolicyType(String newValue)
	 * 
	 */
	public void setPolicyType(String newValue) {
		if (newValue != null) {
			policyType.setText(newValue);
		} else {
			policyType.setText(""); //$NON-NLS-1$
		}
		policyType.setEnabled(false);
		policyType.setToolTipText(RtpProtocolsAndPoliciesMessages.LeastLaxityFirstSchedulingPolicy_ReadOnly);
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpProtocolsAndPoliciesMessages.LeastLaxityFirstSchedulingPolicy_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
