/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealMatrix#getMatrixElements <em>Matrix Elements</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getRealMatrix()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RealMatrixRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RealMatrixRule1='self.matrixElements->forAll(el1 : RealVector, el2 : RealVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())'"
 * @generated
 */
public interface RealMatrix extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Matrix Elements</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Elements</em>' containment reference list.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getRealMatrix_MatrixElements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<RealVector> getMatrixElements();

} // RealMatrix
