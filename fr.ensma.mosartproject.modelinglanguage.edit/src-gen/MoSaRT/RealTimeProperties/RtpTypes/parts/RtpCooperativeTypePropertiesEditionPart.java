/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface RtpCooperativeTypePropertiesEditionPart {



	/**
	 * Init the nonPreemptibleSteps
	 * @param settings settings for the nonPreemptibleSteps ReferencesTable 
	 */
	public void initNonPreemptibleSteps(ReferencesTableSettings settings);

	/**
	 * Update the nonPreemptibleSteps
	 * @param newValue the nonPreemptibleSteps to update
	 * 
	 */
	public void updateNonPreemptibleSteps();

	/**
	 * Adds the given filter to the nonPreemptibleSteps edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNonPreemptibleSteps(ViewerFilter filter);

	/**
	 * Adds the given filter to the nonPreemptibleSteps edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNonPreemptibleSteps(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the nonPreemptibleSteps table
	 * 
	 */
	public boolean isContainedInNonPreemptibleStepsTable(EObject element);




	/**
	 * Init the nonPreemptibleIntervals
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initNonPreemptibleIntervals(ReferencesTableSettings settings);

	/**
	 * Update the nonPreemptibleIntervals
	 * @param newValue the nonPreemptibleIntervals to update
	 * 
	 */
	public void updateNonPreemptibleIntervals();

	/**
	 * Adds the given filter to the nonPreemptibleIntervals edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNonPreemptibleIntervals(ViewerFilter filter);

	/**
	 * Adds the given filter to the nonPreemptibleIntervals edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNonPreemptibleIntervals(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the nonPreemptibleIntervals table
	 * 
	 */
	public boolean isContainedInNonPreemptibleIntervalsTable(EObject element);





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
