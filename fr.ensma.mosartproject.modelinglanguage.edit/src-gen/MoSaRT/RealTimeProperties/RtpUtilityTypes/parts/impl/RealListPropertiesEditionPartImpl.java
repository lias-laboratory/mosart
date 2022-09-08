/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealListPropertiesEditionPart;
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
public class RealListPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RealListPropertiesEditionPart {

	protected Text listElements;
	protected Button editListElements;
	private EList listElementsList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealListPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence realListStep = new BindingCompositionSequence(propertiesEditionComponent);
		realListStep
			.addStep(RtpUtilityTypesViewsRepository.RealList.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.RealList.Properties.listElements);
		
		
		composer = new PartComposer(realListStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.RealList.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealList.Properties.listElements) {
					return createListElementsMultiValuedEditor(parent);
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
		propertiesGroup.setText(RtpUtilityTypesMessages.RealListPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createListElementsMultiValuedEditor(Composite parent) {
		listElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData listElementsData = new GridData(GridData.FILL_HORIZONTAL);
		listElementsData.horizontalSpan = 2;
		listElements.setLayoutData(listElementsData);
		EditingUtils.setID(listElements, RtpUtilityTypesViewsRepository.RealList.Properties.listElements);
		EditingUtils.setEEFtype(listElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editListElements = new Button(parent, SWT.NONE);
		editListElements.setText(getDescription(RtpUtilityTypesViewsRepository.RealList.Properties.listElements, RtpUtilityTypesMessages.RealListPropertiesEditionPart_ListElementsLabel));
		GridData editListElementsData = new GridData();
		editListElements.setLayoutData(editListElementsData);
		editListElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						listElements.getShell(), "RealList", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						listElementsList, RtpUtilityTypesPackage.eINSTANCE.getRealList_ListElements().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					listElementsList = dialog.getResult();
					if (listElementsList == null) {
						listElementsList = new BasicEList();
					}
					listElements.setText(listElementsList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealListPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealList.Properties.listElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(listElementsList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editListElements, RtpUtilityTypesViewsRepository.RealList.Properties.listElements);
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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealListPropertiesEditionPart#getListElements()
	 * 
	 */
	public EList getListElements() {
		return listElementsList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.RealListPropertiesEditionPart#setListElements(EList newValue)
	 * 
	 */
	public void setListElements(EList newValue) {
		listElementsList = newValue;
		if (newValue != null) {
			listElements.setText(listElementsList.toString());
		} else {
			listElements.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpUtilityTypesViewsRepository.RealList.Properties.listElements);
		if (readOnly && listElements.isEnabled()) {
			listElements.setEnabled(false);
			listElements.setToolTipText(RtpUtilityTypesMessages.RealList_ReadOnly);
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
		return RtpUtilityTypesMessages.RealList_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
