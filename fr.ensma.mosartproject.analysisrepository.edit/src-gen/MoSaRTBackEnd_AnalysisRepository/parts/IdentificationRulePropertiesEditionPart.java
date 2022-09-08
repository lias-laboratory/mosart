/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

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
public interface IdentificationRulePropertiesEditionPart {

	/**
	 * @return the id
	 * 
	 */
	public String getId();

	/**
	 * Defines a new id
	 * @param newValue the new id to set
	 * 
	 */
	public void setId(String newValue);


	/**
	 * @return the component Kind
	 * 
	 */
	public Enumerator getComponentKind();

	/**
	 * Init the component Kind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initComponentKind(Object input, Enumerator current);

	/**
	 * Defines a new component Kind
	 * @param newValue the new component Kind to set
	 * 
	 */
	public void setComponentKind(Enumerator newValue);


	/**
	 * @return the timing Kind
	 * 
	 */
	public Enumerator getTimingKind();

	/**
	 * Init the timing Kind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initTimingKind(Object input, Enumerator current);

	/**
	 * Defines a new timing Kind
	 * @param newValue the new timing Kind to set
	 * 
	 */
	public void setTimingKind(Enumerator newValue);


	/**
	 * @return the rule
	 * 
	 */
	public EObject getRule();

	/**
	 * Init the rule
	 * @param settings the combo setting
	 */
	public void initRule(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rule
	 * @param newValue the new rule to set
	 * 
	 */
	public void setRule(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRuleButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the rule edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRule(ViewerFilter filter);

	/**
	 * Adds the given filter to the rule edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRule(ViewerFilter filter);


	/**
	 * @return the rule Context
	 * 
	 */
	public EObject getRuleContext();

	/**
	 * Init the rule Context
	 * @param settings the combo setting
	 */
	public void initRuleContext(EObjectFlatComboSettings settings);

	/**
	 * Defines a new rule Context
	 * @param newValue the new rule Context to set
	 * 
	 */
	public void setRuleContext(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setRuleContextButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the rule Context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRuleContext(ViewerFilter filter);

	/**
	 * Adds the given filter to the rule Context edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRuleContext(ViewerFilter filter);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);





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
