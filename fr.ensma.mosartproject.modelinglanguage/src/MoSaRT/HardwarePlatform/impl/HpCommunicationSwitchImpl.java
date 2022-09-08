/**
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunicationSwitch;
import MoSaRT.HardwarePlatform.HpFlowCarrier;

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
 * An implementation of the model object '<em><b>Hp Communication Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationSwitchImpl#getFlowCarrier <em>Flow Carrier</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunicationSwitchImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpCommunicationSwitchImpl extends EObjectImpl implements HpCommunicationSwitch {
	/**
	 * The cached value of the '{@link #getFlowCarrier() <em>Flow Carrier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowCarrier()
	 * @generated
	 * @ordered
	 */
	protected EList<HpFlowCarrier> flowCarrier;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HpCommunicationSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_COMMUNICATION_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpFlowCarrier> getFlowCarrier() {
		if (flowCarrier == null) {
			flowCarrier = new EObjectWithInverseResolvingEList.ManyInverse<HpFlowCarrier>(HpFlowCarrier.class, this, HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER, HardwarePlatformPackage.HP_FLOW_CARRIER__CONNECTION_NODES);
		}
		return flowCarrier;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__NAME, oldName, name));
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
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowCarrier()).basicAdd(otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER:
				return ((InternalEList<?>)getFlowCarrier()).basicRemove(otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER:
				return getFlowCarrier();
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__NAME:
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
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER:
				getFlowCarrier().clear();
				getFlowCarrier().addAll((Collection<? extends HpFlowCarrier>)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__NAME:
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
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER:
				getFlowCarrier().clear();
				return;
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__NAME:
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
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__FLOW_CARRIER:
				return flowCarrier != null && !flowCarrier.isEmpty();
			case HardwarePlatformPackage.HP_COMMUNICATION_SWITCH__NAME:
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

} //HpCommunicationSwitchImpl
