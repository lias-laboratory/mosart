/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSporadicTypePropertiesEditionPart;
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
public class RtpSporadicTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpSporadicTypePropertiesEditionPart {

	private SingleCompositionEditor interArrival;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpSporadicTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpSporadicTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpSporadicTypeStep
			.addStep(RtpTypesViewsRepository.RtpSporadicType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival);
		
		
		composer = new PartComposer(rtpSporadicTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpSporadicType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival) {
					return createInterArrivalSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpSporadicTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createInterArrivalSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival, RtpTypesMessages.RtpSporadicTypePropertiesEditionPart_InterArrivalLabel);
		//create widget
		interArrival = new SingleCompositionEditor(parent, SWT.NONE);
		GridData interArrivalData = new GridData(GridData.FILL_HORIZONTAL);
		interArrival.setLayoutData(interArrivalData);
		interArrival.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpSporadicTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				interArrival.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpSporadicTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				interArrival.refresh();
			}
		});
		interArrival.setID(RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSporadicTypePropertiesEditionPart#getInterArrival()
	 * 
	 */
	public EObject getInterArrival() {
		return (EObject) interArrival.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSporadicTypePropertiesEditionPart#initInterArrival(EObjectFlatComboSettings)
	 */
	public void initInterArrival(EObjectFlatComboSettings settings) {
		interArrival.setAdapterFactory(adapterFactory);
		interArrival.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival);
		if (readOnly && interArrival.isEnabled()) {
			interArrival.setEnabled(false);
			interArrival.setToolTipText(RtpTypesMessages.RtpSporadicType_ReadOnly);
		} else if (!readOnly && !interArrival.isEnabled()) {
			interArrival.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSporadicTypePropertiesEditionPart#setInterArrival(EObject newValue)
	 * 
	 */
	public void setInterArrival(EObject newValue) {
		interArrival.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpSporadicType.Properties.interArrival);
		if (readOnly && interArrival.isEnabled()) {
			interArrival.setEnabled(false);
			interArrival.setToolTipText(RtpTypesMessages.RtpSporadicType_ReadOnly);
		} else if (!readOnly && !interArrival.isEnabled()) {
			interArrival.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpSporadicType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
