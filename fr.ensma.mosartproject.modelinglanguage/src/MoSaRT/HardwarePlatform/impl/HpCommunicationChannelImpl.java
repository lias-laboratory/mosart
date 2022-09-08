/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationChannel;
import MoSaRT.HardwarePlatform.HpNetworkNode;
import MoSaRT.HardwarePlatform.HpNetworkPort;
import MoSaRT.HardwarePlatform.HpProcessingUnit;
import MoSaRT.HardwarePlatform.HpProcessorInterconnector;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hp Communication Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl#getProcessingUnits <em>Processing Units</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl#getNetworkPort <em>Network Port</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl#getProcessingUnitSet <em>Processing Unit Set</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationChannelImpl#getNetworkNodeSet <em>Network Node Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpCommunicationChannelImpl extends EObjectImpl implements HpCommunicationChannel {
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
	 * The cached value of the '{@link #getNetworkPort() <em>Network Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPort()
	 * @generated
	 * @ordered
	 */
	protected EList<HpNetworkPort> networkPort;

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
	 * The cached value of the '{@link #getProcessingUnitSet() <em>Processing Unit Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingUnitSet()
	 * @generated
	 * @ordered
	 */
	protected EList<HpProcessorInterconnector> processingUnitSet;

	/**
	 * The cached value of the '{@link #getNetworkNodeSet() <em>Network Node Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkNodeSet()
	 * @generated
	 * @ordered
	 */
	protected EList<HpNetworkNode> networkNodeSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpCommunicationChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_COMMUNICATION_CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessingUnit> getProcessingUnits() {
		if (processingUnits == null) {
			processingUnits = new EObjectWithInverseResolvingEList<HpProcessingUnit>(HpProcessingUnit.class, this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS, HardwarePlatformPackage.HP_PROCESSING_UNIT__COMM_CHANNEL);
		}
		return processingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpNetworkPort> getNetworkPort() {
		if (networkPort == null) {
			networkPort = new EObjectWithInverseResolvingEList<HpNetworkPort>(HpNetworkPort.class, this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT, HardwarePlatformPackage.HP_NETWORK_PORT__COMM_CHANNEL);
		}
		return networkPort;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpProcessorInterconnector> getProcessingUnitSet() {
		if (processingUnitSet == null) {
			processingUnitSet = new EObjectWithInverseResolvingEList<HpProcessorInterconnector>(HpProcessorInterconnector.class, this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET, HardwarePlatformPackage.HP_PROCESSOR_INTERCONNECTOR__COMM_CHANNEL);
		}
		return processingUnitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpNetworkNode> getNetworkNodeSet() {
		if (networkNodeSet == null) {
			networkNodeSet = new EObjectResolvingEList<HpNetworkNode>(HpNetworkNode.class, this, HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET);
		}
		return networkNodeSet;
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
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessingUnits()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNetworkPort()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessingUnitSet()).basicAdd(otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS:
				return ((InternalEList<?>)getProcessingUnits()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT:
				return ((InternalEList<?>)getNetworkPort()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET:
				return ((InternalEList<?>)getProcessingUnitSet()).basicRemove(otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS:
				return getProcessingUnits();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT:
				return getNetworkPort();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NAME:
				return getName();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET:
				return getProcessingUnitSet();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET:
				return getNetworkNodeSet();
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
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS:
				getProcessingUnits().clear();
				getProcessingUnits().addAll((Collection<? extends HpProcessingUnit>)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT:
				getNetworkPort().clear();
				getNetworkPort().addAll((Collection<? extends HpNetworkPort>)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NAME:
				setName((String)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET:
				getProcessingUnitSet().clear();
				getProcessingUnitSet().addAll((Collection<? extends HpProcessorInterconnector>)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET:
				getNetworkNodeSet().clear();
				getNetworkNodeSet().addAll((Collection<? extends HpNetworkNode>)newValue);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS:
				getProcessingUnits().clear();
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT:
				getNetworkPort().clear();
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET:
				getProcessingUnitSet().clear();
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET:
				getNetworkNodeSet().clear();
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
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNITS:
				return processingUnits != null && !processingUnits.isEmpty();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_PORT:
				return networkPort != null && !networkPort.isEmpty();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__PROCESSING_UNIT_SET:
				return processingUnitSet != null && !processingUnitSet.isEmpty();
			case HardwarePlatformPackage.HP_COMMUNICATION_CHANNEL__NETWORK_NODE_SET:
				return networkNodeSet != null && !networkNodeSet.isEmpty();
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

} //HpCommunicationChannelImpl
