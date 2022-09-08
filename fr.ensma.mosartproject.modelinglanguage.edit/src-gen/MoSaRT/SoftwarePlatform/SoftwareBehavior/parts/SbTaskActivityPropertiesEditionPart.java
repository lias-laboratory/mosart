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
public interface SbTaskActivityPropertiesEditionPart {

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
	 * @return the trigger
	 * 
	 */
	public EObject getTrigger();

	/**
	 * Init the trigger
	 * @param settings the combo setting
	 */
	public void initTrigger(EObjectFlatComboSettings settings);

	/**
	 * Defines a new trigger
	 * @param newValue the new trigger to set
	 * 
	 */
	public void setTrigger(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTriggerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the trigger edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTrigger(ViewerFilter filter);

	/**
	 * Adds the given filter to the trigger edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTrigger(ViewerFilter filter);




	/**
	 * Init the inputSquencingRelation
	 * @param settings settings for the inputSquencingRelation ReferencesTable 
	 */
	public void initInputSquencingRelation(ReferencesTableSettings settings);

	/**
	 * Update the inputSquencingRelation
	 * @param newValue the inputSquencingRelation to update
	 * 
	 */
	public void updateInputSquencingRelation();

	/**
	 * Adds the given filter to the inputSquencingRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputSquencingRelation(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputSquencingRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputSquencingRelation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inputSquencingRelation table
	 * 
	 */
	public boolean isContainedInInputSquencingRelationTable(EObject element);




	/**
	 * Init the outputSequencingRelation
	 * @param settings settings for the outputSequencingRelation ReferencesTable 
	 */
	public void initOutputSequencingRelation(ReferencesTableSettings settings);

	/**
	 * Update the outputSequencingRelation
	 * @param newValue the outputSequencingRelation to update
	 * 
	 */
	public void updateOutputSequencingRelation();

	/**
	 * Adds the given filter to the outputSequencingRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutputSequencingRelation(ViewerFilter filter);

	/**
	 * Adds the given filter to the outputSequencingRelation edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutputSequencingRelation(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outputSequencingRelation table
	 * 
	 */
	public boolean isContainedInOutputSequencingRelationTable(EObject element);


	/**
	 * @return the rootActionStep
	 * 
	 */
	public EObject getRootActionStep();

	/**
	 * Init the rootActionStep
	 * @param settings the combo setting
	 */
	public void initRootActionStep(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rootActionStep
	 * @param newValue the new rootActionStep to set
	 * 
	 */
	public void setRootActionStep(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRootActionStepButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the rootActionStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRootActionStep(ViewerFilter filter);

	/**
	 * Adds the given filter to the rootActionStep edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRootActionStep(ViewerFilter filter);


	/**
	 * @return the representedTask
	 * 
	 */
	public EObject getRepresentedTask();

	/**
	 * Init the representedTask
	 * @param settings the combo setting
	 */
	public void initRepresentedTask(EObjectFlatComboSettings settings);

	/**
	 * Defines a new representedTask
	 * @param newValue the new representedTask to set
	 * 
	 */
	public void setRepresentedTask(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRepresentedTaskButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the representedTask edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRepresentedTask(ViewerFilter filter);

	/**
	 * Adds the given filter to the representedTask edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRepresentedTask(ViewerFilter filter);


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
	 * @return the rtpOffset
	 * 
	 */
	public EObject getRtpOffset();

	/**
	 * Init the rtpOffset
	 * @param settings the combo setting
	 */
	public void initRtpOffset(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpOffset
	 * @param newValue the new rtpOffset to set
	 * 
	 */
	public void setRtpOffset(EObject newValue);


	/**
	 * @return the rtpPriority
	 * 
	 */
	public EObject getRtpPriority();

	/**
	 * Init the rtpPriority
	 * @param settings the combo setting
	 */
	public void initRtpPriority(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpPriority
	 * @param newValue the new rtpPriority to set
	 * 
	 */
	public void setRtpPriority(EObject newValue);


	/**
	 * @return the rtpCriticality
	 * 
	 */
	public EObject getRtpCriticality();

	/**
	 * Init the rtpCriticality
	 * @param settings the combo setting
	 */
	public void initRtpCriticality(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpCriticality
	 * @param newValue the new rtpCriticality to set
	 * 
	 */
	public void setRtpCriticality(EObject newValue);


	/**
	 * @return the rtpPreemptibility
	 * 
	 */
	public EObject getRtpPreemptibility();

	/**
	 * Init the rtpPreemptibility
	 * @param settings the combo setting
	 */
	public void initRtpPreemptibility(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpPreemptibility
	 * @param newValue the new rtpPreemptibility to set
	 * 
	 */
	public void setRtpPreemptibility(EObject newValue);


	/**
	 * @return the rtpSelfSuspension
	 * 
	 */
	public EObject getRtpSelfSuspension();

	/**
	 * Init the rtpSelfSuspension
	 * @param settings the combo setting
	 */
	public void initRtpSelfSuspension(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpSelfSuspension
	 * @param newValue the new rtpSelfSuspension to set
	 * 
	 */
	public void setRtpSelfSuspension(EObject newValue);


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
	 * @return the rtpResponseTime
	 * 
	 */
	public EObject getRtpResponseTime();

	/**
	 * Init the rtpResponseTime
	 * @param settings the combo setting
	 */
	public void initRtpResponseTime(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rtpResponseTime
	 * @param newValue the new rtpResponseTime to set
	 * 
	 */
	public void setRtpResponseTime(EObject newValue);


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
	 * Init the actionSteps
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initActionSteps(ReferencesTableSettings settings);

	/**
	 * Update the actionSteps
	 * @param newValue the actionSteps to update
	 * 
	 */
	public void updateActionSteps();

	/**
	 * Adds the given filter to the actionSteps edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActionSteps(ViewerFilter filter);

	/**
	 * Adds the given filter to the actionSteps edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActionSteps(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the actionSteps table
	 * 
	 */
	public boolean isContainedInActionStepsTable(EObject element);





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
