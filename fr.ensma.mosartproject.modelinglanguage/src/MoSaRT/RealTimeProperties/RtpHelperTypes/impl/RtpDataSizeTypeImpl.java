/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDataSizeType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;

import MoSaRT.RealTimeProperties.RtpMeasurementUnits.DataSizeUnits;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVariable;
import java.lang.reflect.InvocationTargetException;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.SimpleRealImpl;

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
 * An implementation of the model object '<em><b>Rtp Data Size Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataSizeTypeImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpDataSizeTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpDataSizeTypeImpl extends EObjectImpl implements RtpDataSizeType {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final DataSizeUnits UNIT_EDEFAULT = DataSizeUnits.BIT;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected DataSizeUnits unit = UNIT_EDEFAULT;

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
	protected RtpDataSizeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_DATA_SIZE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSizeUnits getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(DataSizeUnits newUnit) {
		DataSizeUnits oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__UNIT, oldUnit, unit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean greater(RtpDataSizeType otherDataSize) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 0;
		if(this.unit.equals(otherDataSize.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDataSize.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDataSize.getValue())).getValue();
			}
			if (otherDataSize.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDataSize.getValue())).getValue();
			}
			
			if (a>b) {
				return true;
			}
		}
		else {
			otherDataSize = otherDataSize.convertsTo(this.unit);
			return this.greater(otherDataSize);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean lower(RtpDataSizeType otherDataSize) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 0;
		if(this.unit.equals(otherDataSize.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDataSize.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDataSize.getValue())).getValue();
			}
			if (otherDataSize.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDataSize.getValue())).getValue();
			}
			
			if (a<b) {
				return true;
			}
		}
		else {
			otherDataSize = otherDataSize.convertsTo(this.unit);
			return this.lower(otherDataSize);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equals(RtpDataSizeType otherDataSize) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		double a=0,b = 1;
		if(this.unit.equals(otherDataSize.getUnit())) {
			
			if (this.getValue().eClass().getName().equals("SimpleReal")) {
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(this.value)).getValue();
			}
			if (this.getValue().eClass().getName().equals("MeasuredReal")){
				a= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(this.value)).getValue();
			}
			
			if (otherDataSize.getValue().eClass().getName().equals("SimpleReal")) {
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.SimpleReal)(otherDataSize.getValue())).getValue();
			}
			if (otherDataSize.getValue().eClass().getName().equals("MeasuredReal")){
				b= ((MoSaRT.RealTimeProperties.RtpUtilityTypes.MeasuredReal)(otherDataSize.getValue())).getValue();
			}
			
			if (a==b) {
				return true;
			}
		}
		else {
			otherDataSize = otherDataSize.convertsTo(this.unit);
			return this.equals(otherDataSize);
		}
		return false;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RtpDataSizeType convertsTo(DataSizeUnits newUnit) {
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		RtpDataSizeType helper= new RtpDataSizeTypeImpl();
		
		RealVariable valHelper;
		
		DataSizeUnits unitHelper=this.getUnit();
		
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
					
					valueHelper= valueHelper*8;
					
					break;
				
				case 2:
					valueHelper= valueHelper*(2^10)*8;
					break;
					
				case 3:
					valueHelper= valueHelper*(2^20)*8;
					break;
					
				case 4:
					valueHelper= valueHelper*(2^30)*8;
					break;
				
				default:
					break;				
				}
				
			break;

			case 1 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= valueHelper/8;
					break;
				
				case 2:
					valueHelper= valueHelper*(2^10);
					break;
					
				case 3:
					valueHelper= valueHelper*(2^20);
					break;
					
				case 4:
					valueHelper= valueHelper*(2^30);
					break;
				
				default:
					break;				
				}
			 break;

			case 2 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= (valueHelper/8)/(2^10);
					break;
				
				case 1:
					valueHelper= valueHelper/(2^10);
					break;
					
				case 3:
					valueHelper= valueHelper*(2^10);
					break;
					
				case 4:
					valueHelper= valueHelper*(2^20);
					break;
		
				default:
					break;				
				}
			break;
				 
			case 3 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= (valueHelper/8)/(2^20);
					break;
				
				case 1:
					valueHelper= valueHelper/(2^20);
					break;
					
				case 2:
					valueHelper= valueHelper*(2^10);
					break;
					
				case 4:
					valueHelper= valueHelper*(2^10);
					break;
				
				default:
					break;				
				}
			break;
			
			case 4 :
				switch (unitHelper.getValue()) {
				
				case 0:
					valueHelper= (valueHelper/8)/(2^30);
					break;
				
				case 1:
					valueHelper= valueHelper/(2^30);
					break;
					
				case 2:
					valueHelper= valueHelper/(2^20);
					break;
					
				case 3:
					valueHelper= valueHelper/(2^10);
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
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__UNIT:
				return getUnit();
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__UNIT:
				setUnit((DataSizeUnits)newValue);
				return;
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__UNIT:
				return unit != UNIT_EDEFAULT;
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE__VALUE:
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
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE___GREATER__RTPDATASIZETYPE:
				return greater((RtpDataSizeType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE___LOWER__RTPDATASIZETYPE:
				return lower((RtpDataSizeType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE___EQUALS__RTPDATASIZETYPE:
				return equals((RtpDataSizeType)arguments.get(0));
			case RtpHelperTypesPackage.RTP_DATA_SIZE_TYPE___CONVERTS_TO__DATASIZEUNITS:
				return convertsTo((DataSizeUnits)arguments.get(0));
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

} //RtpDataSizeTypeImpl
