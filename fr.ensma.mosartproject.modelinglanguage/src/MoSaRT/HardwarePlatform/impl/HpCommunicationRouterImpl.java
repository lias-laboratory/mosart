/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationRouter;
import MoSaRT.HardwarePlatform.HpNetworkPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hp Communication Router</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationRouterImpl#getNetworkPorts <em>Network Ports</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationRouterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpCommunicationRouterImpl extends EObjectImpl implements HpCommunicationRouter {
	/**
	 * The cached value of the '{@link #getNetworkPorts() <em>Network Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<HpNetworkPort> networkPorts;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpCommunicationRouterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_COMMUNICATION_ROUTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpNetworkPort> getNetworkPorts() {
		if (networkPorts == null) {
			networkPorts = new EObjectContainmentEList<HpNetworkPort>(HpNetworkPort.class, this, HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NETWORK_PORTS);
		}
		return networkPorts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NETWORK_PORTS:
				return ((InternalEList<?>)getNetworkPorts()).basicRemove(otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NETWORK_PORTS:
				return getNetworkPorts();
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NAME:
				return getName();
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
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NETWORK_PORTS:
				getNetworkPorts().clear();
				getNetworkPorts().addAll((Collection<? extends HpNetworkPort>)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NAME:
				setName((String)newValue);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NETWORK_PORTS:
				getNetworkPorts().clear();
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NAME:
				setName(NAME_EDEFAULT);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NETWORK_PORTS:
				return networkPorts != null && !networkPorts.isEmpty();
			case HardwarePlatformPackage.HP_COMMUNICATION_ROUTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //HpCommunicationRouterImpl
