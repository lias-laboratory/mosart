/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbPrecedenceRelationPropertiesEditionPart;
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SoftwareBehaviorViewsRepository;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.providers.SoftwareBehaviorMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class SbPrecedenceRelationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbPrecedenceRelationPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer targetSchedulingActivity;
	protected EObjectFlatComboViewer sourceSchedulingActivity;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbPrecedenceRelationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbPrecedenceRelationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbPrecedenceRelationStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity);
		
		
		composer = new PartComposer(sbPrecedenceRelationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity) {
					return createTargetSchedulingActivityFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity) {
					return createSourceSchedulingActivityFlatComboViewer(parent);
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetSchedulingActivityFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_TargetSchedulingActivityLabel);
		targetSchedulingActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, SoftwareBehaviorViewsRepository.SWT_KIND));
		targetSchedulingActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetSchedulingActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetSchedulingActivity()));
			}

		});
		GridData targetSchedulingActivityData = new GridData(GridData.FILL_HORIZONTAL);
		targetSchedulingActivity.setLayoutData(targetSchedulingActivityData);
		targetSchedulingActivity.setID(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.targetSchedulingActivity, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceSchedulingActivityFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, SoftwareBehaviorMessages.SbPrecedenceRelationPropertiesEditionPart_SourceSchedulingActivityLabel);
		sourceSchedulingActivity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, SoftwareBehaviorViewsRepository.SWT_KIND));
		sourceSchedulingActivity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sourceSchedulingActivity.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSourceSchedulingActivity()));
			}

		});
		GridData sourceSchedulingActivityData = new GridData(GridData.FILL_HORIZONTAL);
		sourceSchedulingActivity.setLayoutData(sourceSchedulingActivityData);
		sourceSchedulingActivity.setID(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbPrecedenceRelation.Properties.sourceSchedulingActivity, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
