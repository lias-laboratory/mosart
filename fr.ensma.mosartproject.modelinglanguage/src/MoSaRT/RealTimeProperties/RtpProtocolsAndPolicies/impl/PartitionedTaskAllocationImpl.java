/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.PartitionedTaskAllocation;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partitioned Task Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.PartitionedTaskAllocationImpl#getAllocationType <em>Allocation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionedTaskAllocationImpl extends EObjectImpl implements PartitionedTaskAllocation {
	/**
	 * The default value of the '{@link #getAllocationType() <em>Allocation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String ALLOCATION_TYPE_EDEFAULT = "No Migration";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionedTaskAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.PARTITIONED_TASK_ALLOCATION;
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
			case RtpProtocolsAndPoliciesPackage.PARTITIONED_TASK_ALLOCATION__ALLOCATION_TYPE:
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
			case RtpProtocolsAndPoliciesPackage.PARTITIONED_TASK_ALLOCATION__ALLOCATION_TYPE:
				return ALLOCATION_TYPE_EDEFAULT == null ? getAllocationType() != null : !ALLOCATION_TYPE_EDEFAULT.equals(getAllocationType());
		}
		return super.eIsSet(featureID);
	}

} //PartitionedTaskAllocationImpl
