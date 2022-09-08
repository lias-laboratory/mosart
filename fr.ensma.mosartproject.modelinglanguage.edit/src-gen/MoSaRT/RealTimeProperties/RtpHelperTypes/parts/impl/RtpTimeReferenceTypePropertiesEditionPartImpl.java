/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeReferenceTypePropertiesEditionPart;

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
public class RtpTimeReferenceTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpTimeReferenceTypePropertiesEditionPart {

	private SingleCompositionEditor timeLink;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpTimeReferenceTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpTimeReferenceTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpTimeReferenceTypeStep
			.addStep(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.class)
			.addStep(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink);
		
		
		composer = new PartComposer(rtpTimeReferenceTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink) {
					return createTimeLinkSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpHelperTypesMessages.RtpTimeReferenceTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createTimeLinkSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, RtpHelperTypesMessages.RtpTimeReferenceTypePropertiesEditionPart_TimeLinkLabel);
		//create widget
		timeLink = new SingleCompositionEditor(parent, SWT.NONE);
		GridData timeLinkData = new GridData(GridData.FILL_HORIZONTAL);
		timeLink.setLayoutData(timeLinkData);
		timeLink.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeReferenceTypePropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				timeLink.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeReferenceTypePropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				timeLink.refresh();
			}
		});
		timeLink.setID(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeReferenceTypePropertiesEditionPart#getTimeLink()
	 * 
	 */
	public EObject getTimeLink() {
		return (EObject) timeLink.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeReferenceTypePropertiesEditionPart#initTimeLink(EObjectFlatComboSettings)
	 */
	public void initTimeLink(EObjectFlatComboSettings settings) {
		timeLink.setAdapterFactory(adapterFactory);
		timeLink.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink);
		if (readOnly && timeLink.isEnabled()) {
			timeLink.setEnabled(false);
			timeLink.setToolTipText(RtpHelperTypesMessages.RtpTimeReferenceType_ReadOnly);
		} else if (!readOnly && !timeLink.isEnabled()) {
			timeLink.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeReferenceTypePropertiesEditionPart#setTimeLink(EObject newValue)
	 * 
	 */
	public void setTimeLink(EObject newValue) {
		timeLink.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink);
		if (readOnly && timeLink.isEnabled()) {
			timeLink.setEnabled(false);
			timeLink.setToolTipText(RtpHelperTypesMessages.RtpTimeReferenceType_ReadOnly);
		} else if (!readOnly && !timeLink.isEnabled()) {
			timeLink.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpTimeReferenceType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
