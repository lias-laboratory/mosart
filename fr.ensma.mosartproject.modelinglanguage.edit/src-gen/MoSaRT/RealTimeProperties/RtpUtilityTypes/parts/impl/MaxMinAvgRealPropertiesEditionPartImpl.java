/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MaxMinAvgRealPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
public class MaxMinAvgRealPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MaxMinAvgRealPropertiesEditionPart {

	protected Text minValue;
	protected Text avgValue;
	protected Text maxValue;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MaxMinAvgRealPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence maxMinAvgRealStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = maxMinAvgRealStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue);
		
		
		composer = new PartComposer(maxMinAvgRealStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue) {
					return createMinValueText(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue) {
					return createAvgValueText(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue) {
					return createMaxValueText(parent);
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
		propertiesGroup.setText(RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createMinValueText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_MinValueLabel);
		minValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData minValueData = new GridData(GridData.FILL_HORIZONTAL);
		minValue.setLayoutData(minValueData);
		minValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minValue.getText()));
			}

		});
		minValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minValue.getText()));
				}
			}

		});
		EditingUtils.setID(minValue, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue);
		EditingUtils.setEEFtype(minValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.minValue, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAvgValueText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_AvgValueLabel);
		avgValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData avgValueData = new GridData(GridData.FILL_HORIZONTAL);
		avgValue.setLayoutData(avgValueData);
		avgValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, avgValue.getText()));
			}

		});
		avgValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, avgValue.getText()));
				}
			}

		});
		EditingUtils.setID(avgValue, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue);
		EditingUtils.setEEFtype(avgValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.avgValue, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxValueText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, RtpUtilityTypesMessages.MaxMinAvgRealPropertiesEditionPart_MaxValueLabel);
		maxValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData maxValueData = new GridData(GridData.FILL_HORIZONTAL);
		maxValue.setLayoutData(maxValueData);
		maxValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxValue.getText()));
			}

		});
		maxValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MaxMinAvgRealPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxValue.getText()));
				}
			}

		});
		EditingUtils.setID(maxValue, RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue);
		EditingUtils.setEEFtype(maxValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MaxMinAvgReal.Properties.maxValue, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
