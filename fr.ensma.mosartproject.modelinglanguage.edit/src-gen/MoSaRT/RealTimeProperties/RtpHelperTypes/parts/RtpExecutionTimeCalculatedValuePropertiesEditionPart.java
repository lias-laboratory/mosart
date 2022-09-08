/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface RtpExecutionTimeCalculatedValuePropertiesEditionPart {

	/**
	 * @return the unknownValueName
	 * 
	 */
	public String getUnknownValueName();

	/**
	 * Defines a new unknownValueName
	 * @param newValue the new unknownValueName to set
	 * 
	 */
	public void setUnknownValueName(String newValue);


	/**
	 * @return the toolUsedDescriptions
	 * 
	 */
	public EList getToolUsedDescriptions();

	/**
	 * Defines a new toolUsedDescriptions
	 * @param newValue the new toolUsedDescriptions to set
	 * 
	 */
	public void setToolUsedDescriptions(EList newValue);

	/**
	 * Add a value to the toolUsedDescriptions multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToToolUsedDescriptions(Object newValue);

	/**
	 * Remove a value to the toolUsedDescriptions multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToToolUsedDescriptions(Object newValue);




	/**
	 * Init the allOldValues
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAllOldValues(ReferencesTableSettings settings);

	/**
	 * Update the allOldValues
	 * @param newValue the allOldValues to update
	 * 
	 */
	public void updateAllOldValues();

	/**
	 * Adds the given filter to the allOldValues edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAllOldValues(ViewerFilter filter);

	/**
	 * Adds the given filter to the allOldValues edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAllOldValues(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the allOldValues table
	 * 
	 */
	public boolean isContainedInAllOldValuesTable(EObject element);


	/**
	 * @return the value
	 * 
	 */
	public EObject getValue();

	/**
	 * Init the value
	 * @param settings the combo setting
	 */
	public void initValue(EObjectFlatComboSettings settings);

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(EObject newValue);





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
