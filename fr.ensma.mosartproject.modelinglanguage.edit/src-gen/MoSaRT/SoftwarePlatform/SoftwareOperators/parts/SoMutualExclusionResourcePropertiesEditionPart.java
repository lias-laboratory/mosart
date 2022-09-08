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
public interface SoMutualExclusionResourcePropertiesEditionPart {



	/**
	 * Init the tasks
	 * @param settings settings for the tasks ReferencesTable 
	 */
	public void initTasks(ReferencesTableSettings settings);

	/**
	 * Update the tasks
	 * @param newValue the tasks to update
	 * 
	 */
	public void updateTasks();

	/**
	 * Adds the given filter to the tasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTasks(ViewerFilter filter);

	/**
	 * Adds the given filter to the tasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTasks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tasks table
	 * 
	 */
	public boolean isContainedInTasksTable(EObject element);


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
