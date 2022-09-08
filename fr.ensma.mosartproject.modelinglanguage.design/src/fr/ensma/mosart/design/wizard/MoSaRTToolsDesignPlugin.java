package fr.ensma.mosart.design.wizard;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.common.tools.api.resource.ResourceSetFactory;
//import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.osgi.framework.BundleContext;


public class MoSaRTToolsDesignPlugin extends Plugin {
    /** The plug-in ID. */
    public static final String PLUGIN_ID = "fr.ensma.mosartproject.modelinglanguage.design";

    /** This plug-in's shared instance. */
    private static MoSaRTToolsDesignPlugin plugin;

    private static Set<Viewpoint> viewpoints;

    private SessionManagerListener notifWhenSessionAreCreated;

    /**
     * Default constructor for the plugin.
     */
    public MoSaRTToolsDesignPlugin() {
        plugin = this;
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static MoSaRTToolsDesignPlugin getDefault() {
        return plugin;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        viewpoints = new HashSet<Viewpoint>();
        viewpoints.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/MoSaRT.odesign"));

        notifWhenSessionAreCreated = new SessionManagerListener.Stub() {

            @SuppressWarnings("unchecked")
            @Override
            public void notifyAddSession(Session newSession) 
            	{
            	final ResourceSet set = ResourceSetFactory.createFactory().createResourceSet(newSession.getSessionResource().getURI());
// TODO: Mickael
//                ResourceSet set = newSession.getTransactionalEditingDomain().getResourceSet();
                Map<URI, URI> result = null;
                // Invoke computePlatformURIMap by reflection because this API
                // change in EMF
                try {
                    Method computePlatformURIMap = EcorePlugin.class.getMethod("computePlatformURIMap", Boolean.class);
                    result = (Map<URI, URI>) computePlatformURIMap.invoke(null, true);
                	} 
                catch (NoSuchMethodException e) {} 
                catch (IllegalAccessException e) {} 
                catch (IllegalArgumentException e) {} 
                catch (InvocationTargetException e) {}
                try {
                    Method computePlatformURIMap = EcorePlugin.class.getMethod("computePlatformURIMap");
                    result = (Map<URI, URI>) computePlatformURIMap.invoke(null);
                	} 
                catch (NoSuchMethodException e) {} 
                catch (IllegalAccessException e) {} 
                catch (IllegalArgumentException e) {} 
                catch (InvocationTargetException e) {}

                if (result != null) 
                	{
                    set.getURIConverter().getURIMap().putAll(result);
                	} 
                else 
                	{
                    IStatus status = new Status(IStatus.WARNING, MoSaRTToolsDesignPlugin.PLUGIN_ID,
                            "The EMF API EcorePlugin.computePlatformURIMap has probably changed");
                    MoSaRTToolsDesignPlugin.getDefault().getLog().log(status);
                	}
            	}
        	};
        	SessionManager.INSTANCE.addSessionsListener(notifWhenSessionAreCreated);

    	}

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        if (viewpoints != null) 
        	{
            for (final Viewpoint viewpoint : viewpoints) 
            	{
                ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
            	}
            viewpoints.clear();
            viewpoints = null;
        	}
        if (notifWhenSessionAreCreated != null) 
        	{
            SessionManager.INSTANCE.removeSessionsListener(notifWhenSessionAreCreated);
        	}
        super.stop(context);
    	}
	}
