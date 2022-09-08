/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface IntegerMatrixPropertiesEditionPart {



	/**
	 * Init the matrixElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMatrixElements(ReferencesTableSettings settings);

	/**
	 * Update the matrixElements
	 * @param newValue the matrixElements to update
	 * 
	 */
	public void updateMatrixElements();

	/**
	 * Adds the given filter to the matrixElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMatrixElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the matrixElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMatrixElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the matrixElements table
	 * 
	 */
	public boolean isContainedInMatrixElementsTable(EObject element);





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
