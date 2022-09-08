/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Data Rate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpDataRateType()
 * @model
 * @generated
 */
public interface RtpDataRateType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits
	 * @see #setUnit(DataTxRateUnits)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpDataRateType_Unit()
	 * @model required="true"
	 * @generated
	 */
	DataTxRateUnits getUnit();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataTxRateUnits value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(RealVariable)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpDataRateType_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RealVariable getValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RealVariable value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherDataRateRequired="true"
	 * @generated
	 */
	boolean greater(RtpDataRateType otherDataRate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherDataRateRequired="true"
	 * @generated
	 */
	boolean lower(RtpDataRateType otherDataRate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherDataRateRequired="true"
	 * @generated
	 */
	boolean equals(RtpDataRateType otherDataRate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitRequired="true"
	 * @generated
	 */
	RtpDataRateType convertsTo(DataTxRateUnits unit);

} // RtpDataRateType
