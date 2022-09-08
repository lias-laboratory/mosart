/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

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
public interface AnalysisRepositoryPropertiesEditionPart {

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
	 * Init the generalization Relationships
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGeneralizationRelationships(ReferencesTableSettings settings);

	/**
	 * Update the generalization Relationships
	 * @param newValue the generalization Relationships to update
	 * 
	 */
	public void updateGeneralizationRelationships();

	/**
	 * Adds the given filter to the generalization Relationships edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGeneralizationRelationships(ViewerFilter filter);

	/**
	 * Adds the given filter to the generalization Relationships edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGeneralizationRelationships(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the generalization Relationships table
	 * 
	 */
	public boolean isContainedInGeneralizationRelationshipsTable(EObject element);




	/**
	 * Init the context Models
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initContextModels(ReferencesTableSettings settings);

	/**
	 * Update the context Models
	 * @param newValue the context Models to update
	 * 
	 */
	public void updateContextModels();

	/**
	 * Adds the given filter to the context Models edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContextModels(ViewerFilter filter);

	/**
	 * Adds the given filter to the context Models edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContextModels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the context Models table
	 * 
	 */
	public boolean isContainedInContextModelsTable(EObject element);




	/**
	 * Init the identification Rules
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initIdentificationRules(ReferencesTableSettings settings);

	/**
	 * Update the identification Rules
	 * @param newValue the identification Rules to update
	 * 
	 */
	public void updateIdentificationRules();

	/**
	 * Adds the given filter to the identification Rules edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToIdentificationRules(ViewerFilter filter);

	/**
	 * Adds the given filter to the identification Rules edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToIdentificationRules(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the identification Rules table
	 * 
	 */
	public boolean isContainedInIdentificationRulesTable(EObject element);




	/**
	 * Init the analysis Tools
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAnalysisTools(ReferencesTableSettings settings);

	/**
	 * Update the analysis Tools
	 * @param newValue the analysis Tools to update
	 * 
	 */
	public void updateAnalysisTools();

	/**
	 * Adds the given filter to the analysis Tools edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAnalysisTools(ViewerFilter filter);

	/**
	 * Adds the given filter to the analysis Tools edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAnalysisTools(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the analysis Tools table
	 * 
	 */
	public boolean isContainedInAnalysisToolsTable(EObject element);


	/**
	 * @return the metaModel of MoSaRT
	 * 
	 */
	public EObject getMetaModelOfMoSaRT();

	/**
	 * Init the metaModel of MoSaRT
	 * @param settings the combo setting
	 */
	public void initMetaModelOfMoSaRT(EObjectFlatComboSettings settings);

	/**
	 * Defines a new metaModel of MoSaRT
	 * @param newValue the new metaModel of MoSaRT to set
	 * 
	 */
	public void setMetaModelOfMoSaRT(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMetaModelOfMoSaRTButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the metaModel of MoSaRT edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMetaModelOfMoSaRT(ViewerFilter filter);

	/**
	 * Adds the given filter to the metaModel of MoSaRT edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMetaModelOfMoSaRT(ViewerFilter filter);




	/**
	 * Init the test Families
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initTestFamilies(ReferencesTableSettings settings);

	/**
	 * Update the test Families
	 * @param newValue the test Families to update
	 * 
	 */
	public void updateTestFamilies();

	/**
	 * Adds the given filter to the test Families edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTestFamilies(ViewerFilter filter);

	/**
	 * Adds the given filter to the test Families edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTestFamilies(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the test Families table
	 * 
	 */
	public boolean isContainedInTestFamiliesTable(EObject element);





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
