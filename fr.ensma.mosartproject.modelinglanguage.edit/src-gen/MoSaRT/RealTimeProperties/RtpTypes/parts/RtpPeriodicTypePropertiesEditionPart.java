/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpTypes.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public interface RtpPeriodicTypePropertiesEditionPart {

	/**
	 * @return the period
	 * 
	 */
	public EObject getPeriod();

	/**
	 * Init the period
	 * @param settings the combo setting
	 */
	public void initPeriod(EObjectFlatComboSettings settings);

	/**
	 * Defines a new period
	 * @param newValue the new period to set
	 * 
	 */
	public void setPeriod(EObject newValue);


	/**
	 * @return the jitter
	 * 
	 */
	public EObject getJitter();

	/**
	 * Init the jitter
	 * @param settings the combo setting
	 */
	public void initJitter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new jitter
	 * @param newValue the new jitter to set
	 * 
	 */
	public void setJitter(EObject newValue);





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
