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
 * A representation of the model object '<em><b>Real Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.RealSet#getSetElements <em>Set Elements</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getRealSet()
 * @model
 * @generated
 */
public interface RealSet extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Set Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Elements</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Elements</em>' attribute list.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getRealSet_SetElements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Double> getSetElements();

} // RealSet
