/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.impl;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart;
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
public class ContextModelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ContextModelPropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected Text references;
	protected Button editReferences;
	private EList referencesList;
	protected ReferencesTable falseEvaluation;
	protected List<ViewerFilter> falseEvaluationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> falseEvaluationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable trueEvaluation;
	protected List<ViewerFilter> trueEvaluationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> trueEvaluationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable undefinedEvaluation;
	protected List<ViewerFilter> undefinedEvaluationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> undefinedEvaluationFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable analysisTests;
	protected List<ViewerFilter> analysisTestsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> analysisTestsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ContextModelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence contextModelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = contextModelStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests);
		
		
		composer = new PartComposer(contextModelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name) {
					return createNameText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references) {
					return createReferencesMultiValuedEditor(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation) {
					return createFalseEvaluationAdvancedReferencesTable(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation) {
					return createTrueEvaluationAdvancedReferencesTable(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation) {
					return createUndefinedEvaluationAdvancedReferencesTable(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests) {
					return createAnalysisTestsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name, MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description, MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createReferencesMultiValuedEditor(Composite parent) {
		references = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData referencesData = new GridData(GridData.FILL_HORIZONTAL);
		referencesData.horizontalSpan = 2;
		references.setLayoutData(referencesData);
		EditingUtils.setID(references, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references);
		EditingUtils.setEEFtype(references, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editReferences = new Button(parent, SWT.NONE);
		editReferences.setText(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references, MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_ReferencesLabel));
		GridData editReferencesData = new GridData();
		editReferences.setLayoutData(editReferencesData);
		editReferences.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						references.getShell(), "ContextModel", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						referencesList, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getContextModel_References().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					referencesList = dialog.getResult();
					if (referencesList == null) {
						referencesList = new BasicEList();
					}
					references.setText(referencesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(referencesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editReferences, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references);
		EditingUtils.setEEFtype(editReferences, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createFalseEvaluationAdvancedReferencesTable(Composite parent) {
		String label = MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_FalseEvaluationLabel;
		this.falseEvaluation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFalseEvaluation(); }
			public void handleEdit(EObject element) { editFalseEvaluation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFalseEvaluation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFalseEvaluation(element); }
			public void navigateTo(EObject element) { }
		});
		this.falseEvaluation.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		this.falseEvaluation.createControls(parent);
		this.falseEvaluation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData falseEvaluationData = new GridData(GridData.FILL_HORIZONTAL);
		falseEvaluationData.horizontalSpan = 3;
		this.falseEvaluation.setLayoutData(falseEvaluationData);
		this.falseEvaluation.disableMove();
		falseEvaluation.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation);
		falseEvaluation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFalseEvaluation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(falseEvaluation.getInput(), falseEvaluationFilters, falseEvaluationBusinessFilters,
		"false Evaluation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				falseEvaluation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFalseEvaluation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		falseEvaluation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFalseEvaluation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		falseEvaluation.refresh();
	}

	/**
	 * 
	 */
	protected void editFalseEvaluation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				falseEvaluation.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createTrueEvaluationAdvancedReferencesTable(Composite parent) {
		String label = MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_TrueEvaluationLabel;
		this.trueEvaluation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addTrueEvaluation(); }
			public void handleEdit(EObject element) { editTrueEvaluation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveTrueEvaluation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromTrueEvaluation(element); }
			public void navigateTo(EObject element) { }
		});
		this.trueEvaluation.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		this.trueEvaluation.createControls(parent);
		this.trueEvaluation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData trueEvaluationData = new GridData(GridData.FILL_HORIZONTAL);
		trueEvaluationData.horizontalSpan = 3;
		this.trueEvaluation.setLayoutData(trueEvaluationData);
		this.trueEvaluation.disableMove();
		trueEvaluation.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation);
		trueEvaluation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addTrueEvaluation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(trueEvaluation.getInput(), trueEvaluationFilters, trueEvaluationBusinessFilters,
		"true Evaluation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				trueEvaluation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveTrueEvaluation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		trueEvaluation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromTrueEvaluation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		trueEvaluation.refresh();
	}

	/**
	 * 
	 */
	protected void editTrueEvaluation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				trueEvaluation.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createUndefinedEvaluationAdvancedReferencesTable(Composite parent) {
		String label = MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_UndefinedEvaluationLabel;
		this.undefinedEvaluation = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addUndefinedEvaluation(); }
			public void handleEdit(EObject element) { editUndefinedEvaluation(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveUndefinedEvaluation(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromUndefinedEvaluation(element); }
			public void navigateTo(EObject element) { }
		});
		this.undefinedEvaluation.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		this.undefinedEvaluation.createControls(parent);
		this.undefinedEvaluation.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData undefinedEvaluationData = new GridData(GridData.FILL_HORIZONTAL);
		undefinedEvaluationData.horizontalSpan = 3;
		this.undefinedEvaluation.setLayoutData(undefinedEvaluationData);
		this.undefinedEvaluation.disableMove();
		undefinedEvaluation.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation);
		undefinedEvaluation.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addUndefinedEvaluation() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(undefinedEvaluation.getInput(), undefinedEvaluationFilters, undefinedEvaluationBusinessFilters,
		"undefined Evaluation", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				undefinedEvaluation.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveUndefinedEvaluation(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		undefinedEvaluation.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromUndefinedEvaluation(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.undefinedEvaluation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		undefinedEvaluation.refresh();
	}

	/**
	 * 
	 */
	protected void editUndefinedEvaluation(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				undefinedEvaluation.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createAnalysisTestsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests, MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModelPropertiesEditionPart_AnalysisTestsLabel);		 
		this.analysisTests = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addAnalysisTests(); }
			public void handleEdit(EObject element) { editAnalysisTests(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveAnalysisTests(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromAnalysisTests(element); }
			public void navigateTo(EObject element) { }
		});
		this.analysisTests.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		this.analysisTests.createControls(parent);
		this.analysisTests.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData analysisTestsData = new GridData(GridData.FILL_HORIZONTAL);
		analysisTestsData.horizontalSpan = 3;
		this.analysisTests.setLayoutData(analysisTestsData);
		this.analysisTests.disableMove();
		analysisTests.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests);
		analysisTests.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addAnalysisTests() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(analysisTests.getInput(), analysisTestsFilters, analysisTestsBusinessFilters,
		"analysisTests", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				analysisTests.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveAnalysisTests(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		analysisTests.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromAnalysisTests(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ContextModelPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		analysisTests.refresh();
	}

	/**
	 * 
	 */
	protected void editAnalysisTests(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				analysisTests.refresh();
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#getReferences()
	 * 
	 */
	public EList getReferences() {
		return referencesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#setReferences(EList newValue)
	 * 
	 */
	public void setReferences(EList newValue) {
		referencesList = newValue;
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.references);
		if (readOnly && references.isEnabled()) {
			references.setEnabled(false);
			references.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		} else if (!readOnly && !references.isEnabled()) {
			references.setEnabled(true);
		}	
		
	}

	public void addToReferences(Object newValue) {
		referencesList.add(newValue);
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToReferences(Object newValue) {
		referencesList.remove(newValue);
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#initFalseEvaluation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFalseEvaluation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		falseEvaluation.setContentProvider(contentProvider);
		falseEvaluation.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.falseEvaluation);
		if (readOnly && falseEvaluation.getTable().isEnabled()) {
			falseEvaluation.setEnabled(false);
			falseEvaluation.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		} else if (!readOnly && !falseEvaluation.getTable().isEnabled()) {
			falseEvaluation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#updateFalseEvaluation()
	 * 
	 */
	public void updateFalseEvaluation() {
	falseEvaluation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addFilterFalseEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFalseEvaluation(ViewerFilter filter) {
		falseEvaluationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addBusinessFilterFalseEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFalseEvaluation(ViewerFilter filter) {
		falseEvaluationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#isContainedInFalseEvaluationTable(EObject element)
	 * 
	 */
	public boolean isContainedInFalseEvaluationTable(EObject element) {
		return ((ReferencesTableSettings)falseEvaluation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#initTrueEvaluation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initTrueEvaluation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		trueEvaluation.setContentProvider(contentProvider);
		trueEvaluation.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.trueEvaluation);
		if (readOnly && trueEvaluation.getTable().isEnabled()) {
			trueEvaluation.setEnabled(false);
			trueEvaluation.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		} else if (!readOnly && !trueEvaluation.getTable().isEnabled()) {
			trueEvaluation.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#updateTrueEvaluation()
	 * 
	 */
	public void updateTrueEvaluation() {
	trueEvaluation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addFilterTrueEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTrueEvaluation(ViewerFilter filter) {
		trueEvaluationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addBusinessFilterTrueEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTrueEvaluation(ViewerFilter filter) {
		trueEvaluationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#isContainedInTrueEvaluationTable(EObject element)
	 * 
	 */
	public boolean isContainedInTrueEvaluationTable(EObject element) {
		return ((ReferencesTableSettings)trueEvaluation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#initUndefinedEvaluation(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initUndefinedEvaluation(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		undefinedEvaluation.setContentProvider(contentProvider);
		undefinedEvaluation.setInput(settings);
		undefinedEvaluation.setEnabled(false);
		undefinedEvaluation.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#updateUndefinedEvaluation()
	 * 
	 */
	public void updateUndefinedEvaluation() {
	undefinedEvaluation.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addFilterUndefinedEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToUndefinedEvaluation(ViewerFilter filter) {
		undefinedEvaluationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addBusinessFilterUndefinedEvaluation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToUndefinedEvaluation(ViewerFilter filter) {
		undefinedEvaluationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#isContainedInUndefinedEvaluationTable(EObject element)
	 * 
	 */
	public boolean isContainedInUndefinedEvaluationTable(EObject element) {
		return ((ReferencesTableSettings)undefinedEvaluation.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#initAnalysisTests(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initAnalysisTests(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		analysisTests.setContentProvider(contentProvider);
		analysisTests.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.ContextModel.Properties.analysisTests);
		if (readOnly && analysisTests.getTable().isEnabled()) {
			analysisTests.setEnabled(false);
			analysisTests.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_ReadOnly);
		} else if (!readOnly && !analysisTests.getTable().isEnabled()) {
			analysisTests.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#updateAnalysisTests()
	 * 
	 */
	public void updateAnalysisTests() {
	analysisTests.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addFilterAnalysisTests(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnalysisTests(ViewerFilter filter) {
		analysisTestsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#addBusinessFilterAnalysisTests(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnalysisTests(ViewerFilter filter) {
		analysisTestsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ContextModelPropertiesEditionPart#isContainedInAnalysisTestsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnalysisTestsTable(EObject element) {
		return ((ReferencesTableSettings)analysisTests.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.ContextModel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
