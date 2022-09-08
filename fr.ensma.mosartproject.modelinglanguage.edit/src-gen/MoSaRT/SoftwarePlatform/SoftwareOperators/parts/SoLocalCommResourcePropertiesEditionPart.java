/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SoLocalCommResourcePropertiesEditionPart {



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
	 * @return the rtpCommunicationMechanism
	 * 
	 */
	public EObject getRtpCommunicationMechanism();

	/**
	 * Init the rtpCommunicationMechanism
	 * @param settings the combo setting
	 */
	public void initRtpCommunicationMechanism(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpCommunicationMechanism
	 * @param newValue the new rtpCommunicationMechanism to set
	 * 
	 */
	public void setRtpCommunicationMechanism(EObject newValue);


	/**
	 * @return the rtpProtectProtocol
	 * 
	 */
	public EObject getRtpProtectProtocol();

	/**
	 * Init the rtpProtectProtocol
	 * @param settings the combo setting
	 */
	public void initRtpProtectProtocol(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpProtectProtocol
	 * @param newValue the new rtpProtectProtocol to set
	 * 
	 */
	public void setRtpProtectProtocol(EObject newValue);


	/**
	 * @return the rtpWaitingQueuePolicy
	 * 
	 */
	public EObject getRtpWaitingQueuePolicy();

	/**
	 * Init the rtpWaitingQueuePolicy
	 * @param settings the combo setting
	 */
	public void initRtpWaitingQueuePolicy(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpWaitingQueuePolicy
	 * @param newValue the new rtpWaitingQueuePolicy to set
	 * 
	 */
	public void setRtpWaitingQueuePolicy(EObject newValue);





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
