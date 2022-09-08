package fr.ensma.mosart.design.wizard;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import fr.ensma.mosart.design.wizard.MoSaRTToolsDesignPlugin;
import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;
import MoSaRT.GlobalSystem;

@SuppressWarnings("restriction")
public class MoSaRTModelingProjectCreationOperation extends
		WorkspaceModifyOperation {

	private IProject project;
	private String projectName;
	private GlobalSystem rootObject;
	private String mosartResourceName;
	private String representationsResourceName;
	private IFile mosartModel;
	private IPath ProjectLocation;
	private IWorkbench workbench;
	private IWorkingSet[] selectedWorkingSets;
	/**
	 * Default constructor.
	 * 
	 * @param project
	 *            the empty project
	 * @param rootObject
	 *            the root object of the semantic resource (i.e. the metamodel)
	 * @param representationsResourceName
	 *            the name of the representations resource
	 * @param selectedViewpoints
	 *            the set of {@link Viewpoint} to have selected on this created
	 *            Modeling Project
	 */
	ReusedMethod rm = new ReusedMethod();
	public MoSaRTModelingProjectCreationOperation(	String projectName,
													GlobalSystem rootObject,	
													String mosartResourceName, 
													String representationsResourceName,
													IWorkbench workbench,
													IPath ProjectLocation,
													IWorkingSet[] selectedWorkingSets) 
		{
		super();
		this.projectName = projectName;
		this.rootObject = rootObject;
		this.mosartResourceName = mosartResourceName;
		this.ProjectLocation = ProjectLocation;
		this.representationsResourceName = representationsResourceName;
		this.selectedWorkingSets = selectedWorkingSets;
		this.workbench = workbench;
		}	
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException 
		{
		try {
			//monitor.beginTask("Create modeling resources: ", 100);
			try {
				modifyWorkspace(monitor);
				} 
			catch (UnsupportedEncodingException e) 
				{
				logError(e);
				} 
			catch (IOException e) 
				{
				logError(e);
				}
			this.mosartModel = createModelingResources(this.project, monitor);
			//monitor.subTask("prepare the modeling project...");
			
			// Get representation file and select viewpoints
			final Option<ModelingProject> created = ModelingProject.asModelingProject(project);
			if (created.some())
				{
				ModelingProject modelingProject = created.get();
				Session session = modelingProject.getSession();
			// TODO: Mickael
				//	enableMoSaRTViewpoints(session, monitor);
				session.save(monitor);
				}
		}
		finally 
			{
			monitor.done();
			}
		}
	
/******************************* logError **************************************/
	protected void logError(Throwable e) 
		{
		final IStatus status = new Status(	IStatus.ERROR,
											MoSaRTToolsDesignPlugin.PLUGIN_ID, 
											IStatus.ERROR,
											e.getMessage(), 
											e);
		MoSaRTToolsDesignPlugin.getDefault().getLog().log(status);
		}
	
/*********************************** modifyWorkspace *************************************/
	public void modifyWorkspace(IProgressMonitor progressMonitor)
			throws CoreException, UnsupportedEncodingException, IOException 
		{	
		this.project =ModelingProjectManager.INSTANCE.createNewModelingProject(this.projectName,this.ProjectLocation,true, progressMonitor);
	    if (this.selectedWorkingSets != null) 
	    	{
	        this.workbench.getWorkingSetManager().addToWorkingSets(this.project,this.selectedWorkingSets);
	    	}
		}

/*********************************** Create Modeling Resource ******************************************/
	private IFile createModelingResources(IProject project,IProgressMonitor monitor) 
		{
		// Create the mosart file 
		monitor.subTask("create the MoSaRT model...");
		String modelPath = '/' + project.getName() +'/' ;
		String mosartPath = createMoSaRTResource(modelPath);
		IFile mosartFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(mosartPath));	
		//monitor.worked(15);
		return mosartFile;
	}
	
/********************************* create resource for model*************************************/
	private String createMoSaRTResource(String modelPath) 
		{
		// create xmi resource for mosart model
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		map.put("MoSaRT", new XMIResourceFactoryImpl());
		final ResourceSet rs = new ResourceSetImpl();
		String platformPath = modelPath + mosartResourceName;
		final URI semanticModelURI = URI.createPlatformResourceURI(platformPath, true);
		final Resource resource = rs.createResource(semanticModelURI);

		// add root model to resource
		if (rootObject != null) 
			{
			resource.getContents().add(rootObject);
			}
		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMIResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
			} 
		catch (IOException e) {}
		return platformPath;
		}
	
	public IFile getMoSaRTModel() 
		{ 
		return mosartModel;
		}

	public IProject getNewProject() 	
		{
		return this.project;
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
    public Option<ModelingProject> asModelingProject(IProject project) 
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
    
/************************************ enableMoSaRTViewpoints **************************************/
    // TODO: Mickael
/*	public void enableMoSaRTViewpoints(final Session session, final IProgressMonitor monitor) 
		{
		if (session != null) 
		{
			session.getTransactionalEditingDomain().getCommandStack().execute(new RecordingCommand(session.getTransactionalEditingDomain()) 
				{
				@Override
				protected void doExecute() 
					{
					ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
					for (Viewpoint previouslySelected : session.getSelectedViewpoints(false)) 
						{
						selection.deselectViewpoint(previouslySelected, session,new NullProgressMonitor());
						}
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().global(),session, monitor);
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().functional(),session, monitor);
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().hardware(),session, monitor);
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().software(),session, monitor);
					}
				});
			}
		}*/
}

