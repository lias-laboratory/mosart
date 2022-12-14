/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SbExternalEventTriggerPropertiesEditionPart {

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
	 * Init the schedulingActivities
	 * @param settings settings for the schedulingActivities ReferencesTable 
	 */
	public void initSchedulingActivities(ReferencesTableSettings settings);

	/**
	 * Update the schedulingActivities
	 * @param newValue the schedulingActivities to update
	 * 
	 */
	public void updateSchedulingActivities();

	/**
	 * Adds the given filter to the schedulingActivities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSchedulingActivities(ViewerFilter filter);

	/**
	 * Adds the given filter to the schedulingActivities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSchedulingActivities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the schedulingActivities table
	 * 
	 */
	public boolean isContainedInSchedulingActivitiesTable(EObject element);





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
