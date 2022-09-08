/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.FullMigrationTaskAllocationPropertiesEditionPart;
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
public class FullMigrationTaskAllocationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, FullMigrationTaskAllocationPropertiesEditionPart {

	protected Text allocationType;



	/**
	 * For {@link ISection} use only.
	 */
	public FullMigrationTaskAllocationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FullMigrationTaskAllocationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence fullMigrationTaskAllocationStep = new BindingCompositionSequence(propertiesEditionComponent);
		fullMigrationTaskAllocationStep
			.addStep(RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.class)
			.addStep(RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType);
		
		
		composer = new PartComposer(fullMigrationTaskAllocationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType) {
					return createAllocationTypeText(widgetFactory, parent);
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
		propertiesSection.setText(RtpProtocolsAndPoliciesMessages.FullMigrationTaskAllocationPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createAllocationTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType, RtpProtocolsAndPoliciesMessages.FullMigrationTaskAllocationPropertiesEditionPart_AllocationTypeLabel);
		allocationType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		allocationType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData allocationTypeData = new GridData(GridData.FILL_HORIZONTAL);
		allocationType.setLayoutData(allocationTypeData);
		allocationType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							FullMigrationTaskAllocationPropertiesEditionPartForm.this,
							RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, allocationType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									FullMigrationTaskAllocationPropertiesEditionPartForm.this,
									RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, allocationType.getText()));
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
									FullMigrationTaskAllocationPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		allocationType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FullMigrationTaskAllocationPropertiesEditionPartForm.this, RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, allocationType.getText()));
				}
			}
		});
		EditingUtils.setID(allocationType, RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType);
		EditingUtils.setEEFtype(allocationType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.FullMigrationTaskAllocation.Properties.allocationType, RtpProtocolsAndPoliciesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.FullMigrationTaskAllocationPropertiesEditionPart#getAllocationType()
	 * 
	 */
	public String getAllocationType() {
		return allocationType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.FullMigrationTaskAllocationPropertiesEditionPart#setAllocationType(String newValue)
	 * 
	 */
	public void setAllocationType(String newValue) {
		if (newValue != null) {
			allocationType.setText(newValue);
		} else {
			allocationType.setText(""); //$NON-NLS-1$
		}
		allocationType.setEnabled(false);
		allocationType.setToolTipText(RtpProtocolsAndPoliciesMessages.FullMigrationTaskAllocation_ReadOnly);
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpProtocolsAndPoliciesMessages.FullMigrationTaskAllocation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
