/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface TestFamilyPropertiesEditionPart {

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
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the references
	 * 
	 */
	public EList getReferences();

	/**
	 * Defines a new references
	 * @param newValue the new references to set
	 * 
	 */
	public void setReferences(EList newValue);

	/**
	 * Add a value to the references multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToReferences(Object newValue);

	/**
	 * Remove a value to the references multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToReferences(Object newValue);




	/**
	 * Init the contained Tests
	 * @param settings settings for the contained Tests ReferencesTable 
	 */
	public void initContainedTests(ReferencesTableSettings settings);

	/**
	 * Update the contained Tests
	 * @param newValue the contained Tests to update
	 * 
	 */
	public void updateContainedTests();

	/**
	 * Adds the given filter to the contained Tests edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContainedTests(ViewerFilter filter);

	/**
	 * Adds the given filter to the contained Tests edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContainedTests(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the contained Tests table
	 * 
	 */
	public boolean isContainedInContainedTestsTable(EObject element);





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
