/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measured Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getValue <em>Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getUnknownValueName <em>Unknown Value Name</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getToolUsedDescriptions <em>Tool Used Descriptions</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger#getAllOldValues <em>All Old Values</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMeasuredInteger()
 * @model
 * @generated
 */
public interface MeasuredInteger extends IntegerVariable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMeasuredInteger_Value()
	 * @model default="-1" required="true" changeable="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Returns the value of the '<em><b>Unknown Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unknown Value Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Value Name</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMeasuredInteger_UnknownValueName()
	 * @model id="true" required="true" changeable="false"
	 * @generated
	 */
	String getUnknownValueName();

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
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMeasuredInteger_ToolUsedDescriptions()
	 * @model changeable="false"
	 * @generated
	 */
	EList<String> getToolUsedDescriptions();

	/**
	 * Returns the value of the '<em><b>All Old Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Old Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Old Values</em>' attribute list.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getMeasuredInteger_AllOldValues()
	 * @model changeable="false"
	 * @generated
	 */
	EList<Double> getAllOldValues();

} // MeasuredInteger
