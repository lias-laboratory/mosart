/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class MeasuredIntegerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MeasuredIntegerPropertiesEditionPart {

	protected Text value;
	protected Text unknownValueName;
	protected Text toolUsedDescriptions;
	protected Button editToolUsedDescriptions;
	private EList toolUsedDescriptionsList;
	protected Text allOldValues;
	protected Button editAllOldValues;
	private EList allOldValuesList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MeasuredIntegerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence measuredIntegerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = measuredIntegerStep.addStep(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues);
		
		
		composer = new PartComposer(measuredIntegerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value) {
					return createValueText(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName) {
					return createUnknownValueNameText(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions) {
					return createToolUsedDescriptionsMultiValuedEditor(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues) {
					return createAllOldValuesMultiValuedEditor(parent);
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
		propertiesGroup.setText(RtpUtilityTypesMessages.MeasuredIntegerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value, RtpUtilityTypesMessages.MeasuredIntegerPropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredIntegerPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredIntegerPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUnknownValueNameText(Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName, RtpUtilityTypesMessages.MeasuredIntegerPropertiesEditionPart_UnknownValueNameLabel);
		unknownValueName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData unknownValueNameData = new GridData(GridData.FILL_HORIZONTAL);
		unknownValueName.setLayoutData(unknownValueNameData);
		unknownValueName.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredIntegerPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
			}

		});
		unknownValueName.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredIntegerPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
				}
			}

		});
		EditingUtils.setID(unknownValueName, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName);
		EditingUtils.setEEFtype(unknownValueName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName, RtpUtilityTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createToolUsedDescriptionsMultiValuedEditor(Composite parent) {
		toolUsedDescriptions = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData toolUsedDescriptionsData = new GridData(GridData.FILL_HORIZONTAL);
		toolUsedDescriptionsData.horizontalSpan = 2;
		toolUsedDescriptions.setLayoutData(toolUsedDescriptionsData);
		EditingUtils.setID(toolUsedDescriptions, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions);
		EditingUtils.setEEFtype(toolUsedDescriptions, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editToolUsedDescriptions = new Button(parent, SWT.NONE);
		editToolUsedDescriptions.setText(getDescription(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions, RtpUtilityTypesMessages.MeasuredIntegerPropertiesEditionPart_ToolUsedDescriptionsLabel));
		GridData editToolUsedDescriptionsData = new GridData();
		editToolUsedDescriptions.setLayoutData(editToolUsedDescriptionsData);
		editToolUsedDescriptions.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						toolUsedDescriptions.getShell(), "MeasuredInteger", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						toolUsedDescriptionsList, RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_ToolUsedDescriptions().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					toolUsedDescriptionsList = dialog.getResult();
					if (toolUsedDescriptionsList == null) {
						toolUsedDescriptionsList = new BasicEList();
					}
					toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredIntegerPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(toolUsedDescriptionsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editToolUsedDescriptions, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions);
		EditingUtils.setEEFtype(editToolUsedDescriptions, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	protected Composite createAllOldValuesMultiValuedEditor(Composite parent) {
		allOldValues = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData allOldValuesData = new GridData(GridData.FILL_HORIZONTAL);
		allOldValuesData.horizontalSpan = 2;
		allOldValues.setLayoutData(allOldValuesData);
		EditingUtils.setID(allOldValues, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues);
		EditingUtils.setEEFtype(allOldValues, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAllOldValues = new Button(parent, SWT.NONE);
		editAllOldValues.setText(getDescription(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues, RtpUtilityTypesMessages.MeasuredIntegerPropertiesEditionPart_AllOldValuesLabel));
		GridData editAllOldValuesData = new GridData();
		editAllOldValues.setLayoutData(editAllOldValuesData);
		editAllOldValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						allOldValues.getShell(), "MeasuredInteger", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						allOldValuesList, RtpUtilityTypesPackage.eINSTANCE.getMeasuredInteger_AllOldValues().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					allOldValuesList = dialog.getResult();
					if (allOldValuesList == null) {
						allOldValuesList = new BasicEList();
					}
					allOldValues.setText(allOldValuesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredIntegerPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(allOldValuesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAllOldValues, RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues);
		EditingUtils.setEEFtype(editAllOldValues, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpUtilityTypesMessages.MeasuredInteger_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#getUnknownValueName()
	 * 
	 */
	public String getUnknownValueName() {
		return unknownValueName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#setUnknownValueName(String newValue)
	 * 
	 */
	public void setUnknownValueName(String newValue) {
		if (newValue != null) {
			unknownValueName.setText(newValue);
		} else {
			unknownValueName.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.unknownValueName);
		if (readOnly && unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(false);
			unknownValueName.setToolTipText(RtpUtilityTypesMessages.MeasuredInteger_ReadOnly);
		} else if (!readOnly && !unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#getToolUsedDescriptions()
	 * 
	 */
	public EList getToolUsedDescriptions() {
		return toolUsedDescriptionsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#setToolUsedDescriptions(EList newValue)
	 * 
	 */
	public void setToolUsedDescriptions(EList newValue) {
		toolUsedDescriptionsList = newValue;
		if (newValue != null) {
			toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
		} else {
			toolUsedDescriptions.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.toolUsedDescriptions);
		if (readOnly && toolUsedDescriptions.isEnabled()) {
			toolUsedDescriptions.setEnabled(false);
			toolUsedDescriptions.setToolTipText(RtpUtilityTypesMessages.MeasuredInteger_ReadOnly);
		} else if (!readOnly && !toolUsedDescriptions.isEnabled()) {
			toolUsedDescriptions.setEnabled(true);
		}	
		
	}

	public void addToToolUsedDescriptions(Object newValue) {
		toolUsedDescriptionsList.add(newValue);
		if (newValue != null) {
			toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
		} else {
			toolUsedDescriptions.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToToolUsedDescriptions(Object newValue) {
		toolUsedDescriptionsList.remove(newValue);
		if (newValue != null) {
			toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
		} else {
			toolUsedDescriptions.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#getAllOldValues()
	 * 
	 */
	public EList getAllOldValues() {
		return allOldValuesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredIntegerPropertiesEditionPart#setAllOldValues(EList newValue)
	 * 
	 */
	public void setAllOldValues(EList newValue) {
		allOldValuesList = newValue;
		if (newValue != null) {
			allOldValues.setText(allOldValuesList.toString());
		} else {
			allOldValues.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredInteger.Properties.allOldValues);
		if (readOnly && allOldValues.isEnabled()) {
			allOldValues.setEnabled(false);
			allOldValues.setToolTipText(RtpUtilityTypesMessages.MeasuredInteger_ReadOnly);
		} else if (!readOnly && !allOldValues.isEnabled()) {
			allOldValues.setEnabled(true);
		}	
		
	}

	public void addToAllOldValues(Object newValue) {
		allOldValuesList.add(newValue);
		if (newValue != null) {
			allOldValues.setText(allOldValuesList.toString());
		} else {
			allOldValues.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToAllOldValues(Object newValue) {
		allOldValuesList.remove(newValue);
		if (newValue != null) {
			allOldValues.setText(allOldValuesList.toString());
		} else {
			allOldValues.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.MeasuredInteger_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
