/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.FullMigrationTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Migration Task Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.FullMigrationTaskAllocationImpl#getAllocationType <em>Allocation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullMigrationTaskAllocationImpl extends EObjectImpl implements FullMigrationTaskAllocation {
	/**
	 * The default value of the '{@link #getAllocationType() <em>Allocation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String ALLOCATION_TYPE_EDEFAULT = "Job Level Migration";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullMigrationTaskAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.FULL_MIGRATION_TASK_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAllocationType() {
		// TODO: implement this method to return the 'Allocation Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return ALLOCATION_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.FULL_MIGRATION_TASK_ALLOCATION__ALLOCATION_TYPE:
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
			case RtpProtocolsAndPoliciesPackage.FULL_MIGRATION_TASK_ALLOCATION__ALLOCATION_TYPE:
				return ALLOCATION_TYPE_EDEFAULT == null ? getAllocationType() != null : !ALLOCATION_TYPE_EDEFAULT.equals(getAllocationType());
		}
		return super.eIsSet(featureID);
	}

} //FullMigrationTaskAllocationImpl
