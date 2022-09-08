/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PIPProtectProtocol;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIP Protect Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PIPProtectProtocolImpl#getProtocolType <em>Protocol Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIPProtectProtocolImpl extends EObjectImpl implements PIPProtectProtocol {
	/**
	 * The default value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String PROTOCOL_TYPE_EDEFAULT = "Priority Inheritance Protocol";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIPProtectProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.PIP_PROTECT_PROTOCOL;
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
			case RtpProtocolsAndPoliciesPackage.PIP_PROTECT_PROTOCOL__PROTOCOL_TYPE:
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
			case RtpProtocolsAndPoliciesPackage.PIP_PROTECT_PROTOCOL__PROTOCOL_TYPE:
				return PROTOCOL_TYPE_EDEFAULT == null ? getProtocolType() != null : !PROTOCOL_TYPE_EDEFAULT.equals(getProtocolType());
		}
		return super.eIsSet(featureID);
	}

} //PIPProtectProtocolImpl
