/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeListPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpHelperTypes.providers.RtpHelperTypesMessages;

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
public class RtpExecutionTimeListPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpExecutionTimeListPropertiesEditionPart {

	protected SingleCompositionEditor vector;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpExecutionTimeListPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpExecutionTimeListPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpExecutionTimeListStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpExecutionTimeListStep
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.class)
			.addStep(RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector);
		
		
		composer = new PartComposer(rtpExecutionTimeListStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector) {
					return createVectorSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpHelperTypesMessages.RtpExecutionTimeListPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createVectorSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector, RtpHelperTypesMessages.RtpExecutionTimeListPropertiesEditionPart_VectorLabel);
		//create widget
		vector = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData vectorData = new GridData(GridData.FILL_HORIZONTAL);
		vector.setLayoutData(vectorData);
		vector.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeListPropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				vector.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpExecutionTimeListPropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				vector.refresh();
			}
		});
		vector.setID(RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeListPropertiesEditionPart#getVector()
	 * 
	 */
	public EObject getVector() {
		return (EObject) vector.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeListPropertiesEditionPart#initVector(EObjectFlatComboSettings)
	 */
	public void initVector(EObjectFlatComboSettings settings) {
		vector.setAdapterFactory(adapterFactory);
		vector.setInput(settings);
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector);
		if (readOnly && vector.isEnabled()) {
			vector.setEnabled(false);
			vector.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeList_ReadOnly);
		} else if (!readOnly && !vector.isEnabled()) {
			vector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpExecutionTimeListPropertiesEditionPart#setVector(EObject newValue)
	 * 
	 */
	public void setVector(EObject newValue) {
		vector.refresh();
		boolean readOnly = isReadOnly(RtpHelperTypesViewsRepository.RtpExecutionTimeList.Properties.vector);
		if (readOnly && vector.isEnabled()) {
			vector.setEnabled(false);
			vector.setToolTipText(RtpHelperTypesMessages.RtpExecutionTimeList_ReadOnly);
		} else if (!readOnly && !vector.isEnabled()) {
			vector.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpHelperTypesMessages.RtpExecutionTimeList_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
