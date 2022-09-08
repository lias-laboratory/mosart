/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.RealTimeProperties.RtpTypes.impl;

import MoSaRT.RealTimeProperties.RtpHelperTypes.RtpDurationType;

import MoSaRT.RealTimeProperties.RtpTypes.RtpMutuExcluResourceUtilizationType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpPriorityType;
import MoSaRT.RealTimeProperties.RtpTypes.RtpTypesPackage;

import MoSaRT.SoftwarePlatform.SoftwareOperators.SoInteractionResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtp Mutu Exclu Resource Utilization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl#getTimeUtilization <em>Time Utilization</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl#getSpecialAccessPriority <em>Special Access Priority</em>}</li>
 *   <li>{@link MoSaRT.RealTimeProperties.RtpTypes.impl.RtpMutuExcluResourceUtilizationTypeImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RtpMutuExcluResourceUtilizationTypeImpl extends EObjectImpl implements RtpMutuExcluResourceUtilizationType {
	/**
	 * The cached value of the '{@link #getTimeUtilization() <em>Time Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUtilization()
	 * @generated
	 * @ordered
	 */
	protected RtpDurationType timeUtilization;

	/**
	 * The cached value of the '{@link #getSpecialAccessPriority() <em>Special Access Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialAccessPriority()
	 * @generated
	 * @ordered
	 */
	protected RtpPriorityType specialAccessPriority;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected SoInteractionResource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtpMutuExcluResourceUtilizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RtpTypesPackage.Literals.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpDurationType getTimeUtilization() {
		return timeUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeUtilization(RtpDurationType newTimeUtilization, NotificationChain msgs) {
		RtpDurationType oldTimeUtilization = timeUtilization;
		timeUtilization = newTimeUtilization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION, oldTimeUtilization, newTimeUtilization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUtilization(RtpDurationType newTimeUtilization) {
		if (newTimeUtilization != timeUtilization) {
			NotificationChain msgs = null;
			if (timeUtilization != null)
				msgs = ((InternalEObject)timeUtilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION, null, msgs);
			if (newTimeUtilization != null)
				msgs = ((InternalEObject)newTimeUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION, null, msgs);
			msgs = basicSetTimeUtilization(newTimeUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION, newTimeUtilization, newTimeUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpPriorityType getSpecialAccessPriority() {
		return specialAccessPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialAccessPriority(RtpPriorityType newSpecialAccessPriority, NotificationChain msgs) {
		RtpPriorityType oldSpecialAccessPriority = specialAccessPriority;
		specialAccessPriority = newSpecialAccessPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY, oldSpecialAccessPriority, newSpecialAccessPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialAccessPriority(RtpPriorityType newSpecialAccessPriority) {
		if (newSpecialAccessPriority != specialAccessPriority) {
			NotificationChain msgs = null;
			if (specialAccessPriority != null)
				msgs = ((InternalEObject)specialAccessPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY, null, msgs);
			if (newSpecialAccessPriority != null)
				msgs = ((InternalEObject)newSpecialAccessPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY, null, msgs);
			msgs = basicSetSpecialAccessPriority(newSpecialAccessPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY, newSpecialAccessPriority, newSpecialAccessPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoInteractionResource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (SoInteractionResource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoInteractionResource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(SoInteractionResource newResource) {
		SoInteractionResource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION:
				return basicSetTimeUtilization(null, msgs);
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY:
				return basicSetSpecialAccessPriority(null, msgs);
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
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION:
				return getTimeUtilization();
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY:
				return getSpecialAccessPriority();
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION:
				setTimeUtilization((RtpDurationType)newValue);
				return;
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY:
				setSpecialAccessPriority((RtpPriorityType)newValue);
				return;
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE:
				setResource((SoInteractionResource)newValue);
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
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION:
				setTimeUtilization((RtpDurationType)null);
				return;
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY:
				setSpecialAccessPriority((RtpPriorityType)null);
				return;
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE:
				setResource((SoInteractionResource)null);
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
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__TIME_UTILIZATION:
				return timeUtilization != null;
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__SPECIAL_ACCESS_PRIORITY:
				return specialAccessPriority != null;
			case RtpTypesPackage.RTP_MUTU_EXCLU_RESOURCE_UTILIZATION_TYPE__RESOURCE:
				return resource != null;
		}
		return super.eIsSet(featureID);
	}

} //RtpMutuExcluResourceUtilizationTypeImpl
