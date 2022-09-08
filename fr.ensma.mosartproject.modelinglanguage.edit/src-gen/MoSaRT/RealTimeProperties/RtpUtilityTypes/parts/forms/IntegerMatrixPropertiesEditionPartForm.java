/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.forms;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerMatrixPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

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
public class IntegerMatrixPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IntegerMatrixPropertiesEditionPart {

	protected ReferencesTable matrixElements;
	protected List<ViewerFilter> matrixElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> matrixElementsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public IntegerMatrixPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerMatrixPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerMatrixStep = new BindingCompositionSequence(propertiesEditionComponent);
		integerMatrixStep
			.addStep(RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements);
		
		
		composer = new PartComposer(integerMatrixStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements) {
					return createMatrixElementsTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(RtpUtilityTypesMessages.IntegerMatrixPropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param container
	 * 
	 */
	protected Composite createMatrixElementsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.matrixElements = new ReferencesTable(getDescription(RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, RtpUtilityTypesMessages.IntegerMatrixPropertiesEditionPart_MatrixElementsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerMatrixPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				matrixElements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerMatrixPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				matrixElements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerMatrixPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				matrixElements.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerMatrixPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				matrixElements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.matrixElementsFilters) {
			this.matrixElements.addFilter(filter);
		}
		this.matrixElements.setHelpText(propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, RtpUtilityTypesViewsRepository.FORM_KIND));
		this.matrixElements.createControls(parent, widgetFactory);
		this.matrixElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerMatrixPropertiesEditionPartForm.this, RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData matrixElementsData = new GridData(GridData.FILL_HORIZONTAL);
		matrixElementsData.horizontalSpan = 3;
		this.matrixElements.setLayoutData(matrixElementsData);
		this.matrixElements.setLowerBound(1);
		this.matrixElements.setUpperBound(-1);
		matrixElements.setID(RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements);
		matrixElements.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerMatrixPropertiesEditionPart#initMatrixElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMatrixElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		matrixElements.setContentProvider(contentProvider);
		matrixElements.setInput(settings);
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.IntegerMatrix.Properties.matrixElements);
		if (readOnly && matrixElements.isEnabled()) {
			matrixElements.setEnabled(false);
			matrixElements.setToolTipText(RtpUtilityTypesMessages.IntegerMatrix_ReadOnly);
		} else if (!readOnly && !matrixElements.isEnabled()) {
			matrixElements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerMatrixPropertiesEditionPart#updateMatrixElements()
	 * 
	 */
	public void updateMatrixElements() {
	matrixElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerMatrixPropertiesEditionPart#addFilterMatrixElements(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMatrixElements(ViewerFilter filter) {
		matrixElementsFilters.add(filter);
		if (this.matrixElements != null) {
			this.matrixElements.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerMatrixPropertiesEditionPart#addBusinessFilterMatrixElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMatrixElements(ViewerFilter filter) {
		matrixElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.IntegerMatrixPropertiesEditionPart#isContainedInMatrixElementsTable(EObject element)
	 * 
	 */
	public boolean isContainedInMatrixElementsTable(EObject element) {
		return ((ReferencesTableSettings)matrixElements.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpUtilityTypesMessages.IntegerMatrix_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
