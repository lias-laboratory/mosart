/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Execution Time Calculated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl#getUnknownValueName <em>Unknown Value Name</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl#getToolUsedDescriptions <em>Tool Used Descriptions</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl#getAllOldValues <em>All Old Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpExecutionTimeCalculatedValueImpl extends EObjectImpl implements RtpExecutionTimeCalculatedValue {
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
	 * The cached value of the '{@link #getToolUsedDescriptions() <em>Tool Used Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolUsedDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> toolUsedDescriptions;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected RtpExecutionTimeConcreteValue value;

	/**
	 * The cached value of the '{@link #getAllOldValues() <em>All Old Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOldValues()
	 * @generated
	 * @ordered
	 */
	protected EList<RtpExecutionTimeConcreteValue> allOldValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RtpExecutionTimeCalculatedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME, oldUnknownValueName, unknownValueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getToolUsedDescriptions() {
		if (toolUsedDescriptions == null) {
			toolUsedDescriptions = new EDataTypeUniqueEList<String>(String.class, this, RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS);
		}
		return toolUsedDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeConcreteValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(RtpExecutionTimeConcreteValue newValue, NotificationChain msgs) {
		RtpExecutionTimeConcreteValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(RtpExecutionTimeConcreteValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RtpExecutionTimeConcreteValue> getAllOldValues() {
		if (allOldValues == null) {
			allOldValues = new EObjectContainmentEList<RtpExecutionTimeConcreteValue>(RtpExecutionTimeConcreteValue.class, this, RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES);
		}
		return allOldValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE:
				return basicSetValue(null, msgs);
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES:
				return ((InternalEList<?>)getAllOldValues()).basicRemove(otherEnd, msgs);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME:
				return getUnknownValueName();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS:
				return getToolUsedDescriptions();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE:
				return getValue();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES:
				return getAllOldValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME:
				setUnknownValueName((String)newValue);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS:
				getToolUsedDescriptions().clear();
				getToolUsedDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE:
				setValue((RtpExecutionTimeConcreteValue)newValue);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES:
				getAllOldValues().clear();
				getAllOldValues().addAll((Collection<? extends RtpExecutionTimeConcreteValue>)newValue);
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME:
				setUnknownValueName(UNKNOWN_VALUE_NAME_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS:
				getToolUsedDescriptions().clear();
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE:
				setValue((RtpExecutionTimeConcreteValue)null);
				return;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES:
				getAllOldValues().clear();
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
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__UNKNOWN_VALUE_NAME:
				return UNKNOWN_VALUE_NAME_EDEFAULT == null ? unknownValueName != null : !UNKNOWN_VALUE_NAME_EDEFAULT.equals(unknownValueName);
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__TOOL_USED_DESCRIPTIONS:
				return toolUsedDescriptions != null && !toolUsedDescriptions.isEmpty();
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE:
				return value != null;
			case RtpHelperTypesPackage.RTP_EXECUTION_TIME_CALCULATED_VALUE__ALL_OLD_VALUES:
				return allOldValues != null && !allOldValues.isEmpty();
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
		result.append(", toolUsedDescriptions: ");
		result.append(toolUsedDescriptions);
		result.append(')');
		return result.toString();
	}

} //RtpExecutionTimeCalculatedValueImpl
