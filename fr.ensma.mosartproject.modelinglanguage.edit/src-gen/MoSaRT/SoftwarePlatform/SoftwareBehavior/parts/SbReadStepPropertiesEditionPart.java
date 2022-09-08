/**
 * Generated with Acceleo
 */
package MoSaRT.SoftwarePlatform.SoftwareBehavior.parts;

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
public interface SbReadStepPropertiesEditionPart {

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
	 * Init the inputStepRelation
	 * @param settings settings for the inputStepRelation ReferencesTable 
	 */
	public void initInputStepRelation(ReferencesTableSettings settings);

	/**
	 * Update the inputStepRelation
	 * @param newValue the inputStepRelation to update
	 * 
	 */
	public void updateInputStepRelation();

	/**
	 * Adds the given filter to the inputStepRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputStepRelation(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputStepRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputStepRelation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inputStepRelation table
	 * 
	 */
	public boolean isContainedInInputStepRelationTable(EObject element);




	/**
	 * Init the outputStepRelation
	 * @param settings settings for the outputStepRelation ReferencesTable 
	 */
	public void initOutputStepRelation(ReferencesTableSettings settings);

	/**
	 * Update the outputStepRelation
	 * @param newValue the outputStepRelation to update
	 * 
	 */
	public void updateOutputStepRelation();

	/**
	 * Adds the given filter to the outputStepRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputStepRelation(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputStepRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputStepRelation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outputStepRelation table
	 * 
	 */
	public boolean isContainedInOutputStepRelationTable(EObject element);


	/**
	 * @return the representedOperation
	 * 
	 */
	public EObject getRepresentedOperation();

	/**
	 * Init the representedOperation
	 * @param settings the combo setting
	 */
	public void initRepresentedOperation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new representedOperation
	 * @param newValue the new representedOperation to set
	 * 
	 */
	public void setRepresentedOperation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRepresentedOperationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the representedOperation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRepresentedOperation(ViewerFilter filter);

	/**
	 * Adds the given filter to the representedOperation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRepresentedOperation(ViewerFilter filter);


	/**
	 * @return the interactionResource
	 * 
	 */
	public EObject getInteractionResource();

	/**
	 * Init the interactionResource
	 * @param settings the combo setting
	 */
	public void initInteractionResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new interactionResource
	 * @param newValue the new interactionResource to set
	 * 
	 */
	public void setInteractionResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInteractionResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the interactionResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInteractionResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the interactionResource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInteractionResource(ViewerFilter filter);


	/**
	 * @return the rtpExecutionTime
	 * 
	 */
	public EObject getRtpExecutionTime();

	/**
	 * Init the rtpExecutionTime
	 * @param settings the combo setting
	 */
	public void initRtpExecutionTime(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpExecutionTime
	 * @param newValue the new rtpExecutionTime to set
	 * 
	 */
	public void setRtpExecutionTime(EObject newValue);


	/**
	 * @return the rtpDeadline
	 * 
	 */
	public EObject getRtpDeadline();

	/**
	 * Init the rtpDeadline
	 * @param settings the combo setting
	 */
	public void initRtpDeadline(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpDeadline
	 * @param newValue the new rtpDeadline to set
	 * 
	 */
	public void setRtpDeadline(EObject newValue);


	/**
	 * @return the rtpBlockingTime
	 * 
	 */
	public EObject getRtpBlockingTime();

	/**
	 * Init the rtpBlockingTime
	 * @param settings the combo setting
	 */
	public void initRtpBlockingTime(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpBlockingTime
	 * @param newValue the new rtpBlockingTime to set
	 * 
	 */
	public void setRtpBlockingTime(EObject newValue);


	/**
	 * @return the rtpRepetition
	 * 
	 */
	public EObject getRtpRepetition();

	/**
	 * Init the rtpRepetition
	 * @param settings the combo setting
	 */
	public void initRtpRepetition(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpRepetition
	 * @param newValue the new rtpRepetition to set
	 * 
	 */
	public void setRtpRepetition(EObject newValue);





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
