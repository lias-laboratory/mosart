/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpProtocolsAndPoliciesPackage;
import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.UniformMultiprocessorCategory;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform Multiprocessor Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.impl.UniformMultiprocessorCategoryImpl#getCategoryType <em>Category Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformMultiprocessorCategoryImpl extends EObjectImpl implements UniformMultiprocessorCategory {
	/**
	 * The default value of the '{@link #getCategoryType() <em>Category Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryType()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String CATEGORY_TYPE_EDEFAULT = "Uniform";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformMultiprocessorCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpProtocolsAndPoliciesPackage.Literals.UNIFORM_MULTIPROCESSOR_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCategoryType() {
		// TODO: implement this method to return the 'Category Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		return CATEGORY_TYPE_EDEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpProtocolsAndPoliciesPackage.UNIFORM_MULTIPROCESSOR_CATEGORY__CATEGORY_TYPE:
				return getCategoryType();
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
			case RtpProtocolsAndPoliciesPackage.UNIFORM_MULTIPROCESSOR_CATEGORY__CATEGORY_TYPE:
				return CATEGORY_TYPE_EDEFAULT == null ? getCategoryType() != null : !CATEGORY_TYPE_EDEFAULT.equals(getCategoryType());
		}
		return super.eIsSet(featureID);
	}

} //UniformMultiprocessorCategoryImpl
