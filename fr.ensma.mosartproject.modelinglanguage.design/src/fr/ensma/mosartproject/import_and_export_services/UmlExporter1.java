package fr.ensma.mosartproject.import_and_export_services;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.uml2.uml.Model;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;
import MoSaRT.GlobalSystem;

public class UmlExporter1 extends AbstractExternalJavaAction{
/**************************** formula extended ************************************/
	ReusedMethod rm =  new ReusedMethod();
	
	public boolean canExecute(Collection<? extends EObject> selections)
	  {
	    return true;
	  }
	
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters)
	  {		
	  doExport();
	  }

/******************************** doExport ****************************************/	
	protected void doExport()
		{
		String saveLocation = rm.askForSaveLocation();
		if (saveLocation ==  null)
			{
			rm.setInfoBox("no location selected","info");
			return;
			}
		File file = new File(saveLocation);
		if (file.exists())
			{
			int response = rm.setAlertBox("A file with this name already exists, overwrite this file?","Alert");
			if (response == 0) return;
			}
		
			/****** Load global system from file *.mosart ******/
		// Get functional Side from file located in root location
		String MoSaRTPath =  rm.getMoSaRTPath(); //MoSaRTPath() return a value of string in form: "file:/" + pathLocation
			
			/*** test ***/
			rm.setInfoBox("MoSaRTPath: "+MoSaRTPath,"info");
			
		if (MoSaRTPath == null)
			{
			rm.setErrorBox("file not found, move file .mosart to same folder with representation file .aird","System Error");
			return;
			}
		
		// Register the XMI resource factory for the .mosart extension
		Resource.Factory.Registry regGLS = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = regGLS.getExtensionToFactoryMap();
		m.put("MoSaRT", new XMIResourceFactoryImpl());
		ResourceSet resSetGLS = new ResourceSetImpl();
		Resource resourceGLS = resSetGLS.getResource(URI.createURI(MoSaRTPath), true); 
		try {
			resourceGLS.load(null);
			} 
		catch (IOException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		GlobalSystem gls = (GlobalSystem) resourceGLS.getContents().get(0);
		if (gls == null)
			{
			rm.setErrorBox("Unable to catch global system from file","System Error");
			return;
			}

				/*************** Load functional Side end ******************/
		if (gls.getFunctionalSide().getUmlModel() == null)
		  	{
			rm.setErrorBox("Your system has no uml Model to export","System Error");  
		  	}
		else 
		  	{
			Model umlModel = gls.getFunctionalSide().getUmlModel();
			String umlModelName = umlModel.getName();
			String uri = ("file:/"+saveLocation+"/"+ umlModelName+".uml").trim();
				
			// Register the XMI resource factory for the .uml extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> map = reg.getExtensionToFactoryMap();
			map.put("uml", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.createResource(URI.createURI(uri)); 

			resource.getContents().add(umlModel);
			try {	
				/***test***/
				resource.save(null);
				rm.setInfoBox("file "+umlModelName+".uml is exported in location: "+uri.replace("file:/","").trim(),"Export");
				} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}	
		  	}
		}
}