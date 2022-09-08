/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealMatrixPropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RtpUtilityTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.providers.RtpUtilityTypesMessages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class RealMatrixPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RealMatrixPropertiesEditionPart {

	protected ReferencesTable matrixElements;
	protected List<ViewerFilter> matrixElementsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> matrixElementsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealMatrixPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence realMatrixStep = new BindingCompositionSequence(propertiesEditionComponent);
		realMatrixStep
			.addStep(RtpUtilityTypesViewsRepository.RealMatrix.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements);
		
		
		composer = new PartComposer(realMatrixStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.RealMatrix.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements) {
					return createMatrixElementsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(RtpUtilityTypesMessages.RealMatrixPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMatrixElementsAdvancedTableComposition(Composite parent) {
		this.matrixElements = new ReferencesTable(getDescription(RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, RtpUtilityTypesMessages.RealMatrixPropertiesEditionPart_MatrixElementsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealMatrixPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				matrixElements.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealMatrixPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				matrixElements.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealMatrixPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				matrixElements.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealMatrixPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				matrixElements.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.matrixElementsFilters) {
			this.matrixElements.addFilter(filter);
		}
		this.matrixElements.setHelpText(propertiesEditionComponent.getHelpContent(RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, RtpUtilityTypesViewsRepository.SWT_KIND));
		this.matrixElements.createControls(parent);
		this.matrixElements.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealMatrixPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData matrixElementsData = new GridData(GridData.FILL_HORIZONTAL);
		matrixElementsData.horizontalSpan = 3;
		this.matrixElements.setLayoutData(matrixElementsData);
		this.matrixElements.setLowerBound(1);
		this.matrixElements.setUpperBound(-1);
		matrixElements.setID(RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements);
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealMatrixPropertiesEditionPart#initMatrixElements(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMatrixElements(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		matrixElements.setContentProvider(contentProvider);
		matrixElements.setInput(settings);
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealMatrix.Properties.matrixElements);
		if (readOnly && matrixElements.isEnabled()) {
			matrixElements.setEnabled(false);
			matrixElements.setToolTipText(RtpUtilityTypesMessages.RealMatrix_ReadOnly);
		} else if (!readOnly && !matrixElements.isEnabled()) {
			matrixElements.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealMatrixPropertiesEditionPart#updateMatrixElements()
	 * 
	 */
	public void updateMatrixElements() {
	matrixElements.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealMatrixPropertiesEditionPart#addFilterMatrixElements(ViewerFilter filter)
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealMatrixPropertiesEditionPart#addBusinessFilterMatrixElements(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMatrixElements(ViewerFilter filter) {
		matrixElementsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealMatrixPropertiesEditionPart#isContainedInMatrixElementsTable(EObject element)
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
		return RtpUtilityTypesMessages.RealMatrix_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
