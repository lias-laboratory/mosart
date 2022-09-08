/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface HpCommunicationRouterPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the networkPorts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initNetworkPorts(ReferencesTableSettings settings);

	/**
	 * Update the networkPorts
	 * @param newValue the networkPorts to update
	 * 
	 */
	public void updateNetworkPorts();

	/**
	 * Adds the given filter to the networkPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNetworkPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the networkPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNetworkPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the networkPorts table
	 * 
	 */
	public boolean isContainedInNetworkPortsTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
