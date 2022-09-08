/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

import org.eclipse.emf.ecore.EObject;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart {

	protected Text unknownValueName;
	private SingleCompositionEditor functionToBeRequested;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeValueToBeCalculatedStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpExecutionTimeValueToBeCalculatedStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested);
		
		
		composer = new PartComposer(rtpExecutionTimeValueToBeCalculatedStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName) {
					return createUnknownValueNameText(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested) {
					return createFunctionToBeRequestedSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createUnknownValueNameText(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart_UnknownValueNameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unknownValueName.getText()));
				}
			}

		});
		EditingUtils.setID(unknownValueName, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName);
		EditingUtils.setEEFtype(unknownValueName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.unknownValueName, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFunctionToBeRequestedSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, RtpHelperTypesMessages.RtpExecutionTimeValueToBeCalculatedPropertiesEditionPart_FunctionToBeRequestedLabel);
		//create widget
		functionToBeRequested = new SingleCompositionEditor(parent, SWT.NONE);
		GridData functionToBeRequestedData = new GridData(GridData.FILL_HORIZONTAL);
		functionToBeRequested.setLayoutData(functionToBeRequestedData);
		functionToBeRequested.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				functionToBeRequested.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeValueToBeCalculatedPropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				functionToBeRequested.refresh();
			}
		});
		functionToBeRequested.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeValueToBeCalculated.Properties.functionToBeRequested, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
