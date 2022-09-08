/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart;
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
public class RtpSelfSuspendedTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpSelfSuspendedTypePropertiesEditionPart {

	private SingleCompositionEditor selfSuspensionTime;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpSelfSuspendedTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpSelfSuspendedTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpSelfSuspendedTypeStep
			.addStep(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		
		
		composer = new PartComposer(rtpSelfSuspendedTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime) {
					return createSelfSuspensionTimeSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpSelfSuspendedTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createSelfSuspensionTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, RtpTypesMessages.RtpSelfSuspendedTypePropertiesEditionPart_SelfSuspensionTimeLabel);
		//create widget
		selfSuspensionTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData selfSuspensionTimeData = new GridData(GridData.FILL_HORIZONTAL);
		selfSuspensionTime.setLayoutData(selfSuspensionTimeData);
		selfSuspensionTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpSelfSuspendedTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				selfSuspensionTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpSelfSuspendedTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				selfSuspensionTime.refresh();
			}
		});
		selfSuspensionTime.setID(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart#getSelfSuspensionTime()
	 * 
	 */
	public EObject getSelfSuspensionTime() {
		return (EObject) selfSuspensionTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart#initSelfSuspensionTime(EObjectFlatComboSettings)
	 */
	public void initSelfSuspensionTime(EObjectFlatComboSettings settings) {
		selfSuspensionTime.setAdapterFactory(adapterFactory);
		selfSuspensionTime.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		if (readOnly && selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(false);
			selfSuspensionTime.setToolTipText(RtpTypesMessages.RtpSelfSuspendedType_ReadOnly);
		} else if (!readOnly && !selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart#setSelfSuspensionTime(EObject newValue)
	 * 
	 */
	public void setSelfSuspensionTime(EObject newValue) {
		selfSuspensionTime.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		if (readOnly && selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(false);
			selfSuspensionTime.setToolTipText(RtpTypesMessages.RtpSelfSuspendedType_ReadOnly);
		} else if (!readOnly && !selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpSelfSuspendedType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
