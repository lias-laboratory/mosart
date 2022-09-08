/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts.forms;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SoftwareOperatorsViewsRepository;
import MoSaRT.SoftwarePlatform.SoftwareOperators.parts.SystemSoftwareSidePropertiesEditionPart;

import MoSaRT.SoftwarePlatform.SoftwareOperators.providers.SoftwareOperatorsMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer;

import org.eclipse.emf.eef.runtime.ui.widgets.AdvancedEObjectFlatComboViewer.EObjectFlatComboViewerListener;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
public class SystemSoftwareSidePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SystemSoftwareSidePropertiesEditionPart {

	protected AdvancedEObjectFlatComboViewer systemBehavior;
	protected ViewerFilter systemBehaviorFilter;
	protected Text name;



	/**
	 * For {@link ISection} use only.
	 */
	public SystemSoftwareSidePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SystemSoftwareSidePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence systemSoftwareSideStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = systemSoftwareSideStep.addStep(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.class);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior);
		propertiesStep.addStep(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name);
		
		
		composer = new PartComposer(systemSoftwareSideStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior) {
					return createSystemBehaviorFlatComboViewer(parent, widgetFactory);
				}
				if (key == SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name) {
					return createNameText(widgetFactory, parent);
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
		propertiesSection.setText(SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_PropertiesGroupLabel);
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSystemBehaviorFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_SystemBehaviorLabel);
		// create callback listener
		EObjectFlatComboViewerListener listener = new EObjectFlatComboViewerListener(){
			public void handleSet(EObject element){
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, element)); 
			}
			public void navigateTo(EObject element){ }

			public EObject handleCreate() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null)); 
				return null;
			}

		};
		//create widget
		systemBehavior = new AdvancedEObjectFlatComboViewer(SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_SystemBehaviorLabel, resourceSet, systemBehaviorFilter, propertiesEditionComponent.getEditingContext().getAdapterFactory(), listener);
		systemBehavior.createControls(parent, widgetFactory);
		GridData systemBehaviorData = new GridData(GridData.FILL_HORIZONTAL);
		systemBehavior.setLayoutData(systemBehaviorData);
		systemBehavior.setID(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.systemBehavior, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, SoftwareOperatorsMessages.SystemSoftwareSidePropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							SystemSoftwareSidePropertiesEditionPartForm.this,
							SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SystemSoftwareSidePropertiesEditionPartForm.this,
									SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SystemSoftwareSidePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SystemSoftwareSidePropertiesEditionPartForm.this, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareOperatorsViewsRepository.SystemSoftwareSide.Properties.name, SoftwareOperatorsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
