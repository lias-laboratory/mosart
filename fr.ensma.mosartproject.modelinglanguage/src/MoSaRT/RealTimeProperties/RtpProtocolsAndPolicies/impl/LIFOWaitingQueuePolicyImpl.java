/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.LIFOWaitingQueuePolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LIFO Waiting Queue Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.LIFOWaitingQueuePolicyImpl#getPolicyType <em>Policy Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LIFOWaitingQueuePolicyImpl extends EObjectImpl implements LIFOWaitingQueuePolicy {
	/**
	 * The default value of the '{@link #getPolicyType() <em>Policy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String POLICY_TYPE_EDEFAULT = "Last In First Out";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LIFOWaitingQueuePolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.LIFO_WAITING_QUEUE_POLICY;
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
			case RtpProtocolsAndPoliciesPackage.LIFO_WAITING_QUEUE_POLICY__POLICY_TYPE:
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
			case RtpProtocolsAndPoliciesPackage.LIFO_WAITING_QUEUE_POLICY__POLICY_TYPE:
				return POLICY_TYPE_EDEFAULT == null ? getPolicyType() != null : !POLICY_TYPE_EDEFAULT.equals(getPolicyType());
		}
		return super.eIsSet(featureID);
	}

} //LIFOWaitingQueuePolicyImpl
