/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.DeadlineMonotonicSchedulingPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deadline Monotonic Scheduling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeadlineMonotonicSchedulingPolicyImpl extends FixedPrioritySchedulingPolicyImpl implements DeadlineMonotonicSchedulingPolicy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeadlineMonotonicSchedulingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.DEADLINE_MONOTONIC_SCHEDULING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getPolicyType() {
		
		return  "Deadline Monotonic";
	}
	
} //DeadlineMonotonicSchedulingPolicyImpl
