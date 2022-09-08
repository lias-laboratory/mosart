/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

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
public class RtpPeriodicTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpPeriodicTypePropertiesEditionPart {

	protected SingleCompositionEditor period;
	protected SingleCompositionEditor jitter;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpPeriodicTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpPeriodicTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpPeriodicTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpPeriodicTypeStep.addStep(RtpTypesViewsRepository.RtpPeriodicType.Properties.class);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		
		
		composer = new PartComposer(rtpPeriodicTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpPeriodicType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpTypesViewsRepository.RtpPeriodicType.Properties.period) {
					return createPeriodSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter) {
					return createJitterSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpTypesMessages.RtpPeriodicTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createPeriodSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpPeriodicType.Properties.period, RtpTypesMessages.RtpPeriodicTypePropertiesEditionPart_PeriodLabel);
		//create widget
		period = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				period.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				period.refresh();
			}
		});
		period.setID(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPeriodicType.Properties.period, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createJitterSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, RtpTypesMessages.RtpPeriodicTypePropertiesEditionPart_JitterLabel);
		//create widget
		jitter = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData jitterData = new GridData(GridData.FILL_HORIZONTAL);
		jitter.setLayoutData(jitterData);
		jitter.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				jitter.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				jitter.refresh();
			}
		});
		jitter.setID(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#getPeriod()
	 * 
	 */
	public EObject getPeriod() {
		return (EObject) period.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#initPeriod(EObjectFlatComboSettings)
	 */
	public void initPeriod(EObjectFlatComboSettings settings) {
		period.setAdapterFactory(adapterFactory);
		period.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		if (readOnly && period.isEnabled()) {
			period.setEnabled(false);
			period.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !period.isEnabled()) {
			period.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#setPeriod(EObject newValue)
	 * 
	 */
	public void setPeriod(EObject newValue) {
		period.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		if (readOnly && period.isEnabled()) {
			period.setEnabled(false);
			period.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !period.isEnabled()) {
			period.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#getJitter()
	 * 
	 */
	public EObject getJitter() {
		return (EObject) jitter.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#initJitter(EObjectFlatComboSettings)
	 */
	public void initJitter(EObjectFlatComboSettings settings) {
		jitter.setAdapterFactory(adapterFactory);
		jitter.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		if (readOnly && jitter.isEnabled()) {
			jitter.setEnabled(false);
			jitter.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !jitter.isEnabled()) {
			jitter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#setJitter(EObject newValue)
	 * 
	 */
	public void setJitter(EObject newValue) {
		jitter.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		if (readOnly && jitter.isEnabled()) {
			jitter.setEnabled(false);
			jitter.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !jitter.isEnabled()) {
			jitter.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpPeriodicType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
