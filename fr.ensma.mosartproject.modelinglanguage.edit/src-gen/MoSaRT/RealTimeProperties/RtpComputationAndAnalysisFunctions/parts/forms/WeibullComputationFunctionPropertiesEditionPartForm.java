/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.RtpComputationAndAnalysisFunctionsViewsRepository;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.WeibullComputationFunctionPropertiesEditionPart;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.providers.RtpComputationAndAnalysisFunctionsMessages;

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
public class WeibullComputationFunctionPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, WeibullComputationFunctionPropertiesEditionPart {

	protected Text functionType;
	protected Text parameters;
	protected Button editParameters;
	private EList parametersList;



	/**
	 * For {@link ISection} use only.
	 */
	public WeibullComputationFunctionPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public WeibullComputationFunctionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence weibullComputationFunctionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = weibullComputationFunctionStep.addStep(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.class);
		propertiesStep.addStep(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType);
		propertiesStep.addStep(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters);
		
		
		composer = new PartComposer(weibullComputationFunctionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType) {
					return createFunctionTypeText(widgetFactory, parent);
				}
				if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters) {
					return createParametersMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunctionPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createFunctionTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunctionPropertiesEditionPart_FunctionTypeLabel);
		functionType = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		functionType.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData functionTypeData = new GridData(GridData.FILL_HORIZONTAL);
		functionType.setLayoutData(functionTypeData);
		functionType.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							WeibullComputationFunctionPropertiesEditionPartForm.this,
							RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionType.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									WeibullComputationFunctionPropertiesEditionPartForm.this,
									RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, functionType.getText()));
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
									WeibullComputationFunctionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		functionType.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeibullComputationFunctionPropertiesEditionPartForm.this, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionType.getText()));
				}
			}
		});
		EditingUtils.setID(functionType, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType);
		EditingUtils.setEEFtype(functionType, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, RtpComputationAndAnalysisFunctionsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createParametersMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		parameters = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData parametersData = new GridData(GridData.FILL_HORIZONTAL);
		parametersData.horizontalSpan = 2;
		parameters.setLayoutData(parametersData);
		EditingUtils.setID(parameters, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters);
		EditingUtils.setEEFtype(parameters, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editParameters = widgetFactory.createButton(parent, getDescription(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters, RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunctionPropertiesEditionPart_ParametersLabel), SWT.NONE);
		GridData editParametersData = new GridData();
		editParameters.setLayoutData(editParametersData);
		editParameters.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						parameters.getShell(), "WeibullComputationFunction", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						parametersList, RtpComputationAndAnalysisFunctionsPackage.eINSTANCE.getWeibullComputationFunction_Parameters().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					parametersList = dialog.getResult();
					if (parametersList == null) {
						parametersList = new BasicEList();
					}
					parameters.setText(parametersList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeibullComputationFunctionPropertiesEditionPartForm.this, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(parametersList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editParameters, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters);
		EditingUtils.setEEFtype(editParameters, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.WeibullComputationFunctionPropertiesEditionPart#getFunctionType()
	 * 
	 */
	public String getFunctionType() {
		return functionType.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.WeibullComputationFunctionPropertiesEditionPart#setFunctionType(String newValue)
	 * 
	 */
	public void setFunctionType(String newValue) {
		if (newValue != null) {
			functionType.setText(newValue);
		} else {
			functionType.setText(""); //$NON-NLS-1$
		}
		functionType.setEnabled(false);
		functionType.setToolTipText(RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunction_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.WeibullComputationFunctionPropertiesEditionPart#getParameters()
	 * 
	 */
	public EList getParameters() {
		return parametersList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.WeibullComputationFunctionPropertiesEditionPart#setParameters(EList newValue)
	 * 
	 */
	public void setParameters(EList newValue) {
		parametersList = newValue;
		if (newValue != null) {
			parameters.setText(parametersList.toString());
		} else {
			parameters.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters);
		if (readOnly && parameters.isEnabled()) {
			parameters.setEnabled(false);
			parameters.setToolTipText(RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunction_ReadOnly);
		} else if (!readOnly && !parameters.isEnabled()) {
			parameters.setEnabled(true);
		}	
		
	}

	public void addToParameters(Object newValue) {
		parametersList.add(newValue);
		if (newValue != null) {
			parameters.setText(parametersList.toString());
		} else {
			parameters.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToParameters(Object newValue) {
		parametersList.remove(newValue);
		if (newValue != null) {
			parameters.setText(parametersList.toString());
		} else {
			parameters.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunction_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
