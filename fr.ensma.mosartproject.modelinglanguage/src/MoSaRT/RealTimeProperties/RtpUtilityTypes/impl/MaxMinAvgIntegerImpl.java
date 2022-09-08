/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Min Avg Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl#getAvgValue <em>Avg Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MaxMinAvgIntegerImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaxMinAvgIntegerImpl extends EObjectImpl implements MaxMinAvgInteger {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected int minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvgValue() <em>Avg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgValue()
	 * @generated
	 * @ordered
	 */
	protected static final int AVG_VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getAvgValue() <em>Avg Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgValue()
	 * @generated
	 * @ordered
	 */
	protected int avgValue = AVG_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaxMinAvgIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpUtilityTypesPackage.Literals.MAX_MIN_AVG_INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(int newMinValue) {
		int oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvgValue() {
		return avgValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgValue(int newAvgValue) {
		int oldAvgValue = avgValue;
		avgValue = newAvgValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__AVG_VALUE, oldAvgValue, avgValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MIN_VALUE:
				return getMinValue();
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__AVG_VALUE:
				return getAvgValue();
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MAX_VALUE:
				return getMaxValue();
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
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MIN_VALUE:
				setMinValue((Integer)newValue);
				return;
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__AVG_VALUE:
				setAvgValue((Integer)newValue);
				return;
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MAX_VALUE:
				setMaxValue((Integer)newValue);
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
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__AVG_VALUE:
				setAvgValue(AVG_VALUE_EDEFAULT);
				return;
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
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
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__AVG_VALUE:
				return avgValue != AVG_VALUE_EDEFAULT;
			case RtpUtilityTypesPackage.MAX_MIN_AVG_INTEGER__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", avgValue: ");
		result.append(avgValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(')');
		return result.toString();
	}

} //MaxMinAvgIntegerImpl
