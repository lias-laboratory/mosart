/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredInteger;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measured Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl#getUnknownValueName <em>Unknown Value Name</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl#getToolUsedDescriptions <em>Tool Used Descriptions</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.MeasuredIntegerImpl#getAllOldValues <em>All Old Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasuredIntegerImpl extends EObjectImpl implements MeasuredInteger {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getAllOldValues() <em>All Old Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOldValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> allOldValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasuredIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpUtilityTypesPackage.Literals.MEASURED_INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public EList<String> getToolUsedDescriptions() {
		if (toolUsedDescriptions == null) {
			toolUsedDescriptions = new EDataTypeUniqueEList<String>(String.class, this, RtpUtilityTypesPackage.MEASURED_INTEGER__TOOL_USED_DESCRIPTIONS);
		}
		return toolUsedDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getAllOldValues() {
		if (allOldValues == null) {
			allOldValues = new EDataTypeUniqueEList<Double>(Double.class, this, RtpUtilityTypesPackage.MEASURED_INTEGER__ALL_OLD_VALUES);
		}
		return allOldValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpUtilityTypesPackage.MEASURED_INTEGER__VALUE:
				return getValue();
			case RtpUtilityTypesPackage.MEASURED_INTEGER__UNKNOWN_VALUE_NAME:
				return getUnknownValueName();
			case RtpUtilityTypesPackage.MEASURED_INTEGER__TOOL_USED_DESCRIPTIONS:
				return getToolUsedDescriptions();
			case RtpUtilityTypesPackage.MEASURED_INTEGER__ALL_OLD_VALUES:
				return getAllOldValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RtpUtilityTypesPackage.MEASURED_INTEGER__VALUE:
				return value != VALUE_EDEFAULT;
			case RtpUtilityTypesPackage.MEASURED_INTEGER__UNKNOWN_VALUE_NAME:
				return UNKNOWN_VALUE_NAME_EDEFAULT == null ? unknownValueName != null : !UNKNOWN_VALUE_NAME_EDEFAULT.equals(unknownValueName);
			case RtpUtilityTypesPackage.MEASURED_INTEGER__TOOL_USED_DESCRIPTIONS:
				return toolUsedDescriptions != null && !toolUsedDescriptions.isEmpty();
			case RtpUtilityTypesPackage.MEASURED_INTEGER__ALL_OLD_VALUES:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", unknownValueName: ");
		result.append(unknownValueName);
		result.append(", toolUsedDescriptions: ");
		result.append(toolUsedDescriptions);
		result.append(", allOldValues: ");
		result.append(allOldValues);
		result.append(')');
		return result.toString();
	}

} //MeasuredIntegerImpl
