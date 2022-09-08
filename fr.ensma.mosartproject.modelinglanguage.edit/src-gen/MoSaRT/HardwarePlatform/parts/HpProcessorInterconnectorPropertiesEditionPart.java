/**
 * Generated with Acceleo
 */
package MoSaRT.HardwarePlatform.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface HpProcessorInterconnectorPropertiesEditionPart {

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
	 * Init the processingUnits
	 * @param settings settings for the processingUnits ReferencesTable 
	 */
	public void initProcessingUnits(ReferencesTableSettings settings);

	/**
	 * Update the processingUnits
	 * @param newValue the processingUnits to update
	 * 
	 */
	public void updateProcessingUnits();

	/**
	 * Adds the given filter to the processingUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcessingUnits(ViewerFilter filter);

	/**
	 * Adds the given filter to the processingUnits edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcessingUnits(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processingUnits table
	 * 
	 */
	public boolean isContainedInProcessingUnitsTable(EObject element);


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
	 * @return the rtpMultiprocessorCategory
	 * 
	 */
	public EObject getRtpMultiprocessorCategory();

	/**
	 * Init the rtpMultiprocessorCategory
	 * @param settings the combo setting
	 */
	public void initRtpMultiprocessorCategory(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpMultiprocessorCategory
	 * @param newValue the new rtpMultiprocessorCategory to set
	 * 
	 */
	public void setRtpMultiprocessorCategory(EObject newValue);





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
