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
public interface HpCommunicationChannelPropertiesEditionPart {

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
	 * Init the processingUnits
	 * @param settings settings for the processingUnits ReferencesTable 
	 */
	public void initProcessingUnits(ReferencesTableSettings settings);

	/**
	 * Update the processingUnits
	 * @param newValue the processingUnits to update
	 * 
	 */
	public void updateProcessingUnits();

	/**
	 * Adds the given filter to the processingUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the processingUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processingUnits table
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element);




	/**
	 * Init the networkPort
	 * @param settings settings for the networkPort ReferencesTable 
	 */
	public void initNetworkPort(ReferencesTableSettings settings);

	/**
	 * Update the networkPort
	 * @param newValue the networkPort to update
	 * 
	 */
	public void updateNetworkPort();

	/**
	 * Adds the given filter to the networkPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNetworkPort(ViewerFilter filter);

	/**
	 * Adds the given filter to the networkPort edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNetworkPort(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the networkPort table
	 * 
	 */
	public boolean isContainedInNetworkPortTable(EObject element);




	/**
	 * Init the processingUnitSet
	 * @param settings settings for the processingUnitSet ReferencesTable 
	 */
	public void initProcessingUnitSet(ReferencesTableSettings settings);

	/**
	 * Update the processingUnitSet
	 * @param newValue the processingUnitSet to update
	 * 
	 */
	public void updateProcessingUnitSet();

	/**
	 * Adds the given filter to the processingUnitSet edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessingUnitSet(ViewerFilter filter);

	/**
	 * Adds the given filter to the processingUnitSet edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnitSet(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processingUnitSet table
	 * 
	 */
	public boolean isContainedInProcessingUnitSetTable(EObject element);





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
