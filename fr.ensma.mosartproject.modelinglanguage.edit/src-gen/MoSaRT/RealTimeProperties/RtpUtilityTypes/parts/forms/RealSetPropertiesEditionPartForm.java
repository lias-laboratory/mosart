/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealSetPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class RealSetPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, RealSetPropertiesEditionPart {

	protected Text setElements;
	protected Button editSetElements;
	private EList setElementsList;



	/**
	 * For {@link ISection} use only.
	 */
	public RealSetPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealSetPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence realSetStep = new BindingCompositionSequence(propertiesEditionComponent);
		realSetStep
			.addStep(RtpUtilityTypesViewsRepository.RealSet.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.RealSet.Properties.setElements);
		
		
		composer = new PartComposer(realSetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.RealSet.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealSet.Properties.setElements) {
					return createSetElementsMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.RealSetPropertiesEditionPart_PropertiesGroupLabel);
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
	 * 
	 */
	protected Composite createSetElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		setElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData setElementsData = new GridData(GridData.FILL_HORIZONTAL);
		setElementsData.horizontalSpan = 2;
		setElements.setLayoutData(setElementsData);
		EditingUtils.setID(setElements, RtpUtilityTypesViewsRepository.RealSet.Properties.setElements);
		EditingUtils.setEEFtype(setElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editSetElements = widgetFactory.createButton(parent, getDescription(RtpUtilityTypesViewsRepository.RealSet.Properties.setElements, RtpUtilityTypesMessages.RealSetPropertiesEditionPart_SetElementsLabel), SWT.NONE);
		GridData editSetElementsData = new GridData();
		editSetElements.setLayoutData(editSetElementsData);
		editSetElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						setElements.getShell(), "RealSet", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						setElementsList, RtpUtilityTypesPackage.eINSTANCE.getRealSet_SetElements().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					setElementsList = dialog.getResult();
					if (setElementsList == null) {
						setElementsList = new BasicEList();
					}
					setElements.setText(setElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealSetPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.RealSet.Properties.setElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(setElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editSetElements, RtpUtilityTypesViewsRepository.RealSet.Properties.setElements);
		EditingUtils.setEEFtype(editSetElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealSetPropertiesEditionPart#getSetElements()
	 * 
	 */
	public EList getSetElements() {
		return setElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealSetPropertiesEditionPart#setSetElements(EList newValue)
	 * 
	 */
	public void setSetElements(EList newValue) {
		setElementsList = newValue;
		if (newValue != null) {
			setElements.setText(setElementsList.toString());
		} else {
			setElements.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealSet.Properties.setElements);
		if (readOnly && setElements.isEnabled()) {
			setElements.setEnabled(false);
			setElements.setToolTipText(RtpUtilityTypesMessages.RealSet_ReadOnly);
		} else if (!readOnly && !setElements.isEnabled()) {
			setElements.setEnabled(true);
		}	
		
	}

	public void addToSetElements(Object newValue) {
		setElementsList.add(newValue);
		if (newValue != null) {
			setElements.setText(setElementsList.toString());
		} else {
			setElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToSetElements(Object newValue) {
		setElementsList.remove(newValue);
		if (newValue != null) {
			setElements.setText(setElementsList.toString());
		} else {
			setElements.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.RealSet_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
