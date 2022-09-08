package fr.ensma.mosartproject.modelinglanguage.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;
import fr.ensma.mosartproject.modelinglanguage.wizard.MosartModelSpecPage;

public class MosartWizard extends BasicNewProjectResourceWizard
	{
	protected IProject newProject;
	
	// Pages
	private MosartModelSpecPage modelPage;
	private WizardNewProjectCreationPage wizardNewProjectCreationPage;
	
	// Implementation
	protected IWorkbench workbench;
	protected IPath ProjectLocation;
	protected String initialProjectName= "MoSaRT Realtime Modeling Project";
	protected IStructuredSelection selection;
	
	// constructeur
	public MosartWizard() {super();}
	
	ReusedMethod rm = new ReusedMethod();
	
/************************************* init Workbench *****************************************/
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) 
		{
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
		//setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(GenModelEditPlugin.INSTANCE.getImage("full/wizban/NewEmptyEMFProject")));
		setWindowTitle("New MoSaRT Modeling Project");
		setDefaultPageImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin("fr.ensma.mosartproject.modelinglanguage.design","images/mosart.png"));
		setNeedsProgressMonitor(true);
		}
	
/********************************* addPages ************************************/
	@Override
	public void addPages()
		{
		// specifier wizardNewProjectCreationPage et l'ajouter au Wizard
		wizardNewProjectCreationPage = new WizardNewProjectCreationPage(SiriusEditPlugin.getPlugin().getString("_UI_ModelingProjectWizard_label")); //$NON-NLS-1$
		wizardNewProjectCreationPage.setInitialProjectName("");
		wizardNewProjectCreationPage.setTitle("Create a MoSaRT project");
		wizardNewProjectCreationPage.setDescription("Enter a project name"); //$NON-NLS-1$
		addPage(wizardNewProjectCreationPage);
		
		// specifier MosartModelSpecPage et l'ajouter au Wizard
		modelPage = new MosartModelSpecPage("MoSaRT model parameters");
		modelPage.setTitle("Model settings"); 
		modelPage.setDescription("Define GlobalSystem's name");
		addPage(modelPage);
		}
	
	@Override
	public boolean performFinish()
		{
		try 
			{
			newProject = ModelingProjectManager.INSTANCE.createNewModelingProject(
															wizardNewProjectCreationPage.getProjectName(), 
															wizardNewProjectCreationPage.getLocationPath(), 
															true,
															new NullProgressMonitor());
			if (!newProject.exists()) 
				{
				throw new IllegalArgumentException();
				}
			IRunnableWithProgress op = new WorkspaceModifyOperation(null)
				{
				@Override
				protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException 
					{
					MoSaRTModifyWorkspaceOperation mosartModifyWorkspaceOperation = new MoSaRTModifyWorkspaceOperation(newProject, modelPage.getGlobalSystem(),modelPage.getMoSaRTFileName());
					try {
						getContainer().run(false, true, mosartModifyWorkspaceOperation);
						}
					catch (final InterruptedException e) 
						{
							// Ignore.
						} 
					catch (final InvocationTargetException e) 
						{
						System.out.println("InvocationTargetException");
						}
					IResource mosartFile = newProject.findMember(modelPage.getMoSaRTFileName());
					
					// Switch to the modeling perspective
					updatePerspective();
					
					// Select it in the explorer
					selectAndReveal(mosartFile, PlatformUI.getWorkbench().getActiveWorkbenchWindow());
					
					// Open the GlobalSystemViewpoint
					openGlobalSystemViewpoint(newProject, monitor);
					}
				};
			try {
				getContainer().run(false, true, op);
				} 
			catch (InvocationTargetException e) 
				{
				// a revoir	
				} 
			catch (InterruptedException e) 
				{
				return false;
				}
			} 
		catch (CoreException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
			}
		return true;
		}

/***************************** openGlobalSystemViewpoint *********************************/
	private void openGlobalSystemViewpoint(IProject project, IProgressMonitor monitor) {
		Option<ModelingProject> opionalModelingProject = ModelingProject.asModelingProject(project);
		Session session = opionalModelingProject.get().getSession();
		for (DView view : session.getSelectedViews()) 
			{
			if (!view.getOwnedRepresentations().isEmpty()) 
				{
				for (DRepresentation representation : view.getOwnedRepresentations()) 
					{							
					RepresentationDescription description = DialectManager.INSTANCE.getDescription(representation);		
					rm.setInfoBox(description.getName(), "");
					if ("GlobalSystemViewPoint".equals(description.getName())) 
						{						
						DialectUIManager.INSTANCE.openEditor(session, representation, monitor);
						return;
						}
					}
				}		
			}
		}
	
	}
