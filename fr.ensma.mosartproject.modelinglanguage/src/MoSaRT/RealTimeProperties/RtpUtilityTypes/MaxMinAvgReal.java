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
 * A representation of the model object '<em><b>Max Min Avg Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getAvgValue <em>Avg Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgReal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MaxMinAvgRealRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot MaxMinAvgRealRule1='self.avgValue.oclAsSet()->notEmpty() or self.minValue.oclAsSet()->notEmpty() or self.maxValue.oclAsSet()->notEmpty()'"
 * @generated
 */
public interface MaxMinAvgReal extends RealTimeCommonType {
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
	 * @see #setMinValue(double)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgReal_MinValue()
	 * @model default="-1"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

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
	 * @see #setAvgValue(double)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgReal_AvgValue()
	 * @model default="-1"
	 * @generated
	 */
	double getAvgValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getAvgValue <em>Avg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Value</em>' attribute.
	 * @see #getAvgValue()
	 * @generated
	 */
	void setAvgValue(double value);

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
	 * @see #setMaxValue(double)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMaxMinAvgReal_MaxValue()
	 * @model default="-1"
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

} // MaxMinAvgReal
