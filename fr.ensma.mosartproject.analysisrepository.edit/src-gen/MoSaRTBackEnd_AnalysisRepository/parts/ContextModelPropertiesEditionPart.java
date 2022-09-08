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
public interface ContextModelPropertiesEditionPart {

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
	 * Init the false Evaluation
	 * @param settings settings for the false Evaluation ReferencesTable 
	 */
	public void initFalseEvaluation(ReferencesTableSettings settings);

	/**
	 * Update the false Evaluation
	 * @param newValue the false Evaluation to update
	 * 
	 */
	public void updateFalseEvaluation();

	/**
	 * Adds the given filter to the false Evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFalseEvaluation(ViewerFilter filter);

	/**
	 * Adds the given filter to the false Evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFalseEvaluation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the false Evaluation table
	 * 
	 */
	public boolean isContainedInFalseEvaluationTable(EObject element);




	/**
	 * Init the true Evaluation
	 * @param settings settings for the true Evaluation ReferencesTable 
	 */
	public void initTrueEvaluation(ReferencesTableSettings settings);

	/**
	 * Update the true Evaluation
	 * @param newValue the true Evaluation to update
	 * 
	 */
	public void updateTrueEvaluation();

	/**
	 * Adds the given filter to the true Evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTrueEvaluation(ViewerFilter filter);

	/**
	 * Adds the given filter to the true Evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTrueEvaluation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the true Evaluation table
	 * 
	 */
	public boolean isContainedInTrueEvaluationTable(EObject element);




	/**
	 * Init the undefined Evaluation
	 * @param settings settings for the undefined Evaluation ReferencesTable 
	 */
	public void initUndefinedEvaluation(ReferencesTableSettings settings);

	/**
	 * Update the undefined Evaluation
	 * @param newValue the undefined Evaluation to update
	 * 
	 */
	public void updateUndefinedEvaluation();

	/**
	 * Adds the given filter to the undefined Evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToUndefinedEvaluation(ViewerFilter filter);

	/**
	 * Adds the given filter to the undefined Evaluation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToUndefinedEvaluation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the undefined Evaluation table
	 * 
	 */
	public boolean isContainedInUndefinedEvaluationTable(EObject element);




	/**
	 * Init the analysisTests
	 * @param settings settings for the analysisTests ReferencesTable 
	 */
	public void initAnalysisTests(ReferencesTableSettings settings);

	/**
	 * Update the analysisTests
	 * @param newValue the analysisTests to update
	 * 
	 */
	public void updateAnalysisTests();

	/**
	 * Adds the given filter to the analysisTests edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAnalysisTests(ViewerFilter filter);

	/**
	 * Adds the given filter to the analysisTests edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAnalysisTests(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the analysisTests table
	 * 
	 */
	public boolean isContainedInAnalysisTestsTable(EObject element);





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
