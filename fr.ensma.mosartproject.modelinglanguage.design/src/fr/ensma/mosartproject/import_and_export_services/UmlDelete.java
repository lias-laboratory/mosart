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
//import org.eclipse.uml2.uml.Model;


import fr.ensma.mosartproject.import_and_export_services.ReusedMethod;
import MoSaRT.GlobalSystem;
import MoSaRT.FunctionalElements.SystemFunctionalSide;

public class UmlDelete extends AbstractExternalJavaAction{
	ReusedMethod rm = new ReusedMethod();
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) 
		{
		int response = rm.setAlertBox("Do you want to delete your model?","Deletion UML Model");
		if (response == 0) return;
		else
			{
			try {
				doDelete();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}

/*******************************Import******************************************************/
	
	  public void doDelete() throws IOException 
	  	{
				/****** Load System Functional Side from file *.MoSaRT ******/
		String MoSaRTPath =  rm.getMoSaRTPath(); //MoSaRTPath() return a value of string in form: "file:/" + pathLocation
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
		sfs.setUmlModel(null);
		resourceSFS.save(null);
		rm.reloadResource();
	  	}
}
