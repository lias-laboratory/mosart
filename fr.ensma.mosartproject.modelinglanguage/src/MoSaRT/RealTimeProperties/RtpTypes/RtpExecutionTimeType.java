/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Execution Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpExecutionTimeType()
 * @model
 * @generated
 */
public interface RtpExecutionTimeType extends RealTimeCommonType {
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
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpExecutionTimeType_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnits getUnit();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getUnit <em>Unit</em>}' attribute.
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
	 * @see #setValue(RtpExecutionTimeValue)
	 * @see MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage#getRtpExecutionTimeType_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpExecutionTimeValue getValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RtpExecutionTimeValue value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherExecutionTimeRequired="true"
	 * @generated
	 */
	boolean greater(RtpExecutionTimeType otherExecutionTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherExecutionTimeRequired="true"
	 * @generated
	 */
	boolean lower(RtpExecutionTimeType otherExecutionTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherExecutionTimeRequired="true"
	 * @generated
	 */
	boolean equals(RtpExecutionTimeType otherExecutionTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitRequired="true"
	 * @generated
	 */
	RtpExecutionTimeType convertsTo(TimeUnits unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RtpExecutionTimeType adoptsCalculatedValue();

} // RtpExecutionTimeType
