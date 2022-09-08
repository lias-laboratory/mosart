/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EEnumLiteral;
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

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.RadioViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

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
public class RtpTimeLinkTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpTimeLinkTypePropertiesEditionPart {

	protected RadioViewer scheduleLinkRadioViewer;
	protected Text jobNumber;
	protected EObjectFlatComboViewer referenceActivity;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpTimeLinkTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpTimeLinkTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpTimeLinkTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpTimeLinkTypeStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity);
		
		
		composer = new PartComposer(rtpTimeLinkTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink) {
					return createScheduleLinkRadioViewer(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber) {
					return createJobNumberText(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity) {
					return createReferenceActivityFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(RtpHelperTypesMessages.RtpTimeLinkTypePropertiesEditionPart_PropertiesGroupLabel);
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
	 * 
	 */
	protected Composite createScheduleLinkRadioViewer(Composite parent) {
		scheduleLinkRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData scheduleLinkData = new GridData(GridData.FILL_HORIZONTAL);
		scheduleLinkData.horizontalSpan = 2;
		scheduleLinkRadioViewer.setLayoutData(scheduleLinkData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink, RtpHelperTypesViewsRepository.FORM_KIND), null);
		scheduleLinkRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		scheduleLinkRadioViewer.setID(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink);
		return parent;
	}

	
	protected Composite createJobNumberText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, RtpHelperTypesMessages.RtpTimeLinkTypePropertiesEditionPart_JobNumberLabel);
		jobNumber = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		jobNumber.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData jobNumberData = new GridData(GridData.FILL_HORIZONTAL);
		jobNumber.setLayoutData(jobNumberData);
		jobNumber.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							RtpTimeLinkTypePropertiesEditionPartForm.this,
							RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jobNumber.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RtpTimeLinkTypePropertiesEditionPartForm.this,
									RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, jobNumber.getText()));
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
									RtpTimeLinkTypePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		jobNumber.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jobNumber.getText()));
				}
			}
		});
		EditingUtils.setID(jobNumber, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber);
		EditingUtils.setEEFtype(jobNumber, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createReferenceActivityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, RtpHelperTypesMessages.RtpTimeLinkTypePropertiesEditionPart_ReferenceActivityLabel);
		referenceActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, RtpHelperTypesViewsRepository.FORM_KIND));
		widgetFactory.adapt(referenceActivity);
		referenceActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData referenceActivityData = new GridData(GridData.FILL_HORIZONTAL);
		referenceActivity.setLayoutData(referenceActivityData);
		referenceActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReferenceActivity()));
			}

		});
		referenceActivity.setID(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#getScheduleLink()
	 * 
	 */
	public Object getScheduleLink() {
		if (scheduleLinkRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) scheduleLinkRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#initScheduleLink(Object input, Enumerator current)
	 */
	public void initScheduleLink(Object input, Enumerator current) {
		scheduleLinkRadioViewer.setInput(input);
		scheduleLinkRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#setScheduleLink(Object newValue)
	 * 
	 */
	public void setScheduleLink(Object newValue) {
		scheduleLinkRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink);
		if (readOnly && scheduleLinkRadioViewer.isEnabled()) {
			scheduleLinkRadioViewer.setEnabled(false);
			scheduleLinkRadioViewer.setToolTipText(RtpHelperTypesMessages.RtpTimeLinkType_ReadOnly);
		} else if (!readOnly && !scheduleLinkRadioViewer.isEnabled()) {
			scheduleLinkRadioViewer.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#getJobNumber()
	 * 
	 */
	public String getJobNumber() {
		return jobNumber.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#setJobNumber(String newValue)
	 * 
	 */
	public void setJobNumber(String newValue) {
		if (newValue != null) {
			jobNumber.setText(newValue);
		} else {
			jobNumber.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber);
		if (readOnly && jobNumber.isEnabled()) {
			jobNumber.setEnabled(false);
			jobNumber.setToolTipText(RtpHelperTypesMessages.RtpTimeLinkType_ReadOnly);
		} else if (!readOnly && !jobNumber.isEnabled()) {
			jobNumber.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#getReferenceActivity()
	 * 
	 */
	public EObject getReferenceActivity() {
		if (referenceActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) referenceActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#initReferenceActivity(EObjectFlatComboSettings)
	 */
	public void initReferenceActivity(EObjectFlatComboSettings settings) {
		referenceActivity.setInput(settings);
		if (current != null) {
			referenceActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity);
		if (readOnly && referenceActivity.isEnabled()) {
			referenceActivity.setEnabled(false);
			referenceActivity.setToolTipText(RtpHelperTypesMessages.RtpTimeLinkType_ReadOnly);
		} else if (!readOnly && !referenceActivity.isEnabled()) {
			referenceActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#setReferenceActivity(EObject newValue)
	 * 
	 */
	public void setReferenceActivity(EObject newValue) {
		if (newValue != null) {
			referenceActivity.setSelection(new StructuredSelection(newValue));
		} else {
			referenceActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity);
		if (readOnly && referenceActivity.isEnabled()) {
			referenceActivity.setEnabled(false);
			referenceActivity.setToolTipText(RtpHelperTypesMessages.RtpTimeLinkType_ReadOnly);
		} else if (!readOnly && !referenceActivity.isEnabled()) {
			referenceActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#setReferenceActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setReferenceActivityButtonMode(ButtonsModeEnum newValue) {
		referenceActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#addFilterReferenceActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReferenceActivity(ViewerFilter filter) {
		referenceActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeLinkTypePropertiesEditionPart#addBusinessFilterReferenceActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReferenceActivity(ViewerFilter filter) {
		referenceActivity.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpTimeLinkType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
