/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

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

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class IntegerVectorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, IntegerVectorPropertiesEditionPart {

	protected Text vectorElements;
	protected Button editVectorElements;
	private EList vectorElementsList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IntegerVectorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence integerVectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		integerVectorStep
			.addStep(RtpUtilityTypesViewsRepository.IntegerVector.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements);
		
		
		composer = new PartComposer(integerVectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.IntegerVector.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements) {
					return createVectorElementsMultiValuedEditor(parent);
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
		propertiesGroup.setText(RtpUtilityTypesMessages.IntegerVectorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createVectorElementsMultiValuedEditor(Composite parent) {
		vectorElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData vectorElementsData = new GridData(GridData.FILL_HORIZONTAL);
		vectorElementsData.horizontalSpan = 2;
		vectorElements.setLayoutData(vectorElementsData);
		EditingUtils.setID(vectorElements, RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements);
		EditingUtils.setEEFtype(vectorElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editVectorElements = new Button(parent, SWT.NONE);
		editVectorElements.setText(getDescription(RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements, RtpUtilityTypesMessages.IntegerVectorPropertiesEditionPart_VectorElementsLabel));
		GridData editVectorElementsData = new GridData();
		editVectorElements.setLayoutData(editVectorElementsData);
		editVectorElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IntegerVectorPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.IntegerVector.Properties.vectorElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(vectorElementsList)));
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
