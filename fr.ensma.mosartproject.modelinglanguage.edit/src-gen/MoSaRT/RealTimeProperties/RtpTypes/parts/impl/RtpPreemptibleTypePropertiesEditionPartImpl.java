/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart;
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
public class RtpPreemptibleTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpPreemptibleTypePropertiesEditionPart {

	private SingleCompositionEditor cost;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpPreemptibleTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpPreemptibleTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpPreemptibleTypeStep
			.addStep(RtpTypesViewsRepository.RtpPreemptibleType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		
		
		composer = new PartComposer(rtpPreemptibleTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpPreemptibleType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost) {
					return createCostSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpPreemptibleTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createCostSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, RtpTypesMessages.RtpPreemptibleTypePropertiesEditionPart_CostLabel);
		//create widget
		cost = new SingleCompositionEditor(parent, SWT.NONE);
		GridData costData = new GridData(GridData.FILL_HORIZONTAL);
		cost.setLayoutData(costData);
		cost.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPreemptibleTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				cost.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPreemptibleTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				cost.refresh();
			}
		});
		cost.setID(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart#getCost()
	 * 
	 */
	public EObject getCost() {
		return (EObject) cost.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart#initCost(EObjectFlatComboSettings)
	 */
	public void initCost(EObjectFlatComboSettings settings) {
		cost.setAdapterFactory(adapterFactory);
		cost.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		if (readOnly && cost.isEnabled()) {
			cost.setEnabled(false);
			cost.setToolTipText(RtpTypesMessages.RtpPreemptibleType_ReadOnly);
		} else if (!readOnly && !cost.isEnabled()) {
			cost.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPreemptibleTypePropertiesEditionPart#setCost(EObject newValue)
	 * 
	 */
	public void setCost(EObject newValue) {
		cost.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPreemptibleType.Properties.cost);
		if (readOnly && cost.isEnabled()) {
			cost.setEnabled(false);
			cost.setToolTipText(RtpTypesMessages.RtpPreemptibleType_ReadOnly);
		} else if (!readOnly && !cost.isEnabled()) {
			cost.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpPreemptibleType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
