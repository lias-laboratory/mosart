/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SoRemoteCommResourcePropertiesEditionPart {



	/**
	 * Init the writerTasks
	 * @param settings settings for the writerTasks ReferencesTable 
	 */
	public void initWriterTasks(ReferencesTableSettings settings);

	/**
	 * Update the writerTasks
	 * @param newValue the writerTasks to update
	 * 
	 */
	public void updateWriterTasks();

	/**
	 * Adds the given filter to the writerTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToWriterTasks(ViewerFilter filter);

	/**
	 * Adds the given filter to the writerTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToWriterTasks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the writerTasks table
	 * 
	 */
	public boolean isContainedInWriterTasksTable(EObject element);




	/**
	 * Init the readerTasks
	 * @param settings settings for the readerTasks ReferencesTable 
	 */
	public void initReaderTasks(ReferencesTableSettings settings);

	/**
	 * Update the readerTasks
	 * @param newValue the readerTasks to update
	 * 
	 */
	public void updateReaderTasks();

	/**
	 * Adds the given filter to the readerTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReaderTasks(ViewerFilter filter);

	/**
	 * Adds the given filter to the readerTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReaderTasks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the readerTasks table
	 * 
	 */
	public boolean isContainedInReaderTasksTable(EObject element);


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
	 * Init the transmittedData
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTransmittedData(ReferencesTableSettings settings);

	/**
	 * Update the transmittedData
	 * @param newValue the transmittedData to update
	 * 
	 */
	public void updateTransmittedData();

	/**
	 * Adds the given filter to the transmittedData edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTransmittedData(ViewerFilter filter);

	/**
	 * Adds the given filter to the transmittedData edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTransmittedData(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the transmittedData table
	 * 
	 */
	public boolean isContainedInTransmittedDataTable(EObject element);





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
