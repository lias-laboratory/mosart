package fr.ensma.mosart.GraphicAdapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.api.adapters.SemanticAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Edge;
import fr.ensma.mosart.GraphicAdapter.VPDecoratorHelper;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

/**
 * An adapter factory to convert an element from Sirius into an EEF
 * SemanticAdapter, if possible.
 */
public class SiriusSemanticAdapter implements IAdapterFactory {

    /** The types list */
    private static final Class<?>[] TYPES = { SemanticAdapter.class, };

    /**
     * {@inheritDoc}
     */
    public Object getAdapter(final Object adaptableObject,@SuppressWarnings("rawtypes")final Class adapterType) 
    	{
        Object adapter = null;
        // if Object comes from GMF
        if ((adaptableObject != null) && (adapterType == SemanticAdapter.class)) 
        	{
            EObject semanticElement = null;
            if (adaptableObject instanceof GraphicalEditPart) 
            	{
                semanticElement = ((GraphicalEditPart) adaptableObject).resolveSemanticElement();
            	} 
            else if (adaptableObject instanceof ConnectionEditPart) 
            	{
                semanticElement = ((Edge) ((ConnectionEditPart) adaptableObject).getModel()).getElement();
            	} 
            else if (adaptableObject instanceof DSemanticDecorator) 
            	{
                semanticElement = ((DSemanticDecorator) adaptableObject).getTarget();
            	}
            if (semanticElement != null) 
            	{
                VPDecoratorHelper helper = new VPDecoratorHelper(semanticElement);
                if (helper.canAdapt()) 
                	{
                    return helper.createSemanticAdapterFromDSemanticDecorator();
                	}
            	}
        	}
        return adapter;
    }

    public Class<?>[] getAdapterList() 
    	{
        return TYPES;
    	}
}

