/**
 * Generated with Acceleo
 */
package MoSaRT.parts.forms;

// Start of user code for imports
import MoSaRT.parts.GlobalSystemPropertiesEditionPart;
import MoSaRT.parts.MoSaRTViewsRepository;

import MoSaRT.providers.MoSaRTMessages;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.PlatformUI;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class GlobalSystemPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GlobalSystemPropertiesEditionPart {

	protected Text name;
	protected SelectionDialog analysisRepositoryLocation;
	protected Text comment;



	/**
	 * For {@link ISection} use only.
	 */
	public GlobalSystemPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GlobalSystemPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence globalSystemStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = globalSystemStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.class);
		propertiesStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.name);
		propertiesStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation);
		propertiesStep.addStep(MoSaRTViewsRepository.GlobalSystem.Properties.comment);
		
		
		composer = new PartComposer(globalSystemStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation) {
					return createAnalysisRepositoryLocationSelectionDialog(widgetFactory, parent);
				}
				if (key == MoSaRTViewsRepository.GlobalSystem.Properties.comment) {
					return createCommentTextarea(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(MoSaRTMessages.GlobalSystemPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MoSaRTViewsRepository.GlobalSystem.Properties.name, MoSaRTMessages.GlobalSystemPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GlobalSystemPropertiesEditionPartForm.this,
							MoSaRTViewsRepository.GlobalSystem.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GlobalSystemPropertiesEditionPartForm.this,
									MoSaRTViewsRepository.GlobalSystem.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GlobalSystemPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartForm.this, MoSaRTViewsRepository.GlobalSystem.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, MoSaRTViewsRepository.GlobalSystem.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTViewsRepository.GlobalSystem.Properties.name, MoSaRTViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAnalysisRepositoryLocationSelectionDialog(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, MoSaRTMessages.GlobalSystemPropertiesEditionPart_AnalysisRepositoryLocationLabel);
		analysisRepositoryLocation = new SelectionDialog(parent, SWT.NONE, widgetFactory);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartForm.this, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, analysisRepositoryLocation.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartForm.this, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, analysisRepositoryLocation.getText()));
				}
			}
		});
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, MoSaRTViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected void analysisRepositoryLocationSelectionDialog() {
	//Start of user code browse button selection dialog
		if (PlatformUI.getWorkbench() != null && PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null) {
			Shell theShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			IFile[] file = WorkspaceResourceDialog.openFileSelection(theShell, "Analysis Repository Selection", "", false, null, null);
			if(file.length == 1) {
				String path = file[0].getRawLocation().makeAbsolute().toOSString();
				analysisRepositoryLocation.setText(path);
				//analysisRepositoryLocation.setText(file[0].getProject().getName() + "/" + file[0].getProjectRelativePath().toString());
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GlobalSystemPropertiesEditionPartForm.this, MoSaRTViewsRepository.GlobalSystem.Properties.analysisRepositoryLocation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, analysisRepositoryLocation.getText()));
			}
		}
	//End of user code
	}

	
	protected Composite createCommentTextarea(FormToolkit widgetFactory, Composite parent) {
		Label commentLabel = createDescription(parent, MoSaRTViewsRepository.GlobalSystem.Properties.comment, MoSaRTMessages.GlobalSystemPropertiesEditionPart_CommentLabel);
		GridData commentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		commentLabelData.horizontalSpan = 3;
		commentLabel.setLayoutData(commentLabelData);
		comment = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
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
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GlobalSystemPropertiesEditionPartForm.this,
							MoSaRTViewsRepository.GlobalSystem.Properties.comment,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, comment.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GlobalSystemPropertiesEditionPartForm.this,
									MoSaRTViewsRepository.GlobalSystem.Properties.comment,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, comment.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GlobalSystemPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		EditingUtils.setID(comment, MoSaRTViewsRepository.GlobalSystem.Properties.comment);
		EditingUtils.setEEFtype(comment, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(MoSaRTViewsRepository.GlobalSystem.Properties.comment, MoSaRTViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
