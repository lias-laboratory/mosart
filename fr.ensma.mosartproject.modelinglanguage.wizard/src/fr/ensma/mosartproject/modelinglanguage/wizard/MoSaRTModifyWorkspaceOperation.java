package fr.ensma.mosartproject.modelinglanguage.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import fr.ensma.mosart.design.wizard.MoSaRTViewpoints;
import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;
import MoSaRT.GlobalSystem;

public class MoSaRTModifyWorkspaceOperation extends WorkspaceModifyOperation
	{
	private IProject project;
	private GlobalSystem rootObject;
	private String mosartFileName;
	
	public MoSaRTModifyWorkspaceOperation(IProject project,GlobalSystem createdGlobalSystem,String mosartFileName)
		{
		this.project = project;
		this.rootObject = createdGlobalSystem;
		this.mosartFileName = mosartFileName;
		}
	ReusedMethod rm = new ReusedMethod();
	
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,InvocationTargetException, InterruptedException 
		{
		final Option<ModelingProject> createdProject = ModelingProject.asModelingProject(project);
		if (createdProject.some()) 
			{
			createModelingResources(project,new NullProgressMonitor());
			ModelingProject modelingProject = createdProject.get();
			Session session = modelingProject.getSession();
			enableMoSaRTViewpoints(session,monitor);	
			}
		}
/********************************* create resource for model*************************************/
	private String createMoSaRTResource(String modelPath) 
		{
		// create xmi resource for mosart model
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		map.put("MoSaRT", new XMIResourceFactoryImpl());
		final ResourceSet rs = new ResourceSetImpl();
		String platformPath = modelPath + mosartFileName;
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
	
/*********************************** Create Modeling Resource ******************************************/
	private IFile createModelingResources(IProject project,IProgressMonitor monitor) 
		{
		// Create the mosart file 
		monitor.subTask("create the MoSaRT model...");
		String modelPath = '/' + project.getName() +'/' ;
		String mosartPath = createMoSaRTResource(modelPath);
		IFile mosartFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(mosartPath));	
		
		return mosartFile;
		}
	
/************************************ enableMoSaRTViewpoints **************************************/
	public void enableMoSaRTViewpoints(final Session session,IProgressMonitor monitor) 
		{
		if (session != null) 
			{
			ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
			selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().global(),session, monitor);
			selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().functional(),session, monitor);
			selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().hardware(),session, monitor);
			selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().software(),session, monitor);
			
			/*
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
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().global(),session, new NullProgressMonitor());
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().functional(),session, new NullProgressMonitor());
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().hardware(),session, new NullProgressMonitor());
					selection.selectViewpoint(MoSaRTViewpoints.fromViewpointRegistry().software(),session, new NullProgressMonitor());
					}
				});*/
			}
		}
	}
