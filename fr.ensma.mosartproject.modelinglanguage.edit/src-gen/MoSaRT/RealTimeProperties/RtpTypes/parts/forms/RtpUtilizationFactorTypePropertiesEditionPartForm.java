/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart;

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
public class RtpUtilizationFactorTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpUtilizationFactorTypePropertiesEditionPart {

	protected SingleCompositionEditor u;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpUtilizationFactorTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpUtilizationFactorTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpUtilizationFactorTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpUtilizationFactorTypeStep
			.addStep(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		
		
		composer = new PartComposer(rtpUtilizationFactorTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u) {
					return createUSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpTypesMessages.RtpUtilizationFactorTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createUSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, RtpTypesMessages.RtpUtilizationFactorTypePropertiesEditionPart_ULabel);
		//create widget
		u = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData uData = new GridData(GridData.FILL_HORIZONTAL);
		u.setLayoutData(uData);
		u.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpUtilizationFactorTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				u.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpUtilizationFactorTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				u.refresh();
			}
		});
		u.setID(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart#getU()
	 * 
	 */
	public EObject getU() {
		return (EObject) u.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart#initU(EObjectFlatComboSettings)
	 */
	public void initU(EObjectFlatComboSettings settings) {
		u.setAdapterFactory(adapterFactory);
		u.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		if (readOnly && u.isEnabled()) {
			u.setEnabled(false);
			u.setToolTipText(RtpTypesMessages.RtpUtilizationFactorType_ReadOnly);
		} else if (!readOnly && !u.isEnabled()) {
			u.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart#setU(EObject newValue)
	 * 
	 */
	public void setU(EObject newValue) {
		u.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		if (readOnly && u.isEnabled()) {
			u.setEnabled(false);
			u.setToolTipText(RtpTypesMessages.RtpUtilizationFactorType_ReadOnly);
		} else if (!readOnly && !u.isEnabled()) {
			u.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpUtilizationFactorType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
