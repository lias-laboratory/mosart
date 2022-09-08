/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpCooperativeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.SoftwarePlatform.SoftwareBehavior.SbStep;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Cooperative Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCooperativeTypeImpl#getNonPreemptibleSteps <em>Non Preemptible Steps</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpCooperativeTypeImpl#getNonPreemptibleIntervals <em>Non Preemptible Intervals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpCooperativeTypeImpl extends EObjectImpl implements RtpCooperativeType {
	/**
	 * The cached value of the '{@link #getNonPreemptibleSteps() <em>Non Preemptible Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPreemptibleSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SbStep> nonPreemptibleSteps;
	/**
	 * The cached value of the '{@link #getNonPreemptibleIntervals() <em>Non Preemptible Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPreemptibleIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<RtpExecutionTimeType> nonPreemptibleIntervals;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpCooperativeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_COOPERATIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SbStep> getNonPreemptibleSteps() {
		if (nonPreemptibleSteps == null) {
			nonPreemptibleSteps = new EObjectResolvingEList<SbStep>(SbStep.class, this, RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS);
		}
		return nonPreemptibleSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RtpExecutionTimeType> getNonPreemptibleIntervals() {
		if (nonPreemptibleIntervals == null) {
			nonPreemptibleIntervals = new EObjectContainmentEList<RtpExecutionTimeType>(RtpExecutionTimeType.class, this, RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS);
		}
		return nonPreemptibleIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS:
				return ((InternalEList<?>)getNonPreemptibleIntervals()).basicRemove(otherEnd, msgs);
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
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS:
				return getNonPreemptibleSteps();
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS:
				return getNonPreemptibleIntervals();
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
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS:
				getNonPreemptibleSteps().clear();
				getNonPreemptibleSteps().addAll((Collection<? extends SbStep>)newValue);
				return;
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS:
				getNonPreemptibleIntervals().clear();
				getNonPreemptibleIntervals().addAll((Collection<? extends RtpExecutionTimeType>)newValue);
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
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS:
				getNonPreemptibleSteps().clear();
				return;
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS:
				getNonPreemptibleIntervals().clear();
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
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_STEPS:
				return nonPreemptibleSteps != null && !nonPreemptibleSteps.isEmpty();
			case RtpTypesPackage.RTP_COOPERATIVE_TYPE__NON_PREEMPTIBLE_INTERVALS:
				return nonPreemptibleIntervals != null && !nonPreemptibleIntervals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RtpCooperativeTypeImpl
