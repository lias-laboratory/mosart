/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl;

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

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class RtpTimeLinkTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpTimeLinkTypePropertiesEditionPart {

	protected RadioViewer scheduleLinkRadioViewer;
	protected Text jobNumber;
	protected EObjectFlatComboViewer referenceActivity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpTimeLinkTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence rtpTimeLinkTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpTimeLinkTypeStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity);
		
		
		composer = new PartComposer(rtpTimeLinkTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink) {
					return createScheduleLinkRadioViewer(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber) {
					return createJobNumberText(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity) {
					return createReferenceActivityFlatComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(RtpHelperTypesMessages.RtpTimeLinkTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		scheduleLinkRadioViewer.setID(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.scheduleLink, RtpHelperTypesViewsRepository.SWT_KIND), null);
		return parent;
	}

	
	protected Composite createJobNumberText(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, RtpHelperTypesMessages.RtpTimeLinkTypePropertiesEditionPart_JobNumberLabel);
		jobNumber = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData jobNumberData = new GridData(GridData.FILL_HORIZONTAL);
		jobNumber.setLayoutData(jobNumberData);
		jobNumber.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jobNumber.getText()));
			}

		});
		jobNumber.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, jobNumber.getText()));
				}
			}

		});
		EditingUtils.setID(jobNumber, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber);
		EditingUtils.setEEFtype(jobNumber, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.jobNumber, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReferenceActivityFlatComboViewer(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, RtpHelperTypesMessages.RtpTimeLinkTypePropertiesEditionPart_ReferenceActivityLabel);
		referenceActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, RtpHelperTypesViewsRepository.SWT_KIND));
		referenceActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		referenceActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeLinkTypePropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getReferenceActivity()));
			}

		});
		GridData referenceActivityData = new GridData(GridData.FILL_HORIZONTAL);
		referenceActivity.setLayoutData(referenceActivityData);
		referenceActivity.setID(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeLinkType.Properties.referenceActivity, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
