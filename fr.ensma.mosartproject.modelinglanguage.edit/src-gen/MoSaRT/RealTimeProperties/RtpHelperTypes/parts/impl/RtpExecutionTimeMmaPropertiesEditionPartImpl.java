/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart;
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
public class RtpExecutionTimeMmaPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpExecutionTimeMmaPropertiesEditionPart {

	private SingleCompositionEditor minMaxAvg;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeMmaPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeMmaStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpExecutionTimeMmaStep
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.class)
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		
		
		composer = new PartComposer(rtpExecutionTimeMmaStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg) {
					return createMinMaxAvgSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpHelperTypesMessages.RtpExecutionTimeMmaPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createMinMaxAvgSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, RtpHelperTypesMessages.RtpExecutionTimeMmaPropertiesEditionPart_MinMaxAvgLabel);
		//create widget
		minMaxAvg = new SingleCompositionEditor(parent, SWT.NONE);
		GridData minMaxAvgData = new GridData(GridData.FILL_HORIZONTAL);
		minMaxAvg.setLayoutData(minMaxAvgData);
		minMaxAvg.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeMmaPropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				minMaxAvg.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeMmaPropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				minMaxAvg.refresh();
			}
		});
		minMaxAvg.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart#getMinMaxAvg()
	 * 
	 */
	public EObject getMinMaxAvg() {
		return (EObject) minMaxAvg.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart#initMinMaxAvg(EObjectFlatComboSettings)
	 */
	public void initMinMaxAvg(EObjectFlatComboSettings settings) {
		minMaxAvg.setAdapterFactory(adapterFactory);
		minMaxAvg.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		if (readOnly && minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(false);
			minMaxAvg.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeMma_ReadOnly);
		} else if (!readOnly && !minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeMmaPropertiesEditionPart#setMinMaxAvg(EObject newValue)
	 * 
	 */
	public void setMinMaxAvg(EObject newValue) {
		minMaxAvg.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeMma.Properties.minMaxAvg);
		if (readOnly && minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(false);
			minMaxAvg.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeMma_ReadOnly);
		} else if (!readOnly && !minMaxAvg.isEnabled()) {
			minMaxAvg.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpExecutionTimeMma_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
