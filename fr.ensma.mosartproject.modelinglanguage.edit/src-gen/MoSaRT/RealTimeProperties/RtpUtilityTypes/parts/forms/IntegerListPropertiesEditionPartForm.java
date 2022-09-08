/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerListPropertiesEditionPart;
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
public class IntegerListPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IntegerListPropertiesEditionPart {

	protected Text listElements;
	protected Button editListElements;
	private EList listElementsList;



	/**
	 * For {@link ISection} use only.
	 */
	public IntegerListPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerListPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerListStep = new BindingCompositionSequence(propertiesEditionComponent);
		integerListStep
			.addStep(RtpUtilityTypesViewsRepository.IntegerList.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements);
		
		
		composer = new PartComposer(integerListStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.IntegerList.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements) {
					return createListElementsMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.IntegerListPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createListElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		listElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData listElementsData = new GridData(GridData.FILL_HORIZONTAL);
		listElementsData.horizontalSpan = 2;
		listElements.setLayoutData(listElementsData);
		EditingUtils.setID(listElements, RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements);
		EditingUtils.setEEFtype(listElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editListElements = widgetFactory.createButton(parent, getDescription(RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements, RtpUtilityTypesMessages.IntegerListPropertiesEditionPart_ListElementsLabel), SWT.NONE);
		GridData editListElementsData = new GridData();
		editListElements.setLayoutData(editListElementsData);
		editListElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						listElements.getShell(), "IntegerList", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						listElementsList, RtpUtilityTypesPackage.eINSTANCE.getIntegerList_ListElements().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					listElementsList = dialog.getResult();
					if (listElementsList == null) {
						listElementsList = new BasicEList();
					}
					listElements.setText(listElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerListPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(listElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editListElements, RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements);
		EditingUtils.setEEFtype(editListElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerListPropertiesEditionPart#getListElements()
	 * 
	 */
	public EList getListElements() {
		return listElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerListPropertiesEditionPart#setListElements(EList newValue)
	 * 
	 */
	public void setListElements(EList newValue) {
		listElementsList = newValue;
		if (newValue != null) {
			listElements.setText(listElementsList.toString());
		} else {
			listElements.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerList.Properties.listElements);
		if (readOnly && listElements.isEnabled()) {
			listElements.setEnabled(false);
			listElements.setToolTipText(RtpUtilityTypesMessages.IntegerList_ReadOnly);
		} else if (!readOnly && !listElements.isEnabled()) {
			listElements.setEnabled(true);
		}	
		
	}

	public void addToListElements(Object newValue) {
		listElementsList.add(newValue);
		if (newValue != null) {
			listElements.setText(listElementsList.toString());
		} else {
			listElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToListElements(Object newValue) {
		listElementsList.remove(newValue);
		if (newValue != null) {
			listElements.setText(listElementsList.toString());
		} else {
			listElements.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.IntegerList_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
