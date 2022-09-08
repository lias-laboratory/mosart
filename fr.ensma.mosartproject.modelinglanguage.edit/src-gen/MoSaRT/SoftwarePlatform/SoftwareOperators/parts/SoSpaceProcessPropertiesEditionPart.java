/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareOperators.parts;

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
public interface SoSpaceProcessPropertiesEditionPart {

	/**
	 * @return the spaceProcessParent
	 * 
	 */
	public EObject getSpaceProcessParent();

	/**
	 * Init the spaceProcessParent
	 * @param settings the combo setting
	 */
	public void initSpaceProcessParent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new spaceProcessParent
	 * @param newValue the new spaceProcessParent to set
	 * 
	 */
	public void setSpaceProcessParent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSpaceProcessParentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the spaceProcessParent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSpaceProcessParent(ViewerFilter filter);

	/**
	 * Adds the given filter to the spaceProcessParent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSpaceProcessParent(ViewerFilter filter);




	/**
	 * Init the spaceProcessChildren
	 * @param settings settings for the spaceProcessChildren ReferencesTable 
	 */
	public void initSpaceProcessChildren(ReferencesTableSettings settings);

	/**
	 * Update the spaceProcessChildren
	 * @param newValue the spaceProcessChildren to update
	 * 
	 */
	public void updateSpaceProcessChildren();

	/**
	 * Adds the given filter to the spaceProcessChildren edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSpaceProcessChildren(ViewerFilter filter);

	/**
	 * Adds the given filter to the spaceProcessChildren edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSpaceProcessChildren(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the spaceProcessChildren table
	 * 
	 */
	public boolean isContainedInSpaceProcessChildrenTable(EObject element);




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
	 * Init the processingUnit
	 * @param settings settings for the processingUnit ReferencesTable 
	 */
	public void initProcessingUnit(ReferencesTableSettings settings);

	/**
	 * Update the processingUnit
	 * @param newValue the processingUnit to update
	 * 
	 */
	public void updateProcessingUnit();

	/**
	 * Adds the given filter to the processingUnit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessingUnit(ViewerFilter filter);

	/**
	 * Adds the given filter to the processingUnit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnit(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processingUnit table
	 * 
	 */
	public boolean isContainedInProcessingUnitTable(EObject element);


	/**
	 * @return the rtpSchedulingPolicy
	 * 
	 */
	public EObject getRtpSchedulingPolicy();

	/**
	 * Init the rtpSchedulingPolicy
	 * @param settings the combo setting
	 */
	public void initRtpSchedulingPolicy(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpSchedulingPolicy
	 * @param newValue the new rtpSchedulingPolicy to set
	 * 
	 */
	public void setRtpSchedulingPolicy(EObject newValue);


	/**
	 * @return the rtpTaskAllocation
	 * 
	 */
	public EObject getRtpTaskAllocation();

	/**
	 * Init the rtpTaskAllocation
	 * @param settings the combo setting
	 */
	public void initRtpTaskAllocation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpTaskAllocation
	 * @param newValue the new rtpTaskAllocation to set
	 * 
	 */
	public void setRtpTaskAllocation(EObject newValue);





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
