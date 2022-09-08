/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface SbStepPrecedenceRelationPropertiesEditionPart {

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
	 * @return the sourceStep
	 * 
	 */
	public EObject getSourceStep();

	/**
	 * Init the sourceStep
	 * @param settings the combo setting
	 */
	public void initSourceStep(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sourceStep
	 * @param newValue the new sourceStep to set
	 * 
	 */
	public void setSourceStep(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourceStepButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sourceStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSourceStep(ViewerFilter filter);

	/**
	 * Adds the given filter to the sourceStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSourceStep(ViewerFilter filter);


	/**
	 * @return the targetStep
	 * 
	 */
	public EObject getTargetStep();

	/**
	 * Init the targetStep
	 * @param settings the combo setting
	 */
	public void initTargetStep(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetStep
	 * @param newValue the new targetStep to set
	 * 
	 */
	public void setTargetStep(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetStepButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetStep(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetStep(ViewerFilter filter);





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
