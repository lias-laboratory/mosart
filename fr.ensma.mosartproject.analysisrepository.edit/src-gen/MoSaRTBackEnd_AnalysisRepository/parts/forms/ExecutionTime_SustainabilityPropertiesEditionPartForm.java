/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.forms;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

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
public class ExecutionTime_SustainabilityPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ExecutionTime_SustainabilityPropertiesEditionPart {

	protected Text comment;
	protected ReferencesTable contexts;
	protected List<ViewerFilter> contextsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public ExecutionTime_SustainabilityPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ExecutionTime_SustainabilityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence executionTime_SustainabilityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = executionTime_SustainabilityStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts);
		
		
		composer = new PartComposer(executionTime_SustainabilityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment) {
					return createCommentText(widgetFactory, parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts) {
					return createContextsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.ExecutionTime_SustainabilityPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createCommentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, MoSaRTBackEnd_AnalysisRepositoryMessages.ExecutionTime_SustainabilityPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		comment = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		comment.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ExecutionTime_SustainabilityPropertiesEditionPartForm.this,
							MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ExecutionTime_SustainabilityPropertiesEditionPartForm.this,
									MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, comment.getText()));
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
									ExecutionTime_SustainabilityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		comment.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExecutionTime_SustainabilityPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}
		});
		EditingUtils.setID(comment, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createContextsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.contexts = new ReferencesTable(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts, MoSaRTBackEnd_AnalysisRepositoryMessages.ExecutionTime_SustainabilityPropertiesEditionPart_ContextsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addContexts(); }
			public void handleEdit(EObject element) { editContexts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContexts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContexts(element); }
			public void navigateTo(EObject element) { }
		});
		this.contexts.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.FORM_KIND));
		this.contexts.createControls(parent, widgetFactory);
		this.contexts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExecutionTime_SustainabilityPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextsData = new GridData(GridData.FILL_HORIZONTAL);
		contextsData.horizontalSpan = 3;
		this.contexts.setLayoutData(contextsData);
		this.contexts.disableMove();
		contexts.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts);
		contexts.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContexts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(contexts.getInput(), contextsFilters, contextsBusinessFilters,
		"contexts", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExecutionTime_SustainabilityPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				contexts.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContexts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExecutionTime_SustainabilityPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		contexts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContexts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ExecutionTime_SustainabilityPropertiesEditionPartForm.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		contexts.refresh();
	}

	/**
	 * 
	 */
	protected void editContexts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				contexts.refresh();
			}
		}
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.comment);
		if (readOnly && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ExecutionTime_Sustainability_ReadOnly);
		} else if (!readOnly && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#initContexts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContexts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contexts.setContentProvider(contentProvider);
		contexts.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ExecutionTime_Sustainability.Properties.contexts);
		if (readOnly && contexts.getTable().isEnabled()) {
			contexts.setEnabled(false);
			contexts.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ExecutionTime_Sustainability_ReadOnly);
		} else if (!readOnly && !contexts.getTable().isEnabled()) {
			contexts.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#updateContexts()
	 * 
	 */
	public void updateContexts() {
	contexts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#addFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContexts(ViewerFilter filter) {
		contextsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#addBusinessFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContexts(ViewerFilter filter) {
		contextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ExecutionTime_SustainabilityPropertiesEditionPart#isContainedInContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextsTable(EObject element) {
		return ((ReferencesTableSettings)contexts.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.ExecutionTime_Sustainability_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
