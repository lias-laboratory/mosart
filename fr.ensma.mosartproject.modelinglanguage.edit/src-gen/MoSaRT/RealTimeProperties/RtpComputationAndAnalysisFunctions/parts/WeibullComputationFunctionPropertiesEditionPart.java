/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;


// End of user code

/**
 * 
 * 
 */
public interface WeibullComputationFunctionPropertiesEditionPart {

	/**
	 * @return the functionType
	 * 
	 */
	public String getFunctionType();

	/**
	 * Defines a new functionType
	 * @param newValue the new functionType to set
	 * 
	 */
	public void setFunctionType(String newValue);


	/**
	 * @return the parameters
	 * 
	 */
	public EList getParameters();

	/**
	 * Defines a new parameters
	 * @param newValue the new parameters to set
	 * 
	 */
	public void setParameters(EList newValue);

	/**
	 * Add a value to the parameters multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToParameters(Object newValue);

	/**
	 * Remove a value to the parameters multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToParameters(Object newValue);





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
