/**
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.AFDXNetworkProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFDX Network Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.AFDXNetworkProtocolImpl#getProtocolType <em>Protocol Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AFDXNetworkProtocolImpl extends EObjectImpl implements AFDXNetworkProtocol {
	/**
	 * The default value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFDXNetworkProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.AFDX_NETWORK_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolType() {
		// TODO: implement this method to return the 'Protocol Type' attribute
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
			case RtpProtocolsAndPoliciesPackage.AFDX_NETWORK_PROTOCOL__PROTOCOL_TYPE:
				return getProtocolType();
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
			case RtpProtocolsAndPoliciesPackage.AFDX_NETWORK_PROTOCOL__PROTOCOL_TYPE:
				return PROTOCOL_TYPE_EDEFAULT == null ? getProtocolType() != null : !PROTOCOL_TYPE_EDEFAULT.equals(getProtocolType());
		}
		return super.eIsSet(featureID);
	}

} //AFDXNetworkProtocolImpl
