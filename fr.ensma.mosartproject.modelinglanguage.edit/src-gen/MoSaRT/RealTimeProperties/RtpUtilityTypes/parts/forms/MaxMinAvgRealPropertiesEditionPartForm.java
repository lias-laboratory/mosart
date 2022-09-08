/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

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
public class MaxMinAvgRealPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, MaxMinAvgRealPropertiesEditionPart {

	protected Text minValue;
	protected Text avgValue;
	protected Text maxValue;



	/**
	 * For {@link ISection} use only.
	 */
	public MaxMinAvgRealPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MaxMinAvgRealPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence maxMinAvgRealStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = maxMinAvgRealStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue);
		
		
		composer = new PartComposer(maxMinAvgRealStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue) {
					return createMinValueText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue) {
					return createAvgValueText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue) {
					return createMaxValueText(widgetFactory, parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createMinValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_MinValueLabel);
		minValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minValueData = new GridData(GridData.FILL_HORIZONTAL);
		minValue.setLayoutData(minValueData);
		minValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MaxMinAvgRealPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MaxMinAvgRealPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, minValue.getText()));
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
									MaxMinAvgRealPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		minValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minValue.getText()));
				}
			}
		});
		EditingUtils.setID(minValue, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue);
		EditingUtils.setEEFtype(minValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAvgValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_AvgValueLabel);
		avgValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		avgValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData avgValueData = new GridData(GridData.FILL_HORIZONTAL);
		avgValue.setLayoutData(avgValueData);
		avgValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MaxMinAvgRealPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, avgValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MaxMinAvgRealPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, avgValue.getText()));
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
									MaxMinAvgRealPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		avgValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, avgValue.getText()));
				}
			}
		});
		EditingUtils.setID(avgValue, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue);
		EditingUtils.setEEFtype(avgValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_MaxValueLabel);
		maxValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxValueData = new GridData(GridData.FILL_HORIZONTAL);
		maxValue.setLayoutData(maxValueData);
		maxValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MaxMinAvgRealPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MaxMinAvgRealPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxValue.getText()));
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
									MaxMinAvgRealPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxValue.getText()));
				}
			}
		});
		EditingUtils.setID(maxValue, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue);
		EditingUtils.setEEFtype(maxValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart#getMinValue()
	 * 
	 */
	public String getMinValue() {
		return minValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart#setMinValue(String newValue)
	 * 
	 */
	public void setMinValue(String newValue) {
		if (newValue != null) {
			minValue.setText(newValue);
		} else {
			minValue.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue);
		if (readOnly && minValue.isEnabled()) {
			minValue.setEnabled(false);
			minValue.setToolTipText(RtpUtilityTypesMessages.MaxMinAvgReal_ReadOnly);
		} else if (!readOnly && !minValue.isEnabled()) {
			minValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart#getAvgValue()
	 * 
	 */
	public String getAvgValue() {
		return avgValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart#setAvgValue(String newValue)
	 * 
	 */
	public void setAvgValue(String newValue) {
		if (newValue != null) {
			avgValue.setText(newValue);
		} else {
			avgValue.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue);
		if (readOnly && avgValue.isEnabled()) {
			avgValue.setEnabled(false);
			avgValue.setToolTipText(RtpUtilityTypesMessages.MaxMinAvgReal_ReadOnly);
		} else if (!readOnly && !avgValue.isEnabled()) {
			avgValue.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart#getMaxValue()
	 * 
	 */
	public String getMaxValue() {
		return maxValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart#setMaxValue(String newValue)
	 * 
	 */
	public void setMaxValue(String newValue) {
		if (newValue != null) {
			maxValue.setText(newValue);
		} else {
			maxValue.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue);
		if (readOnly && maxValue.isEnabled()) {
			maxValue.setEnabled(false);
			maxValue.setToolTipText(RtpUtilityTypesMessages.MaxMinAvgReal_ReadOnly);
		} else if (!readOnly && !maxValue.isEnabled()) {
			maxValue.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.MaxMinAvgReal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
