/**
 * Generated with Acceleo
 */
package MoSaRT.FunctionalElements.parts;

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
public interface SystemFunctionalSidePropertiesEditionPart {

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
	 * @return the umlModel
	 * 
	 */
	public EObject getUmlModel();

	/**
	 * Init the umlModel
	 * @param settings the combo setting
	 */
	public void initUmlModel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new umlModel
	 * @param newValue the new umlModel to set
	 * 
	 */
	public void setUmlModel(EObject newValue);





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
