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
 * A representation of the model object '<em><b>Integer Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector#getVectorElements <em>Vector Elements</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerVector()
 * @model
 * @generated
 */
public interface IntegerVector extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Vector Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Elements</em>' attribute list.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerVector_VectorElements()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<Integer> getVectorElements();

} // IntegerVector
