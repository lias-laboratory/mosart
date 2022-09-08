/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public interface RtpDataRateTypePropertiesEditionPart {

	/**
	 * @return the unit
	 * 
	 */
	public Enumerator getUnit();

	/**
	 * Init the unit
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initUnit(Object input, Enumerator current);

	/**
	 * Defines a new unit
	 * @param newValue the new unit to set
	 * 
	 */
	public void setUnit(Enumerator newValue);


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
