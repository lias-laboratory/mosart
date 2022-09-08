/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rtp Execution Time Calculated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getUnknownValueName <em>Unknown Value Name</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getToolUsedDescriptions <em>Tool Used Descriptions</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getValue <em>Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getAllOldValues <em>All Old Values</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeCalculatedValue()
 * @model
 * @generated
 */
public interface RtpExecutionTimeCalculatedValue extends RtpExecutionTimeValue {
	/**
	 * Returns the value of the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Value Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Value Name</em>' attribute.
	 * @see #setUnknownValueName(String)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeCalculatedValue_UnknownValueName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUnknownValueName();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getUnknownValueName <em>Unknown Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Value Name</em>' attribute.
	 * @see #getUnknownValueName()
	 * @generated
	 */
	void setUnknownValueName(String value);

	/**
	 * Returns the value of the '<em><b>Tool Used Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Used Descriptions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Used Descriptions</em>' attribute list.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeCalculatedValue_ToolUsedDescriptions()
	 * @model default=""
	 * @generated
	 */
	EList<String> getToolUsedDescriptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(RtpExecutionTimeConcreteValue)
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeCalculatedValue_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RtpExecutionTimeConcreteValue getValue();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RtpExecutionTimeConcreteValue value);

	/**
	 * Returns the value of the '<em><b>All Old Values</b></em>' containment reference list.
	 * The list contents are of type {@link MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Old Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Old Values</em>' containment reference list.
	 * @see MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage#getRtpExecutionTimeCalculatedValue_AllOldValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<RtpExecutionTimeConcreteValue> getAllOldValues();

} // RtpExecutionTimeCalculatedValue
