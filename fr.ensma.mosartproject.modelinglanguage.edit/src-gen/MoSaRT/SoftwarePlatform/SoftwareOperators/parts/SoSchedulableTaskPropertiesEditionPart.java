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
public interface SoSchedulableTaskPropertiesEditionPart {

	/**
	 * @return the process
	 * 
	 */
	public EObject getProcess();

	/**
	 * Init the process
	 * @param settings the combo setting
	 */
	public void initProcess(EObjectFlatComboSettings settings);

	/**
	 * Defines a new process
	 * @param newValue the new process to set
	 * 
	 */
	public void setProcess(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setProcessButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcess(ViewerFilter filter);




	/**
	 * Init the mutualExclusionResources
	 * @param settings settings for the mutualExclusionResources ReferencesTable 
	 */
	public void initMutualExclusionResources(ReferencesTableSettings settings);

	/**
	 * Update the mutualExclusionResources
	 * @param newValue the mutualExclusionResources to update
	 * 
	 */
	public void updateMutualExclusionResources();

	/**
	 * Adds the given filter to the mutualExclusionResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMutualExclusionResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the mutualExclusionResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMutualExclusionResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mutualExclusionResources table
	 * 
	 */
	public boolean isContainedInMutualExclusionResourcesTable(EObject element);




	/**
	 * Init the commWritingResources
	 * @param settings settings for the commWritingResources ReferencesTable 
	 */
	public void initCommWritingResources(ReferencesTableSettings settings);

	/**
	 * Update the commWritingResources
	 * @param newValue the commWritingResources to update
	 * 
	 */
	public void updateCommWritingResources();

	/**
	 * Adds the given filter to the commWritingResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommWritingResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the commWritingResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommWritingResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the commWritingResources table
	 * 
	 */
	public boolean isContainedInCommWritingResourcesTable(EObject element);




	/**
	 * Init the commReadingResources
	 * @param settings settings for the commReadingResources ReferencesTable 
	 */
	public void initCommReadingResources(ReferencesTableSettings settings);

	/**
	 * Update the commReadingResources
	 * @param newValue the commReadingResources to update
	 * 
	 */
	public void updateCommReadingResources();

	/**
	 * Adds the given filter to the commReadingResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommReadingResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the commReadingResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommReadingResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the commReadingResources table
	 * 
	 */
	public boolean isContainedInCommReadingResourcesTable(EObject element);


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
	 * Init the favoriteProcessors
	 * @param settings settings for the favoriteProcessors ReferencesTable 
	 */
	public void initFavoriteProcessors(ReferencesTableSettings settings);

	/**
	 * Update the favoriteProcessors
	 * @param newValue the favoriteProcessors to update
	 * 
	 */
	public void updateFavoriteProcessors();

	/**
	 * Adds the given filter to the favoriteProcessors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFavoriteProcessors(ViewerFilter filter);

	/**
	 * Adds the given filter to the favoriteProcessors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFavoriteProcessors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the favoriteProcessors table
	 * 
	 */
	public boolean isContainedInFavoriteProcessorsTable(EObject element);




	/**
	 * Init the runOnProcessors
	 * @param settings settings for the runOnProcessors ReferencesTable 
	 */
	public void initRunOnProcessors(ReferencesTableSettings settings);

	/**
	 * Update the runOnProcessors
	 * @param newValue the runOnProcessors to update
	 * 
	 */
	public void updateRunOnProcessors();

	/**
	 * Adds the given filter to the runOnProcessors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRunOnProcessors(ViewerFilter filter);

	/**
	 * Adds the given filter to the runOnProcessors edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRunOnProcessors(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the runOnProcessors table
	 * 
	 */
	public boolean isContainedInRunOnProcessorsTable(EObject element);


	/**
	 * @return the representedActivity
	 * 
	 */
	public EObject getRepresentedActivity();

	/**
	 * Init the representedActivity
	 * @param settings the combo setting
	 */
	public void initRepresentedActivity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new representedActivity
	 * @param newValue the new representedActivity to set
	 * 
	 */
	public void setRepresentedActivity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRepresentedActivityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the representedActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRepresentedActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the representedActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRepresentedActivity(ViewerFilter filter);




	/**
	 * Init the rtpMutualExclusionResourceUtilization
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRtpMutualExclusionResourceUtilization(ReferencesTableSettings settings);

	/**
	 * Update the rtpMutualExclusionResourceUtilization
	 * @param newValue the rtpMutualExclusionResourceUtilization to update
	 * 
	 */
	public void updateRtpMutualExclusionResourceUtilization();

	/**
	 * Adds the given filter to the rtpMutualExclusionResourceUtilization edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRtpMutualExclusionResourceUtilization(ViewerFilter filter);

	/**
	 * Adds the given filter to the rtpMutualExclusionResourceUtilization edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRtpMutualExclusionResourceUtilization(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the rtpMutualExclusionResourceUtilization table
	 * 
	 */
	public boolean isContainedInRtpMutualExclusionResourceUtilizationTable(EObject element);





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
