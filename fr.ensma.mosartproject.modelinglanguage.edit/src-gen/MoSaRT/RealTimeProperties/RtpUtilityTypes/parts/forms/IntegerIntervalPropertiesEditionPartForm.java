/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart;
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
public class IntegerIntervalPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IntegerIntervalPropertiesEditionPart {

	protected RadioViewer delimiterMinRadioViewer;
	protected Text boundMin;
	protected Text boundMax;
	protected RadioViewer delimiterMaxRadioViewer;



	/**
	 * For {@link ISection} use only.
	 */
	public IntegerIntervalPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerIntervalPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerIntervalStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = integerIntervalStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax);
		
		
		composer = new PartComposer(integerIntervalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin) {
					return createDelimiterMinRadioViewer(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin) {
					return createBoundMinText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax) {
					return createBoundMaxText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax) {
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
		propertiesSection.setText(RtpUtilityTypesMessages.IntegerIntervalPropertiesEditionPart_PropertiesGroupLabel);
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
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin, RtpUtilityTypesViewsRepository.FORM_KIND), null);
		delimiterMinRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		delimiterMinRadioViewer.setID(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin);
		return parent;
	}

	
	protected Composite createBoundMinText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, RtpUtilityTypesMessages.IntegerIntervalPropertiesEditionPart_BoundMinLabel);
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
							IntegerIntervalPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMin.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IntegerIntervalPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin,
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
									IntegerIntervalPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMin.getText()));
				}
			}
		});
		EditingUtils.setID(boundMin, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin);
		EditingUtils.setEEFtype(boundMin, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBoundMaxText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, RtpUtilityTypesMessages.IntegerIntervalPropertiesEditionPart_BoundMaxLabel);
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
							IntegerIntervalPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMax.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IntegerIntervalPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax,
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
									IntegerIntervalPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, boundMax.getText()));
				}
			}
		});
		EditingUtils.setID(boundMax, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax);
		EditingUtils.setEEFtype(boundMax, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax, RtpUtilityTypesViewsRepository.FORM_KIND), null);
		delimiterMaxRadioViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerIntervalPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ((StructuredSelection)event.getSelection()).getFirstElement()));
			}
		});
		delimiterMaxRadioViewer.setID(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax);
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getDelimiterMin()
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#initDelimiterMin(Object input, Enumerator current)
	 */
	public void initDelimiterMin(Object input, Enumerator current) {
		delimiterMinRadioViewer.setInput(input);
		delimiterMinRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setDelimiterMin(Object newValue)
	 * 
	 */
	public void setDelimiterMin(Object newValue) {
		delimiterMinRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMin);
		if (readOnly && delimiterMinRadioViewer.isEnabled()) {
			delimiterMinRadioViewer.setEnabled(false);
			delimiterMinRadioViewer.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !delimiterMinRadioViewer.isEnabled()) {
			delimiterMinRadioViewer.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getBoundMin()
	 * 
	 */
	public String getBoundMin() {
		return boundMin.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setBoundMin(String newValue)
	 * 
	 */
	public void setBoundMin(String newValue) {
		if (newValue != null) {
			boundMin.setText(newValue);
		} else {
			boundMin.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMin);
		if (readOnly && boundMin.isEnabled()) {
			boundMin.setEnabled(false);
			boundMin.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !boundMin.isEnabled()) {
			boundMin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getBoundMax()
	 * 
	 */
	public String getBoundMax() {
		return boundMax.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setBoundMax(String newValue)
	 * 
	 */
	public void setBoundMax(String newValue) {
		if (newValue != null) {
			boundMax.setText(newValue);
		} else {
			boundMax.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.boundMax);
		if (readOnly && boundMax.isEnabled()) {
			boundMax.setEnabled(false);
			boundMax.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
		} else if (!readOnly && !boundMax.isEnabled()) {
			boundMax.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#getDelimiterMax()
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#initDelimiterMax(Object input, Enumerator current)
	 */
	public void initDelimiterMax(Object input, Enumerator current) {
		delimiterMaxRadioViewer.setInput(input);
		delimiterMaxRadioViewer.setSelection(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerIntervalPropertiesEditionPart#setDelimiterMax(Object newValue)
	 * 
	 */
	public void setDelimiterMax(Object newValue) {
		delimiterMaxRadioViewer.setSelection(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerInterval.Properties.delimiterMax);
		if (readOnly && delimiterMaxRadioViewer.isEnabled()) {
			delimiterMaxRadioViewer.setEnabled(false);
			delimiterMaxRadioViewer.setToolTipText(RtpUtilityTypesMessages.IntegerInterval_ReadOnly);
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
		return RtpUtilityTypesMessages.IntegerInterval_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
