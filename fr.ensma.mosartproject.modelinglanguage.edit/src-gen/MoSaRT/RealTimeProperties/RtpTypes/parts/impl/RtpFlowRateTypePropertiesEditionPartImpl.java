/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class RtpFlowRateTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpFlowRateTypePropertiesEditionPart {

	private SingleCompositionEditor flowRate;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpFlowRateTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpFlowRateTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpFlowRateTypeStep
			.addStep(RtpTypesViewsRepository.RtpFlowRateType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		
		
		composer = new PartComposer(rtpFlowRateTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpFlowRateType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate) {
					return createFlowRateSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpFlowRateTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createFlowRateSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, RtpTypesMessages.RtpFlowRateTypePropertiesEditionPart_FlowRateLabel);
		//create widget
		flowRate = new SingleCompositionEditor(parent, SWT.NONE);
		GridData flowRateData = new GridData(GridData.FILL_HORIZONTAL);
		flowRate.setLayoutData(flowRateData);
		flowRate.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFlowRateTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				flowRate.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFlowRateTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				flowRate.refresh();
			}
		});
		flowRate.setID(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart#getFlowRate()
	 * 
	 */
	public EObject getFlowRate() {
		return (EObject) flowRate.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart#initFlowRate(EObjectFlatComboSettings)
	 */
	public void initFlowRate(EObjectFlatComboSettings settings) {
		flowRate.setAdapterFactory(adapterFactory);
		flowRate.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		if (readOnly && flowRate.isEnabled()) {
			flowRate.setEnabled(false);
			flowRate.setToolTipText(RtpTypesMessages.RtpFlowRateType_ReadOnly);
		} else if (!readOnly && !flowRate.isEnabled()) {
			flowRate.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpFlowRateTypePropertiesEditionPart#setFlowRate(EObject newValue)
	 * 
	 */
	public void setFlowRate(EObject newValue) {
		flowRate.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpFlowRateType.Properties.flowRate);
		if (readOnly && flowRate.isEnabled()) {
			flowRate.setEnabled(false);
			flowRate.setToolTipText(RtpTypesMessages.RtpFlowRateType_ReadOnly);
		} else if (!readOnly && !flowRate.isEnabled()) {
			flowRate.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpFlowRateType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
