/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

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
public class RtpExecutionTimeCalculatedValuePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpExecutionTimeCalculatedValuePropertiesEditionPart {

	protected Text unknownValueName;
	protected Text toolUsedDescriptions;
	protected Button editToolUsedDescriptions;
	private EList toolUsedDescriptionsList;
	protected ReferencesTable allOldValues;
	protected List<ViewerFilter> allOldValuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> allOldValuesFilters = new ArrayList<ViewerFilter>();
	protected SingleCompositionEditor value;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpExecutionTimeCalculatedValuePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeCalculatedValuePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeCalculatedValueStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpExecutionTimeCalculatedValueStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value);
		
		
		composer = new PartComposer(rtpExecutionTimeCalculatedValueStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName) {
					return createUnknownValueNameText(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions) {
					return createToolUsedDescriptionsMultiValuedEditor(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues) {
					return createAllOldValuesTableComposition(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value) {
					return createValueSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpHelperTypesMessages.RtpExecutionTimeCalculatedValuePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createUnknownValueNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName, RtpHelperTypesMessages.RtpExecutionTimeCalculatedValuePropertiesEditionPart_UnknownValueNameLabel);
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
							RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this,
							RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this,
									RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName,
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
									RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
				}
			}
		});
		EditingUtils.setID(unknownValueName, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName);
		EditingUtils.setEEFtype(unknownValueName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
		EditingUtils.setID(toolUsedDescriptions, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions);
		EditingUtils.setEEFtype(toolUsedDescriptions, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editToolUsedDescriptions = widgetFactory.createButton(parent, getDescription(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions, RtpHelperTypesMessages.RtpExecutionTimeCalculatedValuePropertiesEditionPart_ToolUsedDescriptionsLabel), SWT.NONE);
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
						toolUsedDescriptions.getShell(), "RtpExecutionTimeCalculatedValue", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						toolUsedDescriptionsList, RtpHelperTypesPackage.eINSTANCE.getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					toolUsedDescriptionsList = dialog.getResult();
					if (toolUsedDescriptionsList == null) {
						toolUsedDescriptionsList = new BasicEList();
					}
					toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(toolUsedDescriptionsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editToolUsedDescriptions, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions);
		EditingUtils.setEEFtype(editToolUsedDescriptions, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAllOldValuesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.allOldValues = new ReferencesTable(getDescription(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, RtpHelperTypesMessages.RtpExecutionTimeCalculatedValuePropertiesEditionPart_AllOldValuesLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				allOldValues.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				allOldValues.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				allOldValues.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				allOldValues.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.allOldValuesFilters) {
			this.allOldValues.addFilter(filter);
		}
		this.allOldValues.setHelpText(propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, RtpHelperTypesViewsRepository.FORM_KIND));
		this.allOldValues.createControls(parent, widgetFactory);
		this.allOldValues.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData allOldValuesData = new GridData(GridData.FILL_HORIZONTAL);
		allOldValuesData.horizontalSpan = 3;
		this.allOldValues.setLayoutData(allOldValuesData);
		this.allOldValues.setLowerBound(0);
		this.allOldValues.setUpperBound(-1);
		allOldValues.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues);
		allOldValues.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createValueSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value, RtpHelperTypesMessages.RtpExecutionTimeCalculatedValuePropertiesEditionPart_ValueLabel);
		//create widget
		value = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				value.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeCalculatedValuePropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				value.refresh();
			}
		});
		value.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#getUnknownValueName()
	 * 
	 */
	public String getUnknownValueName() {
		return unknownValueName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#setUnknownValueName(String newValue)
	 * 
	 */
	public void setUnknownValueName(String newValue) {
		if (newValue != null) {
			unknownValueName.setText(newValue);
		} else {
			unknownValueName.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.unknownValueName);
		if (readOnly && unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(false);
			unknownValueName.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeCalculatedValue_ReadOnly);
		} else if (!readOnly && !unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#getToolUsedDescriptions()
	 * 
	 */
	public EList getToolUsedDescriptions() {
		return toolUsedDescriptionsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#setToolUsedDescriptions(EList newValue)
	 * 
	 */
	public void setToolUsedDescriptions(EList newValue) {
		toolUsedDescriptionsList = newValue;
		if (newValue != null) {
			toolUsedDescriptions.setText(toolUsedDescriptionsList.toString());
		} else {
			toolUsedDescriptions.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.toolUsedDescriptions);
		if (readOnly && toolUsedDescriptions.isEnabled()) {
			toolUsedDescriptions.setEnabled(false);
			toolUsedDescriptions.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeCalculatedValue_ReadOnly);
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#initAllOldValues(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAllOldValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		allOldValues.setContentProvider(contentProvider);
		allOldValues.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.allOldValues);
		if (readOnly && allOldValues.isEnabled()) {
			allOldValues.setEnabled(false);
			allOldValues.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeCalculatedValue_ReadOnly);
		} else if (!readOnly && !allOldValues.isEnabled()) {
			allOldValues.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#updateAllOldValues()
	 * 
	 */
	public void updateAllOldValues() {
	allOldValues.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#addFilterAllOldValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAllOldValues(ViewerFilter filter) {
		allOldValuesFilters.add(filter);
		if (this.allOldValues != null) {
			this.allOldValues.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#addBusinessFilterAllOldValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAllOldValues(ViewerFilter filter) {
		allOldValuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#isContainedInAllOldValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInAllOldValuesTable(EObject element) {
		return ((ReferencesTableSettings)allOldValues.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#getValue()
	 * 
	 */
	public EObject getValue() {
		return (EObject) value.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#initValue(EObjectFlatComboSettings)
	 */
	public void initValue(EObjectFlatComboSettings settings) {
		value.setAdapterFactory(adapterFactory);
		value.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeCalculatedValue_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeCalculatedValuePropertiesEditionPart#setValue(EObject newValue)
	 * 
	 */
	public void setValue(EObject newValue) {
		value.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeCalculatedValue.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeCalculatedValue_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpExecutionTimeCalculatedValue_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
