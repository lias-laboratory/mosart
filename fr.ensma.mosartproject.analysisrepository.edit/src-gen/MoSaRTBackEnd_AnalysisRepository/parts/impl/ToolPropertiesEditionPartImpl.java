/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts.impl;

// Start of user code for imports
import MoSaRTBackEnd_AnalysisRepository.parts.MoSaRTBackEnd_AnalysisRepositoryViewsRepository;
import MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart;

import MoSaRTBackEnd_AnalysisRepository.providers.MoSaRTBackEnd_AnalysisRepositoryMessages;

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

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

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
public class ToolPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ToolPropertiesEditionPart {

	protected Text id;
	protected Text name;
	protected Text description;
	protected Text locationOfMoSaRTToToolTransformationProgram;
	protected Text locationOfToolToMoSaRTTransformationProgram;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ToolPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence toolStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = toolStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.class);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram);
		propertiesStep.addStep(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram);
		
		
		composer = new PartComposer(toolStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id) {
					return createIdText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name) {
					return createNameText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram) {
					return createLocationOfMoSaRTToToolTransformationProgramText(parent);
				}
				if (key == MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram) {
					return createLocationOfToolToMoSaRTTransformationProgramText(parent);
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
		propertiesGroup.setText(MoSaRTBackEnd_AnalysisRepositoryMessages.ToolPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createIdText(Composite parent) {
		createDescription(parent, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id, MoSaRTBackEnd_AnalysisRepositoryMessages.ToolPropertiesEditionPart_IdLabel);
		id = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name, MoSaRTBackEnd_AnalysisRepositoryMessages.ToolPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description, MoSaRTBackEnd_AnalysisRepositoryMessages.ToolPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocationOfMoSaRTToToolTransformationProgramText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.ToolPropertiesEditionPart_LocationOfMoSaRTToToolTransformationProgramLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		locationOfMoSaRTToToolTransformationProgram = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData locationOfMoSaRTToToolTransformationProgramData = new GridData(GridData.FILL_HORIZONTAL);
		locationOfMoSaRTToToolTransformationProgram.setLayoutData(locationOfMoSaRTToToolTransformationProgramData);
		locationOfMoSaRTToToolTransformationProgram.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfMoSaRTToToolTransformationProgram.getText()));
			}

		});
		locationOfMoSaRTToToolTransformationProgram.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfMoSaRTToToolTransformationProgram.getText()));
				}
			}

		});
		EditingUtils.setID(locationOfMoSaRTToToolTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram);
		EditingUtils.setEEFtype(locationOfMoSaRTToToolTransformationProgram, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLocationOfToolToMoSaRTTransformationProgramText(Composite parent) {
		SWTUtils.createPartLabel(parent, MoSaRTBackEnd_AnalysisRepositoryMessages.ToolPropertiesEditionPart_LocationOfToolToMoSaRTTransformationProgramLabel, propertiesEditionComponent.isRequired(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND));
		locationOfToolToMoSaRTTransformationProgram = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData locationOfToolToMoSaRTTransformationProgramData = new GridData(GridData.FILL_HORIZONTAL);
		locationOfToolToMoSaRTTransformationProgram.setLayoutData(locationOfToolToMoSaRTTransformationProgramData);
		locationOfToolToMoSaRTTransformationProgram.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfToolToMoSaRTTransformationProgram.getText()));
			}

		});
		locationOfToolToMoSaRTTransformationProgram.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ToolPropertiesEditionPartImpl.this, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, locationOfToolToMoSaRTTransformationProgram.getText()));
				}
			}

		});
		EditingUtils.setID(locationOfToolToMoSaRTTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram);
		EditingUtils.setEEFtype(locationOfToolToMoSaRTTransformationProgram, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram, MoSaRTBackEnd_AnalysisRepositoryViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.id);
		if (readOnly && id.isEnabled()) {
			id.setEnabled(false);
			id.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Tool_ReadOnly);
		} else if (!readOnly && !id.isEnabled()) {
			id.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Tool_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.description);
		if (readOnly && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Tool_ReadOnly);
		} else if (!readOnly && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#getLocationOfMoSaRTToToolTransformationProgram()
	 * 
	 */
	public String getLocationOfMoSaRTToToolTransformationProgram() {
		return locationOfMoSaRTToToolTransformationProgram.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#setLocationOfMoSaRTToToolTransformationProgram(String newValue)
	 * 
	 */
	public void setLocationOfMoSaRTToToolTransformationProgram(String newValue) {
		if (newValue != null) {
			locationOfMoSaRTToToolTransformationProgram.setText(newValue);
		} else {
			locationOfMoSaRTToToolTransformationProgram.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfMoSaRTToToolTransformationProgram);
		if (readOnly && locationOfMoSaRTToToolTransformationProgram.isEnabled()) {
			locationOfMoSaRTToToolTransformationProgram.setEnabled(false);
			locationOfMoSaRTToToolTransformationProgram.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Tool_ReadOnly);
		} else if (!readOnly && !locationOfMoSaRTToToolTransformationProgram.isEnabled()) {
			locationOfMoSaRTToToolTransformationProgram.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#getLocationOfToolToMoSaRTTransformationProgram()
	 * 
	 */
	public String getLocationOfToolToMoSaRTTransformationProgram() {
		return locationOfToolToMoSaRTTransformationProgram.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRTBackEnd_AnalysisRepository.parts.ToolPropertiesEditionPart#setLocationOfToolToMoSaRTTransformationProgram(String newValue)
	 * 
	 */
	public void setLocationOfToolToMoSaRTTransformationProgram(String newValue) {
		if (newValue != null) {
			locationOfToolToMoSaRTTransformationProgram.setText(newValue);
		} else {
			locationOfToolToMoSaRTTransformationProgram.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTBackEnd_AnalysisRepositoryViewsRepository.Tool.Properties.locationOfToolToMoSaRTTransformationProgram);
		if (readOnly && locationOfToolToMoSaRTTransformationProgram.isEnabled()) {
			locationOfToolToMoSaRTTransformationProgram.setEnabled(false);
			locationOfToolToMoSaRTTransformationProgram.setToolTipText(MoSaRTBackEnd_AnalysisRepositoryMessages.Tool_ReadOnly);
		} else if (!readOnly && !locationOfToolToMoSaRTTransformationProgram.isEnabled()) {
			locationOfToolToMoSaRTTransformationProgram.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return MoSaRTBackEnd_AnalysisRepositoryMessages.Tool_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
