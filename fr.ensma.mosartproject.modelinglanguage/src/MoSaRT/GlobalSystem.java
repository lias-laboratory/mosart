/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT;

import MoSaRT.FunctionalElements.SystemFunctionalSide;

import MoSaRT.HardwarePlatform.SystemHardwareSide;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SystemSoftwareSide;


import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.GlobalSystem#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.GlobalSystem#getSoftwareSide <em>Software Side</em>}</li>
 *   <li>{@link MoSaRT.GlobalSystem#getHardwareSide <em>Hardware Side</em>}</li>
 *   <li>{@link MoSaRT.GlobalSystem#getFunctionalSide <em>Functional Side</em>}</li>
 *   <li>{@link MoSaRT.GlobalSystem#getComment <em>Comment</em>}</li>
 *   <li>{@link MoSaRT.GlobalSystem#getAnalysisRepositoryLocation <em>Analysis Repository Location</em>}</li>
 * </ul>
 *
 * @see MoSaRT.MoSaRTPackage#getGlobalSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='GlobalSystemRuleTest'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot GlobalSystemRuleTest='self.name->notEmpty()'"
 * @generated
 */
public interface GlobalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Software Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Side</em>' containment reference.
	 * @see #setSoftwareSide(SystemSoftwareSide)
	 * @see MoSaRT.MoSaRTPackage#getGlobalSystem_SoftwareSide()
	 * @model containment="true"
	 * @generated
	 */
	SystemSoftwareSide getSoftwareSide();

	/**
	 * Sets the value of the '{@link MoSaRT.GlobalSystem#getSoftwareSide <em>Software Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Side</em>' containment reference.
	 * @see #getSoftwareSide()
	 * @generated
	 */
	void setSoftwareSide(SystemSoftwareSide value);

	/**
	 * Returns the value of the '<em><b>Hardware Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Side</em>' containment reference.
	 * @see #setHardwareSide(SystemHardwareSide)
	 * @see MoSaRT.MoSaRTPackage#getGlobalSystem_HardwareSide()
	 * @model containment="true"
	 * @generated
	 */
	SystemHardwareSide getHardwareSide();

	/**
	 * Sets the value of the '{@link MoSaRT.GlobalSystem#getHardwareSide <em>Hardware Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Side</em>' containment reference.
	 * @see #getHardwareSide()
	 * @generated
	 */
	void setHardwareSide(SystemHardwareSide value);

	/**
	 * Returns the value of the '<em><b>Functional Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Side</em>' containment reference.
	 * @see #setFunctionalSide(SystemFunctionalSide)
	 * @see MoSaRT.MoSaRTPackage#getGlobalSystem_FunctionalSide()
	 * @model containment="true"
	 * @generated
	 */
	SystemFunctionalSide getFunctionalSide();

	/**
	 * Sets the value of the '{@link MoSaRT.GlobalSystem#getFunctionalSide <em>Functional Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Side</em>' containment reference.
	 * @see #getFunctionalSide()
	 * @generated
	 */
	void setFunctionalSide(SystemFunctionalSide value);

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
	 * @see MoSaRT.MoSaRTPackage#getGlobalSystem_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MoSaRT.GlobalSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see MoSaRT.MoSaRTPackage#getGlobalSystem_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link MoSaRT.GlobalSystem#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Analysis Repository Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Repository Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Repository Location</em>' attribute.
	 * @see #setAnalysisRepositoryLocation(String)
	 * @see MoSaRT.MoSaRTPackage#getGlobalSystem_AnalysisRepositoryLocation()
	 * @model
	 * @generated
	 */
	String getAnalysisRepositoryLocation();

	/**
	 * Sets the value of the '{@link MoSaRT.GlobalSystem#getAnalysisRepositoryLocation <em>Analysis Repository Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Repository Location</em>' attribute.
	 * @see #getAnalysisRepositoryLocation()
	 * @generated
	 */
	void setAnalysisRepositoryLocation(String value);

} // GlobalSystem
