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
public interface SbPrecedenceRelationPropertiesEditionPart {

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
	 * @return the targetSchedulingActivity
	 * 
	 */
	public EObject getTargetSchedulingActivity();

	/**
	 * Init the targetSchedulingActivity
	 * @param settings the combo setting
	 */
	public void initTargetSchedulingActivity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetSchedulingActivity
	 * @param newValue the new targetSchedulingActivity to set
	 * 
	 */
	public void setTargetSchedulingActivity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetSchedulingActivityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetSchedulingActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetSchedulingActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetSchedulingActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetSchedulingActivity(ViewerFilter filter);


	/**
	 * @return the sourceSchedulingActivity
	 * 
	 */
	public EObject getSourceSchedulingActivity();

	/**
	 * Init the sourceSchedulingActivity
	 * @param settings the combo setting
	 */
	public void initSourceSchedulingActivity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sourceSchedulingActivity
	 * @param newValue the new sourceSchedulingActivity to set
	 * 
	 */
	public void setSourceSchedulingActivity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourceSchedulingActivityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sourceSchedulingActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSourceSchedulingActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the sourceSchedulingActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSourceSchedulingActivity(ViewerFilter filter);





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
