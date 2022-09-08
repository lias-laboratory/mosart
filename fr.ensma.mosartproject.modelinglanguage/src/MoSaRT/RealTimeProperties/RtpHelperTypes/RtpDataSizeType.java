/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import MoSaRT.RealTimeProperties.RealTimeCommonType;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Data Size Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpDataSizeType()
 * @model
 * @generated
 */
public interface RtpDataSizeType extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
	 * @see #setUnit(DataSizeUnits)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpDataSizeType_Unit()
	 * @model required="true"
	 * @generated
	 */
	DataSizeUnits getUnit();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataSizeUnits value);

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
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpDataSizeType_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RealVariable getValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType#getValue <em>Value</em>}' containment reference.
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
	 * @model otherDataSizeRequired="true"
	 * @generated
	 */
	boolean greater(RtpDataSizeType otherDataSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherDataSizeRequired="true"
	 * @generated
	 */
	boolean lower(RtpDataSizeType otherDataSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherDataSizeRequired="true"
	 * @generated
	 */
	boolean equals(RtpDataSizeType otherDataSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unitRequired="true"
	 * @generated
	 */
	RtpDataSizeType convertsTo(DataSizeUnits unit);

} // RtpDataSizeType
