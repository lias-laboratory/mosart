/**
 * Generated with Acceleo
 */
package MoSaRT.parts.impl;

// Start of user code for imports
import MoSaRT.parts.GlobalSystemPropertiesEditionPart;
import MoSaRT.parts.MoSaRTViewsRepository;

import MoSaRT.providers.MoSaRTMessages;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;

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
import org.eclipse.emf.eef.runtime.ui.widgets.SelectionDialog;

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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.PlatformUI;

// End of user code

/**
 * 
 * 
 */
public class GlobalSystemPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GlobalSystemPropertiesEditionPart {

	protected Text name;
	protected SelectionDialog analysisRepositoryLocation;
	protected Text comment;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GlobalSystemPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence globalSystemStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = globalSystemStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.class);
		propertiesStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.name);
		propertiesStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation);
		propertiesStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.comment);
		
		
		composer = new PartComposer(globalSystemStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.name) {
					return createNameText(parent);
				}
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation) {
					return createAnalysisRepositoryLocationSelectionDialog(parent);
				}
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.comment) {
					return createCommentTextarea(parent);
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
		propertiesGroup.setText(MoSaRTMessages.GlobalSystemPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, MoSaRTViewsRepository.GlobalSystem.Properties.name, MoSaRTMessages.GlobalSystemPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartImpl.this, MoSaRTViewsRepository.GlobalSystem.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartImpl.this, MoSaRTViewsRepository.GlobalSystem.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, MoSaRTViewsRepository.GlobalSystem.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTViewsRepository.GlobalSystem.Properties.name, MoSaRTViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAnalysisRepositoryLocationSelectionDialog(Composite parent) {
		createDescription(parent, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, MoSaRTMessages.GlobalSystemPropertiesEditionPart_AnalysisRepositoryLocationLabel);
		analysisRepositoryLocation = new SelectionDialog(parent, SWT.NONE);
		GridData generatorData = new GridData(GridData.FILL_HORIZONTAL);
		analysisRepositoryLocation.setLayoutData(generatorData);

		analysisRepositoryLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					analysisRepositoryLocationSelectionDialog();
			}
		});

		analysisRepositoryLocation.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartImpl.this, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, analysisRepositoryLocation.getText()));
			}
		});
		analysisRepositoryLocation.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartImpl.this, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, analysisRepositoryLocation.getText()));
				}
			}
		});
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, MoSaRTViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected void analysisRepositoryLocationSelectionDialog() {
	//Start of user code browse button selection dialog
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell theShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IFile[] file = WorkspaceResourceDialog.openFileSelection(theShell, "File Selection", "", false, null, null);
			if(file.length == 1) {
				analysisRepositoryLocation.setText(file[0].getProject().getName() + "/" + file[0].getProjectRelativePath().toString());
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartImpl.this, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, analysisRepositoryLocation.getText()));
			}
		}
	//End of user code
	}

	
	protected Composite createCommentTextarea(Composite parent) {
		Label commentLabel = createDescription(parent, MoSaRTViewsRepository.GlobalSystem.Properties.comment, MoSaRTMessages.GlobalSystemPropertiesEditionPart_CommentLabel);
		GridData commentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		commentLabelData.horizontalSpan = 3;
		commentLabel.setLayoutData(commentLabelData);
		comment = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData commentData = new GridData(GridData.FILL_HORIZONTAL);
		commentData.horizontalSpan = 2;
		commentData.heightHint = 80;
		commentData.widthHint = 200;
		comment.setLayoutData(commentData);
		comment.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartImpl.this, MoSaRTViewsRepository.GlobalSystem.Properties.comment, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
			}

		});
		EditingUtils.setID(comment, MoSaRTViewsRepository.GlobalSystem.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(MoSaRTViewsRepository.GlobalSystem.Properties.comment, MoSaRTViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see MoSaRT.parts.GlobalSystemPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.parts.GlobalSystemPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTViewsRepository.GlobalSystem.Properties.name);
		if (readOnly && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(MoSaRTMessages.GlobalSystem_ReadOnly);
		} else if (!readOnly && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.parts.GlobalSystemPropertiesEditionPart#getAnalysisRepositoryLocation()
	 * 
	 */
	public String getAnalysisRepositoryLocation() {
		return analysisRepositoryLocation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.parts.GlobalSystemPropertiesEditionPart#setAnalysisRepositoryLocation(String newValue)
	 * 
	 */
	public void setAnalysisRepositoryLocation(String newValue) {
		if (newValue != null) {
			analysisRepositoryLocation.setText(newValue);
		} else {
			analysisRepositoryLocation.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation);
		if (readOnly && analysisRepositoryLocation.isEnabled()) {
			analysisRepositoryLocation.setEnabled(false);
			analysisRepositoryLocation.setToolTipText(MoSaRTMessages.GlobalSystem_ReadOnly);
		} else if (!readOnly && !analysisRepositoryLocation.isEnabled()) {
			analysisRepositoryLocation.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.parts.GlobalSystemPropertiesEditionPart#getComment()
	 * 
	 */
	public String getComment() {
		return comment.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see MoSaRT.parts.GlobalSystemPropertiesEditionPart#setComment(String newValue)
	 * 
	 */
	public void setComment(String newValue) {
		if (newValue != null) {
			comment.setText(newValue);
		} else {
			comment.setText(""); //$NON-NLS-1$
		}
		boolean readOnly = isReadOnly(MoSaRTViewsRepository.GlobalSystem.Properties.comment);
		if (readOnly && comment.isEnabled()) {
			comment.setEnabled(false);
			comment.setBackground(comment.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
			comment.setToolTipText(MoSaRTMessages.GlobalSystem_ReadOnly);
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
		return MoSaRTMessages.GlobalSystem_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
