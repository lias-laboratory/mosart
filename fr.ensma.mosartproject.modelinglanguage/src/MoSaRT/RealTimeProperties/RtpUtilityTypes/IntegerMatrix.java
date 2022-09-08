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
 * A representation of the model object '<em><b>Integer Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix#getMatrixElements <em>Matrix Elements</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerMatrix()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IntegerMatrixRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IntegerMatrixRule1='self.matrixElements->forAll(el1 : IntegerVector, el2 : IntegerVector | el1.oclAsSet()->size() = el2.oclAsSet()->size())'"
 * @generated
 */
public interface IntegerMatrix extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Matrix Elements</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Elements</em>' containment reference list.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerMatrix_MatrixElements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IntegerVector> getMatrixElements();

} // IntegerMatrix
