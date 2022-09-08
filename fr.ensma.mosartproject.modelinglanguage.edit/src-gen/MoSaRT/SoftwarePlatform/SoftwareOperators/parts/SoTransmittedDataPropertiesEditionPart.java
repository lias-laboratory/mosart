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
public interface SoTransmittedDataPropertiesEditionPart {

	/**
	 * @return the sourceTask
	 * 
	 */
	public EObject getSourceTask();

	/**
	 * Init the sourceTask
	 * @param settings the combo setting
	 */
	public void initSourceTask(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sourceTask
	 * @param newValue the new sourceTask to set
	 * 
	 */
	public void setSourceTask(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourceTaskButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sourceTask edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSourceTask(ViewerFilter filter);

	/**
	 * Adds the given filter to the sourceTask edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSourceTask(ViewerFilter filter);




	/**
	 * Init the targetTasks
	 * @param settings settings for the targetTasks ReferencesTable 
	 */
	public void initTargetTasks(ReferencesTableSettings settings);

	/**
	 * Update the targetTasks
	 * @param newValue the targetTasks to update
	 * 
	 */
	public void updateTargetTasks();

	/**
	 * Adds the given filter to the targetTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetTasks(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetTasks edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetTasks(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the targetTasks table
	 * 
	 */
	public boolean isContainedInTargetTasksTable(EObject element);


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
	 * @return the rtpDataSize
	 * 
	 */
	public EObject getRtpDataSize();

	/**
	 * Init the rtpDataSize
	 * @param settings the combo setting
	 */
	public void initRtpDataSize(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpDataSize
	 * @param newValue the new rtpDataSize to set
	 * 
	 */
	public void setRtpDataSize(EObject newValue);





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
