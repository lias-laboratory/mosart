/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.providers.SoftwareBehaviorMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
public class GlobalBehaviorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GlobalBehaviorPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer rootTrigger;



	/**
	 * For {@link ISection} use only.
	 */
	public GlobalBehaviorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GlobalBehaviorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence globalBehaviorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = globalBehaviorStep.addStep(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger);
		
		
		composer = new PartComposer(globalBehaviorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger) {
					return createRootTriggerFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(SoftwareBehaviorMessages.GlobalBehaviorPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name, SoftwareBehaviorMessages.GlobalBehaviorPropertiesEditionPart_NameLabel);
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
							GlobalBehaviorPropertiesEditionPartForm.this,
							SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GlobalBehaviorPropertiesEditionPartForm.this,
									SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name,
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
									GlobalBehaviorPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalBehaviorPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRootTriggerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger, SoftwareBehaviorMessages.GlobalBehaviorPropertiesEditionPart_RootTriggerLabel);
		rootTrigger = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger, SoftwareBehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(rootTrigger);
		rootTrigger.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData rootTriggerData = new GridData(GridData.FILL_HORIZONTAL);
		rootTrigger.setLayoutData(rootTriggerData);
		rootTrigger.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalBehaviorPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRootTrigger()));
			}

		});
		rootTrigger.setID(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.GlobalBehavior_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#getRootTrigger()
	 * 
	 */
	public EObject getRootTrigger() {
		if (rootTrigger.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) rootTrigger.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#initRootTrigger(EObjectFlatComboSettings)
	 */
	public void initRootTrigger(EObjectFlatComboSettings settings) {
		rootTrigger.setInput(settings);
		if (current != null) {
			rootTrigger.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger);
		if (readOnly && rootTrigger.isEnabled()) {
			rootTrigger.setEnabled(false);
			rootTrigger.setToolTipText(SoftwareBehaviorMessages.GlobalBehavior_ReadOnly);
		} else if (!readOnly && !rootTrigger.isEnabled()) {
			rootTrigger.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#setRootTrigger(EObject newValue)
	 * 
	 */
	public void setRootTrigger(EObject newValue) {
		if (newValue != null) {
			rootTrigger.setSelection(new StructuredSelection(newValue));
		} else {
			rootTrigger.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.GlobalBehavior.Properties.rootTrigger);
		if (readOnly && rootTrigger.isEnabled()) {
			rootTrigger.setEnabled(false);
			rootTrigger.setToolTipText(SoftwareBehaviorMessages.GlobalBehavior_ReadOnly);
		} else if (!readOnly && !rootTrigger.isEnabled()) {
			rootTrigger.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#setRootTriggerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRootTriggerButtonMode(ButtonsModeEnum newValue) {
		rootTrigger.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#addFilterRootTrigger(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRootTrigger(ViewerFilter filter) {
		rootTrigger.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.GlobalBehaviorPropertiesEditionPart#addBusinessFilterRootTrigger(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRootTrigger(ViewerFilter filter) {
		rootTrigger.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.GlobalBehavior_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
