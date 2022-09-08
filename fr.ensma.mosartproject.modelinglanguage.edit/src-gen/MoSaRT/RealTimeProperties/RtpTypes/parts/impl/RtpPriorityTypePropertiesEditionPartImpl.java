/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPriorityTypePropertiesEditionPart;
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
public class RtpPriorityTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpPriorityTypePropertiesEditionPart {

	private SingleCompositionEditor value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpPriorityTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpPriorityTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpPriorityTypeStep
			.addStep(RtpTypesViewsRepository.RtpPriorityType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpPriorityType.Properties.value);
		
		
		composer = new PartComposer(rtpPriorityTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpPriorityType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpPriorityType.Properties.value) {
					return createValueSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpPriorityTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createValueSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpPriorityType.Properties.value, RtpTypesMessages.RtpPriorityTypePropertiesEditionPart_ValueLabel);
		//create widget
		value = new SingleCompositionEditor(parent, SWT.NONE);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPriorityTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPriorityType.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				value.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpPriorityTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpPriorityType.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				value.refresh();
			}
		});
		value.setID(RtpTypesViewsRepository.RtpPriorityType.Properties.value);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpPriorityType.Properties.value, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPriorityTypePropertiesEditionPart#getValue()
	 * 
	 */
	public EObject getValue() {
		return (EObject) value.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPriorityTypePropertiesEditionPart#initValue(EObjectFlatComboSettings)
	 */
	public void initValue(EObjectFlatComboSettings settings) {
		value.setAdapterFactory(adapterFactory);
		value.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPriorityType.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpTypesMessages.RtpPriorityType_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpPriorityTypePropertiesEditionPart#setValue(EObject newValue)
	 * 
	 */
	public void setValue(EObject newValue) {
		value.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpPriorityType.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpTypesMessages.RtpPriorityType_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpPriorityType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
