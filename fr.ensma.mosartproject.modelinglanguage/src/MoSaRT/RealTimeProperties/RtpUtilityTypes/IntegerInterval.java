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
 * A representation of the model object '<em><b>Integer Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMin <em>Delimiter Min</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMin <em>Bound Min</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMax <em>Bound Max</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMax <em>Delimiter Max</em>}</li>
 * </ul>
 *
 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerInterval()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IntegerIntervalRule1'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IntegerIntervalRule1='self.boundMin < self.boundMax'"
 * @generated
 */
public interface IntegerInterval extends RealTimeCommonType {
	/**
	 * Returns the value of the '<em><b>Delimiter Min</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter Min</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
	 * @see #setDelimiterMin(DelimiterType)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerInterval_DelimiterMin()
	 * @model required="true"
	 * @generated
	 */
	DelimiterType getDelimiterMin();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMin <em>Delimiter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter Min</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
	 * @see #getDelimiterMin()
	 * @generated
	 */
	void setDelimiterMin(DelimiterType value);

	/**
	 * Returns the value of the '<em><b>Bound Min</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Min</em>' attribute.
	 * @see #setBoundMin(int)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerInterval_BoundMin()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getBoundMin();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMin <em>Bound Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Min</em>' attribute.
	 * @see #getBoundMin()
	 * @generated
	 */
	void setBoundMin(int value);

	/**
	 * Returns the value of the '<em><b>Bound Max</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Max</em>' attribute.
	 * @see #setBoundMax(int)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerInterval_BoundMax()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getBoundMax();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getBoundMax <em>Bound Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Max</em>' attribute.
	 * @see #getBoundMax()
	 * @generated
	 */
	void setBoundMax(int value);

	/**
	 * Returns the value of the '<em><b>Delimiter Max</b></em>' attribute.
	 * The literals are from the enumeration {@link MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter Max</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
	 * @see #setDelimiterMax(DelimiterType)
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage#getIntegerInterval_DelimiterMax()
	 * @model required="true"
	 * @generated
	 */
	DelimiterType getDelimiterMax();

	/**
	 * Sets the value of the '{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval#getDelimiterMax <em>Delimiter Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter Max</em>' attribute.
	 * @see MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType
	 * @see #getDelimiterMax()
	 * @generated
	 */
	void setDelimiterMax(DelimiterType value);

} // IntegerInterval
