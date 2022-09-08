/**
 * Generated with Acceleo
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface RtpTimeLinkTypePropertiesEditionPart {

	/**
	 * @return the scheduleLink
	 * 
	 */
	public Object getScheduleLink();

	/**
	 * Init the scheduleLink
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initScheduleLink(Object input, Enumerator current);

	/**
	 * Defines a new scheduleLink
	 * @param newValue the new scheduleLink to set
	 * 
	 */
	public void setScheduleLink(Object newValue);


	/**
	 * @return the jobNumber
	 * 
	 */
	public String getJobNumber();

	/**
	 * Defines a new jobNumber
	 * @param newValue the new jobNumber to set
	 * 
	 */
	public void setJobNumber(String newValue);


	/**
	 * @return the referenceActivity
	 * 
	 */
	public EObject getReferenceActivity();

	/**
	 * Init the referenceActivity
	 * @param settings the combo setting
	 */
	public void initReferenceActivity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referenceActivity
	 * @param newValue the new referenceActivity to set
	 * 
	 */
	public void setReferenceActivity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferenceActivityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referenceActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferenceActivity(ViewerFilter filter);

	/**
	 * Adds the given filter to the referenceActivity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferenceActivity(ViewerFilter filter);





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
