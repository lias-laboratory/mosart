/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerVectorPropertiesEditionPart;
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
public class IntegerVectorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IntegerVectorPropertiesEditionPart {

	protected Text vectorElements;
	protected Button editVectorElements;
	private EList vectorElementsList;



	/**
	 * For {@link ISection} use only.
	 */
	public IntegerVectorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerVectorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerVectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		integerVectorStep
			.addStep(RtpUtilityTypesViewsRepository.IntegerVector.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements);
		
		
		composer = new PartComposer(integerVectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.IntegerVector.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements) {
					return createVectorElementsMultiValuedEditor(widgetFactory, parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.IntegerVectorPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createVectorElementsMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		vectorElements = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData vectorElementsData = new GridData(GridData.FILL_HORIZONTAL);
		vectorElementsData.horizontalSpan = 2;
		vectorElements.setLayoutData(vectorElementsData);
		EditingUtils.setID(vectorElements, RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements);
		EditingUtils.setEEFtype(vectorElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editVectorElements = widgetFactory.createButton(parent, getDescription(RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements, RtpUtilityTypesMessages.IntegerVectorPropertiesEditionPart_VectorElementsLabel), SWT.NONE);
		GridData editVectorElementsData = new GridData();
		editVectorElements.setLayoutData(editVectorElementsData);
		editVectorElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						vectorElements.getShell(), "IntegerVector", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						vectorElementsList, RtpUtilityTypesPackage.eINSTANCE.getIntegerVector_VectorElements().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					vectorElementsList = dialog.getResult();
					if (vectorElementsList == null) {
						vectorElementsList = new BasicEList();
					}
					vectorElements.setText(vectorElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerVectorPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(vectorElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editVectorElements, RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements);
		EditingUtils.setEEFtype(editVectorElements, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerVectorPropertiesEditionPart#getVectorElements()
	 * 
	 */
	public EList getVectorElements() {
		return vectorElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerVectorPropertiesEditionPart#setVectorElements(EList newValue)
	 * 
	 */
	public void setVectorElements(EList newValue) {
		vectorElementsList = newValue;
		if (newValue != null) {
			vectorElements.setText(vectorElementsList.toString());
		} else {
			vectorElements.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements);
		if (readOnly && vectorElements.isEnabled()) {
			vectorElements.setEnabled(false);
			vectorElements.setToolTipText(RtpUtilityTypesMessages.IntegerVector_ReadOnly);
		} else if (!readOnly && !vectorElements.isEnabled()) {
			vectorElements.setEnabled(true);
		}	
		
	}

	public void addToVectorElements(Object newValue) {
		vectorElementsList.add(newValue);
		if (newValue != null) {
			vectorElements.setText(vectorElementsList.toString());
		} else {
			vectorElements.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToVectorElements(Object newValue) {
		vectorElementsList.remove(newValue);
		if (newValue != null) {
			vectorElements.setText(vectorElementsList.toString());
		} else {
			vectorElements.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.IntegerVector_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
