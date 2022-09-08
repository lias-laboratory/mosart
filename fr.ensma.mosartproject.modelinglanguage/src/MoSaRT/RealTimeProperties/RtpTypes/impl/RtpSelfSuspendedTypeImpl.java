/**
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpTypes.RtpExecutionTimeType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpSelfSuspendedType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Self Suspended Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpSelfSuspendedTypeImpl#getSelfSuspensionTime <em>Self Suspension Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpSelfSuspendedTypeImpl extends EObjectImpl implements RtpSelfSuspendedType {
	/**
	 * The cached value of the '{@link #getSelfSuspensionTime() <em>Self Suspension Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfSuspensionTime()
	 * @generated
	 * @ordered
	 */
	protected RtpExecutionTimeType selfSuspensionTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpSelfSuspendedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_SELF_SUSPENDED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpExecutionTimeType getSelfSuspensionTime() {
		return selfSuspensionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfSuspensionTime(RtpExecutionTimeType newSelfSuspensionTime, NotificationChain msgs) {
		RtpExecutionTimeType oldSelfSuspensionTime = selfSuspensionTime;
		selfSuspensionTime = newSelfSuspensionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME, oldSelfSuspensionTime, newSelfSuspensionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfSuspensionTime(RtpExecutionTimeType newSelfSuspensionTime) {
		if (newSelfSuspensionTime != selfSuspensionTime) {
			NotificationChain msgs = null;
			if (selfSuspensionTime != null)
				msgs = ((InternalEObject)selfSuspensionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME, null, msgs);
			if (newSelfSuspensionTime != null)
				msgs = ((InternalEObject)newSelfSuspensionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME, null, msgs);
			msgs = basicSetSelfSuspensionTime(newSelfSuspensionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME, newSelfSuspensionTime, newSelfSuspensionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME:
				return basicSetSelfSuspensionTime(null, msgs);
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
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME:
				return getSelfSuspensionTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME:
				setSelfSuspensionTime((RtpExecutionTimeType)newValue);
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
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME:
				setSelfSuspensionTime((RtpExecutionTimeType)null);
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
			case RtpTypesPackage.RTP_SELF_SUSPENDED_TYPE__SELF_SUSPENSION_TIME:
				return selfSuspensionTime != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpSelfSuspendedTypeImpl
