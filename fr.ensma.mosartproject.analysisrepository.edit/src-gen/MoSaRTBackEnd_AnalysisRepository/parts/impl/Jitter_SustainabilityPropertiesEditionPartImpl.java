/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.impl;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class Jitter_SustainabilityPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, Jitter_SustainabilityPropertiesEditionPart {

	protected ReferencesTable contexts;
	protected List<ViewerFilter> contextsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextsFilters = new ArrayList<ViewerFilter>();
	protected Text comment;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public Jitter_SustainabilityPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence jitter_SustainabilityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = jitter_SustainabilityStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment);
		
		
		composer = new PartComposer(jitter_SustainabilityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts) {
					return createContextsAdvancedReferencesTable(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment) {
					return createCommentText(parent);
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
		propertiesGroup.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.Jitter_SustainabilityPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createContextsAdvancedReferencesTable(Composite parent) {
		String label = MoSaRTBackEnd_AnalysisRepositoryMessages.Jitter_SustainabilityPropertiesEditionPart_ContextsLabel;
		this.contexts = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addContexts(); }
			public void handleEdit(EObject element) { editContexts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContexts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContexts(element); }
			public void navigateTo(EObject element) { }
		});
		this.contexts.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		this.contexts.createControls(parent);
		this.contexts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Jitter_SustainabilityPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData contextsData = new GridData(GridData.FILL_HORIZONTAL);
		contextsData.horizontalSpan = 3;
		this.contexts.setLayoutData(contextsData);
		this.contexts.disableMove();
		contexts.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Jitter_SustainabilityPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Jitter_SustainabilityPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		contexts.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContexts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Jitter_SustainabilityPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createCommentText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.Jitter_SustainabilityPropertiesEditionPart_CommentLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		comment = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Jitter_SustainabilityPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		comment.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(Jitter_SustainabilityPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
				}
			}

		});
		EditingUtils.setID(comment, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#initContexts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContexts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		contexts.setContentProvider(contentProvider);
		contexts.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.contexts);
		if (readOnly && contexts.getTable().isEnabled()) {
			contexts.setEnabled(false);
			contexts.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Jitter_Sustainability_ReadOnly);
		} else if (!readOnly && !contexts.getTable().isEnabled()) {
			contexts.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#updateContexts()
	 * 
	 */
	public void updateContexts() {
	contexts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#addFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContexts(ViewerFilter filter) {
		contextsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#addBusinessFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContexts(ViewerFilter filter) {
		contextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#isContainedInContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextsTable(EObject element) {
		return ((ReferencesTableSettings)contexts.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.Jitter_SustainabilityPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Jitter_Sustainability.Properties.comment);
		if (readOnly && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Jitter_Sustainability_ReadOnly);
		} else if (!readOnly && !comment.isEnabled()) {
			comment.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.Jitter_Sustainability_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
