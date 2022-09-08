/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
public class MeasuredRealPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, MeasuredRealPropertiesEditionPart {

	protected Text value;
	protected Text unknownValueName;
	protected Text toolUsedDescriptions;
	protected Button editToolUsedDescriptions;
	private EList toolUsedDescriptionsList;
	protected Text allOldValues;
	protected Button editAllOldValues;
	private EList allOldValuesList;



	/**
	 * For {@link ISection} use only.
	 */
	public MeasuredRealPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MeasuredRealPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence measuredRealStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = measuredRealStep.addStep(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.class);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions);
		propertiesStep.addStep(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues);
		
		
		composer = new PartComposer(measuredRealStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value) {
					return createValueText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName) {
					return createUnknownValueNameText(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions) {
					return createToolUsedDescriptionsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues) {
					return createAllOldValuesMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.MeasuredRealPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value, RtpUtilityTypesMessages.MeasuredRealPropertiesEditionPart_ValueLabel);
		value = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		value.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MeasuredRealPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MeasuredRealPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, value.getText()));
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
									MeasuredRealPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		value.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}
		});
		EditingUtils.setID(value, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUnknownValueNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName, RtpUtilityTypesMessages.MeasuredRealPropertiesEditionPart_UnknownValueNameLabel);
		unknownValueName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		unknownValueName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData unknownValueNameData = new GridData(GridData.FILL_HORIZONTAL);
		unknownValueName.setLayoutData(unknownValueNameData);
		unknownValueName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							MeasuredRealPropertiesEditionPartForm.this,
							RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									MeasuredRealPropertiesEditionPartForm.this,
									RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, unknownValueName.getText()));
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
									MeasuredRealPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		unknownValueName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
				}
			}
		});
		EditingUtils.setID(unknownValueName, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName);
		EditingUtils.setEEFtype(unknownValueName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName, RtpUtilityTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createToolUsedDescriptionsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		toolUsedDescriptions = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData toolUsedDescriptionsData = new GridData(GridData.FILL_HORIZONTAL);
		toolUsedDescriptionsData.horizontalSpan = 2;
		toolUsedDescriptions.setLayoutData(toolUsedDescriptionsData);
		EditingUtils.setID(toolUsedDescriptions, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions);
		EditingUtils.setEEFtype(toolUsedDescriptions, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editToolUsedDescriptions = widgetFactory.createButton(parent, getDescription(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions, RtpUtilityTypesMessages.MeasuredRealPropertiesEditionPart_ToolUsedDescriptionsLabel), SWT.NONE);
		GridData editToolUsedDescriptionsData = new GridData();
		editToolUsedDescriptions.setLayoutData(editToolUsedDescriptionsData);
		editToolUsedDescriptions.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						toolUsedDescriptions.getShell(), "MeasuredReal", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						toolUsedDescriptionsList, RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_ToolUsedDescriptions().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					toolUsedDescriptionsList = dialog.getResult();
					if (toolUsedDescriptionsList == null) {
						toolUsedDescriptionsList = new BasicEList();
					}
					toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(toolUsedDescriptionsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editToolUsedDescriptions, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions);
		EditingUtils.setEEFtype(editToolUsedDescriptions, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createAllOldValuesMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		allOldValues = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData allOldValuesData = new GridData(GridData.FILL_HORIZONTAL);
		allOldValuesData.horizontalSpan = 2;
		allOldValues.setLayoutData(allOldValuesData);
		EditingUtils.setID(allOldValues, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues);
		EditingUtils.setEEFtype(allOldValues, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editAllOldValues = widgetFactory.createButton(parent, getDescription(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues, RtpUtilityTypesMessages.MeasuredRealPropertiesEditionPart_AllOldValuesLabel), SWT.NONE);
		GridData editAllOldValuesData = new GridData();
		editAllOldValues.setLayoutData(editAllOldValuesData);
		editAllOldValues.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						allOldValues.getShell(), "MeasuredReal", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						allOldValuesList, RtpUtilityTypesPackage.eINSTANCE.getMeasuredReal_AllOldValues().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					allOldValuesList = dialog.getResult();
					if (allOldValuesList == null) {
						allOldValuesList = new BasicEList();
					}
					allOldValues.setText(allOldValuesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MeasuredRealPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(allOldValuesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editAllOldValues, RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues);
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpUtilityTypesMessages.MeasuredReal_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#getUnknownValueName()
	 * 
	 */
	public String getUnknownValueName() {
		return unknownValueName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#setUnknownValueName(String newValue)
	 * 
	 */
	public void setUnknownValueName(String newValue) {
		if (newValue != null) {
			unknownValueName.setText(newValue);
		} else {
			unknownValueName.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.unknownValueName);
		if (readOnly && unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(false);
			unknownValueName.setToolTipText(RtpUtilityTypesMessages.MeasuredReal_ReadOnly);
		} else if (!readOnly && !unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#getToolUsedDescriptions()
	 * 
	 */
	public EList getToolUsedDescriptions() {
		return toolUsedDescriptionsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#setToolUsedDescriptions(EList newValue)
	 * 
	 */
	public void setToolUsedDescriptions(EList newValue) {
		toolUsedDescriptionsList = newValue;
		if (newValue != null) {
			toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
		} else {
			toolUsedDescriptions.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.toolUsedDescriptions);
		if (readOnly && toolUsedDescriptions.isEnabled()) {
			toolUsedDescriptions.setEnabled(false);
			toolUsedDescriptions.setToolTipText(RtpUtilityTypesMessages.MeasuredReal_ReadOnly);
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#getAllOldValues()
	 * 
	 */
	public EList getAllOldValues() {
		return allOldValuesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.MeasuredRealPropertiesEditionPart#setAllOldValues(EList newValue)
	 * 
	 */
	public void setAllOldValues(EList newValue) {
		allOldValuesList = newValue;
		if (newValue != null) {
			allOldValues.setText(allOldValuesList.toString());
		} else {
			allOldValues.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.MeasuredReal.Properties.allOldValues);
		if (readOnly && allOldValues.isEnabled()) {
			allOldValues.setEnabled(false);
			allOldValues.setToolTipText(RtpUtilityTypesMessages.MeasuredReal_ReadOnly);
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
		return RtpUtilityTypesMessages.MeasuredReal_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
