/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts;

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
public interface HpNetworkPortPropertiesEditionPart {

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
	 * @return the commChannel
	 * 
	 */
	public EObject getCommChannel();

	/**
	 * Init the commChannel
	 * @param settings the combo setting
	 */
	public void initCommChannel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new commChannel
	 * @param newValue the new commChannel to set
	 * 
	 */
	public void setCommChannel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCommChannelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the commChannel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommChannel(ViewerFilter filter);

	/**
	 * Adds the given filter to the commChannel edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommChannel(ViewerFilter filter);


	/**
	 * @return the rtpFlowRate
	 * 
	 */
	public EObject getRtpFlowRate();

	/**
	 * Init the rtpFlowRate
	 * @param settings the combo setting
	 */
	public void initRtpFlowRate(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpFlowRate
	 * @param newValue the new rtpFlowRate to set
	 * 
	 */
	public void setRtpFlowRate(EObject newValue);


	/**
	 * @return the rtpNetworkProtocol
	 * 
	 */
	public EObject getRtpNetworkProtocol();

	/**
	 * Init the rtpNetworkProtocol
	 * @param settings the combo setting
	 */
	public void initRtpNetworkProtocol(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpNetworkProtocol
	 * @param newValue the new rtpNetworkProtocol to set
	 * 
	 */
	public void setRtpNetworkProtocol(EObject newValue);


	/**
	 * @return the rtpTransmissionMode
	 * 
	 */
	public EObject getRtpTransmissionMode();

	/**
	 * Init the rtpTransmissionMode
	 * @param settings the combo setting
	 */
	public void initRtpTransmissionMode(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpTransmissionMode
	 * @param newValue the new rtpTransmissionMode to set
	 * 
	 */
	public void setRtpTransmissionMode(EObject newValue);





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
