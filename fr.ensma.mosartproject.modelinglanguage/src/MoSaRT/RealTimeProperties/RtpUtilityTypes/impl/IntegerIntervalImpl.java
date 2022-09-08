/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.DelimiterType;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl#getDelimiterMin <em>Delimiter Min</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl#getBoundMin <em>Bound Min</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl#getBoundMax <em>Bound Max</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerIntervalImpl#getDelimiterMax <em>Delimiter Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerIntervalImpl extends EObjectImpl implements IntegerInterval {
	/**
	 * The default value of the '{@link #getDelimiterMin() <em>Delimiter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterMin()
	 * @generated
	 * @ordered
	 */
	protected static final DelimiterType DELIMITER_MIN_EDEFAULT = DelimiterType.OPEN;

	/**
	 * The cached value of the '{@link #getDelimiterMin() <em>Delimiter Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterMin()
	 * @generated
	 * @ordered
	 */
	protected DelimiterType delimiterMin = DELIMITER_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundMin() <em>Bound Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundMin()
	 * @generated
	 * @ordered
	 */
	protected static final int BOUND_MIN_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getBoundMin() <em>Bound Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundMin()
	 * @generated
	 * @ordered
	 */
	protected int boundMin = BOUND_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundMax() <em>Bound Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundMax()
	 * @generated
	 * @ordered
	 */
	protected static final int BOUND_MAX_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getBoundMax() <em>Bound Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundMax()
	 * @generated
	 * @ordered
	 */
	protected int boundMax = BOUND_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelimiterMax() <em>Delimiter Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterMax()
	 * @generated
	 * @ordered
	 */
	protected static final DelimiterType DELIMITER_MAX_EDEFAULT = DelimiterType.OPEN;

	/**
	 * The cached value of the '{@link #getDelimiterMax() <em>Delimiter Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterMax()
	 * @generated
	 * @ordered
	 */
	protected DelimiterType delimiterMax = DELIMITER_MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpUtilityTypesPackage.Literals.INTEGER_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelimiterType getDelimiterMin() {
		return delimiterMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimiterMin(DelimiterType newDelimiterMin) {
		DelimiterType oldDelimiterMin = delimiterMin;
		delimiterMin = newDelimiterMin == null ? DELIMITER_MIN_EDEFAULT : newDelimiterMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MIN, oldDelimiterMin, delimiterMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBoundMin() {
		return boundMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundMin(int newBoundMin) {
		int oldBoundMin = boundMin;
		boundMin = newBoundMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MIN, oldBoundMin, boundMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBoundMax() {
		return boundMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundMax(int newBoundMax) {
		int oldBoundMax = boundMax;
		boundMax = newBoundMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MAX, oldBoundMax, boundMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelimiterType getDelimiterMax() {
		return delimiterMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimiterMax(DelimiterType newDelimiterMax) {
		DelimiterType oldDelimiterMax = delimiterMax;
		delimiterMax = newDelimiterMax == null ? DELIMITER_MAX_EDEFAULT : newDelimiterMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MAX, oldDelimiterMax, delimiterMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MIN:
				return getDelimiterMin();
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MIN:
				return getBoundMin();
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MAX:
				return getBoundMax();
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MAX:
				return getDelimiterMax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MIN:
				setDelimiterMin((DelimiterType)newValue);
				return;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MIN:
				setBoundMin((Integer)newValue);
				return;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MAX:
				setBoundMax((Integer)newValue);
				return;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MAX:
				setDelimiterMax((DelimiterType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MIN:
				setDelimiterMin(DELIMITER_MIN_EDEFAULT);
				return;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MIN:
				setBoundMin(BOUND_MIN_EDEFAULT);
				return;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MAX:
				setBoundMax(BOUND_MAX_EDEFAULT);
				return;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MAX:
				setDelimiterMax(DELIMITER_MAX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MIN:
				return delimiterMin != DELIMITER_MIN_EDEFAULT;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MIN:
				return boundMin != BOUND_MIN_EDEFAULT;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__BOUND_MAX:
				return boundMax != BOUND_MAX_EDEFAULT;
			case RtpUtilityTypesPackage.INTEGER_INTERVAL__DELIMITER_MAX:
				return delimiterMax != DELIMITER_MAX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (delimiterMin: ");
		result.append(delimiterMin);
		result.append(", boundMin: ");
		result.append(boundMin);
		result.append(", boundMax: ");
		result.append(boundMax);
		result.append(", delimiterMax: ");
		result.append(delimiterMax);
		result.append(')');
		return result.toString();
	}

} //IntegerIntervalImpl
