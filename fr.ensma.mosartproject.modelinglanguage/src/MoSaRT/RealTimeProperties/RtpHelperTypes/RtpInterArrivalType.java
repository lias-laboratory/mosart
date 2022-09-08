/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Inter Arrival Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpInterArrivalType()
 * @model
 * @generated
 */
public interface RtpInterArrivalType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
	 * @see #setUnit(TimeUnits)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpInterArrivalType_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnits getUnit();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnits value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(MaxMinAvgReal)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpInterArrivalType_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MaxMinAvgReal getValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpInterArrivalType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(MaxMinAvgReal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherInterArrivalRequired="true"
	 * @generated
	 */
	boolean greater(RtpInterArrivalType otherInterArrival);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherInterArrivalRequired="true"
	 * @generated
	 */
	boolean lower(RtpInterArrivalType otherInterArrival);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherInterArrivalRequired="true"
	 * @generated
	 */
	boolean equals(RtpInterArrivalType otherInterArrival);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitRequired="true"
	 * @generated
	 */
	RtpInterArrivalType convertsTo(TimeUnits unit);

} // RtpInterArrivalType
