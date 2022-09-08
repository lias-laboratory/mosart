/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

import org.eclipse.emf.ecore.EObject;

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
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

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
public class RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart {

	protected Text unknownValueName;
	protected SingleCompositionEditor functionToBeRequested;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeValueToBeCalculatedStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpExecutionTimeValueToBeCalculatedStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested);
		
		
		composer = new PartComposer(rtpExecutionTimeValueToBeCalculatedStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName) {
					return createUnknownValueNameText(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested) {
					return createFunctionToBeRequestedSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart_UnknownValueNameLabel);
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
							RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm.this,
							RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm.this,
									RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName,
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
									RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
				}
			}
		});
		EditingUtils.setID(unknownValueName, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName);
		EditingUtils.setEEFtype(unknownValueName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createFunctionToBeRequestedSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart_FunctionToBeRequestedLabel);
		//create widget
		functionToBeRequested = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData functionToBeRequestedData = new GridData(GridData.FILL_HORIZONTAL);
		functionToBeRequested.setLayoutData(functionToBeRequestedData);
		functionToBeRequested.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				functionToBeRequested.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				functionToBeRequested.refresh();
			}
		});
		functionToBeRequested.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart#getUnknownValueName()
	 * 
	 */
	public String getUnknownValueName() {
		return unknownValueName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart#setUnknownValueName(String newValue)
	 * 
	 */
	public void setUnknownValueName(String newValue) {
		if (newValue != null) {
			unknownValueName.setText(newValue);
		} else {
			unknownValueName.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName);
		if (readOnly && unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(false);
			unknownValueName.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculated_ReadOnly);
		} else if (!readOnly && !unknownValueName.isEnabled()) {
			unknownValueName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart#getFunctionToBeRequested()
	 * 
	 */
	public EObject getFunctionToBeRequested() {
		return (EObject) functionToBeRequested.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart#initFunctionToBeRequested(EObjectFlatComboSettings)
	 */
	public void initFunctionToBeRequested(EObjectFlatComboSettings settings) {
		functionToBeRequested.setAdapterFactory(adapterFactory);
		functionToBeRequested.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested);
		if (readOnly && functionToBeRequested.isEnabled()) {
			functionToBeRequested.setEnabled(false);
			functionToBeRequested.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculated_ReadOnly);
		} else if (!readOnly && !functionToBeRequested.isEnabled()) {
			functionToBeRequested.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart#setFunctionToBeRequested(EObject newValue)
	 * 
	 */
	public void setFunctionToBeRequested(EObject newValue) {
		functionToBeRequested.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested);
		if (readOnly && functionToBeRequested.isEnabled()) {
			functionToBeRequested.setEnabled(false);
			functionToBeRequested.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculated_ReadOnly);
		} else if (!readOnly && !functionToBeRequested.isEnabled()) {
			functionToBeRequested.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculated_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
