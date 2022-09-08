/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class RtpCooperativeTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpCooperativeTypePropertiesEditionPart {

	protected ReferencesTable nonPreemptibleSteps;
	protected List<ViewerFilter> nonPreemptibleStepsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> nonPreemptibleStepsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable nonPreemptibleIntervals;
	protected List<ViewerFilter> nonPreemptibleIntervalsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> nonPreemptibleIntervalsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpCooperativeTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpCooperativeTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpCooperativeTypeStep.addStep(RtpTypesViewsRepository.RtpCooperativeType.Properties.class);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals);
		
		
		composer = new PartComposer(rtpCooperativeTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpCooperativeType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps) {
					return createNonPreemptibleStepsAdvancedReferencesTable(parent);
				}
				if (key == RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals) {
					return createNonPreemptibleIntervalsAdvancedTableComposition(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpCooperativeTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createNonPreemptibleStepsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps, RtpTypesMessages.RtpCooperativeTypePropertiesEditionPart_NonPreemptibleStepsLabel);		 
		this.nonPreemptibleSteps = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addNonPreemptibleSteps(); }
			public void handleEdit(EObject element) { editNonPreemptibleSteps(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveNonPreemptibleSteps(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromNonPreemptibleSteps(element); }
			public void navigateTo(EObject element) { }
		});
		this.nonPreemptibleSteps.setHelpText(propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps, RtpTypesViewsRepository.SWT_KIND));
		this.nonPreemptibleSteps.createControls(parent);
		this.nonPreemptibleSteps.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData nonPreemptibleStepsData = new GridData(GridData.FILL_HORIZONTAL);
		nonPreemptibleStepsData.horizontalSpan = 3;
		this.nonPreemptibleSteps.setLayoutData(nonPreemptibleStepsData);
		this.nonPreemptibleSteps.disableMove();
		nonPreemptibleSteps.setID(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps);
		nonPreemptibleSteps.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addNonPreemptibleSteps() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(nonPreemptibleSteps.getInput(), nonPreemptibleStepsFilters, nonPreemptibleStepsBusinessFilters,
		"nonPreemptibleSteps", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				nonPreemptibleSteps.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveNonPreemptibleSteps(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		nonPreemptibleSteps.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromNonPreemptibleSteps(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		nonPreemptibleSteps.refresh();
	}

	/**
	 * 
	 */
	protected void editNonPreemptibleSteps(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				nonPreemptibleSteps.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createNonPreemptibleIntervalsAdvancedTableComposition(Composite parent) {
		this.nonPreemptibleIntervals = new ReferencesTable(getDescription(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, RtpTypesMessages.RtpCooperativeTypePropertiesEditionPart_NonPreemptibleIntervalsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				nonPreemptibleIntervals.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				nonPreemptibleIntervals.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				nonPreemptibleIntervals.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				nonPreemptibleIntervals.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.nonPreemptibleIntervalsFilters) {
			this.nonPreemptibleIntervals.addFilter(filter);
		}
		this.nonPreemptibleIntervals.setHelpText(propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, RtpTypesViewsRepository.SWT_KIND));
		this.nonPreemptibleIntervals.createControls(parent);
		this.nonPreemptibleIntervals.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpCooperativeTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData nonPreemptibleIntervalsData = new GridData(GridData.FILL_HORIZONTAL);
		nonPreemptibleIntervalsData.horizontalSpan = 3;
		this.nonPreemptibleIntervals.setLayoutData(nonPreemptibleIntervalsData);
		this.nonPreemptibleIntervals.setLowerBound(0);
		this.nonPreemptibleIntervals.setUpperBound(-1);
		nonPreemptibleIntervals.setID(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals);
		nonPreemptibleIntervals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#initNonPreemptibleSteps(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initNonPreemptibleSteps(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		nonPreemptibleSteps.setContentProvider(contentProvider);
		nonPreemptibleSteps.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleSteps);
		if (readOnly && nonPreemptibleSteps.getTable().isEnabled()) {
			nonPreemptibleSteps.setEnabled(false);
			nonPreemptibleSteps.setToolTipText(RtpTypesMessages.RtpCooperativeType_ReadOnly);
		} else if (!readOnly && !nonPreemptibleSteps.getTable().isEnabled()) {
			nonPreemptibleSteps.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#updateNonPreemptibleSteps()
	 * 
	 */
	public void updateNonPreemptibleSteps() {
	nonPreemptibleSteps.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#addFilterNonPreemptibleSteps(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNonPreemptibleSteps(ViewerFilter filter) {
		nonPreemptibleStepsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#addBusinessFilterNonPreemptibleSteps(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNonPreemptibleSteps(ViewerFilter filter) {
		nonPreemptibleStepsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#isContainedInNonPreemptibleStepsTable(EObject element)
	 * 
	 */
	public boolean isContainedInNonPreemptibleStepsTable(EObject element) {
		return ((ReferencesTableSettings)nonPreemptibleSteps.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#initNonPreemptibleIntervals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initNonPreemptibleIntervals(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		nonPreemptibleIntervals.setContentProvider(contentProvider);
		nonPreemptibleIntervals.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpCooperativeType.Properties.nonPreemptibleIntervals);
		if (readOnly && nonPreemptibleIntervals.isEnabled()) {
			nonPreemptibleIntervals.setEnabled(false);
			nonPreemptibleIntervals.setToolTipText(RtpTypesMessages.RtpCooperativeType_ReadOnly);
		} else if (!readOnly && !nonPreemptibleIntervals.isEnabled()) {
			nonPreemptibleIntervals.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#updateNonPreemptibleIntervals()
	 * 
	 */
	public void updateNonPreemptibleIntervals() {
	nonPreemptibleIntervals.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#addFilterNonPreemptibleIntervals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToNonPreemptibleIntervals(ViewerFilter filter) {
		nonPreemptibleIntervalsFilters.add(filter);
		if (this.nonPreemptibleIntervals != null) {
			this.nonPreemptibleIntervals.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#addBusinessFilterNonPreemptibleIntervals(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToNonPreemptibleIntervals(ViewerFilter filter) {
		nonPreemptibleIntervalsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpCooperativeTypePropertiesEditionPart#isContainedInNonPreemptibleIntervalsTable(EObject element)
	 * 
	 */
	public boolean isContainedInNonPreemptibleIntervalsTable(EObject element) {
		return ((ReferencesTableSettings)nonPreemptibleIntervals.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpCooperativeType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
