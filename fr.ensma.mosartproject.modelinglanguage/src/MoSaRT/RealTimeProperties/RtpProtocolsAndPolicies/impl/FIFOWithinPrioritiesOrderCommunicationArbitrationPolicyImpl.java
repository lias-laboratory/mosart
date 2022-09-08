/**
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FIFOWithinPrioritiesOrderCommunicationArbitrationPolicy;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FIFO Within Priorities Order Communication Arbitration Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FIFOWithinPrioritiesOrderCommunicationArbitrationPolicyImpl#getPolicyType <em>Policy Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FIFOWithinPrioritiesOrderCommunicationArbitrationPolicyImpl extends EObjectImpl implements FIFOWithinPrioritiesOrderCommunicationArbitrationPolicy {
	/**
	 * The default value of the '{@link #getPolicyType() <em>Policy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyType()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FIFOWithinPrioritiesOrderCommunicationArbitrationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.FIFO_WITHIN_PRIORITIES_ORDER_COMMUNICATION_ARBITRATION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyType() {
		// TODO: implement this method to return the 'Policy Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.FIFO_WITHIN_PRIORITIES_ORDER_COMMUNICATION_ARBITRATION_POLICY__POLICY_TYPE:
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
			case RtpProtocolsAndPoliciesPackage.FIFO_WITHIN_PRIORITIES_ORDER_COMMUNICATION_ARBITRATION_POLICY__POLICY_TYPE:
				return POLICY_TYPE_EDEFAULT == null ? getPolicyType() != null : !POLICY_TYPE_EDEFAULT.equals(getPolicyType());
		}
		return super.eIsSet(featureID);
	}

} //FIFOWithinPrioritiesOrderCommunicationArbitrationPolicyImpl
