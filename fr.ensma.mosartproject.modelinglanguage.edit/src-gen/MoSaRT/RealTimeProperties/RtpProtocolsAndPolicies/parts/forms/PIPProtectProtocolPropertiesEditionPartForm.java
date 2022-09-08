/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PIPProtectProtocolPropertiesEditionPart;
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
public class PIPProtectProtocolPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, PIPProtectProtocolPropertiesEditionPart {

	protected Text protocolType;



	/**
	 * For {@link ISection} use only.
	 */
	public PIPProtectProtocolPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PIPProtectProtocolPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence pIPProtectProtocolStep = new BindingCompositionSequence(propertiesEditionComponent);
		pIPProtectProtocolStep
			.addStep(RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.class)
			.addStep(RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType);
		
		
		composer = new PartComposer(pIPProtectProtocolStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType) {
					return createProtocolTypeText(widgetFactory, parent);
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
		propertiesSection.setText(RtpProtocolsAndPoliciesMessages.PIPProtectProtocolPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createProtocolTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType, RtpProtocolsAndPoliciesMessages.PIPProtectProtocolPropertiesEditionPart_ProtocolTypeLabel);
		protocolType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		protocolType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData protocolTypeData = new GridData(GridData.FILL_HORIZONTAL);
		protocolType.setLayoutData(protocolTypeData);
		protocolType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PIPProtectProtocolPropertiesEditionPartForm.this,
							RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PIPProtectProtocolPropertiesEditionPartForm.this,
									RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, protocolType.getText()));
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
									PIPProtectProtocolPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		protocolType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PIPProtectProtocolPropertiesEditionPartForm.this, RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, protocolType.getText()));
				}
			}
		});
		EditingUtils.setID(protocolType, RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType);
		EditingUtils.setEEFtype(protocolType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.PIPProtectProtocol.Properties.protocolType, RtpProtocolsAndPoliciesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PIPProtectProtocolPropertiesEditionPart#getProtocolType()
	 * 
	 */
	public String getProtocolType() {
		return protocolType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PIPProtectProtocolPropertiesEditionPart#setProtocolType(String newValue)
	 * 
	 */
	public void setProtocolType(String newValue) {
		if (newValue != null) {
			protocolType.setText(newValue);
		} else {
			protocolType.setText(""); //$NON-NLS-1$
		}
		protocolType.setEnabled(false);
		protocolType.setToolTipText(RtpProtocolsAndPoliciesMessages.PIPProtectProtocol_ReadOnly);
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpProtocolsAndPoliciesMessages.PIPProtectProtocol_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
