/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart;

import MoSaRT.SoftwarePlatform.SoftwareOperators.providers.SoftwareOperatorsMessages;

import org.eclipse.emf.ecore.EObject;

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

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

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
public class SystemSoftwareSidePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SystemSoftwareSidePropertiesEditionPart {

	private AdvancedEObjectFlatComboViewer systemBehavior;
	protected ViewerFilter systemBehaviorFilter;
	protected Text name;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SystemSoftwareSidePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence systemSoftwareSideStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = systemSoftwareSideStep.addStep(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name);
		
		
		composer = new PartComposer(systemSoftwareSideStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior) {
					return createSystemBehaviorAdvancedFlatComboViewer(parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name) {
					return createNameText(parent);
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
		propertiesGroup.setText(SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSystemBehaviorAdvancedFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_SystemBehaviorLabel);
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}
		};
		//create widget
		systemBehavior = new AdvancedEObjectFlatComboViewer(getDescription(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_SystemBehaviorLabel), resourceSet, systemBehaviorFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		systemBehavior.createControls(parent);
		GridData systemBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		systemBehavior.setLayoutData(systemBehaviorData);
		systemBehavior.setID(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartImpl.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, SoftwareOperatorsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#getSystemBehavior()
	 * 
	 */
	public EObject getSystemBehavior() {
		return systemBehavior.getSelection();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#initSystemBehavior(EObjectFlatComboSettings)
	 */
	public void initSystemBehavior(EObjectFlatComboSettings settings) {
		systemBehavior.setInput(settings);
		if (current != null) {
			systemBehavior.setSelection(new StructuredSelection(settings.getValue()));
		}
		systemBehavior.setEnabled(false);
		systemBehavior.setToolTipText(SoftwareOperatorsMessages.SystemSoftwareSide_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#setSystemBehavior(EObject newValue)
	 * 
	 */
	public void setSystemBehavior(EObject newValue) {
		if (newValue != null) {
			systemBehavior.setSelection(new StructuredSelection(newValue));
		} else {
			systemBehavior.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		systemBehavior.setEnabled(false);
		systemBehavior.setToolTipText(SoftwareOperatorsMessages.SystemSoftwareSide_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#setSystemBehaviorButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSystemBehaviorButtonMode(ButtonsModeEnum newValue) {
		systemBehavior.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#addFilterSystemBehavior(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSystemBehavior(ViewerFilter filter) {
		systemBehavior.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#addBusinessFilterSystemBehavior(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSystemBehavior(ViewerFilter filter) {
		systemBehavior.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareOperatorsMessages.SystemSoftwareSide_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareOperatorsMessages.SystemSoftwareSide_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
