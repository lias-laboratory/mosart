/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

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
public class RtpSelfSuspendedTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpSelfSuspendedTypePropertiesEditionPart {

	protected SingleCompositionEditor selfSuspensionTime;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpSelfSuspendedTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpSelfSuspendedTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpSelfSuspendedTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpSelfSuspendedTypeStep
			.addStep(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		
		
		composer = new PartComposer(rtpSelfSuspendedTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime) {
					return createSelfSuspensionTimeSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpTypesMessages.RtpSelfSuspendedTypePropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSelfSuspensionTimeSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, RtpTypesMessages.RtpSelfSuspendedTypePropertiesEditionPart_SelfSuspensionTimeLabel);
		//create widget
		selfSuspensionTime = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData selfSuspensionTimeData = new GridData(GridData.FILL_HORIZONTAL);
		selfSuspensionTime.setLayoutData(selfSuspensionTimeData);
		selfSuspensionTime.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpSelfSuspendedTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				selfSuspensionTime.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpSelfSuspendedTypePropertiesEditionPartForm.this,  RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				selfSuspensionTime.refresh();
			}
		});
		selfSuspensionTime.setID(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime, RtpTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart#getSelfSuspensionTime()
	 * 
	 */
	public EObject getSelfSuspensionTime() {
		return (EObject) selfSuspensionTime.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart#initSelfSuspensionTime(EObjectFlatComboSettings)
	 */
	public void initSelfSuspensionTime(EObjectFlatComboSettings settings) {
		selfSuspensionTime.setAdapterFactory(adapterFactory);
		selfSuspensionTime.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		if (readOnly && selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(false);
			selfSuspensionTime.setToolTipText(RtpTypesMessages.RtpSelfSuspendedType_ReadOnly);
		} else if (!readOnly && !selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpSelfSuspendedTypePropertiesEditionPart#setSelfSuspensionTime(EObject newValue)
	 * 
	 */
	public void setSelfSuspensionTime(EObject newValue) {
		selfSuspensionTime.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpSelfSuspendedType.Properties.selfSuspensionTime);
		if (readOnly && selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(false);
			selfSuspensionTime.setToolTipText(RtpTypesMessages.RtpSelfSuspendedType_ReadOnly);
		} else if (!readOnly && !selfSuspensionTime.isEnabled()) {
			selfSuspensionTime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpSelfSuspendedType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
