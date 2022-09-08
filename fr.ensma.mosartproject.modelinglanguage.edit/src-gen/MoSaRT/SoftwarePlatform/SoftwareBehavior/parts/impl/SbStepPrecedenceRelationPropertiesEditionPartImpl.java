/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.impl;

// Start of user code for imports
import MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart;
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
public class SbStepPrecedenceRelationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SbStepPrecedenceRelationPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer sourceStep;
	protected EObjectFlatComboViewer targetStep;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SbStepPrecedenceRelationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence sbStepPrecedenceRelationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = sbStepPrecedenceRelationStep.addStep(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.class);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep);
		propertiesStep.addStep(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep);
		
		
		composer = new PartComposer(sbStepPrecedenceRelationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name) {
					return createNameText(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep) {
					return createSourceStepFlatComboViewer(parent);
				}
				if (key == SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep) {
					return createTargetStepFlatComboViewer(parent);
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
		propertiesGroup.setText(SoftwareBehaviorMessages.SbStepPrecedenceRelationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name, SoftwareBehaviorMessages.SbStepPrecedenceRelationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbStepPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbStepPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSourceStepFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep, SoftwareBehaviorMessages.SbStepPrecedenceRelationPropertiesEditionPart_SourceStepLabel);
		sourceStep = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep, SoftwareBehaviorViewsRepository.SWT_KIND));
		sourceStep.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		sourceStep.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbStepPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getSourceStep()));
			}

		});
		GridData sourceStepData = new GridData(GridData.FILL_HORIZONTAL);
		sourceStep.setLayoutData(sourceStepData);
		sourceStep.setID(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTargetStepFlatComboViewer(Composite parent) {
		createDescription(parent, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep, SoftwareBehaviorMessages.SbStepPrecedenceRelationPropertiesEditionPart_TargetStepLabel);
		targetStep = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep, SoftwareBehaviorViewsRepository.SWT_KIND));
		targetStep.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		targetStep.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SbStepPrecedenceRelationPropertiesEditionPartImpl.this, SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getTargetStep()));
			}

		});
		GridData targetStepData = new GridData(GridData.FILL_HORIZONTAL);
		targetStep.setLayoutData(targetStepData);
		targetStep.setID(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep, SoftwareBehaviorViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(SoftwareBehaviorMessages.SbStepPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#getSourceStep()
	 * 
	 */
	public EObject getSourceStep() {
		if (sourceStep.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourceStep.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#initSourceStep(EObjectFlatComboSettings)
	 */
	public void initSourceStep(EObjectFlatComboSettings settings) {
		sourceStep.setInput(settings);
		if (current != null) {
			sourceStep.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep);
		if (readOnly && sourceStep.isEnabled()) {
			sourceStep.setEnabled(false);
			sourceStep.setToolTipText(SoftwareBehaviorMessages.SbStepPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !sourceStep.isEnabled()) {
			sourceStep.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#setSourceStep(EObject newValue)
	 * 
	 */
	public void setSourceStep(EObject newValue) {
		if (newValue != null) {
			sourceStep.setSelection(new StructuredSelection(newValue));
		} else {
			sourceStep.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.sourceStep);
		if (readOnly && sourceStep.isEnabled()) {
			sourceStep.setEnabled(false);
			sourceStep.setToolTipText(SoftwareBehaviorMessages.SbStepPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !sourceStep.isEnabled()) {
			sourceStep.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#setSourceStepButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceStepButtonMode(ButtonsModeEnum newValue) {
		sourceStep.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#addFilterSourceStep(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSourceStep(ViewerFilter filter) {
		sourceStep.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#addBusinessFilterSourceStep(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSourceStep(ViewerFilter filter) {
		sourceStep.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#getTargetStep()
	 * 
	 */
	public EObject getTargetStep() {
		if (targetStep.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetStep.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#initTargetStep(EObjectFlatComboSettings)
	 */
	public void initTargetStep(EObjectFlatComboSettings settings) {
		targetStep.setInput(settings);
		if (current != null) {
			targetStep.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep);
		if (readOnly && targetStep.isEnabled()) {
			targetStep.setEnabled(false);
			targetStep.setToolTipText(SoftwareBehaviorMessages.SbStepPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !targetStep.isEnabled()) {
			targetStep.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#setTargetStep(EObject newValue)
	 * 
	 */
	public void setTargetStep(EObject newValue) {
		if (newValue != null) {
			targetStep.setSelection(new StructuredSelection(newValue));
		} else {
			targetStep.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(SoftwareBehaviorViewsRepository.SbStepPrecedenceRelation.Properties.targetStep);
		if (readOnly && targetStep.isEnabled()) {
			targetStep.setEnabled(false);
			targetStep.setToolTipText(SoftwareBehaviorMessages.SbStepPrecedenceRelation_ReadOnly);
		} else if (!readOnly && !targetStep.isEnabled()) {
			targetStep.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#setTargetStepButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetStepButtonMode(ButtonsModeEnum newValue) {
		targetStep.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#addFilterTargetStep(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetStep(ViewerFilter filter) {
		targetStep.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.SoftwarePlatform.SoftwareBehavior.parts.SbStepPrecedenceRelationPropertiesEditionPart#addBusinessFilterTargetStep(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetStep(ViewerFilter filter) {
		targetStep.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return SoftwareBehaviorMessages.SbStepPrecedenceRelation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
