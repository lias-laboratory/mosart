/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.RealVector;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.RealVectorImpl#getVectorElements <em>Vector Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealVectorImpl extends EObjectImpl implements RealVector {
	/**
	 * The cached value of the '{@link #getVectorElements() <em>Vector Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> vectorElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpUtilityTypesPackage.Literals.REAL_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getVectorElements() {
		if (vectorElements == null) {
			vectorElements = new EDataTypeEList<Double>(Double.class, this, RtpUtilityTypesPackage.REAL_VECTOR__VECTOR_ELEMENTS);
		}
		return vectorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("null")
	public double maxValue() {
		double d;
		if (this.getVectorElements().size()>0) {
		d = this.getVectorElements().get(0);
		for(int i =1; i< this.getVectorElements().size(); i++) {
			
			if (this.getVectorElements().get(i)> d) { d= this.getVectorElements().get(i);}
			
			}
		return d;
		}
		
		return (Double) null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpUtilityTypesPackage.REAL_VECTOR__VECTOR_ELEMENTS:
				return getVectorElements();
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
			case RtpUtilityTypesPackage.REAL_VECTOR__VECTOR_ELEMENTS:
				getVectorElements().clear();
				getVectorElements().addAll((Collection<? extends Double>)newValue);
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
			case RtpUtilityTypesPackage.REAL_VECTOR__VECTOR_ELEMENTS:
				getVectorElements().clear();
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
			case RtpUtilityTypesPackage.REAL_VECTOR__VECTOR_ELEMENTS:
				return vectorElements != null && !vectorElements.isEmpty();
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
			case RtpUtilityTypesPackage.REAL_VECTOR___MAX_VALUE:
				return maxValue();
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
		result.append(" (vectorElements: ");
		result.append(vectorElements);
		result.append(')');
		return result.toString();
	}

} //RealVectorImpl
