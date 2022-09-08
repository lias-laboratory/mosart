/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;


// End of user code

/**
 * 
 * 
 */
public interface DataQueueCommunicationMechanismPropertiesEditionPart {

	/**
	 * @return the mechanismType
	 * 
	 */
	public String getMechanismType();

	/**
	 * Defines a new mechanismType
	 * @param newValue the new mechanismType to set
	 * 
	 */
	public void setMechanismType(String newValue);


	/**
	 * @return the overwriting
	 * 
	 */
	public Boolean getOverwriting();

	/**
	 * Defines a new overwriting
	 * @param newValue the new overwriting to set
	 * 
	 */
	public void setOverwriting(Boolean newValue);


	/**
	 * @return the rtpDataSize
	 * 
	 */
	public EObject getRtpDataSize();

	/**
	 * Init the rtpDataSize
	 * @param settings the combo setting
	 */
	public void initRtpDataSize(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpDataSize
	 * @param newValue the new rtpDataSize to set
	 * 
	 */
	public void setRtpDataSize(EObject newValue);





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
