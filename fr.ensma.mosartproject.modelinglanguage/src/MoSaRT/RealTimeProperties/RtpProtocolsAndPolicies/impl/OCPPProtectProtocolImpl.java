/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.OCPPProtectProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCPP Protect Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.OCPPProtectProtocolImpl#getProtocolType <em>Protocol Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OCPPProtectProtocolImpl extends EObjectImpl implements OCPPProtectProtocol {
	/**
	 * The default value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String PROTOCOL_TYPE_EDEFAULT = "Original Ceiling Priority Protocol";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCPPProtectProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.OCPP_PROTECT_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getProtocolType() {
		// TODO: implement this method to return the 'Protocol Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return PROTOCOL_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.OCPP_PROTECT_PROTOCOL__PROTOCOL_TYPE:
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
			case RtpProtocolsAndPoliciesPackage.OCPP_PROTECT_PROTOCOL__PROTOCOL_TYPE:
				return PROTOCOL_TYPE_EDEFAULT == null ? getProtocolType() != null : !PROTOCOL_TYPE_EDEFAULT.equals(getProtocolType());
		}
		return super.eIsSet(featureID);
	}

} //OCPPProtectProtocolImpl
