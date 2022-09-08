/**
 * Generated with Acceleo
 */
package MoSaRTBackEnd_AnalysisRepository.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface GeneralizationRelationshipPropertiesEditionPart {

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
	 * @return the specific Model
	 * 
	 */
	public EObject getSpecificModel();

	/**
	 * Init the specific Model
	 * @param settings the combo setting
	 */
	public void initSpecificModel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new specific Model
	 * @param newValue the new specific Model to set
	 * 
	 */
	public void setSpecificModel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSpecificModelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the specific Model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSpecificModel(ViewerFilter filter);

	/**
	 * Adds the given filter to the specific Model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSpecificModel(ViewerFilter filter);


	/**
	 * @return the generic Model
	 * 
	 */
	public EObject getGenericModel();

	/**
	 * Init the generic Model
	 * @param settings the combo setting
	 */
	public void initGenericModel(EObjectFlatComboSettings settings);

	/**
	 * Defines a new generic Model
	 * @param newValue the new generic Model to set
	 * 
	 */
	public void setGenericModel(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setGenericModelButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the generic Model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGenericModel(ViewerFilter filter);

	/**
	 * Adds the given filter to the generic Model edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGenericModel(ViewerFilter filter);


	/**
	 * @return the behavior Kind
	 * 
	 */
	public EList getBehaviorKind();

	/**
	 * Defines a new behavior Kind
	 * @param newValue the new behavior Kind to set
	 * 
	 */
	public void setBehaviorKind(EList newValue);

	/**
	 * Add a value to the behavior Kind multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToBehaviorKind(Object newValue);

	/**
	 * Remove a value to the behavior Kind multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToBehaviorKind(Object newValue);


	/**
	 * @return the location of generic to specific model transformation program
	 * 
	 */
	public String getLocationOfGenericToSpecificModelTransformationProgram();

	/**
	 * Defines a new location of generic to specific model transformation program
	 * @param newValue the new location of generic to specific model transformation program to set
	 * 
	 */
	public void setLocationOfGenericToSpecificModelTransformationProgram(String newValue);


	/**
	 * @return the location of specific to generic model transformation program
	 * 
	 */
	public String getLocationOfSpecificToGenericModelTransformationProgram();

	/**
	 * Defines a new location of specific to generic model transformation program
	 * @param newValue the new location of specific to generic model transformation program to set
	 * 
	 */
	public void setLocationOfSpecificToGenericModelTransformationProgram(String newValue);





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
