/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpHelperTypesViewsRepository;
import MoSaRT.RealTimeProperties.RtpHelperTypes.parts.RtpTimeReferenceTypePropertiesEditionPart;

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
public class RtpTimeReferenceTypePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RtpTimeReferenceTypePropertiesEditionPart {

	protected SingleCompositionEditor timeLink;



	/**
	 * For {@link ISection} use only.
	 */
	public RtpTimeReferenceTypePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpTimeReferenceTypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpTimeReferenceTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpTimeReferenceTypeStep
			.addStep(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.class)
			.addStep(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink);
		
		
		composer = new PartComposer(rtpTimeReferenceTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink) {
					return createTimeLinkSingleCompositionEditor(parent, widgetFactory);
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
		propertiesSection.setText(RtpHelperTypesMessages.RtpTimeReferenceTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createTimeLinkSingleCompositionEditor(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, RtpHelperTypesMessages.RtpTimeReferenceTypePropertiesEditionPart_TimeLinkLabel);
		//create widget
		timeLink = new SingleCompositionEditor(widgetFactory, parent, SWT.NONE);
		GridData timeLinkData = new GridData(GridData.FILL_HORIZONTAL);
		timeLink.setLayoutData(timeLinkData);
		timeLink.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeReferenceTypePropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				timeLink.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpTimeReferenceTypePropertiesEditionPartForm.this,  RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				timeLink.refresh();
			}
		});
		timeLink.setID(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(RtpHelperTypesViewsRepository.RtpTimeReferenceType.Properties.timeLink, RtpHelperTypesViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
