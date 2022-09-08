/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts.impl;

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
public class WeibullComputationFunctionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, WeibullComputationFunctionPropertiesEditionPart {

	protected Text functionType;
	protected Text parameters;
	protected Button editParameters;
	private EList parametersList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public WeibullComputationFunctionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence weibullComputationFunctionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = weibullComputationFunctionStep.addStep(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.class);
		propertiesStep.addStep(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType);
		propertiesStep.addStep(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters);
		
		
		composer = new PartComposer(weibullComputationFunctionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType) {
					return createFunctionTypeText(parent);
				}
				if (key == RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters) {
					return createParametersMultiValuedEditor(parent);
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
		propertiesGroup.setText(RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunctionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createFunctionTypeText(Composite parent) {
		createDescription(parent, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunctionPropertiesEditionPart_FunctionTypeLabel);
		functionType = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData functionTypeData = new GridData(GridData.FILL_HORIZONTAL);
		functionType.setLayoutData(functionTypeData);
		functionType.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeibullComputationFunctionPropertiesEditionPartImpl.this, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionType.getText()));
			}

		});
		functionType.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeibullComputationFunctionPropertiesEditionPartImpl.this, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionType.getText()));
				}
			}

		});
		EditingUtils.setID(functionType, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType);
		EditingUtils.setEEFtype(functionType, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.functionType, RtpComputationAndAnalysisFunctionsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createParametersMultiValuedEditor(Composite parent) {
		parameters = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData parametersData = new GridData(GridData.FILL_HORIZONTAL);
		parametersData.horizontalSpan = 2;
		parameters.setLayoutData(parametersData);
		EditingUtils.setID(parameters, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters);
		EditingUtils.setEEFtype(parameters, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editParameters = new Button(parent, SWT.NONE);
		editParameters.setText(getDescription(RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters, RtpComputationAndAnalysisFunctionsMessages.WeibullComputationFunctionPropertiesEditionPart_ParametersLabel));
		GridData editParametersData = new GridData();
		editParameters.setLayoutData(editParametersData);
		editParameters.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(WeibullComputationFunctionPropertiesEditionPartImpl.this, RtpComputationAndAnalysisFunctionsViewsRepository.WeibullComputationFunction.Properties.parameters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(parametersList)));
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
