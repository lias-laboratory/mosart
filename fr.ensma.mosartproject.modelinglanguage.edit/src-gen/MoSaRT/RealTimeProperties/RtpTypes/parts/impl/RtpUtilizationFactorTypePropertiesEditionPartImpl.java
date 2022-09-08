/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart;

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
public class RtpUtilizationFactorTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpUtilizationFactorTypePropertiesEditionPart {

	private SingleCompositionEditor u;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpUtilizationFactorTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpUtilizationFactorTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpUtilizationFactorTypeStep
			.addStep(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		
		
		composer = new PartComposer(rtpUtilizationFactorTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u) {
					return createUSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpUtilizationFactorTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createUSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, RtpTypesMessages.RtpUtilizationFactorTypePropertiesEditionPart_ULabel);
		//create widget
		u = new SingleCompositionEditor(parent, SWT.NONE);
		GridData uData = new GridData(GridData.FILL_HORIZONTAL);
		u.setLayoutData(uData);
		u.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpUtilizationFactorTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				u.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpUtilizationFactorTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				u.refresh();
			}
		});
		u.setID(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart#getU()
	 * 
	 */
	public EObject getU() {
		return (EObject) u.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart#initU(EObjectFlatComboSettings)
	 */
	public void initU(EObjectFlatComboSettings settings) {
		u.setAdapterFactory(adapterFactory);
		u.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		if (readOnly && u.isEnabled()) {
			u.setEnabled(false);
			u.setToolTipText(RtpTypesMessages.RtpUtilizationFactorType_ReadOnly);
		} else if (!readOnly && !u.isEnabled()) {
			u.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpUtilizationFactorTypePropertiesEditionPart#setU(EObject newValue)
	 * 
	 */
	public void setU(EObject newValue) {
		u.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpUtilizationFactorType.Properties.u);
		if (readOnly && u.isEnabled()) {
			u.setEnabled(false);
			u.setToolTipText(RtpTypesMessages.RtpUtilizationFactorType_ReadOnly);
		} else if (!readOnly && !u.isEnabled()) {
			u.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpUtilizationFactorType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
