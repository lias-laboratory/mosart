/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LeastLaxityFirstSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Least Laxity First Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LeastLaxityFirstSchedulingPolicyImpl#getPolicyType <em>Policy Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeastLaxityFirstSchedulingPolicyImpl extends EObjectImpl implements LeastLaxityFirstSchedulingPolicy {
	/**
	 * The default value of the '{@link #getPolicyType() <em>Policy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String POLICY_TYPE_EDEFAULT = "Least Laxity First";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeastLaxityFirstSchedulingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.LEAST_LAXITY_FIRST_SCHEDULING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPolicyType() {
		// TODO: implement this method to return the 'Policy Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return POLICY_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.LEAST_LAXITY_FIRST_SCHEDULING_POLICY__POLICY_TYPE:
				return getPolicyType();
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
			case RtpProtocolsAndPoliciesPackage.LEAST_LAXITY_FIRST_SCHEDULING_POLICY__POLICY_TYPE:
				return POLICY_TYPE_EDEFAULT == null ? getPolicyType() != null : !POLICY_TYPE_EDEFAULT.equals(getPolicyType());
		}
		return super.eIsSet(featureID);
	}

} //LeastLaxityFirstSchedulingPolicyImpl
