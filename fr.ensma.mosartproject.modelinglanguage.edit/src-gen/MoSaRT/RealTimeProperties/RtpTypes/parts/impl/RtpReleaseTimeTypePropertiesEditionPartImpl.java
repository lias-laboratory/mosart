/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

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
public class RtpReleaseTimeTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpReleaseTimeTypePropertiesEditionPart {

	private SingleCompositionEditor releaseTime;
	private SingleCompositionEditor referring;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpReleaseTimeTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpReleaseTimeTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpReleaseTimeTypeStep.addStep(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.class);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring);
		
		
		composer = new PartComposer(rtpReleaseTimeTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpReleaseTimeType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime) {
					return createReleaseTimeSingleCompositionEditor(parent);
				}
				if (key == RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring) {
					return createReferringSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpReleaseTimeTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createReleaseTimeSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime, RtpTypesMessages.RtpReleaseTimeTypePropertiesEditionPart_ReleaseTimeLabel);
		//create widget
		releaseTime = new SingleCompositionEditor(parent, SWT.NONE);
		GridData releaseTimeData = new GridData(GridData.FILL_HORIZONTAL);
		releaseTime.setLayoutData(releaseTimeData);
		releaseTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpReleaseTimeTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				releaseTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpReleaseTimeTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				releaseTime.refresh();
			}
		});
		releaseTime.setID(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createReferringSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring, RtpTypesMessages.RtpReleaseTimeTypePropertiesEditionPart_ReferringLabel);
		//create widget
		referring = new SingleCompositionEditor(parent, SWT.NONE);
		GridData referringData = new GridData(GridData.FILL_HORIZONTAL);
		referring.setLayoutData(referringData);
		referring.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpReleaseTimeTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				referring.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpReleaseTimeTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				referring.refresh();
			}
		});
		referring.setID(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart#getReleaseTime()
	 * 
	 */
	public EObject getReleaseTime() {
		return (EObject) releaseTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart#initReleaseTime(EObjectFlatComboSettings)
	 */
	public void initReleaseTime(EObjectFlatComboSettings settings) {
		releaseTime.setAdapterFactory(adapterFactory);
		releaseTime.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime);
		if (readOnly && releaseTime.isEnabled()) {
			releaseTime.setEnabled(false);
			releaseTime.setToolTipText(RtpTypesMessages.RtpReleaseTimeType_ReadOnly);
		} else if (!readOnly && !releaseTime.isEnabled()) {
			releaseTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart#setReleaseTime(EObject newValue)
	 * 
	 */
	public void setReleaseTime(EObject newValue) {
		releaseTime.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.releaseTime);
		if (readOnly && releaseTime.isEnabled()) {
			releaseTime.setEnabled(false);
			releaseTime.setToolTipText(RtpTypesMessages.RtpReleaseTimeType_ReadOnly);
		} else if (!readOnly && !releaseTime.isEnabled()) {
			releaseTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart#getReferring()
	 * 
	 */
	public EObject getReferring() {
		return (EObject) referring.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart#initReferring(EObjectFlatComboSettings)
	 */
	public void initReferring(EObjectFlatComboSettings settings) {
		referring.setAdapterFactory(adapterFactory);
		referring.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring);
		if (readOnly && referring.isEnabled()) {
			referring.setEnabled(false);
			referring.setToolTipText(RtpTypesMessages.RtpReleaseTimeType_ReadOnly);
		} else if (!readOnly && !referring.isEnabled()) {
			referring.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpReleaseTimeTypePropertiesEditionPart#setReferring(EObject newValue)
	 * 
	 */
	public void setReferring(EObject newValue) {
		referring.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpReleaseTimeType.Properties.referring);
		if (readOnly && referring.isEnabled()) {
			referring.setEnabled(false);
			referring.setToolTipText(RtpTypesMessages.RtpReleaseTimeType_ReadOnly);
		} else if (!readOnly && !referring.isEnabled()) {
			referring.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpReleaseTimeType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
