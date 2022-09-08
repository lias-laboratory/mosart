/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl;

import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.RtpComputationAndAnalysisFunctionsPackage;
import MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.WeibullComputationFunction;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weibull Computation Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.WeibullComputationFunctionImpl#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpComputationAndAnalysisFunctions.impl.WeibullComputationFunctionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeibullComputationFunctionImpl extends EObjectImpl implements WeibullComputationFunction {
	/**
	 * The default value of the '{@link #getFunctionType() <em>Function Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String FUNCTION_TYPE_EDEFAULT = "Weibull Law";
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeibullComputationFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpComputationAndAnalysisFunctionsPackage.Literals.WEIBULL_COMPUTATION_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFunctionType() {
		// TODO: implement this method to return the 'Function Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return FUNCTION_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<Double>(Double.class, this, RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__FUNCTION_TYPE:
				return getFunctionType();
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__PARAMETERS:
				return getParameters();
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
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Double>)newValue);
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
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__PARAMETERS:
				getParameters().clear();
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
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__FUNCTION_TYPE:
				return FUNCTION_TYPE_EDEFAULT == null ? getFunctionType() != null : !FUNCTION_TYPE_EDEFAULT.equals(getFunctionType());
			case RtpComputationAndAnalysisFunctionsPackage.WEIBULL_COMPUTATION_FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //WeibullComputationFunctionImpl
