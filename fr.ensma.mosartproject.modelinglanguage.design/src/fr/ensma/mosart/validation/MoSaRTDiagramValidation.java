package fr.ensma.mosart.validation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.common.ui.util.WorkbenchPartDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.part.ValidateAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import fr.ensma.mosartproject.modelinglanguage.utilities.ValidateActionForMoSaRTModelingLanguage;

public class MoSaRTDiagramValidation extends AbstractHandler  
	{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
		{
		//ValidateActionForMoSaRTModelingLanguage validateAction = new ValidateActionForMoSaRTModelingLanguage();
		//validateAction.run();
		//return null;
		
		IFile dFile = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		if (selection.getFirstElement() instanceof IFile) 
			{
			dFile = (IFile) selection.getFirstElement();
			}
		else return null;
		URI myRepresentationsFileURI = URI.createURI("/" +
			dFile.getProject().getName() + "/" +
			dFile.getProjectRelativePath().toOSString());
		Session siriusSession =
				SessionManager.INSTANCE.getSession(myRepresentationsFileURI , new NullProgressMonitor());
		DAnalysis root =(DAnalysis) siriusSession.getSessionResource().getContents().get(0);
		DView dView = root.getOwnedViews().get(0);
		DRepresentation myRepresentation = dView.getOwnedRepresentations().get(0);	
			
		IEditorPart editorPart = DialectUIManager.INSTANCE.openEditor(siriusSession, myRepresentation,
				new NullProgressMonitor());

		WorkbenchPartDescriptor workbenchPartDescriptor = new
		WorkbenchPartDescriptor(editorPart.getSite().getId(),
		editorPart.getClass(), editorPart.getSite().getPage());
		ValidateAction va = new ValidateAction(workbenchPartDescriptor);
		va.run();
		return null; 
		}
	public boolean isEnabled() 
		{
		return true;
		}
	}