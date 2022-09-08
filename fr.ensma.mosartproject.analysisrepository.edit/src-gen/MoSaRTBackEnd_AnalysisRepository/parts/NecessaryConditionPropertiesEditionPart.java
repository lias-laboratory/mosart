/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface NecessaryConditionPropertiesEditionPart {

	/**
	 * @return the comment
	 * 
	 */
	public String getComment();

	/**
	 * Defines a new comment
	 * @param newValue the new comment to set
	 * 
	 */
	public void setComment(String newValue);




	/**
	 * Init the contexts
	 * @param settings settings for the contexts ReferencesTable 
	 */
	public void initContexts(ReferencesTableSettings settings);

	/**
	 * Update the contexts
	 * @param newValue the contexts to update
	 * 
	 */
	public void updateContexts();

	/**
	 * Adds the given filter to the contexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContexts(ViewerFilter filter);

	/**
	 * Adds the given filter to the contexts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContexts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contexts table
	 * 
	 */
	public boolean isContainedInContextsTable(EObject element);





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
