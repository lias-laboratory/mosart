package fr.ensma.mosartproject.import_and_export_services;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.uml2.uml.Model;

import MoSaRT.GlobalSystem;
import MoSaRT.FunctionalElements.SystemFunctionalSide;
import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;
public class UmlReplace extends AbstractExternalJavaAction
	{
	ReusedMethod rm =  new ReusedMethod();
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	public void execute(Collection<? extends EObject> arg0,Map<String, Object> arg1) 
		{
		int response = rm.setAlertBox("Do you want to replace your model?","Replace UML Model");
		if (response == 0) return;
		else
			{
			try {
				doReplace();
				} 
			catch (IOException e) 
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
		}

/*******************************Import******************************************************/
	
	  public void doReplace() throws IOException 
	  	{
		String fileAddress = rm.askOpenFile();
		if (fileAddress == null)
			{
			rm.setInfoBox("no file selected","info");
			return;
			}
				/********load uml Model from file Address************/ 
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> umlMap = reg.getExtensionToFactoryMap();
		umlMap.put("uml", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileAddress), true); 
		resource.load(null);
				/*****************load uml end***********************/
	
		//get model from file
		Model ImportedModel=(Model) resource.getContents().get(0);
		
				/****** Load System Functional Side from file *.MoSaRT ******/
		String MoSaRTPath =  rm.getMoSaRTPath(); //MoSaRTPath() return a value of string in form: "file:/" + pathLocation
	  	if (MoSaRTPath == null)
	  		{
	  		rm.setErrorBox("file not found, move file .mosart to the same file with representations file .aird","System Error");
	  		return;
	  		}
		// Register the XMI resource factory for the .mosart extension
		Resource.Factory.Registry regSFS = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = regSFS.getExtensionToFactoryMap();
		m.put("MoSaRT", new XMIResourceFactoryImpl());
		ResourceSet resSetSFS = new ResourceSetImpl();
		Resource resourceSFS = resSetSFS.getResource(URI.createURI(MoSaRTPath), true); 
		try {
			resourceSFS.load(null);
			} 
		catch (IOException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
				/*************** Load functional Side end ********************/
		
		// Get System Functional Side
		GlobalSystem gls = (GlobalSystem) resourceSFS.getContents().get(0);
		if (gls == null) 
			{
			rm.setErrorBox("Unable to catch global system from file","System Error");
			return;
			}
		SystemFunctionalSide sfs = gls.getFunctionalSide();	
	
		// Set Imported model to SystemFunctionalSide in MoSaRT model 	
		sfs.setUmlModel(ImportedModel);
		resourceSFS.save(null);
		rm.reloadResource();
	  	}
}