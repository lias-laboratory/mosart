/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataRateType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataTxRateUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleRealImpl;

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
 * An implementation of the model object '<em><b>Rtp Data Rate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataRateTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataRateTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpDataRateTypeImpl extends EObjectImpl implements RtpDataRateType {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DataTxRateUnits UNIT_EDEFAULT = DataTxRateUnits.BPER_S;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DataTxRateUnits unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected RealVariable value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpDataRateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_DATA_RATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTxRateUnits getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DataTxRateUnits newUnit) {
		DataTxRateUnits oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealVariable getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(RealVariable newValue, NotificationChain msgs) {
		RealVariable oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(RealVariable newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean greater(RtpDataRateType otherDataRate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 0;
		if(this.unit.equals(otherDataRate.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDataRate.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDataRate.getValue())).getValue();
			}
			if (otherDataRate.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDataRate.getValue())).getValue();
			}
			
			if (a>b) {
				return true;
			}
		}
		else {
			otherDataRate = otherDataRate.convertsTo(this.unit);
			return this.greater(otherDataRate);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean lower(RtpDataRateType otherDataRate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 0;
		if(this.unit.equals(otherDataRate.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDataRate.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDataRate.getValue())).getValue();
			}
			if (otherDataRate.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDataRate.getValue())).getValue();
			}
			
			if (a<b) {
				return true;
			}
		}
		else {
			otherDataRate = otherDataRate.convertsTo(this.unit);
			return this.lower(otherDataRate);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(RtpDataRateType otherDataRate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 1;
		if(this.unit.equals(otherDataRate.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDataRate.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDataRate.getValue())).getValue();
			}
			if (otherDataRate.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDataRate.getValue())).getValue();
			}
			
			if (a==b) {
				return true;
			}
		}
		else {
			otherDataRate = otherDataRate.convertsTo(this.unit);
			return this.equals(otherDataRate);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RtpDataRateType convertsTo(DataTxRateUnits newUnit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		RtpDataRateType helper= new RtpDataRateTypeImpl();
		
		RealVariable valHelper;
		
		DataTxRateUnits unitHelper=this.getUnit();
		
		double valueHelper;	
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
			
			valHelper = new SimpleRealImpl();
			
			((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)valHelper).setValue(((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)this.getValue()).getValue());
			
			valueHelper= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(valHelper)).getValue();
			
		}
		
			else {
				if (this.getValue().eClass().getName().equals("MeasuredReal")){
				
					valHelper = new SimpleRealImpl();
					
					EStructuralFeature eFeature = RtpUtilityTypesPackage.Literals.MEASURED_REAL__VALUE;
					
					((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(valHelper)).eClass().eSet((EStructuralFeature) eFeature, ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)this.getValue()).getValue());
										
					valueHelper= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(valHelper)).getValue();
				}
		
				else {
				return helper;
				}
			
			}
		
		
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
					valueHelper= valueHelper*1E9;
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
					valueHelper= valueHelper*1E6;
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
					valueHelper= valueHelper*1E3;
					break;
					
				default:
					break;				
				}
			break;
				 
			case 3 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= valueHelper*1E-9;
					break;
				
				case 1:
					valueHelper= valueHelper*1E-6;
					break;
					
				case 2:
					valueHelper= valueHelper*1E-3;
					break;
					
				default:
					break;				
				}
			break;	

			default: 
			 return helper;
			}
			
			if (valHelper.eClass().getName().equals("SimpleReal")) {
				
				
				((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)valHelper).setValue(valueHelper);
				
			}	
	
			if (valHelper.eClass().getName().equals("MeasuredReal")){
				
				EStructuralFeature eFeature = RtpUtilityTypesPackage.Literals.MEASURED_REAL__VALUE;
				
				((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(valHelper)).eClass().eSet((EStructuralFeature) eFeature, valueHelper);
				
			}
			
			helper.setUnit(newUnit);
			helper.setValue(valHelper);
				
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__UNIT:
				return getUnit();
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__UNIT:
				setUnit((DataTxRateUnits)newValue);
				return;
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE:
				setValue((RealVariable)newValue);
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
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE:
				setValue((RealVariable)null);
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
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE___GREATER__RTPDATARATETYPE:
				return greater((RtpDataRateType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE___LOWER__RTPDATARATETYPE:
				return lower((RtpDataRateType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE___EQUALS__RTPDATARATETYPE:
				return equals((RtpDataRateType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DATA_RATE_TYPE___CONVERTS_TO__DATATXRATEUNITS:
				return convertsTo((DataTxRateUnits)arguments.get(0));
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

} //RtpDataRateTypeImpl
