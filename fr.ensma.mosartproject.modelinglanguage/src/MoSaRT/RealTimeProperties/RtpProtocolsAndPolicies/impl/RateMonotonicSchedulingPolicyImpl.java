/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RateMonotonicSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Monotonic Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RateMonotonicSchedulingPolicyImpl extends FixedPrioritySchedulingPolicyImpl implements RateMonotonicSchedulingPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateMonotonicSchedulingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.RATE_MONOTONIC_SCHEDULING_POLICY;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPolicyType() {
		
		return  "Rate Monotonic";
	}


} //RateMonotonicSchedulingPolicyImpl
