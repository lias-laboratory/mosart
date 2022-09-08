/**
 */
package MoSaRT.HardwarePlatform.impl;

import MoSaRT.HardwarePlatform.HardwarePlatformPackage;
import MoSaRT.HardwarePlatform.HpCommunnicationPort;
import MoSaRT.HardwarePlatform.HpFlowCarrier;
import MoSaRT.HardwarePlatform.HpTerminalNode;

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
 * An implementation of the model object '<em><b>Hp Communnication Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunnicationPortImpl#getFlowCarrier <em>Flow Carrier</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunnicationPortImpl#getTerminalNode <em>Terminal Node</em>}</li>
 *   <li>{@link MoSaRT.HardwarePlatform.impl.HpCommunnicationPortImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HpCommunnicationPortImpl extends EObjectImpl implements HpCommunnicationPort {
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
	 * The cached value of the '{@link #getTerminalNode() <em>Terminal Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminalNode()
	 * @generated
	 * @ordered
	 */
	protected HpTerminalNode terminalNode;

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
	protected HpCommunnicationPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePlatformPackage.Literals.HP_COMMUNNICATION_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HpFlowCarrier> getFlowCarrier() {
		if (flowCarrier == null) {
			flowCarrier = new EObjectWithInverseResolvingEList.ManyInverse<HpFlowCarrier>(HpFlowCarrier.class, this, HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER, HardwarePlatformPackage.HP_FLOW_CARRIER__CONNECTION_NODES);
		}
		return flowCarrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpTerminalNode getTerminalNode() {
		if (terminalNode != null && terminalNode.eIsProxy()) {
			InternalEObject oldTerminalNode = (InternalEObject)terminalNode;
			terminalNode = (HpTerminalNode)eResolveProxy(oldTerminalNode);
			if (terminalNode != oldTerminalNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE, oldTerminalNode, terminalNode));
			}
		}
		return terminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HpTerminalNode basicGetTerminalNode() {
		return terminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminalNode(HpTerminalNode newTerminalNode, NotificationChain msgs) {
		HpTerminalNode oldTerminalNode = terminalNode;
		terminalNode = newTerminalNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE, oldTerminalNode, newTerminalNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminalNode(HpTerminalNode newTerminalNode) {
		if (newTerminalNode != terminalNode) {
			NotificationChain msgs = null;
			if (terminalNode != null)
				msgs = ((InternalEObject)terminalNode).eInverseRemove(this, HardwarePlatformPackage.HP_TERMINAL_NODE__COMM_PORT, HpTerminalNode.class, msgs);
			if (newTerminalNode != null)
				msgs = ((InternalEObject)newTerminalNode).eInverseAdd(this, HardwarePlatformPackage.HP_TERMINAL_NODE__COMM_PORT, HpTerminalNode.class, msgs);
			msgs = basicSetTerminalNode(newTerminalNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE, newTerminalNode, newTerminalNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePlatformPackage.HP_COMMUNNICATION_PORT__NAME, oldName, name));
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
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFlowCarrier()).basicAdd(otherEnd, msgs);
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE:
				if (terminalNode != null)
					msgs = ((InternalEObject)terminalNode).eInverseRemove(this, HardwarePlatformPackage.HP_TERMINAL_NODE__COMM_PORT, HpTerminalNode.class, msgs);
				return basicSetTerminalNode((HpTerminalNode)otherEnd, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER:
				return ((InternalEList<?>)getFlowCarrier()).basicRemove(otherEnd, msgs);
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE:
				return basicSetTerminalNode(null, msgs);
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
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER:
				return getFlowCarrier();
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE:
				if (resolve) return getTerminalNode();
				return basicGetTerminalNode();
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__NAME:
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
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER:
				getFlowCarrier().clear();
				getFlowCarrier().addAll((Collection<? extends HpFlowCarrier>)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE:
				setTerminalNode((HpTerminalNode)newValue);
				return;
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__NAME:
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
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER:
				getFlowCarrier().clear();
				return;
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE:
				setTerminalNode((HpTerminalNode)null);
				return;
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__NAME:
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
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__FLOW_CARRIER:
				return flowCarrier != null && !flowCarrier.isEmpty();
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__TERMINAL_NODE:
				return terminalNode != null;
			case HardwarePlatformPackage.HP_COMMUNNICATION_PORT__NAME:
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

} //HpCommunnicationPortImpl
