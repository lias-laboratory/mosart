/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts;

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
public interface RtpMutuExcluResourceUtilizationTypePropertiesEditionPart {

	/**
	 * @return the resource
	 * 
	 */
	public EObject getResource();

	/**
	 * Init the resource
	 * @param settings the combo setting
	 */
	public void initResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new resource
	 * @param newValue the new resource to set
	 * 
	 */
	public void setResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter);


	/**
	 * @return the timeUtilization
	 * 
	 */
	public EObject getTimeUtilization();

	/**
	 * Init the timeUtilization
	 * @param settings the combo setting
	 */
	public void initTimeUtilization(EObjectFlatComboSettings settings);

	/**
	 * Defines a new timeUtilization
	 * @param newValue the new timeUtilization to set
	 * 
	 */
	public void setTimeUtilization(EObject newValue);


	/**
	 * @return the specialAccessPriority
	 * 
	 */
	public EObject getSpecialAccessPriority();

	/**
	 * Init the specialAccessPriority
	 * @param settings the combo setting
	 */
	public void initSpecialAccessPriority(EObjectFlatComboSettings settings);

	/**
	 * Defines a new specialAccessPriority
	 * @param newValue the new specialAccessPriority to set
	 * 
	 */
	public void setSpecialAccessPriority(EObject newValue);





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
