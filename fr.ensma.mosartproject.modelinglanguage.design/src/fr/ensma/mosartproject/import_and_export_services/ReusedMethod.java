package fr.ensma.mosartproject.import_and_export_services;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ReusedMethod 
	{
	private static final String UML_model = "*.uml";
	public ReusedMethod() {}
	/**********************************  reload resource *************************************************/
	protected void reloadResource()
		{
		IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IFile file = (IFile) win.getActivePage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
		IProject project = file.getProject();
		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, null);
			} 	
		catch (CoreException e) 
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	/*************************************** set Alert Box **************************************************/
	public int setAlertBox(String message,String text)
		{
		Shell   s = Display.getCurrent().getActiveShell();
		int result;
		MessageBox messageBox = new MessageBox(s,SWT.ICON_WARNING|SWT.YES|SWT.NO);
		messageBox.setMessage(message);
		messageBox.setText(text);
		int response = messageBox.open();
		if (response == SWT.YES) result = 1;
		else result = 0;
		return result;
		}
	
/*********************************** setMessageBox ******************************************************/
	public int setErrorBox(String message,String text)
	  	{
		Shell   s = Display.getCurrent().getActiveShell();
		MessageBox messageBox = new MessageBox(s,SWT.ICON_ERROR);
		messageBox.setMessage(message);
		messageBox.setText(text);
		int response = messageBox.open();
		return response;
	  	}
	
/*********************************** setMessageBox ******************************************************/
	public int setInfoBox(String message,String text)
	  	{
		Shell   s = Display.getCurrent().getActiveShell();
		MessageBox messageBox = new MessageBox(s,SWT.ICON_INFORMATION);
		messageBox.setMessage(message);
		messageBox.setText(text);
		int response = messageBox.open();
		return response;
	  	}
	
	/*****************************find file *.mosart from root Location*************************/
	
  	public String getMoSaRTPath()
  		{  	
  		String URIPath = null;
  		
  		// find file in case: .mosart and .aird have the same name
		IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IFile file = (IFile) win.getActivePage().getActiveEditor().getEditorInput().getAdapter(IFile.class);
		IFile file0= file.getProject().getFile(file.getName().replace(".aird",".mosart")); 
		if (file0.exists())
			{			
			URIPath = ("file:/"+file.getLocation().toString().replace(".aird", ".mosart")).trim();
			return URIPath;
			}
		
		// find file .mosart in location in case: file .mosart and .aird have different names.
  		String locationPath = file.getProject().getLocation().toOSString();
  		String filename;
  		int select = -1;
  		File folder = new File(locationPath);
  		File[] listOfFiles = folder.listFiles();
  		if (listOfFiles == null)
  			{
  			return null;
  			}
  		int n = listOfFiles.length;
  		for (int i =0; i < n; i++)
  			{
  			if (listOfFiles[i].isFile())
  				{
  				filename = listOfFiles[i].getName();
  				if (filename.endsWith(".mosart")) select = i;
  				}
  			}
  		if (select == -1) 
  			{
  			return null;
  			}
  		else
  			{
  			String netPath = listOfFiles[select].getPath();
  	  		URIPath = "file:/"+netPath; 
  			}
  		return URIPath;
  		}
  	/*****************************************askOpenFile***************************************************/
	  protected String askOpenFile() 
	  		{
	  		FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
	  		dialog.setFilterExtensions(new String[] { UML_model, "*.*" } ); 
	  		String path = dialog.open(); 
	  		String fileAddress ="file:/"+path; //formula URI, example: "file:\C:\Desktop\test.txt"
	  		return fileAddress;
	  		}
	/************************************ askForSaveLocation ********************************************/
	  protected String askForSaveLocation()
			{
		    Display display = PlatformUI.getWorkbench().getDisplay();
		    Shell shell = display.getActiveShell();
		    DirectoryDialog dialog = new DirectoryDialog(shell);
		    dialog.setFilterPath("C:\\");
		    String saveLocation = dialog.open();
		    return saveLocation;
			}	  
}