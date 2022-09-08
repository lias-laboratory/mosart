/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RestrictedMigrationTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restricted Migration Task Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.RestrictedMigrationTaskAllocationImpl#getAllocationType <em>Allocation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictedMigrationTaskAllocationImpl extends EObjectImpl implements RestrictedMigrationTaskAllocation {
	/**
	 * The default value of the '{@link #getAllocationType() <em>Allocation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String ALLOCATION_TYPE_EDEFAULT = "Task Level Migration";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictedMigrationTaskAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.RESTRICTED_MIGRATION_TASK_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllocationType() {
		// TODO: implement this method to return the 'Allocation Type' attribute
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
			case RtpProtocolsAndPoliciesPackage.RESTRICTED_MIGRATION_TASK_ALLOCATION__ALLOCATION_TYPE:
				return getAllocationType();
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
			case RtpProtocolsAndPoliciesPackage.RESTRICTED_MIGRATION_TASK_ALLOCATION__ALLOCATION_TYPE:
				return ALLOCATION_TYPE_EDEFAULT == null ? getAllocationType() != null : !ALLOCATION_TYPE_EDEFAULT.equals(getAllocationType());
		}
		return super.eIsSet(featureID);
	}

} //RestrictedMigrationTaskAllocationImpl
