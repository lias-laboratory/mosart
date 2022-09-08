/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Min Avg Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getAvgValue <em>Avg Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgInteger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MaxMinAvgIntegerRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MaxMinAvgIntegerRule1='self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()'"
 * @generated
 */
public interface MaxMinAvgInteger extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgInteger_MinValue()
	 * @model default="-1"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Avg Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Value</em>' attribute.
	 * @see #setAvgValue(int)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgInteger_AvgValue()
	 * @model default="-1"
	 * @generated
	 */
	int getAvgValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getAvgValue <em>Avg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Value</em>' attribute.
	 * @see #getAvgValue()
	 * @generated
	 */
	void setAvgValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgInteger_MaxValue()
	 * @model default="-1"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

} // MaxMinAvgInteger
