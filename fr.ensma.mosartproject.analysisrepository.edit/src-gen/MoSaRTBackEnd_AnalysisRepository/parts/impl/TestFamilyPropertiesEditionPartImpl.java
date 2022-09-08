/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.impl;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.MoSaRTBackEnd_AnalysisRepositoryPackage;

import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;
import MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart;

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
public class TestFamilyPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TestFamilyPropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected Text references;
	protected Button editReferences;
	private EList referencesList;
	protected ReferencesTable containedTests;
	protected List<ViewerFilter> containedTestsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> containedTestsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TestFamilyPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence testFamilyStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = testFamilyStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests);
		
		
		composer = new PartComposer(testFamilyStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name) {
					return createNameText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references) {
					return createReferencesMultiValuedEditor(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests) {
					return createContainedTestsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamilyPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamilyPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamilyPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createReferencesMultiValuedEditor(Composite parent) {
		references = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData referencesData = new GridData(GridData.FILL_HORIZONTAL);
		referencesData.horizontalSpan = 2;
		references.setLayoutData(referencesData);
		EditingUtils.setID(references, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references);
		EditingUtils.setEEFtype(references, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editReferences = new Button(parent, SWT.NONE);
		editReferences.setText(getDescription(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references, MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamilyPropertiesEditionPart_ReferencesLabel));
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
						references.getShell(), "TestFamily", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						referencesList, MoSaRTBackEnd_AnalysisRepositoryPackage.eINSTANCE.getTestFamily_References().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					referencesList = dialog.getResult();
					if (referencesList == null) {
						referencesList = new BasicEList();
					}
					references.setText(referencesList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(referencesList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editReferences, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references);
		EditingUtils.setEEFtype(editReferences, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createContainedTestsAdvancedReferencesTable(Composite parent) {
		String label = MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamilyPropertiesEditionPart_ContainedTestsLabel;
		this.containedTests = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addContainedTests(); }
			public void handleEdit(EObject element) { editContainedTests(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveContainedTests(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromContainedTests(element); }
			public void navigateTo(EObject element) { }
		});
		this.containedTests.setHelpText(propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		this.containedTests.createControls(parent);
		this.containedTests.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData containedTestsData = new GridData(GridData.FILL_HORIZONTAL);
		containedTestsData.horizontalSpan = 3;
		this.containedTests.setLayoutData(containedTestsData);
		this.containedTests.disableMove();
		containedTests.setID(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests);
		containedTests.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addContainedTests() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(containedTests.getInput(), containedTestsFilters, containedTestsBusinessFilters,
		"contained Tests", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				containedTests.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveContainedTests(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		containedTests.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromContainedTests(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TestFamilyPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		containedTests.refresh();
	}

	/**
	 * 
	 */
	protected void editContainedTests(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				containedTests.refresh();
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamily_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamily_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#getReferences()
	 * 
	 */
	public EList getReferences() {
		return referencesList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#setReferences(EList newValue)
	 * 
	 */
	public void setReferences(EList newValue) {
		referencesList = newValue;
		if (newValue != null) {
			references.setText(referencesList.toString());
		} else {
			references.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.references);
		if (readOnly && references.isEnabled()) {
			references.setEnabled(false);
			references.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamily_ReadOnly);
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#initContainedTests(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initContainedTests(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		containedTests.setContentProvider(contentProvider);
		containedTests.setInput(settings);
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.TestFamily.Properties.containedTests);
		if (readOnly && containedTests.getTable().isEnabled()) {
			containedTests.setEnabled(false);
			containedTests.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamily_ReadOnly);
		} else if (!readOnly && !containedTests.getTable().isEnabled()) {
			containedTests.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#updateContainedTests()
	 * 
	 */
	public void updateContainedTests() {
	containedTests.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#addFilterContainedTests(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContainedTests(ViewerFilter filter) {
		containedTestsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#addBusinessFilterContainedTests(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContainedTests(ViewerFilter filter) {
		containedTestsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.TestFamilyPropertiesEditionPart#isContainedInContainedTestsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContainedTestsTable(EObject element) {
		return ((ReferencesTableSettings)containedTests.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.TestFamily_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
