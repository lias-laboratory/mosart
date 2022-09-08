/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.TimeUnits;

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
 * An implementation of the model object '<em><b>Rtp Duration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDurationTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDurationTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpDurationTypeImpl extends EObjectImpl implements RtpDurationType {
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
	protected RealVariable value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpDurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_DURATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DURATION_TYPE__UNIT, oldUnit, unit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean greater(RtpDurationType otherDuration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 0;
		if(this.unit.equals(otherDuration.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDuration.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDuration.getValue())).getValue();
			}
			if (otherDuration.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDuration.getValue())).getValue();
			}
			
			if (a>b) {
				return true;
			}
		}
		else {
			otherDuration = otherDuration.convertsTo(this.unit);
			return this.greater(otherDuration);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean lower(RtpDurationType otherDuration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 0;
		if(this.unit.equals(otherDuration.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDuration.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDuration.getValue())).getValue();
			}
			if (otherDuration.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDuration.getValue())).getValue();
			}
			
			if (a<b) {
				return true;
			}
		}
		else {
			otherDuration = otherDuration.convertsTo(this.unit);
			return this.lower(otherDuration);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(RtpDurationType otherDuration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 1;
		if(this.unit.equals(otherDuration.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDuration.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDuration.getValue())).getValue();
			}
			if (otherDuration.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDuration.getValue())).getValue();
			}
			
			if (a==b) {
				return true;
			}
		}
		else {
			otherDuration = otherDuration.convertsTo(this.unit);
			return this.equals(otherDuration);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RtpDurationType convertsTo(TimeUnits newUnit) {
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		RtpDurationType helper= new RtpDurationTypeImpl();
		
		RealVariable valHelper;
		
		TimeUnits unitHelper=this.getUnit();
		
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
				System.out.println("4 cas covertir vers us ");
				switch (unitHelper.getValue()) {
				
				case 1:
					System.out.println("5 on est dans le cas depart ms" + valueHelper + " valeur avant");
					valueHelper= valueHelper*1E3;
					System.out.println("6 on est dans le cas depart ms" + valueHelper + " valeur après");
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__UNIT:
				return getUnit();
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__UNIT:
				setUnit((TimeUnits)newValue);
				return;
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
			case RtpHelperTypesPackage.RTP_DURATION_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DURATION_TYPE___GREATER__RTPDURATIONTYPE:
				return greater((RtpDurationType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DURATION_TYPE___LOWER__RTPDURATIONTYPE:
				return lower((RtpDurationType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DURATION_TYPE___EQUALS__RTPDURATIONTYPE:
				return equals((RtpDurationType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DURATION_TYPE___CONVERTS_TO__TIMEUNITS:
				return convertsTo((TimeUnits)arguments.get(0));
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

} //RtpDurationTypeImpl
