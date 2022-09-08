/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EEnumLiteral;

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
import org.eclipse.emf.eef.runtime.ui.widgets.RadioViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

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
public class RealIntervalPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RealIntervalPropertiesEditionPart {

	protected RadioViewer delimiterMinRadioViewer;
	protected Text boundMin;
	protected Text boundMax;
	protected RadioViewer delimiterMaxRadioViewer;



	/**
	 * For {@link ISection} use only.
	 */
	public RealIntervalPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealIntervalPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence realIntervalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = realIntervalStep.addStep(RtpUtilityTypesViewsRepository.RealInterval.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax);
		
		
		composer = new PartComposer(realIntervalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.RealInterval.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin) {
					return createDelimiterMinRadioViewer(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin) {
					return createBoundMinText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax) {
					return createBoundMaxText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax) {
					return createDelimiterMaxRadioViewer(parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.RealIntervalPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createDelimiterMinRadioViewer(Composite parent) {
		delimiterMinRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData delimiterMinData = new GridData(GridData.FILL_HORIZONTAL);
		delimiterMinData.horizontalSpan = 2;
		delimiterMinRadioViewer.setLayoutData(delimiterMinData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin, RtpUtilityTypesViewsRepository.FORM_KIND), null);
		delimiterMinRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		delimiterMinRadioViewer.setID(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin);
		return parent;
	}

	
	protected Composite createBoundMinText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin, RtpUtilityTypesMessages.RealIntervalPropertiesEditionPart_BoundMinLabel);
		boundMin = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		boundMin.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData boundMinData = new GridData(GridData.FILL_HORIZONTAL);
		boundMin.setLayoutData(boundMinData);
		boundMin.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							RealIntervalPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMin.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RealIntervalPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, boundMin.getText()));
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
									RealIntervalPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		boundMin.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMin.getText()));
				}
			}
		});
		EditingUtils.setID(boundMin, RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin);
		EditingUtils.setEEFtype(boundMin, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBoundMaxText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax, RtpUtilityTypesMessages.RealIntervalPropertiesEditionPart_BoundMaxLabel);
		boundMax = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		boundMax.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData boundMaxData = new GridData(GridData.FILL_HORIZONTAL);
		boundMax.setLayoutData(boundMaxData);
		boundMax.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							RealIntervalPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMax.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RealIntervalPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, boundMax.getText()));
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
									RealIntervalPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		boundMax.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMax.getText()));
				}
			}
		});
		EditingUtils.setID(boundMax, RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax);
		EditingUtils.setEEFtype(boundMax, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createDelimiterMaxRadioViewer(Composite parent) {
		delimiterMaxRadioViewer = new RadioViewer(parent, SWT.CHECK);
		GridData delimiterMaxData = new GridData(GridData.FILL_HORIZONTAL);
		delimiterMaxData.horizontalSpan = 2;
		delimiterMaxRadioViewer.setLayoutData(delimiterMaxData);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax, RtpUtilityTypesViewsRepository.FORM_KIND), null);
		delimiterMaxRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		delimiterMaxRadioViewer.setID(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax);
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#getDelimiterMin()
	 * 
	 */
	public Object getDelimiterMin() {
		if (delimiterMinRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) delimiterMinRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#initDelimiterMin(Object input, Enumerator current)
	 */
	public void initDelimiterMin(Object input, Enumerator current) {
		delimiterMinRadioViewer.setInput(input);
		delimiterMinRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#setDelimiterMin(Object newValue)
	 * 
	 */
	public void setDelimiterMin(Object newValue) {
		delimiterMinRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMin);
		if (readOnly && delimiterMinRadioViewer.isEnabled()) {
			delimiterMinRadioViewer.setEnabled(false);
			delimiterMinRadioViewer.setToolTipText(RtpUtilityTypesMessages.RealInterval_ReadOnly);
		} else if (!readOnly && !delimiterMinRadioViewer.isEnabled()) {
			delimiterMinRadioViewer.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#getBoundMin()
	 * 
	 */
	public String getBoundMin() {
		return boundMin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#setBoundMin(String newValue)
	 * 
	 */
	public void setBoundMin(String newValue) {
		if (newValue != null) {
			boundMin.setText(newValue);
		} else {
			boundMin.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMin);
		if (readOnly && boundMin.isEnabled()) {
			boundMin.setEnabled(false);
			boundMin.setToolTipText(RtpUtilityTypesMessages.RealInterval_ReadOnly);
		} else if (!readOnly && !boundMin.isEnabled()) {
			boundMin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#getBoundMax()
	 * 
	 */
	public String getBoundMax() {
		return boundMax.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#setBoundMax(String newValue)
	 * 
	 */
	public void setBoundMax(String newValue) {
		if (newValue != null) {
			boundMax.setText(newValue);
		} else {
			boundMax.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealInterval.Properties.boundMax);
		if (readOnly && boundMax.isEnabled()) {
			boundMax.setEnabled(false);
			boundMax.setToolTipText(RtpUtilityTypesMessages.RealInterval_ReadOnly);
		} else if (!readOnly && !boundMax.isEnabled()) {
			boundMax.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#getDelimiterMax()
	 * 
	 */
	public Object getDelimiterMax() {
		if (delimiterMaxRadioViewer.getSelection() instanceof StructuredSelection) {
			StructuredSelection sSelection = (StructuredSelection) delimiterMaxRadioViewer.getSelection();
			return sSelection.getFirstElement();
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#initDelimiterMax(Object input, Enumerator current)
	 */
	public void initDelimiterMax(Object input, Enumerator current) {
		delimiterMaxRadioViewer.setInput(input);
		delimiterMaxRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealIntervalPropertiesEditionPart#setDelimiterMax(Object newValue)
	 * 
	 */
	public void setDelimiterMax(Object newValue) {
		delimiterMaxRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealInterval.Properties.delimiterMax);
		if (readOnly && delimiterMaxRadioViewer.isEnabled()) {
			delimiterMaxRadioViewer.setEnabled(false);
			delimiterMaxRadioViewer.setToolTipText(RtpUtilityTypesMessages.RealInterval_ReadOnly);
		} else if (!readOnly && !delimiterMaxRadioViewer.isEnabled()) {
			delimiterMaxRadioViewer.setEnabled(true);
		}
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.RealInterval_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
