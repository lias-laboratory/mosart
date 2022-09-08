/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

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
public class RtpDurationTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpDurationTypePropertiesEditionPart {

	protected EMFComboViewer unit;
	private SingleCompositionEditor value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpDurationTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpDurationTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpDurationTypeStep.addStep(RtpHelperTypesViewsRepository.RtpDurationType.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpDurationType.Properties.value);
		
		
		composer = new PartComposer(rtpDurationTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpDurationType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit) {
					return createUnitEMFComboViewer(parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpDurationType.Properties.value) {
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
		propertiesGroup.setText(RtpHelperTypesMessages.RtpDurationTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createUnitEMFComboViewer(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit, RtpHelperTypesMessages.RtpDurationTypePropertiesEditionPart_UnitLabel);
		unit = new EMFComboViewer(parent);
		unit.setContentProvider(new ArrayContentProvider());
		unit.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData unitData = new GridData(GridData.FILL_HORIZONTAL);
		unit.getCombo().setLayoutData(unitData);
		unit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpDurationTypePropertiesEditionPartImpl.this, RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUnit()));
			}

		});
		unit.setID(RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createValueSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpDurationType.Properties.value, RtpHelperTypesMessages.RtpDurationTypePropertiesEditionPart_ValueLabel);
		//create widget
		value = new SingleCompositionEditor(parent, SWT.NONE);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpDurationTypePropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpDurationType.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				value.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpDurationTypePropertiesEditionPartImpl.this,  RtpHelperTypesViewsRepository.RtpDurationType.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				value.refresh();
			}
		});
		value.setID(RtpHelperTypesViewsRepository.RtpDurationType.Properties.value);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpDurationType.Properties.value, RtpHelperTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart#getUnit()
	 * 
	 */
	public Enumerator getUnit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) unit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart#initUnit(Object input, Enumerator current)
	 */
	public void initUnit(Object input, Enumerator current) {
		unit.setInput(input);
		unit.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit);
		if (readOnly && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(RtpHelperTypesMessages.RtpDurationType_ReadOnly);
		} else if (!readOnly && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart#setUnit(Enumerator newValue)
	 * 
	 */
	public void setUnit(Enumerator newValue) {
		unit.modelUpdating(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpDurationType.Properties.unit);
		if (readOnly && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(RtpHelperTypesMessages.RtpDurationType_ReadOnly);
		} else if (!readOnly && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart#getValue()
	 * 
	 */
	public EObject getValue() {
		return (EObject) value.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart#initValue(EObjectFlatComboSettings)
	 */
	public void initValue(EObjectFlatComboSettings settings) {
		value.setAdapterFactory(adapterFactory);
		value.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpDurationType.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpHelperTypesMessages.RtpDurationType_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpDurationTypePropertiesEditionPart#setValue(EObject newValue)
	 * 
	 */
	public void setValue(EObject newValue) {
		value.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpDurationType.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpHelperTypesMessages.RtpDurationType_ReadOnly);
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
		return RtpHelperTypesMessages.RtpDurationType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
