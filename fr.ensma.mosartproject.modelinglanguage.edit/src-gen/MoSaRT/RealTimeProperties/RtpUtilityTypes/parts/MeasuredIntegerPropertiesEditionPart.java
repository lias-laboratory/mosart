/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;


// End of user code

/**
 * 
 * 
 */
public interface MeasuredIntegerPropertiesEditionPart {

	/**
	 * @return the value
	 * 
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(String newValue);


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
	 * @return the allOldValues
	 * 
	 */
	public EList getAllOldValues();

	/**
	 * Defines a new allOldValues
	 * @param newValue the new allOldValues to set
	 * 
	 */
	public void setAllOldValues(EList newValue);

	/**
	 * Add a value to the allOldValues multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToAllOldValues(Object newValue);

	/**
	 * Remove a value to the allOldValues multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToAllOldValues(Object newValue);





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
