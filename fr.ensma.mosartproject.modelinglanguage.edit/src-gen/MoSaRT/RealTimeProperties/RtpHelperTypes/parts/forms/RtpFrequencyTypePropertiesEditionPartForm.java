/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class RtpFrequencyTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpFrequencyTypePropertiesEditionPart {

	protected EMFComboViewer unit;
	protected SingleCompositionEditor value;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpFrequencyTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpFrequencyTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence rtpFrequencyTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpFrequencyTypeStep.addStep(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.class);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit);
		propertiesStep.addStep(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value);
		
		
		composer = new PartComposer(rtpFrequencyTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit) {
					return createUnitEMFComboViewer(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value) {
					return createValueSingleCompositionEditor(parent, widgetFactory);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(RtpHelperTypesMessages.RtpFrequencyTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createUnitEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit, RtpHelperTypesMessages.RtpFrequencyTypePropertiesEditionPart_UnitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFrequencyTypePropertiesEditionPartForm.this, RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getUnit()));
			}

		});
		unit.setID(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createValueSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value, RtpHelperTypesMessages.RtpFrequencyTypePropertiesEditionPart_ValueLabel);
		//create widget
		value = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFrequencyTypePropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				value.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpFrequencyTypePropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				value.refresh();
			}
		});
		value.setID(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart#getUnit()
	 * 
	 */
	public Enumerator getUnit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) unit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart#initUnit(Object input, Enumerator current)
	 */
	public void initUnit(Object input, Enumerator current) {
		unit.setInput(input);
		unit.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit);
		if (readOnly && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(RtpHelperTypesMessages.RtpFrequencyType_ReadOnly);
		} else if (!readOnly && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart#setUnit(Enumerator newValue)
	 * 
	 */
	public void setUnit(Enumerator newValue) {
		unit.modelUpdating(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.unit);
		if (readOnly && unit.isEnabled()) {
			unit.setEnabled(false);
			unit.setToolTipText(RtpHelperTypesMessages.RtpFrequencyType_ReadOnly);
		} else if (!readOnly && !unit.isEnabled()) {
			unit.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart#getValue()
	 * 
	 */
	public EObject getValue() {
		return (EObject) value.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart#initValue(EObjectFlatComboSettings)
	 */
	public void initValue(EObjectFlatComboSettings settings) {
		value.setAdapterFactory(adapterFactory);
		value.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpHelperTypesMessages.RtpFrequencyType_ReadOnly);
		} else if (!readOnly && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpFrequencyTypePropertiesEditionPart#setValue(EObject newValue)
	 * 
	 */
	public void setValue(EObject newValue) {
		value.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpFrequencyType.Properties.value);
		if (readOnly && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(RtpHelperTypesMessages.RtpFrequencyType_ReadOnly);
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
		return RtpHelperTypesMessages.RtpFrequencyType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
