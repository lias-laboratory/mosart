/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart;
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
public class RtpPreemptibleTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpPreemptibleTypePropertiesEditionPart {

	protected SingleCompositionEditor cost;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpPreemptibleTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpPreemptibleTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpPreemptibleTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpPreemptibleTypeStep
			.addStep(RtpTypesViewsRepository.RtpPreemptibleType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		
		
		composer = new PartComposer(rtpPreemptibleTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpPreemptibleType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost) {
					return createCostSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpTypesMessages.RtpPreemptibleTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createCostSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, RtpTypesMessages.RtpPreemptibleTypePropertiesEditionPart_CostLabel);
		//create widget
		cost = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData costData = new GridData(GridData.FILL_HORIZONTAL);
		cost.setLayoutData(costData);
		cost.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPreemptibleTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				cost.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPreemptibleTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				cost.refresh();
			}
		});
		cost.setID(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart#getCost()
	 * 
	 */
	public EObject getCost() {
		return (EObject) cost.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart#initCost(EObjectFlatComboSettings)
	 */
	public void initCost(EObjectFlatComboSettings settings) {
		cost.setAdapterFactory(adapterFactory);
		cost.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		if (readOnly && cost.isEnabled()) {
			cost.setEnabled(false);
			cost.setToolTipText(RtpTypesMessages.RtpPreemptibleType_ReadOnly);
		} else if (!readOnly && !cost.isEnabled()) {
			cost.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart#setCost(EObject newValue)
	 * 
	 */
	public void setCost(EObject newValue) {
		cost.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		if (readOnly && cost.isEnabled()) {
			cost.setEnabled(false);
			cost.setToolTipText(RtpTypesMessages.RtpPreemptibleType_ReadOnly);
		} else if (!readOnly && !cost.isEnabled()) {
			cost.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpPreemptibleType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
