/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;


/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rtp Preemptible Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpPreemptibleType()
 * @model
 * @generated
 */
public interface RtpPreemptibleType extends RtpPreemptibilityType
{
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(RtpDurationType)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpPreemptibleType_Cost()
	 * @model containment="true"
	 * @generated
	 */
	RtpDurationType getCost();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpPreemptibleType#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(RtpDurationType value);
}
