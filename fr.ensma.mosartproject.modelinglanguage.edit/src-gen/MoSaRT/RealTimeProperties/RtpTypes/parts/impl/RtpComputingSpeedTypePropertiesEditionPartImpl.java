/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpComputingSpeedTypePropertiesEditionPart;
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
public class RtpComputingSpeedTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpComputingSpeedTypePropertiesEditionPart {

	private SingleCompositionEditor computingSpeed;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpComputingSpeedTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpComputingSpeedTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpComputingSpeedTypeStep
			.addStep(RtpTypesViewsRepository.RtpComputingSpeedType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed);
		
		
		composer = new PartComposer(rtpComputingSpeedTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpComputingSpeedType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed) {
					return createComputingSpeedSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpComputingSpeedTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createComputingSpeedSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed, RtpTypesMessages.RtpComputingSpeedTypePropertiesEditionPart_ComputingSpeedLabel);
		//create widget
		computingSpeed = new SingleCompositionEditor(parent, SWT.NONE);
		GridData computingSpeedData = new GridData(GridData.FILL_HORIZONTAL);
		computingSpeed.setLayoutData(computingSpeedData);
		computingSpeed.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpComputingSpeedTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				computingSpeed.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpComputingSpeedTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				computingSpeed.refresh();
			}
		});
		computingSpeed.setID(RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpComputingSpeedTypePropertiesEditionPart#getComputingSpeed()
	 * 
	 */
	public EObject getComputingSpeed() {
		return (EObject) computingSpeed.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpComputingSpeedTypePropertiesEditionPart#initComputingSpeed(EObjectFlatComboSettings)
	 */
	public void initComputingSpeed(EObjectFlatComboSettings settings) {
		computingSpeed.setAdapterFactory(adapterFactory);
		computingSpeed.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed);
		if (readOnly && computingSpeed.isEnabled()) {
			computingSpeed.setEnabled(false);
			computingSpeed.setToolTipText(RtpTypesMessages.RtpComputingSpeedType_ReadOnly);
		} else if (!readOnly && !computingSpeed.isEnabled()) {
			computingSpeed.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpComputingSpeedTypePropertiesEditionPart#setComputingSpeed(EObject newValue)
	 * 
	 */
	public void setComputingSpeed(EObject newValue) {
		computingSpeed.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpComputingSpeedType.Properties.computingSpeed);
		if (readOnly && computingSpeed.isEnabled()) {
			computingSpeed.setEnabled(false);
			computingSpeed.setToolTipText(RtpTypesMessages.RtpComputingSpeedType_ReadOnly);
		} else if (!readOnly && !computingSpeed.isEnabled()) {
			computingSpeed.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpComputingSpeedType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
