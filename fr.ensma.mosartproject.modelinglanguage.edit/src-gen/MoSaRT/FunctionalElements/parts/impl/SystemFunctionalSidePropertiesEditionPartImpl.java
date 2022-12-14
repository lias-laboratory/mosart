/**
 * Generated with Acceleo
 */
package MoSaRT.FunctionalElements.parts.impl;

// Start of user code for imports
import MoSaRT.FunctionalElements.parts.FunctionalElementsViewsRepository;
import MoSaRT.FunctionalElements.parts.SystemFunctionalSidePropertiesEditionPart;

import MoSaRT.FunctionalElements.providers.FunctionalElementsMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class SystemFunctionalSidePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SystemFunctionalSidePropertiesEditionPart {

	protected Text name;
	private SingleCompositionEditor umlModel;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SystemFunctionalSidePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence systemFunctionalSideStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = systemFunctionalSideStep.addStep(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.class);
		propertiesStep.addStep(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name);
		propertiesStep.addStep(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel);
		
		
		composer = new PartComposer(systemFunctionalSideStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name) {
					return createNameText(parent);
				}
				if (key == FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel) {
					return createUmlModelSingleCompositionEditor(parent);
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
		propertiesGroup.setText(FunctionalElementsMessages.SystemFunctionalSidePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name, FunctionalElementsMessages.SystemFunctionalSidePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemFunctionalSidePropertiesEditionPartImpl.this, FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemFunctionalSidePropertiesEditionPartImpl.this, FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name, FunctionalElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createUmlModelSingleCompositionEditor(Composite parent) {
		createDescription(parent, FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel, FunctionalElementsMessages.SystemFunctionalSidePropertiesEditionPart_UmlModelLabel);
		//create widget
		umlModel = new SingleCompositionEditor(parent, SWT.NONE);
		GridData umlModelData = new GridData(GridData.FILL_HORIZONTAL);
		umlModel.setLayoutData(umlModelData);
		umlModel.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemFunctionalSidePropertiesEditionPartImpl.this,  FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				umlModel.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemFunctionalSidePropertiesEditionPartImpl.this,  FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				umlModel.refresh();
			}
		});
		umlModel.setID(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel, FunctionalElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.FunctionalElements.parts.SystemFunctionalSidePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.FunctionalElements.parts.SystemFunctionalSidePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(FunctionalElementsMessages.SystemFunctionalSide_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.FunctionalElements.parts.SystemFunctionalSidePropertiesEditionPart#getUmlModel()
	 * 
	 */
	public EObject getUmlModel() {
		return (EObject) umlModel.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.FunctionalElements.parts.SystemFunctionalSidePropertiesEditionPart#initUmlModel(EObjectFlatComboSettings)
	 */
	public void initUmlModel(EObjectFlatComboSettings settings) {
		umlModel.setAdapterFactory(adapterFactory);
		umlModel.setInput(settings);
		boolean readOnly = isReadOnly(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel);
		if (readOnly && umlModel.isEnabled()) {
			umlModel.setEnabled(false);
			umlModel.setToolTipText(FunctionalElementsMessages.SystemFunctionalSide_ReadOnly);
		} else if (!readOnly && !umlModel.isEnabled()) {
			umlModel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.FunctionalElements.parts.SystemFunctionalSidePropertiesEditionPart#setUmlModel(EObject newValue)
	 * 
	 */
	public void setUmlModel(EObject newValue) {
		umlModel.refresh();
		boolean readOnly = isReadOnly(FunctionalElementsViewsRepository.SystemFunctionalSide.Properties.umlModel);
		if (readOnly && umlModel.isEnabled()) {
			umlModel.setEnabled(false);
			umlModel.setToolTipText(FunctionalElementsMessages.SystemFunctionalSide_ReadOnly);
		} else if (!readOnly && !umlModel.isEnabled()) {
			umlModel.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FunctionalElementsMessages.SystemFunctionalSide_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
