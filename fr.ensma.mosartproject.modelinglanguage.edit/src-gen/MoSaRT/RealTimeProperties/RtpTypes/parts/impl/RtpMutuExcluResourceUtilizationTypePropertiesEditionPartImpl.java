/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

// End of user code

/**
 * 
 * 
 */
public class RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpMutuExcluResourceUtilizationTypePropertiesEditionPart {

	protected EObjectFlatComboViewer resource;
	private SingleCompositionEditor timeUtilization;
	private SingleCompositionEditor specialAccessPriority;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpMutuExcluResourceUtilizationTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = rtpMutuExcluResourceUtilizationTypeStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.class);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		propertiesStep.addStep(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		
		
		composer = new PartComposer(rtpMutuExcluResourceUtilizationTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource) {
					return createResourceFlatComboViewer(parent);
				}
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization) {
					return createTimeUtilizationSingleCompositionEditor(parent);
				}
				if (key == RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority) {
					return createSpecialAccessPrioritySingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_ResourceLabel);
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, RtpTypesViewsRepository.SWT_KIND));
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl.this, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.setID(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createTimeUtilizationSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_TimeUtilizationLabel);
		//create widget
		timeUtilization = new SingleCompositionEditor(parent, SWT.NONE);
		GridData timeUtilizationData = new GridData(GridData.FILL_HORIZONTAL);
		timeUtilization.setLayoutData(timeUtilizationData);
		timeUtilization.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				timeUtilization.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				timeUtilization.refresh();
			}
		});
		timeUtilization.setID(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createSpecialAccessPrioritySingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, RtpTypesMessages.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart_SpecialAccessPriorityLabel);
		//create widget
		specialAccessPriority = new SingleCompositionEditor(parent, SWT.NONE);
		GridData specialAccessPriorityData = new GridData(GridData.FILL_HORIZONTAL);
		specialAccessPriority.setLayoutData(specialAccessPriorityData);
		specialAccessPriority.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				specialAccessPriority.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpMutuExcluResourceUtilizationTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				specialAccessPriority.refresh();
			}
		});
		specialAccessPriority.setID(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#getResource()
	 * 
	 */
	public EObject getResource() {
		if (resource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) resource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#initResource(EObjectFlatComboSettings)
	 */
	public void initResource(EObjectFlatComboSettings settings) {
		resource.setInput(settings);
		if (current != null) {
			resource.setSelection(new StructuredSelection(settings.getValue()));
		}
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		if (readOnly && resource.isEnabled()) {
			resource.setEnabled(false);
			resource.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !resource.isEnabled()) {
			resource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setResource(EObject newValue)
	 * 
	 */
	public void setResource(EObject newValue) {
		if (newValue != null) {
			resource.setSelection(new StructuredSelection(newValue));
		} else {
			resource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.resource);
		if (readOnly && resource.isEnabled()) {
			resource.setEnabled(false);
			resource.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !resource.isEnabled()) {
			resource.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue) {
		resource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#addFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter) {
		resource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#addBusinessFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter) {
		resource.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#getTimeUtilization()
	 * 
	 */
	public EObject getTimeUtilization() {
		return (EObject) timeUtilization.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#initTimeUtilization(EObjectFlatComboSettings)
	 */
	public void initTimeUtilization(EObjectFlatComboSettings settings) {
		timeUtilization.setAdapterFactory(adapterFactory);
		timeUtilization.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		if (readOnly && timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(false);
			timeUtilization.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setTimeUtilization(EObject newValue)
	 * 
	 */
	public void setTimeUtilization(EObject newValue) {
		timeUtilization.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.timeUtilization);
		if (readOnly && timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(false);
			timeUtilization.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !timeUtilization.isEnabled()) {
			timeUtilization.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#getSpecialAccessPriority()
	 * 
	 */
	public EObject getSpecialAccessPriority() {
		return (EObject) specialAccessPriority.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#initSpecialAccessPriority(EObjectFlatComboSettings)
	 */
	public void initSpecialAccessPriority(EObjectFlatComboSettings settings) {
		specialAccessPriority.setAdapterFactory(adapterFactory);
		specialAccessPriority.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		if (readOnly && specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(false);
			specialAccessPriority.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpMutuExcluResourceUtilizationTypePropertiesEditionPart#setSpecialAccessPriority(EObject newValue)
	 * 
	 */
	public void setSpecialAccessPriority(EObject newValue) {
		specialAccessPriority.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpMutuExcluResourceUtilizationType.Properties.specialAccessPriority);
		if (readOnly && specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(false);
			specialAccessPriority.setToolTipText(RtpTypesMessages.RtpMutuExcluResourceUtilizationType_ReadOnly);
		} else if (!readOnly && !specialAccessPriority.isEnabled()) {
			specialAccessPriority.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpMutuExcluResourceUtilizationType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
