/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpDeadlineTypePropertiesEditionPart;
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
public class RtpDeadlineTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpDeadlineTypePropertiesEditionPart {

	private SingleCompositionEditor deadline;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpDeadlineTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpDeadlineTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpDeadlineTypeStep
			.addStep(RtpTypesViewsRepository.RtpDeadlineType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline);
		
		
		composer = new PartComposer(rtpDeadlineTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpDeadlineType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline) {
					return createDeadlineSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpDeadlineTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createDeadlineSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline, RtpTypesMessages.RtpDeadlineTypePropertiesEditionPart_DeadlineLabel);
		//create widget
		deadline = new SingleCompositionEditor(parent, SWT.NONE);
		GridData deadlineData = new GridData(GridData.FILL_HORIZONTAL);
		deadline.setLayoutData(deadlineData);
		deadline.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpDeadlineTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				deadline.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpDeadlineTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				deadline.refresh();
			}
		});
		deadline.setID(RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpDeadlineTypePropertiesEditionPart#getDeadline()
	 * 
	 */
	public EObject getDeadline() {
		return (EObject) deadline.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpDeadlineTypePropertiesEditionPart#initDeadline(EObjectFlatComboSettings)
	 */
	public void initDeadline(EObjectFlatComboSettings settings) {
		deadline.setAdapterFactory(adapterFactory);
		deadline.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline);
		if (readOnly && deadline.isEnabled()) {
			deadline.setEnabled(false);
			deadline.setToolTipText(RtpTypesMessages.RtpDeadlineType_ReadOnly);
		} else if (!readOnly && !deadline.isEnabled()) {
			deadline.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpDeadlineTypePropertiesEditionPart#setDeadline(EObject newValue)
	 * 
	 */
	public void setDeadline(EObject newValue) {
		deadline.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpDeadlineType.Properties.deadline);
		if (readOnly && deadline.isEnabled()) {
			deadline.setEnabled(false);
			deadline.setToolTipText(RtpTypesMessages.RtpDeadlineType_ReadOnly);
		} else if (!readOnly && !deadline.isEnabled()) {
			deadline.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpDeadlineType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
