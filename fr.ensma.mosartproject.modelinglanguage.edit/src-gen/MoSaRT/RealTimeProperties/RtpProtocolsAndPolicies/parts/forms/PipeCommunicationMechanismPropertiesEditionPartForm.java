/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.PipeCommunicationMechanismPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts.RtpProtocolsAndPoliciesViewsRepository;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.providers.RtpProtocolsAndPoliciesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
public class PipeCommunicationMechanismPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, PipeCommunicationMechanismPropertiesEditionPart {

	protected Text mechanismType;
	protected SingleCompositionEditor rtpDataSize;



	/**
	 * For {@link ISection} use only.
	 */
	public PipeCommunicationMechanismPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PipeCommunicationMechanismPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence pipeCommunicationMechanismStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = pipeCommunicationMechanismStep.addStep(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.class);
		propertiesStep.addStep(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType);
		propertiesStep.addStep(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize);
		
		
		composer = new PartComposer(pipeCommunicationMechanismStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType) {
					return createMechanismTypeText(widgetFactory, parent);
				}
				if (key == RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize) {
					return createRtpDataSizeSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanismPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createMechanismTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanismPropertiesEditionPart_MechanismTypeLabel);
		mechanismType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		mechanismType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData mechanismTypeData = new GridData(GridData.FILL_HORIZONTAL);
		mechanismType.setLayoutData(mechanismTypeData);
		mechanismType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							PipeCommunicationMechanismPropertiesEditionPartForm.this,
							RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mechanismType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									PipeCommunicationMechanismPropertiesEditionPartForm.this,
									RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, mechanismType.getText()));
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
									PipeCommunicationMechanismPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		mechanismType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartForm.this, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mechanismType.getText()));
				}
			}
		});
		EditingUtils.setID(mechanismType, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType);
		EditingUtils.setEEFtype(mechanismType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.mechanismType, RtpProtocolsAndPoliciesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRtpDataSizeSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, RtpProtocolsAndPoliciesMessages.PipeCommunicationMechanismPropertiesEditionPart_RtpDataSizeLabel);
		//create widget
		rtpDataSize = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData rtpDataSizeData = new GridData(GridData.FILL_HORIZONTAL);
		rtpDataSize.setLayoutData(rtpDataSizeData);
		rtpDataSize.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartForm.this,  RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				rtpDataSize.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PipeCommunicationMechanismPropertiesEditionPartForm.this,  RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				rtpDataSize.refresh();
			}
		});
		rtpDataSize.setID(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpProtocolsAndPoliciesViewsRepository.PipeCommunicationMechanism.Properties.rtpDataSize, RtpProtocolsAndPoliciesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
