/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;

import MoSaRT.RealTimeProperties.RtpProtocolsAndPolicies.RtpMultiprocessorCategoryType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hp Processor Interconnector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl#getCommChannel <em>Comm Channel</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpProcessorInterconnectorImpl#getRtpMultiprocessorCategory <em>Rtp Multiprocessor Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpProcessorInterconnectorImpl extends EObjectImpl implements HpProcessorInterconnector {
	/**
	 * The cached value of the '{@link #getProcessingUnits() <em>Processing Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessingUnit> processingUnits;

	/**
	 * The cached value of the '{@link #getCommChannel() <em>Comm Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommChannel()
	 * @generated
	 * @ordered
	 */
	protected HpCommunicationChannel commChannel;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRtpMultiprocessorCategory() <em>Rtp Multiprocessor Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtpMultiprocessorCategory()
	 * @generated
	 * @ordered
	 */
	protected RtpMultiprocessorCategoryType rtpMultiprocessorCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpProcessorInterconnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_PROCESSOR_INTERCONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessingUnit> getProcessingUnits() {
		if (processingUnits == null) {
			processingUnits = new EObjectWithInverseResolvingEList<HpProcessingUnit>(HpProcessingUnit.class, this, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS, HardwarePlatformPackage.HP_PROCESSING_UNIT__PROCESSOR_INTERCONNECTOR);
		}
		return processingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel getCommChannel() {
		if (commChannel != null && commChannel.eIsProxy()) {
			InternalEObject oldCommChannel = (InternalEObject)commChannel;
			commChannel = (HpCommunicationChannel)eResolveProxy(oldCommChannel);
			if (commChannel != oldCommChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL, oldCommChannel, commChannel));
			}
		}
		return commChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpCommunicationChannel basicGetCommChannel() {
		return commChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommChannel(HpCommunicationChannel newCommChannel, NotificationChain msgs) {
		HpCommunicationChannel oldCommChannel = commChannel;
		commChannel = newCommChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL, oldCommChannel, newCommChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommChannel(HpCommunicationChannel newCommChannel) {
		if (newCommChannel != commChannel) {
			NotificationChain msgs = null;
			if (commChannel != null)
				msgs = ((InternalEObject)commChannel).eInverseRemove(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET, HpCommunicationChannel.class, msgs);
			if (newCommChannel != null)
				msgs = ((InternalEObject)newCommChannel).eInverseAdd(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET, HpCommunicationChannel.class, msgs);
			msgs = basicSetCommChannel(newCommChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL, newCommChannel, newCommChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtpMultiprocessorCategoryType getRtpMultiprocessorCategory() {
		return rtpMultiprocessorCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtpMultiprocessorCategory(RtpMultiprocessorCategoryType newRtpMultiprocessorCategory, NotificationChain msgs) {
		RtpMultiprocessorCategoryType oldRtpMultiprocessorCategory = rtpMultiprocessorCategory;
		rtpMultiprocessorCategory = newRtpMultiprocessorCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY, oldRtpMultiprocessorCategory, newRtpMultiprocessorCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtpMultiprocessorCategory(RtpMultiprocessorCategoryType newRtpMultiprocessorCategory) {
		if (newRtpMultiprocessorCategory != rtpMultiprocessorCategory) {
			NotificationChain msgs = null;
			if (rtpMultiprocessorCategory != null)
				msgs = ((InternalEObject)rtpMultiprocessorCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY, null, msgs);
			if (newRtpMultiprocessorCategory != null)
				msgs = ((InternalEObject)newRtpMultiprocessorCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY, null, msgs);
			msgs = basicSetRtpMultiprocessorCategory(newRtpMultiprocessorCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY, newRtpMultiprocessorCategory, newRtpMultiprocessorCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessingUnits()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL:
				if (commChannel != null)
					msgs = ((InternalEObject)commChannel).eInverseRemove(this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET, HpCommunicationChannel.class, msgs);
				return basicSetCommChannel((HpCommunicationChannel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS:
				return ((InternalEList<?>)getProcessingUnits()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL:
				return basicSetCommChannel(null, msgs);
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY:
				return basicSetRtpMultiprocessorCategory(null, msgs);
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
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS:
				return getProcessingUnits();
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL:
				if (resolve) return getCommChannel();
				return basicGetCommChannel();
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__NAME:
				return getName();
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY:
				return getRtpMultiprocessorCategory();
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
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS:
				getProcessingUnits().clear();
				getProcessingUnits().addAll((Collection<? extends HpProcessingUnit>)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL:
				setCommChannel((HpCommunicationChannel)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__NAME:
				setName((String)newValue);
				return;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY:
				setRtpMultiprocessorCategory((RtpMultiprocessorCategoryType)newValue);
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
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS:
				getProcessingUnits().clear();
				return;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL:
				setCommChannel((HpCommunicationChannel)null);
				return;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY:
				setRtpMultiprocessorCategory((RtpMultiprocessorCategoryType)null);
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
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__PROCESSING_UNITS:
				return processingUnits != null && !processingUnits.isEmpty();
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL:
				return commChannel != null;
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__RTP_MULTIPROCESSOR_CATEGORY:
				return rtpMultiprocessorCategory != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HpProcessorInterconnectorImpl
