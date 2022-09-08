/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.HalfDuplexTransmissionMode;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Half Duplex Transmission Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.HalfDuplexTransmissionModeImpl#getModeType <em>Mode Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HalfDuplexTransmissionModeImpl extends EObjectImpl implements HalfDuplexTransmissionMode {
	/**
	 * The default value of the '{@link #getModeType() <em>Mode Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String MODE_TYPE_EDEFAULT = "Half Duplex Transmission";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HalfDuplexTransmissionModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.HALF_DUPLEX_TRANSMISSION_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getModeType() {
		// TODO: implement this method to return the 'Mode Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return MODE_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.HALF_DUPLEX_TRANSMISSION_MODE__MODE_TYPE:
				return getModeType();
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
			case RtpProtocolsAndPoliciesPackage.HALF_DUPLEX_TRANSMISSION_MODE__MODE_TYPE:
				return MODE_TYPE_EDEFAULT == null ? getModeType() != null : !MODE_TYPE_EDEFAULT.equals(getModeType());
		}
		return super.eIsSet(featureID);
	}

} //HalfDuplexTransmissionModeImpl
