/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

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
public class RtpExecutionTimeMmaPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpExecutionTimeMmaPropertiesEditionPart {

	protected SingleCompositionEditor minMaxAvg;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpExecutionTimeMmaPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeMmaPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeMmaStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpExecutionTimeMmaStep
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.class)
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		
		
		composer = new PartComposer(rtpExecutionTimeMmaStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg) {
					return createMinMaxAvgSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpHelperTypesMessages.RtpExecutionTimeMmaPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createMinMaxAvgSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, RtpHelperTypesMessages.RtpExecutionTimeMmaPropertiesEditionPart_MinMaxAvgLabel);
		//create widget
		minMaxAvg = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData minMaxAvgData = new GridData(GridData.FILL_HORIZONTAL);
		minMaxAvg.setLayoutData(minMaxAvgData);
		minMaxAvg.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeMmaPropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				minMaxAvg.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeMmaPropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				minMaxAvg.refresh();
			}
		});
		minMaxAvg.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart#getMinMaxAvg()
	 * 
	 */
	public EObject getMinMaxAvg() {
		return (EObject) minMaxAvg.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart#initMinMaxAvg(EObjectFlatComboSettings)
	 */
	public void initMinMaxAvg(EObjectFlatComboSettings settings) {
		minMaxAvg.setAdapterFactory(adapterFactory);
		minMaxAvg.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		if (readOnly && minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(false);
			minMaxAvg.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeMma_ReadOnly);
		} else if (!readOnly && !minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart#setMinMaxAvg(EObject newValue)
	 * 
	 */
	public void setMinMaxAvg(EObject newValue) {
		minMaxAvg.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		if (readOnly && minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(false);
			minMaxAvg.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeMma_ReadOnly);
		} else if (!readOnly && !minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpExecutionTimeMma_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
