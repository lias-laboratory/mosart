/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts.impl;

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
public class RealSetPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RealSetPropertiesEditionPart {

	protected Text setElements;
	protected Button editSetElements;
	private EList setElementsList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RealSetPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence realSetStep = new BindingCompositionSequence(propertiesEditionComponent);
		realSetStep
			.addStep(RtpUtilityTypesViewsRepository.RealSet.Properties.class)
			.addStep(RtpUtilityTypesViewsRepository.RealSet.Properties.setElements);
		
		
		composer = new PartComposer(realSetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpUtilityTypesViewsRepository.RealSet.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpUtilityTypesViewsRepository.RealSet.Properties.setElements) {
					return createSetElementsMultiValuedEditor(parent);
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
		propertiesGroup.setText(RtpUtilityTypesMessages.RealSetPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	protected Composite createSetElementsMultiValuedEditor(Composite parent) {
		setElements = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData setElementsData = new GridData(GridData.FILL_HORIZONTAL);
		setElementsData.horizontalSpan = 2;
		setElements.setLayoutData(setElementsData);
		EditingUtils.setID(setElements, RtpUtilityTypesViewsRepository.RealSet.Properties.setElements);
		EditingUtils.setEEFtype(setElements, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editSetElements = new Button(parent, SWT.NONE);
		editSetElements.setText(getDescription(RtpUtilityTypesViewsRepository.RealSet.Properties.setElements, RtpUtilityTypesMessages.RealSetPropertiesEditionPart_SetElementsLabel));
		GridData editSetElementsData = new GridData();
		editSetElements.setLayoutData(editSetElementsData);
		editSetElements.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RealSetPropertiesEditionPartImpl.this, RtpUtilityTypesViewsRepository.RealSet.Properties.setElements, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(setElementsList)));
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
