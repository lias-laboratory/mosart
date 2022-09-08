/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpHelperTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpHelperTypesPackage;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeLinkType;
import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpTimeReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Time Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpHelperTypes.impl.RtpTimeReferenceTypeImpl#getTimeLink <em>Time Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpTimeReferenceTypeImpl extends EObjectImpl implements RtpTimeReferenceType {
	/**
	 * The cached value of the '{@link #getTimeLink() <em>Time Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLink()
	 * @generated
	 * @ordered
	 */
	protected RtpTimeLinkType timeLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpTimeReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpHelperTypesPackage.Literals.RTP_TIME_REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpTimeLinkType getTimeLink() {
		return timeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeLink(RtpTimeLinkType newTimeLink, NotificationChain msgs) {
		RtpTimeLinkType oldTimeLink = timeLink;
		timeLink = newTimeLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK, oldTimeLink, newTimeLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLink(RtpTimeLinkType newTimeLink) {
		if (newTimeLink != timeLink) {
			NotificationChain msgs = null;
			if (timeLink != null)
				msgs = ((InternalEObject)timeLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK, null, msgs);
			if (newTimeLink != null)
				msgs = ((InternalEObject)newTimeLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK, null, msgs);
			msgs = basicSetTimeLink(newTimeLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK, newTimeLink, newTimeLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK:
				return basicSetTimeLink(null, msgs);
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
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK:
				return getTimeLink();
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
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK:
				setTimeLink((RtpTimeLinkType)newValue);
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
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK:
				setTimeLink((RtpTimeLinkType)null);
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
			case RtpHelperTypesPackage.RTP_TIME_REFERENCE_TYPE__TIME_LINK:
				return timeLink != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpTimeReferenceTypeImpl
