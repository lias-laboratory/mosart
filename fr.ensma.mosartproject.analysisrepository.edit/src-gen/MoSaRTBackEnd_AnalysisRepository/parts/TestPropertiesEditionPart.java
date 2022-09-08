/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

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
public interface TestPropertiesEditionPart {

	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);


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
	 * Init the tools To Apply
	 * @param settings settings for the tools To Apply ReferencesTable 
	 */
	public void initToolsToApply(ReferencesTableSettings settings);

	/**
	 * Update the tools To Apply
	 * @param newValue the tools To Apply to update
	 * 
	 */
	public void updateToolsToApply();

	/**
	 * Adds the given filter to the tools To Apply edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToToolsToApply(ViewerFilter filter);

	/**
	 * Adds the given filter to the tools To Apply edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToToolsToApply(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tools To Apply table
	 * 
	 */
	public boolean isContainedInToolsToApplyTable(EObject element);


	/**
	 * @return the its Test Family
	 * 
	 */
	public EObject getItsTestFamily();

	/**
	 * Init the its Test Family
	 * @param settings the combo setting
	 */
	public void initItsTestFamily(EObjectFlatComboSettings settings);

	/**
	 * Defines a new its Test Family
	 * @param newValue the new its Test Family to set
	 * 
	 */
	public void setItsTestFamily(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setItsTestFamilyButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the its Test Family edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToItsTestFamily(ViewerFilter filter);

	/**
	 * Adds the given filter to the its Test Family edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToItsTestFamily(ViewerFilter filter);




	/**
	 * Init the characteristics
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCharacteristics(ReferencesTableSettings settings);

	/**
	 * Update the characteristics
	 * @param newValue the characteristics to update
	 * 
	 */
	public void updateCharacteristics();

	/**
	 * Adds the given filter to the characteristics edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCharacteristics(ViewerFilter filter);

	/**
	 * Adds the given filter to the characteristics edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCharacteristics(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the characteristics table
	 * 
	 */
	public boolean isContainedInCharacteristicsTable(EObject element);





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
