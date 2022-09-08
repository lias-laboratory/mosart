/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart;
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
public class RtpPeriodicTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpPeriodicTypePropertiesEditionPart {

	private SingleCompositionEditor period;
	private SingleCompositionEditor jitter;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpPeriodicTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpPeriodicTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpPeriodicTypeStep.addStep(RtpTypesViewsRepository.RtpPeriodicType.Properties.class);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		
		
		composer = new PartComposer(rtpPeriodicTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpPeriodicType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpPeriodicType.Properties.period) {
					return createPeriodSingleCompositionEditor(parent);
				}
				if (key == RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter) {
					return createJitterSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpPeriodicTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createPeriodSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpPeriodicType.Properties.period, RtpTypesMessages.RtpPeriodicTypePropertiesEditionPart_PeriodLabel);
		//create widget
		period = new SingleCompositionEditor(parent, SWT.NONE);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				period.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				period.refresh();
			}
		});
		period.setID(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPeriodicType.Properties.period, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createJitterSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, RtpTypesMessages.RtpPeriodicTypePropertiesEditionPart_JitterLabel);
		//create widget
		jitter = new SingleCompositionEditor(parent, SWT.NONE);
		GridData jitterData = new GridData(GridData.FILL_HORIZONTAL);
		jitter.setLayoutData(jitterData);
		jitter.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				jitter.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPeriodicTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				jitter.refresh();
			}
		});
		jitter.setID(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#getPeriod()
	 * 
	 */
	public EObject getPeriod() {
		return (EObject) period.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#initPeriod(EObjectFlatComboSettings)
	 */
	public void initPeriod(EObjectFlatComboSettings settings) {
		period.setAdapterFactory(adapterFactory);
		period.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		if (readOnly && period.isEnabled()) {
			period.setEnabled(false);
			period.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !period.isEnabled()) {
			period.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#setPeriod(EObject newValue)
	 * 
	 */
	public void setPeriod(EObject newValue) {
		period.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.period);
		if (readOnly && period.isEnabled()) {
			period.setEnabled(false);
			period.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !period.isEnabled()) {
			period.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#getJitter()
	 * 
	 */
	public EObject getJitter() {
		return (EObject) jitter.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#initJitter(EObjectFlatComboSettings)
	 */
	public void initJitter(EObjectFlatComboSettings settings) {
		jitter.setAdapterFactory(adapterFactory);
		jitter.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		if (readOnly && jitter.isEnabled()) {
			jitter.setEnabled(false);
			jitter.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !jitter.isEnabled()) {
			jitter.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPeriodicTypePropertiesEditionPart#setJitter(EObject newValue)
	 * 
	 */
	public void setJitter(EObject newValue) {
		jitter.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPeriodicType.Properties.jitter);
		if (readOnly && jitter.isEnabled()) {
			jitter.setEnabled(false);
			jitter.setToolTipText(RtpTypesMessages.RtpPeriodicType_ReadOnly);
		} else if (!readOnly && !jitter.isEnabled()) {
			jitter.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpPeriodicType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
