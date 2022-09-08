/**
 */
package MoSaRT.FunctionalElements;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Functional Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.FunctionalElements.SystemFunctionalSide#getUmlModel <em>Uml Model</em>}</li>
 *   <li>{@link MoSaRT.FunctionalElements.SystemFunctionalSide#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see MoSaRT.FunctionalElements.FunctionalElementsPackage#getSystemFunctionalSide()
 * @model
 * @generated
 */
public interface SystemFunctionalSide extends EObject {
	/**
	 * Returns the value of the '<em><b>Uml Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Model</em>' containment reference.
	 * @see #setUmlModel(Model)
	 * @see MoSaRT.FunctionalElements.FunctionalElementsPackage#getSystemFunctionalSide_UmlModel()
	 * @model containment="true"
	 * @generated
	 */
	Model getUmlModel();

	/**
	 * Sets the value of the '{@link MoSaRT.FunctionalElements.SystemFunctionalSide#getUmlModel <em>Uml Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Model</em>' containment reference.
	 * @see #getUmlModel()
	 * @generated
	 */
	void setUmlModel(Model value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MoSaRT.FunctionalElements.FunctionalElementsPackage#getSystemFunctionalSide_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.FunctionalElements.SystemFunctionalSide#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true"
	 * @generated
	 */
	boolean importUmlModel(Model importedModel);

} // SystemFunctionalSide
