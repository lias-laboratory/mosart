/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationFunction;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValueToBeCalculated;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Execution Time Value To Be Calculated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeValueToBeCalculatedImpl#getUnknownValueName <em>Unknown Value Name</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeValueToBeCalculatedImpl#getFunctionToBeRequested <em>Function To Be Requested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpExecutionTimeValueToBeCalculatedImpl extends EObjectImpl implements RtpExecutionTimeValueToBeCalculated {
	/**
	 * The default value of the '{@link #getUnknownValueName() <em>Unknown Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownValueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNKNOWN_VALUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnknownValueName() <em>Unknown Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnknownValueName()
	 * @generated
	 * @ordered
	 */
	protected String unknownValueName = UNKNOWN_VALUE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctionToBeRequested() <em>Function To Be Requested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionToBeRequested()
	 * @generated
	 * @ordered
	 */
	protected RtpComputationFunction functionToBeRequested;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpExecutionTimeValueToBeCalculatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnknownValueName() {
		return unknownValueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnknownValueName(String newUnknownValueName) {
		String oldUnknownValueName = unknownValueName;
		unknownValueName = newUnknownValueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME, oldUnknownValueName, unknownValueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpComputationFunction getFunctionToBeRequested() {
		return functionToBeRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionToBeRequested(RtpComputationFunction newFunctionToBeRequested, NotificationChain msgs) {
		RtpComputationFunction oldFunctionToBeRequested = functionToBeRequested;
		functionToBeRequested = newFunctionToBeRequested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED, oldFunctionToBeRequested, newFunctionToBeRequested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionToBeRequested(RtpComputationFunction newFunctionToBeRequested) {
		if (newFunctionToBeRequested != functionToBeRequested) {
			NotificationChain msgs = null;
			if (functionToBeRequested != null)
				msgs = ((InternalEObject)functionToBeRequested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED, null, msgs);
			if (newFunctionToBeRequested != null)
				msgs = ((InternalEObject)newFunctionToBeRequested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED, null, msgs);
			msgs = basicSetFunctionToBeRequested(newFunctionToBeRequested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED, newFunctionToBeRequested, newFunctionToBeRequested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED:
				return basicSetFunctionToBeRequested(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME:
				return getUnknownValueName();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED:
				return getFunctionToBeRequested();
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME:
				setUnknownValueName((String)newValue);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED:
				setFunctionToBeRequested((RtpComputationFunction)newValue);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME:
				setUnknownValueName(UNKNOWN_VALUE_NAME_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED:
				setFunctionToBeRequested((RtpComputationFunction)null);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__UNKNOWN_VALUE_NAME:
				return UNKNOWN_VALUE_NAME_EDEFAULT == null ? unknownValueName != null : !UNKNOWN_VALUE_NAME_EDEFAULT.equals(unknownValueName);
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_VALUE_TO_BE_CALCULATED__FUNCTION_TO_BE_REQUESTED:
				return functionToBeRequested != null;
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
		result.append(" (unknownValueName: ");
		result.append(unknownValueName);
		result.append(')');
		return result.toString();
	}

} //RtpExecutionTimeValueToBeCalculatedImpl
