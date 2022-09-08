/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.forms;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart;
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
public class SbPrecedenceRelationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, SbPrecedenceRelationPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer targetSchedulingActivity;
	protected EObjectFlatComboViewer sourceSchedulingActivity;



	/**
	 * For {@link ISection} use only.
	 */
	public SbPrecedenceRelationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbPrecedenceRelationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbPrecedenceRelationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbPrecedenceRelationStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity);
		
		
		composer = new PartComposer(sbPrecedenceRelationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity) {
					return createTargetSchedulingActivityFlatComboViewer(parent, widgetFactory);
				}
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity) {
					return createSourceSchedulingActivityFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_NameLabel);
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
							SbPrecedenceRelationPropertiesEditionPartForm.this,
							SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									SbPrecedenceRelationPropertiesEditionPartForm.this,
									SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name,
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
									SbPrecedenceRelationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetSchedulingActivityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_TargetSchedulingActivityLabel);
		targetSchedulingActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, SoftwareBehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(targetSchedulingActivity);
		targetSchedulingActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetSchedulingActivityData = new GridData(GridData.FILL_HORIZONTAL);
		targetSchedulingActivity.setLayoutData(targetSchedulingActivityData);
		targetSchedulingActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTargetSchedulingActivity()));
			}

		});
		targetSchedulingActivity.setID(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceSchedulingActivityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_SourceSchedulingActivityLabel);
		sourceSchedulingActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, SoftwareBehaviorViewsRepository.FORM_KIND));
		widgetFactory.adapt(sourceSchedulingActivity);
		sourceSchedulingActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceSchedulingActivityData = new GridData(GridData.FILL_HORIZONTAL);
		sourceSchedulingActivity.setLayoutData(sourceSchedulingActivityData);
		sourceSchedulingActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartForm.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSourceSchedulingActivity()));
			}

		});
		sourceSchedulingActivity.setID(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, SoftwareBehaviorViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#getTargetSchedulingActivity()
	 * 
	 */
	public EObject getTargetSchedulingActivity() {
		if (targetSchedulingActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetSchedulingActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#initTargetSchedulingActivity(EObjectFlatComboSettings)
	 */
	public void initTargetSchedulingActivity(EObjectFlatComboSettings settings) {
		targetSchedulingActivity.setInput(settings);
		if (current != null) {
			targetSchedulingActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity);
		if (readOnly && targetSchedulingActivity.isEnabled()) {
			targetSchedulingActivity.setEnabled(false);
			targetSchedulingActivity.setToolTipText(SoftwareBehaviorMessages.SbPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !targetSchedulingActivity.isEnabled()) {
			targetSchedulingActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#setTargetSchedulingActivity(EObject newValue)
	 * 
	 */
	public void setTargetSchedulingActivity(EObject newValue) {
		if (newValue != null) {
			targetSchedulingActivity.setSelection(new StructuredSelection(newValue));
		} else {
			targetSchedulingActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity);
		if (readOnly && targetSchedulingActivity.isEnabled()) {
			targetSchedulingActivity.setEnabled(false);
			targetSchedulingActivity.setToolTipText(SoftwareBehaviorMessages.SbPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !targetSchedulingActivity.isEnabled()) {
			targetSchedulingActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#setTargetSchedulingActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetSchedulingActivityButtonMode(ButtonsModeEnum newValue) {
		targetSchedulingActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#addFilterTargetSchedulingActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetSchedulingActivity(ViewerFilter filter) {
		targetSchedulingActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#addBusinessFilterTargetSchedulingActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetSchedulingActivity(ViewerFilter filter) {
		targetSchedulingActivity.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#getSourceSchedulingActivity()
	 * 
	 */
	public EObject getSourceSchedulingActivity() {
		if (sourceSchedulingActivity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourceSchedulingActivity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#initSourceSchedulingActivity(EObjectFlatComboSettings)
	 */
	public void initSourceSchedulingActivity(EObjectFlatComboSettings settings) {
		sourceSchedulingActivity.setInput(settings);
		if (current != null) {
			sourceSchedulingActivity.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity);
		if (readOnly && sourceSchedulingActivity.isEnabled()) {
			sourceSchedulingActivity.setEnabled(false);
			sourceSchedulingActivity.setToolTipText(SoftwareBehaviorMessages.SbPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !sourceSchedulingActivity.isEnabled()) {
			sourceSchedulingActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#setSourceSchedulingActivity(EObject newValue)
	 * 
	 */
	public void setSourceSchedulingActivity(EObject newValue) {
		if (newValue != null) {
			sourceSchedulingActivity.setSelection(new StructuredSelection(newValue));
		} else {
			sourceSchedulingActivity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity);
		if (readOnly && sourceSchedulingActivity.isEnabled()) {
			sourceSchedulingActivity.setEnabled(false);
			sourceSchedulingActivity.setToolTipText(SoftwareBehaviorMessages.SbPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !sourceSchedulingActivity.isEnabled()) {
			sourceSchedulingActivity.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#setSourceSchedulingActivityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceSchedulingActivityButtonMode(ButtonsModeEnum newValue) {
		sourceSchedulingActivity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#addFilterSourceSchedulingActivity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSourceSchedulingActivity(ViewerFilter filter) {
		sourceSchedulingActivity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart#addBusinessFilterSourceSchedulingActivity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSourceSchedulingActivity(ViewerFilter filter) {
		sourceSchedulingActivity.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.SbPrecedenceRelation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
