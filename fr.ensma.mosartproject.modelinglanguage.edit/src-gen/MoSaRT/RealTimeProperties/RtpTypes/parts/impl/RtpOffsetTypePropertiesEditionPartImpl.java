/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts.impl;

// Start of user code for imports
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpOffsetTypePropertiesEditionPart;
import MoSaRT.RealTimeProperties.RtpTypes.parts.RtpTypesViewsRepository;

import MoSaRT.RealTimeProperties.RtpTypes.providers.RtpTypesMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor;

import org.eclipse.emf.eef.runtime.ui.widgets.SingleCompositionEditor.SingleCompositionListener;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

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
public class RtpOffsetTypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, RtpOffsetTypePropertiesEditionPart {

	private SingleCompositionEditor offset;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public RtpOffsetTypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence rtpOffsetTypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		rtpOffsetTypeStep
			.addStep(RtpTypesViewsRepository.RtpOffsetType.Properties.class)
			.addStep(RtpTypesViewsRepository.RtpOffsetType.Properties.offset);
		
		
		composer = new PartComposer(rtpOffsetTypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == RtpTypesViewsRepository.RtpOffsetType.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == RtpTypesViewsRepository.RtpOffsetType.Properties.offset) {
					return createOffsetSingleCompositionEditor(parent);
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
		propertiesGroup.setText(RtpTypesMessages.RtpOffsetTypePropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createOffsetSingleCompositionEditor(Composite parent) {
		createDescription(parent, RtpTypesViewsRepository.RtpOffsetType.Properties.offset, RtpTypesMessages.RtpOffsetTypePropertiesEditionPart_OffsetLabel);
		//create widget
		offset = new SingleCompositionEditor(parent, SWT.NONE);
		GridData offsetData = new GridData(GridData.FILL_HORIZONTAL);
		offset.setLayoutData(offsetData);
		offset.addEditorListener(new SingleCompositionListener() {
			
			public void edit() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpOffsetTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpOffsetType.Properties.offset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, null));				
				offset.refresh();
			}
			
			public void clear() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(RtpOffsetTypePropertiesEditionPartImpl.this,  RtpTypesViewsRepository.RtpOffsetType.Properties.offset, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.UNSET, null, null));
				offset.refresh();
			}
		});
		offset.setID(RtpTypesViewsRepository.RtpOffsetType.Properties.offset);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(RtpTypesViewsRepository.RtpOffsetType.Properties.offset, RtpTypesViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpOffsetTypePropertiesEditionPart#getOffset()
	 * 
	 */
	public EObject getOffset() {
		return (EObject) offset.getInput();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpOffsetTypePropertiesEditionPart#initOffset(EObjectFlatComboSettings)
	 */
	public void initOffset(EObjectFlatComboSettings settings) {
		offset.setAdapterFactory(adapterFactory);
		offset.setInput(settings);
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpOffsetType.Properties.offset);
		if (readOnly && offset.isEnabled()) {
			offset.setEnabled(false);
			offset.setToolTipText(RtpTypesMessages.RtpOffsetType_ReadOnly);
		} else if (!readOnly && !offset.isEnabled()) {
			offset.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.RealTimeProperties.RtpTypes.parts.RtpOffsetTypePropertiesEditionPart#setOffset(EObject newValue)
	 * 
	 */
	public void setOffset(EObject newValue) {
		offset.refresh();
		boolean readOnly = isReadOnly(RtpTypesViewsRepository.RtpOffsetType.Properties.offset);
		if (readOnly && offset.isEnabled()) {
			offset.setEnabled(false);
			offset.setToolTipText(RtpTypesMessages.RtpOffsetType_ReadOnly);
		} else if (!readOnly && !offset.isEnabled()) {
			offset.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return RtpTypesMessages.RtpOffsetType_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
