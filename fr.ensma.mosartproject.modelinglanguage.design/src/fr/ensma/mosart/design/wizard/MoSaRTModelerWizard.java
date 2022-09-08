package fr.ensma.mosart.design.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelEditPlugin;

import fr.ensma.mosart.design.wizard.MoSaRTToolsDesignPlugin;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.util.ReflectionHelper;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
//import org.eclipse.sirius.ui.tools.api.wizards.page.ViewpointsSelectionWizardPage;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import MoSaRT.GlobalSystem;
import MoSaRT.MoSaRTFactory;

import com.google.common.collect.Lists;

import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;

public class MoSaRTModelerWizard extends BasicNewProjectResourceWizard {

	/** The name of the Design viewpoint. */
	private static final String DESIGN_VIEWPOINT_NAME = "Design";

	private MoSaRTModelSpecPage modelPage;
	//private ViewpointsSelectionWizardPage viewpointsSelectionWizardPage;
	private WizardNewProjectCreationPage wizardNewProjectCreationPage;
	private IProject createdProject;
	
	protected IWorkbench workbench;
	protected IPath ProjectLocation;
	protected String initialProjectName= "MoSaRT Realtime Modeling Project";
	protected IStructuredSelection selection;

	
	ReusedMethod rm = new ReusedMethod();
	// constructor
	public MoSaRTModelerWizard() {super();}
	
/************************************* init Workbench *****************************************/
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) 
		{
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(GenModelEditPlugin.INSTANCE.getImage("full/wizban/NewEmptyEMFProject")));
		setWindowTitle("New MoSaRT Modeling Project");
		setDefaultPageImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(MoSaRTToolsDesignPlugin.PLUGIN_ID,"images/mosart.png"));
		setNeedsProgressMonitor(true);
		}

/***************************************  addPage  ********************************************/
	@Override
	public void addPages() 
		{
		wizardNewProjectCreationPage = new WizardNewProjectCreationPage(SiriusEditPlugin.getPlugin().getString("_UI_ModelingProjectWizard_label")) 
			{
			
			/******************** create Control ***********************/
			@Override
			public void createControl(Composite parent) 
				{
				super.createControl(parent);
				Composite control = (Composite) getControl();
				GridLayout layout = new GridLayout();
				control.setLayout(layout);
				
				Dialog.applyDialogFont(control);
				}
			
			/*********************  validatePage ***********************/
			@Override
			protected boolean validatePage() 
				{
				if (super.validatePage()) 
					{
					IPath locationPath = getLocationPath();
					ProjectLocation = Platform.getLocation().equals(locationPath) ? null : locationPath;
					updateModelPagePackageName(getProjectName());
					return true;
					} 
				else 
					{
					return false;
					}
				}
			
			/****************** updateModelPagePackageName *****************/
			private void updateModelPagePackageName(String projectName) 
				{
				if (!StringUtil.isEmpty(projectName)) 
					{
					String rootModelName = getRootModelName(projectName);
					if (!StringUtil.isEmpty(rootModelName)) 
						{
						modelPage.setPackageNameSilently("");
						}
					}
				}
		};

		wizardNewProjectCreationPage.setInitialProjectName(initialProjectName);
		wizardNewProjectCreationPage.setTitle("Create a new MoSaRT Modeling project"); 
		wizardNewProjectCreationPage.setDescription("Enter a project name"); 

		modelPage = new MoSaRTModelSpecPage("MoSaRT model parameters");
		modelPage.setTitle("Model settings"); 
		modelPage.setDescription("Define the model settings");
		
		//viewpointsSelectionWizardPage = new ViewpointsSelectionWizardPage(null,Lists.newArrayList(DESIGN_VIEWPOINT_NAME)) 
		//	{
		//	@Override
		//	protected Collection<String> computeSemanticFileExtensions(Session session) 
		//		{
		//		Set<String> fileExtensions = new HashSet<String>();
		//		fileExtensions.add("mosart");
		//		return fileExtensions;
		//		}
		//	};

			ReflectionHelper.setFieldValueWithoutException(this,"newProjectCreationPage", wizardNewProjectCreationPage);
			addPage(wizardNewProjectCreationPage);
			addPage(modelPage);
			//addPage(viewpointsSelectionWizardPage);
	}
	
/******************************* perform Finish () ************************************/
	@Override
	public boolean performFinish() {
		boolean finished = true;
		updatePerspective();
		final MoSaRTModelingProjectCreationOperation mosartModelingProjectCreationOperation = new MoSaRTModelingProjectCreationOperation(
				wizardNewProjectCreationPage.getProjectName(),
				modelPage.getGlobalSystem(),
				modelPage.getMoSaRTFileName(),
				modelPage.getRepresentationFileName(),
				//new LinkedHashSet<Viewpoint>(viewpointsSelectionWizardPage.getViewpoints()), 
				this.workbench, 
				ProjectLocation,
				this.wizardNewProjectCreationPage.getSelectedWorkingSets());
			
		try {	
			getContainer().run(true, false,mosartModelingProjectCreationOperation);
			
			} 
		catch (InvocationTargetException e) 
			{
			IStatus status = new Status(IStatus.ERROR,
										MoSaRTToolsDesignPlugin.PLUGIN_ID, 
										IStatus.ERROR,
										e.getMessage(), e);
				
			MoSaRTToolsDesignPlugin.getDefault().getLog().log(status);
			finished = false;
			} 
		catch (InterruptedException e) 
			{
			IStatus status = new Status(IStatus.ERROR,
											MoSaRTToolsDesignPlugin.PLUGIN_ID, IStatus.ERROR,
											e.getMessage(), e);
			MoSaRTToolsDesignPlugin.getDefault().getLog().log(status);
			finished = false;
			}
		try 
			{
			getContainer().run(false, false, new IRunnableWithProgress() 
				{
				public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				try {
					monitor.beginTask("Open the diagram metamodel", 2);
					createdProject 	  = mosartModelingProjectCreationOperation.getNewProject();
					IFile mosartModel = mosartModelingProjectCreationOperation.getMoSaRTModel();
					if (mosartModel  != null && mosartModel.exists()) 
						{
						selectAndReveal(mosartModel);
						} 
					else 
						{
						selectAndReveal(mosartModelingProjectCreationOperation.getNewProject());
						}
					monitor.worked(1);
					openFirstRepresentation(mosartModelingProjectCreationOperation.getNewProject(),new SubProgressMonitor(monitor, 1));
					} 
				finally {
						monitor.done();
						}
				}
			});
		} 
		catch (InvocationTargetException e) 
			{
			IStatus status = new Status(IStatus.ERROR,
					MoSaRTToolsDesignPlugin.PLUGIN_ID, IStatus.ERROR,
					e.getMessage(), e);
			MoSaRTToolsDesignPlugin.getDefault().getLog().log(status);
			finished = false;
			} 
		catch (InterruptedException e) 
			{
			IStatus status = new Status(IStatus.ERROR,
					MoSaRTToolsDesignPlugin.PLUGIN_ID, IStatus.ERROR,
					e.getMessage(), e);
			MoSaRTToolsDesignPlugin.getDefault().getLog().log(status);
			finished = false;
			}
		return finished;
	}
/************************************* getNewProject *************************************/
	@Override
	public IProject getNewProject() {
		return createdProject;
	}
	
/*********************************** select and reveal ***********************************/
	protected void selectAndReveal(IResource newResource) 
		{
		BasicNewResourceWizard.selectAndReveal(newResource,workbench.getActiveWorkbenchWindow());
		EclipseUIUtil.expand(newResource, workbench.getActiveWorkbenchWindow());
		}

/********************************** openFirstRepresentation *******************************/
	private void openFirstRepresentation(IProject project,IProgressMonitor monitor) 
		{
		org.eclipse.sirius.ext.base.Option<ModelingProject> opionalModelingProject = asModelingProject(project);
		if (opionalModelingProject.some()) 
			{
			Session session = opionalModelingProject.get().getSession();
			if (session != null) 
				{
				if (!session.getSelectedViews().isEmpty()) 
					{
					DView view = session.getSelectedViews().iterator().next();
					if (!view.getOwnedRepresentations().isEmpty()) 
						{
						DRepresentation representationToOpen = view.getOwnedRepresentations().get(0);
						DialectUIManager.INSTANCE.openEditor(session,representationToOpen, monitor);
						}
					}
				}
			}
		}

/***************************** set Initial Project Name *******************************/
	public void setInitialProjectName(String value) 
		{
		initialProjectName = value;
		}

/********************************** getRootModelName ************************************/	
	private String getRootModelName(String projectName) 
		{
		String rootModelName = projectName.substring(0, 1).toLowerCase() + projectName.substring(1);
		int index = rootModelName.lastIndexOf('.');
		if (index != -1) 
			{
			rootModelName = rootModelName.substring(index + 1);
			}
		return rootModelName;
		}
	
/********************************** Create Model Page *************************************/
	private class MoSaRTModelSpecPage extends WizardPage 
		{
		private static final String GLS_FIELD_LABEL = "GlobalSystem's name"; 
		private static final String DEFAULT_COMMON_FILE_NAME = "model";
		private Text rootModelNameField;
		private GlobalSystem globalsystem;
		private boolean silentModificationEnabled = true;
		//constructor
		public MoSaRTModelSpecPage(String name) 
			{
			super(name);
			}
		
		/*********** set default model name ************/
		public void setPackageNameSilently(String rootModelName) 
			{
			if (rootModelNameField != null && silentModificationEnabled) 
				{
				rootModelNameField.setText(rootModelName);
				}
			}
		
		/**************** create control ***************/
		public void createControl(Composite parent) 
			{
			Composite composite = new Composite(parent, SWT.NULL);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(GridData.FILL_BOTH));
			createModelGroup(composite);
			setPageComplete(validatePage());
			setControl(composite);
			Dialog.applyDialogFont(composite);
			}

		/************ create Model Group ****************/
		private void createModelGroup(Composite parent) 
			{
			rootModelNameField = createLabelAndText(parent, GLS_FIELD_LABEL,getRootModelName());
			rootModelNameField.addModifyListener(new ModifyListener() 
				{
				public void modifyText(ModifyEvent e) 
					{
					if (rootModelNameField.isVisible()) {silentModificationEnabled = false;}
					setPageComplete(validatePage());
					}
				});
			}

		/*********** createLabelAndText ****************/
		private Text createLabelAndText(Composite parent, String label,
				String initialValue) {
			Composite group = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 2;
			group.setLayout(layout);
			group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			// label
			Label labelField = new Label(group, SWT.NONE);
			labelField.setText(label);
			labelField.setFont(parent.getFont());

			// text
			Text textField = new Text(group, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.widthHint = 250;
			textField.setLayoutData(data);
			textField.setFont(parent.getFont());
			if (initialValue != null) {
				textField.setText(initialValue);
			}
			return textField;
		}

		public GlobalSystem getGlobalSystem() {
			if (globalsystem == null) {
				initGlobalSystem();
			}
			return globalsystem;
		}
		
		private void initGlobalSystem()
			{
			GlobalSystem rootObject = MoSaRTFactory.eINSTANCE.createGlobalSystem();
			updateGlobalSystem(rootObject);
			globalsystem = rootObject;
			}
		private void updateGlobalSystem(GlobalSystem gls)
			{
			gls.setName(getRootModelName());

			}
		
		protected boolean validatePage() {
			if (globalsystem == null) 
				{
				initGlobalSystem();
				} 
			else 
				{
				updateGlobalSystem(globalsystem);
				}
			return true;
			}
			
		private String getRootModelName() {
			if (rootModelNameField == null) {
				return DEFAULT_COMMON_FILE_NAME;
			}

			return rootModelNameField.getText().trim();
		}

		public String getRepresentationFileName() {
			return getRootModelName()
					+ "." + SiriusUtil.SESSION_RESOURCE_EXTENSION;
		}

		public String getMoSaRTFileName() {
			return getRootModelName() + ".mosart";
		}
	}
/************************************ asModelingProject *****************************************/
/**
 * Get the corresponding Modeling project.
 * 
 * @param project
 *            The original project
 * @return an optional ModelingProject (none if this project is not a
 *         modeling project).
 */
public org.eclipse.sirius.ext.base.Option<ModelingProject> asModelingProject(IProject project) 
	{
    IProjectNature nature = null;
    if (project != null) 
    	{
        try 
        	{
            nature = project.getNature(ModelingProject.NATURE_ID);
        	} 
        catch (CoreException e) {/* does nothing */}
    	} 
    if (nature instanceof ModelingProject) 
    	{
        return org.eclipse.sirius.ext.base.Options.newSome((ModelingProject) nature);
    	}
    return org.eclipse.sirius.ext.base.Options.newNone();
	}
}