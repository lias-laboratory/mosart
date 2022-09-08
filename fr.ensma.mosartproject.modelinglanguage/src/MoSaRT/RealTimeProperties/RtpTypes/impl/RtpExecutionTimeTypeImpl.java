/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeConcreteValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeValue;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;
import MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeCalculatedValueImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeIntervalImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeListImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeMmaImpl;
import MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpExecutionTimeSimpleImpl;
import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.MaxMinAvgReal;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealInterval;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector;



import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Execution Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpExecutionTimeTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpExecutionTimeTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpExecutionTimeTypeImpl extends EObjectImpl implements RtpExecutionTimeType {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnits UNIT_EDEFAULT = TimeUnits.US;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnits unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected RtpExecutionTimeValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpExecutionTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_EXECUTION_TIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnits getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnits newUnit) {
		TimeUnits oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(RtpExecutionTimeValue newValue, NotificationChain msgs) {
		RtpExecutionTimeValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(RtpExecutionTimeValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean greater(RtpExecutionTimeType otherExecutionTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean lower(RtpExecutionTimeType otherExecutionTime) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(RtpExecutionTimeType otherExecutionTime) {
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RtpExecutionTimeType convertsTo(TimeUnits newUnit) {
		
		
		RtpExecutionTimeType helper= new RtpExecutionTimeTypeImpl();
		
		RtpExecutionTimeValue valHelper;
		
		TimeUnits unitHelper=this.getUnit();
		
			
			if (this.getValue().eClass().getName().equals("RtpExecutionTimeSimple")) {
			
			valHelper = new RtpExecutionTimeSimpleImpl();
			
			((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple)valHelper).setValue(((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple)this.getValue()).getValue());
			
			double valueHelper= ((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple)valHelper).getValue();
			
			switch (newUnit.getValue()) {

			case 0:
				
				switch (unitHelper.getValue()) {
				
				case 1:
					valueHelper= valueHelper*1E3;
					break;
				
				case 2:
					valueHelper= valueHelper*1E6;
					break;
					
				case 3:
					valueHelper= (valueHelper*60)*1E6;
					break;
					
				case 4:
					valueHelper= (valueHelper*3600)*1E6;
					break;
				
				case 5:
					valueHelper= ((valueHelper*24)*3600)*1E6;
					break;
				default:
					break;				
				}
				
			break;

			case 1 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= valueHelper*1E-3;
					break;
				
				case 2:
					valueHelper= valueHelper*1E3;
					break;
					
				case 3:
					valueHelper= (valueHelper*60)*1E3;
					break;
					
				case 4:
					valueHelper= (valueHelper*3600)*1E3;
					break;
				
				case 5:
					valueHelper= ((valueHelper*24)*3600)*1E3;
					break;
				default:
					break;				
				}
			 break;

			case 2 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= valueHelper*1E-6;
					break;
				
				case 1:
					valueHelper= valueHelper*1E-3;
					break;
					
				case 3:
					valueHelper= valueHelper*60;
					break;
					
				case 4:
					valueHelper= valueHelper*3600;
					break;
				
				case 5:
					valueHelper= (valueHelper*24)*3600;
					break;
				default:
					break;				
				}
			break;
				 
			case 3 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= (valueHelper*1E-6)/60;
					break;
				
				case 1:
					valueHelper= (valueHelper*1E-3)/60;
					break;
					
				case 2:
					valueHelper= valueHelper/60;
					break;
					
				case 4:
					valueHelper= valueHelper*60;
					break;
				
				case 5:
					valueHelper= (valueHelper*24)*60;
					break;
				default:
					break;				
				}
			break;
			
			case 4 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= (valueHelper*1E-6)/3600;
					break;
				
				case 1:
					valueHelper= (valueHelper*1E-3)/3600;
					break;
					
				case 2:
					valueHelper= valueHelper/3600;
					break;
					
				case 3:
					valueHelper= valueHelper/60;
					break;
				
				case 5:
					valueHelper= (valueHelper*24);
					break;
				default:
					break;				
				}
			break;
			
			case 5 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= ((valueHelper*1E-6)/3600)/24;
					break;
				
				case 1:
					valueHelper= ((valueHelper*1E-3)/3600)/24;
					break;
					
				case 2:
					valueHelper= (valueHelper/3600)/24;
					break;
					
				case 3:
					valueHelper= (valueHelper/60)/24;
					break;
				
				case 4:
					valueHelper= (valueHelper/24);
					break;
				default:
					break;				
				}
			break;

			default: 
			 return helper;
			}
			
			
			((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeSimple)valHelper).setValue(valueHelper);
			
			helper.setUnit(newUnit);
			helper.setValue(valHelper);
			
			return helper;
			}
			
			if (this.getValue().eClass().getName().equals("RtpExecutionTimeMma")) {
				
				valHelper = new RtpExecutionTimeMmaImpl();
				
				((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma)valHelper).setMinMaxAvg(((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma)this.getValue()).getMinMaxAvg());
				
				MaxMinAvgReal valueHelper= ((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeMma)valHelper).getMinMaxAvg();
				
				
				
				/*to do*/
				
				
				
				return helper;
				}
			
			if (this.getValue().eClass().getName().equals("RtpExecutionTimeList")) {
				
				valHelper = new RtpExecutionTimeListImpl();
				
				((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList)valHelper).setVector(((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList)this.getValue()).getVector());
				
				RealVector valueHelper= ((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeList)valHelper).getVector();
				
				
				
				/*to do*/
				
				
				
				return helper;
				}
			
			if (this.getValue().eClass().getName().equals("RtpExecutionTimeInterval")) {
				
				valHelper = new RtpExecutionTimeIntervalImpl();
				
				((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval)valHelper).setInterval(((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval)this.getValue()).getInterval());
				
				RealInterval valueHelper= ((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeInterval)valHelper).getInterval();
				
				
				
				/*to do*/
				
				
				
				return helper;
				}
			
			if (this.getValue().eClass().getName().equals("RtpExecutionTimeCalculatedValue")) {
				
				valHelper = new RtpExecutionTimeCalculatedValueImpl();
				
				EStructuralFeature eFeature = RtpHelperTypesPackage.Literals.RTP_EXECUTION_TIME_CALCULATED_VALUE__VALUE;
				
				((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(valHelper)).eClass().eSet((EStructuralFeature) eFeature, ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)this.getValue()).getValue());
				
				((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue)valHelper).eClass().eSet((EStructuralFeature) eFeature, ((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue)this.getValue()).getValue());
				
				RtpExecutionTimeConcreteValue valueHelper= ((MoSaRT.RealTimeProperties.RtpHelperTypes.RtpExecutionTimeCalculatedValue)valHelper).getValue();
				
				
				
				
				/*to do*/
				
				
				return helper;
				}
				
			
			return helper;

			
			
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeType adoptsCalculatedValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE:
				return basicSetValue(null, msgs);
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
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__UNIT:
				return getUnit();
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE:
				return getValue();
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
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__UNIT:
				setUnit((TimeUnits)newValue);
				return;
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE:
				setValue((RtpExecutionTimeValue)newValue);
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
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE:
				setValue((RtpExecutionTimeValue)null);
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
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE___GREATER__RTPEXECUTIONTIMETYPE:
				return greater((RtpExecutionTimeType)arguments.get(0));
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE___LOWER__RTPEXECUTIONTIMETYPE:
				return lower((RtpExecutionTimeType)arguments.get(0));
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE___EQUALS__RTPEXECUTIONTIMETYPE:
				return equals((RtpExecutionTimeType)arguments.get(0));
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE___CONVERTS_TO__TIMEUNITS:
				return convertsTo((TimeUnits)arguments.get(0));
			case RtpTypesPackage.RTP_EXECUTION_TIME_TYPE___ADOPTS_CALCULATED_VALUE:
				return adoptsCalculatedValue();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //RtpExecutionTimeTypeImpl
