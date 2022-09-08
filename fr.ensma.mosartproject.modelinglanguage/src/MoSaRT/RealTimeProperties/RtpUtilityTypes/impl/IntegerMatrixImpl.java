/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpUtilityTypes.impl;

import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerMatrix;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.IntegerVector;
import MoSaRT.RealTimeProperties.RtpUtilityTypes.RtpUtilityTypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpUtilityTypes.impl.IntegerMatrixImpl#getMatrixElements <em>Matrix Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerMatrixImpl extends EObjectImpl implements IntegerMatrix {
	/**
	 * The cached value of the '{@link #getMatrixElements() <em>Matrix Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerVector> matrixElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpUtilityTypesPackage.Literals.INTEGER_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerVector> getMatrixElements() {
		if (matrixElements == null) {
			matrixElements = new EObjectContainmentEList<IntegerVector>(IntegerVector.class, this, RtpUtilityTypesPackage.INTEGER_MATRIX__MATRIX_ELEMENTS);
		}
		return matrixElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_MATRIX__MATRIX_ELEMENTS:
				return ((InternalEList<?>)getMatrixElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_MATRIX__MATRIX_ELEMENTS:
				return getMatrixElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_MATRIX__MATRIX_ELEMENTS:
				getMatrixElements().clear();
				getMatrixElements().addAll((Collection<? extends IntegerVector>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_MATRIX__MATRIX_ELEMENTS:
				getMatrixElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RtpUtilityTypesPackage.INTEGER_MATRIX__MATRIX_ELEMENTS:
				return matrixElements != null && !matrixElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegerMatrixImpl
