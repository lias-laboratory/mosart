/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeIntervalPropertiesEditionPart;
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
public class RtpExecutionTimeIntervalPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpExecutionTimeIntervalPropertiesEditionPart {

	private SingleCompositionEditor interval;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeIntervalPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeIntervalStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpExecutionTimeIntervalStep
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.class)
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval);
		
		
		composer = new PartComposer(rtpExecutionTimeIntervalStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval) {
					return createIntervalSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpHelperTypesMessages.RtpExecutionTimeIntervalPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createIntervalSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval, RtpHelperTypesMessages.RtpExecutionTimeIntervalPropertiesEditionPart_IntervalLabel);
		//create widget
		interval = new SingleCompositionEditor(parent, SWT.NONE);
		GridData intervalData = new GridData(GridData.FILL_HORIZONTAL);
		interval.setLayoutData(intervalData);
		interval.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeIntervalPropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				interval.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeIntervalPropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				interval.refresh();
			}
		});
		interval.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeIntervalPropertiesEditionPart#getInterval()
	 * 
	 */
	public EObject getInterval() {
		return (EObject) interval.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeIntervalPropertiesEditionPart#initInterval(EObjectFlatComboSettings)
	 */
	public void initInterval(EObjectFlatComboSettings settings) {
		interval.setAdapterFactory(adapterFactory);
		interval.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval);
		if (readOnly && interval.isEnabled()) {
			interval.setEnabled(false);
			interval.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeInterval_ReadOnly);
		} else if (!readOnly && !interval.isEnabled()) {
			interval.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeIntervalPropertiesEditionPart#setInterval(EObject newValue)
	 * 
	 */
	public void setInterval(EObject newValue) {
		interval.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeInterval.Properties.interval);
		if (readOnly && interval.isEnabled()) {
			interval.setEnabled(false);
			interval.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeInterval_ReadOnly);
		} else if (!readOnly && !interval.isEnabled()) {
			interval.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpExecutionTimeInterval_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
