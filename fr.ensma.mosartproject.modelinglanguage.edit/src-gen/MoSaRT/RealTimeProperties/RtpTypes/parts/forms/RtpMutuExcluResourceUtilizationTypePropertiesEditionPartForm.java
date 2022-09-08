/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

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
public class RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpMutuExcluResourceUtilizationTypePropertiesEditionPart {

	protected EObjectFlatComboViewer resource;
	protected SingleCompositionEditor timeUtilization;
	protected SingleCompositionEditor specialAccessPriority;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpMutuExcluResourceUtilizationTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpMutuExcluResourceUtilizationTypeStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.class);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		
		
		composer = new PartComposer(rtpMutuExcluResourceUtilizationTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource) {
					return createResourceFlatComboViewer(parent, widgetFactory);
				}
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization) {
					return createTimeUtilizationSingleCompositionEditor(parent, widgetFactory);
				}
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority) {
					return createSpecialAccessPrioritySingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_ResourceLabel);
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, RtpTypesViewsRepository.FORM_KIND));
		widgetFactory.adapt(resource);
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm.this, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		resource.setID(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTimeUtilizationSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_TimeUtilizationLabel);
		//create widget
		timeUtilization = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData timeUtilizationData = new GridData(GridData.FILL_HORIZONTAL);
		timeUtilization.setLayoutData(timeUtilizationData);
		timeUtilization.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				timeUtilization.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				timeUtilization.refresh();
			}
		});
		timeUtilization.setID(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSpecialAccessPrioritySingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_SpecialAccessPriorityLabel);
		//create widget
		specialAccessPriority = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData specialAccessPriorityData = new GridData(GridData.FILL_HORIZONTAL);
		specialAccessPriority.setLayoutData(specialAccessPriorityData);
		specialAccessPriority.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				specialAccessPriority.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				specialAccessPriority.refresh();
			}
		});
		specialAccessPriority.setID(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#getResource()
	 * 
	 */
	public EObject getResource() {
		if (resource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) resource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#initResource(EObjectFlatComboSettings)
	 */
	public void initResource(EObjectFlatComboSettings settings) {
		resource.setInput(settings);
		if (current != null) {
			resource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		if (readOnly && resource.isEnabled()) {
			resource.setEnabled(false);
			resource.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !resource.isEnabled()) {
			resource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setResource(EObject newValue)
	 * 
	 */
	public void setResource(EObject newValue) {
		if (newValue != null) {
			resource.setSelection(new StructuredSelection(newValue));
		} else {
			resource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		if (readOnly && resource.isEnabled()) {
			resource.setEnabled(false);
			resource.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !resource.isEnabled()) {
			resource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue) {
		resource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#addFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter) {
		resource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#addBusinessFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter) {
		resource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#getTimeUtilization()
	 * 
	 */
	public EObject getTimeUtilization() {
		return (EObject) timeUtilization.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#initTimeUtilization(EObjectFlatComboSettings)
	 */
	public void initTimeUtilization(EObjectFlatComboSettings settings) {
		timeUtilization.setAdapterFactory(adapterFactory);
		timeUtilization.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		if (readOnly && timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(false);
			timeUtilization.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setTimeUtilization(EObject newValue)
	 * 
	 */
	public void setTimeUtilization(EObject newValue) {
		timeUtilization.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		if (readOnly && timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(false);
			timeUtilization.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#getSpecialAccessPriority()
	 * 
	 */
	public EObject getSpecialAccessPriority() {
		return (EObject) specialAccessPriority.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#initSpecialAccessPriority(EObjectFlatComboSettings)
	 */
	public void initSpecialAccessPriority(EObjectFlatComboSettings settings) {
		specialAccessPriority.setAdapterFactory(adapterFactory);
		specialAccessPriority.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		if (readOnly && specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(false);
			specialAccessPriority.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setSpecialAccessPriority(EObject newValue)
	 * 
	 */
	public void setSpecialAccessPriority(EObject newValue) {
		specialAccessPriority.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		if (readOnly && specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(false);
			specialAccessPriority.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpMutuExcluResourceUtilizationType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
