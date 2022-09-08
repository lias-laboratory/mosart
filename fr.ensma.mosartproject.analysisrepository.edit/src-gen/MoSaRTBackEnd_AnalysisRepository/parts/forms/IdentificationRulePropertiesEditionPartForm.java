/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.forms;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
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
public class IdentificationRulePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, IdentificationRulePropertiesEditionPart {

	protected Text id;
	protected EMFComboViewer componentKind;
	protected EMFComboViewer timingKind;
	protected EObjectFlatComboViewer rule;
	protected EObjectFlatComboViewer ruleContext;
	protected Text description;



	/**
	 * For {@link ISection} use only.
	 */
	public IdentificationRulePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public IdentificationRulePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence identificationRuleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = identificationRuleStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description);
		
		
		composer = new PartComposer(identificationRuleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id) {
					return createIdText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind) {
					return createComponentKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind) {
					return createTimingKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule) {
					return createRuleFlatComboViewer(parent, widgetFactory);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext) {
					return createRuleContextFlatComboViewer(parent, widgetFactory);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
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
		propertiesSection.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIdText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							IdentificationRulePropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IdentificationRulePropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, id.getText()));
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
									IdentificationRulePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IdentificationRulePropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createComponentKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_ComponentKindLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		componentKind = new EMFComboViewer(parent);
		componentKind.setContentProvider(new ArrayContentProvider());
		componentKind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData componentKindData = new GridData(GridData.FILL_HORIZONTAL);
		componentKind.getCombo().setLayoutData(componentKindData);
		componentKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IdentificationRulePropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComponentKind()));
			}

		});
		componentKind.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTimingKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_TimingKindLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		timingKind = new EMFComboViewer(parent);
		timingKind.setContentProvider(new ArrayContentProvider());
		timingKind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData timingKindData = new GridData(GridData.FILL_HORIZONTAL);
		timingKind.getCombo().setLayoutData(timingKindData);
		timingKind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IdentificationRulePropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTimingKind()));
			}

		});
		timingKind.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRuleFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_RuleLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		rule = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		widgetFactory.adapt(rule);
		rule.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData ruleData = new GridData(GridData.FILL_HORIZONTAL);
		rule.setLayoutData(ruleData);
		rule.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IdentificationRulePropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRule()));
			}

		});
		rule.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createRuleContextFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_RuleContextLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		ruleContext = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		widgetFactory.adapt(ruleContext);
		ruleContext.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData ruleContextData = new GridData(GridData.FILL_HORIZONTAL);
		ruleContext.setLayoutData(ruleContextData);
		ruleContext.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IdentificationRulePropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getRuleContext()));
			}

		});
		ruleContext.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRulePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							IdentificationRulePropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									IdentificationRulePropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
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
									IdentificationRulePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(IdentificationRulePropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.id);
		if (readOnly && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#getComponentKind()
	 * 
	 */
	public Enumerator getComponentKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) componentKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#initComponentKind(Object input, Enumerator current)
	 */
	public void initComponentKind(Object input, Enumerator current) {
		componentKind.setInput(input);
		componentKind.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind);
		if (readOnly && componentKind.isEnabled()) {
			componentKind.setEnabled(false);
			componentKind.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !componentKind.isEnabled()) {
			componentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setComponentKind(Enumerator newValue)
	 * 
	 */
	public void setComponentKind(Enumerator newValue) {
		componentKind.modelUpdating(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.componentKind);
		if (readOnly && componentKind.isEnabled()) {
			componentKind.setEnabled(false);
			componentKind.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !componentKind.isEnabled()) {
			componentKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#getTimingKind()
	 * 
	 */
	public Enumerator getTimingKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) timingKind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#initTimingKind(Object input, Enumerator current)
	 */
	public void initTimingKind(Object input, Enumerator current) {
		timingKind.setInput(input);
		timingKind.modelUpdating(new StructuredSelection(current));
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind);
		if (readOnly && timingKind.isEnabled()) {
			timingKind.setEnabled(false);
			timingKind.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !timingKind.isEnabled()) {
			timingKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setTimingKind(Enumerator newValue)
	 * 
	 */
	public void setTimingKind(Enumerator newValue) {
		timingKind.modelUpdating(new StructuredSelection(newValue));
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.timingKind);
		if (readOnly && timingKind.isEnabled()) {
			timingKind.setEnabled(false);
			timingKind.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !timingKind.isEnabled()) {
			timingKind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#getRule()
	 * 
	 */
	public EObject getRule() {
		if (rule.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) rule.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#initRule(EObjectFlatComboSettings)
	 */
	public void initRule(EObjectFlatComboSettings settings) {
		rule.setInput(settings);
		if (current != null) {
			rule.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule);
		if (readOnly && rule.isEnabled()) {
			rule.setEnabled(false);
			rule.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !rule.isEnabled()) {
			rule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setRule(EObject newValue)
	 * 
	 */
	public void setRule(EObject newValue) {
		if (newValue != null) {
			rule.setSelection(new StructuredSelection(newValue));
		} else {
			rule.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.rule);
		if (readOnly && rule.isEnabled()) {
			rule.setEnabled(false);
			rule.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !rule.isEnabled()) {
			rule.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setRuleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRuleButtonMode(ButtonsModeEnum newValue) {
		rule.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#addFilterRule(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRule(ViewerFilter filter) {
		rule.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#addBusinessFilterRule(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRule(ViewerFilter filter) {
		rule.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#getRuleContext()
	 * 
	 */
	public EObject getRuleContext() {
		if (ruleContext.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) ruleContext.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#initRuleContext(EObjectFlatComboSettings)
	 */
	public void initRuleContext(EObjectFlatComboSettings settings) {
		ruleContext.setInput(settings);
		if (current != null) {
			ruleContext.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext);
		if (readOnly && ruleContext.isEnabled()) {
			ruleContext.setEnabled(false);
			ruleContext.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !ruleContext.isEnabled()) {
			ruleContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setRuleContext(EObject newValue)
	 * 
	 */
	public void setRuleContext(EObject newValue) {
		if (newValue != null) {
			ruleContext.setSelection(new StructuredSelection(newValue));
		} else {
			ruleContext.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.ruleContext);
		if (readOnly && ruleContext.isEnabled()) {
			ruleContext.setEnabled(false);
			ruleContext.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !ruleContext.isEnabled()) {
			ruleContext.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setRuleContextButtonMode(ButtonsModeEnum newValue)
	 */
	public void setRuleContextButtonMode(ButtonsModeEnum newValue) {
		ruleContext.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#addFilterRuleContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRuleContext(ViewerFilter filter) {
		ruleContext.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#addBusinessFilterRuleContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRuleContext(ViewerFilter filter) {
		ruleContext.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.IdentificationRulePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.IdentificationRule.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.IdentificationRule_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
