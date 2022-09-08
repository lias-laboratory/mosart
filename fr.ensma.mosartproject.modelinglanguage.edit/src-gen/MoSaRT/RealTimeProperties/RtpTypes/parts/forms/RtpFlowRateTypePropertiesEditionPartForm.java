/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class RtpFlowRateTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpFlowRateTypePropertiesEditionPart {

	protected SingleCompositionEditor flowRate;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpFlowRateTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpFlowRateTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpFlowRateTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpFlowRateTypeStep
			.addStep(RtpTypesViewsRepository.RtpFlowRateType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		
		
		composer = new PartComposer(rtpFlowRateTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpFlowRateType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate) {
					return createFlowRateSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpTypesMessages.RtpFlowRateTypePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFlowRateSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, RtpTypesMessages.RtpFlowRateTypePropertiesEditionPart_FlowRateLabel);
		//create widget
		flowRate = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData flowRateData = new GridData(GridData.FILL_HORIZONTAL);
		flowRate.setLayoutData(flowRateData);
		flowRate.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFlowRateTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				flowRate.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFlowRateTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				flowRate.refresh();
			}
		});
		flowRate.setID(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart#getFlowRate()
	 * 
	 */
	public EObject getFlowRate() {
		return (EObject) flowRate.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart#initFlowRate(EObjectFlatComboSettings)
	 */
	public void initFlowRate(EObjectFlatComboSettings settings) {
		flowRate.setAdapterFactory(adapterFactory);
		flowRate.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		if (readOnly && flowRate.isEnabled()) {
			flowRate.setEnabled(false);
			flowRate.setToolTipText(RtpTypesMessages.RtpFlowRateType_ReadOnly);
		} else if (!readOnly && !flowRate.isEnabled()) {
			flowRate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart#setFlowRate(EObject newValue)
	 * 
	 */
	public void setFlowRate(EObject newValue) {
		flowRate.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		if (readOnly && flowRate.isEnabled()) {
			flowRate.setEnabled(false);
			flowRate.setToolTipText(RtpTypesMessages.RtpFlowRateType_ReadOnly);
		} else if (!readOnly && !flowRate.isEnabled()) {
			flowRate.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpFlowRateType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
