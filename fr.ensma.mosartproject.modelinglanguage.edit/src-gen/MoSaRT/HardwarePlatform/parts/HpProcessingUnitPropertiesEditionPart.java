/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface HpProcessingUnitPropertiesEditionPart {

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
	 * @return the commChannel
	 * 
	 */
	public EObject getCommChannel();

	/**
	 * Init the commChannel
	 * @param settings the combo setting
	 */
	public void initCommChannel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new commChannel
	 * @param newValue the new commChannel to set
	 * 
	 */
	public void setCommChannel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCommChannelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the commChannel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommChannel(ViewerFilter filter);

	/**
	 * Adds the given filter to the commChannel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommChannel(ViewerFilter filter);




	/**
	 * Init the spaceProcesses
	 * @param settings settings for the spaceProcesses ReferencesTable 
	 */
	public void initSpaceProcesses(ReferencesTableSettings settings);

	/**
	 * Update the spaceProcesses
	 * @param newValue the spaceProcesses to update
	 * 
	 */
	public void updateSpaceProcesses();

	/**
	 * Adds the given filter to the spaceProcesses edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSpaceProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the spaceProcesses edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSpaceProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the spaceProcesses table
	 * 
	 */
	public boolean isContainedInSpaceProcessesTable(EObject element);




	/**
	 * Init the candidateTasks
	 * @param settings settings for the candidateTasks ReferencesTable 
	 */
	public void initCandidateTasks(ReferencesTableSettings settings);

	/**
	 * Update the candidateTasks
	 * @param newValue the candidateTasks to update
	 * 
	 */
	public void updateCandidateTasks();

	/**
	 * Adds the given filter to the candidateTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCandidateTasks(ViewerFilter filter);

	/**
	 * Adds the given filter to the candidateTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCandidateTasks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the candidateTasks table
	 * 
	 */
	public boolean isContainedInCandidateTasksTable(EObject element);




	/**
	 * Init the schedulableTasks
	 * @param settings settings for the schedulableTasks ReferencesTable 
	 */
	public void initSchedulableTasks(ReferencesTableSettings settings);

	/**
	 * Update the schedulableTasks
	 * @param newValue the schedulableTasks to update
	 * 
	 */
	public void updateSchedulableTasks();

	/**
	 * Adds the given filter to the schedulableTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSchedulableTasks(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulableTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSchedulableTasks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulableTasks table
	 * 
	 */
	public boolean isContainedInSchedulableTasksTable(EObject element);


	/**
	 * @return the processorInterconnector
	 * 
	 */
	public EObject getProcessorInterconnector();

	/**
	 * Init the processorInterconnector
	 * @param settings the combo setting
	 */
	public void initProcessorInterconnector(EObjectFlatComboSettings settings);

	/**
	 * Defines a new processorInterconnector
	 * @param newValue the new processorInterconnector to set
	 * 
	 */
	public void setProcessorInterconnector(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setProcessorInterconnectorButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the processorInterconnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessorInterconnector(ViewerFilter filter);

	/**
	 * Adds the given filter to the processorInterconnector edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessorInterconnector(ViewerFilter filter);


	/**
	 * @return the rtpUtilizationFactor
	 * 
	 */
	public EObject getRtpUtilizationFactor();

	/**
	 * Init the rtpUtilizationFactor
	 * @param settings the combo setting
	 */
	public void initRtpUtilizationFactor(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpUtilizationFactor
	 * @param newValue the new rtpUtilizationFactor to set
	 * 
	 */
	public void setRtpUtilizationFactor(EObject newValue);


	/**
	 * @return the rtpComputingSpeed
	 * 
	 */
	public EObject getRtpComputingSpeed();

	/**
	 * Init the rtpComputingSpeed
	 * @param settings the combo setting
	 */
	public void initRtpComputingSpeed(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpComputingSpeed
	 * @param newValue the new rtpComputingSpeed to set
	 * 
	 */
	public void setRtpComputingSpeed(EObject newValue);





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
